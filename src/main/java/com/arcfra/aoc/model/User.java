package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** User */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class User extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";

    @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
    private String authConfigId;

    public static final String SERIALIZED_NAME_DISPLAY_USERNAME = "display_username";

    @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME)
    private String displayUsername;

    public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";

    @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
    private String emailAddress;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_LDAP_DN = "ldap_dn";

    @SerializedName(SERIALIZED_NAME_LDAP_DN)
    private String ldapDn;

    public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";

    @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
    private String mobilePhone;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PASSWORD_EXPIRED = "password_expired";

    @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED)
    private Boolean passwordExpired;

    public static final String SERIALIZED_NAME_PASSWORD_RECOVER_QA = "password_recover_qa";

    @SerializedName(SERIALIZED_NAME_PASSWORD_RECOVER_QA)
    private NestedPasswordRecoverQa passwordRecoverQa;

    public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT = "password_updated_at";

    @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT)
    private String passwordUpdatedAt;

    public static final String SERIALIZED_NAME_ROLE = "role";

    @SerializedName(SERIALIZED_NAME_ROLE)
    private UserRole role;

    public static final String SERIALIZED_NAME_ROLES = "roles";

    @SerializedName(SERIALIZED_NAME_ROLES)
    private List<NestedUserRoleNext> roles = null;

    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private UserSource source;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public User() {}

    public User authConfigId(String authConfigId) {

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

    public User authConfigId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_CONFIG_ID);
        return this;
    }

    public User authConfigId_ExplictlyNonNull() {
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

    public User displayUsername(String displayUsername) {

        this.displayUsername = displayUsername;
        return this;
    }

    /**
     * Get displayUsername
     *
     * @return displayUsername
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDisplayUsername() {
        return displayUsername;
    }

    public void setDisplayUsername(String displayUsername) {
        this.displayUsername = displayUsername;
    }

    public User displayUsername_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_USERNAME);
        return this;
    }

    public User displayUsername_ExplictlyNonNull() {
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

    public User emailAddress(String emailAddress) {

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

    public User emailAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_ADDRESS);
        return this;
    }

    public User emailAddress_ExplictlyNonNull() {
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

    public User id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public User id_ExplictlyNonNull() {
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

    public User internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public User internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public User internal_ExplictlyNonNull() {
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

    public User ldapDn(String ldapDn) {

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

    public User ldapDn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LDAP_DN);
        return this;
    }

    public User ldapDn_ExplictlyNonNull() {
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

    public User mobilePhone(String mobilePhone) {

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

    public User mobilePhone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOBILE_PHONE);
        return this;
    }

    public User mobilePhone_ExplictlyNonNull() {
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

    public User name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public User name_ExplictlyNonNull() {
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

    public User passwordExpired(Boolean passwordExpired) {

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

    public User passwordExpired_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRED);
        return this;
    }

    public User passwordExpired_ExplictlyNonNull() {
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

    public User passwordRecoverQa(NestedPasswordRecoverQa passwordRecoverQa) {

        this.passwordRecoverQa = passwordRecoverQa;
        return this;
    }

    /**
     * Get passwordRecoverQa
     *
     * @return passwordRecoverQa
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedPasswordRecoverQa getPasswordRecoverQa() {
        return passwordRecoverQa;
    }

    public void setPasswordRecoverQa(NestedPasswordRecoverQa passwordRecoverQa) {
        this.passwordRecoverQa = passwordRecoverQa;
    }

    public User passwordRecoverQa_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_RECOVER_QA);
        return this;
    }

    public User passwordRecoverQa_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_RECOVER_QA);
        return this;
    }

    public void setPasswordRecoverQa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_RECOVER_QA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_RECOVER_QA);
        }
    }

    public boolean getPasswordRecoverQa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_RECOVER_QA);
    }

    public User passwordUpdatedAt(String passwordUpdatedAt) {

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

    public User passwordUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_UPDATED_AT);
        return this;
    }

    public User passwordUpdatedAt_ExplictlyNonNull() {
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

    public User role(UserRole role) {

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

    public User role_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE);
        return this;
    }

    public User role_ExplictlyNonNull() {
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

    public User roles(List<NestedUserRoleNext> roles) {

        this.roles = roles;
        return this;
    }

    public User addRolesItem(NestedUserRoleNext rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<NestedUserRoleNext>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * Get roles
     *
     * @return roles
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedUserRoleNext> getRoles() {
        return roles;
    }

    public void setRoles(List<NestedUserRoleNext> roles) {
        this.roles = roles;
    }

    public User roles_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES);
        return this;
    }

    public User roles_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES);
        return this;
    }

    public void setRoles_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES);
        }
    }

    public boolean getRoles_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES);
    }

    public User source(UserSource source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UserSource getSource() {
        return source;
    }

    public void setSource(UserSource source) {
        this.source = source;
    }

    public User source_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public User source_ExplictlyNonNull() {
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

    public User username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public User username_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.authConfigId, user.authConfigId)
                && Objects.equals(this.displayUsername, user.displayUsername)
                && Objects.equals(this.emailAddress, user.emailAddress)
                && Objects.equals(this.id, user.id)
                && Objects.equals(this.internal, user.internal)
                && Objects.equals(this.ldapDn, user.ldapDn)
                && Objects.equals(this.mobilePhone, user.mobilePhone)
                && Objects.equals(this.name, user.name)
                && Objects.equals(this.passwordExpired, user.passwordExpired)
                && Objects.equals(this.passwordRecoverQa, user.passwordRecoverQa)
                && Objects.equals(this.passwordUpdatedAt, user.passwordUpdatedAt)
                && Objects.equals(this.role, user.role)
                && Objects.equals(this.roles, user.roles)
                && Objects.equals(this.source, user.source)
                && Objects.equals(this.username, user.username);
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
                authConfigId,
                displayUsername,
                emailAddress,
                id,
                internal,
                ldapDn,
                mobilePhone,
                name,
                passwordExpired,
                passwordRecoverQa,
                passwordUpdatedAt,
                role,
                roles,
                source,
                username);
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
        sb.append("class User {\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    displayUsername: ").append(toIndentedString(displayUsername)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
        sb.append("    passwordRecoverQa: ")
                .append(toIndentedString(passwordRecoverQa))
                .append("\n");
        sb.append("    passwordUpdatedAt: ")
                .append(toIndentedString(passwordUpdatedAt))
                .append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
