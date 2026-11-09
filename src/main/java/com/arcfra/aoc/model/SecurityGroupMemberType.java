package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SecurityGroupMemberType */
@JsonAdapter(SecurityGroupMemberType.Adapter.class)
public enum SecurityGroupMemberType {
    IP("IP"),

    POD("POD"),

    VM("VM"),

    SECURITYGROUPMEMBERTYPE_UNSUPPORTED_ENUM("SECURITYGROUPMEMBERTYPE_UNSUPPORTED_ENUM");
    private String value;

    SecurityGroupMemberType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SecurityGroupMemberType fromValue(String value) {
        for (SecurityGroupMemberType b : SecurityGroupMemberType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SecurityGroupMemberType.SECURITYGROUPMEMBERTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SecurityGroupMemberType> {
        @Override
        public void write(final JsonWriter jsonWriter, final SecurityGroupMemberType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SecurityGroupMemberType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SecurityGroupMemberType.fromValue(value);
        }
    }
}
