package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DisassociateSystemServiceFromObsServiceResultType */
@JsonAdapter(DisassociateSystemServiceFromObsServiceResultType.Adapter.class)
public enum DisassociateSystemServiceFromObsServiceResultType {
    FAIL("FAIL"),

    SUCCESS("SUCCESS"),

    DISASSOCIATESYSTEMSERVICEFROMOBSSERVICERESULTTYPE_UNSUPPORTED_ENUM(
            "DISASSOCIATESYSTEMSERVICEFROMOBSSERVICERESULTTYPE_UNSUPPORTED_ENUM");
    private String value;

    DisassociateSystemServiceFromObsServiceResultType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DisassociateSystemServiceFromObsServiceResultType fromValue(String value) {
        for (DisassociateSystemServiceFromObsServiceResultType b :
                DisassociateSystemServiceFromObsServiceResultType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DisassociateSystemServiceFromObsServiceResultType
                .DISASSOCIATESYSTEMSERVICEFROMOBSSERVICERESULTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter
            extends TypeAdapter<DisassociateSystemServiceFromObsServiceResultType> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final DisassociateSystemServiceFromObsServiceResultType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DisassociateSystemServiceFromObsServiceResultType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return DisassociateSystemServiceFromObsServiceResultType.fromValue(value);
        }
    }
}
