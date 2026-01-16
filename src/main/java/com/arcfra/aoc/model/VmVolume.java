package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVolume */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolume extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

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

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
    private Double guestSizeUsage;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
    private Long guestUsedSize;

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

    public static final String SERIALIZED_NAME_LUN = "lun";

    @SerializedName(SERIALIZED_NAME_LUN)
    private NestedIscsiLun lun;

    public static final String SERIALIZED_NAME_MOUNTING = "mounting";

    @SerializedName(SERIALIZED_NAME_MOUNTING)
    private Boolean mounting;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_SHARING = "sharing";

    @SerializedName(SERIALIZED_NAME_SHARING)
    private Boolean sharing;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmVolumeType type;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_USED_SIZE = "used_size";

    @SerializedName(SERIALIZED_NAME_USED_SIZE)
    private Long usedSize;

    public static final String SERIALIZED_NAME_USED_SIZE_USAGE = "used_size_usage";

    @SerializedName(SERIALIZED_NAME_USED_SIZE_USAGE)
    private Double usedSizeUsage;

    public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";

    @SerializedName(SERIALIZED_NAME_VM_DISKS)
    private List<NestedVmDisk> vmDisks = null;

    public VmVolume() {}

    public VmVolume cluster(NestedCluster cluster) {

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

    public VmVolume cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmVolume cluster_ExplictlyNonNull() {
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

    public VmVolume description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmVolume description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmVolume description_ExplictlyNonNull() {
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

    public VmVolume elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

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

    public VmVolume elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmVolume elfStoragePolicy_ExplictlyNonNull() {
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

    public VmVolume elfStoragePolicyEcK(Integer elfStoragePolicyEcK) {

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

    public VmVolume elfStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public VmVolume elfStoragePolicyEcK_ExplictlyNonNull() {
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

    public VmVolume elfStoragePolicyEcM(Integer elfStoragePolicyEcM) {

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

    public VmVolume elfStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public VmVolume elfStoragePolicyEcM_ExplictlyNonNull() {
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

    public VmVolume elfStoragePolicyReplicaNum(Integer elfStoragePolicyReplicaNum) {

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

    public VmVolume elfStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public VmVolume elfStoragePolicyReplicaNum_ExplictlyNonNull() {
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

    public VmVolume elfStoragePolicyThinProvision(Boolean elfStoragePolicyThinProvision) {

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

    public VmVolume elfStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public VmVolume elfStoragePolicyThinProvision_ExplictlyNonNull() {
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

    public VmVolume entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmVolume entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmVolume entityAsyncStatus_ExplictlyNonNull() {
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

    public VmVolume guestSizeUsage(Double guestSizeUsage) {

        this.guestSizeUsage = guestSizeUsage;
        return this;
    }

    /**
     * Get guestSizeUsage
     *
     * @return guestSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsage() {
        return guestSizeUsage;
    }

    public void setGuestSizeUsage(Double guestSizeUsage) {
        this.guestSizeUsage = guestSizeUsage;
    }

    public VmVolume guestSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public VmVolume guestSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public void setGuestSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        }
    }

    public boolean getGuestSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE);
    }

    public VmVolume guestUsedSize(Long guestUsedSize) {

        this.guestUsedSize = guestUsedSize;
        return this;
    }

    /**
     * Get guestUsedSize
     *
     * @return guestUsedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSize() {
        return guestUsedSize;
    }

    public void setGuestUsedSize(Long guestUsedSize) {
        this.guestUsedSize = guestUsedSize;
    }

    public VmVolume guestUsedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public VmVolume guestUsedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public void setGuestUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        }
    }

    public boolean getGuestUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE);
    }

    public VmVolume id(String id) {

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

    public VmVolume id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmVolume id_ExplictlyNonNull() {
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

    public VmVolume labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public VmVolume addLabelsItem(NestedLabel labelsItem) {
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

    public VmVolume labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public VmVolume labels_ExplictlyNonNull() {
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

    public VmVolume localCreatedAt(String localCreatedAt) {

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

    public VmVolume localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmVolume localCreatedAt_ExplictlyNonNull() {
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

    public VmVolume localId(String localId) {

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

    public VmVolume localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmVolume localId_ExplictlyNonNull() {
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

    public VmVolume lun(NestedIscsiLun lun) {

        this.lun = lun;
        return this;
    }

    /**
     * Get lun
     *
     * @return lun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedIscsiLun getLun() {
        return lun;
    }

    public void setLun(NestedIscsiLun lun) {
        this.lun = lun;
    }

    public VmVolume lun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN);
        return this;
    }

    public VmVolume lun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN);
        return this;
    }

    public void setLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN);
        }
    }

    public boolean getLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN);
    }

    public VmVolume mounting(Boolean mounting) {

        this.mounting = mounting;
        return this;
    }

    /**
     * Get mounting
     *
     * @return mounting
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getMounting() {
        return mounting;
    }

    public void setMounting(Boolean mounting) {
        this.mounting = mounting;
    }

    public VmVolume mounting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTING);
        return this;
    }

    public VmVolume mounting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTING);
        return this;
    }

    public void setMounting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTING);
        }
    }

    public boolean getMounting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTING);
    }

    public VmVolume name(String name) {

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

    public VmVolume name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolume name_ExplictlyNonNull() {
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

    public VmVolume path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VmVolume path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public VmVolume path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public VmVolume residentInCache(Boolean residentInCache) {

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

    public VmVolume residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public VmVolume residentInCache_ExplictlyNonNull() {
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

    public VmVolume sharing(Boolean sharing) {

        this.sharing = sharing;
        return this;
    }

    /**
     * Get sharing
     *
     * @return sharing
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getSharing() {
        return sharing;
    }

    public void setSharing(Boolean sharing) {
        this.sharing = sharing;
    }

    public VmVolume sharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARING);
        return this;
    }

    public VmVolume sharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        return this;
    }

    public void setSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        }
    }

    public boolean getSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARING);
    }

    public VmVolume size(Long size) {

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

    public VmVolume size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmVolume size_ExplictlyNonNull() {
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

    public VmVolume type(VmVolumeType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeType getType() {
        return type;
    }

    public void setType(VmVolumeType type) {
        this.type = type;
    }

    public VmVolume type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmVolume type_ExplictlyNonNull() {
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

    public VmVolume uniqueLogicalSize(Double uniqueLogicalSize) {

        this.uniqueLogicalSize = uniqueLogicalSize;
        return this;
    }

    /**
     * Get uniqueLogicalSize
     *
     * @return uniqueLogicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSize() {
        return uniqueLogicalSize;
    }

    public void setUniqueLogicalSize(Double uniqueLogicalSize) {
        this.uniqueLogicalSize = uniqueLogicalSize;
    }

    public VmVolume uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public VmVolume uniqueLogicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public void setUniqueLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        }
    }

    public boolean getUniqueLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
    }

    public VmVolume uniqueSize(Long uniqueSize) {

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
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public VmVolume uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public VmVolume uniqueSize_ExplictlyNonNull() {
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

    public VmVolume usedSize(Long usedSize) {

        this.usedSize = usedSize;
        return this;
    }

    /**
     * Get usedSize
     *
     * @return usedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public VmVolume usedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public VmVolume usedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public void setUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        }
    }

    public boolean getUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_SIZE);
    }

    public VmVolume usedSizeUsage(Double usedSizeUsage) {

        this.usedSizeUsage = usedSizeUsage;
        return this;
    }

    /**
     * Get usedSizeUsage
     *
     * @return usedSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedSizeUsage() {
        return usedSizeUsage;
    }

    public void setUsedSizeUsage(Double usedSizeUsage) {
        this.usedSizeUsage = usedSizeUsage;
    }

    public VmVolume usedSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_SIZE_USAGE);
        return this;
    }

    public VmVolume usedSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE_USAGE);
        return this;
    }

    public void setUsedSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE_USAGE);
        }
    }

    public boolean getUsedSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_SIZE_USAGE);
    }

    public VmVolume vmDisks(List<NestedVmDisk> vmDisks) {

        this.vmDisks = vmDisks;
        return this;
    }

    public VmVolume addVmDisksItem(NestedVmDisk vmDisksItem) {
        if (this.vmDisks == null) {
            this.vmDisks = new ArrayList<NestedVmDisk>();
        }
        this.vmDisks.add(vmDisksItem);
        return this;
    }

    /**
     * Get vmDisks
     *
     * @return vmDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmDisk> getVmDisks() {
        return vmDisks;
    }

    public void setVmDisks(List<NestedVmDisk> vmDisks) {
        this.vmDisks = vmDisks;
    }

    public VmVolume vmDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public VmVolume vmDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public void setVmDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        }
    }

    public boolean getVmDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVolume vmVolume = (VmVolume) o;
        return Objects.equals(this.cluster, vmVolume.cluster)
                && Objects.equals(this.description, vmVolume.description)
                && Objects.equals(this.elfStoragePolicy, vmVolume.elfStoragePolicy)
                && Objects.equals(this.elfStoragePolicyEcK, vmVolume.elfStoragePolicyEcK)
                && Objects.equals(this.elfStoragePolicyEcM, vmVolume.elfStoragePolicyEcM)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNum, vmVolume.elfStoragePolicyReplicaNum)
                && Objects.equals(
                        this.elfStoragePolicyThinProvision, vmVolume.elfStoragePolicyThinProvision)
                && Objects.equals(this.entityAsyncStatus, vmVolume.entityAsyncStatus)
                && Objects.equals(this.guestSizeUsage, vmVolume.guestSizeUsage)
                && Objects.equals(this.guestUsedSize, vmVolume.guestUsedSize)
                && Objects.equals(this.id, vmVolume.id)
                && Objects.equals(this.labels, vmVolume.labels)
                && Objects.equals(this.localCreatedAt, vmVolume.localCreatedAt)
                && Objects.equals(this.localId, vmVolume.localId)
                && Objects.equals(this.lun, vmVolume.lun)
                && Objects.equals(this.mounting, vmVolume.mounting)
                && Objects.equals(this.name, vmVolume.name)
                && Objects.equals(this.path, vmVolume.path)
                && Objects.equals(this.residentInCache, vmVolume.residentInCache)
                && Objects.equals(this.sharing, vmVolume.sharing)
                && Objects.equals(this.size, vmVolume.size)
                && Objects.equals(this.type, vmVolume.type)
                && Objects.equals(this.uniqueLogicalSize, vmVolume.uniqueLogicalSize)
                && Objects.equals(this.uniqueSize, vmVolume.uniqueSize)
                && Objects.equals(this.usedSize, vmVolume.usedSize)
                && Objects.equals(this.usedSizeUsage, vmVolume.usedSizeUsage)
                && Objects.equals(this.vmDisks, vmVolume.vmDisks);
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
                description,
                elfStoragePolicy,
                elfStoragePolicyEcK,
                elfStoragePolicyEcM,
                elfStoragePolicyReplicaNum,
                elfStoragePolicyThinProvision,
                entityAsyncStatus,
                guestSizeUsage,
                guestUsedSize,
                id,
                labels,
                localCreatedAt,
                localId,
                lun,
                mounting,
                name,
                path,
                residentInCache,
                sharing,
                size,
                type,
                uniqueLogicalSize,
                uniqueSize,
                usedSize,
                usedSizeUsage,
                vmDisks);
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
        sb.append("class VmVolume {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
        sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
        sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
        sb.append("    mounting: ").append(toIndentedString(mounting)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    usedSizeUsage: ").append(toIndentedString(usedSizeUsage)).append("\n");
        sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
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
