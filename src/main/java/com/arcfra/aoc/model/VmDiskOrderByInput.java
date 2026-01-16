package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmDiskOrderByInput */
@JsonAdapter(VmDiskOrderByInput.Adapter.class)
public enum VmDiskOrderByInput {
    BOOT_ASC("boot_ASC"),

    BOOT_DESC("boot_DESC"),

    BUS_ASC("bus_ASC"),

    BUS_DESC("bus_DESC"),

    CLOUD_INIT_IMAGE_NAME_ASC("cloud_init_image_name_ASC"),

    CLOUD_INIT_IMAGE_NAME_DESC("cloud_init_image_name_DESC"),

    CLOUD_INIT_IMAGE_PATH_ASC("cloud_init_image_path_ASC"),

    CLOUD_INIT_IMAGE_PATH_DESC("cloud_init_image_path_DESC"),

    DEVICE_ASC("device_ASC"),

    DEVICE_DESC("device_DESC"),

    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    KEY_ASC("key_ASC"),

    KEY_DESC("key_DESC"),

    MAX_BANDWIDTH_ASC("max_bandwidth_ASC"),

    MAX_BANDWIDTH_DESC("max_bandwidth_DESC"),

    MAX_BANDWIDTH_POLICY_ASC("max_bandwidth_policy_ASC"),

    MAX_BANDWIDTH_POLICY_DESC("max_bandwidth_policy_DESC"),

    MAX_IOPS_ASC("max_iops_ASC"),

    MAX_IOPS_DESC("max_iops_DESC"),

    MAX_IOPS_POLICY_ASC("max_iops_policy_ASC"),

    MAX_IOPS_POLICY_DESC("max_iops_policy_DESC"),

    SERIAL_ASC("serial_ASC"),

    SERIAL_DESC("serial_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UNSAFE_IMAGE_PATH_ASC("unsafe_image_path_ASC"),

    UNSAFE_IMAGE_PATH_DESC("unsafe_image_path_DESC"),

    UNSAFE_IMAGE_UUID_ASC("unsafe_image_uuid_ASC"),

    UNSAFE_IMAGE_UUID_DESC("unsafe_image_uuid_DESC"),

    UNSAFE_PROVISION_ASC("unsafe_provision_ASC"),

    UNSAFE_PROVISION_DESC("unsafe_provision_DESC"),

    VMDISKORDERBYINPUT_UNSUPPORTED_ENUM("VMDISKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmDiskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmDiskOrderByInput fromValue(String value) {
        for (VmDiskOrderByInput b : VmDiskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmDiskOrderByInput.VMDISKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmDiskOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmDiskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmDiskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmDiskOrderByInput.fromValue(value);
        }
    }
}
