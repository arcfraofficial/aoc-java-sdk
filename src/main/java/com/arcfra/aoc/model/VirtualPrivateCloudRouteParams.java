package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudRouteParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouteParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DESTINATION = "destination";

    @SerializedName(SERIALIZED_NAME_DESTINATION)
    private String destination;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID = "next_hop_local_id";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID)
    private String nextHopLocalId;

    public static final String SERIALIZED_NAME_NEXT_HOP_TYPE = "next_hop_type";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_TYPE)
    private VirtualPrivateCloudRouteNextHopType nextHopType;

    public VirtualPrivateCloudRouteParams() {}

    public VirtualPrivateCloudRouteParams destination(String destination) {

        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public VirtualPrivateCloudRouteParams destination_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION);
        return this;
    }

    public VirtualPrivateCloudRouteParams destination_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION);
        return this;
    }

    public void setDestination_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION);
        }
    }

    public boolean getDestination_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION);
    }

    public VirtualPrivateCloudRouteParams nextHopLocalId(String nextHopLocalId) {

        this.nextHopLocalId = nextHopLocalId;
        return this;
    }

    /**
     * Get nextHopLocalId
     *
     * @return nextHopLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNextHopLocalId() {
        return nextHopLocalId;
    }

    public void setNextHopLocalId(String nextHopLocalId) {
        this.nextHopLocalId = nextHopLocalId;
    }

    public VirtualPrivateCloudRouteParams nextHopLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouteParams nextHopLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        return this;
    }

    public void setNextHopLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        }
    }

    public boolean getNextHopLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
    }

    public VirtualPrivateCloudRouteParams nextHopType(
            VirtualPrivateCloudRouteNextHopType nextHopType) {

        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get nextHopType
     *
     * @return nextHopType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VirtualPrivateCloudRouteNextHopType getNextHopType() {
        return nextHopType;
    }

    public void setNextHopType(VirtualPrivateCloudRouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
    }

    public VirtualPrivateCloudRouteParams nextHopType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE);
        return this;
    }

    public VirtualPrivateCloudRouteParams nextHopType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE);
        return this;
    }

    public void setNextHopType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE);
        }
    }

    public boolean getNextHopType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouteParams virtualPrivateCloudRouteParams =
                (VirtualPrivateCloudRouteParams) o;
        return Objects.equals(this.destination, virtualPrivateCloudRouteParams.destination)
                && Objects.equals(
                        this.nextHopLocalId, virtualPrivateCloudRouteParams.nextHopLocalId)
                && Objects.equals(this.nextHopType, virtualPrivateCloudRouteParams.nextHopType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, nextHopLocalId, nextHopType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouteParams {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nextHopLocalId: ").append(toIndentedString(nextHopLocalId)).append("\n");
        sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
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
