package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudRouterGatewayWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouterGatewayWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudRouterGatewayWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudRouterGatewayWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudRouterGatewayWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY =
            "associated_subnets_every";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY)
    private VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery;

    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE = "associated_subnets_none";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE)
    private VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone;

    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME = "associated_subnets_some";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME)
    private VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome;

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

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_CONTAINS = "external_ip_contains";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS)
    private String externalIpContains;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH = "external_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH)
    private String externalIpEndsWith;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_GT = "external_ip_gt";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_GT)
    private String externalIpGt;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_GTE = "external_ip_gte";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_GTE)
    private String externalIpGte;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_IN = "external_ip_in";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_IN)
    private List<String> externalIpIn = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_LT = "external_ip_lt";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_LT)
    private String externalIpLt;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_LTE = "external_ip_lte";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_LTE)
    private String externalIpLte;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT = "external_ip_not";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT)
    private String externalIpNot;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS =
            "external_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS)
    private String externalIpNotContains;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH =
            "external_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH)
    private String externalIpNotEndsWith;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_IN = "external_ip_not_in";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN)
    private List<String> externalIpNotIn = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH =
            "external_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH)
    private String externalIpNotStartsWith;

    public static final String SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH = "external_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH)
    private String externalIpStartsWith;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET = "external_subnet";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET)
    private VirtualPrivateCloudExternalSubnetWhereInput externalSubnet;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP = "external_subnet_group";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP)
    private VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroup;

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

    public static final String SERIALIZED_NAME_NEXTHOP_IP = "nexthop_ip";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP)
    private String nexthopIp;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_CONTAINS = "nexthop_ip_contains";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS)
    private String nexthopIpContains;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH = "nexthop_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH)
    private String nexthopIpEndsWith;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_GT = "nexthop_ip_gt";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_GT)
    private String nexthopIpGt;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_GTE = "nexthop_ip_gte";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_GTE)
    private String nexthopIpGte;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_IN = "nexthop_ip_in";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_IN)
    private List<String> nexthopIpIn = null;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_LT = "nexthop_ip_lt";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_LT)
    private String nexthopIpLt;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_LTE = "nexthop_ip_lte";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_LTE)
    private String nexthopIpLte;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT = "nexthop_ip_not";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT)
    private String nexthopIpNot;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS = "nexthop_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS)
    private String nexthopIpNotContains;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH =
            "nexthop_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH)
    private String nexthopIpNotEndsWith;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_IN = "nexthop_ip_not_in";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN)
    private List<String> nexthopIpNotIn = null;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH =
            "nexthop_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH)
    private String nexthopIpNotStartsWith;

    public static final String SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH = "nexthop_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH)
    private String nexthopIpStartsWith;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private VirtualPrivateCloudWhereInput vpc;

    public VirtualPrivateCloudRouterGatewayWhereInput() {}

    public VirtualPrivateCloudRouterGatewayWhereInput AND(
            List<VirtualPrivateCloudRouterGatewayWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addANDItem(
            VirtualPrivateCloudRouterGatewayWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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
    public List<VirtualPrivateCloudRouterGatewayWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudRouterGatewayWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput NOT(
            List<VirtualPrivateCloudRouterGatewayWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addNOTItem(
            VirtualPrivateCloudRouterGatewayWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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
    public List<VirtualPrivateCloudRouterGatewayWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudRouterGatewayWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput OR(
            List<VirtualPrivateCloudRouterGatewayWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addORItem(
            VirtualPrivateCloudRouterGatewayWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudRouterGatewayWhereInput>();
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
    public List<VirtualPrivateCloudRouterGatewayWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudRouterGatewayWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsEvery(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery) {

        this.associatedSubnetsEvery = associatedSubnetsEvery;
        return this;
    }

    /**
     * Get associatedSubnetsEvery
     *
     * @return associatedSubnetsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsEvery() {
        return associatedSubnetsEvery;
    }

    public void setAssociatedSubnetsEvery(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsEvery) {
        this.associatedSubnetsEvery = associatedSubnetsEvery;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY);
        return this;
    }

    public void setAssociatedSubnetsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY);
        }
    }

    public boolean getAssociatedSubnetsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATED_SUBNETS_EVERY);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsNone(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone) {

        this.associatedSubnetsNone = associatedSubnetsNone;
        return this;
    }

    /**
     * Get associatedSubnetsNone
     *
     * @return associatedSubnetsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsNone() {
        return associatedSubnetsNone;
    }

    public void setAssociatedSubnetsNone(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsNone) {
        this.associatedSubnetsNone = associatedSubnetsNone;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE);
        return this;
    }

    public void setAssociatedSubnetsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE);
        }
    }

    public boolean getAssociatedSubnetsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATED_SUBNETS_NONE);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsSome(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome) {

        this.associatedSubnetsSome = associatedSubnetsSome;
        return this;
    }

    /**
     * Get associatedSubnetsSome
     *
     * @return associatedSubnetsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSubnetWhereInput getAssociatedSubnetsSome() {
        return associatedSubnetsSome;
    }

    public void setAssociatedSubnetsSome(
            VirtualPrivateCloudSubnetWhereInput associatedSubnetsSome) {
        this.associatedSubnetsSome = associatedSubnetsSome;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput associatedSubnetsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME);
        return this;
    }

    public void setAssociatedSubnetsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME);
        }
    }

    public boolean getAssociatedSubnetsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATED_SUBNETS_SOME);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput externalIp(String externalIp) {

        this.externalIp = externalIp;
        return this;
    }

    /**
     * Get externalIp
     *
     * @return externalIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public void setExternalIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        }
    }

    public boolean getExternalIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpContains(
            String externalIpContains) {

        this.externalIpContains = externalIpContains;
        return this;
    }

    /**
     * Get externalIpContains
     *
     * @return externalIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpContains() {
        return externalIpContains;
    }

    public void setExternalIpContains(String externalIpContains) {
        this.externalIpContains = externalIpContains;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS);
        return this;
    }

    public void setExternalIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS);
        }
    }

    public boolean getExternalIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_CONTAINS);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpEndsWith(
            String externalIpEndsWith) {

        this.externalIpEndsWith = externalIpEndsWith;
        return this;
    }

    /**
     * Get externalIpEndsWith
     *
     * @return externalIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpEndsWith() {
        return externalIpEndsWith;
    }

    public void setExternalIpEndsWith(String externalIpEndsWith) {
        this.externalIpEndsWith = externalIpEndsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH);
        return this;
    }

    public void setExternalIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH);
        }
    }

    public boolean getExternalIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_ENDS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGt(String externalIpGt) {

        this.externalIpGt = externalIpGt;
        return this;
    }

    /**
     * Get externalIpGt
     *
     * @return externalIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpGt() {
        return externalIpGt;
    }

    public void setExternalIpGt(String externalIpGt) {
        this.externalIpGt = externalIpGt;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_GT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_GT);
        return this;
    }

    public void setExternalIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_GT);
        }
    }

    public boolean getExternalIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_GT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGte(String externalIpGte) {

        this.externalIpGte = externalIpGte;
        return this;
    }

    /**
     * Get externalIpGte
     *
     * @return externalIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpGte() {
        return externalIpGte;
    }

    public void setExternalIpGte(String externalIpGte) {
        this.externalIpGte = externalIpGte;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_GTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_GTE);
        return this;
    }

    public void setExternalIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_GTE);
        }
    }

    public boolean getExternalIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_GTE);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpIn(List<String> externalIpIn) {

        this.externalIpIn = externalIpIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addExternalIpInItem(String externalIpInItem) {
        if (this.externalIpIn == null) {
            this.externalIpIn = new ArrayList<String>();
        }
        this.externalIpIn.add(externalIpInItem);
        return this;
    }

    /**
     * Get externalIpIn
     *
     * @return externalIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExternalIpIn() {
        return externalIpIn;
    }

    public void setExternalIpIn(List<String> externalIpIn) {
        this.externalIpIn = externalIpIn;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_IN);
        return this;
    }

    public void setExternalIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_IN);
        }
    }

    public boolean getExternalIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_IN);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLt(String externalIpLt) {

        this.externalIpLt = externalIpLt;
        return this;
    }

    /**
     * Get externalIpLt
     *
     * @return externalIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpLt() {
        return externalIpLt;
    }

    public void setExternalIpLt(String externalIpLt) {
        this.externalIpLt = externalIpLt;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_LT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_LT);
        return this;
    }

    public void setExternalIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_LT);
        }
    }

    public boolean getExternalIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_LT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLte(String externalIpLte) {

        this.externalIpLte = externalIpLte;
        return this;
    }

    /**
     * Get externalIpLte
     *
     * @return externalIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpLte() {
        return externalIpLte;
    }

    public void setExternalIpLte(String externalIpLte) {
        this.externalIpLte = externalIpLte;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_LTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_LTE);
        return this;
    }

    public void setExternalIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_LTE);
        }
    }

    public boolean getExternalIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_LTE);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNot(String externalIpNot) {

        this.externalIpNot = externalIpNot;
        return this;
    }

    /**
     * Get externalIpNot
     *
     * @return externalIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpNot() {
        return externalIpNot;
    }

    public void setExternalIpNot(String externalIpNot) {
        this.externalIpNot = externalIpNot;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT);
        return this;
    }

    public void setExternalIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT);
        }
    }

    public boolean getExternalIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_NOT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotContains(
            String externalIpNotContains) {

        this.externalIpNotContains = externalIpNotContains;
        return this;
    }

    /**
     * Get externalIpNotContains
     *
     * @return externalIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpNotContains() {
        return externalIpNotContains;
    }

    public void setExternalIpNotContains(String externalIpNotContains) {
        this.externalIpNotContains = externalIpNotContains;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS);
        return this;
    }

    public void setExternalIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS);
        }
    }

    public boolean getExternalIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_NOT_CONTAINS);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotEndsWith(
            String externalIpNotEndsWith) {

        this.externalIpNotEndsWith = externalIpNotEndsWith;
        return this;
    }

    /**
     * Get externalIpNotEndsWith
     *
     * @return externalIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpNotEndsWith() {
        return externalIpNotEndsWith;
    }

    public void setExternalIpNotEndsWith(String externalIpNotEndsWith) {
        this.externalIpNotEndsWith = externalIpNotEndsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setExternalIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getExternalIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotIn(
            List<String> externalIpNotIn) {

        this.externalIpNotIn = externalIpNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addExternalIpNotInItem(
            String externalIpNotInItem) {
        if (this.externalIpNotIn == null) {
            this.externalIpNotIn = new ArrayList<String>();
        }
        this.externalIpNotIn.add(externalIpNotInItem);
        return this;
    }

    /**
     * Get externalIpNotIn
     *
     * @return externalIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExternalIpNotIn() {
        return externalIpNotIn;
    }

    public void setExternalIpNotIn(List<String> externalIpNotIn) {
        this.externalIpNotIn = externalIpNotIn;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN);
        return this;
    }

    public void setExternalIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN);
        }
    }

    public boolean getExternalIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_NOT_IN);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotStartsWith(
            String externalIpNotStartsWith) {

        this.externalIpNotStartsWith = externalIpNotStartsWith;
        return this;
    }

    /**
     * Get externalIpNotStartsWith
     *
     * @return externalIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpNotStartsWith() {
        return externalIpNotStartsWith;
    }

    public void setExternalIpNotStartsWith(String externalIpNotStartsWith) {
        this.externalIpNotStartsWith = externalIpNotStartsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setExternalIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getExternalIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpStartsWith(
            String externalIpStartsWith) {

        this.externalIpStartsWith = externalIpStartsWith;
        return this;
    }

    /**
     * Get externalIpStartsWith
     *
     * @return externalIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIpStartsWith() {
        return externalIpStartsWith;
    }

    public void setExternalIpStartsWith(String externalIpStartsWith) {
        this.externalIpStartsWith = externalIpStartsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH);
        return this;
    }

    public void setExternalIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH);
        }
    }

    public boolean getExternalIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP_STARTS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnet(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnet) {

        this.externalSubnet = externalSubnet;
        return this;
    }

    /**
     * Get externalSubnet
     *
     * @return externalSubnet
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudExternalSubnetWhereInput getExternalSubnet() {
        return externalSubnet;
    }

    public void setExternalSubnet(VirtualPrivateCloudExternalSubnetWhereInput externalSubnet) {
        this.externalSubnet = externalSubnet;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnet_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnet_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public void setExternalSubnet_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        }
    }

    public boolean getExternalSubnet_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnetGroup(
            VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroup) {

        this.externalSubnetGroup = externalSubnetGroup;
        return this;
    }

    /**
     * Get externalSubnetGroup
     *
     * @return externalSubnetGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudExternalSubnetGroupWhereInput getExternalSubnetGroup() {
        return externalSubnetGroup;
    }

    public void setExternalSubnetGroup(
            VirtualPrivateCloudExternalSubnetGroupWhereInput externalSubnetGroup) {
        this.externalSubnetGroup = externalSubnetGroup;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnetGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput externalSubnetGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public void setExternalSubnetGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        }
    }

    public boolean getExternalSubnetGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput id(String id) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localId(String localId) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdContains(String localIdContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGt(String localIdGt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGte(String localIdGte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLt(String localIdLt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLte(String localIdLte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNot(String localIdNot) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotContains(
            String localIdNotContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotEndsWith(
            String localIdNotEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotStartsWith(
            String localIdNotStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput name(String name) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameContains(String nameContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameEndsWith(String nameEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameGt(String nameGt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameGte(String nameGte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addNameInItem(String nameInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameLt(String nameLt) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameLte(String nameLte) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNot(String nameNot) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotContains(String nameNotContains) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nameStartsWith(String nameStartsWith) {

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

    public VirtualPrivateCloudRouterGatewayWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIp(String nexthopIp) {

        this.nexthopIp = nexthopIp;
        return this;
    }

    /**
     * Get nexthopIp
     *
     * @return nexthopIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIp() {
        return nexthopIp;
    }

    public void setNexthopIp(String nexthopIp) {
        this.nexthopIp = nexthopIp;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP);
        return this;
    }

    public void setNexthopIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP);
        }
    }

    public boolean getNexthopIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpContains(String nexthopIpContains) {

        this.nexthopIpContains = nexthopIpContains;
        return this;
    }

    /**
     * Get nexthopIpContains
     *
     * @return nexthopIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpContains() {
        return nexthopIpContains;
    }

    public void setNexthopIpContains(String nexthopIpContains) {
        this.nexthopIpContains = nexthopIpContains;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS);
        return this;
    }

    public void setNexthopIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS);
        }
    }

    public boolean getNexthopIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_CONTAINS);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpEndsWith(String nexthopIpEndsWith) {

        this.nexthopIpEndsWith = nexthopIpEndsWith;
        return this;
    }

    /**
     * Get nexthopIpEndsWith
     *
     * @return nexthopIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpEndsWith() {
        return nexthopIpEndsWith;
    }

    public void setNexthopIpEndsWith(String nexthopIpEndsWith) {
        this.nexthopIpEndsWith = nexthopIpEndsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH);
        return this;
    }

    public void setNexthopIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH);
        }
    }

    public boolean getNexthopIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_ENDS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGt(String nexthopIpGt) {

        this.nexthopIpGt = nexthopIpGt;
        return this;
    }

    /**
     * Get nexthopIpGt
     *
     * @return nexthopIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpGt() {
        return nexthopIpGt;
    }

    public void setNexthopIpGt(String nexthopIpGt) {
        this.nexthopIpGt = nexthopIpGt;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_GT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_GT);
        return this;
    }

    public void setNexthopIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_GT);
        }
    }

    public boolean getNexthopIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_GT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGte(String nexthopIpGte) {

        this.nexthopIpGte = nexthopIpGte;
        return this;
    }

    /**
     * Get nexthopIpGte
     *
     * @return nexthopIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpGte() {
        return nexthopIpGte;
    }

    public void setNexthopIpGte(String nexthopIpGte) {
        this.nexthopIpGte = nexthopIpGte;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_GTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_GTE);
        return this;
    }

    public void setNexthopIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_GTE);
        }
    }

    public boolean getNexthopIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_GTE);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpIn(List<String> nexthopIpIn) {

        this.nexthopIpIn = nexthopIpIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addNexthopIpInItem(String nexthopIpInItem) {
        if (this.nexthopIpIn == null) {
            this.nexthopIpIn = new ArrayList<String>();
        }
        this.nexthopIpIn.add(nexthopIpInItem);
        return this;
    }

    /**
     * Get nexthopIpIn
     *
     * @return nexthopIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNexthopIpIn() {
        return nexthopIpIn;
    }

    public void setNexthopIpIn(List<String> nexthopIpIn) {
        this.nexthopIpIn = nexthopIpIn;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_IN);
        return this;
    }

    public void setNexthopIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_IN);
        }
    }

    public boolean getNexthopIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_IN);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLt(String nexthopIpLt) {

        this.nexthopIpLt = nexthopIpLt;
        return this;
    }

    /**
     * Get nexthopIpLt
     *
     * @return nexthopIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpLt() {
        return nexthopIpLt;
    }

    public void setNexthopIpLt(String nexthopIpLt) {
        this.nexthopIpLt = nexthopIpLt;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_LT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_LT);
        return this;
    }

    public void setNexthopIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_LT);
        }
    }

    public boolean getNexthopIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_LT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLte(String nexthopIpLte) {

        this.nexthopIpLte = nexthopIpLte;
        return this;
    }

    /**
     * Get nexthopIpLte
     *
     * @return nexthopIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpLte() {
        return nexthopIpLte;
    }

    public void setNexthopIpLte(String nexthopIpLte) {
        this.nexthopIpLte = nexthopIpLte;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_LTE);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_LTE);
        return this;
    }

    public void setNexthopIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_LTE);
        }
    }

    public boolean getNexthopIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_LTE);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNot(String nexthopIpNot) {

        this.nexthopIpNot = nexthopIpNot;
        return this;
    }

    /**
     * Get nexthopIpNot
     *
     * @return nexthopIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpNot() {
        return nexthopIpNot;
    }

    public void setNexthopIpNot(String nexthopIpNot) {
        this.nexthopIpNot = nexthopIpNot;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT);
        return this;
    }

    public void setNexthopIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT);
        }
    }

    public boolean getNexthopIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_NOT);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotContains(
            String nexthopIpNotContains) {

        this.nexthopIpNotContains = nexthopIpNotContains;
        return this;
    }

    /**
     * Get nexthopIpNotContains
     *
     * @return nexthopIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpNotContains() {
        return nexthopIpNotContains;
    }

    public void setNexthopIpNotContains(String nexthopIpNotContains) {
        this.nexthopIpNotContains = nexthopIpNotContains;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS);
        return this;
    }

    public void setNexthopIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS);
        }
    }

    public boolean getNexthopIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_NOT_CONTAINS);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotEndsWith(
            String nexthopIpNotEndsWith) {

        this.nexthopIpNotEndsWith = nexthopIpNotEndsWith;
        return this;
    }

    /**
     * Get nexthopIpNotEndsWith
     *
     * @return nexthopIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpNotEndsWith() {
        return nexthopIpNotEndsWith;
    }

    public void setNexthopIpNotEndsWith(String nexthopIpNotEndsWith) {
        this.nexthopIpNotEndsWith = nexthopIpNotEndsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setNexthopIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getNexthopIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotIn(List<String> nexthopIpNotIn) {

        this.nexthopIpNotIn = nexthopIpNotIn;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput addNexthopIpNotInItem(
            String nexthopIpNotInItem) {
        if (this.nexthopIpNotIn == null) {
            this.nexthopIpNotIn = new ArrayList<String>();
        }
        this.nexthopIpNotIn.add(nexthopIpNotInItem);
        return this;
    }

    /**
     * Get nexthopIpNotIn
     *
     * @return nexthopIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNexthopIpNotIn() {
        return nexthopIpNotIn;
    }

    public void setNexthopIpNotIn(List<String> nexthopIpNotIn) {
        this.nexthopIpNotIn = nexthopIpNotIn;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN);
        return this;
    }

    public void setNexthopIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN);
        }
    }

    public boolean getNexthopIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_NOT_IN);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotStartsWith(
            String nexthopIpNotStartsWith) {

        this.nexthopIpNotStartsWith = nexthopIpNotStartsWith;
        return this;
    }

    /**
     * Get nexthopIpNotStartsWith
     *
     * @return nexthopIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpNotStartsWith() {
        return nexthopIpNotStartsWith;
    }

    public void setNexthopIpNotStartsWith(String nexthopIpNotStartsWith) {
        this.nexthopIpNotStartsWith = nexthopIpNotStartsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setNexthopIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getNexthopIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpStartsWith(
            String nexthopIpStartsWith) {

        this.nexthopIpStartsWith = nexthopIpStartsWith;
        return this;
    }

    /**
     * Get nexthopIpStartsWith
     *
     * @return nexthopIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIpStartsWith() {
        return nexthopIpStartsWith;
    }

    public void setNexthopIpStartsWith(String nexthopIpStartsWith) {
        this.nexthopIpStartsWith = nexthopIpStartsWith;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput nexthopIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH);
        return this;
    }

    public void setNexthopIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH);
        }
    }

    public boolean getNexthopIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP_STARTS_WITH);
    }

    public VirtualPrivateCloudRouterGatewayWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudWhereInput getVpc() {
        return vpc;
    }

    public void setVpc(VirtualPrivateCloudWhereInput vpc) {
        this.vpc = vpc;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayWhereInput vpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC);
        return this;
    }

    public void setVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC);
        }
    }

    public boolean getVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouterGatewayWhereInput virtualPrivateCloudRouterGatewayWhereInput =
                (VirtualPrivateCloudRouterGatewayWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudRouterGatewayWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudRouterGatewayWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudRouterGatewayWhereInput.OR)
                && Objects.equals(
                        this.associatedSubnetsEvery,
                        virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsEvery)
                && Objects.equals(
                        this.associatedSubnetsNone,
                        virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsNone)
                && Objects.equals(
                        this.associatedSubnetsSome,
                        virtualPrivateCloudRouterGatewayWhereInput.associatedSubnetsSome)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudRouterGatewayWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.externalIp, virtualPrivateCloudRouterGatewayWhereInput.externalIp)
                && Objects.equals(
                        this.externalIpContains,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpContains)
                && Objects.equals(
                        this.externalIpEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpEndsWith)
                && Objects.equals(
                        this.externalIpGt, virtualPrivateCloudRouterGatewayWhereInput.externalIpGt)
                && Objects.equals(
                        this.externalIpGte,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpGte)
                && Objects.equals(
                        this.externalIpIn, virtualPrivateCloudRouterGatewayWhereInput.externalIpIn)
                && Objects.equals(
                        this.externalIpLt, virtualPrivateCloudRouterGatewayWhereInput.externalIpLt)
                && Objects.equals(
                        this.externalIpLte,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpLte)
                && Objects.equals(
                        this.externalIpNot,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpNot)
                && Objects.equals(
                        this.externalIpNotContains,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpNotContains)
                && Objects.equals(
                        this.externalIpNotEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpNotEndsWith)
                && Objects.equals(
                        this.externalIpNotIn,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpNotIn)
                && Objects.equals(
                        this.externalIpNotStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpNotStartsWith)
                && Objects.equals(
                        this.externalIpStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.externalIpStartsWith)
                && Objects.equals(
                        this.externalSubnet,
                        virtualPrivateCloudRouterGatewayWhereInput.externalSubnet)
                && Objects.equals(
                        this.externalSubnetGroup,
                        virtualPrivateCloudRouterGatewayWhereInput.externalSubnetGroup)
                && Objects.equals(this.id, virtualPrivateCloudRouterGatewayWhereInput.id)
                && Objects.equals(
                        this.idContains, virtualPrivateCloudRouterGatewayWhereInput.idContains)
                && Objects.equals(
                        this.idEndsWith, virtualPrivateCloudRouterGatewayWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudRouterGatewayWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudRouterGatewayWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudRouterGatewayWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudRouterGatewayWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudRouterGatewayWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudRouterGatewayWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains,
                        virtualPrivateCloudRouterGatewayWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, virtualPrivateCloudRouterGatewayWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, virtualPrivateCloudRouterGatewayWhereInput.idStartsWith)
                && Objects.equals(this.localId, virtualPrivateCloudRouterGatewayWhereInput.localId)
                && Objects.equals(
                        this.localIdContains,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdEndsWith)
                && Objects.equals(
                        this.localIdGt, virtualPrivateCloudRouterGatewayWhereInput.localIdGt)
                && Objects.equals(
                        this.localIdGte, virtualPrivateCloudRouterGatewayWhereInput.localIdGte)
                && Objects.equals(
                        this.localIdIn, virtualPrivateCloudRouterGatewayWhereInput.localIdIn)
                && Objects.equals(
                        this.localIdLt, virtualPrivateCloudRouterGatewayWhereInput.localIdLt)
                && Objects.equals(
                        this.localIdLte, virtualPrivateCloudRouterGatewayWhereInput.localIdLte)
                && Objects.equals(
                        this.localIdNot, virtualPrivateCloudRouterGatewayWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, virtualPrivateCloudRouterGatewayWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.localIdStartsWith)
                && Objects.equals(this.name, virtualPrivateCloudRouterGatewayWhereInput.name)
                && Objects.equals(
                        this.nameContains, virtualPrivateCloudRouterGatewayWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith, virtualPrivateCloudRouterGatewayWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, virtualPrivateCloudRouterGatewayWhereInput.nameGt)
                && Objects.equals(this.nameGte, virtualPrivateCloudRouterGatewayWhereInput.nameGte)
                && Objects.equals(this.nameIn, virtualPrivateCloudRouterGatewayWhereInput.nameIn)
                && Objects.equals(this.nameLt, virtualPrivateCloudRouterGatewayWhereInput.nameLt)
                && Objects.equals(this.nameLte, virtualPrivateCloudRouterGatewayWhereInput.nameLte)
                && Objects.equals(this.nameNot, virtualPrivateCloudRouterGatewayWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains,
                        virtualPrivateCloudRouterGatewayWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nameNotEndsWith)
                && Objects.equals(
                        this.nameNotIn, virtualPrivateCloudRouterGatewayWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nameStartsWith)
                && Objects.equals(
                        this.nexthopIp, virtualPrivateCloudRouterGatewayWhereInput.nexthopIp)
                && Objects.equals(
                        this.nexthopIpContains,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpContains)
                && Objects.equals(
                        this.nexthopIpEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpEndsWith)
                && Objects.equals(
                        this.nexthopIpGt, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpGt)
                && Objects.equals(
                        this.nexthopIpGte, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpGte)
                && Objects.equals(
                        this.nexthopIpIn, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpIn)
                && Objects.equals(
                        this.nexthopIpLt, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpLt)
                && Objects.equals(
                        this.nexthopIpLte, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpLte)
                && Objects.equals(
                        this.nexthopIpNot, virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNot)
                && Objects.equals(
                        this.nexthopIpNotContains,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotContains)
                && Objects.equals(
                        this.nexthopIpNotEndsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotEndsWith)
                && Objects.equals(
                        this.nexthopIpNotIn,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotIn)
                && Objects.equals(
                        this.nexthopIpNotStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpNotStartsWith)
                && Objects.equals(
                        this.nexthopIpStartsWith,
                        virtualPrivateCloudRouterGatewayWhereInput.nexthopIpStartsWith)
                && Objects.equals(this.vpc, virtualPrivateCloudRouterGatewayWhereInput.vpc);
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
                associatedSubnetsEvery,
                associatedSubnetsNone,
                associatedSubnetsSome,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                externalIp,
                externalIpContains,
                externalIpEndsWith,
                externalIpGt,
                externalIpGte,
                externalIpIn,
                externalIpLt,
                externalIpLte,
                externalIpNot,
                externalIpNotContains,
                externalIpNotEndsWith,
                externalIpNotIn,
                externalIpNotStartsWith,
                externalIpStartsWith,
                externalSubnet,
                externalSubnetGroup,
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
                nexthopIp,
                nexthopIpContains,
                nexthopIpEndsWith,
                nexthopIpGt,
                nexthopIpGte,
                nexthopIpIn,
                nexthopIpLt,
                nexthopIpLte,
                nexthopIpNot,
                nexthopIpNotContains,
                nexthopIpNotEndsWith,
                nexthopIpNotIn,
                nexthopIpNotStartsWith,
                nexthopIpStartsWith,
                vpc);
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
        sb.append("class VirtualPrivateCloudRouterGatewayWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    associatedSubnetsEvery: ")
                .append(toIndentedString(associatedSubnetsEvery))
                .append("\n");
        sb.append("    associatedSubnetsNone: ")
                .append(toIndentedString(associatedSubnetsNone))
                .append("\n");
        sb.append("    associatedSubnetsSome: ")
                .append(toIndentedString(associatedSubnetsSome))
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
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalIpContains: ")
                .append(toIndentedString(externalIpContains))
                .append("\n");
        sb.append("    externalIpEndsWith: ")
                .append(toIndentedString(externalIpEndsWith))
                .append("\n");
        sb.append("    externalIpGt: ").append(toIndentedString(externalIpGt)).append("\n");
        sb.append("    externalIpGte: ").append(toIndentedString(externalIpGte)).append("\n");
        sb.append("    externalIpIn: ").append(toIndentedString(externalIpIn)).append("\n");
        sb.append("    externalIpLt: ").append(toIndentedString(externalIpLt)).append("\n");
        sb.append("    externalIpLte: ").append(toIndentedString(externalIpLte)).append("\n");
        sb.append("    externalIpNot: ").append(toIndentedString(externalIpNot)).append("\n");
        sb.append("    externalIpNotContains: ")
                .append(toIndentedString(externalIpNotContains))
                .append("\n");
        sb.append("    externalIpNotEndsWith: ")
                .append(toIndentedString(externalIpNotEndsWith))
                .append("\n");
        sb.append("    externalIpNotIn: ").append(toIndentedString(externalIpNotIn)).append("\n");
        sb.append("    externalIpNotStartsWith: ")
                .append(toIndentedString(externalIpNotStartsWith))
                .append("\n");
        sb.append("    externalIpStartsWith: ")
                .append(toIndentedString(externalIpStartsWith))
                .append("\n");
        sb.append("    externalSubnet: ").append(toIndentedString(externalSubnet)).append("\n");
        sb.append("    externalSubnetGroup: ")
                .append(toIndentedString(externalSubnetGroup))
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
        sb.append("    nexthopIp: ").append(toIndentedString(nexthopIp)).append("\n");
        sb.append("    nexthopIpContains: ")
                .append(toIndentedString(nexthopIpContains))
                .append("\n");
        sb.append("    nexthopIpEndsWith: ")
                .append(toIndentedString(nexthopIpEndsWith))
                .append("\n");
        sb.append("    nexthopIpGt: ").append(toIndentedString(nexthopIpGt)).append("\n");
        sb.append("    nexthopIpGte: ").append(toIndentedString(nexthopIpGte)).append("\n");
        sb.append("    nexthopIpIn: ").append(toIndentedString(nexthopIpIn)).append("\n");
        sb.append("    nexthopIpLt: ").append(toIndentedString(nexthopIpLt)).append("\n");
        sb.append("    nexthopIpLte: ").append(toIndentedString(nexthopIpLte)).append("\n");
        sb.append("    nexthopIpNot: ").append(toIndentedString(nexthopIpNot)).append("\n");
        sb.append("    nexthopIpNotContains: ")
                .append(toIndentedString(nexthopIpNotContains))
                .append("\n");
        sb.append("    nexthopIpNotEndsWith: ")
                .append(toIndentedString(nexthopIpNotEndsWith))
                .append("\n");
        sb.append("    nexthopIpNotIn: ").append(toIndentedString(nexthopIpNotIn)).append("\n");
        sb.append("    nexthopIpNotStartsWith: ")
                .append(toIndentedString(nexthopIpNotStartsWith))
                .append("\n");
        sb.append("    nexthopIpStartsWith: ")
                .append(toIndentedString(nexthopIpStartsWith))
                .append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
