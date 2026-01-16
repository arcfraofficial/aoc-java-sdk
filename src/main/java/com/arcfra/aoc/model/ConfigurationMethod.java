package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ConfigurationMethod */
@JsonAdapter(ConfigurationMethod.Adapter.class)
public enum ConfigurationMethod {
    BUSINESS_HOST("BUSINESS_HOST"),

    MANUAL("MANUAL"),

    CONFIGURATIONMETHOD_UNSUPPORTED_ENUM("CONFIGURATIONMETHOD_UNSUPPORTED_ENUM");
    private String value;

    ConfigurationMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConfigurationMethod fromValue(String value) {
        for (ConfigurationMethod b : ConfigurationMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ConfigurationMethod.CONFIGURATIONMETHOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ConfigurationMethod> {
        @Override
        public void write(final JsonWriter jsonWriter, final ConfigurationMethod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ConfigurationMethod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ConfigurationMethod.fromValue(value);
        }
    }
}
