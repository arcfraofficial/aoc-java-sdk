package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ApplicationVmSpecDefinition */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecDefinition
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_AFFINITY = "vmAffinity";

    @SerializedName(SERIALIZED_NAME_VM_AFFINITY)
    private ApplicationVmSpecAffinityPolicy vmAffinity;

    public static final String SERIALIZED_NAME_PLACEMENT = "placement";

    @SerializedName(SERIALIZED_NAME_PLACEMENT)
    private ApplicationVmSpecPlacement placement;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_GROUP = "group";

    @SerializedName(SERIALIZED_NAME_GROUP)
    private String group;

    public static final String SERIALIZED_NAME_TEMPLATE = "template";

    @SerializedName(SERIALIZED_NAME_TEMPLATE)
    private ApplicationVmSpec template;

    public static final String SERIALIZED_NAME_INSTANCES = "instances";

    @SerializedName(SERIALIZED_NAME_INSTANCES)
    private List<ApplicationVmSpec> instances = null;

    public ApplicationVmSpecDefinition() {}

    public ApplicationVmSpecDefinition vmAffinity(ApplicationVmSpecAffinityPolicy vmAffinity) {

        this.vmAffinity = vmAffinity;
        return this;
    }

    /**
     * Get vmAffinity
     *
     * @return vmAffinity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationVmSpecAffinityPolicy getVmAffinity() {
        return vmAffinity;
    }

    public void setVmAffinity(ApplicationVmSpecAffinityPolicy vmAffinity) {
        this.vmAffinity = vmAffinity;
    }

    public ApplicationVmSpecDefinition vmAffinity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_AFFINITY);
        return this;
    }

    public ApplicationVmSpecDefinition vmAffinity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_AFFINITY);
        return this;
    }

    public void setVmAffinity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_AFFINITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_AFFINITY);
        }
    }

    public boolean getVmAffinity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_AFFINITY);
    }

    public ApplicationVmSpecDefinition placement(ApplicationVmSpecPlacement placement) {

        this.placement = placement;
        return this;
    }

    /**
     * Get placement
     *
     * @return placement
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationVmSpecPlacement getPlacement() {
        return placement;
    }

    public void setPlacement(ApplicationVmSpecPlacement placement) {
        this.placement = placement;
    }

    public ApplicationVmSpecDefinition placement_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT);
        return this;
    }

    public ApplicationVmSpecDefinition placement_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT);
        return this;
    }

    public void setPlacement_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT);
        }
    }

    public boolean getPlacement_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT);
    }

    public ApplicationVmSpecDefinition name(String name) {

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

    public ApplicationVmSpecDefinition name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ApplicationVmSpecDefinition name_ExplictlyNonNull() {
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

    public ApplicationVmSpecDefinition group(String group) {

        this.group = group;
        return this;
    }

    /**
     * Get group
     *
     * @return group
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ApplicationVmSpecDefinition group_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GROUP);
        return this;
    }

    public ApplicationVmSpecDefinition group_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GROUP);
        return this;
    }

    public void setGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GROUP);
        }
    }

    public boolean getGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GROUP);
    }

    public ApplicationVmSpecDefinition template(ApplicationVmSpec template) {

        this.template = template;
        return this;
    }

    /**
     * Get template
     *
     * @return template
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationVmSpec getTemplate() {
        return template;
    }

    public void setTemplate(ApplicationVmSpec template) {
        this.template = template;
    }

    public ApplicationVmSpecDefinition template_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TEMPLATE);
        return this;
    }

    public ApplicationVmSpecDefinition template_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE);
        return this;
    }

    public void setTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE);
        }
    }

    public boolean getTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TEMPLATE);
    }

    public ApplicationVmSpecDefinition instances(List<ApplicationVmSpec> instances) {

        this.instances = instances;
        return this;
    }

    public ApplicationVmSpecDefinition addInstancesItem(ApplicationVmSpec instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<ApplicationVmSpec>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Get instances
     *
     * @return instances
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationVmSpec> getInstances() {
        return instances;
    }

    public void setInstances(List<ApplicationVmSpec> instances) {
        this.instances = instances;
    }

    public ApplicationVmSpecDefinition instances_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public ApplicationVmSpecDefinition instances_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public void setInstances_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        }
    }

    public boolean getInstances_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecDefinition applicationVmSpecDefinition = (ApplicationVmSpecDefinition) o;
        return Objects.equals(this.vmAffinity, applicationVmSpecDefinition.vmAffinity)
                && Objects.equals(this.placement, applicationVmSpecDefinition.placement)
                && Objects.equals(this.name, applicationVmSpecDefinition.name)
                && Objects.equals(this.group, applicationVmSpecDefinition.group)
                && Objects.equals(this.template, applicationVmSpecDefinition.template)
                && Objects.equals(this.instances, applicationVmSpecDefinition.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmAffinity, placement, name, group, template, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecDefinition {\n");
        sb.append("    vmAffinity: ").append(toIndentedString(vmAffinity)).append("\n");
        sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
