package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** HostBatchCreateDiskInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostBatchCreateDiskInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private DiskType type;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Double size;

    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private DiskFunction function;

    public static final String SERIALIZED_NAME_DRIVE = "drive";

    @SerializedName(SERIALIZED_NAME_DRIVE)
    private String drive;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID = "chunk_ins_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID)
    private Integer chunkInsId;

    public HostBatchCreateDiskInput() {}

    public HostBatchCreateDiskInput type(DiskType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    public HostBatchCreateDiskInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public HostBatchCreateDiskInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public HostBatchCreateDiskInput size(Double size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public HostBatchCreateDiskInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public HostBatchCreateDiskInput size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public HostBatchCreateDiskInput function(DiskFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskFunction getFunction() {
        return function;
    }

    public void setFunction(DiskFunction function) {
        this.function = function;
    }

    public HostBatchCreateDiskInput function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public HostBatchCreateDiskInput function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    public HostBatchCreateDiskInput drive(String drive) {

        this.drive = drive;
        return this;
    }

    /**
     * Get drive
     *
     * @return drive
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public HostBatchCreateDiskInput drive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DRIVE);
        return this;
    }

    public HostBatchCreateDiskInput drive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DRIVE);
        return this;
    }

    public void setDrive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DRIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DRIVE);
        }
    }

    public boolean getDrive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DRIVE);
    }

    public HostBatchCreateDiskInput chunkInsId(Integer chunkInsId) {

        this.chunkInsId = chunkInsId;
        return this;
    }

    /**
     * Get chunkInsId
     *
     * @return chunkInsId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsId() {
        return chunkInsId;
    }

    public void setChunkInsId(Integer chunkInsId) {
        this.chunkInsId = chunkInsId;
    }

    public HostBatchCreateDiskInput chunkInsId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public HostBatchCreateDiskInput chunkInsId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public void setChunkInsId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        }
    }

    public boolean getChunkInsId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostBatchCreateDiskInput hostBatchCreateDiskInput = (HostBatchCreateDiskInput) o;
        return Objects.equals(this.type, hostBatchCreateDiskInput.type)
                && Objects.equals(this.size, hostBatchCreateDiskInput.size)
                && Objects.equals(this.function, hostBatchCreateDiskInput.function)
                && Objects.equals(this.drive, hostBatchCreateDiskInput.drive)
                && Objects.equals(this.chunkInsId, hostBatchCreateDiskInput.chunkInsId);
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
        return Objects.hash(type, size, function, drive, chunkInsId);
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
        sb.append("class HostBatchCreateDiskInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
        sb.append("    chunkInsId: ").append(toIndentedString(chunkInsId)).append("\n");
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
