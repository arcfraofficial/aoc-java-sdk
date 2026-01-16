package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EveroutePackageOrderByInput */
@JsonAdapter(EveroutePackageOrderByInput.Adapter.class)
public enum EveroutePackageOrderByInput {
    ARCH_ASC("arch_ASC"),

    ARCH_DESC("arch_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PACKAGE_INFO_ASC("package_info_ASC"),

    PACKAGE_INFO_DESC("package_info_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    EVEROUTEPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM("EVEROUTEPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    EveroutePackageOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EveroutePackageOrderByInput fromValue(String value) {
        for (EveroutePackageOrderByInput b : EveroutePackageOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EveroutePackageOrderByInput.EVEROUTEPACKAGEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EveroutePackageOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final EveroutePackageOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EveroutePackageOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EveroutePackageOrderByInput.fromValue(value);
        }
    }
}
