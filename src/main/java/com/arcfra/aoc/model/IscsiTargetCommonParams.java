package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** IscsiTargetCommonParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetCommonParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CONFIGURATION_ADAPTIVE = "configuration_adaptive";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE)
    private Boolean configurationAdaptive;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
    private ConfigurationMethod configurationMethod;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD = "encrypt_method";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD)
    private EncryptMethod encryptMethod;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Double ecM;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Double ecK;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
    private Long bpsWrMaxLength;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_UNIT = "bps_wr_max_unit";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_UNIT)
    private BPSUnit bpsWrMaxUnit;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_SIZE = "bps_wr_max_size";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_SIZE)
    private BPSUnit bpsWrMaxSize;

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

    public static final String SERIALIZED_NAME_INITIATOR_CHAPS = "initiator_chaps";

    @SerializedName(SERIALIZED_NAME_INITIATOR_CHAPS)
    private List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps = null;

    public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";

    @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
    private String chapSecret;

    public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";

    @SerializedName(SERIALIZED_NAME_CHAP_NAME)
    private String chapName;

    public static final String SERIALIZED_NAME_CHAP_ENABLED = "chap_enabled";

    @SerializedName(SERIALIZED_NAME_CHAP_ENABLED)
    private Boolean chapEnabled;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_IQN_WHITELIST = "iqn_whitelist";

    @SerializedName(SERIALIZED_NAME_IQN_WHITELIST)
    private String iqnWhitelist;

    public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
    private String ipWhitelist;

    public IscsiTargetCommonParams() {}

    public IscsiTargetCommonParams configurationAdaptive(Boolean configurationAdaptive) {

        this.configurationAdaptive = configurationAdaptive;
        return this;
    }

    /**
     * Get configurationAdaptive
     *
     * @return configurationAdaptive
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getConfigurationAdaptive() {
        return configurationAdaptive;
    }

    public void setConfigurationAdaptive(Boolean configurationAdaptive) {
        this.configurationAdaptive = configurationAdaptive;
    }

    public IscsiTargetCommonParams configurationAdaptive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public IscsiTargetCommonParams configurationAdaptive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public void setConfigurationAdaptive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        }
    }

    public boolean getConfigurationAdaptive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
    }

    public IscsiTargetCommonParams configurationMethod(ConfigurationMethod configurationMethod) {

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

    public IscsiTargetCommonParams configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public IscsiTargetCommonParams configurationMethod_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams encryptMethod(EncryptMethod encryptMethod) {

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

    public IscsiTargetCommonParams encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public IscsiTargetCommonParams encryptMethod_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams prioritized(Boolean prioritized) {

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

    public IscsiTargetCommonParams prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public IscsiTargetCommonParams prioritized_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams ecM(Double ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEcM() {
        return ecM;
    }

    public void setEcM(Double ecM) {
        this.ecM = ecM;
    }

    public IscsiTargetCommonParams ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public IscsiTargetCommonParams ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public IscsiTargetCommonParams ecK(Double ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEcK() {
        return ecK;
    }

    public void setEcK(Double ecK) {
        this.ecK = ecK;
    }

    public IscsiTargetCommonParams ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public IscsiTargetCommonParams ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public IscsiTargetCommonParams resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public IscsiTargetCommonParams resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public IscsiTargetCommonParams resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public IscsiTargetCommonParams bpsWrMaxLength(Long bpsWrMaxLength) {

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

    public IscsiTargetCommonParams bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams bpsWrMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {

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

    public IscsiTargetCommonParams bpsWrMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsWrMaxUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsWrMaxSize(BPSUnit bpsWrMaxSize) {

        this.bpsWrMaxSize = bpsWrMaxSize;
        return this;
    }

    /**
     * Get bpsWrMaxSize
     *
     * @return bpsWrMaxSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getBpsWrMaxSize() {
        return bpsWrMaxSize;
    }

    public void setBpsWrMaxSize(BPSUnit bpsWrMaxSize) {
        this.bpsWrMaxSize = bpsWrMaxSize;
    }

    public IscsiTargetCommonParams bpsWrMaxSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_SIZE);
        return this;
    }

    public IscsiTargetCommonParams bpsWrMaxSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_SIZE);
        return this;
    }

    public void setBpsWrMaxSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_SIZE);
        }
    }

    public boolean getBpsWrMaxSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_SIZE);
    }

    public IscsiTargetCommonParams bpsWrMax(Long bpsWrMax) {

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

    public IscsiTargetCommonParams bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public IscsiTargetCommonParams bpsWrMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsRdMaxLength(Long bpsRdMaxLength) {

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

    public IscsiTargetCommonParams bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams bpsRdMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {

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

    public IscsiTargetCommonParams bpsRdMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsRdMaxUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsRdMax(Long bpsRdMax) {

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

    public IscsiTargetCommonParams bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public IscsiTargetCommonParams bpsRdMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsMaxLength(Long bpsMaxLength) {

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

    public IscsiTargetCommonParams bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams bpsMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsMaxUnit(BPSUnit bpsMaxUnit) {

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

    public IscsiTargetCommonParams bpsMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsMaxUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsMax(Long bpsMax) {

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

    public IscsiTargetCommonParams bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public IscsiTargetCommonParams bpsMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsWrMaxLength(Long iopsWrMaxLength) {

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

    public IscsiTargetCommonParams iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams iopsWrMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsWrMax(Long iopsWrMax) {

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

    public IscsiTargetCommonParams iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public IscsiTargetCommonParams iopsWrMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsRdMaxLength(Long iopsRdMaxLength) {

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

    public IscsiTargetCommonParams iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams iopsRdMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsRdMax(Long iopsRdMax) {

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

    public IscsiTargetCommonParams iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public IscsiTargetCommonParams iopsRdMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsMaxLength(Long iopsMaxLength) {

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

    public IscsiTargetCommonParams iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public IscsiTargetCommonParams iopsMaxLength_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsMax(Long iopsMax) {

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

    public IscsiTargetCommonParams iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public IscsiTargetCommonParams iopsMax_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsWrUnit(BPSUnit bpsWrUnit) {

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

    public IscsiTargetCommonParams bpsWrUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsWrUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsWr(Long bpsWr) {

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

    public IscsiTargetCommonParams bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public IscsiTargetCommonParams bpsWr_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsRdUnit(BPSUnit bpsRdUnit) {

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

    public IscsiTargetCommonParams bpsRdUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsRdUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsRd(Long bpsRd) {

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

    public IscsiTargetCommonParams bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public IscsiTargetCommonParams bpsRd_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bpsUnit(BPSUnit bpsUnit) {

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

    public IscsiTargetCommonParams bpsUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_UNIT);
        return this;
    }

    public IscsiTargetCommonParams bpsUnit_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams bps(Long bps) {

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

    public IscsiTargetCommonParams bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public IscsiTargetCommonParams bps_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsWr(Long iopsWr) {

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

    public IscsiTargetCommonParams iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public IscsiTargetCommonParams iopsWr_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iopsRd(Long iopsRd) {

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

    public IscsiTargetCommonParams iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public IscsiTargetCommonParams iopsRd_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams iops(Long iops) {

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

    public IscsiTargetCommonParams iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public IscsiTargetCommonParams iops_ExplictlyNonNull() {
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

    public IscsiTargetCommonParams initiatorChaps(
            List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps) {

        this.initiatorChaps = initiatorChaps;
        return this;
    }

    public IscsiTargetCommonParams addInitiatorChapsItem(
            IscsiTargetCommonParamsInitiatorChaps initiatorChapsItem) {
        if (this.initiatorChaps == null) {
            this.initiatorChaps = new ArrayList<IscsiTargetCommonParamsInitiatorChaps>();
        }
        this.initiatorChaps.add(initiatorChapsItem);
        return this;
    }

    /**
     * Get initiatorChaps
     *
     * @return initiatorChaps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IscsiTargetCommonParamsInitiatorChaps> getInitiatorChaps() {
        return initiatorChaps;
    }

    public void setInitiatorChaps(List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps) {
        this.initiatorChaps = initiatorChaps;
    }

    public IscsiTargetCommonParams initiatorChaps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_CHAPS);
        return this;
    }

    public IscsiTargetCommonParams initiatorChaps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_CHAPS);
        return this;
    }

    public void setInitiatorChaps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_CHAPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_CHAPS);
        }
    }

    public boolean getInitiatorChaps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_CHAPS);
    }

    public IscsiTargetCommonParams chapSecret(String chapSecret) {

        this.chapSecret = chapSecret;
        return this;
    }

    /**
     * Get chapSecret
     *
     * @return chapSecret
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapSecret() {
        return chapSecret;
    }

    public void setChapSecret(String chapSecret) {
        this.chapSecret = chapSecret;
    }

    public IscsiTargetCommonParams chapSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_SECRET);
        return this;
    }

    public IscsiTargetCommonParams chapSecret_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_SECRET);
        return this;
    }

    public void setChapSecret_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_SECRET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_SECRET);
        }
    }

    public boolean getChapSecret_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_SECRET);
    }

    public IscsiTargetCommonParams chapName(String chapName) {

        this.chapName = chapName;
        return this;
    }

    /**
     * Get chapName
     *
     * @return chapName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName;
    }

    public IscsiTargetCommonParams chapName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_NAME);
        return this;
    }

    public IscsiTargetCommonParams chapName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_NAME);
        return this;
    }

    public void setChapName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_NAME);
        }
    }

    public boolean getChapName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_NAME);
    }

    public IscsiTargetCommonParams chapEnabled(Boolean chapEnabled) {

        this.chapEnabled = chapEnabled;
        return this;
    }

    /**
     * Get chapEnabled
     *
     * @return chapEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChapEnabled() {
        return chapEnabled;
    }

    public void setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
    }

    public IscsiTargetCommonParams chapEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_ENABLED);
        return this;
    }

    public IscsiTargetCommonParams chapEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_ENABLED);
        return this;
    }

    public void setChapEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_ENABLED);
        }
    }

    public boolean getChapEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_ENABLED);
    }

    public IscsiTargetCommonParams description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IscsiTargetCommonParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public IscsiTargetCommonParams description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public IscsiTargetCommonParams iqnWhitelist(String iqnWhitelist) {

        this.iqnWhitelist = iqnWhitelist;
        return this;
    }

    /**
     * Get iqnWhitelist
     *
     * @return iqnWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIqnWhitelist() {
        return iqnWhitelist;
    }

    public void setIqnWhitelist(String iqnWhitelist) {
        this.iqnWhitelist = iqnWhitelist;
    }

    public IscsiTargetCommonParams iqnWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IQN_WHITELIST);
        return this;
    }

    public IscsiTargetCommonParams iqnWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IQN_WHITELIST);
        return this;
    }

    public void setIqnWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IQN_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IQN_WHITELIST);
        }
    }

    public boolean getIqnWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IQN_WHITELIST);
    }

    public IscsiTargetCommonParams ipWhitelist(String ipWhitelist) {

        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * Get ipWhitelist
     *
     * @return ipWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public IscsiTargetCommonParams ipWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public IscsiTargetCommonParams ipWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public void setIpWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        }
    }

    public boolean getIpWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiTargetCommonParams iscsiTargetCommonParams = (IscsiTargetCommonParams) o;
        return Objects.equals(
                        this.configurationAdaptive, iscsiTargetCommonParams.configurationAdaptive)
                && Objects.equals(
                        this.configurationMethod, iscsiTargetCommonParams.configurationMethod)
                && Objects.equals(this.encryptMethod, iscsiTargetCommonParams.encryptMethod)
                && Objects.equals(this.prioritized, iscsiTargetCommonParams.prioritized)
                && Objects.equals(this.ecM, iscsiTargetCommonParams.ecM)
                && Objects.equals(this.ecK, iscsiTargetCommonParams.ecK)
                && Objects.equals(this.resiliencyType, iscsiTargetCommonParams.resiliencyType)
                && Objects.equals(this.bpsWrMaxLength, iscsiTargetCommonParams.bpsWrMaxLength)
                && Objects.equals(this.bpsWrMaxUnit, iscsiTargetCommonParams.bpsWrMaxUnit)
                && Objects.equals(this.bpsWrMaxSize, iscsiTargetCommonParams.bpsWrMaxSize)
                && Objects.equals(this.bpsWrMax, iscsiTargetCommonParams.bpsWrMax)
                && Objects.equals(this.bpsRdMaxLength, iscsiTargetCommonParams.bpsRdMaxLength)
                && Objects.equals(this.bpsRdMaxUnit, iscsiTargetCommonParams.bpsRdMaxUnit)
                && Objects.equals(this.bpsRdMax, iscsiTargetCommonParams.bpsRdMax)
                && Objects.equals(this.bpsMaxLength, iscsiTargetCommonParams.bpsMaxLength)
                && Objects.equals(this.bpsMaxUnit, iscsiTargetCommonParams.bpsMaxUnit)
                && Objects.equals(this.bpsMax, iscsiTargetCommonParams.bpsMax)
                && Objects.equals(this.iopsWrMaxLength, iscsiTargetCommonParams.iopsWrMaxLength)
                && Objects.equals(this.iopsWrMax, iscsiTargetCommonParams.iopsWrMax)
                && Objects.equals(this.iopsRdMaxLength, iscsiTargetCommonParams.iopsRdMaxLength)
                && Objects.equals(this.iopsRdMax, iscsiTargetCommonParams.iopsRdMax)
                && Objects.equals(this.iopsMaxLength, iscsiTargetCommonParams.iopsMaxLength)
                && Objects.equals(this.iopsMax, iscsiTargetCommonParams.iopsMax)
                && Objects.equals(this.bpsWrUnit, iscsiTargetCommonParams.bpsWrUnit)
                && Objects.equals(this.bpsWr, iscsiTargetCommonParams.bpsWr)
                && Objects.equals(this.bpsRdUnit, iscsiTargetCommonParams.bpsRdUnit)
                && Objects.equals(this.bpsRd, iscsiTargetCommonParams.bpsRd)
                && Objects.equals(this.bpsUnit, iscsiTargetCommonParams.bpsUnit)
                && Objects.equals(this.bps, iscsiTargetCommonParams.bps)
                && Objects.equals(this.iopsWr, iscsiTargetCommonParams.iopsWr)
                && Objects.equals(this.iopsRd, iscsiTargetCommonParams.iopsRd)
                && Objects.equals(this.iops, iscsiTargetCommonParams.iops)
                && Objects.equals(this.initiatorChaps, iscsiTargetCommonParams.initiatorChaps)
                && Objects.equals(this.chapSecret, iscsiTargetCommonParams.chapSecret)
                && Objects.equals(this.chapName, iscsiTargetCommonParams.chapName)
                && Objects.equals(this.chapEnabled, iscsiTargetCommonParams.chapEnabled)
                && Objects.equals(this.description, iscsiTargetCommonParams.description)
                && Objects.equals(this.iqnWhitelist, iscsiTargetCommonParams.iqnWhitelist)
                && Objects.equals(this.ipWhitelist, iscsiTargetCommonParams.ipWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configurationAdaptive,
                configurationMethod,
                encryptMethod,
                prioritized,
                ecM,
                ecK,
                resiliencyType,
                bpsWrMaxLength,
                bpsWrMaxUnit,
                bpsWrMaxSize,
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
                initiatorChaps,
                chapSecret,
                chapName,
                chapEnabled,
                description,
                iqnWhitelist,
                ipWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiTargetCommonParams {\n");
        sb.append("    configurationAdaptive: ")
                .append(toIndentedString(configurationAdaptive))
                .append("\n");
        sb.append("    configurationMethod: ")
                .append(toIndentedString(configurationMethod))
                .append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
        sb.append("    bpsWrMaxUnit: ").append(toIndentedString(bpsWrMaxUnit)).append("\n");
        sb.append("    bpsWrMaxSize: ").append(toIndentedString(bpsWrMaxSize)).append("\n");
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
        sb.append("    initiatorChaps: ").append(toIndentedString(initiatorChaps)).append("\n");
        sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
        sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
        sb.append("    chapEnabled: ").append(toIndentedString(chapEnabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iqnWhitelist: ").append(toIndentedString(iqnWhitelist)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
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
