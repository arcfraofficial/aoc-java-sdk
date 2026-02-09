package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotPlanOrderByInput */
@JsonAdapter(SnapshotPlanOrderByInput.Adapter.class)
public enum SnapshotPlanOrderByInput {
    AUTO_DELETE_NUM_ASC("auto_delete_num_ASC"),

    AUTO_DELETE_NUM_DESC("auto_delete_num_DESC"),

    AUTO_EXECUTE_NUM_ASC("auto_execute_num_ASC"),

    AUTO_EXECUTE_NUM_DESC("auto_execute_num_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    END_TIME_ASC("end_time_ASC"),

    END_TIME_DESC("end_time_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXEC_H_M_ASC("exec_h_m_ASC"),

    EXEC_H_M_DESC("exec_h_m_DESC"),

    EXECUTE_PLAN_TYPE_ASC("execute_plan_type_ASC"),

    EXECUTE_PLAN_TYPE_DESC("execute_plan_type_DESC"),

    HEALTHY_ASC("healthy_ASC"),

    HEALTHY_DESC("healthy_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LAST_EXECUTE_END_TIME_ASC("last_execute_end_time_ASC"),

    LAST_EXECUTE_END_TIME_DESC("last_execute_end_time_DESC"),

    LAST_EXECUTE_STATUS_ASC("last_execute_status_ASC"),

    LAST_EXECUTE_STATUS_DESC("last_execute_status_DESC"),

    LAST_EXECUTE_TIME_ASC("last_execute_time_ASC"),

    LAST_EXECUTE_TIME_DESC("last_execute_time_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOGICAL_SIZE_BYTES_ASC("logical_size_bytes_ASC"),

    LOGICAL_SIZE_BYTES_DESC("logical_size_bytes_DESC"),

    MANUAL_DELETE_NUM_ASC("manual_delete_num_ASC"),

    MANUAL_DELETE_NUM_DESC("manual_delete_num_DESC"),

    MANUAL_EXECUTE_NUM_ASC("manual_execute_num_ASC"),

    MANUAL_EXECUTE_NUM_DESC("manual_execute_num_DESC"),

    MIRROR_ASC("mirror_ASC"),

    MIRROR_DESC("mirror_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NEXT_EXECUTE_TIME_ASC("next_execute_time_ASC"),

    NEXT_EXECUTE_TIME_DESC("next_execute_time_DESC"),

    OBJECT_NUM_ASC("object_num_ASC"),

    OBJECT_NUM_DESC("object_num_DESC"),

    PHYSICAL_SIZE_BYTES_ASC("physical_size_bytes_ASC"),

    PHYSICAL_SIZE_BYTES_DESC("physical_size_bytes_DESC"),

    REMAIN_SNAPSHOT_NUM_ASC("remain_snapshot_num_ASC"),

    REMAIN_SNAPSHOT_NUM_DESC("remain_snapshot_num_DESC"),

    SNAPSHOT_GROUP_NUM_ASC("snapshot_group_num_ASC"),

    SNAPSHOT_GROUP_NUM_DESC("snapshot_group_num_DESC"),

    START_TIME_ASC("start_time_ASC"),

    START_TIME_DESC("start_time_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    SNAPSHOTPLANORDERBYINPUT_UNSUPPORTED_ENUM("SNAPSHOTPLANORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SnapshotPlanOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotPlanOrderByInput fromValue(String value) {
        for (SnapshotPlanOrderByInput b : SnapshotPlanOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotPlanOrderByInput.SNAPSHOTPLANORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotPlanOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnapshotPlanOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotPlanOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotPlanOrderByInput.fromValue(value);
        }
    }
}
