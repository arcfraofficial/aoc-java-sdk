package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedDatastore */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedDatastore extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES =
            "datastore_capacity_bytes";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES)
    private Long datastoreCapacityBytes;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FREE_BYTES = "free_bytes";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES)
    private Long freeBytes;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private DatastoreStatus status;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageProtocol type;

    public static final String SERIALIZED_NAME_USED_BYTES = "used_bytes";

    @SerializedName(SERIALIZED_NAME_USED_BYTES)
    private Long usedBytes;

    public NestedDatastore() {}

    public NestedDatastore datastoreCapacityBytes(Long datastoreCapacityBytes) {

        this.datastoreCapacityBytes = datastoreCapacityBytes;
        return this;
    }

    /**
     * Get datastoreCapacityBytes
     *
     * @return datastoreCapacityBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytes() {
        return datastoreCapacityBytes;
    }

    public void setDatastoreCapacityBytes(Long datastoreCapacityBytes) {
        this.datastoreCapacityBytes = datastoreCapacityBytes;
    }

    public NestedDatastore datastoreCapacityBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public NestedDatastore datastoreCapacityBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public void setDatastoreCapacityBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        }
    }

    public boolean getDatastoreCapacityBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
    }

    public NestedDatastore description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NestedDatastore description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NestedDatastore description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public NestedDatastore freeBytes(Long freeBytes) {

        this.freeBytes = freeBytes;
        return this;
    }

    /**
     * Get freeBytes
     *
     * @return freeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytes() {
        return freeBytes;
    }

    public void setFreeBytes(Long freeBytes) {
        this.freeBytes = freeBytes;
    }

    public NestedDatastore freeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public NestedDatastore freeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public void setFreeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        }
    }

    public boolean getFreeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES);
    }

    public NestedDatastore id(String id) {

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

    public NestedDatastore id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedDatastore id_ExplictlyNonNull() {
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

    public NestedDatastore localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public NestedDatastore localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NestedDatastore localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public NestedDatastore name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NestedDatastore name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedDatastore name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public NestedDatastore status(DatastoreStatus status) {

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
    public DatastoreStatus getStatus() {
        return status;
    }

    public void setStatus(DatastoreStatus status) {
        this.status = status;
    }

    public NestedDatastore status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public NestedDatastore status_ExplictlyNonNull() {
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

    public NestedDatastore type(StorageProtocol type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public StorageProtocol getType() {
        return type;
    }

    public void setType(StorageProtocol type) {
        this.type = type;
    }

    public NestedDatastore type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedDatastore type_ExplictlyNonNull() {
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

    public NestedDatastore usedBytes(Long usedBytes) {

        this.usedBytes = usedBytes;
        return this;
    }

    /**
     * Get usedBytes
     *
     * @return usedBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }

    public NestedDatastore usedBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public NestedDatastore usedBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public void setUsedBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        }
    }

    public boolean getUsedBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedDatastore nestedDatastore = (NestedDatastore) o;
        return Objects.equals(this.datastoreCapacityBytes, nestedDatastore.datastoreCapacityBytes)
                && Objects.equals(this.description, nestedDatastore.description)
                && Objects.equals(this.freeBytes, nestedDatastore.freeBytes)
                && Objects.equals(this.id, nestedDatastore.id)
                && Objects.equals(this.localId, nestedDatastore.localId)
                && Objects.equals(this.name, nestedDatastore.name)
                && Objects.equals(this.status, nestedDatastore.status)
                && Objects.equals(this.type, nestedDatastore.type)
                && Objects.equals(this.usedBytes, nestedDatastore.usedBytes);
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
                datastoreCapacityBytes,
                description,
                freeBytes,
                id,
                localId,
                name,
                status,
                type,
                usedBytes);
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
        sb.append("class NestedDatastore {\n");
        sb.append("    datastoreCapacityBytes: ")
                .append(toIndentedString(datastoreCapacityBytes))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    freeBytes: ").append(toIndentedString(freeBytes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usedBytes: ").append(toIndentedString(usedBytes)).append("\n");
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
