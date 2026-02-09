package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ExternalCloudTowerStatus */
@JsonAdapter(ExternalCloudTowerStatus.Adapter.class)
public enum ExternalCloudTowerStatus {
    CONNECTED("CONNECTED"),

    CONNECTING("CONNECTING"),

    DISCONNECTED("DISCONNECTED"),

    EXTERNALCLOUDTOWERSTATUS_UNSUPPORTED_ENUM("EXTERNALCLOUDTOWERSTATUS_UNSUPPORTED_ENUM");
    private String value;

    ExternalCloudTowerStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExternalCloudTowerStatus fromValue(String value) {
        for (ExternalCloudTowerStatus b : ExternalCloudTowerStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ExternalCloudTowerStatus.EXTERNALCLOUDTOWERSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ExternalCloudTowerStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ExternalCloudTowerStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ExternalCloudTowerStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ExternalCloudTowerStatus.fromValue(value);
        }
    }
}
