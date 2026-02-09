package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfNamespaceUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_UNIT = "assigned_size_unit";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT)
    private ByteUnit assignedSizeUnit;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
    private Long assignedSize;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUPS = "business_host_groups";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUPS)
    private BusinessHostGroupWhereInput businessHostGroups;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS = "business_hosts";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS)
    private BusinessHostWhereInput businessHosts;

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

    public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
    private String nqnWhitelist;

    public NvmfNamespaceUpdationParamsData() {}

    public NvmfNamespaceUpdationParamsData replicaNum(Integer replicaNum) {

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

    public NvmfNamespaceUpdationParamsData replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfNamespaceUpdationParamsData replicaNum_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData thinProvision(Boolean thinProvision) {

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

    public NvmfNamespaceUpdationParamsData thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NvmfNamespaceUpdationParamsData thinProvision_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData assignedSizeUnit(ByteUnit assignedSizeUnit) {

        this.assignedSizeUnit = assignedSizeUnit;
        return this;
    }

    /**
     * Get assignedSizeUnit
     *
     * @return assignedSizeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getAssignedSizeUnit() {
        return assignedSizeUnit;
    }

    public void setAssignedSizeUnit(ByteUnit assignedSizeUnit) {
        this.assignedSizeUnit = assignedSizeUnit;
    }

    public NvmfNamespaceUpdationParamsData assignedSizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData assignedSizeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        return this;
    }

    public void setAssignedSizeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        }
    }

    public boolean getAssignedSizeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
    }

    public NvmfNamespaceUpdationParamsData assignedSize(Long assignedSize) {

        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * Get assignedSize
     *
     * @return assignedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Long assignedSize) {
        this.assignedSize = assignedSize;
    }

    public NvmfNamespaceUpdationParamsData assignedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public NvmfNamespaceUpdationParamsData assignedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public void setAssignedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        }
    }

    public boolean getAssignedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE);
    }

    public NvmfNamespaceUpdationParamsData name(String name) {

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

    public NvmfNamespaceUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceUpdationParamsData name_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData businessHostGroups(
            BusinessHostGroupWhereInput businessHostGroups) {

        this.businessHostGroups = businessHostGroups;
        return this;
    }

    /**
     * Get businessHostGroups
     *
     * @return businessHostGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostGroupWhereInput getBusinessHostGroups() {
        return businessHostGroups;
    }

    public void setBusinessHostGroups(BusinessHostGroupWhereInput businessHostGroups) {
        this.businessHostGroups = businessHostGroups;
    }

    public NvmfNamespaceUpdationParamsData businessHostGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        return this;
    }

    public NvmfNamespaceUpdationParamsData businessHostGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        return this;
    }

    public void setBusinessHostGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        }
    }

    public boolean getBusinessHostGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
    }

    public NvmfNamespaceUpdationParamsData businessHosts(BusinessHostWhereInput businessHosts) {

        this.businessHosts = businessHosts;
        return this;
    }

    /**
     * Get businessHosts
     *
     * @return businessHosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostWhereInput getBusinessHosts() {
        return businessHosts;
    }

    public void setBusinessHosts(BusinessHostWhereInput businessHosts) {
        this.businessHosts = businessHosts;
    }

    public NvmfNamespaceUpdationParamsData businessHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public NvmfNamespaceUpdationParamsData businessHosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public void setBusinessHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        }
    }

    public boolean getBusinessHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS);
    }

    public NvmfNamespaceUpdationParamsData businessHostIsSameWithParent(
            Boolean businessHostIsSameWithParent) {

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

    public NvmfNamespaceUpdationParamsData businessHostIsSameWithParent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData businessHostIsSameWithParent_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData configurationMethod(
            ConfigurationMethod configurationMethod) {

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

    public NvmfNamespaceUpdationParamsData configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public NvmfNamespaceUpdationParamsData configurationMethod_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData encryptMethod(EncryptMethod encryptMethod) {

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

    public NvmfNamespaceUpdationParamsData encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NvmfNamespaceUpdationParamsData encryptMethod_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData prioritized(Boolean prioritized) {

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

    public NvmfNamespaceUpdationParamsData prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NvmfNamespaceUpdationParamsData prioritized_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsWrMaxLength(Long bpsWrMaxLength) {

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

    public NvmfNamespaceUpdationParamsData bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsWrMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsWrMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsWrMaxUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsWrMax(Long bpsWrMax) {

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

    public NvmfNamespaceUpdationParamsData bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsWrMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsRdMaxLength(Long bpsRdMaxLength) {

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

    public NvmfNamespaceUpdationParamsData bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsRdMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsRdMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsRdMaxUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsRdMax(Long bpsRdMax) {

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

    public NvmfNamespaceUpdationParamsData bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsRdMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsMaxLength(Long bpsMaxLength) {

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

    public NvmfNamespaceUpdationParamsData bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsMaxUnit(BPSUnit bpsMaxUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsMaxUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsMaxUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsMax(Long bpsMax) {

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

    public NvmfNamespaceUpdationParamsData bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsWrMaxLength(Long iopsWrMaxLength) {

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

    public NvmfNamespaceUpdationParamsData iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsWrMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsWrMax(Long iopsWrMax) {

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

    public NvmfNamespaceUpdationParamsData iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsWrMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsRdMaxLength(Long iopsRdMaxLength) {

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

    public NvmfNamespaceUpdationParamsData iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsRdMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsRdMax(Long iopsRdMax) {

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

    public NvmfNamespaceUpdationParamsData iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsRdMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsMaxLength(Long iopsMaxLength) {

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

    public NvmfNamespaceUpdationParamsData iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsMax(Long iopsMax) {

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

    public NvmfNamespaceUpdationParamsData iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsMax_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsWrUnit(BPSUnit bpsWrUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsWrUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsWrUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsWr(Long bpsWr) {

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

    public NvmfNamespaceUpdationParamsData bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsWr_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsRdUnit(BPSUnit bpsRdUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsRdUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsRdUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsRd(Long bpsRd) {

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

    public NvmfNamespaceUpdationParamsData bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsRd_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bpsUnit(BPSUnit bpsUnit) {

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

    public NvmfNamespaceUpdationParamsData bpsUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_UNIT);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bpsUnit_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData bps(Long bps) {

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

    public NvmfNamespaceUpdationParamsData bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public NvmfNamespaceUpdationParamsData bps_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsWr(Long iopsWr) {

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

    public NvmfNamespaceUpdationParamsData iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsWr_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iopsRd(Long iopsRd) {

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

    public NvmfNamespaceUpdationParamsData iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iopsRd_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData iops(Long iops) {

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

    public NvmfNamespaceUpdationParamsData iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public NvmfNamespaceUpdationParamsData iops_ExplictlyNonNull() {
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

    public NvmfNamespaceUpdationParamsData nqnWhitelist(String nqnWhitelist) {

        this.nqnWhitelist = nqnWhitelist;
        return this;
    }

    /**
     * Get nqnWhitelist
     *
     * @return nqnWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelist() {
        return nqnWhitelist;
    }

    public void setNqnWhitelist(String nqnWhitelist) {
        this.nqnWhitelist = nqnWhitelist;
    }

    public NvmfNamespaceUpdationParamsData nqnWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public NvmfNamespaceUpdationParamsData nqnWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public void setNqnWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        }
    }

    public boolean getNqnWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespaceUpdationParamsData nvmfNamespaceUpdationParamsData =
                (NvmfNamespaceUpdationParamsData) o;
        return Objects.equals(this.replicaNum, nvmfNamespaceUpdationParamsData.replicaNum)
                && Objects.equals(this.thinProvision, nvmfNamespaceUpdationParamsData.thinProvision)
                && Objects.equals(
                        this.assignedSizeUnit, nvmfNamespaceUpdationParamsData.assignedSizeUnit)
                && Objects.equals(this.assignedSize, nvmfNamespaceUpdationParamsData.assignedSize)
                && Objects.equals(this.name, nvmfNamespaceUpdationParamsData.name)
                && Objects.equals(
                        this.businessHostGroups, nvmfNamespaceUpdationParamsData.businessHostGroups)
                && Objects.equals(this.businessHosts, nvmfNamespaceUpdationParamsData.businessHosts)
                && Objects.equals(
                        this.businessHostIsSameWithParent,
                        nvmfNamespaceUpdationParamsData.businessHostIsSameWithParent)
                && Objects.equals(
                        this.configurationMethod,
                        nvmfNamespaceUpdationParamsData.configurationMethod)
                && Objects.equals(this.encryptMethod, nvmfNamespaceUpdationParamsData.encryptMethod)
                && Objects.equals(this.prioritized, nvmfNamespaceUpdationParamsData.prioritized)
                && Objects.equals(
                        this.bpsWrMaxLength, nvmfNamespaceUpdationParamsData.bpsWrMaxLength)
                && Objects.equals(this.bpsWrMaxUnit, nvmfNamespaceUpdationParamsData.bpsWrMaxUnit)
                && Objects.equals(this.bpsWrMax, nvmfNamespaceUpdationParamsData.bpsWrMax)
                && Objects.equals(
                        this.bpsRdMaxLength, nvmfNamespaceUpdationParamsData.bpsRdMaxLength)
                && Objects.equals(this.bpsRdMaxUnit, nvmfNamespaceUpdationParamsData.bpsRdMaxUnit)
                && Objects.equals(this.bpsRdMax, nvmfNamespaceUpdationParamsData.bpsRdMax)
                && Objects.equals(this.bpsMaxLength, nvmfNamespaceUpdationParamsData.bpsMaxLength)
                && Objects.equals(this.bpsMaxUnit, nvmfNamespaceUpdationParamsData.bpsMaxUnit)
                && Objects.equals(this.bpsMax, nvmfNamespaceUpdationParamsData.bpsMax)
                && Objects.equals(
                        this.iopsWrMaxLength, nvmfNamespaceUpdationParamsData.iopsWrMaxLength)
                && Objects.equals(this.iopsWrMax, nvmfNamespaceUpdationParamsData.iopsWrMax)
                && Objects.equals(
                        this.iopsRdMaxLength, nvmfNamespaceUpdationParamsData.iopsRdMaxLength)
                && Objects.equals(this.iopsRdMax, nvmfNamespaceUpdationParamsData.iopsRdMax)
                && Objects.equals(this.iopsMaxLength, nvmfNamespaceUpdationParamsData.iopsMaxLength)
                && Objects.equals(this.iopsMax, nvmfNamespaceUpdationParamsData.iopsMax)
                && Objects.equals(this.bpsWrUnit, nvmfNamespaceUpdationParamsData.bpsWrUnit)
                && Objects.equals(this.bpsWr, nvmfNamespaceUpdationParamsData.bpsWr)
                && Objects.equals(this.bpsRdUnit, nvmfNamespaceUpdationParamsData.bpsRdUnit)
                && Objects.equals(this.bpsRd, nvmfNamespaceUpdationParamsData.bpsRd)
                && Objects.equals(this.bpsUnit, nvmfNamespaceUpdationParamsData.bpsUnit)
                && Objects.equals(this.bps, nvmfNamespaceUpdationParamsData.bps)
                && Objects.equals(this.iopsWr, nvmfNamespaceUpdationParamsData.iopsWr)
                && Objects.equals(this.iopsRd, nvmfNamespaceUpdationParamsData.iopsRd)
                && Objects.equals(this.iops, nvmfNamespaceUpdationParamsData.iops)
                && Objects.equals(this.nqnWhitelist, nvmfNamespaceUpdationParamsData.nqnWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicaNum,
                thinProvision,
                assignedSizeUnit,
                assignedSize,
                name,
                businessHostGroups,
                businessHosts,
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
                nqnWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfNamespaceUpdationParamsData {\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    assignedSizeUnit: ").append(toIndentedString(assignedSizeUnit)).append("\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessHostGroups: ")
                .append(toIndentedString(businessHostGroups))
                .append("\n");
        sb.append("    businessHosts: ").append(toIndentedString(businessHosts)).append("\n");
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
        sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
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
