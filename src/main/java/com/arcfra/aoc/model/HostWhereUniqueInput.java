package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** HostWhereUniqueInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostWhereUniqueInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID)
    private String chunkId;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID = "node_topo_local_id";

    @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID)
    private String nodeTopoLocalId;

    public HostWhereUniqueInput() {}

    public HostWhereUniqueInput chunkId(String chunkId) {

        this.chunkId = chunkId;
        return this;
    }

    /**
     * Get chunkId
     *
     * @return chunkId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChunkId() {
        return chunkId;
    }

    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public HostWhereUniqueInput chunkId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public HostWhereUniqueInput chunkId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public void setChunkId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        }
    }

    public boolean getChunkId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID);
    }

    public HostWhereUniqueInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HostWhereUniqueInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public HostWhereUniqueInput id_ExplictlyNonNull() {
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

    public HostWhereUniqueInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public HostWhereUniqueInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public HostWhereUniqueInput localId_ExplictlyNonNull() {
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

    public HostWhereUniqueInput nodeTopoLocalId(String nodeTopoLocalId) {

        this.nodeTopoLocalId = nodeTopoLocalId;
        return this;
    }

    /**
     * Get nodeTopoLocalId
     *
     * @return nodeTopoLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNodeTopoLocalId() {
        return nodeTopoLocalId;
    }

    public void setNodeTopoLocalId(String nodeTopoLocalId) {
        this.nodeTopoLocalId = nodeTopoLocalId;
    }

    public HostWhereUniqueInput nodeTopoLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        return this;
    }

    public HostWhereUniqueInput nodeTopoLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        return this;
    }

    public void setNodeTopoLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        }
    }

    public boolean getNodeTopoLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostWhereUniqueInput hostWhereUniqueInput = (HostWhereUniqueInput) o;
        return Objects.equals(this.chunkId, hostWhereUniqueInput.chunkId)
                && Objects.equals(this.id, hostWhereUniqueInput.id)
                && Objects.equals(this.localId, hostWhereUniqueInput.localId)
                && Objects.equals(this.nodeTopoLocalId, hostWhereUniqueInput.nodeTopoLocalId);
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
        return Objects.hash(chunkId, id, localId, nodeTopoLocalId);
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
        sb.append("class HostWhereUniqueInput {\n");
        sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    nodeTopoLocalId: ").append(toIndentedString(nodeTopoLocalId)).append("\n");
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
