package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ClusterConnectorErrorCode */
@JsonAdapter(ClusterConnectorErrorCode.Adapter.class)
public enum ClusterConnectorErrorCode {
    FAILED("LOAD_CLUSTER_FAILED"),

    NETWORK_ERROR("LOAD_CLUSTER_NETWORK_ERROR"),

    NOT_FOUND("LOAD_CLUSTER_NOT_FOUND"),

    UNAUTHORIZED("LOAD_CLUSTER_UNAUTHORIZED"),

    UNHEALTHY("LOAD_CLUSTER_UNHEALTHY"),

    CLUSTERCONNECTORERRORCODE_UNSUPPORTED_ENUM("CLUSTERCONNECTORERRORCODE_UNSUPPORTED_ENUM");
    private String value;

    ClusterConnectorErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClusterConnectorErrorCode fromValue(String value) {
        for (ClusterConnectorErrorCode b : ClusterConnectorErrorCode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ClusterConnectorErrorCode.CLUSTERCONNECTORERRORCODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ClusterConnectorErrorCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final ClusterConnectorErrorCode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ClusterConnectorErrorCode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ClusterConnectorErrorCode.fromValue(value);
        }
    }
}
