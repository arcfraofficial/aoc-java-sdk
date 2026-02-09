package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ExitMaintenanceModeResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ExitMaintenanceModeResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_OFFLINE_MIGRATE_VMS = "offlineMigrateVms";

    @SerializedName(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS)
    private List<MaintenanceModeVmInfo> offlineMigrateVms = new ArrayList<MaintenanceModeVmInfo>();

    public static final String SERIALIZED_NAME_LIVE_MIGRATE_VMS = "liveMigrateVms";

    @SerializedName(SERIALIZED_NAME_LIVE_MIGRATE_VMS)
    private List<MaintenanceModeVmInfo> liveMigrateVms = new ArrayList<MaintenanceModeVmInfo>();

    public static final String SERIALIZED_NAME_SHUT_DOWN_VMS = "shutDownVms";

    @SerializedName(SERIALIZED_NAME_SHUT_DOWN_VMS)
    private List<MaintenanceModeVmInfo> shutDownVms = new ArrayList<MaintenanceModeVmInfo>();

    public ExitMaintenanceModeResult() {}

    public ExitMaintenanceModeResult offlineMigrateVms(
            List<MaintenanceModeVmInfo> offlineMigrateVms) {

        this.offlineMigrateVms = offlineMigrateVms;
        return this;
    }

    public ExitMaintenanceModeResult addOfflineMigrateVmsItem(
            MaintenanceModeVmInfo offlineMigrateVmsItem) {
        this.offlineMigrateVms.add(offlineMigrateVmsItem);
        return this;
    }

    /**
     * Get offlineMigrateVms
     *
     * @return offlineMigrateVms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<MaintenanceModeVmInfo> getOfflineMigrateVms() {
        return offlineMigrateVms;
    }

    public void setOfflineMigrateVms(List<MaintenanceModeVmInfo> offlineMigrateVms) {
        this.offlineMigrateVms = offlineMigrateVms;
    }

    public ExitMaintenanceModeResult offlineMigrateVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS);
        return this;
    }

    public ExitMaintenanceModeResult offlineMigrateVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS);
        return this;
    }

    public void setOfflineMigrateVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS);
        }
    }

    public boolean getOfflineMigrateVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OFFLINE_MIGRATE_VMS);
    }

    public ExitMaintenanceModeResult liveMigrateVms(List<MaintenanceModeVmInfo> liveMigrateVms) {

        this.liveMigrateVms = liveMigrateVms;
        return this;
    }

    public ExitMaintenanceModeResult addLiveMigrateVmsItem(
            MaintenanceModeVmInfo liveMigrateVmsItem) {
        this.liveMigrateVms.add(liveMigrateVmsItem);
        return this;
    }

    /**
     * Get liveMigrateVms
     *
     * @return liveMigrateVms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<MaintenanceModeVmInfo> getLiveMigrateVms() {
        return liveMigrateVms;
    }

    public void setLiveMigrateVms(List<MaintenanceModeVmInfo> liveMigrateVms) {
        this.liveMigrateVms = liveMigrateVms;
    }

    public ExitMaintenanceModeResult liveMigrateVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LIVE_MIGRATE_VMS);
        return this;
    }

    public ExitMaintenanceModeResult liveMigrateVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LIVE_MIGRATE_VMS);
        return this;
    }

    public void setLiveMigrateVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LIVE_MIGRATE_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LIVE_MIGRATE_VMS);
        }
    }

    public boolean getLiveMigrateVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LIVE_MIGRATE_VMS);
    }

    public ExitMaintenanceModeResult shutDownVms(List<MaintenanceModeVmInfo> shutDownVms) {

        this.shutDownVms = shutDownVms;
        return this;
    }

    public ExitMaintenanceModeResult addShutDownVmsItem(MaintenanceModeVmInfo shutDownVmsItem) {
        this.shutDownVms.add(shutDownVmsItem);
        return this;
    }

    /**
     * Get shutDownVms
     *
     * @return shutDownVms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<MaintenanceModeVmInfo> getShutDownVms() {
        return shutDownVms;
    }

    public void setShutDownVms(List<MaintenanceModeVmInfo> shutDownVms) {
        this.shutDownVms = shutDownVms;
    }

    public ExitMaintenanceModeResult shutDownVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUT_DOWN_VMS);
        return this;
    }

    public ExitMaintenanceModeResult shutDownVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUT_DOWN_VMS);
        return this;
    }

    public void setShutDownVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUT_DOWN_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUT_DOWN_VMS);
        }
    }

    public boolean getShutDownVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUT_DOWN_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitMaintenanceModeResult exitMaintenanceModeResult = (ExitMaintenanceModeResult) o;
        return Objects.equals(this.offlineMigrateVms, exitMaintenanceModeResult.offlineMigrateVms)
                && Objects.equals(this.liveMigrateVms, exitMaintenanceModeResult.liveMigrateVms)
                && Objects.equals(this.shutDownVms, exitMaintenanceModeResult.shutDownVms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offlineMigrateVms, liveMigrateVms, shutDownVms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitMaintenanceModeResult {\n");
        sb.append("    offlineMigrateVms: ")
                .append(toIndentedString(offlineMigrateVms))
                .append("\n");
        sb.append("    liveMigrateVms: ").append(toIndentedString(liveMigrateVms)).append("\n");
        sb.append("    shutDownVms: ").append(toIndentedString(shutDownVms)).append("\n");
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
