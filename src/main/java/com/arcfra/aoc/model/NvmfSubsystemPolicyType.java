package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NvmfSubsystemPolicyType */
@JsonAdapter(NvmfSubsystemPolicyType.Adapter.class)
public enum NvmfSubsystemPolicyType {
    BALANCE("BALANCE"),

    INHERIT("INHERIT"),

    NVMFSUBSYSTEMPOLICYTYPE_UNSUPPORTED_ENUM("NVMFSUBSYSTEMPOLICYTYPE_UNSUPPORTED_ENUM");
    private String value;

    NvmfSubsystemPolicyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NvmfSubsystemPolicyType fromValue(String value) {
        for (NvmfSubsystemPolicyType b : NvmfSubsystemPolicyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NvmfSubsystemPolicyType.NVMFSUBSYSTEMPOLICYTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NvmfSubsystemPolicyType> {
        @Override
        public void write(final JsonWriter jsonWriter, final NvmfSubsystemPolicyType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NvmfSubsystemPolicyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NvmfSubsystemPolicyType.fromValue(value);
        }
    }
}
