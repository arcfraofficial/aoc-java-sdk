package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ClusterType */
@JsonAdapter(ClusterType.Adapter.class)
public enum ClusterType {
    BLUESHARK("BLUESHARK"),

    SMTX_ELF("SMTX_ELF"),

    SMTX_OS("SMTX_OS"),

    SMTX_ZBS("SMTX_ZBS"),

    CLUSTERTYPE_UNSUPPORTED_ENUM("CLUSTERTYPE_UNSUPPORTED_ENUM");
    private String value;

    ClusterType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClusterType fromValue(String value) {
        for (ClusterType b : ClusterType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ClusterType.CLUSTERTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ClusterType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ClusterType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ClusterType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ClusterType.fromValue(value);
        }
    }
}
