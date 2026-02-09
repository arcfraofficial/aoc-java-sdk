package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GlobalAlertRuleOrderByInput */
@JsonAdapter(GlobalAlertRuleOrderByInput.Adapter.class)
public enum GlobalAlertRuleOrderByInput {
    BOOLEAN_ASC("boolean_ASC"),

    BOOLEAN_DESC("boolean_DESC"),

    CAUSE_ASC("cause_ASC"),

    CAUSE_DESC("cause_DESC"),

    DEFAULT_THRESHOLDS_ASC("default_thresholds_ASC"),

    DEFAULT_THRESHOLDS_DESC("default_thresholds_DESC"),

    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IMPACT_ASC("impact_ASC"),

    IMPACT_DESC("impact_DESC"),

    MESSAGE_ASC("message_ASC"),

    MESSAGE_DESC("message_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    OBJECT_ASC("object_ASC"),

    OBJECT_DESC("object_DESC"),

    OPERATOR_ASC("operator_ASC"),

    OPERATOR_DESC("operator_DESC"),

    SOLUTION_ASC("solution_ASC"),

    SOLUTION_DESC("solution_DESC"),

    THRESHOLDS_ASC("thresholds_ASC"),

    THRESHOLDS_DESC("thresholds_DESC"),

    UNIT_ASC("unit_ASC"),

    UNIT_DESC("unit_DESC"),

    GLOBALALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM("GLOBALALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    GlobalAlertRuleOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GlobalAlertRuleOrderByInput fromValue(String value) {
        for (GlobalAlertRuleOrderByInput b : GlobalAlertRuleOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GlobalAlertRuleOrderByInput.GLOBALALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GlobalAlertRuleOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final GlobalAlertRuleOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GlobalAlertRuleOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GlobalAlertRuleOrderByInput.fromValue(value);
        }
    }
}
