package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TaskStepCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TaskStepCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FINISHED = "finished";

    @SerializedName(SERIALIZED_NAME_FINISHED)
    private Boolean finished;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public TaskStepCreationParams() {}

    public TaskStepCreationParams description(String description) {

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

    public TaskStepCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public TaskStepCreationParams description_ExplictlyNonNull() {
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

    public TaskStepCreationParams finished(Boolean finished) {

        this.finished = finished;
        return this;
    }

    /**
     * Get finished
     *
     * @return finished
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public TaskStepCreationParams finished_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED);
        return this;
    }

    public TaskStepCreationParams finished_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED);
        return this;
    }

    public void setFinished_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED);
        }
    }

    public boolean getFinished_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED);
    }

    public TaskStepCreationParams key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TaskStepCreationParams key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public TaskStepCreationParams key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskStepCreationParams taskStepCreationParams = (TaskStepCreationParams) o;
        return Objects.equals(this.description, taskStepCreationParams.description)
                && Objects.equals(this.finished, taskStepCreationParams.finished)
                && Objects.equals(this.key, taskStepCreationParams.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, finished, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStepCreationParams {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
