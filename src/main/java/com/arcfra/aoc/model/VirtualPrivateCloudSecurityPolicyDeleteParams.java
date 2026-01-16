package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudSecurityPolicyDeleteParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityPolicyDeleteParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private VirtualPrivateCloudSecurityPolicyWhereInput where;

    public VirtualPrivateCloudSecurityPolicyDeleteParams() {}

    public VirtualPrivateCloudSecurityPolicyDeleteParams where(
            VirtualPrivateCloudSecurityPolicyWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VirtualPrivateCloudSecurityPolicyWhereInput getWhere() {
        return where;
    }

    public void setWhere(VirtualPrivateCloudSecurityPolicyWhereInput where) {
        this.where = where;
    }

    public VirtualPrivateCloudSecurityPolicyDeleteParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyDeleteParams where_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        return this;
    }

    public void setWhere_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHERE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        }
    }

    public boolean getWhere_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHERE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudSecurityPolicyDeleteParams
                virtualPrivateCloudSecurityPolicyDeleteParams =
                        (VirtualPrivateCloudSecurityPolicyDeleteParams) o;
        return Objects.equals(this.where, virtualPrivateCloudSecurityPolicyDeleteParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudSecurityPolicyDeleteParams {\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
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
