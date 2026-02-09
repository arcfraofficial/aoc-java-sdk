package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConsistencyGroupSnapshotDeletionParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupSnapshotDeletionParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT = "remain_volume_snapshot";

    @SerializedName(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT)
    private Boolean remainVolumeSnapshot;

    public ConsistencyGroupSnapshotDeletionParamsData() {}

    public ConsistencyGroupSnapshotDeletionParamsData remainVolumeSnapshot(
            Boolean remainVolumeSnapshot) {

        this.remainVolumeSnapshot = remainVolumeSnapshot;
        return this;
    }

    /**
     * Get remainVolumeSnapshot
     *
     * @return remainVolumeSnapshot
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getRemainVolumeSnapshot() {
        return remainVolumeSnapshot;
    }

    public void setRemainVolumeSnapshot(Boolean remainVolumeSnapshot) {
        this.remainVolumeSnapshot = remainVolumeSnapshot;
    }

    public ConsistencyGroupSnapshotDeletionParamsData remainVolumeSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        return this;
    }

    public ConsistencyGroupSnapshotDeletionParamsData remainVolumeSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        return this;
    }

    public void setRemainVolumeSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        }
    }

    public boolean getRemainVolumeSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsistencyGroupSnapshotDeletionParamsData consistencyGroupSnapshotDeletionParamsData =
                (ConsistencyGroupSnapshotDeletionParamsData) o;
        return Objects.equals(
                this.remainVolumeSnapshot,
                consistencyGroupSnapshotDeletionParamsData.remainVolumeSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remainVolumeSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyGroupSnapshotDeletionParamsData {\n");
        sb.append("    remainVolumeSnapshot: ")
                .append(toIndentedString(remainVolumeSnapshot))
                .append("\n");
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
