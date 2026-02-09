package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GlobalSettingsOrderByInput */
@JsonAdapter(GlobalSettingsOrderByInput.Adapter.class)
public enum GlobalSettingsOrderByInput {
    AUTH_ASC("auth_ASC"),

    AUTH_DESC("auth_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    VM_RECYCLE_BIN_ASC("vm_recycle_bin_ASC"),

    VM_RECYCLE_BIN_DESC("vm_recycle_bin_DESC"),

    GLOBALSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM("GLOBALSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    GlobalSettingsOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GlobalSettingsOrderByInput fromValue(String value) {
        for (GlobalSettingsOrderByInput b : GlobalSettingsOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GlobalSettingsOrderByInput.GLOBALSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GlobalSettingsOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final GlobalSettingsOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GlobalSettingsOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GlobalSettingsOrderByInput.fromValue(value);
        }
    }
}
