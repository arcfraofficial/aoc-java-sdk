package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets WeekdayTypeEnum */
@JsonAdapter(WeekdayTypeEnum.Adapter.class)
public enum WeekdayTypeEnum {
    FRI("FRI"),

    MON("MON"),

    SAT("SAT"),

    SUN("SUN"),

    THU("THU"),

    TUE("TUE"),

    WED("WED"),

    WEEKDAYTYPEENUM_UNSUPPORTED_ENUM("WEEKDAYTYPEENUM_UNSUPPORTED_ENUM");
    private String value;

    WeekdayTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WeekdayTypeEnum fromValue(String value) {
        for (WeekdayTypeEnum b : WeekdayTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return WeekdayTypeEnum.WEEKDAYTYPEENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<WeekdayTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final WeekdayTypeEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public WeekdayTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return WeekdayTypeEnum.fromValue(value);
        }
    }
}
