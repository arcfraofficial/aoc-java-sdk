package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BrickTopoWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BrickTopoWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BrickTopoWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BrickTopoWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BrickTopoWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CLUSTER_TOPO = "cluster_topo";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO)
    private ClusterTopoWhereInput clusterTopo;

    public static final String SERIALIZED_NAME_HEIGHT = "height";

    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_HEIGHT_GT = "height_gt";

    @SerializedName(SERIALIZED_NAME_HEIGHT_GT)
    private Integer heightGt;

    public static final String SERIALIZED_NAME_HEIGHT_GTE = "height_gte";

    @SerializedName(SERIALIZED_NAME_HEIGHT_GTE)
    private Integer heightGte;

    public static final String SERIALIZED_NAME_HEIGHT_IN = "height_in";

    @SerializedName(SERIALIZED_NAME_HEIGHT_IN)
    private List<Integer> heightIn = null;

    public static final String SERIALIZED_NAME_HEIGHT_LT = "height_lt";

    @SerializedName(SERIALIZED_NAME_HEIGHT_LT)
    private Integer heightLt;

    public static final String SERIALIZED_NAME_HEIGHT_LTE = "height_lte";

    @SerializedName(SERIALIZED_NAME_HEIGHT_LTE)
    private Integer heightLte;

    public static final String SERIALIZED_NAME_HEIGHT_NOT = "height_not";

    @SerializedName(SERIALIZED_NAME_HEIGHT_NOT)
    private Integer heightNot;

    public static final String SERIALIZED_NAME_HEIGHT_NOT_IN = "height_not_in";

    @SerializedName(SERIALIZED_NAME_HEIGHT_NOT_IN)
    private List<Integer> heightNotIn = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_MODEL_CONTAINS = "model_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_CONTAINS)
    private String modelContains;

    public static final String SERIALIZED_NAME_MODEL_ENDS_WITH = "model_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_ENDS_WITH)
    private String modelEndsWith;

    public static final String SERIALIZED_NAME_MODEL_GT = "model_gt";

    @SerializedName(SERIALIZED_NAME_MODEL_GT)
    private String modelGt;

    public static final String SERIALIZED_NAME_MODEL_GTE = "model_gte";

    @SerializedName(SERIALIZED_NAME_MODEL_GTE)
    private String modelGte;

    public static final String SERIALIZED_NAME_MODEL_IN = "model_in";

    @SerializedName(SERIALIZED_NAME_MODEL_IN)
    private List<String> modelIn = null;

    public static final String SERIALIZED_NAME_MODEL_LT = "model_lt";

    @SerializedName(SERIALIZED_NAME_MODEL_LT)
    private String modelLt;

    public static final String SERIALIZED_NAME_MODEL_LTE = "model_lte";

    @SerializedName(SERIALIZED_NAME_MODEL_LTE)
    private String modelLte;

    public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT)
    private String modelNot;

    public static final String SERIALIZED_NAME_MODEL_NOT_CONTAINS = "model_not_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_CONTAINS)
    private String modelNotContains;

    public static final String SERIALIZED_NAME_MODEL_NOT_ENDS_WITH = "model_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH)
    private String modelNotEndsWith;

    public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
    private List<String> modelNotIn = null;

    public static final String SERIALIZED_NAME_MODEL_NOT_STARTS_WITH = "model_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH)
    private String modelNotStartsWith;

    public static final String SERIALIZED_NAME_MODEL_STARTS_WITH = "model_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_STARTS_WITH)
    private String modelStartsWith;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_NODE_TOPOES_EVERY = "node_topoes_every";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES_EVERY)
    private NodeTopoWhereInput nodeTopoesEvery;

    public static final String SERIALIZED_NAME_NODE_TOPOES_NONE = "node_topoes_none";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES_NONE)
    private NodeTopoWhereInput nodeTopoesNone;

    public static final String SERIALIZED_NAME_NODE_TOPOES_SOME = "node_topoes_some";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES_SOME)
    private NodeTopoWhereInput nodeTopoesSome;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;

    public static final String SERIALIZED_NAME_POSITION_GT = "position_gt";

    @SerializedName(SERIALIZED_NAME_POSITION_GT)
    private Integer positionGt;

    public static final String SERIALIZED_NAME_POSITION_GTE = "position_gte";

    @SerializedName(SERIALIZED_NAME_POSITION_GTE)
    private Integer positionGte;

    public static final String SERIALIZED_NAME_POSITION_IN = "position_in";

    @SerializedName(SERIALIZED_NAME_POSITION_IN)
    private List<Integer> positionIn = null;

    public static final String SERIALIZED_NAME_POSITION_LT = "position_lt";

    @SerializedName(SERIALIZED_NAME_POSITION_LT)
    private Integer positionLt;

    public static final String SERIALIZED_NAME_POSITION_LTE = "position_lte";

    @SerializedName(SERIALIZED_NAME_POSITION_LTE)
    private Integer positionLte;

    public static final String SERIALIZED_NAME_POSITION_NOT = "position_not";

    @SerializedName(SERIALIZED_NAME_POSITION_NOT)
    private Integer positionNot;

    public static final String SERIALIZED_NAME_POSITION_NOT_IN = "position_not_in";

    @SerializedName(SERIALIZED_NAME_POSITION_NOT_IN)
    private List<Integer> positionNotIn = null;

    public static final String SERIALIZED_NAME_POWER_LAYOUT = "power_layout";

    @SerializedName(SERIALIZED_NAME_POWER_LAYOUT)
    private Direction powerLayout;

    public static final String SERIALIZED_NAME_POWER_LAYOUT_IN = "power_layout_in";

    @SerializedName(SERIALIZED_NAME_POWER_LAYOUT_IN)
    private List<Direction> powerLayoutIn = null;

    public static final String SERIALIZED_NAME_POWER_LAYOUT_NOT = "power_layout_not";

    @SerializedName(SERIALIZED_NAME_POWER_LAYOUT_NOT)
    private Direction powerLayoutNot;

    public static final String SERIALIZED_NAME_POWER_LAYOUT_NOT_IN = "power_layout_not_in";

    @SerializedName(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN)
    private List<Direction> powerLayoutNotIn = null;

    public static final String SERIALIZED_NAME_POWER_POSITION = "power_position";

    @SerializedName(SERIALIZED_NAME_POWER_POSITION)
    private PowerPosition powerPosition;

    public static final String SERIALIZED_NAME_POWER_POSITION_IN = "power_position_in";

    @SerializedName(SERIALIZED_NAME_POWER_POSITION_IN)
    private List<PowerPosition> powerPositionIn = null;

    public static final String SERIALIZED_NAME_POWER_POSITION_NOT = "power_position_not";

    @SerializedName(SERIALIZED_NAME_POWER_POSITION_NOT)
    private PowerPosition powerPositionNot;

    public static final String SERIALIZED_NAME_POWER_POSITION_NOT_IN = "power_position_not_in";

    @SerializedName(SERIALIZED_NAME_POWER_POSITION_NOT_IN)
    private List<PowerPosition> powerPositionNotIn = null;

    public static final String SERIALIZED_NAME_RACK_TOPO = "rack_topo";

    @SerializedName(SERIALIZED_NAME_RACK_TOPO)
    private RackTopoWhereInput rackTopo;

    public BrickTopoWhereInput() {}

    public BrickTopoWhereInput AND(List<BrickTopoWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BrickTopoWhereInput addANDItem(BrickTopoWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BrickTopoWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BrickTopoWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BrickTopoWhereInput> AND) {
        this.AND = AND;
    }

    public BrickTopoWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BrickTopoWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public BrickTopoWhereInput NOT(List<BrickTopoWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BrickTopoWhereInput addNOTItem(BrickTopoWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BrickTopoWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BrickTopoWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BrickTopoWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BrickTopoWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BrickTopoWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public BrickTopoWhereInput OR(List<BrickTopoWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BrickTopoWhereInput addORItem(BrickTopoWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BrickTopoWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BrickTopoWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BrickTopoWhereInput> OR) {
        this.OR = OR;
    }

    public BrickTopoWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BrickTopoWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public BrickTopoWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public BrickTopoWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public BrickTopoWhereInput cluster_ExplictlyNonNull() {
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

    public BrickTopoWhereInput clusterTopo(ClusterTopoWhereInput clusterTopo) {

        this.clusterTopo = clusterTopo;
        return this;
    }

    /**
     * Get clusterTopo
     *
     * @return clusterTopo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterTopoWhereInput getClusterTopo() {
        return clusterTopo;
    }

    public void setClusterTopo(ClusterTopoWhereInput clusterTopo) {
        this.clusterTopo = clusterTopo;
    }

    public BrickTopoWhereInput clusterTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public BrickTopoWhereInput clusterTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public void setClusterTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO);
        }
    }

    public boolean getClusterTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_TOPO);
    }

    public BrickTopoWhereInput height(Integer height) {

        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BrickTopoWhereInput height_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public BrickTopoWhereInput height_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public void setHeight_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT);
        }
    }

    public boolean getHeight_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT);
    }

    public BrickTopoWhereInput heightGt(Integer heightGt) {

        this.heightGt = heightGt;
        return this;
    }

    /**
     * Get heightGt
     *
     * @return heightGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeightGt() {
        return heightGt;
    }

    public void setHeightGt(Integer heightGt) {
        this.heightGt = heightGt;
    }

    public BrickTopoWhereInput heightGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_GT);
        return this;
    }

    public BrickTopoWhereInput heightGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_GT);
        return this;
    }

    public void setHeightGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_GT);
        }
    }

    public boolean getHeightGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_GT);
    }

    public BrickTopoWhereInput heightGte(Integer heightGte) {

        this.heightGte = heightGte;
        return this;
    }

    /**
     * Get heightGte
     *
     * @return heightGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeightGte() {
        return heightGte;
    }

    public void setHeightGte(Integer heightGte) {
        this.heightGte = heightGte;
    }

    public BrickTopoWhereInput heightGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_GTE);
        return this;
    }

    public BrickTopoWhereInput heightGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_GTE);
        return this;
    }

    public void setHeightGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_GTE);
        }
    }

    public boolean getHeightGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_GTE);
    }

    public BrickTopoWhereInput heightIn(List<Integer> heightIn) {

        this.heightIn = heightIn;
        return this;
    }

    public BrickTopoWhereInput addHeightInItem(Integer heightInItem) {
        if (this.heightIn == null) {
            this.heightIn = new ArrayList<Integer>();
        }
        this.heightIn.add(heightInItem);
        return this;
    }

    /**
     * Get heightIn
     *
     * @return heightIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(List<Integer> heightIn) {
        this.heightIn = heightIn;
    }

    public BrickTopoWhereInput heightIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_IN);
        return this;
    }

    public BrickTopoWhereInput heightIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_IN);
        return this;
    }

    public void setHeightIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_IN);
        }
    }

    public boolean getHeightIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_IN);
    }

    public BrickTopoWhereInput heightLt(Integer heightLt) {

        this.heightLt = heightLt;
        return this;
    }

    /**
     * Get heightLt
     *
     * @return heightLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeightLt() {
        return heightLt;
    }

    public void setHeightLt(Integer heightLt) {
        this.heightLt = heightLt;
    }

    public BrickTopoWhereInput heightLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_LT);
        return this;
    }

    public BrickTopoWhereInput heightLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_LT);
        return this;
    }

    public void setHeightLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_LT);
        }
    }

    public boolean getHeightLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_LT);
    }

    public BrickTopoWhereInput heightLte(Integer heightLte) {

        this.heightLte = heightLte;
        return this;
    }

    /**
     * Get heightLte
     *
     * @return heightLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeightLte() {
        return heightLte;
    }

    public void setHeightLte(Integer heightLte) {
        this.heightLte = heightLte;
    }

    public BrickTopoWhereInput heightLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_LTE);
        return this;
    }

    public BrickTopoWhereInput heightLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_LTE);
        return this;
    }

    public void setHeightLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_LTE);
        }
    }

    public boolean getHeightLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_LTE);
    }

    public BrickTopoWhereInput heightNot(Integer heightNot) {

        this.heightNot = heightNot;
        return this;
    }

    /**
     * Get heightNot
     *
     * @return heightNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeightNot() {
        return heightNot;
    }

    public void setHeightNot(Integer heightNot) {
        this.heightNot = heightNot;
    }

    public BrickTopoWhereInput heightNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_NOT);
        return this;
    }

    public BrickTopoWhereInput heightNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_NOT);
        return this;
    }

    public void setHeightNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_NOT);
        }
    }

    public boolean getHeightNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_NOT);
    }

    public BrickTopoWhereInput heightNotIn(List<Integer> heightNotIn) {

        this.heightNotIn = heightNotIn;
        return this;
    }

    public BrickTopoWhereInput addHeightNotInItem(Integer heightNotInItem) {
        if (this.heightNotIn == null) {
            this.heightNotIn = new ArrayList<Integer>();
        }
        this.heightNotIn.add(heightNotInItem);
        return this;
    }

    /**
     * Get heightNotIn
     *
     * @return heightNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHeightNotIn() {
        return heightNotIn;
    }

    public void setHeightNotIn(List<Integer> heightNotIn) {
        this.heightNotIn = heightNotIn;
    }

    public BrickTopoWhereInput heightNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput heightNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_NOT_IN);
        return this;
    }

    public void setHeightNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT_NOT_IN);
        }
    }

    public boolean getHeightNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT_NOT_IN);
    }

    public BrickTopoWhereInput id(String id) {

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

    public BrickTopoWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BrickTopoWhereInput id_ExplictlyNonNull() {
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

    public BrickTopoWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public BrickTopoWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public BrickTopoWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public BrickTopoWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public BrickTopoWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public BrickTopoWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BrickTopoWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public BrickTopoWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public BrickTopoWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BrickTopoWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public BrickTopoWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BrickTopoWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public BrickTopoWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BrickTopoWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public BrickTopoWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public BrickTopoWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BrickTopoWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public BrickTopoWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public BrickTopoWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BrickTopoWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public BrickTopoWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public BrickTopoWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BrickTopoWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public BrickTopoWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public BrickTopoWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public BrickTopoWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public BrickTopoWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public BrickTopoWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BrickTopoWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public BrickTopoWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public BrickTopoWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public BrickTopoWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public BrickTopoWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public BrickTopoWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public BrickTopoWhereInput localId(String localId) {

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

    public BrickTopoWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BrickTopoWhereInput localId_ExplictlyNonNull() {
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

    public BrickTopoWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public BrickTopoWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public BrickTopoWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public BrickTopoWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public BrickTopoWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public BrickTopoWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public BrickTopoWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public BrickTopoWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public BrickTopoWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public BrickTopoWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public BrickTopoWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public BrickTopoWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public BrickTopoWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public BrickTopoWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public BrickTopoWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public BrickTopoWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public BrickTopoWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public BrickTopoWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public BrickTopoWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public BrickTopoWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public BrickTopoWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public BrickTopoWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public BrickTopoWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public BrickTopoWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public BrickTopoWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public BrickTopoWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public BrickTopoWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public BrickTopoWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public BrickTopoWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public BrickTopoWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public BrickTopoWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public BrickTopoWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public BrickTopoWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public BrickTopoWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public BrickTopoWhereInput model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BrickTopoWhereInput model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public BrickTopoWhereInput model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public BrickTopoWhereInput modelContains(String modelContains) {

        this.modelContains = modelContains;
        return this;
    }

    /**
     * Get modelContains
     *
     * @return modelContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelContains() {
        return modelContains;
    }

    public void setModelContains(String modelContains) {
        this.modelContains = modelContains;
    }

    public BrickTopoWhereInput modelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput modelContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public void setModelContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        }
    }

    public boolean getModelContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_CONTAINS);
    }

    public BrickTopoWhereInput modelEndsWith(String modelEndsWith) {

        this.modelEndsWith = modelEndsWith;
        return this;
    }

    /**
     * Get modelEndsWith
     *
     * @return modelEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelEndsWith() {
        return modelEndsWith;
    }

    public void setModelEndsWith(String modelEndsWith) {
        this.modelEndsWith = modelEndsWith;
    }

    public BrickTopoWhereInput modelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput modelEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public void setModelEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        }
    }

    public boolean getModelEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_ENDS_WITH);
    }

    public BrickTopoWhereInput modelGt(String modelGt) {

        this.modelGt = modelGt;
        return this;
    }

    /**
     * Get modelGt
     *
     * @return modelGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGt() {
        return modelGt;
    }

    public void setModelGt(String modelGt) {
        this.modelGt = modelGt;
    }

    public BrickTopoWhereInput modelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public BrickTopoWhereInput modelGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public void setModelGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        }
    }

    public boolean getModelGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GT);
    }

    public BrickTopoWhereInput modelGte(String modelGte) {

        this.modelGte = modelGte;
        return this;
    }

    /**
     * Get modelGte
     *
     * @return modelGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGte() {
        return modelGte;
    }

    public void setModelGte(String modelGte) {
        this.modelGte = modelGte;
    }

    public BrickTopoWhereInput modelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public BrickTopoWhereInput modelGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public void setModelGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        }
    }

    public boolean getModelGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GTE);
    }

    public BrickTopoWhereInput modelIn(List<String> modelIn) {

        this.modelIn = modelIn;
        return this;
    }

    public BrickTopoWhereInput addModelInItem(String modelInItem) {
        if (this.modelIn == null) {
            this.modelIn = new ArrayList<String>();
        }
        this.modelIn.add(modelInItem);
        return this;
    }

    /**
     * Get modelIn
     *
     * @return modelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModelIn() {
        return modelIn;
    }

    public void setModelIn(List<String> modelIn) {
        this.modelIn = modelIn;
    }

    public BrickTopoWhereInput modelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public BrickTopoWhereInput modelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public void setModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        }
    }

    public boolean getModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_IN);
    }

    public BrickTopoWhereInput modelLt(String modelLt) {

        this.modelLt = modelLt;
        return this;
    }

    /**
     * Get modelLt
     *
     * @return modelLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLt() {
        return modelLt;
    }

    public void setModelLt(String modelLt) {
        this.modelLt = modelLt;
    }

    public BrickTopoWhereInput modelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public BrickTopoWhereInput modelLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public void setModelLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        }
    }

    public boolean getModelLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LT);
    }

    public BrickTopoWhereInput modelLte(String modelLte) {

        this.modelLte = modelLte;
        return this;
    }

    /**
     * Get modelLte
     *
     * @return modelLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLte() {
        return modelLte;
    }

    public void setModelLte(String modelLte) {
        this.modelLte = modelLte;
    }

    public BrickTopoWhereInput modelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public BrickTopoWhereInput modelLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public void setModelLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        }
    }

    public boolean getModelLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LTE);
    }

    public BrickTopoWhereInput modelNot(String modelNot) {

        this.modelNot = modelNot;
        return this;
    }

    /**
     * Get modelNot
     *
     * @return modelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNot() {
        return modelNot;
    }

    public void setModelNot(String modelNot) {
        this.modelNot = modelNot;
    }

    public BrickTopoWhereInput modelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public BrickTopoWhereInput modelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public void setModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        }
    }

    public boolean getModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT);
    }

    public BrickTopoWhereInput modelNotContains(String modelNotContains) {

        this.modelNotContains = modelNotContains;
        return this;
    }

    /**
     * Get modelNotContains
     *
     * @return modelNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotContains() {
        return modelNotContains;
    }

    public void setModelNotContains(String modelNotContains) {
        this.modelNotContains = modelNotContains;
    }

    public BrickTopoWhereInput modelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput modelNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public void setModelNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        }
    }

    public boolean getModelNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
    }

    public BrickTopoWhereInput modelNotEndsWith(String modelNotEndsWith) {

        this.modelNotEndsWith = modelNotEndsWith;
        return this;
    }

    /**
     * Get modelNotEndsWith
     *
     * @return modelNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotEndsWith() {
        return modelNotEndsWith;
    }

    public void setModelNotEndsWith(String modelNotEndsWith) {
        this.modelNotEndsWith = modelNotEndsWith;
    }

    public BrickTopoWhereInput modelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput modelNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public void setModelNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        }
    }

    public boolean getModelNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
    }

    public BrickTopoWhereInput modelNotIn(List<String> modelNotIn) {

        this.modelNotIn = modelNotIn;
        return this;
    }

    public BrickTopoWhereInput addModelNotInItem(String modelNotInItem) {
        if (this.modelNotIn == null) {
            this.modelNotIn = new ArrayList<String>();
        }
        this.modelNotIn.add(modelNotInItem);
        return this;
    }

    /**
     * Get modelNotIn
     *
     * @return modelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModelNotIn() {
        return modelNotIn;
    }

    public void setModelNotIn(List<String> modelNotIn) {
        this.modelNotIn = modelNotIn;
    }

    public BrickTopoWhereInput modelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput modelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public void setModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        }
    }

    public boolean getModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_IN);
    }

    public BrickTopoWhereInput modelNotStartsWith(String modelNotStartsWith) {

        this.modelNotStartsWith = modelNotStartsWith;
        return this;
    }

    /**
     * Get modelNotStartsWith
     *
     * @return modelNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotStartsWith() {
        return modelNotStartsWith;
    }

    public void setModelNotStartsWith(String modelNotStartsWith) {
        this.modelNotStartsWith = modelNotStartsWith;
    }

    public BrickTopoWhereInput modelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput modelNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public void setModelNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        }
    }

    public boolean getModelNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
    }

    public BrickTopoWhereInput modelStartsWith(String modelStartsWith) {

        this.modelStartsWith = modelStartsWith;
        return this;
    }

    /**
     * Get modelStartsWith
     *
     * @return modelStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelStartsWith() {
        return modelStartsWith;
    }

    public void setModelStartsWith(String modelStartsWith) {
        this.modelStartsWith = modelStartsWith;
    }

    public BrickTopoWhereInput modelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput modelStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public void setModelStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        }
    }

    public boolean getModelStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_STARTS_WITH);
    }

    public BrickTopoWhereInput name(String name) {

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

    public BrickTopoWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BrickTopoWhereInput name_ExplictlyNonNull() {
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

    public BrickTopoWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public BrickTopoWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public BrickTopoWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public BrickTopoWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public BrickTopoWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public BrickTopoWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public BrickTopoWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public BrickTopoWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public BrickTopoWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public BrickTopoWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public BrickTopoWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public BrickTopoWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public BrickTopoWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public BrickTopoWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public BrickTopoWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public BrickTopoWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public BrickTopoWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public BrickTopoWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public BrickTopoWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public BrickTopoWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public BrickTopoWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public BrickTopoWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public BrickTopoWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public BrickTopoWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public BrickTopoWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public BrickTopoWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public BrickTopoWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public BrickTopoWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BrickTopoWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public BrickTopoWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public BrickTopoWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public BrickTopoWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public BrickTopoWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public BrickTopoWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public BrickTopoWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public BrickTopoWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public BrickTopoWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public BrickTopoWhereInput nodeTopoesEvery(NodeTopoWhereInput nodeTopoesEvery) {

        this.nodeTopoesEvery = nodeTopoesEvery;
        return this;
    }

    /**
     * Get nodeTopoesEvery
     *
     * @return nodeTopoesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NodeTopoWhereInput getNodeTopoesEvery() {
        return nodeTopoesEvery;
    }

    public void setNodeTopoesEvery(NodeTopoWhereInput nodeTopoesEvery) {
        this.nodeTopoesEvery = nodeTopoesEvery;
    }

    public BrickTopoWhereInput nodeTopoesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_EVERY);
        return this;
    }

    public BrickTopoWhereInput nodeTopoesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_EVERY);
        return this;
    }

    public void setNodeTopoesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_EVERY);
        }
    }

    public boolean getNodeTopoesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPOES_EVERY);
    }

    public BrickTopoWhereInput nodeTopoesNone(NodeTopoWhereInput nodeTopoesNone) {

        this.nodeTopoesNone = nodeTopoesNone;
        return this;
    }

    /**
     * Get nodeTopoesNone
     *
     * @return nodeTopoesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NodeTopoWhereInput getNodeTopoesNone() {
        return nodeTopoesNone;
    }

    public void setNodeTopoesNone(NodeTopoWhereInput nodeTopoesNone) {
        this.nodeTopoesNone = nodeTopoesNone;
    }

    public BrickTopoWhereInput nodeTopoesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_NONE);
        return this;
    }

    public BrickTopoWhereInput nodeTopoesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_NONE);
        return this;
    }

    public void setNodeTopoesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_NONE);
        }
    }

    public boolean getNodeTopoesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPOES_NONE);
    }

    public BrickTopoWhereInput nodeTopoesSome(NodeTopoWhereInput nodeTopoesSome) {

        this.nodeTopoesSome = nodeTopoesSome;
        return this;
    }

    /**
     * Get nodeTopoesSome
     *
     * @return nodeTopoesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NodeTopoWhereInput getNodeTopoesSome() {
        return nodeTopoesSome;
    }

    public void setNodeTopoesSome(NodeTopoWhereInput nodeTopoesSome) {
        this.nodeTopoesSome = nodeTopoesSome;
    }

    public BrickTopoWhereInput nodeTopoesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_SOME);
        return this;
    }

    public BrickTopoWhereInput nodeTopoesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_SOME);
        return this;
    }

    public void setNodeTopoesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES_SOME);
        }
    }

    public boolean getNodeTopoesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPOES_SOME);
    }

    public BrickTopoWhereInput position(Integer position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     *
     * @return position
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BrickTopoWhereInput position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public BrickTopoWhereInput position_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION);
        return this;
    }

    public void setPosition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION);
        }
    }

    public boolean getPosition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION);
    }

    public BrickTopoWhereInput positionGt(Integer positionGt) {

        this.positionGt = positionGt;
        return this;
    }

    /**
     * Get positionGt
     *
     * @return positionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPositionGt() {
        return positionGt;
    }

    public void setPositionGt(Integer positionGt) {
        this.positionGt = positionGt;
    }

    public BrickTopoWhereInput positionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_GT);
        return this;
    }

    public BrickTopoWhereInput positionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_GT);
        return this;
    }

    public void setPositionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_GT);
        }
    }

    public boolean getPositionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_GT);
    }

    public BrickTopoWhereInput positionGte(Integer positionGte) {

        this.positionGte = positionGte;
        return this;
    }

    /**
     * Get positionGte
     *
     * @return positionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPositionGte() {
        return positionGte;
    }

    public void setPositionGte(Integer positionGte) {
        this.positionGte = positionGte;
    }

    public BrickTopoWhereInput positionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_GTE);
        return this;
    }

    public BrickTopoWhereInput positionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_GTE);
        return this;
    }

    public void setPositionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_GTE);
        }
    }

    public boolean getPositionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_GTE);
    }

    public BrickTopoWhereInput positionIn(List<Integer> positionIn) {

        this.positionIn = positionIn;
        return this;
    }

    public BrickTopoWhereInput addPositionInItem(Integer positionInItem) {
        if (this.positionIn == null) {
            this.positionIn = new ArrayList<Integer>();
        }
        this.positionIn.add(positionInItem);
        return this;
    }

    /**
     * Get positionIn
     *
     * @return positionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPositionIn() {
        return positionIn;
    }

    public void setPositionIn(List<Integer> positionIn) {
        this.positionIn = positionIn;
    }

    public BrickTopoWhereInput positionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_IN);
        return this;
    }

    public BrickTopoWhereInput positionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_IN);
        return this;
    }

    public void setPositionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_IN);
        }
    }

    public boolean getPositionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_IN);
    }

    public BrickTopoWhereInput positionLt(Integer positionLt) {

        this.positionLt = positionLt;
        return this;
    }

    /**
     * Get positionLt
     *
     * @return positionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPositionLt() {
        return positionLt;
    }

    public void setPositionLt(Integer positionLt) {
        this.positionLt = positionLt;
    }

    public BrickTopoWhereInput positionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_LT);
        return this;
    }

    public BrickTopoWhereInput positionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_LT);
        return this;
    }

    public void setPositionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_LT);
        }
    }

    public boolean getPositionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_LT);
    }

    public BrickTopoWhereInput positionLte(Integer positionLte) {

        this.positionLte = positionLte;
        return this;
    }

    /**
     * Get positionLte
     *
     * @return positionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPositionLte() {
        return positionLte;
    }

    public void setPositionLte(Integer positionLte) {
        this.positionLte = positionLte;
    }

    public BrickTopoWhereInput positionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_LTE);
        return this;
    }

    public BrickTopoWhereInput positionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_LTE);
        return this;
    }

    public void setPositionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_LTE);
        }
    }

    public boolean getPositionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_LTE);
    }

    public BrickTopoWhereInput positionNot(Integer positionNot) {

        this.positionNot = positionNot;
        return this;
    }

    /**
     * Get positionNot
     *
     * @return positionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPositionNot() {
        return positionNot;
    }

    public void setPositionNot(Integer positionNot) {
        this.positionNot = positionNot;
    }

    public BrickTopoWhereInput positionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_NOT);
        return this;
    }

    public BrickTopoWhereInput positionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_NOT);
        return this;
    }

    public void setPositionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_NOT);
        }
    }

    public boolean getPositionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_NOT);
    }

    public BrickTopoWhereInput positionNotIn(List<Integer> positionNotIn) {

        this.positionNotIn = positionNotIn;
        return this;
    }

    public BrickTopoWhereInput addPositionNotInItem(Integer positionNotInItem) {
        if (this.positionNotIn == null) {
            this.positionNotIn = new ArrayList<Integer>();
        }
        this.positionNotIn.add(positionNotInItem);
        return this;
    }

    /**
     * Get positionNotIn
     *
     * @return positionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPositionNotIn() {
        return positionNotIn;
    }

    public void setPositionNotIn(List<Integer> positionNotIn) {
        this.positionNotIn = positionNotIn;
    }

    public BrickTopoWhereInput positionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput positionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION_NOT_IN);
        return this;
    }

    public void setPositionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION_NOT_IN);
        }
    }

    public boolean getPositionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION_NOT_IN);
    }

    public BrickTopoWhereInput powerLayout(Direction powerLayout) {

        this.powerLayout = powerLayout;
        return this;
    }

    /**
     * Get powerLayout
     *
     * @return powerLayout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Direction getPowerLayout() {
        return powerLayout;
    }

    public void setPowerLayout(Direction powerLayout) {
        this.powerLayout = powerLayout;
    }

    public BrickTopoWhereInput powerLayout_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT);
        return this;
    }

    public BrickTopoWhereInput powerLayout_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT);
        return this;
    }

    public void setPowerLayout_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT);
        }
    }

    public boolean getPowerLayout_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_LAYOUT);
    }

    public BrickTopoWhereInput powerLayoutIn(List<Direction> powerLayoutIn) {

        this.powerLayoutIn = powerLayoutIn;
        return this;
    }

    public BrickTopoWhereInput addPowerLayoutInItem(Direction powerLayoutInItem) {
        if (this.powerLayoutIn == null) {
            this.powerLayoutIn = new ArrayList<Direction>();
        }
        this.powerLayoutIn.add(powerLayoutInItem);
        return this;
    }

    /**
     * Get powerLayoutIn
     *
     * @return powerLayoutIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Direction> getPowerLayoutIn() {
        return powerLayoutIn;
    }

    public void setPowerLayoutIn(List<Direction> powerLayoutIn) {
        this.powerLayoutIn = powerLayoutIn;
    }

    public BrickTopoWhereInput powerLayoutIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_IN);
        return this;
    }

    public BrickTopoWhereInput powerLayoutIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_IN);
        return this;
    }

    public void setPowerLayoutIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_IN);
        }
    }

    public boolean getPowerLayoutIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_LAYOUT_IN);
    }

    public BrickTopoWhereInput powerLayoutNot(Direction powerLayoutNot) {

        this.powerLayoutNot = powerLayoutNot;
        return this;
    }

    /**
     * Get powerLayoutNot
     *
     * @return powerLayoutNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Direction getPowerLayoutNot() {
        return powerLayoutNot;
    }

    public void setPowerLayoutNot(Direction powerLayoutNot) {
        this.powerLayoutNot = powerLayoutNot;
    }

    public BrickTopoWhereInput powerLayoutNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_NOT);
        return this;
    }

    public BrickTopoWhereInput powerLayoutNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_NOT);
        return this;
    }

    public void setPowerLayoutNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_NOT);
        }
    }

    public boolean getPowerLayoutNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_LAYOUT_NOT);
    }

    public BrickTopoWhereInput powerLayoutNotIn(List<Direction> powerLayoutNotIn) {

        this.powerLayoutNotIn = powerLayoutNotIn;
        return this;
    }

    public BrickTopoWhereInput addPowerLayoutNotInItem(Direction powerLayoutNotInItem) {
        if (this.powerLayoutNotIn == null) {
            this.powerLayoutNotIn = new ArrayList<Direction>();
        }
        this.powerLayoutNotIn.add(powerLayoutNotInItem);
        return this;
    }

    /**
     * Get powerLayoutNotIn
     *
     * @return powerLayoutNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Direction> getPowerLayoutNotIn() {
        return powerLayoutNotIn;
    }

    public void setPowerLayoutNotIn(List<Direction> powerLayoutNotIn) {
        this.powerLayoutNotIn = powerLayoutNotIn;
    }

    public BrickTopoWhereInput powerLayoutNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput powerLayoutNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN);
        return this;
    }

    public void setPowerLayoutNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN);
        }
    }

    public boolean getPowerLayoutNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_LAYOUT_NOT_IN);
    }

    public BrickTopoWhereInput powerPosition(PowerPosition powerPosition) {

        this.powerPosition = powerPosition;
        return this;
    }

    /**
     * Get powerPosition
     *
     * @return powerPosition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PowerPosition getPowerPosition() {
        return powerPosition;
    }

    public void setPowerPosition(PowerPosition powerPosition) {
        this.powerPosition = powerPosition;
    }

    public BrickTopoWhereInput powerPosition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION);
        return this;
    }

    public BrickTopoWhereInput powerPosition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION);
        return this;
    }

    public void setPowerPosition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION);
        }
    }

    public boolean getPowerPosition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_POSITION);
    }

    public BrickTopoWhereInput powerPositionIn(List<PowerPosition> powerPositionIn) {

        this.powerPositionIn = powerPositionIn;
        return this;
    }

    public BrickTopoWhereInput addPowerPositionInItem(PowerPosition powerPositionInItem) {
        if (this.powerPositionIn == null) {
            this.powerPositionIn = new ArrayList<PowerPosition>();
        }
        this.powerPositionIn.add(powerPositionInItem);
        return this;
    }

    /**
     * Get powerPositionIn
     *
     * @return powerPositionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PowerPosition> getPowerPositionIn() {
        return powerPositionIn;
    }

    public void setPowerPositionIn(List<PowerPosition> powerPositionIn) {
        this.powerPositionIn = powerPositionIn;
    }

    public BrickTopoWhereInput powerPositionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_IN);
        return this;
    }

    public BrickTopoWhereInput powerPositionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_IN);
        return this;
    }

    public void setPowerPositionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_IN);
        }
    }

    public boolean getPowerPositionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_POSITION_IN);
    }

    public BrickTopoWhereInput powerPositionNot(PowerPosition powerPositionNot) {

        this.powerPositionNot = powerPositionNot;
        return this;
    }

    /**
     * Get powerPositionNot
     *
     * @return powerPositionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PowerPosition getPowerPositionNot() {
        return powerPositionNot;
    }

    public void setPowerPositionNot(PowerPosition powerPositionNot) {
        this.powerPositionNot = powerPositionNot;
    }

    public BrickTopoWhereInput powerPositionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_NOT);
        return this;
    }

    public BrickTopoWhereInput powerPositionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_NOT);
        return this;
    }

    public void setPowerPositionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_NOT);
        }
    }

    public boolean getPowerPositionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_POSITION_NOT);
    }

    public BrickTopoWhereInput powerPositionNotIn(List<PowerPosition> powerPositionNotIn) {

        this.powerPositionNotIn = powerPositionNotIn;
        return this;
    }

    public BrickTopoWhereInput addPowerPositionNotInItem(PowerPosition powerPositionNotInItem) {
        if (this.powerPositionNotIn == null) {
            this.powerPositionNotIn = new ArrayList<PowerPosition>();
        }
        this.powerPositionNotIn.add(powerPositionNotInItem);
        return this;
    }

    /**
     * Get powerPositionNotIn
     *
     * @return powerPositionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PowerPosition> getPowerPositionNotIn() {
        return powerPositionNotIn;
    }

    public void setPowerPositionNotIn(List<PowerPosition> powerPositionNotIn) {
        this.powerPositionNotIn = powerPositionNotIn;
    }

    public BrickTopoWhereInput powerPositionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_NOT_IN);
        return this;
    }

    public BrickTopoWhereInput powerPositionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_NOT_IN);
        return this;
    }

    public void setPowerPositionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION_NOT_IN);
        }
    }

    public boolean getPowerPositionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_POSITION_NOT_IN);
    }

    public BrickTopoWhereInput rackTopo(RackTopoWhereInput rackTopo) {

        this.rackTopo = rackTopo;
        return this;
    }

    /**
     * Get rackTopo
     *
     * @return rackTopo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public RackTopoWhereInput getRackTopo() {
        return rackTopo;
    }

    public void setRackTopo(RackTopoWhereInput rackTopo) {
        this.rackTopo = rackTopo;
    }

    public BrickTopoWhereInput rackTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO);
        return this;
    }

    public BrickTopoWhereInput rackTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO);
        return this;
    }

    public void setRackTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO);
        }
    }

    public boolean getRackTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RACK_TOPO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrickTopoWhereInput brickTopoWhereInput = (BrickTopoWhereInput) o;
        return Objects.equals(this.AND, brickTopoWhereInput.AND)
                && Objects.equals(this.NOT, brickTopoWhereInput.NOT)
                && Objects.equals(this.OR, brickTopoWhereInput.OR)
                && Objects.equals(this.cluster, brickTopoWhereInput.cluster)
                && Objects.equals(this.clusterTopo, brickTopoWhereInput.clusterTopo)
                && Objects.equals(this.height, brickTopoWhereInput.height)
                && Objects.equals(this.heightGt, brickTopoWhereInput.heightGt)
                && Objects.equals(this.heightGte, brickTopoWhereInput.heightGte)
                && Objects.equals(this.heightIn, brickTopoWhereInput.heightIn)
                && Objects.equals(this.heightLt, brickTopoWhereInput.heightLt)
                && Objects.equals(this.heightLte, brickTopoWhereInput.heightLte)
                && Objects.equals(this.heightNot, brickTopoWhereInput.heightNot)
                && Objects.equals(this.heightNotIn, brickTopoWhereInput.heightNotIn)
                && Objects.equals(this.id, brickTopoWhereInput.id)
                && Objects.equals(this.idContains, brickTopoWhereInput.idContains)
                && Objects.equals(this.idEndsWith, brickTopoWhereInput.idEndsWith)
                && Objects.equals(this.idGt, brickTopoWhereInput.idGt)
                && Objects.equals(this.idGte, brickTopoWhereInput.idGte)
                && Objects.equals(this.idIn, brickTopoWhereInput.idIn)
                && Objects.equals(this.idLt, brickTopoWhereInput.idLt)
                && Objects.equals(this.idLte, brickTopoWhereInput.idLte)
                && Objects.equals(this.idNot, brickTopoWhereInput.idNot)
                && Objects.equals(this.idNotContains, brickTopoWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, brickTopoWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, brickTopoWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, brickTopoWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, brickTopoWhereInput.idStartsWith)
                && Objects.equals(this.localId, brickTopoWhereInput.localId)
                && Objects.equals(this.localIdContains, brickTopoWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, brickTopoWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, brickTopoWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, brickTopoWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, brickTopoWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, brickTopoWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, brickTopoWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, brickTopoWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, brickTopoWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, brickTopoWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, brickTopoWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, brickTopoWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, brickTopoWhereInput.localIdStartsWith)
                && Objects.equals(this.model, brickTopoWhereInput.model)
                && Objects.equals(this.modelContains, brickTopoWhereInput.modelContains)
                && Objects.equals(this.modelEndsWith, brickTopoWhereInput.modelEndsWith)
                && Objects.equals(this.modelGt, brickTopoWhereInput.modelGt)
                && Objects.equals(this.modelGte, brickTopoWhereInput.modelGte)
                && Objects.equals(this.modelIn, brickTopoWhereInput.modelIn)
                && Objects.equals(this.modelLt, brickTopoWhereInput.modelLt)
                && Objects.equals(this.modelLte, brickTopoWhereInput.modelLte)
                && Objects.equals(this.modelNot, brickTopoWhereInput.modelNot)
                && Objects.equals(this.modelNotContains, brickTopoWhereInput.modelNotContains)
                && Objects.equals(this.modelNotEndsWith, brickTopoWhereInput.modelNotEndsWith)
                && Objects.equals(this.modelNotIn, brickTopoWhereInput.modelNotIn)
                && Objects.equals(this.modelNotStartsWith, brickTopoWhereInput.modelNotStartsWith)
                && Objects.equals(this.modelStartsWith, brickTopoWhereInput.modelStartsWith)
                && Objects.equals(this.name, brickTopoWhereInput.name)
                && Objects.equals(this.nameContains, brickTopoWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, brickTopoWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, brickTopoWhereInput.nameGt)
                && Objects.equals(this.nameGte, brickTopoWhereInput.nameGte)
                && Objects.equals(this.nameIn, brickTopoWhereInput.nameIn)
                && Objects.equals(this.nameLt, brickTopoWhereInput.nameLt)
                && Objects.equals(this.nameLte, brickTopoWhereInput.nameLte)
                && Objects.equals(this.nameNot, brickTopoWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, brickTopoWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, brickTopoWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, brickTopoWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, brickTopoWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, brickTopoWhereInput.nameStartsWith)
                && Objects.equals(this.nodeTopoesEvery, brickTopoWhereInput.nodeTopoesEvery)
                && Objects.equals(this.nodeTopoesNone, brickTopoWhereInput.nodeTopoesNone)
                && Objects.equals(this.nodeTopoesSome, brickTopoWhereInput.nodeTopoesSome)
                && Objects.equals(this.position, brickTopoWhereInput.position)
                && Objects.equals(this.positionGt, brickTopoWhereInput.positionGt)
                && Objects.equals(this.positionGte, brickTopoWhereInput.positionGte)
                && Objects.equals(this.positionIn, brickTopoWhereInput.positionIn)
                && Objects.equals(this.positionLt, brickTopoWhereInput.positionLt)
                && Objects.equals(this.positionLte, brickTopoWhereInput.positionLte)
                && Objects.equals(this.positionNot, brickTopoWhereInput.positionNot)
                && Objects.equals(this.positionNotIn, brickTopoWhereInput.positionNotIn)
                && Objects.equals(this.powerLayout, brickTopoWhereInput.powerLayout)
                && Objects.equals(this.powerLayoutIn, brickTopoWhereInput.powerLayoutIn)
                && Objects.equals(this.powerLayoutNot, brickTopoWhereInput.powerLayoutNot)
                && Objects.equals(this.powerLayoutNotIn, brickTopoWhereInput.powerLayoutNotIn)
                && Objects.equals(this.powerPosition, brickTopoWhereInput.powerPosition)
                && Objects.equals(this.powerPositionIn, brickTopoWhereInput.powerPositionIn)
                && Objects.equals(this.powerPositionNot, brickTopoWhereInput.powerPositionNot)
                && Objects.equals(this.powerPositionNotIn, brickTopoWhereInput.powerPositionNotIn)
                && Objects.equals(this.rackTopo, brickTopoWhereInput.rackTopo);
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
                AND,
                NOT,
                OR,
                cluster,
                clusterTopo,
                height,
                heightGt,
                heightGte,
                heightIn,
                heightLt,
                heightLte,
                heightNot,
                heightNotIn,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                model,
                modelContains,
                modelEndsWith,
                modelGt,
                modelGte,
                modelIn,
                modelLt,
                modelLte,
                modelNot,
                modelNotContains,
                modelNotEndsWith,
                modelNotIn,
                modelNotStartsWith,
                modelStartsWith,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                nodeTopoesEvery,
                nodeTopoesNone,
                nodeTopoesSome,
                position,
                positionGt,
                positionGte,
                positionIn,
                positionLt,
                positionLte,
                positionNot,
                positionNotIn,
                powerLayout,
                powerLayoutIn,
                powerLayoutNot,
                powerLayoutNotIn,
                powerPosition,
                powerPositionIn,
                powerPositionNot,
                powerPositionNotIn,
                rackTopo);
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
        sb.append("class BrickTopoWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterTopo: ").append(toIndentedString(clusterTopo)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    heightGt: ").append(toIndentedString(heightGt)).append("\n");
        sb.append("    heightGte: ").append(toIndentedString(heightGte)).append("\n");
        sb.append("    heightIn: ").append(toIndentedString(heightIn)).append("\n");
        sb.append("    heightLt: ").append(toIndentedString(heightLt)).append("\n");
        sb.append("    heightLte: ").append(toIndentedString(heightLte)).append("\n");
        sb.append("    heightNot: ").append(toIndentedString(heightNot)).append("\n");
        sb.append("    heightNotIn: ").append(toIndentedString(heightNotIn)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelContains: ").append(toIndentedString(modelContains)).append("\n");
        sb.append("    modelEndsWith: ").append(toIndentedString(modelEndsWith)).append("\n");
        sb.append("    modelGt: ").append(toIndentedString(modelGt)).append("\n");
        sb.append("    modelGte: ").append(toIndentedString(modelGte)).append("\n");
        sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
        sb.append("    modelLt: ").append(toIndentedString(modelLt)).append("\n");
        sb.append("    modelLte: ").append(toIndentedString(modelLte)).append("\n");
        sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
        sb.append("    modelNotContains: ").append(toIndentedString(modelNotContains)).append("\n");
        sb.append("    modelNotEndsWith: ").append(toIndentedString(modelNotEndsWith)).append("\n");
        sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
        sb.append("    modelNotStartsWith: ")
                .append(toIndentedString(modelNotStartsWith))
                .append("\n");
        sb.append("    modelStartsWith: ").append(toIndentedString(modelStartsWith)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    nodeTopoesEvery: ").append(toIndentedString(nodeTopoesEvery)).append("\n");
        sb.append("    nodeTopoesNone: ").append(toIndentedString(nodeTopoesNone)).append("\n");
        sb.append("    nodeTopoesSome: ").append(toIndentedString(nodeTopoesSome)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    positionGt: ").append(toIndentedString(positionGt)).append("\n");
        sb.append("    positionGte: ").append(toIndentedString(positionGte)).append("\n");
        sb.append("    positionIn: ").append(toIndentedString(positionIn)).append("\n");
        sb.append("    positionLt: ").append(toIndentedString(positionLt)).append("\n");
        sb.append("    positionLte: ").append(toIndentedString(positionLte)).append("\n");
        sb.append("    positionNot: ").append(toIndentedString(positionNot)).append("\n");
        sb.append("    positionNotIn: ").append(toIndentedString(positionNotIn)).append("\n");
        sb.append("    powerLayout: ").append(toIndentedString(powerLayout)).append("\n");
        sb.append("    powerLayoutIn: ").append(toIndentedString(powerLayoutIn)).append("\n");
        sb.append("    powerLayoutNot: ").append(toIndentedString(powerLayoutNot)).append("\n");
        sb.append("    powerLayoutNotIn: ").append(toIndentedString(powerLayoutNotIn)).append("\n");
        sb.append("    powerPosition: ").append(toIndentedString(powerPosition)).append("\n");
        sb.append("    powerPositionIn: ").append(toIndentedString(powerPositionIn)).append("\n");
        sb.append("    powerPositionNot: ").append(toIndentedString(powerPositionNot)).append("\n");
        sb.append("    powerPositionNotIn: ")
                .append(toIndentedString(powerPositionNotIn))
                .append("\n");
        sb.append("    rackTopo: ").append(toIndentedString(rackTopo)).append("\n");
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
