package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MetroCheckStatusEnum */
@JsonAdapter(MetroCheckStatusEnum.Adapter.class)
public enum MetroCheckStatusEnum {
    CRITICAL("CRITICAL"),

    HEALTHY("HEALTHY"),

    INFO("INFO"),

    NOTICE("NOTICE"),

    METROCHECKSTATUSENUM_UNSUPPORTED_ENUM("METROCHECKSTATUSENUM_UNSUPPORTED_ENUM");
    private String value;

    MetroCheckStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MetroCheckStatusEnum fromValue(String value) {
        for (MetroCheckStatusEnum b : MetroCheckStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MetroCheckStatusEnum.METROCHECKSTATUSENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MetroCheckStatusEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final MetroCheckStatusEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MetroCheckStatusEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MetroCheckStatusEnum.fromValue(value);
        }
    }
}
