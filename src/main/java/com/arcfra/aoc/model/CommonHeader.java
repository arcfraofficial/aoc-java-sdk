package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CommonHeader */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CommonHeader extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_X_AOC_REQUEST_ID = "x-aoc-request-id";

    @SerializedName(SERIALIZED_NAME_X_AOC_REQUEST_ID)
    private String xAocRequestId;

    public CommonHeader() {}

    public CommonHeader xAocRequestId(String xAocRequestId) {

        this.xAocRequestId = xAocRequestId;
        return this;
    }

    /**
     * Get xAocRequestId
     *
     * @return xAocRequestId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getxAocRequestId() {
        return xAocRequestId;
    }

    public void setxAocRequestId(String xAocRequestId) {
        this.xAocRequestId = xAocRequestId;
    }

    public CommonHeader xAocRequestId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_X_AOC_REQUEST_ID);
        return this;
    }

    public CommonHeader xAocRequestId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_X_AOC_REQUEST_ID);
        return this;
    }

    public void setXAocRequestId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_X_AOC_REQUEST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_X_AOC_REQUEST_ID);
        }
    }

    public boolean getXAocRequestId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_X_AOC_REQUEST_ID);
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
        return Objects.equals(this.xAocRequestId, commonHeader.xAocRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAocRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonHeader {\n");
        sb.append("    xAocRequestId: ").append(toIndentedString(xAocRequestId)).append("\n");
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
