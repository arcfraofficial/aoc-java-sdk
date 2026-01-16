package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SystemAuditLogOrderByInput */
@JsonAdapter(SystemAuditLogOrderByInput.Adapter.class)
public enum SystemAuditLogOrderByInput {
    ACTION_ASC("action_ASC"),

    ACTION_DESC("action_DESC"),

    FINISHED_AT_ASC("finished_at_ASC"),

    FINISHED_AT_DESC("finished_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MESSAGE_ASC("message_ASC"),

    MESSAGE_DESC("message_DESC"),

    RESOURCE_ID_ASC("resource_id_ASC"),

    RESOURCE_ID_DESC("resource_id_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    SYSTEMAUDITLOGORDERBYINPUT_UNSUPPORTED_ENUM("SYSTEMAUDITLOGORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SystemAuditLogOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SystemAuditLogOrderByInput fromValue(String value) {
        for (SystemAuditLogOrderByInput b : SystemAuditLogOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SystemAuditLogOrderByInput.SYSTEMAUDITLOGORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SystemAuditLogOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SystemAuditLogOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SystemAuditLogOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SystemAuditLogOrderByInput.fromValue(value);
        }
    }
}
