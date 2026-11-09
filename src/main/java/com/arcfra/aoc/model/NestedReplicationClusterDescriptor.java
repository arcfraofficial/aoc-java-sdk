package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedReplicationClusterDescriptor */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedReplicationClusterDescriptor
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
    private String clusterName;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID = "tower_deploy_id";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID)
    private String towerDeployId;

    public NestedReplicationClusterDescriptor() {}

    public NestedReplicationClusterDescriptor clusterLocalId(String clusterLocalId) {

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

    public NestedReplicationClusterDescriptor clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public NestedReplicationClusterDescriptor clusterLocalId_ExplictlyNonNull() {
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

    public NestedReplicationClusterDescriptor clusterName(String clusterName) {

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

    public NestedReplicationClusterDescriptor clusterName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NAME);
        return this;
    }

    public NestedReplicationClusterDescriptor clusterName_ExplictlyNonNull() {
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

    public NestedReplicationClusterDescriptor towerDeployId(String towerDeployId) {

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

    public NestedReplicationClusterDescriptor towerDeployId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        return this;
    }

    public NestedReplicationClusterDescriptor towerDeployId_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedReplicationClusterDescriptor nestedReplicationClusterDescriptor =
                (NestedReplicationClusterDescriptor) o;
        return Objects.equals(
                        this.clusterLocalId, nestedReplicationClusterDescriptor.clusterLocalId)
                && Objects.equals(this.clusterName, nestedReplicationClusterDescriptor.clusterName)
                && Objects.equals(
                        this.towerDeployId, nestedReplicationClusterDescriptor.towerDeployId);
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
        return Objects.hash(clusterLocalId, clusterName, towerDeployId);
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
        sb.append("class NestedReplicationClusterDescriptor {\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    towerDeployId: ").append(toIndentedString(towerDeployId)).append("\n");
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
