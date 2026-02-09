package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupPlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION = "backup_delay_option";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION)
    private BackupPlanDelayOption backupDelayOption;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS = "backup_plan_executions";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS)
    private List<NestedBackupPlanExecution> backupPlanExecutions = null;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT =
            "backup_restore_point_count";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT)
    private Integer backupRestorePointCount;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS = "backup_restore_points";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS)
    private List<NestedBackupRestorePoint> backupRestorePoints = null;

    public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";

    @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
    private NestedBackupService backupService;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORY = "backup_store_repository";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY)
    private NestedBackupStoreRepository backupStoreRepository;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE = "backup_total_size";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE)
    private Long backupTotalSize;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
    private Double compressionRatio;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DELETE_STRATEGY = "delete_strategy";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY)
    private BackupPlanDeleteStrategy deleteStrategy;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENABLE_WINDOW = "enable_window";

    @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW)
    private Boolean enableWindow;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FULL_INTERVAL = "full_interval";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL)
    private Integer fullInterval;

    public static final String SERIALIZED_NAME_FULL_PERIOD = "full_period";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD)
    private BackupPlanPeriod fullPeriod;

    public static final String SERIALIZED_NAME_FULL_TIME_POINT = "full_time_point";

    @SerializedName(SERIALIZED_NAME_FULL_TIME_POINT)
    private NestedBackupPlanTimePoint fullTimePoint;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL = "incremental_interval";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL)
    private Integer incrementalInterval;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD = "incremental_period";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD)
    private BackupPlanPeriod incrementalPeriod;

    public static final String SERIALIZED_NAME_INCREMENTAL_TIME_POINTS = "incremental_time_points";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS)
    private List<NestedBackupPlanTimePoint> incrementalTimePoints =
            new ArrayList<NestedBackupPlanTimePoint>();

    public static final String SERIALIZED_NAME_INCREMENTAL_WEEKDAYS = "incremental_weekdays";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS)
    private List<WeekdayTypeEnum> incrementalWeekdays = null;

    public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
    private BackupPlanKeepPolicy keepPolicy;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
    private Integer keepPolicyValue;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE =
            "last_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE)
    private String lastExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT =
            "last_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT =
            "last_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
    private String lastExecutedAt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS =
            "last_manual_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastManualExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE =
            "last_manual_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE)
    private String lastManualExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT =
            "last_manual_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastManualExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT =
            "last_manual_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastManualExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT = "last_manual_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT)
    private String lastManualExecutedAt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE = "logical_size";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE)
    private Long logicalSize;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME = "next_execute_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME)
    private String nextExecuteTime;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BackupPlanPhase phase;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE = "physical_size";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE)
    private Long physicalSize;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupPlanStatus status;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT =
            "valid_size_of_backup_object";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT)
    private Long validSizeOfBackupObject;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT =
            "valid_size_of_restore_point";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT)
    private Long validSizeOfRestorePoint;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public static final String SERIALIZED_NAME_WINDOW_END = "window_end";

    @SerializedName(SERIALIZED_NAME_WINDOW_END)
    private String windowEnd;

    public static final String SERIALIZED_NAME_WINDOW_START = "window_start";

    @SerializedName(SERIALIZED_NAME_WINDOW_START)
    private String windowStart;

    public BackupPlan() {}

    public BackupPlan backupDelayOption(BackupPlanDelayOption backupDelayOption) {

        this.backupDelayOption = backupDelayOption;
        return this;
    }

    /**
     * Get backupDelayOption
     *
     * @return backupDelayOption
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDelayOption getBackupDelayOption() {
        return backupDelayOption;
    }

    public void setBackupDelayOption(BackupPlanDelayOption backupDelayOption) {
        this.backupDelayOption = backupDelayOption;
    }

    public BackupPlan backupDelayOption_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public BackupPlan backupDelayOption_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public void setBackupDelayOption_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        }
    }

    public boolean getBackupDelayOption_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
    }

    public BackupPlan backupPlanExecutions(List<NestedBackupPlanExecution> backupPlanExecutions) {

        this.backupPlanExecutions = backupPlanExecutions;
        return this;
    }

    public BackupPlan addBackupPlanExecutionsItem(
            NestedBackupPlanExecution backupPlanExecutionsItem) {
        if (this.backupPlanExecutions == null) {
            this.backupPlanExecutions = new ArrayList<NestedBackupPlanExecution>();
        }
        this.backupPlanExecutions.add(backupPlanExecutionsItem);
        return this;
    }

    /**
     * Get backupPlanExecutions
     *
     * @return backupPlanExecutions
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBackupPlanExecution> getBackupPlanExecutions() {
        return backupPlanExecutions;
    }

    public void setBackupPlanExecutions(List<NestedBackupPlanExecution> backupPlanExecutions) {
        this.backupPlanExecutions = backupPlanExecutions;
    }

    public BackupPlan backupPlanExecutions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS);
        return this;
    }

    public BackupPlan backupPlanExecutions_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS);
        return this;
    }

    public void setBackupPlanExecutions_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS);
        }
    }

    public boolean getBackupPlanExecutions_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS);
    }

    public BackupPlan backupRestorePointCount(Integer backupRestorePointCount) {

        this.backupRestorePointCount = backupRestorePointCount;
        return this;
    }

    /**
     * Get backupRestorePointCount
     *
     * @return backupRestorePointCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCount() {
        return backupRestorePointCount;
    }

    public void setBackupRestorePointCount(Integer backupRestorePointCount) {
        this.backupRestorePointCount = backupRestorePointCount;
    }

    public BackupPlan backupRestorePointCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        return this;
    }

    public BackupPlan backupRestorePointCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        return this;
    }

    public void setBackupRestorePointCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        }
    }

    public boolean getBackupRestorePointCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
    }

    public BackupPlan backupRestorePoints(List<NestedBackupRestorePoint> backupRestorePoints) {

        this.backupRestorePoints = backupRestorePoints;
        return this;
    }

    public BackupPlan addBackupRestorePointsItem(NestedBackupRestorePoint backupRestorePointsItem) {
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

    public BackupPlan backupRestorePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS);
        return this;
    }

    public BackupPlan backupRestorePoints_ExplictlyNonNull() {
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

    public BackupPlan backupService(NestedBackupService backupService) {

        this.backupService = backupService;
        return this;
    }

    /**
     * Get backupService
     *
     * @return backupService
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedBackupService getBackupService() {
        return backupService;
    }

    public void setBackupService(NestedBackupService backupService) {
        this.backupService = backupService;
    }

    public BackupPlan backupService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public BackupPlan backupService_ExplictlyNonNull() {
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

    public BackupPlan backupStoreRepository(NestedBackupStoreRepository backupStoreRepository) {

        this.backupStoreRepository = backupStoreRepository;
        return this;
    }

    /**
     * Get backupStoreRepository
     *
     * @return backupStoreRepository
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedBackupStoreRepository getBackupStoreRepository() {
        return backupStoreRepository;
    }

    public void setBackupStoreRepository(NestedBackupStoreRepository backupStoreRepository) {
        this.backupStoreRepository = backupStoreRepository;
    }

    public BackupPlan backupStoreRepository_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        return this;
    }

    public BackupPlan backupStoreRepository_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        return this;
    }

    public void setBackupStoreRepository_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        }
    }

    public boolean getBackupStoreRepository_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
    }

    public BackupPlan backupTotalSize(Long backupTotalSize) {

        this.backupTotalSize = backupTotalSize;
        return this;
    }

    /**
     * Get backupTotalSize
     *
     * @return backupTotalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSize() {
        return backupTotalSize;
    }

    public void setBackupTotalSize(Long backupTotalSize) {
        this.backupTotalSize = backupTotalSize;
    }

    public BackupPlan backupTotalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        return this;
    }

    public BackupPlan backupTotalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        return this;
    }

    public void setBackupTotalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        }
    }

    public boolean getBackupTotalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
    }

    public BackupPlan compression(Boolean compression) {

        this.compression = compression;
        return this;
    }

    /**
     * Get compression
     *
     * @return compression
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public BackupPlan compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public BackupPlan compression_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public void setCompression_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        }
    }

    public boolean getCompression_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION);
    }

    public BackupPlan compressionRatio(Double compressionRatio) {

        this.compressionRatio = compressionRatio;
        return this;
    }

    /**
     * Get compressionRatio
     *
     * @return compressionRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public BackupPlan compressionRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public BackupPlan compressionRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public void setCompressionRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        }
    }

    public boolean getCompressionRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO);
    }

    public BackupPlan createdAt(String createdAt) {

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

    public BackupPlan createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public BackupPlan createdAt_ExplictlyNonNull() {
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

    public BackupPlan deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

        this.deleteStrategy = deleteStrategy;
        return this;
    }

    /**
     * Get deleteStrategy
     *
     * @return deleteStrategy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDeleteStrategy getDeleteStrategy() {
        return deleteStrategy;
    }

    public void setDeleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
        this.deleteStrategy = deleteStrategy;
    }

    public BackupPlan deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public BackupPlan deleteStrategy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public void setDeleteStrategy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        }
    }

    public boolean getDeleteStrategy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY);
    }

    public BackupPlan description(String description) {

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

    public BackupPlan description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupPlan description_ExplictlyNonNull() {
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

    public BackupPlan enableWindow(Boolean enableWindow) {

        this.enableWindow = enableWindow;
        return this;
    }

    /**
     * Get enableWindow
     *
     * @return enableWindow
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnableWindow() {
        return enableWindow;
    }

    public void setEnableWindow(Boolean enableWindow) {
        this.enableWindow = enableWindow;
    }

    public BackupPlan enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public BackupPlan enableWindow_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public void setEnableWindow_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        }
    }

    public boolean getEnableWindow_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_WINDOW);
    }

    public BackupPlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupPlan entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupPlan entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupPlan fullInterval(Integer fullInterval) {

        this.fullInterval = fullInterval;
        return this;
    }

    /**
     * Get fullInterval
     *
     * @return fullInterval
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getFullInterval() {
        return fullInterval;
    }

    public void setFullInterval(Integer fullInterval) {
        this.fullInterval = fullInterval;
    }

    public BackupPlan fullInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public BackupPlan fullInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public void setFullInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL);
        }
    }

    public boolean getFullInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL);
    }

    public BackupPlan fullPeriod(BackupPlanPeriod fullPeriod) {

        this.fullPeriod = fullPeriod;
        return this;
    }

    /**
     * Get fullPeriod
     *
     * @return fullPeriod
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanPeriod getFullPeriod() {
        return fullPeriod;
    }

    public void setFullPeriod(BackupPlanPeriod fullPeriod) {
        this.fullPeriod = fullPeriod;
    }

    public BackupPlan fullPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public BackupPlan fullPeriod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public void setFullPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD);
        }
    }

    public boolean getFullPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_PERIOD);
    }

    public BackupPlan fullTimePoint(NestedBackupPlanTimePoint fullTimePoint) {

        this.fullTimePoint = fullTimePoint;
        return this;
    }

    /**
     * Get fullTimePoint
     *
     * @return fullTimePoint
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedBackupPlanTimePoint getFullTimePoint() {
        return fullTimePoint;
    }

    public void setFullTimePoint(NestedBackupPlanTimePoint fullTimePoint) {
        this.fullTimePoint = fullTimePoint;
    }

    public BackupPlan fullTimePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_TIME_POINT);
        return this;
    }

    public BackupPlan fullTimePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_TIME_POINT);
        return this;
    }

    public void setFullTimePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_TIME_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_TIME_POINT);
        }
    }

    public boolean getFullTimePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_TIME_POINT);
    }

    public BackupPlan id(String id) {

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

    public BackupPlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupPlan id_ExplictlyNonNull() {
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

    public BackupPlan incrementalInterval(Integer incrementalInterval) {

        this.incrementalInterval = incrementalInterval;
        return this;
    }

    /**
     * Get incrementalInterval
     *
     * @return incrementalInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalInterval() {
        return incrementalInterval;
    }

    public void setIncrementalInterval(Integer incrementalInterval) {
        this.incrementalInterval = incrementalInterval;
    }

    public BackupPlan incrementalInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public BackupPlan incrementalInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public void setIncrementalInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        }
    }

    public boolean getIncrementalInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
    }

    public BackupPlan incrementalPeriod(BackupPlanPeriod incrementalPeriod) {

        this.incrementalPeriod = incrementalPeriod;
        return this;
    }

    /**
     * Get incrementalPeriod
     *
     * @return incrementalPeriod
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanPeriod getIncrementalPeriod() {
        return incrementalPeriod;
    }

    public void setIncrementalPeriod(BackupPlanPeriod incrementalPeriod) {
        this.incrementalPeriod = incrementalPeriod;
    }

    public BackupPlan incrementalPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public BackupPlan incrementalPeriod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public void setIncrementalPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        }
    }

    public boolean getIncrementalPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_PERIOD);
    }

    public BackupPlan incrementalTimePoints(List<NestedBackupPlanTimePoint> incrementalTimePoints) {

        this.incrementalTimePoints = incrementalTimePoints;
        return this;
    }

    public BackupPlan addIncrementalTimePointsItem(
            NestedBackupPlanTimePoint incrementalTimePointsItem) {
        this.incrementalTimePoints.add(incrementalTimePointsItem);
        return this;
    }

    /**
     * Get incrementalTimePoints
     *
     * @return incrementalTimePoints
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedBackupPlanTimePoint> getIncrementalTimePoints() {
        return incrementalTimePoints;
    }

    public void setIncrementalTimePoints(List<NestedBackupPlanTimePoint> incrementalTimePoints) {
        this.incrementalTimePoints = incrementalTimePoints;
    }

    public BackupPlan incrementalTimePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        return this;
    }

    public BackupPlan incrementalTimePoints_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        return this;
    }

    public void setIncrementalTimePoints_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        }
    }

    public boolean getIncrementalTimePoints_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
    }

    public BackupPlan incrementalWeekdays(List<WeekdayTypeEnum> incrementalWeekdays) {

        this.incrementalWeekdays = incrementalWeekdays;
        return this;
    }

    public BackupPlan addIncrementalWeekdaysItem(WeekdayTypeEnum incrementalWeekdaysItem) {
        if (this.incrementalWeekdays == null) {
            this.incrementalWeekdays = new ArrayList<WeekdayTypeEnum>();
        }
        this.incrementalWeekdays.add(incrementalWeekdaysItem);
        return this;
    }

    /**
     * Get incrementalWeekdays
     *
     * @return incrementalWeekdays
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<WeekdayTypeEnum> getIncrementalWeekdays() {
        return incrementalWeekdays;
    }

    public void setIncrementalWeekdays(List<WeekdayTypeEnum> incrementalWeekdays) {
        this.incrementalWeekdays = incrementalWeekdays;
    }

    public BackupPlan incrementalWeekdays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        return this;
    }

    public BackupPlan incrementalWeekdays_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        return this;
    }

    public void setIncrementalWeekdays_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        }
    }

    public boolean getIncrementalWeekdays_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
    }

    public BackupPlan keepPolicy(BackupPlanKeepPolicy keepPolicy) {

        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * Get keepPolicy
     *
     * @return keepPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanKeepPolicy getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(BackupPlanKeepPolicy keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    public BackupPlan keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public BackupPlan keepPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public void setKeepPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        }
    }

    public boolean getKeepPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY);
    }

    public BackupPlan keepPolicyValue(Integer keepPolicyValue) {

        this.keepPolicyValue = keepPolicyValue;
        return this;
    }

    /**
     * Get keepPolicyValue
     *
     * @return keepPolicyValue
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValue() {
        return keepPolicyValue;
    }

    public void setKeepPolicyValue(Integer keepPolicyValue) {
        this.keepPolicyValue = keepPolicyValue;
    }

    public BackupPlan keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public BackupPlan keepPolicyValue_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public void setKeepPolicyValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        }
    }

    public boolean getKeepPolicyValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE);
    }

    public BackupPlan lastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {

        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * Get lastExecuteStatus
     *
     * @return lastExecuteStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanExecutionStatus getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public BackupPlan lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public BackupPlan lastExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public void setLastExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        }
    }

    public boolean getLastExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
    }

    public BackupPlan lastExecuteStatusMessage(String lastExecuteStatusMessage) {

        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastExecuteStatusMessage
     *
     * @return lastExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessage() {
        return lastExecuteStatusMessage;
    }

    public void setLastExecuteStatusMessage(String lastExecuteStatusMessage) {
        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
    }

    public BackupPlan lastExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public BackupPlan lastExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
    }

    public BackupPlan lastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {

        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCount
     *
     * @return lastExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCount() {
        return lastExecuteSuccessJobCount;
    }

    public void setLastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {
        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
    }

    public BackupPlan lastExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public BackupPlan lastExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public BackupPlan lastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {

        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCount
     *
     * @return lastExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCount() {
        return lastExecuteTotalJobCount;
    }

    public void setLastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {
        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
    }

    public BackupPlan lastExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public BackupPlan lastExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
    }

    public BackupPlan lastExecutedAt(String lastExecutedAt) {

        this.lastExecutedAt = lastExecutedAt;
        return this;
    }

    /**
     * Get lastExecutedAt
     *
     * @return lastExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAt() {
        return lastExecutedAt;
    }

    public void setLastExecutedAt(String lastExecutedAt) {
        this.lastExecutedAt = lastExecutedAt;
    }

    public BackupPlan lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public BackupPlan lastExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public void setLastExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        }
    }

    public boolean getLastExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT);
    }

    public BackupPlan lastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {

        this.lastManualExecuteStatus = lastManualExecuteStatus;
        return this;
    }

    /**
     * Get lastManualExecuteStatus
     *
     * @return lastManualExecuteStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanExecutionStatus getLastManualExecuteStatus() {
        return lastManualExecuteStatus;
    }

    public void setLastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {
        this.lastManualExecuteStatus = lastManualExecuteStatus;
    }

    public BackupPlan lastManualExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public BackupPlan lastManualExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public void setLastManualExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        }
    }

    public boolean getLastManualExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
    }

    public BackupPlan lastManualExecuteStatusMessage(String lastManualExecuteStatusMessage) {

        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessage
     *
     * @return lastManualExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessage() {
        return lastManualExecuteStatusMessage;
    }

    public void setLastManualExecuteStatusMessage(String lastManualExecuteStatusMessage) {
        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
    }

    public BackupPlan lastManualExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public BackupPlan lastManualExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastManualExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastManualExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
    }

    public BackupPlan lastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {

        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCount
     *
     * @return lastManualExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCount() {
        return lastManualExecuteSuccessJobCount;
    }

    public void setLastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {
        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
    }

    public BackupPlan lastManualExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public BackupPlan lastManualExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public BackupPlan lastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {

        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCount
     *
     * @return lastManualExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCount() {
        return lastManualExecuteTotalJobCount;
    }

    public void setLastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {
        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
    }

    public BackupPlan lastManualExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public BackupPlan lastManualExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
    }

    public BackupPlan lastManualExecutedAt(String lastManualExecutedAt) {

        this.lastManualExecutedAt = lastManualExecutedAt;
        return this;
    }

    /**
     * Get lastManualExecutedAt
     *
     * @return lastManualExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAt() {
        return lastManualExecutedAt;
    }

    public void setLastManualExecutedAt(String lastManualExecutedAt) {
        this.lastManualExecutedAt = lastManualExecutedAt;
    }

    public BackupPlan lastManualExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public BackupPlan lastManualExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public void setLastManualExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        }
    }

    public boolean getLastManualExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
    }

    public BackupPlan logicalSize(Long logicalSize) {

        this.logicalSize = logicalSize;
        return this;
    }

    /**
     * Get logicalSize
     *
     * @return logicalSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getLogicalSize() {
        return logicalSize;
    }

    public void setLogicalSize(Long logicalSize) {
        this.logicalSize = logicalSize;
    }

    public BackupPlan logicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public BackupPlan logicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public void setLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        }
    }

    public boolean getLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE);
    }

    public BackupPlan name(String name) {

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

    public BackupPlan name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupPlan name_ExplictlyNonNull() {
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

    public BackupPlan nextExecuteTime(String nextExecuteTime) {

        this.nextExecuteTime = nextExecuteTime;
        return this;
    }

    /**
     * Get nextExecuteTime
     *
     * @return nextExecuteTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(String nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    public BackupPlan nextExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public BackupPlan nextExecuteTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public void setNextExecuteTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        }
    }

    public boolean getNextExecuteTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
    }

    public BackupPlan phase(BackupPlanPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPhase getPhase() {
        return phase;
    }

    public void setPhase(BackupPlanPhase phase) {
        this.phase = phase;
    }

    public BackupPlan phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public BackupPlan phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public BackupPlan physicalSize(Long physicalSize) {

        this.physicalSize = physicalSize;
        return this;
    }

    /**
     * Get physicalSize
     *
     * @return physicalSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPhysicalSize() {
        return physicalSize;
    }

    public void setPhysicalSize(Long physicalSize) {
        this.physicalSize = physicalSize;
    }

    public BackupPlan physicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public BackupPlan physicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public void setPhysicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        }
    }

    public boolean getPhysicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE);
    }

    public BackupPlan snapshotConsistentType(ConsistentType snapshotConsistentType) {

        this.snapshotConsistentType = snapshotConsistentType;
        return this;
    }

    /**
     * Get snapshotConsistentType
     *
     * @return snapshotConsistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentType() {
        return snapshotConsistentType;
    }

    public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
        this.snapshotConsistentType = snapshotConsistentType;
    }

    public BackupPlan snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public BackupPlan snapshotConsistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public void setSnapshotConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        }
    }

    public boolean getSnapshotConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
    }

    public BackupPlan status(BackupPlanStatus status) {

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
    public BackupPlanStatus getStatus() {
        return status;
    }

    public void setStatus(BackupPlanStatus status) {
        this.status = status;
    }

    public BackupPlan status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupPlan status_ExplictlyNonNull() {
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

    public BackupPlan validSizeOfBackupObject(Long validSizeOfBackupObject) {

        this.validSizeOfBackupObject = validSizeOfBackupObject;
        return this;
    }

    /**
     * Get validSizeOfBackupObject
     *
     * @return validSizeOfBackupObject
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getValidSizeOfBackupObject() {
        return validSizeOfBackupObject;
    }

    public void setValidSizeOfBackupObject(Long validSizeOfBackupObject) {
        this.validSizeOfBackupObject = validSizeOfBackupObject;
    }

    public BackupPlan validSizeOfBackupObject_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        return this;
    }

    public BackupPlan validSizeOfBackupObject_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        return this;
    }

    public void setValidSizeOfBackupObject_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        }
    }

    public boolean getValidSizeOfBackupObject_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
    }

    public BackupPlan validSizeOfRestorePoint(Long validSizeOfRestorePoint) {

        this.validSizeOfRestorePoint = validSizeOfRestorePoint;
        return this;
    }

    /**
     * Get validSizeOfRestorePoint
     *
     * @return validSizeOfRestorePoint
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getValidSizeOfRestorePoint() {
        return validSizeOfRestorePoint;
    }

    public void setValidSizeOfRestorePoint(Long validSizeOfRestorePoint) {
        this.validSizeOfRestorePoint = validSizeOfRestorePoint;
    }

    public BackupPlan validSizeOfRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        return this;
    }

    public BackupPlan validSizeOfRestorePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        return this;
    }

    public void setValidSizeOfRestorePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        }
    }

    public boolean getValidSizeOfRestorePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
    }

    public BackupPlan vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public BackupPlan addVmsItem(NestedVm vmsItem) {
        if (this.vms == null) {
            this.vms = new ArrayList<NestedVm>();
        }
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVm> getVms() {
        return vms;
    }

    public void setVms(List<NestedVm> vms) {
        this.vms = vms;
    }

    public BackupPlan vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public BackupPlan vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    public BackupPlan windowEnd(String windowEnd) {

        this.windowEnd = windowEnd;
        return this;
    }

    /**
     * Get windowEnd
     *
     * @return windowEnd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEnd() {
        return windowEnd;
    }

    public void setWindowEnd(String windowEnd) {
        this.windowEnd = windowEnd;
    }

    public BackupPlan windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public BackupPlan windowEnd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public void setWindowEnd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        }
    }

    public boolean getWindowEnd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END);
    }

    public BackupPlan windowStart(String windowStart) {

        this.windowStart = windowStart;
        return this;
    }

    /**
     * Get windowStart
     *
     * @return windowStart
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStart() {
        return windowStart;
    }

    public void setWindowStart(String windowStart) {
        this.windowStart = windowStart;
    }

    public BackupPlan windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public BackupPlan windowStart_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public void setWindowStart_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        }
    }

    public boolean getWindowStart_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPlan backupPlan = (BackupPlan) o;
        return Objects.equals(this.backupDelayOption, backupPlan.backupDelayOption)
                && Objects.equals(this.backupPlanExecutions, backupPlan.backupPlanExecutions)
                && Objects.equals(this.backupRestorePointCount, backupPlan.backupRestorePointCount)
                && Objects.equals(this.backupRestorePoints, backupPlan.backupRestorePoints)
                && Objects.equals(this.backupService, backupPlan.backupService)
                && Objects.equals(this.backupStoreRepository, backupPlan.backupStoreRepository)
                && Objects.equals(this.backupTotalSize, backupPlan.backupTotalSize)
                && Objects.equals(this.compression, backupPlan.compression)
                && Objects.equals(this.compressionRatio, backupPlan.compressionRatio)
                && Objects.equals(this.createdAt, backupPlan.createdAt)
                && Objects.equals(this.deleteStrategy, backupPlan.deleteStrategy)
                && Objects.equals(this.description, backupPlan.description)
                && Objects.equals(this.enableWindow, backupPlan.enableWindow)
                && Objects.equals(this.entityAsyncStatus, backupPlan.entityAsyncStatus)
                && Objects.equals(this.fullInterval, backupPlan.fullInterval)
                && Objects.equals(this.fullPeriod, backupPlan.fullPeriod)
                && Objects.equals(this.fullTimePoint, backupPlan.fullTimePoint)
                && Objects.equals(this.id, backupPlan.id)
                && Objects.equals(this.incrementalInterval, backupPlan.incrementalInterval)
                && Objects.equals(this.incrementalPeriod, backupPlan.incrementalPeriod)
                && Objects.equals(this.incrementalTimePoints, backupPlan.incrementalTimePoints)
                && Objects.equals(this.incrementalWeekdays, backupPlan.incrementalWeekdays)
                && Objects.equals(this.keepPolicy, backupPlan.keepPolicy)
                && Objects.equals(this.keepPolicyValue, backupPlan.keepPolicyValue)
                && Objects.equals(this.lastExecuteStatus, backupPlan.lastExecuteStatus)
                && Objects.equals(
                        this.lastExecuteStatusMessage, backupPlan.lastExecuteStatusMessage)
                && Objects.equals(
                        this.lastExecuteSuccessJobCount, backupPlan.lastExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastExecuteTotalJobCount, backupPlan.lastExecuteTotalJobCount)
                && Objects.equals(this.lastExecutedAt, backupPlan.lastExecutedAt)
                && Objects.equals(this.lastManualExecuteStatus, backupPlan.lastManualExecuteStatus)
                && Objects.equals(
                        this.lastManualExecuteStatusMessage,
                        backupPlan.lastManualExecuteStatusMessage)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCount,
                        backupPlan.lastManualExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCount,
                        backupPlan.lastManualExecuteTotalJobCount)
                && Objects.equals(this.lastManualExecutedAt, backupPlan.lastManualExecutedAt)
                && Objects.equals(this.logicalSize, backupPlan.logicalSize)
                && Objects.equals(this.name, backupPlan.name)
                && Objects.equals(this.nextExecuteTime, backupPlan.nextExecuteTime)
                && Objects.equals(this.phase, backupPlan.phase)
                && Objects.equals(this.physicalSize, backupPlan.physicalSize)
                && Objects.equals(this.snapshotConsistentType, backupPlan.snapshotConsistentType)
                && Objects.equals(this.status, backupPlan.status)
                && Objects.equals(this.validSizeOfBackupObject, backupPlan.validSizeOfBackupObject)
                && Objects.equals(this.validSizeOfRestorePoint, backupPlan.validSizeOfRestorePoint)
                && Objects.equals(this.vms, backupPlan.vms)
                && Objects.equals(this.windowEnd, backupPlan.windowEnd)
                && Objects.equals(this.windowStart, backupPlan.windowStart);
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
                backupDelayOption,
                backupPlanExecutions,
                backupRestorePointCount,
                backupRestorePoints,
                backupService,
                backupStoreRepository,
                backupTotalSize,
                compression,
                compressionRatio,
                createdAt,
                deleteStrategy,
                description,
                enableWindow,
                entityAsyncStatus,
                fullInterval,
                fullPeriod,
                fullTimePoint,
                id,
                incrementalInterval,
                incrementalPeriod,
                incrementalTimePoints,
                incrementalWeekdays,
                keepPolicy,
                keepPolicyValue,
                lastExecuteStatus,
                lastExecuteStatusMessage,
                lastExecuteSuccessJobCount,
                lastExecuteTotalJobCount,
                lastExecutedAt,
                lastManualExecuteStatus,
                lastManualExecuteStatusMessage,
                lastManualExecuteSuccessJobCount,
                lastManualExecuteTotalJobCount,
                lastManualExecutedAt,
                logicalSize,
                name,
                nextExecuteTime,
                phase,
                physicalSize,
                snapshotConsistentType,
                status,
                validSizeOfBackupObject,
                validSizeOfRestorePoint,
                vms,
                windowEnd,
                windowStart);
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
        sb.append("class BackupPlan {\n");
        sb.append("    backupDelayOption: ")
                .append(toIndentedString(backupDelayOption))
                .append("\n");
        sb.append("    backupPlanExecutions: ")
                .append(toIndentedString(backupPlanExecutions))
                .append("\n");
        sb.append("    backupRestorePointCount: ")
                .append(toIndentedString(backupRestorePointCount))
                .append("\n");
        sb.append("    backupRestorePoints: ")
                .append(toIndentedString(backupRestorePoints))
                .append("\n");
        sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
        sb.append("    backupStoreRepository: ")
                .append(toIndentedString(backupStoreRepository))
                .append("\n");
        sb.append("    backupTotalSize: ").append(toIndentedString(backupTotalSize)).append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableWindow: ").append(toIndentedString(enableWindow)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    fullInterval: ").append(toIndentedString(fullInterval)).append("\n");
        sb.append("    fullPeriod: ").append(toIndentedString(fullPeriod)).append("\n");
        sb.append("    fullTimePoint: ").append(toIndentedString(fullTimePoint)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    incrementalInterval: ")
                .append(toIndentedString(incrementalInterval))
                .append("\n");
        sb.append("    incrementalPeriod: ")
                .append(toIndentedString(incrementalPeriod))
                .append("\n");
        sb.append("    incrementalTimePoints: ")
                .append(toIndentedString(incrementalTimePoints))
                .append("\n");
        sb.append("    incrementalWeekdays: ")
                .append(toIndentedString(incrementalWeekdays))
                .append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
        sb.append("    lastExecuteStatus: ")
                .append(toIndentedString(lastExecuteStatus))
                .append("\n");
        sb.append("    lastExecuteStatusMessage: ")
                .append(toIndentedString(lastExecuteStatusMessage))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCount: ")
                .append(toIndentedString(lastExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastExecuteTotalJobCount: ")
                .append(toIndentedString(lastExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
        sb.append("    lastManualExecuteStatus: ")
                .append(toIndentedString(lastManualExecuteStatus))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessage: ")
                .append(toIndentedString(lastManualExecuteStatusMessage))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCount: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCount: ")
                .append(toIndentedString(lastManualExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastManualExecutedAt: ")
                .append(toIndentedString(lastManualExecutedAt))
                .append("\n");
        sb.append("    logicalSize: ").append(toIndentedString(logicalSize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    validSizeOfBackupObject: ")
                .append(toIndentedString(validSizeOfBackupObject))
                .append("\n");
        sb.append("    validSizeOfRestorePoint: ")
                .append(toIndentedString(validSizeOfRestorePoint))
                .append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
        sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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
