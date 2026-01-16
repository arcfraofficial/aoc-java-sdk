package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmNicOrderByInput */
@JsonAdapter(VmNicOrderByInput.Adapter.class)
public enum VmNicOrderByInput {
    EGRESS_RATE_LIMIT_BURST_IN_BIT_ASC("egress_rate_limit_burst_in_bit_ASC"),

    EGRESS_RATE_LIMIT_BURST_IN_BIT_DESC("egress_rate_limit_burst_in_bit_DESC"),

    EGRESS_RATE_LIMIT_ENABLED_ASC("egress_rate_limit_enabled_ASC"),

    EGRESS_RATE_LIMIT_ENABLED_DESC("egress_rate_limit_enabled_DESC"),

    EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_ASC("egress_rate_limit_max_rate_in_bitps_ASC"),

    EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_DESC("egress_rate_limit_max_rate_in_bitps_DESC"),

    ENABLED_ASC("enabled_ASC"),

    ENABLED_DESC("enabled_DESC"),

    GATEWAY_ASC("gateway_ASC"),

    GATEWAY_DESC("gateway_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INGRESS_RATE_LIMIT_BURST_IN_BIT_ASC("ingress_rate_limit_burst_in_bit_ASC"),

    INGRESS_RATE_LIMIT_BURST_IN_BIT_DESC("ingress_rate_limit_burst_in_bit_DESC"),

    INGRESS_RATE_LIMIT_ENABLED_ASC("ingress_rate_limit_enabled_ASC"),

    INGRESS_RATE_LIMIT_ENABLED_DESC("ingress_rate_limit_enabled_DESC"),

    INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_ASC("ingress_rate_limit_max_rate_in_bitps_ASC"),

    INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_DESC("ingress_rate_limit_max_rate_in_bitps_DESC"),

    INTERFACE_ID_ASC("interface_id_ASC"),

    INTERFACE_ID_DESC("interface_id_DESC"),

    IP_ADDRESS_ASC("ip_address_ASC"),

    IP_ADDRESS_DESC("ip_address_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MAC_ADDRESS_ASC("mac_address_ASC"),

    MAC_ADDRESS_DESC("mac_address_DESC"),

    MIRROR_ASC("mirror_ASC"),

    MIRROR_DESC("mirror_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    ORDER_ASC("order_ASC"),

    ORDER_DESC("order_DESC"),

    SUBNET_MASK_ASC("subnet_mask_ASC"),

    SUBNET_MASK_DESC("subnet_mask_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VMNICORDERBYINPUT_UNSUPPORTED_ENUM("VMNICORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmNicOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmNicOrderByInput fromValue(String value) {
        for (VmNicOrderByInput b : VmNicOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmNicOrderByInput.VMNICORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmNicOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmNicOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmNicOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmNicOrderByInput.fromValue(value);
        }
    }
}
