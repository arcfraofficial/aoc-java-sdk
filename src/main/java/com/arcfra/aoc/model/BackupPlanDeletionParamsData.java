package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BackupPlanDeletionParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlanDeletionParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DELETE_STRATEGY = "delete_strategy";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY)
    private BackupPlanDeleteStrategy deleteStrategy;

    public BackupPlanDeletionParamsData() {}

    public BackupPlanDeletionParamsData deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

        this.deleteStrategy = deleteStrategy;
        return this;
    }

    /**
     * Get deleteStrategy
     *
     * @return deleteStrategy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanDeleteStrategy getDeleteStrategy() {
        return deleteStrategy;
    }

    public void setDeleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
        this.deleteStrategy = deleteStrategy;
    }

    public BackupPlanDeletionParamsData deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public BackupPlanDeletionParamsData deleteStrategy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public void setDeleteStrategy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        }
    }

    public boolean getDeleteStrategy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPlanDeletionParamsData backupPlanDeletionParamsData =
                (BackupPlanDeletionParamsData) o;
        return Objects.equals(this.deleteStrategy, backupPlanDeletionParamsData.deleteStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPlanDeletionParamsData {\n");
        sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
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
