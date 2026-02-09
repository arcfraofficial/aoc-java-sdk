package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ViewOrderByInput */
@JsonAdapter(ViewOrderByInput.Adapter.class)
public enum ViewOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    TIME_SPAN_ASC("time_span_ASC"),

    TIME_SPAN_DESC("time_span_DESC"),

    TIME_UNIT_ASC("time_unit_ASC"),

    TIME_UNIT_DESC("time_unit_DESC"),

    VIEWORDERBYINPUT_UNSUPPORTED_ENUM("VIEWORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ViewOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ViewOrderByInput fromValue(String value) {
        for (ViewOrderByInput b : ViewOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ViewOrderByInput.VIEWORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ViewOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ViewOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ViewOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ViewOrderByInput.fromValue(value);
        }
    }
}
