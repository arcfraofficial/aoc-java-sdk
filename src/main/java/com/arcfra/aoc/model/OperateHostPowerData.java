package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OperateHostPowerData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class OperateHostPowerData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_FORCE = "force";

    @SerializedName(SERIALIZED_NAME_FORCE)
    private Boolean force;

    public static final String SERIALIZED_NAME_ACTION = "action";

    @SerializedName(SERIALIZED_NAME_ACTION)
    private OperateActionEnum action;

    public OperateHostPowerData() {}

    public OperateHostPowerData reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public OperateHostPowerData reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public OperateHostPowerData reason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REASON);
        return this;
    }

    public void setReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REASON);
        }
    }

    public boolean getReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REASON);
    }

    public OperateHostPowerData force(Boolean force) {

        this.force = force;
        return this;
    }

    /**
     * Get force
     *
     * @return force
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public OperateHostPowerData force_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FORCE);
        return this;
    }

    public OperateHostPowerData force_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        return this;
    }

    public void setForce_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FORCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        }
    }

    public boolean getForce_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FORCE);
    }

    public OperateHostPowerData action(OperateActionEnum action) {

        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public OperateActionEnum getAction() {
        return action;
    }

    public void setAction(OperateActionEnum action) {
        this.action = action;
    }

    public OperateHostPowerData action_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION);
        return this;
    }

    public OperateHostPowerData action_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        return this;
    }

    public void setAction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        }
    }

    public boolean getAction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateHostPowerData operateHostPowerData = (OperateHostPowerData) o;
        return Objects.equals(this.reason, operateHostPowerData.reason)
                && Objects.equals(this.force, operateHostPowerData.force)
                && Objects.equals(this.action, operateHostPowerData.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, force, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateHostPowerData {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
