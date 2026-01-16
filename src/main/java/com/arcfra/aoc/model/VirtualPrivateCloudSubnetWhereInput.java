package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudSubnetWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSubnetWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VirtualPrivateCloudSubnetWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VirtualPrivateCloudSubnetWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VirtualPrivateCloudSubnetWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CIDR = "cidr";

    @SerializedName(SERIALIZED_NAME_CIDR)
    private String cidr;

    public static final String SERIALIZED_NAME_CIDR_CONTAINS = "cidr_contains";

    @SerializedName(SERIALIZED_NAME_CIDR_CONTAINS)
    private String cidrContains;

    public static final String SERIALIZED_NAME_CIDR_ENDS_WITH = "cidr_ends_with";

    @SerializedName(SERIALIZED_NAME_CIDR_ENDS_WITH)
    private String cidrEndsWith;

    public static final String SERIALIZED_NAME_CIDR_GT = "cidr_gt";

    @SerializedName(SERIALIZED_NAME_CIDR_GT)
    private String cidrGt;

    public static final String SERIALIZED_NAME_CIDR_GTE = "cidr_gte";

    @SerializedName(SERIALIZED_NAME_CIDR_GTE)
    private String cidrGte;

    public static final String SERIALIZED_NAME_CIDR_IN = "cidr_in";

    @SerializedName(SERIALIZED_NAME_CIDR_IN)
    private List<String> cidrIn = null;

    public static final String SERIALIZED_NAME_CIDR_LT = "cidr_lt";

    @SerializedName(SERIALIZED_NAME_CIDR_LT)
    private String cidrLt;

    public static final String SERIALIZED_NAME_CIDR_LTE = "cidr_lte";

    @SerializedName(SERIALIZED_NAME_CIDR_LTE)
    private String cidrLte;

    public static final String SERIALIZED_NAME_CIDR_NOT = "cidr_not";

    @SerializedName(SERIALIZED_NAME_CIDR_NOT)
    private String cidrNot;

    public static final String SERIALIZED_NAME_CIDR_NOT_CONTAINS = "cidr_not_contains";

    @SerializedName(SERIALIZED_NAME_CIDR_NOT_CONTAINS)
    private String cidrNotContains;

    public static final String SERIALIZED_NAME_CIDR_NOT_ENDS_WITH = "cidr_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH)
    private String cidrNotEndsWith;

    public static final String SERIALIZED_NAME_CIDR_NOT_IN = "cidr_not_in";

    @SerializedName(SERIALIZED_NAME_CIDR_NOT_IN)
    private List<String> cidrNotIn = null;

    public static final String SERIALIZED_NAME_CIDR_NOT_STARTS_WITH = "cidr_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH)
    private String cidrNotStartsWith;

    public static final String SERIALIZED_NAME_CIDR_STARTS_WITH = "cidr_starts_with";

    @SerializedName(SERIALIZED_NAME_CIDR_STARTS_WITH)
    private String cidrStartsWith;

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

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_GATEWAY_CONTAINS = "gateway_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_CONTAINS)
    private String gatewayContains;

    public static final String SERIALIZED_NAME_GATEWAY_ENDS_WITH = "gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_ENDS_WITH)
    private String gatewayEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_GT = "gateway_gt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_GT)
    private String gatewayGt;

    public static final String SERIALIZED_NAME_GATEWAY_GTE = "gateway_gte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_GTE)
    private String gatewayGte;

    public static final String SERIALIZED_NAME_GATEWAY_IN = "gateway_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IN)
    private List<String> gatewayIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_LT = "gateway_lt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_LT)
    private String gatewayLt;

    public static final String SERIALIZED_NAME_GATEWAY_LTE = "gateway_lte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_LTE)
    private String gatewayLte;

    public static final String SERIALIZED_NAME_GATEWAY_NOT = "gateway_not";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT)
    private String gatewayNot;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_CONTAINS = "gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS)
    private String gatewayNotContains;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH = "gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH)
    private String gatewayNotEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_IN = "gateway_not_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_IN)
    private List<String> gatewayNotIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH = "gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH)
    private String gatewayNotStartsWith;

    public static final String SERIALIZED_NAME_GATEWAY_STARTS_WITH = "gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_STARTS_WITH)
    private String gatewayStartsWith;

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

    public static final String SERIALIZED_NAME_ROUTE_TABLE = "route_table";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE)
    private VirtualPrivateCloudRouteTableWhereInput routeTable;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT = "total_ip_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT)
    private Integer totalIpCount;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_GT = "total_ip_count_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_GT)
    private Integer totalIpCountGt;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_GTE = "total_ip_count_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE)
    private Integer totalIpCountGte;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_IN = "total_ip_count_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_IN)
    private List<Integer> totalIpCountIn = null;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_LT = "total_ip_count_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_LT)
    private Integer totalIpCountLt;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_LTE = "total_ip_count_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE)
    private Integer totalIpCountLte;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_NOT = "total_ip_count_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT)
    private Integer totalIpCountNot;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN = "total_ip_count_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN)
    private List<Integer> totalIpCountNotIn = null;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT = "unused_ip_count";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT)
    private Integer unusedIpCount;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_GT = "unused_ip_count_gt";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_GT)
    private Integer unusedIpCountGt;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_GTE = "unused_ip_count_gte";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE)
    private Integer unusedIpCountGte;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_IN = "unused_ip_count_in";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_IN)
    private List<Integer> unusedIpCountIn = null;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_LT = "unused_ip_count_lt";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_LT)
    private Integer unusedIpCountLt;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_LTE = "unused_ip_count_lte";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE)
    private Integer unusedIpCountLte;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_NOT = "unused_ip_count_not";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT)
    private Integer unusedIpCountNot;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN = "unused_ip_count_not_in";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN)
    private List<Integer> unusedIpCountNotIn = null;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private VirtualPrivateCloudWhereInput vpc;

    public VirtualPrivateCloudSubnetWhereInput() {}

    public VirtualPrivateCloudSubnetWhereInput AND(List<VirtualPrivateCloudSubnetWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addANDItem(
            VirtualPrivateCloudSubnetWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VirtualPrivateCloudSubnetWhereInput>();
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
    public List<VirtualPrivateCloudSubnetWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VirtualPrivateCloudSubnetWhereInput> AND) {
        this.AND = AND;
    }

    public VirtualPrivateCloudSubnetWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput AND_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput NOT(List<VirtualPrivateCloudSubnetWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addNOTItem(
            VirtualPrivateCloudSubnetWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VirtualPrivateCloudSubnetWhereInput>();
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
    public List<VirtualPrivateCloudSubnetWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VirtualPrivateCloudSubnetWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VirtualPrivateCloudSubnetWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput NOT_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput OR(List<VirtualPrivateCloudSubnetWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addORItem(
            VirtualPrivateCloudSubnetWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VirtualPrivateCloudSubnetWhereInput>();
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
    public List<VirtualPrivateCloudSubnetWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VirtualPrivateCloudSubnetWhereInput> OR) {
        this.OR = OR;
    }

    public VirtualPrivateCloudSubnetWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput OR_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput cidr(String cidr) {

        this.cidr = cidr;
        return this;
    }

    /**
     * Get cidr
     *
     * @return cidr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public VirtualPrivateCloudSubnetWhereInput cidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR);
        return this;
    }

    public void setCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR);
        }
    }

    public boolean getCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrContains(String cidrContains) {

        this.cidrContains = cidrContains;
        return this;
    }

    /**
     * Get cidrContains
     *
     * @return cidrContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrContains() {
        return cidrContains;
    }

    public void setCidrContains(String cidrContains) {
        this.cidrContains = cidrContains;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_CONTAINS);
        return this;
    }

    public void setCidrContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_CONTAINS);
        }
    }

    public boolean getCidrContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_CONTAINS);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrEndsWith(String cidrEndsWith) {

        this.cidrEndsWith = cidrEndsWith;
        return this;
    }

    /**
     * Get cidrEndsWith
     *
     * @return cidrEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrEndsWith() {
        return cidrEndsWith;
    }

    public void setCidrEndsWith(String cidrEndsWith) {
        this.cidrEndsWith = cidrEndsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_ENDS_WITH);
        return this;
    }

    public void setCidrEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_ENDS_WITH);
        }
    }

    public boolean getCidrEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_ENDS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGt(String cidrGt) {

        this.cidrGt = cidrGt;
        return this;
    }

    /**
     * Get cidrGt
     *
     * @return cidrGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrGt() {
        return cidrGt;
    }

    public void setCidrGt(String cidrGt) {
        this.cidrGt = cidrGt;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_GT);
        return this;
    }

    public void setCidrGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_GT);
        }
    }

    public boolean getCidrGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_GT);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGte(String cidrGte) {

        this.cidrGte = cidrGte;
        return this;
    }

    /**
     * Get cidrGte
     *
     * @return cidrGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrGte() {
        return cidrGte;
    }

    public void setCidrGte(String cidrGte) {
        this.cidrGte = cidrGte;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_GTE);
        return this;
    }

    public void setCidrGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_GTE);
        }
    }

    public boolean getCidrGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_GTE);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrIn(List<String> cidrIn) {

        this.cidrIn = cidrIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addCidrInItem(String cidrInItem) {
        if (this.cidrIn == null) {
            this.cidrIn = new ArrayList<String>();
        }
        this.cidrIn.add(cidrInItem);
        return this;
    }

    /**
     * Get cidrIn
     *
     * @return cidrIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCidrIn() {
        return cidrIn;
    }

    public void setCidrIn(List<String> cidrIn) {
        this.cidrIn = cidrIn;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_IN);
        return this;
    }

    public void setCidrIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_IN);
        }
    }

    public boolean getCidrIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLt(String cidrLt) {

        this.cidrLt = cidrLt;
        return this;
    }

    /**
     * Get cidrLt
     *
     * @return cidrLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrLt() {
        return cidrLt;
    }

    public void setCidrLt(String cidrLt) {
        this.cidrLt = cidrLt;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_LT);
        return this;
    }

    public void setCidrLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_LT);
        }
    }

    public boolean getCidrLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_LT);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLte(String cidrLte) {

        this.cidrLte = cidrLte;
        return this;
    }

    /**
     * Get cidrLte
     *
     * @return cidrLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrLte() {
        return cidrLte;
    }

    public void setCidrLte(String cidrLte) {
        this.cidrLte = cidrLte;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_LTE);
        return this;
    }

    public void setCidrLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_LTE);
        }
    }

    public boolean getCidrLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_LTE);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNot(String cidrNot) {

        this.cidrNot = cidrNot;
        return this;
    }

    /**
     * Get cidrNot
     *
     * @return cidrNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrNot() {
        return cidrNot;
    }

    public void setCidrNot(String cidrNot) {
        this.cidrNot = cidrNot;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT);
        return this;
    }

    public void setCidrNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT);
        }
    }

    public boolean getCidrNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_NOT);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotContains(String cidrNotContains) {

        this.cidrNotContains = cidrNotContains;
        return this;
    }

    /**
     * Get cidrNotContains
     *
     * @return cidrNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrNotContains() {
        return cidrNotContains;
    }

    public void setCidrNotContains(String cidrNotContains) {
        this.cidrNotContains = cidrNotContains;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_CONTAINS);
        return this;
    }

    public void setCidrNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_CONTAINS);
        }
    }

    public boolean getCidrNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_NOT_CONTAINS);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotEndsWith(String cidrNotEndsWith) {

        this.cidrNotEndsWith = cidrNotEndsWith;
        return this;
    }

    /**
     * Get cidrNotEndsWith
     *
     * @return cidrNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrNotEndsWith() {
        return cidrNotEndsWith;
    }

    public void setCidrNotEndsWith(String cidrNotEndsWith) {
        this.cidrNotEndsWith = cidrNotEndsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH);
        return this;
    }

    public void setCidrNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH);
        }
    }

    public boolean getCidrNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotIn(List<String> cidrNotIn) {

        this.cidrNotIn = cidrNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addCidrNotInItem(String cidrNotInItem) {
        if (this.cidrNotIn == null) {
            this.cidrNotIn = new ArrayList<String>();
        }
        this.cidrNotIn.add(cidrNotInItem);
        return this;
    }

    /**
     * Get cidrNotIn
     *
     * @return cidrNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCidrNotIn() {
        return cidrNotIn;
    }

    public void setCidrNotIn(List<String> cidrNotIn) {
        this.cidrNotIn = cidrNotIn;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_IN);
        return this;
    }

    public void setCidrNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_IN);
        }
    }

    public boolean getCidrNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_NOT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotStartsWith(String cidrNotStartsWith) {

        this.cidrNotStartsWith = cidrNotStartsWith;
        return this;
    }

    /**
     * Get cidrNotStartsWith
     *
     * @return cidrNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrNotStartsWith() {
        return cidrNotStartsWith;
    }

    public void setCidrNotStartsWith(String cidrNotStartsWith) {
        this.cidrNotStartsWith = cidrNotStartsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH);
        return this;
    }

    public void setCidrNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH);
        }
    }

    public boolean getCidrNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput cidrStartsWith(String cidrStartsWith) {

        this.cidrStartsWith = cidrStartsWith;
        return this;
    }

    /**
     * Get cidrStartsWith
     *
     * @return cidrStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCidrStartsWith() {
        return cidrStartsWith;
    }

    public void setCidrStartsWith(String cidrStartsWith) {
        this.cidrStartsWith = cidrStartsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput cidrStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR_STARTS_WITH);
        return this;
    }

    public void setCidrStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR_STARTS_WITH);
        }
    }

    public boolean getCidrStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR_STARTS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput description(String description) {

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

    public VirtualPrivateCloudSubnetWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionContains(String descriptionContains) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionGt(String descriptionGt) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionGte(String descriptionGte) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionLt(String descriptionLt) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionLte(String descriptionLte) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNot(String descriptionNot) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotContains(
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotEndsWith(
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addDescriptionNotInItem(
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotStartsWith(
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

    public VirtualPrivateCloudSubnetWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatus(
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addEntityAsyncStatusInItem(
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNot(
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addEntityAsyncStatusNotInItem(
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

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public VirtualPrivateCloudSubnetWhereInput gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public void setGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        }
    }

    public boolean getGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayContains(String gatewayContains) {

        this.gatewayContains = gatewayContains;
        return this;
    }

    /**
     * Get gatewayContains
     *
     * @return gatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayContains() {
        return gatewayContains;
    }

    public void setGatewayContains(String gatewayContains) {
        this.gatewayContains = gatewayContains;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_CONTAINS);
        return this;
    }

    public void setGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_CONTAINS);
        }
    }

    public boolean getGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_CONTAINS);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayEndsWith(String gatewayEndsWith) {

        this.gatewayEndsWith = gatewayEndsWith;
        return this;
    }

    /**
     * Get gatewayEndsWith
     *
     * @return gatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayEndsWith() {
        return gatewayEndsWith;
    }

    public void setGatewayEndsWith(String gatewayEndsWith) {
        this.gatewayEndsWith = gatewayEndsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGt(String gatewayGt) {

        this.gatewayGt = gatewayGt;
        return this;
    }

    /**
     * Get gatewayGt
     *
     * @return gatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayGt() {
        return gatewayGt;
    }

    public void setGatewayGt(String gatewayGt) {
        this.gatewayGt = gatewayGt;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GT);
        return this;
    }

    public void setGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GT);
        }
    }

    public boolean getGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_GT);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGte(String gatewayGte) {

        this.gatewayGte = gatewayGte;
        return this;
    }

    /**
     * Get gatewayGte
     *
     * @return gatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayGte() {
        return gatewayGte;
    }

    public void setGatewayGte(String gatewayGte) {
        this.gatewayGte = gatewayGte;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GTE);
        return this;
    }

    public void setGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GTE);
        }
    }

    public boolean getGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_GTE);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayIn(List<String> gatewayIn) {

        this.gatewayIn = gatewayIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addGatewayInItem(String gatewayInItem) {
        if (this.gatewayIn == null) {
            this.gatewayIn = new ArrayList<String>();
        }
        this.gatewayIn.add(gatewayInItem);
        return this;
    }

    /**
     * Get gatewayIn
     *
     * @return gatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayIn() {
        return gatewayIn;
    }

    public void setGatewayIn(List<String> gatewayIn) {
        this.gatewayIn = gatewayIn;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IN);
        return this;
    }

    public void setGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IN);
        }
    }

    public boolean getGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLt(String gatewayLt) {

        this.gatewayLt = gatewayLt;
        return this;
    }

    /**
     * Get gatewayLt
     *
     * @return gatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayLt() {
        return gatewayLt;
    }

    public void setGatewayLt(String gatewayLt) {
        this.gatewayLt = gatewayLt;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LT);
        return this;
    }

    public void setGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LT);
        }
    }

    public boolean getGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_LT);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLte(String gatewayLte) {

        this.gatewayLte = gatewayLte;
        return this;
    }

    /**
     * Get gatewayLte
     *
     * @return gatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayLte() {
        return gatewayLte;
    }

    public void setGatewayLte(String gatewayLte) {
        this.gatewayLte = gatewayLte;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LTE);
        return this;
    }

    public void setGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LTE);
        }
    }

    public boolean getGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_LTE);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNot(String gatewayNot) {

        this.gatewayNot = gatewayNot;
        return this;
    }

    /**
     * Get gatewayNot
     *
     * @return gatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNot() {
        return gatewayNot;
    }

    public void setGatewayNot(String gatewayNot) {
        this.gatewayNot = gatewayNot;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT);
        return this;
    }

    public void setGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT);
        }
    }

    public boolean getGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotContains(String gatewayNotContains) {

        this.gatewayNotContains = gatewayNotContains;
        return this;
    }

    /**
     * Get gatewayNotContains
     *
     * @return gatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotContains() {
        return gatewayNotContains;
    }

    public void setGatewayNotContains(String gatewayNotContains) {
        this.gatewayNotContains = gatewayNotContains;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotEndsWith(String gatewayNotEndsWith) {

        this.gatewayNotEndsWith = gatewayNotEndsWith;
        return this;
    }

    /**
     * Get gatewayNotEndsWith
     *
     * @return gatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotEndsWith() {
        return gatewayNotEndsWith;
    }

    public void setGatewayNotEndsWith(String gatewayNotEndsWith) {
        this.gatewayNotEndsWith = gatewayNotEndsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotIn(List<String> gatewayNotIn) {

        this.gatewayNotIn = gatewayNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addGatewayNotInItem(String gatewayNotInItem) {
        if (this.gatewayNotIn == null) {
            this.gatewayNotIn = new ArrayList<String>();
        }
        this.gatewayNotIn.add(gatewayNotInItem);
        return this;
    }

    /**
     * Get gatewayNotIn
     *
     * @return gatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayNotIn() {
        return gatewayNotIn;
    }

    public void setGatewayNotIn(List<String> gatewayNotIn) {
        this.gatewayNotIn = gatewayNotIn;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_IN);
        return this;
    }

    public void setGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_IN);
        }
    }

    public boolean getGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotStartsWith(String gatewayNotStartsWith) {

        this.gatewayNotStartsWith = gatewayNotStartsWith;
        return this;
    }

    /**
     * Get gatewayNotStartsWith
     *
     * @return gatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotStartsWith() {
        return gatewayNotStartsWith;
    }

    public void setGatewayNotStartsWith(String gatewayNotStartsWith) {
        this.gatewayNotStartsWith = gatewayNotStartsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayStartsWith(String gatewayStartsWith) {

        this.gatewayStartsWith = gatewayStartsWith;
        return this;
    }

    /**
     * Get gatewayStartsWith
     *
     * @return gatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayStartsWith() {
        return gatewayStartsWith;
    }

    public void setGatewayStartsWith(String gatewayStartsWith) {
        this.gatewayStartsWith = gatewayStartsWith;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput gatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
    }

    public VirtualPrivateCloudSubnetWhereInput id(String id) {

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

    public VirtualPrivateCloudSubnetWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idContains(String idContains) {

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

    public VirtualPrivateCloudSubnetWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idEndsWith(String idEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idGt(String idGt) {

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

    public VirtualPrivateCloudSubnetWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idGte(String idGte) {

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

    public VirtualPrivateCloudSubnetWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addIdInItem(String idInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idLt(String idLt) {

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

    public VirtualPrivateCloudSubnetWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idLte(String idLte) {

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

    public VirtualPrivateCloudSubnetWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idNot(String idNot) {

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

    public VirtualPrivateCloudSubnetWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idNotContains(String idNotContains) {

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

    public VirtualPrivateCloudSubnetWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addIdNotInItem(String idNotInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput idStartsWith(String idStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localId(String localId) {

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

    public VirtualPrivateCloudSubnetWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdContains(String localIdContains) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdGt(String localIdGt) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdGte(String localIdGte) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdLt(String localIdLt) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdLte(String localIdLte) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNot(String localIdNot) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNotContains(String localIdNotContains) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput name(String name) {

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

    public VirtualPrivateCloudSubnetWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameContains(String nameContains) {

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

    public VirtualPrivateCloudSubnetWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameEndsWith(String nameEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameGt(String nameGt) {

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

    public VirtualPrivateCloudSubnetWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameGt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameGte(String nameGte) {

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

    public VirtualPrivateCloudSubnetWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameGte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addNameInItem(String nameInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameLt(String nameLt) {

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

    public VirtualPrivateCloudSubnetWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameLt_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameLte(String nameLte) {

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

    public VirtualPrivateCloudSubnetWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameLte_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameNot(String nameNot) {

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

    public VirtualPrivateCloudSubnetWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameNot_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameNotContains(String nameNotContains) {

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

    public VirtualPrivateCloudSubnetWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VirtualPrivateCloudSubnetWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput nameStartsWith(String nameStartsWith) {

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

    public VirtualPrivateCloudSubnetWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput routeTable(
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

    public VirtualPrivateCloudSubnetWhereInput routeTable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput routeTable_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnetWhereInput totalIpCount(Integer totalIpCount) {

        this.totalIpCount = totalIpCount;
        return this;
    }

    /**
     * Get totalIpCount
     *
     * @return totalIpCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCount() {
        return totalIpCount;
    }

    public void setTotalIpCount(Integer totalIpCount) {
        this.totalIpCount = totalIpCount;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT);
        return this;
    }

    public void setTotalIpCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT);
        }
    }

    public boolean getTotalIpCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGt(Integer totalIpCountGt) {

        this.totalIpCountGt = totalIpCountGt;
        return this;
    }

    /**
     * Get totalIpCountGt
     *
     * @return totalIpCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCountGt() {
        return totalIpCountGt;
    }

    public void setTotalIpCountGt(Integer totalIpCountGt) {
        this.totalIpCountGt = totalIpCountGt;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_GT);
        return this;
    }

    public void setTotalIpCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_GT);
        }
    }

    public boolean getTotalIpCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_GT);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGte(Integer totalIpCountGte) {

        this.totalIpCountGte = totalIpCountGte;
        return this;
    }

    /**
     * Get totalIpCountGte
     *
     * @return totalIpCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCountGte() {
        return totalIpCountGte;
    }

    public void setTotalIpCountGte(Integer totalIpCountGte) {
        this.totalIpCountGte = totalIpCountGte;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE);
        return this;
    }

    public void setTotalIpCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE);
        }
    }

    public boolean getTotalIpCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_GTE);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountIn(List<Integer> totalIpCountIn) {

        this.totalIpCountIn = totalIpCountIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addTotalIpCountInItem(Integer totalIpCountInItem) {
        if (this.totalIpCountIn == null) {
            this.totalIpCountIn = new ArrayList<Integer>();
        }
        this.totalIpCountIn.add(totalIpCountInItem);
        return this;
    }

    /**
     * Get totalIpCountIn
     *
     * @return totalIpCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalIpCountIn() {
        return totalIpCountIn;
    }

    public void setTotalIpCountIn(List<Integer> totalIpCountIn) {
        this.totalIpCountIn = totalIpCountIn;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_IN);
        return this;
    }

    public void setTotalIpCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_IN);
        }
    }

    public boolean getTotalIpCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLt(Integer totalIpCountLt) {

        this.totalIpCountLt = totalIpCountLt;
        return this;
    }

    /**
     * Get totalIpCountLt
     *
     * @return totalIpCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCountLt() {
        return totalIpCountLt;
    }

    public void setTotalIpCountLt(Integer totalIpCountLt) {
        this.totalIpCountLt = totalIpCountLt;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_LT);
        return this;
    }

    public void setTotalIpCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_LT);
        }
    }

    public boolean getTotalIpCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_LT);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLte(Integer totalIpCountLte) {

        this.totalIpCountLte = totalIpCountLte;
        return this;
    }

    /**
     * Get totalIpCountLte
     *
     * @return totalIpCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCountLte() {
        return totalIpCountLte;
    }

    public void setTotalIpCountLte(Integer totalIpCountLte) {
        this.totalIpCountLte = totalIpCountLte;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE);
        return this;
    }

    public void setTotalIpCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE);
        }
    }

    public boolean getTotalIpCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_LTE);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNot(Integer totalIpCountNot) {

        this.totalIpCountNot = totalIpCountNot;
        return this;
    }

    /**
     * Get totalIpCountNot
     *
     * @return totalIpCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCountNot() {
        return totalIpCountNot;
    }

    public void setTotalIpCountNot(Integer totalIpCountNot) {
        this.totalIpCountNot = totalIpCountNot;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT);
        return this;
    }

    public void setTotalIpCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT);
        }
    }

    public boolean getTotalIpCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT);
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNotIn(List<Integer> totalIpCountNotIn) {

        this.totalIpCountNotIn = totalIpCountNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addTotalIpCountNotInItem(
            Integer totalIpCountNotInItem) {
        if (this.totalIpCountNotIn == null) {
            this.totalIpCountNotIn = new ArrayList<Integer>();
        }
        this.totalIpCountNotIn.add(totalIpCountNotInItem);
        return this;
    }

    /**
     * Get totalIpCountNotIn
     *
     * @return totalIpCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalIpCountNotIn() {
        return totalIpCountNotIn;
    }

    public void setTotalIpCountNotIn(List<Integer> totalIpCountNotIn) {
        this.totalIpCountNotIn = totalIpCountNotIn;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput totalIpCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN);
        return this;
    }

    public void setTotalIpCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN);
        }
    }

    public boolean getTotalIpCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT_NOT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCount(Integer unusedIpCount) {

        this.unusedIpCount = unusedIpCount;
        return this;
    }

    /**
     * Get unusedIpCount
     *
     * @return unusedIpCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCount() {
        return unusedIpCount;
    }

    public void setUnusedIpCount(Integer unusedIpCount) {
        this.unusedIpCount = unusedIpCount;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT);
        return this;
    }

    public void setUnusedIpCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT);
        }
    }

    public boolean getUnusedIpCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGt(Integer unusedIpCountGt) {

        this.unusedIpCountGt = unusedIpCountGt;
        return this;
    }

    /**
     * Get unusedIpCountGt
     *
     * @return unusedIpCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCountGt() {
        return unusedIpCountGt;
    }

    public void setUnusedIpCountGt(Integer unusedIpCountGt) {
        this.unusedIpCountGt = unusedIpCountGt;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_GT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_GT);
        return this;
    }

    public void setUnusedIpCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_GT);
        }
    }

    public boolean getUnusedIpCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_GT);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGte(Integer unusedIpCountGte) {

        this.unusedIpCountGte = unusedIpCountGte;
        return this;
    }

    /**
     * Get unusedIpCountGte
     *
     * @return unusedIpCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCountGte() {
        return unusedIpCountGte;
    }

    public void setUnusedIpCountGte(Integer unusedIpCountGte) {
        this.unusedIpCountGte = unusedIpCountGte;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE);
        return this;
    }

    public void setUnusedIpCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE);
        }
    }

    public boolean getUnusedIpCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_GTE);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountIn(List<Integer> unusedIpCountIn) {

        this.unusedIpCountIn = unusedIpCountIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addUnusedIpCountInItem(Integer unusedIpCountInItem) {
        if (this.unusedIpCountIn == null) {
            this.unusedIpCountIn = new ArrayList<Integer>();
        }
        this.unusedIpCountIn.add(unusedIpCountInItem);
        return this;
    }

    /**
     * Get unusedIpCountIn
     *
     * @return unusedIpCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUnusedIpCountIn() {
        return unusedIpCountIn;
    }

    public void setUnusedIpCountIn(List<Integer> unusedIpCountIn) {
        this.unusedIpCountIn = unusedIpCountIn;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_IN);
        return this;
    }

    public void setUnusedIpCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_IN);
        }
    }

    public boolean getUnusedIpCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLt(Integer unusedIpCountLt) {

        this.unusedIpCountLt = unusedIpCountLt;
        return this;
    }

    /**
     * Get unusedIpCountLt
     *
     * @return unusedIpCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCountLt() {
        return unusedIpCountLt;
    }

    public void setUnusedIpCountLt(Integer unusedIpCountLt) {
        this.unusedIpCountLt = unusedIpCountLt;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_LT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_LT);
        return this;
    }

    public void setUnusedIpCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_LT);
        }
    }

    public boolean getUnusedIpCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_LT);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLte(Integer unusedIpCountLte) {

        this.unusedIpCountLte = unusedIpCountLte;
        return this;
    }

    /**
     * Get unusedIpCountLte
     *
     * @return unusedIpCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCountLte() {
        return unusedIpCountLte;
    }

    public void setUnusedIpCountLte(Integer unusedIpCountLte) {
        this.unusedIpCountLte = unusedIpCountLte;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE);
        return this;
    }

    public void setUnusedIpCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE);
        }
    }

    public boolean getUnusedIpCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_LTE);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNot(Integer unusedIpCountNot) {

        this.unusedIpCountNot = unusedIpCountNot;
        return this;
    }

    /**
     * Get unusedIpCountNot
     *
     * @return unusedIpCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCountNot() {
        return unusedIpCountNot;
    }

    public void setUnusedIpCountNot(Integer unusedIpCountNot) {
        this.unusedIpCountNot = unusedIpCountNot;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT);
        return this;
    }

    public void setUnusedIpCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT);
        }
    }

    public boolean getUnusedIpCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT);
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNotIn(
            List<Integer> unusedIpCountNotIn) {

        this.unusedIpCountNotIn = unusedIpCountNotIn;
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput addUnusedIpCountNotInItem(
            Integer unusedIpCountNotInItem) {
        if (this.unusedIpCountNotIn == null) {
            this.unusedIpCountNotIn = new ArrayList<Integer>();
        }
        this.unusedIpCountNotIn.add(unusedIpCountNotInItem);
        return this;
    }

    /**
     * Get unusedIpCountNotIn
     *
     * @return unusedIpCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUnusedIpCountNotIn() {
        return unusedIpCountNotIn;
    }

    public void setUnusedIpCountNotIn(List<Integer> unusedIpCountNotIn) {
        this.unusedIpCountNotIn = unusedIpCountNotIn;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput unusedIpCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN);
        return this;
    }

    public void setUnusedIpCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN);
        }
    }

    public boolean getUnusedIpCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT_NOT_IN);
    }

    public VirtualPrivateCloudSubnetWhereInput vpc(VirtualPrivateCloudWhereInput vpc) {

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

    public VirtualPrivateCloudSubnetWhereInput vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudSubnetWhereInput vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudSubnetWhereInput virtualPrivateCloudSubnetWhereInput =
                (VirtualPrivateCloudSubnetWhereInput) o;
        return Objects.equals(this.AND, virtualPrivateCloudSubnetWhereInput.AND)
                && Objects.equals(this.NOT, virtualPrivateCloudSubnetWhereInput.NOT)
                && Objects.equals(this.OR, virtualPrivateCloudSubnetWhereInput.OR)
                && Objects.equals(this.cidr, virtualPrivateCloudSubnetWhereInput.cidr)
                && Objects.equals(
                        this.cidrContains, virtualPrivateCloudSubnetWhereInput.cidrContains)
                && Objects.equals(
                        this.cidrEndsWith, virtualPrivateCloudSubnetWhereInput.cidrEndsWith)
                && Objects.equals(this.cidrGt, virtualPrivateCloudSubnetWhereInput.cidrGt)
                && Objects.equals(this.cidrGte, virtualPrivateCloudSubnetWhereInput.cidrGte)
                && Objects.equals(this.cidrIn, virtualPrivateCloudSubnetWhereInput.cidrIn)
                && Objects.equals(this.cidrLt, virtualPrivateCloudSubnetWhereInput.cidrLt)
                && Objects.equals(this.cidrLte, virtualPrivateCloudSubnetWhereInput.cidrLte)
                && Objects.equals(this.cidrNot, virtualPrivateCloudSubnetWhereInput.cidrNot)
                && Objects.equals(
                        this.cidrNotContains, virtualPrivateCloudSubnetWhereInput.cidrNotContains)
                && Objects.equals(
                        this.cidrNotEndsWith, virtualPrivateCloudSubnetWhereInput.cidrNotEndsWith)
                && Objects.equals(this.cidrNotIn, virtualPrivateCloudSubnetWhereInput.cidrNotIn)
                && Objects.equals(
                        this.cidrNotStartsWith,
                        virtualPrivateCloudSubnetWhereInput.cidrNotStartsWith)
                && Objects.equals(
                        this.cidrStartsWith, virtualPrivateCloudSubnetWhereInput.cidrStartsWith)
                && Objects.equals(this.description, virtualPrivateCloudSubnetWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        virtualPrivateCloudSubnetWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        virtualPrivateCloudSubnetWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt, virtualPrivateCloudSubnetWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, virtualPrivateCloudSubnetWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn, virtualPrivateCloudSubnetWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt, virtualPrivateCloudSubnetWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, virtualPrivateCloudSubnetWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, virtualPrivateCloudSubnetWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        virtualPrivateCloudSubnetWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        virtualPrivateCloudSubnetWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, virtualPrivateCloudSubnetWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        virtualPrivateCloudSubnetWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        virtualPrivateCloudSubnetWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudSubnetWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        virtualPrivateCloudSubnetWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        virtualPrivateCloudSubnetWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        virtualPrivateCloudSubnetWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.gateway, virtualPrivateCloudSubnetWhereInput.gateway)
                && Objects.equals(
                        this.gatewayContains, virtualPrivateCloudSubnetWhereInput.gatewayContains)
                && Objects.equals(
                        this.gatewayEndsWith, virtualPrivateCloudSubnetWhereInput.gatewayEndsWith)
                && Objects.equals(this.gatewayGt, virtualPrivateCloudSubnetWhereInput.gatewayGt)
                && Objects.equals(this.gatewayGte, virtualPrivateCloudSubnetWhereInput.gatewayGte)
                && Objects.equals(this.gatewayIn, virtualPrivateCloudSubnetWhereInput.gatewayIn)
                && Objects.equals(this.gatewayLt, virtualPrivateCloudSubnetWhereInput.gatewayLt)
                && Objects.equals(this.gatewayLte, virtualPrivateCloudSubnetWhereInput.gatewayLte)
                && Objects.equals(this.gatewayNot, virtualPrivateCloudSubnetWhereInput.gatewayNot)
                && Objects.equals(
                        this.gatewayNotContains,
                        virtualPrivateCloudSubnetWhereInput.gatewayNotContains)
                && Objects.equals(
                        this.gatewayNotEndsWith,
                        virtualPrivateCloudSubnetWhereInput.gatewayNotEndsWith)
                && Objects.equals(
                        this.gatewayNotIn, virtualPrivateCloudSubnetWhereInput.gatewayNotIn)
                && Objects.equals(
                        this.gatewayNotStartsWith,
                        virtualPrivateCloudSubnetWhereInput.gatewayNotStartsWith)
                && Objects.equals(
                        this.gatewayStartsWith,
                        virtualPrivateCloudSubnetWhereInput.gatewayStartsWith)
                && Objects.equals(this.id, virtualPrivateCloudSubnetWhereInput.id)
                && Objects.equals(this.idContains, virtualPrivateCloudSubnetWhereInput.idContains)
                && Objects.equals(this.idEndsWith, virtualPrivateCloudSubnetWhereInput.idEndsWith)
                && Objects.equals(this.idGt, virtualPrivateCloudSubnetWhereInput.idGt)
                && Objects.equals(this.idGte, virtualPrivateCloudSubnetWhereInput.idGte)
                && Objects.equals(this.idIn, virtualPrivateCloudSubnetWhereInput.idIn)
                && Objects.equals(this.idLt, virtualPrivateCloudSubnetWhereInput.idLt)
                && Objects.equals(this.idLte, virtualPrivateCloudSubnetWhereInput.idLte)
                && Objects.equals(this.idNot, virtualPrivateCloudSubnetWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, virtualPrivateCloudSubnetWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, virtualPrivateCloudSubnetWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, virtualPrivateCloudSubnetWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, virtualPrivateCloudSubnetWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, virtualPrivateCloudSubnetWhereInput.idStartsWith)
                && Objects.equals(this.localId, virtualPrivateCloudSubnetWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, virtualPrivateCloudSubnetWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, virtualPrivateCloudSubnetWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, virtualPrivateCloudSubnetWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, virtualPrivateCloudSubnetWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, virtualPrivateCloudSubnetWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, virtualPrivateCloudSubnetWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, virtualPrivateCloudSubnetWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, virtualPrivateCloudSubnetWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        virtualPrivateCloudSubnetWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        virtualPrivateCloudSubnetWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, virtualPrivateCloudSubnetWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        virtualPrivateCloudSubnetWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        virtualPrivateCloudSubnetWhereInput.localIdStartsWith)
                && Objects.equals(this.name, virtualPrivateCloudSubnetWhereInput.name)
                && Objects.equals(
                        this.nameContains, virtualPrivateCloudSubnetWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith, virtualPrivateCloudSubnetWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, virtualPrivateCloudSubnetWhereInput.nameGt)
                && Objects.equals(this.nameGte, virtualPrivateCloudSubnetWhereInput.nameGte)
                && Objects.equals(this.nameIn, virtualPrivateCloudSubnetWhereInput.nameIn)
                && Objects.equals(this.nameLt, virtualPrivateCloudSubnetWhereInput.nameLt)
                && Objects.equals(this.nameLte, virtualPrivateCloudSubnetWhereInput.nameLte)
                && Objects.equals(this.nameNot, virtualPrivateCloudSubnetWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, virtualPrivateCloudSubnetWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, virtualPrivateCloudSubnetWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, virtualPrivateCloudSubnetWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        virtualPrivateCloudSubnetWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, virtualPrivateCloudSubnetWhereInput.nameStartsWith)
                && Objects.equals(this.routeTable, virtualPrivateCloudSubnetWhereInput.routeTable)
                && Objects.equals(
                        this.totalIpCount, virtualPrivateCloudSubnetWhereInput.totalIpCount)
                && Objects.equals(
                        this.totalIpCountGt, virtualPrivateCloudSubnetWhereInput.totalIpCountGt)
                && Objects.equals(
                        this.totalIpCountGte, virtualPrivateCloudSubnetWhereInput.totalIpCountGte)
                && Objects.equals(
                        this.totalIpCountIn, virtualPrivateCloudSubnetWhereInput.totalIpCountIn)
                && Objects.equals(
                        this.totalIpCountLt, virtualPrivateCloudSubnetWhereInput.totalIpCountLt)
                && Objects.equals(
                        this.totalIpCountLte, virtualPrivateCloudSubnetWhereInput.totalIpCountLte)
                && Objects.equals(
                        this.totalIpCountNot, virtualPrivateCloudSubnetWhereInput.totalIpCountNot)
                && Objects.equals(
                        this.totalIpCountNotIn,
                        virtualPrivateCloudSubnetWhereInput.totalIpCountNotIn)
                && Objects.equals(
                        this.unusedIpCount, virtualPrivateCloudSubnetWhereInput.unusedIpCount)
                && Objects.equals(
                        this.unusedIpCountGt, virtualPrivateCloudSubnetWhereInput.unusedIpCountGt)
                && Objects.equals(
                        this.unusedIpCountGte, virtualPrivateCloudSubnetWhereInput.unusedIpCountGte)
                && Objects.equals(
                        this.unusedIpCountIn, virtualPrivateCloudSubnetWhereInput.unusedIpCountIn)
                && Objects.equals(
                        this.unusedIpCountLt, virtualPrivateCloudSubnetWhereInput.unusedIpCountLt)
                && Objects.equals(
                        this.unusedIpCountLte, virtualPrivateCloudSubnetWhereInput.unusedIpCountLte)
                && Objects.equals(
                        this.unusedIpCountNot, virtualPrivateCloudSubnetWhereInput.unusedIpCountNot)
                && Objects.equals(
                        this.unusedIpCountNotIn,
                        virtualPrivateCloudSubnetWhereInput.unusedIpCountNotIn)
                && Objects.equals(this.vpc, virtualPrivateCloudSubnetWhereInput.vpc);
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
                cidr,
                cidrContains,
                cidrEndsWith,
                cidrGt,
                cidrGte,
                cidrIn,
                cidrLt,
                cidrLte,
                cidrNot,
                cidrNotContains,
                cidrNotEndsWith,
                cidrNotIn,
                cidrNotStartsWith,
                cidrStartsWith,
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
                gateway,
                gatewayContains,
                gatewayEndsWith,
                gatewayGt,
                gatewayGte,
                gatewayIn,
                gatewayLt,
                gatewayLte,
                gatewayNot,
                gatewayNotContains,
                gatewayNotEndsWith,
                gatewayNotIn,
                gatewayNotStartsWith,
                gatewayStartsWith,
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
                routeTable,
                totalIpCount,
                totalIpCountGt,
                totalIpCountGte,
                totalIpCountIn,
                totalIpCountLt,
                totalIpCountLte,
                totalIpCountNot,
                totalIpCountNotIn,
                unusedIpCount,
                unusedIpCountGt,
                unusedIpCountGte,
                unusedIpCountIn,
                unusedIpCountLt,
                unusedIpCountLte,
                unusedIpCountNot,
                unusedIpCountNotIn,
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
        sb.append("class VirtualPrivateCloudSubnetWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    cidrContains: ").append(toIndentedString(cidrContains)).append("\n");
        sb.append("    cidrEndsWith: ").append(toIndentedString(cidrEndsWith)).append("\n");
        sb.append("    cidrGt: ").append(toIndentedString(cidrGt)).append("\n");
        sb.append("    cidrGte: ").append(toIndentedString(cidrGte)).append("\n");
        sb.append("    cidrIn: ").append(toIndentedString(cidrIn)).append("\n");
        sb.append("    cidrLt: ").append(toIndentedString(cidrLt)).append("\n");
        sb.append("    cidrLte: ").append(toIndentedString(cidrLte)).append("\n");
        sb.append("    cidrNot: ").append(toIndentedString(cidrNot)).append("\n");
        sb.append("    cidrNotContains: ").append(toIndentedString(cidrNotContains)).append("\n");
        sb.append("    cidrNotEndsWith: ").append(toIndentedString(cidrNotEndsWith)).append("\n");
        sb.append("    cidrNotIn: ").append(toIndentedString(cidrNotIn)).append("\n");
        sb.append("    cidrNotStartsWith: ")
                .append(toIndentedString(cidrNotStartsWith))
                .append("\n");
        sb.append("    cidrStartsWith: ").append(toIndentedString(cidrStartsWith)).append("\n");
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
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    gatewayContains: ").append(toIndentedString(gatewayContains)).append("\n");
        sb.append("    gatewayEndsWith: ").append(toIndentedString(gatewayEndsWith)).append("\n");
        sb.append("    gatewayGt: ").append(toIndentedString(gatewayGt)).append("\n");
        sb.append("    gatewayGte: ").append(toIndentedString(gatewayGte)).append("\n");
        sb.append("    gatewayIn: ").append(toIndentedString(gatewayIn)).append("\n");
        sb.append("    gatewayLt: ").append(toIndentedString(gatewayLt)).append("\n");
        sb.append("    gatewayLte: ").append(toIndentedString(gatewayLte)).append("\n");
        sb.append("    gatewayNot: ").append(toIndentedString(gatewayNot)).append("\n");
        sb.append("    gatewayNotContains: ")
                .append(toIndentedString(gatewayNotContains))
                .append("\n");
        sb.append("    gatewayNotEndsWith: ")
                .append(toIndentedString(gatewayNotEndsWith))
                .append("\n");
        sb.append("    gatewayNotIn: ").append(toIndentedString(gatewayNotIn)).append("\n");
        sb.append("    gatewayNotStartsWith: ")
                .append(toIndentedString(gatewayNotStartsWith))
                .append("\n");
        sb.append("    gatewayStartsWith: ")
                .append(toIndentedString(gatewayStartsWith))
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
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
        sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
        sb.append("    totalIpCountGt: ").append(toIndentedString(totalIpCountGt)).append("\n");
        sb.append("    totalIpCountGte: ").append(toIndentedString(totalIpCountGte)).append("\n");
        sb.append("    totalIpCountIn: ").append(toIndentedString(totalIpCountIn)).append("\n");
        sb.append("    totalIpCountLt: ").append(toIndentedString(totalIpCountLt)).append("\n");
        sb.append("    totalIpCountLte: ").append(toIndentedString(totalIpCountLte)).append("\n");
        sb.append("    totalIpCountNot: ").append(toIndentedString(totalIpCountNot)).append("\n");
        sb.append("    totalIpCountNotIn: ")
                .append(toIndentedString(totalIpCountNotIn))
                .append("\n");
        sb.append("    unusedIpCount: ").append(toIndentedString(unusedIpCount)).append("\n");
        sb.append("    unusedIpCountGt: ").append(toIndentedString(unusedIpCountGt)).append("\n");
        sb.append("    unusedIpCountGte: ").append(toIndentedString(unusedIpCountGte)).append("\n");
        sb.append("    unusedIpCountIn: ").append(toIndentedString(unusedIpCountIn)).append("\n");
        sb.append("    unusedIpCountLt: ").append(toIndentedString(unusedIpCountLt)).append("\n");
        sb.append("    unusedIpCountLte: ").append(toIndentedString(unusedIpCountLte)).append("\n");
        sb.append("    unusedIpCountNot: ").append(toIndentedString(unusedIpCountNot)).append("\n");
        sb.append("    unusedIpCountNotIn: ")
                .append(toIndentedString(unusedIpCountNotIn))
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
