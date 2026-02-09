package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfSubsystemCreationParamsAllOf */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfSubsystemCreationParamsAllOf
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_UNIT = "stripe_size_unit";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_UNIT)
    private ByteUnit stripeSizeUnit;

    public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
    private Long stripeSize;

    public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
    private Integer stripeNum;

    public static final String SERIALIZED_NAME_POLICY = "policy";

    @SerializedName(SERIALIZED_NAME_POLICY)
    private NvmfSubsystemPolicyType policy;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public NvmfSubsystemCreationParamsAllOf() {}

    public NvmfSubsystemCreationParamsAllOf replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public NvmfSubsystemCreationParamsAllOf replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf replicaNum_ExplictlyNonNull() {
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

    public NvmfSubsystemCreationParamsAllOf thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public NvmfSubsystemCreationParamsAllOf thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf thinProvision_ExplictlyNonNull() {
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

    public NvmfSubsystemCreationParamsAllOf stripeSizeUnit(ByteUnit stripeSizeUnit) {

        this.stripeSizeUnit = stripeSizeUnit;
        return this;
    }

    /**
     * Get stripeSizeUnit
     *
     * @return stripeSizeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getStripeSizeUnit() {
        return stripeSizeUnit;
    }

    public void setStripeSizeUnit(ByteUnit stripeSizeUnit) {
        this.stripeSizeUnit = stripeSizeUnit;
    }

    public NvmfSubsystemCreationParamsAllOf stripeSizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_UNIT);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf stripeSizeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_UNIT);
        return this;
    }

    public void setStripeSizeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_UNIT);
        }
    }

    public boolean getStripeSizeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_UNIT);
    }

    public NvmfSubsystemCreationParamsAllOf stripeSize(Long stripeSize) {

        this.stripeSize = stripeSize;
        return this;
    }

    /**
     * Get stripeSize
     *
     * @return stripeSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getStripeSize() {
        return stripeSize;
    }

    public void setStripeSize(Long stripeSize) {
        this.stripeSize = stripeSize;
    }

    public NvmfSubsystemCreationParamsAllOf stripeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf stripeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public void setStripeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        }
    }

    public boolean getStripeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE);
    }

    public NvmfSubsystemCreationParamsAllOf stripeNum(Integer stripeNum) {

        this.stripeNum = stripeNum;
        return this;
    }

    /**
     * Get stripeNum
     *
     * @return stripeNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getStripeNum() {
        return stripeNum;
    }

    public void setStripeNum(Integer stripeNum) {
        this.stripeNum = stripeNum;
    }

    public NvmfSubsystemCreationParamsAllOf stripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf stripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public void setStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        }
    }

    public boolean getStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM);
    }

    public NvmfSubsystemCreationParamsAllOf policy(NvmfSubsystemPolicyType policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Get policy
     *
     * @return policy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NvmfSubsystemPolicyType getPolicy() {
        return policy;
    }

    public void setPolicy(NvmfSubsystemPolicyType policy) {
        this.policy = policy;
    }

    public NvmfSubsystemCreationParamsAllOf policy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf policy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        return this;
    }

    public void setPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        }
    }

    public boolean getPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY);
    }

    public NvmfSubsystemCreationParamsAllOf clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public NvmfSubsystemCreationParamsAllOf clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public NvmfSubsystemCreationParamsAllOf name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NvmfSubsystemCreationParamsAllOf name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfSubsystemCreationParamsAllOf name_ExplictlyNonNull() {
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
        NvmfSubsystemCreationParamsAllOf nvmfSubsystemCreationParamsAllOf =
                (NvmfSubsystemCreationParamsAllOf) o;
        return Objects.equals(this.replicaNum, nvmfSubsystemCreationParamsAllOf.replicaNum)
                && Objects.equals(
                        this.thinProvision, nvmfSubsystemCreationParamsAllOf.thinProvision)
                && Objects.equals(
                        this.stripeSizeUnit, nvmfSubsystemCreationParamsAllOf.stripeSizeUnit)
                && Objects.equals(this.stripeSize, nvmfSubsystemCreationParamsAllOf.stripeSize)
                && Objects.equals(this.stripeNum, nvmfSubsystemCreationParamsAllOf.stripeNum)
                && Objects.equals(this.policy, nvmfSubsystemCreationParamsAllOf.policy)
                && Objects.equals(this.clusterId, nvmfSubsystemCreationParamsAllOf.clusterId)
                && Objects.equals(this.name, nvmfSubsystemCreationParamsAllOf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicaNum,
                thinProvision,
                stripeSizeUnit,
                stripeSize,
                stripeNum,
                policy,
                clusterId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfSubsystemCreationParamsAllOf {\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    stripeSizeUnit: ").append(toIndentedString(stripeSizeUnit)).append("\n");
        sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
        sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
