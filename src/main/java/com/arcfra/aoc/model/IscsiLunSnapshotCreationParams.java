package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunSnapshotCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunSnapshotCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EFFECT = "effect";

    @SerializedName(SERIALIZED_NAME_EFFECT)
    private IscsiLunSnapshotCreationEffect effect;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_ID = "iscsi_target_id";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_ID)
    private String iscsiTargetId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID = "iscsi_lun_id";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID)
    private String iscsiLunId;

    public IscsiLunSnapshotCreationParams() {}

    public IscsiLunSnapshotCreationParams effect(IscsiLunSnapshotCreationEffect effect) {

        this.effect = effect;
        return this;
    }

    /**
     * Get effect
     *
     * @return effect
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunSnapshotCreationEffect getEffect() {
        return effect;
    }

    public void setEffect(IscsiLunSnapshotCreationEffect effect) {
        this.effect = effect;
    }

    public IscsiLunSnapshotCreationParams effect_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EFFECT);
        return this;
    }

    public IscsiLunSnapshotCreationParams effect_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EFFECT);
        return this;
    }

    public void setEffect_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EFFECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EFFECT);
        }
    }

    public boolean getEffect_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EFFECT);
    }

    public IscsiLunSnapshotCreationParams iscsiTargetId(String iscsiTargetId) {

        this.iscsiTargetId = iscsiTargetId;
        return this;
    }

    /**
     * Get iscsiTargetId
     *
     * @return iscsiTargetId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIscsiTargetId() {
        return iscsiTargetId;
    }

    public void setIscsiTargetId(String iscsiTargetId) {
        this.iscsiTargetId = iscsiTargetId;
    }

    public IscsiLunSnapshotCreationParams iscsiTargetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_ID);
        return this;
    }

    public IscsiLunSnapshotCreationParams iscsiTargetId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_ID);
        return this;
    }

    public void setIscsiTargetId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_ID);
        }
    }

    public boolean getIscsiTargetId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_ID);
    }

    public IscsiLunSnapshotCreationParams name(String name) {

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

    public IscsiLunSnapshotCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public IscsiLunSnapshotCreationParams name_ExplictlyNonNull() {
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

    public IscsiLunSnapshotCreationParams iscsiLunId(String iscsiLunId) {

        this.iscsiLunId = iscsiLunId;
        return this;
    }

    /**
     * Get iscsiLunId
     *
     * @return iscsiLunId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIscsiLunId() {
        return iscsiLunId;
    }

    public void setIscsiLunId(String iscsiLunId) {
        this.iscsiLunId = iscsiLunId;
    }

    public IscsiLunSnapshotCreationParams iscsiLunId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public IscsiLunSnapshotCreationParams iscsiLunId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public void setIscsiLunId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        }
    }

    public boolean getIscsiLunId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunSnapshotCreationParams iscsiLunSnapshotCreationParams =
                (IscsiLunSnapshotCreationParams) o;
        return Objects.equals(this.effect, iscsiLunSnapshotCreationParams.effect)
                && Objects.equals(this.iscsiTargetId, iscsiLunSnapshotCreationParams.iscsiTargetId)
                && Objects.equals(this.name, iscsiLunSnapshotCreationParams.name)
                && Objects.equals(this.iscsiLunId, iscsiLunSnapshotCreationParams.iscsiLunId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, iscsiTargetId, name, iscsiLunId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunSnapshotCreationParams {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    iscsiTargetId: ").append(toIndentedString(iscsiTargetId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    iscsiLunId: ").append(toIndentedString(iscsiLunId)).append("\n");
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
