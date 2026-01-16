package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmAddFolderParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddFolderParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";

    @SerializedName(SERIALIZED_NAME_FOLDER_ID)
    private String folderId;

    public VmAddFolderParamsData() {}

    public VmAddFolderParamsData folderId(String folderId) {

        this.folderId = folderId;
        return this;
    }

    /**
     * Get folderId
     *
     * @return folderId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public VmAddFolderParamsData folderId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FOLDER_ID);
        return this;
    }

    public VmAddFolderParamsData folderId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FOLDER_ID);
        return this;
    }

    public void setFolderId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FOLDER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FOLDER_ID);
        }
    }

    public boolean getFolderId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FOLDER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmAddFolderParamsData vmAddFolderParamsData = (VmAddFolderParamsData) o;
        return Objects.equals(this.folderId, vmAddFolderParamsData.folderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmAddFolderParamsData {\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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
