package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ContentLibraryVmTemplateOrderByInput */
@JsonAdapter(ContentLibraryVmTemplateOrderByInput.Adapter.class)
public enum ContentLibraryVmTemplateOrderByInput {
    ARCHITECTURE_ASC("architecture_ASC"),

    ARCHITECTURE_DESC("architecture_DESC"),

    CLOCK_OFFSET_ASC("clock_offset_ASC"),

    CLOCK_OFFSET_DESC("clock_offset_DESC"),

    CLOUD_INIT_SUPPORTED_ASC("cloud_init_supported_ASC"),

    CLOUD_INIT_SUPPORTED_DESC("cloud_init_supported_DESC"),

    CPU_ASC("cpu_ASC"),

    CPU_DESC("cpu_DESC"),

    CPU_MODEL_ASC("cpu_model_ASC"),

    CPU_MODEL_DESC("cpu_model_DESC"),

    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FIRMWARE_ASC("firmware_ASC"),

    FIRMWARE_DESC("firmware_DESC"),

    HA_ASC("ha_ASC"),

    HA_DESC("ha_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IO_POLICY_ASC("io_policy_ASC"),

    IO_POLICY_DESC("io_policy_DESC"),

    MAX_BANDWIDTH_ASC("max_bandwidth_ASC"),

    MAX_BANDWIDTH_DESC("max_bandwidth_DESC"),

    MAX_BANDWIDTH_POLICY_ASC("max_bandwidth_policy_ASC"),

    MAX_BANDWIDTH_POLICY_DESC("max_bandwidth_policy_DESC"),

    MAX_IOPS_ASC("max_iops_ASC"),

    MAX_IOPS_DESC("max_iops_DESC"),

    MAX_IOPS_POLICY_ASC("max_iops_policy_ASC"),

    MAX_IOPS_POLICY_DESC("max_iops_policy_DESC"),

    MEMORY_ASC("memory_ASC"),

    MEMORY_DESC("memory_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    OS_ASC("os_ASC"),

    OS_DESC("os_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    TEMPLATE_CONFIG_ASC("template_config_ASC"),

    TEMPLATE_CONFIG_DESC("template_config_DESC"),

    VCPU_ASC("vcpu_ASC"),

    VCPU_DESC("vcpu_DESC"),

    VIDEO_TYPE_ASC("video_type_ASC"),

    VIDEO_TYPE_DESC("video_type_DESC"),

    VM_DISKS_ASC("vm_disks_ASC"),

    VM_DISKS_DESC("vm_disks_DESC"),

    VM_NICS_ASC("vm_nics_ASC"),

    VM_NICS_DESC("vm_nics_DESC"),

    WIN_OPT_ASC("win_opt_ASC"),

    WIN_OPT_DESC("win_opt_DESC"),

    ZBS_STORAGE_INFO_ASC("zbs_storage_info_ASC"),

    ZBS_STORAGE_INFO_DESC("zbs_storage_info_DESC"),

    CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM(
            "CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ContentLibraryVmTemplateOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentLibraryVmTemplateOrderByInput fromValue(String value) {
        for (ContentLibraryVmTemplateOrderByInput b :
                ContentLibraryVmTemplateOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ContentLibraryVmTemplateOrderByInput
                .CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ContentLibraryVmTemplateOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ContentLibraryVmTemplateOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ContentLibraryVmTemplateOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return ContentLibraryVmTemplateOrderByInput.fromValue(value);
        }
    }
}
