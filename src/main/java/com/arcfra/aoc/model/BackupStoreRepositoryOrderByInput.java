package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupStoreRepositoryOrderByInput */
@JsonAdapter(BackupStoreRepositoryOrderByInput.Adapter.class)
public enum BackupStoreRepositoryOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ERROR_CODE_ASC("error_code_ASC"),

    ERROR_CODE_DESC("error_code_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    ISCSI_CHAP_NAME_ASC("iscsi_chap_name_ASC"),

    ISCSI_CHAP_NAME_DESC("iscsi_chap_name_DESC"),

    ISCSI_CHAP_SECRET_ASC("iscsi_chap_secret_ASC"),

    ISCSI_CHAP_SECRET_DESC("iscsi_chap_secret_DESC"),

    ISCSI_IP_ASC("iscsi_ip_ASC"),

    ISCSI_IP_DESC("iscsi_ip_DESC"),

    ISCSI_LUN_ID_ASC("iscsi_lun_id_ASC"),

    ISCSI_LUN_ID_DESC("iscsi_lun_id_DESC"),

    ISCSI_PORT_ASC("iscsi_port_ASC"),

    ISCSI_PORT_DESC("iscsi_port_DESC"),

    ISCSI_TARGET_IQN_ASC("iscsi_target_iqn_ASC"),

    ISCSI_TARGET_IQN_DESC("iscsi_target_iqn_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NFS_PATH_ASC("nfs_path_ASC"),

    NFS_PATH_DESC("nfs_path_DESC"),

    NFS_SERVER_ASC("nfs_server_ASC"),

    NFS_SERVER_DESC("nfs_server_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    TOTAL_CAPACITY_ASC("total_capacity_ASC"),

    TOTAL_CAPACITY_DESC("total_capacity_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UPDATE_TIMESTAMP_ASC("update_timestamp_ASC"),

    UPDATE_TIMESTAMP_DESC("update_timestamp_DESC"),

    USED_DATA_SPACE_ASC("used_data_space_ASC"),

    USED_DATA_SPACE_DESC("used_data_space_DESC"),

    USED_DATA_SPACE_USAGE_ASC("used_data_space_usage_ASC"),

    USED_DATA_SPACE_USAGE_DESC("used_data_space_usage_DESC"),

    VALID_DATA_SPACE_ASC("valid_data_space_ASC"),

    VALID_DATA_SPACE_DESC("valid_data_space_DESC"),

    BACKUPSTOREREPOSITORYORDERBYINPUT_UNSUPPORTED_ENUM(
            "BACKUPSTOREREPOSITORYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupStoreRepositoryOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupStoreRepositoryOrderByInput fromValue(String value) {
        for (BackupStoreRepositoryOrderByInput b : BackupStoreRepositoryOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupStoreRepositoryOrderByInput.BACKUPSTOREREPOSITORYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupStoreRepositoryOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupStoreRepositoryOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupStoreRepositoryOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return BackupStoreRepositoryOrderByInput.fromValue(value);
        }
    }
}
