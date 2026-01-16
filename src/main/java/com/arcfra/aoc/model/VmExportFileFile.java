package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmExportFileFile */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportFileFile extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MD5 = "md5";

    @SerializedName(SERIALIZED_NAME_MD5)
    private String md5;

    public static final String SERIALIZED_NAME_FILE_SIZE = "fileSize";

    @SerializedName(SERIALIZED_NAME_FILE_SIZE)
    private Long fileSize;

    public static final String SERIALIZED_NAME_FILE_SECRET = "fileSecret";

    @SerializedName(SERIALIZED_NAME_FILE_SECRET)
    private String fileSecret;

    public static final String SERIALIZED_NAME_FILE_U_U_I_D = "fileUUID";

    @SerializedName(SERIALIZED_NAME_FILE_U_U_I_D)
    private String fileUUID;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmExportFileType type;

    public static final String SERIALIZED_NAME_FILE_NAME = "fileName";

    @SerializedName(SERIALIZED_NAME_FILE_NAME)
    private String fileName;

    public VmExportFileFile() {}

    public VmExportFileFile md5(String md5) {

        this.md5 = md5;
        return this;
    }

    /**
     * Get md5
     *
     * @return md5
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public VmExportFileFile md5_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MD5);
        return this;
    }

    public VmExportFileFile md5_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MD5);
        return this;
    }

    public void setMd5_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MD5);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MD5);
        }
    }

    public boolean getMd5_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MD5);
    }

    public VmExportFileFile fileSize(Long fileSize) {

        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get fileSize
     *
     * @return fileSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public VmExportFileFile fileSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_SIZE);
        return this;
    }

    public VmExportFileFile fileSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_SIZE);
        return this;
    }

    public void setFileSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_SIZE);
        }
    }

    public boolean getFileSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_SIZE);
    }

    public VmExportFileFile fileSecret(String fileSecret) {

        this.fileSecret = fileSecret;
        return this;
    }

    /**
     * Get fileSecret
     *
     * @return fileSecret
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFileSecret() {
        return fileSecret;
    }

    public void setFileSecret(String fileSecret) {
        this.fileSecret = fileSecret;
    }

    public VmExportFileFile fileSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_SECRET);
        return this;
    }

    public VmExportFileFile fileSecret_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_SECRET);
        return this;
    }

    public void setFileSecret_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_SECRET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_SECRET);
        }
    }

    public boolean getFileSecret_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_SECRET);
    }

    public VmExportFileFile fileUUID(String fileUUID) {

        this.fileUUID = fileUUID;
        return this;
    }

    /**
     * Get fileUUID
     *
     * @return fileUUID
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFileUUID() {
        return fileUUID;
    }

    public void setFileUUID(String fileUUID) {
        this.fileUUID = fileUUID;
    }

    public VmExportFileFile fileUUID_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_U_U_I_D);
        return this;
    }

    public VmExportFileFile fileUUID_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_U_U_I_D);
        return this;
    }

    public void setFileUUID_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_U_U_I_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_U_U_I_D);
        }
    }

    public boolean getFileUUID_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_U_U_I_D);
    }

    public VmExportFileFile type(VmExportFileType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmExportFileType getType() {
        return type;
    }

    public void setType(VmExportFileType type) {
        this.type = type;
    }

    public VmExportFileFile type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmExportFileFile type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public VmExportFileFile fileName(String fileName) {

        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     *
     * @return fileName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public VmExportFileFile fileName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_NAME);
        return this;
    }

    public VmExportFileFile fileName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_NAME);
        return this;
    }

    public void setFileName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_NAME);
        }
    }

    public boolean getFileName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmExportFileFile vmExportFileFile = (VmExportFileFile) o;
        return Objects.equals(this.md5, vmExportFileFile.md5)
                && Objects.equals(this.fileSize, vmExportFileFile.fileSize)
                && Objects.equals(this.fileSecret, vmExportFileFile.fileSecret)
                && Objects.equals(this.fileUUID, vmExportFileFile.fileUUID)
                && Objects.equals(this.type, vmExportFileFile.type)
                && Objects.equals(this.fileName, vmExportFileFile.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(md5, fileSize, fileSecret, fileUUID, type, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmExportFileFile {\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileSecret: ").append(toIndentedString(fileSecret)).append("\n");
        sb.append("    fileUUID: ").append(toIndentedString(fileUUID)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
