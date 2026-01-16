package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVgpuType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVgpuType extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FRAMEBUFFER = "framebuffer";

    @SerializedName(SERIALIZED_NAME_FRAMEBUFFER)
    private Double framebuffer;

    public static final String SERIALIZED_NAME_MAX_INSTANCE = "max_instance";

    @SerializedName(SERIALIZED_NAME_MAX_INSTANCE)
    private Integer maxInstance;

    public static final String SERIALIZED_NAME_MAX_RESOLUTION = "max_resolution";

    @SerializedName(SERIALIZED_NAME_MAX_RESOLUTION)
    private String maxResolution;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VGPU_TYPE_ID = "vgpu_type_id";

    @SerializedName(SERIALIZED_NAME_VGPU_TYPE_ID)
    private String vgpuTypeId;

    public NestedVgpuType() {}

    public NestedVgpuType framebuffer(Double framebuffer) {

        this.framebuffer = framebuffer;
        return this;
    }

    /**
     * Get framebuffer
     *
     * @return framebuffer
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getFramebuffer() {
        return framebuffer;
    }

    public void setFramebuffer(Double framebuffer) {
        this.framebuffer = framebuffer;
    }

    public NestedVgpuType framebuffer_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FRAMEBUFFER);
        return this;
    }

    public NestedVgpuType framebuffer_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FRAMEBUFFER);
        return this;
    }

    public void setFramebuffer_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FRAMEBUFFER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FRAMEBUFFER);
        }
    }

    public boolean getFramebuffer_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FRAMEBUFFER);
    }

    public NestedVgpuType maxInstance(Integer maxInstance) {

        this.maxInstance = maxInstance;
        return this;
    }

    /**
     * Get maxInstance
     *
     * @return maxInstance
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxInstance() {
        return maxInstance;
    }

    public void setMaxInstance(Integer maxInstance) {
        this.maxInstance = maxInstance;
    }

    public NestedVgpuType maxInstance_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_INSTANCE);
        return this;
    }

    public NestedVgpuType maxInstance_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_INSTANCE);
        return this;
    }

    public void setMaxInstance_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_INSTANCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_INSTANCE);
        }
    }

    public boolean getMaxInstance_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_INSTANCE);
    }

    public NestedVgpuType maxResolution(String maxResolution) {

        this.maxResolution = maxResolution;
        return this;
    }

    /**
     * Get maxResolution
     *
     * @return maxResolution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }

    public NestedVgpuType maxResolution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RESOLUTION);
        return this;
    }

    public NestedVgpuType maxResolution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RESOLUTION);
        return this;
    }

    public void setMaxResolution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RESOLUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RESOLUTION);
        }
    }

    public boolean getMaxResolution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RESOLUTION);
    }

    public NestedVgpuType name(String name) {

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

    public NestedVgpuType name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedVgpuType name_ExplictlyNonNull() {
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

    public NestedVgpuType vgpuTypeId(String vgpuTypeId) {

        this.vgpuTypeId = vgpuTypeId;
        return this;
    }

    /**
     * Get vgpuTypeId
     *
     * @return vgpuTypeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVgpuTypeId() {
        return vgpuTypeId;
    }

    public void setVgpuTypeId(String vgpuTypeId) {
        this.vgpuTypeId = vgpuTypeId;
    }

    public NestedVgpuType vgpuTypeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VGPU_TYPE_ID);
        return this;
    }

    public NestedVgpuType vgpuTypeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VGPU_TYPE_ID);
        return this;
    }

    public void setVgpuTypeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VGPU_TYPE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VGPU_TYPE_ID);
        }
    }

    public boolean getVgpuTypeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VGPU_TYPE_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVgpuType nestedVgpuType = (NestedVgpuType) o;
        return Objects.equals(this.framebuffer, nestedVgpuType.framebuffer)
                && Objects.equals(this.maxInstance, nestedVgpuType.maxInstance)
                && Objects.equals(this.maxResolution, nestedVgpuType.maxResolution)
                && Objects.equals(this.name, nestedVgpuType.name)
                && Objects.equals(this.vgpuTypeId, nestedVgpuType.vgpuTypeId);
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
        return Objects.hash(framebuffer, maxInstance, maxResolution, name, vgpuTypeId);
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
        sb.append("class NestedVgpuType {\n");
        sb.append("    framebuffer: ").append(toIndentedString(framebuffer)).append("\n");
        sb.append("    maxInstance: ").append(toIndentedString(maxInstance)).append("\n");
        sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vgpuTypeId: ").append(toIndentedString(vgpuTypeId)).append("\n");
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
