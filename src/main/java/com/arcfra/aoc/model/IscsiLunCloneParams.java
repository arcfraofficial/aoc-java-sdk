package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunCloneParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunCloneParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ISCSI_TARGET_ID = "iscsi_target_id";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_ID)
    private String iscsiTargetId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public IscsiLunCloneParams() {}

    public IscsiLunCloneParams iscsiTargetId(String iscsiTargetId) {

        this.iscsiTargetId = iscsiTargetId;
        return this;
    }

    /**
     * Get iscsiTargetId
     *
     * @return iscsiTargetId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIscsiTargetId() {
        return iscsiTargetId;
    }

    public void setIscsiTargetId(String iscsiTargetId) {
        this.iscsiTargetId = iscsiTargetId;
    }

    public IscsiLunCloneParams iscsiTargetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_ID);
        return this;
    }

    public IscsiLunCloneParams iscsiTargetId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_ID);
        return this;
    }

    public void setIscsiTargetId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_ID);
        }
    }

    public boolean getIscsiTargetId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_ID);
    }

    public IscsiLunCloneParams name(String name) {

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

    public IscsiLunCloneParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public IscsiLunCloneParams name_ExplictlyNonNull() {
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

    public IscsiLunCloneParams snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Get snapshotId
     *
     * @return snapshotId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public IscsiLunCloneParams snapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public IscsiLunCloneParams snapshotId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public void setSnapshotId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ID);
        }
    }

    public boolean getSnapshotId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunCloneParams iscsiLunCloneParams = (IscsiLunCloneParams) o;
        return Objects.equals(this.iscsiTargetId, iscsiLunCloneParams.iscsiTargetId)
                && Objects.equals(this.name, iscsiLunCloneParams.name)
                && Objects.equals(this.snapshotId, iscsiLunCloneParams.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iscsiTargetId, name, snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunCloneParams {\n");
        sb.append("    iscsiTargetId: ").append(toIndentedString(iscsiTargetId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
