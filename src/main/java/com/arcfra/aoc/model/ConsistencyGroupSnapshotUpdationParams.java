package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConsistencyGroupSnapshotUpdationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupSnapshotUpdationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ConsistencyGroupSnapshotWhereInput where;

    public ConsistencyGroupSnapshotUpdationParams() {}

    public ConsistencyGroupSnapshotUpdationParams where(ConsistencyGroupSnapshotWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ConsistencyGroupSnapshotWhereInput getWhere() {
        return where;
    }

    public void setWhere(ConsistencyGroupSnapshotWhereInput where) {
        this.where = where;
    }

    public ConsistencyGroupSnapshotUpdationParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ConsistencyGroupSnapshotUpdationParams where_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        return this;
    }

    public void setWhere_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHERE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        }
    }

    public boolean getWhere_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHERE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams =
                (ConsistencyGroupSnapshotUpdationParams) o;
        return Objects.equals(this.where, consistencyGroupSnapshotUpdationParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyGroupSnapshotUpdationParams {\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
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
