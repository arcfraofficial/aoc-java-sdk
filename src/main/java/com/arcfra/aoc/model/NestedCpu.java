package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedCpu */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedCpu extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CORES = "cores";

    @SerializedName(SERIALIZED_NAME_CORES)
    private Integer cores;

    public static final String SERIALIZED_NAME_SOCKETS = "sockets";

    @SerializedName(SERIALIZED_NAME_SOCKETS)
    private Integer sockets;

    public NestedCpu() {}

    public NestedCpu cores(Integer cores) {

        this.cores = cores;
        return this;
    }

    /**
     * Get cores
     *
     * @return cores
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public NestedCpu cores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CORES);
        return this;
    }

    public NestedCpu cores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CORES);
        return this;
    }

    public void setCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CORES);
        }
    }

    public boolean getCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CORES);
    }

    public NestedCpu sockets(Integer sockets) {

        this.sockets = sockets;
        return this;
    }

    /**
     * Get sockets
     *
     * @return sockets
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    public NestedCpu sockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOCKETS);
        return this;
    }

    public NestedCpu sockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOCKETS);
        return this;
    }

    public void setSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOCKETS);
        }
    }

    public boolean getSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOCKETS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedCpu nestedCpu = (NestedCpu) o;
        return Objects.equals(this.cores, nestedCpu.cores)
                && Objects.equals(this.sockets, nestedCpu.sockets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores, sockets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedCpu {\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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
