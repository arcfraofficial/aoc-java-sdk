package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ElfStoragePolicyOrderByInput */
@JsonAdapter(ElfStoragePolicyOrderByInput.Adapter.class)
public enum ElfStoragePolicyOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    STRIPE_NUM_ASC("stripe_num_ASC"),

    STRIPE_NUM_DESC("stripe_num_DESC"),

    STRIPE_SIZE_ASC("stripe_size_ASC"),

    STRIPE_SIZE_DESC("stripe_size_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    ELFSTORAGEPOLICYORDERBYINPUT_UNSUPPORTED_ENUM("ELFSTORAGEPOLICYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ElfStoragePolicyOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ElfStoragePolicyOrderByInput fromValue(String value) {
        for (ElfStoragePolicyOrderByInput b : ElfStoragePolicyOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ElfStoragePolicyOrderByInput.ELFSTORAGEPOLICYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ElfStoragePolicyOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ElfStoragePolicyOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ElfStoragePolicyOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ElfStoragePolicyOrderByInput.fromValue(value);
        }
    }
}
