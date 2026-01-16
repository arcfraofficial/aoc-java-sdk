package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedSnapshotInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedSnapshotInfo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID = "iscsi_lun_snapshot_uuid";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID)
    private String iscsiLunSnapshotUuid;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
    private Boolean storageEncrypted;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_CONFIG = "storage_policy_config";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_CONFIG)
    private NestedStoragePolicyConfig storagePolicyConfig;

    public NestedSnapshotInfo() {}

    public NestedSnapshotInfo index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public NestedSnapshotInfo index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedSnapshotInfo index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public NestedSnapshotInfo iscsiLunSnapshotUuid(String iscsiLunSnapshotUuid) {

        this.iscsiLunSnapshotUuid = iscsiLunSnapshotUuid;
        return this;
    }

    /**
     * Get iscsiLunSnapshotUuid
     *
     * @return iscsiLunSnapshotUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIscsiLunSnapshotUuid() {
        return iscsiLunSnapshotUuid;
    }

    public void setIscsiLunSnapshotUuid(String iscsiLunSnapshotUuid) {
        this.iscsiLunSnapshotUuid = iscsiLunSnapshotUuid;
    }

    public NestedSnapshotInfo iscsiLunSnapshotUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID);
        return this;
    }

    public NestedSnapshotInfo iscsiLunSnapshotUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID);
        return this;
    }

    public void setIscsiLunSnapshotUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID);
        }
    }

    public boolean getIscsiLunSnapshotUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_UUID);
    }

    public NestedSnapshotInfo storageEncrypted(Boolean storageEncrypted) {

        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Get storageEncrypted
     *
     * @return storageEncrypted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public NestedSnapshotInfo storageEncrypted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public NestedSnapshotInfo storageEncrypted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public void setStorageEncrypted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        }
    }

    public boolean getStorageEncrypted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED);
    }

    public NestedSnapshotInfo storagePolicyConfig(NestedStoragePolicyConfig storagePolicyConfig) {

        this.storagePolicyConfig = storagePolicyConfig;
        return this;
    }

    /**
     * Get storagePolicyConfig
     *
     * @return storagePolicyConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedStoragePolicyConfig getStoragePolicyConfig() {
        return storagePolicyConfig;
    }

    public void setStoragePolicyConfig(NestedStoragePolicyConfig storagePolicyConfig) {
        this.storagePolicyConfig = storagePolicyConfig;
    }

    public NestedSnapshotInfo storagePolicyConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_CONFIG);
        return this;
    }

    public NestedSnapshotInfo storagePolicyConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_CONFIG);
        return this;
    }

    public void setStoragePolicyConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_CONFIG);
        }
    }

    public boolean getStoragePolicyConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_CONFIG);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedSnapshotInfo nestedSnapshotInfo = (NestedSnapshotInfo) o;
        return Objects.equals(this.index, nestedSnapshotInfo.index)
                && Objects.equals(
                        this.iscsiLunSnapshotUuid, nestedSnapshotInfo.iscsiLunSnapshotUuid)
                && Objects.equals(this.storageEncrypted, nestedSnapshotInfo.storageEncrypted)
                && Objects.equals(this.storagePolicyConfig, nestedSnapshotInfo.storagePolicyConfig);
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
        return Objects.hash(index, iscsiLunSnapshotUuid, storageEncrypted, storagePolicyConfig);
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
        sb.append("class NestedSnapshotInfo {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    iscsiLunSnapshotUuid: ")
                .append(toIndentedString(iscsiLunSnapshotUuid))
                .append("\n");
        sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
        sb.append("    storagePolicyConfig: ")
                .append(toIndentedString(storagePolicyConfig))
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
