package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DisassociateSystemServiceFromObsServiceParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DisassociateSystemServiceFromObsServiceParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SYSTEM_SERVICE_TYPE = "system_service_type";

    @SerializedName(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE)
    private ObservabilityConnectedSystemServiceType systemServiceType;

    public static final String SERIALIZED_NAME_SYSTEM_SERVICE_ID = "system_service_id";

    @SerializedName(SERIALIZED_NAME_SYSTEM_SERVICE_ID)
    private String systemServiceId;

    public DisassociateSystemServiceFromObsServiceParams() {}

    public DisassociateSystemServiceFromObsServiceParams systemServiceType(
            ObservabilityConnectedSystemServiceType systemServiceType) {

        this.systemServiceType = systemServiceType;
        return this;
    }

    /**
     * Get systemServiceType
     *
     * @return systemServiceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ObservabilityConnectedSystemServiceType getSystemServiceType() {
        return systemServiceType;
    }

    public void setSystemServiceType(ObservabilityConnectedSystemServiceType systemServiceType) {
        this.systemServiceType = systemServiceType;
    }

    public DisassociateSystemServiceFromObsServiceParams systemServiceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE);
        return this;
    }

    public DisassociateSystemServiceFromObsServiceParams systemServiceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE);
        return this;
    }

    public void setSystemServiceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE);
        }
    }

    public boolean getSystemServiceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE);
    }

    public DisassociateSystemServiceFromObsServiceParams systemServiceId(String systemServiceId) {

        this.systemServiceId = systemServiceId;
        return this;
    }

    /**
     * Get systemServiceId
     *
     * @return systemServiceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSystemServiceId() {
        return systemServiceId;
    }

    public void setSystemServiceId(String systemServiceId) {
        this.systemServiceId = systemServiceId;
    }

    public DisassociateSystemServiceFromObsServiceParams systemServiceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_SERVICE_ID);
        return this;
    }

    public DisassociateSystemServiceFromObsServiceParams systemServiceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_SERVICE_ID);
        return this;
    }

    public void setSystemServiceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_SERVICE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_SERVICE_ID);
        }
    }

    public boolean getSystemServiceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_SERVICE_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateSystemServiceFromObsServiceParams
                disassociateSystemServiceFromObsServiceParams =
                        (DisassociateSystemServiceFromObsServiceParams) o;
        return Objects.equals(
                        this.systemServiceType,
                        disassociateSystemServiceFromObsServiceParams.systemServiceType)
                && Objects.equals(
                        this.systemServiceId,
                        disassociateSystemServiceFromObsServiceParams.systemServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemServiceType, systemServiceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSystemServiceFromObsServiceParams {\n");
        sb.append("    systemServiceType: ")
                .append(toIndentedString(systemServiceType))
                .append("\n");
        sb.append("    systemServiceId: ").append(toIndentedString(systemServiceId)).append("\n");
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
