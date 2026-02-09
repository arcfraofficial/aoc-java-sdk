package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedDiscoveredHostDisk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedDiscoveredHostDisk
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DIMM_IDS = "dimm_ids";

    @SerializedName(SERIALIZED_NAME_DIMM_IDS)
    private List<String> dimmIds = null;

    public static final String SERIALIZED_NAME_DRIVE = "drive";

    @SerializedName(SERIALIZED_NAME_DRIVE)
    private String drive;

    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private DiskFunction function;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private Integer numaNode;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE = "persistent_memory_type";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE)
    private String persistentMemoryType;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private DiskType type;

    public NestedDiscoveredHostDisk() {}

    public NestedDiscoveredHostDisk dimmIds(List<String> dimmIds) {

        this.dimmIds = dimmIds;
        return this;
    }

    public NestedDiscoveredHostDisk addDimmIdsItem(String dimmIdsItem) {
        if (this.dimmIds == null) {
            this.dimmIds = new ArrayList<String>();
        }
        this.dimmIds.add(dimmIdsItem);
        return this;
    }

    /**
     * Get dimmIds
     *
     * @return dimmIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDimmIds() {
        return dimmIds;
    }

    public void setDimmIds(List<String> dimmIds) {
        this.dimmIds = dimmIds;
    }

    public NestedDiscoveredHostDisk dimmIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIMM_IDS);
        return this;
    }

    public NestedDiscoveredHostDisk dimmIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIMM_IDS);
        return this;
    }

    public void setDimmIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIMM_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIMM_IDS);
        }
    }

    public boolean getDimmIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIMM_IDS);
    }

    public NestedDiscoveredHostDisk drive(String drive) {

        this.drive = drive;
        return this;
    }

    /**
     * Get drive
     *
     * @return drive
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public NestedDiscoveredHostDisk drive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DRIVE);
        return this;
    }

    public NestedDiscoveredHostDisk drive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DRIVE);
        return this;
    }

    public void setDrive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DRIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DRIVE);
        }
    }

    public boolean getDrive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DRIVE);
    }

    public NestedDiscoveredHostDisk function(DiskFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskFunction getFunction() {
        return function;
    }

    public void setFunction(DiskFunction function) {
        this.function = function;
    }

    public NestedDiscoveredHostDisk function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public NestedDiscoveredHostDisk function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    public NestedDiscoveredHostDisk model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public NestedDiscoveredHostDisk model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public NestedDiscoveredHostDisk model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public NestedDiscoveredHostDisk numaNode(Integer numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public NestedDiscoveredHostDisk numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public NestedDiscoveredHostDisk numaNode_ExplictlyNonNull() {
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

    public NestedDiscoveredHostDisk persistentMemoryType(String persistentMemoryType) {

        this.persistentMemoryType = persistentMemoryType;
        return this;
    }

    /**
     * Get persistentMemoryType
     *
     * @return persistentMemoryType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryType() {
        return persistentMemoryType;
    }

    public void setPersistentMemoryType(String persistentMemoryType) {
        this.persistentMemoryType = persistentMemoryType;
    }

    public NestedDiscoveredHostDisk persistentMemoryType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public NestedDiscoveredHostDisk persistentMemoryType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public void setPersistentMemoryType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        }
    }

    public boolean getPersistentMemoryType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
    }

    public NestedDiscoveredHostDisk serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public NestedDiscoveredHostDisk serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public NestedDiscoveredHostDisk serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public NestedDiscoveredHostDisk size(Long size) {

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

    public NestedDiscoveredHostDisk size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedDiscoveredHostDisk size_ExplictlyNonNull() {
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

    public NestedDiscoveredHostDisk type(DiskType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    public NestedDiscoveredHostDisk type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedDiscoveredHostDisk type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedDiscoveredHostDisk nestedDiscoveredHostDisk = (NestedDiscoveredHostDisk) o;
        return Objects.equals(this.dimmIds, nestedDiscoveredHostDisk.dimmIds)
                && Objects.equals(this.drive, nestedDiscoveredHostDisk.drive)
                && Objects.equals(this.function, nestedDiscoveredHostDisk.function)
                && Objects.equals(this.model, nestedDiscoveredHostDisk.model)
                && Objects.equals(this.numaNode, nestedDiscoveredHostDisk.numaNode)
                && Objects.equals(
                        this.persistentMemoryType, nestedDiscoveredHostDisk.persistentMemoryType)
                && Objects.equals(this.serial, nestedDiscoveredHostDisk.serial)
                && Objects.equals(this.size, nestedDiscoveredHostDisk.size)
                && Objects.equals(this.type, nestedDiscoveredHostDisk.type);
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
                dimmIds,
                drive,
                function,
                model,
                numaNode,
                persistentMemoryType,
                serial,
                size,
                type);
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
        sb.append("class NestedDiscoveredHostDisk {\n");
        sb.append("    dimmIds: ").append(toIndentedString(dimmIds)).append("\n");
        sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    persistentMemoryType: ")
                .append(toIndentedString(persistentMemoryType))
                .append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
