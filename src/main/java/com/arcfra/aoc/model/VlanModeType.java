package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VlanModeType */
@JsonAdapter(VlanModeType.Adapter.class)
public enum VlanModeType {
    GENEVE("GENEVE"),

    VLAN_ACCESS("VLAN_ACCESS"),

    VLAN_TRUNK("VLAN_TRUNK"),

    VXLAN("VXLAN"),

    VLANMODETYPE_UNSUPPORTED_ENUM("VLANMODETYPE_UNSUPPORTED_ENUM");
    private String value;

    VlanModeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VlanModeType fromValue(String value) {
        for (VlanModeType b : VlanModeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VlanModeType.VLANMODETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VlanModeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VlanModeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VlanModeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VlanModeType.fromValue(value);
        }
    }
}
