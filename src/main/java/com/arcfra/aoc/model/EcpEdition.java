package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EcpEdition */
@JsonAdapter(EcpEdition.Adapter.class)
public enum EcpEdition {
    ADVANCED("ECP_ADVANCED"),

    ESSENTIAL("ECP_ESSENTIAL"),

    STANDARD("ECP_STANDARD"),

    VDI_ESSENTIAL("ECP_VDI_ESSENTIAL"),

    ECPEDITION_UNSUPPORTED_ENUM("ECPEDITION_UNSUPPORTED_ENUM");
    private String value;

    EcpEdition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EcpEdition fromValue(String value) {
        for (EcpEdition b : EcpEdition.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EcpEdition.ECPEDITION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EcpEdition> {
        @Override
        public void write(final JsonWriter jsonWriter, final EcpEdition enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EcpEdition read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EcpEdition.fromValue(value);
        }
    }
}
