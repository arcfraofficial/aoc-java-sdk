package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GlobalPolicyAction */
@JsonAdapter(GlobalPolicyAction.Adapter.class)
public enum GlobalPolicyAction {
    ALLOW("ALLOW"),

    DROP("DROP"),

    GLOBALPOLICYACTION_UNSUPPORTED_ENUM("GLOBALPOLICYACTION_UNSUPPORTED_ENUM");
    private String value;

    GlobalPolicyAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GlobalPolicyAction fromValue(String value) {
        for (GlobalPolicyAction b : GlobalPolicyAction.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GlobalPolicyAction.GLOBALPOLICYACTION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GlobalPolicyAction> {
        @Override
        public void write(final JsonWriter jsonWriter, final GlobalPolicyAction enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GlobalPolicyAction read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GlobalPolicyAction.fromValue(value);
        }
    }
}
