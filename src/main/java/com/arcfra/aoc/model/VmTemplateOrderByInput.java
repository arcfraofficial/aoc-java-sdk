package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmTemplateOrderByInput */
@JsonAdapter(VmTemplateOrderByInput.Adapter.class)
public enum VmTemplateOrderByInput {
    CLOCK_OFFSET_ASC("clock_offset_ASC"),

    CLOCK_OFFSET_DESC("clock_offset_DESC"),

    CLOUD_INIT_SUPPORTED_ASC("cloud_init_supported_ASC"),

    CLOUD_INIT_SUPPORTED_DESC("cloud_init_supported_DESC"),

    CPU_ASC("cpu_ASC"),

    CPU_DESC("cpu_DESC"),

    CPU_MODEL_ASC("cpu_model_ASC"),

    CPU_MODEL_DESC("cpu_model_DESC"),

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

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

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

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

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

    VMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM("VMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmTemplateOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmTemplateOrderByInput fromValue(String value) {
        for (VmTemplateOrderByInput b : VmTemplateOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmTemplateOrderByInput.VMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmTemplateOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmTemplateOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmTemplateOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmTemplateOrderByInput.fromValue(value);
        }
    }
}
