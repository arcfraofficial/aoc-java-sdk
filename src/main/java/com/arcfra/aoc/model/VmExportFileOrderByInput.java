package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmExportFileOrderByInput */
@JsonAdapter(VmExportFileOrderByInput.Adapter.class)
public enum VmExportFileOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DAMAGED_ASC("damaged_ASC"),

    DAMAGED_DESC("damaged_DESC"),

    DATA_PORT_ID_ASC("data_port_id_ASC"),

    DATA_PORT_ID_DESC("data_port_id_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FILES_ASC("files_ASC"),

    FILES_DESC("files_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    STORAGE_CLUSTER_ID_ASC("storage_cluster_id_ASC"),

    STORAGE_CLUSTER_ID_DESC("storage_cluster_id_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VMEXPORTFILEORDERBYINPUT_UNSUPPORTED_ENUM("VMEXPORTFILEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmExportFileOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmExportFileOrderByInput fromValue(String value) {
        for (VmExportFileOrderByInput b : VmExportFileOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmExportFileOrderByInput.VMEXPORTFILEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmExportFileOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmExportFileOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmExportFileOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmExportFileOrderByInput.fromValue(value);
        }
    }
}
