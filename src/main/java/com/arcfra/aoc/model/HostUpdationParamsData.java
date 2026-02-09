package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** HostUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IPMI = "ipmi";

    @SerializedName(SERIALIZED_NAME_IPMI)
    private HostBatchCreateIpmiInput ipmi;

    public static final String SERIALIZED_NAME_SCVM_NAME = "scvm_name";

    @SerializedName(SERIALIZED_NAME_SCVM_NAME)
    private String scvmName;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public HostUpdationParamsData() {}

    public HostUpdationParamsData ipmi(HostBatchCreateIpmiInput ipmi) {

        this.ipmi = ipmi;
        return this;
    }

    /**
     * Get ipmi
     *
     * @return ipmi
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostBatchCreateIpmiInput getIpmi() {
        return ipmi;
    }

    public void setIpmi(HostBatchCreateIpmiInput ipmi) {
        this.ipmi = ipmi;
    }

    public HostUpdationParamsData ipmi_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPMI);
        return this;
    }

    public HostUpdationParamsData ipmi_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPMI);
        return this;
    }

    public void setIpmi_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPMI);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPMI);
        }
    }

    public boolean getIpmi_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPMI);
    }

    public HostUpdationParamsData scvmName(String scvmName) {

        this.scvmName = scvmName;
        return this;
    }

    /**
     * Get scvmName
     *
     * @return scvmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getScvmName() {
        return scvmName;
    }

    public void setScvmName(String scvmName) {
        this.scvmName = scvmName;
    }

    public HostUpdationParamsData scvmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCVM_NAME);
        return this;
    }

    public HostUpdationParamsData scvmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCVM_NAME);
        return this;
    }

    public void setScvmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCVM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCVM_NAME);
        }
    }

    public boolean getScvmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCVM_NAME);
    }

    public HostUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public HostUpdationParamsData name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostUpdationParamsData hostUpdationParamsData = (HostUpdationParamsData) o;
        return Objects.equals(this.ipmi, hostUpdationParamsData.ipmi)
                && Objects.equals(this.scvmName, hostUpdationParamsData.scvmName)
                && Objects.equals(this.name, hostUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipmi, scvmName, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostUpdationParamsData {\n");
        sb.append("    ipmi: ").append(toIndentedString(ipmi)).append("\n");
        sb.append("    scvmName: ").append(toIndentedString(scvmName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
