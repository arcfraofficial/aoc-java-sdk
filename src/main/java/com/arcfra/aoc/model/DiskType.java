package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskType */
@JsonAdapter(DiskType.Adapter.class)
public enum DiskType {
    HDD("HDD"),

    NVME_SSD("NVMe_SSD"),

    PMEM("PMem"),

    SATA_OR_SAS_SSD("SATA_OR_SAS_SSD"),

    SSD("SSD"),

    DISKTYPE_UNSUPPORTED_ENUM("DISKTYPE_UNSUPPORTED_ENUM");
    private String value;

    DiskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskType fromValue(String value) {
        for (DiskType b : DiskType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskType.DISKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskType.fromValue(value);
        }
    }
}
