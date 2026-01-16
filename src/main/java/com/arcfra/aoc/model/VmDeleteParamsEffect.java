package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmDeleteParamsEffect */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDeleteParamsEffect
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INCLUDE_SNAPSHOTS = "include_snapshots";

    @SerializedName(SERIALIZED_NAME_INCLUDE_SNAPSHOTS)
    private Boolean includeSnapshots;

    public VmDeleteParamsEffect() {}

    public VmDeleteParamsEffect includeSnapshots(Boolean includeSnapshots) {

        this.includeSnapshots = includeSnapshots;
        return this;
    }

    /**
     * Get includeSnapshots
     *
     * @return includeSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIncludeSnapshots() {
        return includeSnapshots;
    }

    public void setIncludeSnapshots(Boolean includeSnapshots) {
        this.includeSnapshots = includeSnapshots;
    }

    public VmDeleteParamsEffect includeSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCLUDE_SNAPSHOTS);
        return this;
    }

    public VmDeleteParamsEffect includeSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCLUDE_SNAPSHOTS);
        return this;
    }

    public void setIncludeSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCLUDE_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCLUDE_SNAPSHOTS);
        }
    }

    public boolean getIncludeSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCLUDE_SNAPSHOTS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmDeleteParamsEffect vmDeleteParamsEffect = (VmDeleteParamsEffect) o;
        return Objects.equals(this.includeSnapshots, vmDeleteParamsEffect.includeSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmDeleteParamsEffect {\n");
        sb.append("    includeSnapshots: ").append(toIndentedString(includeSnapshots)).append("\n");
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
