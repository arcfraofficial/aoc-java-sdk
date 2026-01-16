package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudSecurityPolicyApplyInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityPolicyApplyInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";

    @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
    private Boolean communicable;

    public VirtualPrivateCloudSecurityPolicyApplyInput() {}

    public VirtualPrivateCloudSecurityPolicyApplyInput securityGroupId(String securityGroupId) {

        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * Get securityGroupId
     *
     * @return securityGroupId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public VirtualPrivateCloudSecurityPolicyApplyInput securityGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyApplyInput securityGroupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP_ID);
        return this;
    }

    public void setSecurityGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP_ID);
        }
    }

    public boolean getSecurityGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUP_ID);
    }

    public VirtualPrivateCloudSecurityPolicyApplyInput communicable(Boolean communicable) {

        this.communicable = communicable;
        return this;
    }

    /**
     * Get communicable
     *
     * @return communicable
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getCommunicable() {
        return communicable;
    }

    public void setCommunicable(Boolean communicable) {
        this.communicable = communicable;
    }

    public VirtualPrivateCloudSecurityPolicyApplyInput communicable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNICABLE);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyApplyInput communicable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNICABLE);
        return this;
    }

    public void setCommunicable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNICABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNICABLE);
        }
    }

    public boolean getCommunicable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNICABLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudSecurityPolicyApplyInput virtualPrivateCloudSecurityPolicyApplyInput =
                (VirtualPrivateCloudSecurityPolicyApplyInput) o;
        return Objects.equals(
                        this.securityGroupId,
                        virtualPrivateCloudSecurityPolicyApplyInput.securityGroupId)
                && Objects.equals(
                        this.communicable,
                        virtualPrivateCloudSecurityPolicyApplyInput.communicable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupId, communicable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudSecurityPolicyApplyInput {\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
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
