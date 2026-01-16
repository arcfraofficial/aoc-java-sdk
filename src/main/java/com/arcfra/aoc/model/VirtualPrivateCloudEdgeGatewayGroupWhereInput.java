package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudEdgeGatewayGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudEdgeGatewayGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_EDGE_GATEWAYS_EVERY = "edge_gateways_every";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY)
    private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery;

    public static final String SERIALIZED_NAME_EDGE_GATEWAYS_NONE = "edge_gateways_none";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_NONE)
    private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone;

    public static final String SERIALIZED_NAME_EDGE_GATEWAYS_SOME = "edge_gateways_some";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS_SOME)
    private VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome;

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

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID = "primary_edge_gateway_id";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID)
    private String primaryEdgeGatewayId;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS =
            "primary_edge_gateway_id_contains";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS)
    private String primaryEdgeGatewayIdContains;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH =
            "primary_edge_gateway_id_ends_with";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH)
    private String primaryEdgeGatewayIdEndsWith;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT =
            "primary_edge_gateway_id_gt";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT)
    private String primaryEdgeGatewayIdGt;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE =
            "primary_edge_gateway_id_gte";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE)
    private String primaryEdgeGatewayIdGte;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN =
            "primary_edge_gateway_id_in";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN)
    private List<String> primaryEdgeGatewayIdIn = null;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT =
            "primary_edge_gateway_id_lt";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT)
    private String primaryEdgeGatewayIdLt;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE =
            "primary_edge_gateway_id_lte";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE)
    private String primaryEdgeGatewayIdLte;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT =
            "primary_edge_gateway_id_not";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT)
    private String primaryEdgeGatewayIdNot;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS =
            "primary_edge_gateway_id_not_contains";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS)
    private String primaryEdgeGatewayIdNotContains;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH =
            "primary_edge_gateway_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH)
    private String primaryEdgeGatewayIdNotEndsWith;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN =
            "primary_edge_gateway_id_not_in";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN)
    private List<String> primaryEdgeGatewayIdNotIn = null;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH =
            "primary_edge_gateway_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH)
    private String primaryEdgeGatewayIdNotStartsWith;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH =
            "primary_edge_gateway_id_starts_with";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH)
    private String primaryEdgeGatewayIdStartsWith;

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput() {}

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput AND(
            List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addANDItem(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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
    public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput NOT(
            List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNOTItem(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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
    public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput OR(
            List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addORItem(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudEdgeGatewayGroupWhereInput>();
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
    public List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudEdgeGatewayGroupWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput description(String description) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionContains(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionEndsWith(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGt(String descriptionGt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGte(String descriptionGte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addDescriptionInItem(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLt(String descriptionLt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLte(String descriptionLte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNot(String descriptionNot) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotContains(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotEndsWith(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotIn(
            List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addDescriptionNotInItem(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotStartsWith(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionStartsWith(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysEvery(
            VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery) {

        this.edgeGatewaysEvery = edgeGatewaysEvery;
        return this;
    }

    /**
     * Get edgeGatewaysEvery
     *
     * @return edgeGatewaysEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysEvery() {
        return edgeGatewaysEvery;
    }

    public void setEdgeGatewaysEvery(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysEvery) {
        this.edgeGatewaysEvery = edgeGatewaysEvery;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
        return this;
    }

    public void setEdgeGatewaysEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
        }
    }

    public boolean getEdgeGatewaysEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysNone(
            VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone) {

        this.edgeGatewaysNone = edgeGatewaysNone;
        return this;
    }

    /**
     * Get edgeGatewaysNone
     *
     * @return edgeGatewaysNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysNone() {
        return edgeGatewaysNone;
    }

    public void setEdgeGatewaysNone(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysNone) {
        this.edgeGatewaysNone = edgeGatewaysNone;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
        return this;
    }

    public void setEdgeGatewaysNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
        }
    }

    public boolean getEdgeGatewaysNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysSome(
            VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome) {

        this.edgeGatewaysSome = edgeGatewaysSome;
        return this;
    }

    /**
     * Get edgeGatewaysSome
     *
     * @return edgeGatewaysSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayWhereInput getEdgeGatewaysSome() {
        return edgeGatewaysSome;
    }

    public void setEdgeGatewaysSome(VirtualPrivateCloudEdgeGatewayWhereInput edgeGatewaysSome) {
        this.edgeGatewaysSome = edgeGatewaysSome;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewaysSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
        return this;
    }

    public void setEdgeGatewaysSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
        }
    }

    public boolean getEdgeGatewaysSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput id(String id) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput name(String name) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameContains(String nameContains) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGt(String nameGt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGte(String nameGte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNameInItem(String nameInItem) {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLt(String nameLt) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLte(String nameLte) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNot(String nameNot) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotContains(String nameNotContains) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotStartsWith(
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayId(
            String primaryEdgeGatewayId) {

        this.primaryEdgeGatewayId = primaryEdgeGatewayId;
        return this;
    }

    /**
     * Get primaryEdgeGatewayId
     *
     * @return primaryEdgeGatewayId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayId() {
        return primaryEdgeGatewayId;
    }

    public void setPrimaryEdgeGatewayId(String primaryEdgeGatewayId) {
        this.primaryEdgeGatewayId = primaryEdgeGatewayId;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        return this;
    }

    public void setPrimaryEdgeGatewayId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        }
    }

    public boolean getPrimaryEdgeGatewayId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdContains(
            String primaryEdgeGatewayIdContains) {

        this.primaryEdgeGatewayIdContains = primaryEdgeGatewayIdContains;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdContains
     *
     * @return primaryEdgeGatewayIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdContains() {
        return primaryEdgeGatewayIdContains;
    }

    public void setPrimaryEdgeGatewayIdContains(String primaryEdgeGatewayIdContains) {
        this.primaryEdgeGatewayIdContains = primaryEdgeGatewayIdContains;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS);
        return this;
    }

    public void setPrimaryEdgeGatewayIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS);
        }
    }

    public boolean getPrimaryEdgeGatewayIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_CONTAINS);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdEndsWith(
            String primaryEdgeGatewayIdEndsWith) {

        this.primaryEdgeGatewayIdEndsWith = primaryEdgeGatewayIdEndsWith;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdEndsWith
     *
     * @return primaryEdgeGatewayIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdEndsWith() {
        return primaryEdgeGatewayIdEndsWith;
    }

    public void setPrimaryEdgeGatewayIdEndsWith(String primaryEdgeGatewayIdEndsWith) {
        this.primaryEdgeGatewayIdEndsWith = primaryEdgeGatewayIdEndsWith;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH);
        return this;
    }

    public void setPrimaryEdgeGatewayIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH);
        }
    }

    public boolean getPrimaryEdgeGatewayIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_ENDS_WITH);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGt(
            String primaryEdgeGatewayIdGt) {

        this.primaryEdgeGatewayIdGt = primaryEdgeGatewayIdGt;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdGt
     *
     * @return primaryEdgeGatewayIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdGt() {
        return primaryEdgeGatewayIdGt;
    }

    public void setPrimaryEdgeGatewayIdGt(String primaryEdgeGatewayIdGt) {
        this.primaryEdgeGatewayIdGt = primaryEdgeGatewayIdGt;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT);
        return this;
    }

    public void setPrimaryEdgeGatewayIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT);
        }
    }

    public boolean getPrimaryEdgeGatewayIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GT);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGte(
            String primaryEdgeGatewayIdGte) {

        this.primaryEdgeGatewayIdGte = primaryEdgeGatewayIdGte;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdGte
     *
     * @return primaryEdgeGatewayIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdGte() {
        return primaryEdgeGatewayIdGte;
    }

    public void setPrimaryEdgeGatewayIdGte(String primaryEdgeGatewayIdGte) {
        this.primaryEdgeGatewayIdGte = primaryEdgeGatewayIdGte;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE);
        return this;
    }

    public void setPrimaryEdgeGatewayIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE);
        }
    }

    public boolean getPrimaryEdgeGatewayIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_GTE);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdIn(
            List<String> primaryEdgeGatewayIdIn) {

        this.primaryEdgeGatewayIdIn = primaryEdgeGatewayIdIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addPrimaryEdgeGatewayIdInItem(
            String primaryEdgeGatewayIdInItem) {
        if (this.primaryEdgeGatewayIdIn == null) {
            this.primaryEdgeGatewayIdIn = new ArrayList<String>();
        }
        this.primaryEdgeGatewayIdIn.add(primaryEdgeGatewayIdInItem);
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdIn
     *
     * @return primaryEdgeGatewayIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPrimaryEdgeGatewayIdIn() {
        return primaryEdgeGatewayIdIn;
    }

    public void setPrimaryEdgeGatewayIdIn(List<String> primaryEdgeGatewayIdIn) {
        this.primaryEdgeGatewayIdIn = primaryEdgeGatewayIdIn;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN);
        return this;
    }

    public void setPrimaryEdgeGatewayIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN);
        }
    }

    public boolean getPrimaryEdgeGatewayIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_IN);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLt(
            String primaryEdgeGatewayIdLt) {

        this.primaryEdgeGatewayIdLt = primaryEdgeGatewayIdLt;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdLt
     *
     * @return primaryEdgeGatewayIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdLt() {
        return primaryEdgeGatewayIdLt;
    }

    public void setPrimaryEdgeGatewayIdLt(String primaryEdgeGatewayIdLt) {
        this.primaryEdgeGatewayIdLt = primaryEdgeGatewayIdLt;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT);
        return this;
    }

    public void setPrimaryEdgeGatewayIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT);
        }
    }

    public boolean getPrimaryEdgeGatewayIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LT);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLte(
            String primaryEdgeGatewayIdLte) {

        this.primaryEdgeGatewayIdLte = primaryEdgeGatewayIdLte;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdLte
     *
     * @return primaryEdgeGatewayIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdLte() {
        return primaryEdgeGatewayIdLte;
    }

    public void setPrimaryEdgeGatewayIdLte(String primaryEdgeGatewayIdLte) {
        this.primaryEdgeGatewayIdLte = primaryEdgeGatewayIdLte;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE);
        return this;
    }

    public void setPrimaryEdgeGatewayIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE);
        }
    }

    public boolean getPrimaryEdgeGatewayIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_LTE);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNot(
            String primaryEdgeGatewayIdNot) {

        this.primaryEdgeGatewayIdNot = primaryEdgeGatewayIdNot;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdNot
     *
     * @return primaryEdgeGatewayIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdNot() {
        return primaryEdgeGatewayIdNot;
    }

    public void setPrimaryEdgeGatewayIdNot(String primaryEdgeGatewayIdNot) {
        this.primaryEdgeGatewayIdNot = primaryEdgeGatewayIdNot;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT);
        return this;
    }

    public void setPrimaryEdgeGatewayIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT);
        }
    }

    public boolean getPrimaryEdgeGatewayIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotContains(
            String primaryEdgeGatewayIdNotContains) {

        this.primaryEdgeGatewayIdNotContains = primaryEdgeGatewayIdNotContains;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdNotContains
     *
     * @return primaryEdgeGatewayIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdNotContains() {
        return primaryEdgeGatewayIdNotContains;
    }

    public void setPrimaryEdgeGatewayIdNotContains(String primaryEdgeGatewayIdNotContains) {
        this.primaryEdgeGatewayIdNotContains = primaryEdgeGatewayIdNotContains;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS);
        return this;
    }

    public void setPrimaryEdgeGatewayIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS);
        }
    }

    public boolean getPrimaryEdgeGatewayIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_CONTAINS);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotEndsWith(
            String primaryEdgeGatewayIdNotEndsWith) {

        this.primaryEdgeGatewayIdNotEndsWith = primaryEdgeGatewayIdNotEndsWith;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdNotEndsWith
     *
     * @return primaryEdgeGatewayIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdNotEndsWith() {
        return primaryEdgeGatewayIdNotEndsWith;
    }

    public void setPrimaryEdgeGatewayIdNotEndsWith(String primaryEdgeGatewayIdNotEndsWith) {
        this.primaryEdgeGatewayIdNotEndsWith = primaryEdgeGatewayIdNotEndsWith;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setPrimaryEdgeGatewayIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getPrimaryEdgeGatewayIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotIn(
            List<String> primaryEdgeGatewayIdNotIn) {

        this.primaryEdgeGatewayIdNotIn = primaryEdgeGatewayIdNotIn;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput addPrimaryEdgeGatewayIdNotInItem(
            String primaryEdgeGatewayIdNotInItem) {
        if (this.primaryEdgeGatewayIdNotIn == null) {
            this.primaryEdgeGatewayIdNotIn = new ArrayList<String>();
        }
        this.primaryEdgeGatewayIdNotIn.add(primaryEdgeGatewayIdNotInItem);
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdNotIn
     *
     * @return primaryEdgeGatewayIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPrimaryEdgeGatewayIdNotIn() {
        return primaryEdgeGatewayIdNotIn;
    }

    public void setPrimaryEdgeGatewayIdNotIn(List<String> primaryEdgeGatewayIdNotIn) {
        this.primaryEdgeGatewayIdNotIn = primaryEdgeGatewayIdNotIn;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN);
        return this;
    }

    public void setPrimaryEdgeGatewayIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN);
        }
    }

    public boolean getPrimaryEdgeGatewayIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_IN);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdNotStartsWith(
            String primaryEdgeGatewayIdNotStartsWith) {

        this.primaryEdgeGatewayIdNotStartsWith = primaryEdgeGatewayIdNotStartsWith;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdNotStartsWith
     *
     * @return primaryEdgeGatewayIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdNotStartsWith() {
        return primaryEdgeGatewayIdNotStartsWith;
    }

    public void setPrimaryEdgeGatewayIdNotStartsWith(String primaryEdgeGatewayIdNotStartsWith) {
        this.primaryEdgeGatewayIdNotStartsWith = primaryEdgeGatewayIdNotStartsWith;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setPrimaryEdgeGatewayIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getPrimaryEdgeGatewayIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput primaryEdgeGatewayIdStartsWith(
            String primaryEdgeGatewayIdStartsWith) {

        this.primaryEdgeGatewayIdStartsWith = primaryEdgeGatewayIdStartsWith;
        return this;
    }

    /**
     * Get primaryEdgeGatewayIdStartsWith
     *
     * @return primaryEdgeGatewayIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayIdStartsWith() {
        return primaryEdgeGatewayIdStartsWith;
    }

    public void setPrimaryEdgeGatewayIdStartsWith(String primaryEdgeGatewayIdStartsWith) {
        this.primaryEdgeGatewayIdStartsWith = primaryEdgeGatewayIdStartsWith;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroupWhereInput
            primaryEdgeGatewayIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH);
        return this;
    }

    public void setPrimaryEdgeGatewayIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH);
        }
    }

    public boolean getPrimaryEdgeGatewayIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudEdgeGatewayGroupWhereInput
                virtualPrivateCloudEdgeGatewayGroupWhereInput =
                        (VirtualPrivateCloudEdgeGatewayGroupWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudEdgeGatewayGroupWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudEdgeGatewayGroupWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudEdgeGatewayGroupWhereInput.OR)
                && Objects.equals(
                        this.description, virtualPrivateCloudEdgeGatewayGroupWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.edgeGatewaysEvery,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysEvery)
                && Objects.equals(
                        this.edgeGatewaysNone,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysNone)
                && Objects.equals(
                        this.edgeGatewaysSome,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.edgeGatewaysSome)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, virtualPrivateCloudEdgeGatewayGroupWhereInput.id)
                && Objects.equals(
                        this.idContains, virtualPrivateCloudEdgeGatewayGroupWhereInput.idContains)
                && Objects.equals(
                        this.idEndsWith, virtualPrivateCloudEdgeGatewayGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotEndsWith)
                && Objects.equals(
                        this.idNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.idStartsWith)
                && Objects.equals(this.name, virtualPrivateCloudEdgeGatewayGroupWhereInput.name)
                && Objects.equals(
                        this.nameContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameGt)
                && Objects.equals(
                        this.nameGte, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameGte)
                && Objects.equals(this.nameIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameIn)
                && Objects.equals(this.nameLt, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameLt)
                && Objects.equals(
                        this.nameLte, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameLte)
                && Objects.equals(
                        this.nameNot, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotEndsWith)
                && Objects.equals(
                        this.nameNotIn, virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.nameStartsWith)
                && Objects.equals(
                        this.primaryEdgeGatewayId,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayId)
                && Objects.equals(
                        this.primaryEdgeGatewayIdContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdContains)
                && Objects.equals(
                        this.primaryEdgeGatewayIdEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdEndsWith)
                && Objects.equals(
                        this.primaryEdgeGatewayIdGt,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdGt)
                && Objects.equals(
                        this.primaryEdgeGatewayIdGte,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdGte)
                && Objects.equals(
                        this.primaryEdgeGatewayIdIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdIn)
                && Objects.equals(
                        this.primaryEdgeGatewayIdLt,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdLt)
                && Objects.equals(
                        this.primaryEdgeGatewayIdLte,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdLte)
                && Objects.equals(
                        this.primaryEdgeGatewayIdNot,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNot)
                && Objects.equals(
                        this.primaryEdgeGatewayIdNotContains,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput
                                .primaryEdgeGatewayIdNotContains)
                && Objects.equals(
                        this.primaryEdgeGatewayIdNotEndsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput
                                .primaryEdgeGatewayIdNotEndsWith)
                && Objects.equals(
                        this.primaryEdgeGatewayIdNotIn,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput.primaryEdgeGatewayIdNotIn)
                && Objects.equals(
                        this.primaryEdgeGatewayIdNotStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput
                                .primaryEdgeGatewayIdNotStartsWith)
                && Objects.equals(
                        this.primaryEdgeGatewayIdStartsWith,
                        virtualPrivateCloudEdgeGatewayGroupWhereInput
                                .primaryEdgeGatewayIdStartsWith);
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
                edgeGatewaysEvery,
                edgeGatewaysNone,
                edgeGatewaysSome,
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
                primaryEdgeGatewayId,
                primaryEdgeGatewayIdContains,
                primaryEdgeGatewayIdEndsWith,
                primaryEdgeGatewayIdGt,
                primaryEdgeGatewayIdGte,
                primaryEdgeGatewayIdIn,
                primaryEdgeGatewayIdLt,
                primaryEdgeGatewayIdLte,
                primaryEdgeGatewayIdNot,
                primaryEdgeGatewayIdNotContains,
                primaryEdgeGatewayIdNotEndsWith,
                primaryEdgeGatewayIdNotIn,
                primaryEdgeGatewayIdNotStartsWith,
                primaryEdgeGatewayIdStartsWith);
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
        sb.append("class VirtualPrivateCloudEdgeGatewayGroupWhereInput {\n");
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
        sb.append("    edgeGatewaysEvery: ")
                .append(toIndentedString(edgeGatewaysEvery))
                .append("\n");
        sb.append("    edgeGatewaysNone: ").append(toIndentedString(edgeGatewaysNone)).append("\n");
        sb.append("    edgeGatewaysSome: ").append(toIndentedString(edgeGatewaysSome)).append("\n");
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
        sb.append("    primaryEdgeGatewayId: ")
                .append(toIndentedString(primaryEdgeGatewayId))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdContains: ")
                .append(toIndentedString(primaryEdgeGatewayIdContains))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdEndsWith: ")
                .append(toIndentedString(primaryEdgeGatewayIdEndsWith))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdGt: ")
                .append(toIndentedString(primaryEdgeGatewayIdGt))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdGte: ")
                .append(toIndentedString(primaryEdgeGatewayIdGte))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdIn: ")
                .append(toIndentedString(primaryEdgeGatewayIdIn))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdLt: ")
                .append(toIndentedString(primaryEdgeGatewayIdLt))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdLte: ")
                .append(toIndentedString(primaryEdgeGatewayIdLte))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdNot: ")
                .append(toIndentedString(primaryEdgeGatewayIdNot))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdNotContains: ")
                .append(toIndentedString(primaryEdgeGatewayIdNotContains))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdNotEndsWith: ")
                .append(toIndentedString(primaryEdgeGatewayIdNotEndsWith))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdNotIn: ")
                .append(toIndentedString(primaryEdgeGatewayIdNotIn))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdNotStartsWith: ")
                .append(toIndentedString(primaryEdgeGatewayIdNotStartsWith))
                .append("\n");
        sb.append("    primaryEdgeGatewayIdStartsWith: ")
                .append(toIndentedString(primaryEdgeGatewayIdStartsWith))
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
