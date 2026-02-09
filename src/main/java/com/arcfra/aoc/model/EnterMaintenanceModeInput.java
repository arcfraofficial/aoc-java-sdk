package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EnterMaintenanceModeInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EnterMaintenanceModeInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SHUTDOWN_VMS = "shutdown_vms";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_VMS)
    private List<String> shutdownVms = null;

    public EnterMaintenanceModeInput() {}

    public EnterMaintenanceModeInput shutdownVms(List<String> shutdownVms) {

        this.shutdownVms = shutdownVms;
        return this;
    }

    public EnterMaintenanceModeInput addShutdownVmsItem(String shutdownVmsItem) {
        if (this.shutdownVms == null) {
            this.shutdownVms = new ArrayList<String>();
        }
        this.shutdownVms.add(shutdownVmsItem);
        return this;
    }

    /**
     * Get shutdownVms
     *
     * @return shutdownVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getShutdownVms() {
        return shutdownVms;
    }

    public void setShutdownVms(List<String> shutdownVms) {
        this.shutdownVms = shutdownVms;
    }

    public EnterMaintenanceModeInput shutdownVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_VMS);
        return this;
    }

    public EnterMaintenanceModeInput shutdownVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_VMS);
        return this;
    }

    public void setShutdownVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_VMS);
        }
    }

    public boolean getShutdownVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUTDOWN_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterMaintenanceModeInput enterMaintenanceModeInput = (EnterMaintenanceModeInput) o;
        return Objects.equals(this.shutdownVms, enterMaintenanceModeInput.shutdownVms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shutdownVms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterMaintenanceModeInput {\n");
        sb.append("    shutdownVms: ").append(toIndentedString(shutdownVms)).append("\n");
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
