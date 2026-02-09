package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterLicenseUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterLicenseUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_LICENSE = "license";

    @SerializedName(SERIALIZED_NAME_LICENSE)
    private String license;

    public ClusterLicenseUpdationParamsData() {}

    public ClusterLicenseUpdationParamsData license(String license) {

        this.license = license;
        return this;
    }

    /**
     * Get license
     *
     * @return license
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public ClusterLicenseUpdationParamsData license_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE);
        return this;
    }

    public ClusterLicenseUpdationParamsData license_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE);
        return this;
    }

    public void setLicense_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE);
        }
    }

    public boolean getLicense_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterLicenseUpdationParamsData clusterLicenseUpdationParamsData =
                (ClusterLicenseUpdationParamsData) o;
        return Objects.equals(this.license, clusterLicenseUpdationParamsData.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(license);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterLicenseUpdationParamsData {\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
