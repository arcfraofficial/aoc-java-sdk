package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmStatus */
@JsonAdapter(VmStatus.Adapter.class)
public enum VmStatus {
    DELETED("DELETED"),

    RUNNING("RUNNING"),

    STOPPED("STOPPED"),

    SUSPENDED("SUSPENDED"),

    UNKNOWN("UNKNOWN"),

    VMSTATUS_UNSUPPORTED_ENUM("VMSTATUS_UNSUPPORTED_ENUM");
    private String value;

    VmStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmStatus fromValue(String value) {
        for (VmStatus b : VmStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmStatus.VMSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmStatus.fromValue(value);
        }
    }
}
