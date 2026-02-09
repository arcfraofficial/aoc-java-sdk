package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LoadBalancerInstanceGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LoadBalancerInstanceGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<LoadBalancerInstanceGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<LoadBalancerInstanceGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<LoadBalancerInstanceGroupWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

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

    public static final String SERIALIZED_NAME_LOAD_BALANCER_SERVICE = "load_balancer_service";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SERVICE)
    private LoadBalancerServiceWhereInput loadBalancerService;

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

    public static final String SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY =
            "primary_load_balancer_instances_every";

    @SerializedName(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY)
    private LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesEvery;

    public static final String SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE =
            "primary_load_balancer_instances_none";

    @SerializedName(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE)
    private LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesNone;

    public static final String SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME =
            "primary_load_balancer_instances_some";

    @SerializedName(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME)
    private LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesSome;

    public static final String SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY =
            "secondary_load_balancer_instances_every";

    @SerializedName(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY)
    private LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesEvery;

    public static final String SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE =
            "secondary_load_balancer_instances_none";

    @SerializedName(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE)
    private LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesNone;

    public static final String SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME =
            "secondary_load_balancer_instances_some";

    @SerializedName(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME)
    private LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesSome;

    public static final String SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY = "vnet_bond_groups_every";

    @SerializedName(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY)
    private VnetBondGroupWhereInput vnetBondGroupsEvery;

    public static final String SERIALIZED_NAME_VNET_BOND_GROUPS_NONE = "vnet_bond_groups_none";

    @SerializedName(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE)
    private VnetBondGroupWhereInput vnetBondGroupsNone;

    public static final String SERIALIZED_NAME_VNET_BOND_GROUPS_SOME = "vnet_bond_groups_some";

    @SerializedName(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME)
    private VnetBondGroupWhereInput vnetBondGroupsSome;

    public LoadBalancerInstanceGroupWhereInput() {}

    public LoadBalancerInstanceGroupWhereInput AND(List<LoadBalancerInstanceGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addANDItem(
            LoadBalancerInstanceGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<LoadBalancerInstanceGroupWhereInput>();
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
    public List<LoadBalancerInstanceGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<LoadBalancerInstanceGroupWhereInput> AND) {
        this.AND = AND;
    }

    public LoadBalancerInstanceGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput AND_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput NOT(List<LoadBalancerInstanceGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addNOTItem(
            LoadBalancerInstanceGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<LoadBalancerInstanceGroupWhereInput>();
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
    public List<LoadBalancerInstanceGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<LoadBalancerInstanceGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public LoadBalancerInstanceGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput NOT_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput OR(List<LoadBalancerInstanceGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addORItem(
            LoadBalancerInstanceGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<LoadBalancerInstanceGroupWhereInput>();
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
    public List<LoadBalancerInstanceGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<LoadBalancerInstanceGroupWhereInput> OR) {
        this.OR = OR;
    }

    public LoadBalancerInstanceGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput OR_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAt(String createdAt) {

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

    public LoadBalancerInstanceGroupWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtGt(String createdAtGt) {

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

    public LoadBalancerInstanceGroupWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtGt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtGte(String createdAtGte) {

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

    public LoadBalancerInstanceGroupWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtGte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public LoadBalancerInstanceGroupWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtLt(String createdAtLt) {

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

    public LoadBalancerInstanceGroupWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtLt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtLte(String createdAtLte) {

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

    public LoadBalancerInstanceGroupWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtLte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtNot(String createdAtNot) {

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

    public LoadBalancerInstanceGroupWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public LoadBalancerInstanceGroupWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput description(String description) {

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

    public LoadBalancerInstanceGroupWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput description_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotContains(
            String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotEndsWith(
            String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addDescriptionNotInItem(
            String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotStartsWith(
            String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public LoadBalancerInstanceGroupWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public LoadBalancerInstanceGroupWhereInput displayName(String displayName) {

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

    public LoadBalancerInstanceGroupWhereInput displayName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayName_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameContains(String displayNameContains) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameEndsWith(String displayNameEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameGt(String displayNameGt) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameGt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameGte(String displayNameGte) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameGte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameIn(List<String> displayNameIn) {

        this.displayNameIn = displayNameIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addDisplayNameInItem(String displayNameInItem) {
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

    public LoadBalancerInstanceGroupWhereInput displayNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameLt(String displayNameLt) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameLt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameLte(String displayNameLte) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameLte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNot(String displayNameNot) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNotContains(
            String displayNameNotContains) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameNotContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNotEndsWith(
            String displayNameNotEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameNotEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNotIn(List<String> displayNameNotIn) {

        this.displayNameNotIn = displayNameNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addDisplayNameNotInItem(
            String displayNameNotInItem) {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameNotStartsWith(
            String displayNameNotStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_NOT_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameNotStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput displayNameStartsWith(String displayNameStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput displayNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISPLAY_NAME_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput displayNameStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatus(
            EntityAsyncStatus entityAsyncStatus) {

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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addEntityAsyncStatusInItem(
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNot(
            EntityAsyncStatus entityAsyncStatusNot) {

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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput id(String id) {

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

    public LoadBalancerInstanceGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput id_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idContains(String idContains) {

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

    public LoadBalancerInstanceGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idEndsWith(String idEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idGt(String idGt) {

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

    public LoadBalancerInstanceGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idGt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idGte(String idGte) {

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

    public LoadBalancerInstanceGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idGte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addIdInItem(String idInItem) {
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

    public LoadBalancerInstanceGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idLt(String idLt) {

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

    public LoadBalancerInstanceGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idLt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idLte(String idLte) {

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

    public LoadBalancerInstanceGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idLte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idNot(String idNot) {

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

    public LoadBalancerInstanceGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idNotContains(String idNotContains) {

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

    public LoadBalancerInstanceGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public LoadBalancerInstanceGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput idStartsWith(String idStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput loadBalancerService(
            LoadBalancerServiceWhereInput loadBalancerService) {

        this.loadBalancerService = loadBalancerService;
        return this;
    }

    /**
     * Get loadBalancerService
     *
     * @return loadBalancerService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerServiceWhereInput getLoadBalancerService() {
        return loadBalancerService;
    }

    public void setLoadBalancerService(LoadBalancerServiceWhereInput loadBalancerService) {
        this.loadBalancerService = loadBalancerService;
    }

    public LoadBalancerInstanceGroupWhereInput loadBalancerService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput loadBalancerService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        return this;
    }

    public void setLoadBalancerService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        }
    }

    public boolean getLoadBalancerService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
    }

    public LoadBalancerInstanceGroupWhereInput localId(String localId) {

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

    public LoadBalancerInstanceGroupWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localId_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdContains(String localIdContains) {

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

    public LoadBalancerInstanceGroupWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdGt(String localIdGt) {

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

    public LoadBalancerInstanceGroupWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdGt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdGte(String localIdGte) {

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

    public LoadBalancerInstanceGroupWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdGte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addLocalIdInItem(String localIdInItem) {
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

    public LoadBalancerInstanceGroupWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdLt(String localIdLt) {

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

    public LoadBalancerInstanceGroupWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdLt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdLte(String localIdLte) {

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

    public LoadBalancerInstanceGroupWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdLte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdNot(String localIdNot) {

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

    public LoadBalancerInstanceGroupWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdNotContains(String localIdNotContains) {

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

    public LoadBalancerInstanceGroupWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public LoadBalancerInstanceGroupWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput name(String name) {

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

    public LoadBalancerInstanceGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput name_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameContains(String nameContains) {

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

    public LoadBalancerInstanceGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameGt(String nameGt) {

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

    public LoadBalancerInstanceGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameGte(String nameGte) {

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

    public LoadBalancerInstanceGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addNameInItem(String nameInItem) {
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

    public LoadBalancerInstanceGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameLt(String nameLt) {

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

    public LoadBalancerInstanceGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameLte(String nameLte) {

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

    public LoadBalancerInstanceGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameNot(String nameNot) {

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

    public LoadBalancerInstanceGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameNotContains(String nameNotContains) {

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

    public LoadBalancerInstanceGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public LoadBalancerInstanceGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public LoadBalancerInstanceGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public LoadBalancerInstanceGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesEvery(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesEvery) {

        this.primaryLoadBalancerInstancesEvery = primaryLoadBalancerInstancesEvery;
        return this;
    }

    /**
     * Get primaryLoadBalancerInstancesEvery
     *
     * @return primaryLoadBalancerInstancesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getPrimaryLoadBalancerInstancesEvery() {
        return primaryLoadBalancerInstancesEvery;
    }

    public void setPrimaryLoadBalancerInstancesEvery(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesEvery) {
        this.primaryLoadBalancerInstancesEvery = primaryLoadBalancerInstancesEvery;
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput
            primaryLoadBalancerInstancesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY);
        return this;
    }

    public void setPrimaryLoadBalancerInstancesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY);
        }
    }

    public boolean getPrimaryLoadBalancerInstancesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_EVERY);
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesNone(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesNone) {

        this.primaryLoadBalancerInstancesNone = primaryLoadBalancerInstancesNone;
        return this;
    }

    /**
     * Get primaryLoadBalancerInstancesNone
     *
     * @return primaryLoadBalancerInstancesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getPrimaryLoadBalancerInstancesNone() {
        return primaryLoadBalancerInstancesNone;
    }

    public void setPrimaryLoadBalancerInstancesNone(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesNone) {
        this.primaryLoadBalancerInstancesNone = primaryLoadBalancerInstancesNone;
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE);
        return this;
    }

    public void setPrimaryLoadBalancerInstancesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE);
        }
    }

    public boolean getPrimaryLoadBalancerInstancesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_NONE);
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesSome(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesSome) {

        this.primaryLoadBalancerInstancesSome = primaryLoadBalancerInstancesSome;
        return this;
    }

    /**
     * Get primaryLoadBalancerInstancesSome
     *
     * @return primaryLoadBalancerInstancesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getPrimaryLoadBalancerInstancesSome() {
        return primaryLoadBalancerInstancesSome;
    }

    public void setPrimaryLoadBalancerInstancesSome(
            LoadBalancerInstanceWhereInput primaryLoadBalancerInstancesSome) {
        this.primaryLoadBalancerInstancesSome = primaryLoadBalancerInstancesSome;
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput primaryLoadBalancerInstancesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME);
        return this;
    }

    public void setPrimaryLoadBalancerInstancesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME);
        }
    }

    public boolean getPrimaryLoadBalancerInstancesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_LOAD_BALANCER_INSTANCES_SOME);
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesEvery(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesEvery) {

        this.secondaryLoadBalancerInstancesEvery = secondaryLoadBalancerInstancesEvery;
        return this;
    }

    /**
     * Get secondaryLoadBalancerInstancesEvery
     *
     * @return secondaryLoadBalancerInstancesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getSecondaryLoadBalancerInstancesEvery() {
        return secondaryLoadBalancerInstancesEvery;
    }

    public void setSecondaryLoadBalancerInstancesEvery(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesEvery) {
        this.secondaryLoadBalancerInstancesEvery = secondaryLoadBalancerInstancesEvery;
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput
            secondaryLoadBalancerInstancesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY);
        return this;
    }

    public void setSecondaryLoadBalancerInstancesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY);
        }
    }

    public boolean getSecondaryLoadBalancerInstancesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_EVERY);
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesNone(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesNone) {

        this.secondaryLoadBalancerInstancesNone = secondaryLoadBalancerInstancesNone;
        return this;
    }

    /**
     * Get secondaryLoadBalancerInstancesNone
     *
     * @return secondaryLoadBalancerInstancesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getSecondaryLoadBalancerInstancesNone() {
        return secondaryLoadBalancerInstancesNone;
    }

    public void setSecondaryLoadBalancerInstancesNone(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesNone) {
        this.secondaryLoadBalancerInstancesNone = secondaryLoadBalancerInstancesNone;
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput
            secondaryLoadBalancerInstancesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE);
        return this;
    }

    public void setSecondaryLoadBalancerInstancesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE);
        }
    }

    public boolean getSecondaryLoadBalancerInstancesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_NONE);
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesSome(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesSome) {

        this.secondaryLoadBalancerInstancesSome = secondaryLoadBalancerInstancesSome;
        return this;
    }

    /**
     * Get secondaryLoadBalancerInstancesSome
     *
     * @return secondaryLoadBalancerInstancesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LoadBalancerInstanceWhereInput getSecondaryLoadBalancerInstancesSome() {
        return secondaryLoadBalancerInstancesSome;
    }

    public void setSecondaryLoadBalancerInstancesSome(
            LoadBalancerInstanceWhereInput secondaryLoadBalancerInstancesSome) {
        this.secondaryLoadBalancerInstancesSome = secondaryLoadBalancerInstancesSome;
    }

    public LoadBalancerInstanceGroupWhereInput secondaryLoadBalancerInstancesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput
            secondaryLoadBalancerInstancesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME);
        return this;
    }

    public void setSecondaryLoadBalancerInstancesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME);
        }
    }

    public boolean getSecondaryLoadBalancerInstancesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECONDARY_LOAD_BALANCER_INSTANCES_SOME);
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsEvery(
            VnetBondGroupWhereInput vnetBondGroupsEvery) {

        this.vnetBondGroupsEvery = vnetBondGroupsEvery;
        return this;
    }

    /**
     * Get vnetBondGroupsEvery
     *
     * @return vnetBondGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondGroupWhereInput getVnetBondGroupsEvery() {
        return vnetBondGroupsEvery;
    }

    public void setVnetBondGroupsEvery(VnetBondGroupWhereInput vnetBondGroupsEvery) {
        this.vnetBondGroupsEvery = vnetBondGroupsEvery;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY);
        return this;
    }

    public void setVnetBondGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY);
        }
    }

    public boolean getVnetBondGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BOND_GROUPS_EVERY);
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsNone(
            VnetBondGroupWhereInput vnetBondGroupsNone) {

        this.vnetBondGroupsNone = vnetBondGroupsNone;
        return this;
    }

    /**
     * Get vnetBondGroupsNone
     *
     * @return vnetBondGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondGroupWhereInput getVnetBondGroupsNone() {
        return vnetBondGroupsNone;
    }

    public void setVnetBondGroupsNone(VnetBondGroupWhereInput vnetBondGroupsNone) {
        this.vnetBondGroupsNone = vnetBondGroupsNone;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE);
        return this;
    }

    public void setVnetBondGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE);
        }
    }

    public boolean getVnetBondGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BOND_GROUPS_NONE);
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsSome(
            VnetBondGroupWhereInput vnetBondGroupsSome) {

        this.vnetBondGroupsSome = vnetBondGroupsSome;
        return this;
    }

    /**
     * Get vnetBondGroupsSome
     *
     * @return vnetBondGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VnetBondGroupWhereInput getVnetBondGroupsSome() {
        return vnetBondGroupsSome;
    }

    public void setVnetBondGroupsSome(VnetBondGroupWhereInput vnetBondGroupsSome) {
        this.vnetBondGroupsSome = vnetBondGroupsSome;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME);
        return this;
    }

    public LoadBalancerInstanceGroupWhereInput vnetBondGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME);
        return this;
    }

    public void setVnetBondGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME);
        }
    }

    public boolean getVnetBondGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VNET_BOND_GROUPS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerInstanceGroupWhereInput loadBalancerInstanceGroupWhereInput =
                (LoadBalancerInstanceGroupWhereInput) o;
        return Objects.equals(this.AND, loadBalancerInstanceGroupWhereInput.AND)
                && Objects.equals(this.NOT, loadBalancerInstanceGroupWhereInput.NOT)
                && Objects.equals(this.OR, loadBalancerInstanceGroupWhereInput.OR)
                && Objects.equals(this.createdAt, loadBalancerInstanceGroupWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, loadBalancerInstanceGroupWhereInput.createdAtGt)
                && Objects.equals(
                        this.createdAtGte, loadBalancerInstanceGroupWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, loadBalancerInstanceGroupWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, loadBalancerInstanceGroupWhereInput.createdAtLt)
                && Objects.equals(
                        this.createdAtLte, loadBalancerInstanceGroupWhereInput.createdAtLte)
                && Objects.equals(
                        this.createdAtNot, loadBalancerInstanceGroupWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn, loadBalancerInstanceGroupWhereInput.createdAtNotIn)
                && Objects.equals(this.description, loadBalancerInstanceGroupWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        loadBalancerInstanceGroupWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        loadBalancerInstanceGroupWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt, loadBalancerInstanceGroupWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, loadBalancerInstanceGroupWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn, loadBalancerInstanceGroupWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt, loadBalancerInstanceGroupWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, loadBalancerInstanceGroupWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, loadBalancerInstanceGroupWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        loadBalancerInstanceGroupWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        loadBalancerInstanceGroupWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, loadBalancerInstanceGroupWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        loadBalancerInstanceGroupWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        loadBalancerInstanceGroupWhereInput.descriptionStartsWith)
                && Objects.equals(this.displayName, loadBalancerInstanceGroupWhereInput.displayName)
                && Objects.equals(
                        this.displayNameContains,
                        loadBalancerInstanceGroupWhereInput.displayNameContains)
                && Objects.equals(
                        this.displayNameEndsWith,
                        loadBalancerInstanceGroupWhereInput.displayNameEndsWith)
                && Objects.equals(
                        this.displayNameGt, loadBalancerInstanceGroupWhereInput.displayNameGt)
                && Objects.equals(
                        this.displayNameGte, loadBalancerInstanceGroupWhereInput.displayNameGte)
                && Objects.equals(
                        this.displayNameIn, loadBalancerInstanceGroupWhereInput.displayNameIn)
                && Objects.equals(
                        this.displayNameLt, loadBalancerInstanceGroupWhereInput.displayNameLt)
                && Objects.equals(
                        this.displayNameLte, loadBalancerInstanceGroupWhereInput.displayNameLte)
                && Objects.equals(
                        this.displayNameNot, loadBalancerInstanceGroupWhereInput.displayNameNot)
                && Objects.equals(
                        this.displayNameNotContains,
                        loadBalancerInstanceGroupWhereInput.displayNameNotContains)
                && Objects.equals(
                        this.displayNameNotEndsWith,
                        loadBalancerInstanceGroupWhereInput.displayNameNotEndsWith)
                && Objects.equals(
                        this.displayNameNotIn, loadBalancerInstanceGroupWhereInput.displayNameNotIn)
                && Objects.equals(
                        this.displayNameNotStartsWith,
                        loadBalancerInstanceGroupWhereInput.displayNameNotStartsWith)
                && Objects.equals(
                        this.displayNameStartsWith,
                        loadBalancerInstanceGroupWhereInput.displayNameStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus,
                        loadBalancerInstanceGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        loadBalancerInstanceGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        loadBalancerInstanceGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        loadBalancerInstanceGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, loadBalancerInstanceGroupWhereInput.id)
                && Objects.equals(this.idContains, loadBalancerInstanceGroupWhereInput.idContains)
                && Objects.equals(this.idEndsWith, loadBalancerInstanceGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, loadBalancerInstanceGroupWhereInput.idGt)
                && Objects.equals(this.idGte, loadBalancerInstanceGroupWhereInput.idGte)
                && Objects.equals(this.idIn, loadBalancerInstanceGroupWhereInput.idIn)
                && Objects.equals(this.idLt, loadBalancerInstanceGroupWhereInput.idLt)
                && Objects.equals(this.idLte, loadBalancerInstanceGroupWhereInput.idLte)
                && Objects.equals(this.idNot, loadBalancerInstanceGroupWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, loadBalancerInstanceGroupWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, loadBalancerInstanceGroupWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, loadBalancerInstanceGroupWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, loadBalancerInstanceGroupWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, loadBalancerInstanceGroupWhereInput.idStartsWith)
                && Objects.equals(
                        this.loadBalancerService,
                        loadBalancerInstanceGroupWhereInput.loadBalancerService)
                && Objects.equals(this.localId, loadBalancerInstanceGroupWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, loadBalancerInstanceGroupWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, loadBalancerInstanceGroupWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, loadBalancerInstanceGroupWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, loadBalancerInstanceGroupWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, loadBalancerInstanceGroupWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, loadBalancerInstanceGroupWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, loadBalancerInstanceGroupWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, loadBalancerInstanceGroupWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        loadBalancerInstanceGroupWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        loadBalancerInstanceGroupWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, loadBalancerInstanceGroupWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        loadBalancerInstanceGroupWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        loadBalancerInstanceGroupWhereInput.localIdStartsWith)
                && Objects.equals(this.name, loadBalancerInstanceGroupWhereInput.name)
                && Objects.equals(
                        this.nameContains, loadBalancerInstanceGroupWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith, loadBalancerInstanceGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, loadBalancerInstanceGroupWhereInput.nameGt)
                && Objects.equals(this.nameGte, loadBalancerInstanceGroupWhereInput.nameGte)
                && Objects.equals(this.nameIn, loadBalancerInstanceGroupWhereInput.nameIn)
                && Objects.equals(this.nameLt, loadBalancerInstanceGroupWhereInput.nameLt)
                && Objects.equals(this.nameLte, loadBalancerInstanceGroupWhereInput.nameLte)
                && Objects.equals(this.nameNot, loadBalancerInstanceGroupWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, loadBalancerInstanceGroupWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, loadBalancerInstanceGroupWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, loadBalancerInstanceGroupWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        loadBalancerInstanceGroupWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, loadBalancerInstanceGroupWhereInput.nameStartsWith)
                && Objects.equals(
                        this.primaryLoadBalancerInstancesEvery,
                        loadBalancerInstanceGroupWhereInput.primaryLoadBalancerInstancesEvery)
                && Objects.equals(
                        this.primaryLoadBalancerInstancesNone,
                        loadBalancerInstanceGroupWhereInput.primaryLoadBalancerInstancesNone)
                && Objects.equals(
                        this.primaryLoadBalancerInstancesSome,
                        loadBalancerInstanceGroupWhereInput.primaryLoadBalancerInstancesSome)
                && Objects.equals(
                        this.secondaryLoadBalancerInstancesEvery,
                        loadBalancerInstanceGroupWhereInput.secondaryLoadBalancerInstancesEvery)
                && Objects.equals(
                        this.secondaryLoadBalancerInstancesNone,
                        loadBalancerInstanceGroupWhereInput.secondaryLoadBalancerInstancesNone)
                && Objects.equals(
                        this.secondaryLoadBalancerInstancesSome,
                        loadBalancerInstanceGroupWhereInput.secondaryLoadBalancerInstancesSome)
                && Objects.equals(
                        this.vnetBondGroupsEvery,
                        loadBalancerInstanceGroupWhereInput.vnetBondGroupsEvery)
                && Objects.equals(
                        this.vnetBondGroupsNone,
                        loadBalancerInstanceGroupWhereInput.vnetBondGroupsNone)
                && Objects.equals(
                        this.vnetBondGroupsSome,
                        loadBalancerInstanceGroupWhereInput.vnetBondGroupsSome);
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
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
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
                loadBalancerService,
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
                primaryLoadBalancerInstancesEvery,
                primaryLoadBalancerInstancesNone,
                primaryLoadBalancerInstancesSome,
                secondaryLoadBalancerInstancesEvery,
                secondaryLoadBalancerInstancesNone,
                secondaryLoadBalancerInstancesSome,
                vnetBondGroupsEvery,
                vnetBondGroupsNone,
                vnetBondGroupsSome);
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
        sb.append("class LoadBalancerInstanceGroupWhereInput {\n");
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
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
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
        sb.append("    loadBalancerService: ")
                .append(toIndentedString(loadBalancerService))
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
        sb.append("    primaryLoadBalancerInstancesEvery: ")
                .append(toIndentedString(primaryLoadBalancerInstancesEvery))
                .append("\n");
        sb.append("    primaryLoadBalancerInstancesNone: ")
                .append(toIndentedString(primaryLoadBalancerInstancesNone))
                .append("\n");
        sb.append("    primaryLoadBalancerInstancesSome: ")
                .append(toIndentedString(primaryLoadBalancerInstancesSome))
                .append("\n");
        sb.append("    secondaryLoadBalancerInstancesEvery: ")
                .append(toIndentedString(secondaryLoadBalancerInstancesEvery))
                .append("\n");
        sb.append("    secondaryLoadBalancerInstancesNone: ")
                .append(toIndentedString(secondaryLoadBalancerInstancesNone))
                .append("\n");
        sb.append("    secondaryLoadBalancerInstancesSome: ")
                .append(toIndentedString(secondaryLoadBalancerInstancesSome))
                .append("\n");
        sb.append("    vnetBondGroupsEvery: ")
                .append(toIndentedString(vnetBondGroupsEvery))
                .append("\n");
        sb.append("    vnetBondGroupsNone: ")
                .append(toIndentedString(vnetBondGroupsNone))
                .append("\n");
        sb.append("    vnetBondGroupsSome: ")
                .append(toIndentedString(vnetBondGroupsSome))
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
