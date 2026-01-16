package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VdsWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VdsWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VdsWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VdsWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VdsWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";

    @SerializedName(SERIALIZED_NAME_BOND_MODE)
    private String bondMode;

    public static final String SERIALIZED_NAME_BOND_MODE_CONTAINS = "bond_mode_contains";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_CONTAINS)
    private String bondModeContains;

    public static final String SERIALIZED_NAME_BOND_MODE_ENDS_WITH = "bond_mode_ends_with";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_ENDS_WITH)
    private String bondModeEndsWith;

    public static final String SERIALIZED_NAME_BOND_MODE_GT = "bond_mode_gt";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_GT)
    private String bondModeGt;

    public static final String SERIALIZED_NAME_BOND_MODE_GTE = "bond_mode_gte";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_GTE)
    private String bondModeGte;

    public static final String SERIALIZED_NAME_BOND_MODE_IN = "bond_mode_in";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_IN)
    private List<String> bondModeIn = null;

    public static final String SERIALIZED_NAME_BOND_MODE_LT = "bond_mode_lt";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_LT)
    private String bondModeLt;

    public static final String SERIALIZED_NAME_BOND_MODE_LTE = "bond_mode_lte";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_LTE)
    private String bondModeLte;

    public static final String SERIALIZED_NAME_BOND_MODE_NOT = "bond_mode_not";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_NOT)
    private String bondModeNot;

    public static final String SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS = "bond_mode_not_contains";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS)
    private String bondModeNotContains;

    public static final String SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH = "bond_mode_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH)
    private String bondModeNotEndsWith;

    public static final String SERIALIZED_NAME_BOND_MODE_NOT_IN = "bond_mode_not_in";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_NOT_IN)
    private List<String> bondModeNotIn = null;

    public static final String SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH =
            "bond_mode_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH)
    private String bondModeNotStartsWith;

    public static final String SERIALIZED_NAME_BOND_MODE_STARTS_WITH = "bond_mode_starts_with";

    @SerializedName(SERIALIZED_NAME_BOND_MODE_STARTS_WITH)
    private String bondModeStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private EverouteClusterWhereInput everouteCluster;

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

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

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

    public static final String SERIALIZED_NAME_NICS_EVERY = "nics_every";

    @SerializedName(SERIALIZED_NAME_NICS_EVERY)
    private NicWhereInput nicsEvery;

    public static final String SERIALIZED_NAME_NICS_NONE = "nics_none";

    @SerializedName(SERIALIZED_NAME_NICS_NONE)
    private NicWhereInput nicsNone;

    public static final String SERIALIZED_NAME_NICS_SOME = "nics_some";

    @SerializedName(SERIALIZED_NAME_NICS_SOME)
    private NicWhereInput nicsSome;

    public static final String SERIALIZED_NAME_OVSBR_NAME = "ovsbr_name";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME)
    private String ovsbrName;

    public static final String SERIALIZED_NAME_OVSBR_NAME_CONTAINS = "ovsbr_name_contains";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_CONTAINS)
    private String ovsbrNameContains;

    public static final String SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH = "ovsbr_name_ends_with";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH)
    private String ovsbrNameEndsWith;

    public static final String SERIALIZED_NAME_OVSBR_NAME_GT = "ovsbr_name_gt";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_GT)
    private String ovsbrNameGt;

    public static final String SERIALIZED_NAME_OVSBR_NAME_GTE = "ovsbr_name_gte";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_GTE)
    private String ovsbrNameGte;

    public static final String SERIALIZED_NAME_OVSBR_NAME_IN = "ovsbr_name_in";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_IN)
    private List<String> ovsbrNameIn = null;

    public static final String SERIALIZED_NAME_OVSBR_NAME_LT = "ovsbr_name_lt";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_LT)
    private String ovsbrNameLt;

    public static final String SERIALIZED_NAME_OVSBR_NAME_LTE = "ovsbr_name_lte";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_LTE)
    private String ovsbrNameLte;

    public static final String SERIALIZED_NAME_OVSBR_NAME_NOT = "ovsbr_name_not";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_NOT)
    private String ovsbrNameNot;

    public static final String SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS = "ovsbr_name_not_contains";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS)
    private String ovsbrNameNotContains;

    public static final String SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH =
            "ovsbr_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH)
    private String ovsbrNameNotEndsWith;

    public static final String SERIALIZED_NAME_OVSBR_NAME_NOT_IN = "ovsbr_name_not_in";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_NOT_IN)
    private List<String> ovsbrNameNotIn = null;

    public static final String SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH =
            "ovsbr_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH)
    private String ovsbrNameNotStartsWith;

    public static final String SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH = "ovsbr_name_starts_with";

    @SerializedName(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH)
    private String ovsbrNameStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<NetworkType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private NetworkType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<NetworkType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VLANS_EVERY = "vlans_every";

    @SerializedName(SERIALIZED_NAME_VLANS_EVERY)
    private VlanWhereInput vlansEvery;

    public static final String SERIALIZED_NAME_VLANS_NONE = "vlans_none";

    @SerializedName(SERIALIZED_NAME_VLANS_NONE)
    private VlanWhereInput vlansNone;

    public static final String SERIALIZED_NAME_VLANS_NUM = "vlans_num";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM)
    private Integer vlansNum;

    public static final String SERIALIZED_NAME_VLANS_NUM_GT = "vlans_num_gt";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_GT)
    private Integer vlansNumGt;

    public static final String SERIALIZED_NAME_VLANS_NUM_GTE = "vlans_num_gte";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_GTE)
    private Integer vlansNumGte;

    public static final String SERIALIZED_NAME_VLANS_NUM_IN = "vlans_num_in";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_IN)
    private List<Integer> vlansNumIn = null;

    public static final String SERIALIZED_NAME_VLANS_NUM_LT = "vlans_num_lt";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_LT)
    private Integer vlansNumLt;

    public static final String SERIALIZED_NAME_VLANS_NUM_LTE = "vlans_num_lte";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_LTE)
    private Integer vlansNumLte;

    public static final String SERIALIZED_NAME_VLANS_NUM_NOT = "vlans_num_not";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_NOT)
    private Integer vlansNumNot;

    public static final String SERIALIZED_NAME_VLANS_NUM_NOT_IN = "vlans_num_not_in";

    @SerializedName(SERIALIZED_NAME_VLANS_NUM_NOT_IN)
    private List<Integer> vlansNumNotIn = null;

    public static final String SERIALIZED_NAME_VLANS_SOME = "vlans_some";

    @SerializedName(SERIALIZED_NAME_VLANS_SOME)
    private VlanWhereInput vlansSome;

    public static final String SERIALIZED_NAME_WORK_MODE = "work_mode";

    @SerializedName(SERIALIZED_NAME_WORK_MODE)
    private String workMode;

    public static final String SERIALIZED_NAME_WORK_MODE_CONTAINS = "work_mode_contains";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_CONTAINS)
    private String workModeContains;

    public static final String SERIALIZED_NAME_WORK_MODE_ENDS_WITH = "work_mode_ends_with";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_ENDS_WITH)
    private String workModeEndsWith;

    public static final String SERIALIZED_NAME_WORK_MODE_GT = "work_mode_gt";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_GT)
    private String workModeGt;

    public static final String SERIALIZED_NAME_WORK_MODE_GTE = "work_mode_gte";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_GTE)
    private String workModeGte;

    public static final String SERIALIZED_NAME_WORK_MODE_IN = "work_mode_in";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_IN)
    private List<String> workModeIn = null;

    public static final String SERIALIZED_NAME_WORK_MODE_LT = "work_mode_lt";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_LT)
    private String workModeLt;

    public static final String SERIALIZED_NAME_WORK_MODE_LTE = "work_mode_lte";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_LTE)
    private String workModeLte;

    public static final String SERIALIZED_NAME_WORK_MODE_NOT = "work_mode_not";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_NOT)
    private String workModeNot;

    public static final String SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS = "work_mode_not_contains";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS)
    private String workModeNotContains;

    public static final String SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH = "work_mode_not_ends_with";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH)
    private String workModeNotEndsWith;

    public static final String SERIALIZED_NAME_WORK_MODE_NOT_IN = "work_mode_not_in";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_NOT_IN)
    private List<String> workModeNotIn = null;

    public static final String SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH =
            "work_mode_not_starts_with";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH)
    private String workModeNotStartsWith;

    public static final String SERIALIZED_NAME_WORK_MODE_STARTS_WITH = "work_mode_starts_with";

    @SerializedName(SERIALIZED_NAME_WORK_MODE_STARTS_WITH)
    private String workModeStartsWith;

    public VdsWhereInput() {}

    public VdsWhereInput AND(List<VdsWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VdsWhereInput addANDItem(VdsWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VdsWhereInput>();
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
    public List<VdsWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VdsWhereInput> AND) {
        this.AND = AND;
    }

    public VdsWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VdsWhereInput AND_ExplictlyNonNull() {
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

    public VdsWhereInput NOT(List<VdsWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VdsWhereInput addNOTItem(VdsWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VdsWhereInput>();
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
    public List<VdsWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VdsWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VdsWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VdsWhereInput NOT_ExplictlyNonNull() {
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

    public VdsWhereInput OR(List<VdsWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VdsWhereInput addORItem(VdsWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VdsWhereInput>();
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
    public List<VdsWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VdsWhereInput> OR) {
        this.OR = OR;
    }

    public VdsWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VdsWhereInput OR_ExplictlyNonNull() {
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

    public VdsWhereInput bondMode(String bondMode) {

        this.bondMode = bondMode;
        return this;
    }

    /**
     * Get bondMode
     *
     * @return bondMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondMode() {
        return bondMode;
    }

    public void setBondMode(String bondMode) {
        this.bondMode = bondMode;
    }

    public VdsWhereInput bondMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public VdsWhereInput bondMode_ExplictlyNonNull() {
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

    public VdsWhereInput bondModeContains(String bondModeContains) {

        this.bondModeContains = bondModeContains;
        return this;
    }

    /**
     * Get bondModeContains
     *
     * @return bondModeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeContains() {
        return bondModeContains;
    }

    public void setBondModeContains(String bondModeContains) {
        this.bondModeContains = bondModeContains;
    }

    public VdsWhereInput bondModeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_CONTAINS);
        return this;
    }

    public VdsWhereInput bondModeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_CONTAINS);
        return this;
    }

    public void setBondModeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_CONTAINS);
        }
    }

    public boolean getBondModeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_CONTAINS);
    }

    public VdsWhereInput bondModeEndsWith(String bondModeEndsWith) {

        this.bondModeEndsWith = bondModeEndsWith;
        return this;
    }

    /**
     * Get bondModeEndsWith
     *
     * @return bondModeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeEndsWith() {
        return bondModeEndsWith;
    }

    public void setBondModeEndsWith(String bondModeEndsWith) {
        this.bondModeEndsWith = bondModeEndsWith;
    }

    public VdsWhereInput bondModeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_ENDS_WITH);
        return this;
    }

    public VdsWhereInput bondModeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_ENDS_WITH);
        return this;
    }

    public void setBondModeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_ENDS_WITH);
        }
    }

    public boolean getBondModeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_ENDS_WITH);
    }

    public VdsWhereInput bondModeGt(String bondModeGt) {

        this.bondModeGt = bondModeGt;
        return this;
    }

    /**
     * Get bondModeGt
     *
     * @return bondModeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeGt() {
        return bondModeGt;
    }

    public void setBondModeGt(String bondModeGt) {
        this.bondModeGt = bondModeGt;
    }

    public VdsWhereInput bondModeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_GT);
        return this;
    }

    public VdsWhereInput bondModeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_GT);
        return this;
    }

    public void setBondModeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_GT);
        }
    }

    public boolean getBondModeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_GT);
    }

    public VdsWhereInput bondModeGte(String bondModeGte) {

        this.bondModeGte = bondModeGte;
        return this;
    }

    /**
     * Get bondModeGte
     *
     * @return bondModeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeGte() {
        return bondModeGte;
    }

    public void setBondModeGte(String bondModeGte) {
        this.bondModeGte = bondModeGte;
    }

    public VdsWhereInput bondModeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_GTE);
        return this;
    }

    public VdsWhereInput bondModeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_GTE);
        return this;
    }

    public void setBondModeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_GTE);
        }
    }

    public boolean getBondModeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_GTE);
    }

    public VdsWhereInput bondModeIn(List<String> bondModeIn) {

        this.bondModeIn = bondModeIn;
        return this;
    }

    public VdsWhereInput addBondModeInItem(String bondModeInItem) {
        if (this.bondModeIn == null) {
            this.bondModeIn = new ArrayList<String>();
        }
        this.bondModeIn.add(bondModeInItem);
        return this;
    }

    /**
     * Get bondModeIn
     *
     * @return bondModeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBondModeIn() {
        return bondModeIn;
    }

    public void setBondModeIn(List<String> bondModeIn) {
        this.bondModeIn = bondModeIn;
    }

    public VdsWhereInput bondModeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_IN);
        return this;
    }

    public VdsWhereInput bondModeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_IN);
        return this;
    }

    public void setBondModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_IN);
        }
    }

    public boolean getBondModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_IN);
    }

    public VdsWhereInput bondModeLt(String bondModeLt) {

        this.bondModeLt = bondModeLt;
        return this;
    }

    /**
     * Get bondModeLt
     *
     * @return bondModeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeLt() {
        return bondModeLt;
    }

    public void setBondModeLt(String bondModeLt) {
        this.bondModeLt = bondModeLt;
    }

    public VdsWhereInput bondModeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_LT);
        return this;
    }

    public VdsWhereInput bondModeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_LT);
        return this;
    }

    public void setBondModeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_LT);
        }
    }

    public boolean getBondModeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_LT);
    }

    public VdsWhereInput bondModeLte(String bondModeLte) {

        this.bondModeLte = bondModeLte;
        return this;
    }

    /**
     * Get bondModeLte
     *
     * @return bondModeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeLte() {
        return bondModeLte;
    }

    public void setBondModeLte(String bondModeLte) {
        this.bondModeLte = bondModeLte;
    }

    public VdsWhereInput bondModeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_LTE);
        return this;
    }

    public VdsWhereInput bondModeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_LTE);
        return this;
    }

    public void setBondModeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_LTE);
        }
    }

    public boolean getBondModeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_LTE);
    }

    public VdsWhereInput bondModeNot(String bondModeNot) {

        this.bondModeNot = bondModeNot;
        return this;
    }

    /**
     * Get bondModeNot
     *
     * @return bondModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeNot() {
        return bondModeNot;
    }

    public void setBondModeNot(String bondModeNot) {
        this.bondModeNot = bondModeNot;
    }

    public VdsWhereInput bondModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT);
        return this;
    }

    public VdsWhereInput bondModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT);
        return this;
    }

    public void setBondModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT);
        }
    }

    public boolean getBondModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_NOT);
    }

    public VdsWhereInput bondModeNotContains(String bondModeNotContains) {

        this.bondModeNotContains = bondModeNotContains;
        return this;
    }

    /**
     * Get bondModeNotContains
     *
     * @return bondModeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeNotContains() {
        return bondModeNotContains;
    }

    public void setBondModeNotContains(String bondModeNotContains) {
        this.bondModeNotContains = bondModeNotContains;
    }

    public VdsWhereInput bondModeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput bondModeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS);
        return this;
    }

    public void setBondModeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS);
        }
    }

    public boolean getBondModeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_NOT_CONTAINS);
    }

    public VdsWhereInput bondModeNotEndsWith(String bondModeNotEndsWith) {

        this.bondModeNotEndsWith = bondModeNotEndsWith;
        return this;
    }

    /**
     * Get bondModeNotEndsWith
     *
     * @return bondModeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeNotEndsWith() {
        return bondModeNotEndsWith;
    }

    public void setBondModeNotEndsWith(String bondModeNotEndsWith) {
        this.bondModeNotEndsWith = bondModeNotEndsWith;
    }

    public VdsWhereInput bondModeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput bondModeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH);
        return this;
    }

    public void setBondModeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH);
        }
    }

    public boolean getBondModeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_NOT_ENDS_WITH);
    }

    public VdsWhereInput bondModeNotIn(List<String> bondModeNotIn) {

        this.bondModeNotIn = bondModeNotIn;
        return this;
    }

    public VdsWhereInput addBondModeNotInItem(String bondModeNotInItem) {
        if (this.bondModeNotIn == null) {
            this.bondModeNotIn = new ArrayList<String>();
        }
        this.bondModeNotIn.add(bondModeNotInItem);
        return this;
    }

    /**
     * Get bondModeNotIn
     *
     * @return bondModeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBondModeNotIn() {
        return bondModeNotIn;
    }

    public void setBondModeNotIn(List<String> bondModeNotIn) {
        this.bondModeNotIn = bondModeNotIn;
    }

    public VdsWhereInput bondModeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_IN);
        return this;
    }

    public VdsWhereInput bondModeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_IN);
        return this;
    }

    public void setBondModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_IN);
        }
    }

    public boolean getBondModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_NOT_IN);
    }

    public VdsWhereInput bondModeNotStartsWith(String bondModeNotStartsWith) {

        this.bondModeNotStartsWith = bondModeNotStartsWith;
        return this;
    }

    /**
     * Get bondModeNotStartsWith
     *
     * @return bondModeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeNotStartsWith() {
        return bondModeNotStartsWith;
    }

    public void setBondModeNotStartsWith(String bondModeNotStartsWith) {
        this.bondModeNotStartsWith = bondModeNotStartsWith;
    }

    public VdsWhereInput bondModeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput bondModeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH);
        return this;
    }

    public void setBondModeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH);
        }
    }

    public boolean getBondModeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_NOT_STARTS_WITH);
    }

    public VdsWhereInput bondModeStartsWith(String bondModeStartsWith) {

        this.bondModeStartsWith = bondModeStartsWith;
        return this;
    }

    /**
     * Get bondModeStartsWith
     *
     * @return bondModeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondModeStartsWith() {
        return bondModeStartsWith;
    }

    public void setBondModeStartsWith(String bondModeStartsWith) {
        this.bondModeStartsWith = bondModeStartsWith;
    }

    public VdsWhereInput bondModeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_STARTS_WITH);
        return this;
    }

    public VdsWhereInput bondModeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_STARTS_WITH);
        return this;
    }

    public void setBondModeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE_STARTS_WITH);
        }
    }

    public boolean getBondModeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE_STARTS_WITH);
    }

    public VdsWhereInput cluster(ClusterWhereInput cluster) {

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

    public VdsWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VdsWhereInput cluster_ExplictlyNonNull() {
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

    public VdsWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VdsWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VdsWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VdsWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VdsWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public VdsWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VdsWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public VdsWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public VdsWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VdsWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public VdsWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VdsWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public VdsWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VdsWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public VdsWhereInput everouteCluster(EverouteClusterWhereInput everouteCluster) {

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
    public EverouteClusterWhereInput getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(EverouteClusterWhereInput everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public VdsWhereInput everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public VdsWhereInput everouteCluster_ExplictlyNonNull() {
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

    public VdsWhereInput id(String id) {

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

    public VdsWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VdsWhereInput id_ExplictlyNonNull() {
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

    public VdsWhereInput idContains(String idContains) {

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

    public VdsWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VdsWhereInput idContains_ExplictlyNonNull() {
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

    public VdsWhereInput idEndsWith(String idEndsWith) {

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

    public VdsWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VdsWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput idGt(String idGt) {

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

    public VdsWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VdsWhereInput idGt_ExplictlyNonNull() {
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

    public VdsWhereInput idGte(String idGte) {

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

    public VdsWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VdsWhereInput idGte_ExplictlyNonNull() {
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

    public VdsWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VdsWhereInput addIdInItem(String idInItem) {
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

    public VdsWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VdsWhereInput idIn_ExplictlyNonNull() {
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

    public VdsWhereInput idLt(String idLt) {

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

    public VdsWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VdsWhereInput idLt_ExplictlyNonNull() {
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

    public VdsWhereInput idLte(String idLte) {

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

    public VdsWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VdsWhereInput idLte_ExplictlyNonNull() {
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

    public VdsWhereInput idNot(String idNot) {

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

    public VdsWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VdsWhereInput idNot_ExplictlyNonNull() {
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

    public VdsWhereInput idNotContains(String idNotContains) {

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

    public VdsWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput idNotContains_ExplictlyNonNull() {
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

    public VdsWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VdsWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VdsWhereInput addIdNotInItem(String idNotInItem) {
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

    public VdsWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VdsWhereInput idNotIn_ExplictlyNonNull() {
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

    public VdsWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VdsWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput idStartsWith(String idStartsWith) {

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

    public VdsWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VdsWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public VdsWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public VdsWhereInput internal_ExplictlyNonNull() {
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

    public VdsWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public VdsWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public VdsWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public VdsWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public VdsWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public VdsWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public VdsWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public VdsWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public VdsWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public VdsWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public VdsWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public VdsWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public VdsWhereInput localId(String localId) {

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

    public VdsWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VdsWhereInput localId_ExplictlyNonNull() {
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

    public VdsWhereInput localIdContains(String localIdContains) {

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

    public VdsWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VdsWhereInput localIdContains_ExplictlyNonNull() {
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

    public VdsWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VdsWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VdsWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput localIdGt(String localIdGt) {

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

    public VdsWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VdsWhereInput localIdGt_ExplictlyNonNull() {
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

    public VdsWhereInput localIdGte(String localIdGte) {

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

    public VdsWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VdsWhereInput localIdGte_ExplictlyNonNull() {
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

    public VdsWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VdsWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VdsWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VdsWhereInput localIdIn_ExplictlyNonNull() {
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

    public VdsWhereInput localIdLt(String localIdLt) {

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

    public VdsWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VdsWhereInput localIdLt_ExplictlyNonNull() {
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

    public VdsWhereInput localIdLte(String localIdLte) {

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

    public VdsWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VdsWhereInput localIdLte_ExplictlyNonNull() {
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

    public VdsWhereInput localIdNot(String localIdNot) {

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

    public VdsWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VdsWhereInput localIdNot_ExplictlyNonNull() {
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

    public VdsWhereInput localIdNotContains(String localIdNotContains) {

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

    public VdsWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VdsWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VdsWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VdsWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VdsWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VdsWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VdsWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VdsWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VdsWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VdsWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput name(String name) {

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

    public VdsWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VdsWhereInput name_ExplictlyNonNull() {
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

    public VdsWhereInput nameContains(String nameContains) {

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

    public VdsWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VdsWhereInput nameContains_ExplictlyNonNull() {
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

    public VdsWhereInput nameEndsWith(String nameEndsWith) {

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

    public VdsWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VdsWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput nameGt(String nameGt) {

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

    public VdsWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VdsWhereInput nameGt_ExplictlyNonNull() {
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

    public VdsWhereInput nameGte(String nameGte) {

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

    public VdsWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VdsWhereInput nameGte_ExplictlyNonNull() {
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

    public VdsWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VdsWhereInput addNameInItem(String nameInItem) {
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

    public VdsWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VdsWhereInput nameIn_ExplictlyNonNull() {
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

    public VdsWhereInput nameLt(String nameLt) {

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

    public VdsWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VdsWhereInput nameLt_ExplictlyNonNull() {
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

    public VdsWhereInput nameLte(String nameLte) {

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

    public VdsWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VdsWhereInput nameLte_ExplictlyNonNull() {
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

    public VdsWhereInput nameNot(String nameNot) {

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

    public VdsWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VdsWhereInput nameNot_ExplictlyNonNull() {
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

    public VdsWhereInput nameNotContains(String nameNotContains) {

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

    public VdsWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VdsWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VdsWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VdsWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VdsWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VdsWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VdsWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VdsWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VdsWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput nameStartsWith(String nameStartsWith) {

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

    public VdsWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VdsWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VdsWhereInput nicsEvery(NicWhereInput nicsEvery) {

        this.nicsEvery = nicsEvery;
        return this;
    }

    /**
     * Get nicsEvery
     *
     * @return nicsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsEvery() {
        return nicsEvery;
    }

    public void setNicsEvery(NicWhereInput nicsEvery) {
        this.nicsEvery = nicsEvery;
    }

    public VdsWhereInput nicsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public VdsWhereInput nicsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public void setNicsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        }
    }

    public boolean getNicsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_EVERY);
    }

    public VdsWhereInput nicsNone(NicWhereInput nicsNone) {

        this.nicsNone = nicsNone;
        return this;
    }

    /**
     * Get nicsNone
     *
     * @return nicsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsNone() {
        return nicsNone;
    }

    public void setNicsNone(NicWhereInput nicsNone) {
        this.nicsNone = nicsNone;
    }

    public VdsWhereInput nicsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public VdsWhereInput nicsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public void setNicsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        }
    }

    public boolean getNicsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_NONE);
    }

    public VdsWhereInput nicsSome(NicWhereInput nicsSome) {

        this.nicsSome = nicsSome;
        return this;
    }

    /**
     * Get nicsSome
     *
     * @return nicsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsSome() {
        return nicsSome;
    }

    public void setNicsSome(NicWhereInput nicsSome) {
        this.nicsSome = nicsSome;
    }

    public VdsWhereInput nicsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public VdsWhereInput nicsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public void setNicsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        }
    }

    public boolean getNicsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_SOME);
    }

    public VdsWhereInput ovsbrName(String ovsbrName) {

        this.ovsbrName = ovsbrName;
        return this;
    }

    /**
     * Get ovsbrName
     *
     * @return ovsbrName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrName() {
        return ovsbrName;
    }

    public void setOvsbrName(String ovsbrName) {
        this.ovsbrName = ovsbrName;
    }

    public VdsWhereInput ovsbrName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME);
        return this;
    }

    public VdsWhereInput ovsbrName_ExplictlyNonNull() {
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

    public VdsWhereInput ovsbrNameContains(String ovsbrNameContains) {

        this.ovsbrNameContains = ovsbrNameContains;
        return this;
    }

    /**
     * Get ovsbrNameContains
     *
     * @return ovsbrNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameContains() {
        return ovsbrNameContains;
    }

    public void setOvsbrNameContains(String ovsbrNameContains) {
        this.ovsbrNameContains = ovsbrNameContains;
    }

    public VdsWhereInput ovsbrNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_CONTAINS);
        return this;
    }

    public VdsWhereInput ovsbrNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_CONTAINS);
        return this;
    }

    public void setOvsbrNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_CONTAINS);
        }
    }

    public boolean getOvsbrNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_CONTAINS);
    }

    public VdsWhereInput ovsbrNameEndsWith(String ovsbrNameEndsWith) {

        this.ovsbrNameEndsWith = ovsbrNameEndsWith;
        return this;
    }

    /**
     * Get ovsbrNameEndsWith
     *
     * @return ovsbrNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameEndsWith() {
        return ovsbrNameEndsWith;
    }

    public void setOvsbrNameEndsWith(String ovsbrNameEndsWith) {
        this.ovsbrNameEndsWith = ovsbrNameEndsWith;
    }

    public VdsWhereInput ovsbrNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH);
        return this;
    }

    public VdsWhereInput ovsbrNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH);
        return this;
    }

    public void setOvsbrNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH);
        }
    }

    public boolean getOvsbrNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_ENDS_WITH);
    }

    public VdsWhereInput ovsbrNameGt(String ovsbrNameGt) {

        this.ovsbrNameGt = ovsbrNameGt;
        return this;
    }

    /**
     * Get ovsbrNameGt
     *
     * @return ovsbrNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameGt() {
        return ovsbrNameGt;
    }

    public void setOvsbrNameGt(String ovsbrNameGt) {
        this.ovsbrNameGt = ovsbrNameGt;
    }

    public VdsWhereInput ovsbrNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_GT);
        return this;
    }

    public VdsWhereInput ovsbrNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_GT);
        return this;
    }

    public void setOvsbrNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_GT);
        }
    }

    public boolean getOvsbrNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_GT);
    }

    public VdsWhereInput ovsbrNameGte(String ovsbrNameGte) {

        this.ovsbrNameGte = ovsbrNameGte;
        return this;
    }

    /**
     * Get ovsbrNameGte
     *
     * @return ovsbrNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameGte() {
        return ovsbrNameGte;
    }

    public void setOvsbrNameGte(String ovsbrNameGte) {
        this.ovsbrNameGte = ovsbrNameGte;
    }

    public VdsWhereInput ovsbrNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_GTE);
        return this;
    }

    public VdsWhereInput ovsbrNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_GTE);
        return this;
    }

    public void setOvsbrNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_GTE);
        }
    }

    public boolean getOvsbrNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_GTE);
    }

    public VdsWhereInput ovsbrNameIn(List<String> ovsbrNameIn) {

        this.ovsbrNameIn = ovsbrNameIn;
        return this;
    }

    public VdsWhereInput addOvsbrNameInItem(String ovsbrNameInItem) {
        if (this.ovsbrNameIn == null) {
            this.ovsbrNameIn = new ArrayList<String>();
        }
        this.ovsbrNameIn.add(ovsbrNameInItem);
        return this;
    }

    /**
     * Get ovsbrNameIn
     *
     * @return ovsbrNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOvsbrNameIn() {
        return ovsbrNameIn;
    }

    public void setOvsbrNameIn(List<String> ovsbrNameIn) {
        this.ovsbrNameIn = ovsbrNameIn;
    }

    public VdsWhereInput ovsbrNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_IN);
        return this;
    }

    public VdsWhereInput ovsbrNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_IN);
        return this;
    }

    public void setOvsbrNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_IN);
        }
    }

    public boolean getOvsbrNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_IN);
    }

    public VdsWhereInput ovsbrNameLt(String ovsbrNameLt) {

        this.ovsbrNameLt = ovsbrNameLt;
        return this;
    }

    /**
     * Get ovsbrNameLt
     *
     * @return ovsbrNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameLt() {
        return ovsbrNameLt;
    }

    public void setOvsbrNameLt(String ovsbrNameLt) {
        this.ovsbrNameLt = ovsbrNameLt;
    }

    public VdsWhereInput ovsbrNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_LT);
        return this;
    }

    public VdsWhereInput ovsbrNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_LT);
        return this;
    }

    public void setOvsbrNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_LT);
        }
    }

    public boolean getOvsbrNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_LT);
    }

    public VdsWhereInput ovsbrNameLte(String ovsbrNameLte) {

        this.ovsbrNameLte = ovsbrNameLte;
        return this;
    }

    /**
     * Get ovsbrNameLte
     *
     * @return ovsbrNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameLte() {
        return ovsbrNameLte;
    }

    public void setOvsbrNameLte(String ovsbrNameLte) {
        this.ovsbrNameLte = ovsbrNameLte;
    }

    public VdsWhereInput ovsbrNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_LTE);
        return this;
    }

    public VdsWhereInput ovsbrNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_LTE);
        return this;
    }

    public void setOvsbrNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_LTE);
        }
    }

    public boolean getOvsbrNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_LTE);
    }

    public VdsWhereInput ovsbrNameNot(String ovsbrNameNot) {

        this.ovsbrNameNot = ovsbrNameNot;
        return this;
    }

    /**
     * Get ovsbrNameNot
     *
     * @return ovsbrNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameNot() {
        return ovsbrNameNot;
    }

    public void setOvsbrNameNot(String ovsbrNameNot) {
        this.ovsbrNameNot = ovsbrNameNot;
    }

    public VdsWhereInput ovsbrNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT);
        return this;
    }

    public VdsWhereInput ovsbrNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT);
        return this;
    }

    public void setOvsbrNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT);
        }
    }

    public boolean getOvsbrNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_NOT);
    }

    public VdsWhereInput ovsbrNameNotContains(String ovsbrNameNotContains) {

        this.ovsbrNameNotContains = ovsbrNameNotContains;
        return this;
    }

    /**
     * Get ovsbrNameNotContains
     *
     * @return ovsbrNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameNotContains() {
        return ovsbrNameNotContains;
    }

    public void setOvsbrNameNotContains(String ovsbrNameNotContains) {
        this.ovsbrNameNotContains = ovsbrNameNotContains;
    }

    public VdsWhereInput ovsbrNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput ovsbrNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS);
        return this;
    }

    public void setOvsbrNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS);
        }
    }

    public boolean getOvsbrNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_NOT_CONTAINS);
    }

    public VdsWhereInput ovsbrNameNotEndsWith(String ovsbrNameNotEndsWith) {

        this.ovsbrNameNotEndsWith = ovsbrNameNotEndsWith;
        return this;
    }

    /**
     * Get ovsbrNameNotEndsWith
     *
     * @return ovsbrNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameNotEndsWith() {
        return ovsbrNameNotEndsWith;
    }

    public void setOvsbrNameNotEndsWith(String ovsbrNameNotEndsWith) {
        this.ovsbrNameNotEndsWith = ovsbrNameNotEndsWith;
    }

    public VdsWhereInput ovsbrNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput ovsbrNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setOvsbrNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getOvsbrNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_NOT_ENDS_WITH);
    }

    public VdsWhereInput ovsbrNameNotIn(List<String> ovsbrNameNotIn) {

        this.ovsbrNameNotIn = ovsbrNameNotIn;
        return this;
    }

    public VdsWhereInput addOvsbrNameNotInItem(String ovsbrNameNotInItem) {
        if (this.ovsbrNameNotIn == null) {
            this.ovsbrNameNotIn = new ArrayList<String>();
        }
        this.ovsbrNameNotIn.add(ovsbrNameNotInItem);
        return this;
    }

    /**
     * Get ovsbrNameNotIn
     *
     * @return ovsbrNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOvsbrNameNotIn() {
        return ovsbrNameNotIn;
    }

    public void setOvsbrNameNotIn(List<String> ovsbrNameNotIn) {
        this.ovsbrNameNotIn = ovsbrNameNotIn;
    }

    public VdsWhereInput ovsbrNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_IN);
        return this;
    }

    public VdsWhereInput ovsbrNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_IN);
        return this;
    }

    public void setOvsbrNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_IN);
        }
    }

    public boolean getOvsbrNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_NOT_IN);
    }

    public VdsWhereInput ovsbrNameNotStartsWith(String ovsbrNameNotStartsWith) {

        this.ovsbrNameNotStartsWith = ovsbrNameNotStartsWith;
        return this;
    }

    /**
     * Get ovsbrNameNotStartsWith
     *
     * @return ovsbrNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameNotStartsWith() {
        return ovsbrNameNotStartsWith;
    }

    public void setOvsbrNameNotStartsWith(String ovsbrNameNotStartsWith) {
        this.ovsbrNameNotStartsWith = ovsbrNameNotStartsWith;
    }

    public VdsWhereInput ovsbrNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput ovsbrNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setOvsbrNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getOvsbrNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_NOT_STARTS_WITH);
    }

    public VdsWhereInput ovsbrNameStartsWith(String ovsbrNameStartsWith) {

        this.ovsbrNameStartsWith = ovsbrNameStartsWith;
        return this;
    }

    /**
     * Get ovsbrNameStartsWith
     *
     * @return ovsbrNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOvsbrNameStartsWith() {
        return ovsbrNameStartsWith;
    }

    public void setOvsbrNameStartsWith(String ovsbrNameStartsWith) {
        this.ovsbrNameStartsWith = ovsbrNameStartsWith;
    }

    public VdsWhereInput ovsbrNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH);
        return this;
    }

    public VdsWhereInput ovsbrNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH);
        return this;
    }

    public void setOvsbrNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH);
        }
    }

    public boolean getOvsbrNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVSBR_NAME_STARTS_WITH);
    }

    public VdsWhereInput type(NetworkType type) {

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
    public NetworkType getType() {
        return type;
    }

    public void setType(NetworkType type) {
        this.type = type;
    }

    public VdsWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VdsWhereInput type_ExplictlyNonNull() {
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

    public VdsWhereInput typeIn(List<NetworkType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VdsWhereInput addTypeInItem(NetworkType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<NetworkType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<NetworkType> typeIn) {
        this.typeIn = typeIn;
    }

    public VdsWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VdsWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public VdsWhereInput typeNot(NetworkType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NetworkType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(NetworkType typeNot) {
        this.typeNot = typeNot;
    }

    public VdsWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VdsWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public VdsWhereInput typeNotIn(List<NetworkType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VdsWhereInput addTypeNotInItem(NetworkType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<NetworkType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<NetworkType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VdsWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VdsWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public VdsWhereInput vlansEvery(VlanWhereInput vlansEvery) {

        this.vlansEvery = vlansEvery;
        return this;
    }

    /**
     * Get vlansEvery
     *
     * @return vlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansEvery() {
        return vlansEvery;
    }

    public void setVlansEvery(VlanWhereInput vlansEvery) {
        this.vlansEvery = vlansEvery;
    }

    public VdsWhereInput vlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public VdsWhereInput vlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public void setVlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        }
    }

    public boolean getVlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_EVERY);
    }

    public VdsWhereInput vlansNone(VlanWhereInput vlansNone) {

        this.vlansNone = vlansNone;
        return this;
    }

    /**
     * Get vlansNone
     *
     * @return vlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansNone() {
        return vlansNone;
    }

    public void setVlansNone(VlanWhereInput vlansNone) {
        this.vlansNone = vlansNone;
    }

    public VdsWhereInput vlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public VdsWhereInput vlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public void setVlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        }
    }

    public boolean getVlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NONE);
    }

    public VdsWhereInput vlansNum(Integer vlansNum) {

        this.vlansNum = vlansNum;
        return this;
    }

    /**
     * Get vlansNum
     *
     * @return vlansNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNum() {
        return vlansNum;
    }

    public void setVlansNum(Integer vlansNum) {
        this.vlansNum = vlansNum;
    }

    public VdsWhereInput vlansNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM);
        return this;
    }

    public VdsWhereInput vlansNum_ExplictlyNonNull() {
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

    public VdsWhereInput vlansNumGt(Integer vlansNumGt) {

        this.vlansNumGt = vlansNumGt;
        return this;
    }

    /**
     * Get vlansNumGt
     *
     * @return vlansNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNumGt() {
        return vlansNumGt;
    }

    public void setVlansNumGt(Integer vlansNumGt) {
        this.vlansNumGt = vlansNumGt;
    }

    public VdsWhereInput vlansNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_GT);
        return this;
    }

    public VdsWhereInput vlansNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_GT);
        return this;
    }

    public void setVlansNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_GT);
        }
    }

    public boolean getVlansNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_GT);
    }

    public VdsWhereInput vlansNumGte(Integer vlansNumGte) {

        this.vlansNumGte = vlansNumGte;
        return this;
    }

    /**
     * Get vlansNumGte
     *
     * @return vlansNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNumGte() {
        return vlansNumGte;
    }

    public void setVlansNumGte(Integer vlansNumGte) {
        this.vlansNumGte = vlansNumGte;
    }

    public VdsWhereInput vlansNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_GTE);
        return this;
    }

    public VdsWhereInput vlansNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_GTE);
        return this;
    }

    public void setVlansNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_GTE);
        }
    }

    public boolean getVlansNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_GTE);
    }

    public VdsWhereInput vlansNumIn(List<Integer> vlansNumIn) {

        this.vlansNumIn = vlansNumIn;
        return this;
    }

    public VdsWhereInput addVlansNumInItem(Integer vlansNumInItem) {
        if (this.vlansNumIn == null) {
            this.vlansNumIn = new ArrayList<Integer>();
        }
        this.vlansNumIn.add(vlansNumInItem);
        return this;
    }

    /**
     * Get vlansNumIn
     *
     * @return vlansNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVlansNumIn() {
        return vlansNumIn;
    }

    public void setVlansNumIn(List<Integer> vlansNumIn) {
        this.vlansNumIn = vlansNumIn;
    }

    public VdsWhereInput vlansNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_IN);
        return this;
    }

    public VdsWhereInput vlansNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_IN);
        return this;
    }

    public void setVlansNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_IN);
        }
    }

    public boolean getVlansNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_IN);
    }

    public VdsWhereInput vlansNumLt(Integer vlansNumLt) {

        this.vlansNumLt = vlansNumLt;
        return this;
    }

    /**
     * Get vlansNumLt
     *
     * @return vlansNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNumLt() {
        return vlansNumLt;
    }

    public void setVlansNumLt(Integer vlansNumLt) {
        this.vlansNumLt = vlansNumLt;
    }

    public VdsWhereInput vlansNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_LT);
        return this;
    }

    public VdsWhereInput vlansNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_LT);
        return this;
    }

    public void setVlansNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_LT);
        }
    }

    public boolean getVlansNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_LT);
    }

    public VdsWhereInput vlansNumLte(Integer vlansNumLte) {

        this.vlansNumLte = vlansNumLte;
        return this;
    }

    /**
     * Get vlansNumLte
     *
     * @return vlansNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNumLte() {
        return vlansNumLte;
    }

    public void setVlansNumLte(Integer vlansNumLte) {
        this.vlansNumLte = vlansNumLte;
    }

    public VdsWhereInput vlansNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_LTE);
        return this;
    }

    public VdsWhereInput vlansNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_LTE);
        return this;
    }

    public void setVlansNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_LTE);
        }
    }

    public boolean getVlansNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_LTE);
    }

    public VdsWhereInput vlansNumNot(Integer vlansNumNot) {

        this.vlansNumNot = vlansNumNot;
        return this;
    }

    /**
     * Get vlansNumNot
     *
     * @return vlansNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlansNumNot() {
        return vlansNumNot;
    }

    public void setVlansNumNot(Integer vlansNumNot) {
        this.vlansNumNot = vlansNumNot;
    }

    public VdsWhereInput vlansNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_NOT);
        return this;
    }

    public VdsWhereInput vlansNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_NOT);
        return this;
    }

    public void setVlansNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_NOT);
        }
    }

    public boolean getVlansNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_NOT);
    }

    public VdsWhereInput vlansNumNotIn(List<Integer> vlansNumNotIn) {

        this.vlansNumNotIn = vlansNumNotIn;
        return this;
    }

    public VdsWhereInput addVlansNumNotInItem(Integer vlansNumNotInItem) {
        if (this.vlansNumNotIn == null) {
            this.vlansNumNotIn = new ArrayList<Integer>();
        }
        this.vlansNumNotIn.add(vlansNumNotInItem);
        return this;
    }

    /**
     * Get vlansNumNotIn
     *
     * @return vlansNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVlansNumNotIn() {
        return vlansNumNotIn;
    }

    public void setVlansNumNotIn(List<Integer> vlansNumNotIn) {
        this.vlansNumNotIn = vlansNumNotIn;
    }

    public VdsWhereInput vlansNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_NOT_IN);
        return this;
    }

    public VdsWhereInput vlansNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_NOT_IN);
        return this;
    }

    public void setVlansNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NUM_NOT_IN);
        }
    }

    public boolean getVlansNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NUM_NOT_IN);
    }

    public VdsWhereInput vlansSome(VlanWhereInput vlansSome) {

        this.vlansSome = vlansSome;
        return this;
    }

    /**
     * Get vlansSome
     *
     * @return vlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansSome() {
        return vlansSome;
    }

    public void setVlansSome(VlanWhereInput vlansSome) {
        this.vlansSome = vlansSome;
    }

    public VdsWhereInput vlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public VdsWhereInput vlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public void setVlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        }
    }

    public boolean getVlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_SOME);
    }

    public VdsWhereInput workMode(String workMode) {

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

    public VdsWhereInput workMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public VdsWhereInput workMode_ExplictlyNonNull() {
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

    public VdsWhereInput workModeContains(String workModeContains) {

        this.workModeContains = workModeContains;
        return this;
    }

    /**
     * Get workModeContains
     *
     * @return workModeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeContains() {
        return workModeContains;
    }

    public void setWorkModeContains(String workModeContains) {
        this.workModeContains = workModeContains;
    }

    public VdsWhereInput workModeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_CONTAINS);
        return this;
    }

    public VdsWhereInput workModeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_CONTAINS);
        return this;
    }

    public void setWorkModeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_CONTAINS);
        }
    }

    public boolean getWorkModeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_CONTAINS);
    }

    public VdsWhereInput workModeEndsWith(String workModeEndsWith) {

        this.workModeEndsWith = workModeEndsWith;
        return this;
    }

    /**
     * Get workModeEndsWith
     *
     * @return workModeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeEndsWith() {
        return workModeEndsWith;
    }

    public void setWorkModeEndsWith(String workModeEndsWith) {
        this.workModeEndsWith = workModeEndsWith;
    }

    public VdsWhereInput workModeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_ENDS_WITH);
        return this;
    }

    public VdsWhereInput workModeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_ENDS_WITH);
        return this;
    }

    public void setWorkModeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_ENDS_WITH);
        }
    }

    public boolean getWorkModeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_ENDS_WITH);
    }

    public VdsWhereInput workModeGt(String workModeGt) {

        this.workModeGt = workModeGt;
        return this;
    }

    /**
     * Get workModeGt
     *
     * @return workModeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeGt() {
        return workModeGt;
    }

    public void setWorkModeGt(String workModeGt) {
        this.workModeGt = workModeGt;
    }

    public VdsWhereInput workModeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_GT);
        return this;
    }

    public VdsWhereInput workModeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_GT);
        return this;
    }

    public void setWorkModeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_GT);
        }
    }

    public boolean getWorkModeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_GT);
    }

    public VdsWhereInput workModeGte(String workModeGte) {

        this.workModeGte = workModeGte;
        return this;
    }

    /**
     * Get workModeGte
     *
     * @return workModeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeGte() {
        return workModeGte;
    }

    public void setWorkModeGte(String workModeGte) {
        this.workModeGte = workModeGte;
    }

    public VdsWhereInput workModeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_GTE);
        return this;
    }

    public VdsWhereInput workModeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_GTE);
        return this;
    }

    public void setWorkModeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_GTE);
        }
    }

    public boolean getWorkModeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_GTE);
    }

    public VdsWhereInput workModeIn(List<String> workModeIn) {

        this.workModeIn = workModeIn;
        return this;
    }

    public VdsWhereInput addWorkModeInItem(String workModeInItem) {
        if (this.workModeIn == null) {
            this.workModeIn = new ArrayList<String>();
        }
        this.workModeIn.add(workModeInItem);
        return this;
    }

    /**
     * Get workModeIn
     *
     * @return workModeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWorkModeIn() {
        return workModeIn;
    }

    public void setWorkModeIn(List<String> workModeIn) {
        this.workModeIn = workModeIn;
    }

    public VdsWhereInput workModeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_IN);
        return this;
    }

    public VdsWhereInput workModeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_IN);
        return this;
    }

    public void setWorkModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_IN);
        }
    }

    public boolean getWorkModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_IN);
    }

    public VdsWhereInput workModeLt(String workModeLt) {

        this.workModeLt = workModeLt;
        return this;
    }

    /**
     * Get workModeLt
     *
     * @return workModeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeLt() {
        return workModeLt;
    }

    public void setWorkModeLt(String workModeLt) {
        this.workModeLt = workModeLt;
    }

    public VdsWhereInput workModeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_LT);
        return this;
    }

    public VdsWhereInput workModeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_LT);
        return this;
    }

    public void setWorkModeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_LT);
        }
    }

    public boolean getWorkModeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_LT);
    }

    public VdsWhereInput workModeLte(String workModeLte) {

        this.workModeLte = workModeLte;
        return this;
    }

    /**
     * Get workModeLte
     *
     * @return workModeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeLte() {
        return workModeLte;
    }

    public void setWorkModeLte(String workModeLte) {
        this.workModeLte = workModeLte;
    }

    public VdsWhereInput workModeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_LTE);
        return this;
    }

    public VdsWhereInput workModeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_LTE);
        return this;
    }

    public void setWorkModeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_LTE);
        }
    }

    public boolean getWorkModeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_LTE);
    }

    public VdsWhereInput workModeNot(String workModeNot) {

        this.workModeNot = workModeNot;
        return this;
    }

    /**
     * Get workModeNot
     *
     * @return workModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeNot() {
        return workModeNot;
    }

    public void setWorkModeNot(String workModeNot) {
        this.workModeNot = workModeNot;
    }

    public VdsWhereInput workModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT);
        return this;
    }

    public VdsWhereInput workModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT);
        return this;
    }

    public void setWorkModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT);
        }
    }

    public boolean getWorkModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_NOT);
    }

    public VdsWhereInput workModeNotContains(String workModeNotContains) {

        this.workModeNotContains = workModeNotContains;
        return this;
    }

    /**
     * Get workModeNotContains
     *
     * @return workModeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeNotContains() {
        return workModeNotContains;
    }

    public void setWorkModeNotContains(String workModeNotContains) {
        this.workModeNotContains = workModeNotContains;
    }

    public VdsWhereInput workModeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS);
        return this;
    }

    public VdsWhereInput workModeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS);
        return this;
    }

    public void setWorkModeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS);
        }
    }

    public boolean getWorkModeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_NOT_CONTAINS);
    }

    public VdsWhereInput workModeNotEndsWith(String workModeNotEndsWith) {

        this.workModeNotEndsWith = workModeNotEndsWith;
        return this;
    }

    /**
     * Get workModeNotEndsWith
     *
     * @return workModeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeNotEndsWith() {
        return workModeNotEndsWith;
    }

    public void setWorkModeNotEndsWith(String workModeNotEndsWith) {
        this.workModeNotEndsWith = workModeNotEndsWith;
    }

    public VdsWhereInput workModeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH);
        return this;
    }

    public VdsWhereInput workModeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH);
        return this;
    }

    public void setWorkModeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH);
        }
    }

    public boolean getWorkModeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_NOT_ENDS_WITH);
    }

    public VdsWhereInput workModeNotIn(List<String> workModeNotIn) {

        this.workModeNotIn = workModeNotIn;
        return this;
    }

    public VdsWhereInput addWorkModeNotInItem(String workModeNotInItem) {
        if (this.workModeNotIn == null) {
            this.workModeNotIn = new ArrayList<String>();
        }
        this.workModeNotIn.add(workModeNotInItem);
        return this;
    }

    /**
     * Get workModeNotIn
     *
     * @return workModeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWorkModeNotIn() {
        return workModeNotIn;
    }

    public void setWorkModeNotIn(List<String> workModeNotIn) {
        this.workModeNotIn = workModeNotIn;
    }

    public VdsWhereInput workModeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_IN);
        return this;
    }

    public VdsWhereInput workModeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_IN);
        return this;
    }

    public void setWorkModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_IN);
        }
    }

    public boolean getWorkModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_NOT_IN);
    }

    public VdsWhereInput workModeNotStartsWith(String workModeNotStartsWith) {

        this.workModeNotStartsWith = workModeNotStartsWith;
        return this;
    }

    /**
     * Get workModeNotStartsWith
     *
     * @return workModeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeNotStartsWith() {
        return workModeNotStartsWith;
    }

    public void setWorkModeNotStartsWith(String workModeNotStartsWith) {
        this.workModeNotStartsWith = workModeNotStartsWith;
    }

    public VdsWhereInput workModeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH);
        return this;
    }

    public VdsWhereInput workModeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH);
        return this;
    }

    public void setWorkModeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH);
        }
    }

    public boolean getWorkModeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_NOT_STARTS_WITH);
    }

    public VdsWhereInput workModeStartsWith(String workModeStartsWith) {

        this.workModeStartsWith = workModeStartsWith;
        return this;
    }

    /**
     * Get workModeStartsWith
     *
     * @return workModeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkModeStartsWith() {
        return workModeStartsWith;
    }

    public void setWorkModeStartsWith(String workModeStartsWith) {
        this.workModeStartsWith = workModeStartsWith;
    }

    public VdsWhereInput workModeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_STARTS_WITH);
        return this;
    }

    public VdsWhereInput workModeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_STARTS_WITH);
        return this;
    }

    public void setWorkModeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE_STARTS_WITH);
        }
    }

    public boolean getWorkModeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VdsWhereInput vdsWhereInput = (VdsWhereInput) o;
        return Objects.equals(this.AND, vdsWhereInput.AND)
                && Objects.equals(this.NOT, vdsWhereInput.NOT)
                && Objects.equals(this.OR, vdsWhereInput.OR)
                && Objects.equals(this.bondMode, vdsWhereInput.bondMode)
                && Objects.equals(this.bondModeContains, vdsWhereInput.bondModeContains)
                && Objects.equals(this.bondModeEndsWith, vdsWhereInput.bondModeEndsWith)
                && Objects.equals(this.bondModeGt, vdsWhereInput.bondModeGt)
                && Objects.equals(this.bondModeGte, vdsWhereInput.bondModeGte)
                && Objects.equals(this.bondModeIn, vdsWhereInput.bondModeIn)
                && Objects.equals(this.bondModeLt, vdsWhereInput.bondModeLt)
                && Objects.equals(this.bondModeLte, vdsWhereInput.bondModeLte)
                && Objects.equals(this.bondModeNot, vdsWhereInput.bondModeNot)
                && Objects.equals(this.bondModeNotContains, vdsWhereInput.bondModeNotContains)
                && Objects.equals(this.bondModeNotEndsWith, vdsWhereInput.bondModeNotEndsWith)
                && Objects.equals(this.bondModeNotIn, vdsWhereInput.bondModeNotIn)
                && Objects.equals(this.bondModeNotStartsWith, vdsWhereInput.bondModeNotStartsWith)
                && Objects.equals(this.bondModeStartsWith, vdsWhereInput.bondModeStartsWith)
                && Objects.equals(this.cluster, vdsWhereInput.cluster)
                && Objects.equals(this.entityAsyncStatus, vdsWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, vdsWhereInput.entityAsyncStatusIn)
                && Objects.equals(this.entityAsyncStatusNot, vdsWhereInput.entityAsyncStatusNot)
                && Objects.equals(this.entityAsyncStatusNotIn, vdsWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.everouteCluster, vdsWhereInput.everouteCluster)
                && Objects.equals(this.id, vdsWhereInput.id)
                && Objects.equals(this.idContains, vdsWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vdsWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vdsWhereInput.idGt)
                && Objects.equals(this.idGte, vdsWhereInput.idGte)
                && Objects.equals(this.idIn, vdsWhereInput.idIn)
                && Objects.equals(this.idLt, vdsWhereInput.idLt)
                && Objects.equals(this.idLte, vdsWhereInput.idLte)
                && Objects.equals(this.idNot, vdsWhereInput.idNot)
                && Objects.equals(this.idNotContains, vdsWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vdsWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vdsWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vdsWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vdsWhereInput.idStartsWith)
                && Objects.equals(this.internal, vdsWhereInput.internal)
                && Objects.equals(this.internalNot, vdsWhereInput.internalNot)
                && Objects.equals(this.labelsEvery, vdsWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, vdsWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, vdsWhereInput.labelsSome)
                && Objects.equals(this.localId, vdsWhereInput.localId)
                && Objects.equals(this.localIdContains, vdsWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vdsWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vdsWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vdsWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vdsWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vdsWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vdsWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vdsWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, vdsWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, vdsWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vdsWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, vdsWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vdsWhereInput.localIdStartsWith)
                && Objects.equals(this.name, vdsWhereInput.name)
                && Objects.equals(this.nameContains, vdsWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vdsWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vdsWhereInput.nameGt)
                && Objects.equals(this.nameGte, vdsWhereInput.nameGte)
                && Objects.equals(this.nameIn, vdsWhereInput.nameIn)
                && Objects.equals(this.nameLt, vdsWhereInput.nameLt)
                && Objects.equals(this.nameLte, vdsWhereInput.nameLte)
                && Objects.equals(this.nameNot, vdsWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vdsWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vdsWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vdsWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, vdsWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vdsWhereInput.nameStartsWith)
                && Objects.equals(this.nicsEvery, vdsWhereInput.nicsEvery)
                && Objects.equals(this.nicsNone, vdsWhereInput.nicsNone)
                && Objects.equals(this.nicsSome, vdsWhereInput.nicsSome)
                && Objects.equals(this.ovsbrName, vdsWhereInput.ovsbrName)
                && Objects.equals(this.ovsbrNameContains, vdsWhereInput.ovsbrNameContains)
                && Objects.equals(this.ovsbrNameEndsWith, vdsWhereInput.ovsbrNameEndsWith)
                && Objects.equals(this.ovsbrNameGt, vdsWhereInput.ovsbrNameGt)
                && Objects.equals(this.ovsbrNameGte, vdsWhereInput.ovsbrNameGte)
                && Objects.equals(this.ovsbrNameIn, vdsWhereInput.ovsbrNameIn)
                && Objects.equals(this.ovsbrNameLt, vdsWhereInput.ovsbrNameLt)
                && Objects.equals(this.ovsbrNameLte, vdsWhereInput.ovsbrNameLte)
                && Objects.equals(this.ovsbrNameNot, vdsWhereInput.ovsbrNameNot)
                && Objects.equals(this.ovsbrNameNotContains, vdsWhereInput.ovsbrNameNotContains)
                && Objects.equals(this.ovsbrNameNotEndsWith, vdsWhereInput.ovsbrNameNotEndsWith)
                && Objects.equals(this.ovsbrNameNotIn, vdsWhereInput.ovsbrNameNotIn)
                && Objects.equals(this.ovsbrNameNotStartsWith, vdsWhereInput.ovsbrNameNotStartsWith)
                && Objects.equals(this.ovsbrNameStartsWith, vdsWhereInput.ovsbrNameStartsWith)
                && Objects.equals(this.type, vdsWhereInput.type)
                && Objects.equals(this.typeIn, vdsWhereInput.typeIn)
                && Objects.equals(this.typeNot, vdsWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vdsWhereInput.typeNotIn)
                && Objects.equals(this.vlansEvery, vdsWhereInput.vlansEvery)
                && Objects.equals(this.vlansNone, vdsWhereInput.vlansNone)
                && Objects.equals(this.vlansNum, vdsWhereInput.vlansNum)
                && Objects.equals(this.vlansNumGt, vdsWhereInput.vlansNumGt)
                && Objects.equals(this.vlansNumGte, vdsWhereInput.vlansNumGte)
                && Objects.equals(this.vlansNumIn, vdsWhereInput.vlansNumIn)
                && Objects.equals(this.vlansNumLt, vdsWhereInput.vlansNumLt)
                && Objects.equals(this.vlansNumLte, vdsWhereInput.vlansNumLte)
                && Objects.equals(this.vlansNumNot, vdsWhereInput.vlansNumNot)
                && Objects.equals(this.vlansNumNotIn, vdsWhereInput.vlansNumNotIn)
                && Objects.equals(this.vlansSome, vdsWhereInput.vlansSome)
                && Objects.equals(this.workMode, vdsWhereInput.workMode)
                && Objects.equals(this.workModeContains, vdsWhereInput.workModeContains)
                && Objects.equals(this.workModeEndsWith, vdsWhereInput.workModeEndsWith)
                && Objects.equals(this.workModeGt, vdsWhereInput.workModeGt)
                && Objects.equals(this.workModeGte, vdsWhereInput.workModeGte)
                && Objects.equals(this.workModeIn, vdsWhereInput.workModeIn)
                && Objects.equals(this.workModeLt, vdsWhereInput.workModeLt)
                && Objects.equals(this.workModeLte, vdsWhereInput.workModeLte)
                && Objects.equals(this.workModeNot, vdsWhereInput.workModeNot)
                && Objects.equals(this.workModeNotContains, vdsWhereInput.workModeNotContains)
                && Objects.equals(this.workModeNotEndsWith, vdsWhereInput.workModeNotEndsWith)
                && Objects.equals(this.workModeNotIn, vdsWhereInput.workModeNotIn)
                && Objects.equals(this.workModeNotStartsWith, vdsWhereInput.workModeNotStartsWith)
                && Objects.equals(this.workModeStartsWith, vdsWhereInput.workModeStartsWith);
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
                bondMode,
                bondModeContains,
                bondModeEndsWith,
                bondModeGt,
                bondModeGte,
                bondModeIn,
                bondModeLt,
                bondModeLte,
                bondModeNot,
                bondModeNotContains,
                bondModeNotEndsWith,
                bondModeNotIn,
                bondModeNotStartsWith,
                bondModeStartsWith,
                cluster,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                everouteCluster,
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
                internal,
                internalNot,
                labelsEvery,
                labelsNone,
                labelsSome,
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
                nicsEvery,
                nicsNone,
                nicsSome,
                ovsbrName,
                ovsbrNameContains,
                ovsbrNameEndsWith,
                ovsbrNameGt,
                ovsbrNameGte,
                ovsbrNameIn,
                ovsbrNameLt,
                ovsbrNameLte,
                ovsbrNameNot,
                ovsbrNameNotContains,
                ovsbrNameNotEndsWith,
                ovsbrNameNotIn,
                ovsbrNameNotStartsWith,
                ovsbrNameStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vlansEvery,
                vlansNone,
                vlansNum,
                vlansNumGt,
                vlansNumGte,
                vlansNumIn,
                vlansNumLt,
                vlansNumLte,
                vlansNumNot,
                vlansNumNotIn,
                vlansSome,
                workMode,
                workModeContains,
                workModeEndsWith,
                workModeGt,
                workModeGte,
                workModeIn,
                workModeLt,
                workModeLte,
                workModeNot,
                workModeNotContains,
                workModeNotEndsWith,
                workModeNotIn,
                workModeNotStartsWith,
                workModeStartsWith);
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
        sb.append("class VdsWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
        sb.append("    bondModeContains: ").append(toIndentedString(bondModeContains)).append("\n");
        sb.append("    bondModeEndsWith: ").append(toIndentedString(bondModeEndsWith)).append("\n");
        sb.append("    bondModeGt: ").append(toIndentedString(bondModeGt)).append("\n");
        sb.append("    bondModeGte: ").append(toIndentedString(bondModeGte)).append("\n");
        sb.append("    bondModeIn: ").append(toIndentedString(bondModeIn)).append("\n");
        sb.append("    bondModeLt: ").append(toIndentedString(bondModeLt)).append("\n");
        sb.append("    bondModeLte: ").append(toIndentedString(bondModeLte)).append("\n");
        sb.append("    bondModeNot: ").append(toIndentedString(bondModeNot)).append("\n");
        sb.append("    bondModeNotContains: ")
                .append(toIndentedString(bondModeNotContains))
                .append("\n");
        sb.append("    bondModeNotEndsWith: ")
                .append(toIndentedString(bondModeNotEndsWith))
                .append("\n");
        sb.append("    bondModeNotIn: ").append(toIndentedString(bondModeNotIn)).append("\n");
        sb.append("    bondModeNotStartsWith: ")
                .append(toIndentedString(bondModeNotStartsWith))
                .append("\n");
        sb.append("    bondModeStartsWith: ")
                .append(toIndentedString(bondModeStartsWith))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
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
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
        sb.append("    nicsEvery: ").append(toIndentedString(nicsEvery)).append("\n");
        sb.append("    nicsNone: ").append(toIndentedString(nicsNone)).append("\n");
        sb.append("    nicsSome: ").append(toIndentedString(nicsSome)).append("\n");
        sb.append("    ovsbrName: ").append(toIndentedString(ovsbrName)).append("\n");
        sb.append("    ovsbrNameContains: ")
                .append(toIndentedString(ovsbrNameContains))
                .append("\n");
        sb.append("    ovsbrNameEndsWith: ")
                .append(toIndentedString(ovsbrNameEndsWith))
                .append("\n");
        sb.append("    ovsbrNameGt: ").append(toIndentedString(ovsbrNameGt)).append("\n");
        sb.append("    ovsbrNameGte: ").append(toIndentedString(ovsbrNameGte)).append("\n");
        sb.append("    ovsbrNameIn: ").append(toIndentedString(ovsbrNameIn)).append("\n");
        sb.append("    ovsbrNameLt: ").append(toIndentedString(ovsbrNameLt)).append("\n");
        sb.append("    ovsbrNameLte: ").append(toIndentedString(ovsbrNameLte)).append("\n");
        sb.append("    ovsbrNameNot: ").append(toIndentedString(ovsbrNameNot)).append("\n");
        sb.append("    ovsbrNameNotContains: ")
                .append(toIndentedString(ovsbrNameNotContains))
                .append("\n");
        sb.append("    ovsbrNameNotEndsWith: ")
                .append(toIndentedString(ovsbrNameNotEndsWith))
                .append("\n");
        sb.append("    ovsbrNameNotIn: ").append(toIndentedString(ovsbrNameNotIn)).append("\n");
        sb.append("    ovsbrNameNotStartsWith: ")
                .append(toIndentedString(ovsbrNameNotStartsWith))
                .append("\n");
        sb.append("    ovsbrNameStartsWith: ")
                .append(toIndentedString(ovsbrNameStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vlansEvery: ").append(toIndentedString(vlansEvery)).append("\n");
        sb.append("    vlansNone: ").append(toIndentedString(vlansNone)).append("\n");
        sb.append("    vlansNum: ").append(toIndentedString(vlansNum)).append("\n");
        sb.append("    vlansNumGt: ").append(toIndentedString(vlansNumGt)).append("\n");
        sb.append("    vlansNumGte: ").append(toIndentedString(vlansNumGte)).append("\n");
        sb.append("    vlansNumIn: ").append(toIndentedString(vlansNumIn)).append("\n");
        sb.append("    vlansNumLt: ").append(toIndentedString(vlansNumLt)).append("\n");
        sb.append("    vlansNumLte: ").append(toIndentedString(vlansNumLte)).append("\n");
        sb.append("    vlansNumNot: ").append(toIndentedString(vlansNumNot)).append("\n");
        sb.append("    vlansNumNotIn: ").append(toIndentedString(vlansNumNotIn)).append("\n");
        sb.append("    vlansSome: ").append(toIndentedString(vlansSome)).append("\n");
        sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
        sb.append("    workModeContains: ").append(toIndentedString(workModeContains)).append("\n");
        sb.append("    workModeEndsWith: ").append(toIndentedString(workModeEndsWith)).append("\n");
        sb.append("    workModeGt: ").append(toIndentedString(workModeGt)).append("\n");
        sb.append("    workModeGte: ").append(toIndentedString(workModeGte)).append("\n");
        sb.append("    workModeIn: ").append(toIndentedString(workModeIn)).append("\n");
        sb.append("    workModeLt: ").append(toIndentedString(workModeLt)).append("\n");
        sb.append("    workModeLte: ").append(toIndentedString(workModeLte)).append("\n");
        sb.append("    workModeNot: ").append(toIndentedString(workModeNot)).append("\n");
        sb.append("    workModeNotContains: ")
                .append(toIndentedString(workModeNotContains))
                .append("\n");
        sb.append("    workModeNotEndsWith: ")
                .append(toIndentedString(workModeNotEndsWith))
                .append("\n");
        sb.append("    workModeNotIn: ").append(toIndentedString(workModeNotIn)).append("\n");
        sb.append("    workModeNotStartsWith: ")
                .append(toIndentedString(workModeNotStartsWith))
                .append("\n");
        sb.append("    workModeStartsWith: ")
                .append(toIndentedString(workModeStartsWith))
                .append("\n");
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
