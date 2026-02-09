package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BrickPhaseEnum */
@JsonAdapter(BrickPhaseEnum.Adapter.class)
public enum BrickPhaseEnum {
    BACKWARD("BACKWARD"),

    FORWARD("FORWARD"),

    BRICKPHASEENUM_UNSUPPORTED_ENUM("BRICKPHASEENUM_UNSUPPORTED_ENUM");
    private String value;

    BrickPhaseEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrickPhaseEnum fromValue(String value) {
        for (BrickPhaseEnum b : BrickPhaseEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BrickPhaseEnum.BRICKPHASEENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BrickPhaseEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final BrickPhaseEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BrickPhaseEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BrickPhaseEnum.fromValue(value);
        }
    }
}
