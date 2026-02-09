package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AlertRuleObject */
@JsonAdapter(AlertRuleObject.Adapter.class)
public enum AlertRuleObject {
    BRICK("BRICK"),

    CLUSTER("CLUSTER"),

    DISK("DISK"),

    DISK_POOL("DISK_POOL"),

    HYPERVISOR("HYPERVISOR"),

    NETWORK("NETWORK"),

    NTP_SERVER("NTP_SERVER"),

    OBSERVABILITY_CONNECTED_SYSTEM_SERVICE("OBSERVABILITY_CONNECTED_SYSTEM_SERVICE"),

    OBSERVABILITY_SERVICE("OBSERVABILITY_SERVICE"),

    PHYSICAL_HOST("PHYSICAL_HOST"),

    POD("POD"),

    SCVM("SCVM"),

    SKS_CLUSTER("SKS_CLUSTER"),

    SKS_CLUSTER_NODE("SKS_CLUSTER_NODE"),

    SKS_PV("SKS_PV"),

    SKS_PVC("SKS_PVC"),

    SKS_REGISTRY("SKS_REGISTRY"),

    SKS_SERVICE("SKS_SERVICE"),

    SNAPSHOT_PLAN("SNAPSHOT_PLAN"),

    STORAGE_CHUNK("STORAGE_CHUNK"),

    STORAGE_POOL("STORAGE_POOL"),

    SYSTEM_SERVICE("SYSTEM_SERVICE"),

    TIME_MACHINE_PLAN("TIME_MACHINE_PLAN"),

    VM("VM"),

    WITNESS("WITNESS"),

    WITNESS_NETWORK("WITNESS_NETWORK"),

    ZBS_ZONE("ZBS_ZONE"),

    ALERTRULEOBJECT_UNSUPPORTED_ENUM("ALERTRULEOBJECT_UNSUPPORTED_ENUM");
    private String value;

    AlertRuleObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlertRuleObject fromValue(String value) {
        for (AlertRuleObject b : AlertRuleObject.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AlertRuleObject.ALERTRULEOBJECT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AlertRuleObject> {
        @Override
        public void write(final JsonWriter jsonWriter, final AlertRuleObject enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AlertRuleObject read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AlertRuleObject.fromValue(value);
        }
    }
}
