package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets LogCollectionStatus */
@JsonAdapter(LogCollectionStatus.Adapter.class)
public enum LogCollectionStatus {
    EXECUTING("EXECUTING"),

    FAILED("FAILED"),

    STOPPING("STOPPING"),

    SUCCESSED("SUCCESSED"),

    LOGCOLLECTIONSTATUS_UNSUPPORTED_ENUM("LOGCOLLECTIONSTATUS_UNSUPPORTED_ENUM");
    private String value;

    LogCollectionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LogCollectionStatus fromValue(String value) {
        for (LogCollectionStatus b : LogCollectionStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return LogCollectionStatus.LOGCOLLECTIONSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<LogCollectionStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final LogCollectionStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LogCollectionStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LogCollectionStatus.fromValue(value);
        }
    }
}
