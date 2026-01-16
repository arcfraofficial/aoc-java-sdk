package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedMaintenanceHostState */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMaintenanceHostState
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTER_MAINTENANCE_TIME = "enter_maintenance_time";

    @SerializedName(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME)
    private String enterMaintenanceTime;

    public static final String SERIALIZED_NAME_MAINTENANCE_JOB_ID = "maintenance_job_id";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_JOB_ID)
    private String maintenanceJobId;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private MaintenanceModeEnum state;

    public NestedMaintenanceHostState() {}

    public NestedMaintenanceHostState enterMaintenanceTime(String enterMaintenanceTime) {

        this.enterMaintenanceTime = enterMaintenanceTime;
        return this;
    }

    /**
     * Get enterMaintenanceTime
     *
     * @return enterMaintenanceTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEnterMaintenanceTime() {
        return enterMaintenanceTime;
    }

    public void setEnterMaintenanceTime(String enterMaintenanceTime) {
        this.enterMaintenanceTime = enterMaintenanceTime;
    }

    public NestedMaintenanceHostState enterMaintenanceTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME);
        return this;
    }

    public NestedMaintenanceHostState enterMaintenanceTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME);
        return this;
    }

    public void setEnterMaintenanceTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME);
        }
    }

    public boolean getEnterMaintenanceTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME);
    }

    public NestedMaintenanceHostState maintenanceJobId(String maintenanceJobId) {

        this.maintenanceJobId = maintenanceJobId;
        return this;
    }

    /**
     * Get maintenanceJobId
     *
     * @return maintenanceJobId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMaintenanceJobId() {
        return maintenanceJobId;
    }

    public void setMaintenanceJobId(String maintenanceJobId) {
        this.maintenanceJobId = maintenanceJobId;
    }

    public NestedMaintenanceHostState maintenanceJobId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_JOB_ID);
        return this;
    }

    public NestedMaintenanceHostState maintenanceJobId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_JOB_ID);
        return this;
    }

    public void setMaintenanceJobId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_JOB_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_JOB_ID);
        }
    }

    public boolean getMaintenanceJobId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_JOB_ID);
    }

    public NestedMaintenanceHostState state(MaintenanceModeEnum state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MaintenanceModeEnum getState() {
        return state;
    }

    public void setState(MaintenanceModeEnum state) {
        this.state = state;
    }

    public NestedMaintenanceHostState state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public NestedMaintenanceHostState state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedMaintenanceHostState nestedMaintenanceHostState = (NestedMaintenanceHostState) o;
        return Objects.equals(
                        this.enterMaintenanceTime, nestedMaintenanceHostState.enterMaintenanceTime)
                && Objects.equals(
                        this.maintenanceJobId, nestedMaintenanceHostState.maintenanceJobId)
                && Objects.equals(this.state, nestedMaintenanceHostState.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterMaintenanceTime, maintenanceJobId, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedMaintenanceHostState {\n");
        sb.append("    enterMaintenanceTime: ")
                .append(toIndentedString(enterMaintenanceTime))
                .append("\n");
        sb.append("    maintenanceJobId: ").append(toIndentedString(maintenanceJobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
