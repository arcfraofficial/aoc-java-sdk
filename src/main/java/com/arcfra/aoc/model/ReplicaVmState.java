package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicaVmState */
@JsonAdapter(ReplicaVmState.Adapter.class)
public enum ReplicaVmState {
    FAILBACK("FAILBACK"),

    FAILOVER("FAILOVER"),

    FAILOVER_TEST("FAILOVER_TEST"),

    NOT_READY("NOT_READY"),

    PERMANENT_FAILOVER("PERMANENT_FAILOVER"),

    READY("READY"),

    REPLICATING("REPLICATING"),

    REPLICAVMSTATE_UNSUPPORTED_ENUM("REPLICAVMSTATE_UNSUPPORTED_ENUM");
    private String value;

    ReplicaVmState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicaVmState fromValue(String value) {
        for (ReplicaVmState b : ReplicaVmState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicaVmState.REPLICAVMSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicaVmState> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicaVmState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicaVmState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicaVmState.fromValue(value);
        }
    }
}
