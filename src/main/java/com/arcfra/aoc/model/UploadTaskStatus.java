package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UploadTaskStatus */
@JsonAdapter(UploadTaskStatus.Adapter.class)
public enum UploadTaskStatus {
    FAILED("FAILED"),

    INITIALIZING("INITIALIZING"),

    PAUSED("PAUSED"),

    SUCCESSED("SUCCESSED"),

    UPLOADING("UPLOADING"),

    UPLOADTASKSTATUS_UNSUPPORTED_ENUM("UPLOADTASKSTATUS_UNSUPPORTED_ENUM");
    private String value;

    UploadTaskStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UploadTaskStatus fromValue(String value) {
        for (UploadTaskStatus b : UploadTaskStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UploadTaskStatus.UPLOADTASKSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UploadTaskStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final UploadTaskStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UploadTaskStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UploadTaskStatus.fromValue(value);
        }
    }
}
