package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportTemplateCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReportTemplateCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RESOURCE_META = "resource_meta";

    @SerializedName(SERIALIZED_NAME_RESOURCE_META)
    private List<ResourceMeta> resourceMeta = new ArrayList<ResourceMeta>();

    public static final String SERIALIZED_NAME_EXECUTE_PLAN = "execute_plan";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN)
    private List<ExecutePlan> executePlan = new ArrayList<ExecutePlan>();

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ReportTemplateCreationParams() {}

    public ReportTemplateCreationParams resourceMeta(List<ResourceMeta> resourceMeta) {

        this.resourceMeta = resourceMeta;
        return this;
    }

    public ReportTemplateCreationParams addResourceMetaItem(ResourceMeta resourceMetaItem) {
        this.resourceMeta.add(resourceMetaItem);
        return this;
    }

    /**
     * Get resourceMeta
     *
     * @return resourceMeta
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ResourceMeta> getResourceMeta() {
        return resourceMeta;
    }

    public void setResourceMeta(List<ResourceMeta> resourceMeta) {
        this.resourceMeta = resourceMeta;
    }

    public ReportTemplateCreationParams resourceMeta_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_META);
        return this;
    }

    public ReportTemplateCreationParams resourceMeta_ExplictlyNonNull() {
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

    public ReportTemplateCreationParams executePlan(List<ExecutePlan> executePlan) {

        this.executePlan = executePlan;
        return this;
    }

    public ReportTemplateCreationParams addExecutePlanItem(ExecutePlan executePlanItem) {
        this.executePlan.add(executePlanItem);
        return this;
    }

    /**
     * Get executePlan
     *
     * @return executePlan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ExecutePlan> getExecutePlan() {
        return executePlan;
    }

    public void setExecutePlan(List<ExecutePlan> executePlan) {
        this.executePlan = executePlan;
    }

    public ReportTemplateCreationParams executePlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN);
        return this;
    }

    public ReportTemplateCreationParams executePlan_ExplictlyNonNull() {
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

    public ReportTemplateCreationParams description(String description) {

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

    public ReportTemplateCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReportTemplateCreationParams description_ExplictlyNonNull() {
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

    public ReportTemplateCreationParams name(String name) {

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

    public ReportTemplateCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReportTemplateCreationParams name_ExplictlyNonNull() {
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
        ReportTemplateCreationParams reportTemplateCreationParams =
                (ReportTemplateCreationParams) o;
        return Objects.equals(this.resourceMeta, reportTemplateCreationParams.resourceMeta)
                && Objects.equals(this.executePlan, reportTemplateCreationParams.executePlan)
                && Objects.equals(this.description, reportTemplateCreationParams.description)
                && Objects.equals(this.name, reportTemplateCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceMeta, executePlan, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportTemplateCreationParams {\n");
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
