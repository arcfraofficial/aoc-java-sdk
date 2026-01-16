package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IscsiTargetOrderByInput */
@JsonAdapter(IscsiTargetOrderByInput.Adapter.class)
public enum IscsiTargetOrderByInput {
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

    CHAP_ENABLED_ASC("chap_enabled_ASC"),

    CHAP_ENABLED_DESC("chap_enabled_DESC"),

    CHAP_NAME_ASC("chap_name_ASC"),

    CHAP_NAME_DESC("chap_name_DESC"),

    CHAP_SECRET_ASC("chap_secret_ASC"),

    CHAP_SECRET_DESC("chap_secret_DESC"),

    CONFIGURATION_ADAPTIVE_ASC("configuration_adaptive_ASC"),

    CONFIGURATION_ADAPTIVE_DESC("configuration_adaptive_DESC"),

    CONFIGURATION_METHOD_ASC("configuration_method_ASC"),

    CONFIGURATION_METHOD_DESC("configuration_method_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENCRYPT_METHOD_ASC("encrypt_method_ASC"),

    ENCRYPT_METHOD_DESC("encrypt_method_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXTERNAL_USE_ASC("external_use_ASC"),

    EXTERNAL_USE_DESC("external_use_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INITIATOR_CHAPS_ASC("initiator_chaps_ASC"),

    INITIATOR_CHAPS_DESC("initiator_chaps_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

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

    IP_WHITELIST_ASC("ip_whitelist_ASC"),

    IP_WHITELIST_DESC("ip_whitelist_DESC"),

    IQN_NAME_ASC("iqn_name_ASC"),

    IQN_NAME_DESC("iqn_name_DESC"),

    IQN_WHITELIST_ASC("iqn_whitelist_ASC"),

    IQN_WHITELIST_DESC("iqn_whitelist_DESC"),

    ISCSI_LUNS_NUM_ASC("iscsi_luns_num_ASC"),

    ISCSI_LUNS_NUM_DESC("iscsi_luns_num_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRIORITIZED_ASC("prioritized_ASC"),

    PRIORITIZED_DESC("prioritized_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    STRIPE_NUM_ASC("stripe_num_ASC"),

    STRIPE_NUM_DESC("stripe_num_DESC"),

    STRIPE_SIZE_ASC("stripe_size_ASC"),

    STRIPE_SIZE_DESC("stripe_size_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    ISCSITARGETORDERBYINPUT_UNSUPPORTED_ENUM("ISCSITARGETORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    IscsiTargetOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IscsiTargetOrderByInput fromValue(String value) {
        for (IscsiTargetOrderByInput b : IscsiTargetOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IscsiTargetOrderByInput.ISCSITARGETORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IscsiTargetOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final IscsiTargetOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IscsiTargetOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IscsiTargetOrderByInput.fromValue(value);
        }
    }
}
