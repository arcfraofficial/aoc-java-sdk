package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets FilterRuleAggregationEnum */
@JsonAdapter(FilterRuleAggregationEnum.Adapter.class)
public enum FilterRuleAggregationEnum {
    AVG("AVG"),

    MAX("MAX"),

    MIN("MIN"),

    QUANTILE("QUANTILE"),

    SUM("SUM"),

    FILTERRULEAGGREGATIONENUM_UNSUPPORTED_ENUM("FILTERRULEAGGREGATIONENUM_UNSUPPORTED_ENUM");
    private String value;

    FilterRuleAggregationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FilterRuleAggregationEnum fromValue(String value) {
        for (FilterRuleAggregationEnum b : FilterRuleAggregationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return FilterRuleAggregationEnum.FILTERRULEAGGREGATIONENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<FilterRuleAggregationEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final FilterRuleAggregationEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FilterRuleAggregationEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FilterRuleAggregationEnum.fromValue(value);
        }
    }
}
