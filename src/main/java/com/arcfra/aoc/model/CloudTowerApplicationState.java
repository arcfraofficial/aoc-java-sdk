package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CloudTowerApplicationState */
@JsonAdapter(CloudTowerApplicationState.Adapter.class)
public enum CloudTowerApplicationState {
    CONFIGURE_FAILED("CONFIGURE_FAILED"),

    CONFIGURING("CONFIGURING"),

    ERROR("ERROR"),

    INSTALLING("INSTALLING"),

    INSTALL_FAILED("INSTALL_FAILED"),

    RUNNING("RUNNING"),

    SCALE_FAILED("SCALE_FAILED"),

    SCALING("SCALING"),

    TERMINATE_FAILED("TERMINATE_FAILED"),

    TERMINATING("TERMINATING"),

    UPGRADE_FAILED("UPGRADE_FAILED"),

    UPGRADING("UPGRADING"),

    CLOUDTOWERAPPLICATIONSTATE_UNSUPPORTED_ENUM("CLOUDTOWERAPPLICATIONSTATE_UNSUPPORTED_ENUM");
    private String value;

    CloudTowerApplicationState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CloudTowerApplicationState fromValue(String value) {
        for (CloudTowerApplicationState b : CloudTowerApplicationState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return CloudTowerApplicationState.CLOUDTOWERAPPLICATIONSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<CloudTowerApplicationState> {
        @Override
        public void write(final JsonWriter jsonWriter, final CloudTowerApplicationState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CloudTowerApplicationState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CloudTowerApplicationState.fromValue(value);
        }
    }
}
