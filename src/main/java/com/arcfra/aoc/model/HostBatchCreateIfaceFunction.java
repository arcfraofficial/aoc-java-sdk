package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostBatchCreateIfaceFunction */
@JsonAdapter(HostBatchCreateIfaceFunction.Adapter.class)
public enum HostBatchCreateIfaceFunction {
    ACCESS("ACCESS"),

    ERSPAN("ERSPAN"),

    MANAGEMENT("MANAGEMENT"),

    MIGRATION("MIGRATION"),

    STORAGE("STORAGE"),

    VMWARE_ACCESS("VMWARE_ACCESS"),

    HOSTBATCHCREATEIFACEFUNCTION_UNSUPPORTED_ENUM("HOSTBATCHCREATEIFACEFUNCTION_UNSUPPORTED_ENUM");
    private String value;

    HostBatchCreateIfaceFunction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostBatchCreateIfaceFunction fromValue(String value) {
        for (HostBatchCreateIfaceFunction b : HostBatchCreateIfaceFunction.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostBatchCreateIfaceFunction.HOSTBATCHCREATEIFACEFUNCTION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostBatchCreateIfaceFunction> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final HostBatchCreateIfaceFunction enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostBatchCreateIfaceFunction read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostBatchCreateIfaceFunction.fromValue(value);
        }
    }
}
