package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NetworkPolicyRuleServiceUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NetworkPolicyRuleServiceUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MEMBERS = "members";

    @SerializedName(SERIALIZED_NAME_MEMBERS)
    private List<NetworkPolicyRuleServiceMemberParams> members = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public NetworkPolicyRuleServiceUpdationParamsData() {}

    public NetworkPolicyRuleServiceUpdationParamsData members(
            List<NetworkPolicyRuleServiceMemberParams> members) {

        this.members = members;
        return this;
    }

    public NetworkPolicyRuleServiceUpdationParamsData addMembersItem(
            NetworkPolicyRuleServiceMemberParams membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<NetworkPolicyRuleServiceMemberParams>();
        }
        this.members.add(membersItem);
        return this;
    }

    /**
     * Get members
     *
     * @return members
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkPolicyRuleServiceMemberParams> getMembers() {
        return members;
    }

    public void setMembers(List<NetworkPolicyRuleServiceMemberParams> members) {
        this.members = members;
    }

    public NetworkPolicyRuleServiceUpdationParamsData members_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMBERS);
        return this;
    }

    public NetworkPolicyRuleServiceUpdationParamsData members_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMBERS);
        return this;
    }

    public void setMembers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMBERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMBERS);
        }
    }

    public boolean getMembers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMBERS);
    }

    public NetworkPolicyRuleServiceUpdationParamsData description(String description) {

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

    public NetworkPolicyRuleServiceUpdationParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NetworkPolicyRuleServiceUpdationParamsData description_ExplictlyNonNull() {
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

    public NetworkPolicyRuleServiceUpdationParamsData name(String name) {

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

    public NetworkPolicyRuleServiceUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NetworkPolicyRuleServiceUpdationParamsData name_ExplictlyNonNull() {
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
        NetworkPolicyRuleServiceUpdationParamsData networkPolicyRuleServiceUpdationParamsData =
                (NetworkPolicyRuleServiceUpdationParamsData) o;
        return Objects.equals(this.members, networkPolicyRuleServiceUpdationParamsData.members)
                && Objects.equals(
                        this.description, networkPolicyRuleServiceUpdationParamsData.description)
                && Objects.equals(this.name, networkPolicyRuleServiceUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkPolicyRuleServiceUpdationParamsData {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
