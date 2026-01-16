package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UserRole */
@JsonAdapter(UserRole.Adapter.class)
public enum UserRole {
    ADMIN("ADMIN"),

    READ_ONLY("READ_ONLY"),

    ROOT("ROOT"),

    USERROLE_UNSUPPORTED_ENUM("USERROLE_UNSUPPORTED_ENUM");
    private String value;

    UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserRole fromValue(String value) {
        for (UserRole b : UserRole.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UserRole.USERROLE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UserRole> {
        @Override
        public void write(final JsonWriter jsonWriter, final UserRole enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UserRole read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UserRole.fromValue(value);
        }
    }
}
