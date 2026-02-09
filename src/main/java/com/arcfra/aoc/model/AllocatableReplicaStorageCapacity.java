package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AllocatableReplicaStorageCapacity */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AllocatableReplicaStorageCapacity
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CAPACITY = "capacity";

    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private Double capacity;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public AllocatableReplicaStorageCapacity() {}

    public AllocatableReplicaStorageCapacity capacity(Double capacity) {

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
    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public AllocatableReplicaStorageCapacity capacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public AllocatableReplicaStorageCapacity capacity_ExplictlyNonNull() {
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

    public AllocatableReplicaStorageCapacity replicaNum(Integer replicaNum) {

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

    public AllocatableReplicaStorageCapacity replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public AllocatableReplicaStorageCapacity replicaNum_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllocatableReplicaStorageCapacity allocatableReplicaStorageCapacity =
                (AllocatableReplicaStorageCapacity) o;
        return Objects.equals(this.capacity, allocatableReplicaStorageCapacity.capacity)
                && Objects.equals(this.replicaNum, allocatableReplicaStorageCapacity.replicaNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, replicaNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllocatableReplicaStorageCapacity {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
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
