package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EverouteFeatureType */
@JsonAdapter(EverouteFeatureType.Adapter.class)
public enum EverouteFeatureType {
    DFW("DFW"),

    LB("LB"),

    VPC("VPC"),

    EVEROUTEFEATURETYPE_UNSUPPORTED_ENUM("EVEROUTEFEATURETYPE_UNSUPPORTED_ENUM");
    private String value;

    EverouteFeatureType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EverouteFeatureType fromValue(String value) {
        for (EverouteFeatureType b : EverouteFeatureType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EverouteFeatureType.EVEROUTEFEATURETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EverouteFeatureType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EverouteFeatureType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EverouteFeatureType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EverouteFeatureType.fromValue(value);
        }
    }
}
