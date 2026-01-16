package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UserRoleNextOrderByInput */
@JsonAdapter(UserRoleNextOrderByInput.Adapter.class)
public enum UserRoleNextOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PLATFORM_ASC("platform_ASC"),

    PLATFORM_DESC("platform_DESC"),

    PRESET_ASC("preset_ASC"),

    PRESET_DESC("preset_DESC"),

    USERROLENEXTORDERBYINPUT_UNSUPPORTED_ENUM("USERROLENEXTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    UserRoleNextOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserRoleNextOrderByInput fromValue(String value) {
        for (UserRoleNextOrderByInput b : UserRoleNextOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UserRoleNextOrderByInput.USERROLENEXTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UserRoleNextOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final UserRoleNextOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UserRoleNextOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UserRoleNextOrderByInput.fromValue(value);
        }
    }
}
