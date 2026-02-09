package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CloudTowerApplicationPackageOrderByInput */
@JsonAdapter(CloudTowerApplicationPackageOrderByInput.Adapter.class)
public enum CloudTowerApplicationPackageOrderByInput {
    ARCHITECTURE_ASC("architecture_ASC"),

    ARCHITECTURE_DESC("architecture_DESC"),

    CONTAINERS_ASC("containers_ASC"),

    CONTAINERS_DESC("containers_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IMAGES_ASC("images_ASC"),

    IMAGES_DESC("images_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SCOSVERSION_ASC("scosVersion_ASC"),

    SCOSVERSION_DESC("scosVersion_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    CLOUDTOWERAPPLICATIONPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM(
            "CLOUDTOWERAPPLICATIONPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    CloudTowerApplicationPackageOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CloudTowerApplicationPackageOrderByInput fromValue(String value) {
        for (CloudTowerApplicationPackageOrderByInput b :
                CloudTowerApplicationPackageOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return CloudTowerApplicationPackageOrderByInput
                .CLOUDTOWERAPPLICATIONPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<CloudTowerApplicationPackageOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final CloudTowerApplicationPackageOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CloudTowerApplicationPackageOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return CloudTowerApplicationPackageOrderByInput.fromValue(value);
        }
    }
}
