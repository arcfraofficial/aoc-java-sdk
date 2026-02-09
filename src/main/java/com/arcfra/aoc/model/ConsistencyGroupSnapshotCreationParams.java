package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConsistencyGroupSnapshotCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupSnapshotCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_ID = "consistency_group_id";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_ID)
    private String consistencyGroupId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ConsistencyGroupSnapshotCreationParams() {}

    public ConsistencyGroupSnapshotCreationParams consistencyGroupId(String consistencyGroupId) {

        this.consistencyGroupId = consistencyGroupId;
        return this;
    }

    /**
     * Get consistencyGroupId
     *
     * @return consistencyGroupId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getConsistencyGroupId() {
        return consistencyGroupId;
    }

    public void setConsistencyGroupId(String consistencyGroupId) {
        this.consistencyGroupId = consistencyGroupId;
    }

    public ConsistencyGroupSnapshotCreationParams consistencyGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_ID);
        return this;
    }

    public ConsistencyGroupSnapshotCreationParams consistencyGroupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_ID);
        return this;
    }

    public void setConsistencyGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_ID);
        }
    }

    public boolean getConsistencyGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_ID);
    }

    public ConsistencyGroupSnapshotCreationParams name(String name) {

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

    public ConsistencyGroupSnapshotCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ConsistencyGroupSnapshotCreationParams name_ExplictlyNonNull() {
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
        ConsistencyGroupSnapshotCreationParams consistencyGroupSnapshotCreationParams =
                (ConsistencyGroupSnapshotCreationParams) o;
        return Objects.equals(
                        this.consistencyGroupId,
                        consistencyGroupSnapshotCreationParams.consistencyGroupId)
                && Objects.equals(this.name, consistencyGroupSnapshotCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistencyGroupId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyGroupSnapshotCreationParams {\n");
        sb.append("    consistencyGroupId: ")
                .append(toIndentedString(consistencyGroupId))
                .append("\n");
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
