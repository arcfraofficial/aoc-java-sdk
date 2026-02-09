package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationServiceOrderByInput */
@JsonAdapter(ReplicationServiceOrderByInput.Adapter.class)
public enum ReplicationServiceOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    KUBE_CONFIG_ASC("kube_config_ASC"),

    KUBE_CONFIG_DESC("kube_config_DESC"),

    MANAGEMENT_NETWORK_ASC("management_network_ASC"),

    MANAGEMENT_NETWORK_DESC("management_network_DESC"),

    MAX_FAILBACK_JOBS_ASC("max_failback_jobs_ASC"),

    MAX_FAILBACK_JOBS_DESC("max_failback_jobs_DESC"),

    MAX_FAILBACK_SPEED_LIMIT_ASC("max_failback_speed_limit_ASC"),

    MAX_FAILBACK_SPEED_LIMIT_DESC("max_failback_speed_limit_DESC"),

    MAX_REPLICATION_JOBS_ASC("max_replication_jobs_ASC"),

    MAX_REPLICATION_JOBS_DESC("max_replication_jobs_DESC"),

    MAX_REPLICATION_SPEED_LIMIT_ASC("max_replication_speed_limit_ASC"),

    MAX_REPLICATION_SPEED_LIMIT_DESC("max_replication_speed_limit_DESC"),

    MAX_RETRY_TIMES_ASC("max_retry_times_ASC"),

    MAX_RETRY_TIMES_DESC("max_retry_times_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    REPLICATION_CLUSTERS_DESCRIPTOR_ASC("replication_clusters_descriptor_ASC"),

    REPLICATION_CLUSTERS_DESCRIPTOR_DESC("replication_clusters_descriptor_DESC"),

    REPLICATION_NETWORK_ASC("replication_network_ASC"),

    REPLICATION_NETWORK_DESC("replication_network_DESC"),

    RETRY_INTERVAL_ASC("retry_interval_ASC"),

    RETRY_INTERVAL_DESC("retry_interval_DESC"),

    STORAGE_NETWORK_ASC("storage_network_ASC"),

    STORAGE_NETWORK_DESC("storage_network_DESC"),

    UPDATEDAT_ASC("updatedAt_ASC"),

    UPDATEDAT_DESC("updatedAt_DESC"),

    REPLICATIONSERVICEORDERBYINPUT_UNSUPPORTED_ENUM(
            "REPLICATIONSERVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ReplicationServiceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationServiceOrderByInput fromValue(String value) {
        for (ReplicationServiceOrderByInput b : ReplicationServiceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationServiceOrderByInput.REPLICATIONSERVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationServiceOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ReplicationServiceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationServiceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationServiceOrderByInput.fromValue(value);
        }
    }
}
