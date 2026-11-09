package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BackupPlanUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlanUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISCONNECT_STRATEGY = "disconnect_strategy";

    @SerializedName(SERIALIZED_NAME_DISCONNECT_STRATEGY)
    private BackupPlanDeleteStrategy disconnectStrategy;

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

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public BackupPlanUpdationParamsData() {}

    public BackupPlanUpdationParamsData disconnectStrategy(
            BackupPlanDeleteStrategy disconnectStrategy) {

        this.disconnectStrategy = disconnectStrategy;
        return this;
    }

    /**
     * Get disconnectStrategy
     *
     * @return disconnectStrategy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDeleteStrategy getDisconnectStrategy() {
        return disconnectStrategy;
    }

    public void setDisconnectStrategy(BackupPlanDeleteStrategy disconnectStrategy) {
        this.disconnectStrategy = disconnectStrategy;
    }

    public BackupPlanUpdationParamsData disconnectStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECT_STRATEGY);
        return this;
    }

    public BackupPlanUpdationParamsData disconnectStrategy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECT_STRATEGY);
        return this;
    }

    public void setDisconnectStrategy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECT_STRATEGY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECT_STRATEGY);
        }
    }

    public boolean getDisconnectStrategy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECT_STRATEGY);
    }

    public BackupPlanUpdationParamsData keepPolicyValue(Integer keepPolicyValue) {

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

    public BackupPlanUpdationParamsData keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public BackupPlanUpdationParamsData keepPolicyValue_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData keepPolicy(BackupPlanKeepPolicy keepPolicy) {

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

    public BackupPlanUpdationParamsData keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public BackupPlanUpdationParamsData keepPolicy_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData backupDelayOption(BackupPlanDelayOption backupDelayOption) {

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

    public BackupPlanUpdationParamsData backupDelayOption_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public BackupPlanUpdationParamsData backupDelayOption_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData windowEnd(String windowEnd) {

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

    public BackupPlanUpdationParamsData windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public BackupPlanUpdationParamsData windowEnd_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData windowStart(String windowStart) {

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

    public BackupPlanUpdationParamsData windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public BackupPlanUpdationParamsData windowStart_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData enableWindow(Boolean enableWindow) {

        this.enableWindow = enableWindow;
        return this;
    }

    /**
     * Get enableWindow
     *
     * @return enableWindow
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableWindow() {
        return enableWindow;
    }

    public void setEnableWindow(Boolean enableWindow) {
        this.enableWindow = enableWindow;
    }

    public BackupPlanUpdationParamsData enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public BackupPlanUpdationParamsData enableWindow_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData fullTimePoint(BackupPlanTimePoint fullTimePoint) {

        this.fullTimePoint = fullTimePoint;
        return this;
    }

    /**
     * Get fullTimePoint
     *
     * @return fullTimePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanTimePoint getFullTimePoint() {
        return fullTimePoint;
    }

    public void setFullTimePoint(BackupPlanTimePoint fullTimePoint) {
        this.fullTimePoint = fullTimePoint;
    }

    public BackupPlanUpdationParamsData fullTimePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_TIME_POINT);
        return this;
    }

    public BackupPlanUpdationParamsData fullTimePoint_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData fullPeriod(BackupPlanPeriod fullPeriod) {

        this.fullPeriod = fullPeriod;
        return this;
    }

    /**
     * Get fullPeriod
     *
     * @return fullPeriod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getFullPeriod() {
        return fullPeriod;
    }

    public void setFullPeriod(BackupPlanPeriod fullPeriod) {
        this.fullPeriod = fullPeriod;
    }

    public BackupPlanUpdationParamsData fullPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public BackupPlanUpdationParamsData fullPeriod_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData fullInterval(Integer fullInterval) {

        this.fullInterval = fullInterval;
        return this;
    }

    /**
     * Get fullInterval
     *
     * @return fullInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullInterval() {
        return fullInterval;
    }

    public void setFullInterval(Integer fullInterval) {
        this.fullInterval = fullInterval;
    }

    public BackupPlanUpdationParamsData fullInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public BackupPlanUpdationParamsData fullInterval_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData incrementalWeekdays(
            List<WeekdayTypeEnum> incrementalWeekdays) {

        this.incrementalWeekdays = incrementalWeekdays;
        return this;
    }

    public BackupPlanUpdationParamsData addIncrementalWeekdaysItem(
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

    public BackupPlanUpdationParamsData incrementalWeekdays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_WEEKDAYS);
        return this;
    }

    public BackupPlanUpdationParamsData incrementalWeekdays_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData incrementalTimePoints(
            List<BackupPlanTimePoint> incrementalTimePoints) {

        this.incrementalTimePoints = incrementalTimePoints;
        return this;
    }

    public BackupPlanUpdationParamsData addIncrementalTimePointsItem(
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

    public BackupPlanUpdationParamsData incrementalTimePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_TIME_POINTS);
        return this;
    }

    public BackupPlanUpdationParamsData incrementalTimePoints_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData incrementalInterval(Integer incrementalInterval) {

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

    public BackupPlanUpdationParamsData incrementalInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public BackupPlanUpdationParamsData incrementalInterval_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData incrementalPeriod(BackupPlanPeriod incrementalPeriod) {

        this.incrementalPeriod = incrementalPeriod;
        return this;
    }

    /**
     * Get incrementalPeriod
     *
     * @return incrementalPeriod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getIncrementalPeriod() {
        return incrementalPeriod;
    }

    public void setIncrementalPeriod(BackupPlanPeriod incrementalPeriod) {
        this.incrementalPeriod = incrementalPeriod;
    }

    public BackupPlanUpdationParamsData incrementalPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public BackupPlanUpdationParamsData incrementalPeriod_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData snapshotConsistentType(
            ConsistentType snapshotConsistentType) {

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

    public BackupPlanUpdationParamsData snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public BackupPlanUpdationParamsData snapshotConsistentType_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData compression(Boolean compression) {

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

    public BackupPlanUpdationParamsData compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public BackupPlanUpdationParamsData compression_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData vms(VmWhereInput vms) {

        this.vms = vms;
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVms() {
        return vms;
    }

    public void setVms(VmWhereInput vms) {
        this.vms = vms;
    }

    public BackupPlanUpdationParamsData vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public BackupPlanUpdationParamsData vms_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData description(String description) {

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

    public BackupPlanUpdationParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupPlanUpdationParamsData description_ExplictlyNonNull() {
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

    public BackupPlanUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupPlanUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupPlanUpdationParamsData name_ExplictlyNonNull() {
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
        BackupPlanUpdationParamsData backupPlanUpdationParamsData =
                (BackupPlanUpdationParamsData) o;
        return Objects.equals(
                        this.disconnectStrategy, backupPlanUpdationParamsData.disconnectStrategy)
                && Objects.equals(
                        this.keepPolicyValue, backupPlanUpdationParamsData.keepPolicyValue)
                && Objects.equals(this.keepPolicy, backupPlanUpdationParamsData.keepPolicy)
                && Objects.equals(
                        this.backupDelayOption, backupPlanUpdationParamsData.backupDelayOption)
                && Objects.equals(this.windowEnd, backupPlanUpdationParamsData.windowEnd)
                && Objects.equals(this.windowStart, backupPlanUpdationParamsData.windowStart)
                && Objects.equals(this.enableWindow, backupPlanUpdationParamsData.enableWindow)
                && Objects.equals(this.fullTimePoint, backupPlanUpdationParamsData.fullTimePoint)
                && Objects.equals(this.fullPeriod, backupPlanUpdationParamsData.fullPeriod)
                && Objects.equals(this.fullInterval, backupPlanUpdationParamsData.fullInterval)
                && Objects.equals(
                        this.incrementalWeekdays, backupPlanUpdationParamsData.incrementalWeekdays)
                && Objects.equals(
                        this.incrementalTimePoints,
                        backupPlanUpdationParamsData.incrementalTimePoints)
                && Objects.equals(
                        this.incrementalInterval, backupPlanUpdationParamsData.incrementalInterval)
                && Objects.equals(
                        this.incrementalPeriod, backupPlanUpdationParamsData.incrementalPeriod)
                && Objects.equals(
                        this.snapshotConsistentType,
                        backupPlanUpdationParamsData.snapshotConsistentType)
                && Objects.equals(this.compression, backupPlanUpdationParamsData.compression)
                && Objects.equals(this.vms, backupPlanUpdationParamsData.vms)
                && Objects.equals(this.description, backupPlanUpdationParamsData.description)
                && Objects.equals(this.name, backupPlanUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                disconnectStrategy,
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
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPlanUpdationParamsData {\n");
        sb.append("    disconnectStrategy: ")
                .append(toIndentedString(disconnectStrategy))
                .append("\n");
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
