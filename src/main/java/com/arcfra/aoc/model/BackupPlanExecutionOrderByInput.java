package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanExecutionOrderByInput */
@JsonAdapter(BackupPlanExecutionOrderByInput.Adapter.class)
public enum BackupPlanExecutionOrderByInput {
    DELETABLE_FLAG_MARKED_ASC("deletable_flag_marked_ASC"),

    DELETABLE_FLAG_MARKED_DESC("deletable_flag_marked_DESC"),

    DURATION_ASC("duration_ASC"),

    DURATION_DESC("duration_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXECUTED_AT_ASC("executed_at_ASC"),

    EXECUTED_AT_DESC("executed_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    METHOD_ASC("method_ASC"),

    METHOD_DESC("method_DESC"),

    STATE_ASC("state_ASC"),

    STATE_DESC("state_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    SUCCESS_JOB_COUNT_ASC("success_job_count_ASC"),

    SUCCESS_JOB_COUNT_DESC("success_job_count_DESC"),

    TOTAL_JOB_COUNT_ASC("total_job_count_ASC"),

    TOTAL_JOB_COUNT_DESC("total_job_count_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    BACKUPPLANEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM(
            "BACKUPPLANEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanExecutionOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanExecutionOrderByInput fromValue(String value) {
        for (BackupPlanExecutionOrderByInput b : BackupPlanExecutionOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanExecutionOrderByInput.BACKUPPLANEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanExecutionOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupPlanExecutionOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanExecutionOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanExecutionOrderByInput.fromValue(value);
        }
    }
}
