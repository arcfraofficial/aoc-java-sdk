package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReportResourceInputEnum */
@JsonAdapter(ReportResourceInputEnum.Adapter.class)
public enum ReportResourceInputEnum {
    ALERT("ALERT"),

    ALL("ALL"),

    CLUSTER("CLUSTER"),

    DATA_CENTER("DATA_CENTER"),

    DISK("DISK"),

    ELF_IMAGE("ELF_IMAGE"),

    ENTITY_FILTERS("ENTITY_FILTERS"),

    GLOBAL_ALERT_RULE("GLOBAL_ALERT_RULE"),

    HOST("HOST"),

    TASK("TASK"),

    VDS("VDS"),

    VLAN("VLAN"),

    VM("VM"),

    VM_TEMPLATE("VM_TEMPLATE"),

    REPORTRESOURCEINPUTENUM_UNSUPPORTED_ENUM("REPORTRESOURCEINPUTENUM_UNSUPPORTED_ENUM");
    private String value;

    ReportResourceInputEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportResourceInputEnum fromValue(String value) {
        for (ReportResourceInputEnum b : ReportResourceInputEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReportResourceInputEnum.REPORTRESOURCEINPUTENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReportResourceInputEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReportResourceInputEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReportResourceInputEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReportResourceInputEnum.fromValue(value);
        }
    }
}
