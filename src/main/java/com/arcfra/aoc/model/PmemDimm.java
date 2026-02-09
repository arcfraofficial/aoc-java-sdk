package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PmemDimm */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class PmemDimm extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CAPACITY = "capacity";

    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private Long capacity;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR = "device_locator";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR)
    private String deviceLocator;

    public static final String SERIALIZED_NAME_DISK = "disk";

    @SerializedName(SERIALIZED_NAME_DISK)
    private NestedDisk disk;

    public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
    private DiskHealthStatus healthStatus;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private Integer numaNode;

    public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER)
    private String partNumber;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT = "remaining_life_percent";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT)
    private Integer remainingLifePercent;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public PmemDimm() {}

    public PmemDimm capacity(Long capacity) {

        this.capacity = capacity;
        return this;
    }

    /**
     * Get capacity
     *
     * @return capacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public PmemDimm capacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public PmemDimm capacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public void setCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        }
    }

    public boolean getCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY);
    }

    public PmemDimm deviceLocator(String deviceLocator) {

        this.deviceLocator = deviceLocator;
        return this;
    }

    /**
     * Get deviceLocator
     *
     * @return deviceLocator
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDeviceLocator() {
        return deviceLocator;
    }

    public void setDeviceLocator(String deviceLocator) {
        this.deviceLocator = deviceLocator;
    }

    public PmemDimm deviceLocator_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR);
        return this;
    }

    public PmemDimm deviceLocator_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR);
        return this;
    }

    public void setDeviceLocator_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR);
        }
    }

    public boolean getDeviceLocator_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR);
    }

    public PmemDimm disk(NestedDisk disk) {

        this.disk = disk;
        return this;
    }

    /**
     * Get disk
     *
     * @return disk
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedDisk getDisk() {
        return disk;
    }

    public void setDisk(NestedDisk disk) {
        this.disk = disk;
    }

    public PmemDimm disk_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK);
        return this;
    }

    public PmemDimm disk_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK);
        return this;
    }

    public void setDisk_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK);
        }
    }

    public boolean getDisk_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK);
    }

    public PmemDimm healthStatus(DiskHealthStatus healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     *
     * @return healthStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(DiskHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public PmemDimm healthStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public PmemDimm healthStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public void setHealthStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        }
    }

    public boolean getHealthStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS);
    }

    public PmemDimm host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public PmemDimm host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public PmemDimm host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public PmemDimm id(String id) {

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

    public PmemDimm id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public PmemDimm id_ExplictlyNonNull() {
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

    public PmemDimm localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public PmemDimm localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public PmemDimm localId_ExplictlyNonNull() {
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

    public PmemDimm name(String name) {

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

    public PmemDimm name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public PmemDimm name_ExplictlyNonNull() {
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

    public PmemDimm numaNode(Integer numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public PmemDimm numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public PmemDimm numaNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public void setNumaNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        }
    }

    public boolean getNumaNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE);
    }

    public PmemDimm partNumber(String partNumber) {

        this.partNumber = partNumber;
        return this;
    }

    /**
     * Get partNumber
     *
     * @return partNumber
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public PmemDimm partNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER);
        return this;
    }

    public PmemDimm partNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER);
        return this;
    }

    public void setPartNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER);
        }
    }

    public boolean getPartNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER);
    }

    public PmemDimm remainingLifePercent(Integer remainingLifePercent) {

        this.remainingLifePercent = remainingLifePercent;
        return this;
    }

    /**
     * Get remainingLifePercent
     *
     * @return remainingLifePercent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercent() {
        return remainingLifePercent;
    }

    public void setRemainingLifePercent(Integer remainingLifePercent) {
        this.remainingLifePercent = remainingLifePercent;
    }

    public PmemDimm remainingLifePercent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public PmemDimm remainingLifePercent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public void setRemainingLifePercent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        }
    }

    public boolean getRemainingLifePercent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
    }

    public PmemDimm version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PmemDimm version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public PmemDimm version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PmemDimm pmemDimm = (PmemDimm) o;
        return Objects.equals(this.capacity, pmemDimm.capacity)
                && Objects.equals(this.deviceLocator, pmemDimm.deviceLocator)
                && Objects.equals(this.disk, pmemDimm.disk)
                && Objects.equals(this.healthStatus, pmemDimm.healthStatus)
                && Objects.equals(this.host, pmemDimm.host)
                && Objects.equals(this.id, pmemDimm.id)
                && Objects.equals(this.localId, pmemDimm.localId)
                && Objects.equals(this.name, pmemDimm.name)
                && Objects.equals(this.numaNode, pmemDimm.numaNode)
                && Objects.equals(this.partNumber, pmemDimm.partNumber)
                && Objects.equals(this.remainingLifePercent, pmemDimm.remainingLifePercent)
                && Objects.equals(this.version, pmemDimm.version);
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
                capacity,
                deviceLocator,
                disk,
                healthStatus,
                host,
                id,
                localId,
                name,
                numaNode,
                partNumber,
                remainingLifePercent,
                version);
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
        sb.append("class PmemDimm {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    deviceLocator: ").append(toIndentedString(deviceLocator)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    remainingLifePercent: ")
                .append(toIndentedString(remainingLifePercent))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
