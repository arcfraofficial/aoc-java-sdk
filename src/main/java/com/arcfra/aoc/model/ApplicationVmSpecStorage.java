package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ApplicationVmSpecStorage */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecStorage
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";

    @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
    private ByteUnit sizeUnit;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public ApplicationVmSpecStorage() {}

    public ApplicationVmSpecStorage sizeUnit(ByteUnit sizeUnit) {

        this.sizeUnit = sizeUnit;
        return this;
    }

    /**
     * Get sizeUnit
     *
     * @return sizeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(ByteUnit sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public ApplicationVmSpecStorage sizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_UNIT);
        return this;
    }

    public ApplicationVmSpecStorage sizeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_UNIT);
        return this;
    }

    public void setSizeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_UNIT);
        }
    }

    public boolean getSizeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_UNIT);
    }

    public ApplicationVmSpecStorage size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ApplicationVmSpecStorage size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public ApplicationVmSpecStorage size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecStorage applicationVmSpecStorage = (ApplicationVmSpecStorage) o;
        return Objects.equals(this.sizeUnit, applicationVmSpecStorage.sizeUnit)
                && Objects.equals(this.size, applicationVmSpecStorage.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeUnit, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecStorage {\n");
        sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
