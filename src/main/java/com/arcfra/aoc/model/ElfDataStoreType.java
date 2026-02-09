package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ElfDataStoreType */
@JsonAdapter(ElfDataStoreType.Adapter.class)
public enum ElfDataStoreType {
    ISCSI("ISCSI"),

    NFS("NFS"),

    NVME("NVMe"),

    ELFDATASTORETYPE_UNSUPPORTED_ENUM("ELFDATASTORETYPE_UNSUPPORTED_ENUM");
    private String value;

    ElfDataStoreType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ElfDataStoreType fromValue(String value) {
        for (ElfDataStoreType b : ElfDataStoreType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ElfDataStoreType.ELFDATASTORETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ElfDataStoreType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ElfDataStoreType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ElfDataStoreType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ElfDataStoreType.fromValue(value);
        }
    }
}
