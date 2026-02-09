package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ClusterImageOrderByInput */
@JsonAdapter(ClusterImageOrderByInput.Adapter.class)
public enum ClusterImageOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    META_NAME_ASC("meta_name_ASC"),

    META_NAME_DESC("meta_name_DESC"),

    META_SIZE_ASC("meta_size_ASC"),

    META_SIZE_DESC("meta_size_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    UPGRADE_TOOL_VERSION_ASC("upgrade_tool_version_ASC"),

    UPGRADE_TOOL_VERSION_DESC("upgrade_tool_version_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    ZBS_VERSION_ASC("zbs_version_ASC"),

    ZBS_VERSION_DESC("zbs_version_DESC"),

    CLUSTERIMAGEORDERBYINPUT_UNSUPPORTED_ENUM("CLUSTERIMAGEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ClusterImageOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClusterImageOrderByInput fromValue(String value) {
        for (ClusterImageOrderByInput b : ClusterImageOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ClusterImageOrderByInput.CLUSTERIMAGEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ClusterImageOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ClusterImageOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ClusterImageOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ClusterImageOrderByInput.fromValue(value);
        }
    }
}
