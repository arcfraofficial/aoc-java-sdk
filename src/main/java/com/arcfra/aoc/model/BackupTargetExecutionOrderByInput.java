package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupTargetExecutionOrderByInput */
@JsonAdapter(BackupTargetExecutionOrderByInput.Adapter.class)
public enum BackupTargetExecutionOrderByInput {
    BACKUP_GROUP_ASC("backup_group_ASC"),

    BACKUP_GROUP_DESC("backup_group_DESC"),

    CLUSTER_LOCAL_ID_ASC("cluster_local_id_ASC"),

    CLUSTER_LOCAL_ID_DESC("cluster_local_id_DESC"),

    DURATION_ASC("duration_ASC"),

    DURATION_DESC("duration_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXECUTED_AT_ASC("executed_at_ASC"),

    EXECUTED_AT_DESC("executed_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    PARENT_BACKUP_ASC("parent_backup_ASC"),

    PARENT_BACKUP_DESC("parent_backup_DESC"),

    READ_BYTES_ASC("read_bytes_ASC"),

    READ_BYTES_DESC("read_bytes_DESC"),

    RETRY_TIMES_ASC("retry_times_ASC"),

    RETRY_TIMES_DESC("retry_times_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    TOTAL_BYTES_ASC("total_bytes_ASC"),

    TOTAL_BYTES_DESC("total_bytes_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VM_LOCAL_ID_ASC("vm_local_id_ASC"),

    VM_LOCAL_ID_DESC("vm_local_id_DESC"),

    VM_NAME_ASC("vm_name_ASC"),

    VM_NAME_DESC("vm_name_DESC"),

    BACKUPTARGETEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM(
            "BACKUPTARGETEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupTargetExecutionOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupTargetExecutionOrderByInput fromValue(String value) {
        for (BackupTargetExecutionOrderByInput b : BackupTargetExecutionOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupTargetExecutionOrderByInput.BACKUPTARGETEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupTargetExecutionOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupTargetExecutionOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupTargetExecutionOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return BackupTargetExecutionOrderByInput.fromValue(value);
        }
    }
}
