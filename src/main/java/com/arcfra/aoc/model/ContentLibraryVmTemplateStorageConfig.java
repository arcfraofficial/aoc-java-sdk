package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Storage target for a template file. Currently only VCFS datastores are supported. */
@ApiModel(
        description =
                "Storage target for a template file. Currently only VCFS datastores are supported.")
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateStorageConfig
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE_ID = "datastore_id";

    @SerializedName(SERIALIZED_NAME_DATASTORE_ID)
    private String datastoreId;

    public ContentLibraryVmTemplateStorageConfig() {}

    public ContentLibraryVmTemplateStorageConfig datastoreId(String datastoreId) {

        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * VCFS Datastore.id. Clustered-storage targets can be added to this type later.
     *
     * @return datastoreId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "VCFS Datastore.id. Clustered-storage targets can be added to this type later.")
    public String getDatastoreId() {
        return datastoreId;
    }

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    public ContentLibraryVmTemplateStorageConfig datastoreId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public ContentLibraryVmTemplateStorageConfig datastoreId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public void setDatastoreId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        }
    }

    public boolean getDatastoreId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryVmTemplateStorageConfig contentLibraryVmTemplateStorageConfig =
                (ContentLibraryVmTemplateStorageConfig) o;
        return Objects.equals(this.datastoreId, contentLibraryVmTemplateStorageConfig.datastoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmTemplateStorageConfig {\n");
        sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
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
