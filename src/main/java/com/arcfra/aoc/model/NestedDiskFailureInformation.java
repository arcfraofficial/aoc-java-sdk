package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedDiskFailureInformation */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedDiskFailureInformation
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR = "chunk_checksum_error";

    @SerializedName(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR)
    private Boolean chunkChecksumError;

    public static final String SERIALIZED_NAME_CHUNK_ERRFLAG = "chunk_errflag";

    @SerializedName(SERIALIZED_NAME_CHUNK_ERRFLAG)
    private Boolean chunkErrflag;

    public static final String SERIALIZED_NAME_CHUNK_IO_ERROR = "chunk_io_error";

    @SerializedName(SERIALIZED_NAME_CHUNK_IO_ERROR)
    private Boolean chunkIoError;

    public static final String SERIALIZED_NAME_CHUNK_WARNFLAG = "chunk_warnflag";

    @SerializedName(SERIALIZED_NAME_CHUNK_WARNFLAG)
    private Boolean chunkWarnflag;

    public static final String SERIALIZED_NAME_IOSTAT_LATENCY = "iostat_latency";

    @SerializedName(SERIALIZED_NAME_IOSTAT_LATENCY)
    private Boolean iostatLatency;

    public static final String SERIALIZED_NAME_IOSTAT_LATENCY_MS = "iostat_latency_ms";

    @SerializedName(SERIALIZED_NAME_IOSTAT_LATENCY_MS)
    private Long iostatLatencyMs;

    public static final String SERIALIZED_NAME_SMART_CHECK = "smart_check";

    @SerializedName(SERIALIZED_NAME_SMART_CHECK)
    private Boolean smartCheck;

    public NestedDiskFailureInformation() {}

    public NestedDiskFailureInformation chunkChecksumError(Boolean chunkChecksumError) {

        this.chunkChecksumError = chunkChecksumError;
        return this;
    }

    /**
     * Get chunkChecksumError
     *
     * @return chunkChecksumError
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChunkChecksumError() {
        return chunkChecksumError;
    }

    public void setChunkChecksumError(Boolean chunkChecksumError) {
        this.chunkChecksumError = chunkChecksumError;
    }

    public NestedDiskFailureInformation chunkChecksumError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR);
        return this;
    }

    public NestedDiskFailureInformation chunkChecksumError_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR);
        return this;
    }

    public void setChunkChecksumError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR);
        }
    }

    public boolean getChunkChecksumError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_CHECKSUM_ERROR);
    }

    public NestedDiskFailureInformation chunkErrflag(Boolean chunkErrflag) {

        this.chunkErrflag = chunkErrflag;
        return this;
    }

    /**
     * Get chunkErrflag
     *
     * @return chunkErrflag
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChunkErrflag() {
        return chunkErrflag;
    }

    public void setChunkErrflag(Boolean chunkErrflag) {
        this.chunkErrflag = chunkErrflag;
    }

    public NestedDiskFailureInformation chunkErrflag_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ERRFLAG);
        return this;
    }

    public NestedDiskFailureInformation chunkErrflag_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ERRFLAG);
        return this;
    }

    public void setChunkErrflag_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ERRFLAG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ERRFLAG);
        }
    }

    public boolean getChunkErrflag_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ERRFLAG);
    }

    public NestedDiskFailureInformation chunkIoError(Boolean chunkIoError) {

        this.chunkIoError = chunkIoError;
        return this;
    }

    /**
     * Get chunkIoError
     *
     * @return chunkIoError
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChunkIoError() {
        return chunkIoError;
    }

    public void setChunkIoError(Boolean chunkIoError) {
        this.chunkIoError = chunkIoError;
    }

    public NestedDiskFailureInformation chunkIoError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_IO_ERROR);
        return this;
    }

    public NestedDiskFailureInformation chunkIoError_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_IO_ERROR);
        return this;
    }

    public void setChunkIoError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_IO_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_IO_ERROR);
        }
    }

    public boolean getChunkIoError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_IO_ERROR);
    }

    public NestedDiskFailureInformation chunkWarnflag(Boolean chunkWarnflag) {

        this.chunkWarnflag = chunkWarnflag;
        return this;
    }

    /**
     * Get chunkWarnflag
     *
     * @return chunkWarnflag
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChunkWarnflag() {
        return chunkWarnflag;
    }

    public void setChunkWarnflag(Boolean chunkWarnflag) {
        this.chunkWarnflag = chunkWarnflag;
    }

    public NestedDiskFailureInformation chunkWarnflag_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_WARNFLAG);
        return this;
    }

    public NestedDiskFailureInformation chunkWarnflag_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_WARNFLAG);
        return this;
    }

    public void setChunkWarnflag_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_WARNFLAG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_WARNFLAG);
        }
    }

    public boolean getChunkWarnflag_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_WARNFLAG);
    }

    public NestedDiskFailureInformation iostatLatency(Boolean iostatLatency) {

        this.iostatLatency = iostatLatency;
        return this;
    }

    /**
     * Get iostatLatency
     *
     * @return iostatLatency
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIostatLatency() {
        return iostatLatency;
    }

    public void setIostatLatency(Boolean iostatLatency) {
        this.iostatLatency = iostatLatency;
    }

    public NestedDiskFailureInformation iostatLatency_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOSTAT_LATENCY);
        return this;
    }

    public NestedDiskFailureInformation iostatLatency_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOSTAT_LATENCY);
        return this;
    }

    public void setIostatLatency_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOSTAT_LATENCY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOSTAT_LATENCY);
        }
    }

    public boolean getIostatLatency_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOSTAT_LATENCY);
    }

    public NestedDiskFailureInformation iostatLatencyMs(Long iostatLatencyMs) {

        this.iostatLatencyMs = iostatLatencyMs;
        return this;
    }

    /**
     * Get iostatLatencyMs
     *
     * @return iostatLatencyMs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIostatLatencyMs() {
        return iostatLatencyMs;
    }

    public void setIostatLatencyMs(Long iostatLatencyMs) {
        this.iostatLatencyMs = iostatLatencyMs;
    }

    public NestedDiskFailureInformation iostatLatencyMs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOSTAT_LATENCY_MS);
        return this;
    }

    public NestedDiskFailureInformation iostatLatencyMs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOSTAT_LATENCY_MS);
        return this;
    }

    public void setIostatLatencyMs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOSTAT_LATENCY_MS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOSTAT_LATENCY_MS);
        }
    }

    public boolean getIostatLatencyMs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOSTAT_LATENCY_MS);
    }

    public NestedDiskFailureInformation smartCheck(Boolean smartCheck) {

        this.smartCheck = smartCheck;
        return this;
    }

    /**
     * Get smartCheck
     *
     * @return smartCheck
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSmartCheck() {
        return smartCheck;
    }

    public void setSmartCheck(Boolean smartCheck) {
        this.smartCheck = smartCheck;
    }

    public NestedDiskFailureInformation smartCheck_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SMART_CHECK);
        return this;
    }

    public NestedDiskFailureInformation smartCheck_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SMART_CHECK);
        return this;
    }

    public void setSmartCheck_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SMART_CHECK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SMART_CHECK);
        }
    }

    public boolean getSmartCheck_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SMART_CHECK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedDiskFailureInformation nestedDiskFailureInformation =
                (NestedDiskFailureInformation) o;
        return Objects.equals(
                        this.chunkChecksumError, nestedDiskFailureInformation.chunkChecksumError)
                && Objects.equals(this.chunkErrflag, nestedDiskFailureInformation.chunkErrflag)
                && Objects.equals(this.chunkIoError, nestedDiskFailureInformation.chunkIoError)
                && Objects.equals(this.chunkWarnflag, nestedDiskFailureInformation.chunkWarnflag)
                && Objects.equals(this.iostatLatency, nestedDiskFailureInformation.iostatLatency)
                && Objects.equals(
                        this.iostatLatencyMs, nestedDiskFailureInformation.iostatLatencyMs)
                && Objects.equals(this.smartCheck, nestedDiskFailureInformation.smartCheck);
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
        return Objects.hash(
                chunkChecksumError,
                chunkErrflag,
                chunkIoError,
                chunkWarnflag,
                iostatLatency,
                iostatLatencyMs,
                smartCheck);
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
        sb.append("class NestedDiskFailureInformation {\n");
        sb.append("    chunkChecksumError: ")
                .append(toIndentedString(chunkChecksumError))
                .append("\n");
        sb.append("    chunkErrflag: ").append(toIndentedString(chunkErrflag)).append("\n");
        sb.append("    chunkIoError: ").append(toIndentedString(chunkIoError)).append("\n");
        sb.append("    chunkWarnflag: ").append(toIndentedString(chunkWarnflag)).append("\n");
        sb.append("    iostatLatency: ").append(toIndentedString(iostatLatency)).append("\n");
        sb.append("    iostatLatencyMs: ").append(toIndentedString(iostatLatencyMs)).append("\n");
        sb.append("    smartCheck: ").append(toIndentedString(smartCheck)).append("\n");
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
