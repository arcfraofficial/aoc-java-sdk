package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmNicModel */
@JsonAdapter(VmNicModel.Adapter.class)
public enum VmNicModel {
    E1000("E1000"),

    SRIOV("SRIOV"),

    VIRTIO("VIRTIO"),

    VMNICMODEL_UNSUPPORTED_ENUM("VMNICMODEL_UNSUPPORTED_ENUM");
    private String value;

    VmNicModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmNicModel fromValue(String value) {
        for (VmNicModel b : VmNicModel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmNicModel.VMNICMODEL_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmNicModel> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmNicModel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmNicModel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmNicModel.fromValue(value);
        }
    }
}
