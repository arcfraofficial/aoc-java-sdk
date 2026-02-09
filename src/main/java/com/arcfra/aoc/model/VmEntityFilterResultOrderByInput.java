package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmEntityFilterResultOrderByInput */
@JsonAdapter(VmEntityFilterResultOrderByInput.Adapter.class)
public enum VmEntityFilterResultOrderByInput {
    ASC("id_ASC"),

    DESC("id_DESC"),

    VMENTITYFILTERRESULTORDERBYINPUT_UNSUPPORTED_ENUM(
            "VMENTITYFILTERRESULTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmEntityFilterResultOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmEntityFilterResultOrderByInput fromValue(String value) {
        for (VmEntityFilterResultOrderByInput b : VmEntityFilterResultOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmEntityFilterResultOrderByInput.VMENTITYFILTERRESULTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmEntityFilterResultOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VmEntityFilterResultOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmEntityFilterResultOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VmEntityFilterResultOrderByInput.fromValue(value);
        }
    }
}
