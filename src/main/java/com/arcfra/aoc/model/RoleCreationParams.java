package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** RoleCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RoleCreationParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACTIONS = "actions";

    @SerializedName(SERIALIZED_NAME_ACTIONS)
    private List<ROLEACTION> actions = new ArrayList<ROLEACTION>();

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public RoleCreationParams() {}

    public RoleCreationParams actions(List<ROLEACTION> actions) {

        this.actions = actions;
        return this;
    }

    public RoleCreationParams addActionsItem(ROLEACTION actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Get actions
     *
     * @return actions
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ROLEACTION> getActions() {
        return actions;
    }

    public void setActions(List<ROLEACTION> actions) {
        this.actions = actions;
    }

    public RoleCreationParams actions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIONS);
        return this;
    }

    public RoleCreationParams actions_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIONS);
        return this;
    }

    public void setActions_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIONS);
        }
    }

    public boolean getActions_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIONS);
    }

    public RoleCreationParams name(String name) {

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

    public RoleCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RoleCreationParams name_ExplictlyNonNull() {
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
        RoleCreationParams roleCreationParams = (RoleCreationParams) o;
        return Objects.equals(this.actions, roleCreationParams.actions)
                && Objects.equals(this.name, roleCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleCreationParams {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
