package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM =
            "associate_external_subnet_num";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM)
    private Integer associateExternalSubnetNum;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT =
            "associate_external_subnet_num_gt";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT)
    private Integer associateExternalSubnetNumGt;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE =
            "associate_external_subnet_num_gte";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE)
    private Integer associateExternalSubnetNumGte;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN =
            "associate_external_subnet_num_in";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN)
    private List<Integer> associateExternalSubnetNumIn = null;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT =
            "associate_external_subnet_num_lt";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT)
    private Integer associateExternalSubnetNumLt;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE =
            "associate_external_subnet_num_lte";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE)
    private Integer associateExternalSubnetNumLte;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT =
            "associate_external_subnet_num_not";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT)
    private Integer associateExternalSubnetNumNot;

    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN =
            "associate_external_subnet_num_not_in";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN)
    private List<Integer> associateExternalSubnetNumNotIn = null;

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

    public static final String SERIALIZED_NAME_MTU = "mtu";

    @SerializedName(SERIALIZED_NAME_MTU)
    private Integer mtu;

    public static final String SERIALIZED_NAME_MTU_GT = "mtu_gt";

    @SerializedName(SERIALIZED_NAME_MTU_GT)
    private Integer mtuGt;

    public static final String SERIALIZED_NAME_MTU_GTE = "mtu_gte";

    @SerializedName(SERIALIZED_NAME_MTU_GTE)
    private Integer mtuGte;

    public static final String SERIALIZED_NAME_MTU_IN = "mtu_in";

    @SerializedName(SERIALIZED_NAME_MTU_IN)
    private List<Integer> mtuIn = null;

    public static final String SERIALIZED_NAME_MTU_LT = "mtu_lt";

    @SerializedName(SERIALIZED_NAME_MTU_LT)
    private Integer mtuLt;

    public static final String SERIALIZED_NAME_MTU_LTE = "mtu_lte";

    @SerializedName(SERIALIZED_NAME_MTU_LTE)
    private Integer mtuLte;

    public static final String SERIALIZED_NAME_MTU_NOT = "mtu_not";

    @SerializedName(SERIALIZED_NAME_MTU_NOT)
    private Integer mtuNot;

    public static final String SERIALIZED_NAME_MTU_NOT_IN = "mtu_not_in";

    @SerializedName(SERIALIZED_NAME_MTU_NOT_IN)
    private List<Integer> mtuNotIn = null;

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

    public static final String SERIALIZED_NAME_ROUTE_TABLES_EVERY = "route_tables_every";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLES_EVERY)
    private VirtualPrivateCloudRouteTableWhereInput routeTablesEvery;

    public static final String SERIALIZED_NAME_ROUTE_TABLES_NONE = "route_tables_none";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLES_NONE)
    private VirtualPrivateCloudRouteTableWhereInput routeTablesNone;

    public static final String SERIALIZED_NAME_ROUTE_TABLES_SOME = "route_tables_some";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLES_SOME)
    private VirtualPrivateCloudRouteTableWhereInput routeTablesSome;

    public static final String SERIALIZED_NAME_SECURITY_GROUPS_EVERY = "security_groups_every";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_EVERY)
    private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery;

    public static final String SERIALIZED_NAME_SECURITY_GROUPS_NONE = "security_groups_none";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_NONE)
    private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone;

    public static final String SERIALIZED_NAME_SECURITY_GROUPS_SOME = "security_groups_some";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_SOME)
    private VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_EVERY = "security_policies_every";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_EVERY)
    private VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesEvery;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_NONE = "security_policies_none";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_NONE)
    private VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesNone;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_SOME = "security_policies_some";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_SOME)
    private VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesSome;

    public static final String SERIALIZED_NAME_SUBNETS_EVERY = "subnets_every";

    @SerializedName(SERIALIZED_NAME_SUBNETS_EVERY)
    private VirtualPrivateCloudSubnetWhereInput subnetsEvery;

    public static final String SERIALIZED_NAME_SUBNETS_NONE = "subnets_none";

    @SerializedName(SERIALIZED_NAME_SUBNETS_NONE)
    private VirtualPrivateCloudSubnetWhereInput subnetsNone;

    public static final String SERIALIZED_NAME_SUBNETS_SOME = "subnets_some";

    @SerializedName(SERIALIZED_NAME_SUBNETS_SOME)
    private VirtualPrivateCloudSubnetWhereInput subnetsSome;

    public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";

    @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
    private VirtualPrivateCloudServiceWhereInput vpcService;

    public VirtualPrivateCloudWhereInput() {}

    public VirtualPrivateCloudWhereInput AND(List<VirtualPrivateCloudWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudWhereInput addANDItem(VirtualPrivateCloudWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudWhereInput>();
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
    public List<VirtualPrivateCloudWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput NOT(List<VirtualPrivateCloudWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudWhereInput addNOTItem(VirtualPrivateCloudWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudWhereInput>();
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
    public List<VirtualPrivateCloudWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput OR(List<VirtualPrivateCloudWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudWhereInput addORItem(VirtualPrivateCloudWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudWhereInput>();
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
    public List<VirtualPrivateCloudWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput associateExternalSubnetNum(
            Integer associateExternalSubnetNum) {

        this.associateExternalSubnetNum = associateExternalSubnetNum;
        return this;
    }

    /**
     * Get associateExternalSubnetNum
     *
     * @return associateExternalSubnetNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNum() {
        return associateExternalSubnetNum;
    }

    public void setAssociateExternalSubnetNum(Integer associateExternalSubnetNum) {
        this.associateExternalSubnetNum = associateExternalSubnetNum;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        return this;
    }

    public void setAssociateExternalSubnetNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        }
    }

    public boolean getAssociateExternalSubnetNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGt(
            Integer associateExternalSubnetNumGt) {

        this.associateExternalSubnetNumGt = associateExternalSubnetNumGt;
        return this;
    }

    /**
     * Get associateExternalSubnetNumGt
     *
     * @return associateExternalSubnetNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNumGt() {
        return associateExternalSubnetNumGt;
    }

    public void setAssociateExternalSubnetNumGt(Integer associateExternalSubnetNumGt) {
        this.associateExternalSubnetNumGt = associateExternalSubnetNumGt;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT);
        return this;
    }

    public void setAssociateExternalSubnetNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT);
        }
    }

    public boolean getAssociateExternalSubnetNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GT);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGte(
            Integer associateExternalSubnetNumGte) {

        this.associateExternalSubnetNumGte = associateExternalSubnetNumGte;
        return this;
    }

    /**
     * Get associateExternalSubnetNumGte
     *
     * @return associateExternalSubnetNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNumGte() {
        return associateExternalSubnetNumGte;
    }

    public void setAssociateExternalSubnetNumGte(Integer associateExternalSubnetNumGte) {
        this.associateExternalSubnetNumGte = associateExternalSubnetNumGte;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE);
        return this;
    }

    public void setAssociateExternalSubnetNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE);
        }
    }

    public boolean getAssociateExternalSubnetNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_GTE);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumIn(
            List<Integer> associateExternalSubnetNumIn) {

        this.associateExternalSubnetNumIn = associateExternalSubnetNumIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addAssociateExternalSubnetNumInItem(
            Integer associateExternalSubnetNumInItem) {
        if (this.associateExternalSubnetNumIn == null) {
            this.associateExternalSubnetNumIn = new ArrayList<Integer>();
        }
        this.associateExternalSubnetNumIn.add(associateExternalSubnetNumInItem);
        return this;
    }

    /**
     * Get associateExternalSubnetNumIn
     *
     * @return associateExternalSubnetNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAssociateExternalSubnetNumIn() {
        return associateExternalSubnetNumIn;
    }

    public void setAssociateExternalSubnetNumIn(List<Integer> associateExternalSubnetNumIn) {
        this.associateExternalSubnetNumIn = associateExternalSubnetNumIn;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN);
        return this;
    }

    public void setAssociateExternalSubnetNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN);
        }
    }

    public boolean getAssociateExternalSubnetNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_IN);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLt(
            Integer associateExternalSubnetNumLt) {

        this.associateExternalSubnetNumLt = associateExternalSubnetNumLt;
        return this;
    }

    /**
     * Get associateExternalSubnetNumLt
     *
     * @return associateExternalSubnetNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNumLt() {
        return associateExternalSubnetNumLt;
    }

    public void setAssociateExternalSubnetNumLt(Integer associateExternalSubnetNumLt) {
        this.associateExternalSubnetNumLt = associateExternalSubnetNumLt;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT);
        return this;
    }

    public void setAssociateExternalSubnetNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT);
        }
    }

    public boolean getAssociateExternalSubnetNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LT);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLte(
            Integer associateExternalSubnetNumLte) {

        this.associateExternalSubnetNumLte = associateExternalSubnetNumLte;
        return this;
    }

    /**
     * Get associateExternalSubnetNumLte
     *
     * @return associateExternalSubnetNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNumLte() {
        return associateExternalSubnetNumLte;
    }

    public void setAssociateExternalSubnetNumLte(Integer associateExternalSubnetNumLte) {
        this.associateExternalSubnetNumLte = associateExternalSubnetNumLte;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE);
        return this;
    }

    public void setAssociateExternalSubnetNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE);
        }
    }

    public boolean getAssociateExternalSubnetNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_LTE);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNot(
            Integer associateExternalSubnetNumNot) {

        this.associateExternalSubnetNumNot = associateExternalSubnetNumNot;
        return this;
    }

    /**
     * Get associateExternalSubnetNumNot
     *
     * @return associateExternalSubnetNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNumNot() {
        return associateExternalSubnetNumNot;
    }

    public void setAssociateExternalSubnetNumNot(Integer associateExternalSubnetNumNot) {
        this.associateExternalSubnetNumNot = associateExternalSubnetNumNot;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT);
        return this;
    }

    public void setAssociateExternalSubnetNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT);
        }
    }

    public boolean getAssociateExternalSubnetNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT);
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNotIn(
            List<Integer> associateExternalSubnetNumNotIn) {

        this.associateExternalSubnetNumNotIn = associateExternalSubnetNumNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addAssociateExternalSubnetNumNotInItem(
            Integer associateExternalSubnetNumNotInItem) {
        if (this.associateExternalSubnetNumNotIn == null) {
            this.associateExternalSubnetNumNotIn = new ArrayList<Integer>();
        }
        this.associateExternalSubnetNumNotIn.add(associateExternalSubnetNumNotInItem);
        return this;
    }

    /**
     * Get associateExternalSubnetNumNotIn
     *
     * @return associateExternalSubnetNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAssociateExternalSubnetNumNotIn() {
        return associateExternalSubnetNumNotIn;
    }

    public void setAssociateExternalSubnetNumNotIn(List<Integer> associateExternalSubnetNumNotIn) {
        this.associateExternalSubnetNumNotIn = associateExternalSubnetNumNotIn;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput associateExternalSubnetNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN);
        return this;
    }

    public void setAssociateExternalSubnetNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN);
        }
    }

    public boolean getAssociateExternalSubnetNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM_NOT_IN);
    }

    public VirtualPrivateCloudWhereInput description(String description) {

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

    public VirtualPrivateCloudWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudWhereInput description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionContains(String descriptionContains) {

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

    public VirtualPrivateCloudWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VirtualPrivateCloudWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionGt(String descriptionGt) {

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

    public VirtualPrivateCloudWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionGte(String descriptionGte) {

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

    public VirtualPrivateCloudWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VirtualPrivateCloudWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionLt(String descriptionLt) {

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

    public VirtualPrivateCloudWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionLte(String descriptionLte) {

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

    public VirtualPrivateCloudWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionNot(String descriptionNot) {

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

    public VirtualPrivateCloudWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public VirtualPrivateCloudWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public VirtualPrivateCloudWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VirtualPrivateCloudWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public VirtualPrivateCloudWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VirtualPrivateCloudWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput id(String id) {

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

    public VirtualPrivateCloudWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localId(String localId) {

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

    public VirtualPrivateCloudWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudWhereInput localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdContains(String localIdContains) {

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

    public VirtualPrivateCloudWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VirtualPrivateCloudWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdGt(String localIdGt) {

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

    public VirtualPrivateCloudWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdGte(String localIdGte) {

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

    public VirtualPrivateCloudWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VirtualPrivateCloudWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdLt(String localIdLt) {

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

    public VirtualPrivateCloudWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdLte(String localIdLte) {

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

    public VirtualPrivateCloudWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdNot(String localIdNot) {

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

    public VirtualPrivateCloudWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdNotContains(String localIdNotContains) {

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

    public VirtualPrivateCloudWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VirtualPrivateCloudWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VirtualPrivateCloudWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VirtualPrivateCloudWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VirtualPrivateCloudWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput mtu(Integer mtu) {

        this.mtu = mtu;
        return this;
    }

    /**
     * Get mtu
     *
     * @return mtu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public VirtualPrivateCloudWhereInput mtu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU);
        return this;
    }

    public void setMtu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU);
        }
    }

    public boolean getMtu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU);
    }

    public VirtualPrivateCloudWhereInput mtuGt(Integer mtuGt) {

        this.mtuGt = mtuGt;
        return this;
    }

    /**
     * Get mtuGt
     *
     * @return mtuGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtuGt() {
        return mtuGt;
    }

    public void setMtuGt(Integer mtuGt) {
        this.mtuGt = mtuGt;
    }

    public VirtualPrivateCloudWhereInput mtuGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_GT);
        return this;
    }

    public void setMtuGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_GT);
        }
    }

    public boolean getMtuGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_GT);
    }

    public VirtualPrivateCloudWhereInput mtuGte(Integer mtuGte) {

        this.mtuGte = mtuGte;
        return this;
    }

    /**
     * Get mtuGte
     *
     * @return mtuGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtuGte() {
        return mtuGte;
    }

    public void setMtuGte(Integer mtuGte) {
        this.mtuGte = mtuGte;
    }

    public VirtualPrivateCloudWhereInput mtuGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_GTE);
        return this;
    }

    public void setMtuGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_GTE);
        }
    }

    public boolean getMtuGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_GTE);
    }

    public VirtualPrivateCloudWhereInput mtuIn(List<Integer> mtuIn) {

        this.mtuIn = mtuIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addMtuInItem(Integer mtuInItem) {
        if (this.mtuIn == null) {
            this.mtuIn = new ArrayList<Integer>();
        }
        this.mtuIn.add(mtuInItem);
        return this;
    }

    /**
     * Get mtuIn
     *
     * @return mtuIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMtuIn() {
        return mtuIn;
    }

    public void setMtuIn(List<Integer> mtuIn) {
        this.mtuIn = mtuIn;
    }

    public VirtualPrivateCloudWhereInput mtuIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_IN);
        return this;
    }

    public void setMtuIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_IN);
        }
    }

    public boolean getMtuIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_IN);
    }

    public VirtualPrivateCloudWhereInput mtuLt(Integer mtuLt) {

        this.mtuLt = mtuLt;
        return this;
    }

    /**
     * Get mtuLt
     *
     * @return mtuLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtuLt() {
        return mtuLt;
    }

    public void setMtuLt(Integer mtuLt) {
        this.mtuLt = mtuLt;
    }

    public VirtualPrivateCloudWhereInput mtuLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_LT);
        return this;
    }

    public void setMtuLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_LT);
        }
    }

    public boolean getMtuLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_LT);
    }

    public VirtualPrivateCloudWhereInput mtuLte(Integer mtuLte) {

        this.mtuLte = mtuLte;
        return this;
    }

    /**
     * Get mtuLte
     *
     * @return mtuLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtuLte() {
        return mtuLte;
    }

    public void setMtuLte(Integer mtuLte) {
        this.mtuLte = mtuLte;
    }

    public VirtualPrivateCloudWhereInput mtuLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_LTE);
        return this;
    }

    public void setMtuLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_LTE);
        }
    }

    public boolean getMtuLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_LTE);
    }

    public VirtualPrivateCloudWhereInput mtuNot(Integer mtuNot) {

        this.mtuNot = mtuNot;
        return this;
    }

    /**
     * Get mtuNot
     *
     * @return mtuNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtuNot() {
        return mtuNot;
    }

    public void setMtuNot(Integer mtuNot) {
        this.mtuNot = mtuNot;
    }

    public VirtualPrivateCloudWhereInput mtuNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_NOT);
        return this;
    }

    public void setMtuNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_NOT);
        }
    }

    public boolean getMtuNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_NOT);
    }

    public VirtualPrivateCloudWhereInput mtuNotIn(List<Integer> mtuNotIn) {

        this.mtuNotIn = mtuNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addMtuNotInItem(Integer mtuNotInItem) {
        if (this.mtuNotIn == null) {
            this.mtuNotIn = new ArrayList<Integer>();
        }
        this.mtuNotIn.add(mtuNotInItem);
        return this;
    }

    /**
     * Get mtuNotIn
     *
     * @return mtuNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMtuNotIn() {
        return mtuNotIn;
    }

    public void setMtuNotIn(List<Integer> mtuNotIn) {
        this.mtuNotIn = mtuNotIn;
    }

    public VirtualPrivateCloudWhereInput mtuNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput mtuNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU_NOT_IN);
        return this;
    }

    public void setMtuNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU_NOT_IN);
        }
    }

    public boolean getMtuNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU_NOT_IN);
    }

    public VirtualPrivateCloudWhereInput name(String name) {

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

    public VirtualPrivateCloudWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudWhereInput name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameContains(String nameContains) {

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

    public VirtualPrivateCloudWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameEndsWith(String nameEndsWith) {

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

    public VirtualPrivateCloudWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameGt(String nameGt) {

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

    public VirtualPrivateCloudWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameGte(String nameGte) {

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

    public VirtualPrivateCloudWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addNameInItem(String nameInItem) {
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

    public VirtualPrivateCloudWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameLt(String nameLt) {

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

    public VirtualPrivateCloudWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameLte(String nameLte) {

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

    public VirtualPrivateCloudWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameNot(String nameNot) {

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

    public VirtualPrivateCloudWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameNotContains(String nameNotContains) {

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

    public VirtualPrivateCloudWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VirtualPrivateCloudWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VirtualPrivateCloudWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VirtualPrivateCloudWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VirtualPrivateCloudWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput nameStartsWith(String nameStartsWith) {

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

    public VirtualPrivateCloudWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudWhereInput routeTablesEvery(
            VirtualPrivateCloudRouteTableWhereInput routeTablesEvery) {

        this.routeTablesEvery = routeTablesEvery;
        return this;
    }

    /**
     * Get routeTablesEvery
     *
     * @return routeTablesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteTableWhereInput getRouteTablesEvery() {
        return routeTablesEvery;
    }

    public void setRouteTablesEvery(VirtualPrivateCloudRouteTableWhereInput routeTablesEvery) {
        this.routeTablesEvery = routeTablesEvery;
    }

    public VirtualPrivateCloudWhereInput routeTablesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_EVERY);
        return this;
    }

    public VirtualPrivateCloudWhereInput routeTablesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_EVERY);
        return this;
    }

    public void setRouteTablesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_EVERY);
        }
    }

    public boolean getRouteTablesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLES_EVERY);
    }

    public VirtualPrivateCloudWhereInput routeTablesNone(
            VirtualPrivateCloudRouteTableWhereInput routeTablesNone) {

        this.routeTablesNone = routeTablesNone;
        return this;
    }

    /**
     * Get routeTablesNone
     *
     * @return routeTablesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteTableWhereInput getRouteTablesNone() {
        return routeTablesNone;
    }

    public void setRouteTablesNone(VirtualPrivateCloudRouteTableWhereInput routeTablesNone) {
        this.routeTablesNone = routeTablesNone;
    }

    public VirtualPrivateCloudWhereInput routeTablesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_NONE);
        return this;
    }

    public VirtualPrivateCloudWhereInput routeTablesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_NONE);
        return this;
    }

    public void setRouteTablesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_NONE);
        }
    }

    public boolean getRouteTablesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLES_NONE);
    }

    public VirtualPrivateCloudWhereInput routeTablesSome(
            VirtualPrivateCloudRouteTableWhereInput routeTablesSome) {

        this.routeTablesSome = routeTablesSome;
        return this;
    }

    /**
     * Get routeTablesSome
     *
     * @return routeTablesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteTableWhereInput getRouteTablesSome() {
        return routeTablesSome;
    }

    public void setRouteTablesSome(VirtualPrivateCloudRouteTableWhereInput routeTablesSome) {
        this.routeTablesSome = routeTablesSome;
    }

    public VirtualPrivateCloudWhereInput routeTablesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_SOME);
        return this;
    }

    public VirtualPrivateCloudWhereInput routeTablesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_SOME);
        return this;
    }

    public void setRouteTablesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES_SOME);
        }
    }

    public boolean getRouteTablesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLES_SOME);
    }

    public VirtualPrivateCloudWhereInput securityGroupsEvery(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery) {

        this.securityGroupsEvery = securityGroupsEvery;
        return this;
    }

    /**
     * Get securityGroupsEvery
     *
     * @return securityGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsEvery() {
        return securityGroupsEvery;
    }

    public void setSecurityGroupsEvery(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsEvery) {
        this.securityGroupsEvery = securityGroupsEvery;
    }

    public VirtualPrivateCloudWhereInput securityGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_EVERY);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_EVERY);
        return this;
    }

    public void setSecurityGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_EVERY);
        }
    }

    public boolean getSecurityGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUPS_EVERY);
    }

    public VirtualPrivateCloudWhereInput securityGroupsNone(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone) {

        this.securityGroupsNone = securityGroupsNone;
        return this;
    }

    /**
     * Get securityGroupsNone
     *
     * @return securityGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsNone() {
        return securityGroupsNone;
    }

    public void setSecurityGroupsNone(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsNone) {
        this.securityGroupsNone = securityGroupsNone;
    }

    public VirtualPrivateCloudWhereInput securityGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_NONE);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_NONE);
        return this;
    }

    public void setSecurityGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_NONE);
        }
    }

    public boolean getSecurityGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUPS_NONE);
    }

    public VirtualPrivateCloudWhereInput securityGroupsSome(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome) {

        this.securityGroupsSome = securityGroupsSome;
        return this;
    }

    /**
     * Get securityGroupsSome
     *
     * @return securityGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityGroupWhereInput getSecurityGroupsSome() {
        return securityGroupsSome;
    }

    public void setSecurityGroupsSome(
            VirtualPrivateCloudSecurityGroupWhereInput securityGroupsSome) {
        this.securityGroupsSome = securityGroupsSome;
    }

    public VirtualPrivateCloudWhereInput securityGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_SOME);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_SOME);
        return this;
    }

    public void setSecurityGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS_SOME);
        }
    }

    public boolean getSecurityGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUPS_SOME);
    }

    public VirtualPrivateCloudWhereInput securityPoliciesEvery(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesEvery) {

        this.securityPoliciesEvery = securityPoliciesEvery;
        return this;
    }

    /**
     * Get securityPoliciesEvery
     *
     * @return securityPoliciesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityPolicyWhereInput getSecurityPoliciesEvery() {
        return securityPoliciesEvery;
    }

    public void setSecurityPoliciesEvery(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesEvery) {
        this.securityPoliciesEvery = securityPoliciesEvery;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        return this;
    }

    public void setSecurityPoliciesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        }
    }

    public boolean getSecurityPoliciesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
    }

    public VirtualPrivateCloudWhereInput securityPoliciesNone(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesNone) {

        this.securityPoliciesNone = securityPoliciesNone;
        return this;
    }

    /**
     * Get securityPoliciesNone
     *
     * @return securityPoliciesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityPolicyWhereInput getSecurityPoliciesNone() {
        return securityPoliciesNone;
    }

    public void setSecurityPoliciesNone(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesNone) {
        this.securityPoliciesNone = securityPoliciesNone;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        return this;
    }

    public void setSecurityPoliciesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        }
    }

    public boolean getSecurityPoliciesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
    }

    public VirtualPrivateCloudWhereInput securityPoliciesSome(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesSome) {

        this.securityPoliciesSome = securityPoliciesSome;
        return this;
    }

    /**
     * Get securityPoliciesSome
     *
     * @return securityPoliciesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityPolicyWhereInput getSecurityPoliciesSome() {
        return securityPoliciesSome;
    }

    public void setSecurityPoliciesSome(
            VirtualPrivateCloudSecurityPolicyWhereInput securityPoliciesSome) {
        this.securityPoliciesSome = securityPoliciesSome;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        return this;
    }

    public VirtualPrivateCloudWhereInput securityPoliciesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        return this;
    }

    public void setSecurityPoliciesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        }
    }

    public boolean getSecurityPoliciesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
    }

    public VirtualPrivateCloudWhereInput subnetsEvery(
            VirtualPrivateCloudSubnetWhereInput subnetsEvery) {

        this.subnetsEvery = subnetsEvery;
        return this;
    }

    /**
     * Get subnetsEvery
     *
     * @return subnetsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getSubnetsEvery() {
        return subnetsEvery;
    }

    public void setSubnetsEvery(VirtualPrivateCloudSubnetWhereInput subnetsEvery) {
        this.subnetsEvery = subnetsEvery;
    }

    public VirtualPrivateCloudWhereInput subnetsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETS_EVERY);
        return this;
    }

    public VirtualPrivateCloudWhereInput subnetsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_EVERY);
        return this;
    }

    public void setSubnetsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_EVERY);
        }
    }

    public boolean getSubnetsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETS_EVERY);
    }

    public VirtualPrivateCloudWhereInput subnetsNone(
            VirtualPrivateCloudSubnetWhereInput subnetsNone) {

        this.subnetsNone = subnetsNone;
        return this;
    }

    /**
     * Get subnetsNone
     *
     * @return subnetsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getSubnetsNone() {
        return subnetsNone;
    }

    public void setSubnetsNone(VirtualPrivateCloudSubnetWhereInput subnetsNone) {
        this.subnetsNone = subnetsNone;
    }

    public VirtualPrivateCloudWhereInput subnetsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETS_NONE);
        return this;
    }

    public VirtualPrivateCloudWhereInput subnetsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_NONE);
        return this;
    }

    public void setSubnetsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_NONE);
        }
    }

    public boolean getSubnetsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETS_NONE);
    }

    public VirtualPrivateCloudWhereInput subnetsSome(
            VirtualPrivateCloudSubnetWhereInput subnetsSome) {

        this.subnetsSome = subnetsSome;
        return this;
    }

    /**
     * Get subnetsSome
     *
     * @return subnetsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getSubnetsSome() {
        return subnetsSome;
    }

    public void setSubnetsSome(VirtualPrivateCloudSubnetWhereInput subnetsSome) {
        this.subnetsSome = subnetsSome;
    }

    public VirtualPrivateCloudWhereInput subnetsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETS_SOME);
        return this;
    }

    public VirtualPrivateCloudWhereInput subnetsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_SOME);
        return this;
    }

    public void setSubnetsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETS_SOME);
        }
    }

    public boolean getSubnetsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETS_SOME);
    }

    public VirtualPrivateCloudWhereInput vpcService(
            VirtualPrivateCloudServiceWhereInput vpcService) {

        this.vpcService = vpcService;
        return this;
    }

    /**
     * Get vpcService
     *
     * @return vpcService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudServiceWhereInput getVpcService() {
        return vpcService;
    }

    public void setVpcService(VirtualPrivateCloudServiceWhereInput vpcService) {
        this.vpcService = vpcService;
    }

    public VirtualPrivateCloudWhereInput vpcService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public VirtualPrivateCloudWhereInput vpcService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public void setVpcService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        }
    }

    public boolean getVpcService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SERVICE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudWhereInput virtualPrivateCloudWhereInput =
                (VirtualPrivateCloudWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudWhereInput.OR)
                && Objects.equals(
                        this.associateExternalSubnetNum,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNum)
                && Objects.equals(
                        this.associateExternalSubnetNumGt,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumGt)
                && Objects.equals(
                        this.associateExternalSubnetNumGte,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumGte)
                && Objects.equals(
                        this.associateExternalSubnetNumIn,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumIn)
                && Objects.equals(
                        this.associateExternalSubnetNumLt,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumLt)
                && Objects.equals(
                        this.associateExternalSubnetNumLte,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumLte)
                && Objects.equals(
                        this.associateExternalSubnetNumNot,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumNot)
                && Objects.equals(
                        this.associateExternalSubnetNumNotIn,
                        virtualPrivateCloudWhereInput.associateExternalSubnetNumNotIn)
                && Objects.equals(this.description, virtualPrivateCloudWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, virtualPrivateCloudWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, virtualPrivateCloudWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, virtualPrivateCloudWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, virtualPrivateCloudWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, virtualPrivateCloudWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, virtualPrivateCloudWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, virtualPrivateCloudWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, virtualPrivateCloudWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        virtualPrivateCloudWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        virtualPrivateCloudWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, virtualPrivateCloudWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        virtualPrivateCloudWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        virtualPrivateCloudWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, virtualPrivateCloudWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, virtualPrivateCloudWhereInput.id)
                && Objects.equals(this.idContains, virtualPrivateCloudWhereInput.idContains)
                && Objects.equals(this.idEndsWith, virtualPrivateCloudWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudWhereInput.idNot)
                && Objects.equals(this.idNotContains, virtualPrivateCloudWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, virtualPrivateCloudWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, virtualPrivateCloudWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, virtualPrivateCloudWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, virtualPrivateCloudWhereInput.idStartsWith)
                && Objects.equals(this.localId, virtualPrivateCloudWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, virtualPrivateCloudWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, virtualPrivateCloudWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, virtualPrivateCloudWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, virtualPrivateCloudWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, virtualPrivateCloudWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, virtualPrivateCloudWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, virtualPrivateCloudWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, virtualPrivateCloudWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, virtualPrivateCloudWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, virtualPrivateCloudWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, virtualPrivateCloudWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        virtualPrivateCloudWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, virtualPrivateCloudWhereInput.localIdStartsWith)
                && Objects.equals(this.mtu, virtualPrivateCloudWhereInput.mtu)
                && Objects.equals(this.mtuGt, virtualPrivateCloudWhereInput.mtuGt)
                && Objects.equals(this.mtuGte, virtualPrivateCloudWhereInput.mtuGte)
                && Objects.equals(this.mtuIn, virtualPrivateCloudWhereInput.mtuIn)
                && Objects.equals(this.mtuLt, virtualPrivateCloudWhereInput.mtuLt)
                && Objects.equals(this.mtuLte, virtualPrivateCloudWhereInput.mtuLte)
                && Objects.equals(this.mtuNot, virtualPrivateCloudWhereInput.mtuNot)
                && Objects.equals(this.mtuNotIn, virtualPrivateCloudWhereInput.mtuNotIn)
                && Objects.equals(this.name, virtualPrivateCloudWhereInput.name)
                && Objects.equals(this.nameContains, virtualPrivateCloudWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, virtualPrivateCloudWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, virtualPrivateCloudWhereInput.nameGt)
                && Objects.equals(this.nameGte, virtualPrivateCloudWhereInput.nameGte)
                && Objects.equals(this.nameIn, virtualPrivateCloudWhereInput.nameIn)
                && Objects.equals(this.nameLt, virtualPrivateCloudWhereInput.nameLt)
                && Objects.equals(this.nameLte, virtualPrivateCloudWhereInput.nameLte)
                && Objects.equals(this.nameNot, virtualPrivateCloudWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, virtualPrivateCloudWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, virtualPrivateCloudWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, virtualPrivateCloudWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, virtualPrivateCloudWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, virtualPrivateCloudWhereInput.nameStartsWith)
                && Objects.equals(
                        this.routeTablesEvery, virtualPrivateCloudWhereInput.routeTablesEvery)
                && Objects.equals(
                        this.routeTablesNone, virtualPrivateCloudWhereInput.routeTablesNone)
                && Objects.equals(
                        this.routeTablesSome, virtualPrivateCloudWhereInput.routeTablesSome)
                && Objects.equals(
                        this.securityGroupsEvery, virtualPrivateCloudWhereInput.securityGroupsEvery)
                && Objects.equals(
                        this.securityGroupsNone, virtualPrivateCloudWhereInput.securityGroupsNone)
                && Objects.equals(
                        this.securityGroupsSome, virtualPrivateCloudWhereInput.securityGroupsSome)
                && Objects.equals(
                        this.securityPoliciesEvery,
                        virtualPrivateCloudWhereInput.securityPoliciesEvery)
                && Objects.equals(
                        this.securityPoliciesNone,
                        virtualPrivateCloudWhereInput.securityPoliciesNone)
                && Objects.equals(
                        this.securityPoliciesSome,
                        virtualPrivateCloudWhereInput.securityPoliciesSome)
                && Objects.equals(this.subnetsEvery, virtualPrivateCloudWhereInput.subnetsEvery)
                && Objects.equals(this.subnetsNone, virtualPrivateCloudWhereInput.subnetsNone)
                && Objects.equals(this.subnetsSome, virtualPrivateCloudWhereInput.subnetsSome)
                && Objects.equals(this.vpcService, virtualPrivateCloudWhereInput.vpcService);
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
                associateExternalSubnetNum,
                associateExternalSubnetNumGt,
                associateExternalSubnetNumGte,
                associateExternalSubnetNumIn,
                associateExternalSubnetNumLt,
                associateExternalSubnetNumLte,
                associateExternalSubnetNumNot,
                associateExternalSubnetNumNotIn,
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
                mtu,
                mtuGt,
                mtuGte,
                mtuIn,
                mtuLt,
                mtuLte,
                mtuNot,
                mtuNotIn,
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
                routeTablesEvery,
                routeTablesNone,
                routeTablesSome,
                securityGroupsEvery,
                securityGroupsNone,
                securityGroupsSome,
                securityPoliciesEvery,
                securityPoliciesNone,
                securityPoliciesSome,
                subnetsEvery,
                subnetsNone,
                subnetsSome,
                vpcService);
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
        sb.append("class VirtualPrivateCloudWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    associateExternalSubnetNum: ")
                .append(toIndentedString(associateExternalSubnetNum))
                .append("\n");
        sb.append("    associateExternalSubnetNumGt: ")
                .append(toIndentedString(associateExternalSubnetNumGt))
                .append("\n");
        sb.append("    associateExternalSubnetNumGte: ")
                .append(toIndentedString(associateExternalSubnetNumGte))
                .append("\n");
        sb.append("    associateExternalSubnetNumIn: ")
                .append(toIndentedString(associateExternalSubnetNumIn))
                .append("\n");
        sb.append("    associateExternalSubnetNumLt: ")
                .append(toIndentedString(associateExternalSubnetNumLt))
                .append("\n");
        sb.append("    associateExternalSubnetNumLte: ")
                .append(toIndentedString(associateExternalSubnetNumLte))
                .append("\n");
        sb.append("    associateExternalSubnetNumNot: ")
                .append(toIndentedString(associateExternalSubnetNumNot))
                .append("\n");
        sb.append("    associateExternalSubnetNumNotIn: ")
                .append(toIndentedString(associateExternalSubnetNumNotIn))
                .append("\n");
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
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    mtuGt: ").append(toIndentedString(mtuGt)).append("\n");
        sb.append("    mtuGte: ").append(toIndentedString(mtuGte)).append("\n");
        sb.append("    mtuIn: ").append(toIndentedString(mtuIn)).append("\n");
        sb.append("    mtuLt: ").append(toIndentedString(mtuLt)).append("\n");
        sb.append("    mtuLte: ").append(toIndentedString(mtuLte)).append("\n");
        sb.append("    mtuNot: ").append(toIndentedString(mtuNot)).append("\n");
        sb.append("    mtuNotIn: ").append(toIndentedString(mtuNotIn)).append("\n");
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
        sb.append("    routeTablesEvery: ").append(toIndentedString(routeTablesEvery)).append("\n");
        sb.append("    routeTablesNone: ").append(toIndentedString(routeTablesNone)).append("\n");
        sb.append("    routeTablesSome: ").append(toIndentedString(routeTablesSome)).append("\n");
        sb.append("    securityGroupsEvery: ")
                .append(toIndentedString(securityGroupsEvery))
                .append("\n");
        sb.append("    securityGroupsNone: ")
                .append(toIndentedString(securityGroupsNone))
                .append("\n");
        sb.append("    securityGroupsSome: ")
                .append(toIndentedString(securityGroupsSome))
                .append("\n");
        sb.append("    securityPoliciesEvery: ")
                .append(toIndentedString(securityPoliciesEvery))
                .append("\n");
        sb.append("    securityPoliciesNone: ")
                .append(toIndentedString(securityPoliciesNone))
                .append("\n");
        sb.append("    securityPoliciesSome: ")
                .append(toIndentedString(securityPoliciesSome))
                .append("\n");
        sb.append("    subnetsEvery: ").append(toIndentedString(subnetsEvery)).append("\n");
        sb.append("    subnetsNone: ").append(toIndentedString(subnetsNone)).append("\n");
        sb.append("    subnetsSome: ").append(toIndentedString(subnetsSome)).append("\n");
        sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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
