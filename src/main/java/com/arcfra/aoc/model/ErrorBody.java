package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ErrorBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ErrorBody extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    private ErrorCode code;

    public static final String SERIALIZED_NAME_PROPS = "props";

    @SerializedName(SERIALIZED_NAME_PROPS)
    private Object props = null;

    public static final String SERIALIZED_NAME_STACK = "stack";

    @SerializedName(SERIALIZED_NAME_STACK)
    private String stack;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private Integer status;

    public static final String SERIALIZED_NAME_OPERATION_NAME = "operationName";

    @SerializedName(SERIALIZED_NAME_OPERATION_NAME)
    private String operationName;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public ErrorBody() {}

    public ErrorBody code(ErrorCode code) {

        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

    public ErrorBody code_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE);
        return this;
    }

    public ErrorBody code_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE);
        return this;
    }

    public void setCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE);
        }
    }

    public boolean getCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE);
    }

    public ErrorBody props(Object props) {

        this.props = props;
        return this;
    }

    /**
     * Get props
     *
     * @return props
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Object getProps() {
        return props;
    }

    public void setProps(Object props) {
        this.props = props;
    }

    public ErrorBody props_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROPS);
        return this;
    }

    public ErrorBody props_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROPS);
        return this;
    }

    public void setProps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROPS);
        }
    }

    public boolean getProps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROPS);
    }

    public ErrorBody stack(String stack) {

        this.stack = stack;
        return this;
    }

    /**
     * Get stack
     *
     * @return stack
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public ErrorBody stack_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STACK);
        return this;
    }

    public ErrorBody stack_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STACK);
        return this;
    }

    public void setStack_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STACK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STACK);
        }
    }

    public boolean getStack_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STACK);
    }

    public ErrorBody message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorBody message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public ErrorBody message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public ErrorBody status(Integer status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ErrorBody status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ErrorBody status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public ErrorBody operationName(String operationName) {

        this.operationName = operationName;
        return this;
    }

    /**
     * Get operationName
     *
     * @return operationName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public ErrorBody operationName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATION_NAME);
        return this;
    }

    public ErrorBody operationName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATION_NAME);
        return this;
    }

    public void setOperationName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATION_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATION_NAME);
        }
    }

    public boolean getOperationName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATION_NAME);
    }

    public ErrorBody path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ErrorBody path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public ErrorBody path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorBody errorBody = (ErrorBody) o;
        return Objects.equals(this.code, errorBody.code)
                && Objects.equals(this.props, errorBody.props)
                && Objects.equals(this.stack, errorBody.stack)
                && Objects.equals(this.message, errorBody.message)
                && Objects.equals(this.status, errorBody.status)
                && Objects.equals(this.operationName, errorBody.operationName)
                && Objects.equals(this.path, errorBody.path);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, props, stack, message, status, operationName, path);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorBody {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
        sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
