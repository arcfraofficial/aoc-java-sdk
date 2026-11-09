package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupStoreRepository */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupStoreRepository
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BACKUP_PLANS = "backup_plans";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS)
    private List<NestedBackupPlan> backupPlans = null;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS = "backup_restore_points";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS)
    private List<NestedBackupRestorePoint> backupRestorePoints = null;

    public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";

    @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
    private NestedBackupService backupService;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    private String errorCode;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME = "iscsi_chap_name";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME)
    private String iscsiChapName;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET = "iscsi_chap_secret";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET)
    private String iscsiChapSecret;

    public static final String SERIALIZED_NAME_ISCSI_IP = "iscsi_ip";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP)
    private String iscsiIp;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID = "iscsi_lun_id";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID)
    private String iscsiLunId;

    public static final String SERIALIZED_NAME_ISCSI_PORT = "iscsi_port";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT)
    private Integer iscsiPort;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN = "iscsi_target_iqn";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN)
    private String iscsiTargetIqn;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NFS_PATH = "nfs_path";

    @SerializedName(SERIALIZED_NAME_NFS_PATH)
    private String nfsPath;

    public static final String SERIALIZED_NAME_NFS_SERVER = "nfs_server";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER)
    private String nfsServer;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupStoreStatus status;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY = "total_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY)
    private Long totalCapacity;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupStoreType type;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP = "update_timestamp";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP)
    private String updateTimestamp;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE = "used_data_space_usage";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE)
    private Double usedDataSpaceUsage;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
    private Long validDataSpace;

    public BackupStoreRepository() {}

    public BackupStoreRepository backupPlans(List<NestedBackupPlan> backupPlans) {

        this.backupPlans = backupPlans;
        return this;
    }

    public BackupStoreRepository addBackupPlansItem(NestedBackupPlan backupPlansItem) {
        if (this.backupPlans == null) {
            this.backupPlans = new ArrayList<NestedBackupPlan>();
        }
        this.backupPlans.add(backupPlansItem);
        return this;
    }

    /**
     * Get backupPlans
     *
     * @return backupPlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBackupPlan> getBackupPlans() {
        return backupPlans;
    }

    public void setBackupPlans(List<NestedBackupPlan> backupPlans) {
        this.backupPlans = backupPlans;
    }

    public BackupStoreRepository backupPlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS);
        return this;
    }

    public BackupStoreRepository backupPlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS);
        return this;
    }

    public void setBackupPlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS);
        }
    }

    public boolean getBackupPlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS);
    }

    public BackupStoreRepository backupRestorePoints(
            List<NestedBackupRestorePoint> backupRestorePoints) {

        this.backupRestorePoints = backupRestorePoints;
        return this;
    }

    public BackupStoreRepository addBackupRestorePointsItem(
            NestedBackupRestorePoint backupRestorePointsItem) {
        if (this.backupRestorePoints == null) {
            this.backupRestorePoints = new ArrayList<NestedBackupRestorePoint>();
        }
        this.backupRestorePoints.add(backupRestorePointsItem);
        return this;
    }

    /**
     * Get backupRestorePoints
     *
     * @return backupRestorePoints
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBackupRestorePoint> getBackupRestorePoints() {
        return backupRestorePoints;
    }

    public void setBackupRestorePoints(List<NestedBackupRestorePoint> backupRestorePoints) {
        this.backupRestorePoints = backupRestorePoints;
    }

    public BackupStoreRepository backupRestorePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
        return this;
    }

    public BackupStoreRepository backupRestorePoints_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
        return this;
    }

    public void setBackupRestorePoints_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
        }
    }

    public boolean getBackupRestorePoints_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
    }

    public BackupStoreRepository backupService(NestedBackupService backupService) {

        this.backupService = backupService;
        return this;
    }

    /**
     * Get backupService
     *
     * @return backupService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBackupService getBackupService() {
        return backupService;
    }

    public void setBackupService(NestedBackupService backupService) {
        this.backupService = backupService;
    }

    public BackupStoreRepository backupService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public BackupStoreRepository backupService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public void setBackupService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        }
    }

    public boolean getBackupService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_SERVICE);
    }

    public BackupStoreRepository createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BackupStoreRepository createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public BackupStoreRepository createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public BackupStoreRepository description(String description) {

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

    public BackupStoreRepository description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupStoreRepository description_ExplictlyNonNull() {
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

    public BackupStoreRepository entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupStoreRepository entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupStoreRepository entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupStoreRepository errorCode(String errorCode) {

        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BackupStoreRepository errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public BackupStoreRepository errorCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public void setErrorCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        }
    }

    public boolean getErrorCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE);
    }

    public BackupStoreRepository id(String id) {

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

    public BackupStoreRepository id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupStoreRepository id_ExplictlyNonNull() {
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

    public BackupStoreRepository iscsiChapName(String iscsiChapName) {

        this.iscsiChapName = iscsiChapName;
        return this;
    }

    /**
     * Get iscsiChapName
     *
     * @return iscsiChapName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapName() {
        return iscsiChapName;
    }

    public void setIscsiChapName(String iscsiChapName) {
        this.iscsiChapName = iscsiChapName;
    }

    public BackupStoreRepository iscsiChapName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        return this;
    }

    public BackupStoreRepository iscsiChapName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        return this;
    }

    public void setIscsiChapName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        }
    }

    public boolean getIscsiChapName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME);
    }

    public BackupStoreRepository iscsiChapSecret(String iscsiChapSecret) {

        this.iscsiChapSecret = iscsiChapSecret;
        return this;
    }

    /**
     * Get iscsiChapSecret
     *
     * @return iscsiChapSecret
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecret() {
        return iscsiChapSecret;
    }

    public void setIscsiChapSecret(String iscsiChapSecret) {
        this.iscsiChapSecret = iscsiChapSecret;
    }

    public BackupStoreRepository iscsiChapSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        return this;
    }

    public BackupStoreRepository iscsiChapSecret_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        return this;
    }

    public void setIscsiChapSecret_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        }
    }

    public boolean getIscsiChapSecret_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
    }

    public BackupStoreRepository iscsiIp(String iscsiIp) {

        this.iscsiIp = iscsiIp;
        return this;
    }

    /**
     * Get iscsiIp
     *
     * @return iscsiIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIp() {
        return iscsiIp;
    }

    public void setIscsiIp(String iscsiIp) {
        this.iscsiIp = iscsiIp;
    }

    public BackupStoreRepository iscsiIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP);
        return this;
    }

    public BackupStoreRepository iscsiIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP);
        return this;
    }

    public void setIscsiIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP);
        }
    }

    public boolean getIscsiIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP);
    }

    public BackupStoreRepository iscsiLunId(String iscsiLunId) {

        this.iscsiLunId = iscsiLunId;
        return this;
    }

    /**
     * Get iscsiLunId
     *
     * @return iscsiLunId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunId() {
        return iscsiLunId;
    }

    public void setIscsiLunId(String iscsiLunId) {
        this.iscsiLunId = iscsiLunId;
    }

    public BackupStoreRepository iscsiLunId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public BackupStoreRepository iscsiLunId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public void setIscsiLunId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        }
    }

    public boolean getIscsiLunId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID);
    }

    public BackupStoreRepository iscsiPort(Integer iscsiPort) {

        this.iscsiPort = iscsiPort;
        return this;
    }

    /**
     * Get iscsiPort
     *
     * @return iscsiPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPort() {
        return iscsiPort;
    }

    public void setIscsiPort(Integer iscsiPort) {
        this.iscsiPort = iscsiPort;
    }

    public BackupStoreRepository iscsiPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public BackupStoreRepository iscsiPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public void setIscsiPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        }
    }

    public boolean getIscsiPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT);
    }

    public BackupStoreRepository iscsiTargetIqn(String iscsiTargetIqn) {

        this.iscsiTargetIqn = iscsiTargetIqn;
        return this;
    }

    /**
     * Get iscsiTargetIqn
     *
     * @return iscsiTargetIqn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqn() {
        return iscsiTargetIqn;
    }

    public void setIscsiTargetIqn(String iscsiTargetIqn) {
        this.iscsiTargetIqn = iscsiTargetIqn;
    }

    public BackupStoreRepository iscsiTargetIqn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        return this;
    }

    public BackupStoreRepository iscsiTargetIqn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        return this;
    }

    public void setIscsiTargetIqn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        }
    }

    public boolean getIscsiTargetIqn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN);
    }

    public BackupStoreRepository name(String name) {

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

    public BackupStoreRepository name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupStoreRepository name_ExplictlyNonNull() {
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

    public BackupStoreRepository nfsPath(String nfsPath) {

        this.nfsPath = nfsPath;
        return this;
    }

    /**
     * Get nfsPath
     *
     * @return nfsPath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPath() {
        return nfsPath;
    }

    public void setNfsPath(String nfsPath) {
        this.nfsPath = nfsPath;
    }

    public BackupStoreRepository nfsPath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH);
        return this;
    }

    public BackupStoreRepository nfsPath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH);
        return this;
    }

    public void setNfsPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH);
        }
    }

    public boolean getNfsPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH);
    }

    public BackupStoreRepository nfsServer(String nfsServer) {

        this.nfsServer = nfsServer;
        return this;
    }

    /**
     * Get nfsServer
     *
     * @return nfsServer
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServer() {
        return nfsServer;
    }

    public void setNfsServer(String nfsServer) {
        this.nfsServer = nfsServer;
    }

    public BackupStoreRepository nfsServer_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER);
        return this;
    }

    public BackupStoreRepository nfsServer_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER);
        return this;
    }

    public void setNfsServer_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER);
        }
    }

    public boolean getNfsServer_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER);
    }

    public BackupStoreRepository status(BackupStoreStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupStoreStatus getStatus() {
        return status;
    }

    public void setStatus(BackupStoreStatus status) {
        this.status = status;
    }

    public BackupStoreRepository status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupStoreRepository status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public BackupStoreRepository totalCapacity(Long totalCapacity) {

        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get totalCapacity
     *
     * @return totalCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public BackupStoreRepository totalCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY);
        return this;
    }

    public BackupStoreRepository totalCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY);
        return this;
    }

    public void setTotalCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY);
        }
    }

    public boolean getTotalCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY);
    }

    public BackupStoreRepository type(BackupStoreType type) {

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
    public BackupStoreType getType() {
        return type;
    }

    public void setType(BackupStoreType type) {
        this.type = type;
    }

    public BackupStoreRepository type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupStoreRepository type_ExplictlyNonNull() {
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

    public BackupStoreRepository updateTimestamp(String updateTimestamp) {

        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * Get updateTimestamp
     *
     * @return updateTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public BackupStoreRepository updateTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        return this;
    }

    public BackupStoreRepository updateTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        return this;
    }

    public void setUpdateTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        }
    }

    public boolean getUpdateTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP);
    }

    public BackupStoreRepository usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public BackupStoreRepository usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public BackupStoreRepository usedDataSpace_ExplictlyNonNull() {
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

    public BackupStoreRepository usedDataSpaceUsage(Double usedDataSpaceUsage) {

        this.usedDataSpaceUsage = usedDataSpaceUsage;
        return this;
    }

    /**
     * Get usedDataSpaceUsage
     *
     * @return usedDataSpaceUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsage() {
        return usedDataSpaceUsage;
    }

    public void setUsedDataSpaceUsage(Double usedDataSpaceUsage) {
        this.usedDataSpaceUsage = usedDataSpaceUsage;
    }

    public BackupStoreRepository usedDataSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        return this;
    }

    public BackupStoreRepository usedDataSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        return this;
    }

    public void setUsedDataSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        }
    }

    public boolean getUsedDataSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
    }

    public BackupStoreRepository validDataSpace(Long validDataSpace) {

        this.validDataSpace = validDataSpace;
        return this;
    }

    /**
     * Get validDataSpace
     *
     * @return validDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpace() {
        return validDataSpace;
    }

    public void setValidDataSpace(Long validDataSpace) {
        this.validDataSpace = validDataSpace;
    }

    public BackupStoreRepository validDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public BackupStoreRepository validDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public void setValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        }
    }

    public boolean getValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupStoreRepository backupStoreRepository = (BackupStoreRepository) o;
        return Objects.equals(this.backupPlans, backupStoreRepository.backupPlans)
                && Objects.equals(
                        this.backupRestorePoints, backupStoreRepository.backupRestorePoints)
                && Objects.equals(this.backupService, backupStoreRepository.backupService)
                && Objects.equals(this.createdAt, backupStoreRepository.createdAt)
                && Objects.equals(this.description, backupStoreRepository.description)
                && Objects.equals(this.entityAsyncStatus, backupStoreRepository.entityAsyncStatus)
                && Objects.equals(this.errorCode, backupStoreRepository.errorCode)
                && Objects.equals(this.id, backupStoreRepository.id)
                && Objects.equals(this.iscsiChapName, backupStoreRepository.iscsiChapName)
                && Objects.equals(this.iscsiChapSecret, backupStoreRepository.iscsiChapSecret)
                && Objects.equals(this.iscsiIp, backupStoreRepository.iscsiIp)
                && Objects.equals(this.iscsiLunId, backupStoreRepository.iscsiLunId)
                && Objects.equals(this.iscsiPort, backupStoreRepository.iscsiPort)
                && Objects.equals(this.iscsiTargetIqn, backupStoreRepository.iscsiTargetIqn)
                && Objects.equals(this.name, backupStoreRepository.name)
                && Objects.equals(this.nfsPath, backupStoreRepository.nfsPath)
                && Objects.equals(this.nfsServer, backupStoreRepository.nfsServer)
                && Objects.equals(this.status, backupStoreRepository.status)
                && Objects.equals(this.totalCapacity, backupStoreRepository.totalCapacity)
                && Objects.equals(this.type, backupStoreRepository.type)
                && Objects.equals(this.updateTimestamp, backupStoreRepository.updateTimestamp)
                && Objects.equals(this.usedDataSpace, backupStoreRepository.usedDataSpace)
                && Objects.equals(this.usedDataSpaceUsage, backupStoreRepository.usedDataSpaceUsage)
                && Objects.equals(this.validDataSpace, backupStoreRepository.validDataSpace);
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
                backupPlans,
                backupRestorePoints,
                backupService,
                createdAt,
                description,
                entityAsyncStatus,
                errorCode,
                id,
                iscsiChapName,
                iscsiChapSecret,
                iscsiIp,
                iscsiLunId,
                iscsiPort,
                iscsiTargetIqn,
                name,
                nfsPath,
                nfsServer,
                status,
                totalCapacity,
                type,
                updateTimestamp,
                usedDataSpace,
                usedDataSpaceUsage,
                validDataSpace);
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
        sb.append("class BackupStoreRepository {\n");
        sb.append("    backupPlans: ").append(toIndentedString(backupPlans)).append("\n");
        sb.append("    backupRestorePoints: ")
                .append(toIndentedString(backupRestorePoints))
                .append("\n");
        sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iscsiChapName: ").append(toIndentedString(iscsiChapName)).append("\n");
        sb.append("    iscsiChapSecret: ").append(toIndentedString(iscsiChapSecret)).append("\n");
        sb.append("    iscsiIp: ").append(toIndentedString(iscsiIp)).append("\n");
        sb.append("    iscsiLunId: ").append(toIndentedString(iscsiLunId)).append("\n");
        sb.append("    iscsiPort: ").append(toIndentedString(iscsiPort)).append("\n");
        sb.append("    iscsiTargetIqn: ").append(toIndentedString(iscsiTargetIqn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nfsPath: ").append(toIndentedString(nfsPath)).append("\n");
        sb.append("    nfsServer: ").append(toIndentedString(nfsServer)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedDataSpaceUsage: ")
                .append(toIndentedString(usedDataSpaceUsage))
                .append("\n");
        sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
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
