package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CloudInitNetworkTypeEnum */
@JsonAdapter(CloudInitNetworkTypeEnum.Adapter.class)
public enum CloudInitNetworkTypeEnum {
    IPV4("IPV4"),

    IPV4_DHCP("IPV4_DHCP"),

    CLOUDINITNETWORKTYPEENUM_UNSUPPORTED_ENUM("CLOUDINITNETWORKTYPEENUM_UNSUPPORTED_ENUM");
    private String value;

    CloudInitNetworkTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CloudInitNetworkTypeEnum fromValue(String value) {
        for (CloudInitNetworkTypeEnum b : CloudInitNetworkTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return CloudInitNetworkTypeEnum.CLOUDINITNETWORKTYPEENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<CloudInitNetworkTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final CloudInitNetworkTypeEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CloudInitNetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CloudInitNetworkTypeEnum.fromValue(value);
        }
    }
}
