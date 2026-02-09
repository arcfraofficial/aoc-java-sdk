package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AlertRuleUnit */
@JsonAdapter(AlertRuleUnit.Adapter.class)
public enum AlertRuleUnit {
    BIT("BIT"),

    BYTE("BYTE"),

    BYTE_PER_SECOND("BYTE_PER_SECOND"),

    CELSIUS("CELSIUS"),

    HERTZ("HERTZ"),

    MICROSECOND("MICROSECOND"),

    MILLISECOND("MILLISECOND"),

    NANOSECOND("NANOSECOND"),

    PERCENT("PERCENT"),

    SECOND("SECOND"),

    UNIT_UNSPECIFIED("UNIT_UNSPECIFIED"),

    ALERTRULEUNIT_UNSUPPORTED_ENUM("ALERTRULEUNIT_UNSUPPORTED_ENUM");
    private String value;

    AlertRuleUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlertRuleUnit fromValue(String value) {
        for (AlertRuleUnit b : AlertRuleUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AlertRuleUnit.ALERTRULEUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AlertRuleUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final AlertRuleUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AlertRuleUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AlertRuleUnit.fromValue(value);
        }
    }
}
