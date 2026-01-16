package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVolumeSnapshot */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeSnapshot extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CREATE_AT = "createAt";

    @SerializedName(SERIALIZED_NAME_CREATE_AT)
    private String createAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K = "elf_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K)
    private Integer elfStoragePolicyEcK;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M = "elf_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M)
    private Integer elfStoragePolicyEcM;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM =
            "elf_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM)
    private Integer elfStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION =
            "elf_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION)
    private Boolean elfStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
    private Double sharedSize;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Double size;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmVolumeSnapshotType type;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Double uniqueSize;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private NestedVmVolume vmVolume;

    public static final String SERIALIZED_NAME_VOLUME_SHARING = "volume_sharing";

    @SerializedName(SERIALIZED_NAME_VOLUME_SHARING)
    private Boolean volumeSharing;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume_size";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Double volumeSize;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID = "zbs_snapshot_uuid";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID)
    private String zbsSnapshotUuid;

    public VmVolumeSnapshot() {}

    public VmVolumeSnapshot cluster(NestedCluster cluster) {

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

    public VmVolumeSnapshot cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmVolumeSnapshot cluster_ExplictlyNonNull() {
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

    public VmVolumeSnapshot createAt(String createAt) {

        this.createAt = createAt;
        return this;
    }

    /**
     * Get createAt
     *
     * @return createAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public VmVolumeSnapshot createAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT);
        return this;
    }

    public VmVolumeSnapshot createAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT);
        return this;
    }

    public void setCreateAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT);
        }
    }

    public boolean getCreateAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT);
    }

    public VmVolumeSnapshot description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmVolumeSnapshot description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmVolumeSnapshot description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public VmVolumeSnapshot elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public VmVolumeSnapshot elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmVolumeSnapshot elfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY);
    }

    public VmVolumeSnapshot elfStoragePolicyEcK(Integer elfStoragePolicyEcK) {

        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
        return this;
    }

    /**
     * Get elfStoragePolicyEcK
     *
     * @return elfStoragePolicyEcK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcK() {
        return elfStoragePolicyEcK;
    }

    public void setElfStoragePolicyEcK(Integer elfStoragePolicyEcK) {
        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
    }

    public VmVolumeSnapshot elfStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public VmVolumeSnapshot elfStoragePolicyEcK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public void setElfStoragePolicyEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        }
    }

    public boolean getElfStoragePolicyEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
    }

    public VmVolumeSnapshot elfStoragePolicyEcM(Integer elfStoragePolicyEcM) {

        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
        return this;
    }

    /**
     * Get elfStoragePolicyEcM
     *
     * @return elfStoragePolicyEcM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcM() {
        return elfStoragePolicyEcM;
    }

    public void setElfStoragePolicyEcM(Integer elfStoragePolicyEcM) {
        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
    }

    public VmVolumeSnapshot elfStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public VmVolumeSnapshot elfStoragePolicyEcM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public void setElfStoragePolicyEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        }
    }

    public boolean getElfStoragePolicyEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
    }

    public VmVolumeSnapshot elfStoragePolicyReplicaNum(Integer elfStoragePolicyReplicaNum) {

        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNum
     *
     * @return elfStoragePolicyReplicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNum() {
        return elfStoragePolicyReplicaNum;
    }

    public void setElfStoragePolicyReplicaNum(Integer elfStoragePolicyReplicaNum) {
        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
    }

    public VmVolumeSnapshot elfStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public VmVolumeSnapshot elfStoragePolicyReplicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public void setElfStoragePolicyReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        }
    }

    public boolean getElfStoragePolicyReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
    }

    public VmVolumeSnapshot elfStoragePolicyThinProvision(Boolean elfStoragePolicyThinProvision) {

        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
        return this;
    }

    /**
     * Get elfStoragePolicyThinProvision
     *
     * @return elfStoragePolicyThinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getElfStoragePolicyThinProvision() {
        return elfStoragePolicyThinProvision;
    }

    public void setElfStoragePolicyThinProvision(Boolean elfStoragePolicyThinProvision) {
        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
    }

    public VmVolumeSnapshot elfStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public VmVolumeSnapshot elfStoragePolicyThinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public void setElfStoragePolicyThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        }
    }

    public boolean getElfStoragePolicyThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
    }

    public VmVolumeSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmVolumeSnapshot entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmVolumeSnapshot entityAsyncStatus_ExplictlyNonNull() {
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

    public VmVolumeSnapshot id(String id) {

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

    public VmVolumeSnapshot id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmVolumeSnapshot id_ExplictlyNonNull() {
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

    public VmVolumeSnapshot labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public VmVolumeSnapshot addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public VmVolumeSnapshot labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public VmVolumeSnapshot labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public VmVolumeSnapshot localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public VmVolumeSnapshot localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmVolumeSnapshot localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public VmVolumeSnapshot localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VmVolumeSnapshot localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmVolumeSnapshot localId_ExplictlyNonNull() {
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

    public VmVolumeSnapshot name(String name) {

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

    public VmVolumeSnapshot name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolumeSnapshot name_ExplictlyNonNull() {
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

    public VmVolumeSnapshot residentInCache(Boolean residentInCache) {

        this.residentInCache = residentInCache;
        return this;
    }

    /**
     * Get residentInCache
     *
     * @return residentInCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResidentInCache() {
        return residentInCache;
    }

    public void setResidentInCache(Boolean residentInCache) {
        this.residentInCache = residentInCache;
    }

    public VmVolumeSnapshot residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public VmVolumeSnapshot residentInCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public void setResidentInCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        }
    }

    public boolean getResidentInCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE);
    }

    public VmVolumeSnapshot sharedSize(Double sharedSize) {

        this.sharedSize = sharedSize;
        return this;
    }

    /**
     * Get sharedSize
     *
     * @return sharedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Double sharedSize) {
        this.sharedSize = sharedSize;
    }

    public VmVolumeSnapshot sharedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public VmVolumeSnapshot sharedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public void setSharedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        }
    }

    public boolean getSharedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE);
    }

    public VmVolumeSnapshot size(Double size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public VmVolumeSnapshot size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmVolumeSnapshot size_ExplictlyNonNull() {
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

    public VmVolumeSnapshot type(VmVolumeSnapshotType type) {

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
    public VmVolumeSnapshotType getType() {
        return type;
    }

    public void setType(VmVolumeSnapshotType type) {
        this.type = type;
    }

    public VmVolumeSnapshot type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmVolumeSnapshot type_ExplictlyNonNull() {
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

    public VmVolumeSnapshot uniqueSize(Double uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Double uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public VmVolumeSnapshot uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public VmVolumeSnapshot uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    public VmVolumeSnapshot vmVolume(NestedVmVolume vmVolume) {

        this.vmVolume = vmVolume;
        return this;
    }

    /**
     * Get vmVolume
     *
     * @return vmVolume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVmVolume getVmVolume() {
        return vmVolume;
    }

    public void setVmVolume(NestedVmVolume vmVolume) {
        this.vmVolume = vmVolume;
    }

    public VmVolumeSnapshot vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public VmVolumeSnapshot vmVolume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public void setVmVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        }
    }

    public boolean getVmVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME);
    }

    public VmVolumeSnapshot volumeSharing(Boolean volumeSharing) {

        this.volumeSharing = volumeSharing;
        return this;
    }

    /**
     * Get volumeSharing
     *
     * @return volumeSharing
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVolumeSharing() {
        return volumeSharing;
    }

    public void setVolumeSharing(Boolean volumeSharing) {
        this.volumeSharing = volumeSharing;
    }

    public VmVolumeSnapshot volumeSharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING);
        return this;
    }

    public VmVolumeSnapshot volumeSharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING);
        return this;
    }

    public void setVolumeSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING);
        }
    }

    public boolean getVolumeSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SHARING);
    }

    public VmVolumeSnapshot volumeSize(Double volumeSize) {

        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Get volumeSize
     *
     * @return volumeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Double volumeSize) {
        this.volumeSize = volumeSize;
    }

    public VmVolumeSnapshot volumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public VmVolumeSnapshot volumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public void setVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        }
    }

    public boolean getVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE);
    }

    public VmVolumeSnapshot zbsSnapshotUuid(String zbsSnapshotUuid) {

        this.zbsSnapshotUuid = zbsSnapshotUuid;
        return this;
    }

    /**
     * Get zbsSnapshotUuid
     *
     * @return zbsSnapshotUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuid() {
        return zbsSnapshotUuid;
    }

    public void setZbsSnapshotUuid(String zbsSnapshotUuid) {
        this.zbsSnapshotUuid = zbsSnapshotUuid;
    }

    public VmVolumeSnapshot zbsSnapshotUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        return this;
    }

    public VmVolumeSnapshot zbsSnapshotUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        return this;
    }

    public void setZbsSnapshotUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        }
    }

    public boolean getZbsSnapshotUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVolumeSnapshot vmVolumeSnapshot = (VmVolumeSnapshot) o;
        return Objects.equals(this.cluster, vmVolumeSnapshot.cluster)
                && Objects.equals(this.createAt, vmVolumeSnapshot.createAt)
                && Objects.equals(this.description, vmVolumeSnapshot.description)
                && Objects.equals(this.elfStoragePolicy, vmVolumeSnapshot.elfStoragePolicy)
                && Objects.equals(this.elfStoragePolicyEcK, vmVolumeSnapshot.elfStoragePolicyEcK)
                && Objects.equals(this.elfStoragePolicyEcM, vmVolumeSnapshot.elfStoragePolicyEcM)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNum,
                        vmVolumeSnapshot.elfStoragePolicyReplicaNum)
                && Objects.equals(
                        this.elfStoragePolicyThinProvision,
                        vmVolumeSnapshot.elfStoragePolicyThinProvision)
                && Objects.equals(this.entityAsyncStatus, vmVolumeSnapshot.entityAsyncStatus)
                && Objects.equals(this.id, vmVolumeSnapshot.id)
                && Objects.equals(this.labels, vmVolumeSnapshot.labels)
                && Objects.equals(this.localCreatedAt, vmVolumeSnapshot.localCreatedAt)
                && Objects.equals(this.localId, vmVolumeSnapshot.localId)
                && Objects.equals(this.name, vmVolumeSnapshot.name)
                && Objects.equals(this.residentInCache, vmVolumeSnapshot.residentInCache)
                && Objects.equals(this.sharedSize, vmVolumeSnapshot.sharedSize)
                && Objects.equals(this.size, vmVolumeSnapshot.size)
                && Objects.equals(this.type, vmVolumeSnapshot.type)
                && Objects.equals(this.uniqueSize, vmVolumeSnapshot.uniqueSize)
                && Objects.equals(this.vmVolume, vmVolumeSnapshot.vmVolume)
                && Objects.equals(this.volumeSharing, vmVolumeSnapshot.volumeSharing)
                && Objects.equals(this.volumeSize, vmVolumeSnapshot.volumeSize)
                && Objects.equals(this.zbsSnapshotUuid, vmVolumeSnapshot.zbsSnapshotUuid);
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
                createAt,
                description,
                elfStoragePolicy,
                elfStoragePolicyEcK,
                elfStoragePolicyEcM,
                elfStoragePolicyReplicaNum,
                elfStoragePolicyThinProvision,
                entityAsyncStatus,
                id,
                labels,
                localCreatedAt,
                localId,
                name,
                residentInCache,
                sharedSize,
                size,
                type,
                uniqueSize,
                vmVolume,
                volumeSharing,
                volumeSize,
                zbsSnapshotUuid);
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
        sb.append("class VmVolumeSnapshot {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    elfStoragePolicyEcK: ")
                .append(toIndentedString(elfStoragePolicyEcK))
                .append("\n");
        sb.append("    elfStoragePolicyEcM: ")
                .append(toIndentedString(elfStoragePolicyEcM))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNum: ")
                .append(toIndentedString(elfStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    elfStoragePolicyThinProvision: ")
                .append(toIndentedString(elfStoragePolicyThinProvision))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
        sb.append("    volumeSharing: ").append(toIndentedString(volumeSharing)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    zbsSnapshotUuid: ").append(toIndentedString(zbsSnapshotUuid)).append("\n");
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
