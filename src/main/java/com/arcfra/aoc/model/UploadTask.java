package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** UploadTask */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UploadTask extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private Object args;

    public static final String SERIALIZED_NAME_CHUNK_SIZE = "chunk_size";

    @SerializedName(SERIALIZED_NAME_CHUNK_SIZE)
    private Long chunkSize;

    public static final String SERIALIZED_NAME_CURRENT_CHUNK = "current_chunk";

    @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK)
    private Integer currentChunk;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private UploadResourceType resourceType;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private UploadTaskStatus status;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public UploadTask() {}

    public UploadTask args(Object args) {

        this.args = args;
        return this;
    }

    /**
     * Get args
     *
     * @return args
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    public UploadTask args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public UploadTask args_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        return this;
    }

    public void setArgs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        }
    }

    public boolean getArgs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARGS);
    }

    public UploadTask chunkSize(Long chunkSize) {

        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * Get chunkSize
     *
     * @return chunkSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
    }

    public UploadTask chunkSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_SIZE);
        return this;
    }

    public UploadTask chunkSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_SIZE);
        return this;
    }

    public void setChunkSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_SIZE);
        }
    }

    public boolean getChunkSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_SIZE);
    }

    public UploadTask currentChunk(Integer currentChunk) {

        this.currentChunk = currentChunk;
        return this;
    }

    /**
     * Get currentChunk
     *
     * @return currentChunk
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getCurrentChunk() {
        return currentChunk;
    }

    public void setCurrentChunk(Integer currentChunk) {
        this.currentChunk = currentChunk;
    }

    public UploadTask currentChunk_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CHUNK);
        return this;
    }

    public UploadTask currentChunk_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CHUNK);
        return this;
    }

    public void setCurrentChunk_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CHUNK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CHUNK);
        }
    }

    public boolean getCurrentChunk_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CHUNK);
    }

    public UploadTask finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public UploadTask finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public UploadTask finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public UploadTask id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UploadTask id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public UploadTask id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public UploadTask resourceType(UploadResourceType resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UploadResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(UploadResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public UploadTask resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public UploadTask resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public UploadTask size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public UploadTask size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public UploadTask size_ExplictlyNonNull() {
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

    public UploadTask startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public UploadTask startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public UploadTask startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public UploadTask status(UploadTaskStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UploadTaskStatus getStatus() {
        return status;
    }

    public void setStatus(UploadTaskStatus status) {
        this.status = status;
    }

    public UploadTask status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public UploadTask status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public UploadTask updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UploadTask updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public UploadTask updatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public void setUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        }
    }

    public boolean getUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadTask uploadTask = (UploadTask) o;
        return Objects.equals(this.args, uploadTask.args)
                && Objects.equals(this.chunkSize, uploadTask.chunkSize)
                && Objects.equals(this.currentChunk, uploadTask.currentChunk)
                && Objects.equals(this.finishedAt, uploadTask.finishedAt)
                && Objects.equals(this.id, uploadTask.id)
                && Objects.equals(this.resourceType, uploadTask.resourceType)
                && Objects.equals(this.size, uploadTask.size)
                && Objects.equals(this.startedAt, uploadTask.startedAt)
                && Objects.equals(this.status, uploadTask.status)
                && Objects.equals(this.updatedAt, uploadTask.updatedAt);
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
                args,
                chunkSize,
                currentChunk,
                finishedAt,
                id,
                resourceType,
                size,
                startedAt,
                status,
                updatedAt);
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
        sb.append("class UploadTask {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
        sb.append("    currentChunk: ").append(toIndentedString(currentChunk)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
