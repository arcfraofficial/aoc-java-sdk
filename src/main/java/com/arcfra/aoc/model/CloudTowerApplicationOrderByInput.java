package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CloudTowerApplicationOrderByInput */
@JsonAdapter(CloudTowerApplicationOrderByInput.Adapter.class)
public enum CloudTowerApplicationOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INSTANCESTATUSES_ASC("instanceStatuses_ASC"),

    INSTANCESTATUSES_DESC("instanceStatuses_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PLACEMENTSITUATION_ASC("placementSituation_ASC"),

    PLACEMENTSITUATION_DESC("placementSituation_DESC"),

    PLACEMENTVERB_ASC("placementVerb_ASC"),

    PLACEMENTVERB_DESC("placementVerb_DESC"),

    RESOURCEVERSION_ASC("resourceVersion_ASC"),

    RESOURCEVERSION_DESC("resourceVersion_DESC"),

    STATE_ASC("state_ASC"),

    STATE_DESC("state_DESC"),

    TARGETPACKAGE_ASC("targetPackage_ASC"),

    TARGETPACKAGE_DESC("targetPackage_DESC"),

    VMSPEC_ASC("vmSpec_ASC"),

    VMSPEC_DESC("vmSpec_DESC"),

    CLOUDTOWERAPPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM(
            "CLOUDTOWERAPPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    CloudTowerApplicationOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CloudTowerApplicationOrderByInput fromValue(String value) {
        for (CloudTowerApplicationOrderByInput b : CloudTowerApplicationOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return CloudTowerApplicationOrderByInput.CLOUDTOWERAPPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<CloudTowerApplicationOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final CloudTowerApplicationOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CloudTowerApplicationOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return CloudTowerApplicationOrderByInput.fromValue(value);
        }
    }
}
