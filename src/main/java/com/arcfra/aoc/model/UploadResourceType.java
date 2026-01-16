package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UploadResourceType */
@JsonAdapter(UploadResourceType.Adapter.class)
public enum UploadResourceType {
    CLUSTER_IMAGE("CLUSTER_IMAGE"),

    CLUSTER_IMAGE_META("CLUSTER_IMAGE_META"),

    CONTENT_LIBRARY_IMAGE("CONTENT_LIBRARY_IMAGE"),

    ELF_IMAGE("ELF_IMAGE"),

    EVEROUTE_PACKAGE("EVEROUTE_PACKAGE"),

    HOST_PLUGIN_PACKAGE("HOST_PLUGIN_PACKAGE"),

    MONITOR_IMAGE("MONITOR_IMAGE"),

    OVF("OVF"),

    SVT_IMAGE("SVT_IMAGE"),

    VM_VOLUME_QCOW2("VM_VOLUME_QCOW2"),

    VM_VOLUME_RAW("VM_VOLUME_RAW"),

    VM_VOLUME_VMDK("VM_VOLUME_VMDK"),

    UPLOADRESOURCETYPE_UNSUPPORTED_ENUM("UPLOADRESOURCETYPE_UNSUPPORTED_ENUM");
    private String value;

    UploadResourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UploadResourceType fromValue(String value) {
        for (UploadResourceType b : UploadResourceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UploadResourceType.UPLOADRESOURCETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UploadResourceType> {
        @Override
        public void write(final JsonWriter jsonWriter, final UploadResourceType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UploadResourceType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UploadResourceType.fromValue(value);
        }
    }
}
