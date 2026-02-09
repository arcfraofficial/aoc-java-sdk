package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ExitMaintenanceModeInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ExitMaintenanceModeInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_POWERON_VMS = "poweron_vms";

    @SerializedName(SERIALIZED_NAME_POWERON_VMS)
    private List<String> poweronVms = null;

    public static final String SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS =
            "offline_migrate_back_vms";

    @SerializedName(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS)
    private List<String> offlineMigrateBackVms = null;

    public static final String SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS = "live_migrate_back_vms";

    @SerializedName(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS)
    private List<String> liveMigrateBackVms = null;

    public ExitMaintenanceModeInput() {}

    public ExitMaintenanceModeInput poweronVms(List<String> poweronVms) {

        this.poweronVms = poweronVms;
        return this;
    }

    public ExitMaintenanceModeInput addPoweronVmsItem(String poweronVmsItem) {
        if (this.poweronVms == null) {
            this.poweronVms = new ArrayList<String>();
        }
        this.poweronVms.add(poweronVmsItem);
        return this;
    }

    /**
     * Get poweronVms
     *
     * @return poweronVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPoweronVms() {
        return poweronVms;
    }

    public void setPoweronVms(List<String> poweronVms) {
        this.poweronVms = poweronVms;
    }

    public ExitMaintenanceModeInput poweronVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWERON_VMS);
        return this;
    }

    public ExitMaintenanceModeInput poweronVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWERON_VMS);
        return this;
    }

    public void setPoweronVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWERON_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWERON_VMS);
        }
    }

    public boolean getPoweronVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWERON_VMS);
    }

    public ExitMaintenanceModeInput offlineMigrateBackVms(List<String> offlineMigrateBackVms) {

        this.offlineMigrateBackVms = offlineMigrateBackVms;
        return this;
    }

    public ExitMaintenanceModeInput addOfflineMigrateBackVmsItem(String offlineMigrateBackVmsItem) {
        if (this.offlineMigrateBackVms == null) {
            this.offlineMigrateBackVms = new ArrayList<String>();
        }
        this.offlineMigrateBackVms.add(offlineMigrateBackVmsItem);
        return this;
    }

    /**
     * Get offlineMigrateBackVms
     *
     * @return offlineMigrateBackVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOfflineMigrateBackVms() {
        return offlineMigrateBackVms;
    }

    public void setOfflineMigrateBackVms(List<String> offlineMigrateBackVms) {
        this.offlineMigrateBackVms = offlineMigrateBackVms;
    }

    public ExitMaintenanceModeInput offlineMigrateBackVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS);
        return this;
    }

    public ExitMaintenanceModeInput offlineMigrateBackVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS);
        return this;
    }

    public void setOfflineMigrateBackVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS);
        }
    }

    public boolean getOfflineMigrateBackVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OFFLINE_MIGRATE_BACK_VMS);
    }

    public ExitMaintenanceModeInput liveMigrateBackVms(List<String> liveMigrateBackVms) {

        this.liveMigrateBackVms = liveMigrateBackVms;
        return this;
    }

    public ExitMaintenanceModeInput addLiveMigrateBackVmsItem(String liveMigrateBackVmsItem) {
        if (this.liveMigrateBackVms == null) {
            this.liveMigrateBackVms = new ArrayList<String>();
        }
        this.liveMigrateBackVms.add(liveMigrateBackVmsItem);
        return this;
    }

    /**
     * Get liveMigrateBackVms
     *
     * @return liveMigrateBackVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLiveMigrateBackVms() {
        return liveMigrateBackVms;
    }

    public void setLiveMigrateBackVms(List<String> liveMigrateBackVms) {
        this.liveMigrateBackVms = liveMigrateBackVms;
    }

    public ExitMaintenanceModeInput liveMigrateBackVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS);
        return this;
    }

    public ExitMaintenanceModeInput liveMigrateBackVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS);
        return this;
    }

    public void setLiveMigrateBackVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS);
        }
    }

    public boolean getLiveMigrateBackVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LIVE_MIGRATE_BACK_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitMaintenanceModeInput exitMaintenanceModeInput = (ExitMaintenanceModeInput) o;
        return Objects.equals(this.poweronVms, exitMaintenanceModeInput.poweronVms)
                && Objects.equals(
                        this.offlineMigrateBackVms, exitMaintenanceModeInput.offlineMigrateBackVms)
                && Objects.equals(
                        this.liveMigrateBackVms, exitMaintenanceModeInput.liveMigrateBackVms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poweronVms, offlineMigrateBackVms, liveMigrateBackVms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitMaintenanceModeInput {\n");
        sb.append("    poweronVms: ").append(toIndentedString(poweronVms)).append("\n");
        sb.append("    offlineMigrateBackVms: ")
                .append(toIndentedString(offlineMigrateBackVms))
                .append("\n");
        sb.append("    liveMigrateBackVms: ")
                .append(toIndentedString(liveMigrateBackVms))
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
