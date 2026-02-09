package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** MaintenanceModeVerify */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MaintenanceModeVerify
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_CHANGED = "changed";

    @SerializedName(SERIALIZED_NAME_CHANGED)
    private Boolean changed;

    public MaintenanceModeVerify() {}

    public MaintenanceModeVerify reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public MaintenanceModeVerify reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public MaintenanceModeVerify reason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REASON);
        return this;
    }

    public void setReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REASON);
        }
    }

    public boolean getReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REASON);
    }

    public MaintenanceModeVerify changed(Boolean changed) {

        this.changed = changed;
        return this;
    }

    /**
     * Get changed
     *
     * @return changed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChanged() {
        return changed;
    }

    public void setChanged(Boolean changed) {
        this.changed = changed;
    }

    public MaintenanceModeVerify changed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHANGED);
        return this;
    }

    public MaintenanceModeVerify changed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHANGED);
        return this;
    }

    public void setChanged_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHANGED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHANGED);
        }
    }

    public boolean getChanged_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHANGED);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaintenanceModeVerify maintenanceModeVerify = (MaintenanceModeVerify) o;
        return Objects.equals(this.reason, maintenanceModeVerify.reason)
                && Objects.equals(this.changed, maintenanceModeVerify.changed);
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
        return Objects.hash(reason, changed);
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
        sb.append("class MaintenanceModeVerify {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
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
