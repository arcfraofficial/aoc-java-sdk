package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AlertRuleOrderByInput */
@JsonAdapter(AlertRuleOrderByInput.Adapter.class)
public enum AlertRuleOrderByInput {
    CUSTOMIZED_ASC("customized_ASC"),

    CUSTOMIZED_DESC("customized_DESC"),

    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    THRESHOLDS_ASC("thresholds_ASC"),

    THRESHOLDS_DESC("thresholds_DESC"),

    ALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM("ALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    AlertRuleOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlertRuleOrderByInput fromValue(String value) {
        for (AlertRuleOrderByInput b : AlertRuleOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AlertRuleOrderByInput.ALERTRULEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AlertRuleOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final AlertRuleOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AlertRuleOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AlertRuleOrderByInput.fromValue(value);
        }
    }
}
