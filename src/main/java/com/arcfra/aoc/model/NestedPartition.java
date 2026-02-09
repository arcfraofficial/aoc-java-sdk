package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedPartition */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedPartition extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private PartitionUsage usage;

    public static final String SERIALIZED_NAME_USED_SIZE = "used_size";

    @SerializedName(SERIALIZED_NAME_USED_SIZE)
    private Long usedSize;

    public NestedPartition() {}

    public NestedPartition name(String name) {

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

    public NestedPartition name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedPartition name_ExplictlyNonNull() {
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

    public NestedPartition path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public NestedPartition path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public NestedPartition path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public NestedPartition size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public NestedPartition size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedPartition size_ExplictlyNonNull() {
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

    public NestedPartition usage(PartitionUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public PartitionUsage getUsage() {
        return usage;
    }

    public void setUsage(PartitionUsage usage) {
        this.usage = usage;
    }

    public NestedPartition usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public NestedPartition usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    public NestedPartition usedSize(Long usedSize) {

        this.usedSize = usedSize;
        return this;
    }

    /**
     * Get usedSize
     *
     * @return usedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public NestedPartition usedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public NestedPartition usedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public void setUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        }
    }

    public boolean getUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_SIZE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedPartition nestedPartition = (NestedPartition) o;
        return Objects.equals(this.name, nestedPartition.name)
                && Objects.equals(this.path, nestedPartition.path)
                && Objects.equals(this.size, nestedPartition.size)
                && Objects.equals(this.usage, nestedPartition.usage)
                && Objects.equals(this.usedSize, nestedPartition.usedSize);
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
        return Objects.hash(name, path, size, usage, usedSize);
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
        sb.append("class NestedPartition {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
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
