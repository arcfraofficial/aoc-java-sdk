package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SecurityPolicyFlowControlType */
@JsonAdapter(SecurityPolicyFlowControlType.Adapter.class)
public enum SecurityPolicyFlowControlType {
    ALL("ALL"),

    SECURITYPOLICYFLOWCONTROLTYPE_UNSUPPORTED_ENUM(
            "SECURITYPOLICYFLOWCONTROLTYPE_UNSUPPORTED_ENUM");
    private String value;

    SecurityPolicyFlowControlType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SecurityPolicyFlowControlType fromValue(String value) {
        for (SecurityPolicyFlowControlType b : SecurityPolicyFlowControlType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SecurityPolicyFlowControlType.SECURITYPOLICYFLOWCONTROLTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SecurityPolicyFlowControlType> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final SecurityPolicyFlowControlType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SecurityPolicyFlowControlType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SecurityPolicyFlowControlType.fromValue(value);
        }
    }
}
