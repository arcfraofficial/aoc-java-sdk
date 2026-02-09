package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ElfDataStoreOrderByInput */
@JsonAdapter(ElfDataStoreOrderByInput.Adapter.class)
public enum ElfDataStoreOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EXTERNAL_USE_ASC("external_use_ASC"),

    EXTERNAL_USE_DESC("external_use_DESC"),

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

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    ELFDATASTOREORDERBYINPUT_UNSUPPORTED_ENUM("ELFDATASTOREORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ElfDataStoreOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ElfDataStoreOrderByInput fromValue(String value) {
        for (ElfDataStoreOrderByInput b : ElfDataStoreOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ElfDataStoreOrderByInput.ELFDATASTOREORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ElfDataStoreOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ElfDataStoreOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ElfDataStoreOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ElfDataStoreOrderByInput.fromValue(value);
        }
    }
}
