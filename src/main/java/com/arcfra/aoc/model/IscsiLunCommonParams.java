package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunCommonParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunCommonParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT =
            "business_host_is_same_with_parent";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT)
    private Boolean businessHostIsSameWithParent;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
    private ConfigurationMethod configurationMethod;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD = "encrypt_method";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD)
    private EncryptMethod encryptMethod;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
    private Long bpsWrMaxLength;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_UNIT = "bps_wr_max_unit";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_UNIT)
    private BPSUnit bpsWrMaxUnit;

    public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
    private Long bpsWrMax;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
    private Long bpsRdMaxLength;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_UNIT = "bps_rd_max_unit";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_UNIT)
    private BPSUnit bpsRdMaxUnit;

    public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
    private Long bpsRdMax;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
    private Long bpsMaxLength;

    public static final String SERIALIZED_NAME_BPS_MAX_UNIT = "bps_max_unit";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_UNIT)
    private BPSUnit bpsMaxUnit;

    public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";

    @SerializedName(SERIALIZED_NAME_BPS_MAX)
    private Long bpsMax;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
    private Long iopsWrMaxLength;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
    private Long iopsWrMax;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
    private Long iopsRdMaxLength;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
    private Long iopsRdMax;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
    private Long iopsMaxLength;

    public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX)
    private Long iopsMax;

    public static final String SERIALIZED_NAME_BPS_WR_UNIT = "bps_wr_unit";

    @SerializedName(SERIALIZED_NAME_BPS_WR_UNIT)
    private BPSUnit bpsWrUnit;

    public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";

    @SerializedName(SERIALIZED_NAME_BPS_WR)
    private Long bpsWr;

    public static final String SERIALIZED_NAME_BPS_RD_UNIT = "bps_rd_unit";

    @SerializedName(SERIALIZED_NAME_BPS_RD_UNIT)
    private BPSUnit bpsRdUnit;

    public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";

    @SerializedName(SERIALIZED_NAME_BPS_RD)
    private Long bpsRd;

    public static final String SERIALIZED_NAME_BPS_UNIT = "bps_unit";

    @SerializedName(SERIALIZED_NAME_BPS_UNIT)
    private BPSUnit bpsUnit;

    public static final String SERIALIZED_NAME_BPS = "bps";

    @SerializedName(SERIALIZED_NAME_BPS)
    private Long bps;

    public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";

    @SerializedName(SERIALIZED_NAME_IOPS_WR)
    private Long iopsWr;

    public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";

    @SerializedName(SERIALIZED_NAME_IOPS_RD)
    private Long iopsRd;

    public static final String SERIALIZED_NAME_IOPS = "iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Long iops;

    public static final String SERIALIZED_NAME_ALLOWED_INITIATORS = "allowed_initiators";

    @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS)
    private String allowedInitiators;

    public IscsiLunCommonParams() {}

    public IscsiLunCommonParams businessHostIsSameWithParent(Boolean businessHostIsSameWithParent) {

        this.businessHostIsSameWithParent = businessHostIsSameWithParent;
        return this;
    }

    /**
     * Get businessHostIsSameWithParent
     *
     * @return businessHostIsSameWithParent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getBusinessHostIsSameWithParent() {
        return businessHostIsSameWithParent;
    }

    public void setBusinessHostIsSameWithParent(Boolean businessHostIsSameWithParent) {
        this.businessHostIsSameWithParent = businessHostIsSameWithParent;
    }

    public IscsiLunCommonParams businessHostIsSameWithParent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        return this;
    }

    public IscsiLunCommonParams businessHostIsSameWithParent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        return this;
    }

    public void setBusinessHostIsSameWithParent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        }
    }

    public boolean getBusinessHostIsSameWithParent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
    }

    public IscsiLunCommonParams configurationMethod(ConfigurationMethod configurationMethod) {

        this.configurationMethod = configurationMethod;
        return this;
    }

    /**
     * Get configurationMethod
     *
     * @return configurationMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConfigurationMethod getConfigurationMethod() {
        return configurationMethod;
    }

    public void setConfigurationMethod(ConfigurationMethod configurationMethod) {
        this.configurationMethod = configurationMethod;
    }

    public IscsiLunCommonParams configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public IscsiLunCommonParams configurationMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public void setConfigurationMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        }
    }

    public boolean getConfigurationMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD);
    }

    public IscsiLunCommonParams encryptMethod(EncryptMethod encryptMethod) {

        this.encryptMethod = encryptMethod;
        return this;
    }

    /**
     * Get encryptMethod
     *
     * @return encryptMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EncryptMethod getEncryptMethod() {
        return encryptMethod;
    }

    public void setEncryptMethod(EncryptMethod encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    public IscsiLunCommonParams encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public IscsiLunCommonParams encryptMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public void setEncryptMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        }
    }

    public boolean getEncryptMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD);
    }

    public IscsiLunCommonParams prioritized(Boolean prioritized) {

        this.prioritized = prioritized;
        return this;
    }

    /**
     * Get prioritized
     *
     * @return prioritized
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(Boolean prioritized) {
        this.prioritized = prioritized;
    }

    public IscsiLunCommonParams prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public IscsiLunCommonParams prioritized_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public void setPrioritized_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        }
    }

    public boolean getPrioritized_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIORITIZED);
    }

    public IscsiLunCommonParams bpsWrMaxLength(Long bpsWrMaxLength) {

        this.bpsWrMaxLength = bpsWrMaxLength;
        return this;
    }

    /**
     * Get bpsWrMaxLength
     *
     * @return bpsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLength() {
        return bpsWrMaxLength;
    }

    public void setBpsWrMaxLength(Long bpsWrMaxLength) {
        this.bpsWrMaxLength = bpsWrMaxLength;
    }

    public IscsiLunCommonParams bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams bpsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public void setBpsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        }
    }

    public boolean getBpsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
    }

    public IscsiLunCommonParams bpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {

        this.bpsWrMaxUnit = bpsWrMaxUnit;
        return this;
    }

    /**
     * Get bpsWrMaxUnit
     *
     * @return bpsWrMaxUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsWrMaxUnit() {
        return bpsWrMaxUnit;
    }

    public void setBpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {
        this.bpsWrMaxUnit = bpsWrMaxUnit;
    }

    public IscsiLunCommonParams bpsWrMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsWrMaxUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        return this;
    }

    public void setBpsWrMaxUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        }
    }

    public boolean getBpsWrMaxUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
    }

    public IscsiLunCommonParams bpsWrMax(Long bpsWrMax) {

        this.bpsWrMax = bpsWrMax;
        return this;
    }

    /**
     * Get bpsWrMax
     *
     * @return bpsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMax() {
        return bpsWrMax;
    }

    public void setBpsWrMax(Long bpsWrMax) {
        this.bpsWrMax = bpsWrMax;
    }

    public IscsiLunCommonParams bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public IscsiLunCommonParams bpsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public void setBpsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        }
    }

    public boolean getBpsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX);
    }

    public IscsiLunCommonParams bpsRdMaxLength(Long bpsRdMaxLength) {

        this.bpsRdMaxLength = bpsRdMaxLength;
        return this;
    }

    /**
     * Get bpsRdMaxLength
     *
     * @return bpsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLength() {
        return bpsRdMaxLength;
    }

    public void setBpsRdMaxLength(Long bpsRdMaxLength) {
        this.bpsRdMaxLength = bpsRdMaxLength;
    }

    public IscsiLunCommonParams bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams bpsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public void setBpsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        }
    }

    public boolean getBpsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
    }

    public IscsiLunCommonParams bpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {

        this.bpsRdMaxUnit = bpsRdMaxUnit;
        return this;
    }

    /**
     * Get bpsRdMaxUnit
     *
     * @return bpsRdMaxUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsRdMaxUnit() {
        return bpsRdMaxUnit;
    }

    public void setBpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {
        this.bpsRdMaxUnit = bpsRdMaxUnit;
    }

    public IscsiLunCommonParams bpsRdMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsRdMaxUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        return this;
    }

    public void setBpsRdMaxUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        }
    }

    public boolean getBpsRdMaxUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
    }

    public IscsiLunCommonParams bpsRdMax(Long bpsRdMax) {

        this.bpsRdMax = bpsRdMax;
        return this;
    }

    /**
     * Get bpsRdMax
     *
     * @return bpsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMax() {
        return bpsRdMax;
    }

    public void setBpsRdMax(Long bpsRdMax) {
        this.bpsRdMax = bpsRdMax;
    }

    public IscsiLunCommonParams bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public IscsiLunCommonParams bpsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public void setBpsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        }
    }

    public boolean getBpsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX);
    }

    public IscsiLunCommonParams bpsMaxLength(Long bpsMaxLength) {

        this.bpsMaxLength = bpsMaxLength;
        return this;
    }

    /**
     * Get bpsMaxLength
     *
     * @return bpsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLength() {
        return bpsMaxLength;
    }

    public void setBpsMaxLength(Long bpsMaxLength) {
        this.bpsMaxLength = bpsMaxLength;
    }

    public IscsiLunCommonParams bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams bpsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public void setBpsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        }
    }

    public boolean getBpsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH);
    }

    public IscsiLunCommonParams bpsMaxUnit(BPSUnit bpsMaxUnit) {

        this.bpsMaxUnit = bpsMaxUnit;
        return this;
    }

    /**
     * Get bpsMaxUnit
     *
     * @return bpsMaxUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsMaxUnit() {
        return bpsMaxUnit;
    }

    public void setBpsMaxUnit(BPSUnit bpsMaxUnit) {
        this.bpsMaxUnit = bpsMaxUnit;
    }

    public IscsiLunCommonParams bpsMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsMaxUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_UNIT);
        return this;
    }

    public void setBpsMaxUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_UNIT);
        }
    }

    public boolean getBpsMaxUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_UNIT);
    }

    public IscsiLunCommonParams bpsMax(Long bpsMax) {

        this.bpsMax = bpsMax;
        return this;
    }

    /**
     * Get bpsMax
     *
     * @return bpsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMax() {
        return bpsMax;
    }

    public void setBpsMax(Long bpsMax) {
        this.bpsMax = bpsMax;
    }

    public IscsiLunCommonParams bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public IscsiLunCommonParams bpsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public void setBpsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        }
    }

    public boolean getBpsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX);
    }

    public IscsiLunCommonParams iopsWrMaxLength(Long iopsWrMaxLength) {

        this.iopsWrMaxLength = iopsWrMaxLength;
        return this;
    }

    /**
     * Get iopsWrMaxLength
     *
     * @return iopsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLength() {
        return iopsWrMaxLength;
    }

    public void setIopsWrMaxLength(Long iopsWrMaxLength) {
        this.iopsWrMaxLength = iopsWrMaxLength;
    }

    public IscsiLunCommonParams iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams iopsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public void setIopsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        }
    }

    public boolean getIopsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
    }

    public IscsiLunCommonParams iopsWrMax(Long iopsWrMax) {

        this.iopsWrMax = iopsWrMax;
        return this;
    }

    /**
     * Get iopsWrMax
     *
     * @return iopsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMax() {
        return iopsWrMax;
    }

    public void setIopsWrMax(Long iopsWrMax) {
        this.iopsWrMax = iopsWrMax;
    }

    public IscsiLunCommonParams iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public IscsiLunCommonParams iopsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public void setIopsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        }
    }

    public boolean getIopsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX);
    }

    public IscsiLunCommonParams iopsRdMaxLength(Long iopsRdMaxLength) {

        this.iopsRdMaxLength = iopsRdMaxLength;
        return this;
    }

    /**
     * Get iopsRdMaxLength
     *
     * @return iopsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLength() {
        return iopsRdMaxLength;
    }

    public void setIopsRdMaxLength(Long iopsRdMaxLength) {
        this.iopsRdMaxLength = iopsRdMaxLength;
    }

    public IscsiLunCommonParams iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams iopsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public void setIopsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        }
    }

    public boolean getIopsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
    }

    public IscsiLunCommonParams iopsRdMax(Long iopsRdMax) {

        this.iopsRdMax = iopsRdMax;
        return this;
    }

    /**
     * Get iopsRdMax
     *
     * @return iopsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMax() {
        return iopsRdMax;
    }

    public void setIopsRdMax(Long iopsRdMax) {
        this.iopsRdMax = iopsRdMax;
    }

    public IscsiLunCommonParams iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public IscsiLunCommonParams iopsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public void setIopsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        }
    }

    public boolean getIopsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX);
    }

    public IscsiLunCommonParams iopsMaxLength(Long iopsMaxLength) {

        this.iopsMaxLength = iopsMaxLength;
        return this;
    }

    /**
     * Get iopsMaxLength
     *
     * @return iopsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLength() {
        return iopsMaxLength;
    }

    public void setIopsMaxLength(Long iopsMaxLength) {
        this.iopsMaxLength = iopsMaxLength;
    }

    public IscsiLunCommonParams iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public IscsiLunCommonParams iopsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public void setIopsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        }
    }

    public boolean getIopsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH);
    }

    public IscsiLunCommonParams iopsMax(Long iopsMax) {

        this.iopsMax = iopsMax;
        return this;
    }

    /**
     * Get iopsMax
     *
     * @return iopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMax() {
        return iopsMax;
    }

    public void setIopsMax(Long iopsMax) {
        this.iopsMax = iopsMax;
    }

    public IscsiLunCommonParams iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public IscsiLunCommonParams iopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public void setIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        }
    }

    public boolean getIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX);
    }

    public IscsiLunCommonParams bpsWrUnit(BPSUnit bpsWrUnit) {

        this.bpsWrUnit = bpsWrUnit;
        return this;
    }

    /**
     * Get bpsWrUnit
     *
     * @return bpsWrUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsWrUnit() {
        return bpsWrUnit;
    }

    public void setBpsWrUnit(BPSUnit bpsWrUnit) {
        this.bpsWrUnit = bpsWrUnit;
    }

    public IscsiLunCommonParams bpsWrUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsWrUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_UNIT);
        return this;
    }

    public void setBpsWrUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_UNIT);
        }
    }

    public boolean getBpsWrUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_UNIT);
    }

    public IscsiLunCommonParams bpsWr(Long bpsWr) {

        this.bpsWr = bpsWr;
        return this;
    }

    /**
     * Get bpsWr
     *
     * @return bpsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWr() {
        return bpsWr;
    }

    public void setBpsWr(Long bpsWr) {
        this.bpsWr = bpsWr;
    }

    public IscsiLunCommonParams bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public IscsiLunCommonParams bpsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public void setBpsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        }
    }

    public boolean getBpsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR);
    }

    public IscsiLunCommonParams bpsRdUnit(BPSUnit bpsRdUnit) {

        this.bpsRdUnit = bpsRdUnit;
        return this;
    }

    /**
     * Get bpsRdUnit
     *
     * @return bpsRdUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsRdUnit() {
        return bpsRdUnit;
    }

    public void setBpsRdUnit(BPSUnit bpsRdUnit) {
        this.bpsRdUnit = bpsRdUnit;
    }

    public IscsiLunCommonParams bpsRdUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsRdUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_UNIT);
        return this;
    }

    public void setBpsRdUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_UNIT);
        }
    }

    public boolean getBpsRdUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_UNIT);
    }

    public IscsiLunCommonParams bpsRd(Long bpsRd) {

        this.bpsRd = bpsRd;
        return this;
    }

    /**
     * Get bpsRd
     *
     * @return bpsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRd() {
        return bpsRd;
    }

    public void setBpsRd(Long bpsRd) {
        this.bpsRd = bpsRd;
    }

    public IscsiLunCommonParams bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public IscsiLunCommonParams bpsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public void setBpsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        }
    }

    public boolean getBpsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD);
    }

    public IscsiLunCommonParams bpsUnit(BPSUnit bpsUnit) {

        this.bpsUnit = bpsUnit;
        return this;
    }

    /**
     * Get bpsUnit
     *
     * @return bpsUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsUnit() {
        return bpsUnit;
    }

    public void setBpsUnit(BPSUnit bpsUnit) {
        this.bpsUnit = bpsUnit;
    }

    public IscsiLunCommonParams bpsUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_UNIT);
        return this;
    }

    public IscsiLunCommonParams bpsUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_UNIT);
        return this;
    }

    public void setBpsUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_UNIT);
        }
    }

    public boolean getBpsUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_UNIT);
    }

    public IscsiLunCommonParams bps(Long bps) {

        this.bps = bps;
        return this;
    }

    /**
     * Get bps
     *
     * @return bps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBps() {
        return bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public IscsiLunCommonParams bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public IscsiLunCommonParams bps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS);
        return this;
    }

    public void setBps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS);
        }
    }

    public boolean getBps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS);
    }

    public IscsiLunCommonParams iopsWr(Long iopsWr) {

        this.iopsWr = iopsWr;
        return this;
    }

    /**
     * Get iopsWr
     *
     * @return iopsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWr() {
        return iopsWr;
    }

    public void setIopsWr(Long iopsWr) {
        this.iopsWr = iopsWr;
    }

    public IscsiLunCommonParams iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public IscsiLunCommonParams iopsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public void setIopsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        }
    }

    public boolean getIopsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR);
    }

    public IscsiLunCommonParams iopsRd(Long iopsRd) {

        this.iopsRd = iopsRd;
        return this;
    }

    /**
     * Get iopsRd
     *
     * @return iopsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRd() {
        return iopsRd;
    }

    public void setIopsRd(Long iopsRd) {
        this.iopsRd = iopsRd;
    }

    public IscsiLunCommonParams iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public IscsiLunCommonParams iopsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public void setIopsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        }
    }

    public boolean getIopsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD);
    }

    public IscsiLunCommonParams iops(Long iops) {

        this.iops = iops;
        return this;
    }

    /**
     * Get iops
     *
     * @return iops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIops() {
        return iops;
    }

    public void setIops(Long iops) {
        this.iops = iops;
    }

    public IscsiLunCommonParams iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public IscsiLunCommonParams iops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        return this;
    }

    public void setIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        }
    }

    public boolean getIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS);
    }

    public IscsiLunCommonParams allowedInitiators(String allowedInitiators) {

        this.allowedInitiators = allowedInitiators;
        return this;
    }

    /**
     * Get allowedInitiators
     *
     * @return allowedInitiators
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAllowedInitiators() {
        return allowedInitiators;
    }

    public void setAllowedInitiators(String allowedInitiators) {
        this.allowedInitiators = allowedInitiators;
    }

    public IscsiLunCommonParams allowedInitiators_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOWED_INITIATORS);
        return this;
    }

    public IscsiLunCommonParams allowedInitiators_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOWED_INITIATORS);
        return this;
    }

    public void setAllowedInitiators_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOWED_INITIATORS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOWED_INITIATORS);
        }
    }

    public boolean getAllowedInitiators_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOWED_INITIATORS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunCommonParams iscsiLunCommonParams = (IscsiLunCommonParams) o;
        return Objects.equals(
                        this.businessHostIsSameWithParent,
                        iscsiLunCommonParams.businessHostIsSameWithParent)
                && Objects.equals(
                        this.configurationMethod, iscsiLunCommonParams.configurationMethod)
                && Objects.equals(this.encryptMethod, iscsiLunCommonParams.encryptMethod)
                && Objects.equals(this.prioritized, iscsiLunCommonParams.prioritized)
                && Objects.equals(this.bpsWrMaxLength, iscsiLunCommonParams.bpsWrMaxLength)
                && Objects.equals(this.bpsWrMaxUnit, iscsiLunCommonParams.bpsWrMaxUnit)
                && Objects.equals(this.bpsWrMax, iscsiLunCommonParams.bpsWrMax)
                && Objects.equals(this.bpsRdMaxLength, iscsiLunCommonParams.bpsRdMaxLength)
                && Objects.equals(this.bpsRdMaxUnit, iscsiLunCommonParams.bpsRdMaxUnit)
                && Objects.equals(this.bpsRdMax, iscsiLunCommonParams.bpsRdMax)
                && Objects.equals(this.bpsMaxLength, iscsiLunCommonParams.bpsMaxLength)
                && Objects.equals(this.bpsMaxUnit, iscsiLunCommonParams.bpsMaxUnit)
                && Objects.equals(this.bpsMax, iscsiLunCommonParams.bpsMax)
                && Objects.equals(this.iopsWrMaxLength, iscsiLunCommonParams.iopsWrMaxLength)
                && Objects.equals(this.iopsWrMax, iscsiLunCommonParams.iopsWrMax)
                && Objects.equals(this.iopsRdMaxLength, iscsiLunCommonParams.iopsRdMaxLength)
                && Objects.equals(this.iopsRdMax, iscsiLunCommonParams.iopsRdMax)
                && Objects.equals(this.iopsMaxLength, iscsiLunCommonParams.iopsMaxLength)
                && Objects.equals(this.iopsMax, iscsiLunCommonParams.iopsMax)
                && Objects.equals(this.bpsWrUnit, iscsiLunCommonParams.bpsWrUnit)
                && Objects.equals(this.bpsWr, iscsiLunCommonParams.bpsWr)
                && Objects.equals(this.bpsRdUnit, iscsiLunCommonParams.bpsRdUnit)
                && Objects.equals(this.bpsRd, iscsiLunCommonParams.bpsRd)
                && Objects.equals(this.bpsUnit, iscsiLunCommonParams.bpsUnit)
                && Objects.equals(this.bps, iscsiLunCommonParams.bps)
                && Objects.equals(this.iopsWr, iscsiLunCommonParams.iopsWr)
                && Objects.equals(this.iopsRd, iscsiLunCommonParams.iopsRd)
                && Objects.equals(this.iops, iscsiLunCommonParams.iops)
                && Objects.equals(this.allowedInitiators, iscsiLunCommonParams.allowedInitiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                businessHostIsSameWithParent,
                configurationMethod,
                encryptMethod,
                prioritized,
                bpsWrMaxLength,
                bpsWrMaxUnit,
                bpsWrMax,
                bpsRdMaxLength,
                bpsRdMaxUnit,
                bpsRdMax,
                bpsMaxLength,
                bpsMaxUnit,
                bpsMax,
                iopsWrMaxLength,
                iopsWrMax,
                iopsRdMaxLength,
                iopsRdMax,
                iopsMaxLength,
                iopsMax,
                bpsWrUnit,
                bpsWr,
                bpsRdUnit,
                bpsRd,
                bpsUnit,
                bps,
                iopsWr,
                iopsRd,
                iops,
                allowedInitiators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunCommonParams {\n");
        sb.append("    businessHostIsSameWithParent: ")
                .append(toIndentedString(businessHostIsSameWithParent))
                .append("\n");
        sb.append("    configurationMethod: ")
                .append(toIndentedString(configurationMethod))
                .append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
        sb.append("    bpsWrMaxUnit: ").append(toIndentedString(bpsWrMaxUnit)).append("\n");
        sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
        sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
        sb.append("    bpsRdMaxUnit: ").append(toIndentedString(bpsRdMaxUnit)).append("\n");
        sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
        sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
        sb.append("    bpsMaxUnit: ").append(toIndentedString(bpsMaxUnit)).append("\n");
        sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
        sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
        sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
        sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
        sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
        sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
        sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
        sb.append("    bpsWrUnit: ").append(toIndentedString(bpsWrUnit)).append("\n");
        sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
        sb.append("    bpsRdUnit: ").append(toIndentedString(bpsRdUnit)).append("\n");
        sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
        sb.append("    bpsUnit: ").append(toIndentedString(bpsUnit)).append("\n");
        sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
        sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
        sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    allowedInitiators: ")
                .append(toIndentedString(allowedInitiators))
                .append("\n");
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
