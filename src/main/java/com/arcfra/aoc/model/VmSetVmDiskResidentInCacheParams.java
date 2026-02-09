package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmSetVmDiskResidentInCacheParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSetVmDiskResidentInCacheParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private VmDiskWhereInput where;

    public VmSetVmDiskResidentInCacheParams() {}

    public VmSetVmDiskResidentInCacheParams residentInCache(Boolean residentInCache) {

        this.residentInCache = residentInCache;
        return this;
    }

    /**
     * Get residentInCache
     *
     * @return residentInCache
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getResidentInCache() {
        return residentInCache;
    }

    public void setResidentInCache(Boolean residentInCache) {
        this.residentInCache = residentInCache;
    }

    public VmSetVmDiskResidentInCacheParams residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public VmSetVmDiskResidentInCacheParams residentInCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public void setResidentInCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        }
    }

    public boolean getResidentInCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE);
    }

    public VmSetVmDiskResidentInCacheParams where(VmDiskWhereInput where) {

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
    public VmDiskWhereInput getWhere() {
        return where;
    }

    public void setWhere(VmDiskWhereInput where) {
        this.where = where;
    }

    public VmSetVmDiskResidentInCacheParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public VmSetVmDiskResidentInCacheParams where_ExplictlyNonNull() {
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
        VmSetVmDiskResidentInCacheParams vmSetVmDiskResidentInCacheParams =
                (VmSetVmDiskResidentInCacheParams) o;
        return Objects.equals(
                        this.residentInCache, vmSetVmDiskResidentInCacheParams.residentInCache)
                && Objects.equals(this.where, vmSetVmDiskResidentInCacheParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residentInCache, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmSetVmDiskResidentInCacheParams {\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
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
