package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WitnessService */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class WitnessService extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ROLE = "role";

    @SerializedName(SERIALIZED_NAME_ROLE)
    private String role;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_STATE_DURATION = "state_duration";

    @SerializedName(SERIALIZED_NAME_STATE_DURATION)
    private Double stateDuration;

    public WitnessService() {}

    public WitnessService id(String id) {

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

    public WitnessService id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public WitnessService id_ExplictlyNonNull() {
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

    public WitnessService name(String name) {

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

    public WitnessService name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public WitnessService name_ExplictlyNonNull() {
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

    public WitnessService role(String role) {

        this.role = role;
        return this;
    }

    /**
     * Get role
     *
     * @return role
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public WitnessService role_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLE);
        return this;
    }

    public WitnessService role_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLE);
        return this;
    }

    public void setRole_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLE);
        }
    }

    public boolean getRole_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLE);
    }

    public WitnessService state(String state) {

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
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WitnessService state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public WitnessService state_ExplictlyNonNull() {
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

    public WitnessService stateDuration(Double stateDuration) {

        this.stateDuration = stateDuration;
        return this;
    }

    /**
     * Get stateDuration
     *
     * @return stateDuration
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(Double stateDuration) {
        this.stateDuration = stateDuration;
    }

    public WitnessService stateDuration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_DURATION);
        return this;
    }

    public WitnessService stateDuration_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_DURATION);
        return this;
    }

    public void setStateDuration_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_DURATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_DURATION);
        }
    }

    public boolean getStateDuration_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_DURATION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WitnessService witnessService = (WitnessService) o;
        return Objects.equals(this.id, witnessService.id)
                && Objects.equals(this.name, witnessService.name)
                && Objects.equals(this.role, witnessService.role)
                && Objects.equals(this.state, witnessService.state)
                && Objects.equals(this.stateDuration, witnessService.stateDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, state, stateDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WitnessService {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateDuration: ").append(toIndentedString(stateDuration)).append("\n");
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
