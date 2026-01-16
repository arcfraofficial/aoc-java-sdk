package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedNetworkPolicyRulePort */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedNetworkPolicyRulePort
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ALG_PROTOCOL = "alg_protocol";

    @SerializedName(SERIALIZED_NAME_ALG_PROTOCOL)
    private NetworkPolicyRuleAlgProtocol algProtocol;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private String port;

    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private NetworkPolicyRulePortProtocol protocol;

    public NestedNetworkPolicyRulePort() {}

    public NestedNetworkPolicyRulePort algProtocol(NetworkPolicyRuleAlgProtocol algProtocol) {

        this.algProtocol = algProtocol;
        return this;
    }

    /**
     * Get algProtocol
     *
     * @return algProtocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NetworkPolicyRuleAlgProtocol getAlgProtocol() {
        return algProtocol;
    }

    public void setAlgProtocol(NetworkPolicyRuleAlgProtocol algProtocol) {
        this.algProtocol = algProtocol;
    }

    public NestedNetworkPolicyRulePort algProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALG_PROTOCOL);
        return this;
    }

    public NestedNetworkPolicyRulePort algProtocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALG_PROTOCOL);
        return this;
    }

    public void setAlgProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALG_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALG_PROTOCOL);
        }
    }

    public boolean getAlgProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALG_PROTOCOL);
    }

    public NestedNetworkPolicyRulePort port(String port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public NestedNetworkPolicyRulePort port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public NestedNetworkPolicyRulePort port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public NestedNetworkPolicyRulePort protocol(NetworkPolicyRulePortProtocol protocol) {

        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     *
     * @return protocol
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NetworkPolicyRulePortProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(NetworkPolicyRulePortProtocol protocol) {
        this.protocol = protocol;
    }

    public NestedNetworkPolicyRulePort protocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public NestedNetworkPolicyRulePort protocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public void setProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        }
    }

    public boolean getProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedNetworkPolicyRulePort nestedNetworkPolicyRulePort = (NestedNetworkPolicyRulePort) o;
        return Objects.equals(this.algProtocol, nestedNetworkPolicyRulePort.algProtocol)
                && Objects.equals(this.port, nestedNetworkPolicyRulePort.port)
                && Objects.equals(this.protocol, nestedNetworkPolicyRulePort.protocol);
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
        return Objects.hash(algProtocol, port, protocol);
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
        sb.append("class NestedNetworkPolicyRulePort {\n");
        sb.append("    algProtocol: ").append(toIndentedString(algProtocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
