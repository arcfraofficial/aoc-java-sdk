package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReportTemplateOrderByInput */
@JsonAdapter(ReportTemplateOrderByInput.Adapter.class)
public enum ReportTemplateOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EXECUTE_PLAN_ASC("execute_plan_ASC"),

    EXECUTE_PLAN_DESC("execute_plan_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRESET_ASC("preset_ASC"),

    PRESET_DESC("preset_DESC"),

    RESOURCE_META_ASC("resource_meta_ASC"),

    RESOURCE_META_DESC("resource_meta_DESC"),

    TASK_NUM_ASC("task_num_ASC"),

    TASK_NUM_DESC("task_num_DESC"),

    REPORTTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM("REPORTTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ReportTemplateOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTemplateOrderByInput fromValue(String value) {
        for (ReportTemplateOrderByInput b : ReportTemplateOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReportTemplateOrderByInput.REPORTTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReportTemplateOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReportTemplateOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReportTemplateOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReportTemplateOrderByInput.fromValue(value);
        }
    }
}
