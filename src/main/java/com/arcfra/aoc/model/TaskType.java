package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets TaskType */
@JsonAdapter(TaskType.Adapter.class)
public enum TaskType {
    APPLICATION("APPLICATION"),

    BACKUP("BACKUP"),

    HOST_PLUGIN("HOST_PLUGIN"),

    REPLICATION("REPLICATION"),

    RESOLVER("RESOLVER"),

    SFS("SFS"),

    TASKTYPE_UNSUPPORTED_ENUM("TASKTYPE_UNSUPPORTED_ENUM");
    private String value;

    TaskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaskType fromValue(String value) {
        for (TaskType b : TaskType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return TaskType.TASKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<TaskType> {
        @Override
        public void write(final JsonWriter jsonWriter, final TaskType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TaskType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TaskType.fromValue(value);
        }
    }
}
