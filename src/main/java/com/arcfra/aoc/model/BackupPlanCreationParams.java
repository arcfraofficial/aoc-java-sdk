package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BackupPlanCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlanCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
    private Integer keepPolicyValue;

    public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
    private BackupPlanKeepPolicy keepPolicy;

    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION = "backup_delay_option";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION)
    private BackupPlanDelayOption backupDelayOption;

    public static final String SERIALIZED_NAME_WINDOW_END = "window_end";

    @SerializedName(SERIALIZED_NAME_WINDOW_END)
    private String windowEnd;

    public static final String SERIALIZED_NAME_WINDOW_START = "window_start";

    @SerializedName(SERIALIZED_NAME_WINDOW_START)
    private String windowStart;

    public static final String SERIALIZED_NAME_ENABLE_WINDOW = "enable_window";

    @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW)
    private Boolean enableWindow;

    public static final String SERIALIZED_NAME_FULL_TIME_POINT = "full_time_point";

    @SerializedName(SERIALIZED_NAME_FULL_TIME_POINT)
    private BackupPlanTimePoint fullTimePoint;

    public static final String SERIALIZED_NAME_FULL_PERIOD = "full_period";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD)
    private BackupPlanPeriod fullPeriod;

    public static final String SERIALIZED_NAME_FULL_INTERVAL = "full_interval";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL)
    private Integer fullInterval;

    public static final String SERIALIZED_NAME_INCREMENTAL_WEEKDAYS = "incremental_weekdays";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS)
    private List<WeekdayTypeEnum> incrementalWeekdays = null;

    public static final String SERIALIZED_NAME_INCREMENTAL_TIME_POINTS = "incremental_time_points";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS)
    private List<BackupPlanTimePoint> incrementalTimePoints = null;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL = "incremental_interval";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL)
    private Integer incrementalInterval;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD = "incremental_period";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD)
    private BackupPlanPeriod incrementalPeriod;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID =
            "backup_store_repository_id";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID)
    private String backupStoreRepositoryId;

    public static final String SERIALIZED_NAME_BACKUP_SERVICE_ID = "backup_service_id";

    @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE_ID)
    private String backupServiceId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public BackupPlanCreationParams() {}

    public BackupPlanCreationParams keepPolicyValue(Integer keepPolicyValue) {

        this.keepPolicyValue = keepPolicyValue;
        return this;
    }

    /**
     * Get keepPolicyValue
     *
     * @return keepPolicyValue
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getKeepPolicyValue() {
        return keepPolicyValue;
    }

    public void setKeepPolicyValue(Integer keepPolicyValue) {
        this.keepPolicyValue = keepPolicyValue;
    }

    public BackupPlanCreationParams keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public BackupPlanCreationParams keepPolicyValue_ExplictlyNonNull() {
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

    public BackupPlanCreationParams keepPolicy(BackupPlanKeepPolicy keepPolicy) {

        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * Get keepPolicy
     *
     * @return keepPolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanKeepPolicy getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(BackupPlanKeepPolicy keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    public BackupPlanCreationParams keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public BackupPlanCreationParams keepPolicy_ExplictlyNonNull() {
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

    public BackupPlanCreationParams backupDelayOption(BackupPlanDelayOption backupDelayOption) {

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

    public BackupPlanCreationParams backupDelayOption_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public BackupPlanCreationParams backupDelayOption_ExplictlyNonNull() {
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

    public BackupPlanCreationParams windowEnd(String windowEnd) {

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

    public BackupPlanCreationParams windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public BackupPlanCreationParams windowEnd_ExplictlyNonNull() {
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

    public BackupPlanCreationParams windowStart(String windowStart) {

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

    public BackupPlanCreationParams windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public BackupPlanCreationParams windowStart_ExplictlyNonNull() {
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

    public BackupPlanCreationParams enableWindow(Boolean enableWindow) {

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

    public BackupPlanCreationParams enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public BackupPlanCreationParams enableWindow_ExplictlyNonNull() {
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

    public BackupPlanCreationParams fullTimePoint(BackupPlanTimePoint fullTimePoint) {

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
    public BackupPlanTimePoint getFullTimePoint() {
        return fullTimePoint;
    }

    public void setFullTimePoint(BackupPlanTimePoint fullTimePoint) {
        this.fullTimePoint = fullTimePoint;
    }

    public BackupPlanCreationParams fullTimePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_TIME_POINT);
        return this;
    }

    public BackupPlanCreationParams fullTimePoint_ExplictlyNonNull() {
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

    public BackupPlanCreationParams fullPeriod(BackupPlanPeriod fullPeriod) {

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

    public BackupPlanCreationParams fullPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public BackupPlanCreationParams fullPeriod_ExplictlyNonNull() {
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

    public BackupPlanCreationParams fullInterval(Integer fullInterval) {

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

    public BackupPlanCreationParams fullInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public BackupPlanCreationParams fullInterval_ExplictlyNonNull() {
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

    public BackupPlanCreationParams incrementalWeekdays(List<WeekdayTypeEnum> incrementalWeekdays) {

        this.incrementalWeekdays = incrementalWeekdays;
        return this;
    }

    public BackupPlanCreationParams addIncrementalWeekdaysItem(
            WeekdayTypeEnum incrementalWeekdaysItem) {
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

    public BackupPlanCreationParams incrementalWeekdays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        return this;
    }

    public BackupPlanCreationParams incrementalWeekdays_ExplictlyNonNull() {
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

    public BackupPlanCreationParams incrementalTimePoints(
            List<BackupPlanTimePoint> incrementalTimePoints) {

        this.incrementalTimePoints = incrementalTimePoints;
        return this;
    }

    public BackupPlanCreationParams addIncrementalTimePointsItem(
            BackupPlanTimePoint incrementalTimePointsItem) {
        if (this.incrementalTimePoints == null) {
            this.incrementalTimePoints = new ArrayList<BackupPlanTimePoint>();
        }
        this.incrementalTimePoints.add(incrementalTimePointsItem);
        return this;
    }

    /**
     * Get incrementalTimePoints
     *
     * @return incrementalTimePoints
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanTimePoint> getIncrementalTimePoints() {
        return incrementalTimePoints;
    }

    public void setIncrementalTimePoints(List<BackupPlanTimePoint> incrementalTimePoints) {
        this.incrementalTimePoints = incrementalTimePoints;
    }

    public BackupPlanCreationParams incrementalTimePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        return this;
    }

    public BackupPlanCreationParams incrementalTimePoints_ExplictlyNonNull() {
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

    public BackupPlanCreationParams incrementalInterval(Integer incrementalInterval) {

        this.incrementalInterval = incrementalInterval;
        return this;
    }

    /**
     * Get incrementalInterval
     *
     * @return incrementalInterval
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIncrementalInterval() {
        return incrementalInterval;
    }

    public void setIncrementalInterval(Integer incrementalInterval) {
        this.incrementalInterval = incrementalInterval;
    }

    public BackupPlanCreationParams incrementalInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public BackupPlanCreationParams incrementalInterval_ExplictlyNonNull() {
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

    public BackupPlanCreationParams incrementalPeriod(BackupPlanPeriod incrementalPeriod) {

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

    public BackupPlanCreationParams incrementalPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public BackupPlanCreationParams incrementalPeriod_ExplictlyNonNull() {
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

    public BackupPlanCreationParams snapshotConsistentType(ConsistentType snapshotConsistentType) {

        this.snapshotConsistentType = snapshotConsistentType;
        return this;
    }

    /**
     * Get snapshotConsistentType
     *
     * @return snapshotConsistentType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ConsistentType getSnapshotConsistentType() {
        return snapshotConsistentType;
    }

    public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
        this.snapshotConsistentType = snapshotConsistentType;
    }

    public BackupPlanCreationParams snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public BackupPlanCreationParams snapshotConsistentType_ExplictlyNonNull() {
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

    public BackupPlanCreationParams compression(Boolean compression) {

        this.compression = compression;
        return this;
    }

    /**
     * Get compression
     *
     * @return compression
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public BackupPlanCreationParams compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public BackupPlanCreationParams compression_ExplictlyNonNull() {
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

    public BackupPlanCreationParams vms(VmWhereInput vms) {

        this.vms = vms;
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmWhereInput getVms() {
        return vms;
    }

    public void setVms(VmWhereInput vms) {
        this.vms = vms;
    }

    public BackupPlanCreationParams vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public BackupPlanCreationParams vms_ExplictlyNonNull() {
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

    public BackupPlanCreationParams description(String description) {

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

    public BackupPlanCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupPlanCreationParams description_ExplictlyNonNull() {
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

    public BackupPlanCreationParams backupStoreRepositoryId(String backupStoreRepositoryId) {

        this.backupStoreRepositoryId = backupStoreRepositoryId;
        return this;
    }

    /**
     * Get backupStoreRepositoryId
     *
     * @return backupStoreRepositoryId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBackupStoreRepositoryId() {
        return backupStoreRepositoryId;
    }

    public void setBackupStoreRepositoryId(String backupStoreRepositoryId) {
        this.backupStoreRepositoryId = backupStoreRepositoryId;
    }

    public BackupPlanCreationParams backupStoreRepositoryId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID);
        return this;
    }

    public BackupPlanCreationParams backupStoreRepositoryId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID);
        return this;
    }

    public void setBackupStoreRepositoryId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID);
        }
    }

    public boolean getBackupStoreRepositoryId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY_ID);
    }

    public BackupPlanCreationParams backupServiceId(String backupServiceId) {

        this.backupServiceId = backupServiceId;
        return this;
    }

    /**
     * Get backupServiceId
     *
     * @return backupServiceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBackupServiceId() {
        return backupServiceId;
    }

    public void setBackupServiceId(String backupServiceId) {
        this.backupServiceId = backupServiceId;
    }

    public BackupPlanCreationParams backupServiceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE_ID);
        return this;
    }

    public BackupPlanCreationParams backupServiceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE_ID);
        return this;
    }

    public void setBackupServiceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE_ID);
        }
    }

    public boolean getBackupServiceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_SERVICE_ID);
    }

    public BackupPlanCreationParams name(String name) {

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

    public BackupPlanCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupPlanCreationParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPlanCreationParams backupPlanCreationParams = (BackupPlanCreationParams) o;
        return Objects.equals(this.keepPolicyValue, backupPlanCreationParams.keepPolicyValue)
                && Objects.equals(this.keepPolicy, backupPlanCreationParams.keepPolicy)
                && Objects.equals(
                        this.backupDelayOption, backupPlanCreationParams.backupDelayOption)
                && Objects.equals(this.windowEnd, backupPlanCreationParams.windowEnd)
                && Objects.equals(this.windowStart, backupPlanCreationParams.windowStart)
                && Objects.equals(this.enableWindow, backupPlanCreationParams.enableWindow)
                && Objects.equals(this.fullTimePoint, backupPlanCreationParams.fullTimePoint)
                && Objects.equals(this.fullPeriod, backupPlanCreationParams.fullPeriod)
                && Objects.equals(this.fullInterval, backupPlanCreationParams.fullInterval)
                && Objects.equals(
                        this.incrementalWeekdays, backupPlanCreationParams.incrementalWeekdays)
                && Objects.equals(
                        this.incrementalTimePoints, backupPlanCreationParams.incrementalTimePoints)
                && Objects.equals(
                        this.incrementalInterval, backupPlanCreationParams.incrementalInterval)
                && Objects.equals(
                        this.incrementalPeriod, backupPlanCreationParams.incrementalPeriod)
                && Objects.equals(
                        this.snapshotConsistentType,
                        backupPlanCreationParams.snapshotConsistentType)
                && Objects.equals(this.compression, backupPlanCreationParams.compression)
                && Objects.equals(this.vms, backupPlanCreationParams.vms)
                && Objects.equals(this.description, backupPlanCreationParams.description)
                && Objects.equals(
                        this.backupStoreRepositoryId,
                        backupPlanCreationParams.backupStoreRepositoryId)
                && Objects.equals(this.backupServiceId, backupPlanCreationParams.backupServiceId)
                && Objects.equals(this.name, backupPlanCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                keepPolicyValue,
                keepPolicy,
                backupDelayOption,
                windowEnd,
                windowStart,
                enableWindow,
                fullTimePoint,
                fullPeriod,
                fullInterval,
                incrementalWeekdays,
                incrementalTimePoints,
                incrementalInterval,
                incrementalPeriod,
                snapshotConsistentType,
                compression,
                vms,
                description,
                backupStoreRepositoryId,
                backupServiceId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPlanCreationParams {\n");
        sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("    backupDelayOption: ")
                .append(toIndentedString(backupDelayOption))
                .append("\n");
        sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
        sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
        sb.append("    enableWindow: ").append(toIndentedString(enableWindow)).append("\n");
        sb.append("    fullTimePoint: ").append(toIndentedString(fullTimePoint)).append("\n");
        sb.append("    fullPeriod: ").append(toIndentedString(fullPeriod)).append("\n");
        sb.append("    fullInterval: ").append(toIndentedString(fullInterval)).append("\n");
        sb.append("    incrementalWeekdays: ")
                .append(toIndentedString(incrementalWeekdays))
                .append("\n");
        sb.append("    incrementalTimePoints: ")
                .append(toIndentedString(incrementalTimePoints))
                .append("\n");
        sb.append("    incrementalInterval: ")
                .append(toIndentedString(incrementalInterval))
                .append("\n");
        sb.append("    incrementalPeriod: ")
                .append(toIndentedString(incrementalPeriod))
                .append("\n");
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    backupStoreRepositoryId: ")
                .append(toIndentedString(backupStoreRepositoryId))
                .append("\n");
        sb.append("    backupServiceId: ").append(toIndentedString(backupServiceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
