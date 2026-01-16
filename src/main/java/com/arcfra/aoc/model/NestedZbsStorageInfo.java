package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedZbsStorageInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedZbsStorageInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_SNAPSHOT_INFO = "snapshot_info";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_INFO)
    private List<NestedSnapshotInfo> snapshotInfo = null;

    public NestedZbsStorageInfo() {}

    public NestedZbsStorageInfo clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public NestedZbsStorageInfo clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public NestedZbsStorageInfo clusterId_ExplictlyNonNull() {
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

    public NestedZbsStorageInfo snapshotInfo(List<NestedSnapshotInfo> snapshotInfo) {

        this.snapshotInfo = snapshotInfo;
        return this;
    }

    public NestedZbsStorageInfo addSnapshotInfoItem(NestedSnapshotInfo snapshotInfoItem) {
        if (this.snapshotInfo == null) {
            this.snapshotInfo = new ArrayList<NestedSnapshotInfo>();
        }
        this.snapshotInfo.add(snapshotInfoItem);
        return this;
    }

    /**
     * Get snapshotInfo
     *
     * @return snapshotInfo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedSnapshotInfo> getSnapshotInfo() {
        return snapshotInfo;
    }

    public void setSnapshotInfo(List<NestedSnapshotInfo> snapshotInfo) {
        this.snapshotInfo = snapshotInfo;
    }

    public NestedZbsStorageInfo snapshotInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_INFO);
        return this;
    }

    public NestedZbsStorageInfo snapshotInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_INFO);
        return this;
    }

    public void setSnapshotInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_INFO);
        }
    }

    public boolean getSnapshotInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_INFO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedZbsStorageInfo nestedZbsStorageInfo = (NestedZbsStorageInfo) o;
        return Objects.equals(this.clusterId, nestedZbsStorageInfo.clusterId)
                && Objects.equals(this.snapshotInfo, nestedZbsStorageInfo.snapshotInfo);
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
        return Objects.hash(clusterId, snapshotInfo);
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
        sb.append("class NestedZbsStorageInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    snapshotInfo: ").append(toIndentedString(snapshotInfo)).append("\n");
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
