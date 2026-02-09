package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ClusterTopoOrderByInput */
@JsonAdapter(ClusterTopoOrderByInput.Adapter.class)
public enum ClusterTopoOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    CLUSTERTOPOORDERBYINPUT_UNSUPPORTED_ENUM("CLUSTERTOPOORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ClusterTopoOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClusterTopoOrderByInput fromValue(String value) {
        for (ClusterTopoOrderByInput b : ClusterTopoOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ClusterTopoOrderByInput.CLUSTERTOPOORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ClusterTopoOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ClusterTopoOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ClusterTopoOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ClusterTopoOrderByInput.fromValue(value);
        }
    }
}
