package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GpuDeviceOrderByInput */
@JsonAdapter(GpuDeviceOrderByInput.Adapter.class)
public enum GpuDeviceOrderByInput {
    ASSIGNED_VGPUS_NUM_ASC("assigned_vgpus_num_ASC"),

    ASSIGNED_VGPUS_NUM_DESC("assigned_vgpus_num_DESC"),

    AVAILABLE_VGPUS_NUM_ASC("available_vgpus_num_ASC"),

    AVAILABLE_VGPUS_NUM_DESC("available_vgpus_num_DESC"),

    BRAND_ASC("brand_ASC"),

    BRAND_DESC("brand_DESC"),

    BUS_LOCATION_ASC("bus_location_ASC"),

    BUS_LOCATION_DESC("bus_location_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    DRIVER_INFO_ASC("driver_info_ASC"),

    DRIVER_INFO_DESC("driver_info_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IS_NVIDIA_TOOLS_READY_ASC("is_nvidia_tools_ready_ASC"),

    IS_NVIDIA_TOOLS_READY_DESC("is_nvidia_tools_ready_DESC"),

    IS_NVIDIA_VFS_ENABLED_ASC("is_nvidia_vfs_enabled_ASC"),

    IS_NVIDIA_VFS_ENABLED_DESC("is_nvidia_vfs_enabled_DESC"),

    IS_NVIDIA_VFS_SUPPORTED_ASC("is_nvidia_vfs_supported_ASC"),

    IS_NVIDIA_VFS_SUPPORTED_DESC("is_nvidia_vfs_supported_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MDEV_SUPPORTED_TYPES_ASC("mdev_supported_types_ASC"),

    MDEV_SUPPORTED_TYPES_DESC("mdev_supported_types_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    USER_USAGE_ASC("user_usage_ASC"),

    USER_USAGE_DESC("user_usage_DESC"),

    USER_VGPU_TYPE_ID_ASC("user_vgpu_type_id_ASC"),

    USER_VGPU_TYPE_ID_DESC("user_vgpu_type_id_DESC"),

    USER_VGPU_TYPE_NAME_ASC("user_vgpu_type_name_ASC"),

    USER_VGPU_TYPE_NAME_DESC("user_vgpu_type_name_DESC"),

    VGPU_INSTANCE_NUM_ASC("vgpu_instance_num_ASC"),

    VGPU_INSTANCE_NUM_DESC("vgpu_instance_num_DESC"),

    GPUDEVICEORDERBYINPUT_UNSUPPORTED_ENUM("GPUDEVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    GpuDeviceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GpuDeviceOrderByInput fromValue(String value) {
        for (GpuDeviceOrderByInput b : GpuDeviceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GpuDeviceOrderByInput.GPUDEVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GpuDeviceOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final GpuDeviceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GpuDeviceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GpuDeviceOrderByInput.fromValue(value);
        }
    }
}
