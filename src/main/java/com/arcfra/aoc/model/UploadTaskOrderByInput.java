package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UploadTaskOrderByInput */
@JsonAdapter(UploadTaskOrderByInput.Adapter.class)
public enum UploadTaskOrderByInput {
    ARGS_ASC("args_ASC"),

    ARGS_DESC("args_DESC"),

    CHUNK_SIZE_ASC("chunk_size_ASC"),

    CHUNK_SIZE_DESC("chunk_size_DESC"),

    CURRENT_CHUNK_ASC("current_chunk_ASC"),

    CURRENT_CHUNK_DESC("current_chunk_DESC"),

    FINISHED_AT_ASC("finished_at_ASC"),

    FINISHED_AT_DESC("finished_at_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    RESOURCE_TYPE_ASC("resource_type_ASC"),

    RESOURCE_TYPE_DESC("resource_type_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    STARTED_AT_ASC("started_at_ASC"),

    STARTED_AT_DESC("started_at_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    UPDATEDAT_ASC("updatedAt_ASC"),

    UPDATEDAT_DESC("updatedAt_DESC"),

    UPLOADTASKORDERBYINPUT_UNSUPPORTED_ENUM("UPLOADTASKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    UploadTaskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UploadTaskOrderByInput fromValue(String value) {
        for (UploadTaskOrderByInput b : UploadTaskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UploadTaskOrderByInput.UPLOADTASKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UploadTaskOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final UploadTaskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UploadTaskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UploadTaskOrderByInput.fromValue(value);
        }
    }
}
