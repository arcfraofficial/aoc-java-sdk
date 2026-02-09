package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets FilterRuleMetricEnum */
@JsonAdapter(FilterRuleMetricEnum.Adapter.class)
public enum FilterRuleMetricEnum {
    CPU_USAGE("VM_CPU_USAGE"),

    MEMORY_USAGE("VM_MEMORY_USAGE"),

    POWEROFF_DAYS("VM_POWEROFF_DAYS"),

    POWERON_DAYS("VM_POWERON_DAYS"),

    READWRITE_IO("VM_READWRITE_IO"),

    FILTERRULEMETRICENUM_UNSUPPORTED_ENUM("FILTERRULEMETRICENUM_UNSUPPORTED_ENUM");
    private String value;

    FilterRuleMetricEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FilterRuleMetricEnum fromValue(String value) {
        for (FilterRuleMetricEnum b : FilterRuleMetricEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return FilterRuleMetricEnum.FILTERRULEMETRICENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<FilterRuleMetricEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final FilterRuleMetricEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FilterRuleMetricEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FilterRuleMetricEnum.fromValue(value);
        }
    }
}
