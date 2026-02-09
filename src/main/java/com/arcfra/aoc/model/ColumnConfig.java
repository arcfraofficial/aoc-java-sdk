package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ColumnConfig */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ColumnConfig extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public ColumnConfig() {}

    public ColumnConfig name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColumnConfig name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ColumnConfig name_ExplictlyNonNull() {
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

    public ColumnConfig path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ColumnConfig path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public ColumnConfig path_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnConfig columnConfig = (ColumnConfig) o;
        return Objects.equals(this.name, columnConfig.name)
                && Objects.equals(this.path, columnConfig.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
