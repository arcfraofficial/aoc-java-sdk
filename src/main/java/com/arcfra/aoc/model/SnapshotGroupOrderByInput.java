package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotGroupOrderByInput */
@JsonAdapter(SnapshotGroupOrderByInput.Adapter.class)
public enum SnapshotGroupOrderByInput {
    DELETED_ASC("deleted_ASC"),

    DELETED_DESC("deleted_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ESTIMATED_RECYCLING_TIME_ASC("estimated_recycling_time_ASC"),

    ESTIMATED_RECYCLING_TIME_DESC("estimated_recycling_time_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    KEEP_ASC("keep_ASC"),

    KEEP_DESC("keep_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOGICAL_SIZE_BYTES_ASC("logical_size_bytes_ASC"),

    LOGICAL_SIZE_BYTES_DESC("logical_size_bytes_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    OBJECT_NUM_ASC("object_num_ASC"),

    OBJECT_NUM_DESC("object_num_DESC"),

    VM_INFO_ASC("vm_info_ASC"),

    VM_INFO_DESC("vm_info_DESC"),

    SNAPSHOTGROUPORDERBYINPUT_UNSUPPORTED_ENUM("SNAPSHOTGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SnapshotGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotGroupOrderByInput fromValue(String value) {
        for (SnapshotGroupOrderByInput b : SnapshotGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotGroupOrderByInput.SNAPSHOTGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotGroupOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnapshotGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotGroupOrderByInput.fromValue(value);
        }
    }
}
