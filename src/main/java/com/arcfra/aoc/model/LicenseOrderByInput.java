package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets LicenseOrderByInput */
@JsonAdapter(LicenseOrderByInput.Adapter.class)
public enum LicenseOrderByInput {
    EXPIRE_DATE_ASC("expire_date_ASC"),

    EXPIRE_DATE_DESC("expire_date_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LICENSE_SERIAL_ASC("license_serial_ASC"),

    LICENSE_SERIAL_DESC("license_serial_DESC"),

    MAINTENANCE_END_DATE_ASC("maintenance_end_date_ASC"),

    MAINTENANCE_END_DATE_DESC("maintenance_end_date_DESC"),

    MAINTENANCE_START_DATE_ASC("maintenance_start_date_ASC"),

    MAINTENANCE_START_DATE_DESC("maintenance_start_date_DESC"),

    MAX_CHUNK_NUM_ASC("max_chunk_num_ASC"),

    MAX_CHUNK_NUM_DESC("max_chunk_num_DESC"),

    MAX_CLUSTER_NUM_ASC("max_cluster_num_ASC"),

    MAX_CLUSTER_NUM_DESC("max_cluster_num_DESC"),

    SIGN_DATE_ASC("sign_date_ASC"),

    SIGN_DATE_DESC("sign_date_DESC"),

    SOFTWARE_EDITION_ASC("software_edition_ASC"),

    SOFTWARE_EDITION_DESC("software_edition_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    LICENSEORDERBYINPUT_UNSUPPORTED_ENUM("LICENSEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    LicenseOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LicenseOrderByInput fromValue(String value) {
        for (LicenseOrderByInput b : LicenseOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return LicenseOrderByInput.LICENSEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<LicenseOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final LicenseOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LicenseOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LicenseOrderByInput.fromValue(value);
        }
    }
}
