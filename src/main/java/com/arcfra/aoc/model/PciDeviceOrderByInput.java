package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDeviceOrderByInput */
@JsonAdapter(PciDeviceOrderByInput.Adapter.class)
public enum PciDeviceOrderByInput {
    BUS_ASC("bus_ASC"),

    BUS_DESC("bus_DESC"),

    BUS_LOCATION_ASC("bus_location_ASC"),

    BUS_LOCATION_DESC("bus_location_DESC"),

    CLASS_CODE_ASC("class_code_ASC"),

    CLASS_CODE_DESC("class_code_DESC"),

    DEVICE_TYPE_ASC("device_type_ASC"),

    DEVICE_TYPE_DESC("device_type_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FUNCTION_NUM_ASC("function_num_ASC"),

    FUNCTION_NUM_DESC("function_num_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IOMMU_STATUS_ASC("iommu_status_ASC"),

    IOMMU_STATUS_DESC("iommu_status_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MDEV_STATE_ASC("mdev_state_ASC"),

    MDEV_STATE_DESC("mdev_state_DESC"),

    MDEV_TYPE_ID_ASC("mdev_type_id_ASC"),

    MDEV_TYPE_ID_DESC("mdev_type_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PARTITIONING_STATE_ASC("partitioning_state_ASC"),

    PARTITIONING_STATE_DESC("partitioning_state_DESC"),

    PRODUCT_ID_ASC("product_id_ASC"),

    PRODUCT_ID_DESC("product_id_DESC"),

    SLOT_ASC("slot_ASC"),

    SLOT_DESC("slot_DESC"),

    SRIOV_STATE_ASC("sriov_state_ASC"),

    SRIOV_STATE_DESC("sriov_state_DESC"),

    SUBSYSTEM_PRODUCT_ID_ASC("subsystem_product_id_ASC"),

    SUBSYSTEM_PRODUCT_ID_DESC("subsystem_product_id_DESC"),

    SUBSYSTEM_VENDOR_ID_ASC("subsystem_vendor_id_ASC"),

    SUBSYSTEM_VENDOR_ID_DESC("subsystem_vendor_id_DESC"),

    TOTAL_MDEV_NUM_ASC("total_mdev_num_ASC"),

    TOTAL_MDEV_NUM_DESC("total_mdev_num_DESC"),

    TOTAL_PARTITIONING_NUM_ASC("total_partitioning_num_ASC"),

    TOTAL_PARTITIONING_NUM_DESC("total_partitioning_num_DESC"),

    TOTAL_VF_NUM_ASC("total_vf_num_ASC"),

    TOTAL_VF_NUM_DESC("total_vf_num_DESC"),

    USAGE_TYPE_ASC("usage_type_ASC"),

    USAGE_TYPE_DESC("usage_type_DESC"),

    USED_MDEV_NUM_ASC("used_mdev_num_ASC"),

    USED_MDEV_NUM_DESC("used_mdev_num_DESC"),

    USED_PARTITIONING_NUM_ASC("used_partitioning_num_ASC"),

    USED_PARTITIONING_NUM_DESC("used_partitioning_num_DESC"),

    USED_VF_NUM_ASC("used_vf_num_ASC"),

    USED_VF_NUM_DESC("used_vf_num_DESC"),

    USER_USAGE_ASC("user_usage_ASC"),

    USER_USAGE_DESC("user_usage_DESC"),

    VENDOR_ID_ASC("vendor_id_ASC"),

    VENDOR_ID_DESC("vendor_id_DESC"),

    VERDOR_NAME_ASC("verdor_name_ASC"),

    VERDOR_NAME_DESC("verdor_name_DESC"),

    PCIDEVICEORDERBYINPUT_UNSUPPORTED_ENUM("PCIDEVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    PciDeviceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDeviceOrderByInput fromValue(String value) {
        for (PciDeviceOrderByInput b : PciDeviceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDeviceOrderByInput.PCIDEVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDeviceOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDeviceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDeviceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDeviceOrderByInput.fromValue(value);
        }
    }
}
