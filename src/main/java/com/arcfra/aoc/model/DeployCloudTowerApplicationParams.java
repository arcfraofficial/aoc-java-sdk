package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DeployCloudTowerApplicationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DeployCloudTowerApplicationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
    private String targetPackage;

    public static final String SERIALIZED_NAME_VM_SPEC = "vmSpec";

    @SerializedName(SERIALIZED_NAME_VM_SPEC)
    private ApplicationVmSpecDefinition vmSpec;

    public DeployCloudTowerApplicationParams() {}

    public DeployCloudTowerApplicationParams name(String name) {

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

    public DeployCloudTowerApplicationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public DeployCloudTowerApplicationParams name_ExplictlyNonNull() {
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

    public DeployCloudTowerApplicationParams targetPackage(String targetPackage) {

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

    public DeployCloudTowerApplicationParams targetPackage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public DeployCloudTowerApplicationParams targetPackage_ExplictlyNonNull() {
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

    public DeployCloudTowerApplicationParams vmSpec(ApplicationVmSpecDefinition vmSpec) {

        this.vmSpec = vmSpec;
        return this;
    }

    /**
     * Get vmSpec
     *
     * @return vmSpec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ApplicationVmSpecDefinition getVmSpec() {
        return vmSpec;
    }

    public void setVmSpec(ApplicationVmSpecDefinition vmSpec) {
        this.vmSpec = vmSpec;
    }

    public DeployCloudTowerApplicationParams vmSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public DeployCloudTowerApplicationParams vmSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public void setVmSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        }
    }

    public boolean getVmSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SPEC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployCloudTowerApplicationParams deployCloudTowerApplicationParams =
                (DeployCloudTowerApplicationParams) o;
        return Objects.equals(this.name, deployCloudTowerApplicationParams.name)
                && Objects.equals(
                        this.targetPackage, deployCloudTowerApplicationParams.targetPackage)
                && Objects.equals(this.vmSpec, deployCloudTowerApplicationParams.vmSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, targetPackage, vmSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployCloudTowerApplicationParams {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
        sb.append("    vmSpec: ").append(toIndentedString(vmSpec)).append("\n");
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
