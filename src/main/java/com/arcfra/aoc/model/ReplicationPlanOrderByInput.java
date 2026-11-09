package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationPlanOrderByInput */
@JsonAdapter(ReplicationPlanOrderByInput.Adapter.class)
public enum ReplicationPlanOrderByInput {
    ABORT_WINDOW_UNFINISHED_ASC("abort_window_unfinished_ASC"),

    ABORT_WINDOW_UNFINISHED_DESC("abort_window_unfinished_DESC"),

    ACTIVATION_TIMESTAMP_ASC("activation_timestamp_ASC"),

    ACTIVATION_TIMESTAMP_DESC("activation_timestamp_DESC"),

    COMPRESSION_ASC("compression_ASC"),

    COMPRESSION_DESC("compression_DESC"),

    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DELETE_STRATEGY_ASC("delete_strategy_ASC"),

    DELETE_STRATEGY_DESC("delete_strategy_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENABLE_WINDOW_ASC("enable_window_ASC"),

    ENABLE_WINDOW_DESC("enable_window_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INBOUND_ASC("inbound_ASC"),

    INBOUND_DESC("inbound_DESC"),

    INTERVAL_ASC("interval_ASC"),

    INTERVAL_DESC("interval_DESC"),

    IP_MAPPING_ASC("ip_mapping_ASC"),

    IP_MAPPING_DESC("ip_mapping_DESC"),

    KEEP_MAC_ADDRESS_ASC("keep_mac_address_ASC"),

    KEEP_MAC_ADDRESS_DESC("keep_mac_address_DESC"),

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

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NETWORK_MAPPING_ASC("network_mapping_ASC"),

    NETWORK_MAPPING_DESC("network_mapping_DESC"),

    NEXT_EXECUTION_TIME_ASC("next_execution_time_ASC"),

    NEXT_EXECUTION_TIME_DESC("next_execution_time_DESC"),

    OBJECTS_DESCRIPTOR_ASC("objects_descriptor_ASC"),

    OBJECTS_DESCRIPTOR_DESC("objects_descriptor_DESC"),

    PERIOD_ASC("period_ASC"),

    PERIOD_DESC("period_DESC"),

    PHASE_ASC("phase_ASC"),

    PHASE_DESC("phase_DESC"),

    REPLICA_NAME_RULE_ASC("replica_name_rule_ASC"),

    REPLICA_NAME_RULE_DESC("replica_name_rule_DESC"),

    REPLICA_NAME_SETTING_ASC("replica_name_setting_ASC"),

    REPLICA_NAME_SETTING_DESC("replica_name_setting_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    SNAPSHOT_CONSISTENT_TYPE_ASC("snapshot_consistent_type_ASC"),

    SNAPSHOT_CONSISTENT_TYPE_DESC("snapshot_consistent_type_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    STORAGE_POLICY_ASC("storage_policy_ASC"),

    STORAGE_POLICY_DESC("storage_policy_DESC"),

    TARGET_CLUSTER_DESCRIPTOR_ASC("target_cluster_descriptor_ASC"),

    TARGET_CLUSTER_DESCRIPTOR_DESC("target_cluster_descriptor_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    TIME_POINTS_ASC("time_points_ASC"),

    TIME_POINTS_DESC("time_points_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UPDATEDAT_ASC("updatedAt_ASC"),

    UPDATEDAT_DESC("updatedAt_DESC"),

    WINDOW_END_ASC("window_end_ASC"),

    WINDOW_END_DESC("window_end_DESC"),

    WINDOW_START_ASC("window_start_ASC"),

    WINDOW_START_DESC("window_start_DESC"),

    REPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM("REPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ReplicationPlanOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationPlanOrderByInput fromValue(String value) {
        for (ReplicationPlanOrderByInput b : ReplicationPlanOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationPlanOrderByInput.REPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationPlanOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ReplicationPlanOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationPlanOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationPlanOrderByInput.fromValue(value);
        }
    }
}
