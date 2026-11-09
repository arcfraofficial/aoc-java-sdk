package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVmVolumeTemplateConfigFile */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVmVolumeTemplateConfigFile
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private NestedDatastore datastore;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_RAW_FILES = "raw_files";

    @SerializedName(SERIALIZED_NAME_RAW_FILES)
    private List<NestedVmVolumeTemplateRawFile> rawFiles = null;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_VCFS_VERSION = "vcfs_version";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION)
    private String vcfsVersion;

    public NestedVmVolumeTemplateConfigFile() {}

    public NestedVmVolumeTemplateConfigFile datastore(NestedDatastore datastore) {

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

    public NestedVmVolumeTemplateConfigFile datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile datastore_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateConfigFile id(String id) {

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

    public NestedVmVolumeTemplateConfigFile id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile id_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateConfigFile localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public NestedVmVolumeTemplateConfigFile localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public NestedVmVolumeTemplateConfigFile name(String name) {

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

    public NestedVmVolumeTemplateConfigFile name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile name_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateConfigFile path(String path) {

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

    public NestedVmVolumeTemplateConfigFile path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile path_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateConfigFile rawFiles(List<NestedVmVolumeTemplateRawFile> rawFiles) {

        this.rawFiles = rawFiles;
        return this;
    }

    public NestedVmVolumeTemplateConfigFile addRawFilesItem(
            NestedVmVolumeTemplateRawFile rawFilesItem) {
        if (this.rawFiles == null) {
            this.rawFiles = new ArrayList<NestedVmVolumeTemplateRawFile>();
        }
        this.rawFiles.add(rawFilesItem);
        return this;
    }

    /**
     * Get rawFiles
     *
     * @return rawFiles
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmVolumeTemplateRawFile> getRawFiles() {
        return rawFiles;
    }

    public void setRawFiles(List<NestedVmVolumeTemplateRawFile> rawFiles) {
        this.rawFiles = rawFiles;
    }

    public NestedVmVolumeTemplateConfigFile rawFiles_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RAW_FILES);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile rawFiles_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RAW_FILES);
        return this;
    }

    public void setRawFiles_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RAW_FILES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RAW_FILES);
        }
    }

    public boolean getRawFiles_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RAW_FILES);
    }

    public NestedVmVolumeTemplateConfigFile size(Long size) {

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

    public NestedVmVolumeTemplateConfigFile size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile size_ExplictlyNonNull() {
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

    public NestedVmVolumeTemplateConfigFile vcfsVersion(String vcfsVersion) {

        this.vcfsVersion = vcfsVersion;
        return this;
    }

    /**
     * Get vcfsVersion
     *
     * @return vcfsVersion
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVcfsVersion() {
        return vcfsVersion;
    }

    public void setVcfsVersion(String vcfsVersion) {
        this.vcfsVersion = vcfsVersion;
    }

    public NestedVmVolumeTemplateConfigFile vcfsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION);
        return this;
    }

    public NestedVmVolumeTemplateConfigFile vcfsVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION);
        return this;
    }

    public void setVcfsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION);
        }
    }

    public boolean getVcfsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVmVolumeTemplateConfigFile nestedVmVolumeTemplateConfigFile =
                (NestedVmVolumeTemplateConfigFile) o;
        return Objects.equals(this.datastore, nestedVmVolumeTemplateConfigFile.datastore)
                && Objects.equals(this.id, nestedVmVolumeTemplateConfigFile.id)
                && Objects.equals(this.localId, nestedVmVolumeTemplateConfigFile.localId)
                && Objects.equals(this.name, nestedVmVolumeTemplateConfigFile.name)
                && Objects.equals(this.path, nestedVmVolumeTemplateConfigFile.path)
                && Objects.equals(this.rawFiles, nestedVmVolumeTemplateConfigFile.rawFiles)
                && Objects.equals(this.size, nestedVmVolumeTemplateConfigFile.size)
                && Objects.equals(this.vcfsVersion, nestedVmVolumeTemplateConfigFile.vcfsVersion);
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
        return Objects.hash(datastore, id, localId, name, path, rawFiles, size, vcfsVersion);
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
        sb.append("class NestedVmVolumeTemplateConfigFile {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    rawFiles: ").append(toIndentedString(rawFiles)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    vcfsVersion: ").append(toIndentedString(vcfsVersion)).append("\n");
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
