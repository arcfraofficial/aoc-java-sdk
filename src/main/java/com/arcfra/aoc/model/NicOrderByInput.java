package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NicOrderByInput */
@JsonAdapter(NicOrderByInput.Adapter.class)
public enum NicOrderByInput {
    DRIVER_ASC("driver_ASC"),

    DRIVER_DESC("driver_DESC"),

    DRIVER_STATE_ASC("driver_state_ASC"),

    DRIVER_STATE_DESC("driver_state_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    GATEWAY_IP_ASC("gateway_ip_ASC"),

    GATEWAY_IP_DESC("gateway_ip_DESC"),

    IBDEV_ASC("ibdev_ASC"),

    IBDEV_DESC("ibdev_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IOMMU_STATUS_ASC("iommu_status_ASC"),

    IOMMU_STATUS_DESC("iommu_status_DESC"),

    IP_ADDRESS_ASC("ip_address_ASC"),

    IP_ADDRESS_DESC("ip_address_DESC"),

    IS_SRIOV_ASC("is_sriov_ASC"),

    IS_SRIOV_DESC("is_sriov_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MAC_ADDRESS_ASC("mac_address_ASC"),

    MAC_ADDRESS_DESC("mac_address_DESC"),

    MAX_VF_NUM_ASC("max_vf_num_ASC"),

    MAX_VF_NUM_DESC("max_vf_num_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    MTU_ASC("mtu_ASC"),

    MTU_DESC("mtu_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NIC_UUID_ASC("nic_uuid_ASC"),

    NIC_UUID_DESC("nic_uuid_DESC"),

    PHYSICAL_ASC("physical_ASC"),

    PHYSICAL_DESC("physical_DESC"),

    RDMA_ENABLED_ASC("rdma_enabled_ASC"),

    RDMA_ENABLED_DESC("rdma_enabled_DESC"),

    RUNNING_ASC("running_ASC"),

    RUNNING_DESC("running_DESC"),

    SPEED_ASC("speed_ASC"),

    SPEED_DESC("speed_DESC"),

    SUBNET_MASK_ASC("subnet_mask_ASC"),

    SUBNET_MASK_DESC("subnet_mask_DESC"),

    TOTAL_VF_NUM_ASC("total_vf_num_ASC"),

    TOTAL_VF_NUM_DESC("total_vf_num_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UP_ASC("up_ASC"),

    UP_DESC("up_DESC"),

    USED_VF_NUM_ASC("used_vf_num_ASC"),

    USED_VF_NUM_DESC("used_vf_num_DESC"),

    USER_USAGE_ASC("user_usage_ASC"),

    USER_USAGE_DESC("user_usage_DESC"),

    NICORDERBYINPUT_UNSUPPORTED_ENUM("NICORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NicOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NicOrderByInput fromValue(String value) {
        for (NicOrderByInput b : NicOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NicOrderByInput.NICORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NicOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NicOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NicOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NicOrderByInput.fromValue(value);
        }
    }
}
