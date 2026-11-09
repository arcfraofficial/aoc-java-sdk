package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVirtualPrivateCloudService */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudService
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR = "internal_cidr";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR)
    private String internalCidr;

    public NestedVirtualPrivateCloudService() {}

    public NestedVirtualPrivateCloudService everouteCluster(NestedEverouteCluster everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedEverouteCluster getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public NestedVirtualPrivateCloudService everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public NestedVirtualPrivateCloudService everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public NestedVirtualPrivateCloudService id(String id) {

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

    public NestedVirtualPrivateCloudService id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudService id_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudService internalCidr(String internalCidr) {

        this.internalCidr = internalCidr;
        return this;
    }

    /**
     * Get internalCidr
     *
     * @return internalCidr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getInternalCidr() {
        return internalCidr;
    }

    public void setInternalCidr(String internalCidr) {
        this.internalCidr = internalCidr;
    }

    public NestedVirtualPrivateCloudService internalCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudService internalCidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR);
        return this;
    }

    public void setInternalCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR);
        }
    }

    public boolean getInternalCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudService nestedVirtualPrivateCloudService =
                (NestedVirtualPrivateCloudService) o;
        return Objects.equals(
                        this.everouteCluster, nestedVirtualPrivateCloudService.everouteCluster)
                && Objects.equals(this.id, nestedVirtualPrivateCloudService.id)
                && Objects.equals(this.internalCidr, nestedVirtualPrivateCloudService.internalCidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(everouteCluster, id, internalCidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVirtualPrivateCloudService {\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internalCidr: ").append(toIndentedString(internalCidr)).append("\n");
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
