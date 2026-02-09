package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedReplicationObjectDescriptor */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedReplicationObjectDescriptor
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
    private String clusterName;

    public static final String SERIALIZED_NAME_OBJECT_LOCAL_ID = "object_local_id";

    @SerializedName(SERIALIZED_NAME_OBJECT_LOCAL_ID)
    private String objectLocalId;

    public static final String SERIALIZED_NAME_OBJECT_NAME = "object_name";

    @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
    private String objectName;

    public static final String SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID = "parent_object_local_id";

    @SerializedName(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID)
    private String parentObjectLocalId;

    public static final String SERIALIZED_NAME_PARENT_OBJECT_NAME = "parent_object_name";

    @SerializedName(SERIALIZED_NAME_PARENT_OBJECT_NAME)
    private String parentObjectName;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID = "tower_deploy_id";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID)
    private String towerDeployId;

    public static final String SERIALIZED_NAME_ZBS_VOLUME_ID = "zbs_volume_id";

    @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID)
    private String zbsVolumeId;

    public NestedReplicationObjectDescriptor() {}

    public NestedReplicationObjectDescriptor clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public NestedReplicationObjectDescriptor clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public NestedReplicationObjectDescriptor clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public NestedReplicationObjectDescriptor clusterName(String clusterName) {

        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get clusterName
     *
     * @return clusterName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public NestedReplicationObjectDescriptor clusterName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NAME);
        return this;
    }

    public NestedReplicationObjectDescriptor clusterName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NAME);
        return this;
    }

    public void setClusterName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NAME);
        }
    }

    public boolean getClusterName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NAME);
    }

    public NestedReplicationObjectDescriptor objectLocalId(String objectLocalId) {

        this.objectLocalId = objectLocalId;
        return this;
    }

    /**
     * Get objectLocalId
     *
     * @return objectLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getObjectLocalId() {
        return objectLocalId;
    }

    public void setObjectLocalId(String objectLocalId) {
        this.objectLocalId = objectLocalId;
    }

    public NestedReplicationObjectDescriptor objectLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_LOCAL_ID);
        return this;
    }

    public NestedReplicationObjectDescriptor objectLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_LOCAL_ID);
        return this;
    }

    public void setObjectLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_LOCAL_ID);
        }
    }

    public boolean getObjectLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_LOCAL_ID);
    }

    public NestedReplicationObjectDescriptor objectName(String objectName) {

        this.objectName = objectName;
        return this;
    }

    /**
     * Get objectName
     *
     * @return objectName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public NestedReplicationObjectDescriptor objectName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NAME);
        return this;
    }

    public NestedReplicationObjectDescriptor objectName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NAME);
        return this;
    }

    public void setObjectName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NAME);
        }
    }

    public boolean getObjectName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NAME);
    }

    public NestedReplicationObjectDescriptor parentObjectLocalId(String parentObjectLocalId) {

        this.parentObjectLocalId = parentObjectLocalId;
        return this;
    }

    /**
     * Get parentObjectLocalId
     *
     * @return parentObjectLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentObjectLocalId() {
        return parentObjectLocalId;
    }

    public void setParentObjectLocalId(String parentObjectLocalId) {
        this.parentObjectLocalId = parentObjectLocalId;
    }

    public NestedReplicationObjectDescriptor parentObjectLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID);
        return this;
    }

    public NestedReplicationObjectDescriptor parentObjectLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID);
        return this;
    }

    public void setParentObjectLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID);
        }
    }

    public boolean getParentObjectLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_OBJECT_LOCAL_ID);
    }

    public NestedReplicationObjectDescriptor parentObjectName(String parentObjectName) {

        this.parentObjectName = parentObjectName;
        return this;
    }

    /**
     * Get parentObjectName
     *
     * @return parentObjectName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentObjectName() {
        return parentObjectName;
    }

    public void setParentObjectName(String parentObjectName) {
        this.parentObjectName = parentObjectName;
    }

    public NestedReplicationObjectDescriptor parentObjectName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_OBJECT_NAME);
        return this;
    }

    public NestedReplicationObjectDescriptor parentObjectName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_OBJECT_NAME);
        return this;
    }

    public void setParentObjectName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_OBJECT_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_OBJECT_NAME);
        }
    }

    public boolean getParentObjectName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_OBJECT_NAME);
    }

    public NestedReplicationObjectDescriptor towerDeployId(String towerDeployId) {

        this.towerDeployId = towerDeployId;
        return this;
    }

    /**
     * Get towerDeployId
     *
     * @return towerDeployId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployId() {
        return towerDeployId;
    }

    public void setTowerDeployId(String towerDeployId) {
        this.towerDeployId = towerDeployId;
    }

    public NestedReplicationObjectDescriptor towerDeployId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        return this;
    }

    public NestedReplicationObjectDescriptor towerDeployId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        return this;
    }

    public void setTowerDeployId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        }
    }

    public boolean getTowerDeployId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID);
    }

    public NestedReplicationObjectDescriptor zbsVolumeId(String zbsVolumeId) {

        this.zbsVolumeId = zbsVolumeId;
        return this;
    }

    /**
     * Get zbsVolumeId
     *
     * @return zbsVolumeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVolumeId() {
        return zbsVolumeId;
    }

    public void setZbsVolumeId(String zbsVolumeId) {
        this.zbsVolumeId = zbsVolumeId;
    }

    public NestedReplicationObjectDescriptor zbsVolumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VOLUME_ID);
        return this;
    }

    public NestedReplicationObjectDescriptor zbsVolumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VOLUME_ID);
        return this;
    }

    public void setZbsVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VOLUME_ID);
        }
    }

    public boolean getZbsVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VOLUME_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedReplicationObjectDescriptor nestedReplicationObjectDescriptor =
                (NestedReplicationObjectDescriptor) o;
        return Objects.equals(this.clusterLocalId, nestedReplicationObjectDescriptor.clusterLocalId)
                && Objects.equals(this.clusterName, nestedReplicationObjectDescriptor.clusterName)
                && Objects.equals(
                        this.objectLocalId, nestedReplicationObjectDescriptor.objectLocalId)
                && Objects.equals(this.objectName, nestedReplicationObjectDescriptor.objectName)
                && Objects.equals(
                        this.parentObjectLocalId,
                        nestedReplicationObjectDescriptor.parentObjectLocalId)
                && Objects.equals(
                        this.parentObjectName, nestedReplicationObjectDescriptor.parentObjectName)
                && Objects.equals(
                        this.towerDeployId, nestedReplicationObjectDescriptor.towerDeployId)
                && Objects.equals(this.zbsVolumeId, nestedReplicationObjectDescriptor.zbsVolumeId);
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
                clusterLocalId,
                clusterName,
                objectLocalId,
                objectName,
                parentObjectLocalId,
                parentObjectName,
                towerDeployId,
                zbsVolumeId);
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
        sb.append("class NestedReplicationObjectDescriptor {\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    objectLocalId: ").append(toIndentedString(objectLocalId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    parentObjectLocalId: ")
                .append(toIndentedString(parentObjectLocalId))
                .append("\n");
        sb.append("    parentObjectName: ").append(toIndentedString(parentObjectName)).append("\n");
        sb.append("    towerDeployId: ").append(toIndentedString(towerDeployId)).append("\n");
        sb.append("    zbsVolumeId: ").append(toIndentedString(zbsVolumeId)).append("\n");
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
