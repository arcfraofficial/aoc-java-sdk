package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ApplicationVmSpecNetwork */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecNetwork
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private List<ApplicationVmSpecNic> nics = null;

    public static final String SERIALIZED_NAME_DNS = "dns";

    @SerializedName(SERIALIZED_NAME_DNS)
    private List<String> dns = null;

    public ApplicationVmSpecNetwork() {}

    public ApplicationVmSpecNetwork nics(List<ApplicationVmSpecNic> nics) {

        this.nics = nics;
        return this;
    }

    public ApplicationVmSpecNetwork addNicsItem(ApplicationVmSpecNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<ApplicationVmSpecNic>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationVmSpecNic> getNics() {
        return nics;
    }

    public void setNics(List<ApplicationVmSpecNic> nics) {
        this.nics = nics;
    }

    public ApplicationVmSpecNetwork nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public ApplicationVmSpecNetwork nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public ApplicationVmSpecNetwork dns(List<String> dns) {

        this.dns = dns;
        return this;
    }

    public ApplicationVmSpecNetwork addDnsItem(String dnsItem) {
        if (this.dns == null) {
            this.dns = new ArrayList<String>();
        }
        this.dns.add(dnsItem);
        return this;
    }

    /**
     * Get dns
     *
     * @return dns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public ApplicationVmSpecNetwork dns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNS);
        return this;
    }

    public ApplicationVmSpecNetwork dns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNS);
        return this;
    }

    public void setDns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNS);
        }
    }

    public boolean getDns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecNetwork applicationVmSpecNetwork = (ApplicationVmSpecNetwork) o;
        return Objects.equals(this.nics, applicationVmSpecNetwork.nics)
                && Objects.equals(this.dns, applicationVmSpecNetwork.dns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nics, dns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecNetwork {\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
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
