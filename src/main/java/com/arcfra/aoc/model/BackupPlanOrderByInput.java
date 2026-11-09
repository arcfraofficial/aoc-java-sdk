package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanOrderByInput */
@JsonAdapter(BackupPlanOrderByInput.Adapter.class)
public enum BackupPlanOrderByInput {
    BACKUP_DELAY_OPTION_ASC("backup_delay_option_ASC"),

    BACKUP_DELAY_OPTION_DESC("backup_delay_option_DESC"),

    BACKUP_RESTORE_POINT_COUNT_ASC("backup_restore_point_count_ASC"),

    BACKUP_RESTORE_POINT_COUNT_DESC("backup_restore_point_count_DESC"),

    BACKUP_TOTAL_SIZE_ASC("backup_total_size_ASC"),

    BACKUP_TOTAL_SIZE_DESC("backup_total_size_DESC"),

    COMPRESSION_ASC("compression_ASC"),

    COMPRESSION_DESC("compression_DESC"),

    COMPRESSION_RATIO_ASC("compression_ratio_ASC"),

    COMPRESSION_RATIO_DESC("compression_ratio_DESC"),

    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DELETE_STRATEGY_ASC("delete_strategy_ASC"),

    DELETE_STRATEGY_DESC("delete_strategy_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENABLE_WINDOW_ASC("enable_window_ASC"),

    ENABLE_WINDOW_DESC("enable_window_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FULL_INTERVAL_ASC("full_interval_ASC"),

    FULL_INTERVAL_DESC("full_interval_DESC"),

    FULL_PERIOD_ASC("full_period_ASC"),

    FULL_PERIOD_DESC("full_period_DESC"),

    FULL_TIME_POINT_ASC("full_time_point_ASC"),

    FULL_TIME_POINT_DESC("full_time_point_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INCREMENTAL_INTERVAL_ASC("incremental_interval_ASC"),

    INCREMENTAL_INTERVAL_DESC("incremental_interval_DESC"),

    INCREMENTAL_PERIOD_ASC("incremental_period_ASC"),

    INCREMENTAL_PERIOD_DESC("incremental_period_DESC"),

    INCREMENTAL_TIME_POINTS_ASC("incremental_time_points_ASC"),

    INCREMENTAL_TIME_POINTS_DESC("incremental_time_points_DESC"),

    KEEP_POLICY_ASC("keep_policy_ASC"),

    KEEP_POLICY_DESC("keep_policy_DESC"),

    KEEP_POLICY_VALUE_ASC("keep_policy_value_ASC"),

    KEEP_POLICY_VALUE_DESC("keep_policy_value_DESC"),

    LAST_EXECUTE_STATUS_ASC("last_execute_status_ASC"),

    LAST_EXECUTE_STATUS_DESC("last_execute_status_DESC"),

    LAST_EXECUTE_STATUS_MESSAGE_ASC("last_execute_status_message_ASC"),

    LAST_EXECUTE_STATUS_MESSAGE_DESC("last_execute_status_message_DESC"),

    LAST_EXECUTE_SUCCESS_JOB_COUNT_ASC("last_execute_success_job_count_ASC"),

    LAST_EXECUTE_SUCCESS_JOB_COUNT_DESC("last_execute_success_job_count_DESC"),

    LAST_EXECUTE_TOTAL_JOB_COUNT_ASC("last_execute_total_job_count_ASC"),

    LAST_EXECUTE_TOTAL_JOB_COUNT_DESC("last_execute_total_job_count_DESC"),

    LAST_EXECUTED_AT_ASC("last_executed_at_ASC"),

    LAST_EXECUTED_AT_DESC("last_executed_at_DESC"),

    LAST_MANUAL_EXECUTE_STATUS_ASC("last_manual_execute_status_ASC"),

    LAST_MANUAL_EXECUTE_STATUS_DESC("last_manual_execute_status_DESC"),

    LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ASC("last_manual_execute_status_message_ASC"),

    LAST_MANUAL_EXECUTE_STATUS_MESSAGE_DESC("last_manual_execute_status_message_DESC"),

    LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_ASC("last_manual_execute_success_job_count_ASC"),

    LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_DESC("last_manual_execute_success_job_count_DESC"),

    LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_ASC("last_manual_execute_total_job_count_ASC"),

    LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_DESC("last_manual_execute_total_job_count_DESC"),

    LAST_MANUAL_EXECUTED_AT_ASC("last_manual_executed_at_ASC"),

    LAST_MANUAL_EXECUTED_AT_DESC("last_manual_executed_at_DESC"),

    LOGICAL_SIZE_ASC("logical_size_ASC"),

    LOGICAL_SIZE_DESC("logical_size_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NEXT_EXECUTE_TIME_ASC("next_execute_time_ASC"),

    NEXT_EXECUTE_TIME_DESC("next_execute_time_DESC"),

    PHASE_ASC("phase_ASC"),

    PHASE_DESC("phase_DESC"),

    PHYSICAL_SIZE_ASC("physical_size_ASC"),

    PHYSICAL_SIZE_DESC("physical_size_DESC"),

    SNAPSHOT_CONSISTENT_TYPE_ASC("snapshot_consistent_type_ASC"),

    SNAPSHOT_CONSISTENT_TYPE_DESC("snapshot_consistent_type_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    VALID_SIZE_OF_BACKUP_OBJECT_ASC("valid_size_of_backup_object_ASC"),

    VALID_SIZE_OF_BACKUP_OBJECT_DESC("valid_size_of_backup_object_DESC"),

    VALID_SIZE_OF_RESTORE_POINT_ASC("valid_size_of_restore_point_ASC"),

    VALID_SIZE_OF_RESTORE_POINT_DESC("valid_size_of_restore_point_DESC"),

    WINDOW_END_ASC("window_end_ASC"),

    WINDOW_END_DESC("window_end_DESC"),

    WINDOW_START_ASC("window_start_ASC"),

    WINDOW_START_DESC("window_start_DESC"),

    BACKUPPLANORDERBYINPUT_UNSUPPORTED_ENUM("BACKUPPLANORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanOrderByInput fromValue(String value) {
        for (BackupPlanOrderByInput b : BackupPlanOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanOrderByInput.BACKUPPLANORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanOrderByInput.fromValue(value);
        }
    }
}
