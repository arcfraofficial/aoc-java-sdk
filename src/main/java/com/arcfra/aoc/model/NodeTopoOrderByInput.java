package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NodeTopoOrderByInput */
@JsonAdapter(NodeTopoOrderByInput.Adapter.class)
public enum NodeTopoOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    POSITION_ASC("position_ASC"),

    POSITION_DESC("position_DESC"),

    NODETOPOORDERBYINPUT_UNSUPPORTED_ENUM("NODETOPOORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NodeTopoOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NodeTopoOrderByInput fromValue(String value) {
        for (NodeTopoOrderByInput b : NodeTopoOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NodeTopoOrderByInput.NODETOPOORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NodeTopoOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NodeTopoOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NodeTopoOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NodeTopoOrderByInput.fromValue(value);
        }
    }
}
