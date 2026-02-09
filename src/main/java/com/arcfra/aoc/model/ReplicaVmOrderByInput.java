package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicaVmOrderByInput */
@JsonAdapter(ReplicaVmOrderByInput.Adapter.class)
public enum ReplicaVmOrderByInput {
    CREATEDAT_ASC("createdAt_ASC"),

    CREATEDAT_DESC("createdAt_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FAILOVER_TEST_OBJECT_DESCRIPTOR_ASC("failover_test_object_descriptor_ASC"),

    FAILOVER_TEST_OBJECT_DESCRIPTOR_DESC("failover_test_object_descriptor_DESC"),

    FAILOVER_TEST_REPLICA_GROUP_ASC("failover_test_replica_group_ASC"),

    FAILOVER_TEST_REPLICA_GROUP_DESC("failover_test_replica_group_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INBOUND_ASC("inbound_ASC"),

    INBOUND_DESC("inbound_DESC"),

    OBJECT_DESCRIPTOR_ASC("object_descriptor_ASC"),

    OBJECT_DESCRIPTOR_DESC("object_descriptor_DESC"),

    ORIGIN_OBJECT_DESCRIPTOR_ASC("origin_object_descriptor_ASC"),

    ORIGIN_OBJECT_DESCRIPTOR_DESC("origin_object_descriptor_DESC"),

    ORIGIN_VM_CLUSTER_LOCAL_ID_ASC("origin_vm_cluster_local_id_ASC"),

    ORIGIN_VM_CLUSTER_LOCAL_ID_DESC("origin_vm_cluster_local_id_DESC"),

    ORIGIN_VM_CLUSTER_NAME_ASC("origin_vm_cluster_name_ASC"),

    ORIGIN_VM_CLUSTER_NAME_DESC("origin_vm_cluster_name_DESC"),

    ORIGIN_VM_LOCAL_ID_ASC("origin_vm_local_id_ASC"),

    ORIGIN_VM_LOCAL_ID_DESC("origin_vm_local_id_DESC"),

    ORIGIN_VM_NAME_ASC("origin_vm_name_ASC"),

    ORIGIN_VM_NAME_DESC("origin_vm_name_DESC"),

    REPLICA_GROUP_ASC("replica_group_ASC"),

    REPLICA_GROUP_DESC("replica_group_DESC"),

    REPLICATION_GROUP_ASC("replication_group_ASC"),

    REPLICATION_GROUP_DESC("replication_group_DESC"),

    STATE_ASC("state_ASC"),

    STATE_DESC("state_DESC"),

    TARGETS_DELETABLE_ASC("targets_deletable_ASC"),

    TARGETS_DELETABLE_DESC("targets_deletable_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UPDATEDAT_ASC("updatedAt_ASC"),

    UPDATEDAT_DESC("updatedAt_DESC"),

    REPLICAVMORDERBYINPUT_UNSUPPORTED_ENUM("REPLICAVMORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ReplicaVmOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicaVmOrderByInput fromValue(String value) {
        for (ReplicaVmOrderByInput b : ReplicaVmOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicaVmOrderByInput.REPLICAVMORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicaVmOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicaVmOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicaVmOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicaVmOrderByInput.fromValue(value);
        }
    }
}
