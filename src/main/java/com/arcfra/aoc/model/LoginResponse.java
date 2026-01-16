package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** LoginResponse */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LoginResponse extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TOKEN = "token";

    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;

    public LoginResponse() {}

    public LoginResponse token(String token) {

        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginResponse token_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOKEN);
        return this;
    }

    public LoginResponse token_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOKEN);
        return this;
    }

    public void setToken_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOKEN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOKEN);
        }
    }

    public boolean getToken_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOKEN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) o;
        return Objects.equals(this.token, loginResponse.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginResponse {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
