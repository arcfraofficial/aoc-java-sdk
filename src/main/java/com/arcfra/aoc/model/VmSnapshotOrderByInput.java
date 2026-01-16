package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmSnapshotOrderByInput */
@JsonAdapter(VmSnapshotOrderByInput.Adapter.class)
public enum VmSnapshotOrderByInput {
    CLOCK_OFFSET_ASC("clock_offset_ASC"),

    CLOCK_OFFSET_DESC("clock_offset_DESC"),

    CONSISTENT_TYPE_ASC("consistent_type_ASC"),

    CONSISTENT_TYPE_DESC("consistent_type_DESC"),

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

    HA_PRIORITY_ASC("ha_priority_ASC"),

    HA_PRIORITY_DESC("ha_priority_DESC"),

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

    VM_DISKS_ASC("vm_disks_ASC"),

    VM_DISKS_DESC("vm_disks_DESC"),

    VM_NICS_ASC("vm_nics_ASC"),

    VM_NICS_DESC("vm_nics_DESC"),

    WIN_OPT_ASC("win_opt_ASC"),

    WIN_OPT_DESC("win_opt_DESC"),

    VMSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM("VMSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmSnapshotOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmSnapshotOrderByInput fromValue(String value) {
        for (VmSnapshotOrderByInput b : VmSnapshotOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmSnapshotOrderByInput.VMSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmSnapshotOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmSnapshotOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmSnapshotOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmSnapshotOrderByInput.fromValue(value);
        }
    }
}
