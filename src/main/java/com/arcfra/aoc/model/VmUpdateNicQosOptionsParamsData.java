package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateNicQosOptionsParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicQosOptionsParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_QOS = "qos";

    @SerializedName(SERIALIZED_NAME_QOS)
    private VmNicQosOption qos;

    public VmUpdateNicQosOptionsParamsData() {}

    public VmUpdateNicQosOptionsParamsData qos(VmNicQosOption qos) {

        this.qos = qos;
        return this;
    }

    /**
     * Get qos
     *
     * @return qos
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicQosOption getQos() {
        return qos;
    }

    public void setQos(VmNicQosOption qos) {
        this.qos = qos;
    }

    public VmUpdateNicQosOptionsParamsData qos_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS);
        return this;
    }

    public VmUpdateNicQosOptionsParamsData qos_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS);
        return this;
    }

    public void setQos_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS);
        }
    }

    public boolean getQos_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateNicQosOptionsParamsData vmUpdateNicQosOptionsParamsData =
                (VmUpdateNicQosOptionsParamsData) o;
        return Objects.equals(this.qos, vmUpdateNicQosOptionsParamsData.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateNicQosOptionsParamsData {\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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
