package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ObservabilityConnectedSystemServiceType */
@JsonAdapter(ObservabilityConnectedSystemServiceType.Adapter.class)
public enum ObservabilityConnectedSystemServiceType {
    BACKUP_SERVICE("BACKUP_SERVICE"),

    CLOUDTOWER("CLOUDTOWER"),

    EVEROUTE_SERVICE("EVEROUTE_SERVICE"),

    OBSERVABILITY_SERVICE("OBSERVABILITY_SERVICE"),

    REPLICATION_SERVICE("REPLICATION_SERVICE"),

    SFS_SERVICE("SFS_SERVICE"),

    SKS_SERVICE("SKS_SERVICE"),

    OBSERVABILITYCONNECTEDSYSTEMSERVICETYPE_UNSUPPORTED_ENUM(
            "OBSERVABILITYCONNECTEDSYSTEMSERVICETYPE_UNSUPPORTED_ENUM");
    private String value;

    ObservabilityConnectedSystemServiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObservabilityConnectedSystemServiceType fromValue(String value) {
        for (ObservabilityConnectedSystemServiceType b :
                ObservabilityConnectedSystemServiceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ObservabilityConnectedSystemServiceType
                .OBSERVABILITYCONNECTEDSYSTEMSERVICETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ObservabilityConnectedSystemServiceType> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final ObservabilityConnectedSystemServiceType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ObservabilityConnectedSystemServiceType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return ObservabilityConnectedSystemServiceType.fromValue(value);
        }
    }
}
