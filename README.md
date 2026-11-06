# Aoc Java SDK

Aoc Java SDK, required Java1.8+

- [source code](https://github.com/arcfraofficial/aoc-java-sdk)
- [releases](https://github.com/arcfraofficial/aoc-java-sdk/releases)
- [documentation](https://code.arcfra.com)

## Installation

We haven't published sdk to maven central repository yet, to use Aoc Java SDK, you may install from source or download from release assets.

- ### Install from source

  ```shell
  git clone https://github.com/arcfraofficial/aoc-java-sdk.git
  mvn clean install
  ```

- ### Install from jar

  ```shell
  # download jar and pom from release page
  mvn install:install-file -D"file=<path/to/jar>" -D"pomFile=<path/to/pom>"
  ```

## Usage

### Create instance

#### Create `ApiClient` instance

```java
ApiClient client = new ApiClient();
client.setBasePath("http://aoc.example.com/v2/api");
```

> If using self-signed certificate, use `setVerifyingSsl` to ignore ssl verification

```java
ApiClient client = new ApiClient();
client.setBasePath("https://aoc.example.com/v2/api");
client.setVerifyingSsl(false);
```

#### Create relatd Api instance

> Create related Api instance depends on usage, for example, to use vm related operation, create a `VmApi`。

```java
VmApi vmApi = new VmApi(client);
```

### Authentication

> Use login method from ClientUtil package to authenticate client

```java
ClientUtil.login("<username>", "<password>", client);
```

> Or directly get token by call login from UserApi

```java
UserApi userApi = new UserApi(client);
LoginInput loginInput = new LoginInput()
    .username("<username>")
    .password("<password>").source(UserSource.LOCAL);
WithTaskLoginResponse token = userApi.login(loginInput);
((ApiKeyAuth) client.getAuthentication("Authorization")).setApiKey(token.getData().getToken());
```

### Sending request

#### Build request body

```java
List<Vm> vms = vmApi.getVms(new GetVmsRequestBody().first(1));
```

#### Async task

> Mostly mutation will response as async task earlier to avoid request hanging when executing long-running operation.

```java
WithTaskVm withTaskVm = vmApi.startVm(
    new VmStartParams()
        .where(new VmWhereInput()
            .id(vm.getId()))).get(0);
```

> A utils function named `WaitTask` is export from TaskUtil package

```java
WithTaskVm withTaskVm = vmApi.startVm(
    new VmStartParams()
        .where(new VmWhereInput()
            .id(vm.getId()))).get(0);
TaskUtil.WaitTask(withTaskVm.getTaskId(), client);
```

> Here is also `WaitTasks` function for waiting multiple task

```java
VmStartParams startParams = new VmStartParams()
    .where(new VmWhereInput()
        .addIdInItem("vm_id_1")
        .addIdInItem("vm_id_2"));
List<WithTaskVm> startedVms = vmApi.startVm(startParams);
List<String> tasks = startedVms.stream().map(startedVm -> startedVm.getTaskId()).collect(Collectors.toList());
TaskUtil.WaitTasks(tasks, client);
```

#### Create `ActivePassiveApiClient` instance

AOC introduced multi-management-IP active-passive deployment in version 4.9.0. To access such AOC deployments, you can use `ActivePassiveApiClient` to configure multiple endpoints for the same active-passive cluster. At any given time, it is expected that at most one active endpoint exists. The order of endpoints passed in does not represent the active-passive relationship; the client will select the current active endpoint based on probing results.

```java
ActivePassiveApiClient client = new ActivePassiveApiClient(
    "https://aoc-a.example.com",
    "https://aoc-b.example.com");

LoginInput loginInput = new LoginInput()
    .username("<username>")
    .password("<password>")
    .source(UserSource.LOCAL);
WithTaskLoginResponse token = new UserApi(client).login(loginInput);
ClientUtil.login(token.getData().getToken(), client);

VmApi vmApi = new VmApi(client);
```

#### Failover strategies

`ActivePassiveApiClient` supports the following failover strategies:

- `AUTO_FAILOVER`: The default strategy. When there is no cached active endpoint, it attempts to probe and cache the current active endpoint; after a request returns 307, it automatically re-probes and retries once; after a network I/O exception occurs, it clears the cache but does not automatically retry.
- `MANUAL_FAILOVER`: After a request returns 307, it does not automatically re-probe or retry. Clearing the cache is handled by the caller for failover. The rest of the business logic is consistent with `AUTO_FAILOVER`.
- `ALWAYS_PROBE`: Does not cache the active endpoint. Re-probes the active endpoint before each request; after a request returns 307, it does not automatically retry.

If you need to specify a failover strategy, you can pass it in when creating the instance:

```java
ActivePassiveApiClient client = new ActivePassiveApiClient(
    ActivePassiveFailoverStrategy.MANUAL_FAILOVER,
    "https://aoc-a.example.com",
    "https://aoc-b.example.com");
```

#### Async

> Directly call api funtion will block process until response, to make request async, call `${Api}Async` and specify `ApiCallback`.

```java
vmApi.getVmsAsync(
    new GetVmsRequestBody().first(1),
    new ApiCallback<List<Alert>>() {
      @Override
      public void onFailure(ApiException e, int statusCode, Map responseHeaders) {
        // error callback
      }
      @Override
      public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
        // upload progress callback
      }
      @Override
      public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
        // download progress callback
      }
      @Override
      public void onSuccess(List<Alert> vms, int statusCode, Map<String, List<String>> responseHeaders) {
        // success callback
      }
    });
```
