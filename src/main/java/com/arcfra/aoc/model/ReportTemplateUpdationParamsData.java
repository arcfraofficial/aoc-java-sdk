package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportTemplateUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReportTemplateUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RESOURCE_META = "resource_meta";

    @SerializedName(SERIALIZED_NAME_RESOURCE_META)
    private List<ResourceMeta> resourceMeta = null;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN = "execute_plan";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN)
    private List<ExecutePlan> executePlan = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ReportTemplateUpdationParamsData() {}

    public ReportTemplateUpdationParamsData resourceMeta(List<ResourceMeta> resourceMeta) {

        this.resourceMeta = resourceMeta;
        return this;
    }

    public ReportTemplateUpdationParamsData addResourceMetaItem(ResourceMeta resourceMetaItem) {
        if (this.resourceMeta == null) {
            this.resourceMeta = new ArrayList<ResourceMeta>();
        }
        this.resourceMeta.add(resourceMetaItem);
        return this;
    }

    /**
     * Get resourceMeta
     *
     * @return resourceMeta
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResourceMeta> getResourceMeta() {
        return resourceMeta;
    }

    public void setResourceMeta(List<ResourceMeta> resourceMeta) {
        this.resourceMeta = resourceMeta;
    }

    public ReportTemplateUpdationParamsData resourceMeta_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_META);
        return this;
    }

    public ReportTemplateUpdationParamsData resourceMeta_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_META);
        return this;
    }

    public void setResourceMeta_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_META);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_META);
        }
    }

    public boolean getResourceMeta_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_META);
    }

    public ReportTemplateUpdationParamsData executePlan(List<ExecutePlan> executePlan) {

        this.executePlan = executePlan;
        return this;
    }

    public ReportTemplateUpdationParamsData addExecutePlanItem(ExecutePlan executePlanItem) {
        if (this.executePlan == null) {
            this.executePlan = new ArrayList<ExecutePlan>();
        }
        this.executePlan.add(executePlanItem);
        return this;
    }

    /**
     * Get executePlan
     *
     * @return executePlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ExecutePlan> getExecutePlan() {
        return executePlan;
    }

    public void setExecutePlan(List<ExecutePlan> executePlan) {
        this.executePlan = executePlan;
    }

    public ReportTemplateUpdationParamsData executePlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN);
        return this;
    }

    public ReportTemplateUpdationParamsData executePlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN);
        return this;
    }

    public void setExecutePlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN);
        }
    }

    public boolean getExecutePlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN);
    }

    public ReportTemplateUpdationParamsData description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReportTemplateUpdationParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReportTemplateUpdationParamsData description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public ReportTemplateUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportTemplateUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReportTemplateUpdationParamsData name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTemplateUpdationParamsData reportTemplateUpdationParamsData =
                (ReportTemplateUpdationParamsData) o;
        return Objects.equals(this.resourceMeta, reportTemplateUpdationParamsData.resourceMeta)
                && Objects.equals(this.executePlan, reportTemplateUpdationParamsData.executePlan)
                && Objects.equals(this.description, reportTemplateUpdationParamsData.description)
                && Objects.equals(this.name, reportTemplateUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceMeta, executePlan, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportTemplateUpdationParamsData {\n");
        sb.append("    resourceMeta: ").append(toIndentedString(resourceMeta)).append("\n");
        sb.append("    executePlan: ").append(toIndentedString(executePlan)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
