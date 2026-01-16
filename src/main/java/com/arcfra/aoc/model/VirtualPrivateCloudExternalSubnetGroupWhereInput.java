package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudExternalSubnetGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudExternalSubnetGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudExternalSubnetGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudExternalSubnetGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudExternalSubnetGroupWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUP = "edge_gateway_group";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUP)
    private VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroup;

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

    public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";

    @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
    private Boolean exclusive;

    public static final String SERIALIZED_NAME_EXCLUSIVE_NOT = "exclusive_not";

    @SerializedName(SERIALIZED_NAME_EXCLUSIVE_NOT)
    private Boolean exclusiveNot;

    public static final String SERIALIZED_NAME_FLOATING_IPS_EVERY = "floating_ips_every";

    @SerializedName(SERIALIZED_NAME_FLOATING_IPS_EVERY)
    private VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery;

    public static final String SERIALIZED_NAME_FLOATING_IPS_NONE = "floating_ips_none";

    @SerializedName(SERIALIZED_NAME_FLOATING_IPS_NONE)
    private VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone;

    public static final String SERIALIZED_NAME_FLOATING_IPS_SOME = "floating_ips_some";

    @SerializedName(SERIALIZED_NAME_FLOATING_IPS_SOME)
    private VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome;

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

    public static final String SERIALIZED_NAME_NAT_GATEWAYS_EVERY = "nat_gateways_every";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_EVERY)
    private VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery;

    public static final String SERIALIZED_NAME_NAT_GATEWAYS_NONE = "nat_gateways_none";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_NONE)
    private VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone;

    public static final String SERIALIZED_NAME_NAT_GATEWAYS_SOME = "nat_gateways_some";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS_SOME)
    private VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY = "router_gateways_every";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY)
    private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_NONE = "router_gateways_none";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE)
    private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAYS_SOME = "router_gateways_some";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME)
    private VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome;

    public static final String SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP =
            "shared_in_edge_gateway_group";

    @SerializedName(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP)
    private Boolean sharedInEdgeGatewayGroup;

    public static final String SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT =
            "shared_in_edge_gateway_group_not";

    @SerializedName(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT)
    private Boolean sharedInEdgeGatewayGroupNot;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private VirtualPrivateCloudWhereInput vpc;

    public VirtualPrivateCloudExternalSubnetGroupWhereInput() {}

    public VirtualPrivateCloudExternalSubnetGroupWhereInput AND(
            List<VirtualPrivateCloudExternalSubnetGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addANDItem(
            VirtualPrivateCloudExternalSubnetGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudExternalSubnetGroupWhereInput>();
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
    public List<VirtualPrivateCloudExternalSubnetGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudExternalSubnetGroupWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput NOT(
            List<VirtualPrivateCloudExternalSubnetGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addNOTItem(
            VirtualPrivateCloudExternalSubnetGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudExternalSubnetGroupWhereInput>();
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
    public List<VirtualPrivateCloudExternalSubnetGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudExternalSubnetGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput OR(
            List<VirtualPrivateCloudExternalSubnetGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addORItem(
            VirtualPrivateCloudExternalSubnetGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudExternalSubnetGroupWhereInput>();
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
    public List<VirtualPrivateCloudExternalSubnetGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudExternalSubnetGroupWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput description(String description) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionContains(
            String descriptionContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionEndsWith(
            String descriptionEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGt(String descriptionGt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGte(String descriptionGte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionIn(
            List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addDescriptionInItem(
            String descriptionInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLt(String descriptionLt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLte(String descriptionLte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNot(String descriptionNot) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotContains(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            descriptionNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotEndsWith(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotIn(
            List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addDescriptionNotInItem(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionNotStartsWith(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionStartsWith(
            String descriptionStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            descriptionStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput edgeGatewayGroup(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroup) {

        this.edgeGatewayGroup = edgeGatewayGroup;
        return this;
    }

    /**
     * Get edgeGatewayGroup
     *
     * @return edgeGatewayGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayGroupWhereInput getEdgeGatewayGroup() {
        return edgeGatewayGroup;
    }

    public void setEdgeGatewayGroup(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroup) {
        this.edgeGatewayGroup = edgeGatewayGroup;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput edgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput edgeGatewayGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public void setEdgeGatewayGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        }
    }

    public boolean getEdgeGatewayGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusive(Boolean exclusive) {

        this.exclusive = exclusive;
        return this;
    }

    /**
     * Get exclusive
     *
     * @return exclusive
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE);
        return this;
    }

    public void setExclusive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE);
        }
    }

    public boolean getExclusive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUSIVE);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusiveNot(Boolean exclusiveNot) {

        this.exclusiveNot = exclusiveNot;
        return this;
    }

    /**
     * Get exclusiveNot
     *
     * @return exclusiveNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExclusiveNot() {
        return exclusiveNot;
    }

    public void setExclusiveNot(Boolean exclusiveNot) {
        this.exclusiveNot = exclusiveNot;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusiveNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput exclusiveNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE_NOT);
        return this;
    }

    public void setExclusiveNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE_NOT);
        }
    }

    public boolean getExclusiveNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUSIVE_NOT);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsEvery(
            VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery) {

        this.floatingIpsEvery = floatingIpsEvery;
        return this;
    }

    /**
     * Get floatingIpsEvery
     *
     * @return floatingIpsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsEvery() {
        return floatingIpsEvery;
    }

    public void setFloatingIpsEvery(VirtualPrivateCloudFloatingIpWhereInput floatingIpsEvery) {
        this.floatingIpsEvery = floatingIpsEvery;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_EVERY);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_EVERY);
        return this;
    }

    public void setFloatingIpsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_EVERY);
        }
    }

    public boolean getFloatingIpsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IPS_EVERY);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsNone(
            VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone) {

        this.floatingIpsNone = floatingIpsNone;
        return this;
    }

    /**
     * Get floatingIpsNone
     *
     * @return floatingIpsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsNone() {
        return floatingIpsNone;
    }

    public void setFloatingIpsNone(VirtualPrivateCloudFloatingIpWhereInput floatingIpsNone) {
        this.floatingIpsNone = floatingIpsNone;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_NONE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_NONE);
        return this;
    }

    public void setFloatingIpsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_NONE);
        }
    }

    public boolean getFloatingIpsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IPS_NONE);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsSome(
            VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome) {

        this.floatingIpsSome = floatingIpsSome;
        return this;
    }

    /**
     * Get floatingIpsSome
     *
     * @return floatingIpsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudFloatingIpWhereInput getFloatingIpsSome() {
        return floatingIpsSome;
    }

    public void setFloatingIpsSome(VirtualPrivateCloudFloatingIpWhereInput floatingIpsSome) {
        this.floatingIpsSome = floatingIpsSome;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_SOME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput floatingIpsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_SOME);
        return this;
    }

    public void setFloatingIpsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS_SOME);
        }
    }

    public boolean getFloatingIpsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IPS_SOME);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput id(String id) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotStartsWith(
            String idNotStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localId(String localId) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdContains(
            String localIdContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdEndsWith(
            String localIdEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGt(String localIdGt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGte(String localIdGte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLt(String localIdLt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLte(String localIdLte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNot(String localIdNot) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotContains(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotEndsWith(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotIn(
            List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addLocalIdNotInItem(
            String localIdNotInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotStartsWith(
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            localIdNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdStartsWith(
            String localIdStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput name(String name) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameContains(String nameContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGt(String nameGt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGte(String nameGte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addNameInItem(String nameInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLt(String nameLt) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLte(String nameLte) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNot(String nameNot) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotContains(
            String nameNotContains) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotEndsWith(
            String nameNotEndsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotStartsWith(
            String nameNotStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysEvery(
            VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery) {

        this.natGatewaysEvery = natGatewaysEvery;
        return this;
    }

    /**
     * Get natGatewaysEvery
     *
     * @return natGatewaysEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysEvery() {
        return natGatewaysEvery;
    }

    public void setNatGatewaysEvery(VirtualPrivateCloudNatGatewayWhereInput natGatewaysEvery) {
        this.natGatewaysEvery = natGatewaysEvery;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_EVERY);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_EVERY);
        return this;
    }

    public void setNatGatewaysEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_EVERY);
        }
    }

    public boolean getNatGatewaysEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAYS_EVERY);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysNone(
            VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone) {

        this.natGatewaysNone = natGatewaysNone;
        return this;
    }

    /**
     * Get natGatewaysNone
     *
     * @return natGatewaysNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysNone() {
        return natGatewaysNone;
    }

    public void setNatGatewaysNone(VirtualPrivateCloudNatGatewayWhereInput natGatewaysNone) {
        this.natGatewaysNone = natGatewaysNone;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_NONE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_NONE);
        return this;
    }

    public void setNatGatewaysNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_NONE);
        }
    }

    public boolean getNatGatewaysNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAYS_NONE);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysSome(
            VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome) {

        this.natGatewaysSome = natGatewaysSome;
        return this;
    }

    /**
     * Get natGatewaysSome
     *
     * @return natGatewaysSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudNatGatewayWhereInput getNatGatewaysSome() {
        return natGatewaysSome;
    }

    public void setNatGatewaysSome(VirtualPrivateCloudNatGatewayWhereInput natGatewaysSome) {
        this.natGatewaysSome = natGatewaysSome;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_SOME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput natGatewaysSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_SOME);
        return this;
    }

    public void setNatGatewaysSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS_SOME);
        }
    }

    public boolean getNatGatewaysSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAYS_SOME);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysEvery(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery) {

        this.routerGatewaysEvery = routerGatewaysEvery;
        return this;
    }

    /**
     * Get routerGatewaysEvery
     *
     * @return routerGatewaysEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysEvery() {
        return routerGatewaysEvery;
    }

    public void setRouterGatewaysEvery(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysEvery) {
        this.routerGatewaysEvery = routerGatewaysEvery;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY);
        return this;
    }

    public void setRouterGatewaysEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY);
        }
    }

    public boolean getRouterGatewaysEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAYS_EVERY);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysNone(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone) {

        this.routerGatewaysNone = routerGatewaysNone;
        return this;
    }

    /**
     * Get routerGatewaysNone
     *
     * @return routerGatewaysNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysNone() {
        return routerGatewaysNone;
    }

    public void setRouterGatewaysNone(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysNone) {
        this.routerGatewaysNone = routerGatewaysNone;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE);
        return this;
    }

    public void setRouterGatewaysNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE);
        }
    }

    public boolean getRouterGatewaysNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAYS_NONE);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysSome(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome) {

        this.routerGatewaysSome = routerGatewaysSome;
        return this;
    }

    /**
     * Get routerGatewaysSome
     *
     * @return routerGatewaysSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouterGatewayWhereInput getRouterGatewaysSome() {
        return routerGatewaysSome;
    }

    public void setRouterGatewaysSome(
            VirtualPrivateCloudRouterGatewayWhereInput routerGatewaysSome) {
        this.routerGatewaysSome = routerGatewaysSome;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput routerGatewaysSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME);
        return this;
    }

    public void setRouterGatewaysSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME);
        }
    }

    public boolean getRouterGatewaysSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAYS_SOME);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput sharedInEdgeGatewayGroup(
            Boolean sharedInEdgeGatewayGroup) {

        this.sharedInEdgeGatewayGroup = sharedInEdgeGatewayGroup;
        return this;
    }

    /**
     * Get sharedInEdgeGatewayGroup
     *
     * @return sharedInEdgeGatewayGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSharedInEdgeGatewayGroup() {
        return sharedInEdgeGatewayGroup;
    }

    public void setSharedInEdgeGatewayGroup(Boolean sharedInEdgeGatewayGroup) {
        this.sharedInEdgeGatewayGroup = sharedInEdgeGatewayGroup;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            sharedInEdgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            sharedInEdgeGatewayGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        return this;
    }

    public void setSharedInEdgeGatewayGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        }
    }

    public boolean getSharedInEdgeGatewayGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput sharedInEdgeGatewayGroupNot(
            Boolean sharedInEdgeGatewayGroupNot) {

        this.sharedInEdgeGatewayGroupNot = sharedInEdgeGatewayGroupNot;
        return this;
    }

    /**
     * Get sharedInEdgeGatewayGroupNot
     *
     * @return sharedInEdgeGatewayGroupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSharedInEdgeGatewayGroupNot() {
        return sharedInEdgeGatewayGroupNot;
    }

    public void setSharedInEdgeGatewayGroupNot(Boolean sharedInEdgeGatewayGroupNot) {
        this.sharedInEdgeGatewayGroupNot = sharedInEdgeGatewayGroupNot;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            sharedInEdgeGatewayGroupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput
            sharedInEdgeGatewayGroupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT);
        return this;
    }

    public void setSharedInEdgeGatewayGroupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT);
        }
    }

    public boolean getSharedInEdgeGatewayGroupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP_NOT);
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {

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

    public VirtualPrivateCloudExternalSubnetGroupWhereInput vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroupWhereInput vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudExternalSubnetGroupWhereInput
                virtualPrivateCloudExternalSubnetGroupWhereInput =
                        (VirtualPrivateCloudExternalSubnetGroupWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudExternalSubnetGroupWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudExternalSubnetGroupWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudExternalSubnetGroupWhereInput.OR)
                && Objects.equals(
                        this.description,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.edgeGatewayGroup,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.edgeGatewayGroup)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.exclusive, virtualPrivateCloudExternalSubnetGroupWhereInput.exclusive)
                && Objects.equals(
                        this.exclusiveNot,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.exclusiveNot)
                && Objects.equals(
                        this.floatingIpsEvery,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.floatingIpsEvery)
                && Objects.equals(
                        this.floatingIpsNone,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.floatingIpsNone)
                && Objects.equals(
                        this.floatingIpsSome,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.floatingIpsSome)
                && Objects.equals(this.id, virtualPrivateCloudExternalSubnetGroupWhereInput.id)
                && Objects.equals(
                        this.idContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idContains)
                && Objects.equals(
                        this.idEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudExternalSubnetGroupWhereInput.idGt)
                && Objects.equals(
                        this.idGte, virtualPrivateCloudExternalSubnetGroupWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudExternalSubnetGroupWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudExternalSubnetGroupWhereInput.idLt)
                && Objects.equals(
                        this.idLte, virtualPrivateCloudExternalSubnetGroupWhereInput.idLte)
                && Objects.equals(
                        this.idNot, virtualPrivateCloudExternalSubnetGroupWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idNotEndsWith)
                && Objects.equals(
                        this.idNotIn, virtualPrivateCloudExternalSubnetGroupWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.idStartsWith)
                && Objects.equals(
                        this.localId, virtualPrivateCloudExternalSubnetGroupWhereInput.localId)
                && Objects.equals(
                        this.localIdContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdEndsWith)
                && Objects.equals(
                        this.localIdGt, virtualPrivateCloudExternalSubnetGroupWhereInput.localIdGt)
                && Objects.equals(
                        this.localIdGte,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdGte)
                && Objects.equals(
                        this.localIdIn, virtualPrivateCloudExternalSubnetGroupWhereInput.localIdIn)
                && Objects.equals(
                        this.localIdLt, virtualPrivateCloudExternalSubnetGroupWhereInput.localIdLt)
                && Objects.equals(
                        this.localIdLte,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdLte)
                && Objects.equals(
                        this.localIdNot,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.localIdStartsWith)
                && Objects.equals(this.name, virtualPrivateCloudExternalSubnetGroupWhereInput.name)
                && Objects.equals(
                        this.nameContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameEndsWith)
                && Objects.equals(
                        this.nameGt, virtualPrivateCloudExternalSubnetGroupWhereInput.nameGt)
                && Objects.equals(
                        this.nameGte, virtualPrivateCloudExternalSubnetGroupWhereInput.nameGte)
                && Objects.equals(
                        this.nameIn, virtualPrivateCloudExternalSubnetGroupWhereInput.nameIn)
                && Objects.equals(
                        this.nameLt, virtualPrivateCloudExternalSubnetGroupWhereInput.nameLt)
                && Objects.equals(
                        this.nameLte, virtualPrivateCloudExternalSubnetGroupWhereInput.nameLte)
                && Objects.equals(
                        this.nameNot, virtualPrivateCloudExternalSubnetGroupWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameNotEndsWith)
                && Objects.equals(
                        this.nameNotIn, virtualPrivateCloudExternalSubnetGroupWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.nameStartsWith)
                && Objects.equals(
                        this.natGatewaysEvery,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.natGatewaysEvery)
                && Objects.equals(
                        this.natGatewaysNone,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.natGatewaysNone)
                && Objects.equals(
                        this.natGatewaysSome,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.natGatewaysSome)
                && Objects.equals(
                        this.routerGatewaysEvery,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.routerGatewaysEvery)
                && Objects.equals(
                        this.routerGatewaysNone,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.routerGatewaysNone)
                && Objects.equals(
                        this.routerGatewaysSome,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.routerGatewaysSome)
                && Objects.equals(
                        this.sharedInEdgeGatewayGroup,
                        virtualPrivateCloudExternalSubnetGroupWhereInput.sharedInEdgeGatewayGroup)
                && Objects.equals(
                        this.sharedInEdgeGatewayGroupNot,
                        virtualPrivateCloudExternalSubnetGroupWhereInput
                                .sharedInEdgeGatewayGroupNot)
                && Objects.equals(this.vpc, virtualPrivateCloudExternalSubnetGroupWhereInput.vpc);
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
                edgeGatewayGroup,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                exclusive,
                exclusiveNot,
                floatingIpsEvery,
                floatingIpsNone,
                floatingIpsSome,
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
                natGatewaysEvery,
                natGatewaysNone,
                natGatewaysSome,
                routerGatewaysEvery,
                routerGatewaysNone,
                routerGatewaysSome,
                sharedInEdgeGatewayGroup,
                sharedInEdgeGatewayGroupNot,
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
        sb.append("class VirtualPrivateCloudExternalSubnetGroupWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    edgeGatewayGroup: ").append(toIndentedString(edgeGatewayGroup)).append("\n");
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
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    exclusiveNot: ").append(toIndentedString(exclusiveNot)).append("\n");
        sb.append("    floatingIpsEvery: ").append(toIndentedString(floatingIpsEvery)).append("\n");
        sb.append("    floatingIpsNone: ").append(toIndentedString(floatingIpsNone)).append("\n");
        sb.append("    floatingIpsSome: ").append(toIndentedString(floatingIpsSome)).append("\n");
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
        sb.append("    natGatewaysEvery: ").append(toIndentedString(natGatewaysEvery)).append("\n");
        sb.append("    natGatewaysNone: ").append(toIndentedString(natGatewaysNone)).append("\n");
        sb.append("    natGatewaysSome: ").append(toIndentedString(natGatewaysSome)).append("\n");
        sb.append("    routerGatewaysEvery: ")
                .append(toIndentedString(routerGatewaysEvery))
                .append("\n");
        sb.append("    routerGatewaysNone: ")
                .append(toIndentedString(routerGatewaysNone))
                .append("\n");
        sb.append("    routerGatewaysSome: ")
                .append(toIndentedString(routerGatewaysSome))
                .append("\n");
        sb.append("    sharedInEdgeGatewayGroup: ")
                .append(toIndentedString(sharedInEdgeGatewayGroup))
                .append("\n");
        sb.append("    sharedInEdgeGatewayGroupNot: ")
                .append(toIndentedString(sharedInEdgeGatewayGroupNot))
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
