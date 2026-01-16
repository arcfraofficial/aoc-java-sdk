package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IscsiLunOrderByInput */
@JsonAdapter(IscsiLunOrderByInput.Adapter.class)
public enum IscsiLunOrderByInput {
    ALLOWED_INITIATORS_ASC("allowed_initiators_ASC"),

    ALLOWED_INITIATORS_DESC("allowed_initiators_DESC"),

    ASSIGNED_SIZE_ASC("assigned_size_ASC"),

    ASSIGNED_SIZE_DESC("assigned_size_DESC"),

    BPS_ASC("bps_ASC"),

    BPS_DESC("bps_DESC"),

    BPS_MAX_ASC("bps_max_ASC"),

    BPS_MAX_DESC("bps_max_DESC"),

    BPS_MAX_LENGTH_ASC("bps_max_length_ASC"),

    BPS_MAX_LENGTH_DESC("bps_max_length_DESC"),

    BPS_RD_ASC("bps_rd_ASC"),

    BPS_RD_DESC("bps_rd_DESC"),

    BPS_RD_MAX_ASC("bps_rd_max_ASC"),

    BPS_RD_MAX_DESC("bps_rd_max_DESC"),

    BPS_RD_MAX_LENGTH_ASC("bps_rd_max_length_ASC"),

    BPS_RD_MAX_LENGTH_DESC("bps_rd_max_length_DESC"),

    BPS_WR_ASC("bps_wr_ASC"),

    BPS_WR_DESC("bps_wr_DESC"),

    BPS_WR_MAX_ASC("bps_wr_max_ASC"),

    BPS_WR_MAX_DESC("bps_wr_max_DESC"),

    BPS_WR_MAX_LENGTH_ASC("bps_wr_max_length_ASC"),

    BPS_WR_MAX_LENGTH_DESC("bps_wr_max_length_DESC"),

    BUSINESS_HOST_IS_SAME_WITH_PARENT_ASC("business_host_is_same_with_parent_ASC"),

    BUSINESS_HOST_IS_SAME_WITH_PARENT_DESC("business_host_is_same_with_parent_DESC"),

    CONFIGURATION_METHOD_ASC("configuration_method_ASC"),

    CONFIGURATION_METHOD_DESC("configuration_method_DESC"),

    DOWNGRADED_PRIORITIZED_SPACE_ASC("downgraded_prioritized_space_ASC"),

    DOWNGRADED_PRIORITIZED_SPACE_DESC("downgraded_prioritized_space_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENCRYPT_METHOD_ASC("encrypt_method_ASC"),

    ENCRYPT_METHOD_DESC("encrypt_method_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IO_SIZE_ASC("io_size_ASC"),

    IO_SIZE_DESC("io_size_DESC"),

    IOPS_ASC("iops_ASC"),

    IOPS_DESC("iops_DESC"),

    IOPS_MAX_ASC("iops_max_ASC"),

    IOPS_MAX_DESC("iops_max_DESC"),

    IOPS_MAX_LENGTH_ASC("iops_max_length_ASC"),

    IOPS_MAX_LENGTH_DESC("iops_max_length_DESC"),

    IOPS_RD_ASC("iops_rd_ASC"),

    IOPS_RD_DESC("iops_rd_DESC"),

    IOPS_RD_MAX_ASC("iops_rd_max_ASC"),

    IOPS_RD_MAX_DESC("iops_rd_max_DESC"),

    IOPS_RD_MAX_LENGTH_ASC("iops_rd_max_length_ASC"),

    IOPS_RD_MAX_LENGTH_DESC("iops_rd_max_length_DESC"),

    IOPS_WR_ASC("iops_wr_ASC"),

    IOPS_WR_DESC("iops_wr_DESC"),

    IOPS_WR_MAX_ASC("iops_wr_max_ASC"),

    IOPS_WR_MAX_DESC("iops_wr_max_DESC"),

    IOPS_WR_MAX_LENGTH_ASC("iops_wr_max_length_ASC"),

    IOPS_WR_MAX_LENGTH_DESC("iops_wr_max_length_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LUN_ID_ASC("lun_id_ASC"),

    LUN_ID_DESC("lun_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRIORITIZED_ASC("prioritized_ASC"),

    PRIORITIZED_DESC("prioritized_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    SHARED_SIZE_ASC("shared_size_ASC"),

    SHARED_SIZE_DESC("shared_size_DESC"),

    SNAPSHOT_NUM_ASC("snapshot_num_ASC"),

    SNAPSHOT_NUM_DESC("snapshot_num_DESC"),

    STRIPE_NUM_ASC("stripe_num_ASC"),

    STRIPE_NUM_DESC("stripe_num_DESC"),

    STRIPE_SIZE_ASC("stripe_size_ASC"),

    STRIPE_SIZE_DESC("stripe_size_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    UNIQUE_LOGICAL_SIZE_ASC("unique_logical_size_ASC"),

    UNIQUE_LOGICAL_SIZE_DESC("unique_logical_size_DESC"),

    UNIQUE_SIZE_ASC("unique_size_ASC"),

    UNIQUE_SIZE_DESC("unique_size_DESC"),

    ZBS_VOLUME_ID_ASC("zbs_volume_id_ASC"),

    ZBS_VOLUME_ID_DESC("zbs_volume_id_DESC"),

    ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM("ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    IscsiLunOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IscsiLunOrderByInput fromValue(String value) {
        for (IscsiLunOrderByInput b : IscsiLunOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IscsiLunOrderByInput.ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IscsiLunOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final IscsiLunOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IscsiLunOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IscsiLunOrderByInput.fromValue(value);
        }
    }
}
