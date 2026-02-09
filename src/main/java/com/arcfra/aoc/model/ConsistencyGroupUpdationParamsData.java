package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ConsistencyGroupUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT = "remain_volume_snapshot";

    @SerializedName(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT)
    private Boolean remainVolumeSnapshot;

    public static final String SERIALIZED_NAME_NAMESPACES_IDS = "namespaces_ids";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_IDS)
    private List<String> namespacesIds = null;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_IDS = "iscsi_luns_ids";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_IDS)
    private List<String> iscsiLunsIds = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ConsistencyGroupUpdationParamsData() {}

    public ConsistencyGroupUpdationParamsData remainVolumeSnapshot(Boolean remainVolumeSnapshot) {

        this.remainVolumeSnapshot = remainVolumeSnapshot;
        return this;
    }

    /**
     * Get remainVolumeSnapshot
     *
     * @return remainVolumeSnapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRemainVolumeSnapshot() {
        return remainVolumeSnapshot;
    }

    public void setRemainVolumeSnapshot(Boolean remainVolumeSnapshot) {
        this.remainVolumeSnapshot = remainVolumeSnapshot;
    }

    public ConsistencyGroupUpdationParamsData remainVolumeSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        return this;
    }

    public ConsistencyGroupUpdationParamsData remainVolumeSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        return this;
    }

    public void setRemainVolumeSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
        }
    }

    public boolean getRemainVolumeSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_VOLUME_SNAPSHOT);
    }

    public ConsistencyGroupUpdationParamsData namespacesIds(List<String> namespacesIds) {

        this.namespacesIds = namespacesIds;
        return this;
    }

    public ConsistencyGroupUpdationParamsData addNamespacesIdsItem(String namespacesIdsItem) {
        if (this.namespacesIds == null) {
            this.namespacesIds = new ArrayList<String>();
        }
        this.namespacesIds.add(namespacesIdsItem);
        return this;
    }

    /**
     * Get namespacesIds
     *
     * @return namespacesIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNamespacesIds() {
        return namespacesIds;
    }

    public void setNamespacesIds(List<String> namespacesIds) {
        this.namespacesIds = namespacesIds;
    }

    public ConsistencyGroupUpdationParamsData namespacesIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_IDS);
        return this;
    }

    public ConsistencyGroupUpdationParamsData namespacesIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_IDS);
        return this;
    }

    public void setNamespacesIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_IDS);
        }
    }

    public boolean getNamespacesIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_IDS);
    }

    public ConsistencyGroupUpdationParamsData iscsiLunsIds(List<String> iscsiLunsIds) {

        this.iscsiLunsIds = iscsiLunsIds;
        return this;
    }

    public ConsistencyGroupUpdationParamsData addIscsiLunsIdsItem(String iscsiLunsIdsItem) {
        if (this.iscsiLunsIds == null) {
            this.iscsiLunsIds = new ArrayList<String>();
        }
        this.iscsiLunsIds.add(iscsiLunsIdsItem);
        return this;
    }

    /**
     * Get iscsiLunsIds
     *
     * @return iscsiLunsIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiLunsIds() {
        return iscsiLunsIds;
    }

    public void setIscsiLunsIds(List<String> iscsiLunsIds) {
        this.iscsiLunsIds = iscsiLunsIds;
    }

    public ConsistencyGroupUpdationParamsData iscsiLunsIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_IDS);
        return this;
    }

    public ConsistencyGroupUpdationParamsData iscsiLunsIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_IDS);
        return this;
    }

    public void setIscsiLunsIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_IDS);
        }
    }

    public boolean getIscsiLunsIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_IDS);
    }

    public ConsistencyGroupUpdationParamsData description(String description) {

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

    public ConsistencyGroupUpdationParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ConsistencyGroupUpdationParamsData description_ExplictlyNonNull() {
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

    public ConsistencyGroupUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsistencyGroupUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ConsistencyGroupUpdationParamsData name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsistencyGroupUpdationParamsData consistencyGroupUpdationParamsData =
                (ConsistencyGroupUpdationParamsData) o;
        return Objects.equals(
                        this.remainVolumeSnapshot,
                        consistencyGroupUpdationParamsData.remainVolumeSnapshot)
                && Objects.equals(
                        this.namespacesIds, consistencyGroupUpdationParamsData.namespacesIds)
                && Objects.equals(
                        this.iscsiLunsIds, consistencyGroupUpdationParamsData.iscsiLunsIds)
                && Objects.equals(this.description, consistencyGroupUpdationParamsData.description)
                && Objects.equals(this.name, consistencyGroupUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remainVolumeSnapshot, namespacesIds, iscsiLunsIds, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyGroupUpdationParamsData {\n");
        sb.append("    remainVolumeSnapshot: ")
                .append(toIndentedString(remainVolumeSnapshot))
                .append("\n");
        sb.append("    namespacesIds: ").append(toIndentedString(namespacesIds)).append("\n");
        sb.append("    iscsiLunsIds: ").append(toIndentedString(iscsiLunsIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
