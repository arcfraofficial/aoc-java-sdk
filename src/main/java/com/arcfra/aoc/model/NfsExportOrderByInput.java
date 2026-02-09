package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NfsExportOrderByInput */
@JsonAdapter(NfsExportOrderByInput.Adapter.class)
public enum NfsExportOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EC_K_ASC("ec_k_ASC"),

    EC_K_DESC("ec_k_DESC"),

    EC_M_ASC("ec_m_ASC"),

    EC_M_DESC("ec_m_DESC"),

    ENCRYPT_METHOD_ASC("encrypt_method_ASC"),

    ENCRYPT_METHOD_DESC("encrypt_method_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXPORT_INODE_ID_ASC("export_inode_id_ASC"),

    EXPORT_INODE_ID_DESC("export_inode_id_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    IP_WHITELIST_ASC("ip_whitelist_ASC"),

    IP_WHITELIST_DESC("ip_whitelist_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRIORITIZED_ASC("prioritized_ASC"),

    PRIORITIZED_DESC("prioritized_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    RESILIENCY_TYPE_ASC("resiliency_type_ASC"),

    RESILIENCY_TYPE_DESC("resiliency_type_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    NFSEXPORTORDERBYINPUT_UNSUPPORTED_ENUM("NFSEXPORTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NfsExportOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NfsExportOrderByInput fromValue(String value) {
        for (NfsExportOrderByInput b : NfsExportOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NfsExportOrderByInput.NFSEXPORTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NfsExportOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NfsExportOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NfsExportOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NfsExportOrderByInput.fromValue(value);
        }
    }
}
