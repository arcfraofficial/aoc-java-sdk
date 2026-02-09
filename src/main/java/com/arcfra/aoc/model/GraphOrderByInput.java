package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GraphOrderByInput */
@JsonAdapter(GraphOrderByInput.Adapter.class)
public enum GraphOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    METRIC_COUNT_ASC("metric_count_ASC"),

    METRIC_COUNT_DESC("metric_count_DESC"),

    METRIC_NAME_ASC("metric_name_ASC"),

    METRIC_NAME_DESC("metric_name_DESC"),

    METRIC_TYPE_ASC("metric_type_ASC"),

    METRIC_TYPE_DESC("metric_type_DESC"),

    NETWORK_ASC("network_ASC"),

    NETWORK_DESC("network_DESC"),

    RESOURCE_TYPE_ASC("resource_type_ASC"),

    RESOURCE_TYPE_DESC("resource_type_DESC"),

    SERVICE_ASC("service_ASC"),

    SERVICE_DESC("service_DESC"),

    TARGETS_ASC("targets_ASC"),

    TARGETS_DESC("targets_DESC"),

    TITLE_ASC("title_ASC"),

    TITLE_DESC("title_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    GRAPHORDERBYINPUT_UNSUPPORTED_ENUM("GRAPHORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    GraphOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GraphOrderByInput fromValue(String value) {
        for (GraphOrderByInput b : GraphOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GraphOrderByInput.GRAPHORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GraphOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final GraphOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GraphOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GraphOrderByInput.fromValue(value);
        }
    }
}
