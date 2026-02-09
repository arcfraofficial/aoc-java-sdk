package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** TriggerDiskBlinkParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TriggerDiskBlinkParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    /** Gets or Sets ledStatus */
    @JsonAdapter(LedStatusEnum.Adapter.class)
    public enum LedStatusEnum {
        ON("on"),

        OFF("off");

        private String value;

        LedStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LedStatusEnum fromValue(String value) {
            for (LedStatusEnum b : LedStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<LedStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LedStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LedStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LedStatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_LED_STATUS = "led_status";

    @SerializedName(SERIALIZED_NAME_LED_STATUS)
    private LedStatusEnum ledStatus;

    public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";

    @SerializedName(SERIALIZED_NAME_DISK_NAME)
    private String diskName;

    public static final String SERIALIZED_NAME_HOST_ID = "host_id";

    @SerializedName(SERIALIZED_NAME_HOST_ID)
    private String hostId;

    public TriggerDiskBlinkParams() {}

    public TriggerDiskBlinkParams ledStatus(LedStatusEnum ledStatus) {

        this.ledStatus = ledStatus;
        return this;
    }

    /**
     * Get ledStatus
     *
     * @return ledStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LedStatusEnum getLedStatus() {
        return ledStatus;
    }

    public void setLedStatus(LedStatusEnum ledStatus) {
        this.ledStatus = ledStatus;
    }

    public TriggerDiskBlinkParams ledStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LED_STATUS);
        return this;
    }

    public TriggerDiskBlinkParams ledStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LED_STATUS);
        return this;
    }

    public void setLedStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LED_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LED_STATUS);
        }
    }

    public boolean getLedStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LED_STATUS);
    }

    public TriggerDiskBlinkParams diskName(String diskName) {

        this.diskName = diskName;
        return this;
    }

    /**
     * Get diskName
     *
     * @return diskName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public TriggerDiskBlinkParams diskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public TriggerDiskBlinkParams diskName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public void setDiskName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        }
    }

    public boolean getDiskName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME);
    }

    public TriggerDiskBlinkParams hostId(String hostId) {

        this.hostId = hostId;
        return this;
    }

    /**
     * Get hostId
     *
     * @return hostId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public TriggerDiskBlinkParams hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public TriggerDiskBlinkParams hostId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public void setHostId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        }
    }

    public boolean getHostId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggerDiskBlinkParams triggerDiskBlinkParams = (TriggerDiskBlinkParams) o;
        return Objects.equals(this.ledStatus, triggerDiskBlinkParams.ledStatus)
                && Objects.equals(this.diskName, triggerDiskBlinkParams.diskName)
                && Objects.equals(this.hostId, triggerDiskBlinkParams.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ledStatus, diskName, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerDiskBlinkParams {\n");
        sb.append("    ledStatus: ").append(toIndentedString(ledStatus)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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
