package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SyncReplicationPlanOrderByInput */
@JsonAdapter(SyncReplicationPlanOrderByInput.Adapter.class)
public enum SyncReplicationPlanOrderByInput {
    ACTIVATION_TIMESTAMP_ASC("activation_timestamp_ASC"),

    ACTIVATION_TIMESTAMP_DESC("activation_timestamp_DESC"),

    COMPRESSION_ASC("compression_ASC"),

    COMPRESSION_DESC("compression_DESC"),

    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DATA_VERSION_ASC("data_version_ASC"),

    DATA_VERSION_DESC("data_version_DESC"),

    DELETE_STRATEGY_ASC("delete_strategy_ASC"),

    DELETE_STRATEGY_DESC("delete_strategy_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FAILOVER_TEST_IP_MAPPING_ASC("failover_test_ip_mapping_ASC"),

    FAILOVER_TEST_IP_MAPPING_DESC("failover_test_ip_mapping_DESC"),

    FAILOVER_TEST_KEEP_MAC_ADDRESS_ASC("failover_test_keep_mac_address_ASC"),

    FAILOVER_TEST_KEEP_MAC_ADDRESS_DESC("failover_test_keep_mac_address_DESC"),

    FAILOVER_TEST_NAME_RULE_ASC("failover_test_name_rule_ASC"),

    FAILOVER_TEST_NAME_RULE_DESC("failover_test_name_rule_DESC"),

    FAILOVER_TEST_NAME_SETTING_ASC("failover_test_name_setting_ASC"),

    FAILOVER_TEST_NAME_SETTING_DESC("failover_test_name_setting_DESC"),

    FAILOVER_TEST_NETWORK_MAPPING_ASC("failover_test_network_mapping_ASC"),

    FAILOVER_TEST_NETWORK_MAPPING_DESC("failover_test_network_mapping_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INBOUND_ASC("inbound_ASC"),

    INBOUND_DESC("inbound_DESC"),

    INITIALIZATION_TIME_POINT_ASC("initialization_time_point_ASC"),

    INITIALIZATION_TIME_POINT_DESC("initialization_time_point_DESC"),

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

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NETWORK_MAPPING_ASC("network_mapping_ASC"),

    NETWORK_MAPPING_DESC("network_mapping_DESC"),

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

    RESOURCE_VERSION_ASC("resource_version_ASC"),

    RESOURCE_VERSION_DESC("resource_version_DESC"),

    SNAPSHOT_CONSISTENT_TYPE_ASC("snapshot_consistent_type_ASC"),

    SNAPSHOT_CONSISTENT_TYPE_DESC("snapshot_consistent_type_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    STORAGE_ENCRYPTED_ASC("storage_encrypted_ASC"),

    STORAGE_ENCRYPTED_DESC("storage_encrypted_DESC"),

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

    SYNCREPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM(
            "SYNCREPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SyncReplicationPlanOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SyncReplicationPlanOrderByInput fromValue(String value) {
        for (SyncReplicationPlanOrderByInput b : SyncReplicationPlanOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SyncReplicationPlanOrderByInput.SYNCREPLICATIONPLANORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SyncReplicationPlanOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final SyncReplicationPlanOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SyncReplicationPlanOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return SyncReplicationPlanOrderByInput.fromValue(value);
        }
    }
}
