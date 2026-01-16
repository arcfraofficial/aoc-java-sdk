package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** UserWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<UserWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<UserWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<UserWhereInput> OR = null;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
    private String authConfigId;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS = "auth_config_id_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS)
    private String authConfigIdContains;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH =
            "auth_config_id_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH)
    private String authConfigIdEndsWith;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_GT = "auth_config_id_gt";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_GT)
    private String authConfigIdGt;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_GTE = "auth_config_id_gte";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE)
    private String authConfigIdGte;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_IN = "auth_config_id_in";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_IN)
    private List<String> authConfigIdIn = null;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_LT = "auth_config_id_lt";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_LT)
    private String authConfigIdLt;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_LTE = "auth_config_id_lte";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE)
    private String authConfigIdLte;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT = "auth_config_id_not";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT)
    private String authConfigIdNot;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS =
            "auth_config_id_not_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS)
    private String authConfigIdNotContains;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH =
            "auth_config_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH)
    private String authConfigIdNotEndsWith;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN = "auth_config_id_not_in";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN)
    private List<String> authConfigIdNotIn = null;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH =
            "auth_config_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH)
    private String authConfigIdNotStartsWith;

    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH =
            "auth_config_id_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH)
    private String authConfigIdStartsWith;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME = "display_username";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME)
    private String displayUsername;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS =
            "display_username_contains";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS)
    private String displayUsernameContains;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH =
            "display_username_ends_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH)
    private String displayUsernameEndsWith;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_GT = "display_username_gt";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_GT)
    private String displayUsernameGt;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_GTE = "display_username_gte";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_GTE)
    private String displayUsernameGte;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_IN = "display_username_in";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_IN)
    private List<String> displayUsernameIn = null;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_LT = "display_username_lt";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_LT)
    private String displayUsernameLt;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_LTE = "display_username_lte";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_LTE)
    private String displayUsernameLte;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT = "display_username_not";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT)
    private String displayUsernameNot;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS =
            "display_username_not_contains";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS)
    private String displayUsernameNotContains;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH =
            "display_username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH)
    private String displayUsernameNotEndsWith;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN = "display_username_not_in";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN)
    private List<String> displayUsernameNotIn = null;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH =
            "display_username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH)
    private String displayUsernameNotStartsWith;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH =
            "display_username_starts_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH)
    private String displayUsernameStartsWith;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
    private String emailAddress;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS = "email_address_contains";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS)
    private String emailAddressContains;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH = "email_address_ends_with";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH)
    private String emailAddressEndsWith;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_GT = "email_address_gt";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_GT)
    private String emailAddressGt;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_GTE = "email_address_gte";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_GTE)
    private String emailAddressGte;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_IN = "email_address_in";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_IN)
    private List<String> emailAddressIn = null;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_LT = "email_address_lt";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_LT)
    private String emailAddressLt;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_LTE = "email_address_lte";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_LTE)
    private String emailAddressLte;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT = "email_address_not";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT)
    private String emailAddressNot;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS =
            "email_address_not_contains";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS)
    private String emailAddressNotContains;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH =
            "email_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH)
    private String emailAddressNotEndsWith;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN = "email_address_not_in";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN)
    private List<String> emailAddressNotIn = null;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH =
            "email_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH)
    private String emailAddressNotStartsWith;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH =
            "email_address_starts_with";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH)
    private String emailAddressStartsWith;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_LDAP_DN = "ldap_dn";

    @SerializedName(SERIALIZED_NAME_LDAP_DN)
    private String ldapDn;

    public static final String SERIALIZED_NAME_LDAP_DN_CONTAINS = "ldap_dn_contains";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_CONTAINS)
    private String ldapDnContains;

    public static final String SERIALIZED_NAME_LDAP_DN_ENDS_WITH = "ldap_dn_ends_with";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_ENDS_WITH)
    private String ldapDnEndsWith;

    public static final String SERIALIZED_NAME_LDAP_DN_GT = "ldap_dn_gt";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_GT)
    private String ldapDnGt;

    public static final String SERIALIZED_NAME_LDAP_DN_GTE = "ldap_dn_gte";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_GTE)
    private String ldapDnGte;

    public static final String SERIALIZED_NAME_LDAP_DN_IN = "ldap_dn_in";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_IN)
    private List<String> ldapDnIn = null;

    public static final String SERIALIZED_NAME_LDAP_DN_LT = "ldap_dn_lt";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_LT)
    private String ldapDnLt;

    public static final String SERIALIZED_NAME_LDAP_DN_LTE = "ldap_dn_lte";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_LTE)
    private String ldapDnLte;

    public static final String SERIALIZED_NAME_LDAP_DN_NOT = "ldap_dn_not";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT)
    private String ldapDnNot;

    public static final String SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS = "ldap_dn_not_contains";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS)
    private String ldapDnNotContains;

    public static final String SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH = "ldap_dn_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH)
    private String ldapDnNotEndsWith;

    public static final String SERIALIZED_NAME_LDAP_DN_NOT_IN = "ldap_dn_not_in";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_IN)
    private List<String> ldapDnNotIn = null;

    public static final String SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH = "ldap_dn_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH)
    private String ldapDnNotStartsWith;

    public static final String SERIALIZED_NAME_LDAP_DN_STARTS_WITH = "ldap_dn_starts_with";

    @SerializedName(SERIALIZED_NAME_LDAP_DN_STARTS_WITH)
    private String ldapDnStartsWith;

    public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
    private String mobilePhone;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_CONTAINS = "mobile_phone_contains";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS)
    private String mobilePhoneContains;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH = "mobile_phone_ends_with";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH)
    private String mobilePhoneEndsWith;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_GT = "mobile_phone_gt";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_GT)
    private String mobilePhoneGt;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_GTE = "mobile_phone_gte";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_GTE)
    private String mobilePhoneGte;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_IN = "mobile_phone_in";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_IN)
    private List<String> mobilePhoneIn = null;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_LT = "mobile_phone_lt";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_LT)
    private String mobilePhoneLt;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_LTE = "mobile_phone_lte";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_LTE)
    private String mobilePhoneLte;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT = "mobile_phone_not";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT)
    private String mobilePhoneNot;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS =
            "mobile_phone_not_contains";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS)
    private String mobilePhoneNotContains;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH =
            "mobile_phone_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH)
    private String mobilePhoneNotEndsWith;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_IN = "mobile_phone_not_in";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN)
    private List<String> mobilePhoneNotIn = null;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH =
            "mobile_phone_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH)
    private String mobilePhoneNotStartsWith;

    public static final String SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH =
            "mobile_phone_starts_with";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH)
    private String mobilePhoneStartsWith;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_PASSWORD_EXPIRED = "password_expired";

    @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED)
    private Boolean passwordExpired;

    public static final String SERIALIZED_NAME_PASSWORD_EXPIRED_NOT = "password_expired_not";

    @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT)
    private Boolean passwordExpiredNot;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT = "password_updated_at";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT)
    private String passwordUpdatedAt;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT = "password_updated_at_gt";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT)
    private String passwordUpdatedAtGt;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE = "password_updated_at_gte";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE)
    private String passwordUpdatedAtGte;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN = "password_updated_at_in";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN)
    private List<String> passwordUpdatedAtIn = null;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT = "password_updated_at_lt";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT)
    private String passwordUpdatedAtLt;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE = "password_updated_at_lte";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE)
    private String passwordUpdatedAtLte;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT = "password_updated_at_not";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT)
    private String passwordUpdatedAtNot;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN =
            "password_updated_at_not_in";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN)
    private List<String> passwordUpdatedAtNotIn = null;

    public static final String SERIALIZED_NAME_ROLE = "role";

    @SerializedName(SERIALIZED_NAME_ROLE)
    private UserRole role;

    public static final String SERIALIZED_NAME_ROLE_IN = "role_in";

    @SerializedName(SERIALIZED_NAME_ROLE_IN)
    private List<UserRole> roleIn = null;

    public static final String SERIALIZED_NAME_ROLE_NOT = "role_not";

    @SerializedName(SERIALIZED_NAME_ROLE_NOT)
    private UserRole roleNot;

    public static final String SERIALIZED_NAME_ROLE_NOT_IN = "role_not_in";

    @SerializedName(SERIALIZED_NAME_ROLE_NOT_IN)
    private List<UserRole> roleNotIn = null;

    public static final String SERIALIZED_NAME_ROLES_EVERY = "roles_every";

    @SerializedName(SERIALIZED_NAME_ROLES_EVERY)
    private UserRoleNextWhereInput rolesEvery;

    public static final String SERIALIZED_NAME_ROLES_NONE = "roles_none";

    @SerializedName(SERIALIZED_NAME_ROLES_NONE)
    private UserRoleNextWhereInput rolesNone;

    public static final String SERIALIZED_NAME_ROLES_SOME = "roles_some";

    @SerializedName(SERIALIZED_NAME_ROLES_SOME)
    private UserRoleNextWhereInput rolesSome;

    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private UserSource source;

    public static final String SERIALIZED_NAME_SOURCE_IN = "source_in";

    @SerializedName(SERIALIZED_NAME_SOURCE_IN)
    private List<UserSource> sourceIn = null;

    public static final String SERIALIZED_NAME_SOURCE_NOT = "source_not";

    @SerializedName(SERIALIZED_NAME_SOURCE_NOT)
    private UserSource sourceNot;

    public static final String SERIALIZED_NAME_SOURCE_NOT_IN = "source_not_in";

    @SerializedName(SERIALIZED_NAME_SOURCE_NOT_IN)
    private List<UserSource> sourceNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
    private String usernameContains;

    public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
    private String usernameEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";

    @SerializedName(SERIALIZED_NAME_USERNAME_GT)
    private String usernameGt;

    public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";

    @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
    private String usernameGte;

    public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_IN)
    private List<String> usernameIn = null;

    public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";

    @SerializedName(SERIALIZED_NAME_USERNAME_LT)
    private String usernameLt;

    public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";

    @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
    private String usernameLte;

    public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
    private String usernameNot;

    public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
    private String usernameNotContains;

    public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
    private String usernameNotEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
    private List<String> usernameNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH =
            "username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
    private String usernameNotStartsWith;

    public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
    private String usernameStartsWith;

    public UserWhereInput() {}

    public UserWhereInput AND(List<UserWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public UserWhereInput addANDItem(UserWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<UserWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<UserWhereInput> AND) {
        this.AND = AND;
    }

    public UserWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public UserWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public UserWhereInput NOT(List<UserWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public UserWhereInput addNOTItem(UserWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<UserWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<UserWhereInput> NOT) {
        this.NOT = NOT;
    }

    public UserWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public UserWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public UserWhereInput OR(List<UserWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public UserWhereInput addORItem(UserWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<UserWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<UserWhereInput> OR) {
        this.OR = OR;
    }

    public UserWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public UserWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public UserWhereInput authConfigId(String authConfigId) {

        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * Get authConfigId
     *
     * @return authConfigId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    public UserWhereInput authConfigId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID);
        return this;
    }

    public UserWhereInput authConfigId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID);
        return this;
    }

    public void setAuthConfigId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID);
        }
    }

    public boolean getAuthConfigId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID);
    }

    public UserWhereInput authConfigIdContains(String authConfigIdContains) {

        this.authConfigIdContains = authConfigIdContains;
        return this;
    }

    /**
     * Get authConfigIdContains
     *
     * @return authConfigIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdContains() {
        return authConfigIdContains;
    }

    public void setAuthConfigIdContains(String authConfigIdContains) {
        this.authConfigIdContains = authConfigIdContains;
    }

    public UserWhereInput authConfigIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS);
        return this;
    }

    public UserWhereInput authConfigIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS);
        return this;
    }

    public void setAuthConfigIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS);
        }
    }

    public boolean getAuthConfigIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS);
    }

    public UserWhereInput authConfigIdEndsWith(String authConfigIdEndsWith) {

        this.authConfigIdEndsWith = authConfigIdEndsWith;
        return this;
    }

    /**
     * Get authConfigIdEndsWith
     *
     * @return authConfigIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdEndsWith() {
        return authConfigIdEndsWith;
    }

    public void setAuthConfigIdEndsWith(String authConfigIdEndsWith) {
        this.authConfigIdEndsWith = authConfigIdEndsWith;
    }

    public UserWhereInput authConfigIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH);
        return this;
    }

    public UserWhereInput authConfigIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH);
        return this;
    }

    public void setAuthConfigIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH);
        }
    }

    public boolean getAuthConfigIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH);
    }

    public UserWhereInput authConfigIdGt(String authConfigIdGt) {

        this.authConfigIdGt = authConfigIdGt;
        return this;
    }

    /**
     * Get authConfigIdGt
     *
     * @return authConfigIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdGt() {
        return authConfigIdGt;
    }

    public void setAuthConfigIdGt(String authConfigIdGt) {
        this.authConfigIdGt = authConfigIdGt;
    }

    public UserWhereInput authConfigIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_GT);
        return this;
    }

    public UserWhereInput authConfigIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_GT);
        return this;
    }

    public void setAuthConfigIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_GT);
        }
    }

    public boolean getAuthConfigIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_GT);
    }

    public UserWhereInput authConfigIdGte(String authConfigIdGte) {

        this.authConfigIdGte = authConfigIdGte;
        return this;
    }

    /**
     * Get authConfigIdGte
     *
     * @return authConfigIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdGte() {
        return authConfigIdGte;
    }

    public void setAuthConfigIdGte(String authConfigIdGte) {
        this.authConfigIdGte = authConfigIdGte;
    }

    public UserWhereInput authConfigIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE);
        return this;
    }

    public UserWhereInput authConfigIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE);
        return this;
    }

    public void setAuthConfigIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE);
        }
    }

    public boolean getAuthConfigIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE);
    }

    public UserWhereInput authConfigIdIn(List<String> authConfigIdIn) {

        this.authConfigIdIn = authConfigIdIn;
        return this;
    }

    public UserWhereInput addAuthConfigIdInItem(String authConfigIdInItem) {
        if (this.authConfigIdIn == null) {
            this.authConfigIdIn = new ArrayList<String>();
        }
        this.authConfigIdIn.add(authConfigIdInItem);
        return this;
    }

    /**
     * Get authConfigIdIn
     *
     * @return authConfigIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthConfigIdIn() {
        return authConfigIdIn;
    }

    public void setAuthConfigIdIn(List<String> authConfigIdIn) {
        this.authConfigIdIn = authConfigIdIn;
    }

    public UserWhereInput authConfigIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_IN);
        return this;
    }

    public UserWhereInput authConfigIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_IN);
        return this;
    }

    public void setAuthConfigIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_IN);
        }
    }

    public boolean getAuthConfigIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_IN);
    }

    public UserWhereInput authConfigIdLt(String authConfigIdLt) {

        this.authConfigIdLt = authConfigIdLt;
        return this;
    }

    /**
     * Get authConfigIdLt
     *
     * @return authConfigIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdLt() {
        return authConfigIdLt;
    }

    public void setAuthConfigIdLt(String authConfigIdLt) {
        this.authConfigIdLt = authConfigIdLt;
    }

    public UserWhereInput authConfigIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_LT);
        return this;
    }

    public UserWhereInput authConfigIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_LT);
        return this;
    }

    public void setAuthConfigIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_LT);
        }
    }

    public boolean getAuthConfigIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_LT);
    }

    public UserWhereInput authConfigIdLte(String authConfigIdLte) {

        this.authConfigIdLte = authConfigIdLte;
        return this;
    }

    /**
     * Get authConfigIdLte
     *
     * @return authConfigIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdLte() {
        return authConfigIdLte;
    }

    public void setAuthConfigIdLte(String authConfigIdLte) {
        this.authConfigIdLte = authConfigIdLte;
    }

    public UserWhereInput authConfigIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE);
        return this;
    }

    public UserWhereInput authConfigIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE);
        return this;
    }

    public void setAuthConfigIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE);
        }
    }

    public boolean getAuthConfigIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE);
    }

    public UserWhereInput authConfigIdNot(String authConfigIdNot) {

        this.authConfigIdNot = authConfigIdNot;
        return this;
    }

    /**
     * Get authConfigIdNot
     *
     * @return authConfigIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdNot() {
        return authConfigIdNot;
    }

    public void setAuthConfigIdNot(String authConfigIdNot) {
        this.authConfigIdNot = authConfigIdNot;
    }

    public UserWhereInput authConfigIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT);
        return this;
    }

    public UserWhereInput authConfigIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT);
        return this;
    }

    public void setAuthConfigIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT);
        }
    }

    public boolean getAuthConfigIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT);
    }

    public UserWhereInput authConfigIdNotContains(String authConfigIdNotContains) {

        this.authConfigIdNotContains = authConfigIdNotContains;
        return this;
    }

    /**
     * Get authConfigIdNotContains
     *
     * @return authConfigIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdNotContains() {
        return authConfigIdNotContains;
    }

    public void setAuthConfigIdNotContains(String authConfigIdNotContains) {
        this.authConfigIdNotContains = authConfigIdNotContains;
    }

    public UserWhereInput authConfigIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput authConfigIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS);
        return this;
    }

    public void setAuthConfigIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS);
        }
    }

    public boolean getAuthConfigIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS);
    }

    public UserWhereInput authConfigIdNotEndsWith(String authConfigIdNotEndsWith) {

        this.authConfigIdNotEndsWith = authConfigIdNotEndsWith;
        return this;
    }

    /**
     * Get authConfigIdNotEndsWith
     *
     * @return authConfigIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdNotEndsWith() {
        return authConfigIdNotEndsWith;
    }

    public void setAuthConfigIdNotEndsWith(String authConfigIdNotEndsWith) {
        this.authConfigIdNotEndsWith = authConfigIdNotEndsWith;
    }

    public UserWhereInput authConfigIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput authConfigIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setAuthConfigIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getAuthConfigIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH);
    }

    public UserWhereInput authConfigIdNotIn(List<String> authConfigIdNotIn) {

        this.authConfigIdNotIn = authConfigIdNotIn;
        return this;
    }

    public UserWhereInput addAuthConfigIdNotInItem(String authConfigIdNotInItem) {
        if (this.authConfigIdNotIn == null) {
            this.authConfigIdNotIn = new ArrayList<String>();
        }
        this.authConfigIdNotIn.add(authConfigIdNotInItem);
        return this;
    }

    /**
     * Get authConfigIdNotIn
     *
     * @return authConfigIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthConfigIdNotIn() {
        return authConfigIdNotIn;
    }

    public void setAuthConfigIdNotIn(List<String> authConfigIdNotIn) {
        this.authConfigIdNotIn = authConfigIdNotIn;
    }

    public UserWhereInput authConfigIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN);
        return this;
    }

    public UserWhereInput authConfigIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN);
        return this;
    }

    public void setAuthConfigIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN);
        }
    }

    public boolean getAuthConfigIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN);
    }

    public UserWhereInput authConfigIdNotStartsWith(String authConfigIdNotStartsWith) {

        this.authConfigIdNotStartsWith = authConfigIdNotStartsWith;
        return this;
    }

    /**
     * Get authConfigIdNotStartsWith
     *
     * @return authConfigIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdNotStartsWith() {
        return authConfigIdNotStartsWith;
    }

    public void setAuthConfigIdNotStartsWith(String authConfigIdNotStartsWith) {
        this.authConfigIdNotStartsWith = authConfigIdNotStartsWith;
    }

    public UserWhereInput authConfigIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput authConfigIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setAuthConfigIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getAuthConfigIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH);
    }

    public UserWhereInput authConfigIdStartsWith(String authConfigIdStartsWith) {

        this.authConfigIdStartsWith = authConfigIdStartsWith;
        return this;
    }

    /**
     * Get authConfigIdStartsWith
     *
     * @return authConfigIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthConfigIdStartsWith() {
        return authConfigIdStartsWith;
    }

    public void setAuthConfigIdStartsWith(String authConfigIdStartsWith) {
        this.authConfigIdStartsWith = authConfigIdStartsWith;
    }

    public UserWhereInput authConfigIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH);
        return this;
    }

    public UserWhereInput authConfigIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH);
        return this;
    }

    public void setAuthConfigIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH);
        }
    }

    public boolean getAuthConfigIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH);
    }

    public UserWhereInput displayUsername(String displayUsername) {

        this.displayUsername = displayUsername;
        return this;
    }

    /**
     * Get displayUsername
     *
     * @return displayUsername
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsername() {
        return displayUsername;
    }

    public void setDisplayUsername(String displayUsername) {
        this.displayUsername = displayUsername;
    }

    public UserWhereInput displayUsername_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME);
        return this;
    }

    public UserWhereInput displayUsername_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME);
        return this;
    }

    public void setDisplayUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME);
        }
    }

    public boolean getDisplayUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME);
    }

    public UserWhereInput displayUsernameContains(String displayUsernameContains) {

        this.displayUsernameContains = displayUsernameContains;
        return this;
    }

    /**
     * Get displayUsernameContains
     *
     * @return displayUsernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameContains() {
        return displayUsernameContains;
    }

    public void setDisplayUsernameContains(String displayUsernameContains) {
        this.displayUsernameContains = displayUsernameContains;
    }

    public UserWhereInput displayUsernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS);
        return this;
    }

    public UserWhereInput displayUsernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS);
        return this;
    }

    public void setDisplayUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS);
        }
    }

    public boolean getDisplayUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS);
    }

    public UserWhereInput displayUsernameEndsWith(String displayUsernameEndsWith) {

        this.displayUsernameEndsWith = displayUsernameEndsWith;
        return this;
    }

    /**
     * Get displayUsernameEndsWith
     *
     * @return displayUsernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameEndsWith() {
        return displayUsernameEndsWith;
    }

    public void setDisplayUsernameEndsWith(String displayUsernameEndsWith) {
        this.displayUsernameEndsWith = displayUsernameEndsWith;
    }

    public UserWhereInput displayUsernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH);
        return this;
    }

    public UserWhereInput displayUsernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH);
        return this;
    }

    public void setDisplayUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH);
        }
    }

    public boolean getDisplayUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH);
    }

    public UserWhereInput displayUsernameGt(String displayUsernameGt) {

        this.displayUsernameGt = displayUsernameGt;
        return this;
    }

    /**
     * Get displayUsernameGt
     *
     * @return displayUsernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameGt() {
        return displayUsernameGt;
    }

    public void setDisplayUsernameGt(String displayUsernameGt) {
        this.displayUsernameGt = displayUsernameGt;
    }

    public UserWhereInput displayUsernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_GT);
        return this;
    }

    public UserWhereInput displayUsernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_GT);
        return this;
    }

    public void setDisplayUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_GT);
        }
    }

    public boolean getDisplayUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_GT);
    }

    public UserWhereInput displayUsernameGte(String displayUsernameGte) {

        this.displayUsernameGte = displayUsernameGte;
        return this;
    }

    /**
     * Get displayUsernameGte
     *
     * @return displayUsernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameGte() {
        return displayUsernameGte;
    }

    public void setDisplayUsernameGte(String displayUsernameGte) {
        this.displayUsernameGte = displayUsernameGte;
    }

    public UserWhereInput displayUsernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_GTE);
        return this;
    }

    public UserWhereInput displayUsernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_GTE);
        return this;
    }

    public void setDisplayUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_GTE);
        }
    }

    public boolean getDisplayUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_GTE);
    }

    public UserWhereInput displayUsernameIn(List<String> displayUsernameIn) {

        this.displayUsernameIn = displayUsernameIn;
        return this;
    }

    public UserWhereInput addDisplayUsernameInItem(String displayUsernameInItem) {
        if (this.displayUsernameIn == null) {
            this.displayUsernameIn = new ArrayList<String>();
        }
        this.displayUsernameIn.add(displayUsernameInItem);
        return this;
    }

    /**
     * Get displayUsernameIn
     *
     * @return displayUsernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisplayUsernameIn() {
        return displayUsernameIn;
    }

    public void setDisplayUsernameIn(List<String> displayUsernameIn) {
        this.displayUsernameIn = displayUsernameIn;
    }

    public UserWhereInput displayUsernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_IN);
        return this;
    }

    public UserWhereInput displayUsernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_IN);
        return this;
    }

    public void setDisplayUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_IN);
        }
    }

    public boolean getDisplayUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_IN);
    }

    public UserWhereInput displayUsernameLt(String displayUsernameLt) {

        this.displayUsernameLt = displayUsernameLt;
        return this;
    }

    /**
     * Get displayUsernameLt
     *
     * @return displayUsernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameLt() {
        return displayUsernameLt;
    }

    public void setDisplayUsernameLt(String displayUsernameLt) {
        this.displayUsernameLt = displayUsernameLt;
    }

    public UserWhereInput displayUsernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_LT);
        return this;
    }

    public UserWhereInput displayUsernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_LT);
        return this;
    }

    public void setDisplayUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_LT);
        }
    }

    public boolean getDisplayUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_LT);
    }

    public UserWhereInput displayUsernameLte(String displayUsernameLte) {

        this.displayUsernameLte = displayUsernameLte;
        return this;
    }

    /**
     * Get displayUsernameLte
     *
     * @return displayUsernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameLte() {
        return displayUsernameLte;
    }

    public void setDisplayUsernameLte(String displayUsernameLte) {
        this.displayUsernameLte = displayUsernameLte;
    }

    public UserWhereInput displayUsernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_LTE);
        return this;
    }

    public UserWhereInput displayUsernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_LTE);
        return this;
    }

    public void setDisplayUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_LTE);
        }
    }

    public boolean getDisplayUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_LTE);
    }

    public UserWhereInput displayUsernameNot(String displayUsernameNot) {

        this.displayUsernameNot = displayUsernameNot;
        return this;
    }

    /**
     * Get displayUsernameNot
     *
     * @return displayUsernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameNot() {
        return displayUsernameNot;
    }

    public void setDisplayUsernameNot(String displayUsernameNot) {
        this.displayUsernameNot = displayUsernameNot;
    }

    public UserWhereInput displayUsernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT);
        return this;
    }

    public UserWhereInput displayUsernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT);
        return this;
    }

    public void setDisplayUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT);
        }
    }

    public boolean getDisplayUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_NOT);
    }

    public UserWhereInput displayUsernameNotContains(String displayUsernameNotContains) {

        this.displayUsernameNotContains = displayUsernameNotContains;
        return this;
    }

    /**
     * Get displayUsernameNotContains
     *
     * @return displayUsernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameNotContains() {
        return displayUsernameNotContains;
    }

    public void setDisplayUsernameNotContains(String displayUsernameNotContains) {
        this.displayUsernameNotContains = displayUsernameNotContains;
    }

    public UserWhereInput displayUsernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput displayUsernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setDisplayUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getDisplayUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS);
    }

    public UserWhereInput displayUsernameNotEndsWith(String displayUsernameNotEndsWith) {

        this.displayUsernameNotEndsWith = displayUsernameNotEndsWith;
        return this;
    }

    /**
     * Get displayUsernameNotEndsWith
     *
     * @return displayUsernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameNotEndsWith() {
        return displayUsernameNotEndsWith;
    }

    public void setDisplayUsernameNotEndsWith(String displayUsernameNotEndsWith) {
        this.displayUsernameNotEndsWith = displayUsernameNotEndsWith;
    }

    public UserWhereInput displayUsernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput displayUsernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setDisplayUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getDisplayUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH);
    }

    public UserWhereInput displayUsernameNotIn(List<String> displayUsernameNotIn) {

        this.displayUsernameNotIn = displayUsernameNotIn;
        return this;
    }

    public UserWhereInput addDisplayUsernameNotInItem(String displayUsernameNotInItem) {
        if (this.displayUsernameNotIn == null) {
            this.displayUsernameNotIn = new ArrayList<String>();
        }
        this.displayUsernameNotIn.add(displayUsernameNotInItem);
        return this;
    }

    /**
     * Get displayUsernameNotIn
     *
     * @return displayUsernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisplayUsernameNotIn() {
        return displayUsernameNotIn;
    }

    public void setDisplayUsernameNotIn(List<String> displayUsernameNotIn) {
        this.displayUsernameNotIn = displayUsernameNotIn;
    }

    public UserWhereInput displayUsernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN);
        return this;
    }

    public UserWhereInput displayUsernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN);
        return this;
    }

    public void setDisplayUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN);
        }
    }

    public boolean getDisplayUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN);
    }

    public UserWhereInput displayUsernameNotStartsWith(String displayUsernameNotStartsWith) {

        this.displayUsernameNotStartsWith = displayUsernameNotStartsWith;
        return this;
    }

    /**
     * Get displayUsernameNotStartsWith
     *
     * @return displayUsernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameNotStartsWith() {
        return displayUsernameNotStartsWith;
    }

    public void setDisplayUsernameNotStartsWith(String displayUsernameNotStartsWith) {
        this.displayUsernameNotStartsWith = displayUsernameNotStartsWith;
    }

    public UserWhereInput displayUsernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput displayUsernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setDisplayUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getDisplayUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH);
    }

    public UserWhereInput displayUsernameStartsWith(String displayUsernameStartsWith) {

        this.displayUsernameStartsWith = displayUsernameStartsWith;
        return this;
    }

    /**
     * Get displayUsernameStartsWith
     *
     * @return displayUsernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayUsernameStartsWith() {
        return displayUsernameStartsWith;
    }

    public void setDisplayUsernameStartsWith(String displayUsernameStartsWith) {
        this.displayUsernameStartsWith = displayUsernameStartsWith;
    }

    public UserWhereInput displayUsernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH);
        return this;
    }

    public UserWhereInput displayUsernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH);
        return this;
    }

    public void setDisplayUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH);
        }
    }

    public boolean getDisplayUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH);
    }

    public UserWhereInput emailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get emailAddress
     *
     * @return emailAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UserWhereInput emailAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS);
        return this;
    }

    public UserWhereInput emailAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS);
        return this;
    }

    public void setEmailAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS);
        }
    }

    public boolean getEmailAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS);
    }

    public UserWhereInput emailAddressContains(String emailAddressContains) {

        this.emailAddressContains = emailAddressContains;
        return this;
    }

    /**
     * Get emailAddressContains
     *
     * @return emailAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressContains() {
        return emailAddressContains;
    }

    public void setEmailAddressContains(String emailAddressContains) {
        this.emailAddressContains = emailAddressContains;
    }

    public UserWhereInput emailAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS);
        return this;
    }

    public UserWhereInput emailAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS);
        return this;
    }

    public void setEmailAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS);
        }
    }

    public boolean getEmailAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS);
    }

    public UserWhereInput emailAddressEndsWith(String emailAddressEndsWith) {

        this.emailAddressEndsWith = emailAddressEndsWith;
        return this;
    }

    /**
     * Get emailAddressEndsWith
     *
     * @return emailAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressEndsWith() {
        return emailAddressEndsWith;
    }

    public void setEmailAddressEndsWith(String emailAddressEndsWith) {
        this.emailAddressEndsWith = emailAddressEndsWith;
    }

    public UserWhereInput emailAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH);
        return this;
    }

    public UserWhereInput emailAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setEmailAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getEmailAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH);
    }

    public UserWhereInput emailAddressGt(String emailAddressGt) {

        this.emailAddressGt = emailAddressGt;
        return this;
    }

    /**
     * Get emailAddressGt
     *
     * @return emailAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressGt() {
        return emailAddressGt;
    }

    public void setEmailAddressGt(String emailAddressGt) {
        this.emailAddressGt = emailAddressGt;
    }

    public UserWhereInput emailAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_GT);
        return this;
    }

    public UserWhereInput emailAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_GT);
        return this;
    }

    public void setEmailAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_GT);
        }
    }

    public boolean getEmailAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_GT);
    }

    public UserWhereInput emailAddressGte(String emailAddressGte) {

        this.emailAddressGte = emailAddressGte;
        return this;
    }

    /**
     * Get emailAddressGte
     *
     * @return emailAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressGte() {
        return emailAddressGte;
    }

    public void setEmailAddressGte(String emailAddressGte) {
        this.emailAddressGte = emailAddressGte;
    }

    public UserWhereInput emailAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_GTE);
        return this;
    }

    public UserWhereInput emailAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_GTE);
        return this;
    }

    public void setEmailAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_GTE);
        }
    }

    public boolean getEmailAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_GTE);
    }

    public UserWhereInput emailAddressIn(List<String> emailAddressIn) {

        this.emailAddressIn = emailAddressIn;
        return this;
    }

    public UserWhereInput addEmailAddressInItem(String emailAddressInItem) {
        if (this.emailAddressIn == null) {
            this.emailAddressIn = new ArrayList<String>();
        }
        this.emailAddressIn.add(emailAddressInItem);
        return this;
    }

    /**
     * Get emailAddressIn
     *
     * @return emailAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEmailAddressIn() {
        return emailAddressIn;
    }

    public void setEmailAddressIn(List<String> emailAddressIn) {
        this.emailAddressIn = emailAddressIn;
    }

    public UserWhereInput emailAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_IN);
        return this;
    }

    public UserWhereInput emailAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_IN);
        return this;
    }

    public void setEmailAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_IN);
        }
    }

    public boolean getEmailAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_IN);
    }

    public UserWhereInput emailAddressLt(String emailAddressLt) {

        this.emailAddressLt = emailAddressLt;
        return this;
    }

    /**
     * Get emailAddressLt
     *
     * @return emailAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressLt() {
        return emailAddressLt;
    }

    public void setEmailAddressLt(String emailAddressLt) {
        this.emailAddressLt = emailAddressLt;
    }

    public UserWhereInput emailAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_LT);
        return this;
    }

    public UserWhereInput emailAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_LT);
        return this;
    }

    public void setEmailAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_LT);
        }
    }

    public boolean getEmailAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_LT);
    }

    public UserWhereInput emailAddressLte(String emailAddressLte) {

        this.emailAddressLte = emailAddressLte;
        return this;
    }

    /**
     * Get emailAddressLte
     *
     * @return emailAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressLte() {
        return emailAddressLte;
    }

    public void setEmailAddressLte(String emailAddressLte) {
        this.emailAddressLte = emailAddressLte;
    }

    public UserWhereInput emailAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_LTE);
        return this;
    }

    public UserWhereInput emailAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_LTE);
        return this;
    }

    public void setEmailAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_LTE);
        }
    }

    public boolean getEmailAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_LTE);
    }

    public UserWhereInput emailAddressNot(String emailAddressNot) {

        this.emailAddressNot = emailAddressNot;
        return this;
    }

    /**
     * Get emailAddressNot
     *
     * @return emailAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressNot() {
        return emailAddressNot;
    }

    public void setEmailAddressNot(String emailAddressNot) {
        this.emailAddressNot = emailAddressNot;
    }

    public UserWhereInput emailAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT);
        return this;
    }

    public UserWhereInput emailAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT);
        return this;
    }

    public void setEmailAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT);
        }
    }

    public boolean getEmailAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_NOT);
    }

    public UserWhereInput emailAddressNotContains(String emailAddressNotContains) {

        this.emailAddressNotContains = emailAddressNotContains;
        return this;
    }

    /**
     * Get emailAddressNotContains
     *
     * @return emailAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressNotContains() {
        return emailAddressNotContains;
    }

    public void setEmailAddressNotContains(String emailAddressNotContains) {
        this.emailAddressNotContains = emailAddressNotContains;
    }

    public UserWhereInput emailAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput emailAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setEmailAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getEmailAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS);
    }

    public UserWhereInput emailAddressNotEndsWith(String emailAddressNotEndsWith) {

        this.emailAddressNotEndsWith = emailAddressNotEndsWith;
        return this;
    }

    /**
     * Get emailAddressNotEndsWith
     *
     * @return emailAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressNotEndsWith() {
        return emailAddressNotEndsWith;
    }

    public void setEmailAddressNotEndsWith(String emailAddressNotEndsWith) {
        this.emailAddressNotEndsWith = emailAddressNotEndsWith;
    }

    public UserWhereInput emailAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput emailAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setEmailAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getEmailAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH);
    }

    public UserWhereInput emailAddressNotIn(List<String> emailAddressNotIn) {

        this.emailAddressNotIn = emailAddressNotIn;
        return this;
    }

    public UserWhereInput addEmailAddressNotInItem(String emailAddressNotInItem) {
        if (this.emailAddressNotIn == null) {
            this.emailAddressNotIn = new ArrayList<String>();
        }
        this.emailAddressNotIn.add(emailAddressNotInItem);
        return this;
    }

    /**
     * Get emailAddressNotIn
     *
     * @return emailAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEmailAddressNotIn() {
        return emailAddressNotIn;
    }

    public void setEmailAddressNotIn(List<String> emailAddressNotIn) {
        this.emailAddressNotIn = emailAddressNotIn;
    }

    public UserWhereInput emailAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN);
        return this;
    }

    public UserWhereInput emailAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN);
        return this;
    }

    public void setEmailAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN);
        }
    }

    public boolean getEmailAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN);
    }

    public UserWhereInput emailAddressNotStartsWith(String emailAddressNotStartsWith) {

        this.emailAddressNotStartsWith = emailAddressNotStartsWith;
        return this;
    }

    /**
     * Get emailAddressNotStartsWith
     *
     * @return emailAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressNotStartsWith() {
        return emailAddressNotStartsWith;
    }

    public void setEmailAddressNotStartsWith(String emailAddressNotStartsWith) {
        this.emailAddressNotStartsWith = emailAddressNotStartsWith;
    }

    public UserWhereInput emailAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput emailAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setEmailAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getEmailAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH);
    }

    public UserWhereInput emailAddressStartsWith(String emailAddressStartsWith) {

        this.emailAddressStartsWith = emailAddressStartsWith;
        return this;
    }

    /**
     * Get emailAddressStartsWith
     *
     * @return emailAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailAddressStartsWith() {
        return emailAddressStartsWith;
    }

    public void setEmailAddressStartsWith(String emailAddressStartsWith) {
        this.emailAddressStartsWith = emailAddressStartsWith;
    }

    public UserWhereInput emailAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH);
        return this;
    }

    public UserWhereInput emailAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setEmailAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getEmailAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH);
    }

    public UserWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public UserWhereInput id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public UserWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public UserWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public UserWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public UserWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public UserWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public UserWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public UserWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public UserWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public UserWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public UserWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public UserWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public UserWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public UserWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public UserWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public UserWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public UserWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public UserWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public UserWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public UserWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public UserWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public UserWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public UserWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public UserWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public UserWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public UserWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public UserWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public UserWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public UserWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public UserWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public UserWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public UserWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public UserWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public UserWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public UserWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public UserWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public UserWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public UserWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public UserWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public UserWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public UserWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public UserWhereInput internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public UserWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public UserWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public UserWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public UserWhereInput ldapDn(String ldapDn) {

        this.ldapDn = ldapDn;
        return this;
    }

    /**
     * Get ldapDn
     *
     * @return ldapDn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(String ldapDn) {
        this.ldapDn = ldapDn;
    }

    public UserWhereInput ldapDn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN);
        return this;
    }

    public UserWhereInput ldapDn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN);
        return this;
    }

    public void setLdapDn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN);
        }
    }

    public boolean getLdapDn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN);
    }

    public UserWhereInput ldapDnContains(String ldapDnContains) {

        this.ldapDnContains = ldapDnContains;
        return this;
    }

    /**
     * Get ldapDnContains
     *
     * @return ldapDnContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnContains() {
        return ldapDnContains;
    }

    public void setLdapDnContains(String ldapDnContains) {
        this.ldapDnContains = ldapDnContains;
    }

    public UserWhereInput ldapDnContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_CONTAINS);
        return this;
    }

    public UserWhereInput ldapDnContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_CONTAINS);
        return this;
    }

    public void setLdapDnContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_CONTAINS);
        }
    }

    public boolean getLdapDnContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_CONTAINS);
    }

    public UserWhereInput ldapDnEndsWith(String ldapDnEndsWith) {

        this.ldapDnEndsWith = ldapDnEndsWith;
        return this;
    }

    /**
     * Get ldapDnEndsWith
     *
     * @return ldapDnEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnEndsWith() {
        return ldapDnEndsWith;
    }

    public void setLdapDnEndsWith(String ldapDnEndsWith) {
        this.ldapDnEndsWith = ldapDnEndsWith;
    }

    public UserWhereInput ldapDnEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_ENDS_WITH);
        return this;
    }

    public UserWhereInput ldapDnEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_ENDS_WITH);
        return this;
    }

    public void setLdapDnEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_ENDS_WITH);
        }
    }

    public boolean getLdapDnEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_ENDS_WITH);
    }

    public UserWhereInput ldapDnGt(String ldapDnGt) {

        this.ldapDnGt = ldapDnGt;
        return this;
    }

    /**
     * Get ldapDnGt
     *
     * @return ldapDnGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnGt() {
        return ldapDnGt;
    }

    public void setLdapDnGt(String ldapDnGt) {
        this.ldapDnGt = ldapDnGt;
    }

    public UserWhereInput ldapDnGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_GT);
        return this;
    }

    public UserWhereInput ldapDnGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_GT);
        return this;
    }

    public void setLdapDnGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_GT);
        }
    }

    public boolean getLdapDnGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_GT);
    }

    public UserWhereInput ldapDnGte(String ldapDnGte) {

        this.ldapDnGte = ldapDnGte;
        return this;
    }

    /**
     * Get ldapDnGte
     *
     * @return ldapDnGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnGte() {
        return ldapDnGte;
    }

    public void setLdapDnGte(String ldapDnGte) {
        this.ldapDnGte = ldapDnGte;
    }

    public UserWhereInput ldapDnGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_GTE);
        return this;
    }

    public UserWhereInput ldapDnGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_GTE);
        return this;
    }

    public void setLdapDnGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_GTE);
        }
    }

    public boolean getLdapDnGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_GTE);
    }

    public UserWhereInput ldapDnIn(List<String> ldapDnIn) {

        this.ldapDnIn = ldapDnIn;
        return this;
    }

    public UserWhereInput addLdapDnInItem(String ldapDnInItem) {
        if (this.ldapDnIn == null) {
            this.ldapDnIn = new ArrayList<String>();
        }
        this.ldapDnIn.add(ldapDnInItem);
        return this;
    }

    /**
     * Get ldapDnIn
     *
     * @return ldapDnIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLdapDnIn() {
        return ldapDnIn;
    }

    public void setLdapDnIn(List<String> ldapDnIn) {
        this.ldapDnIn = ldapDnIn;
    }

    public UserWhereInput ldapDnIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_IN);
        return this;
    }

    public UserWhereInput ldapDnIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_IN);
        return this;
    }

    public void setLdapDnIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_IN);
        }
    }

    public boolean getLdapDnIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_IN);
    }

    public UserWhereInput ldapDnLt(String ldapDnLt) {

        this.ldapDnLt = ldapDnLt;
        return this;
    }

    /**
     * Get ldapDnLt
     *
     * @return ldapDnLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnLt() {
        return ldapDnLt;
    }

    public void setLdapDnLt(String ldapDnLt) {
        this.ldapDnLt = ldapDnLt;
    }

    public UserWhereInput ldapDnLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_LT);
        return this;
    }

    public UserWhereInput ldapDnLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_LT);
        return this;
    }

    public void setLdapDnLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_LT);
        }
    }

    public boolean getLdapDnLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_LT);
    }

    public UserWhereInput ldapDnLte(String ldapDnLte) {

        this.ldapDnLte = ldapDnLte;
        return this;
    }

    /**
     * Get ldapDnLte
     *
     * @return ldapDnLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnLte() {
        return ldapDnLte;
    }

    public void setLdapDnLte(String ldapDnLte) {
        this.ldapDnLte = ldapDnLte;
    }

    public UserWhereInput ldapDnLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_LTE);
        return this;
    }

    public UserWhereInput ldapDnLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_LTE);
        return this;
    }

    public void setLdapDnLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_LTE);
        }
    }

    public boolean getLdapDnLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_LTE);
    }

    public UserWhereInput ldapDnNot(String ldapDnNot) {

        this.ldapDnNot = ldapDnNot;
        return this;
    }

    /**
     * Get ldapDnNot
     *
     * @return ldapDnNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnNot() {
        return ldapDnNot;
    }

    public void setLdapDnNot(String ldapDnNot) {
        this.ldapDnNot = ldapDnNot;
    }

    public UserWhereInput ldapDnNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT);
        return this;
    }

    public UserWhereInput ldapDnNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT);
        return this;
    }

    public void setLdapDnNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT);
        }
    }

    public boolean getLdapDnNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_NOT);
    }

    public UserWhereInput ldapDnNotContains(String ldapDnNotContains) {

        this.ldapDnNotContains = ldapDnNotContains;
        return this;
    }

    /**
     * Get ldapDnNotContains
     *
     * @return ldapDnNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnNotContains() {
        return ldapDnNotContains;
    }

    public void setLdapDnNotContains(String ldapDnNotContains) {
        this.ldapDnNotContains = ldapDnNotContains;
    }

    public UserWhereInput ldapDnNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput ldapDnNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS);
        return this;
    }

    public void setLdapDnNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS);
        }
    }

    public boolean getLdapDnNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS);
    }

    public UserWhereInput ldapDnNotEndsWith(String ldapDnNotEndsWith) {

        this.ldapDnNotEndsWith = ldapDnNotEndsWith;
        return this;
    }

    /**
     * Get ldapDnNotEndsWith
     *
     * @return ldapDnNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnNotEndsWith() {
        return ldapDnNotEndsWith;
    }

    public void setLdapDnNotEndsWith(String ldapDnNotEndsWith) {
        this.ldapDnNotEndsWith = ldapDnNotEndsWith;
    }

    public UserWhereInput ldapDnNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput ldapDnNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH);
        return this;
    }

    public void setLdapDnNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH);
        }
    }

    public boolean getLdapDnNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH);
    }

    public UserWhereInput ldapDnNotIn(List<String> ldapDnNotIn) {

        this.ldapDnNotIn = ldapDnNotIn;
        return this;
    }

    public UserWhereInput addLdapDnNotInItem(String ldapDnNotInItem) {
        if (this.ldapDnNotIn == null) {
            this.ldapDnNotIn = new ArrayList<String>();
        }
        this.ldapDnNotIn.add(ldapDnNotInItem);
        return this;
    }

    /**
     * Get ldapDnNotIn
     *
     * @return ldapDnNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLdapDnNotIn() {
        return ldapDnNotIn;
    }

    public void setLdapDnNotIn(List<String> ldapDnNotIn) {
        this.ldapDnNotIn = ldapDnNotIn;
    }

    public UserWhereInput ldapDnNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_IN);
        return this;
    }

    public UserWhereInput ldapDnNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_IN);
        return this;
    }

    public void setLdapDnNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_IN);
        }
    }

    public boolean getLdapDnNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_NOT_IN);
    }

    public UserWhereInput ldapDnNotStartsWith(String ldapDnNotStartsWith) {

        this.ldapDnNotStartsWith = ldapDnNotStartsWith;
        return this;
    }

    /**
     * Get ldapDnNotStartsWith
     *
     * @return ldapDnNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnNotStartsWith() {
        return ldapDnNotStartsWith;
    }

    public void setLdapDnNotStartsWith(String ldapDnNotStartsWith) {
        this.ldapDnNotStartsWith = ldapDnNotStartsWith;
    }

    public UserWhereInput ldapDnNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput ldapDnNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH);
        return this;
    }

    public void setLdapDnNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH);
        }
    }

    public boolean getLdapDnNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH);
    }

    public UserWhereInput ldapDnStartsWith(String ldapDnStartsWith) {

        this.ldapDnStartsWith = ldapDnStartsWith;
        return this;
    }

    /**
     * Get ldapDnStartsWith
     *
     * @return ldapDnStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLdapDnStartsWith() {
        return ldapDnStartsWith;
    }

    public void setLdapDnStartsWith(String ldapDnStartsWith) {
        this.ldapDnStartsWith = ldapDnStartsWith;
    }

    public UserWhereInput ldapDnStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_STARTS_WITH);
        return this;
    }

    public UserWhereInput ldapDnStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_STARTS_WITH);
        return this;
    }

    public void setLdapDnStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LDAP_DN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LDAP_DN_STARTS_WITH);
        }
    }

    public boolean getLdapDnStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LDAP_DN_STARTS_WITH);
    }

    public UserWhereInput mobilePhone(String mobilePhone) {

        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Get mobilePhone
     *
     * @return mobilePhone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public UserWhereInput mobilePhone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE);
        return this;
    }

    public UserWhereInput mobilePhone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE);
        return this;
    }

    public void setMobilePhone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE);
        }
    }

    public boolean getMobilePhone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE);
    }

    public UserWhereInput mobilePhoneContains(String mobilePhoneContains) {

        this.mobilePhoneContains = mobilePhoneContains;
        return this;
    }

    /**
     * Get mobilePhoneContains
     *
     * @return mobilePhoneContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneContains() {
        return mobilePhoneContains;
    }

    public void setMobilePhoneContains(String mobilePhoneContains) {
        this.mobilePhoneContains = mobilePhoneContains;
    }

    public UserWhereInput mobilePhoneContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS);
        return this;
    }

    public UserWhereInput mobilePhoneContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS);
        return this;
    }

    public void setMobilePhoneContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS);
        }
    }

    public boolean getMobilePhoneContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS);
    }

    public UserWhereInput mobilePhoneEndsWith(String mobilePhoneEndsWith) {

        this.mobilePhoneEndsWith = mobilePhoneEndsWith;
        return this;
    }

    /**
     * Get mobilePhoneEndsWith
     *
     * @return mobilePhoneEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneEndsWith() {
        return mobilePhoneEndsWith;
    }

    public void setMobilePhoneEndsWith(String mobilePhoneEndsWith) {
        this.mobilePhoneEndsWith = mobilePhoneEndsWith;
    }

    public UserWhereInput mobilePhoneEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH);
        return this;
    }

    public UserWhereInput mobilePhoneEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH);
        return this;
    }

    public void setMobilePhoneEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH);
        }
    }

    public boolean getMobilePhoneEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH);
    }

    public UserWhereInput mobilePhoneGt(String mobilePhoneGt) {

        this.mobilePhoneGt = mobilePhoneGt;
        return this;
    }

    /**
     * Get mobilePhoneGt
     *
     * @return mobilePhoneGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneGt() {
        return mobilePhoneGt;
    }

    public void setMobilePhoneGt(String mobilePhoneGt) {
        this.mobilePhoneGt = mobilePhoneGt;
    }

    public UserWhereInput mobilePhoneGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_GT);
        return this;
    }

    public UserWhereInput mobilePhoneGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_GT);
        return this;
    }

    public void setMobilePhoneGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_GT);
        }
    }

    public boolean getMobilePhoneGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_GT);
    }

    public UserWhereInput mobilePhoneGte(String mobilePhoneGte) {

        this.mobilePhoneGte = mobilePhoneGte;
        return this;
    }

    /**
     * Get mobilePhoneGte
     *
     * @return mobilePhoneGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneGte() {
        return mobilePhoneGte;
    }

    public void setMobilePhoneGte(String mobilePhoneGte) {
        this.mobilePhoneGte = mobilePhoneGte;
    }

    public UserWhereInput mobilePhoneGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_GTE);
        return this;
    }

    public UserWhereInput mobilePhoneGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_GTE);
        return this;
    }

    public void setMobilePhoneGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_GTE);
        }
    }

    public boolean getMobilePhoneGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_GTE);
    }

    public UserWhereInput mobilePhoneIn(List<String> mobilePhoneIn) {

        this.mobilePhoneIn = mobilePhoneIn;
        return this;
    }

    public UserWhereInput addMobilePhoneInItem(String mobilePhoneInItem) {
        if (this.mobilePhoneIn == null) {
            this.mobilePhoneIn = new ArrayList<String>();
        }
        this.mobilePhoneIn.add(mobilePhoneInItem);
        return this;
    }

    /**
     * Get mobilePhoneIn
     *
     * @return mobilePhoneIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMobilePhoneIn() {
        return mobilePhoneIn;
    }

    public void setMobilePhoneIn(List<String> mobilePhoneIn) {
        this.mobilePhoneIn = mobilePhoneIn;
    }

    public UserWhereInput mobilePhoneIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_IN);
        return this;
    }

    public UserWhereInput mobilePhoneIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_IN);
        return this;
    }

    public void setMobilePhoneIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_IN);
        }
    }

    public boolean getMobilePhoneIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_IN);
    }

    public UserWhereInput mobilePhoneLt(String mobilePhoneLt) {

        this.mobilePhoneLt = mobilePhoneLt;
        return this;
    }

    /**
     * Get mobilePhoneLt
     *
     * @return mobilePhoneLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneLt() {
        return mobilePhoneLt;
    }

    public void setMobilePhoneLt(String mobilePhoneLt) {
        this.mobilePhoneLt = mobilePhoneLt;
    }

    public UserWhereInput mobilePhoneLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_LT);
        return this;
    }

    public UserWhereInput mobilePhoneLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_LT);
        return this;
    }

    public void setMobilePhoneLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_LT);
        }
    }

    public boolean getMobilePhoneLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_LT);
    }

    public UserWhereInput mobilePhoneLte(String mobilePhoneLte) {

        this.mobilePhoneLte = mobilePhoneLte;
        return this;
    }

    /**
     * Get mobilePhoneLte
     *
     * @return mobilePhoneLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneLte() {
        return mobilePhoneLte;
    }

    public void setMobilePhoneLte(String mobilePhoneLte) {
        this.mobilePhoneLte = mobilePhoneLte;
    }

    public UserWhereInput mobilePhoneLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_LTE);
        return this;
    }

    public UserWhereInput mobilePhoneLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_LTE);
        return this;
    }

    public void setMobilePhoneLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_LTE);
        }
    }

    public boolean getMobilePhoneLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_LTE);
    }

    public UserWhereInput mobilePhoneNot(String mobilePhoneNot) {

        this.mobilePhoneNot = mobilePhoneNot;
        return this;
    }

    /**
     * Get mobilePhoneNot
     *
     * @return mobilePhoneNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneNot() {
        return mobilePhoneNot;
    }

    public void setMobilePhoneNot(String mobilePhoneNot) {
        this.mobilePhoneNot = mobilePhoneNot;
    }

    public UserWhereInput mobilePhoneNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT);
        return this;
    }

    public UserWhereInput mobilePhoneNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT);
        return this;
    }

    public void setMobilePhoneNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT);
        }
    }

    public boolean getMobilePhoneNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_NOT);
    }

    public UserWhereInput mobilePhoneNotContains(String mobilePhoneNotContains) {

        this.mobilePhoneNotContains = mobilePhoneNotContains;
        return this;
    }

    /**
     * Get mobilePhoneNotContains
     *
     * @return mobilePhoneNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneNotContains() {
        return mobilePhoneNotContains;
    }

    public void setMobilePhoneNotContains(String mobilePhoneNotContains) {
        this.mobilePhoneNotContains = mobilePhoneNotContains;
    }

    public UserWhereInput mobilePhoneNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput mobilePhoneNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS);
        return this;
    }

    public void setMobilePhoneNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS);
        }
    }

    public boolean getMobilePhoneNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS);
    }

    public UserWhereInput mobilePhoneNotEndsWith(String mobilePhoneNotEndsWith) {

        this.mobilePhoneNotEndsWith = mobilePhoneNotEndsWith;
        return this;
    }

    /**
     * Get mobilePhoneNotEndsWith
     *
     * @return mobilePhoneNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneNotEndsWith() {
        return mobilePhoneNotEndsWith;
    }

    public void setMobilePhoneNotEndsWith(String mobilePhoneNotEndsWith) {
        this.mobilePhoneNotEndsWith = mobilePhoneNotEndsWith;
    }

    public UserWhereInput mobilePhoneNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput mobilePhoneNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH);
        return this;
    }

    public void setMobilePhoneNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH);
        }
    }

    public boolean getMobilePhoneNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH);
    }

    public UserWhereInput mobilePhoneNotIn(List<String> mobilePhoneNotIn) {

        this.mobilePhoneNotIn = mobilePhoneNotIn;
        return this;
    }

    public UserWhereInput addMobilePhoneNotInItem(String mobilePhoneNotInItem) {
        if (this.mobilePhoneNotIn == null) {
            this.mobilePhoneNotIn = new ArrayList<String>();
        }
        this.mobilePhoneNotIn.add(mobilePhoneNotInItem);
        return this;
    }

    /**
     * Get mobilePhoneNotIn
     *
     * @return mobilePhoneNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMobilePhoneNotIn() {
        return mobilePhoneNotIn;
    }

    public void setMobilePhoneNotIn(List<String> mobilePhoneNotIn) {
        this.mobilePhoneNotIn = mobilePhoneNotIn;
    }

    public UserWhereInput mobilePhoneNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN);
        return this;
    }

    public UserWhereInput mobilePhoneNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN);
        return this;
    }

    public void setMobilePhoneNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN);
        }
    }

    public boolean getMobilePhoneNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN);
    }

    public UserWhereInput mobilePhoneNotStartsWith(String mobilePhoneNotStartsWith) {

        this.mobilePhoneNotStartsWith = mobilePhoneNotStartsWith;
        return this;
    }

    /**
     * Get mobilePhoneNotStartsWith
     *
     * @return mobilePhoneNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneNotStartsWith() {
        return mobilePhoneNotStartsWith;
    }

    public void setMobilePhoneNotStartsWith(String mobilePhoneNotStartsWith) {
        this.mobilePhoneNotStartsWith = mobilePhoneNotStartsWith;
    }

    public UserWhereInput mobilePhoneNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput mobilePhoneNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH);
        return this;
    }

    public void setMobilePhoneNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH);
        }
    }

    public boolean getMobilePhoneNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH);
    }

    public UserWhereInput mobilePhoneStartsWith(String mobilePhoneStartsWith) {

        this.mobilePhoneStartsWith = mobilePhoneStartsWith;
        return this;
    }

    /**
     * Get mobilePhoneStartsWith
     *
     * @return mobilePhoneStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMobilePhoneStartsWith() {
        return mobilePhoneStartsWith;
    }

    public void setMobilePhoneStartsWith(String mobilePhoneStartsWith) {
        this.mobilePhoneStartsWith = mobilePhoneStartsWith;
    }

    public UserWhereInput mobilePhoneStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH);
        return this;
    }

    public UserWhereInput mobilePhoneStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH);
        return this;
    }

    public void setMobilePhoneStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH);
        }
    }

    public boolean getMobilePhoneStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH);
    }

    public UserWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public UserWhereInput name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public UserWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public UserWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public UserWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public UserWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public UserWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public UserWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public UserWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public UserWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public UserWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public UserWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public UserWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public UserWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public UserWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public UserWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public UserWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public UserWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public UserWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public UserWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public UserWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public UserWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public UserWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public UserWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public UserWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public UserWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public UserWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public UserWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public UserWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public UserWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public UserWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public UserWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public UserWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public UserWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public UserWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public UserWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public UserWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public UserWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public UserWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public UserWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public UserWhereInput passwordExpired(Boolean passwordExpired) {

        this.passwordExpired = passwordExpired;
        return this;
    }

    /**
     * Get passwordExpired
     *
     * @return passwordExpired
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public UserWhereInput passwordExpired_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRED);
        return this;
    }

    public UserWhereInput passwordExpired_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRED);
        return this;
    }

    public void setPasswordExpired_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRED);
        }
    }

    public boolean getPasswordExpired_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_EXPIRED);
    }

    public UserWhereInput passwordExpiredNot(Boolean passwordExpiredNot) {

        this.passwordExpiredNot = passwordExpiredNot;
        return this;
    }

    /**
     * Get passwordExpiredNot
     *
     * @return passwordExpiredNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPasswordExpiredNot() {
        return passwordExpiredNot;
    }

    public void setPasswordExpiredNot(Boolean passwordExpiredNot) {
        this.passwordExpiredNot = passwordExpiredNot;
    }

    public UserWhereInput passwordExpiredNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT);
        return this;
    }

    public UserWhereInput passwordExpiredNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT);
        return this;
    }

    public void setPasswordExpiredNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT);
        }
    }

    public boolean getPasswordExpiredNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT);
    }

    public UserWhereInput passwordUpdatedAt(String passwordUpdatedAt) {

        this.passwordUpdatedAt = passwordUpdatedAt;
        return this;
    }

    /**
     * Get passwordUpdatedAt
     *
     * @return passwordUpdatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAt() {
        return passwordUpdatedAt;
    }

    public void setPasswordUpdatedAt(String passwordUpdatedAt) {
        this.passwordUpdatedAt = passwordUpdatedAt;
    }

    public UserWhereInput passwordUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
        return this;
    }

    public UserWhereInput passwordUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
        return this;
    }

    public void setPasswordUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
        }
    }

    public boolean getPasswordUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
    }

    public UserWhereInput passwordUpdatedAtGt(String passwordUpdatedAtGt) {

        this.passwordUpdatedAtGt = passwordUpdatedAtGt;
        return this;
    }

    /**
     * Get passwordUpdatedAtGt
     *
     * @return passwordUpdatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAtGt() {
        return passwordUpdatedAtGt;
    }

    public void setPasswordUpdatedAtGt(String passwordUpdatedAtGt) {
        this.passwordUpdatedAtGt = passwordUpdatedAtGt;
    }

    public UserWhereInput passwordUpdatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT);
        return this;
    }

    public UserWhereInput passwordUpdatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT);
        return this;
    }

    public void setPasswordUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT);
        }
    }

    public boolean getPasswordUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT);
    }

    public UserWhereInput passwordUpdatedAtGte(String passwordUpdatedAtGte) {

        this.passwordUpdatedAtGte = passwordUpdatedAtGte;
        return this;
    }

    /**
     * Get passwordUpdatedAtGte
     *
     * @return passwordUpdatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAtGte() {
        return passwordUpdatedAtGte;
    }

    public void setPasswordUpdatedAtGte(String passwordUpdatedAtGte) {
        this.passwordUpdatedAtGte = passwordUpdatedAtGte;
    }

    public UserWhereInput passwordUpdatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE);
        return this;
    }

    public UserWhereInput passwordUpdatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE);
        return this;
    }

    public void setPasswordUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE);
        }
    }

    public boolean getPasswordUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE);
    }

    public UserWhereInput passwordUpdatedAtIn(List<String> passwordUpdatedAtIn) {

        this.passwordUpdatedAtIn = passwordUpdatedAtIn;
        return this;
    }

    public UserWhereInput addPasswordUpdatedAtInItem(String passwordUpdatedAtInItem) {
        if (this.passwordUpdatedAtIn == null) {
            this.passwordUpdatedAtIn = new ArrayList<String>();
        }
        this.passwordUpdatedAtIn.add(passwordUpdatedAtInItem);
        return this;
    }

    /**
     * Get passwordUpdatedAtIn
     *
     * @return passwordUpdatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPasswordUpdatedAtIn() {
        return passwordUpdatedAtIn;
    }

    public void setPasswordUpdatedAtIn(List<String> passwordUpdatedAtIn) {
        this.passwordUpdatedAtIn = passwordUpdatedAtIn;
    }

    public UserWhereInput passwordUpdatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN);
        return this;
    }

    public UserWhereInput passwordUpdatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN);
        return this;
    }

    public void setPasswordUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN);
        }
    }

    public boolean getPasswordUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN);
    }

    public UserWhereInput passwordUpdatedAtLt(String passwordUpdatedAtLt) {

        this.passwordUpdatedAtLt = passwordUpdatedAtLt;
        return this;
    }

    /**
     * Get passwordUpdatedAtLt
     *
     * @return passwordUpdatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAtLt() {
        return passwordUpdatedAtLt;
    }

    public void setPasswordUpdatedAtLt(String passwordUpdatedAtLt) {
        this.passwordUpdatedAtLt = passwordUpdatedAtLt;
    }

    public UserWhereInput passwordUpdatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT);
        return this;
    }

    public UserWhereInput passwordUpdatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT);
        return this;
    }

    public void setPasswordUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT);
        }
    }

    public boolean getPasswordUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT);
    }

    public UserWhereInput passwordUpdatedAtLte(String passwordUpdatedAtLte) {

        this.passwordUpdatedAtLte = passwordUpdatedAtLte;
        return this;
    }

    /**
     * Get passwordUpdatedAtLte
     *
     * @return passwordUpdatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAtLte() {
        return passwordUpdatedAtLte;
    }

    public void setPasswordUpdatedAtLte(String passwordUpdatedAtLte) {
        this.passwordUpdatedAtLte = passwordUpdatedAtLte;
    }

    public UserWhereInput passwordUpdatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE);
        return this;
    }

    public UserWhereInput passwordUpdatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE);
        return this;
    }

    public void setPasswordUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE);
        }
    }

    public boolean getPasswordUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE);
    }

    public UserWhereInput passwordUpdatedAtNot(String passwordUpdatedAtNot) {

        this.passwordUpdatedAtNot = passwordUpdatedAtNot;
        return this;
    }

    /**
     * Get passwordUpdatedAtNot
     *
     * @return passwordUpdatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPasswordUpdatedAtNot() {
        return passwordUpdatedAtNot;
    }

    public void setPasswordUpdatedAtNot(String passwordUpdatedAtNot) {
        this.passwordUpdatedAtNot = passwordUpdatedAtNot;
    }

    public UserWhereInput passwordUpdatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT);
        return this;
    }

    public UserWhereInput passwordUpdatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT);
        return this;
    }

    public void setPasswordUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT);
        }
    }

    public boolean getPasswordUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT);
    }

    public UserWhereInput passwordUpdatedAtNotIn(List<String> passwordUpdatedAtNotIn) {

        this.passwordUpdatedAtNotIn = passwordUpdatedAtNotIn;
        return this;
    }

    public UserWhereInput addPasswordUpdatedAtNotInItem(String passwordUpdatedAtNotInItem) {
        if (this.passwordUpdatedAtNotIn == null) {
            this.passwordUpdatedAtNotIn = new ArrayList<String>();
        }
        this.passwordUpdatedAtNotIn.add(passwordUpdatedAtNotInItem);
        return this;
    }

    /**
     * Get passwordUpdatedAtNotIn
     *
     * @return passwordUpdatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPasswordUpdatedAtNotIn() {
        return passwordUpdatedAtNotIn;
    }

    public void setPasswordUpdatedAtNotIn(List<String> passwordUpdatedAtNotIn) {
        this.passwordUpdatedAtNotIn = passwordUpdatedAtNotIn;
    }

    public UserWhereInput passwordUpdatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN);
        return this;
    }

    public UserWhereInput passwordUpdatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setPasswordUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getPasswordUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN);
    }

    public UserWhereInput role(UserRole role) {

        this.role = role;
        return this;
    }

    /**
     * Get role
     *
     * @return role
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public UserWhereInput role_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE);
        return this;
    }

    public UserWhereInput role_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLE);
        return this;
    }

    public void setRole_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLE);
        }
    }

    public boolean getRole_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLE);
    }

    public UserWhereInput roleIn(List<UserRole> roleIn) {

        this.roleIn = roleIn;
        return this;
    }

    public UserWhereInput addRoleInItem(UserRole roleInItem) {
        if (this.roleIn == null) {
            this.roleIn = new ArrayList<UserRole>();
        }
        this.roleIn.add(roleInItem);
        return this;
    }

    /**
     * Get roleIn
     *
     * @return roleIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRole> getRoleIn() {
        return roleIn;
    }

    public void setRoleIn(List<UserRole> roleIn) {
        this.roleIn = roleIn;
    }

    public UserWhereInput roleIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE_IN);
        return this;
    }

    public UserWhereInput roleIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLE_IN);
        return this;
    }

    public void setRoleIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLE_IN);
        }
    }

    public boolean getRoleIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLE_IN);
    }

    public UserWhereInput roleNot(UserRole roleNot) {

        this.roleNot = roleNot;
        return this;
    }

    /**
     * Get roleNot
     *
     * @return roleNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRole getRoleNot() {
        return roleNot;
    }

    public void setRoleNot(UserRole roleNot) {
        this.roleNot = roleNot;
    }

    public UserWhereInput roleNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE_NOT);
        return this;
    }

    public UserWhereInput roleNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLE_NOT);
        return this;
    }

    public void setRoleNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLE_NOT);
        }
    }

    public boolean getRoleNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLE_NOT);
    }

    public UserWhereInput roleNotIn(List<UserRole> roleNotIn) {

        this.roleNotIn = roleNotIn;
        return this;
    }

    public UserWhereInput addRoleNotInItem(UserRole roleNotInItem) {
        if (this.roleNotIn == null) {
            this.roleNotIn = new ArrayList<UserRole>();
        }
        this.roleNotIn.add(roleNotInItem);
        return this;
    }

    /**
     * Get roleNotIn
     *
     * @return roleNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRole> getRoleNotIn() {
        return roleNotIn;
    }

    public void setRoleNotIn(List<UserRole> roleNotIn) {
        this.roleNotIn = roleNotIn;
    }

    public UserWhereInput roleNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE_NOT_IN);
        return this;
    }

    public UserWhereInput roleNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLE_NOT_IN);
        return this;
    }

    public void setRoleNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLE_NOT_IN);
        }
    }

    public boolean getRoleNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLE_NOT_IN);
    }

    public UserWhereInput rolesEvery(UserRoleNextWhereInput rolesEvery) {

        this.rolesEvery = rolesEvery;
        return this;
    }

    /**
     * Get rolesEvery
     *
     * @return rolesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesEvery() {
        return rolesEvery;
    }

    public void setRolesEvery(UserRoleNextWhereInput rolesEvery) {
        this.rolesEvery = rolesEvery;
    }

    public UserWhereInput rolesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_EVERY);
        return this;
    }

    public UserWhereInput rolesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_EVERY);
        return this;
    }

    public void setRolesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_EVERY);
        }
    }

    public boolean getRolesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_EVERY);
    }

    public UserWhereInput rolesNone(UserRoleNextWhereInput rolesNone) {

        this.rolesNone = rolesNone;
        return this;
    }

    /**
     * Get rolesNone
     *
     * @return rolesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesNone() {
        return rolesNone;
    }

    public void setRolesNone(UserRoleNextWhereInput rolesNone) {
        this.rolesNone = rolesNone;
    }

    public UserWhereInput rolesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_NONE);
        return this;
    }

    public UserWhereInput rolesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_NONE);
        return this;
    }

    public void setRolesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_NONE);
        }
    }

    public boolean getRolesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_NONE);
    }

    public UserWhereInput rolesSome(UserRoleNextWhereInput rolesSome) {

        this.rolesSome = rolesSome;
        return this;
    }

    /**
     * Get rolesSome
     *
     * @return rolesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesSome() {
        return rolesSome;
    }

    public void setRolesSome(UserRoleNextWhereInput rolesSome) {
        this.rolesSome = rolesSome;
    }

    public UserWhereInput rolesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_SOME);
        return this;
    }

    public UserWhereInput rolesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_SOME);
        return this;
    }

    public void setRolesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_SOME);
        }
    }

    public boolean getRolesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_SOME);
    }

    public UserWhereInput source(UserSource source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserSource getSource() {
        return source;
    }

    public void setSource(UserSource source) {
        this.source = source;
    }

    public UserWhereInput source_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public UserWhereInput source_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public void setSource_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        }
    }

    public boolean getSource_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE);
    }

    public UserWhereInput sourceIn(List<UserSource> sourceIn) {

        this.sourceIn = sourceIn;
        return this;
    }

    public UserWhereInput addSourceInItem(UserSource sourceInItem) {
        if (this.sourceIn == null) {
            this.sourceIn = new ArrayList<UserSource>();
        }
        this.sourceIn.add(sourceInItem);
        return this;
    }

    /**
     * Get sourceIn
     *
     * @return sourceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserSource> getSourceIn() {
        return sourceIn;
    }

    public void setSourceIn(List<UserSource> sourceIn) {
        this.sourceIn = sourceIn;
    }

    public UserWhereInput sourceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE_IN);
        return this;
    }

    public UserWhereInput sourceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE_IN);
        return this;
    }

    public void setSourceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE_IN);
        }
    }

    public boolean getSourceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE_IN);
    }

    public UserWhereInput sourceNot(UserSource sourceNot) {

        this.sourceNot = sourceNot;
        return this;
    }

    /**
     * Get sourceNot
     *
     * @return sourceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserSource getSourceNot() {
        return sourceNot;
    }

    public void setSourceNot(UserSource sourceNot) {
        this.sourceNot = sourceNot;
    }

    public UserWhereInput sourceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE_NOT);
        return this;
    }

    public UserWhereInput sourceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE_NOT);
        return this;
    }

    public void setSourceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE_NOT);
        }
    }

    public boolean getSourceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE_NOT);
    }

    public UserWhereInput sourceNotIn(List<UserSource> sourceNotIn) {

        this.sourceNotIn = sourceNotIn;
        return this;
    }

    public UserWhereInput addSourceNotInItem(UserSource sourceNotInItem) {
        if (this.sourceNotIn == null) {
            this.sourceNotIn = new ArrayList<UserSource>();
        }
        this.sourceNotIn.add(sourceNotInItem);
        return this;
    }

    /**
     * Get sourceNotIn
     *
     * @return sourceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserSource> getSourceNotIn() {
        return sourceNotIn;
    }

    public void setSourceNotIn(List<UserSource> sourceNotIn) {
        this.sourceNotIn = sourceNotIn;
    }

    public UserWhereInput sourceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE_NOT_IN);
        return this;
    }

    public UserWhereInput sourceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE_NOT_IN);
        return this;
    }

    public void setSourceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE_NOT_IN);
        }
    }

    public boolean getSourceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE_NOT_IN);
    }

    public UserWhereInput username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public UserWhereInput username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    public UserWhereInput usernameContains(String usernameContains) {

        this.usernameContains = usernameContains;
        return this;
    }

    /**
     * Get usernameContains
     *
     * @return usernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameContains() {
        return usernameContains;
    }

    public void setUsernameContains(String usernameContains) {
        this.usernameContains = usernameContains;
    }

    public UserWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public UserWhereInput usernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public void setUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        }
    }

    public boolean getUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_CONTAINS);
    }

    public UserWhereInput usernameEndsWith(String usernameEndsWith) {

        this.usernameEndsWith = usernameEndsWith;
        return this;
    }

    /**
     * Get usernameEndsWith
     *
     * @return usernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameEndsWith() {
        return usernameEndsWith;
    }

    public void setUsernameEndsWith(String usernameEndsWith) {
        this.usernameEndsWith = usernameEndsWith;
    }

    public UserWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public UserWhereInput usernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public void setUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        }
    }

    public boolean getUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_ENDS_WITH);
    }

    public UserWhereInput usernameGt(String usernameGt) {

        this.usernameGt = usernameGt;
        return this;
    }

    /**
     * Get usernameGt
     *
     * @return usernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGt() {
        return usernameGt;
    }

    public void setUsernameGt(String usernameGt) {
        this.usernameGt = usernameGt;
    }

    public UserWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public UserWhereInput usernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public void setUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        }
    }

    public boolean getUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GT);
    }

    public UserWhereInput usernameGte(String usernameGte) {

        this.usernameGte = usernameGte;
        return this;
    }

    /**
     * Get usernameGte
     *
     * @return usernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGte() {
        return usernameGte;
    }

    public void setUsernameGte(String usernameGte) {
        this.usernameGte = usernameGte;
    }

    public UserWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public UserWhereInput usernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public void setUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        }
    }

    public boolean getUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GTE);
    }

    public UserWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public UserWhereInput addUsernameInItem(String usernameInItem) {
        if (this.usernameIn == null) {
            this.usernameIn = new ArrayList<String>();
        }
        this.usernameIn.add(usernameInItem);
        return this;
    }

    /**
     * Get usernameIn
     *
     * @return usernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(List<String> usernameIn) {
        this.usernameIn = usernameIn;
    }

    public UserWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public UserWhereInput usernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public void setUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        }
    }

    public boolean getUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_IN);
    }

    public UserWhereInput usernameLt(String usernameLt) {

        this.usernameLt = usernameLt;
        return this;
    }

    /**
     * Get usernameLt
     *
     * @return usernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLt() {
        return usernameLt;
    }

    public void setUsernameLt(String usernameLt) {
        this.usernameLt = usernameLt;
    }

    public UserWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public UserWhereInput usernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public void setUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        }
    }

    public boolean getUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LT);
    }

    public UserWhereInput usernameLte(String usernameLte) {

        this.usernameLte = usernameLte;
        return this;
    }

    /**
     * Get usernameLte
     *
     * @return usernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLte() {
        return usernameLte;
    }

    public void setUsernameLte(String usernameLte) {
        this.usernameLte = usernameLte;
    }

    public UserWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public UserWhereInput usernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public void setUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        }
    }

    public boolean getUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LTE);
    }

    public UserWhereInput usernameNot(String usernameNot) {

        this.usernameNot = usernameNot;
        return this;
    }

    /**
     * Get usernameNot
     *
     * @return usernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNot() {
        return usernameNot;
    }

    public void setUsernameNot(String usernameNot) {
        this.usernameNot = usernameNot;
    }

    public UserWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public UserWhereInput usernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public void setUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        }
    }

    public boolean getUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT);
    }

    public UserWhereInput usernameNotContains(String usernameNotContains) {

        this.usernameNotContains = usernameNotContains;
        return this;
    }

    /**
     * Get usernameNotContains
     *
     * @return usernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotContains() {
        return usernameNotContains;
    }

    public void setUsernameNotContains(String usernameNotContains) {
        this.usernameNotContains = usernameNotContains;
    }

    public UserWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public UserWhereInput usernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
    }

    public UserWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

        this.usernameNotEndsWith = usernameNotEndsWith;
        return this;
    }

    /**
     * Get usernameNotEndsWith
     *
     * @return usernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotEndsWith() {
        return usernameNotEndsWith;
    }

    public void setUsernameNotEndsWith(String usernameNotEndsWith) {
        this.usernameNotEndsWith = usernameNotEndsWith;
    }

    public UserWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public UserWhereInput usernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
    }

    public UserWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public UserWhereInput addUsernameNotInItem(String usernameNotInItem) {
        if (this.usernameNotIn == null) {
            this.usernameNotIn = new ArrayList<String>();
        }
        this.usernameNotIn.add(usernameNotInItem);
        return this;
    }

    /**
     * Get usernameNotIn
     *
     * @return usernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameNotIn() {
        return usernameNotIn;
    }

    public void setUsernameNotIn(List<String> usernameNotIn) {
        this.usernameNotIn = usernameNotIn;
    }

    public UserWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public UserWhereInput usernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public void setUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        }
    }

    public boolean getUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_IN);
    }

    public UserWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

        this.usernameNotStartsWith = usernameNotStartsWith;
        return this;
    }

    /**
     * Get usernameNotStartsWith
     *
     * @return usernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotStartsWith() {
        return usernameNotStartsWith;
    }

    public void setUsernameNotStartsWith(String usernameNotStartsWith) {
        this.usernameNotStartsWith = usernameNotStartsWith;
    }

    public UserWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public UserWhereInput usernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
    }

    public UserWhereInput usernameStartsWith(String usernameStartsWith) {

        this.usernameStartsWith = usernameStartsWith;
        return this;
    }

    /**
     * Get usernameStartsWith
     *
     * @return usernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameStartsWith() {
        return usernameStartsWith;
    }

    public void setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
    }

    public UserWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public UserWhereInput usernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public void setUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        }
    }

    public boolean getUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserWhereInput userWhereInput = (UserWhereInput) o;
        return Objects.equals(this.AND, userWhereInput.AND)
                && Objects.equals(this.NOT, userWhereInput.NOT)
                && Objects.equals(this.OR, userWhereInput.OR)
                && Objects.equals(this.authConfigId, userWhereInput.authConfigId)
                && Objects.equals(this.authConfigIdContains, userWhereInput.authConfigIdContains)
                && Objects.equals(this.authConfigIdEndsWith, userWhereInput.authConfigIdEndsWith)
                && Objects.equals(this.authConfigIdGt, userWhereInput.authConfigIdGt)
                && Objects.equals(this.authConfigIdGte, userWhereInput.authConfigIdGte)
                && Objects.equals(this.authConfigIdIn, userWhereInput.authConfigIdIn)
                && Objects.equals(this.authConfigIdLt, userWhereInput.authConfigIdLt)
                && Objects.equals(this.authConfigIdLte, userWhereInput.authConfigIdLte)
                && Objects.equals(this.authConfigIdNot, userWhereInput.authConfigIdNot)
                && Objects.equals(
                        this.authConfigIdNotContains, userWhereInput.authConfigIdNotContains)
                && Objects.equals(
                        this.authConfigIdNotEndsWith, userWhereInput.authConfigIdNotEndsWith)
                && Objects.equals(this.authConfigIdNotIn, userWhereInput.authConfigIdNotIn)
                && Objects.equals(
                        this.authConfigIdNotStartsWith, userWhereInput.authConfigIdNotStartsWith)
                && Objects.equals(
                        this.authConfigIdStartsWith, userWhereInput.authConfigIdStartsWith)
                && Objects.equals(this.displayUsername, userWhereInput.displayUsername)
                && Objects.equals(
                        this.displayUsernameContains, userWhereInput.displayUsernameContains)
                && Objects.equals(
                        this.displayUsernameEndsWith, userWhereInput.displayUsernameEndsWith)
                && Objects.equals(this.displayUsernameGt, userWhereInput.displayUsernameGt)
                && Objects.equals(this.displayUsernameGte, userWhereInput.displayUsernameGte)
                && Objects.equals(this.displayUsernameIn, userWhereInput.displayUsernameIn)
                && Objects.equals(this.displayUsernameLt, userWhereInput.displayUsernameLt)
                && Objects.equals(this.displayUsernameLte, userWhereInput.displayUsernameLte)
                && Objects.equals(this.displayUsernameNot, userWhereInput.displayUsernameNot)
                && Objects.equals(
                        this.displayUsernameNotContains, userWhereInput.displayUsernameNotContains)
                && Objects.equals(
                        this.displayUsernameNotEndsWith, userWhereInput.displayUsernameNotEndsWith)
                && Objects.equals(this.displayUsernameNotIn, userWhereInput.displayUsernameNotIn)
                && Objects.equals(
                        this.displayUsernameNotStartsWith,
                        userWhereInput.displayUsernameNotStartsWith)
                && Objects.equals(
                        this.displayUsernameStartsWith, userWhereInput.displayUsernameStartsWith)
                && Objects.equals(this.emailAddress, userWhereInput.emailAddress)
                && Objects.equals(this.emailAddressContains, userWhereInput.emailAddressContains)
                && Objects.equals(this.emailAddressEndsWith, userWhereInput.emailAddressEndsWith)
                && Objects.equals(this.emailAddressGt, userWhereInput.emailAddressGt)
                && Objects.equals(this.emailAddressGte, userWhereInput.emailAddressGte)
                && Objects.equals(this.emailAddressIn, userWhereInput.emailAddressIn)
                && Objects.equals(this.emailAddressLt, userWhereInput.emailAddressLt)
                && Objects.equals(this.emailAddressLte, userWhereInput.emailAddressLte)
                && Objects.equals(this.emailAddressNot, userWhereInput.emailAddressNot)
                && Objects.equals(
                        this.emailAddressNotContains, userWhereInput.emailAddressNotContains)
                && Objects.equals(
                        this.emailAddressNotEndsWith, userWhereInput.emailAddressNotEndsWith)
                && Objects.equals(this.emailAddressNotIn, userWhereInput.emailAddressNotIn)
                && Objects.equals(
                        this.emailAddressNotStartsWith, userWhereInput.emailAddressNotStartsWith)
                && Objects.equals(
                        this.emailAddressStartsWith, userWhereInput.emailAddressStartsWith)
                && Objects.equals(this.id, userWhereInput.id)
                && Objects.equals(this.idContains, userWhereInput.idContains)
                && Objects.equals(this.idEndsWith, userWhereInput.idEndsWith)
                && Objects.equals(this.idGt, userWhereInput.idGt)
                && Objects.equals(this.idGte, userWhereInput.idGte)
                && Objects.equals(this.idIn, userWhereInput.idIn)
                && Objects.equals(this.idLt, userWhereInput.idLt)
                && Objects.equals(this.idLte, userWhereInput.idLte)
                && Objects.equals(this.idNot, userWhereInput.idNot)
                && Objects.equals(this.idNotContains, userWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, userWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, userWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, userWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, userWhereInput.idStartsWith)
                && Objects.equals(this.internal, userWhereInput.internal)
                && Objects.equals(this.internalNot, userWhereInput.internalNot)
                && Objects.equals(this.ldapDn, userWhereInput.ldapDn)
                && Objects.equals(this.ldapDnContains, userWhereInput.ldapDnContains)
                && Objects.equals(this.ldapDnEndsWith, userWhereInput.ldapDnEndsWith)
                && Objects.equals(this.ldapDnGt, userWhereInput.ldapDnGt)
                && Objects.equals(this.ldapDnGte, userWhereInput.ldapDnGte)
                && Objects.equals(this.ldapDnIn, userWhereInput.ldapDnIn)
                && Objects.equals(this.ldapDnLt, userWhereInput.ldapDnLt)
                && Objects.equals(this.ldapDnLte, userWhereInput.ldapDnLte)
                && Objects.equals(this.ldapDnNot, userWhereInput.ldapDnNot)
                && Objects.equals(this.ldapDnNotContains, userWhereInput.ldapDnNotContains)
                && Objects.equals(this.ldapDnNotEndsWith, userWhereInput.ldapDnNotEndsWith)
                && Objects.equals(this.ldapDnNotIn, userWhereInput.ldapDnNotIn)
                && Objects.equals(this.ldapDnNotStartsWith, userWhereInput.ldapDnNotStartsWith)
                && Objects.equals(this.ldapDnStartsWith, userWhereInput.ldapDnStartsWith)
                && Objects.equals(this.mobilePhone, userWhereInput.mobilePhone)
                && Objects.equals(this.mobilePhoneContains, userWhereInput.mobilePhoneContains)
                && Objects.equals(this.mobilePhoneEndsWith, userWhereInput.mobilePhoneEndsWith)
                && Objects.equals(this.mobilePhoneGt, userWhereInput.mobilePhoneGt)
                && Objects.equals(this.mobilePhoneGte, userWhereInput.mobilePhoneGte)
                && Objects.equals(this.mobilePhoneIn, userWhereInput.mobilePhoneIn)
                && Objects.equals(this.mobilePhoneLt, userWhereInput.mobilePhoneLt)
                && Objects.equals(this.mobilePhoneLte, userWhereInput.mobilePhoneLte)
                && Objects.equals(this.mobilePhoneNot, userWhereInput.mobilePhoneNot)
                && Objects.equals(
                        this.mobilePhoneNotContains, userWhereInput.mobilePhoneNotContains)
                && Objects.equals(
                        this.mobilePhoneNotEndsWith, userWhereInput.mobilePhoneNotEndsWith)
                && Objects.equals(this.mobilePhoneNotIn, userWhereInput.mobilePhoneNotIn)
                && Objects.equals(
                        this.mobilePhoneNotStartsWith, userWhereInput.mobilePhoneNotStartsWith)
                && Objects.equals(this.mobilePhoneStartsWith, userWhereInput.mobilePhoneStartsWith)
                && Objects.equals(this.name, userWhereInput.name)
                && Objects.equals(this.nameContains, userWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, userWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, userWhereInput.nameGt)
                && Objects.equals(this.nameGte, userWhereInput.nameGte)
                && Objects.equals(this.nameIn, userWhereInput.nameIn)
                && Objects.equals(this.nameLt, userWhereInput.nameLt)
                && Objects.equals(this.nameLte, userWhereInput.nameLte)
                && Objects.equals(this.nameNot, userWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, userWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, userWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, userWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, userWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, userWhereInput.nameStartsWith)
                && Objects.equals(this.passwordExpired, userWhereInput.passwordExpired)
                && Objects.equals(this.passwordExpiredNot, userWhereInput.passwordExpiredNot)
                && Objects.equals(this.passwordUpdatedAt, userWhereInput.passwordUpdatedAt)
                && Objects.equals(this.passwordUpdatedAtGt, userWhereInput.passwordUpdatedAtGt)
                && Objects.equals(this.passwordUpdatedAtGte, userWhereInput.passwordUpdatedAtGte)
                && Objects.equals(this.passwordUpdatedAtIn, userWhereInput.passwordUpdatedAtIn)
                && Objects.equals(this.passwordUpdatedAtLt, userWhereInput.passwordUpdatedAtLt)
                && Objects.equals(this.passwordUpdatedAtLte, userWhereInput.passwordUpdatedAtLte)
                && Objects.equals(this.passwordUpdatedAtNot, userWhereInput.passwordUpdatedAtNot)
                && Objects.equals(
                        this.passwordUpdatedAtNotIn, userWhereInput.passwordUpdatedAtNotIn)
                && Objects.equals(this.role, userWhereInput.role)
                && Objects.equals(this.roleIn, userWhereInput.roleIn)
                && Objects.equals(this.roleNot, userWhereInput.roleNot)
                && Objects.equals(this.roleNotIn, userWhereInput.roleNotIn)
                && Objects.equals(this.rolesEvery, userWhereInput.rolesEvery)
                && Objects.equals(this.rolesNone, userWhereInput.rolesNone)
                && Objects.equals(this.rolesSome, userWhereInput.rolesSome)
                && Objects.equals(this.source, userWhereInput.source)
                && Objects.equals(this.sourceIn, userWhereInput.sourceIn)
                && Objects.equals(this.sourceNot, userWhereInput.sourceNot)
                && Objects.equals(this.sourceNotIn, userWhereInput.sourceNotIn)
                && Objects.equals(this.username, userWhereInput.username)
                && Objects.equals(this.usernameContains, userWhereInput.usernameContains)
                && Objects.equals(this.usernameEndsWith, userWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, userWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, userWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, userWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, userWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, userWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, userWhereInput.usernameNot)
                && Objects.equals(this.usernameNotContains, userWhereInput.usernameNotContains)
                && Objects.equals(this.usernameNotEndsWith, userWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, userWhereInput.usernameNotIn)
                && Objects.equals(this.usernameNotStartsWith, userWhereInput.usernameNotStartsWith)
                && Objects.equals(this.usernameStartsWith, userWhereInput.usernameStartsWith);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                AND,
                NOT,
                OR,
                authConfigId,
                authConfigIdContains,
                authConfigIdEndsWith,
                authConfigIdGt,
                authConfigIdGte,
                authConfigIdIn,
                authConfigIdLt,
                authConfigIdLte,
                authConfigIdNot,
                authConfigIdNotContains,
                authConfigIdNotEndsWith,
                authConfigIdNotIn,
                authConfigIdNotStartsWith,
                authConfigIdStartsWith,
                displayUsername,
                displayUsernameContains,
                displayUsernameEndsWith,
                displayUsernameGt,
                displayUsernameGte,
                displayUsernameIn,
                displayUsernameLt,
                displayUsernameLte,
                displayUsernameNot,
                displayUsernameNotContains,
                displayUsernameNotEndsWith,
                displayUsernameNotIn,
                displayUsernameNotStartsWith,
                displayUsernameStartsWith,
                emailAddress,
                emailAddressContains,
                emailAddressEndsWith,
                emailAddressGt,
                emailAddressGte,
                emailAddressIn,
                emailAddressLt,
                emailAddressLte,
                emailAddressNot,
                emailAddressNotContains,
                emailAddressNotEndsWith,
                emailAddressNotIn,
                emailAddressNotStartsWith,
                emailAddressStartsWith,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                internal,
                internalNot,
                ldapDn,
                ldapDnContains,
                ldapDnEndsWith,
                ldapDnGt,
                ldapDnGte,
                ldapDnIn,
                ldapDnLt,
                ldapDnLte,
                ldapDnNot,
                ldapDnNotContains,
                ldapDnNotEndsWith,
                ldapDnNotIn,
                ldapDnNotStartsWith,
                ldapDnStartsWith,
                mobilePhone,
                mobilePhoneContains,
                mobilePhoneEndsWith,
                mobilePhoneGt,
                mobilePhoneGte,
                mobilePhoneIn,
                mobilePhoneLt,
                mobilePhoneLte,
                mobilePhoneNot,
                mobilePhoneNotContains,
                mobilePhoneNotEndsWith,
                mobilePhoneNotIn,
                mobilePhoneNotStartsWith,
                mobilePhoneStartsWith,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                passwordExpired,
                passwordExpiredNot,
                passwordUpdatedAt,
                passwordUpdatedAtGt,
                passwordUpdatedAtGte,
                passwordUpdatedAtIn,
                passwordUpdatedAtLt,
                passwordUpdatedAtLte,
                passwordUpdatedAtNot,
                passwordUpdatedAtNotIn,
                role,
                roleIn,
                roleNot,
                roleNotIn,
                rolesEvery,
                rolesNone,
                rolesSome,
                source,
                sourceIn,
                sourceNot,
                sourceNotIn,
                username,
                usernameContains,
                usernameEndsWith,
                usernameGt,
                usernameGte,
                usernameIn,
                usernameLt,
                usernameLte,
                usernameNot,
                usernameNotContains,
                usernameNotEndsWith,
                usernameNotIn,
                usernameNotStartsWith,
                usernameStartsWith);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    authConfigIdContains: ")
                .append(toIndentedString(authConfigIdContains))
                .append("\n");
        sb.append("    authConfigIdEndsWith: ")
                .append(toIndentedString(authConfigIdEndsWith))
                .append("\n");
        sb.append("    authConfigIdGt: ").append(toIndentedString(authConfigIdGt)).append("\n");
        sb.append("    authConfigIdGte: ").append(toIndentedString(authConfigIdGte)).append("\n");
        sb.append("    authConfigIdIn: ").append(toIndentedString(authConfigIdIn)).append("\n");
        sb.append("    authConfigIdLt: ").append(toIndentedString(authConfigIdLt)).append("\n");
        sb.append("    authConfigIdLte: ").append(toIndentedString(authConfigIdLte)).append("\n");
        sb.append("    authConfigIdNot: ").append(toIndentedString(authConfigIdNot)).append("\n");
        sb.append("    authConfigIdNotContains: ")
                .append(toIndentedString(authConfigIdNotContains))
                .append("\n");
        sb.append("    authConfigIdNotEndsWith: ")
                .append(toIndentedString(authConfigIdNotEndsWith))
                .append("\n");
        sb.append("    authConfigIdNotIn: ")
                .append(toIndentedString(authConfigIdNotIn))
                .append("\n");
        sb.append("    authConfigIdNotStartsWith: ")
                .append(toIndentedString(authConfigIdNotStartsWith))
                .append("\n");
        sb.append("    authConfigIdStartsWith: ")
                .append(toIndentedString(authConfigIdStartsWith))
                .append("\n");
        sb.append("    displayUsername: ").append(toIndentedString(displayUsername)).append("\n");
        sb.append("    displayUsernameContains: ")
                .append(toIndentedString(displayUsernameContains))
                .append("\n");
        sb.append("    displayUsernameEndsWith: ")
                .append(toIndentedString(displayUsernameEndsWith))
                .append("\n");
        sb.append("    displayUsernameGt: ")
                .append(toIndentedString(displayUsernameGt))
                .append("\n");
        sb.append("    displayUsernameGte: ")
                .append(toIndentedString(displayUsernameGte))
                .append("\n");
        sb.append("    displayUsernameIn: ")
                .append(toIndentedString(displayUsernameIn))
                .append("\n");
        sb.append("    displayUsernameLt: ")
                .append(toIndentedString(displayUsernameLt))
                .append("\n");
        sb.append("    displayUsernameLte: ")
                .append(toIndentedString(displayUsernameLte))
                .append("\n");
        sb.append("    displayUsernameNot: ")
                .append(toIndentedString(displayUsernameNot))
                .append("\n");
        sb.append("    displayUsernameNotContains: ")
                .append(toIndentedString(displayUsernameNotContains))
                .append("\n");
        sb.append("    displayUsernameNotEndsWith: ")
                .append(toIndentedString(displayUsernameNotEndsWith))
                .append("\n");
        sb.append("    displayUsernameNotIn: ")
                .append(toIndentedString(displayUsernameNotIn))
                .append("\n");
        sb.append("    displayUsernameNotStartsWith: ")
                .append(toIndentedString(displayUsernameNotStartsWith))
                .append("\n");
        sb.append("    displayUsernameStartsWith: ")
                .append(toIndentedString(displayUsernameStartsWith))
                .append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    emailAddressContains: ")
                .append(toIndentedString(emailAddressContains))
                .append("\n");
        sb.append("    emailAddressEndsWith: ")
                .append(toIndentedString(emailAddressEndsWith))
                .append("\n");
        sb.append("    emailAddressGt: ").append(toIndentedString(emailAddressGt)).append("\n");
        sb.append("    emailAddressGte: ").append(toIndentedString(emailAddressGte)).append("\n");
        sb.append("    emailAddressIn: ").append(toIndentedString(emailAddressIn)).append("\n");
        sb.append("    emailAddressLt: ").append(toIndentedString(emailAddressLt)).append("\n");
        sb.append("    emailAddressLte: ").append(toIndentedString(emailAddressLte)).append("\n");
        sb.append("    emailAddressNot: ").append(toIndentedString(emailAddressNot)).append("\n");
        sb.append("    emailAddressNotContains: ")
                .append(toIndentedString(emailAddressNotContains))
                .append("\n");
        sb.append("    emailAddressNotEndsWith: ")
                .append(toIndentedString(emailAddressNotEndsWith))
                .append("\n");
        sb.append("    emailAddressNotIn: ")
                .append(toIndentedString(emailAddressNotIn))
                .append("\n");
        sb.append("    emailAddressNotStartsWith: ")
                .append(toIndentedString(emailAddressNotStartsWith))
                .append("\n");
        sb.append("    emailAddressStartsWith: ")
                .append(toIndentedString(emailAddressStartsWith))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
        sb.append("    ldapDnContains: ").append(toIndentedString(ldapDnContains)).append("\n");
        sb.append("    ldapDnEndsWith: ").append(toIndentedString(ldapDnEndsWith)).append("\n");
        sb.append("    ldapDnGt: ").append(toIndentedString(ldapDnGt)).append("\n");
        sb.append("    ldapDnGte: ").append(toIndentedString(ldapDnGte)).append("\n");
        sb.append("    ldapDnIn: ").append(toIndentedString(ldapDnIn)).append("\n");
        sb.append("    ldapDnLt: ").append(toIndentedString(ldapDnLt)).append("\n");
        sb.append("    ldapDnLte: ").append(toIndentedString(ldapDnLte)).append("\n");
        sb.append("    ldapDnNot: ").append(toIndentedString(ldapDnNot)).append("\n");
        sb.append("    ldapDnNotContains: ")
                .append(toIndentedString(ldapDnNotContains))
                .append("\n");
        sb.append("    ldapDnNotEndsWith: ")
                .append(toIndentedString(ldapDnNotEndsWith))
                .append("\n");
        sb.append("    ldapDnNotIn: ").append(toIndentedString(ldapDnNotIn)).append("\n");
        sb.append("    ldapDnNotStartsWith: ")
                .append(toIndentedString(ldapDnNotStartsWith))
                .append("\n");
        sb.append("    ldapDnStartsWith: ").append(toIndentedString(ldapDnStartsWith)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    mobilePhoneContains: ")
                .append(toIndentedString(mobilePhoneContains))
                .append("\n");
        sb.append("    mobilePhoneEndsWith: ")
                .append(toIndentedString(mobilePhoneEndsWith))
                .append("\n");
        sb.append("    mobilePhoneGt: ").append(toIndentedString(mobilePhoneGt)).append("\n");
        sb.append("    mobilePhoneGte: ").append(toIndentedString(mobilePhoneGte)).append("\n");
        sb.append("    mobilePhoneIn: ").append(toIndentedString(mobilePhoneIn)).append("\n");
        sb.append("    mobilePhoneLt: ").append(toIndentedString(mobilePhoneLt)).append("\n");
        sb.append("    mobilePhoneLte: ").append(toIndentedString(mobilePhoneLte)).append("\n");
        sb.append("    mobilePhoneNot: ").append(toIndentedString(mobilePhoneNot)).append("\n");
        sb.append("    mobilePhoneNotContains: ")
                .append(toIndentedString(mobilePhoneNotContains))
                .append("\n");
        sb.append("    mobilePhoneNotEndsWith: ")
                .append(toIndentedString(mobilePhoneNotEndsWith))
                .append("\n");
        sb.append("    mobilePhoneNotIn: ").append(toIndentedString(mobilePhoneNotIn)).append("\n");
        sb.append("    mobilePhoneNotStartsWith: ")
                .append(toIndentedString(mobilePhoneNotStartsWith))
                .append("\n");
        sb.append("    mobilePhoneStartsWith: ")
                .append(toIndentedString(mobilePhoneStartsWith))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
        sb.append("    passwordExpiredNot: ")
                .append(toIndentedString(passwordExpiredNot))
                .append("\n");
        sb.append("    passwordUpdatedAt: ")
                .append(toIndentedString(passwordUpdatedAt))
                .append("\n");
        sb.append("    passwordUpdatedAtGt: ")
                .append(toIndentedString(passwordUpdatedAtGt))
                .append("\n");
        sb.append("    passwordUpdatedAtGte: ")
                .append(toIndentedString(passwordUpdatedAtGte))
                .append("\n");
        sb.append("    passwordUpdatedAtIn: ")
                .append(toIndentedString(passwordUpdatedAtIn))
                .append("\n");
        sb.append("    passwordUpdatedAtLt: ")
                .append(toIndentedString(passwordUpdatedAtLt))
                .append("\n");
        sb.append("    passwordUpdatedAtLte: ")
                .append(toIndentedString(passwordUpdatedAtLte))
                .append("\n");
        sb.append("    passwordUpdatedAtNot: ")
                .append(toIndentedString(passwordUpdatedAtNot))
                .append("\n");
        sb.append("    passwordUpdatedAtNotIn: ")
                .append(toIndentedString(passwordUpdatedAtNotIn))
                .append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roleIn: ").append(toIndentedString(roleIn)).append("\n");
        sb.append("    roleNot: ").append(toIndentedString(roleNot)).append("\n");
        sb.append("    roleNotIn: ").append(toIndentedString(roleNotIn)).append("\n");
        sb.append("    rolesEvery: ").append(toIndentedString(rolesEvery)).append("\n");
        sb.append("    rolesNone: ").append(toIndentedString(rolesNone)).append("\n");
        sb.append("    rolesSome: ").append(toIndentedString(rolesSome)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceIn: ").append(toIndentedString(sourceIn)).append("\n");
        sb.append("    sourceNot: ").append(toIndentedString(sourceNot)).append("\n");
        sb.append("    sourceNotIn: ").append(toIndentedString(sourceNotIn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
        sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
        sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
        sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
        sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
        sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
        sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
        sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
        sb.append("    usernameNotContains: ")
                .append(toIndentedString(usernameNotContains))
                .append("\n");
        sb.append("    usernameNotEndsWith: ")
                .append(toIndentedString(usernameNotEndsWith))
                .append("\n");
        sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
        sb.append("    usernameNotStartsWith: ")
                .append(toIndentedString(usernameNotStartsWith))
                .append("\n");
        sb.append("    usernameStartsWith: ")
                .append(toIndentedString(usernameStartsWith))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
