package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ClusterStorageInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterStorageInfo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY =
            "allocable_storage_capacity";

    @SerializedName(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY)
    private AllocatableStorageCapacity allocableStorageCapacity;

    public static final String SERIALIZED_NAME_FREE_DATA_SPACE = "free_data_space";

    @SerializedName(SERIALIZED_NAME_FREE_DATA_SPACE)
    private Long freeDataSpace;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER = "storage_cluster";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER)
    private List<ClusterStorageInfo> storageCluster = null;

    public static final String SERIALIZED_NAME_STRETCH = "stretch";

    @SerializedName(SERIALIZED_NAME_STRETCH)
    private Boolean stretch;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ClusterType type;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public ClusterStorageInfo() {}

    public ClusterStorageInfo allocableStorageCapacity(
            AllocatableStorageCapacity allocableStorageCapacity) {

        this.allocableStorageCapacity = allocableStorageCapacity;
        return this;
    }

    /**
     * Get allocableStorageCapacity
     *
     * @return allocableStorageCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AllocatableStorageCapacity getAllocableStorageCapacity() {
        return allocableStorageCapacity;
    }

    public void setAllocableStorageCapacity(AllocatableStorageCapacity allocableStorageCapacity) {
        this.allocableStorageCapacity = allocableStorageCapacity;
    }

    public ClusterStorageInfo allocableStorageCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY);
        return this;
    }

    public ClusterStorageInfo allocableStorageCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY);
        return this;
    }

    public void setAllocableStorageCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY);
        }
    }

    public boolean getAllocableStorageCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCABLE_STORAGE_CAPACITY);
    }

    public ClusterStorageInfo freeDataSpace(Long freeDataSpace) {

        this.freeDataSpace = freeDataSpace;
        return this;
    }

    /**
     * Get freeDataSpace
     *
     * @return freeDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeDataSpace() {
        return freeDataSpace;
    }

    public void setFreeDataSpace(Long freeDataSpace) {
        this.freeDataSpace = freeDataSpace;
    }

    public ClusterStorageInfo freeDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_DATA_SPACE);
        return this;
    }

    public ClusterStorageInfo freeDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_DATA_SPACE);
        return this;
    }

    public void setFreeDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_DATA_SPACE);
        }
    }

    public boolean getFreeDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_DATA_SPACE);
    }

    public ClusterStorageInfo failureDataSpace(Long failureDataSpace) {

        this.failureDataSpace = failureDataSpace;
        return this;
    }

    /**
     * Get failureDataSpace
     *
     * @return failureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpace() {
        return failureDataSpace;
    }

    public void setFailureDataSpace(Long failureDataSpace) {
        this.failureDataSpace = failureDataSpace;
    }

    public ClusterStorageInfo failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public ClusterStorageInfo failureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public void setFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        }
    }

    public boolean getFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE);
    }

    public ClusterStorageInfo usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public ClusterStorageInfo usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public ClusterStorageInfo usedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public void setUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        }
    }

    public boolean getUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE);
    }

    public ClusterStorageInfo totalDataCapacity(Long totalDataCapacity) {

        this.totalDataCapacity = totalDataCapacity;
        return this;
    }

    /**
     * Get totalDataCapacity
     *
     * @return totalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Long totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public ClusterStorageInfo totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public ClusterStorageInfo totalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
    }

    public ClusterStorageInfo storageCluster(List<ClusterStorageInfo> storageCluster) {

        this.storageCluster = storageCluster;
        return this;
    }

    public ClusterStorageInfo addStorageClusterItem(ClusterStorageInfo storageClusterItem) {
        if (this.storageCluster == null) {
            this.storageCluster = new ArrayList<ClusterStorageInfo>();
        }
        this.storageCluster.add(storageClusterItem);
        return this;
    }

    /**
     * Get storageCluster
     *
     * @return storageCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterStorageInfo> getStorageCluster() {
        return storageCluster;
    }

    public void setStorageCluster(List<ClusterStorageInfo> storageCluster) {
        this.storageCluster = storageCluster;
    }

    public ClusterStorageInfo storageCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public ClusterStorageInfo storageCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public void setStorageCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        }
    }

    public boolean getStorageCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER);
    }

    public ClusterStorageInfo stretch(Boolean stretch) {

        this.stretch = stretch;
        return this;
    }

    /**
     * Get stretch
     *
     * @return stretch
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStretch() {
        return stretch;
    }

    public void setStretch(Boolean stretch) {
        this.stretch = stretch;
    }

    public ClusterStorageInfo stretch_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public ClusterStorageInfo stretch_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public void setStretch_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        }
    }

    public boolean getStretch_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRETCH);
    }

    public ClusterStorageInfo type(ClusterType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterType getType() {
        return type;
    }

    public void setType(ClusterType type) {
        this.type = type;
    }

    public ClusterStorageInfo type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ClusterStorageInfo type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ClusterStorageInfo name(String name) {

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

    public ClusterStorageInfo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterStorageInfo name_ExplictlyNonNull() {
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

    public ClusterStorageInfo id(String id) {

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

    public ClusterStorageInfo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterStorageInfo id_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterStorageInfo clusterStorageInfo = (ClusterStorageInfo) o;
        return Objects.equals(
                        this.allocableStorageCapacity, clusterStorageInfo.allocableStorageCapacity)
                && Objects.equals(this.freeDataSpace, clusterStorageInfo.freeDataSpace)
                && Objects.equals(this.failureDataSpace, clusterStorageInfo.failureDataSpace)
                && Objects.equals(this.usedDataSpace, clusterStorageInfo.usedDataSpace)
                && Objects.equals(this.totalDataCapacity, clusterStorageInfo.totalDataCapacity)
                && Objects.equals(this.storageCluster, clusterStorageInfo.storageCluster)
                && Objects.equals(this.stretch, clusterStorageInfo.stretch)
                && Objects.equals(this.type, clusterStorageInfo.type)
                && Objects.equals(this.name, clusterStorageInfo.name)
                && Objects.equals(this.id, clusterStorageInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocableStorageCapacity,
                freeDataSpace,
                failureDataSpace,
                usedDataSpace,
                totalDataCapacity,
                storageCluster,
                stretch,
                type,
                name,
                id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStorageInfo {\n");
        sb.append("    allocableStorageCapacity: ")
                .append(toIndentedString(allocableStorageCapacity))
                .append("\n");
        sb.append("    freeDataSpace: ").append(toIndentedString(freeDataSpace)).append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    storageCluster: ").append(toIndentedString(storageCluster)).append("\n");
        sb.append("    stretch: ").append(toIndentedString(stretch)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
