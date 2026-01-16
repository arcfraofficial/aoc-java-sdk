package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudServiceWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudServiceWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudServiceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudServiceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudServiceWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY = "cluster_bindings_every";

    @SerializedName(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY)
    private VirtualPrivateCloudClusterBindingWhereInput clusterBindingsEvery;

    public static final String SERIALIZED_NAME_CLUSTER_BINDINGS_NONE = "cluster_bindings_none";

    @SerializedName(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE)
    private VirtualPrivateCloudClusterBindingWhereInput clusterBindingsNone;

    public static final String SERIALIZED_NAME_CLUSTER_BINDINGS_SOME = "cluster_bindings_some";

    @SerializedName(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME)
    private VirtualPrivateCloudClusterBindingWhereInput clusterBindingsSome;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY =
            "edge_gateway_groups_every";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY)
    private VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsEvery;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE =
            "edge_gateway_groups_none";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE)
    private VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsNone;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME =
            "edge_gateway_groups_some";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME)
    private VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsSome;

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

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private EverouteClusterWhereInput everouteCluster;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY = "external_subnets_every";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY)
    private VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsEvery;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE = "external_subnets_none";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE)
    private VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsNone;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME = "external_subnets_some";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME)
    private VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsSome;

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

    public static final String SERIALIZED_NAME_INTERNAL_CIDR = "internal_cidr";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR)
    private String internalCidr;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS = "internal_cidr_contains";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS)
    private String internalCidrContains;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH = "internal_cidr_ends_with";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH)
    private String internalCidrEndsWith;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_GT = "internal_cidr_gt";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_GT)
    private String internalCidrGt;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_GTE = "internal_cidr_gte";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_GTE)
    private String internalCidrGte;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_IN = "internal_cidr_in";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_IN)
    private List<String> internalCidrIn = null;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_LT = "internal_cidr_lt";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_LT)
    private String internalCidrLt;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_LTE = "internal_cidr_lte";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_LTE)
    private String internalCidrLte;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_NOT = "internal_cidr_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_NOT)
    private String internalCidrNot;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS =
            "internal_cidr_not_contains";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS)
    private String internalCidrNotContains;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH =
            "internal_cidr_not_ends_with";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH)
    private String internalCidrNotEndsWith;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN = "internal_cidr_not_in";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN)
    private List<String> internalCidrNotIn = null;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH =
            "internal_cidr_not_starts_with";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH)
    private String internalCidrNotStartsWith;

    public static final String SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH =
            "internal_cidr_starts_with";

    @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH)
    private String internalCidrStartsWith;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_PHASE_IN = "phase_in";

    @SerializedName(SERIALIZED_NAME_PHASE_IN)
    private List<EverouteClusterPhase> phaseIn = null;

    public static final String SERIALIZED_NAME_PHASE_NOT = "phase_not";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT)
    private EverouteClusterPhase phaseNot;

    public static final String SERIALIZED_NAME_PHASE_NOT_IN = "phase_not_in";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT_IN)
    private List<EverouteClusterPhase> phaseNotIn = null;

    public static final String SERIALIZED_NAME_VPCS_EVERY = "vpcs_every";

    @SerializedName(SERIALIZED_NAME_VPCS_EVERY)
    private VirtualPrivateCloudWhereInput vpcsEvery;

    public static final String SERIALIZED_NAME_VPCS_NONE = "vpcs_none";

    @SerializedName(SERIALIZED_NAME_VPCS_NONE)
    private VirtualPrivateCloudWhereInput vpcsNone;

    public static final String SERIALIZED_NAME_VPCS_SOME = "vpcs_some";

    @SerializedName(SERIALIZED_NAME_VPCS_SOME)
    private VirtualPrivateCloudWhereInput vpcsSome;

    public VirtualPrivateCloudServiceWhereInput() {}

    public VirtualPrivateCloudServiceWhereInput AND(
            List<VirtualPrivateCloudServiceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addANDItem(
            VirtualPrivateCloudServiceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudServiceWhereInput>();
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
    public List<VirtualPrivateCloudServiceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudServiceWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudServiceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput NOT(
            List<VirtualPrivateCloudServiceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addNOTItem(
            VirtualPrivateCloudServiceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudServiceWhereInput>();
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
    public List<VirtualPrivateCloudServiceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudServiceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudServiceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput OR(List<VirtualPrivateCloudServiceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addORItem(
            VirtualPrivateCloudServiceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudServiceWhereInput>();
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
    public List<VirtualPrivateCloudServiceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudServiceWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudServiceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput clusterBindingsEvery(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsEvery) {

        this.clusterBindingsEvery = clusterBindingsEvery;
        return this;
    }

    /**
     * Get clusterBindingsEvery
     *
     * @return clusterBindingsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudClusterBindingWhereInput getClusterBindingsEvery() {
        return clusterBindingsEvery;
    }

    public void setClusterBindingsEvery(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsEvery) {
        this.clusterBindingsEvery = clusterBindingsEvery;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY);
        return this;
    }

    public void setClusterBindingsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY);
        }
    }

    public boolean getClusterBindingsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_BINDINGS_EVERY);
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsNone(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsNone) {

        this.clusterBindingsNone = clusterBindingsNone;
        return this;
    }

    /**
     * Get clusterBindingsNone
     *
     * @return clusterBindingsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudClusterBindingWhereInput getClusterBindingsNone() {
        return clusterBindingsNone;
    }

    public void setClusterBindingsNone(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsNone) {
        this.clusterBindingsNone = clusterBindingsNone;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE);
        return this;
    }

    public void setClusterBindingsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE);
        }
    }

    public boolean getClusterBindingsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_BINDINGS_NONE);
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsSome(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsSome) {

        this.clusterBindingsSome = clusterBindingsSome;
        return this;
    }

    /**
     * Get clusterBindingsSome
     *
     * @return clusterBindingsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudClusterBindingWhereInput getClusterBindingsSome() {
        return clusterBindingsSome;
    }

    public void setClusterBindingsSome(
            VirtualPrivateCloudClusterBindingWhereInput clusterBindingsSome) {
        this.clusterBindingsSome = clusterBindingsSome;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput clusterBindingsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME);
        return this;
    }

    public void setClusterBindingsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME);
        }
    }

    public boolean getClusterBindingsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_BINDINGS_SOME);
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsEvery(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsEvery) {

        this.edgeGatewayGroupsEvery = edgeGatewayGroupsEvery;
        return this;
    }

    /**
     * Get edgeGatewayGroupsEvery
     *
     * @return edgeGatewayGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayGroupWhereInput getEdgeGatewayGroupsEvery() {
        return edgeGatewayGroupsEvery;
    }

    public void setEdgeGatewayGroupsEvery(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsEvery) {
        this.edgeGatewayGroupsEvery = edgeGatewayGroupsEvery;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY);
        return this;
    }

    public void setEdgeGatewayGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY);
        }
    }

    public boolean getEdgeGatewayGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_EVERY);
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsNone(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsNone) {

        this.edgeGatewayGroupsNone = edgeGatewayGroupsNone;
        return this;
    }

    /**
     * Get edgeGatewayGroupsNone
     *
     * @return edgeGatewayGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayGroupWhereInput getEdgeGatewayGroupsNone() {
        return edgeGatewayGroupsNone;
    }

    public void setEdgeGatewayGroupsNone(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsNone) {
        this.edgeGatewayGroupsNone = edgeGatewayGroupsNone;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE);
        return this;
    }

    public void setEdgeGatewayGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE);
        }
    }

    public boolean getEdgeGatewayGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_NONE);
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsSome(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsSome) {

        this.edgeGatewayGroupsSome = edgeGatewayGroupsSome;
        return this;
    }

    /**
     * Get edgeGatewayGroupsSome
     *
     * @return edgeGatewayGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudEdgeGatewayGroupWhereInput getEdgeGatewayGroupsSome() {
        return edgeGatewayGroupsSome;
    }

    public void setEdgeGatewayGroupsSome(
            VirtualPrivateCloudEdgeGatewayGroupWhereInput edgeGatewayGroupsSome) {
        this.edgeGatewayGroupsSome = edgeGatewayGroupsSome;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewayGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME);
        return this;
    }

    public void setEdgeGatewayGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME);
        }
    }

    public boolean getEdgeGatewayGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_GROUPS_SOME);
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysEvery(
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

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_EVERY);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysEvery_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysNone(
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

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_NONE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysNone_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysSome(
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

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS_SOME);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput edgeGatewaysSome_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput everouteCluster(
            EverouteClusterWhereInput everouteCluster) {

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

    public VirtualPrivateCloudServiceWhereInput everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput everouteCluster_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput externalSubnetsEvery(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsEvery) {

        this.externalSubnetsEvery = externalSubnetsEvery;
        return this;
    }

    /**
     * Get externalSubnetsEvery
     *
     * @return externalSubnetsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudExternalSubnetWhereInput getExternalSubnetsEvery() {
        return externalSubnetsEvery;
    }

    public void setExternalSubnetsEvery(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsEvery) {
        this.externalSubnetsEvery = externalSubnetsEvery;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY);
        return this;
    }

    public void setExternalSubnetsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY);
        }
    }

    public boolean getExternalSubnetsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNETS_EVERY);
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsNone(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsNone) {

        this.externalSubnetsNone = externalSubnetsNone;
        return this;
    }

    /**
     * Get externalSubnetsNone
     *
     * @return externalSubnetsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudExternalSubnetWhereInput getExternalSubnetsNone() {
        return externalSubnetsNone;
    }

    public void setExternalSubnetsNone(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsNone) {
        this.externalSubnetsNone = externalSubnetsNone;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE);
        return this;
    }

    public void setExternalSubnetsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE);
        }
    }

    public boolean getExternalSubnetsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNETS_NONE);
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsSome(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsSome) {

        this.externalSubnetsSome = externalSubnetsSome;
        return this;
    }

    /**
     * Get externalSubnetsSome
     *
     * @return externalSubnetsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudExternalSubnetWhereInput getExternalSubnetsSome() {
        return externalSubnetsSome;
    }

    public void setExternalSubnetsSome(
            VirtualPrivateCloudExternalSubnetWhereInput externalSubnetsSome) {
        this.externalSubnetsSome = externalSubnetsSome;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput externalSubnetsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME);
        return this;
    }

    public void setExternalSubnetsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME);
        }
    }

    public boolean getExternalSubnetsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNETS_SOME);
    }

    public VirtualPrivateCloudServiceWhereInput id(String id) {

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

    public VirtualPrivateCloudServiceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudServiceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudServiceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudServiceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudServiceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudServiceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudServiceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudServiceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudServiceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudServiceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudServiceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudServiceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudServiceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudServiceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudServiceWhereInput internalCidr(String internalCidr) {

        this.internalCidr = internalCidr;
        return this;
    }

    /**
     * Get internalCidr
     *
     * @return internalCidr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidr() {
        return internalCidr;
    }

    public void setInternalCidr(String internalCidr) {
        this.internalCidr = internalCidr;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR);
        return this;
    }

    public void setInternalCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR);
        }
    }

    public boolean getInternalCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrContains(String internalCidrContains) {

        this.internalCidrContains = internalCidrContains;
        return this;
    }

    /**
     * Get internalCidrContains
     *
     * @return internalCidrContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrContains() {
        return internalCidrContains;
    }

    public void setInternalCidrContains(String internalCidrContains) {
        this.internalCidrContains = internalCidrContains;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS);
        return this;
    }

    public void setInternalCidrContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS);
        }
    }

    public boolean getInternalCidrContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_CONTAINS);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrEndsWith(String internalCidrEndsWith) {

        this.internalCidrEndsWith = internalCidrEndsWith;
        return this;
    }

    /**
     * Get internalCidrEndsWith
     *
     * @return internalCidrEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrEndsWith() {
        return internalCidrEndsWith;
    }

    public void setInternalCidrEndsWith(String internalCidrEndsWith) {
        this.internalCidrEndsWith = internalCidrEndsWith;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH);
        return this;
    }

    public void setInternalCidrEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH);
        }
    }

    public boolean getInternalCidrEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_ENDS_WITH);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGt(String internalCidrGt) {

        this.internalCidrGt = internalCidrGt;
        return this;
    }

    /**
     * Get internalCidrGt
     *
     * @return internalCidrGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrGt() {
        return internalCidrGt;
    }

    public void setInternalCidrGt(String internalCidrGt) {
        this.internalCidrGt = internalCidrGt;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_GT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_GT);
        return this;
    }

    public void setInternalCidrGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_GT);
        }
    }

    public boolean getInternalCidrGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_GT);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGte(String internalCidrGte) {

        this.internalCidrGte = internalCidrGte;
        return this;
    }

    /**
     * Get internalCidrGte
     *
     * @return internalCidrGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrGte() {
        return internalCidrGte;
    }

    public void setInternalCidrGte(String internalCidrGte) {
        this.internalCidrGte = internalCidrGte;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_GTE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_GTE);
        return this;
    }

    public void setInternalCidrGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_GTE);
        }
    }

    public boolean getInternalCidrGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_GTE);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrIn(List<String> internalCidrIn) {

        this.internalCidrIn = internalCidrIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addInternalCidrInItem(String internalCidrInItem) {
        if (this.internalCidrIn == null) {
            this.internalCidrIn = new ArrayList<String>();
        }
        this.internalCidrIn.add(internalCidrInItem);
        return this;
    }

    /**
     * Get internalCidrIn
     *
     * @return internalCidrIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInternalCidrIn() {
        return internalCidrIn;
    }

    public void setInternalCidrIn(List<String> internalCidrIn) {
        this.internalCidrIn = internalCidrIn;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_IN);
        return this;
    }

    public void setInternalCidrIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_IN);
        }
    }

    public boolean getInternalCidrIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_IN);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLt(String internalCidrLt) {

        this.internalCidrLt = internalCidrLt;
        return this;
    }

    /**
     * Get internalCidrLt
     *
     * @return internalCidrLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrLt() {
        return internalCidrLt;
    }

    public void setInternalCidrLt(String internalCidrLt) {
        this.internalCidrLt = internalCidrLt;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_LT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_LT);
        return this;
    }

    public void setInternalCidrLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_LT);
        }
    }

    public boolean getInternalCidrLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_LT);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLte(String internalCidrLte) {

        this.internalCidrLte = internalCidrLte;
        return this;
    }

    /**
     * Get internalCidrLte
     *
     * @return internalCidrLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrLte() {
        return internalCidrLte;
    }

    public void setInternalCidrLte(String internalCidrLte) {
        this.internalCidrLte = internalCidrLte;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_LTE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_LTE);
        return this;
    }

    public void setInternalCidrLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_LTE);
        }
    }

    public boolean getInternalCidrLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_LTE);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNot(String internalCidrNot) {

        this.internalCidrNot = internalCidrNot;
        return this;
    }

    /**
     * Get internalCidrNot
     *
     * @return internalCidrNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrNot() {
        return internalCidrNot;
    }

    public void setInternalCidrNot(String internalCidrNot) {
        this.internalCidrNot = internalCidrNot;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT);
        return this;
    }

    public void setInternalCidrNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT);
        }
    }

    public boolean getInternalCidrNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_NOT);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotContains(
            String internalCidrNotContains) {

        this.internalCidrNotContains = internalCidrNotContains;
        return this;
    }

    /**
     * Get internalCidrNotContains
     *
     * @return internalCidrNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrNotContains() {
        return internalCidrNotContains;
    }

    public void setInternalCidrNotContains(String internalCidrNotContains) {
        this.internalCidrNotContains = internalCidrNotContains;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS);
        return this;
    }

    public void setInternalCidrNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS);
        }
    }

    public boolean getInternalCidrNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_NOT_CONTAINS);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotEndsWith(
            String internalCidrNotEndsWith) {

        this.internalCidrNotEndsWith = internalCidrNotEndsWith;
        return this;
    }

    /**
     * Get internalCidrNotEndsWith
     *
     * @return internalCidrNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrNotEndsWith() {
        return internalCidrNotEndsWith;
    }

    public void setInternalCidrNotEndsWith(String internalCidrNotEndsWith) {
        this.internalCidrNotEndsWith = internalCidrNotEndsWith;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH);
        return this;
    }

    public void setInternalCidrNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH);
        }
    }

    public boolean getInternalCidrNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotIn(List<String> internalCidrNotIn) {

        this.internalCidrNotIn = internalCidrNotIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addInternalCidrNotInItem(
            String internalCidrNotInItem) {
        if (this.internalCidrNotIn == null) {
            this.internalCidrNotIn = new ArrayList<String>();
        }
        this.internalCidrNotIn.add(internalCidrNotInItem);
        return this;
    }

    /**
     * Get internalCidrNotIn
     *
     * @return internalCidrNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInternalCidrNotIn() {
        return internalCidrNotIn;
    }

    public void setInternalCidrNotIn(List<String> internalCidrNotIn) {
        this.internalCidrNotIn = internalCidrNotIn;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN);
        return this;
    }

    public void setInternalCidrNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN);
        }
    }

    public boolean getInternalCidrNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_NOT_IN);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotStartsWith(
            String internalCidrNotStartsWith) {

        this.internalCidrNotStartsWith = internalCidrNotStartsWith;
        return this;
    }

    /**
     * Get internalCidrNotStartsWith
     *
     * @return internalCidrNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrNotStartsWith() {
        return internalCidrNotStartsWith;
    }

    public void setInternalCidrNotStartsWith(String internalCidrNotStartsWith) {
        this.internalCidrNotStartsWith = internalCidrNotStartsWith;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH);
        return this;
    }

    public void setInternalCidrNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH);
        }
    }

    public boolean getInternalCidrNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrStartsWith(
            String internalCidrStartsWith) {

        this.internalCidrStartsWith = internalCidrStartsWith;
        return this;
    }

    /**
     * Get internalCidrStartsWith
     *
     * @return internalCidrStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInternalCidrStartsWith() {
        return internalCidrStartsWith;
    }

    public void setInternalCidrStartsWith(String internalCidrStartsWith) {
        this.internalCidrStartsWith = internalCidrStartsWith;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput internalCidrStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH);
        return this;
    }

    public void setInternalCidrStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH);
        }
    }

    public boolean getInternalCidrStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_CIDR_STARTS_WITH);
    }

    public VirtualPrivateCloudServiceWhereInput phase(EverouteClusterPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public VirtualPrivateCloudServiceWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public VirtualPrivateCloudServiceWhereInput phaseIn(List<EverouteClusterPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addPhaseInItem(EverouteClusterPhase phaseInItem) {
        if (this.phaseIn == null) {
            this.phaseIn = new ArrayList<EverouteClusterPhase>();
        }
        this.phaseIn.add(phaseInItem);
        return this;
    }

    /**
     * Get phaseIn
     *
     * @return phaseIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EverouteClusterPhase> getPhaseIn() {
        return phaseIn;
    }

    public void setPhaseIn(List<EverouteClusterPhase> phaseIn) {
        this.phaseIn = phaseIn;
    }

    public VirtualPrivateCloudServiceWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput phaseIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public void setPhaseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        }
    }

    public boolean getPhaseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_IN);
    }

    public VirtualPrivateCloudServiceWhereInput phaseNot(EverouteClusterPhase phaseNot) {

        this.phaseNot = phaseNot;
        return this;
    }

    /**
     * Get phaseNot
     *
     * @return phaseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhaseNot() {
        return phaseNot;
    }

    public void setPhaseNot(EverouteClusterPhase phaseNot) {
        this.phaseNot = phaseNot;
    }

    public VirtualPrivateCloudServiceWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput phaseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public void setPhaseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        }
    }

    public boolean getPhaseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT);
    }

    public VirtualPrivateCloudServiceWhereInput phaseNotIn(List<EverouteClusterPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput addPhaseNotInItem(
            EverouteClusterPhase phaseNotInItem) {
        if (this.phaseNotIn == null) {
            this.phaseNotIn = new ArrayList<EverouteClusterPhase>();
        }
        this.phaseNotIn.add(phaseNotInItem);
        return this;
    }

    /**
     * Get phaseNotIn
     *
     * @return phaseNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EverouteClusterPhase> getPhaseNotIn() {
        return phaseNotIn;
    }

    public void setPhaseNotIn(List<EverouteClusterPhase> phaseNotIn) {
        this.phaseNotIn = phaseNotIn;
    }

    public VirtualPrivateCloudServiceWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput phaseNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public void setPhaseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        }
    }

    public boolean getPhaseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT_IN);
    }

    public VirtualPrivateCloudServiceWhereInput vpcsEvery(VirtualPrivateCloudWhereInput vpcsEvery) {

        this.vpcsEvery = vpcsEvery;
        return this;
    }

    /**
     * Get vpcsEvery
     *
     * @return vpcsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudWhereInput getVpcsEvery() {
        return vpcsEvery;
    }

    public void setVpcsEvery(VirtualPrivateCloudWhereInput vpcsEvery) {
        this.vpcsEvery = vpcsEvery;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPCS_EVERY);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPCS_EVERY);
        return this;
    }

    public void setVpcsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPCS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPCS_EVERY);
        }
    }

    public boolean getVpcsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPCS_EVERY);
    }

    public VirtualPrivateCloudServiceWhereInput vpcsNone(VirtualPrivateCloudWhereInput vpcsNone) {

        this.vpcsNone = vpcsNone;
        return this;
    }

    /**
     * Get vpcsNone
     *
     * @return vpcsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudWhereInput getVpcsNone() {
        return vpcsNone;
    }

    public void setVpcsNone(VirtualPrivateCloudWhereInput vpcsNone) {
        this.vpcsNone = vpcsNone;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPCS_NONE);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPCS_NONE);
        return this;
    }

    public void setVpcsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPCS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPCS_NONE);
        }
    }

    public boolean getVpcsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPCS_NONE);
    }

    public VirtualPrivateCloudServiceWhereInput vpcsSome(VirtualPrivateCloudWhereInput vpcsSome) {

        this.vpcsSome = vpcsSome;
        return this;
    }

    /**
     * Get vpcsSome
     *
     * @return vpcsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudWhereInput getVpcsSome() {
        return vpcsSome;
    }

    public void setVpcsSome(VirtualPrivateCloudWhereInput vpcsSome) {
        this.vpcsSome = vpcsSome;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPCS_SOME);
        return this;
    }

    public VirtualPrivateCloudServiceWhereInput vpcsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPCS_SOME);
        return this;
    }

    public void setVpcsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPCS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPCS_SOME);
        }
    }

    public boolean getVpcsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPCS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudServiceWhereInput virtualPrivateCloudServiceWhereInput =
                (VirtualPrivateCloudServiceWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudServiceWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudServiceWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudServiceWhereInput.OR)
                && Objects.equals(
                        this.clusterBindingsEvery,
                        virtualPrivateCloudServiceWhereInput.clusterBindingsEvery)
                && Objects.equals(
                        this.clusterBindingsNone,
                        virtualPrivateCloudServiceWhereInput.clusterBindingsNone)
                && Objects.equals(
                        this.clusterBindingsSome,
                        virtualPrivateCloudServiceWhereInput.clusterBindingsSome)
                && Objects.equals(
                        this.edgeGatewayGroupsEvery,
                        virtualPrivateCloudServiceWhereInput.edgeGatewayGroupsEvery)
                && Objects.equals(
                        this.edgeGatewayGroupsNone,
                        virtualPrivateCloudServiceWhereInput.edgeGatewayGroupsNone)
                && Objects.equals(
                        this.edgeGatewayGroupsSome,
                        virtualPrivateCloudServiceWhereInput.edgeGatewayGroupsSome)
                && Objects.equals(
                        this.edgeGatewaysEvery,
                        virtualPrivateCloudServiceWhereInput.edgeGatewaysEvery)
                && Objects.equals(
                        this.edgeGatewaysNone,
                        virtualPrivateCloudServiceWhereInput.edgeGatewaysNone)
                && Objects.equals(
                        this.edgeGatewaysSome,
                        virtualPrivateCloudServiceWhereInput.edgeGatewaysSome)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudServiceWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudServiceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudServiceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudServiceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.everouteCluster, virtualPrivateCloudServiceWhereInput.everouteCluster)
                && Objects.equals(
                        this.externalSubnetsEvery,
                        virtualPrivateCloudServiceWhereInput.externalSubnetsEvery)
                && Objects.equals(
                        this.externalSubnetsNone,
                        virtualPrivateCloudServiceWhereInput.externalSubnetsNone)
                && Objects.equals(
                        this.externalSubnetsSome,
                        virtualPrivateCloudServiceWhereInput.externalSubnetsSome)
                && Objects.equals(this.id, virtualPrivateCloudServiceWhereInput.id)
                && Objects.equals(this.idContains, virtualPrivateCloudServiceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, virtualPrivateCloudServiceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudServiceWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudServiceWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudServiceWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudServiceWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudServiceWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudServiceWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, virtualPrivateCloudServiceWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, virtualPrivateCloudServiceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, virtualPrivateCloudServiceWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, virtualPrivateCloudServiceWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, virtualPrivateCloudServiceWhereInput.idStartsWith)
                && Objects.equals(
                        this.internalCidr, virtualPrivateCloudServiceWhereInput.internalCidr)
                && Objects.equals(
                        this.internalCidrContains,
                        virtualPrivateCloudServiceWhereInput.internalCidrContains)
                && Objects.equals(
                        this.internalCidrEndsWith,
                        virtualPrivateCloudServiceWhereInput.internalCidrEndsWith)
                && Objects.equals(
                        this.internalCidrGt, virtualPrivateCloudServiceWhereInput.internalCidrGt)
                && Objects.equals(
                        this.internalCidrGte, virtualPrivateCloudServiceWhereInput.internalCidrGte)
                && Objects.equals(
                        this.internalCidrIn, virtualPrivateCloudServiceWhereInput.internalCidrIn)
                && Objects.equals(
                        this.internalCidrLt, virtualPrivateCloudServiceWhereInput.internalCidrLt)
                && Objects.equals(
                        this.internalCidrLte, virtualPrivateCloudServiceWhereInput.internalCidrLte)
                && Objects.equals(
                        this.internalCidrNot, virtualPrivateCloudServiceWhereInput.internalCidrNot)
                && Objects.equals(
                        this.internalCidrNotContains,
                        virtualPrivateCloudServiceWhereInput.internalCidrNotContains)
                && Objects.equals(
                        this.internalCidrNotEndsWith,
                        virtualPrivateCloudServiceWhereInput.internalCidrNotEndsWith)
                && Objects.equals(
                        this.internalCidrNotIn,
                        virtualPrivateCloudServiceWhereInput.internalCidrNotIn)
                && Objects.equals(
                        this.internalCidrNotStartsWith,
                        virtualPrivateCloudServiceWhereInput.internalCidrNotStartsWith)
                && Objects.equals(
                        this.internalCidrStartsWith,
                        virtualPrivateCloudServiceWhereInput.internalCidrStartsWith)
                && Objects.equals(this.phase, virtualPrivateCloudServiceWhereInput.phase)
                && Objects.equals(this.phaseIn, virtualPrivateCloudServiceWhereInput.phaseIn)
                && Objects.equals(this.phaseNot, virtualPrivateCloudServiceWhereInput.phaseNot)
                && Objects.equals(this.phaseNotIn, virtualPrivateCloudServiceWhereInput.phaseNotIn)
                && Objects.equals(this.vpcsEvery, virtualPrivateCloudServiceWhereInput.vpcsEvery)
                && Objects.equals(this.vpcsNone, virtualPrivateCloudServiceWhereInput.vpcsNone)
                && Objects.equals(this.vpcsSome, virtualPrivateCloudServiceWhereInput.vpcsSome);
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
                clusterBindingsEvery,
                clusterBindingsNone,
                clusterBindingsSome,
                edgeGatewayGroupsEvery,
                edgeGatewayGroupsNone,
                edgeGatewayGroupsSome,
                edgeGatewaysEvery,
                edgeGatewaysNone,
                edgeGatewaysSome,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                everouteCluster,
                externalSubnetsEvery,
                externalSubnetsNone,
                externalSubnetsSome,
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
                internalCidr,
                internalCidrContains,
                internalCidrEndsWith,
                internalCidrGt,
                internalCidrGte,
                internalCidrIn,
                internalCidrLt,
                internalCidrLte,
                internalCidrNot,
                internalCidrNotContains,
                internalCidrNotEndsWith,
                internalCidrNotIn,
                internalCidrNotStartsWith,
                internalCidrStartsWith,
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                vpcsEvery,
                vpcsNone,
                vpcsSome);
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
        sb.append("class VirtualPrivateCloudServiceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    clusterBindingsEvery: ")
                .append(toIndentedString(clusterBindingsEvery))
                .append("\n");
        sb.append("    clusterBindingsNone: ")
                .append(toIndentedString(clusterBindingsNone))
                .append("\n");
        sb.append("    clusterBindingsSome: ")
                .append(toIndentedString(clusterBindingsSome))
                .append("\n");
        sb.append("    edgeGatewayGroupsEvery: ")
                .append(toIndentedString(edgeGatewayGroupsEvery))
                .append("\n");
        sb.append("    edgeGatewayGroupsNone: ")
                .append(toIndentedString(edgeGatewayGroupsNone))
                .append("\n");
        sb.append("    edgeGatewayGroupsSome: ")
                .append(toIndentedString(edgeGatewayGroupsSome))
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
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    externalSubnetsEvery: ")
                .append(toIndentedString(externalSubnetsEvery))
                .append("\n");
        sb.append("    externalSubnetsNone: ")
                .append(toIndentedString(externalSubnetsNone))
                .append("\n");
        sb.append("    externalSubnetsSome: ")
                .append(toIndentedString(externalSubnetsSome))
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
        sb.append("    internalCidr: ").append(toIndentedString(internalCidr)).append("\n");
        sb.append("    internalCidrContains: ")
                .append(toIndentedString(internalCidrContains))
                .append("\n");
        sb.append("    internalCidrEndsWith: ")
                .append(toIndentedString(internalCidrEndsWith))
                .append("\n");
        sb.append("    internalCidrGt: ").append(toIndentedString(internalCidrGt)).append("\n");
        sb.append("    internalCidrGte: ").append(toIndentedString(internalCidrGte)).append("\n");
        sb.append("    internalCidrIn: ").append(toIndentedString(internalCidrIn)).append("\n");
        sb.append("    internalCidrLt: ").append(toIndentedString(internalCidrLt)).append("\n");
        sb.append("    internalCidrLte: ").append(toIndentedString(internalCidrLte)).append("\n");
        sb.append("    internalCidrNot: ").append(toIndentedString(internalCidrNot)).append("\n");
        sb.append("    internalCidrNotContains: ")
                .append(toIndentedString(internalCidrNotContains))
                .append("\n");
        sb.append("    internalCidrNotEndsWith: ")
                .append(toIndentedString(internalCidrNotEndsWith))
                .append("\n");
        sb.append("    internalCidrNotIn: ")
                .append(toIndentedString(internalCidrNotIn))
                .append("\n");
        sb.append("    internalCidrNotStartsWith: ")
                .append(toIndentedString(internalCidrNotStartsWith))
                .append("\n");
        sb.append("    internalCidrStartsWith: ")
                .append(toIndentedString(internalCidrStartsWith))
                .append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    vpcsEvery: ").append(toIndentedString(vpcsEvery)).append("\n");
        sb.append("    vpcsNone: ").append(toIndentedString(vpcsNone)).append("\n");
        sb.append("    vpcsSome: ").append(toIndentedString(vpcsSome)).append("\n");
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
