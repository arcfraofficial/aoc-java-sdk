package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CommonHeader */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CommonHeader extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_X_TOWER_REQUEST_ID = "x-tower-request-id";

    @SerializedName(SERIALIZED_NAME_X_TOWER_REQUEST_ID)
    private String xTowerRequestId;

    public CommonHeader() {}

    public CommonHeader xTowerRequestId(String xTowerRequestId) {

        this.xTowerRequestId = xTowerRequestId;
        return this;
    }

    /**
     * Get xTowerRequestId
     *
     * @return xTowerRequestId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getxTowerRequestId() {
        return xTowerRequestId;
    }

    public void setxTowerRequestId(String xTowerRequestId) {
        this.xTowerRequestId = xTowerRequestId;
    }

    public CommonHeader xTowerRequestId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_X_TOWER_REQUEST_ID);
        return this;
    }

    public CommonHeader xTowerRequestId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_X_TOWER_REQUEST_ID);
        return this;
    }

    public void setXTowerRequestId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_X_TOWER_REQUEST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_X_TOWER_REQUEST_ID);
        }
    }

    public boolean getXTowerRequestId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_X_TOWER_REQUEST_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonHeader commonHeader = (CommonHeader) o;
        return Objects.equals(this.xTowerRequestId, commonHeader.xTowerRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xTowerRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonHeader {\n");
        sb.append("    xTowerRequestId: ").append(toIndentedString(xTowerRequestId)).append("\n");
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
