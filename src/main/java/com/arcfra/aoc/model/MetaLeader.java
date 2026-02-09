package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** MetaLeader */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MetaLeader extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_META_LEADER = "meta_leader";

    @SerializedName(SERIALIZED_NAME_META_LEADER)
    private String metaLeader;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public MetaLeader() {}

    public MetaLeader metaLeader(String metaLeader) {

        this.metaLeader = metaLeader;
        return this;
    }

    /**
     * Get metaLeader
     *
     * @return metaLeader
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMetaLeader() {
        return metaLeader;
    }

    public void setMetaLeader(String metaLeader) {
        this.metaLeader = metaLeader;
    }

    public MetaLeader metaLeader_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_LEADER);
        return this;
    }

    public MetaLeader metaLeader_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_LEADER);
        return this;
    }

    public void setMetaLeader_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_LEADER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_LEADER);
        }
    }

    public boolean getMetaLeader_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_LEADER);
    }

    public MetaLeader clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public MetaLeader clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public MetaLeader clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaLeader metaLeader = (MetaLeader) o;
        return Objects.equals(this.metaLeader, metaLeader.metaLeader)
                && Objects.equals(this.clusterId, metaLeader.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaLeader, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaLeader {\n");
        sb.append("    metaLeader: ").append(toIndentedString(metaLeader)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
