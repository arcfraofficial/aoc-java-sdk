package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SnapshotGroupCloneParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotGroupCloneParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLONE = "clone";

    @SerializedName(SERIALIZED_NAME_CLONE)
    private List<SnapshotGroupCloneParam> clone = new ArrayList<SnapshotGroupCloneParam>();

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public SnapshotGroupCloneParams() {}

    public SnapshotGroupCloneParams clone(List<SnapshotGroupCloneParam> clone) {

        this.clone = clone;
        return this;
    }

    public SnapshotGroupCloneParams addCloneItem(SnapshotGroupCloneParam cloneItem) {
        this.clone.add(cloneItem);
        return this;
    }

    /**
     * Get clone
     *
     * @return clone
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<SnapshotGroupCloneParam> getClone() {
        return clone;
    }

    public void setClone(List<SnapshotGroupCloneParam> clone) {
        this.clone = clone;
    }

    public SnapshotGroupCloneParams clone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLONE);
        return this;
    }

    public SnapshotGroupCloneParams clone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLONE);
        return this;
    }

    public void setClone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLONE);
        }
    }

    public boolean getClone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLONE);
    }

    public SnapshotGroupCloneParams id(String id) {

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

    public SnapshotGroupCloneParams id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotGroupCloneParams id_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotGroupCloneParams snapshotGroupCloneParams = (SnapshotGroupCloneParams) o;
        return Objects.equals(this.clone, snapshotGroupCloneParams.clone)
                && Objects.equals(this.id, snapshotGroupCloneParams.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clone, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotGroupCloneParams {\n");
        sb.append("    clone: ").append(toIndentedString(clone)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
