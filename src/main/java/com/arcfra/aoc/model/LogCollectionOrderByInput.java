package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets LogCollectionOrderByInput */
@JsonAdapter(LogCollectionOrderByInput.Adapter.class)
public enum LogCollectionOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOG_ENDED_AT_ASC("log_ended_at_ASC"),

    LOG_ENDED_AT_DESC("log_ended_at_DESC"),

    LOG_STARTED_AT_ASC("log_started_at_ASC"),

    LOG_STARTED_AT_DESC("log_started_at_DESC"),

    OWNER_ASC("owner_ASC"),

    OWNER_DESC("owner_DESC"),

    PATH_ASC("path_ASC"),

    PATH_DESC("path_DESC"),

    PROGRESS_ASC("progress_ASC"),

    PROGRESS_DESC("progress_DESC"),

    SERVICE_GROUPS_ASC("service_groups_ASC"),

    SERVICE_GROUPS_DESC("service_groups_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    STARTED_AT_ASC("started_at_ASC"),

    STARTED_AT_DESC("started_at_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    LOGCOLLECTIONORDERBYINPUT_UNSUPPORTED_ENUM("LOGCOLLECTIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    LogCollectionOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LogCollectionOrderByInput fromValue(String value) {
        for (LogCollectionOrderByInput b : LogCollectionOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return LogCollectionOrderByInput.LOGCOLLECTIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<LogCollectionOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final LogCollectionOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LogCollectionOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LogCollectionOrderByInput.fromValue(value);
        }
    }
}
