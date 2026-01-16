package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets Bus */
@JsonAdapter(Bus.Adapter.class)
public enum Bus {
    IDE("IDE"),

    SCSI("SCSI"),

    USB("USB"),

    VIRTIO("VIRTIO"),

    BUS_UNSUPPORTED_ENUM("BUS_UNSUPPORTED_ENUM");
    private String value;

    Bus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Bus fromValue(String value) {
        for (Bus b : Bus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return Bus.BUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<Bus> {
        @Override
        public void write(final JsonWriter jsonWriter, final Bus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Bus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Bus.fromValue(value);
        }
    }
}
