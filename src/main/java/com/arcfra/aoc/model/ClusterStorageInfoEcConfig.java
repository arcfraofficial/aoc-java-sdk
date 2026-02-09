package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterStorageInfoEcConfig */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterStorageInfoEcConfig
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_M = "m";

    @SerializedName(SERIALIZED_NAME_M)
    private Integer m;

    public static final String SERIALIZED_NAME_K = "k";

    @SerializedName(SERIALIZED_NAME_K)
    private Integer k;

    public ClusterStorageInfoEcConfig() {}

    public ClusterStorageInfoEcConfig m(Integer m) {

        this.m = m;
        return this;
    }

    /**
     * Get m
     *
     * @return m
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public ClusterStorageInfoEcConfig m_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_M);
        return this;
    }

    public ClusterStorageInfoEcConfig m_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_M);
        return this;
    }

    public void setM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_M);
        }
    }

    public boolean getM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_M);
    }

    public ClusterStorageInfoEcConfig k(Integer k) {

        this.k = k;
        return this;
    }

    /**
     * Get k
     *
     * @return k
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public ClusterStorageInfoEcConfig k_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_K);
        return this;
    }

    public ClusterStorageInfoEcConfig k_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_K);
        return this;
    }

    public void setK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_K);
        }
    }

    public boolean getK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_K);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterStorageInfoEcConfig clusterStorageInfoEcConfig = (ClusterStorageInfoEcConfig) o;
        return Objects.equals(this.m, clusterStorageInfoEcConfig.m)
                && Objects.equals(this.k, clusterStorageInfoEcConfig.k);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m, k);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStorageInfoEcConfig {\n");
        sb.append("    m: ").append(toIndentedString(m)).append("\n");
        sb.append("    k: ").append(toIndentedString(k)).append("\n");
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
