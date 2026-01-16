package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmVolumeRebuildParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeRebuildParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_VOLUME_SNAPSHOT_ID = "volume_snapshot_id";

    @SerializedName(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID)
    private String volumeSnapshotId;

    public VmVolumeRebuildParams() {}

    public VmVolumeRebuildParams name(String name) {

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

    public VmVolumeRebuildParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolumeRebuildParams name_ExplictlyNonNull() {
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

    public VmVolumeRebuildParams description(String description) {

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

    public VmVolumeRebuildParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmVolumeRebuildParams description_ExplictlyNonNull() {
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

    public VmVolumeRebuildParams volumeSnapshotId(String volumeSnapshotId) {

        this.volumeSnapshotId = volumeSnapshotId;
        return this;
    }

    /**
     * Get volumeSnapshotId
     *
     * @return volumeSnapshotId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVolumeSnapshotId() {
        return volumeSnapshotId;
    }

    public void setVolumeSnapshotId(String volumeSnapshotId) {
        this.volumeSnapshotId = volumeSnapshotId;
    }

    public VmVolumeRebuildParams volumeSnapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID);
        return this;
    }

    public VmVolumeRebuildParams volumeSnapshotId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID);
        return this;
    }

    public void setVolumeSnapshotId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID);
        }
    }

    public boolean getVolumeSnapshotId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVolumeRebuildParams vmVolumeRebuildParams = (VmVolumeRebuildParams) o;
        return Objects.equals(this.name, vmVolumeRebuildParams.name)
                && Objects.equals(this.description, vmVolumeRebuildParams.description)
                && Objects.equals(this.volumeSnapshotId, vmVolumeRebuildParams.volumeSnapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, volumeSnapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmVolumeRebuildParams {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    volumeSnapshotId: ").append(toIndentedString(volumeSnapshotId)).append("\n");
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
