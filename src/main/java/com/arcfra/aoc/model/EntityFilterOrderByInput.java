package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EntityFilterOrderByInput */
@JsonAdapter(EntityFilterOrderByInput.Adapter.class)
public enum EntityFilterOrderByInput {
    APPLY_TO_ALL_CLUSTERS_ASC("apply_to_all_clusters_ASC"),

    APPLY_TO_ALL_CLUSTERS_DESC("apply_to_all_clusters_DESC"),

    ENTITY_TYPE_ASC("entity_type_ASC"),

    ENTITY_TYPE_DESC("entity_type_DESC"),

    FILTER_STATUS_ASC("filter_status_ASC"),

    FILTER_STATUS_DESC("filter_status_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LAST_EXECUTED_AT_ASC("last_executed_at_ASC"),

    LAST_EXECUTED_AT_DESC("last_executed_at_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRESET_ASC("preset_ASC"),

    PRESET_DESC("preset_DESC"),

    RULES_ASC("rules_ASC"),

    RULES_DESC("rules_DESC"),

    ENTITYFILTERORDERBYINPUT_UNSUPPORTED_ENUM("ENTITYFILTERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    EntityFilterOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityFilterOrderByInput fromValue(String value) {
        for (EntityFilterOrderByInput b : EntityFilterOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EntityFilterOrderByInput.ENTITYFILTERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EntityFilterOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final EntityFilterOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EntityFilterOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EntityFilterOrderByInput.fromValue(value);
        }
    }
}
