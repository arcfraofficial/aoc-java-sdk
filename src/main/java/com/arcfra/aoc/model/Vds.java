package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Vds */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Vds extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";

    @SerializedName(SERIALIZED_NAME_BOND_MODE)
    private String bondMode;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private List<NestedNic> nics = null;

    public static final String SERIALIZED_NAME_OVSBR_NAME = "ovsbr_name";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME)
    private String ovsbrName;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkType type;

    public static final String SERIALIZED_NAME_VLANS = "vlans";

    @SerializedName(SERIALIZED_NAME_VLANS)
    private List<NestedVlan> vlans = null;

    public static final String SERIALIZED_NAME_VLANS_NUM = "vlans_num";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM)
    private Integer vlansNum;

    public static final String SERIALIZED_NAME_WORK_MODE = "work_mode";

    @SerializedName(SERIALIZED_NAME_WORK_MODE)
    private String workMode;

    public Vds() {}

    public Vds bondMode(String bondMode) {

        this.bondMode = bondMode;
        return this;
    }

    /**
     * Get bondMode
     *
     * @return bondMode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBondMode() {
        return bondMode;
    }

    public void setBondMode(String bondMode) {
        this.bondMode = bondMode;
    }

    public Vds bondMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public Vds bondMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public void setBondMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE);
        }
    }

    public boolean getBondMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE);
    }

    public Vds cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public Vds cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Vds cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public Vds entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Vds entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Vds entityAsyncStatus_ExplictlyNonNull() {
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

    public Vds everouteCluster(NestedEverouteCluster everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteCluster getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public Vds everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public Vds everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public Vds id(String id) {

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

    public Vds id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Vds id_ExplictlyNonNull() {
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

    public Vds internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Vds internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public Vds internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public Vds labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Vds addLabelsItem(NestedLabel labelsItem) {
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

    public Vds labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Vds labels_ExplictlyNonNull() {
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

    public Vds localId(String localId) {

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

    public Vds localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Vds localId_ExplictlyNonNull() {
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

    public Vds name(String name) {

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

    public Vds name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Vds name_ExplictlyNonNull() {
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

    public Vds nics(List<NestedNic> nics) {

        this.nics = nics;
        return this;
    }

    public Vds addNicsItem(NestedNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<NestedNic>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNic> getNics() {
        return nics;
    }

    public void setNics(List<NestedNic> nics) {
        this.nics = nics;
    }

    public Vds nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public Vds nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public Vds ovsbrName(String ovsbrName) {

        this.ovsbrName = ovsbrName;
        return this;
    }

    /**
     * Get ovsbrName
     *
     * @return ovsbrName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getOvsbrName() {
        return ovsbrName;
    }

    public void setOvsbrName(String ovsbrName) {
        this.ovsbrName = ovsbrName;
    }

    public Vds ovsbrName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME);
        return this;
    }

    public Vds ovsbrName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME);
        return this;
    }

    public void setOvsbrName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME);
        }
    }

    public boolean getOvsbrName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME);
    }

    public Vds type(NetworkType type) {

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
    public NetworkType getType() {
        return type;
    }

    public void setType(NetworkType type) {
        this.type = type;
    }

    public Vds type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Vds type_ExplictlyNonNull() {
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

    public Vds vlans(List<NestedVlan> vlans) {

        this.vlans = vlans;
        return this;
    }

    public Vds addVlansItem(NestedVlan vlansItem) {
        if (this.vlans == null) {
            this.vlans = new ArrayList<NestedVlan>();
        }
        this.vlans.add(vlansItem);
        return this;
    }

    /**
     * Get vlans
     *
     * @return vlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVlan> getVlans() {
        return vlans;
    }

    public void setVlans(List<NestedVlan> vlans) {
        this.vlans = vlans;
    }

    public Vds vlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS);
        return this;
    }

    public Vds vlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS);
        return this;
    }

    public void setVlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS);
        }
    }

    public boolean getVlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS);
    }

    public Vds vlansNum(Integer vlansNum) {

        this.vlansNum = vlansNum;
        return this;
    }

    /**
     * Get vlansNum
     *
     * @return vlansNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVlansNum() {
        return vlansNum;
    }

    public void setVlansNum(Integer vlansNum) {
        this.vlansNum = vlansNum;
    }

    public Vds vlansNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM);
        return this;
    }

    public Vds vlansNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM);
        return this;
    }

    public void setVlansNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM);
        }
    }

    public boolean getVlansNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM);
    }

    public Vds workMode(String workMode) {

        this.workMode = workMode;
        return this;
    }

    /**
     * Get workMode
     *
     * @return workMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public Vds workMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public Vds workMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public void setWorkMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE);
        }
    }

    public boolean getWorkMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vds vds = (Vds) o;
        return Objects.equals(this.bondMode, vds.bondMode)
                && Objects.equals(this.cluster, vds.cluster)
                && Objects.equals(this.entityAsyncStatus, vds.entityAsyncStatus)
                && Objects.equals(this.everouteCluster, vds.everouteCluster)
                && Objects.equals(this.id, vds.id)
                && Objects.equals(this.internal, vds.internal)
                && Objects.equals(this.labels, vds.labels)
                && Objects.equals(this.localId, vds.localId)
                && Objects.equals(this.name, vds.name)
                && Objects.equals(this.nics, vds.nics)
                && Objects.equals(this.ovsbrName, vds.ovsbrName)
                && Objects.equals(this.type, vds.type)
                && Objects.equals(this.vlans, vds.vlans)
                && Objects.equals(this.vlansNum, vds.vlansNum)
                && Objects.equals(this.workMode, vds.workMode);
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
                bondMode,
                cluster,
                entityAsyncStatus,
                everouteCluster,
                id,
                internal,
                labels,
                localId,
                name,
                nics,
                ovsbrName,
                type,
                vlans,
                vlansNum,
                workMode);
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
        sb.append("class Vds {\n");
        sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    ovsbrName: ").append(toIndentedString(ovsbrName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
        sb.append("    vlansNum: ").append(toIndentedString(vlansNum)).append("\n");
        sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
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
