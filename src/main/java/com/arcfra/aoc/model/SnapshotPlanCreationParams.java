package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SnapshotPlanCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlanCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_IDS = "vm_ids";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_EXECUTE_INTERVALS = "execute_intervals";

    @SerializedName(SERIALIZED_NAME_EXECUTE_INTERVALS)
    private List<Integer> executeIntervals = new ArrayList<Integer>();

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE = "execute_plan_type";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE)
    private SnapshotPlanExecuteType executePlanType;

    public static final String SERIALIZED_NAME_EXEC_H_M = "exec_h_m";

    @SerializedName(SERIALIZED_NAME_EXEC_H_M)
    private String execHM;

    public static final String SERIALIZED_NAME_END_TIME = "end_time";

    @SerializedName(SERIALIZED_NAME_END_TIME)
    private String endTime;

    public static final String SERIALIZED_NAME_START_TIME = "start_time";

    @SerializedName(SERIALIZED_NAME_START_TIME)
    private String startTime;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM = "remain_snapshot_num";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM)
    private Integer remainSnapshotNum;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SnapshotPlanCreationParams() {}

    public SnapshotPlanCreationParams vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public SnapshotPlanCreationParams addVmIdsItem(String vmIdsItem) {
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * Get vmIds
     *
     * @return vmIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    public SnapshotPlanCreationParams vmIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public SnapshotPlanCreationParams vmIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public void setVmIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        }
    }

    public boolean getVmIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_IDS);
    }

    public SnapshotPlanCreationParams executeIntervals(List<Integer> executeIntervals) {

        this.executeIntervals = executeIntervals;
        return this;
    }

    public SnapshotPlanCreationParams addExecuteIntervalsItem(Integer executeIntervalsItem) {
        this.executeIntervals.add(executeIntervalsItem);
        return this;
    }

    /**
     * Get executeIntervals
     *
     * @return executeIntervals
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Integer> getExecuteIntervals() {
        return executeIntervals;
    }

    public void setExecuteIntervals(List<Integer> executeIntervals) {
        this.executeIntervals = executeIntervals;
    }

    public SnapshotPlanCreationParams executeIntervals_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_INTERVALS);
        return this;
    }

    public SnapshotPlanCreationParams executeIntervals_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_INTERVALS);
        return this;
    }

    public void setExecuteIntervals_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_INTERVALS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_INTERVALS);
        }
    }

    public boolean getExecuteIntervals_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_INTERVALS);
    }

    public SnapshotPlanCreationParams executePlanType(SnapshotPlanExecuteType executePlanType) {

        this.executePlanType = executePlanType;
        return this;
    }

    /**
     * Get executePlanType
     *
     * @return executePlanType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SnapshotPlanExecuteType getExecutePlanType() {
        return executePlanType;
    }

    public void setExecutePlanType(SnapshotPlanExecuteType executePlanType) {
        this.executePlanType = executePlanType;
    }

    public SnapshotPlanCreationParams executePlanType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public SnapshotPlanCreationParams executePlanType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public void setExecutePlanType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        }
    }

    public boolean getExecutePlanType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
    }

    public SnapshotPlanCreationParams execHM(String execHM) {

        this.execHM = execHM;
        return this;
    }

    /**
     * Get execHM
     *
     * @return execHM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecHM() {
        return execHM;
    }

    public void setExecHM(String execHM) {
        this.execHM = execHM;
    }

    public SnapshotPlanCreationParams execHM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_H_M);
        return this;
    }

    public SnapshotPlanCreationParams execHM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXEC_H_M);
        return this;
    }

    public void setExecHM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXEC_H_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXEC_H_M);
        }
    }

    public boolean getExecHM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXEC_H_M);
    }

    public SnapshotPlanCreationParams endTime(String endTime) {

        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SnapshotPlanCreationParams endTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public SnapshotPlanCreationParams endTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public void setEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        }
    }

    public boolean getEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME);
    }

    public SnapshotPlanCreationParams startTime(String startTime) {

        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SnapshotPlanCreationParams startTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public SnapshotPlanCreationParams startTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public void setStartTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        }
    }

    public boolean getStartTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME);
    }

    public SnapshotPlanCreationParams remainSnapshotNum(Integer remainSnapshotNum) {

        this.remainSnapshotNum = remainSnapshotNum;
        return this;
    }

    /**
     * Get remainSnapshotNum
     *
     * @return remainSnapshotNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getRemainSnapshotNum() {
        return remainSnapshotNum;
    }

    public void setRemainSnapshotNum(Integer remainSnapshotNum) {
        this.remainSnapshotNum = remainSnapshotNum;
    }

    public SnapshotPlanCreationParams remainSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public SnapshotPlanCreationParams remainSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public void setRemainSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        }
    }

    public boolean getRemainSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
    }

    public SnapshotPlanCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public SnapshotPlanCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public SnapshotPlanCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public SnapshotPlanCreationParams name(String name) {

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

    public SnapshotPlanCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotPlanCreationParams name_ExplictlyNonNull() {
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
        SnapshotPlanCreationParams snapshotPlanCreationParams = (SnapshotPlanCreationParams) o;
        return Objects.equals(this.vmIds, snapshotPlanCreationParams.vmIds)
                && Objects.equals(
                        this.executeIntervals, snapshotPlanCreationParams.executeIntervals)
                && Objects.equals(this.executePlanType, snapshotPlanCreationParams.executePlanType)
                && Objects.equals(this.execHM, snapshotPlanCreationParams.execHM)
                && Objects.equals(this.endTime, snapshotPlanCreationParams.endTime)
                && Objects.equals(this.startTime, snapshotPlanCreationParams.startTime)
                && Objects.equals(
                        this.remainSnapshotNum, snapshotPlanCreationParams.remainSnapshotNum)
                && Objects.equals(this.clusterId, snapshotPlanCreationParams.clusterId)
                && Objects.equals(this.name, snapshotPlanCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vmIds,
                executeIntervals,
                executePlanType,
                execHM,
                endTime,
                startTime,
                remainSnapshotNum,
                clusterId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotPlanCreationParams {\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
        sb.append("    executeIntervals: ").append(toIndentedString(executeIntervals)).append("\n");
        sb.append("    executePlanType: ").append(toIndentedString(executePlanType)).append("\n");
        sb.append("    execHM: ").append(toIndentedString(execHM)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    remainSnapshotNum: ")
                .append(toIndentedString(remainSnapshotNum))
                .append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
