package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AlertOrderByInput */
@JsonAdapter(AlertOrderByInput.Adapter.class)
public enum AlertOrderByInput {
    CAUSE_ASC("cause_ASC"),

    CAUSE_DESC("cause_DESC"),

    CREATE_TIME_ASC("create_time_ASC"),

    CREATE_TIME_DESC("create_time_DESC"),

    ENDED_ASC("ended_ASC"),

    ENDED_DESC("ended_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IMPACT_ASC("impact_ASC"),

    IMPACT_DESC("impact_DESC"),

    LABELS_ASC("labels_ASC"),

    LABELS_DESC("labels_DESC"),

    LOCAL_CREATE_TIME_ASC("local_create_time_ASC"),

    LOCAL_CREATE_TIME_DESC("local_create_time_DESC"),

    LOCAL_END_TIME_ASC("local_end_time_ASC"),

    LOCAL_END_TIME_DESC("local_end_time_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOCAL_START_TIME_ASC("local_start_time_ASC"),

    LOCAL_START_TIME_DESC("local_start_time_DESC"),

    LOCAL_UPDATE_TIME_ASC("local_update_time_ASC"),

    LOCAL_UPDATE_TIME_DESC("local_update_time_DESC"),

    MESSAGE_ASC("message_ASC"),

    MESSAGE_DESC("message_DESC"),

    SEVERITY_ASC("severity_ASC"),

    SEVERITY_DESC("severity_DESC"),

    SOLUTION_ASC("solution_ASC"),

    SOLUTION_DESC("solution_DESC"),

    THRESHOLD_ASC("threshold_ASC"),

    THRESHOLD_DESC("threshold_DESC"),

    VALUE_ASC("value_ASC"),

    VALUE_DESC("value_DESC"),

    ALERTORDERBYINPUT_UNSUPPORTED_ENUM("ALERTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    AlertOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlertOrderByInput fromValue(String value) {
        for (AlertOrderByInput b : AlertOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AlertOrderByInput.ALERTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AlertOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final AlertOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AlertOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AlertOrderByInput.fromValue(value);
        }
    }
}
