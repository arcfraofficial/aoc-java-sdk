package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SnmpTrapReceiverUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnmpTrapReceiverUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_INFORM = "inform";

    @SerializedName(SERIALIZED_NAME_INFORM)
    private Boolean inform;

    public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID)
    private String engineId;

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

    public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
    private SnmpLanguageCode languageCode;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private String host;

    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private SnmpProtocol protocol;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private SnmpVersion version;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SnmpTrapReceiverUpdationParamsData() {}

    public SnmpTrapReceiverUpdationParamsData disabled(Boolean disabled) {

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

    public SnmpTrapReceiverUpdationParamsData disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData disabled_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData inform(Boolean inform) {

        this.inform = inform;
        return this;
    }

    /**
     * Get inform
     *
     * @return inform
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInform() {
        return inform;
    }

    public void setInform(Boolean inform) {
        this.inform = inform;
    }

    public SnmpTrapReceiverUpdationParamsData inform_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INFORM);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData inform_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INFORM);
        return this;
    }

    public void setInform_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INFORM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INFORM);
        }
    }

    public boolean getInform_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INFORM);
    }

    public SnmpTrapReceiverUpdationParamsData engineId(String engineId) {

        this.engineId = engineId;
        return this;
    }

    /**
     * Get engineId
     *
     * @return engineId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public SnmpTrapReceiverUpdationParamsData engineId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData engineId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID);
        return this;
    }

    public void setEngineId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID);
        }
    }

    public boolean getEngineId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID);
    }

    public SnmpTrapReceiverUpdationParamsData privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {

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

    public SnmpTrapReceiverUpdationParamsData privacyProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData privacyProtocol_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData privacyPassPhrase(String privacyPassPhrase) {

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

    public SnmpTrapReceiverUpdationParamsData privacyPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData privacyPassPhrase_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData authProtocol(SnmpAuthProtocol authProtocol) {

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

    public SnmpTrapReceiverUpdationParamsData authProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData authProtocol_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData authPassPhrase(String authPassPhrase) {

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

    public SnmpTrapReceiverUpdationParamsData authPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData authPassPhrase_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData username(String username) {

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

    public SnmpTrapReceiverUpdationParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData username_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData community(String community) {

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

    public SnmpTrapReceiverUpdationParamsData community_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData community_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData languageCode(SnmpLanguageCode languageCode) {

        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpLanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(SnmpLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public SnmpTrapReceiverUpdationParamsData languageCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData languageCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE);
        return this;
    }

    public void setLanguageCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE);
        }
    }

    public boolean getLanguageCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LANGUAGE_CODE);
    }

    public SnmpTrapReceiverUpdationParamsData port(Integer port) {

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

    public SnmpTrapReceiverUpdationParamsData port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData port_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData host(String host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SnmpTrapReceiverUpdationParamsData host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public SnmpTrapReceiverUpdationParamsData protocol(SnmpProtocol protocol) {

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

    public SnmpTrapReceiverUpdationParamsData protocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData protocol_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData version(SnmpVersion version) {

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

    public SnmpTrapReceiverUpdationParamsData version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData version_ExplictlyNonNull() {
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

    public SnmpTrapReceiverUpdationParamsData name(String name) {

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

    public SnmpTrapReceiverUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnmpTrapReceiverUpdationParamsData name_ExplictlyNonNull() {
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
        SnmpTrapReceiverUpdationParamsData snmpTrapReceiverUpdationParamsData =
                (SnmpTrapReceiverUpdationParamsData) o;
        return Objects.equals(this.disabled, snmpTrapReceiverUpdationParamsData.disabled)
                && Objects.equals(this.inform, snmpTrapReceiverUpdationParamsData.inform)
                && Objects.equals(this.engineId, snmpTrapReceiverUpdationParamsData.engineId)
                && Objects.equals(
                        this.privacyProtocol, snmpTrapReceiverUpdationParamsData.privacyProtocol)
                && Objects.equals(
                        this.privacyPassPhrase,
                        snmpTrapReceiverUpdationParamsData.privacyPassPhrase)
                && Objects.equals(
                        this.authProtocol, snmpTrapReceiverUpdationParamsData.authProtocol)
                && Objects.equals(
                        this.authPassPhrase, snmpTrapReceiverUpdationParamsData.authPassPhrase)
                && Objects.equals(this.username, snmpTrapReceiverUpdationParamsData.username)
                && Objects.equals(this.community, snmpTrapReceiverUpdationParamsData.community)
                && Objects.equals(
                        this.languageCode, snmpTrapReceiverUpdationParamsData.languageCode)
                && Objects.equals(this.port, snmpTrapReceiverUpdationParamsData.port)
                && Objects.equals(this.host, snmpTrapReceiverUpdationParamsData.host)
                && Objects.equals(this.protocol, snmpTrapReceiverUpdationParamsData.protocol)
                && Objects.equals(this.version, snmpTrapReceiverUpdationParamsData.version)
                && Objects.equals(this.name, snmpTrapReceiverUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                disabled,
                inform,
                engineId,
                privacyProtocol,
                privacyPassPhrase,
                authProtocol,
                authPassPhrase,
                username,
                community,
                languageCode,
                port,
                host,
                protocol,
                version,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnmpTrapReceiverUpdationParamsData {\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    inform: ").append(toIndentedString(inform)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
        sb.append("    privacyPassPhrase: ")
                .append(toIndentedString(privacyPassPhrase))
                .append("\n");
        sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
        sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    community: ").append(toIndentedString(community)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
