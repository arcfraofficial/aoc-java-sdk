package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmPlacementGroupOrderByInput */
@JsonAdapter(VmPlacementGroupOrderByInput.Adapter.class)
public enum VmPlacementGroupOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENABLED_ASC("enabled_ASC"),

    ENABLED_DESC("enabled_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOCAL_UPDATED_AT_ASC("local_updated_at_ASC"),

    LOCAL_UPDATED_AT_DESC("local_updated_at_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VM_HOST_MUST_ENABLED_ASC("vm_host_must_enabled_ASC"),

    VM_HOST_MUST_ENABLED_DESC("vm_host_must_enabled_DESC"),

    VM_HOST_MUST_POLICY_ASC("vm_host_must_policy_ASC"),

    VM_HOST_MUST_POLICY_DESC("vm_host_must_policy_DESC"),

    VM_HOST_PREFER_ENABLED_ASC("vm_host_prefer_enabled_ASC"),

    VM_HOST_PREFER_ENABLED_DESC("vm_host_prefer_enabled_DESC"),

    VM_HOST_PREFER_POLICY_ASC("vm_host_prefer_policy_ASC"),

    VM_HOST_PREFER_POLICY_DESC("vm_host_prefer_policy_DESC"),

    VM_VM_POLICY_ASC("vm_vm_policy_ASC"),

    VM_VM_POLICY_DESC("vm_vm_policy_DESC"),

    VM_VM_POLICY_ENABLED_ASC("vm_vm_policy_enabled_ASC"),

    VM_VM_POLICY_ENABLED_DESC("vm_vm_policy_enabled_DESC"),

    VMPLACEMENTGROUPORDERBYINPUT_UNSUPPORTED_ENUM("VMPLACEMENTGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmPlacementGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmPlacementGroupOrderByInput fromValue(String value) {
        for (VmPlacementGroupOrderByInput b : VmPlacementGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmPlacementGroupOrderByInput.VMPLACEMENTGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmPlacementGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VmPlacementGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmPlacementGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmPlacementGroupOrderByInput.fromValue(value);
        }
    }
}
