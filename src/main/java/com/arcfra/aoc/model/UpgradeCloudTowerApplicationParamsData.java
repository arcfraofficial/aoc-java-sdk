package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpgradeCloudTowerApplicationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpgradeCloudTowerApplicationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
    private String targetPackage;

    public UpgradeCloudTowerApplicationParamsData() {}

    public UpgradeCloudTowerApplicationParamsData targetPackage(String targetPackage) {

        this.targetPackage = targetPackage;
        return this;
    }

    /**
     * Get targetPackage
     *
     * @return targetPackage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public UpgradeCloudTowerApplicationParamsData targetPackage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public UpgradeCloudTowerApplicationParamsData targetPackage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public void setTargetPackage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        }
    }

    public boolean getTargetPackage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpgradeCloudTowerApplicationParamsData upgradeCloudTowerApplicationParamsData =
                (UpgradeCloudTowerApplicationParamsData) o;
        return Objects.equals(
                this.targetPackage, upgradeCloudTowerApplicationParamsData.targetPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeCloudTowerApplicationParamsData {\n");
        sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
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
