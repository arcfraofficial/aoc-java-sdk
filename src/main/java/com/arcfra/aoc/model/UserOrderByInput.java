package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets UserOrderByInput */
@JsonAdapter(UserOrderByInput.Adapter.class)
public enum UserOrderByInput {
    AUTH_CONFIG_ID_ASC("auth_config_id_ASC"),

    AUTH_CONFIG_ID_DESC("auth_config_id_DESC"),

    DISPLAY_USERNAME_ASC("display_username_ASC"),

    DISPLAY_USERNAME_DESC("display_username_DESC"),

    EMAIL_ADDRESS_ASC("email_address_ASC"),

    EMAIL_ADDRESS_DESC("email_address_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    LDAP_DN_ASC("ldap_dn_ASC"),

    LDAP_DN_DESC("ldap_dn_DESC"),

    MOBILE_PHONE_ASC("mobile_phone_ASC"),

    MOBILE_PHONE_DESC("mobile_phone_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PASSWORD_EXPIRED_ASC("password_expired_ASC"),

    PASSWORD_EXPIRED_DESC("password_expired_DESC"),

    PASSWORD_RECOVER_QA_ASC("password_recover_qa_ASC"),

    PASSWORD_RECOVER_QA_DESC("password_recover_qa_DESC"),

    PASSWORD_UPDATED_AT_ASC("password_updated_at_ASC"),

    PASSWORD_UPDATED_AT_DESC("password_updated_at_DESC"),

    ROLE_ASC("role_ASC"),

    ROLE_DESC("role_DESC"),

    SOURCE_ASC("source_ASC"),

    SOURCE_DESC("source_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    USERORDERBYINPUT_UNSUPPORTED_ENUM("USERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    UserOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserOrderByInput fromValue(String value) {
        for (UserOrderByInput b : UserOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UserOrderByInput.USERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<UserOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final UserOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public UserOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return UserOrderByInput.fromValue(value);
        }
    }
}
