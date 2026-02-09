package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NvmfNamespaceSnapshotOrderByInput */
@JsonAdapter(NvmfNamespaceSnapshotOrderByInput.Adapter.class)
public enum NvmfNamespaceSnapshotOrderByInput {
    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    UNIQUE_SIZE_ASC("unique_size_ASC"),

    UNIQUE_SIZE_DESC("unique_size_DESC"),

    NVMFNAMESPACESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM(
            "NVMFNAMESPACESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NvmfNamespaceSnapshotOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NvmfNamespaceSnapshotOrderByInput fromValue(String value) {
        for (NvmfNamespaceSnapshotOrderByInput b : NvmfNamespaceSnapshotOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NvmfNamespaceSnapshotOrderByInput.NVMFNAMESPACESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NvmfNamespaceSnapshotOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final NvmfNamespaceSnapshotOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NvmfNamespaceSnapshotOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return NvmfNamespaceSnapshotOrderByInput.fromValue(value);
        }
    }
}
