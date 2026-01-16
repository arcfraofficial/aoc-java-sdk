package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ElfImageOrderByInput */
@JsonAdapter(ElfImageOrderByInput.Adapter.class)
public enum ElfImageOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PATH_ASC("path_ASC"),

    PATH_DESC("path_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    ELFIMAGEORDERBYINPUT_UNSUPPORTED_ENUM("ELFIMAGEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ElfImageOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ElfImageOrderByInput fromValue(String value) {
        for (ElfImageOrderByInput b : ElfImageOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ElfImageOrderByInput.ELFIMAGEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ElfImageOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ElfImageOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ElfImageOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ElfImageOrderByInput.fromValue(value);
        }
    }
}
