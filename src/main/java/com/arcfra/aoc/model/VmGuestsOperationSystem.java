package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmGuestsOperationSystem */
@JsonAdapter(VmGuestsOperationSystem.Adapter.class)
public enum VmGuestsOperationSystem {
    LINUX("LINUX"),

    UNKNOWN("UNKNOWN"),

    WINDOWS("WINDOWS"),

    VMGUESTSOPERATIONSYSTEM_UNSUPPORTED_ENUM("VMGUESTSOPERATIONSYSTEM_UNSUPPORTED_ENUM");
    private String value;

    VmGuestsOperationSystem(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmGuestsOperationSystem fromValue(String value) {
        for (VmGuestsOperationSystem b : VmGuestsOperationSystem.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmGuestsOperationSystem.VMGUESTSOPERATIONSYSTEM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmGuestsOperationSystem> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmGuestsOperationSystem enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmGuestsOperationSystem read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmGuestsOperationSystem.fromValue(value);
        }
    }
}
