package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupRestoreExecutionOrderByInput */
@JsonAdapter(BackupRestoreExecutionOrderByInput.Adapter.class)
public enum BackupRestoreExecutionOrderByInput {
    DURATION_ASC("duration_ASC"),

    DURATION_DESC("duration_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXECUTED_AT_ASC("executed_at_ASC"),

    EXECUTED_AT_DESC("executed_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    MODE_ASC("mode_ASC"),

    MODE_DESC("mode_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    READ_BYTES_ASC("read_bytes_ASC"),

    READ_BYTES_DESC("read_bytes_DESC"),

    REBUILD_NAME_ASC("rebuild_name_ASC"),

    REBUILD_NAME_DESC("rebuild_name_DESC"),

    REBUILD_NETWORK_MAPPING_ASC("rebuild_network_mapping_ASC"),

    REBUILD_NETWORK_MAPPING_DESC("rebuild_network_mapping_DESC"),

    REBUILD_TARGET_CLUSTER_ASC("rebuild_target_cluster_ASC"),

    REBUILD_TARGET_CLUSTER_DESC("rebuild_target_cluster_DESC"),

    RETRY_TIMES_ASC("retry_times_ASC"),

    RETRY_TIMES_DESC("retry_times_DESC"),

    STARTUP_AFTER_RESTORE_ASC("startup_after_restore_ASC"),

    STARTUP_AFTER_RESTORE_DESC("startup_after_restore_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    TOTAL_BYTES_ASC("total_bytes_ASC"),

    TOTAL_BYTES_DESC("total_bytes_DESC"),

    BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM(
            "BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupRestoreExecutionOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupRestoreExecutionOrderByInput fromValue(String value) {
        for (BackupRestoreExecutionOrderByInput b : BackupRestoreExecutionOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupRestoreExecutionOrderByInput
                .BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupRestoreExecutionOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupRestoreExecutionOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupRestoreExecutionOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return BackupRestoreExecutionOrderByInput.fromValue(value);
        }
    }
}
