package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedGpuDriverInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedGpuDriverInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FILENAME = "filename";

    @SerializedName(SERIALIZED_NAME_FILENAME)
    private String filename;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_RHELVERSION = "rhelversion";

    @SerializedName(SERIALIZED_NAME_RHELVERSION)
    private String rhelversion;

    public static final String SERIALIZED_NAME_SRCVERSION = "srcversion";

    @SerializedName(SERIALIZED_NAME_SRCVERSION)
    private String srcversion;

    public static final String SERIALIZED_NAME_SUPPORTED = "supported";

    @SerializedName(SERIALIZED_NAME_SUPPORTED)
    private String supported;

    public static final String SERIALIZED_NAME_VERMAGIC = "vermagic";

    @SerializedName(SERIALIZED_NAME_VERMAGIC)
    private String vermagic;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public NestedGpuDriverInfo() {}

    public NestedGpuDriverInfo filename(String filename) {

        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public NestedGpuDriverInfo filename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILENAME);
        return this;
    }

    public NestedGpuDriverInfo filename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILENAME);
        return this;
    }

    public void setFilename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILENAME);
        }
    }

    public boolean getFilename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILENAME);
    }

    public NestedGpuDriverInfo name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NestedGpuDriverInfo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedGpuDriverInfo name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public NestedGpuDriverInfo rhelversion(String rhelversion) {

        this.rhelversion = rhelversion;
        return this;
    }

    /**
     * Get rhelversion
     *
     * @return rhelversion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRhelversion() {
        return rhelversion;
    }

    public void setRhelversion(String rhelversion) {
        this.rhelversion = rhelversion;
    }

    public NestedGpuDriverInfo rhelversion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RHELVERSION);
        return this;
    }

    public NestedGpuDriverInfo rhelversion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RHELVERSION);
        return this;
    }

    public void setRhelversion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RHELVERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RHELVERSION);
        }
    }

    public boolean getRhelversion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RHELVERSION);
    }

    public NestedGpuDriverInfo srcversion(String srcversion) {

        this.srcversion = srcversion;
        return this;
    }

    /**
     * Get srcversion
     *
     * @return srcversion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSrcversion() {
        return srcversion;
    }

    public void setSrcversion(String srcversion) {
        this.srcversion = srcversion;
    }

    public NestedGpuDriverInfo srcversion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRCVERSION);
        return this;
    }

    public NestedGpuDriverInfo srcversion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRCVERSION);
        return this;
    }

    public void setSrcversion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRCVERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRCVERSION);
        }
    }

    public boolean getSrcversion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRCVERSION);
    }

    public NestedGpuDriverInfo supported(String supported) {

        this.supported = supported;
        return this;
    }

    /**
     * Get supported
     *
     * @return supported
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSupported() {
        return supported;
    }

    public void setSupported(String supported) {
        this.supported = supported;
    }

    public NestedGpuDriverInfo supported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUPPORTED);
        return this;
    }

    public NestedGpuDriverInfo supported_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUPPORTED);
        return this;
    }

    public void setSupported_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUPPORTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUPPORTED);
        }
    }

    public boolean getSupported_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUPPORTED);
    }

    public NestedGpuDriverInfo vermagic(String vermagic) {

        this.vermagic = vermagic;
        return this;
    }

    /**
     * Get vermagic
     *
     * @return vermagic
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVermagic() {
        return vermagic;
    }

    public void setVermagic(String vermagic) {
        this.vermagic = vermagic;
    }

    public NestedGpuDriverInfo vermagic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERMAGIC);
        return this;
    }

    public NestedGpuDriverInfo vermagic_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERMAGIC);
        return this;
    }

    public void setVermagic_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERMAGIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERMAGIC);
        }
    }

    public boolean getVermagic_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERMAGIC);
    }

    public NestedGpuDriverInfo version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public NestedGpuDriverInfo version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public NestedGpuDriverInfo version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedGpuDriverInfo nestedGpuDriverInfo = (NestedGpuDriverInfo) o;
        return Objects.equals(this.filename, nestedGpuDriverInfo.filename)
                && Objects.equals(this.name, nestedGpuDriverInfo.name)
                && Objects.equals(this.rhelversion, nestedGpuDriverInfo.rhelversion)
                && Objects.equals(this.srcversion, nestedGpuDriverInfo.srcversion)
                && Objects.equals(this.supported, nestedGpuDriverInfo.supported)
                && Objects.equals(this.vermagic, nestedGpuDriverInfo.vermagic)
                && Objects.equals(this.version, nestedGpuDriverInfo.version);
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
        return Objects.hash(filename, name, rhelversion, srcversion, supported, vermagic, version);
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
        sb.append("class NestedGpuDriverInfo {\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rhelversion: ").append(toIndentedString(rhelversion)).append("\n");
        sb.append("    srcversion: ").append(toIndentedString(srcversion)).append("\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    vermagic: ").append(toIndentedString(vermagic)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
