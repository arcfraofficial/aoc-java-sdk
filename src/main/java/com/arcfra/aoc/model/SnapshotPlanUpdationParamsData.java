package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SnapshotPlanUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlanUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_IDS = "vm_ids";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public static final String SERIALIZED_NAME_EXECUTE_INTERVALS = "execute_intervals";

    @SerializedName(SERIALIZED_NAME_EXECUTE_INTERVALS)
    private List<Integer> executeIntervals = null;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE = "execute_plan_type";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE)
    private SnapshotPlanExecuteType executePlanType;

    public static final String SERIALIZED_NAME_EXEC_H_M = "exec_h_m";

    @SerializedName(SERIALIZED_NAME_EXEC_H_M)
    private String execHM;

    public static final String SERIALIZED_NAME_END_TIME = "end_time";

    @SerializedName(SERIALIZED_NAME_END_TIME)
    private String endTime;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM = "remain_snapshot_num";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM)
    private Integer remainSnapshotNum;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SnapshotPlanUpdationParamsData() {}

    public SnapshotPlanUpdationParamsData vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public SnapshotPlanUpdationParamsData addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<String>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * Get vmIds
     *
     * @return vmIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    public SnapshotPlanUpdationParamsData vmIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public SnapshotPlanUpdationParamsData vmIds_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData executeIntervals(List<Integer> executeIntervals) {

        this.executeIntervals = executeIntervals;
        return this;
    }

    public SnapshotPlanUpdationParamsData addExecuteIntervalsItem(Integer executeIntervalsItem) {
        if (this.executeIntervals == null) {
            this.executeIntervals = new ArrayList<Integer>();
        }
        this.executeIntervals.add(executeIntervalsItem);
        return this;
    }

    /**
     * Get executeIntervals
     *
     * @return executeIntervals
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getExecuteIntervals() {
        return executeIntervals;
    }

    public void setExecuteIntervals(List<Integer> executeIntervals) {
        this.executeIntervals = executeIntervals;
    }

    public SnapshotPlanUpdationParamsData executeIntervals_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_INTERVALS);
        return this;
    }

    public SnapshotPlanUpdationParamsData executeIntervals_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData executePlanType(SnapshotPlanExecuteType executePlanType) {

        this.executePlanType = executePlanType;
        return this;
    }

    /**
     * Get executePlanType
     *
     * @return executePlanType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanExecuteType getExecutePlanType() {
        return executePlanType;
    }

    public void setExecutePlanType(SnapshotPlanExecuteType executePlanType) {
        this.executePlanType = executePlanType;
    }

    public SnapshotPlanUpdationParamsData executePlanType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public SnapshotPlanUpdationParamsData executePlanType_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData execHM(String execHM) {

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

    public SnapshotPlanUpdationParamsData execHM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_H_M);
        return this;
    }

    public SnapshotPlanUpdationParamsData execHM_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData endTime(String endTime) {

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

    public SnapshotPlanUpdationParamsData endTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public SnapshotPlanUpdationParamsData endTime_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData remainSnapshotNum(Integer remainSnapshotNum) {

        this.remainSnapshotNum = remainSnapshotNum;
        return this;
    }

    /**
     * Get remainSnapshotNum
     *
     * @return remainSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNum() {
        return remainSnapshotNum;
    }

    public void setRemainSnapshotNum(Integer remainSnapshotNum) {
        this.remainSnapshotNum = remainSnapshotNum;
    }

    public SnapshotPlanUpdationParamsData remainSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public SnapshotPlanUpdationParamsData remainSnapshotNum_ExplictlyNonNull() {
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

    public SnapshotPlanUpdationParamsData name(String name) {

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

    public SnapshotPlanUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotPlanUpdationParamsData name_ExplictlyNonNull() {
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
        SnapshotPlanUpdationParamsData snapshotPlanUpdationParamsData =
                (SnapshotPlanUpdationParamsData) o;
        return Objects.equals(this.vmIds, snapshotPlanUpdationParamsData.vmIds)
                && Objects.equals(
                        this.executeIntervals, snapshotPlanUpdationParamsData.executeIntervals)
                && Objects.equals(
                        this.executePlanType, snapshotPlanUpdationParamsData.executePlanType)
                && Objects.equals(this.execHM, snapshotPlanUpdationParamsData.execHM)
                && Objects.equals(this.endTime, snapshotPlanUpdationParamsData.endTime)
                && Objects.equals(
                        this.remainSnapshotNum, snapshotPlanUpdationParamsData.remainSnapshotNum)
                && Objects.equals(this.name, snapshotPlanUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vmIds, executeIntervals, executePlanType, execHM, endTime, remainSnapshotNum, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotPlanUpdationParamsData {\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
        sb.append("    executeIntervals: ").append(toIndentedString(executeIntervals)).append("\n");
        sb.append("    executePlanType: ").append(toIndentedString(executePlanType)).append("\n");
        sb.append("    execHM: ").append(toIndentedString(execHM)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    remainSnapshotNum: ")
                .append(toIndentedString(remainSnapshotNum))
                .append("\n");
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
