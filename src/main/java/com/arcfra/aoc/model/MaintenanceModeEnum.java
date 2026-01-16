package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MaintenanceModeEnum */
@JsonAdapter(MaintenanceModeEnum.Adapter.class)
public enum MaintenanceModeEnum {
    ENTERING_MAINTENANCE_MODE("ENTERING_MAINTENANCE_MODE"),

    IN_USE("IN_USE"),

    MAINTENANCE_MODE("MAINTENANCE_MODE"),

    REMOVING("REMOVING"),

    MAINTENANCEMODEENUM_UNSUPPORTED_ENUM("MAINTENANCEMODEENUM_UNSUPPORTED_ENUM");
    private String value;

    MaintenanceModeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MaintenanceModeEnum fromValue(String value) {
        for (MaintenanceModeEnum b : MaintenanceModeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MaintenanceModeEnum.MAINTENANCEMODEENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MaintenanceModeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final MaintenanceModeEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MaintenanceModeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MaintenanceModeEnum.fromValue(value);
        }
    }
}
