package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NamespaceGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NamespaceGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME = "local_create_time";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME)
    private String localCreateTime;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";

    @SerializedName(SERIALIZED_NAME_NAMESPACES)
    private List<NestedNvmfNamespace> namespaces = null;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NestedNvmfSubsystem nvmfSubsystem;

    public NamespaceGroup() {}

    public NamespaceGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public NamespaceGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NamespaceGroup entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public NamespaceGroup id(String id) {

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

    public NamespaceGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NamespaceGroup id_ExplictlyNonNull() {
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

    public NamespaceGroup labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public NamespaceGroup addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public NamespaceGroup labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public NamespaceGroup labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public NamespaceGroup localCreateTime(String localCreateTime) {

        this.localCreateTime = localCreateTime;
        return this;
    }

    /**
     * Get localCreateTime
     *
     * @return localCreateTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreateTime() {
        return localCreateTime;
    }

    public void setLocalCreateTime(String localCreateTime) {
        this.localCreateTime = localCreateTime;
    }

    public NamespaceGroup localCreateTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        return this;
    }

    public NamespaceGroup localCreateTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        return this;
    }

    public void setLocalCreateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        }
    }

    public boolean getLocalCreateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATE_TIME);
    }

    public NamespaceGroup localId(String localId) {

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

    public NamespaceGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NamespaceGroup localId_ExplictlyNonNull() {
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

    public NamespaceGroup name(String name) {

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

    public NamespaceGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NamespaceGroup name_ExplictlyNonNull() {
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

    public NamespaceGroup namespaces(List<NestedNvmfNamespace> namespaces) {

        this.namespaces = namespaces;
        return this;
    }

    public NamespaceGroup addNamespacesItem(NestedNvmfNamespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<NestedNvmfNamespace>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    /**
     * Get namespaces
     *
     * @return namespaces
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfNamespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<NestedNvmfNamespace> namespaces) {
        this.namespaces = namespaces;
    }

    public NamespaceGroup namespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public NamespaceGroup namespaces_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public void setNamespaces_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        }
    }

    public boolean getNamespaces_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES);
    }

    public NamespaceGroup nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedNvmfSubsystem getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public NamespaceGroup nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public NamespaceGroup nvmfSubsystem_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public void setNvmfSubsystem_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        }
    }

    public boolean getNvmfSubsystem_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NamespaceGroup namespaceGroup = (NamespaceGroup) o;
        return Objects.equals(this.entityAsyncStatus, namespaceGroup.entityAsyncStatus)
                && Objects.equals(this.id, namespaceGroup.id)
                && Objects.equals(this.labels, namespaceGroup.labels)
                && Objects.equals(this.localCreateTime, namespaceGroup.localCreateTime)
                && Objects.equals(this.localId, namespaceGroup.localId)
                && Objects.equals(this.name, namespaceGroup.name)
                && Objects.equals(this.namespaces, namespaceGroup.namespaces)
                && Objects.equals(this.nvmfSubsystem, namespaceGroup.nvmfSubsystem);
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
                entityAsyncStatus,
                id,
                labels,
                localCreateTime,
                localId,
                name,
                namespaces,
                nvmfSubsystem);
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
        sb.append("class NamespaceGroup {\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreateTime: ").append(toIndentedString(localCreateTime)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
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
