package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VnetBondGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VnetBondGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VnetBondGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VnetBondGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VnetBondGroupWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
    private String createdAtGt;

    public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
    private String createdAtGte;

    public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
    private List<String> createdAtIn = null;

    public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
    private String createdAtLt;

    public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
    private String createdAtLte;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
    private String createdAtNot;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
    private List<String> createdAtNotIn = null;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_CONTAINS = "display_name_contains";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS)
    private String displayNameContains;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH = "display_name_ends_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH)
    private String displayNameEndsWith;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_GT = "display_name_gt";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_GT)
    private String displayNameGt;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_GTE = "display_name_gte";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_GTE)
    private String displayNameGte;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_IN = "display_name_in";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_IN)
    private List<String> displayNameIn = null;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_LT = "display_name_lt";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_LT)
    private String displayNameLt;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_LTE = "display_name_lte";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_LTE)
    private String displayNameLte;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_NOT = "display_name_not";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NOT)
    private String displayNameNot;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS =
            "display_name_not_contains";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS)
    private String displayNameNotContains;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH =
            "display_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH)
    private String displayNameNotEndsWith;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_NOT_IN = "display_name_not_in";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN)
    private List<String> displayNameNotIn = null;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH =
            "display_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH)
    private String displayNameNotStartsWith;

    public static final String SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH =
            "display_name_starts_with";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH)
    private String displayNameStartsWith;

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

    public static final String SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP =
            "load_balancer_instance_group";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP)
    private LoadBalancerInstanceGroupWhereInput loadBalancerInstanceGroup;

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

    public static final String SERIALIZED_NAME_NETWORK_TYPE = "network_type";

    @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
    private VnetBondNetworkType networkType;

    public static final String SERIALIZED_NAME_NETWORK_TYPE_IN = "network_type_in";

    @SerializedName(SERIALIZED_NAME_NETWORK_TYPE_IN)
    private List<VnetBondNetworkType> networkTypeIn = null;

    public static final String SERIALIZED_NAME_NETWORK_TYPE_NOT = "network_type_not";

    @SerializedName(SERIALIZED_NAME_NETWORK_TYPE_NOT)
    private VnetBondNetworkType networkTypeNot;

    public static final String SERIALIZED_NAME_NETWORK_TYPE_NOT_IN = "network_type_not_in";

    @SerializedName(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN)
    private List<VnetBondNetworkType> networkTypeNotIn = null;

    public static final String SERIALIZED_NAME_VNET_BONDS_EVERY = "vnet_bonds_every";

    @SerializedName(SERIALIZED_NAME_VNET_BONDS_EVERY)
    private VnetBondWhereInput vnetBondsEvery;

    public static final String SERIALIZED_NAME_VNET_BONDS_NONE = "vnet_bonds_none";

    @SerializedName(SERIALIZED_NAME_VNET_BONDS_NONE)
    private VnetBondWhereInput vnetBondsNone;

    public static final String SERIALIZED_NAME_VNET_BONDS_SOME = "vnet_bonds_some";

    @SerializedName(SERIALIZED_NAME_VNET_BONDS_SOME)
    private VnetBondWhereInput vnetBondsSome;

    public VnetBondGroupWhereInput() {}

    public VnetBondGroupWhereInput AND(List<VnetBondGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VnetBondGroupWhereInput addANDItem(VnetBondGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VnetBondGroupWhereInput>();
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
    public List<VnetBondGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VnetBondGroupWhereInput> AND) {
        this.AND = AND;
    }

    public VnetBondGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VnetBondGroupWhereInput AND_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput NOT(List<VnetBondGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VnetBondGroupWhereInput addNOTItem(VnetBondGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VnetBondGroupWhereInput>();
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
    public List<VnetBondGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VnetBondGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VnetBondGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VnetBondGroupWhereInput NOT_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput OR(List<VnetBondGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VnetBondGroupWhereInput addORItem(VnetBondGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VnetBondGroupWhereInput>();
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
    public List<VnetBondGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VnetBondGroupWhereInput> OR) {
        this.OR = OR;
    }

    public VnetBondGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VnetBondGroupWhereInput OR_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VnetBondGroupWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public VnetBondGroupWhereInput createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public VnetBondGroupWhereInput createdAtGt(String createdAtGt) {

        this.createdAtGt = createdAtGt;
        return this;
    }

    /**
     * Get createdAtGt
     *
     * @return createdAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGt() {
        return createdAtGt;
    }

    public void setCreatedAtGt(String createdAtGt) {
        this.createdAtGt = createdAtGt;
    }

    public VnetBondGroupWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public VnetBondGroupWhereInput createdAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public void setCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        }
    }

    public boolean getCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GT);
    }

    public VnetBondGroupWhereInput createdAtGte(String createdAtGte) {

        this.createdAtGte = createdAtGte;
        return this;
    }

    /**
     * Get createdAtGte
     *
     * @return createdAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGte() {
        return createdAtGte;
    }

    public void setCreatedAtGte(String createdAtGte) {
        this.createdAtGte = createdAtGte;
    }

    public VnetBondGroupWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public VnetBondGroupWhereInput createdAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public void setCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        }
    }

    public boolean getCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GTE);
    }

    public VnetBondGroupWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public VnetBondGroupWhereInput addCreatedAtInItem(String createdAtInItem) {
        if (this.createdAtIn == null) {
            this.createdAtIn = new ArrayList<String>();
        }
        this.createdAtIn.add(createdAtInItem);
        return this;
    }

    /**
     * Get createdAtIn
     *
     * @return createdAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtIn() {
        return createdAtIn;
    }

    public void setCreatedAtIn(List<String> createdAtIn) {
        this.createdAtIn = createdAtIn;
    }

    public VnetBondGroupWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public VnetBondGroupWhereInput createdAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public void setCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        }
    }

    public boolean getCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_IN);
    }

    public VnetBondGroupWhereInput createdAtLt(String createdAtLt) {

        this.createdAtLt = createdAtLt;
        return this;
    }

    /**
     * Get createdAtLt
     *
     * @return createdAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLt() {
        return createdAtLt;
    }

    public void setCreatedAtLt(String createdAtLt) {
        this.createdAtLt = createdAtLt;
    }

    public VnetBondGroupWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public VnetBondGroupWhereInput createdAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public void setCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        }
    }

    public boolean getCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LT);
    }

    public VnetBondGroupWhereInput createdAtLte(String createdAtLte) {

        this.createdAtLte = createdAtLte;
        return this;
    }

    /**
     * Get createdAtLte
     *
     * @return createdAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLte() {
        return createdAtLte;
    }

    public void setCreatedAtLte(String createdAtLte) {
        this.createdAtLte = createdAtLte;
    }

    public VnetBondGroupWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public VnetBondGroupWhereInput createdAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public void setCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        }
    }

    public boolean getCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LTE);
    }

    public VnetBondGroupWhereInput createdAtNot(String createdAtNot) {

        this.createdAtNot = createdAtNot;
        return this;
    }

    /**
     * Get createdAtNot
     *
     * @return createdAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtNot() {
        return createdAtNot;
    }

    public void setCreatedAtNot(String createdAtNot) {
        this.createdAtNot = createdAtNot;
    }

    public VnetBondGroupWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public VnetBondGroupWhereInput createdAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public void setCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        }
    }

    public boolean getCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT);
    }

    public VnetBondGroupWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
        if (this.createdAtNotIn == null) {
            this.createdAtNotIn = new ArrayList<String>();
        }
        this.createdAtNotIn.add(createdAtNotInItem);
        return this;
    }

    /**
     * Get createdAtNotIn
     *
     * @return createdAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtNotIn() {
        return createdAtNotIn;
    }

    public void setCreatedAtNotIn(List<String> createdAtNotIn) {
        this.createdAtNotIn = createdAtNotIn;
    }

    public VnetBondGroupWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput createdAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public void setCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        }
    }

    public boolean getCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT_IN);
    }

    public VnetBondGroupWhereInput displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public VnetBondGroupWhereInput displayName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME);
        return this;
    }

    public VnetBondGroupWhereInput displayName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME);
        return this;
    }

    public void setDisplayName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME);
        }
    }

    public boolean getDisplayName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME);
    }

    public VnetBondGroupWhereInput displayNameContains(String displayNameContains) {

        this.displayNameContains = displayNameContains;
        return this;
    }

    /**
     * Get displayNameContains
     *
     * @return displayNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameContains() {
        return displayNameContains;
    }

    public void setDisplayNameContains(String displayNameContains) {
        this.displayNameContains = displayNameContains;
    }

    public VnetBondGroupWhereInput displayNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput displayNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
        return this;
    }

    public void setDisplayNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
        }
    }

    public boolean getDisplayNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
    }

    public VnetBondGroupWhereInput displayNameEndsWith(String displayNameEndsWith) {

        this.displayNameEndsWith = displayNameEndsWith;
        return this;
    }

    /**
     * Get displayNameEndsWith
     *
     * @return displayNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameEndsWith() {
        return displayNameEndsWith;
    }

    public void setDisplayNameEndsWith(String displayNameEndsWith) {
        this.displayNameEndsWith = displayNameEndsWith;
    }

    public VnetBondGroupWhereInput displayNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput displayNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
        return this;
    }

    public void setDisplayNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
        }
    }

    public boolean getDisplayNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
    }

    public VnetBondGroupWhereInput displayNameGt(String displayNameGt) {

        this.displayNameGt = displayNameGt;
        return this;
    }

    /**
     * Get displayNameGt
     *
     * @return displayNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameGt() {
        return displayNameGt;
    }

    public void setDisplayNameGt(String displayNameGt) {
        this.displayNameGt = displayNameGt;
    }

    public VnetBondGroupWhereInput displayNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GT);
        return this;
    }

    public VnetBondGroupWhereInput displayNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_GT);
        return this;
    }

    public void setDisplayNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_GT);
        }
    }

    public boolean getDisplayNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_GT);
    }

    public VnetBondGroupWhereInput displayNameGte(String displayNameGte) {

        this.displayNameGte = displayNameGte;
        return this;
    }

    /**
     * Get displayNameGte
     *
     * @return displayNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameGte() {
        return displayNameGte;
    }

    public void setDisplayNameGte(String displayNameGte) {
        this.displayNameGte = displayNameGte;
    }

    public VnetBondGroupWhereInput displayNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GTE);
        return this;
    }

    public VnetBondGroupWhereInput displayNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_GTE);
        return this;
    }

    public void setDisplayNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_GTE);
        }
    }

    public boolean getDisplayNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_GTE);
    }

    public VnetBondGroupWhereInput displayNameIn(List<String> displayNameIn) {

        this.displayNameIn = displayNameIn;
        return this;
    }

    public VnetBondGroupWhereInput addDisplayNameInItem(String displayNameInItem) {
        if (this.displayNameIn == null) {
            this.displayNameIn = new ArrayList<String>();
        }
        this.displayNameIn.add(displayNameInItem);
        return this;
    }

    /**
     * Get displayNameIn
     *
     * @return displayNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisplayNameIn() {
        return displayNameIn;
    }

    public void setDisplayNameIn(List<String> displayNameIn) {
        this.displayNameIn = displayNameIn;
    }

    public VnetBondGroupWhereInput displayNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_IN);
        return this;
    }

    public VnetBondGroupWhereInput displayNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_IN);
        return this;
    }

    public void setDisplayNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_IN);
        }
    }

    public boolean getDisplayNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_IN);
    }

    public VnetBondGroupWhereInput displayNameLt(String displayNameLt) {

        this.displayNameLt = displayNameLt;
        return this;
    }

    /**
     * Get displayNameLt
     *
     * @return displayNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameLt() {
        return displayNameLt;
    }

    public void setDisplayNameLt(String displayNameLt) {
        this.displayNameLt = displayNameLt;
    }

    public VnetBondGroupWhereInput displayNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LT);
        return this;
    }

    public VnetBondGroupWhereInput displayNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_LT);
        return this;
    }

    public void setDisplayNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_LT);
        }
    }

    public boolean getDisplayNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_LT);
    }

    public VnetBondGroupWhereInput displayNameLte(String displayNameLte) {

        this.displayNameLte = displayNameLte;
        return this;
    }

    /**
     * Get displayNameLte
     *
     * @return displayNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameLte() {
        return displayNameLte;
    }

    public void setDisplayNameLte(String displayNameLte) {
        this.displayNameLte = displayNameLte;
    }

    public VnetBondGroupWhereInput displayNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LTE);
        return this;
    }

    public VnetBondGroupWhereInput displayNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_LTE);
        return this;
    }

    public void setDisplayNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_LTE);
        }
    }

    public boolean getDisplayNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_LTE);
    }

    public VnetBondGroupWhereInput displayNameNot(String displayNameNot) {

        this.displayNameNot = displayNameNot;
        return this;
    }

    /**
     * Get displayNameNot
     *
     * @return displayNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameNot() {
        return displayNameNot;
    }

    public void setDisplayNameNot(String displayNameNot) {
        this.displayNameNot = displayNameNot;
    }

    public VnetBondGroupWhereInput displayNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT);
        return this;
    }

    public VnetBondGroupWhereInput displayNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT);
        return this;
    }

    public void setDisplayNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT);
        }
    }

    public boolean getDisplayNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_NOT);
    }

    public VnetBondGroupWhereInput displayNameNotContains(String displayNameNotContains) {

        this.displayNameNotContains = displayNameNotContains;
        return this;
    }

    /**
     * Get displayNameNotContains
     *
     * @return displayNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameNotContains() {
        return displayNameNotContains;
    }

    public void setDisplayNameNotContains(String displayNameNotContains) {
        this.displayNameNotContains = displayNameNotContains;
    }

    public VnetBondGroupWhereInput displayNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput displayNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
        return this;
    }

    public void setDisplayNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
        }
    }

    public boolean getDisplayNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
    }

    public VnetBondGroupWhereInput displayNameNotEndsWith(String displayNameNotEndsWith) {

        this.displayNameNotEndsWith = displayNameNotEndsWith;
        return this;
    }

    /**
     * Get displayNameNotEndsWith
     *
     * @return displayNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameNotEndsWith() {
        return displayNameNotEndsWith;
    }

    public void setDisplayNameNotEndsWith(String displayNameNotEndsWith) {
        this.displayNameNotEndsWith = displayNameNotEndsWith;
    }

    public VnetBondGroupWhereInput displayNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput displayNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setDisplayNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getDisplayNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
    }

    public VnetBondGroupWhereInput displayNameNotIn(List<String> displayNameNotIn) {

        this.displayNameNotIn = displayNameNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addDisplayNameNotInItem(String displayNameNotInItem) {
        if (this.displayNameNotIn == null) {
            this.displayNameNotIn = new ArrayList<String>();
        }
        this.displayNameNotIn.add(displayNameNotInItem);
        return this;
    }

    /**
     * Get displayNameNotIn
     *
     * @return displayNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDisplayNameNotIn() {
        return displayNameNotIn;
    }

    public void setDisplayNameNotIn(List<String> displayNameNotIn) {
        this.displayNameNotIn = displayNameNotIn;
    }

    public VnetBondGroupWhereInput displayNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput displayNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
        return this;
    }

    public void setDisplayNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
        }
    }

    public boolean getDisplayNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
    }

    public VnetBondGroupWhereInput displayNameNotStartsWith(String displayNameNotStartsWith) {

        this.displayNameNotStartsWith = displayNameNotStartsWith;
        return this;
    }

    /**
     * Get displayNameNotStartsWith
     *
     * @return displayNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameNotStartsWith() {
        return displayNameNotStartsWith;
    }

    public void setDisplayNameNotStartsWith(String displayNameNotStartsWith) {
        this.displayNameNotStartsWith = displayNameNotStartsWith;
    }

    public VnetBondGroupWhereInput displayNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput displayNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setDisplayNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getDisplayNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
    }

    public VnetBondGroupWhereInput displayNameStartsWith(String displayNameStartsWith) {

        this.displayNameStartsWith = displayNameStartsWith;
        return this;
    }

    /**
     * Get displayNameStartsWith
     *
     * @return displayNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisplayNameStartsWith() {
        return displayNameStartsWith;
    }

    public void setDisplayNameStartsWith(String displayNameStartsWith) {
        this.displayNameStartsWith = displayNameStartsWith;
    }

    public VnetBondGroupWhereInput displayNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput displayNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
        return this;
    }

    public void setDisplayNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
        }
    }

    public boolean getDisplayNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
    }

    public VnetBondGroupWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VnetBondGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VnetBondGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VnetBondGroupWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
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

    public VnetBondGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VnetBondGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VnetBondGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VnetBondGroupWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public VnetBondGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput id(String id) {

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

    public VnetBondGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VnetBondGroupWhereInput id_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idContains(String idContains) {

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

    public VnetBondGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput idContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idEndsWith(String idEndsWith) {

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

    public VnetBondGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idGt(String idGt) {

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

    public VnetBondGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VnetBondGroupWhereInput idGt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idGte(String idGte) {

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

    public VnetBondGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VnetBondGroupWhereInput idGte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VnetBondGroupWhereInput addIdInItem(String idInItem) {
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

    public VnetBondGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VnetBondGroupWhereInput idIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idLt(String idLt) {

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

    public VnetBondGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VnetBondGroupWhereInput idLt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idLte(String idLte) {

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

    public VnetBondGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VnetBondGroupWhereInput idLte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idNot(String idNot) {

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

    public VnetBondGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VnetBondGroupWhereInput idNot_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idNotContains(String idNotContains) {

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

    public VnetBondGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VnetBondGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public VnetBondGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VnetBondGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput idStartsWith(String idStartsWith) {

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

    public VnetBondGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput loadBalancerInstanceGroup(
            LoadBalancerInstanceGroupWhereInput loadBalancerInstanceGroup) {

        this.loadBalancerInstanceGroup = loadBalancerInstanceGroup;
        return this;
    }

    /**
     * Get loadBalancerInstanceGroup
     *
     * @return loadBalancerInstanceGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceGroupWhereInput getLoadBalancerInstanceGroup() {
        return loadBalancerInstanceGroup;
    }

    public void setLoadBalancerInstanceGroup(
            LoadBalancerInstanceGroupWhereInput loadBalancerInstanceGroup) {
        this.loadBalancerInstanceGroup = loadBalancerInstanceGroup;
    }

    public VnetBondGroupWhereInput loadBalancerInstanceGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP);
        return this;
    }

    public VnetBondGroupWhereInput loadBalancerInstanceGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP);
        return this;
    }

    public void setLoadBalancerInstanceGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP);
        }
    }

    public boolean getLoadBalancerInstanceGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOAD_BALANCER_INSTANCE_GROUP);
    }

    public VnetBondGroupWhereInput localId(String localId) {

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

    public VnetBondGroupWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VnetBondGroupWhereInput localId_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdContains(String localIdContains) {

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

    public VnetBondGroupWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput localIdContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VnetBondGroupWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdGt(String localIdGt) {

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

    public VnetBondGroupWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VnetBondGroupWhereInput localIdGt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdGte(String localIdGte) {

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

    public VnetBondGroupWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VnetBondGroupWhereInput localIdGte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VnetBondGroupWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VnetBondGroupWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VnetBondGroupWhereInput localIdIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdLt(String localIdLt) {

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

    public VnetBondGroupWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VnetBondGroupWhereInput localIdLt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdLte(String localIdLte) {

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

    public VnetBondGroupWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VnetBondGroupWhereInput localIdLte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdNot(String localIdNot) {

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

    public VnetBondGroupWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VnetBondGroupWhereInput localIdNot_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdNotContains(String localIdNotContains) {

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

    public VnetBondGroupWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VnetBondGroupWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VnetBondGroupWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VnetBondGroupWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VnetBondGroupWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput name(String name) {

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

    public VnetBondGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VnetBondGroupWhereInput name_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameContains(String nameContains) {

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

    public VnetBondGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public VnetBondGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameGt(String nameGt) {

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

    public VnetBondGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VnetBondGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameGte(String nameGte) {

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

    public VnetBondGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VnetBondGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VnetBondGroupWhereInput addNameInItem(String nameInItem) {
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

    public VnetBondGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VnetBondGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameLt(String nameLt) {

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

    public VnetBondGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VnetBondGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameLte(String nameLte) {

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

    public VnetBondGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VnetBondGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameNot(String nameNot) {

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

    public VnetBondGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VnetBondGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameNotContains(String nameNotContains) {

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

    public VnetBondGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VnetBondGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VnetBondGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VnetBondGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VnetBondGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public VnetBondGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VnetBondGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VnetBondGroupWhereInput networkType(VnetBondNetworkType networkType) {

        this.networkType = networkType;
        return this;
    }

    /**
     * Get networkType
     *
     * @return networkType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondNetworkType getNetworkType() {
        return networkType;
    }

    public void setNetworkType(VnetBondNetworkType networkType) {
        this.networkType = networkType;
    }

    public VnetBondGroupWhereInput networkType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE);
        return this;
    }

    public VnetBondGroupWhereInput networkType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE);
        return this;
    }

    public void setNetworkType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE);
        }
    }

    public boolean getNetworkType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_TYPE);
    }

    public VnetBondGroupWhereInput networkTypeIn(List<VnetBondNetworkType> networkTypeIn) {

        this.networkTypeIn = networkTypeIn;
        return this;
    }

    public VnetBondGroupWhereInput addNetworkTypeInItem(VnetBondNetworkType networkTypeInItem) {
        if (this.networkTypeIn == null) {
            this.networkTypeIn = new ArrayList<VnetBondNetworkType>();
        }
        this.networkTypeIn.add(networkTypeInItem);
        return this;
    }

    /**
     * Get networkTypeIn
     *
     * @return networkTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VnetBondNetworkType> getNetworkTypeIn() {
        return networkTypeIn;
    }

    public void setNetworkTypeIn(List<VnetBondNetworkType> networkTypeIn) {
        this.networkTypeIn = networkTypeIn;
    }

    public VnetBondGroupWhereInput networkTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_IN);
        return this;
    }

    public VnetBondGroupWhereInput networkTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_IN);
        return this;
    }

    public void setNetworkTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_IN);
        }
    }

    public boolean getNetworkTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_TYPE_IN);
    }

    public VnetBondGroupWhereInput networkTypeNot(VnetBondNetworkType networkTypeNot) {

        this.networkTypeNot = networkTypeNot;
        return this;
    }

    /**
     * Get networkTypeNot
     *
     * @return networkTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondNetworkType getNetworkTypeNot() {
        return networkTypeNot;
    }

    public void setNetworkTypeNot(VnetBondNetworkType networkTypeNot) {
        this.networkTypeNot = networkTypeNot;
    }

    public VnetBondGroupWhereInput networkTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_NOT);
        return this;
    }

    public VnetBondGroupWhereInput networkTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_NOT);
        return this;
    }

    public void setNetworkTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_NOT);
        }
    }

    public boolean getNetworkTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_TYPE_NOT);
    }

    public VnetBondGroupWhereInput networkTypeNotIn(List<VnetBondNetworkType> networkTypeNotIn) {

        this.networkTypeNotIn = networkTypeNotIn;
        return this;
    }

    public VnetBondGroupWhereInput addNetworkTypeNotInItem(
            VnetBondNetworkType networkTypeNotInItem) {
        if (this.networkTypeNotIn == null) {
            this.networkTypeNotIn = new ArrayList<VnetBondNetworkType>();
        }
        this.networkTypeNotIn.add(networkTypeNotInItem);
        return this;
    }

    /**
     * Get networkTypeNotIn
     *
     * @return networkTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VnetBondNetworkType> getNetworkTypeNotIn() {
        return networkTypeNotIn;
    }

    public void setNetworkTypeNotIn(List<VnetBondNetworkType> networkTypeNotIn) {
        this.networkTypeNotIn = networkTypeNotIn;
    }

    public VnetBondGroupWhereInput networkTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public VnetBondGroupWhereInput networkTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public void setNetworkTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN);
        }
    }

    public boolean getNetworkTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_TYPE_NOT_IN);
    }

    public VnetBondGroupWhereInput vnetBondsEvery(VnetBondWhereInput vnetBondsEvery) {

        this.vnetBondsEvery = vnetBondsEvery;
        return this;
    }

    /**
     * Get vnetBondsEvery
     *
     * @return vnetBondsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondWhereInput getVnetBondsEvery() {
        return vnetBondsEvery;
    }

    public void setVnetBondsEvery(VnetBondWhereInput vnetBondsEvery) {
        this.vnetBondsEvery = vnetBondsEvery;
    }

    public VnetBondGroupWhereInput vnetBondsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_EVERY);
        return this;
    }

    public VnetBondGroupWhereInput vnetBondsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_EVERY);
        return this;
    }

    public void setVnetBondsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_EVERY);
        }
    }

    public boolean getVnetBondsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BONDS_EVERY);
    }

    public VnetBondGroupWhereInput vnetBondsNone(VnetBondWhereInput vnetBondsNone) {

        this.vnetBondsNone = vnetBondsNone;
        return this;
    }

    /**
     * Get vnetBondsNone
     *
     * @return vnetBondsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondWhereInput getVnetBondsNone() {
        return vnetBondsNone;
    }

    public void setVnetBondsNone(VnetBondWhereInput vnetBondsNone) {
        this.vnetBondsNone = vnetBondsNone;
    }

    public VnetBondGroupWhereInput vnetBondsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_NONE);
        return this;
    }

    public VnetBondGroupWhereInput vnetBondsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_NONE);
        return this;
    }

    public void setVnetBondsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_NONE);
        }
    }

    public boolean getVnetBondsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BONDS_NONE);
    }

    public VnetBondGroupWhereInput vnetBondsSome(VnetBondWhereInput vnetBondsSome) {

        this.vnetBondsSome = vnetBondsSome;
        return this;
    }

    /**
     * Get vnetBondsSome
     *
     * @return vnetBondsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondWhereInput getVnetBondsSome() {
        return vnetBondsSome;
    }

    public void setVnetBondsSome(VnetBondWhereInput vnetBondsSome) {
        this.vnetBondsSome = vnetBondsSome;
    }

    public VnetBondGroupWhereInput vnetBondsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_SOME);
        return this;
    }

    public VnetBondGroupWhereInput vnetBondsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_SOME);
        return this;
    }

    public void setVnetBondsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BONDS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BONDS_SOME);
        }
    }

    public boolean getVnetBondsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BONDS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VnetBondGroupWhereInput vnetBondGroupWhereInput = (VnetBondGroupWhereInput) o;
        return Objects.equals(this.AND, vnetBondGroupWhereInput.AND)
                && Objects.equals(this.NOT, vnetBondGroupWhereInput.NOT)
                && Objects.equals(this.OR, vnetBondGroupWhereInput.OR)
                && Objects.equals(this.createdAt, vnetBondGroupWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, vnetBondGroupWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, vnetBondGroupWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, vnetBondGroupWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, vnetBondGroupWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, vnetBondGroupWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, vnetBondGroupWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, vnetBondGroupWhereInput.createdAtNotIn)
                && Objects.equals(this.displayName, vnetBondGroupWhereInput.displayName)
                && Objects.equals(
                        this.displayNameContains, vnetBondGroupWhereInput.displayNameContains)
                && Objects.equals(
                        this.displayNameEndsWith, vnetBondGroupWhereInput.displayNameEndsWith)
                && Objects.equals(this.displayNameGt, vnetBondGroupWhereInput.displayNameGt)
                && Objects.equals(this.displayNameGte, vnetBondGroupWhereInput.displayNameGte)
                && Objects.equals(this.displayNameIn, vnetBondGroupWhereInput.displayNameIn)
                && Objects.equals(this.displayNameLt, vnetBondGroupWhereInput.displayNameLt)
                && Objects.equals(this.displayNameLte, vnetBondGroupWhereInput.displayNameLte)
                && Objects.equals(this.displayNameNot, vnetBondGroupWhereInput.displayNameNot)
                && Objects.equals(
                        this.displayNameNotContains, vnetBondGroupWhereInput.displayNameNotContains)
                && Objects.equals(
                        this.displayNameNotEndsWith, vnetBondGroupWhereInput.displayNameNotEndsWith)
                && Objects.equals(this.displayNameNotIn, vnetBondGroupWhereInput.displayNameNotIn)
                && Objects.equals(
                        this.displayNameNotStartsWith,
                        vnetBondGroupWhereInput.displayNameNotStartsWith)
                && Objects.equals(
                        this.displayNameStartsWith, vnetBondGroupWhereInput.displayNameStartsWith)
                && Objects.equals(this.entityAsyncStatus, vnetBondGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vnetBondGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vnetBondGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, vnetBondGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, vnetBondGroupWhereInput.id)
                && Objects.equals(this.idContains, vnetBondGroupWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vnetBondGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vnetBondGroupWhereInput.idGt)
                && Objects.equals(this.idGte, vnetBondGroupWhereInput.idGte)
                && Objects.equals(this.idIn, vnetBondGroupWhereInput.idIn)
                && Objects.equals(this.idLt, vnetBondGroupWhereInput.idLt)
                && Objects.equals(this.idLte, vnetBondGroupWhereInput.idLte)
                && Objects.equals(this.idNot, vnetBondGroupWhereInput.idNot)
                && Objects.equals(this.idNotContains, vnetBondGroupWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vnetBondGroupWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vnetBondGroupWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vnetBondGroupWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vnetBondGroupWhereInput.idStartsWith)
                && Objects.equals(
                        this.loadBalancerInstanceGroup,
                        vnetBondGroupWhereInput.loadBalancerInstanceGroup)
                && Objects.equals(this.localId, vnetBondGroupWhereInput.localId)
                && Objects.equals(this.localIdContains, vnetBondGroupWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vnetBondGroupWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vnetBondGroupWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vnetBondGroupWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vnetBondGroupWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vnetBondGroupWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vnetBondGroupWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vnetBondGroupWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, vnetBondGroupWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, vnetBondGroupWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vnetBondGroupWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vnetBondGroupWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vnetBondGroupWhereInput.localIdStartsWith)
                && Objects.equals(this.name, vnetBondGroupWhereInput.name)
                && Objects.equals(this.nameContains, vnetBondGroupWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vnetBondGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vnetBondGroupWhereInput.nameGt)
                && Objects.equals(this.nameGte, vnetBondGroupWhereInput.nameGte)
                && Objects.equals(this.nameIn, vnetBondGroupWhereInput.nameIn)
                && Objects.equals(this.nameLt, vnetBondGroupWhereInput.nameLt)
                && Objects.equals(this.nameLte, vnetBondGroupWhereInput.nameLte)
                && Objects.equals(this.nameNot, vnetBondGroupWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vnetBondGroupWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vnetBondGroupWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vnetBondGroupWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, vnetBondGroupWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vnetBondGroupWhereInput.nameStartsWith)
                && Objects.equals(this.networkType, vnetBondGroupWhereInput.networkType)
                && Objects.equals(this.networkTypeIn, vnetBondGroupWhereInput.networkTypeIn)
                && Objects.equals(this.networkTypeNot, vnetBondGroupWhereInput.networkTypeNot)
                && Objects.equals(this.networkTypeNotIn, vnetBondGroupWhereInput.networkTypeNotIn)
                && Objects.equals(this.vnetBondsEvery, vnetBondGroupWhereInput.vnetBondsEvery)
                && Objects.equals(this.vnetBondsNone, vnetBondGroupWhereInput.vnetBondsNone)
                && Objects.equals(this.vnetBondsSome, vnetBondGroupWhereInput.vnetBondsSome);
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
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                displayName,
                displayNameContains,
                displayNameEndsWith,
                displayNameGt,
                displayNameGte,
                displayNameIn,
                displayNameLt,
                displayNameLte,
                displayNameNot,
                displayNameNotContains,
                displayNameNotEndsWith,
                displayNameNotIn,
                displayNameNotStartsWith,
                displayNameStartsWith,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                loadBalancerInstanceGroup,
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
                networkType,
                networkTypeIn,
                networkTypeNot,
                networkTypeNotIn,
                vnetBondsEvery,
                vnetBondsNone,
                vnetBondsSome);
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
        sb.append("class VnetBondGroupWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    displayNameContains: ")
                .append(toIndentedString(displayNameContains))
                .append("\n");
        sb.append("    displayNameEndsWith: ")
                .append(toIndentedString(displayNameEndsWith))
                .append("\n");
        sb.append("    displayNameGt: ").append(toIndentedString(displayNameGt)).append("\n");
        sb.append("    displayNameGte: ").append(toIndentedString(displayNameGte)).append("\n");
        sb.append("    displayNameIn: ").append(toIndentedString(displayNameIn)).append("\n");
        sb.append("    displayNameLt: ").append(toIndentedString(displayNameLt)).append("\n");
        sb.append("    displayNameLte: ").append(toIndentedString(displayNameLte)).append("\n");
        sb.append("    displayNameNot: ").append(toIndentedString(displayNameNot)).append("\n");
        sb.append("    displayNameNotContains: ")
                .append(toIndentedString(displayNameNotContains))
                .append("\n");
        sb.append("    displayNameNotEndsWith: ")
                .append(toIndentedString(displayNameNotEndsWith))
                .append("\n");
        sb.append("    displayNameNotIn: ").append(toIndentedString(displayNameNotIn)).append("\n");
        sb.append("    displayNameNotStartsWith: ")
                .append(toIndentedString(displayNameNotStartsWith))
                .append("\n");
        sb.append("    displayNameStartsWith: ")
                .append(toIndentedString(displayNameStartsWith))
                .append("\n");
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
        sb.append("    loadBalancerInstanceGroup: ")
                .append(toIndentedString(loadBalancerInstanceGroup))
                .append("\n");
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
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    networkTypeIn: ").append(toIndentedString(networkTypeIn)).append("\n");
        sb.append("    networkTypeNot: ").append(toIndentedString(networkTypeNot)).append("\n");
        sb.append("    networkTypeNotIn: ").append(toIndentedString(networkTypeNotIn)).append("\n");
        sb.append("    vnetBondsEvery: ").append(toIndentedString(vnetBondsEvery)).append("\n");
        sb.append("    vnetBondsNone: ").append(toIndentedString(vnetBondsNone)).append("\n");
        sb.append("    vnetBondsSome: ").append(toIndentedString(vnetBondsSome)).append("\n");
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
