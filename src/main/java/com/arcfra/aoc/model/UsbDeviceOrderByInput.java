package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UsbDeviceOrderByInput */
@JsonAdapter(UsbDeviceOrderByInput.Adapter.class)
public enum UsbDeviceOrderByInput {
    BINDED_ASC("binded_ASC"),

    BINDED_DESC("binded_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MANUFACTURER_ASC("manufacturer_ASC"),

    MANUFACTURER_DESC("manufacturer_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    USB_TYPE_ASC("usb_type_ASC"),

    USB_TYPE_DESC("usb_type_DESC"),

    USBDEVICEORDERBYINPUT_UNSUPPORTED_ENUM("USBDEVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    UsbDeviceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UsbDeviceOrderByInput fromValue(String value) {
        for (UsbDeviceOrderByInput b : UsbDeviceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UsbDeviceOrderByInput.USBDEVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UsbDeviceOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final UsbDeviceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UsbDeviceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UsbDeviceOrderByInput.fromValue(value);
        }
    }
}
