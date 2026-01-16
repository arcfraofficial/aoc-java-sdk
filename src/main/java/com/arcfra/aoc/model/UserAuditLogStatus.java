package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UserAuditLogStatus */
@JsonAdapter(UserAuditLogStatus.Adapter.class)
public enum UserAuditLogStatus {
    FAILED("FAILED"),

    SUCCESSED("SUCCESSED"),

    USERAUDITLOGSTATUS_UNSUPPORTED_ENUM("USERAUDITLOGSTATUS_UNSUPPORTED_ENUM");
    private String value;

    UserAuditLogStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserAuditLogStatus fromValue(String value) {
        for (UserAuditLogStatus b : UserAuditLogStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UserAuditLogStatus.USERAUDITLOGSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UserAuditLogStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final UserAuditLogStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UserAuditLogStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UserAuditLogStatus.fromValue(value);
        }
    }
}
