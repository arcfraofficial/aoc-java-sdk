package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVmVolumeTemplateRawFile */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVmVolumeTemplateRawFile
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private NestedDatastore datastore;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public NestedVmVolumeTemplateRawFile() {}

    public NestedVmVolumeTemplateRawFile datastore(NestedDatastore datastore) {

        this.datastore = datastore;
        return this;
    }

    /**
     * Get datastore
     *
     * @return datastore
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(NestedDatastore datastore) {
        this.datastore = datastore;
    }

    public NestedVmVolumeTemplateRawFile datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public NestedVmVolumeTemplateRawFile datastore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public void setDatastore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        }
    }

    public boolean getDatastore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE);
    }

    public NestedVmVolumeTemplateRawFile id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NestedVmVolumeTemplateRawFile id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVmVolumeTemplateRawFile id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public NestedVmVolumeTemplateRawFile name(String name) {

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

    public NestedVmVolumeTemplateRawFile name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedVmVolumeTemplateRawFile name_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateRawFile path(String path) {

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

    public NestedVmVolumeTemplateRawFile path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public NestedVmVolumeTemplateRawFile path_ExplictlyNonNull() {
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
        NestedVmVolumeTemplateRawFile nestedVmVolumeTemplateRawFile =
                (NestedVmVolumeTemplateRawFile) o;
        return Objects.equals(this.datastore, nestedVmVolumeTemplateRawFile.datastore)
                && Objects.equals(this.id, nestedVmVolumeTemplateRawFile.id)
                && Objects.equals(this.name, nestedVmVolumeTemplateRawFile.name)
                && Objects.equals(this.path, nestedVmVolumeTemplateRawFile.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore, id, name, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVmVolumeTemplateRawFile {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
