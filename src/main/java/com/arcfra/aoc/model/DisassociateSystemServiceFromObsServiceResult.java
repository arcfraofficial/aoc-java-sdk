package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DisassociateSystemServiceFromObsServiceResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DisassociateSystemServiceFromObsServiceResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    private String errorMessage;

    public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    private String errorCode;

    public static final String SERIALIZED_NAME_RESULT = "result";

    @SerializedName(SERIALIZED_NAME_RESULT)
    private DisassociateSystemServiceFromObsServiceResultType result;

    public DisassociateSystemServiceFromObsServiceResult() {}

    public DisassociateSystemServiceFromObsServiceResult errorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public DisassociateSystemServiceFromObsServiceResult errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public DisassociateSystemServiceFromObsServiceResult errorMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public void setErrorMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        }
    }

    public boolean getErrorMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE);
    }

    public DisassociateSystemServiceFromObsServiceResult errorCode(String errorCode) {

        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public DisassociateSystemServiceFromObsServiceResult errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public DisassociateSystemServiceFromObsServiceResult errorCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public void setErrorCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        }
    }

    public boolean getErrorCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE);
    }

    public DisassociateSystemServiceFromObsServiceResult result(
            DisassociateSystemServiceFromObsServiceResultType result) {

        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DisassociateSystemServiceFromObsServiceResultType getResult() {
        return result;
    }

    public void setResult(DisassociateSystemServiceFromObsServiceResultType result) {
        this.result = result;
    }

    public DisassociateSystemServiceFromObsServiceResult result_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT);
        return this;
    }

    public DisassociateSystemServiceFromObsServiceResult result_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        return this;
    }

    public void setResult_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        }
    }

    public boolean getResult_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateSystemServiceFromObsServiceResult
                disassociateSystemServiceFromObsServiceResult =
                        (DisassociateSystemServiceFromObsServiceResult) o;
        return Objects.equals(
                        this.errorMessage,
                        disassociateSystemServiceFromObsServiceResult.errorMessage)
                && Objects.equals(
                        this.errorCode, disassociateSystemServiceFromObsServiceResult.errorCode)
                && Objects.equals(
                        this.result, disassociateSystemServiceFromObsServiceResult.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSystemServiceFromObsServiceResult {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
