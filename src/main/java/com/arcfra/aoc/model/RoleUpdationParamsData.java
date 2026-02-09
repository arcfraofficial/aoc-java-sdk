package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** RoleUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RoleUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACTIONS = "actions";

    @SerializedName(SERIALIZED_NAME_ACTIONS)
    private List<ROLEACTION> actions = null;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public RoleUpdationParamsData() {}

    public RoleUpdationParamsData actions(List<ROLEACTION> actions) {

        this.actions = actions;
        return this;
    }

    public RoleUpdationParamsData addActionsItem(ROLEACTION actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<ROLEACTION>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Get actions
     *
     * @return actions
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ROLEACTION> getActions() {
        return actions;
    }

    public void setActions(List<ROLEACTION> actions) {
        this.actions = actions;
    }

    public RoleUpdationParamsData actions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIONS);
        return this;
    }

    public RoleUpdationParamsData actions_ExplictlyNonNull() {
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

    public RoleUpdationParamsData name(String name) {

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

    public RoleUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RoleUpdationParamsData name_ExplictlyNonNull() {
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
        RoleUpdationParamsData roleUpdationParamsData = (RoleUpdationParamsData) o;
        return Objects.equals(this.actions, roleUpdationParamsData.actions)
                && Objects.equals(this.name, roleUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleUpdationParamsData {\n");
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
