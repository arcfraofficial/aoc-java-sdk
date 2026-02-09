package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PartitionUsage */
@JsonAdapter(PartitionUsage.Adapter.class)
public enum PartitionUsage {
    BOOT("BOOT"),

    CACHE("CACHE"),

    EFI_SYSTEM("EFI_SYSTEM"),

    JOURNAL("JOURNAL"),

    METAD("METAD"),

    PARTITION("PARTITION"),

    SWAP("SWAP"),

    SYSTEM("SYSTEM"),

    UNMOUNTED("UNMOUNTED"),

    UNPARTED("UNPARTED"),

    ZOOKEEPER("ZOOKEEPER"),

    PARTITIONUSAGE_UNSUPPORTED_ENUM("PARTITIONUSAGE_UNSUPPORTED_ENUM");
    private String value;

    PartitionUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PartitionUsage fromValue(String value) {
        for (PartitionUsage b : PartitionUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PartitionUsage.PARTITIONUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PartitionUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final PartitionUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PartitionUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PartitionUsage.fromValue(value);
        }
    }
}
