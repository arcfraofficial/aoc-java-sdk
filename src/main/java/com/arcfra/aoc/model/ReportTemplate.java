package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReportTemplate */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReportTemplate extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN = "execute_plan";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN)
    private List<NestedExecutePlan> executePlan = new ArrayList<NestedExecutePlan>();

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PRESET = "preset";

    @SerializedName(SERIALIZED_NAME_PRESET)
    private String preset;

    public static final String SERIALIZED_NAME_RESOURCE_META = "resource_meta";

    @SerializedName(SERIALIZED_NAME_RESOURCE_META)
    private List<NestedResourceMeta> resourceMeta = new ArrayList<NestedResourceMeta>();

    public static final String SERIALIZED_NAME_TASK_NUM = "task_num";

    @SerializedName(SERIALIZED_NAME_TASK_NUM)
    private Integer taskNum;

    public static final String SERIALIZED_NAME_TASKS = "tasks";

    @SerializedName(SERIALIZED_NAME_TASKS)
    private List<NestedReportTask> tasks = null;

    public ReportTemplate() {}

    public ReportTemplate createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ReportTemplate createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReportTemplate createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public ReportTemplate description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReportTemplate description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReportTemplate description_ExplictlyNonNull() {
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

    public ReportTemplate executePlan(List<NestedExecutePlan> executePlan) {

        this.executePlan = executePlan;
        return this;
    }

    public ReportTemplate addExecutePlanItem(NestedExecutePlan executePlanItem) {
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
    public List<NestedExecutePlan> getExecutePlan() {
        return executePlan;
    }

    public void setExecutePlan(List<NestedExecutePlan> executePlan) {
        this.executePlan = executePlan;
    }

    public ReportTemplate executePlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN);
        return this;
    }

    public ReportTemplate executePlan_ExplictlyNonNull() {
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

    public ReportTemplate id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReportTemplate id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReportTemplate id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public ReportTemplate name(String name) {

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

    public ReportTemplate name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReportTemplate name_ExplictlyNonNull() {
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

    public ReportTemplate preset(String preset) {

        this.preset = preset;
        return this;
    }

    /**
     * Get preset
     *
     * @return preset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public ReportTemplate preset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET);
        return this;
    }

    public ReportTemplate preset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        return this;
    }

    public void setPreset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        }
    }

    public boolean getPreset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET);
    }

    public ReportTemplate resourceMeta(List<NestedResourceMeta> resourceMeta) {

        this.resourceMeta = resourceMeta;
        return this;
    }

    public ReportTemplate addResourceMetaItem(NestedResourceMeta resourceMetaItem) {
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
    public List<NestedResourceMeta> getResourceMeta() {
        return resourceMeta;
    }

    public void setResourceMeta(List<NestedResourceMeta> resourceMeta) {
        this.resourceMeta = resourceMeta;
    }

    public ReportTemplate resourceMeta_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_META);
        return this;
    }

    public ReportTemplate resourceMeta_ExplictlyNonNull() {
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

    public ReportTemplate taskNum(Integer taskNum) {

        this.taskNum = taskNum;
        return this;
    }

    /**
     * Get taskNum
     *
     * @return taskNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public ReportTemplate taskNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM);
        return this;
    }

    public ReportTemplate taskNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM);
        return this;
    }

    public void setTaskNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM);
        }
    }

    public boolean getTaskNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM);
    }

    public ReportTemplate tasks(List<NestedReportTask> tasks) {

        this.tasks = tasks;
        return this;
    }

    public ReportTemplate addTasksItem(NestedReportTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<NestedReportTask>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    /**
     * Get tasks
     *
     * @return tasks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReportTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<NestedReportTask> tasks) {
        this.tasks = tasks;
    }

    public ReportTemplate tasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS);
        return this;
    }

    public ReportTemplate tasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        return this;
    }

    public void setTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        }
    }

    public boolean getTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTemplate reportTemplate = (ReportTemplate) o;
        return Objects.equals(this.createdAt, reportTemplate.createdAt)
                && Objects.equals(this.description, reportTemplate.description)
                && Objects.equals(this.executePlan, reportTemplate.executePlan)
                && Objects.equals(this.id, reportTemplate.id)
                && Objects.equals(this.name, reportTemplate.name)
                && Objects.equals(this.preset, reportTemplate.preset)
                && Objects.equals(this.resourceMeta, reportTemplate.resourceMeta)
                && Objects.equals(this.taskNum, reportTemplate.taskNum)
                && Objects.equals(this.tasks, reportTemplate.tasks);
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
        return Objects.hash(
                createdAt,
                description,
                executePlan,
                id,
                name,
                preset,
                resourceMeta,
                taskNum,
                tasks);
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
        sb.append("class ReportTemplate {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    executePlan: ").append(toIndentedString(executePlan)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    resourceMeta: ").append(toIndentedString(resourceMeta)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
