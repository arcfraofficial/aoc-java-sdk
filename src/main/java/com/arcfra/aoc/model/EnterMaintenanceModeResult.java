package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EnterMaintenanceModeResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EnterMaintenanceModeResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SHUTDOWN_VMS = "shutdownVms";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_VMS)
    private List<ShutdownVmID> shutdownVms = new ArrayList<ShutdownVmID>();

    public static final String SERIALIZED_NAME_DONE = "done";

    @SerializedName(SERIALIZED_NAME_DONE)
    private Boolean done;

    public EnterMaintenanceModeResult() {}

    public EnterMaintenanceModeResult shutdownVms(List<ShutdownVmID> shutdownVms) {

        this.shutdownVms = shutdownVms;
        return this;
    }

    public EnterMaintenanceModeResult addShutdownVmsItem(ShutdownVmID shutdownVmsItem) {
        this.shutdownVms.add(shutdownVmsItem);
        return this;
    }

    /**
     * Get shutdownVms
     *
     * @return shutdownVms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ShutdownVmID> getShutdownVms() {
        return shutdownVms;
    }

    public void setShutdownVms(List<ShutdownVmID> shutdownVms) {
        this.shutdownVms = shutdownVms;
    }

    public EnterMaintenanceModeResult shutdownVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_VMS);
        return this;
    }

    public EnterMaintenanceModeResult shutdownVms_ExplictlyNonNull() {
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

    public EnterMaintenanceModeResult done(Boolean done) {

        this.done = done;
        return this;
    }

    /**
     * Get done
     *
     * @return done
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public EnterMaintenanceModeResult done_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DONE);
        return this;
    }

    public EnterMaintenanceModeResult done_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DONE);
        return this;
    }

    public void setDone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DONE);
        }
    }

    public boolean getDone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DONE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterMaintenanceModeResult enterMaintenanceModeResult = (EnterMaintenanceModeResult) o;
        return Objects.equals(this.shutdownVms, enterMaintenanceModeResult.shutdownVms)
                && Objects.equals(this.done, enterMaintenanceModeResult.done);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shutdownVms, done);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterMaintenanceModeResult {\n");
        sb.append("    shutdownVms: ").append(toIndentedString(shutdownVms)).append("\n");
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
