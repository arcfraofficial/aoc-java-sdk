package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ContentLibraryVmTemplateVolumeStoragePlacement */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateVolumeStoragePlacement
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS =
            "raw_file_storage_configs";

    @SerializedName(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS)
    private List<ContentLibraryVmTemplateStorageConfig> rawFileStorageConfigs =
            new ArrayList<ContentLibraryVmTemplateStorageConfig>();

    public static final String SERIALIZED_NAME_VOLUME_ID = "volume_id";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public ContentLibraryVmTemplateVolumeStoragePlacement() {}

    public ContentLibraryVmTemplateVolumeStoragePlacement rawFileStorageConfigs(
            List<ContentLibraryVmTemplateStorageConfig> rawFileStorageConfigs) {

        this.rawFileStorageConfigs = rawFileStorageConfigs;
        return this;
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement addRawFileStorageConfigsItem(
            ContentLibraryVmTemplateStorageConfig rawFileStorageConfigsItem) {
        this.rawFileStorageConfigs.add(rawFileStorageConfigsItem);
        return this;
    }

    /**
     * Storage targets for this volume&#39;s raw file copies.
     *
     * @return rawFileStorageConfigs
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Storage targets for this volume's raw file copies.")
    public List<ContentLibraryVmTemplateStorageConfig> getRawFileStorageConfigs() {
        return rawFileStorageConfigs;
    }

    public void setRawFileStorageConfigs(
            List<ContentLibraryVmTemplateStorageConfig> rawFileStorageConfigs) {
        this.rawFileStorageConfigs = rawFileStorageConfigs;
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement rawFileStorageConfigs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS);
        return this;
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement rawFileStorageConfigs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS);
        return this;
    }

    public void setRawFileStorageConfigs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS);
        }
    }

    public boolean getRawFileStorageConfigs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RAW_FILE_STORAGE_CONFIGS);
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement volumeId(String volumeId) {

        this.volumeId = volumeId;
        return this;
    }

    /**
     * Database ID of a volume belonging to the source VM.
     *
     * @return volumeId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Database ID of a volume belonging to the source VM.")
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement volumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_ID);
        return this;
    }

    public ContentLibraryVmTemplateVolumeStoragePlacement volumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_ID);
        return this;
    }

    public void setVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_ID);
        }
    }

    public boolean getVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryVmTemplateVolumeStoragePlacement
                contentLibraryVmTemplateVolumeStoragePlacement =
                        (ContentLibraryVmTemplateVolumeStoragePlacement) o;
        return Objects.equals(
                        this.rawFileStorageConfigs,
                        contentLibraryVmTemplateVolumeStoragePlacement.rawFileStorageConfigs)
                && Objects.equals(
                        this.volumeId, contentLibraryVmTemplateVolumeStoragePlacement.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rawFileStorageConfigs, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmTemplateVolumeStoragePlacement {\n");
        sb.append("    rawFileStorageConfigs: ")
                .append(toIndentedString(rawFileStorageConfigs))
                .append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
