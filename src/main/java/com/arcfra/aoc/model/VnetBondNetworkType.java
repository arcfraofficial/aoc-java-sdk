package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VnetBondNetworkType */
@JsonAdapter(VnetBondNetworkType.Adapter.class)
public enum VnetBondNetworkType {
    VLAN("VLAN"),

    VPC("VPC"),

    VNETBONDNETWORKTYPE_UNSUPPORTED_ENUM("VNETBONDNETWORKTYPE_UNSUPPORTED_ENUM");
    private String value;

    VnetBondNetworkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VnetBondNetworkType fromValue(String value) {
        for (VnetBondNetworkType b : VnetBondNetworkType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VnetBondNetworkType.VNETBONDNETWORKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VnetBondNetworkType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VnetBondNetworkType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VnetBondNetworkType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VnetBondNetworkType.fromValue(value);
        }
    }
}
