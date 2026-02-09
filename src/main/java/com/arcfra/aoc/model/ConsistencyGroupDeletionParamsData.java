package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConsistencyGroupDeletionParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupDeletionParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT = "remain_volume_snapshot";

    @SerializedName(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT)
    private Boolean remainVolumeSnapshot;

    public ConsistencyGroupDeletionParamsData() {}

    public ConsistencyGroupDeletionParamsData remainVolumeSnapshot(Boolean remainVolumeSnapshot) {

        this.remainVolumeSnapshot = remainVolumeSnapshot;
        return this;
    }

    /**
     * Get remainVolumeSnapshot
     *
     * @return remainVolumeSnapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRemainVolumeSnapshot() {
        return remainVolumeSnapshot;
    }

    public void setRemainVolumeSnapshot(Boolean remainVolumeSnapshot) {
        this.remainVolumeSnapshot = remainVolumeSnapshot;
    }

    public ConsistencyGroupDeletionParamsData remainVolumeSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        return this;
    }

    public ConsistencyGroupDeletionParamsData remainVolumeSnapshot_ExplictlyNonNull() {
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
        ConsistencyGroupDeletionParamsData consistencyGroupDeletionParamsData =
                (ConsistencyGroupDeletionParamsData) o;
        return Objects.equals(
                this.remainVolumeSnapshot, consistencyGroupDeletionParamsData.remainVolumeSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remainVolumeSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyGroupDeletionParamsData {\n");
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
