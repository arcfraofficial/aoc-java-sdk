package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IsolationPolicyOrderByInput */
@JsonAdapter(IsolationPolicyOrderByInput.Adapter.class)
public enum IsolationPolicyOrderByInput {
    EGRESS_ASC("egress_ASC"),

    EGRESS_DESC("egress_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INGRESS_ASC("ingress_ASC"),

    INGRESS_DESC("ingress_DESC"),

    MODE_ASC("mode_ASC"),

    MODE_DESC("mode_DESC"),

    ISOLATIONPOLICYORDERBYINPUT_UNSUPPORTED_ENUM("ISOLATIONPOLICYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    IsolationPolicyOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IsolationPolicyOrderByInput fromValue(String value) {
        for (IsolationPolicyOrderByInput b : IsolationPolicyOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IsolationPolicyOrderByInput.ISOLATIONPOLICYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IsolationPolicyOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final IsolationPolicyOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IsolationPolicyOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IsolationPolicyOrderByInput.fromValue(value);
        }
    }
}
