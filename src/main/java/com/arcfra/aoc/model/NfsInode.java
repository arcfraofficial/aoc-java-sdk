package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NfsInode */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NfsInode extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
    private Long assignedSize;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD = "encrypt_method";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD)
    private EncryptMethod encryptMethod;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FILE = "file";

    @SerializedName(SERIALIZED_NAME_FILE)
    private Boolean _file;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
    private String localUpdatedAt;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NFS_EXPORT = "nfs_export";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT)
    private NestedNfsExport nfsExport;

    public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";

    @SerializedName(SERIALIZED_NAME_PARENT_ID)
    private String parentId;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
    private Long sharedSize;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
    private Integer snapshotNum;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public NfsInode() {}

    public NfsInode assignedSize(Long assignedSize) {

        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * Get assignedSize
     *
     * @return assignedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Long assignedSize) {
        this.assignedSize = assignedSize;
    }

    public NfsInode assignedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public NfsInode assignedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public void setAssignedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        }
    }

    public boolean getAssignedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE);
    }

    public NfsInode downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpace
     *
     * @return downgradedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpace() {
        return downgradedPrioritizedSpace;
    }

    public void setDowngradedPrioritizedSpace(Long downgradedPrioritizedSpace) {
        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
    }

    public NfsInode downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public NfsInode downgradedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public void setDowngradedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        }
    }

    public boolean getDowngradedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
    }

    public NfsInode ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public NfsInode ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NfsInode ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public NfsInode ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public NfsInode ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NfsInode ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public NfsInode encryptMethod(EncryptMethod encryptMethod) {

        this.encryptMethod = encryptMethod;
        return this;
    }

    /**
     * Get encryptMethod
     *
     * @return encryptMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EncryptMethod getEncryptMethod() {
        return encryptMethod;
    }

    public void setEncryptMethod(EncryptMethod encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    public NfsInode encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NfsInode encryptMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public void setEncryptMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        }
    }

    public boolean getEncryptMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD);
    }

    public NfsInode entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NfsInode entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NfsInode entityAsyncStatus_ExplictlyNonNull() {
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

    public NfsInode _file(Boolean _file) {

        this._file = _file;
        return this;
    }

    /**
     * Get _file
     *
     * @return _file
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getFile() {
        return _file;
    }

    public void setFile(Boolean _file) {
        this._file = _file;
    }

    public NfsInode _file_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE);
        return this;
    }

    public NfsInode _file_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE);
        return this;
    }

    public void setFile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE);
        }
    }

    public boolean getFile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE);
    }

    public NfsInode id(String id) {

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

    public NfsInode id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NfsInode id_ExplictlyNonNull() {
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

    public NfsInode labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public NfsInode addLabelsItem(NestedLabel labelsItem) {
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

    public NfsInode labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public NfsInode labels_ExplictlyNonNull() {
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

    public NfsInode localId(String localId) {

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

    public NfsInode localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NfsInode localId_ExplictlyNonNull() {
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

    public NfsInode localUpdatedAt(String localUpdatedAt) {

        this.localUpdatedAt = localUpdatedAt;
        return this;
    }

    /**
     * Get localUpdatedAt
     *
     * @return localUpdatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalUpdatedAt() {
        return localUpdatedAt;
    }

    public void setLocalUpdatedAt(String localUpdatedAt) {
        this.localUpdatedAt = localUpdatedAt;
    }

    public NfsInode localUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public NfsInode localUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public void setLocalUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        }
    }

    public boolean getLocalUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT);
    }

    public NfsInode name(String name) {

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

    public NfsInode name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NfsInode name_ExplictlyNonNull() {
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

    public NfsInode nfsExport(NestedNfsExport nfsExport) {

        this.nfsExport = nfsExport;
        return this;
    }

    /**
     * Get nfsExport
     *
     * @return nfsExport
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedNfsExport getNfsExport() {
        return nfsExport;
    }

    public void setNfsExport(NestedNfsExport nfsExport) {
        this.nfsExport = nfsExport;
    }

    public NfsInode nfsExport_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public NfsInode nfsExport_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public void setNfsExport_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        }
    }

    public boolean getNfsExport_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT);
    }

    public NfsInode parentId(String parentId) {

        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     *
     * @return parentId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public NfsInode parentId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public NfsInode parentId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public void setParentId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        }
    }

    public boolean getParentId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID);
    }

    public NfsInode prioritized(Boolean prioritized) {

        this.prioritized = prioritized;
        return this;
    }

    /**
     * Get prioritized
     *
     * @return prioritized
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(Boolean prioritized) {
        this.prioritized = prioritized;
    }

    public NfsInode prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NfsInode prioritized_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public void setPrioritized_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        }
    }

    public boolean getPrioritized_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIORITIZED);
    }

    public NfsInode resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public NfsInode resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NfsInode resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public NfsInode sharedSize(Long sharedSize) {

        this.sharedSize = sharedSize;
        return this;
    }

    /**
     * Get sharedSize
     *
     * @return sharedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Long sharedSize) {
        this.sharedSize = sharedSize;
    }

    public NfsInode sharedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public NfsInode sharedSize_ExplictlyNonNull() {
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

    public NfsInode snapshotNum(Integer snapshotNum) {

        this.snapshotNum = snapshotNum;
        return this;
    }

    /**
     * Get snapshotNum
     *
     * @return snapshotNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSnapshotNum() {
        return snapshotNum;
    }

    public void setSnapshotNum(Integer snapshotNum) {
        this.snapshotNum = snapshotNum;
    }

    public NfsInode snapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public NfsInode snapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public void setSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        }
    }

    public boolean getSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM);
    }

    public NfsInode uniqueLogicalSize(Double uniqueLogicalSize) {

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

    public NfsInode uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public NfsInode uniqueLogicalSize_ExplictlyNonNull() {
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

    public NfsInode uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public NfsInode uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public NfsInode uniqueSize_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NfsInode nfsInode = (NfsInode) o;
        return Objects.equals(this.assignedSize, nfsInode.assignedSize)
                && Objects.equals(
                        this.downgradedPrioritizedSpace, nfsInode.downgradedPrioritizedSpace)
                && Objects.equals(this.ecK, nfsInode.ecK)
                && Objects.equals(this.ecM, nfsInode.ecM)
                && Objects.equals(this.encryptMethod, nfsInode.encryptMethod)
                && Objects.equals(this.entityAsyncStatus, nfsInode.entityAsyncStatus)
                && Objects.equals(this._file, nfsInode._file)
                && Objects.equals(this.id, nfsInode.id)
                && Objects.equals(this.labels, nfsInode.labels)
                && Objects.equals(this.localId, nfsInode.localId)
                && Objects.equals(this.localUpdatedAt, nfsInode.localUpdatedAt)
                && Objects.equals(this.name, nfsInode.name)
                && Objects.equals(this.nfsExport, nfsInode.nfsExport)
                && Objects.equals(this.parentId, nfsInode.parentId)
                && Objects.equals(this.prioritized, nfsInode.prioritized)
                && Objects.equals(this.resiliencyType, nfsInode.resiliencyType)
                && Objects.equals(this.sharedSize, nfsInode.sharedSize)
                && Objects.equals(this.snapshotNum, nfsInode.snapshotNum)
                && Objects.equals(this.uniqueLogicalSize, nfsInode.uniqueLogicalSize)
                && Objects.equals(this.uniqueSize, nfsInode.uniqueSize);
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
                assignedSize,
                downgradedPrioritizedSpace,
                ecK,
                ecM,
                encryptMethod,
                entityAsyncStatus,
                _file,
                id,
                labels,
                localId,
                localUpdatedAt,
                name,
                nfsExport,
                parentId,
                prioritized,
                resiliencyType,
                sharedSize,
                snapshotNum,
                uniqueLogicalSize,
                uniqueSize);
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
        sb.append("class NfsInode {\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nfsExport: ").append(toIndentedString(nfsExport)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
        sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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
