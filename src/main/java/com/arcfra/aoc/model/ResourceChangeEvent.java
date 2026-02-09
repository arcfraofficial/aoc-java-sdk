package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ResourceChangeEvent */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ResourceChangeEvent
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PREV_REVISION = "prev_revision";

    @SerializedName(SERIALIZED_NAME_PREV_REVISION)
    private String prevRevision;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_NEW_VALUE = "new_value";

    @SerializedName(SERIALIZED_NAME_NEW_VALUE)
    private String newValue;

    public static final String SERIALIZED_NAME_OLD_VALUE = "old_value";

    @SerializedName(SERIALIZED_NAME_OLD_VALUE)
    private String oldValue;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_ACTION = "action";

    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;

    public static final String SERIALIZED_NAME_REVISION = "revision";

    @SerializedName(SERIALIZED_NAME_REVISION)
    private String revision;

    public ResourceChangeEvent() {}

    public ResourceChangeEvent prevRevision(String prevRevision) {

        this.prevRevision = prevRevision;
        return this;
    }

    /**
     * Get prevRevision
     *
     * @return prevRevision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrevRevision() {
        return prevRevision;
    }

    public void setPrevRevision(String prevRevision) {
        this.prevRevision = prevRevision;
    }

    public ResourceChangeEvent prevRevision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PREV_REVISION);
        return this;
    }

    public ResourceChangeEvent prevRevision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PREV_REVISION);
        return this;
    }

    public void setPrevRevision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PREV_REVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PREV_REVISION);
        }
    }

    public boolean getPrevRevision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PREV_REVISION);
    }

    public ResourceChangeEvent createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ResourceChangeEvent createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ResourceChangeEvent createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public ResourceChangeEvent newValue(String newValue) {

        this.newValue = newValue;
        return this;
    }

    /**
     * Get newValue
     *
     * @return newValue
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ResourceChangeEvent newValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEW_VALUE);
        return this;
    }

    public ResourceChangeEvent newValue_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEW_VALUE);
        return this;
    }

    public void setNewValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEW_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEW_VALUE);
        }
    }

    public boolean getNewValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEW_VALUE);
    }

    public ResourceChangeEvent oldValue(String oldValue) {

        this.oldValue = oldValue;
        return this;
    }

    /**
     * Get oldValue
     *
     * @return oldValue
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ResourceChangeEvent oldValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OLD_VALUE);
        return this;
    }

    public ResourceChangeEvent oldValue_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OLD_VALUE);
        return this;
    }

    public void setOldValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OLD_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OLD_VALUE);
        }
    }

    public boolean getOldValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OLD_VALUE);
    }

    public ResourceChangeEvent resourceId(String resourceId) {

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

    public ResourceChangeEvent resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public ResourceChangeEvent resourceId_ExplictlyNonNull() {
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

    public ResourceChangeEvent resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceChangeEvent resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public ResourceChangeEvent resourceType_ExplictlyNonNull() {
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

    public ResourceChangeEvent action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ResourceChangeEvent action_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION);
        return this;
    }

    public ResourceChangeEvent action_ExplictlyNonNull() {
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

    public ResourceChangeEvent revision(String revision) {

        this.revision = revision;
        return this;
    }

    /**
     * Get revision
     *
     * @return revision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public ResourceChangeEvent revision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REVISION);
        return this;
    }

    public ResourceChangeEvent revision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REVISION);
        return this;
    }

    public void setRevision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REVISION);
        }
    }

    public boolean getRevision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REVISION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceChangeEvent resourceChangeEvent = (ResourceChangeEvent) o;
        return Objects.equals(this.prevRevision, resourceChangeEvent.prevRevision)
                && Objects.equals(this.createdAt, resourceChangeEvent.createdAt)
                && Objects.equals(this.newValue, resourceChangeEvent.newValue)
                && Objects.equals(this.oldValue, resourceChangeEvent.oldValue)
                && Objects.equals(this.resourceId, resourceChangeEvent.resourceId)
                && Objects.equals(this.resourceType, resourceChangeEvent.resourceType)
                && Objects.equals(this.action, resourceChangeEvent.action)
                && Objects.equals(this.revision, resourceChangeEvent.revision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                prevRevision,
                createdAt,
                newValue,
                oldValue,
                resourceId,
                resourceType,
                action,
                revision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceChangeEvent {\n");
        sb.append("    prevRevision: ").append(toIndentedString(prevRevision)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
