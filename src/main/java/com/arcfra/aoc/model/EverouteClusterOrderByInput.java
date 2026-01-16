package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EverouteClusterOrderByInput */
@JsonAdapter(EverouteClusterOrderByInput.Adapter.class)
public enum EverouteClusterOrderByInput {
    CONTROLLER_INSTANCES_ASC("controller_instances_ASC"),

    CONTROLLER_INSTANCES_DESC("controller_instances_DESC"),

    CONTROLLER_TEMPLATE_ASC("controller_template_ASC"),

    CONTROLLER_TEMPLATE_DESC("controller_template_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    GLOBAL_DEFAULT_ACTION_ASC("global_default_action_ASC"),

    GLOBAL_DEFAULT_ACTION_DESC("global_default_action_DESC"),

    GLOBAL_WHITELIST_ASC("global_whitelist_ASC"),

    GLOBAL_WHITELIST_DESC("global_whitelist_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INSTALLED_ASC("installed_ASC"),

    INSTALLED_DESC("installed_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PHASE_ASC("phase_ASC"),

    PHASE_DESC("phase_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    EVEROUTECLUSTERORDERBYINPUT_UNSUPPORTED_ENUM("EVEROUTECLUSTERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    EverouteClusterOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EverouteClusterOrderByInput fromValue(String value) {
        for (EverouteClusterOrderByInput b : EverouteClusterOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EverouteClusterOrderByInput.EVEROUTECLUSTERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EverouteClusterOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final EverouteClusterOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EverouteClusterOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EverouteClusterOrderByInput.fromValue(value);
        }
    }
}
