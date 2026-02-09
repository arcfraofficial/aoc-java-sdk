package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UserAuditLogCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserAuditLogCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_API_KEY_NAME = "api_key_name";

    @SerializedName(SERIALIZED_NAME_API_KEY_NAME)
    private String apiKeyName;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private UserAuditLogStatus status;

    public static final String SERIALIZED_NAME_USER_ID = "user_id";

    @SerializedName(SERIALIZED_NAME_USER_ID)
    private String userId;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private UserAuditLogMessage message;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_ACTION = "action";

    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;

    public UserAuditLogCreationParams() {}

    public UserAuditLogCreationParams apiKeyName(String apiKeyName) {

        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * Get apiKeyName
     *
     * @return apiKeyName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    public UserAuditLogCreationParams apiKeyName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NAME);
        return this;
    }

    public UserAuditLogCreationParams apiKeyName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NAME);
        return this;
    }

    public void setApiKeyName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NAME);
        }
    }

    public boolean getApiKeyName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NAME);
    }

    public UserAuditLogCreationParams id(String id) {

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

    public UserAuditLogCreationParams id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public UserAuditLogCreationParams id_ExplictlyNonNull() {
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

    public UserAuditLogCreationParams startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public UserAuditLogCreationParams startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public UserAuditLogCreationParams startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public UserAuditLogCreationParams finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public UserAuditLogCreationParams finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public UserAuditLogCreationParams finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public UserAuditLogCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UserAuditLogCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public UserAuditLogCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public UserAuditLogCreationParams resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public UserAuditLogCreationParams resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public UserAuditLogCreationParams resourceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public void setResourceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        }
    }

    public boolean getResourceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID);
    }

    public UserAuditLogCreationParams ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public UserAuditLogCreationParams ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public UserAuditLogCreationParams ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    public UserAuditLogCreationParams status(UserAuditLogStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UserAuditLogStatus getStatus() {
        return status;
    }

    public void setStatus(UserAuditLogStatus status) {
        this.status = status;
    }

    public UserAuditLogCreationParams status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public UserAuditLogCreationParams status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public UserAuditLogCreationParams userId(String userId) {

        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserAuditLogCreationParams userId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_ID);
        return this;
    }

    public UserAuditLogCreationParams userId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_ID);
        return this;
    }

    public void setUserId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_ID);
        }
    }

    public boolean getUserId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_ID);
    }

    public UserAuditLogCreationParams key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UserAuditLogCreationParams key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public UserAuditLogCreationParams key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public UserAuditLogCreationParams message(UserAuditLogMessage message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UserAuditLogMessage getMessage() {
        return message;
    }

    public void setMessage(UserAuditLogMessage message) {
        this.message = message;
    }

    public UserAuditLogCreationParams message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public UserAuditLogCreationParams message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public UserAuditLogCreationParams resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UserAuditLogCreationParams resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public UserAuditLogCreationParams resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public UserAuditLogCreationParams action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UserAuditLogCreationParams action_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION);
        return this;
    }

    public UserAuditLogCreationParams action_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        return this;
    }

    public void setAction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        }
    }

    public boolean getAction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAuditLogCreationParams userAuditLogCreationParams = (UserAuditLogCreationParams) o;
        return Objects.equals(this.apiKeyName, userAuditLogCreationParams.apiKeyName)
                && Objects.equals(this.id, userAuditLogCreationParams.id)
                && Objects.equals(this.startedAt, userAuditLogCreationParams.startedAt)
                && Objects.equals(this.finishedAt, userAuditLogCreationParams.finishedAt)
                && Objects.equals(this.clusterId, userAuditLogCreationParams.clusterId)
                && Objects.equals(this.resourceId, userAuditLogCreationParams.resourceId)
                && Objects.equals(this.ipAddress, userAuditLogCreationParams.ipAddress)
                && Objects.equals(this.status, userAuditLogCreationParams.status)
                && Objects.equals(this.userId, userAuditLogCreationParams.userId)
                && Objects.equals(this.key, userAuditLogCreationParams.key)
                && Objects.equals(this.message, userAuditLogCreationParams.message)
                && Objects.equals(this.resourceType, userAuditLogCreationParams.resourceType)
                && Objects.equals(this.action, userAuditLogCreationParams.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiKeyName,
                id,
                startedAt,
                finishedAt,
                clusterId,
                resourceId,
                ipAddress,
                status,
                userId,
                key,
                message,
                resourceType,
                action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuditLogCreationParams {\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
