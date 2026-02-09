package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets RegistryServiceUsage */
@JsonAdapter(RegistryServiceUsage.Adapter.class)
public enum RegistryServiceUsage {
    SKS("SKS"),

    USER("USER"),

    REGISTRYSERVICEUSAGE_UNSUPPORTED_ENUM("REGISTRYSERVICEUSAGE_UNSUPPORTED_ENUM");
    private String value;

    RegistryServiceUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RegistryServiceUsage fromValue(String value) {
        for (RegistryServiceUsage b : RegistryServiceUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return RegistryServiceUsage.REGISTRYSERVICEUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<RegistryServiceUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final RegistryServiceUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RegistryServiceUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RegistryServiceUsage.fromValue(value);
        }
    }
}
