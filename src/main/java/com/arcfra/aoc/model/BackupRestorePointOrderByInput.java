package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupRestorePointOrderByInput */
@JsonAdapter(BackupRestorePointOrderByInput.Adapter.class)
public enum BackupRestorePointOrderByInput {
    CLUSTER_LOCAL_ID_ASC("cluster_local_id_ASC"),

    CLUSTER_LOCAL_ID_DESC("cluster_local_id_DESC"),

    COMPRESSED_ASC("compressed_ASC"),

    COMPRESSED_DESC("compressed_DESC"),

    COMPRESSION_RATIO_ASC("compression_ratio_ASC"),

    COMPRESSION_RATIO_DESC("compression_ratio_DESC"),

    CREATION_ASC("creation_ASC"),

    CREATION_DESC("creation_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOGICAL_SIZE_ASC("logical_size_ASC"),

    LOGICAL_SIZE_DESC("logical_size_DESC"),

    PARENT_RESTORE_POINT_ASC("parent_restore_point_ASC"),

    PARENT_RESTORE_POINT_DESC("parent_restore_point_DESC"),

    PHYSICAL_SIZE_ASC("physical_size_ASC"),

    PHYSICAL_SIZE_DESC("physical_size_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    SLICE_ASC("slice_ASC"),

    SLICE_DESC("slice_DESC"),

    SNAPSHOT_CONSISTENT_TYPE_ASC("snapshot_consistent_type_ASC"),

    SNAPSHOT_CONSISTENT_TYPE_DESC("snapshot_consistent_type_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VALID_CAPACITY_ASC("valid_capacity_ASC"),

    VALID_CAPACITY_DESC("valid_capacity_DESC"),

    VALID_SIZE_ASC("valid_size_ASC"),

    VALID_SIZE_DESC("valid_size_DESC"),

    VM_LOCAL_ID_ASC("vm_local_id_ASC"),

    VM_LOCAL_ID_DESC("vm_local_id_DESC"),

    VM_NAME_ASC("vm_name_ASC"),

    VM_NAME_DESC("vm_name_DESC"),

    BACKUPRESTOREPOINTORDERBYINPUT_UNSUPPORTED_ENUM(
            "BACKUPRESTOREPOINTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupRestorePointOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupRestorePointOrderByInput fromValue(String value) {
        for (BackupRestorePointOrderByInput b : BackupRestorePointOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupRestorePointOrderByInput.BACKUPRESTOREPOINTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupRestorePointOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupRestorePointOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupRestorePointOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupRestorePointOrderByInput.fromValue(value);
        }
    }
}
