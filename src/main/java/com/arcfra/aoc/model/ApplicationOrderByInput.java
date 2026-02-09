package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ApplicationOrderByInput */
@JsonAdapter(ApplicationOrderByInput.Adapter.class)
public enum ApplicationOrderByInput {
    ERROR_MESSAGE_ASC("error_message_ASC"),

    ERROR_MESSAGE_DESC("error_message_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IMAGE_NAME_ASC("image_name_ASC"),

    IMAGE_NAME_DESC("image_name_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MEMORY_ASC("memory_ASC"),

    MEMORY_DESC("memory_DESC"),

    STATE_ASC("state_ASC"),

    STATE_DESC("state_DESC"),

    STORAGE_IP_ASC("storage_ip_ASC"),

    STORAGE_IP_DESC("storage_ip_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UPDATE_TIME_ASC("update_time_ASC"),

    UPDATE_TIME_DESC("update_time_DESC"),

    VCPU_ASC("vcpu_ASC"),

    VCPU_DESC("vcpu_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    VOLUME_SIZE_ASC("volume_size_ASC"),

    VOLUME_SIZE_DESC("volume_size_DESC"),

    APPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM("APPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ApplicationOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationOrderByInput fromValue(String value) {
        for (ApplicationOrderByInput b : ApplicationOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ApplicationOrderByInput.APPLICATIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ApplicationOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ApplicationOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ApplicationOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ApplicationOrderByInput.fromValue(value);
        }
    }
}
