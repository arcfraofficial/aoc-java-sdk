package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReportTaskOrderByInput */
@JsonAdapter(ReportTaskOrderByInput.Adapter.class)
public enum ReportTaskOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PLAN_ID_ASC("plan_id_ASC"),

    PLAN_ID_DESC("plan_id_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    REPORTTASKORDERBYINPUT_UNSUPPORTED_ENUM("REPORTTASKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ReportTaskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTaskOrderByInput fromValue(String value) {
        for (ReportTaskOrderByInput b : ReportTaskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReportTaskOrderByInput.REPORTTASKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReportTaskOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReportTaskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReportTaskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReportTaskOrderByInput.fromValue(value);
        }
    }
}
