package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmFolderOrderByInput */
@JsonAdapter(VmFolderOrderByInput.Adapter.class)
public enum VmFolderOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    VMFOLDERORDERBYINPUT_UNSUPPORTED_ENUM("VMFOLDERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmFolderOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmFolderOrderByInput fromValue(String value) {
        for (VmFolderOrderByInput b : VmFolderOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmFolderOrderByInput.VMFOLDERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmFolderOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmFolderOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmFolderOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmFolderOrderByInput.fromValue(value);
        }
    }
}
