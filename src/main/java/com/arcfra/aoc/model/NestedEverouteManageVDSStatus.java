package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteManageVDSStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteManageVDSStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_RETRY_COUNT = "retryCount";

    @SerializedName(SERIALIZED_NAME_RETRY_COUNT)
    private Integer retryCount;

    public static final String SERIALIZED_NAME_VDS = "vds";

    @SerializedName(SERIALIZED_NAME_VDS)
    private NestedVds vds;

    public static final String SERIALIZED_NAME_VDS_I_D = "vdsID";

    @SerializedName(SERIALIZED_NAME_VDS_I_D)
    private String vdsID;

    public NestedEverouteManageVDSStatus() {}

    public NestedEverouteManageVDSStatus message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NestedEverouteManageVDSStatus message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public NestedEverouteManageVDSStatus message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public NestedEverouteManageVDSStatus phase(EverouteClusterPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public NestedEverouteManageVDSStatus phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public NestedEverouteManageVDSStatus phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public NestedEverouteManageVDSStatus reason(String reason) {

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

    public NestedEverouteManageVDSStatus reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public NestedEverouteManageVDSStatus reason_ExplictlyNonNull() {
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

    public NestedEverouteManageVDSStatus retryCount(Integer retryCount) {

        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get retryCount
     *
     * @return retryCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public NestedEverouteManageVDSStatus retryCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_COUNT);
        return this;
    }

    public NestedEverouteManageVDSStatus retryCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_COUNT);
        return this;
    }

    public void setRetryCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_COUNT);
        }
    }

    public boolean getRetryCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_COUNT);
    }

    public NestedEverouteManageVDSStatus vds(NestedVds vds) {

        this.vds = vds;
        return this;
    }

    /**
     * Get vds
     *
     * @return vds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVds getVds() {
        return vds;
    }

    public void setVds(NestedVds vds) {
        this.vds = vds;
    }

    public NestedEverouteManageVDSStatus vds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS);
        return this;
    }

    public NestedEverouteManageVDSStatus vds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS);
        return this;
    }

    public void setVds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS);
        }
    }

    public boolean getVds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS);
    }

    public NestedEverouteManageVDSStatus vdsID(String vdsID) {

        this.vdsID = vdsID;
        return this;
    }

    /**
     * Get vdsID
     *
     * @return vdsID
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVdsID() {
        return vdsID;
    }

    public void setVdsID(String vdsID) {
        this.vdsID = vdsID;
    }

    public NestedEverouteManageVDSStatus vdsID_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_I_D);
        return this;
    }

    public NestedEverouteManageVDSStatus vdsID_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_I_D);
        return this;
    }

    public void setVdsID_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_I_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_I_D);
        }
    }

    public boolean getVdsID_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_I_D);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteManageVDSStatus nestedEverouteManageVDSStatus =
                (NestedEverouteManageVDSStatus) o;
        return Objects.equals(this.message, nestedEverouteManageVDSStatus.message)
                && Objects.equals(this.phase, nestedEverouteManageVDSStatus.phase)
                && Objects.equals(this.reason, nestedEverouteManageVDSStatus.reason)
                && Objects.equals(this.retryCount, nestedEverouteManageVDSStatus.retryCount)
                && Objects.equals(this.vds, nestedEverouteManageVDSStatus.vds)
                && Objects.equals(this.vdsID, nestedEverouteManageVDSStatus.vdsID);
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
        return Objects.hash(message, phase, reason, retryCount, vds, vdsID);
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
        sb.append("class NestedEverouteManageVDSStatus {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
        sb.append("    vdsID: ").append(toIndentedString(vdsID)).append("\n");
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
