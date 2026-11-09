package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupServiceOrderByInput */
@JsonAdapter(BackupServiceOrderByInput.Adapter.class)
public enum BackupServiceOrderByInput {
    BACKUP_NETWORK_GATEWAY_ASC("backup_network_gateway_ASC"),

    BACKUP_NETWORK_GATEWAY_DESC("backup_network_gateway_DESC"),

    BACKUP_NETWORK_IP_ASC("backup_network_ip_ASC"),

    BACKUP_NETWORK_IP_DESC("backup_network_ip_DESC"),

    BACKUP_NETWORK_SUBNET_MASK_ASC("backup_network_subnet_mask_ASC"),

    BACKUP_NETWORK_SUBNET_MASK_DESC("backup_network_subnet_mask_DESC"),

    BACKUP_NETWORK_TYPE_ASC("backup_network_type_ASC"),

    BACKUP_NETWORK_TYPE_DESC("backup_network_type_DESC"),

    BACKUP_NETWORK_VLAN_ASC("backup_network_vlan_ASC"),

    BACKUP_NETWORK_VLAN_DESC("backup_network_vlan_DESC"),

    BACKUP_RD_IOPS_MAX_ASC("backup_rd_iops_max_ASC"),

    BACKUP_RD_IOPS_MAX_DESC("backup_rd_iops_max_DESC"),

    BACKUP_WR_IOPS_MAX_ASC("backup_wr_iops_max_ASC"),

    BACKUP_WR_IOPS_MAX_DESC("backup_wr_iops_max_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    KUBE_CONFIG_ASC("kube_config_ASC"),

    KUBE_CONFIG_DESC("kube_config_DESC"),

    MANAGEMENT_NETWORK_GATEWAY_ASC("management_network_gateway_ASC"),

    MANAGEMENT_NETWORK_GATEWAY_DESC("management_network_gateway_DESC"),

    MANAGEMENT_NETWORK_IP_ASC("management_network_ip_ASC"),

    MANAGEMENT_NETWORK_IP_DESC("management_network_ip_DESC"),

    MANAGEMENT_NETWORK_SUBNET_MASK_ASC("management_network_subnet_mask_ASC"),

    MANAGEMENT_NETWORK_SUBNET_MASK_DESC("management_network_subnet_mask_DESC"),

    MANAGEMENT_NETWORK_VLAN_ASC("management_network_vlan_ASC"),

    MANAGEMENT_NETWORK_VLAN_DESC("management_network_vlan_DESC"),

    MAX_JOB_RETRY_TIMES_ASC("max_job_retry_times_ASC"),

    MAX_JOB_RETRY_TIMES_DESC("max_job_retry_times_DESC"),

    MAX_PARALLEL_BACKUP_JOBS_ASC("max_parallel_backup_jobs_ASC"),

    MAX_PARALLEL_BACKUP_JOBS_DESC("max_parallel_backup_jobs_DESC"),

    MAX_PARALLEL_RESTORE_JOBS_ASC("max_parallel_restore_jobs_ASC"),

    MAX_PARALLEL_RESTORE_JOBS_DESC("max_parallel_restore_jobs_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NETWORK_STATUS_ASC("network_status_ASC"),

    NETWORK_STATUS_DESC("network_status_DESC"),

    RESTORE_RD_IOPS_MAX_ASC("restore_rd_iops_max_ASC"),

    RESTORE_RD_IOPS_MAX_DESC("restore_rd_iops_max_DESC"),

    RESTORE_WR_IOPS_MAX_ASC("restore_wr_iops_max_ASC"),

    RESTORE_WR_IOPS_MAX_DESC("restore_wr_iops_max_DESC"),

    RETRY_INTERVAL_ASC("retry_interval_ASC"),

    RETRY_INTERVAL_DESC("retry_interval_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    STORAGE_NETWORK_GATEWAY_ASC("storage_network_gateway_ASC"),

    STORAGE_NETWORK_GATEWAY_DESC("storage_network_gateway_DESC"),

    STORAGE_NETWORK_IP_ASC("storage_network_ip_ASC"),

    STORAGE_NETWORK_IP_DESC("storage_network_ip_DESC"),

    STORAGE_NETWORK_SUBNET_MASK_ASC("storage_network_subnet_mask_ASC"),

    STORAGE_NETWORK_SUBNET_MASK_DESC("storage_network_subnet_mask_DESC"),

    STORAGE_NETWORK_TYPE_ASC("storage_network_type_ASC"),

    STORAGE_NETWORK_TYPE_DESC("storage_network_type_DESC"),

    STORAGE_NETWORK_VLAN_ASC("storage_network_vlan_ASC"),

    STORAGE_NETWORK_VLAN_DESC("storage_network_vlan_DESC"),

    BACKUPSERVICEORDERBYINPUT_UNSUPPORTED_ENUM("BACKUPSERVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupServiceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupServiceOrderByInput fromValue(String value) {
        for (BackupServiceOrderByInput b : BackupServiceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupServiceOrderByInput.BACKUPSERVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupServiceOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupServiceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupServiceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupServiceOrderByInput.fromValue(value);
        }
    }
}
