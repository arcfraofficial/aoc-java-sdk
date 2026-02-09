package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunRollbackParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunRollbackParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_LUN_ID = "lun_id";

    @SerializedName(SERIALIZED_NAME_LUN_ID)
    private String lunId;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public IscsiLunRollbackParams() {}

    public IscsiLunRollbackParams lunId(String lunId) {

        this.lunId = lunId;
        return this;
    }

    /**
     * Get lunId
     *
     * @return lunId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLunId() {
        return lunId;
    }

    public void setLunId(String lunId) {
        this.lunId = lunId;
    }

    public IscsiLunRollbackParams lunId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN_ID);
        return this;
    }

    public IscsiLunRollbackParams lunId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN_ID);
        return this;
    }

    public void setLunId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN_ID);
        }
    }

    public boolean getLunId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN_ID);
    }

    public IscsiLunRollbackParams snapshotId(String snapshotId) {

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

    public IscsiLunRollbackParams snapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public IscsiLunRollbackParams snapshotId_ExplictlyNonNull() {
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
        IscsiLunRollbackParams iscsiLunRollbackParams = (IscsiLunRollbackParams) o;
        return Objects.equals(this.lunId, iscsiLunRollbackParams.lunId)
                && Objects.equals(this.snapshotId, iscsiLunRollbackParams.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lunId, snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunRollbackParams {\n");
        sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
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
