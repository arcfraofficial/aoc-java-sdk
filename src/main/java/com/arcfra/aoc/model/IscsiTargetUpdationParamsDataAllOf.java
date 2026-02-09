package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiTargetUpdationParamsDataAllOf */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetUpdationParamsDataAllOf
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public IscsiTargetUpdationParamsDataAllOf() {}

    public IscsiTargetUpdationParamsDataAllOf replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public IscsiTargetUpdationParamsDataAllOf replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public IscsiTargetUpdationParamsDataAllOf replicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public void setReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        }
    }

    public boolean getReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM);
    }

    public IscsiTargetUpdationParamsDataAllOf thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public IscsiTargetUpdationParamsDataAllOf thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public IscsiTargetUpdationParamsDataAllOf thinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public void setThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        }
    }

    public boolean getThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiTargetUpdationParamsDataAllOf iscsiTargetUpdationParamsDataAllOf =
                (IscsiTargetUpdationParamsDataAllOf) o;
        return Objects.equals(this.replicaNum, iscsiTargetUpdationParamsDataAllOf.replicaNum)
                && Objects.equals(
                        this.thinProvision, iscsiTargetUpdationParamsDataAllOf.thinProvision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicaNum, thinProvision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiTargetUpdationParamsDataAllOf {\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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
