package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterImage */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterImage extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_META_NAME = "meta_name";

    @SerializedName(SERIALIZED_NAME_META_NAME)
    private String metaName;

    public static final String SERIALIZED_NAME_META_SIZE = "meta_size";

    @SerializedName(SERIALIZED_NAME_META_SIZE)
    private Long metaSize;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_UPGRADE_FROM = "upgrade_from";

    @SerializedName(SERIALIZED_NAME_UPGRADE_FROM)
    private List<String> upgradeFrom = new ArrayList<String>();

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
    private String upgradeToolVersion;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_ZBS_VERSION = "zbs_version";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION)
    private String zbsVersion;

    public ClusterImage() {}

    public ClusterImage cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public ClusterImage cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterImage cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public ClusterImage entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public ClusterImage entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ClusterImage entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public ClusterImage id(String id) {

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

    public ClusterImage id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterImage id_ExplictlyNonNull() {
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

    public ClusterImage localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public ClusterImage localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterImage localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public ClusterImage metaName(String metaName) {

        this.metaName = metaName;
        return this;
    }

    /**
     * Get metaName
     *
     * @return metaName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public ClusterImage metaName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME);
        return this;
    }

    public ClusterImage metaName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME);
        return this;
    }

    public void setMetaName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME);
        }
    }

    public boolean getMetaName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME);
    }

    public ClusterImage metaSize(Long metaSize) {

        this.metaSize = metaSize;
        return this;
    }

    /**
     * Get metaSize
     *
     * @return metaSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getMetaSize() {
        return metaSize;
    }

    public void setMetaSize(Long metaSize) {
        this.metaSize = metaSize;
    }

    public ClusterImage metaSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE);
        return this;
    }

    public ClusterImage metaSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE);
        return this;
    }

    public void setMetaSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE);
        }
    }

    public boolean getMetaSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE);
    }

    public ClusterImage name(String name) {

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

    public ClusterImage name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterImage name_ExplictlyNonNull() {
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

    public ClusterImage size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ClusterImage size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public ClusterImage size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public ClusterImage upgradeFrom(List<String> upgradeFrom) {

        this.upgradeFrom = upgradeFrom;
        return this;
    }

    public ClusterImage addUpgradeFromItem(String upgradeFromItem) {
        this.upgradeFrom.add(upgradeFromItem);
        return this;
    }

    /**
     * Get upgradeFrom
     *
     * @return upgradeFrom
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getUpgradeFrom() {
        return upgradeFrom;
    }

    public void setUpgradeFrom(List<String> upgradeFrom) {
        this.upgradeFrom = upgradeFrom;
    }

    public ClusterImage upgradeFrom_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_FROM);
        return this;
    }

    public ClusterImage upgradeFrom_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_FROM);
        return this;
    }

    public void setUpgradeFrom_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_FROM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_FROM);
        }
    }

    public boolean getUpgradeFrom_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_FROM);
    }

    public ClusterImage upgradeToolVersion(String upgradeToolVersion) {

        this.upgradeToolVersion = upgradeToolVersion;
        return this;
    }

    /**
     * Get upgradeToolVersion
     *
     * @return upgradeToolVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersion() {
        return upgradeToolVersion;
    }

    public void setUpgradeToolVersion(String upgradeToolVersion) {
        this.upgradeToolVersion = upgradeToolVersion;
    }

    public ClusterImage upgradeToolVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public ClusterImage upgradeToolVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public void setUpgradeToolVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        }
    }

    public boolean getUpgradeToolVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
    }

    public ClusterImage version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterImage version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ClusterImage version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public ClusterImage zbsVersion(String zbsVersion) {

        this.zbsVersion = zbsVersion;
        return this;
    }

    /**
     * Get zbsVersion
     *
     * @return zbsVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersion() {
        return zbsVersion;
    }

    public void setZbsVersion(String zbsVersion) {
        this.zbsVersion = zbsVersion;
    }

    public ClusterImage zbsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION);
        return this;
    }

    public ClusterImage zbsVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION);
        return this;
    }

    public void setZbsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION);
        }
    }

    public boolean getZbsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterImage clusterImage = (ClusterImage) o;
        return Objects.equals(this.cluster, clusterImage.cluster)
                && Objects.equals(this.entityAsyncStatus, clusterImage.entityAsyncStatus)
                && Objects.equals(this.id, clusterImage.id)
                && Objects.equals(this.localId, clusterImage.localId)
                && Objects.equals(this.metaName, clusterImage.metaName)
                && Objects.equals(this.metaSize, clusterImage.metaSize)
                && Objects.equals(this.name, clusterImage.name)
                && Objects.equals(this.size, clusterImage.size)
                && Objects.equals(this.upgradeFrom, clusterImage.upgradeFrom)
                && Objects.equals(this.upgradeToolVersion, clusterImage.upgradeToolVersion)
                && Objects.equals(this.version, clusterImage.version)
                && Objects.equals(this.zbsVersion, clusterImage.zbsVersion);
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
                cluster,
                entityAsyncStatus,
                id,
                localId,
                metaName,
                metaSize,
                name,
                size,
                upgradeFrom,
                upgradeToolVersion,
                version,
                zbsVersion);
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
        sb.append("class ClusterImage {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    metaName: ").append(toIndentedString(metaName)).append("\n");
        sb.append("    metaSize: ").append(toIndentedString(metaSize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    upgradeFrom: ").append(toIndentedString(upgradeFrom)).append("\n");
        sb.append("    upgradeToolVersion: ")
                .append(toIndentedString(upgradeToolVersion))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    zbsVersion: ").append(toIndentedString(zbsVersion)).append("\n");
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
