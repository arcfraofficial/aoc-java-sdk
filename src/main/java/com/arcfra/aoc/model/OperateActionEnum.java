package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets OperateActionEnum */
@JsonAdapter(OperateActionEnum.Adapter.class)
public enum OperateActionEnum {
    POWEROFF("poweroff"),

    REBOOT("reboot"),

    OPERATEACTIONENUM_UNSUPPORTED_ENUM("OPERATEACTIONENUM_UNSUPPORTED_ENUM");
    private String value;

    OperateActionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperateActionEnum fromValue(String value) {
        for (OperateActionEnum b : OperateActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return OperateActionEnum.OPERATEACTIONENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<OperateActionEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final OperateActionEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OperateActionEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OperateActionEnum.fromValue(value);
        }
    }
}
