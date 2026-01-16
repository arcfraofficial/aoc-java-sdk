package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UsbDeviceStatus */
@JsonAdapter(UsbDeviceStatus.Adapter.class)
public enum UsbDeviceStatus {
    EJECTED("EJECTED"),

    NORMAL("NORMAL"),

    USBDEVICESTATUS_UNSUPPORTED_ENUM("USBDEVICESTATUS_UNSUPPORTED_ENUM");
    private String value;

    UsbDeviceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UsbDeviceStatus fromValue(String value) {
        for (UsbDeviceStatus b : UsbDeviceStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UsbDeviceStatus.USBDEVICESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UsbDeviceStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final UsbDeviceStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UsbDeviceStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UsbDeviceStatus.fromValue(value);
        }
    }
}
