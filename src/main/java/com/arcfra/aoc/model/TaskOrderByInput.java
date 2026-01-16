package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets TaskOrderByInput */
@JsonAdapter(TaskOrderByInput.Adapter.class)
public enum TaskOrderByInput {
    ARGS_ASC("args_ASC"),

    ARGS_DESC("args_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ERROR_CODE_ASC("error_code_ASC"),

    ERROR_CODE_DESC("error_code_DESC"),

    ERROR_MESSAGE_ASC("error_message_ASC"),

    ERROR_MESSAGE_DESC("error_message_DESC"),

    FINISHED_AT_ASC("finished_at_ASC"),

    FINISHED_AT_DESC("finished_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    KEY_ASC("key_ASC"),

    KEY_DESC("key_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    PROGRESS_ASC("progress_ASC"),

    PROGRESS_DESC("progress_DESC"),

    RESOURCE_ID_ASC("resource_id_ASC"),

    RESOURCE_ID_DESC("resource_id_DESC"),

    RESOURCE_MUTATION_ASC("resource_mutation_ASC"),

    RESOURCE_MUTATION_DESC("resource_mutation_DESC"),

    RESOURCE_ROLLBACK_ERROR_ASC("resource_rollback_error_ASC"),

    RESOURCE_ROLLBACK_ERROR_DESC("resource_rollback_error_DESC"),

    RESOURCE_ROLLBACK_RETRY_COUNT_ASC("resource_rollback_retry_count_ASC"),

    RESOURCE_ROLLBACK_RETRY_COUNT_DESC("resource_rollback_retry_count_DESC"),

    RESOURCE_ROLLBACKED_ASC("resource_rollbacked_ASC"),

    RESOURCE_ROLLBACKED_DESC("resource_rollbacked_DESC"),

    RESOURCE_TYPE_ASC("resource_type_ASC"),

    RESOURCE_TYPE_DESC("resource_type_DESC"),

    SNAPSHOT_ASC("snapshot_ASC"),

    SNAPSHOT_DESC("snapshot_DESC"),

    STARTED_AT_ASC("started_at_ASC"),

    STARTED_AT_DESC("started_at_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    STEPS_ASC("steps_ASC"),

    STEPS_DESC("steps_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    TASKORDERBYINPUT_UNSUPPORTED_ENUM("TASKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    TaskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaskOrderByInput fromValue(String value) {
        for (TaskOrderByInput b : TaskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return TaskOrderByInput.TASKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<TaskOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final TaskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TaskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TaskOrderByInput.fromValue(value);
        }
    }
}
