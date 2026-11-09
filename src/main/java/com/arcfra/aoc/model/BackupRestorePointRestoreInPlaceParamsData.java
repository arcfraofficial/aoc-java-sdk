package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BackupRestorePointRestoreInPlaceParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestorePointRestoreInPlaceParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";

    @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
    private Boolean startupAfterRestore;

    public BackupRestorePointRestoreInPlaceParamsData() {}

    public BackupRestorePointRestoreInPlaceParamsData startupAfterRestore(
            Boolean startupAfterRestore) {

        this.startupAfterRestore = startupAfterRestore;
        return this;
    }

    /**
     * Get startupAfterRestore
     *
     * @return startupAfterRestore
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getStartupAfterRestore() {
        return startupAfterRestore;
    }

    public void setStartupAfterRestore(Boolean startupAfterRestore) {
        this.startupAfterRestore = startupAfterRestore;
    }

    public BackupRestorePointRestoreInPlaceParamsData startupAfterRestore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public BackupRestorePointRestoreInPlaceParamsData startupAfterRestore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public void setStartupAfterRestore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        }
    }

    public boolean getStartupAfterRestore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestorePointRestoreInPlaceParamsData backupRestorePointRestoreInPlaceParamsData =
                (BackupRestorePointRestoreInPlaceParamsData) o;
        return Objects.equals(
                this.startupAfterRestore,
                backupRestorePointRestoreInPlaceParamsData.startupAfterRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startupAfterRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestorePointRestoreInPlaceParamsData {\n");
        sb.append("    startupAfterRestore: ")
                .append(toIndentedString(startupAfterRestore))
                .append("\n");
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
