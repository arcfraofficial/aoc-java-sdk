package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmNicType */
@JsonAdapter(VmNicType.Adapter.class)
public enum VmNicType {
    VLAN("VLAN"),

    VPC("VPC"),

    VMNICTYPE_UNSUPPORTED_ENUM("VMNICTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmNicType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmNicType fromValue(String value) {
        for (VmNicType b : VmNicType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmNicType.VMNICTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmNicType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmNicType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmNicType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmNicType.fromValue(value);
        }
    }
}
