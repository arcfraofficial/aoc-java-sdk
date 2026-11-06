package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** StorageConfig */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class StorageConfig extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE_ID = "datastore_id";

    @SerializedName(SERIALIZED_NAME_DATASTORE_ID)
    private String datastoreId;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID = "storage_cluster_id";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID)
    private String storageClusterId;

    public StorageConfig() {}

    public StorageConfig datastoreId(String datastoreId) {

        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * VCFS Datastore.id
     *
     * @return datastoreId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "VCFS Datastore.id")
    public String getDatastoreId() {
        return datastoreId;
    }

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    public StorageConfig datastoreId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public StorageConfig datastoreId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public void setDatastoreId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        }
    }

    public boolean getDatastoreId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_ID);
    }

    public StorageConfig storageClusterId(String storageClusterId) {

        this.storageClusterId = storageClusterId;
        return this;
    }

    /**
     * Clustered-storage Cluster.id
     *
     * @return storageClusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Clustered-storage Cluster.id")
    public String getStorageClusterId() {
        return storageClusterId;
    }

    public void setStorageClusterId(String storageClusterId) {
        this.storageClusterId = storageClusterId;
    }

    public StorageConfig storageClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        return this;
    }

    public StorageConfig storageClusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        return this;
    }

    public void setStorageClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        }
    }

    public boolean getStorageClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageConfig storageConfig = (StorageConfig) o;
        return Objects.equals(this.datastoreId, storageConfig.datastoreId)
                && Objects.equals(this.storageClusterId, storageConfig.storageClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreId, storageClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageConfig {\n");
        sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
        sb.append("    storageClusterId: ").append(toIndentedString(storageClusterId)).append("\n");
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
