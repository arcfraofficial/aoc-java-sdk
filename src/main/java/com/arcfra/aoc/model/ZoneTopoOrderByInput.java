package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ZoneTopoOrderByInput */
@JsonAdapter(ZoneTopoOrderByInput.Adapter.class)
public enum ZoneTopoOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    ZONETOPOORDERBYINPUT_UNSUPPORTED_ENUM("ZONETOPOORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ZoneTopoOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ZoneTopoOrderByInput fromValue(String value) {
        for (ZoneTopoOrderByInput b : ZoneTopoOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ZoneTopoOrderByInput.ZONETOPOORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ZoneTopoOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ZoneTopoOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ZoneTopoOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ZoneTopoOrderByInput.fromValue(value);
        }
    }
}
