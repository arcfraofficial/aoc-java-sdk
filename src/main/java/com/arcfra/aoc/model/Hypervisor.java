package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets Hypervisor */
@JsonAdapter(Hypervisor.Adapter.class)
public enum Hypervisor {
    BLUESHARK("BLUESHARK"),

    ELF("ELF"),

    VMWARE("VMWARE"),

    XENSERVER("XENSERVER"),

    HYPERVISOR_UNSUPPORTED_ENUM("HYPERVISOR_UNSUPPORTED_ENUM");
    private String value;

    Hypervisor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Hypervisor fromValue(String value) {
        for (Hypervisor b : Hypervisor.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return Hypervisor.HYPERVISOR_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<Hypervisor> {
        @Override
        public void write(final JsonWriter jsonWriter, final Hypervisor enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Hypervisor read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Hypervisor.fromValue(value);
        }
    }
}
