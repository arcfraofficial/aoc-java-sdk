package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVirtualPrivateCloudEdgeGatewayInstanceStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudEdgeGatewayInstanceStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IS_HEALTH = "isHealth";

    @SerializedName(SERIALIZED_NAME_IS_HEALTH)
    private Boolean isHealth;

    public NestedVirtualPrivateCloudEdgeGatewayInstanceStatus() {}

    public NestedVirtualPrivateCloudEdgeGatewayInstanceStatus isHealth(Boolean isHealth) {

        this.isHealth = isHealth;
        return this;
    }

    /**
     * Get isHealth
     *
     * @return isHealth
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public NestedVirtualPrivateCloudEdgeGatewayInstanceStatus isHealth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public NestedVirtualPrivateCloudEdgeGatewayInstanceStatus isHealth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public void setIsHealth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        }
    }

    public boolean getIsHealth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_HEALTH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudEdgeGatewayInstanceStatus
                nestedVirtualPrivateCloudEdgeGatewayInstanceStatus =
                        (NestedVirtualPrivateCloudEdgeGatewayInstanceStatus) o;
        return Objects.equals(
                this.isHealth, nestedVirtualPrivateCloudEdgeGatewayInstanceStatus.isHealth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHealth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVirtualPrivateCloudEdgeGatewayInstanceStatus {\n");
        sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
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
