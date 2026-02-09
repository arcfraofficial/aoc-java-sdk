package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** AlertNotifier */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AlertNotifier extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private List<NestedCluster> clusters = null;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_EMAIL_FROM = "email_from";

    @SerializedName(SERIALIZED_NAME_EMAIL_FROM)
    private String emailFrom;

    public static final String SERIALIZED_NAME_EMAIL_TOS = "email_tos";

    @SerializedName(SERIALIZED_NAME_EMAIL_TOS)
    private List<String> emailTos = new ArrayList<String>();

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
    private NotifierLanguageCode languageCode;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NOTICE_SEVERITIES = "notice_severities";

    @SerializedName(SERIALIZED_NAME_NOTICE_SEVERITIES)
    private List<String> noticeSeverities = new ArrayList<String>();

    public static final String SERIALIZED_NAME_SECURITY_MODE = "security_mode";

    @SerializedName(SERIALIZED_NAME_SECURITY_MODE)
    private NotifierSecurityMode securityMode;

    public static final String SERIALIZED_NAME_SMTP_SERVER_CONFIG = "smtp_server_config";

    @SerializedName(SERIALIZED_NAME_SMTP_SERVER_CONFIG)
    private NestedSmtpServer smtpServerConfig;

    public static final String SERIALIZED_NAME_SMTP_SERVER_HOST = "smtp_server_host";

    @SerializedName(SERIALIZED_NAME_SMTP_SERVER_HOST)
    private String smtpServerHost;

    public static final String SERIALIZED_NAME_SMTP_SERVER_PORT = "smtp_server_port";

    @SerializedName(SERIALIZED_NAME_SMTP_SERVER_PORT)
    private Integer smtpServerPort;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public AlertNotifier() {}

    public AlertNotifier clusters(List<NestedCluster> clusters) {

        this.clusters = clusters;
        return this;
    }

    public AlertNotifier addClustersItem(NestedCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<NestedCluster>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<NestedCluster> clusters) {
        this.clusters = clusters;
    }

    public AlertNotifier clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public AlertNotifier clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    public AlertNotifier disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public AlertNotifier disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public AlertNotifier disabled_ExplictlyNonNull() {
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

    public AlertNotifier emailFrom(String emailFrom) {

        this.emailFrom = emailFrom;
        return this;
    }

    /**
     * Get emailFrom
     *
     * @return emailFrom
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public AlertNotifier emailFrom_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_FROM);
        return this;
    }

    public AlertNotifier emailFrom_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_FROM);
        return this;
    }

    public void setEmailFrom_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_FROM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_FROM);
        }
    }

    public boolean getEmailFrom_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_FROM);
    }

    public AlertNotifier emailTos(List<String> emailTos) {

        this.emailTos = emailTos;
        return this;
    }

    public AlertNotifier addEmailTosItem(String emailTosItem) {
        this.emailTos.add(emailTosItem);
        return this;
    }

    /**
     * Get emailTos
     *
     * @return emailTos
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getEmailTos() {
        return emailTos;
    }

    public void setEmailTos(List<String> emailTos) {
        this.emailTos = emailTos;
    }

    public AlertNotifier emailTos_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EMAIL_TOS);
        return this;
    }

    public AlertNotifier emailTos_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EMAIL_TOS);
        return this;
    }

    public void setEmailTos_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EMAIL_TOS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EMAIL_TOS);
        }
    }

    public boolean getEmailTos_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EMAIL_TOS);
    }

    public AlertNotifier entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public AlertNotifier entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public AlertNotifier entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public AlertNotifier id(String id) {

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

    public AlertNotifier id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public AlertNotifier id_ExplictlyNonNull() {
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

    public AlertNotifier languageCode(NotifierLanguageCode languageCode) {

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
    public NotifierLanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(NotifierLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public AlertNotifier languageCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE);
        return this;
    }

    public AlertNotifier languageCode_ExplictlyNonNull() {
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

    public AlertNotifier name(String name) {

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

    public AlertNotifier name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public AlertNotifier name_ExplictlyNonNull() {
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

    public AlertNotifier noticeSeverities(List<String> noticeSeverities) {

        this.noticeSeverities = noticeSeverities;
        return this;
    }

    public AlertNotifier addNoticeSeveritiesItem(String noticeSeveritiesItem) {
        this.noticeSeverities.add(noticeSeveritiesItem);
        return this;
    }

    /**
     * Get noticeSeverities
     *
     * @return noticeSeverities
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getNoticeSeverities() {
        return noticeSeverities;
    }

    public void setNoticeSeverities(List<String> noticeSeverities) {
        this.noticeSeverities = noticeSeverities;
    }

    public AlertNotifier noticeSeverities_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NOTICE_SEVERITIES);
        return this;
    }

    public AlertNotifier noticeSeverities_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NOTICE_SEVERITIES);
        return this;
    }

    public void setNoticeSeverities_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NOTICE_SEVERITIES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NOTICE_SEVERITIES);
        }
    }

    public boolean getNoticeSeverities_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NOTICE_SEVERITIES);
    }

    public AlertNotifier securityMode(NotifierSecurityMode securityMode) {

        this.securityMode = securityMode;
        return this;
    }

    /**
     * Get securityMode
     *
     * @return securityMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NotifierSecurityMode getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(NotifierSecurityMode securityMode) {
        this.securityMode = securityMode;
    }

    public AlertNotifier securityMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_MODE);
        return this;
    }

    public AlertNotifier securityMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_MODE);
        return this;
    }

    public void setSecurityMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_MODE);
        }
    }

    public boolean getSecurityMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_MODE);
    }

    public AlertNotifier smtpServerConfig(NestedSmtpServer smtpServerConfig) {

        this.smtpServerConfig = smtpServerConfig;
        return this;
    }

    /**
     * Get smtpServerConfig
     *
     * @return smtpServerConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSmtpServer getSmtpServerConfig() {
        return smtpServerConfig;
    }

    public void setSmtpServerConfig(NestedSmtpServer smtpServerConfig) {
        this.smtpServerConfig = smtpServerConfig;
    }

    public AlertNotifier smtpServerConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_CONFIG);
        return this;
    }

    public AlertNotifier smtpServerConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_CONFIG);
        return this;
    }

    public void setSmtpServerConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_CONFIG);
        }
    }

    public boolean getSmtpServerConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SMTP_SERVER_CONFIG);
    }

    public AlertNotifier smtpServerHost(String smtpServerHost) {

        this.smtpServerHost = smtpServerHost;
        return this;
    }

    /**
     * Get smtpServerHost
     *
     * @return smtpServerHost
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSmtpServerHost() {
        return smtpServerHost;
    }

    public void setSmtpServerHost(String smtpServerHost) {
        this.smtpServerHost = smtpServerHost;
    }

    public AlertNotifier smtpServerHost_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_HOST);
        return this;
    }

    public AlertNotifier smtpServerHost_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_HOST);
        return this;
    }

    public void setSmtpServerHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_HOST);
        }
    }

    public boolean getSmtpServerHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SMTP_SERVER_HOST);
    }

    public AlertNotifier smtpServerPort(Integer smtpServerPort) {

        this.smtpServerPort = smtpServerPort;
        return this;
    }

    /**
     * Get smtpServerPort
     *
     * @return smtpServerPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSmtpServerPort() {
        return smtpServerPort;
    }

    public void setSmtpServerPort(Integer smtpServerPort) {
        this.smtpServerPort = smtpServerPort;
    }

    public AlertNotifier smtpServerPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_PORT);
        return this;
    }

    public AlertNotifier smtpServerPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_PORT);
        return this;
    }

    public void setSmtpServerPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SMTP_SERVER_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SMTP_SERVER_PORT);
        }
    }

    public boolean getSmtpServerPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SMTP_SERVER_PORT);
    }

    public AlertNotifier username(String username) {

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

    public AlertNotifier username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public AlertNotifier username_ExplictlyNonNull() {
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
        AlertNotifier alertNotifier = (AlertNotifier) o;
        return Objects.equals(this.clusters, alertNotifier.clusters)
                && Objects.equals(this.disabled, alertNotifier.disabled)
                && Objects.equals(this.emailFrom, alertNotifier.emailFrom)
                && Objects.equals(this.emailTos, alertNotifier.emailTos)
                && Objects.equals(this.entityAsyncStatus, alertNotifier.entityAsyncStatus)
                && Objects.equals(this.id, alertNotifier.id)
                && Objects.equals(this.languageCode, alertNotifier.languageCode)
                && Objects.equals(this.name, alertNotifier.name)
                && Objects.equals(this.noticeSeverities, alertNotifier.noticeSeverities)
                && Objects.equals(this.securityMode, alertNotifier.securityMode)
                && Objects.equals(this.smtpServerConfig, alertNotifier.smtpServerConfig)
                && Objects.equals(this.smtpServerHost, alertNotifier.smtpServerHost)
                && Objects.equals(this.smtpServerPort, alertNotifier.smtpServerPort)
                && Objects.equals(this.username, alertNotifier.username);
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
                clusters,
                disabled,
                emailFrom,
                emailTos,
                entityAsyncStatus,
                id,
                languageCode,
                name,
                noticeSeverities,
                securityMode,
                smtpServerConfig,
                smtpServerHost,
                smtpServerPort,
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
        sb.append("class AlertNotifier {\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
        sb.append("    emailTos: ").append(toIndentedString(emailTos)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noticeSeverities: ").append(toIndentedString(noticeSeverities)).append("\n");
        sb.append("    securityMode: ").append(toIndentedString(securityMode)).append("\n");
        sb.append("    smtpServerConfig: ").append(toIndentedString(smtpServerConfig)).append("\n");
        sb.append("    smtpServerHost: ").append(toIndentedString(smtpServerHost)).append("\n");
        sb.append("    smtpServerPort: ").append(toIndentedString(smtpServerPort)).append("\n");
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
