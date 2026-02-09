package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets FailoverShutdownMode */
@JsonAdapter(FailoverShutdownMode.Adapter.class)
public enum FailoverShutdownMode {
    NONE("NONE"),

    POWEROFF("POWEROFF"),

    SHUTDOWN("SHUTDOWN"),

    SHUTDOWNWITHPOWEROFF("SHUTDOWNWITHPOWEROFF"),

    FAILOVERSHUTDOWNMODE_UNSUPPORTED_ENUM("FAILOVERSHUTDOWNMODE_UNSUPPORTED_ENUM");
    private String value;

    FailoverShutdownMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FailoverShutdownMode fromValue(String value) {
        for (FailoverShutdownMode b : FailoverShutdownMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return FailoverShutdownMode.FAILOVERSHUTDOWNMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<FailoverShutdownMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final FailoverShutdownMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FailoverShutdownMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FailoverShutdownMode.fromValue(value);
        }
    }
}
