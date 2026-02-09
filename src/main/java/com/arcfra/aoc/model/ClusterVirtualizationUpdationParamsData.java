package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterVirtualizationUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterVirtualizationUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTO_CONVERGE = "auto_converge";

    @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE)
    private Boolean autoConverge;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL = "current_cpu_model";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL)
    private String currentCpuModel;

    public ClusterVirtualizationUpdationParamsData() {}

    public ClusterVirtualizationUpdationParamsData autoConverge(Boolean autoConverge) {

        this.autoConverge = autoConverge;
        return this;
    }

    /**
     * Get autoConverge
     *
     * @return autoConverge
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAutoConverge() {
        return autoConverge;
    }

    public void setAutoConverge(Boolean autoConverge) {
        this.autoConverge = autoConverge;
    }

    public ClusterVirtualizationUpdationParamsData autoConverge_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public ClusterVirtualizationUpdationParamsData autoConverge_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public void setAutoConverge_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        }
    }

    public boolean getAutoConverge_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_CONVERGE);
    }

    public ClusterVirtualizationUpdationParamsData currentCpuModel(String currentCpuModel) {

        this.currentCpuModel = currentCpuModel;
        return this;
    }

    /**
     * Get currentCpuModel
     *
     * @return currentCpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModel() {
        return currentCpuModel;
    }

    public void setCurrentCpuModel(String currentCpuModel) {
        this.currentCpuModel = currentCpuModel;
    }

    public ClusterVirtualizationUpdationParamsData currentCpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public ClusterVirtualizationUpdationParamsData currentCpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public void setCurrentCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        }
    }

    public boolean getCurrentCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterVirtualizationUpdationParamsData clusterVirtualizationUpdationParamsData =
                (ClusterVirtualizationUpdationParamsData) o;
        return Objects.equals(
                        this.autoConverge, clusterVirtualizationUpdationParamsData.autoConverge)
                && Objects.equals(
                        this.currentCpuModel,
                        clusterVirtualizationUpdationParamsData.currentCpuModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoConverge, currentCpuModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterVirtualizationUpdationParamsData {\n");
        sb.append("    autoConverge: ").append(toIndentedString(autoConverge)).append("\n");
        sb.append("    currentCpuModel: ").append(toIndentedString(currentCpuModel)).append("\n");
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
