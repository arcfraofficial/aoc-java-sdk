package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EverouteLicensePricingType */
@JsonAdapter(EverouteLicensePricingType.Adapter.class)
public enum EverouteLicensePricingType {
    CPU_SLOT_NUM("CPU_SLOT_NUM"),

    VM_NUM("VM_NUM"),

    EVEROUTELICENSEPRICINGTYPE_UNSUPPORTED_ENUM("EVEROUTELICENSEPRICINGTYPE_UNSUPPORTED_ENUM");
    private String value;

    EverouteLicensePricingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EverouteLicensePricingType fromValue(String value) {
        for (EverouteLicensePricingType b : EverouteLicensePricingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EverouteLicensePricingType.EVEROUTELICENSEPRICINGTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EverouteLicensePricingType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EverouteLicensePricingType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EverouteLicensePricingType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EverouteLicensePricingType.fromValue(value);
        }
    }
}
