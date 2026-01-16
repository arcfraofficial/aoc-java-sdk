package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmRollbackParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRollbackParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public VmRollbackParamsData() {}

    public VmRollbackParamsData snapshotId(String snapshotId) {

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

    public VmRollbackParamsData snapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public VmRollbackParamsData snapshotId_ExplictlyNonNull() {
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
        VmRollbackParamsData vmRollbackParamsData = (VmRollbackParamsData) o;
        return Objects.equals(this.snapshotId, vmRollbackParamsData.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmRollbackParamsData {\n");
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
