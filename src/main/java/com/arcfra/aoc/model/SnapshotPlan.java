package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnapshotPlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM = "auto_delete_num";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM)
    private Integer autoDeleteNum;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM = "auto_execute_num";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM)
    private Integer autoExecuteNum;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_END_TIME = "end_time";

    @SerializedName(SERIALIZED_NAME_END_TIME)
    private String endTime;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXEC_H_M = "exec_h_m";

    @SerializedName(SERIALIZED_NAME_EXEC_H_M)
    private Object execHM;

    public static final String SERIALIZED_NAME_EXECUTE_INTERVALS = "execute_intervals";

    @SerializedName(SERIALIZED_NAME_EXECUTE_INTERVALS)
    private List<Integer> executeIntervals = new ArrayList<Integer>();

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE = "execute_plan_type";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE)
    private SnapshotPlanExecuteType executePlanType;

    public static final String SERIALIZED_NAME_EXECUTION_TASKS = "execution_tasks";

    @SerializedName(SERIALIZED_NAME_EXECUTION_TASKS)
    private List<NestedSnapshotPlanTask> executionTasks = null;

    public static final String SERIALIZED_NAME_HEALTHY = "healthy";

    @SerializedName(SERIALIZED_NAME_HEALTHY)
    private Boolean healthy;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME = "last_execute_end_time";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME)
    private String lastExecuteEndTime;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
    private SnapshotPlanExecuteStatus lastExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME = "last_execute_time";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME)
    private String lastExecuteTime;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
    private Long logicalSizeBytes;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM = "manual_delete_num";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM)
    private Integer manualDeleteNum;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM = "manual_execute_num";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM)
    private Integer manualExecuteNum;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME = "next_execute_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME)
    private String nextExecuteTime;

    public static final String SERIALIZED_NAME_OBJECT_NUM = "object_num";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM)
    private Integer objectNum;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES = "physical_size_bytes";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES)
    private Long physicalSizeBytes;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM = "remain_snapshot_num";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM)
    private Integer remainSnapshotNum;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM = "snapshot_group_num";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM)
    private Integer snapshotGroupNum;

    public static final String SERIALIZED_NAME_START_TIME = "start_time";

    @SerializedName(SERIALIZED_NAME_START_TIME)
    private String startTime;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private SnapshotPlanStatus status;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public SnapshotPlan() {}

    public SnapshotPlan autoDeleteNum(Integer autoDeleteNum) {

        this.autoDeleteNum = autoDeleteNum;
        return this;
    }

    /**
     * Get autoDeleteNum
     *
     * @return autoDeleteNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getAutoDeleteNum() {
        return autoDeleteNum;
    }

    public void setAutoDeleteNum(Integer autoDeleteNum) {
        this.autoDeleteNum = autoDeleteNum;
    }

    public SnapshotPlan autoDeleteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM);
        return this;
    }

    public SnapshotPlan autoDeleteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM);
        return this;
    }

    public void setAutoDeleteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM);
        }
    }

    public boolean getAutoDeleteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM);
    }

    public SnapshotPlan autoExecuteNum(Integer autoExecuteNum) {

        this.autoExecuteNum = autoExecuteNum;
        return this;
    }

    /**
     * Get autoExecuteNum
     *
     * @return autoExecuteNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getAutoExecuteNum() {
        return autoExecuteNum;
    }

    public void setAutoExecuteNum(Integer autoExecuteNum) {
        this.autoExecuteNum = autoExecuteNum;
    }

    public SnapshotPlan autoExecuteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        return this;
    }

    public SnapshotPlan autoExecuteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        return this;
    }

    public void setAutoExecuteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        }
    }

    public boolean getAutoExecuteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
    }

    public SnapshotPlan cluster(NestedCluster cluster) {

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

    public SnapshotPlan cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnapshotPlan cluster_ExplictlyNonNull() {
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

    public SnapshotPlan description(String description) {

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

    public SnapshotPlan description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SnapshotPlan description_ExplictlyNonNull() {
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

    public SnapshotPlan endTime(String endTime) {

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

    public SnapshotPlan endTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public SnapshotPlan endTime_ExplictlyNonNull() {
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

    public SnapshotPlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnapshotPlan entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnapshotPlan entityAsyncStatus_ExplictlyNonNull() {
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

    public SnapshotPlan execHM(Object execHM) {

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
    public Object getExecHM() {
        return execHM;
    }

    public void setExecHM(Object execHM) {
        this.execHM = execHM;
    }

    public SnapshotPlan execHM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_H_M);
        return this;
    }

    public SnapshotPlan execHM_ExplictlyNonNull() {
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

    public SnapshotPlan executeIntervals(List<Integer> executeIntervals) {

        this.executeIntervals = executeIntervals;
        return this;
    }

    public SnapshotPlan addExecuteIntervalsItem(Integer executeIntervalsItem) {
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

    public SnapshotPlan executeIntervals_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_INTERVALS);
        return this;
    }

    public SnapshotPlan executeIntervals_ExplictlyNonNull() {
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

    public SnapshotPlan executePlanType(SnapshotPlanExecuteType executePlanType) {

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

    public SnapshotPlan executePlanType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public SnapshotPlan executePlanType_ExplictlyNonNull() {
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

    public SnapshotPlan executionTasks(List<NestedSnapshotPlanTask> executionTasks) {

        this.executionTasks = executionTasks;
        return this;
    }

    public SnapshotPlan addExecutionTasksItem(NestedSnapshotPlanTask executionTasksItem) {
        if (this.executionTasks == null) {
            this.executionTasks = new ArrayList<NestedSnapshotPlanTask>();
        }
        this.executionTasks.add(executionTasksItem);
        return this;
    }

    /**
     * Get executionTasks
     *
     * @return executionTasks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedSnapshotPlanTask> getExecutionTasks() {
        return executionTasks;
    }

    public void setExecutionTasks(List<NestedSnapshotPlanTask> executionTasks) {
        this.executionTasks = executionTasks;
    }

    public SnapshotPlan executionTasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS);
        return this;
    }

    public SnapshotPlan executionTasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS);
        return this;
    }

    public void setExecutionTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS);
        }
    }

    public boolean getExecutionTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTION_TASKS);
    }

    public SnapshotPlan healthy(Boolean healthy) {

        this.healthy = healthy;
        return this;
    }

    /**
     * Get healthy
     *
     * @return healthy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public SnapshotPlan healthy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public SnapshotPlan healthy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public void setHealthy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        }
    }

    public boolean getHealthy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTHY);
    }

    public SnapshotPlan id(String id) {

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

    public SnapshotPlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotPlan id_ExplictlyNonNull() {
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

    public SnapshotPlan lastExecuteEndTime(String lastExecuteEndTime) {

        this.lastExecuteEndTime = lastExecuteEndTime;
        return this;
    }

    /**
     * Get lastExecuteEndTime
     *
     * @return lastExecuteEndTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTime() {
        return lastExecuteEndTime;
    }

    public void setLastExecuteEndTime(String lastExecuteEndTime) {
        this.lastExecuteEndTime = lastExecuteEndTime;
    }

    public SnapshotPlan lastExecuteEndTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        return this;
    }

    public SnapshotPlan lastExecuteEndTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        return this;
    }

    public void setLastExecuteEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        }
    }

    public boolean getLastExecuteEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
    }

    public SnapshotPlan lastExecuteStatus(SnapshotPlanExecuteStatus lastExecuteStatus) {

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
    public SnapshotPlanExecuteStatus getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(SnapshotPlanExecuteStatus lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public SnapshotPlan lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public SnapshotPlan lastExecuteStatus_ExplictlyNonNull() {
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

    public SnapshotPlan lastExecuteTime(String lastExecuteTime) {

        this.lastExecuteTime = lastExecuteTime;
        return this;
    }

    /**
     * Get lastExecuteTime
     *
     * @return lastExecuteTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTime() {
        return lastExecuteTime;
    }

    public void setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
    }

    public SnapshotPlan lastExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        return this;
    }

    public SnapshotPlan lastExecuteTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        return this;
    }

    public void setLastExecuteTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        }
    }

    public boolean getLastExecuteTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME);
    }

    public SnapshotPlan localId(String localId) {

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

    public SnapshotPlan localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnapshotPlan localId_ExplictlyNonNull() {
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

    public SnapshotPlan logicalSizeBytes(Long logicalSizeBytes) {

        this.logicalSizeBytes = logicalSizeBytes;
        return this;
    }

    /**
     * Get logicalSizeBytes
     *
     * @return logicalSizeBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getLogicalSizeBytes() {
        return logicalSizeBytes;
    }

    public void setLogicalSizeBytes(Long logicalSizeBytes) {
        this.logicalSizeBytes = logicalSizeBytes;
    }

    public SnapshotPlan logicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotPlan logicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public void setLogicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        }
    }

    public boolean getLogicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
    }

    public SnapshotPlan manualDeleteNum(Integer manualDeleteNum) {

        this.manualDeleteNum = manualDeleteNum;
        return this;
    }

    /**
     * Get manualDeleteNum
     *
     * @return manualDeleteNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getManualDeleteNum() {
        return manualDeleteNum;
    }

    public void setManualDeleteNum(Integer manualDeleteNum) {
        this.manualDeleteNum = manualDeleteNum;
    }

    public SnapshotPlan manualDeleteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        return this;
    }

    public SnapshotPlan manualDeleteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        return this;
    }

    public void setManualDeleteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        }
    }

    public boolean getManualDeleteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM);
    }

    public SnapshotPlan manualExecuteNum(Integer manualExecuteNum) {

        this.manualExecuteNum = manualExecuteNum;
        return this;
    }

    /**
     * Get manualExecuteNum
     *
     * @return manualExecuteNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getManualExecuteNum() {
        return manualExecuteNum;
    }

    public void setManualExecuteNum(Integer manualExecuteNum) {
        this.manualExecuteNum = manualExecuteNum;
    }

    public SnapshotPlan manualExecuteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        return this;
    }

    public SnapshotPlan manualExecuteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        return this;
    }

    public void setManualExecuteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        }
    }

    public boolean getManualExecuteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
    }

    public SnapshotPlan mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public SnapshotPlan mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public SnapshotPlan mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public SnapshotPlan name(String name) {

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

    public SnapshotPlan name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotPlan name_ExplictlyNonNull() {
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

    public SnapshotPlan nextExecuteTime(String nextExecuteTime) {

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

    public SnapshotPlan nextExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public SnapshotPlan nextExecuteTime_ExplictlyNonNull() {
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

    public SnapshotPlan objectNum(Integer objectNum) {

        this.objectNum = objectNum;
        return this;
    }

    /**
     * Get objectNum
     *
     * @return objectNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public SnapshotPlan objectNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public SnapshotPlan objectNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public void setObjectNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        }
    }

    public boolean getObjectNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM);
    }

    public SnapshotPlan physicalSizeBytes(Long physicalSizeBytes) {

        this.physicalSizeBytes = physicalSizeBytes;
        return this;
    }

    /**
     * Get physicalSizeBytes
     *
     * @return physicalSizeBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPhysicalSizeBytes() {
        return physicalSizeBytes;
    }

    public void setPhysicalSizeBytes(Long physicalSizeBytes) {
        this.physicalSizeBytes = physicalSizeBytes;
    }

    public SnapshotPlan physicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotPlan physicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        return this;
    }

    public void setPhysicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        }
    }

    public boolean getPhysicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
    }

    public SnapshotPlan remainSnapshotNum(Integer remainSnapshotNum) {

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

    public SnapshotPlan remainSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public SnapshotPlan remainSnapshotNum_ExplictlyNonNull() {
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

    public SnapshotPlan snapshotGroupNum(Integer snapshotGroupNum) {

        this.snapshotGroupNum = snapshotGroupNum;
        return this;
    }

    /**
     * Get snapshotGroupNum
     *
     * @return snapshotGroupNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSnapshotGroupNum() {
        return snapshotGroupNum;
    }

    public void setSnapshotGroupNum(Integer snapshotGroupNum) {
        this.snapshotGroupNum = snapshotGroupNum;
    }

    public SnapshotPlan snapshotGroupNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        return this;
    }

    public SnapshotPlan snapshotGroupNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        return this;
    }

    public void setSnapshotGroupNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        }
    }

    public boolean getSnapshotGroupNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
    }

    public SnapshotPlan startTime(String startTime) {

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

    public SnapshotPlan startTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public SnapshotPlan startTime_ExplictlyNonNull() {
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

    public SnapshotPlan status(SnapshotPlanStatus status) {

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
    public SnapshotPlanStatus getStatus() {
        return status;
    }

    public void setStatus(SnapshotPlanStatus status) {
        this.status = status;
    }

    public SnapshotPlan status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public SnapshotPlan status_ExplictlyNonNull() {
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

    public SnapshotPlan vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public SnapshotPlan addVmsItem(NestedVm vmsItem) {
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

    public SnapshotPlan vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public SnapshotPlan vms_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotPlan snapshotPlan = (SnapshotPlan) o;
        return Objects.equals(this.autoDeleteNum, snapshotPlan.autoDeleteNum)
                && Objects.equals(this.autoExecuteNum, snapshotPlan.autoExecuteNum)
                && Objects.equals(this.cluster, snapshotPlan.cluster)
                && Objects.equals(this.description, snapshotPlan.description)
                && Objects.equals(this.endTime, snapshotPlan.endTime)
                && Objects.equals(this.entityAsyncStatus, snapshotPlan.entityAsyncStatus)
                && Objects.equals(this.execHM, snapshotPlan.execHM)
                && Objects.equals(this.executeIntervals, snapshotPlan.executeIntervals)
                && Objects.equals(this.executePlanType, snapshotPlan.executePlanType)
                && Objects.equals(this.executionTasks, snapshotPlan.executionTasks)
                && Objects.equals(this.healthy, snapshotPlan.healthy)
                && Objects.equals(this.id, snapshotPlan.id)
                && Objects.equals(this.lastExecuteEndTime, snapshotPlan.lastExecuteEndTime)
                && Objects.equals(this.lastExecuteStatus, snapshotPlan.lastExecuteStatus)
                && Objects.equals(this.lastExecuteTime, snapshotPlan.lastExecuteTime)
                && Objects.equals(this.localId, snapshotPlan.localId)
                && Objects.equals(this.logicalSizeBytes, snapshotPlan.logicalSizeBytes)
                && Objects.equals(this.manualDeleteNum, snapshotPlan.manualDeleteNum)
                && Objects.equals(this.manualExecuteNum, snapshotPlan.manualExecuteNum)
                && Objects.equals(this.mirror, snapshotPlan.mirror)
                && Objects.equals(this.name, snapshotPlan.name)
                && Objects.equals(this.nextExecuteTime, snapshotPlan.nextExecuteTime)
                && Objects.equals(this.objectNum, snapshotPlan.objectNum)
                && Objects.equals(this.physicalSizeBytes, snapshotPlan.physicalSizeBytes)
                && Objects.equals(this.remainSnapshotNum, snapshotPlan.remainSnapshotNum)
                && Objects.equals(this.snapshotGroupNum, snapshotPlan.snapshotGroupNum)
                && Objects.equals(this.startTime, snapshotPlan.startTime)
                && Objects.equals(this.status, snapshotPlan.status)
                && Objects.equals(this.vms, snapshotPlan.vms);
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
                autoDeleteNum,
                autoExecuteNum,
                cluster,
                description,
                endTime,
                entityAsyncStatus,
                execHM,
                executeIntervals,
                executePlanType,
                executionTasks,
                healthy,
                id,
                lastExecuteEndTime,
                lastExecuteStatus,
                lastExecuteTime,
                localId,
                logicalSizeBytes,
                manualDeleteNum,
                manualExecuteNum,
                mirror,
                name,
                nextExecuteTime,
                objectNum,
                physicalSizeBytes,
                remainSnapshotNum,
                snapshotGroupNum,
                startTime,
                status,
                vms);
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
        sb.append("class SnapshotPlan {\n");
        sb.append("    autoDeleteNum: ").append(toIndentedString(autoDeleteNum)).append("\n");
        sb.append("    autoExecuteNum: ").append(toIndentedString(autoExecuteNum)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    execHM: ").append(toIndentedString(execHM)).append("\n");
        sb.append("    executeIntervals: ").append(toIndentedString(executeIntervals)).append("\n");
        sb.append("    executePlanType: ").append(toIndentedString(executePlanType)).append("\n");
        sb.append("    executionTasks: ").append(toIndentedString(executionTasks)).append("\n");
        sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastExecuteEndTime: ")
                .append(toIndentedString(lastExecuteEndTime))
                .append("\n");
        sb.append("    lastExecuteStatus: ")
                .append(toIndentedString(lastExecuteStatus))
                .append("\n");
        sb.append("    lastExecuteTime: ").append(toIndentedString(lastExecuteTime)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
        sb.append("    manualDeleteNum: ").append(toIndentedString(manualDeleteNum)).append("\n");
        sb.append("    manualExecuteNum: ").append(toIndentedString(manualExecuteNum)).append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
        sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
        sb.append("    physicalSizeBytes: ")
                .append(toIndentedString(physicalSizeBytes))
                .append("\n");
        sb.append("    remainSnapshotNum: ")
                .append(toIndentedString(remainSnapshotNum))
                .append("\n");
        sb.append("    snapshotGroupNum: ").append(toIndentedString(snapshotGroupNum)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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
