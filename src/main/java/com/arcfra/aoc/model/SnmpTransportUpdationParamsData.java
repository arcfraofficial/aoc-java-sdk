package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SnmpTransportUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnmpTransportUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL = "privacy_protocol";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL)
    private SnmpPrivacyProtocol privacyProtocol;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE = "privacy_pass_phrase";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE)
    private String privacyPassPhrase;

    public static final String SERIALIZED_NAME_AUTH_PROTOCOL = "auth_protocol";

    @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL)
    private SnmpAuthProtocol authProtocol;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE = "auth_pass_phrase";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE)
    private String authPassPhrase;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_COMMUNITY = "community";

    @SerializedName(SERIALIZED_NAME_COMMUNITY)
    private String community;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private SnmpProtocol protocol;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private SnmpVersion version;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SnmpTransportUpdationParamsData() {}

    public SnmpTransportUpdationParamsData disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public SnmpTransportUpdationParamsData disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public SnmpTransportUpdationParamsData disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public SnmpTransportUpdationParamsData privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {

        this.privacyProtocol = privacyProtocol;
        return this;
    }

    /**
     * Get privacyProtocol
     *
     * @return privacyProtocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpPrivacyProtocol getPrivacyProtocol() {
        return privacyProtocol;
    }

    public void setPrivacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
    }

    public SnmpTransportUpdationParamsData privacyProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public SnmpTransportUpdationParamsData privacyProtocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public void setPrivacyProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        }
    }

    public boolean getPrivacyProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PROTOCOL);
    }

    public SnmpTransportUpdationParamsData privacyPassPhrase(String privacyPassPhrase) {

        this.privacyPassPhrase = privacyPassPhrase;
        return this;
    }

    /**
     * Get privacyPassPhrase
     *
     * @return privacyPassPhrase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhrase() {
        return privacyPassPhrase;
    }

    public void setPrivacyPassPhrase(String privacyPassPhrase) {
        this.privacyPassPhrase = privacyPassPhrase;
    }

    public SnmpTransportUpdationParamsData privacyPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public SnmpTransportUpdationParamsData privacyPassPhrase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public void setPrivacyPassPhrase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        }
    }

    public boolean getPrivacyPassPhrase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
    }

    public SnmpTransportUpdationParamsData authProtocol(SnmpAuthProtocol authProtocol) {

        this.authProtocol = authProtocol;
        return this;
    }

    /**
     * Get authProtocol
     *
     * @return authProtocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpAuthProtocol getAuthProtocol() {
        return authProtocol;
    }

    public void setAuthProtocol(SnmpAuthProtocol authProtocol) {
        this.authProtocol = authProtocol;
    }

    public SnmpTransportUpdationParamsData authProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public SnmpTransportUpdationParamsData authProtocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public void setAuthProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL);
        }
    }

    public boolean getAuthProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PROTOCOL);
    }

    public SnmpTransportUpdationParamsData authPassPhrase(String authPassPhrase) {

        this.authPassPhrase = authPassPhrase;
        return this;
    }

    /**
     * Get authPassPhrase
     *
     * @return authPassPhrase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhrase() {
        return authPassPhrase;
    }

    public void setAuthPassPhrase(String authPassPhrase) {
        this.authPassPhrase = authPassPhrase;
    }

    public SnmpTransportUpdationParamsData authPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public SnmpTransportUpdationParamsData authPassPhrase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public void setAuthPassPhrase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        }
    }

    public boolean getAuthPassPhrase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE);
    }

    public SnmpTransportUpdationParamsData username(String username) {

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

    public SnmpTransportUpdationParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public SnmpTransportUpdationParamsData username_ExplictlyNonNull() {
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

    public SnmpTransportUpdationParamsData community(String community) {

        this.community = community;
        return this;
    }

    /**
     * Get community
     *
     * @return community
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public SnmpTransportUpdationParamsData community_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public SnmpTransportUpdationParamsData community_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public void setCommunity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY);
        }
    }

    public boolean getCommunity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY);
    }

    public SnmpTransportUpdationParamsData port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SnmpTransportUpdationParamsData port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public SnmpTransportUpdationParamsData port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public SnmpTransportUpdationParamsData protocol(SnmpProtocol protocol) {

        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     *
     * @return protocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(SnmpProtocol protocol) {
        this.protocol = protocol;
    }

    public SnmpTransportUpdationParamsData protocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public SnmpTransportUpdationParamsData protocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public void setProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        }
    }

    public boolean getProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL);
    }

    public SnmpTransportUpdationParamsData version(SnmpVersion version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpVersion getVersion() {
        return version;
    }

    public void setVersion(SnmpVersion version) {
        this.version = version;
    }

    public SnmpTransportUpdationParamsData version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public SnmpTransportUpdationParamsData version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public SnmpTransportUpdationParamsData name(String name) {

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

    public SnmpTransportUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnmpTransportUpdationParamsData name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnmpTransportUpdationParamsData snmpTransportUpdationParamsData =
                (SnmpTransportUpdationParamsData) o;
        return Objects.equals(this.disabled, snmpTransportUpdationParamsData.disabled)
                && Objects.equals(
                        this.privacyProtocol, snmpTransportUpdationParamsData.privacyProtocol)
                && Objects.equals(
                        this.privacyPassPhrase, snmpTransportUpdationParamsData.privacyPassPhrase)
                && Objects.equals(this.authProtocol, snmpTransportUpdationParamsData.authProtocol)
                && Objects.equals(
                        this.authPassPhrase, snmpTransportUpdationParamsData.authPassPhrase)
                && Objects.equals(this.username, snmpTransportUpdationParamsData.username)
                && Objects.equals(this.community, snmpTransportUpdationParamsData.community)
                && Objects.equals(this.port, snmpTransportUpdationParamsData.port)
                && Objects.equals(this.protocol, snmpTransportUpdationParamsData.protocol)
                && Objects.equals(this.version, snmpTransportUpdationParamsData.version)
                && Objects.equals(this.name, snmpTransportUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                disabled,
                privacyProtocol,
                privacyPassPhrase,
                authProtocol,
                authPassPhrase,
                username,
                community,
                port,
                protocol,
                version,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnmpTransportUpdationParamsData {\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
        sb.append("    privacyPassPhrase: ")
                .append(toIndentedString(privacyPassPhrase))
                .append("\n");
        sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
        sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    community: ").append(toIndentedString(community)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
