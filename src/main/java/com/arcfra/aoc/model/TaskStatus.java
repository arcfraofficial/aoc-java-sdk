package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets TaskStatus */
@JsonAdapter(TaskStatus.Adapter.class)
public enum TaskStatus {
    EXECUTING("EXECUTING"),

    FAILED("FAILED"),

    PAUSED("PAUSED"),

    PENDING("PENDING"),

    SUCCESSED("SUCCESSED"),

    TASKSTATUS_UNSUPPORTED_ENUM("TASKSTATUS_UNSUPPORTED_ENUM");
    private String value;

    TaskStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaskStatus fromValue(String value) {
        for (TaskStatus b : TaskStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return TaskStatus.TASKSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<TaskStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final TaskStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TaskStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TaskStatus.fromValue(value);
        }
    }
}
