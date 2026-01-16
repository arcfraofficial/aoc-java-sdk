package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudRouteNextHopType */
@JsonAdapter(VirtualPrivateCloudRouteNextHopType.Adapter.class)
public enum VirtualPrivateCloudRouteNextHopType {
    NAT_GATEWAY("NAT_GATEWAY"),

    ROUTER_GATEWAY("ROUTER_GATEWAY"),

    UNKNOWN("UNKNOWN"),

    VPC_PEERING("VPC_PEERING"),

    VIRTUALPRIVATECLOUDROUTENEXTHOPTYPE_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDROUTENEXTHOPTYPE_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudRouteNextHopType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudRouteNextHopType fromValue(String value) {
        for (VirtualPrivateCloudRouteNextHopType b : VirtualPrivateCloudRouteNextHopType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudRouteNextHopType
                .VIRTUALPRIVATECLOUDROUTENEXTHOPTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudRouteNextHopType> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VirtualPrivateCloudRouteNextHopType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudRouteNextHopType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudRouteNextHopType.fromValue(value);
        }
    }
}
