package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VlanOrderByInput */
@JsonAdapter(VlanOrderByInput.Adapter.class)
public enum VlanOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    GATEWAY_IP_ASC("gateway_ip_ASC"),

    GATEWAY_IP_DESC("gateway_ip_DESC"),

    GATEWAY_SUBNETMASK_ASC("gateway_subnetmask_ASC"),

    GATEWAY_SUBNETMASK_DESC("gateway_subnetmask_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MODE_TYPE_ASC("mode_type_ASC"),

    MODE_TYPE_DESC("mode_type_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    QOS_BURST_ASC("qos_burst_ASC"),

    QOS_BURST_DESC("qos_burst_DESC"),

    QOS_MAX_BANDWIDTH_ASC("qos_max_bandwidth_ASC"),

    QOS_MAX_BANDWIDTH_DESC("qos_max_bandwidth_DESC"),

    QOS_MIN_BANDWIDTH_ASC("qos_min_bandwidth_ASC"),

    QOS_MIN_BANDWIDTH_DESC("qos_min_bandwidth_DESC"),

    QOS_PRIORITY_ASC("qos_priority_ASC"),

    QOS_PRIORITY_DESC("qos_priority_DESC"),

    SUBNETMASK_ASC("subnetmask_ASC"),

    SUBNETMASK_DESC("subnetmask_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VLAN_ID_ASC("vlan_id_ASC"),

    VLAN_ID_DESC("vlan_id_DESC"),

    VLANORDERBYINPUT_UNSUPPORTED_ENUM("VLANORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VlanOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VlanOrderByInput fromValue(String value) {
        for (VlanOrderByInput b : VlanOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VlanOrderByInput.VLANORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VlanOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VlanOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VlanOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VlanOrderByInput.fromValue(value);
        }
    }
}
