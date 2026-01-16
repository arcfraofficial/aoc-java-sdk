package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UserSource */
@JsonAdapter(UserSource.Adapter.class)
public enum UserSource {
    AUTHN("AUTHN"),

    LDAP("LDAP"),

    LOCAL("LOCAL"),

    SSO("SSO"),

    USERSOURCE_UNSUPPORTED_ENUM("USERSOURCE_UNSUPPORTED_ENUM");
    private String value;

    UserSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserSource fromValue(String value) {
        for (UserSource b : UserSource.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UserSource.USERSOURCE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UserSource> {
        @Override
        public void write(final JsonWriter jsonWriter, final UserSource enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UserSource read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UserSource.fromValue(value);
        }
    }
}
