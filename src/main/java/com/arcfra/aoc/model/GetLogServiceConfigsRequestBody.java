package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** GetLogServiceConfigsRequestBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetLogServiceConfigsRequestBody
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INPUT = "input";

    @SerializedName(SERIALIZED_NAME_INPUT)
    private LogServiceConfigsInput input;

    public GetLogServiceConfigsRequestBody() {}

    public GetLogServiceConfigsRequestBody input(LogServiceConfigsInput input) {

        this.input = input;
        return this;
    }

    /**
     * Get input
     *
     * @return input
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public LogServiceConfigsInput getInput() {
        return input;
    }

    public void setInput(LogServiceConfigsInput input) {
        this.input = input;
    }

    public GetLogServiceConfigsRequestBody input_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INPUT);
        return this;
    }

    public GetLogServiceConfigsRequestBody input_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INPUT);
        return this;
    }

    public void setInput_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INPUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INPUT);
        }
    }

    public boolean getInput_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INPUT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetLogServiceConfigsRequestBody getLogServiceConfigsRequestBody =
                (GetLogServiceConfigsRequestBody) o;
        return Objects.equals(this.input, getLogServiceConfigsRequestBody.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLogServiceConfigsRequestBody {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
