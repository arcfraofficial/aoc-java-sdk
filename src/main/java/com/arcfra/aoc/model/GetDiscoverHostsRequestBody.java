package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetDiscoverHostsRequestBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetDiscoverHostsRequestBody
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereUniqueInput cluster;

    public static final String SERIALIZED_NAME_HOST_ADDRESS = "host_address";

    @SerializedName(SERIALIZED_NAME_HOST_ADDRESS)
    private List<String> hostAddress = null;

    public GetDiscoverHostsRequestBody() {}

    public GetDiscoverHostsRequestBody cluster(ClusterWhereUniqueInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterWhereUniqueInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereUniqueInput cluster) {
        this.cluster = cluster;
    }

    public GetDiscoverHostsRequestBody cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public GetDiscoverHostsRequestBody cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public GetDiscoverHostsRequestBody hostAddress(List<String> hostAddress) {

        this.hostAddress = hostAddress;
        return this;
    }

    public GetDiscoverHostsRequestBody addHostAddressItem(String hostAddressItem) {
        if (this.hostAddress == null) {
            this.hostAddress = new ArrayList<String>();
        }
        this.hostAddress.add(hostAddressItem);
        return this;
    }

    /**
     * Get hostAddress
     *
     * @return hostAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(List<String> hostAddress) {
        this.hostAddress = hostAddress;
    }

    public GetDiscoverHostsRequestBody hostAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ADDRESS);
        return this;
    }

    public GetDiscoverHostsRequestBody hostAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ADDRESS);
        return this;
    }

    public void setHostAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ADDRESS);
        }
    }

    public boolean getHostAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ADDRESS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDiscoverHostsRequestBody getDiscoverHostsRequestBody = (GetDiscoverHostsRequestBody) o;
        return Objects.equals(this.cluster, getDiscoverHostsRequestBody.cluster)
                && Objects.equals(this.hostAddress, getDiscoverHostsRequestBody.hostAddress);
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
        return Objects.hash(cluster, hostAddress);
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
        sb.append("class GetDiscoverHostsRequestBody {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
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
