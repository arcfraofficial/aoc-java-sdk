package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NfsInodeOrderByInput */
@JsonAdapter(NfsInodeOrderByInput.Adapter.class)
public enum NfsInodeOrderByInput {
    ASSIGNED_SIZE_ASC("assigned_size_ASC"),

    ASSIGNED_SIZE_DESC("assigned_size_DESC"),

    DOWNGRADED_PRIORITIZED_SPACE_ASC("downgraded_prioritized_space_ASC"),

    DOWNGRADED_PRIORITIZED_SPACE_DESC("downgraded_prioritized_space_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENCRYPT_METHOD_ASC("encrypt_method_ASC"),

    ENCRYPT_METHOD_DESC("encrypt_method_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FILE_ASC("file_ASC"),

    FILE_DESC("file_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOCAL_UPDATED_AT_ASC("local_updated_at_ASC"),

    LOCAL_UPDATED_AT_DESC("local_updated_at_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PARENT_ID_ASC("parent_id_ASC"),

    PARENT_ID_DESC("parent_id_DESC"),

    PRIORITIZED_ASC("prioritized_ASC"),

    PRIORITIZED_DESC("prioritized_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    SHARED_SIZE_ASC("shared_size_ASC"),

    SHARED_SIZE_DESC("shared_size_DESC"),

    SNAPSHOT_NUM_ASC("snapshot_num_ASC"),

    SNAPSHOT_NUM_DESC("snapshot_num_DESC"),

    UNIQUE_LOGICAL_SIZE_ASC("unique_logical_size_ASC"),

    UNIQUE_LOGICAL_SIZE_DESC("unique_logical_size_DESC"),

    UNIQUE_SIZE_ASC("unique_size_ASC"),

    UNIQUE_SIZE_DESC("unique_size_DESC"),

    NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM("NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NfsInodeOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NfsInodeOrderByInput fromValue(String value) {
        for (NfsInodeOrderByInput b : NfsInodeOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NfsInodeOrderByInput.NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NfsInodeOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NfsInodeOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NfsInodeOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NfsInodeOrderByInput.fromValue(value);
        }
    }
}
