package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BrickTopoOrderByInput */
@JsonAdapter(BrickTopoOrderByInput.Adapter.class)
public enum BrickTopoOrderByInput {
    CAPACITY_ASC("capacity_ASC"),

    CAPACITY_DESC("capacity_DESC"),

    DISK_LAYOUT_ASC("disk_layout_ASC"),

    DISK_LAYOUT_DESC("disk_layout_DESC"),

    HEIGHT_ASC("height_ASC"),

    HEIGHT_DESC("height_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    POSITION_ASC("position_ASC"),

    POSITION_DESC("position_DESC"),

    POWER_LAYOUT_ASC("power_layout_ASC"),

    POWER_LAYOUT_DESC("power_layout_DESC"),

    POWER_POSITION_ASC("power_position_ASC"),

    POWER_POSITION_DESC("power_position_DESC"),

    POWERS_ASC("powers_ASC"),

    POWERS_DESC("powers_DESC"),

    TAG_POSITION_IN_BRICK_ASC("tag_position_in_brick_ASC"),

    TAG_POSITION_IN_BRICK_DESC("tag_position_in_brick_DESC"),

    BRICKTOPOORDERBYINPUT_UNSUPPORTED_ENUM("BRICKTOPOORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BrickTopoOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrickTopoOrderByInput fromValue(String value) {
        for (BrickTopoOrderByInput b : BrickTopoOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BrickTopoOrderByInput.BRICKTOPOORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BrickTopoOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final BrickTopoOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BrickTopoOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BrickTopoOrderByInput.fromValue(value);
        }
    }
}
