package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VdsOrderByInput */
@JsonAdapter(VdsOrderByInput.Adapter.class)
public enum VdsOrderByInput {
    BOND_MODE_ASC("bond_mode_ASC"),

    BOND_MODE_DESC("bond_mode_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    OVSBR_NAME_ASC("ovsbr_name_ASC"),

    OVSBR_NAME_DESC("ovsbr_name_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    VLANS_NUM_ASC("vlans_num_ASC"),

    VLANS_NUM_DESC("vlans_num_DESC"),

    WORK_MODE_ASC("work_mode_ASC"),

    WORK_MODE_DESC("work_mode_DESC"),

    VDSORDERBYINPUT_UNSUPPORTED_ENUM("VDSORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VdsOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VdsOrderByInput fromValue(String value) {
        for (VdsOrderByInput b : VdsOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VdsOrderByInput.VDSORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VdsOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VdsOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VdsOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VdsOrderByInput.fromValue(value);
        }
    }
}
