package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteClusterStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteClusterStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AGENTS = "agents";

    @SerializedName(SERIALIZED_NAME_AGENTS)
    private NestedEverouteClusterAgentStatus agents;

    public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

    @SerializedName(SERIALIZED_NAME_CONDITIONS)
    private List<NestedEverouteClusterCondition> conditions = null;

    public static final String SERIALIZED_NAME_CONTROLLERS = "controllers";

    @SerializedName(SERIALIZED_NAME_CONTROLLERS)
    private NestedEverouteClusterControllerStatus controllers;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_RETRY_COUNT = "retryCount";

    @SerializedName(SERIALIZED_NAME_RETRY_COUNT)
    private Integer retryCount;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public NestedEverouteClusterStatus() {}

    public NestedEverouteClusterStatus agents(NestedEverouteClusterAgentStatus agents) {

        this.agents = agents;
        return this;
    }

    /**
     * Get agents
     *
     * @return agents
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteClusterAgentStatus getAgents() {
        return agents;
    }

    public void setAgents(NestedEverouteClusterAgentStatus agents) {
        this.agents = agents;
    }

    public NestedEverouteClusterStatus agents_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGENTS);
        return this;
    }

    public NestedEverouteClusterStatus agents_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AGENTS);
        return this;
    }

    public void setAgents_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AGENTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AGENTS);
        }
    }

    public boolean getAgents_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AGENTS);
    }

    public NestedEverouteClusterStatus conditions(List<NestedEverouteClusterCondition> conditions) {

        this.conditions = conditions;
        return this;
    }

    public NestedEverouteClusterStatus addConditionsItem(
            NestedEverouteClusterCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<NestedEverouteClusterCondition>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    /**
     * Get conditions
     *
     * @return conditions
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedEverouteClusterCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<NestedEverouteClusterCondition> conditions) {
        this.conditions = conditions;
    }

    public NestedEverouteClusterStatus conditions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONDITIONS);
        return this;
    }

    public NestedEverouteClusterStatus conditions_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONDITIONS);
        return this;
    }

    public void setConditions_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONDITIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONDITIONS);
        }
    }

    public boolean getConditions_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONDITIONS);
    }

    public NestedEverouteClusterStatus controllers(
            NestedEverouteClusterControllerStatus controllers) {

        this.controllers = controllers;
        return this;
    }

    /**
     * Get controllers
     *
     * @return controllers
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteClusterControllerStatus getControllers() {
        return controllers;
    }

    public void setControllers(NestedEverouteClusterControllerStatus controllers) {
        this.controllers = controllers;
    }

    public NestedEverouteClusterStatus controllers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTROLLERS);
        return this;
    }

    public NestedEverouteClusterStatus controllers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTROLLERS);
        return this;
    }

    public void setControllers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTROLLERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTROLLERS);
        }
    }

    public boolean getControllers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTROLLERS);
    }

    public NestedEverouteClusterStatus message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NestedEverouteClusterStatus message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public NestedEverouteClusterStatus message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public NestedEverouteClusterStatus phase(EverouteClusterPhase phase) {

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
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public NestedEverouteClusterStatus phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public NestedEverouteClusterStatus phase_ExplictlyNonNull() {
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

    public NestedEverouteClusterStatus reason(String reason) {

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

    public NestedEverouteClusterStatus reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public NestedEverouteClusterStatus reason_ExplictlyNonNull() {
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

    public NestedEverouteClusterStatus retryCount(Integer retryCount) {

        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get retryCount
     *
     * @return retryCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public NestedEverouteClusterStatus retryCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_COUNT);
        return this;
    }

    public NestedEverouteClusterStatus retryCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_COUNT);
        return this;
    }

    public void setRetryCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_COUNT);
        }
    }

    public boolean getRetryCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_COUNT);
    }

    public NestedEverouteClusterStatus version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public NestedEverouteClusterStatus version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public NestedEverouteClusterStatus version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteClusterStatus nestedEverouteClusterStatus = (NestedEverouteClusterStatus) o;
        return Objects.equals(this.agents, nestedEverouteClusterStatus.agents)
                && Objects.equals(this.conditions, nestedEverouteClusterStatus.conditions)
                && Objects.equals(this.controllers, nestedEverouteClusterStatus.controllers)
                && Objects.equals(this.message, nestedEverouteClusterStatus.message)
                && Objects.equals(this.phase, nestedEverouteClusterStatus.phase)
                && Objects.equals(this.reason, nestedEverouteClusterStatus.reason)
                && Objects.equals(this.retryCount, nestedEverouteClusterStatus.retryCount)
                && Objects.equals(this.version, nestedEverouteClusterStatus.version);
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
                agents, conditions, controllers, message, phase, reason, retryCount, version);
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
        sb.append("class NestedEverouteClusterStatus {\n");
        sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    controllers: ").append(toIndentedString(controllers)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
