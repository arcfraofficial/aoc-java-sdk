package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmSnapshot */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSnapshot extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
    private VmClockOffset clockOffset;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CONSISTENT_TYPE = "consistent_type";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE)
    private ConsistentType consistentType;

    public static final String SERIALIZED_NAME_CPU = "cpu";

    @SerializedName(SERIALIZED_NAME_CPU)
    private NestedCpu cpu;

    public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL)
    private String cpuModel;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private VmFirmware firmware;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_HA_PRIORITY = "ha_priority";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY)
    private VmHaPriority haPriority;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Integer maxIops;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";

    @SerializedName(SERIALIZED_NAME_VM_DISKS)
    private List<NestedFrozenDisks> vmDisks = null;

    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<NestedFrozenNic> vmNics = null;

    public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";

    @SerializedName(SERIALIZED_NAME_WIN_OPT)
    private Boolean winOpt;

    public VmSnapshot() {}

    public VmSnapshot clockOffset(VmClockOffset clockOffset) {

        this.clockOffset = clockOffset;
        return this;
    }

    /**
     * Get clockOffset
     *
     * @return clockOffset
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmClockOffset getClockOffset() {
        return clockOffset;
    }

    public void setClockOffset(VmClockOffset clockOffset) {
        this.clockOffset = clockOffset;
    }

    public VmSnapshot clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public VmSnapshot clockOffset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public void setClockOffset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        }
    }

    public boolean getClockOffset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET);
    }

    public VmSnapshot cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public VmSnapshot cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmSnapshot cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public VmSnapshot consistentType(ConsistentType consistentType) {

        this.consistentType = consistentType;
        return this;
    }

    /**
     * Get consistentType
     *
     * @return consistentType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ConsistentType getConsistentType() {
        return consistentType;
    }

    public void setConsistentType(ConsistentType consistentType) {
        this.consistentType = consistentType;
    }

    public VmSnapshot consistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public VmSnapshot consistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public void setConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        }
    }

    public boolean getConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE);
    }

    public VmSnapshot cpu(NestedCpu cpu) {

        this.cpu = cpu;
        return this;
    }

    /**
     * Get cpu
     *
     * @return cpu
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCpu getCpu() {
        return cpu;
    }

    public void setCpu(NestedCpu cpu) {
        this.cpu = cpu;
    }

    public VmSnapshot cpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU);
        return this;
    }

    public VmSnapshot cpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU);
        return this;
    }

    public void setCpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU);
        }
    }

    public boolean getCpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU);
    }

    public VmSnapshot cpuModel(String cpuModel) {

        this.cpuModel = cpuModel;
        return this;
    }

    /**
     * Get cpuModel
     *
     * @return cpuModel
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public VmSnapshot cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public VmSnapshot cpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public void setCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        }
    }

    public boolean getCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL);
    }

    public VmSnapshot description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmSnapshot description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmSnapshot description_ExplictlyNonNull() {
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

    public VmSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public VmSnapshot entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmSnapshot entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public VmSnapshot firmware(VmFirmware firmware) {

        this.firmware = firmware;
        return this;
    }

    /**
     * Get firmware
     *
     * @return firmware
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmFirmware getFirmware() {
        return firmware;
    }

    public void setFirmware(VmFirmware firmware) {
        this.firmware = firmware;
    }

    public VmSnapshot firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public VmSnapshot firmware_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public void setFirmware_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        }
    }

    public boolean getFirmware_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE);
    }

    public VmSnapshot ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public VmSnapshot ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public VmSnapshot ha_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA);
        return this;
    }

    public void setHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA);
        }
    }

    public boolean getHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA);
    }

    public VmSnapshot haPriority(VmHaPriority haPriority) {

        this.haPriority = haPriority;
        return this;
    }

    /**
     * Get haPriority
     *
     * @return haPriority
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmHaPriority getHaPriority() {
        return haPriority;
    }

    public void setHaPriority(VmHaPriority haPriority) {
        this.haPriority = haPriority;
    }

    public VmSnapshot haPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public VmSnapshot haPriority_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public void setHaPriority_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        }
    }

    public boolean getHaPriority_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY);
    }

    public VmSnapshot id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VmSnapshot id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmSnapshot id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public VmSnapshot ioPolicy(VmDiskIoPolicy ioPolicy) {

        this.ioPolicy = ioPolicy;
        return this;
    }

    /**
     * Get ioPolicy
     *
     * @return ioPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoPolicy getIoPolicy() {
        return ioPolicy;
    }

    public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
        this.ioPolicy = ioPolicy;
    }

    public VmSnapshot ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmSnapshot ioPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public void setIoPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        }
    }

    public boolean getIoPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY);
    }

    public VmSnapshot labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public VmSnapshot addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public VmSnapshot labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public VmSnapshot labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public VmSnapshot localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public VmSnapshot localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmSnapshot localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public VmSnapshot localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VmSnapshot localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmSnapshot localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public VmSnapshot maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public VmSnapshot maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmSnapshot maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public VmSnapshot maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public VmSnapshot maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmSnapshot maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public VmSnapshot maxIops(Integer maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Integer maxIops) {
        this.maxIops = maxIops;
    }

    public VmSnapshot maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmSnapshot maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public VmSnapshot maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public VmSnapshot maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmSnapshot maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public VmSnapshot memory(Long memory) {

        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public VmSnapshot memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public VmSnapshot memory_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public void setMemory_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        }
    }

    public boolean getMemory_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY);
    }

    public VmSnapshot name(String name) {

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

    public VmSnapshot name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmSnapshot name_ExplictlyNonNull() {
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

    public VmSnapshot size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public VmSnapshot size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmSnapshot size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public VmSnapshot vcpu(Integer vcpu) {

        this.vcpu = vcpu;
        return this;
    }

    /**
     * Get vcpu
     *
     * @return vcpu
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public VmSnapshot vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public VmSnapshot vcpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        return this;
    }

    public void setVcpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        }
    }

    public boolean getVcpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU);
    }

    public VmSnapshot vm(NestedVm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public VmSnapshot vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmSnapshot vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public VmSnapshot vmDisks(List<NestedFrozenDisks> vmDisks) {

        this.vmDisks = vmDisks;
        return this;
    }

    public VmSnapshot addVmDisksItem(NestedFrozenDisks vmDisksItem) {
        if (this.vmDisks == null) {
            this.vmDisks = new ArrayList<NestedFrozenDisks>();
        }
        this.vmDisks.add(vmDisksItem);
        return this;
    }

    /**
     * Get vmDisks
     *
     * @return vmDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedFrozenDisks> getVmDisks() {
        return vmDisks;
    }

    public void setVmDisks(List<NestedFrozenDisks> vmDisks) {
        this.vmDisks = vmDisks;
    }

    public VmSnapshot vmDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public VmSnapshot vmDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public void setVmDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        }
    }

    public boolean getVmDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS);
    }

    public VmSnapshot vmNics(List<NestedFrozenNic> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public VmSnapshot addVmNicsItem(NestedFrozenNic vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<NestedFrozenNic>();
        }
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedFrozenNic> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<NestedFrozenNic> vmNics) {
        this.vmNics = vmNics;
    }

    public VmSnapshot vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public VmSnapshot vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    public VmSnapshot winOpt(Boolean winOpt) {

        this.winOpt = winOpt;
        return this;
    }

    /**
     * Get winOpt
     *
     * @return winOpt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getWinOpt() {
        return winOpt;
    }

    public void setWinOpt(Boolean winOpt) {
        this.winOpt = winOpt;
    }

    public VmSnapshot winOpt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public VmSnapshot winOpt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public void setWinOpt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        }
    }

    public boolean getWinOpt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WIN_OPT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmSnapshot vmSnapshot = (VmSnapshot) o;
        return Objects.equals(this.clockOffset, vmSnapshot.clockOffset)
                && Objects.equals(this.cluster, vmSnapshot.cluster)
                && Objects.equals(this.consistentType, vmSnapshot.consistentType)
                && Objects.equals(this.cpu, vmSnapshot.cpu)
                && Objects.equals(this.cpuModel, vmSnapshot.cpuModel)
                && Objects.equals(this.description, vmSnapshot.description)
                && Objects.equals(this.entityAsyncStatus, vmSnapshot.entityAsyncStatus)
                && Objects.equals(this.firmware, vmSnapshot.firmware)
                && Objects.equals(this.ha, vmSnapshot.ha)
                && Objects.equals(this.haPriority, vmSnapshot.haPriority)
                && Objects.equals(this.id, vmSnapshot.id)
                && Objects.equals(this.ioPolicy, vmSnapshot.ioPolicy)
                && Objects.equals(this.labels, vmSnapshot.labels)
                && Objects.equals(this.localCreatedAt, vmSnapshot.localCreatedAt)
                && Objects.equals(this.localId, vmSnapshot.localId)
                && Objects.equals(this.maxBandwidth, vmSnapshot.maxBandwidth)
                && Objects.equals(this.maxBandwidthPolicy, vmSnapshot.maxBandwidthPolicy)
                && Objects.equals(this.maxIops, vmSnapshot.maxIops)
                && Objects.equals(this.maxIopsPolicy, vmSnapshot.maxIopsPolicy)
                && Objects.equals(this.memory, vmSnapshot.memory)
                && Objects.equals(this.name, vmSnapshot.name)
                && Objects.equals(this.size, vmSnapshot.size)
                && Objects.equals(this.vcpu, vmSnapshot.vcpu)
                && Objects.equals(this.vm, vmSnapshot.vm)
                && Objects.equals(this.vmDisks, vmSnapshot.vmDisks)
                && Objects.equals(this.vmNics, vmSnapshot.vmNics)
                && Objects.equals(this.winOpt, vmSnapshot.winOpt);
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
        return Objects.hash(
                clockOffset,
                cluster,
                consistentType,
                cpu,
                cpuModel,
                description,
                entityAsyncStatus,
                firmware,
                ha,
                haPriority,
                id,
                ioPolicy,
                labels,
                localCreatedAt,
                localId,
                maxBandwidth,
                maxBandwidthPolicy,
                maxIops,
                maxIopsPolicy,
                memory,
                name,
                size,
                vcpu,
                vm,
                vmDisks,
                vmNics,
                winOpt);
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
        sb.append("class VmSnapshot {\n");
        sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    consistentType: ").append(toIndentedString(consistentType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    haPriority: ").append(toIndentedString(haPriority)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
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
