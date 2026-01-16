package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets LabelOrderByInput */
@JsonAdapter(LabelOrderByInput.Adapter.class)
public enum LabelOrderByInput {
    CLUSTER_NUM_ASC("cluster_num_ASC"),

    CLUSTER_NUM_DESC("cluster_num_DESC"),

    CONTENT_LIBRARY_IMAGE_NUM_ASC("content_library_image_num_ASC"),

    CONTENT_LIBRARY_IMAGE_NUM_DESC("content_library_image_num_DESC"),

    CONTENT_LIBRARY_VM_TEMPLATE_NUM_ASC("content_library_vm_template_num_ASC"),

    CONTENT_LIBRARY_VM_TEMPLATE_NUM_DESC("content_library_vm_template_num_DESC"),

    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DATACENTER_NUM_ASC("datacenter_num_ASC"),

    DATACENTER_NUM_DESC("datacenter_num_DESC"),

    DISK_NUM_ASC("disk_num_ASC"),

    DISK_NUM_DESC("disk_num_DESC"),

    ELF_IMAGE_NUM_ASC("elf_image_num_ASC"),

    ELF_IMAGE_NUM_DESC("elf_image_num_DESC"),

    GPU_DEVICE_NUM_ASC("gpu_device_num_ASC"),

    GPU_DEVICE_NUM_DESC("gpu_device_num_DESC"),

    HOST_NUM_ASC("host_num_ASC"),

    HOST_NUM_DESC("host_num_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    ISCSI_LUN_NUM_ASC("iscsi_lun_num_ASC"),

    ISCSI_LUN_NUM_DESC("iscsi_lun_num_DESC"),

    ISCSI_LUN_SNAPSHOT_NUM_ASC("iscsi_lun_snapshot_num_ASC"),

    ISCSI_LUN_SNAPSHOT_NUM_DESC("iscsi_lun_snapshot_num_DESC"),

    ISCSI_TARGET_NUM_ASC("iscsi_target_num_ASC"),

    ISCSI_TARGET_NUM_DESC("iscsi_target_num_DESC"),

    KEY_ASC("key_ASC"),

    KEY_DESC("key_DESC"),

    NIC_NUM_ASC("nic_num_ASC"),

    NIC_NUM_DESC("nic_num_DESC"),

    SYSTEM_VLAN_NUM_ASC("system_vlan_num_ASC"),

    SYSTEM_VLAN_NUM_DESC("system_vlan_num_DESC"),

    TOTAL_NUM_ASC("total_num_ASC"),

    TOTAL_NUM_DESC("total_num_DESC"),

    VALUE_ASC("value_ASC"),

    VALUE_DESC("value_DESC"),

    VDS_NUM_ASC("vds_num_ASC"),

    VDS_NUM_DESC("vds_num_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    VM_SNAPSHOT_NUM_ASC("vm_snapshot_num_ASC"),

    VM_SNAPSHOT_NUM_DESC("vm_snapshot_num_DESC"),

    VM_TEMPLATE_NUM_ASC("vm_template_num_ASC"),

    VM_TEMPLATE_NUM_DESC("vm_template_num_DESC"),

    VM_VLAN_NUM_ASC("vm_vlan_num_ASC"),

    VM_VLAN_NUM_DESC("vm_vlan_num_DESC"),

    VM_VOLUME_NUM_ASC("vm_volume_num_ASC"),

    VM_VOLUME_NUM_DESC("vm_volume_num_DESC"),

    VM_VOLUME_SNAPSHOT_NUM_ASC("vm_volume_snapshot_num_ASC"),

    VM_VOLUME_SNAPSHOT_NUM_DESC("vm_volume_snapshot_num_DESC"),

    LABELORDERBYINPUT_UNSUPPORTED_ENUM("LABELORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    LabelOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LabelOrderByInput fromValue(String value) {
        for (LabelOrderByInput b : LabelOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return LabelOrderByInput.LABELORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<LabelOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LabelOrderByInput.fromValue(value);
        }
    }
}
