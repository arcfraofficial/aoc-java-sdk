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
client.setBasePath("http://192.168.96.133/v2/api");
```

> If using self-signed certificate, use `setVerifyingSsl` to ignore ssl verification

```java
ApiClient client = new ApiClient();
client.setBasePath("https://192.168.96.133/v2/api");
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
