package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudRouteWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouteWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudRouteWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudRouteWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudRouteWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DESTINATION = "destination";

    @SerializedName(SERIALIZED_NAME_DESTINATION)
    private String destination;

    public static final String SERIALIZED_NAME_DESTINATION_CONTAINS = "destination_contains";

    @SerializedName(SERIALIZED_NAME_DESTINATION_CONTAINS)
    private String destinationContains;

    public static final String SERIALIZED_NAME_DESTINATION_ENDS_WITH = "destination_ends_with";

    @SerializedName(SERIALIZED_NAME_DESTINATION_ENDS_WITH)
    private String destinationEndsWith;

    public static final String SERIALIZED_NAME_DESTINATION_GT = "destination_gt";

    @SerializedName(SERIALIZED_NAME_DESTINATION_GT)
    private String destinationGt;

    public static final String SERIALIZED_NAME_DESTINATION_GTE = "destination_gte";

    @SerializedName(SERIALIZED_NAME_DESTINATION_GTE)
    private String destinationGte;

    public static final String SERIALIZED_NAME_DESTINATION_IN = "destination_in";

    @SerializedName(SERIALIZED_NAME_DESTINATION_IN)
    private List<String> destinationIn = null;

    public static final String SERIALIZED_NAME_DESTINATION_LT = "destination_lt";

    @SerializedName(SERIALIZED_NAME_DESTINATION_LT)
    private String destinationLt;

    public static final String SERIALIZED_NAME_DESTINATION_LTE = "destination_lte";

    @SerializedName(SERIALIZED_NAME_DESTINATION_LTE)
    private String destinationLte;

    public static final String SERIALIZED_NAME_DESTINATION_NOT = "destination_not";

    @SerializedName(SERIALIZED_NAME_DESTINATION_NOT)
    private String destinationNot;

    public static final String SERIALIZED_NAME_DESTINATION_NOT_CONTAINS =
            "destination_not_contains";

    @SerializedName(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS)
    private String destinationNotContains;

    public static final String SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH =
            "destination_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH)
    private String destinationNotEndsWith;

    public static final String SERIALIZED_NAME_DESTINATION_NOT_IN = "destination_not_in";

    @SerializedName(SERIALIZED_NAME_DESTINATION_NOT_IN)
    private List<String> destinationNotIn = null;

    public static final String SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH =
            "destination_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH)
    private String destinationNotStartsWith;

    public static final String SERIALIZED_NAME_DESTINATION_STARTS_WITH = "destination_starts_with";

    @SerializedName(SERIALIZED_NAME_DESTINATION_STARTS_WITH)
    private String destinationStartsWith;

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

    public static final String SERIALIZED_NAME_NAT_GATEWAY = "nat_gateway";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAY)
    private VirtualPrivateCloudNatGatewayWhereInput natGateway;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID = "next_hop_local_id";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID)
    private String nextHopLocalId;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS =
            "next_hop_local_id_contains";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS)
    private String nextHopLocalIdContains;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH =
            "next_hop_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH)
    private String nextHopLocalIdEndsWith;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT = "next_hop_local_id_gt";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT)
    private String nextHopLocalIdGt;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE = "next_hop_local_id_gte";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE)
    private String nextHopLocalIdGte;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN = "next_hop_local_id_in";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN)
    private List<String> nextHopLocalIdIn = null;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT = "next_hop_local_id_lt";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT)
    private String nextHopLocalIdLt;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE = "next_hop_local_id_lte";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE)
    private String nextHopLocalIdLte;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT = "next_hop_local_id_not";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT)
    private String nextHopLocalIdNot;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS =
            "next_hop_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS)
    private String nextHopLocalIdNotContains;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH =
            "next_hop_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH)
    private String nextHopLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN =
            "next_hop_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN)
    private List<String> nextHopLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH =
            "next_hop_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH)
    private String nextHopLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH =
            "next_hop_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH)
    private String nextHopLocalIdStartsWith;

    public static final String SERIALIZED_NAME_NEXT_HOP_TYPE = "next_hop_type";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_TYPE)
    private VirtualPrivateCloudRouteNextHopType nextHopType;

    public static final String SERIALIZED_NAME_NEXT_HOP_TYPE_IN = "next_hop_type_in";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_TYPE_IN)
    private List<VirtualPrivateCloudRouteNextHopType> nextHopTypeIn = null;

    public static final String SERIALIZED_NAME_NEXT_HOP_TYPE_NOT = "next_hop_type_not";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT)
    private VirtualPrivateCloudRouteNextHopType nextHopTypeNot;

    public static final String SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN = "next_hop_type_not_in";

    @SerializedName(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN)
    private List<VirtualPrivateCloudRouteNextHopType> nextHopTypeNotIn = null;

    public static final String SERIALIZED_NAME_ROUTE_TABLE = "route_table";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE)
    private VirtualPrivateCloudRouteTableWhereInput routeTable;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAY = "router_gateway";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY)
    private VirtualPrivateCloudRouterGatewayWhereInput routerGateway;

    public VirtualPrivateCloudRouteWhereInput() {}

    public VirtualPrivateCloudRouteWhereInput AND(List<VirtualPrivateCloudRouteWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addANDItem(
            VirtualPrivateCloudRouteWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudRouteWhereInput>();
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
    public List<VirtualPrivateCloudRouteWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudRouteWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudRouteWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput NOT(List<VirtualPrivateCloudRouteWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addNOTItem(
            VirtualPrivateCloudRouteWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudRouteWhereInput>();
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
    public List<VirtualPrivateCloudRouteWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudRouteWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudRouteWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput OR(List<VirtualPrivateCloudRouteWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addORItem(VirtualPrivateCloudRouteWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudRouteWhereInput>();
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
    public List<VirtualPrivateCloudRouteWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudRouteWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudRouteWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput description(String description) {

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

    public VirtualPrivateCloudRouteWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionContains(String descriptionContains) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionGt(String descriptionGt) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionGte(String descriptionGte) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VirtualPrivateCloudRouteWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionLt(String descriptionLt) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionLte(String descriptionLte) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNot(String descriptionNot) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotContains(
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotEndsWith(
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotStartsWith(
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

    public VirtualPrivateCloudRouteWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VirtualPrivateCloudRouteWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput destination(String destination) {

        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public VirtualPrivateCloudRouteWhereInput destination_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destination_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION);
        return this;
    }

    public void setDestination_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION);
        }
    }

    public boolean getDestination_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION);
    }

    public VirtualPrivateCloudRouteWhereInput destinationContains(String destinationContains) {

        this.destinationContains = destinationContains;
        return this;
    }

    /**
     * Get destinationContains
     *
     * @return destinationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationContains() {
        return destinationContains;
    }

    public void setDestinationContains(String destinationContains) {
        this.destinationContains = destinationContains;
    }

    public VirtualPrivateCloudRouteWhereInput destinationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_CONTAINS);
        return this;
    }

    public void setDestinationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_CONTAINS);
        }
    }

    public boolean getDestinationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_CONTAINS);
    }

    public VirtualPrivateCloudRouteWhereInput destinationEndsWith(String destinationEndsWith) {

        this.destinationEndsWith = destinationEndsWith;
        return this;
    }

    /**
     * Get destinationEndsWith
     *
     * @return destinationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationEndsWith() {
        return destinationEndsWith;
    }

    public void setDestinationEndsWith(String destinationEndsWith) {
        this.destinationEndsWith = destinationEndsWith;
    }

    public VirtualPrivateCloudRouteWhereInput destinationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_ENDS_WITH);
        return this;
    }

    public void setDestinationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_ENDS_WITH);
        }
    }

    public boolean getDestinationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_ENDS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput destinationGt(String destinationGt) {

        this.destinationGt = destinationGt;
        return this;
    }

    /**
     * Get destinationGt
     *
     * @return destinationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationGt() {
        return destinationGt;
    }

    public void setDestinationGt(String destinationGt) {
        this.destinationGt = destinationGt;
    }

    public VirtualPrivateCloudRouteWhereInput destinationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_GT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_GT);
        return this;
    }

    public void setDestinationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_GT);
        }
    }

    public boolean getDestinationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_GT);
    }

    public VirtualPrivateCloudRouteWhereInput destinationGte(String destinationGte) {

        this.destinationGte = destinationGte;
        return this;
    }

    /**
     * Get destinationGte
     *
     * @return destinationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationGte() {
        return destinationGte;
    }

    public void setDestinationGte(String destinationGte) {
        this.destinationGte = destinationGte;
    }

    public VirtualPrivateCloudRouteWhereInput destinationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_GTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_GTE);
        return this;
    }

    public void setDestinationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_GTE);
        }
    }

    public boolean getDestinationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_GTE);
    }

    public VirtualPrivateCloudRouteWhereInput destinationIn(List<String> destinationIn) {

        this.destinationIn = destinationIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addDestinationInItem(String destinationInItem) {
        if (this.destinationIn == null) {
            this.destinationIn = new ArrayList<String>();
        }
        this.destinationIn.add(destinationInItem);
        return this;
    }

    /**
     * Get destinationIn
     *
     * @return destinationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDestinationIn() {
        return destinationIn;
    }

    public void setDestinationIn(List<String> destinationIn) {
        this.destinationIn = destinationIn;
    }

    public VirtualPrivateCloudRouteWhereInput destinationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_IN);
        return this;
    }

    public void setDestinationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_IN);
        }
    }

    public boolean getDestinationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_IN);
    }

    public VirtualPrivateCloudRouteWhereInput destinationLt(String destinationLt) {

        this.destinationLt = destinationLt;
        return this;
    }

    /**
     * Get destinationLt
     *
     * @return destinationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationLt() {
        return destinationLt;
    }

    public void setDestinationLt(String destinationLt) {
        this.destinationLt = destinationLt;
    }

    public VirtualPrivateCloudRouteWhereInput destinationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_LT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_LT);
        return this;
    }

    public void setDestinationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_LT);
        }
    }

    public boolean getDestinationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_LT);
    }

    public VirtualPrivateCloudRouteWhereInput destinationLte(String destinationLte) {

        this.destinationLte = destinationLte;
        return this;
    }

    /**
     * Get destinationLte
     *
     * @return destinationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationLte() {
        return destinationLte;
    }

    public void setDestinationLte(String destinationLte) {
        this.destinationLte = destinationLte;
    }

    public VirtualPrivateCloudRouteWhereInput destinationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_LTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_LTE);
        return this;
    }

    public void setDestinationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_LTE);
        }
    }

    public boolean getDestinationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_LTE);
    }

    public VirtualPrivateCloudRouteWhereInput destinationNot(String destinationNot) {

        this.destinationNot = destinationNot;
        return this;
    }

    /**
     * Get destinationNot
     *
     * @return destinationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationNot() {
        return destinationNot;
    }

    public void setDestinationNot(String destinationNot) {
        this.destinationNot = destinationNot;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT);
        return this;
    }

    public void setDestinationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT);
        }
    }

    public boolean getDestinationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_NOT);
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotContains(
            String destinationNotContains) {

        this.destinationNotContains = destinationNotContains;
        return this;
    }

    /**
     * Get destinationNotContains
     *
     * @return destinationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationNotContains() {
        return destinationNotContains;
    }

    public void setDestinationNotContains(String destinationNotContains) {
        this.destinationNotContains = destinationNotContains;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS);
        return this;
    }

    public void setDestinationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS);
        }
    }

    public boolean getDestinationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_NOT_CONTAINS);
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotEndsWith(
            String destinationNotEndsWith) {

        this.destinationNotEndsWith = destinationNotEndsWith;
        return this;
    }

    /**
     * Get destinationNotEndsWith
     *
     * @return destinationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationNotEndsWith() {
        return destinationNotEndsWith;
    }

    public void setDestinationNotEndsWith(String destinationNotEndsWith) {
        this.destinationNotEndsWith = destinationNotEndsWith;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH);
        return this;
    }

    public void setDestinationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH);
        }
    }

    public boolean getDestinationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotIn(List<String> destinationNotIn) {

        this.destinationNotIn = destinationNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addDestinationNotInItem(String destinationNotInItem) {
        if (this.destinationNotIn == null) {
            this.destinationNotIn = new ArrayList<String>();
        }
        this.destinationNotIn.add(destinationNotInItem);
        return this;
    }

    /**
     * Get destinationNotIn
     *
     * @return destinationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDestinationNotIn() {
        return destinationNotIn;
    }

    public void setDestinationNotIn(List<String> destinationNotIn) {
        this.destinationNotIn = destinationNotIn;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_IN);
        return this;
    }

    public void setDestinationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_IN);
        }
    }

    public boolean getDestinationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_NOT_IN);
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotStartsWith(
            String destinationNotStartsWith) {

        this.destinationNotStartsWith = destinationNotStartsWith;
        return this;
    }

    /**
     * Get destinationNotStartsWith
     *
     * @return destinationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationNotStartsWith() {
        return destinationNotStartsWith;
    }

    public void setDestinationNotStartsWith(String destinationNotStartsWith) {
        this.destinationNotStartsWith = destinationNotStartsWith;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH);
        return this;
    }

    public void setDestinationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH);
        }
    }

    public boolean getDestinationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput destinationStartsWith(String destinationStartsWith) {

        this.destinationStartsWith = destinationStartsWith;
        return this;
    }

    /**
     * Get destinationStartsWith
     *
     * @return destinationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDestinationStartsWith() {
        return destinationStartsWith;
    }

    public void setDestinationStartsWith(String destinationStartsWith) {
        this.destinationStartsWith = destinationStartsWith;
    }

    public VirtualPrivateCloudRouteWhereInput destinationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESTINATION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput destinationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_STARTS_WITH);
        return this;
    }

    public void setDestinationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESTINATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESTINATION_STARTS_WITH);
        }
    }

    public boolean getDestinationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESTINATION_STARTS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput id(String id) {

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

    public VirtualPrivateCloudRouteWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudRouteWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudRouteWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudRouteWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudRouteWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudRouteWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudRouteWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudRouteWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudRouteWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudRouteWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudRouteWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudRouteWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudRouteWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudRouteWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localId(String localId) {

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

    public VirtualPrivateCloudRouteWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdContains(String localIdContains) {

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

    public VirtualPrivateCloudRouteWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VirtualPrivateCloudRouteWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdGt(String localIdGt) {

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

    public VirtualPrivateCloudRouteWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdGte(String localIdGte) {

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

    public VirtualPrivateCloudRouteWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VirtualPrivateCloudRouteWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdLt(String localIdLt) {

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

    public VirtualPrivateCloudRouteWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdLte(String localIdLte) {

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

    public VirtualPrivateCloudRouteWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdNot(String localIdNot) {

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

    public VirtualPrivateCloudRouteWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdNotContains(String localIdNotContains) {

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

    public VirtualPrivateCloudRouteWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VirtualPrivateCloudRouteWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VirtualPrivateCloudRouteWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VirtualPrivateCloudRouteWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VirtualPrivateCloudRouteWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteWhereInput natGateway(
            VirtualPrivateCloudNatGatewayWhereInput natGateway) {

        this.natGateway = natGateway;
        return this;
    }

    /**
     * Get natGateway
     *
     * @return natGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudNatGatewayWhereInput getNatGateway() {
        return natGateway;
    }

    public void setNatGateway(VirtualPrivateCloudNatGatewayWhereInput natGateway) {
        this.natGateway = natGateway;
    }

    public VirtualPrivateCloudRouteWhereInput natGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput natGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAY);
        return this;
    }

    public void setNatGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAY);
        }
    }

    public boolean getNatGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAY);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalId(String nextHopLocalId) {

        this.nextHopLocalId = nextHopLocalId;
        return this;
    }

    /**
     * Get nextHopLocalId
     *
     * @return nextHopLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalId() {
        return nextHopLocalId;
    }

    public void setNextHopLocalId(String nextHopLocalId) {
        this.nextHopLocalId = nextHopLocalId;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        return this;
    }

    public void setNextHopLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
        }
    }

    public boolean getNextHopLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdContains(
            String nextHopLocalIdContains) {

        this.nextHopLocalIdContains = nextHopLocalIdContains;
        return this;
    }

    /**
     * Get nextHopLocalIdContains
     *
     * @return nextHopLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdContains() {
        return nextHopLocalIdContains;
    }

    public void setNextHopLocalIdContains(String nextHopLocalIdContains) {
        this.nextHopLocalIdContains = nextHopLocalIdContains;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setNextHopLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getNextHopLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_CONTAINS);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdEndsWith(
            String nextHopLocalIdEndsWith) {

        this.nextHopLocalIdEndsWith = nextHopLocalIdEndsWith;
        return this;
    }

    /**
     * Get nextHopLocalIdEndsWith
     *
     * @return nextHopLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdEndsWith() {
        return nextHopLocalIdEndsWith;
    }

    public void setNextHopLocalIdEndsWith(String nextHopLocalIdEndsWith) {
        this.nextHopLocalIdEndsWith = nextHopLocalIdEndsWith;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setNextHopLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getNextHopLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_ENDS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGt(String nextHopLocalIdGt) {

        this.nextHopLocalIdGt = nextHopLocalIdGt;
        return this;
    }

    /**
     * Get nextHopLocalIdGt
     *
     * @return nextHopLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdGt() {
        return nextHopLocalIdGt;
    }

    public void setNextHopLocalIdGt(String nextHopLocalIdGt) {
        this.nextHopLocalIdGt = nextHopLocalIdGt;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT);
        return this;
    }

    public void setNextHopLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT);
        }
    }

    public boolean getNextHopLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GT);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGte(String nextHopLocalIdGte) {

        this.nextHopLocalIdGte = nextHopLocalIdGte;
        return this;
    }

    /**
     * Get nextHopLocalIdGte
     *
     * @return nextHopLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdGte() {
        return nextHopLocalIdGte;
    }

    public void setNextHopLocalIdGte(String nextHopLocalIdGte) {
        this.nextHopLocalIdGte = nextHopLocalIdGte;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE);
        return this;
    }

    public void setNextHopLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE);
        }
    }

    public boolean getNextHopLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_GTE);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdIn(List<String> nextHopLocalIdIn) {

        this.nextHopLocalIdIn = nextHopLocalIdIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addNextHopLocalIdInItem(String nextHopLocalIdInItem) {
        if (this.nextHopLocalIdIn == null) {
            this.nextHopLocalIdIn = new ArrayList<String>();
        }
        this.nextHopLocalIdIn.add(nextHopLocalIdInItem);
        return this;
    }

    /**
     * Get nextHopLocalIdIn
     *
     * @return nextHopLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextHopLocalIdIn() {
        return nextHopLocalIdIn;
    }

    public void setNextHopLocalIdIn(List<String> nextHopLocalIdIn) {
        this.nextHopLocalIdIn = nextHopLocalIdIn;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN);
        return this;
    }

    public void setNextHopLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN);
        }
    }

    public boolean getNextHopLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_IN);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLt(String nextHopLocalIdLt) {

        this.nextHopLocalIdLt = nextHopLocalIdLt;
        return this;
    }

    /**
     * Get nextHopLocalIdLt
     *
     * @return nextHopLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdLt() {
        return nextHopLocalIdLt;
    }

    public void setNextHopLocalIdLt(String nextHopLocalIdLt) {
        this.nextHopLocalIdLt = nextHopLocalIdLt;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT);
        return this;
    }

    public void setNextHopLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT);
        }
    }

    public boolean getNextHopLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LT);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLte(String nextHopLocalIdLte) {

        this.nextHopLocalIdLte = nextHopLocalIdLte;
        return this;
    }

    /**
     * Get nextHopLocalIdLte
     *
     * @return nextHopLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdLte() {
        return nextHopLocalIdLte;
    }

    public void setNextHopLocalIdLte(String nextHopLocalIdLte) {
        this.nextHopLocalIdLte = nextHopLocalIdLte;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE);
        return this;
    }

    public void setNextHopLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE);
        }
    }

    public boolean getNextHopLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_LTE);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNot(String nextHopLocalIdNot) {

        this.nextHopLocalIdNot = nextHopLocalIdNot;
        return this;
    }

    /**
     * Get nextHopLocalIdNot
     *
     * @return nextHopLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdNot() {
        return nextHopLocalIdNot;
    }

    public void setNextHopLocalIdNot(String nextHopLocalIdNot) {
        this.nextHopLocalIdNot = nextHopLocalIdNot;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT);
        return this;
    }

    public void setNextHopLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT);
        }
    }

    public boolean getNextHopLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotContains(
            String nextHopLocalIdNotContains) {

        this.nextHopLocalIdNotContains = nextHopLocalIdNotContains;
        return this;
    }

    /**
     * Get nextHopLocalIdNotContains
     *
     * @return nextHopLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdNotContains() {
        return nextHopLocalIdNotContains;
    }

    public void setNextHopLocalIdNotContains(String nextHopLocalIdNotContains) {
        this.nextHopLocalIdNotContains = nextHopLocalIdNotContains;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setNextHopLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getNextHopLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_CONTAINS);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotEndsWith(
            String nextHopLocalIdNotEndsWith) {

        this.nextHopLocalIdNotEndsWith = nextHopLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get nextHopLocalIdNotEndsWith
     *
     * @return nextHopLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdNotEndsWith() {
        return nextHopLocalIdNotEndsWith;
    }

    public void setNextHopLocalIdNotEndsWith(String nextHopLocalIdNotEndsWith) {
        this.nextHopLocalIdNotEndsWith = nextHopLocalIdNotEndsWith;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setNextHopLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getNextHopLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotIn(
            List<String> nextHopLocalIdNotIn) {

        this.nextHopLocalIdNotIn = nextHopLocalIdNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addNextHopLocalIdNotInItem(
            String nextHopLocalIdNotInItem) {
        if (this.nextHopLocalIdNotIn == null) {
            this.nextHopLocalIdNotIn = new ArrayList<String>();
        }
        this.nextHopLocalIdNotIn.add(nextHopLocalIdNotInItem);
        return this;
    }

    /**
     * Get nextHopLocalIdNotIn
     *
     * @return nextHopLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextHopLocalIdNotIn() {
        return nextHopLocalIdNotIn;
    }

    public void setNextHopLocalIdNotIn(List<String> nextHopLocalIdNotIn) {
        this.nextHopLocalIdNotIn = nextHopLocalIdNotIn;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setNextHopLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getNextHopLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_IN);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotStartsWith(
            String nextHopLocalIdNotStartsWith) {

        this.nextHopLocalIdNotStartsWith = nextHopLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get nextHopLocalIdNotStartsWith
     *
     * @return nextHopLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdNotStartsWith() {
        return nextHopLocalIdNotStartsWith;
    }

    public void setNextHopLocalIdNotStartsWith(String nextHopLocalIdNotStartsWith) {
        this.nextHopLocalIdNotStartsWith = nextHopLocalIdNotStartsWith;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setNextHopLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getNextHopLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdStartsWith(
            String nextHopLocalIdStartsWith) {

        this.nextHopLocalIdStartsWith = nextHopLocalIdStartsWith;
        return this;
    }

    /**
     * Get nextHopLocalIdStartsWith
     *
     * @return nextHopLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextHopLocalIdStartsWith() {
        return nextHopLocalIdStartsWith;
    }

    public void setNextHopLocalIdStartsWith(String nextHopLocalIdStartsWith) {
        this.nextHopLocalIdStartsWith = nextHopLocalIdStartsWith;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setNextHopLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getNextHopLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_LOCAL_ID_STARTS_WITH);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopType(
            VirtualPrivateCloudRouteNextHopType nextHopType) {

        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get nextHopType
     *
     * @return nextHopType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteNextHopType getNextHopType() {
        return nextHopType;
    }

    public void setNextHopType(VirtualPrivateCloudRouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE);
        return this;
    }

    public void setNextHopType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE);
        }
    }

    public boolean getNextHopType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_TYPE);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeIn(
            List<VirtualPrivateCloudRouteNextHopType> nextHopTypeIn) {

        this.nextHopTypeIn = nextHopTypeIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addNextHopTypeInItem(
            VirtualPrivateCloudRouteNextHopType nextHopTypeInItem) {
        if (this.nextHopTypeIn == null) {
            this.nextHopTypeIn = new ArrayList<VirtualPrivateCloudRouteNextHopType>();
        }
        this.nextHopTypeIn.add(nextHopTypeInItem);
        return this;
    }

    /**
     * Get nextHopTypeIn
     *
     * @return nextHopTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VirtualPrivateCloudRouteNextHopType> getNextHopTypeIn() {
        return nextHopTypeIn;
    }

    public void setNextHopTypeIn(List<VirtualPrivateCloudRouteNextHopType> nextHopTypeIn) {
        this.nextHopTypeIn = nextHopTypeIn;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_IN);
        return this;
    }

    public void setNextHopTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_IN);
        }
    }

    public boolean getNextHopTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_TYPE_IN);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNot(
            VirtualPrivateCloudRouteNextHopType nextHopTypeNot) {

        this.nextHopTypeNot = nextHopTypeNot;
        return this;
    }

    /**
     * Get nextHopTypeNot
     *
     * @return nextHopTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteNextHopType getNextHopTypeNot() {
        return nextHopTypeNot;
    }

    public void setNextHopTypeNot(VirtualPrivateCloudRouteNextHopType nextHopTypeNot) {
        this.nextHopTypeNot = nextHopTypeNot;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT);
        return this;
    }

    public void setNextHopTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT);
        }
    }

    public boolean getNextHopTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT);
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNotIn(
            List<VirtualPrivateCloudRouteNextHopType> nextHopTypeNotIn) {

        this.nextHopTypeNotIn = nextHopTypeNotIn;
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput addNextHopTypeNotInItem(
            VirtualPrivateCloudRouteNextHopType nextHopTypeNotInItem) {
        if (this.nextHopTypeNotIn == null) {
            this.nextHopTypeNotIn = new ArrayList<VirtualPrivateCloudRouteNextHopType>();
        }
        this.nextHopTypeNotIn.add(nextHopTypeNotInItem);
        return this;
    }

    /**
     * Get nextHopTypeNotIn
     *
     * @return nextHopTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VirtualPrivateCloudRouteNextHopType> getNextHopTypeNotIn() {
        return nextHopTypeNotIn;
    }

    public void setNextHopTypeNotIn(List<VirtualPrivateCloudRouteNextHopType> nextHopTypeNotIn) {
        this.nextHopTypeNotIn = nextHopTypeNotIn;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput nextHopTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN);
        return this;
    }

    public void setNextHopTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN);
        }
    }

    public boolean getNextHopTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_HOP_TYPE_NOT_IN);
    }

    public VirtualPrivateCloudRouteWhereInput routeTable(
            VirtualPrivateCloudRouteTableWhereInput routeTable) {

        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get routeTable
     *
     * @return routeTable
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouteTableWhereInput getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(VirtualPrivateCloudRouteTableWhereInput routeTable) {
        this.routeTable = routeTable;
    }

    public VirtualPrivateCloudRouteWhereInput routeTable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLE);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput routeTable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLE);
        return this;
    }

    public void setRouteTable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLE);
        }
    }

    public boolean getRouteTable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLE);
    }

    public VirtualPrivateCloudRouteWhereInput routerGateway(
            VirtualPrivateCloudRouterGatewayWhereInput routerGateway) {

        this.routerGateway = routerGateway;
        return this;
    }

    /**
     * Get routerGateway
     *
     * @return routerGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudRouterGatewayWhereInput getRouterGateway() {
        return routerGateway;
    }

    public void setRouterGateway(VirtualPrivateCloudRouterGatewayWhereInput routerGateway) {
        this.routerGateway = routerGateway;
    }

    public VirtualPrivateCloudRouteWhereInput routerGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudRouteWhereInput routerGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAY);
        return this;
    }

    public void setRouterGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAY);
        }
    }

    public boolean getRouterGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouteWhereInput virtualPrivateCloudRouteWhereInput =
                (VirtualPrivateCloudRouteWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudRouteWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudRouteWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudRouteWhereInput.OR)
                && Objects.equals(this.description, virtualPrivateCloudRouteWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        virtualPrivateCloudRouteWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        virtualPrivateCloudRouteWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt, virtualPrivateCloudRouteWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, virtualPrivateCloudRouteWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn, virtualPrivateCloudRouteWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt, virtualPrivateCloudRouteWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, virtualPrivateCloudRouteWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, virtualPrivateCloudRouteWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        virtualPrivateCloudRouteWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        virtualPrivateCloudRouteWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, virtualPrivateCloudRouteWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        virtualPrivateCloudRouteWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        virtualPrivateCloudRouteWhereInput.descriptionStartsWith)
                && Objects.equals(this.destination, virtualPrivateCloudRouteWhereInput.destination)
                && Objects.equals(
                        this.destinationContains,
                        virtualPrivateCloudRouteWhereInput.destinationContains)
                && Objects.equals(
                        this.destinationEndsWith,
                        virtualPrivateCloudRouteWhereInput.destinationEndsWith)
                && Objects.equals(
                        this.destinationGt, virtualPrivateCloudRouteWhereInput.destinationGt)
                && Objects.equals(
                        this.destinationGte, virtualPrivateCloudRouteWhereInput.destinationGte)
                && Objects.equals(
                        this.destinationIn, virtualPrivateCloudRouteWhereInput.destinationIn)
                && Objects.equals(
                        this.destinationLt, virtualPrivateCloudRouteWhereInput.destinationLt)
                && Objects.equals(
                        this.destinationLte, virtualPrivateCloudRouteWhereInput.destinationLte)
                && Objects.equals(
                        this.destinationNot, virtualPrivateCloudRouteWhereInput.destinationNot)
                && Objects.equals(
                        this.destinationNotContains,
                        virtualPrivateCloudRouteWhereInput.destinationNotContains)
                && Objects.equals(
                        this.destinationNotEndsWith,
                        virtualPrivateCloudRouteWhereInput.destinationNotEndsWith)
                && Objects.equals(
                        this.destinationNotIn, virtualPrivateCloudRouteWhereInput.destinationNotIn)
                && Objects.equals(
                        this.destinationNotStartsWith,
                        virtualPrivateCloudRouteWhereInput.destinationNotStartsWith)
                && Objects.equals(
                        this.destinationStartsWith,
                        virtualPrivateCloudRouteWhereInput.destinationStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudRouteWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudRouteWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudRouteWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudRouteWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, virtualPrivateCloudRouteWhereInput.id)
                && Objects.equals(this.idContains, virtualPrivateCloudRouteWhereInput.idContains)
                && Objects.equals(this.idEndsWith, virtualPrivateCloudRouteWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudRouteWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudRouteWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudRouteWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudRouteWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudRouteWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudRouteWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, virtualPrivateCloudRouteWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, virtualPrivateCloudRouteWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, virtualPrivateCloudRouteWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, virtualPrivateCloudRouteWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, virtualPrivateCloudRouteWhereInput.idStartsWith)
                && Objects.equals(this.localId, virtualPrivateCloudRouteWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, virtualPrivateCloudRouteWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, virtualPrivateCloudRouteWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, virtualPrivateCloudRouteWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, virtualPrivateCloudRouteWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, virtualPrivateCloudRouteWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, virtualPrivateCloudRouteWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, virtualPrivateCloudRouteWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, virtualPrivateCloudRouteWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        virtualPrivateCloudRouteWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        virtualPrivateCloudRouteWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, virtualPrivateCloudRouteWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        virtualPrivateCloudRouteWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        virtualPrivateCloudRouteWhereInput.localIdStartsWith)
                && Objects.equals(this.natGateway, virtualPrivateCloudRouteWhereInput.natGateway)
                && Objects.equals(
                        this.nextHopLocalId, virtualPrivateCloudRouteWhereInput.nextHopLocalId)
                && Objects.equals(
                        this.nextHopLocalIdContains,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdContains)
                && Objects.equals(
                        this.nextHopLocalIdEndsWith,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdEndsWith)
                && Objects.equals(
                        this.nextHopLocalIdGt, virtualPrivateCloudRouteWhereInput.nextHopLocalIdGt)
                && Objects.equals(
                        this.nextHopLocalIdGte,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdGte)
                && Objects.equals(
                        this.nextHopLocalIdIn, virtualPrivateCloudRouteWhereInput.nextHopLocalIdIn)
                && Objects.equals(
                        this.nextHopLocalIdLt, virtualPrivateCloudRouteWhereInput.nextHopLocalIdLt)
                && Objects.equals(
                        this.nextHopLocalIdLte,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdLte)
                && Objects.equals(
                        this.nextHopLocalIdNot,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdNot)
                && Objects.equals(
                        this.nextHopLocalIdNotContains,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdNotContains)
                && Objects.equals(
                        this.nextHopLocalIdNotEndsWith,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdNotEndsWith)
                && Objects.equals(
                        this.nextHopLocalIdNotIn,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdNotIn)
                && Objects.equals(
                        this.nextHopLocalIdNotStartsWith,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdNotStartsWith)
                && Objects.equals(
                        this.nextHopLocalIdStartsWith,
                        virtualPrivateCloudRouteWhereInput.nextHopLocalIdStartsWith)
                && Objects.equals(this.nextHopType, virtualPrivateCloudRouteWhereInput.nextHopType)
                && Objects.equals(
                        this.nextHopTypeIn, virtualPrivateCloudRouteWhereInput.nextHopTypeIn)
                && Objects.equals(
                        this.nextHopTypeNot, virtualPrivateCloudRouteWhereInput.nextHopTypeNot)
                && Objects.equals(
                        this.nextHopTypeNotIn, virtualPrivateCloudRouteWhereInput.nextHopTypeNotIn)
                && Objects.equals(this.routeTable, virtualPrivateCloudRouteWhereInput.routeTable)
                && Objects.equals(
                        this.routerGateway, virtualPrivateCloudRouteWhereInput.routerGateway);
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
                destination,
                destinationContains,
                destinationEndsWith,
                destinationGt,
                destinationGte,
                destinationIn,
                destinationLt,
                destinationLte,
                destinationNot,
                destinationNotContains,
                destinationNotEndsWith,
                destinationNotIn,
                destinationNotStartsWith,
                destinationStartsWith,
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
                natGateway,
                nextHopLocalId,
                nextHopLocalIdContains,
                nextHopLocalIdEndsWith,
                nextHopLocalIdGt,
                nextHopLocalIdGte,
                nextHopLocalIdIn,
                nextHopLocalIdLt,
                nextHopLocalIdLte,
                nextHopLocalIdNot,
                nextHopLocalIdNotContains,
                nextHopLocalIdNotEndsWith,
                nextHopLocalIdNotIn,
                nextHopLocalIdNotStartsWith,
                nextHopLocalIdStartsWith,
                nextHopType,
                nextHopTypeIn,
                nextHopTypeNot,
                nextHopTypeNotIn,
                routeTable,
                routerGateway);
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
        sb.append("class VirtualPrivateCloudRouteWhereInput {\n");
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
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    destinationContains: ")
                .append(toIndentedString(destinationContains))
                .append("\n");
        sb.append("    destinationEndsWith: ")
                .append(toIndentedString(destinationEndsWith))
                .append("\n");
        sb.append("    destinationGt: ").append(toIndentedString(destinationGt)).append("\n");
        sb.append("    destinationGte: ").append(toIndentedString(destinationGte)).append("\n");
        sb.append("    destinationIn: ").append(toIndentedString(destinationIn)).append("\n");
        sb.append("    destinationLt: ").append(toIndentedString(destinationLt)).append("\n");
        sb.append("    destinationLte: ").append(toIndentedString(destinationLte)).append("\n");
        sb.append("    destinationNot: ").append(toIndentedString(destinationNot)).append("\n");
        sb.append("    destinationNotContains: ")
                .append(toIndentedString(destinationNotContains))
                .append("\n");
        sb.append("    destinationNotEndsWith: ")
                .append(toIndentedString(destinationNotEndsWith))
                .append("\n");
        sb.append("    destinationNotIn: ").append(toIndentedString(destinationNotIn)).append("\n");
        sb.append("    destinationNotStartsWith: ")
                .append(toIndentedString(destinationNotStartsWith))
                .append("\n");
        sb.append("    destinationStartsWith: ")
                .append(toIndentedString(destinationStartsWith))
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
        sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
        sb.append("    nextHopLocalId: ").append(toIndentedString(nextHopLocalId)).append("\n");
        sb.append("    nextHopLocalIdContains: ")
                .append(toIndentedString(nextHopLocalIdContains))
                .append("\n");
        sb.append("    nextHopLocalIdEndsWith: ")
                .append(toIndentedString(nextHopLocalIdEndsWith))
                .append("\n");
        sb.append("    nextHopLocalIdGt: ").append(toIndentedString(nextHopLocalIdGt)).append("\n");
        sb.append("    nextHopLocalIdGte: ")
                .append(toIndentedString(nextHopLocalIdGte))
                .append("\n");
        sb.append("    nextHopLocalIdIn: ").append(toIndentedString(nextHopLocalIdIn)).append("\n");
        sb.append("    nextHopLocalIdLt: ").append(toIndentedString(nextHopLocalIdLt)).append("\n");
        sb.append("    nextHopLocalIdLte: ")
                .append(toIndentedString(nextHopLocalIdLte))
                .append("\n");
        sb.append("    nextHopLocalIdNot: ")
                .append(toIndentedString(nextHopLocalIdNot))
                .append("\n");
        sb.append("    nextHopLocalIdNotContains: ")
                .append(toIndentedString(nextHopLocalIdNotContains))
                .append("\n");
        sb.append("    nextHopLocalIdNotEndsWith: ")
                .append(toIndentedString(nextHopLocalIdNotEndsWith))
                .append("\n");
        sb.append("    nextHopLocalIdNotIn: ")
                .append(toIndentedString(nextHopLocalIdNotIn))
                .append("\n");
        sb.append("    nextHopLocalIdNotStartsWith: ")
                .append(toIndentedString(nextHopLocalIdNotStartsWith))
                .append("\n");
        sb.append("    nextHopLocalIdStartsWith: ")
                .append(toIndentedString(nextHopLocalIdStartsWith))
                .append("\n");
        sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
        sb.append("    nextHopTypeIn: ").append(toIndentedString(nextHopTypeIn)).append("\n");
        sb.append("    nextHopTypeNot: ").append(toIndentedString(nextHopTypeNot)).append("\n");
        sb.append("    nextHopTypeNotIn: ").append(toIndentedString(nextHopTypeNotIn)).append("\n");
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
        sb.append("    routerGateway: ").append(toIndentedString(routerGateway)).append("\n");
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
