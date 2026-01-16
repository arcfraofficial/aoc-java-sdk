package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OvfNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class OvfNic extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MAC = "mac";

    @SerializedName(SERIALIZED_NAME_MAC)
    private String mac;

    public OvfNic() {}

    public OvfNic mac(String mac) {

        this.mac = mac;
        return this;
    }

    /**
     * Get mac
     *
     * @return mac
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public OvfNic mac_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC);
        return this;
    }

    public OvfNic mac_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC);
        return this;
    }

    public void setMac_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC);
        }
    }

    public boolean getMac_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OvfNic ovfNic = (OvfNic) o;
        return Objects.equals(this.mac, ovfNic.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mac);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OvfNic {\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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
