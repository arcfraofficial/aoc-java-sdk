package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ContentLibraryVmTemplateStoragePlacement */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateStoragePlacement
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS = "volume_storage_configs";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS)
    private List<ContentLibraryVmTemplateVolumeStoragePlacement> volumeStorageConfigs =
            new ArrayList<ContentLibraryVmTemplateVolumeStoragePlacement>();

    public static final String SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG =
            "config_file_storage_config";

    @SerializedName(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG)
    private ContentLibraryVmTemplateStorageConfig configFileStorageConfig;

    public ContentLibraryVmTemplateStoragePlacement() {}

    public ContentLibraryVmTemplateStoragePlacement volumeStorageConfigs(
            List<ContentLibraryVmTemplateVolumeStoragePlacement> volumeStorageConfigs) {

        this.volumeStorageConfigs = volumeStorageConfigs;
        return this;
    }

    public ContentLibraryVmTemplateStoragePlacement addVolumeStorageConfigsItem(
            ContentLibraryVmTemplateVolumeStoragePlacement volumeStorageConfigsItem) {
        this.volumeStorageConfigs.add(volumeStorageConfigsItem);
        return this;
    }

    /**
     * Get volumeStorageConfigs
     *
     * @return volumeStorageConfigs
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ContentLibraryVmTemplateVolumeStoragePlacement> getVolumeStorageConfigs() {
        return volumeStorageConfigs;
    }

    public void setVolumeStorageConfigs(
            List<ContentLibraryVmTemplateVolumeStoragePlacement> volumeStorageConfigs) {
        this.volumeStorageConfigs = volumeStorageConfigs;
    }

    public ContentLibraryVmTemplateStoragePlacement volumeStorageConfigs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS);
        return this;
    }

    public ContentLibraryVmTemplateStoragePlacement volumeStorageConfigs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS);
        return this;
    }

    public void setVolumeStorageConfigs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS);
        }
    }

    public boolean getVolumeStorageConfigs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_CONFIGS);
    }

    public ContentLibraryVmTemplateStoragePlacement configFileStorageConfig(
            ContentLibraryVmTemplateStorageConfig configFileStorageConfig) {

        this.configFileStorageConfig = configFileStorageConfig;
        return this;
    }

    /**
     * Get configFileStorageConfig
     *
     * @return configFileStorageConfig
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ContentLibraryVmTemplateStorageConfig getConfigFileStorageConfig() {
        return configFileStorageConfig;
    }

    public void setConfigFileStorageConfig(
            ContentLibraryVmTemplateStorageConfig configFileStorageConfig) {
        this.configFileStorageConfig = configFileStorageConfig;
    }

    public ContentLibraryVmTemplateStoragePlacement configFileStorageConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG);
        return this;
    }

    public ContentLibraryVmTemplateStoragePlacement configFileStorageConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG);
        return this;
    }

    public void setConfigFileStorageConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG);
        }
    }

    public boolean getConfigFileStorageConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIG_FILE_STORAGE_CONFIG);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryVmTemplateStoragePlacement contentLibraryVmTemplateStoragePlacement =
                (ContentLibraryVmTemplateStoragePlacement) o;
        return Objects.equals(
                        this.volumeStorageConfigs,
                        contentLibraryVmTemplateStoragePlacement.volumeStorageConfigs)
                && Objects.equals(
                        this.configFileStorageConfig,
                        contentLibraryVmTemplateStoragePlacement.configFileStorageConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeStorageConfigs, configFileStorageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmTemplateStoragePlacement {\n");
        sb.append("    volumeStorageConfigs: ")
                .append(toIndentedString(volumeStorageConfigs))
                .append("\n");
        sb.append("    configFileStorageConfig: ")
                .append(toIndentedString(configFileStorageConfig))
                .append("\n");
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
