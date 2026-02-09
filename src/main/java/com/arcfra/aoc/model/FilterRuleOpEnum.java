package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets FilterRuleOpEnum */
@JsonAdapter(FilterRuleOpEnum.Adapter.class)
public enum FilterRuleOpEnum {
    GT("GT"),

    GTE("GTE"),

    LT("LT"),

    LTE("LTE"),

    FILTERRULEOPENUM_UNSUPPORTED_ENUM("FILTERRULEOPENUM_UNSUPPORTED_ENUM");
    private String value;

    FilterRuleOpEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FilterRuleOpEnum fromValue(String value) {
        for (FilterRuleOpEnum b : FilterRuleOpEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return FilterRuleOpEnum.FILTERRULEOPENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<FilterRuleOpEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final FilterRuleOpEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FilterRuleOpEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FilterRuleOpEnum.fromValue(value);
        }
    }
}
