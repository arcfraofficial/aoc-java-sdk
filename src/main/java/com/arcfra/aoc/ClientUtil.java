package com.arcfra.aoc;


import com.arcfra.aoc.api.UserApi;
import com.arcfra.aoc.auth.ApiKeyAuth;
import com.arcfra.aoc.model.LoginInput;
import com.arcfra.aoc.model.UserSource;
import com.arcfra.aoc.model.WithTaskLoginResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.gsonfire.builders.JsonObjectBuilder;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ClientUtil {

    public static void login(String username, String password, ApiClient client)
            throws ApiException, IOException {
        login(username, password, false, client);
    }

    public static void login(String username, String password, String auth_id, ApiClient client)
            throws ApiException {
        UserApi userAPi = new UserApi(client);
        WithTaskLoginResponse response =
                userAPi.login(
                        new LoginInput()
                                .username(username)
                                .password(password)
                                .authConfigId(auth_id)
                                .source(UserSource.AUTHN));
        String token = response.getData().getToken();
        login(token, client);
    }

    /**
     * @param username
     * @param password
     * @param useLDAP
     * @param client
     * @throws ApiException
     */
    public static void login(String username, String password, boolean useLDAP, ApiClient client)
            throws ApiException {
        UserApi userApi = new UserApi(client);
        if (useLDAP) {
            HashMap<String, String> authMap = new HashMap<>();
            String host = client.getBasePath();
            if (host.endsWith("/")) {
                host = host.substring(0, host.length() - 1);
            }
            if (host.endsWith("/v2/api")) {
                host = host.substring(0, host.length() - 7);
            }
            host = host + "/api";
            JsonObjectBuilder jBody =
                    new JsonObjectBuilder()
                            .set("query", "{authnStrategies{id type}}")
                            .set("variables", new JsonObject());
            RequestBody body =
                    RequestBody.create(
                            jBody.build().toString(), MediaType.parse("application/json"));
            HashMap<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "application/json");
            try {
                String jsonStr =
                        client.getHttpClient()
                                .newCall(new Request.Builder().url(host).post(body).build())
                                .execute()
                                .body()
                                .string();
                JsonParser.parseString(jsonStr)
                        .getAsJsonObject()
                        .get("data")
                        .getAsJsonObject()
                        .get("authnStrategies")
                        .getAsJsonArray()
                        .forEach(
                                item -> {
                                    String type = item.getAsJsonObject().get("type").getAsString();
                                    String id = item.getAsJsonObject().get("id").getAsString();
                                    authMap.put(type, id);
                                });
            } catch (Exception e) {
                // for backward compatibility, ignore error
                System.out.println(e.getMessage());
            }
            if (authMap.containsKey("LDAP")) {
                login(username, password, authMap.get("LDAP"), client);
                return;
            }
        }

        WithTaskLoginResponse response =
                userApi.login(
                        new LoginInput()
                                .username(username)
                                .password(password)
                                .source(useLDAP ? UserSource.LDAP : UserSource.LOCAL));
        String token = response.getData().getToken();
        login(token, client);
    }

    public static void login(String token, ApiClient client) {
        ((ApiKeyAuth) client.getAuthentication("Authorization")).setApiKey(token);
    }
}
