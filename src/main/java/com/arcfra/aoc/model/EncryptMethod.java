package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EncryptMethod */
@JsonAdapter(EncryptMethod.Adapter.class)
public enum EncryptMethod {
    AES256_CTR("AES256_CTR"),

    PLAIN_TEXT("PLAIN_TEXT"),

    ENCRYPTMETHOD_UNSUPPORTED_ENUM("ENCRYPTMETHOD_UNSUPPORTED_ENUM");
    private String value;

    EncryptMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EncryptMethod fromValue(String value) {
        for (EncryptMethod b : EncryptMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EncryptMethod.ENCRYPTMETHOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EncryptMethod> {
        @Override
        public void write(final JsonWriter jsonWriter, final EncryptMethod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EncryptMethod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EncryptMethod.fromValue(value);
        }
    }
}
