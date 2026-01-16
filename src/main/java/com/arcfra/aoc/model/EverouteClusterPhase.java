package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EverouteClusterPhase */
@JsonAdapter(EverouteClusterPhase.Adapter.class)
public enum EverouteClusterPhase {
    ASSOCIATED("Associated"),

    FAILED("Failed"),

    INIT("Init"),

    RUNNING("Running"),

    TERMINATING("Terminating"),

    UPDATING("Updating"),

    UPGRADING("Upgrading"),

    EVEROUTECLUSTERPHASE_UNSUPPORTED_ENUM("EVEROUTECLUSTERPHASE_UNSUPPORTED_ENUM");
    private String value;

    EverouteClusterPhase(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EverouteClusterPhase fromValue(String value) {
        for (EverouteClusterPhase b : EverouteClusterPhase.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EverouteClusterPhase.EVEROUTECLUSTERPHASE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EverouteClusterPhase> {
        @Override
        public void write(final JsonWriter jsonWriter, final EverouteClusterPhase enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EverouteClusterPhase read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EverouteClusterPhase.fromValue(value);
        }
    }
}
