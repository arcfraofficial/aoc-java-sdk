package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupServiceWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupServiceWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupServiceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupServiceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupServiceWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY = "backup_clusters_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY)
    private ClusterWhereInput backupClustersEvery;

    public static final String SERIALIZED_NAME_BACKUP_CLUSTERS_NONE = "backup_clusters_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE)
    private ClusterWhereInput backupClustersNone;

    public static final String SERIALIZED_NAME_BACKUP_CLUSTERS_SOME = "backup_clusters_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME)
    private ClusterWhereInput backupClustersSome;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY = "backup_network_gateway";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY)
    private String backupNetworkGateway;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS =
            "backup_network_gateway_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS)
    private String backupNetworkGatewayContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH =
            "backup_network_gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH)
    private String backupNetworkGatewayEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT =
            "backup_network_gateway_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT)
    private String backupNetworkGatewayGt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE =
            "backup_network_gateway_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE)
    private String backupNetworkGatewayGte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN =
            "backup_network_gateway_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN)
    private List<String> backupNetworkGatewayIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT =
            "backup_network_gateway_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT)
    private String backupNetworkGatewayLt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE =
            "backup_network_gateway_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE)
    private String backupNetworkGatewayLte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT =
            "backup_network_gateway_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT)
    private String backupNetworkGatewayNot;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS =
            "backup_network_gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS)
    private String backupNetworkGatewayNotContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH =
            "backup_network_gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH)
    private String backupNetworkGatewayNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN =
            "backup_network_gateway_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN)
    private List<String> backupNetworkGatewayNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH =
            "backup_network_gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH)
    private String backupNetworkGatewayNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH =
            "backup_network_gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH)
    private String backupNetworkGatewayStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP = "backup_network_ip";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP)
    private String backupNetworkIp;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS =
            "backup_network_ip_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS)
    private String backupNetworkIpContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH =
            "backup_network_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH)
    private String backupNetworkIpEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_GT = "backup_network_ip_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT)
    private String backupNetworkIpGt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE = "backup_network_ip_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE)
    private String backupNetworkIpGte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_IN = "backup_network_ip_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN)
    private List<String> backupNetworkIpIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_LT = "backup_network_ip_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT)
    private String backupNetworkIpLt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE = "backup_network_ip_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE)
    private String backupNetworkIpLte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT = "backup_network_ip_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT)
    private String backupNetworkIpNot;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS =
            "backup_network_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS)
    private String backupNetworkIpNotContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH =
            "backup_network_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH)
    private String backupNetworkIpNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN =
            "backup_network_ip_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN)
    private List<String> backupNetworkIpNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH =
            "backup_network_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH)
    private String backupNetworkIpNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH =
            "backup_network_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH)
    private String backupNetworkIpStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK =
            "backup_network_subnet_mask";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK)
    private String backupNetworkSubnetMask;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS =
            "backup_network_subnet_mask_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS)
    private String backupNetworkSubnetMaskContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH =
            "backup_network_subnet_mask_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH)
    private String backupNetworkSubnetMaskEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT =
            "backup_network_subnet_mask_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT)
    private String backupNetworkSubnetMaskGt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE =
            "backup_network_subnet_mask_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE)
    private String backupNetworkSubnetMaskGte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN =
            "backup_network_subnet_mask_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN)
    private List<String> backupNetworkSubnetMaskIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT =
            "backup_network_subnet_mask_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT)
    private String backupNetworkSubnetMaskLt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE =
            "backup_network_subnet_mask_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE)
    private String backupNetworkSubnetMaskLte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT =
            "backup_network_subnet_mask_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT)
    private String backupNetworkSubnetMaskNot;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS =
            "backup_network_subnet_mask_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS)
    private String backupNetworkSubnetMaskNotContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH =
            "backup_network_subnet_mask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH)
    private String backupNetworkSubnetMaskNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN =
            "backup_network_subnet_mask_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN)
    private List<String> backupNetworkSubnetMaskNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH =
            "backup_network_subnet_mask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH)
    private String backupNetworkSubnetMaskNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH =
            "backup_network_subnet_mask_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH)
    private String backupNetworkSubnetMaskStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_TYPE = "backup_network_type";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_TYPE)
    private BackupServiceNetworkType backupNetworkType;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN = "backup_network_type_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN)
    private List<BackupServiceNetworkType> backupNetworkTypeIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT = "backup_network_type_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT)
    private BackupServiceNetworkType backupNetworkTypeNot;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN =
            "backup_network_type_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN)
    private List<BackupServiceNetworkType> backupNetworkTypeNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN = "backup_network_vlan";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN)
    private String backupNetworkVlan;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS =
            "backup_network_vlan_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS)
    private String backupNetworkVlanContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH =
            "backup_network_vlan_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH)
    private String backupNetworkVlanEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT = "backup_network_vlan_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT)
    private String backupNetworkVlanGt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE = "backup_network_vlan_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE)
    private String backupNetworkVlanGte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN = "backup_network_vlan_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN)
    private List<String> backupNetworkVlanIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT = "backup_network_vlan_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT)
    private String backupNetworkVlanLt;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE = "backup_network_vlan_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE)
    private String backupNetworkVlanLte;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT = "backup_network_vlan_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT)
    private String backupNetworkVlanNot;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS =
            "backup_network_vlan_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS)
    private String backupNetworkVlanNotContains;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH =
            "backup_network_vlan_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH)
    private String backupNetworkVlanNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN =
            "backup_network_vlan_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN)
    private List<String> backupNetworkVlanNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH =
            "backup_network_vlan_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH)
    private String backupNetworkVlanNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH =
            "backup_network_vlan_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH)
    private String backupNetworkVlanStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_EVERY = "backup_plans_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_EVERY)
    private BackupPlanWhereInput backupPlansEvery;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_NONE = "backup_plans_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_NONE)
    private BackupPlanWhereInput backupPlansNone;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_SOME = "backup_plans_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_SOME)
    private BackupPlanWhereInput backupPlansSome;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX = "backup_rd_iops_max";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX)
    private Long backupRdIopsMax;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT = "backup_rd_iops_max_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT)
    private Long backupRdIopsMaxGt;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE = "backup_rd_iops_max_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE)
    private Long backupRdIopsMaxGte;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN = "backup_rd_iops_max_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN)
    private List<Long> backupRdIopsMaxIn = null;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT = "backup_rd_iops_max_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT)
    private Long backupRdIopsMaxLt;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE = "backup_rd_iops_max_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE)
    private Long backupRdIopsMaxLte;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT = "backup_rd_iops_max_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT)
    private Long backupRdIopsMaxNot;

    public static final String SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN =
            "backup_rd_iops_max_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN)
    private List<Long> backupRdIopsMaxNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY =
            "backup_store_repositories_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY)
    private BackupStoreRepositoryWhereInput backupStoreRepositoriesEvery;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE =
            "backup_store_repositories_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE)
    private BackupStoreRepositoryWhereInput backupStoreRepositoriesNone;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME =
            "backup_store_repositories_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME)
    private BackupStoreRepositoryWhereInput backupStoreRepositoriesSome;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX = "backup_wr_iops_max";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX)
    private Long backupWrIopsMax;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT = "backup_wr_iops_max_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT)
    private Long backupWrIopsMaxGt;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE = "backup_wr_iops_max_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE)
    private Long backupWrIopsMaxGte;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN = "backup_wr_iops_max_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN)
    private List<Long> backupWrIopsMaxIn = null;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT = "backup_wr_iops_max_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT)
    private Long backupWrIopsMaxLt;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE = "backup_wr_iops_max_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE)
    private Long backupWrIopsMaxLte;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT = "backup_wr_iops_max_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT)
    private Long backupWrIopsMaxNot;

    public static final String SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN =
            "backup_wr_iops_max_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN)
    private List<Long> backupWrIopsMaxNotIn = null;

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

    public static final String SERIALIZED_NAME_KUBE_CONFIG = "kube_config";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG)
    private String kubeConfig;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_CONTAINS = "kube_config_contains";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS)
    private String kubeConfigContains;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH = "kube_config_ends_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH)
    private String kubeConfigEndsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_GT = "kube_config_gt";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_GT)
    private String kubeConfigGt;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_GTE = "kube_config_gte";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_GTE)
    private String kubeConfigGte;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_IN = "kube_config_in";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_IN)
    private List<String> kubeConfigIn = null;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_LT = "kube_config_lt";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_LT)
    private String kubeConfigLt;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_LTE = "kube_config_lte";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_LTE)
    private String kubeConfigLte;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT = "kube_config_not";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT)
    private String kubeConfigNot;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS =
            "kube_config_not_contains";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS)
    private String kubeConfigNotContains;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH =
            "kube_config_not_ends_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH)
    private String kubeConfigNotEndsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_IN = "kube_config_not_in";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN)
    private List<String> kubeConfigNotIn = null;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH =
            "kube_config_not_starts_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH)
    private String kubeConfigNotStartsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH = "kube_config_starts_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH)
    private String kubeConfigStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY =
            "management_network_gateway";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY)
    private String managementNetworkGateway;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS =
            "management_network_gateway_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS)
    private String managementNetworkGatewayContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH =
            "management_network_gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH)
    private String managementNetworkGatewayEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT =
            "management_network_gateway_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT)
    private String managementNetworkGatewayGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE =
            "management_network_gateway_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE)
    private String managementNetworkGatewayGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN =
            "management_network_gateway_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN)
    private List<String> managementNetworkGatewayIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT =
            "management_network_gateway_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT)
    private String managementNetworkGatewayLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE =
            "management_network_gateway_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE)
    private String managementNetworkGatewayLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT =
            "management_network_gateway_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT)
    private String managementNetworkGatewayNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS =
            "management_network_gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS)
    private String managementNetworkGatewayNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH =
            "management_network_gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH)
    private String managementNetworkGatewayNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN =
            "management_network_gateway_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN)
    private List<String> managementNetworkGatewayNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH =
            "management_network_gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH)
    private String managementNetworkGatewayNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH =
            "management_network_gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH)
    private String managementNetworkGatewayStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP = "management_network_ip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP)
    private String managementNetworkIp;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS =
            "management_network_ip_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS)
    private String managementNetworkIpContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH =
            "management_network_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH)
    private String managementNetworkIpEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT =
            "management_network_ip_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT)
    private String managementNetworkIpGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE =
            "management_network_ip_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE)
    private String managementNetworkIpGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN =
            "management_network_ip_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN)
    private List<String> managementNetworkIpIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT =
            "management_network_ip_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT)
    private String managementNetworkIpLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE =
            "management_network_ip_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE)
    private String managementNetworkIpLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT =
            "management_network_ip_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT)
    private String managementNetworkIpNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS =
            "management_network_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS)
    private String managementNetworkIpNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH =
            "management_network_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH)
    private String managementNetworkIpNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN =
            "management_network_ip_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN)
    private List<String> managementNetworkIpNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH =
            "management_network_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH)
    private String managementNetworkIpNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH =
            "management_network_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH)
    private String managementNetworkIpStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK =
            "management_network_subnet_mask";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK)
    private String managementNetworkSubnetMask;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS =
            "management_network_subnet_mask_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS)
    private String managementNetworkSubnetMaskContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH =
            "management_network_subnet_mask_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH)
    private String managementNetworkSubnetMaskEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT =
            "management_network_subnet_mask_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT)
    private String managementNetworkSubnetMaskGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE =
            "management_network_subnet_mask_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE)
    private String managementNetworkSubnetMaskGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN =
            "management_network_subnet_mask_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN)
    private List<String> managementNetworkSubnetMaskIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT =
            "management_network_subnet_mask_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT)
    private String managementNetworkSubnetMaskLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE =
            "management_network_subnet_mask_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE)
    private String managementNetworkSubnetMaskLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT =
            "management_network_subnet_mask_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT)
    private String managementNetworkSubnetMaskNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS =
            "management_network_subnet_mask_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS)
    private String managementNetworkSubnetMaskNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH =
            "management_network_subnet_mask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH)
    private String managementNetworkSubnetMaskNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN =
            "management_network_subnet_mask_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN)
    private List<String> managementNetworkSubnetMaskNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH =
            "management_network_subnet_mask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH)
    private String managementNetworkSubnetMaskNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH =
            "management_network_subnet_mask_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH)
    private String managementNetworkSubnetMaskStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN = "management_network_vlan";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN)
    private String managementNetworkVlan;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS =
            "management_network_vlan_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS)
    private String managementNetworkVlanContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH =
            "management_network_vlan_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH)
    private String managementNetworkVlanEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT =
            "management_network_vlan_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT)
    private String managementNetworkVlanGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE =
            "management_network_vlan_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE)
    private String managementNetworkVlanGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN =
            "management_network_vlan_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN)
    private List<String> managementNetworkVlanIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT =
            "management_network_vlan_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT)
    private String managementNetworkVlanLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE =
            "management_network_vlan_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE)
    private String managementNetworkVlanLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT =
            "management_network_vlan_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT)
    private String managementNetworkVlanNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS =
            "management_network_vlan_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS)
    private String managementNetworkVlanNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH =
            "management_network_vlan_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH)
    private String managementNetworkVlanNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN =
            "management_network_vlan_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN)
    private List<String> managementNetworkVlanNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH =
            "management_network_vlan_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH)
    private String managementNetworkVlanNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH =
            "management_network_vlan_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH)
    private String managementNetworkVlanStartsWith;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES = "max_job_retry_times";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES)
    private Integer maxJobRetryTimes;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT = "max_job_retry_times_gt";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT)
    private Integer maxJobRetryTimesGt;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE = "max_job_retry_times_gte";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE)
    private Integer maxJobRetryTimesGte;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN = "max_job_retry_times_in";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN)
    private List<Integer> maxJobRetryTimesIn = null;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT = "max_job_retry_times_lt";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT)
    private Integer maxJobRetryTimesLt;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE = "max_job_retry_times_lte";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE)
    private Integer maxJobRetryTimesLte;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT = "max_job_retry_times_not";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT)
    private Integer maxJobRetryTimesNot;

    public static final String SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN =
            "max_job_retry_times_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN)
    private List<Integer> maxJobRetryTimesNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS =
            "max_parallel_backup_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS)
    private Integer maxParallelBackupJobs;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT =
            "max_parallel_backup_jobs_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT)
    private Integer maxParallelBackupJobsGt;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE =
            "max_parallel_backup_jobs_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE)
    private Integer maxParallelBackupJobsGte;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN =
            "max_parallel_backup_jobs_in";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN)
    private List<Integer> maxParallelBackupJobsIn = null;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT =
            "max_parallel_backup_jobs_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT)
    private Integer maxParallelBackupJobsLt;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE =
            "max_parallel_backup_jobs_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE)
    private Integer maxParallelBackupJobsLte;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT =
            "max_parallel_backup_jobs_not";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT)
    private Integer maxParallelBackupJobsNot;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN =
            "max_parallel_backup_jobs_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN)
    private List<Integer> maxParallelBackupJobsNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS =
            "max_parallel_restore_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS)
    private Integer maxParallelRestoreJobs;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT =
            "max_parallel_restore_jobs_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT)
    private Integer maxParallelRestoreJobsGt;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE =
            "max_parallel_restore_jobs_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE)
    private Integer maxParallelRestoreJobsGte;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN =
            "max_parallel_restore_jobs_in";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN)
    private List<Integer> maxParallelRestoreJobsIn = null;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT =
            "max_parallel_restore_jobs_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT)
    private Integer maxParallelRestoreJobsLt;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE =
            "max_parallel_restore_jobs_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE)
    private Integer maxParallelRestoreJobsLte;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT =
            "max_parallel_restore_jobs_not";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT)
    private Integer maxParallelRestoreJobsNot;

    public static final String SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN =
            "max_parallel_restore_jobs_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN)
    private List<Integer> maxParallelRestoreJobsNotIn = null;

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

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX = "restore_rd_iops_max";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX)
    private Long restoreRdIopsMax;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT = "restore_rd_iops_max_gt";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT)
    private Long restoreRdIopsMaxGt;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE = "restore_rd_iops_max_gte";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE)
    private Long restoreRdIopsMaxGte;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN = "restore_rd_iops_max_in";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN)
    private List<Long> restoreRdIopsMaxIn = null;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT = "restore_rd_iops_max_lt";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT)
    private Long restoreRdIopsMaxLt;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE = "restore_rd_iops_max_lte";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE)
    private Long restoreRdIopsMaxLte;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT = "restore_rd_iops_max_not";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT)
    private Long restoreRdIopsMaxNot;

    public static final String SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN =
            "restore_rd_iops_max_not_in";

    @SerializedName(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN)
    private List<Long> restoreRdIopsMaxNotIn = null;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX = "restore_wr_iops_max";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX)
    private Long restoreWrIopsMax;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT = "restore_wr_iops_max_gt";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT)
    private Long restoreWrIopsMaxGt;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE = "restore_wr_iops_max_gte";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE)
    private Long restoreWrIopsMaxGte;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN = "restore_wr_iops_max_in";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN)
    private List<Long> restoreWrIopsMaxIn = null;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT = "restore_wr_iops_max_lt";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT)
    private Long restoreWrIopsMaxLt;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE = "restore_wr_iops_max_lte";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE)
    private Long restoreWrIopsMaxLte;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT = "restore_wr_iops_max_not";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT)
    private Long restoreWrIopsMaxNot;

    public static final String SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN =
            "restore_wr_iops_max_not_in";

    @SerializedName(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN)
    private List<Long> restoreWrIopsMaxNotIn = null;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL = "retry_interval";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL)
    private Integer retryInterval;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_GT = "retry_interval_gt";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_GT)
    private Integer retryIntervalGt;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_GTE = "retry_interval_gte";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_GTE)
    private Integer retryIntervalGte;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_IN = "retry_interval_in";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_IN)
    private List<Integer> retryIntervalIn = null;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_LT = "retry_interval_lt";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_LT)
    private Integer retryIntervalLt;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_LTE = "retry_interval_lte";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_LTE)
    private Integer retryIntervalLte;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_NOT = "retry_interval_not";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_NOT)
    private Integer retryIntervalNot;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN = "retry_interval_not_in";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN)
    private List<Integer> retryIntervalNotIn = null;

    public static final String SERIALIZED_NAME_RUNNING_VM = "running_vm";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM)
    private VmWhereInput runningVm;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupServiceStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<BackupServiceStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private BackupServiceStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<BackupServiceStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY = "storage_network_gateway";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY)
    private String storageNetworkGateway;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS =
            "storage_network_gateway_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS)
    private String storageNetworkGatewayContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH =
            "storage_network_gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH)
    private String storageNetworkGatewayEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT =
            "storage_network_gateway_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT)
    private String storageNetworkGatewayGt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE =
            "storage_network_gateway_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE)
    private String storageNetworkGatewayGte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN =
            "storage_network_gateway_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN)
    private List<String> storageNetworkGatewayIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT =
            "storage_network_gateway_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT)
    private String storageNetworkGatewayLt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE =
            "storage_network_gateway_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE)
    private String storageNetworkGatewayLte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT =
            "storage_network_gateway_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT)
    private String storageNetworkGatewayNot;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS =
            "storage_network_gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS)
    private String storageNetworkGatewayNotContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH =
            "storage_network_gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH)
    private String storageNetworkGatewayNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN =
            "storage_network_gateway_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN)
    private List<String> storageNetworkGatewayNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH =
            "storage_network_gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH)
    private String storageNetworkGatewayNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH =
            "storage_network_gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH)
    private String storageNetworkGatewayStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP = "storage_network_ip";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP)
    private String storageNetworkIp;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS =
            "storage_network_ip_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS)
    private String storageNetworkIpContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH =
            "storage_network_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH)
    private String storageNetworkIpEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_GT = "storage_network_ip_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT)
    private String storageNetworkIpGt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE = "storage_network_ip_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE)
    private String storageNetworkIpGte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_IN = "storage_network_ip_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN)
    private List<String> storageNetworkIpIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_LT = "storage_network_ip_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT)
    private String storageNetworkIpLt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE = "storage_network_ip_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE)
    private String storageNetworkIpLte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT = "storage_network_ip_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT)
    private String storageNetworkIpNot;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS =
            "storage_network_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS)
    private String storageNetworkIpNotContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH =
            "storage_network_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH)
    private String storageNetworkIpNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN =
            "storage_network_ip_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN)
    private List<String> storageNetworkIpNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH =
            "storage_network_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH)
    private String storageNetworkIpNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH =
            "storage_network_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH)
    private String storageNetworkIpStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK =
            "storage_network_subnet_mask";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK)
    private String storageNetworkSubnetMask;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS =
            "storage_network_subnet_mask_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS)
    private String storageNetworkSubnetMaskContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH =
            "storage_network_subnet_mask_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH)
    private String storageNetworkSubnetMaskEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT =
            "storage_network_subnet_mask_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT)
    private String storageNetworkSubnetMaskGt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE =
            "storage_network_subnet_mask_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE)
    private String storageNetworkSubnetMaskGte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN =
            "storage_network_subnet_mask_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN)
    private List<String> storageNetworkSubnetMaskIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT =
            "storage_network_subnet_mask_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT)
    private String storageNetworkSubnetMaskLt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE =
            "storage_network_subnet_mask_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE)
    private String storageNetworkSubnetMaskLte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT =
            "storage_network_subnet_mask_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT)
    private String storageNetworkSubnetMaskNot;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS =
            "storage_network_subnet_mask_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS)
    private String storageNetworkSubnetMaskNotContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH =
            "storage_network_subnet_mask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH)
    private String storageNetworkSubnetMaskNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN =
            "storage_network_subnet_mask_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN)
    private List<String> storageNetworkSubnetMaskNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH =
            "storage_network_subnet_mask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH)
    private String storageNetworkSubnetMaskNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH =
            "storage_network_subnet_mask_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH)
    private String storageNetworkSubnetMaskStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_TYPE = "storage_network_type";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_TYPE)
    private BackupServiceNetworkType storageNetworkType;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN = "storage_network_type_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN)
    private List<BackupServiceNetworkType> storageNetworkTypeIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT =
            "storage_network_type_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT)
    private BackupServiceNetworkType storageNetworkTypeNot;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN =
            "storage_network_type_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN)
    private List<BackupServiceNetworkType> storageNetworkTypeNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN = "storage_network_vlan";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN)
    private String storageNetworkVlan;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS =
            "storage_network_vlan_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS)
    private String storageNetworkVlanContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH =
            "storage_network_vlan_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH)
    private String storageNetworkVlanEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT = "storage_network_vlan_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT)
    private String storageNetworkVlanGt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE =
            "storage_network_vlan_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE)
    private String storageNetworkVlanGte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN = "storage_network_vlan_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN)
    private List<String> storageNetworkVlanIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT = "storage_network_vlan_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT)
    private String storageNetworkVlanLt;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE =
            "storage_network_vlan_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE)
    private String storageNetworkVlanLte;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT =
            "storage_network_vlan_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT)
    private String storageNetworkVlanNot;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS =
            "storage_network_vlan_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS)
    private String storageNetworkVlanNotContains;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH =
            "storage_network_vlan_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH)
    private String storageNetworkVlanNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN =
            "storage_network_vlan_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN)
    private List<String> storageNetworkVlanNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH =
            "storage_network_vlan_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH)
    private String storageNetworkVlanNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH =
            "storage_network_vlan_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH)
    private String storageNetworkVlanStartsWith;

    public BackupServiceWhereInput() {}

    public BackupServiceWhereInput AND(List<BackupServiceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupServiceWhereInput addANDItem(BackupServiceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupServiceWhereInput>();
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
    public List<BackupServiceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupServiceWhereInput> AND) {
        this.AND = AND;
    }

    public BackupServiceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupServiceWhereInput AND_ExplictlyNonNull() {
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

    public BackupServiceWhereInput NOT(List<BackupServiceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupServiceWhereInput addNOTItem(BackupServiceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupServiceWhereInput>();
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
    public List<BackupServiceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupServiceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupServiceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupServiceWhereInput NOT_ExplictlyNonNull() {
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

    public BackupServiceWhereInput OR(List<BackupServiceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupServiceWhereInput addORItem(BackupServiceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupServiceWhereInput>();
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
    public List<BackupServiceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupServiceWhereInput> OR) {
        this.OR = OR;
    }

    public BackupServiceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupServiceWhereInput OR_ExplictlyNonNull() {
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

    public BackupServiceWhereInput backupClustersEvery(ClusterWhereInput backupClustersEvery) {

        this.backupClustersEvery = backupClustersEvery;
        return this;
    }

    /**
     * Get backupClustersEvery
     *
     * @return backupClustersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getBackupClustersEvery() {
        return backupClustersEvery;
    }

    public void setBackupClustersEvery(ClusterWhereInput backupClustersEvery) {
        this.backupClustersEvery = backupClustersEvery;
    }

    public BackupServiceWhereInput backupClustersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY);
        return this;
    }

    public BackupServiceWhereInput backupClustersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY);
        return this;
    }

    public void setBackupClustersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY);
        }
    }

    public boolean getBackupClustersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_CLUSTERS_EVERY);
    }

    public BackupServiceWhereInput backupClustersNone(ClusterWhereInput backupClustersNone) {

        this.backupClustersNone = backupClustersNone;
        return this;
    }

    /**
     * Get backupClustersNone
     *
     * @return backupClustersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getBackupClustersNone() {
        return backupClustersNone;
    }

    public void setBackupClustersNone(ClusterWhereInput backupClustersNone) {
        this.backupClustersNone = backupClustersNone;
    }

    public BackupServiceWhereInput backupClustersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE);
        return this;
    }

    public BackupServiceWhereInput backupClustersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE);
        return this;
    }

    public void setBackupClustersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE);
        }
    }

    public boolean getBackupClustersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_CLUSTERS_NONE);
    }

    public BackupServiceWhereInput backupClustersSome(ClusterWhereInput backupClustersSome) {

        this.backupClustersSome = backupClustersSome;
        return this;
    }

    /**
     * Get backupClustersSome
     *
     * @return backupClustersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getBackupClustersSome() {
        return backupClustersSome;
    }

    public void setBackupClustersSome(ClusterWhereInput backupClustersSome) {
        this.backupClustersSome = backupClustersSome;
    }

    public BackupServiceWhereInput backupClustersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME);
        return this;
    }

    public BackupServiceWhereInput backupClustersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME);
        return this;
    }

    public void setBackupClustersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME);
        }
    }

    public boolean getBackupClustersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_CLUSTERS_SOME);
    }

    public BackupServiceWhereInput backupNetworkGateway(String backupNetworkGateway) {

        this.backupNetworkGateway = backupNetworkGateway;
        return this;
    }

    /**
     * Get backupNetworkGateway
     *
     * @return backupNetworkGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGateway() {
        return backupNetworkGateway;
    }

    public void setBackupNetworkGateway(String backupNetworkGateway) {
        this.backupNetworkGateway = backupNetworkGateway;
    }

    public BackupServiceWhereInput backupNetworkGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY);
        return this;
    }

    public void setBackupNetworkGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY);
        }
    }

    public boolean getBackupNetworkGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY);
    }

    public BackupServiceWhereInput backupNetworkGatewayContains(
            String backupNetworkGatewayContains) {

        this.backupNetworkGatewayContains = backupNetworkGatewayContains;
        return this;
    }

    /**
     * Get backupNetworkGatewayContains
     *
     * @return backupNetworkGatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayContains() {
        return backupNetworkGatewayContains;
    }

    public void setBackupNetworkGatewayContains(String backupNetworkGatewayContains) {
        this.backupNetworkGatewayContains = backupNetworkGatewayContains;
    }

    public BackupServiceWhereInput backupNetworkGatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public void setBackupNetworkGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS);
        }
    }

    public boolean getBackupNetworkGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkGatewayEndsWith(
            String backupNetworkGatewayEndsWith) {

        this.backupNetworkGatewayEndsWith = backupNetworkGatewayEndsWith;
        return this;
    }

    /**
     * Get backupNetworkGatewayEndsWith
     *
     * @return backupNetworkGatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayEndsWith() {
        return backupNetworkGatewayEndsWith;
    }

    public void setBackupNetworkGatewayEndsWith(String backupNetworkGatewayEndsWith) {
        this.backupNetworkGatewayEndsWith = backupNetworkGatewayEndsWith;
    }

    public BackupServiceWhereInput backupNetworkGatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkGatewayGt(String backupNetworkGatewayGt) {

        this.backupNetworkGatewayGt = backupNetworkGatewayGt;
        return this;
    }

    /**
     * Get backupNetworkGatewayGt
     *
     * @return backupNetworkGatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayGt() {
        return backupNetworkGatewayGt;
    }

    public void setBackupNetworkGatewayGt(String backupNetworkGatewayGt) {
        this.backupNetworkGatewayGt = backupNetworkGatewayGt;
    }

    public BackupServiceWhereInput backupNetworkGatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT);
        return this;
    }

    public void setBackupNetworkGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT);
        }
    }

    public boolean getBackupNetworkGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GT);
    }

    public BackupServiceWhereInput backupNetworkGatewayGte(String backupNetworkGatewayGte) {

        this.backupNetworkGatewayGte = backupNetworkGatewayGte;
        return this;
    }

    /**
     * Get backupNetworkGatewayGte
     *
     * @return backupNetworkGatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayGte() {
        return backupNetworkGatewayGte;
    }

    public void setBackupNetworkGatewayGte(String backupNetworkGatewayGte) {
        this.backupNetworkGatewayGte = backupNetworkGatewayGte;
    }

    public BackupServiceWhereInput backupNetworkGatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE);
        return this;
    }

    public void setBackupNetworkGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE);
        }
    }

    public boolean getBackupNetworkGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_GTE);
    }

    public BackupServiceWhereInput backupNetworkGatewayIn(List<String> backupNetworkGatewayIn) {

        this.backupNetworkGatewayIn = backupNetworkGatewayIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkGatewayInItem(
            String backupNetworkGatewayInItem) {
        if (this.backupNetworkGatewayIn == null) {
            this.backupNetworkGatewayIn = new ArrayList<String>();
        }
        this.backupNetworkGatewayIn.add(backupNetworkGatewayInItem);
        return this;
    }

    /**
     * Get backupNetworkGatewayIn
     *
     * @return backupNetworkGatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkGatewayIn() {
        return backupNetworkGatewayIn;
    }

    public void setBackupNetworkGatewayIn(List<String> backupNetworkGatewayIn) {
        this.backupNetworkGatewayIn = backupNetworkGatewayIn;
    }

    public BackupServiceWhereInput backupNetworkGatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN);
        return this;
    }

    public void setBackupNetworkGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN);
        }
    }

    public boolean getBackupNetworkGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_IN);
    }

    public BackupServiceWhereInput backupNetworkGatewayLt(String backupNetworkGatewayLt) {

        this.backupNetworkGatewayLt = backupNetworkGatewayLt;
        return this;
    }

    /**
     * Get backupNetworkGatewayLt
     *
     * @return backupNetworkGatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayLt() {
        return backupNetworkGatewayLt;
    }

    public void setBackupNetworkGatewayLt(String backupNetworkGatewayLt) {
        this.backupNetworkGatewayLt = backupNetworkGatewayLt;
    }

    public BackupServiceWhereInput backupNetworkGatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT);
        return this;
    }

    public void setBackupNetworkGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT);
        }
    }

    public boolean getBackupNetworkGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LT);
    }

    public BackupServiceWhereInput backupNetworkGatewayLte(String backupNetworkGatewayLte) {

        this.backupNetworkGatewayLte = backupNetworkGatewayLte;
        return this;
    }

    /**
     * Get backupNetworkGatewayLte
     *
     * @return backupNetworkGatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayLte() {
        return backupNetworkGatewayLte;
    }

    public void setBackupNetworkGatewayLte(String backupNetworkGatewayLte) {
        this.backupNetworkGatewayLte = backupNetworkGatewayLte;
    }

    public BackupServiceWhereInput backupNetworkGatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE);
        return this;
    }

    public void setBackupNetworkGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE);
        }
    }

    public boolean getBackupNetworkGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_LTE);
    }

    public BackupServiceWhereInput backupNetworkGatewayNot(String backupNetworkGatewayNot) {

        this.backupNetworkGatewayNot = backupNetworkGatewayNot;
        return this;
    }

    /**
     * Get backupNetworkGatewayNot
     *
     * @return backupNetworkGatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayNot() {
        return backupNetworkGatewayNot;
    }

    public void setBackupNetworkGatewayNot(String backupNetworkGatewayNot) {
        this.backupNetworkGatewayNot = backupNetworkGatewayNot;
    }

    public BackupServiceWhereInput backupNetworkGatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT);
        return this;
    }

    public void setBackupNetworkGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT);
        }
    }

    public boolean getBackupNetworkGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT);
    }

    public BackupServiceWhereInput backupNetworkGatewayNotContains(
            String backupNetworkGatewayNotContains) {

        this.backupNetworkGatewayNotContains = backupNetworkGatewayNotContains;
        return this;
    }

    /**
     * Get backupNetworkGatewayNotContains
     *
     * @return backupNetworkGatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayNotContains() {
        return backupNetworkGatewayNotContains;
    }

    public void setBackupNetworkGatewayNotContains(String backupNetworkGatewayNotContains) {
        this.backupNetworkGatewayNotContains = backupNetworkGatewayNotContains;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setBackupNetworkGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getBackupNetworkGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkGatewayNotEndsWith(
            String backupNetworkGatewayNotEndsWith) {

        this.backupNetworkGatewayNotEndsWith = backupNetworkGatewayNotEndsWith;
        return this;
    }

    /**
     * Get backupNetworkGatewayNotEndsWith
     *
     * @return backupNetworkGatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayNotEndsWith() {
        return backupNetworkGatewayNotEndsWith;
    }

    public void setBackupNetworkGatewayNotEndsWith(String backupNetworkGatewayNotEndsWith) {
        this.backupNetworkGatewayNotEndsWith = backupNetworkGatewayNotEndsWith;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkGatewayNotIn(
            List<String> backupNetworkGatewayNotIn) {

        this.backupNetworkGatewayNotIn = backupNetworkGatewayNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkGatewayNotInItem(
            String backupNetworkGatewayNotInItem) {
        if (this.backupNetworkGatewayNotIn == null) {
            this.backupNetworkGatewayNotIn = new ArrayList<String>();
        }
        this.backupNetworkGatewayNotIn.add(backupNetworkGatewayNotInItem);
        return this;
    }

    /**
     * Get backupNetworkGatewayNotIn
     *
     * @return backupNetworkGatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkGatewayNotIn() {
        return backupNetworkGatewayNotIn;
    }

    public void setBackupNetworkGatewayNotIn(List<String> backupNetworkGatewayNotIn) {
        this.backupNetworkGatewayNotIn = backupNetworkGatewayNotIn;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public void setBackupNetworkGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN);
        }
    }

    public boolean getBackupNetworkGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_IN);
    }

    public BackupServiceWhereInput backupNetworkGatewayNotStartsWith(
            String backupNetworkGatewayNotStartsWith) {

        this.backupNetworkGatewayNotStartsWith = backupNetworkGatewayNotStartsWith;
        return this;
    }

    /**
     * Get backupNetworkGatewayNotStartsWith
     *
     * @return backupNetworkGatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayNotStartsWith() {
        return backupNetworkGatewayNotStartsWith;
    }

    public void setBackupNetworkGatewayNotStartsWith(String backupNetworkGatewayNotStartsWith) {
        this.backupNetworkGatewayNotStartsWith = backupNetworkGatewayNotStartsWith;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkGatewayStartsWith(
            String backupNetworkGatewayStartsWith) {

        this.backupNetworkGatewayStartsWith = backupNetworkGatewayStartsWith;
        return this;
    }

    /**
     * Get backupNetworkGatewayStartsWith
     *
     * @return backupNetworkGatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkGatewayStartsWith() {
        return backupNetworkGatewayStartsWith;
    }

    public void setBackupNetworkGatewayStartsWith(String backupNetworkGatewayStartsWith) {
        this.backupNetworkGatewayStartsWith = backupNetworkGatewayStartsWith;
    }

    public BackupServiceWhereInput backupNetworkGatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkGatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_GATEWAY_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkIp(String backupNetworkIp) {

        this.backupNetworkIp = backupNetworkIp;
        return this;
    }

    /**
     * Get backupNetworkIp
     *
     * @return backupNetworkIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIp() {
        return backupNetworkIp;
    }

    public void setBackupNetworkIp(String backupNetworkIp) {
        this.backupNetworkIp = backupNetworkIp;
    }

    public BackupServiceWhereInput backupNetworkIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP);
        return this;
    }

    public void setBackupNetworkIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP);
        }
    }

    public boolean getBackupNetworkIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP);
    }

    public BackupServiceWhereInput backupNetworkIpContains(String backupNetworkIpContains) {

        this.backupNetworkIpContains = backupNetworkIpContains;
        return this;
    }

    /**
     * Get backupNetworkIpContains
     *
     * @return backupNetworkIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpContains() {
        return backupNetworkIpContains;
    }

    public void setBackupNetworkIpContains(String backupNetworkIpContains) {
        this.backupNetworkIpContains = backupNetworkIpContains;
    }

    public BackupServiceWhereInput backupNetworkIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS);
        return this;
    }

    public void setBackupNetworkIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS);
        }
    }

    public boolean getBackupNetworkIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkIpEndsWith(String backupNetworkIpEndsWith) {

        this.backupNetworkIpEndsWith = backupNetworkIpEndsWith;
        return this;
    }

    /**
     * Get backupNetworkIpEndsWith
     *
     * @return backupNetworkIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpEndsWith() {
        return backupNetworkIpEndsWith;
    }

    public void setBackupNetworkIpEndsWith(String backupNetworkIpEndsWith) {
        this.backupNetworkIpEndsWith = backupNetworkIpEndsWith;
    }

    public BackupServiceWhereInput backupNetworkIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkIpGt(String backupNetworkIpGt) {

        this.backupNetworkIpGt = backupNetworkIpGt;
        return this;
    }

    /**
     * Get backupNetworkIpGt
     *
     * @return backupNetworkIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpGt() {
        return backupNetworkIpGt;
    }

    public void setBackupNetworkIpGt(String backupNetworkIpGt) {
        this.backupNetworkIpGt = backupNetworkIpGt;
    }

    public BackupServiceWhereInput backupNetworkIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT);
        return this;
    }

    public void setBackupNetworkIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT);
        }
    }

    public boolean getBackupNetworkIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_GT);
    }

    public BackupServiceWhereInput backupNetworkIpGte(String backupNetworkIpGte) {

        this.backupNetworkIpGte = backupNetworkIpGte;
        return this;
    }

    /**
     * Get backupNetworkIpGte
     *
     * @return backupNetworkIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpGte() {
        return backupNetworkIpGte;
    }

    public void setBackupNetworkIpGte(String backupNetworkIpGte) {
        this.backupNetworkIpGte = backupNetworkIpGte;
    }

    public BackupServiceWhereInput backupNetworkIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE);
        return this;
    }

    public void setBackupNetworkIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE);
        }
    }

    public boolean getBackupNetworkIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_GTE);
    }

    public BackupServiceWhereInput backupNetworkIpIn(List<String> backupNetworkIpIn) {

        this.backupNetworkIpIn = backupNetworkIpIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkIpInItem(String backupNetworkIpInItem) {
        if (this.backupNetworkIpIn == null) {
            this.backupNetworkIpIn = new ArrayList<String>();
        }
        this.backupNetworkIpIn.add(backupNetworkIpInItem);
        return this;
    }

    /**
     * Get backupNetworkIpIn
     *
     * @return backupNetworkIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkIpIn() {
        return backupNetworkIpIn;
    }

    public void setBackupNetworkIpIn(List<String> backupNetworkIpIn) {
        this.backupNetworkIpIn = backupNetworkIpIn;
    }

    public BackupServiceWhereInput backupNetworkIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN);
        return this;
    }

    public void setBackupNetworkIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN);
        }
    }

    public boolean getBackupNetworkIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_IN);
    }

    public BackupServiceWhereInput backupNetworkIpLt(String backupNetworkIpLt) {

        this.backupNetworkIpLt = backupNetworkIpLt;
        return this;
    }

    /**
     * Get backupNetworkIpLt
     *
     * @return backupNetworkIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpLt() {
        return backupNetworkIpLt;
    }

    public void setBackupNetworkIpLt(String backupNetworkIpLt) {
        this.backupNetworkIpLt = backupNetworkIpLt;
    }

    public BackupServiceWhereInput backupNetworkIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT);
        return this;
    }

    public void setBackupNetworkIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT);
        }
    }

    public boolean getBackupNetworkIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_LT);
    }

    public BackupServiceWhereInput backupNetworkIpLte(String backupNetworkIpLte) {

        this.backupNetworkIpLte = backupNetworkIpLte;
        return this;
    }

    /**
     * Get backupNetworkIpLte
     *
     * @return backupNetworkIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpLte() {
        return backupNetworkIpLte;
    }

    public void setBackupNetworkIpLte(String backupNetworkIpLte) {
        this.backupNetworkIpLte = backupNetworkIpLte;
    }

    public BackupServiceWhereInput backupNetworkIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE);
        return this;
    }

    public void setBackupNetworkIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE);
        }
    }

    public boolean getBackupNetworkIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_LTE);
    }

    public BackupServiceWhereInput backupNetworkIpNot(String backupNetworkIpNot) {

        this.backupNetworkIpNot = backupNetworkIpNot;
        return this;
    }

    /**
     * Get backupNetworkIpNot
     *
     * @return backupNetworkIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpNot() {
        return backupNetworkIpNot;
    }

    public void setBackupNetworkIpNot(String backupNetworkIpNot) {
        this.backupNetworkIpNot = backupNetworkIpNot;
    }

    public BackupServiceWhereInput backupNetworkIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT);
        return this;
    }

    public void setBackupNetworkIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT);
        }
    }

    public boolean getBackupNetworkIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT);
    }

    public BackupServiceWhereInput backupNetworkIpNotContains(String backupNetworkIpNotContains) {

        this.backupNetworkIpNotContains = backupNetworkIpNotContains;
        return this;
    }

    /**
     * Get backupNetworkIpNotContains
     *
     * @return backupNetworkIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpNotContains() {
        return backupNetworkIpNotContains;
    }

    public void setBackupNetworkIpNotContains(String backupNetworkIpNotContains) {
        this.backupNetworkIpNotContains = backupNetworkIpNotContains;
    }

    public BackupServiceWhereInput backupNetworkIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public void setBackupNetworkIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS);
        }
    }

    public boolean getBackupNetworkIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkIpNotEndsWith(String backupNetworkIpNotEndsWith) {

        this.backupNetworkIpNotEndsWith = backupNetworkIpNotEndsWith;
        return this;
    }

    /**
     * Get backupNetworkIpNotEndsWith
     *
     * @return backupNetworkIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpNotEndsWith() {
        return backupNetworkIpNotEndsWith;
    }

    public void setBackupNetworkIpNotEndsWith(String backupNetworkIpNotEndsWith) {
        this.backupNetworkIpNotEndsWith = backupNetworkIpNotEndsWith;
    }

    public BackupServiceWhereInput backupNetworkIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkIpNotIn(List<String> backupNetworkIpNotIn) {

        this.backupNetworkIpNotIn = backupNetworkIpNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkIpNotInItem(String backupNetworkIpNotInItem) {
        if (this.backupNetworkIpNotIn == null) {
            this.backupNetworkIpNotIn = new ArrayList<String>();
        }
        this.backupNetworkIpNotIn.add(backupNetworkIpNotInItem);
        return this;
    }

    /**
     * Get backupNetworkIpNotIn
     *
     * @return backupNetworkIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkIpNotIn() {
        return backupNetworkIpNotIn;
    }

    public void setBackupNetworkIpNotIn(List<String> backupNetworkIpNotIn) {
        this.backupNetworkIpNotIn = backupNetworkIpNotIn;
    }

    public BackupServiceWhereInput backupNetworkIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN);
        return this;
    }

    public void setBackupNetworkIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN);
        }
    }

    public boolean getBackupNetworkIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_IN);
    }

    public BackupServiceWhereInput backupNetworkIpNotStartsWith(
            String backupNetworkIpNotStartsWith) {

        this.backupNetworkIpNotStartsWith = backupNetworkIpNotStartsWith;
        return this;
    }

    /**
     * Get backupNetworkIpNotStartsWith
     *
     * @return backupNetworkIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpNotStartsWith() {
        return backupNetworkIpNotStartsWith;
    }

    public void setBackupNetworkIpNotStartsWith(String backupNetworkIpNotStartsWith) {
        this.backupNetworkIpNotStartsWith = backupNetworkIpNotStartsWith;
    }

    public BackupServiceWhereInput backupNetworkIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkIpStartsWith(String backupNetworkIpStartsWith) {

        this.backupNetworkIpStartsWith = backupNetworkIpStartsWith;
        return this;
    }

    /**
     * Get backupNetworkIpStartsWith
     *
     * @return backupNetworkIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkIpStartsWith() {
        return backupNetworkIpStartsWith;
    }

    public void setBackupNetworkIpStartsWith(String backupNetworkIpStartsWith) {
        this.backupNetworkIpStartsWith = backupNetworkIpStartsWith;
    }

    public BackupServiceWhereInput backupNetworkIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_IP_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkSubnetMask(String backupNetworkSubnetMask) {

        this.backupNetworkSubnetMask = backupNetworkSubnetMask;
        return this;
    }

    /**
     * Get backupNetworkSubnetMask
     *
     * @return backupNetworkSubnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMask() {
        return backupNetworkSubnetMask;
    }

    public void setBackupNetworkSubnetMask(String backupNetworkSubnetMask) {
        this.backupNetworkSubnetMask = backupNetworkSubnetMask;
    }

    public BackupServiceWhereInput backupNetworkSubnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK);
        return this;
    }

    public void setBackupNetworkSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK);
        }
    }

    public boolean getBackupNetworkSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskContains(
            String backupNetworkSubnetMaskContains) {

        this.backupNetworkSubnetMaskContains = backupNetworkSubnetMaskContains;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskContains
     *
     * @return backupNetworkSubnetMaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskContains() {
        return backupNetworkSubnetMaskContains;
    }

    public void setBackupNetworkSubnetMaskContains(String backupNetworkSubnetMaskContains) {
        this.backupNetworkSubnetMaskContains = backupNetworkSubnetMaskContains;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public void setBackupNetworkSubnetMaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS);
        }
    }

    public boolean getBackupNetworkSubnetMaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskEndsWith(
            String backupNetworkSubnetMaskEndsWith) {

        this.backupNetworkSubnetMaskEndsWith = backupNetworkSubnetMaskEndsWith;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskEndsWith
     *
     * @return backupNetworkSubnetMaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskEndsWith() {
        return backupNetworkSubnetMaskEndsWith;
    }

    public void setBackupNetworkSubnetMaskEndsWith(String backupNetworkSubnetMaskEndsWith) {
        this.backupNetworkSubnetMaskEndsWith = backupNetworkSubnetMaskEndsWith;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkSubnetMaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkSubnetMaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGt(String backupNetworkSubnetMaskGt) {

        this.backupNetworkSubnetMaskGt = backupNetworkSubnetMaskGt;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskGt
     *
     * @return backupNetworkSubnetMaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskGt() {
        return backupNetworkSubnetMaskGt;
    }

    public void setBackupNetworkSubnetMaskGt(String backupNetworkSubnetMaskGt) {
        this.backupNetworkSubnetMaskGt = backupNetworkSubnetMaskGt;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public void setBackupNetworkSubnetMaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT);
        }
    }

    public boolean getBackupNetworkSubnetMaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GT);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGte(String backupNetworkSubnetMaskGte) {

        this.backupNetworkSubnetMaskGte = backupNetworkSubnetMaskGte;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskGte
     *
     * @return backupNetworkSubnetMaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskGte() {
        return backupNetworkSubnetMaskGte;
    }

    public void setBackupNetworkSubnetMaskGte(String backupNetworkSubnetMaskGte) {
        this.backupNetworkSubnetMaskGte = backupNetworkSubnetMaskGte;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public void setBackupNetworkSubnetMaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE);
        }
    }

    public boolean getBackupNetworkSubnetMaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_GTE);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskIn(
            List<String> backupNetworkSubnetMaskIn) {

        this.backupNetworkSubnetMaskIn = backupNetworkSubnetMaskIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkSubnetMaskInItem(
            String backupNetworkSubnetMaskInItem) {
        if (this.backupNetworkSubnetMaskIn == null) {
            this.backupNetworkSubnetMaskIn = new ArrayList<String>();
        }
        this.backupNetworkSubnetMaskIn.add(backupNetworkSubnetMaskInItem);
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskIn
     *
     * @return backupNetworkSubnetMaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkSubnetMaskIn() {
        return backupNetworkSubnetMaskIn;
    }

    public void setBackupNetworkSubnetMaskIn(List<String> backupNetworkSubnetMaskIn) {
        this.backupNetworkSubnetMaskIn = backupNetworkSubnetMaskIn;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public void setBackupNetworkSubnetMaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN);
        }
    }

    public boolean getBackupNetworkSubnetMaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_IN);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLt(String backupNetworkSubnetMaskLt) {

        this.backupNetworkSubnetMaskLt = backupNetworkSubnetMaskLt;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskLt
     *
     * @return backupNetworkSubnetMaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskLt() {
        return backupNetworkSubnetMaskLt;
    }

    public void setBackupNetworkSubnetMaskLt(String backupNetworkSubnetMaskLt) {
        this.backupNetworkSubnetMaskLt = backupNetworkSubnetMaskLt;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public void setBackupNetworkSubnetMaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT);
        }
    }

    public boolean getBackupNetworkSubnetMaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LT);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLte(String backupNetworkSubnetMaskLte) {

        this.backupNetworkSubnetMaskLte = backupNetworkSubnetMaskLte;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskLte
     *
     * @return backupNetworkSubnetMaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskLte() {
        return backupNetworkSubnetMaskLte;
    }

    public void setBackupNetworkSubnetMaskLte(String backupNetworkSubnetMaskLte) {
        this.backupNetworkSubnetMaskLte = backupNetworkSubnetMaskLte;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public void setBackupNetworkSubnetMaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE);
        }
    }

    public boolean getBackupNetworkSubnetMaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_LTE);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNot(String backupNetworkSubnetMaskNot) {

        this.backupNetworkSubnetMaskNot = backupNetworkSubnetMaskNot;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskNot
     *
     * @return backupNetworkSubnetMaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskNot() {
        return backupNetworkSubnetMaskNot;
    }

    public void setBackupNetworkSubnetMaskNot(String backupNetworkSubnetMaskNot) {
        this.backupNetworkSubnetMaskNot = backupNetworkSubnetMaskNot;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public void setBackupNetworkSubnetMaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT);
        }
    }

    public boolean getBackupNetworkSubnetMaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotContains(
            String backupNetworkSubnetMaskNotContains) {

        this.backupNetworkSubnetMaskNotContains = backupNetworkSubnetMaskNotContains;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskNotContains
     *
     * @return backupNetworkSubnetMaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskNotContains() {
        return backupNetworkSubnetMaskNotContains;
    }

    public void setBackupNetworkSubnetMaskNotContains(String backupNetworkSubnetMaskNotContains) {
        this.backupNetworkSubnetMaskNotContains = backupNetworkSubnetMaskNotContains;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public void setBackupNetworkSubnetMaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        }
    }

    public boolean getBackupNetworkSubnetMaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotEndsWith(
            String backupNetworkSubnetMaskNotEndsWith) {

        this.backupNetworkSubnetMaskNotEndsWith = backupNetworkSubnetMaskNotEndsWith;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskNotEndsWith
     *
     * @return backupNetworkSubnetMaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskNotEndsWith() {
        return backupNetworkSubnetMaskNotEndsWith;
    }

    public void setBackupNetworkSubnetMaskNotEndsWith(String backupNetworkSubnetMaskNotEndsWith) {
        this.backupNetworkSubnetMaskNotEndsWith = backupNetworkSubnetMaskNotEndsWith;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkSubnetMaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkSubnetMaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotIn(
            List<String> backupNetworkSubnetMaskNotIn) {

        this.backupNetworkSubnetMaskNotIn = backupNetworkSubnetMaskNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkSubnetMaskNotInItem(
            String backupNetworkSubnetMaskNotInItem) {
        if (this.backupNetworkSubnetMaskNotIn == null) {
            this.backupNetworkSubnetMaskNotIn = new ArrayList<String>();
        }
        this.backupNetworkSubnetMaskNotIn.add(backupNetworkSubnetMaskNotInItem);
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskNotIn
     *
     * @return backupNetworkSubnetMaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkSubnetMaskNotIn() {
        return backupNetworkSubnetMaskNotIn;
    }

    public void setBackupNetworkSubnetMaskNotIn(List<String> backupNetworkSubnetMaskNotIn) {
        this.backupNetworkSubnetMaskNotIn = backupNetworkSubnetMaskNotIn;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public void setBackupNetworkSubnetMaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN);
        }
    }

    public boolean getBackupNetworkSubnetMaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_IN);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotStartsWith(
            String backupNetworkSubnetMaskNotStartsWith) {

        this.backupNetworkSubnetMaskNotStartsWith = backupNetworkSubnetMaskNotStartsWith;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskNotStartsWith
     *
     * @return backupNetworkSubnetMaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskNotStartsWith() {
        return backupNetworkSubnetMaskNotStartsWith;
    }

    public void setBackupNetworkSubnetMaskNotStartsWith(
            String backupNetworkSubnetMaskNotStartsWith) {
        this.backupNetworkSubnetMaskNotStartsWith = backupNetworkSubnetMaskNotStartsWith;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkSubnetMaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkSubnetMaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskStartsWith(
            String backupNetworkSubnetMaskStartsWith) {

        this.backupNetworkSubnetMaskStartsWith = backupNetworkSubnetMaskStartsWith;
        return this;
    }

    /**
     * Get backupNetworkSubnetMaskStartsWith
     *
     * @return backupNetworkSubnetMaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkSubnetMaskStartsWith() {
        return backupNetworkSubnetMaskStartsWith;
    }

    public void setBackupNetworkSubnetMaskStartsWith(String backupNetworkSubnetMaskStartsWith) {
        this.backupNetworkSubnetMaskStartsWith = backupNetworkSubnetMaskStartsWith;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkSubnetMaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkSubnetMaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkSubnetMaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_SUBNET_MASK_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkType(BackupServiceNetworkType backupNetworkType) {

        this.backupNetworkType = backupNetworkType;
        return this;
    }

    /**
     * Get backupNetworkType
     *
     * @return backupNetworkType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceNetworkType getBackupNetworkType() {
        return backupNetworkType;
    }

    public void setBackupNetworkType(BackupServiceNetworkType backupNetworkType) {
        this.backupNetworkType = backupNetworkType;
    }

    public BackupServiceWhereInput backupNetworkType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE);
        return this;
    }

    public void setBackupNetworkType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE);
        }
    }

    public boolean getBackupNetworkType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_TYPE);
    }

    public BackupServiceWhereInput backupNetworkTypeIn(
            List<BackupServiceNetworkType> backupNetworkTypeIn) {

        this.backupNetworkTypeIn = backupNetworkTypeIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkTypeInItem(
            BackupServiceNetworkType backupNetworkTypeInItem) {
        if (this.backupNetworkTypeIn == null) {
            this.backupNetworkTypeIn = new ArrayList<BackupServiceNetworkType>();
        }
        this.backupNetworkTypeIn.add(backupNetworkTypeInItem);
        return this;
    }

    /**
     * Get backupNetworkTypeIn
     *
     * @return backupNetworkTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceNetworkType> getBackupNetworkTypeIn() {
        return backupNetworkTypeIn;
    }

    public void setBackupNetworkTypeIn(List<BackupServiceNetworkType> backupNetworkTypeIn) {
        this.backupNetworkTypeIn = backupNetworkTypeIn;
    }

    public BackupServiceWhereInput backupNetworkTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN);
        return this;
    }

    public void setBackupNetworkTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN);
        }
    }

    public boolean getBackupNetworkTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_IN);
    }

    public BackupServiceWhereInput backupNetworkTypeNot(
            BackupServiceNetworkType backupNetworkTypeNot) {

        this.backupNetworkTypeNot = backupNetworkTypeNot;
        return this;
    }

    /**
     * Get backupNetworkTypeNot
     *
     * @return backupNetworkTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceNetworkType getBackupNetworkTypeNot() {
        return backupNetworkTypeNot;
    }

    public void setBackupNetworkTypeNot(BackupServiceNetworkType backupNetworkTypeNot) {
        this.backupNetworkTypeNot = backupNetworkTypeNot;
    }

    public BackupServiceWhereInput backupNetworkTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT);
        return this;
    }

    public void setBackupNetworkTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT);
        }
    }

    public boolean getBackupNetworkTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT);
    }

    public BackupServiceWhereInput backupNetworkTypeNotIn(
            List<BackupServiceNetworkType> backupNetworkTypeNotIn) {

        this.backupNetworkTypeNotIn = backupNetworkTypeNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkTypeNotInItem(
            BackupServiceNetworkType backupNetworkTypeNotInItem) {
        if (this.backupNetworkTypeNotIn == null) {
            this.backupNetworkTypeNotIn = new ArrayList<BackupServiceNetworkType>();
        }
        this.backupNetworkTypeNotIn.add(backupNetworkTypeNotInItem);
        return this;
    }

    /**
     * Get backupNetworkTypeNotIn
     *
     * @return backupNetworkTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceNetworkType> getBackupNetworkTypeNotIn() {
        return backupNetworkTypeNotIn;
    }

    public void setBackupNetworkTypeNotIn(List<BackupServiceNetworkType> backupNetworkTypeNotIn) {
        this.backupNetworkTypeNotIn = backupNetworkTypeNotIn;
    }

    public BackupServiceWhereInput backupNetworkTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public void setBackupNetworkTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN);
        }
    }

    public boolean getBackupNetworkTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_TYPE_NOT_IN);
    }

    public BackupServiceWhereInput backupNetworkVlan(String backupNetworkVlan) {

        this.backupNetworkVlan = backupNetworkVlan;
        return this;
    }

    /**
     * Get backupNetworkVlan
     *
     * @return backupNetworkVlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlan() {
        return backupNetworkVlan;
    }

    public void setBackupNetworkVlan(String backupNetworkVlan) {
        this.backupNetworkVlan = backupNetworkVlan;
    }

    public BackupServiceWhereInput backupNetworkVlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN);
        return this;
    }

    public void setBackupNetworkVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN);
        }
    }

    public boolean getBackupNetworkVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN);
    }

    public BackupServiceWhereInput backupNetworkVlanContains(String backupNetworkVlanContains) {

        this.backupNetworkVlanContains = backupNetworkVlanContains;
        return this;
    }

    /**
     * Get backupNetworkVlanContains
     *
     * @return backupNetworkVlanContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanContains() {
        return backupNetworkVlanContains;
    }

    public void setBackupNetworkVlanContains(String backupNetworkVlanContains) {
        this.backupNetworkVlanContains = backupNetworkVlanContains;
    }

    public BackupServiceWhereInput backupNetworkVlanContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public void setBackupNetworkVlanContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS);
        }
    }

    public boolean getBackupNetworkVlanContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkVlanEndsWith(String backupNetworkVlanEndsWith) {

        this.backupNetworkVlanEndsWith = backupNetworkVlanEndsWith;
        return this;
    }

    /**
     * Get backupNetworkVlanEndsWith
     *
     * @return backupNetworkVlanEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanEndsWith() {
        return backupNetworkVlanEndsWith;
    }

    public void setBackupNetworkVlanEndsWith(String backupNetworkVlanEndsWith) {
        this.backupNetworkVlanEndsWith = backupNetworkVlanEndsWith;
    }

    public BackupServiceWhereInput backupNetworkVlanEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkVlanEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkVlanEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkVlanGt(String backupNetworkVlanGt) {

        this.backupNetworkVlanGt = backupNetworkVlanGt;
        return this;
    }

    /**
     * Get backupNetworkVlanGt
     *
     * @return backupNetworkVlanGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanGt() {
        return backupNetworkVlanGt;
    }

    public void setBackupNetworkVlanGt(String backupNetworkVlanGt) {
        this.backupNetworkVlanGt = backupNetworkVlanGt;
    }

    public BackupServiceWhereInput backupNetworkVlanGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT);
        return this;
    }

    public void setBackupNetworkVlanGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT);
        }
    }

    public boolean getBackupNetworkVlanGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GT);
    }

    public BackupServiceWhereInput backupNetworkVlanGte(String backupNetworkVlanGte) {

        this.backupNetworkVlanGte = backupNetworkVlanGte;
        return this;
    }

    /**
     * Get backupNetworkVlanGte
     *
     * @return backupNetworkVlanGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanGte() {
        return backupNetworkVlanGte;
    }

    public void setBackupNetworkVlanGte(String backupNetworkVlanGte) {
        this.backupNetworkVlanGte = backupNetworkVlanGte;
    }

    public BackupServiceWhereInput backupNetworkVlanGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE);
        return this;
    }

    public void setBackupNetworkVlanGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE);
        }
    }

    public boolean getBackupNetworkVlanGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_GTE);
    }

    public BackupServiceWhereInput backupNetworkVlanIn(List<String> backupNetworkVlanIn) {

        this.backupNetworkVlanIn = backupNetworkVlanIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkVlanInItem(String backupNetworkVlanInItem) {
        if (this.backupNetworkVlanIn == null) {
            this.backupNetworkVlanIn = new ArrayList<String>();
        }
        this.backupNetworkVlanIn.add(backupNetworkVlanInItem);
        return this;
    }

    /**
     * Get backupNetworkVlanIn
     *
     * @return backupNetworkVlanIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkVlanIn() {
        return backupNetworkVlanIn;
    }

    public void setBackupNetworkVlanIn(List<String> backupNetworkVlanIn) {
        this.backupNetworkVlanIn = backupNetworkVlanIn;
    }

    public BackupServiceWhereInput backupNetworkVlanIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN);
        return this;
    }

    public void setBackupNetworkVlanIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN);
        }
    }

    public boolean getBackupNetworkVlanIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_IN);
    }

    public BackupServiceWhereInput backupNetworkVlanLt(String backupNetworkVlanLt) {

        this.backupNetworkVlanLt = backupNetworkVlanLt;
        return this;
    }

    /**
     * Get backupNetworkVlanLt
     *
     * @return backupNetworkVlanLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanLt() {
        return backupNetworkVlanLt;
    }

    public void setBackupNetworkVlanLt(String backupNetworkVlanLt) {
        this.backupNetworkVlanLt = backupNetworkVlanLt;
    }

    public BackupServiceWhereInput backupNetworkVlanLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT);
        return this;
    }

    public void setBackupNetworkVlanLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT);
        }
    }

    public boolean getBackupNetworkVlanLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LT);
    }

    public BackupServiceWhereInput backupNetworkVlanLte(String backupNetworkVlanLte) {

        this.backupNetworkVlanLte = backupNetworkVlanLte;
        return this;
    }

    /**
     * Get backupNetworkVlanLte
     *
     * @return backupNetworkVlanLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanLte() {
        return backupNetworkVlanLte;
    }

    public void setBackupNetworkVlanLte(String backupNetworkVlanLte) {
        this.backupNetworkVlanLte = backupNetworkVlanLte;
    }

    public BackupServiceWhereInput backupNetworkVlanLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE);
        return this;
    }

    public void setBackupNetworkVlanLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE);
        }
    }

    public boolean getBackupNetworkVlanLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_LTE);
    }

    public BackupServiceWhereInput backupNetworkVlanNot(String backupNetworkVlanNot) {

        this.backupNetworkVlanNot = backupNetworkVlanNot;
        return this;
    }

    /**
     * Get backupNetworkVlanNot
     *
     * @return backupNetworkVlanNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanNot() {
        return backupNetworkVlanNot;
    }

    public void setBackupNetworkVlanNot(String backupNetworkVlanNot) {
        this.backupNetworkVlanNot = backupNetworkVlanNot;
    }

    public BackupServiceWhereInput backupNetworkVlanNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT);
        return this;
    }

    public void setBackupNetworkVlanNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT);
        }
    }

    public boolean getBackupNetworkVlanNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT);
    }

    public BackupServiceWhereInput backupNetworkVlanNotContains(
            String backupNetworkVlanNotContains) {

        this.backupNetworkVlanNotContains = backupNetworkVlanNotContains;
        return this;
    }

    /**
     * Get backupNetworkVlanNotContains
     *
     * @return backupNetworkVlanNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanNotContains() {
        return backupNetworkVlanNotContains;
    }

    public void setBackupNetworkVlanNotContains(String backupNetworkVlanNotContains) {
        this.backupNetworkVlanNotContains = backupNetworkVlanNotContains;
    }

    public BackupServiceWhereInput backupNetworkVlanNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public void setBackupNetworkVlanNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS);
        }
    }

    public boolean getBackupNetworkVlanNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_CONTAINS);
    }

    public BackupServiceWhereInput backupNetworkVlanNotEndsWith(
            String backupNetworkVlanNotEndsWith) {

        this.backupNetworkVlanNotEndsWith = backupNetworkVlanNotEndsWith;
        return this;
    }

    /**
     * Get backupNetworkVlanNotEndsWith
     *
     * @return backupNetworkVlanNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanNotEndsWith() {
        return backupNetworkVlanNotEndsWith;
    }

    public void setBackupNetworkVlanNotEndsWith(String backupNetworkVlanNotEndsWith) {
        this.backupNetworkVlanNotEndsWith = backupNetworkVlanNotEndsWith;
    }

    public BackupServiceWhereInput backupNetworkVlanNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupNetworkVlanNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupNetworkVlanNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput backupNetworkVlanNotIn(List<String> backupNetworkVlanNotIn) {

        this.backupNetworkVlanNotIn = backupNetworkVlanNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupNetworkVlanNotInItem(
            String backupNetworkVlanNotInItem) {
        if (this.backupNetworkVlanNotIn == null) {
            this.backupNetworkVlanNotIn = new ArrayList<String>();
        }
        this.backupNetworkVlanNotIn.add(backupNetworkVlanNotInItem);
        return this;
    }

    /**
     * Get backupNetworkVlanNotIn
     *
     * @return backupNetworkVlanNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupNetworkVlanNotIn() {
        return backupNetworkVlanNotIn;
    }

    public void setBackupNetworkVlanNotIn(List<String> backupNetworkVlanNotIn) {
        this.backupNetworkVlanNotIn = backupNetworkVlanNotIn;
    }

    public BackupServiceWhereInput backupNetworkVlanNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public void setBackupNetworkVlanNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN);
        }
    }

    public boolean getBackupNetworkVlanNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_IN);
    }

    public BackupServiceWhereInput backupNetworkVlanNotStartsWith(
            String backupNetworkVlanNotStartsWith) {

        this.backupNetworkVlanNotStartsWith = backupNetworkVlanNotStartsWith;
        return this;
    }

    /**
     * Get backupNetworkVlanNotStartsWith
     *
     * @return backupNetworkVlanNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanNotStartsWith() {
        return backupNetworkVlanNotStartsWith;
    }

    public void setBackupNetworkVlanNotStartsWith(String backupNetworkVlanNotStartsWith) {
        this.backupNetworkVlanNotStartsWith = backupNetworkVlanNotStartsWith;
    }

    public BackupServiceWhereInput backupNetworkVlanNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkVlanNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkVlanNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput backupNetworkVlanStartsWith(String backupNetworkVlanStartsWith) {

        this.backupNetworkVlanStartsWith = backupNetworkVlanStartsWith;
        return this;
    }

    /**
     * Get backupNetworkVlanStartsWith
     *
     * @return backupNetworkVlanStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupNetworkVlanStartsWith() {
        return backupNetworkVlanStartsWith;
    }

    public void setBackupNetworkVlanStartsWith(String backupNetworkVlanStartsWith) {
        this.backupNetworkVlanStartsWith = backupNetworkVlanStartsWith;
    }

    public BackupServiceWhereInput backupNetworkVlanStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput backupNetworkVlanStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public void setBackupNetworkVlanStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH);
        }
    }

    public boolean getBackupNetworkVlanStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_NETWORK_VLAN_STARTS_WITH);
    }

    public BackupServiceWhereInput backupPlansEvery(BackupPlanWhereInput backupPlansEvery) {

        this.backupPlansEvery = backupPlansEvery;
        return this;
    }

    /**
     * Get backupPlansEvery
     *
     * @return backupPlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansEvery() {
        return backupPlansEvery;
    }

    public void setBackupPlansEvery(BackupPlanWhereInput backupPlansEvery) {
        this.backupPlansEvery = backupPlansEvery;
    }

    public BackupServiceWhereInput backupPlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        return this;
    }

    public BackupServiceWhereInput backupPlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        return this;
    }

    public void setBackupPlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        }
    }

    public boolean getBackupPlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
    }

    public BackupServiceWhereInput backupPlansNone(BackupPlanWhereInput backupPlansNone) {

        this.backupPlansNone = backupPlansNone;
        return this;
    }

    /**
     * Get backupPlansNone
     *
     * @return backupPlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansNone() {
        return backupPlansNone;
    }

    public void setBackupPlansNone(BackupPlanWhereInput backupPlansNone) {
        this.backupPlansNone = backupPlansNone;
    }

    public BackupServiceWhereInput backupPlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        return this;
    }

    public BackupServiceWhereInput backupPlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        return this;
    }

    public void setBackupPlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        }
    }

    public boolean getBackupPlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_NONE);
    }

    public BackupServiceWhereInput backupPlansSome(BackupPlanWhereInput backupPlansSome) {

        this.backupPlansSome = backupPlansSome;
        return this;
    }

    /**
     * Get backupPlansSome
     *
     * @return backupPlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansSome() {
        return backupPlansSome;
    }

    public void setBackupPlansSome(BackupPlanWhereInput backupPlansSome) {
        this.backupPlansSome = backupPlansSome;
    }

    public BackupServiceWhereInput backupPlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        return this;
    }

    public BackupServiceWhereInput backupPlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        return this;
    }

    public void setBackupPlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        }
    }

    public boolean getBackupPlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_SOME);
    }

    public BackupServiceWhereInput backupRdIopsMax(Long backupRdIopsMax) {

        this.backupRdIopsMax = backupRdIopsMax;
        return this;
    }

    /**
     * Get backupRdIopsMax
     *
     * @return backupRdIopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMax() {
        return backupRdIopsMax;
    }

    public void setBackupRdIopsMax(Long backupRdIopsMax) {
        this.backupRdIopsMax = backupRdIopsMax;
    }

    public BackupServiceWhereInput backupRdIopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX);
        return this;
    }

    public void setBackupRdIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX);
        }
    }

    public boolean getBackupRdIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX);
    }

    public BackupServiceWhereInput backupRdIopsMaxGt(Long backupRdIopsMaxGt) {

        this.backupRdIopsMaxGt = backupRdIopsMaxGt;
        return this;
    }

    /**
     * Get backupRdIopsMaxGt
     *
     * @return backupRdIopsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMaxGt() {
        return backupRdIopsMaxGt;
    }

    public void setBackupRdIopsMaxGt(Long backupRdIopsMaxGt) {
        this.backupRdIopsMaxGt = backupRdIopsMaxGt;
    }

    public BackupServiceWhereInput backupRdIopsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT);
        return this;
    }

    public void setBackupRdIopsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT);
        }
    }

    public boolean getBackupRdIopsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GT);
    }

    public BackupServiceWhereInput backupRdIopsMaxGte(Long backupRdIopsMaxGte) {

        this.backupRdIopsMaxGte = backupRdIopsMaxGte;
        return this;
    }

    /**
     * Get backupRdIopsMaxGte
     *
     * @return backupRdIopsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMaxGte() {
        return backupRdIopsMaxGte;
    }

    public void setBackupRdIopsMaxGte(Long backupRdIopsMaxGte) {
        this.backupRdIopsMaxGte = backupRdIopsMaxGte;
    }

    public BackupServiceWhereInput backupRdIopsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE);
        return this;
    }

    public void setBackupRdIopsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE);
        }
    }

    public boolean getBackupRdIopsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_GTE);
    }

    public BackupServiceWhereInput backupRdIopsMaxIn(List<Long> backupRdIopsMaxIn) {

        this.backupRdIopsMaxIn = backupRdIopsMaxIn;
        return this;
    }

    public BackupServiceWhereInput addBackupRdIopsMaxInItem(Long backupRdIopsMaxInItem) {
        if (this.backupRdIopsMaxIn == null) {
            this.backupRdIopsMaxIn = new ArrayList<Long>();
        }
        this.backupRdIopsMaxIn.add(backupRdIopsMaxInItem);
        return this;
    }

    /**
     * Get backupRdIopsMaxIn
     *
     * @return backupRdIopsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupRdIopsMaxIn() {
        return backupRdIopsMaxIn;
    }

    public void setBackupRdIopsMaxIn(List<Long> backupRdIopsMaxIn) {
        this.backupRdIopsMaxIn = backupRdIopsMaxIn;
    }

    public BackupServiceWhereInput backupRdIopsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN);
        return this;
    }

    public void setBackupRdIopsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN);
        }
    }

    public boolean getBackupRdIopsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_IN);
    }

    public BackupServiceWhereInput backupRdIopsMaxLt(Long backupRdIopsMaxLt) {

        this.backupRdIopsMaxLt = backupRdIopsMaxLt;
        return this;
    }

    /**
     * Get backupRdIopsMaxLt
     *
     * @return backupRdIopsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMaxLt() {
        return backupRdIopsMaxLt;
    }

    public void setBackupRdIopsMaxLt(Long backupRdIopsMaxLt) {
        this.backupRdIopsMaxLt = backupRdIopsMaxLt;
    }

    public BackupServiceWhereInput backupRdIopsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT);
        return this;
    }

    public void setBackupRdIopsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT);
        }
    }

    public boolean getBackupRdIopsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LT);
    }

    public BackupServiceWhereInput backupRdIopsMaxLte(Long backupRdIopsMaxLte) {

        this.backupRdIopsMaxLte = backupRdIopsMaxLte;
        return this;
    }

    /**
     * Get backupRdIopsMaxLte
     *
     * @return backupRdIopsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMaxLte() {
        return backupRdIopsMaxLte;
    }

    public void setBackupRdIopsMaxLte(Long backupRdIopsMaxLte) {
        this.backupRdIopsMaxLte = backupRdIopsMaxLte;
    }

    public BackupServiceWhereInput backupRdIopsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE);
        return this;
    }

    public void setBackupRdIopsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE);
        }
    }

    public boolean getBackupRdIopsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_LTE);
    }

    public BackupServiceWhereInput backupRdIopsMaxNot(Long backupRdIopsMaxNot) {

        this.backupRdIopsMaxNot = backupRdIopsMaxNot;
        return this;
    }

    /**
     * Get backupRdIopsMaxNot
     *
     * @return backupRdIopsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupRdIopsMaxNot() {
        return backupRdIopsMaxNot;
    }

    public void setBackupRdIopsMaxNot(Long backupRdIopsMaxNot) {
        this.backupRdIopsMaxNot = backupRdIopsMaxNot;
    }

    public BackupServiceWhereInput backupRdIopsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT);
        return this;
    }

    public void setBackupRdIopsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT);
        }
    }

    public boolean getBackupRdIopsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT);
    }

    public BackupServiceWhereInput backupRdIopsMaxNotIn(List<Long> backupRdIopsMaxNotIn) {

        this.backupRdIopsMaxNotIn = backupRdIopsMaxNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupRdIopsMaxNotInItem(Long backupRdIopsMaxNotInItem) {
        if (this.backupRdIopsMaxNotIn == null) {
            this.backupRdIopsMaxNotIn = new ArrayList<Long>();
        }
        this.backupRdIopsMaxNotIn.add(backupRdIopsMaxNotInItem);
        return this;
    }

    /**
     * Get backupRdIopsMaxNotIn
     *
     * @return backupRdIopsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupRdIopsMaxNotIn() {
        return backupRdIopsMaxNotIn;
    }

    public void setBackupRdIopsMaxNotIn(List<Long> backupRdIopsMaxNotIn) {
        this.backupRdIopsMaxNotIn = backupRdIopsMaxNotIn;
    }

    public BackupServiceWhereInput backupRdIopsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupRdIopsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN);
        return this;
    }

    public void setBackupRdIopsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN);
        }
    }

    public boolean getBackupRdIopsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RD_IOPS_MAX_NOT_IN);
    }

    public BackupServiceWhereInput backupStoreRepositoriesEvery(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesEvery) {

        this.backupStoreRepositoriesEvery = backupStoreRepositoriesEvery;
        return this;
    }

    /**
     * Get backupStoreRepositoriesEvery
     *
     * @return backupStoreRepositoriesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreRepositoryWhereInput getBackupStoreRepositoriesEvery() {
        return backupStoreRepositoriesEvery;
    }

    public void setBackupStoreRepositoriesEvery(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesEvery) {
        this.backupStoreRepositoriesEvery = backupStoreRepositoriesEvery;
    }

    public BackupServiceWhereInput backupStoreRepositoriesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY);
        return this;
    }

    public BackupServiceWhereInput backupStoreRepositoriesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY);
        return this;
    }

    public void setBackupStoreRepositoriesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY);
        }
    }

    public boolean getBackupStoreRepositoriesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_EVERY);
    }

    public BackupServiceWhereInput backupStoreRepositoriesNone(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesNone) {

        this.backupStoreRepositoriesNone = backupStoreRepositoriesNone;
        return this;
    }

    /**
     * Get backupStoreRepositoriesNone
     *
     * @return backupStoreRepositoriesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreRepositoryWhereInput getBackupStoreRepositoriesNone() {
        return backupStoreRepositoriesNone;
    }

    public void setBackupStoreRepositoriesNone(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesNone) {
        this.backupStoreRepositoriesNone = backupStoreRepositoriesNone;
    }

    public BackupServiceWhereInput backupStoreRepositoriesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE);
        return this;
    }

    public BackupServiceWhereInput backupStoreRepositoriesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE);
        return this;
    }

    public void setBackupStoreRepositoriesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE);
        }
    }

    public boolean getBackupStoreRepositoriesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_NONE);
    }

    public BackupServiceWhereInput backupStoreRepositoriesSome(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesSome) {

        this.backupStoreRepositoriesSome = backupStoreRepositoriesSome;
        return this;
    }

    /**
     * Get backupStoreRepositoriesSome
     *
     * @return backupStoreRepositoriesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreRepositoryWhereInput getBackupStoreRepositoriesSome() {
        return backupStoreRepositoriesSome;
    }

    public void setBackupStoreRepositoriesSome(
            BackupStoreRepositoryWhereInput backupStoreRepositoriesSome) {
        this.backupStoreRepositoriesSome = backupStoreRepositoriesSome;
    }

    public BackupServiceWhereInput backupStoreRepositoriesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME);
        return this;
    }

    public BackupServiceWhereInput backupStoreRepositoriesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME);
        return this;
    }

    public void setBackupStoreRepositoriesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME);
        }
    }

    public boolean getBackupStoreRepositoriesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORIES_SOME);
    }

    public BackupServiceWhereInput backupWrIopsMax(Long backupWrIopsMax) {

        this.backupWrIopsMax = backupWrIopsMax;
        return this;
    }

    /**
     * Get backupWrIopsMax
     *
     * @return backupWrIopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMax() {
        return backupWrIopsMax;
    }

    public void setBackupWrIopsMax(Long backupWrIopsMax) {
        this.backupWrIopsMax = backupWrIopsMax;
    }

    public BackupServiceWhereInput backupWrIopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX);
        return this;
    }

    public void setBackupWrIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX);
        }
    }

    public boolean getBackupWrIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX);
    }

    public BackupServiceWhereInput backupWrIopsMaxGt(Long backupWrIopsMaxGt) {

        this.backupWrIopsMaxGt = backupWrIopsMaxGt;
        return this;
    }

    /**
     * Get backupWrIopsMaxGt
     *
     * @return backupWrIopsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMaxGt() {
        return backupWrIopsMaxGt;
    }

    public void setBackupWrIopsMaxGt(Long backupWrIopsMaxGt) {
        this.backupWrIopsMaxGt = backupWrIopsMaxGt;
    }

    public BackupServiceWhereInput backupWrIopsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT);
        return this;
    }

    public void setBackupWrIopsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT);
        }
    }

    public boolean getBackupWrIopsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GT);
    }

    public BackupServiceWhereInput backupWrIopsMaxGte(Long backupWrIopsMaxGte) {

        this.backupWrIopsMaxGte = backupWrIopsMaxGte;
        return this;
    }

    /**
     * Get backupWrIopsMaxGte
     *
     * @return backupWrIopsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMaxGte() {
        return backupWrIopsMaxGte;
    }

    public void setBackupWrIopsMaxGte(Long backupWrIopsMaxGte) {
        this.backupWrIopsMaxGte = backupWrIopsMaxGte;
    }

    public BackupServiceWhereInput backupWrIopsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE);
        return this;
    }

    public void setBackupWrIopsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE);
        }
    }

    public boolean getBackupWrIopsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_GTE);
    }

    public BackupServiceWhereInput backupWrIopsMaxIn(List<Long> backupWrIopsMaxIn) {

        this.backupWrIopsMaxIn = backupWrIopsMaxIn;
        return this;
    }

    public BackupServiceWhereInput addBackupWrIopsMaxInItem(Long backupWrIopsMaxInItem) {
        if (this.backupWrIopsMaxIn == null) {
            this.backupWrIopsMaxIn = new ArrayList<Long>();
        }
        this.backupWrIopsMaxIn.add(backupWrIopsMaxInItem);
        return this;
    }

    /**
     * Get backupWrIopsMaxIn
     *
     * @return backupWrIopsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupWrIopsMaxIn() {
        return backupWrIopsMaxIn;
    }

    public void setBackupWrIopsMaxIn(List<Long> backupWrIopsMaxIn) {
        this.backupWrIopsMaxIn = backupWrIopsMaxIn;
    }

    public BackupServiceWhereInput backupWrIopsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN);
        return this;
    }

    public void setBackupWrIopsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN);
        }
    }

    public boolean getBackupWrIopsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_IN);
    }

    public BackupServiceWhereInput backupWrIopsMaxLt(Long backupWrIopsMaxLt) {

        this.backupWrIopsMaxLt = backupWrIopsMaxLt;
        return this;
    }

    /**
     * Get backupWrIopsMaxLt
     *
     * @return backupWrIopsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMaxLt() {
        return backupWrIopsMaxLt;
    }

    public void setBackupWrIopsMaxLt(Long backupWrIopsMaxLt) {
        this.backupWrIopsMaxLt = backupWrIopsMaxLt;
    }

    public BackupServiceWhereInput backupWrIopsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT);
        return this;
    }

    public void setBackupWrIopsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT);
        }
    }

    public boolean getBackupWrIopsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LT);
    }

    public BackupServiceWhereInput backupWrIopsMaxLte(Long backupWrIopsMaxLte) {

        this.backupWrIopsMaxLte = backupWrIopsMaxLte;
        return this;
    }

    /**
     * Get backupWrIopsMaxLte
     *
     * @return backupWrIopsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMaxLte() {
        return backupWrIopsMaxLte;
    }

    public void setBackupWrIopsMaxLte(Long backupWrIopsMaxLte) {
        this.backupWrIopsMaxLte = backupWrIopsMaxLte;
    }

    public BackupServiceWhereInput backupWrIopsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE);
        return this;
    }

    public void setBackupWrIopsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE);
        }
    }

    public boolean getBackupWrIopsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_LTE);
    }

    public BackupServiceWhereInput backupWrIopsMaxNot(Long backupWrIopsMaxNot) {

        this.backupWrIopsMaxNot = backupWrIopsMaxNot;
        return this;
    }

    /**
     * Get backupWrIopsMaxNot
     *
     * @return backupWrIopsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupWrIopsMaxNot() {
        return backupWrIopsMaxNot;
    }

    public void setBackupWrIopsMaxNot(Long backupWrIopsMaxNot) {
        this.backupWrIopsMaxNot = backupWrIopsMaxNot;
    }

    public BackupServiceWhereInput backupWrIopsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT);
        return this;
    }

    public void setBackupWrIopsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT);
        }
    }

    public boolean getBackupWrIopsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT);
    }

    public BackupServiceWhereInput backupWrIopsMaxNotIn(List<Long> backupWrIopsMaxNotIn) {

        this.backupWrIopsMaxNotIn = backupWrIopsMaxNotIn;
        return this;
    }

    public BackupServiceWhereInput addBackupWrIopsMaxNotInItem(Long backupWrIopsMaxNotInItem) {
        if (this.backupWrIopsMaxNotIn == null) {
            this.backupWrIopsMaxNotIn = new ArrayList<Long>();
        }
        this.backupWrIopsMaxNotIn.add(backupWrIopsMaxNotInItem);
        return this;
    }

    /**
     * Get backupWrIopsMaxNotIn
     *
     * @return backupWrIopsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupWrIopsMaxNotIn() {
        return backupWrIopsMaxNotIn;
    }

    public void setBackupWrIopsMaxNotIn(List<Long> backupWrIopsMaxNotIn) {
        this.backupWrIopsMaxNotIn = backupWrIopsMaxNotIn;
    }

    public BackupServiceWhereInput backupWrIopsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput backupWrIopsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN);
        return this;
    }

    public void setBackupWrIopsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN);
        }
    }

    public boolean getBackupWrIopsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_WR_IOPS_MAX_NOT_IN);
    }

    public BackupServiceWhereInput description(String description) {

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

    public BackupServiceWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupServiceWhereInput description_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionContains(String descriptionContains) {

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

    public BackupServiceWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput descriptionContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public BackupServiceWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionGt(String descriptionGt) {

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

    public BackupServiceWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public BackupServiceWhereInput descriptionGt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionGte(String descriptionGte) {

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

    public BackupServiceWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public BackupServiceWhereInput descriptionGte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public BackupServiceWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public BackupServiceWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public BackupServiceWhereInput descriptionIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionLt(String descriptionLt) {

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

    public BackupServiceWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public BackupServiceWhereInput descriptionLt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionLte(String descriptionLte) {

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

    public BackupServiceWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public BackupServiceWhereInput descriptionLte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionNot(String descriptionNot) {

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

    public BackupServiceWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public BackupServiceWhereInput descriptionNot_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public BackupServiceWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public BackupServiceWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public BackupServiceWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public BackupServiceWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public BackupServiceWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public BackupServiceWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupServiceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupServiceWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupServiceWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupServiceWhereInput addEntityAsyncStatusInItem(
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

    public BackupServiceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupServiceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public BackupServiceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupServiceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupServiceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupServiceWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupServiceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput id(String id) {

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

    public BackupServiceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupServiceWhereInput id_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idContains(String idContains) {

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

    public BackupServiceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput idContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idEndsWith(String idEndsWith) {

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

    public BackupServiceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idGt(String idGt) {

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

    public BackupServiceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupServiceWhereInput idGt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idGte(String idGte) {

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

    public BackupServiceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupServiceWhereInput idGte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupServiceWhereInput addIdInItem(String idInItem) {
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

    public BackupServiceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupServiceWhereInput idIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idLt(String idLt) {

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

    public BackupServiceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupServiceWhereInput idLt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idLte(String idLte) {

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

    public BackupServiceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupServiceWhereInput idLte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idNot(String idNot) {

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

    public BackupServiceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupServiceWhereInput idNot_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idNotContains(String idNotContains) {

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

    public BackupServiceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupServiceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupServiceWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupServiceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupServiceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput idStartsWith(String idStartsWith) {

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

    public BackupServiceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput kubeConfig(String kubeConfig) {

        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * Get kubeConfig
     *
     * @return kubeConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public BackupServiceWhereInput kubeConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public BackupServiceWhereInput kubeConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public void setKubeConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        }
    }

    public boolean getKubeConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG);
    }

    public BackupServiceWhereInput kubeConfigContains(String kubeConfigContains) {

        this.kubeConfigContains = kubeConfigContains;
        return this;
    }

    /**
     * Get kubeConfigContains
     *
     * @return kubeConfigContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigContains() {
        return kubeConfigContains;
    }

    public void setKubeConfigContains(String kubeConfigContains) {
        this.kubeConfigContains = kubeConfigContains;
    }

    public BackupServiceWhereInput kubeConfigContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput kubeConfigContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        return this;
    }

    public void setKubeConfigContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        }
    }

    public boolean getKubeConfigContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
    }

    public BackupServiceWhereInput kubeConfigEndsWith(String kubeConfigEndsWith) {

        this.kubeConfigEndsWith = kubeConfigEndsWith;
        return this;
    }

    /**
     * Get kubeConfigEndsWith
     *
     * @return kubeConfigEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigEndsWith() {
        return kubeConfigEndsWith;
    }

    public void setKubeConfigEndsWith(String kubeConfigEndsWith) {
        this.kubeConfigEndsWith = kubeConfigEndsWith;
    }

    public BackupServiceWhereInput kubeConfigEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput kubeConfigEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        return this;
    }

    public void setKubeConfigEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        }
    }

    public boolean getKubeConfigEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
    }

    public BackupServiceWhereInput kubeConfigGt(String kubeConfigGt) {

        this.kubeConfigGt = kubeConfigGt;
        return this;
    }

    /**
     * Get kubeConfigGt
     *
     * @return kubeConfigGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigGt() {
        return kubeConfigGt;
    }

    public void setKubeConfigGt(String kubeConfigGt) {
        this.kubeConfigGt = kubeConfigGt;
    }

    public BackupServiceWhereInput kubeConfigGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GT);
        return this;
    }

    public BackupServiceWhereInput kubeConfigGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GT);
        return this;
    }

    public void setKubeConfigGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GT);
        }
    }

    public boolean getKubeConfigGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_GT);
    }

    public BackupServiceWhereInput kubeConfigGte(String kubeConfigGte) {

        this.kubeConfigGte = kubeConfigGte;
        return this;
    }

    /**
     * Get kubeConfigGte
     *
     * @return kubeConfigGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigGte() {
        return kubeConfigGte;
    }

    public void setKubeConfigGte(String kubeConfigGte) {
        this.kubeConfigGte = kubeConfigGte;
    }

    public BackupServiceWhereInput kubeConfigGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        return this;
    }

    public BackupServiceWhereInput kubeConfigGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        return this;
    }

    public void setKubeConfigGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        }
    }

    public boolean getKubeConfigGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_GTE);
    }

    public BackupServiceWhereInput kubeConfigIn(List<String> kubeConfigIn) {

        this.kubeConfigIn = kubeConfigIn;
        return this;
    }

    public BackupServiceWhereInput addKubeConfigInItem(String kubeConfigInItem) {
        if (this.kubeConfigIn == null) {
            this.kubeConfigIn = new ArrayList<String>();
        }
        this.kubeConfigIn.add(kubeConfigInItem);
        return this;
    }

    /**
     * Get kubeConfigIn
     *
     * @return kubeConfigIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKubeConfigIn() {
        return kubeConfigIn;
    }

    public void setKubeConfigIn(List<String> kubeConfigIn) {
        this.kubeConfigIn = kubeConfigIn;
    }

    public BackupServiceWhereInput kubeConfigIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_IN);
        return this;
    }

    public BackupServiceWhereInput kubeConfigIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_IN);
        return this;
    }

    public void setKubeConfigIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_IN);
        }
    }

    public boolean getKubeConfigIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_IN);
    }

    public BackupServiceWhereInput kubeConfigLt(String kubeConfigLt) {

        this.kubeConfigLt = kubeConfigLt;
        return this;
    }

    /**
     * Get kubeConfigLt
     *
     * @return kubeConfigLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigLt() {
        return kubeConfigLt;
    }

    public void setKubeConfigLt(String kubeConfigLt) {
        this.kubeConfigLt = kubeConfigLt;
    }

    public BackupServiceWhereInput kubeConfigLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LT);
        return this;
    }

    public BackupServiceWhereInput kubeConfigLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LT);
        return this;
    }

    public void setKubeConfigLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LT);
        }
    }

    public boolean getKubeConfigLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_LT);
    }

    public BackupServiceWhereInput kubeConfigLte(String kubeConfigLte) {

        this.kubeConfigLte = kubeConfigLte;
        return this;
    }

    /**
     * Get kubeConfigLte
     *
     * @return kubeConfigLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigLte() {
        return kubeConfigLte;
    }

    public void setKubeConfigLte(String kubeConfigLte) {
        this.kubeConfigLte = kubeConfigLte;
    }

    public BackupServiceWhereInput kubeConfigLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        return this;
    }

    public BackupServiceWhereInput kubeConfigLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        return this;
    }

    public void setKubeConfigLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        }
    }

    public boolean getKubeConfigLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_LTE);
    }

    public BackupServiceWhereInput kubeConfigNot(String kubeConfigNot) {

        this.kubeConfigNot = kubeConfigNot;
        return this;
    }

    /**
     * Get kubeConfigNot
     *
     * @return kubeConfigNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNot() {
        return kubeConfigNot;
    }

    public void setKubeConfigNot(String kubeConfigNot) {
        this.kubeConfigNot = kubeConfigNot;
    }

    public BackupServiceWhereInput kubeConfigNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        return this;
    }

    public BackupServiceWhereInput kubeConfigNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        return this;
    }

    public void setKubeConfigNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        }
    }

    public boolean getKubeConfigNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT);
    }

    public BackupServiceWhereInput kubeConfigNotContains(String kubeConfigNotContains) {

        this.kubeConfigNotContains = kubeConfigNotContains;
        return this;
    }

    /**
     * Get kubeConfigNotContains
     *
     * @return kubeConfigNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotContains() {
        return kubeConfigNotContains;
    }

    public void setKubeConfigNotContains(String kubeConfigNotContains) {
        this.kubeConfigNotContains = kubeConfigNotContains;
    }

    public BackupServiceWhereInput kubeConfigNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput kubeConfigNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        return this;
    }

    public void setKubeConfigNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        }
    }

    public boolean getKubeConfigNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
    }

    public BackupServiceWhereInput kubeConfigNotEndsWith(String kubeConfigNotEndsWith) {

        this.kubeConfigNotEndsWith = kubeConfigNotEndsWith;
        return this;
    }

    /**
     * Get kubeConfigNotEndsWith
     *
     * @return kubeConfigNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotEndsWith() {
        return kubeConfigNotEndsWith;
    }

    public void setKubeConfigNotEndsWith(String kubeConfigNotEndsWith) {
        this.kubeConfigNotEndsWith = kubeConfigNotEndsWith;
    }

    public BackupServiceWhereInput kubeConfigNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput kubeConfigNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        return this;
    }

    public void setKubeConfigNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        }
    }

    public boolean getKubeConfigNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput kubeConfigNotIn(List<String> kubeConfigNotIn) {

        this.kubeConfigNotIn = kubeConfigNotIn;
        return this;
    }

    public BackupServiceWhereInput addKubeConfigNotInItem(String kubeConfigNotInItem) {
        if (this.kubeConfigNotIn == null) {
            this.kubeConfigNotIn = new ArrayList<String>();
        }
        this.kubeConfigNotIn.add(kubeConfigNotInItem);
        return this;
    }

    /**
     * Get kubeConfigNotIn
     *
     * @return kubeConfigNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKubeConfigNotIn() {
        return kubeConfigNotIn;
    }

    public void setKubeConfigNotIn(List<String> kubeConfigNotIn) {
        this.kubeConfigNotIn = kubeConfigNotIn;
    }

    public BackupServiceWhereInput kubeConfigNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput kubeConfigNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        return this;
    }

    public void setKubeConfigNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        }
    }

    public boolean getKubeConfigNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
    }

    public BackupServiceWhereInput kubeConfigNotStartsWith(String kubeConfigNotStartsWith) {

        this.kubeConfigNotStartsWith = kubeConfigNotStartsWith;
        return this;
    }

    /**
     * Get kubeConfigNotStartsWith
     *
     * @return kubeConfigNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotStartsWith() {
        return kubeConfigNotStartsWith;
    }

    public void setKubeConfigNotStartsWith(String kubeConfigNotStartsWith) {
        this.kubeConfigNotStartsWith = kubeConfigNotStartsWith;
    }

    public BackupServiceWhereInput kubeConfigNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput kubeConfigNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        return this;
    }

    public void setKubeConfigNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        }
    }

    public boolean getKubeConfigNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput kubeConfigStartsWith(String kubeConfigStartsWith) {

        this.kubeConfigStartsWith = kubeConfigStartsWith;
        return this;
    }

    /**
     * Get kubeConfigStartsWith
     *
     * @return kubeConfigStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigStartsWith() {
        return kubeConfigStartsWith;
    }

    public void setKubeConfigStartsWith(String kubeConfigStartsWith) {
        this.kubeConfigStartsWith = kubeConfigStartsWith;
    }

    public BackupServiceWhereInput kubeConfigStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput kubeConfigStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        return this;
    }

    public void setKubeConfigStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        }
    }

    public boolean getKubeConfigStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkGateway(String managementNetworkGateway) {

        this.managementNetworkGateway = managementNetworkGateway;
        return this;
    }

    /**
     * Get managementNetworkGateway
     *
     * @return managementNetworkGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGateway() {
        return managementNetworkGateway;
    }

    public void setManagementNetworkGateway(String managementNetworkGateway) {
        this.managementNetworkGateway = managementNetworkGateway;
    }

    public BackupServiceWhereInput managementNetworkGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY);
        return this;
    }

    public void setManagementNetworkGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY);
        }
    }

    public boolean getManagementNetworkGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY);
    }

    public BackupServiceWhereInput managementNetworkGatewayContains(
            String managementNetworkGatewayContains) {

        this.managementNetworkGatewayContains = managementNetworkGatewayContains;
        return this;
    }

    /**
     * Get managementNetworkGatewayContains
     *
     * @return managementNetworkGatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayContains() {
        return managementNetworkGatewayContains;
    }

    public void setManagementNetworkGatewayContains(String managementNetworkGatewayContains) {
        this.managementNetworkGatewayContains = managementNetworkGatewayContains;
    }

    public BackupServiceWhereInput managementNetworkGatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public void setManagementNetworkGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS);
        }
    }

    public boolean getManagementNetworkGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkGatewayEndsWith(
            String managementNetworkGatewayEndsWith) {

        this.managementNetworkGatewayEndsWith = managementNetworkGatewayEndsWith;
        return this;
    }

    /**
     * Get managementNetworkGatewayEndsWith
     *
     * @return managementNetworkGatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayEndsWith() {
        return managementNetworkGatewayEndsWith;
    }

    public void setManagementNetworkGatewayEndsWith(String managementNetworkGatewayEndsWith) {
        this.managementNetworkGatewayEndsWith = managementNetworkGatewayEndsWith;
    }

    public BackupServiceWhereInput managementNetworkGatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkGatewayGt(String managementNetworkGatewayGt) {

        this.managementNetworkGatewayGt = managementNetworkGatewayGt;
        return this;
    }

    /**
     * Get managementNetworkGatewayGt
     *
     * @return managementNetworkGatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayGt() {
        return managementNetworkGatewayGt;
    }

    public void setManagementNetworkGatewayGt(String managementNetworkGatewayGt) {
        this.managementNetworkGatewayGt = managementNetworkGatewayGt;
    }

    public BackupServiceWhereInput managementNetworkGatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT);
        return this;
    }

    public void setManagementNetworkGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT);
        }
    }

    public boolean getManagementNetworkGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GT);
    }

    public BackupServiceWhereInput managementNetworkGatewayGte(String managementNetworkGatewayGte) {

        this.managementNetworkGatewayGte = managementNetworkGatewayGte;
        return this;
    }

    /**
     * Get managementNetworkGatewayGte
     *
     * @return managementNetworkGatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayGte() {
        return managementNetworkGatewayGte;
    }

    public void setManagementNetworkGatewayGte(String managementNetworkGatewayGte) {
        this.managementNetworkGatewayGte = managementNetworkGatewayGte;
    }

    public BackupServiceWhereInput managementNetworkGatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE);
        return this;
    }

    public void setManagementNetworkGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE);
        }
    }

    public boolean getManagementNetworkGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_GTE);
    }

    public BackupServiceWhereInput managementNetworkGatewayIn(
            List<String> managementNetworkGatewayIn) {

        this.managementNetworkGatewayIn = managementNetworkGatewayIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkGatewayInItem(
            String managementNetworkGatewayInItem) {
        if (this.managementNetworkGatewayIn == null) {
            this.managementNetworkGatewayIn = new ArrayList<String>();
        }
        this.managementNetworkGatewayIn.add(managementNetworkGatewayInItem);
        return this;
    }

    /**
     * Get managementNetworkGatewayIn
     *
     * @return managementNetworkGatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkGatewayIn() {
        return managementNetworkGatewayIn;
    }

    public void setManagementNetworkGatewayIn(List<String> managementNetworkGatewayIn) {
        this.managementNetworkGatewayIn = managementNetworkGatewayIn;
    }

    public BackupServiceWhereInput managementNetworkGatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN);
        return this;
    }

    public void setManagementNetworkGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN);
        }
    }

    public boolean getManagementNetworkGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_IN);
    }

    public BackupServiceWhereInput managementNetworkGatewayLt(String managementNetworkGatewayLt) {

        this.managementNetworkGatewayLt = managementNetworkGatewayLt;
        return this;
    }

    /**
     * Get managementNetworkGatewayLt
     *
     * @return managementNetworkGatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayLt() {
        return managementNetworkGatewayLt;
    }

    public void setManagementNetworkGatewayLt(String managementNetworkGatewayLt) {
        this.managementNetworkGatewayLt = managementNetworkGatewayLt;
    }

    public BackupServiceWhereInput managementNetworkGatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT);
        return this;
    }

    public void setManagementNetworkGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT);
        }
    }

    public boolean getManagementNetworkGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LT);
    }

    public BackupServiceWhereInput managementNetworkGatewayLte(String managementNetworkGatewayLte) {

        this.managementNetworkGatewayLte = managementNetworkGatewayLte;
        return this;
    }

    /**
     * Get managementNetworkGatewayLte
     *
     * @return managementNetworkGatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayLte() {
        return managementNetworkGatewayLte;
    }

    public void setManagementNetworkGatewayLte(String managementNetworkGatewayLte) {
        this.managementNetworkGatewayLte = managementNetworkGatewayLte;
    }

    public BackupServiceWhereInput managementNetworkGatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE);
        return this;
    }

    public void setManagementNetworkGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE);
        }
    }

    public boolean getManagementNetworkGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_LTE);
    }

    public BackupServiceWhereInput managementNetworkGatewayNot(String managementNetworkGatewayNot) {

        this.managementNetworkGatewayNot = managementNetworkGatewayNot;
        return this;
    }

    /**
     * Get managementNetworkGatewayNot
     *
     * @return managementNetworkGatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayNot() {
        return managementNetworkGatewayNot;
    }

    public void setManagementNetworkGatewayNot(String managementNetworkGatewayNot) {
        this.managementNetworkGatewayNot = managementNetworkGatewayNot;
    }

    public BackupServiceWhereInput managementNetworkGatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT);
        return this;
    }

    public void setManagementNetworkGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT);
        }
    }

    public boolean getManagementNetworkGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT);
    }

    public BackupServiceWhereInput managementNetworkGatewayNotContains(
            String managementNetworkGatewayNotContains) {

        this.managementNetworkGatewayNotContains = managementNetworkGatewayNotContains;
        return this;
    }

    /**
     * Get managementNetworkGatewayNotContains
     *
     * @return managementNetworkGatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayNotContains() {
        return managementNetworkGatewayNotContains;
    }

    public void setManagementNetworkGatewayNotContains(String managementNetworkGatewayNotContains) {
        this.managementNetworkGatewayNotContains = managementNetworkGatewayNotContains;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setManagementNetworkGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getManagementNetworkGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkGatewayNotEndsWith(
            String managementNetworkGatewayNotEndsWith) {

        this.managementNetworkGatewayNotEndsWith = managementNetworkGatewayNotEndsWith;
        return this;
    }

    /**
     * Get managementNetworkGatewayNotEndsWith
     *
     * @return managementNetworkGatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayNotEndsWith() {
        return managementNetworkGatewayNotEndsWith;
    }

    public void setManagementNetworkGatewayNotEndsWith(String managementNetworkGatewayNotEndsWith) {
        this.managementNetworkGatewayNotEndsWith = managementNetworkGatewayNotEndsWith;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkGatewayNotIn(
            List<String> managementNetworkGatewayNotIn) {

        this.managementNetworkGatewayNotIn = managementNetworkGatewayNotIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkGatewayNotInItem(
            String managementNetworkGatewayNotInItem) {
        if (this.managementNetworkGatewayNotIn == null) {
            this.managementNetworkGatewayNotIn = new ArrayList<String>();
        }
        this.managementNetworkGatewayNotIn.add(managementNetworkGatewayNotInItem);
        return this;
    }

    /**
     * Get managementNetworkGatewayNotIn
     *
     * @return managementNetworkGatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkGatewayNotIn() {
        return managementNetworkGatewayNotIn;
    }

    public void setManagementNetworkGatewayNotIn(List<String> managementNetworkGatewayNotIn) {
        this.managementNetworkGatewayNotIn = managementNetworkGatewayNotIn;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public void setManagementNetworkGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN);
        }
    }

    public boolean getManagementNetworkGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_IN);
    }

    public BackupServiceWhereInput managementNetworkGatewayNotStartsWith(
            String managementNetworkGatewayNotStartsWith) {

        this.managementNetworkGatewayNotStartsWith = managementNetworkGatewayNotStartsWith;
        return this;
    }

    /**
     * Get managementNetworkGatewayNotStartsWith
     *
     * @return managementNetworkGatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayNotStartsWith() {
        return managementNetworkGatewayNotStartsWith;
    }

    public void setManagementNetworkGatewayNotStartsWith(
            String managementNetworkGatewayNotStartsWith) {
        this.managementNetworkGatewayNotStartsWith = managementNetworkGatewayNotStartsWith;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkGatewayStartsWith(
            String managementNetworkGatewayStartsWith) {

        this.managementNetworkGatewayStartsWith = managementNetworkGatewayStartsWith;
        return this;
    }

    /**
     * Get managementNetworkGatewayStartsWith
     *
     * @return managementNetworkGatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkGatewayStartsWith() {
        return managementNetworkGatewayStartsWith;
    }

    public void setManagementNetworkGatewayStartsWith(String managementNetworkGatewayStartsWith) {
        this.managementNetworkGatewayStartsWith = managementNetworkGatewayStartsWith;
    }

    public BackupServiceWhereInput managementNetworkGatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkGatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_GATEWAY_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkIp(String managementNetworkIp) {

        this.managementNetworkIp = managementNetworkIp;
        return this;
    }

    /**
     * Get managementNetworkIp
     *
     * @return managementNetworkIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIp() {
        return managementNetworkIp;
    }

    public void setManagementNetworkIp(String managementNetworkIp) {
        this.managementNetworkIp = managementNetworkIp;
    }

    public BackupServiceWhereInput managementNetworkIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP);
        return this;
    }

    public void setManagementNetworkIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP);
        }
    }

    public boolean getManagementNetworkIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP);
    }

    public BackupServiceWhereInput managementNetworkIpContains(String managementNetworkIpContains) {

        this.managementNetworkIpContains = managementNetworkIpContains;
        return this;
    }

    /**
     * Get managementNetworkIpContains
     *
     * @return managementNetworkIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpContains() {
        return managementNetworkIpContains;
    }

    public void setManagementNetworkIpContains(String managementNetworkIpContains) {
        this.managementNetworkIpContains = managementNetworkIpContains;
    }

    public BackupServiceWhereInput managementNetworkIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS);
        return this;
    }

    public void setManagementNetworkIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS);
        }
    }

    public boolean getManagementNetworkIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkIpEndsWith(String managementNetworkIpEndsWith) {

        this.managementNetworkIpEndsWith = managementNetworkIpEndsWith;
        return this;
    }

    /**
     * Get managementNetworkIpEndsWith
     *
     * @return managementNetworkIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpEndsWith() {
        return managementNetworkIpEndsWith;
    }

    public void setManagementNetworkIpEndsWith(String managementNetworkIpEndsWith) {
        this.managementNetworkIpEndsWith = managementNetworkIpEndsWith;
    }

    public BackupServiceWhereInput managementNetworkIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkIpGt(String managementNetworkIpGt) {

        this.managementNetworkIpGt = managementNetworkIpGt;
        return this;
    }

    /**
     * Get managementNetworkIpGt
     *
     * @return managementNetworkIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpGt() {
        return managementNetworkIpGt;
    }

    public void setManagementNetworkIpGt(String managementNetworkIpGt) {
        this.managementNetworkIpGt = managementNetworkIpGt;
    }

    public BackupServiceWhereInput managementNetworkIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT);
        return this;
    }

    public void setManagementNetworkIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT);
        }
    }

    public boolean getManagementNetworkIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GT);
    }

    public BackupServiceWhereInput managementNetworkIpGte(String managementNetworkIpGte) {

        this.managementNetworkIpGte = managementNetworkIpGte;
        return this;
    }

    /**
     * Get managementNetworkIpGte
     *
     * @return managementNetworkIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpGte() {
        return managementNetworkIpGte;
    }

    public void setManagementNetworkIpGte(String managementNetworkIpGte) {
        this.managementNetworkIpGte = managementNetworkIpGte;
    }

    public BackupServiceWhereInput managementNetworkIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE);
        return this;
    }

    public void setManagementNetworkIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE);
        }
    }

    public boolean getManagementNetworkIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_GTE);
    }

    public BackupServiceWhereInput managementNetworkIpIn(List<String> managementNetworkIpIn) {

        this.managementNetworkIpIn = managementNetworkIpIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkIpInItem(String managementNetworkIpInItem) {
        if (this.managementNetworkIpIn == null) {
            this.managementNetworkIpIn = new ArrayList<String>();
        }
        this.managementNetworkIpIn.add(managementNetworkIpInItem);
        return this;
    }

    /**
     * Get managementNetworkIpIn
     *
     * @return managementNetworkIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkIpIn() {
        return managementNetworkIpIn;
    }

    public void setManagementNetworkIpIn(List<String> managementNetworkIpIn) {
        this.managementNetworkIpIn = managementNetworkIpIn;
    }

    public BackupServiceWhereInput managementNetworkIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN);
        return this;
    }

    public void setManagementNetworkIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN);
        }
    }

    public boolean getManagementNetworkIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_IN);
    }

    public BackupServiceWhereInput managementNetworkIpLt(String managementNetworkIpLt) {

        this.managementNetworkIpLt = managementNetworkIpLt;
        return this;
    }

    /**
     * Get managementNetworkIpLt
     *
     * @return managementNetworkIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpLt() {
        return managementNetworkIpLt;
    }

    public void setManagementNetworkIpLt(String managementNetworkIpLt) {
        this.managementNetworkIpLt = managementNetworkIpLt;
    }

    public BackupServiceWhereInput managementNetworkIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT);
        return this;
    }

    public void setManagementNetworkIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT);
        }
    }

    public boolean getManagementNetworkIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LT);
    }

    public BackupServiceWhereInput managementNetworkIpLte(String managementNetworkIpLte) {

        this.managementNetworkIpLte = managementNetworkIpLte;
        return this;
    }

    /**
     * Get managementNetworkIpLte
     *
     * @return managementNetworkIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpLte() {
        return managementNetworkIpLte;
    }

    public void setManagementNetworkIpLte(String managementNetworkIpLte) {
        this.managementNetworkIpLte = managementNetworkIpLte;
    }

    public BackupServiceWhereInput managementNetworkIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE);
        return this;
    }

    public void setManagementNetworkIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE);
        }
    }

    public boolean getManagementNetworkIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_LTE);
    }

    public BackupServiceWhereInput managementNetworkIpNot(String managementNetworkIpNot) {

        this.managementNetworkIpNot = managementNetworkIpNot;
        return this;
    }

    /**
     * Get managementNetworkIpNot
     *
     * @return managementNetworkIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpNot() {
        return managementNetworkIpNot;
    }

    public void setManagementNetworkIpNot(String managementNetworkIpNot) {
        this.managementNetworkIpNot = managementNetworkIpNot;
    }

    public BackupServiceWhereInput managementNetworkIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT);
        return this;
    }

    public void setManagementNetworkIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT);
        }
    }

    public boolean getManagementNetworkIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT);
    }

    public BackupServiceWhereInput managementNetworkIpNotContains(
            String managementNetworkIpNotContains) {

        this.managementNetworkIpNotContains = managementNetworkIpNotContains;
        return this;
    }

    /**
     * Get managementNetworkIpNotContains
     *
     * @return managementNetworkIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpNotContains() {
        return managementNetworkIpNotContains;
    }

    public void setManagementNetworkIpNotContains(String managementNetworkIpNotContains) {
        this.managementNetworkIpNotContains = managementNetworkIpNotContains;
    }

    public BackupServiceWhereInput managementNetworkIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public void setManagementNetworkIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS);
        }
    }

    public boolean getManagementNetworkIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkIpNotEndsWith(
            String managementNetworkIpNotEndsWith) {

        this.managementNetworkIpNotEndsWith = managementNetworkIpNotEndsWith;
        return this;
    }

    /**
     * Get managementNetworkIpNotEndsWith
     *
     * @return managementNetworkIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpNotEndsWith() {
        return managementNetworkIpNotEndsWith;
    }

    public void setManagementNetworkIpNotEndsWith(String managementNetworkIpNotEndsWith) {
        this.managementNetworkIpNotEndsWith = managementNetworkIpNotEndsWith;
    }

    public BackupServiceWhereInput managementNetworkIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkIpNotIn(List<String> managementNetworkIpNotIn) {

        this.managementNetworkIpNotIn = managementNetworkIpNotIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkIpNotInItem(
            String managementNetworkIpNotInItem) {
        if (this.managementNetworkIpNotIn == null) {
            this.managementNetworkIpNotIn = new ArrayList<String>();
        }
        this.managementNetworkIpNotIn.add(managementNetworkIpNotInItem);
        return this;
    }

    /**
     * Get managementNetworkIpNotIn
     *
     * @return managementNetworkIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkIpNotIn() {
        return managementNetworkIpNotIn;
    }

    public void setManagementNetworkIpNotIn(List<String> managementNetworkIpNotIn) {
        this.managementNetworkIpNotIn = managementNetworkIpNotIn;
    }

    public BackupServiceWhereInput managementNetworkIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN);
        return this;
    }

    public void setManagementNetworkIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN);
        }
    }

    public boolean getManagementNetworkIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_IN);
    }

    public BackupServiceWhereInput managementNetworkIpNotStartsWith(
            String managementNetworkIpNotStartsWith) {

        this.managementNetworkIpNotStartsWith = managementNetworkIpNotStartsWith;
        return this;
    }

    /**
     * Get managementNetworkIpNotStartsWith
     *
     * @return managementNetworkIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpNotStartsWith() {
        return managementNetworkIpNotStartsWith;
    }

    public void setManagementNetworkIpNotStartsWith(String managementNetworkIpNotStartsWith) {
        this.managementNetworkIpNotStartsWith = managementNetworkIpNotStartsWith;
    }

    public BackupServiceWhereInput managementNetworkIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkIpStartsWith(
            String managementNetworkIpStartsWith) {

        this.managementNetworkIpStartsWith = managementNetworkIpStartsWith;
        return this;
    }

    /**
     * Get managementNetworkIpStartsWith
     *
     * @return managementNetworkIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkIpStartsWith() {
        return managementNetworkIpStartsWith;
    }

    public void setManagementNetworkIpStartsWith(String managementNetworkIpStartsWith) {
        this.managementNetworkIpStartsWith = managementNetworkIpStartsWith;
    }

    public BackupServiceWhereInput managementNetworkIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_IP_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkSubnetMask(String managementNetworkSubnetMask) {

        this.managementNetworkSubnetMask = managementNetworkSubnetMask;
        return this;
    }

    /**
     * Get managementNetworkSubnetMask
     *
     * @return managementNetworkSubnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMask() {
        return managementNetworkSubnetMask;
    }

    public void setManagementNetworkSubnetMask(String managementNetworkSubnetMask) {
        this.managementNetworkSubnetMask = managementNetworkSubnetMask;
    }

    public BackupServiceWhereInput managementNetworkSubnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK);
        return this;
    }

    public void setManagementNetworkSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK);
        }
    }

    public boolean getManagementNetworkSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskContains(
            String managementNetworkSubnetMaskContains) {

        this.managementNetworkSubnetMaskContains = managementNetworkSubnetMaskContains;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskContains
     *
     * @return managementNetworkSubnetMaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskContains() {
        return managementNetworkSubnetMaskContains;
    }

    public void setManagementNetworkSubnetMaskContains(String managementNetworkSubnetMaskContains) {
        this.managementNetworkSubnetMaskContains = managementNetworkSubnetMaskContains;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public void setManagementNetworkSubnetMaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS);
        }
    }

    public boolean getManagementNetworkSubnetMaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskEndsWith(
            String managementNetworkSubnetMaskEndsWith) {

        this.managementNetworkSubnetMaskEndsWith = managementNetworkSubnetMaskEndsWith;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskEndsWith
     *
     * @return managementNetworkSubnetMaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskEndsWith() {
        return managementNetworkSubnetMaskEndsWith;
    }

    public void setManagementNetworkSubnetMaskEndsWith(String managementNetworkSubnetMaskEndsWith) {
        this.managementNetworkSubnetMaskEndsWith = managementNetworkSubnetMaskEndsWith;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkSubnetMaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkSubnetMaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGt(
            String managementNetworkSubnetMaskGt) {

        this.managementNetworkSubnetMaskGt = managementNetworkSubnetMaskGt;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskGt
     *
     * @return managementNetworkSubnetMaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskGt() {
        return managementNetworkSubnetMaskGt;
    }

    public void setManagementNetworkSubnetMaskGt(String managementNetworkSubnetMaskGt) {
        this.managementNetworkSubnetMaskGt = managementNetworkSubnetMaskGt;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public void setManagementNetworkSubnetMaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT);
        }
    }

    public boolean getManagementNetworkSubnetMaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GT);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGte(
            String managementNetworkSubnetMaskGte) {

        this.managementNetworkSubnetMaskGte = managementNetworkSubnetMaskGte;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskGte
     *
     * @return managementNetworkSubnetMaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskGte() {
        return managementNetworkSubnetMaskGte;
    }

    public void setManagementNetworkSubnetMaskGte(String managementNetworkSubnetMaskGte) {
        this.managementNetworkSubnetMaskGte = managementNetworkSubnetMaskGte;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public void setManagementNetworkSubnetMaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE);
        }
    }

    public boolean getManagementNetworkSubnetMaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_GTE);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskIn(
            List<String> managementNetworkSubnetMaskIn) {

        this.managementNetworkSubnetMaskIn = managementNetworkSubnetMaskIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkSubnetMaskInItem(
            String managementNetworkSubnetMaskInItem) {
        if (this.managementNetworkSubnetMaskIn == null) {
            this.managementNetworkSubnetMaskIn = new ArrayList<String>();
        }
        this.managementNetworkSubnetMaskIn.add(managementNetworkSubnetMaskInItem);
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskIn
     *
     * @return managementNetworkSubnetMaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkSubnetMaskIn() {
        return managementNetworkSubnetMaskIn;
    }

    public void setManagementNetworkSubnetMaskIn(List<String> managementNetworkSubnetMaskIn) {
        this.managementNetworkSubnetMaskIn = managementNetworkSubnetMaskIn;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public void setManagementNetworkSubnetMaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN);
        }
    }

    public boolean getManagementNetworkSubnetMaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_IN);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLt(
            String managementNetworkSubnetMaskLt) {

        this.managementNetworkSubnetMaskLt = managementNetworkSubnetMaskLt;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskLt
     *
     * @return managementNetworkSubnetMaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskLt() {
        return managementNetworkSubnetMaskLt;
    }

    public void setManagementNetworkSubnetMaskLt(String managementNetworkSubnetMaskLt) {
        this.managementNetworkSubnetMaskLt = managementNetworkSubnetMaskLt;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public void setManagementNetworkSubnetMaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT);
        }
    }

    public boolean getManagementNetworkSubnetMaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LT);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLte(
            String managementNetworkSubnetMaskLte) {

        this.managementNetworkSubnetMaskLte = managementNetworkSubnetMaskLte;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskLte
     *
     * @return managementNetworkSubnetMaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskLte() {
        return managementNetworkSubnetMaskLte;
    }

    public void setManagementNetworkSubnetMaskLte(String managementNetworkSubnetMaskLte) {
        this.managementNetworkSubnetMaskLte = managementNetworkSubnetMaskLte;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public void setManagementNetworkSubnetMaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE);
        }
    }

    public boolean getManagementNetworkSubnetMaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_LTE);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNot(
            String managementNetworkSubnetMaskNot) {

        this.managementNetworkSubnetMaskNot = managementNetworkSubnetMaskNot;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskNot
     *
     * @return managementNetworkSubnetMaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskNot() {
        return managementNetworkSubnetMaskNot;
    }

    public void setManagementNetworkSubnetMaskNot(String managementNetworkSubnetMaskNot) {
        this.managementNetworkSubnetMaskNot = managementNetworkSubnetMaskNot;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public void setManagementNetworkSubnetMaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT);
        }
    }

    public boolean getManagementNetworkSubnetMaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotContains(
            String managementNetworkSubnetMaskNotContains) {

        this.managementNetworkSubnetMaskNotContains = managementNetworkSubnetMaskNotContains;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskNotContains
     *
     * @return managementNetworkSubnetMaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskNotContains() {
        return managementNetworkSubnetMaskNotContains;
    }

    public void setManagementNetworkSubnetMaskNotContains(
            String managementNetworkSubnetMaskNotContains) {
        this.managementNetworkSubnetMaskNotContains = managementNetworkSubnetMaskNotContains;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public void setManagementNetworkSubnetMaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        }
    }

    public boolean getManagementNetworkSubnetMaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotEndsWith(
            String managementNetworkSubnetMaskNotEndsWith) {

        this.managementNetworkSubnetMaskNotEndsWith = managementNetworkSubnetMaskNotEndsWith;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskNotEndsWith
     *
     * @return managementNetworkSubnetMaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskNotEndsWith() {
        return managementNetworkSubnetMaskNotEndsWith;
    }

    public void setManagementNetworkSubnetMaskNotEndsWith(
            String managementNetworkSubnetMaskNotEndsWith) {
        this.managementNetworkSubnetMaskNotEndsWith = managementNetworkSubnetMaskNotEndsWith;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkSubnetMaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkSubnetMaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotIn(
            List<String> managementNetworkSubnetMaskNotIn) {

        this.managementNetworkSubnetMaskNotIn = managementNetworkSubnetMaskNotIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkSubnetMaskNotInItem(
            String managementNetworkSubnetMaskNotInItem) {
        if (this.managementNetworkSubnetMaskNotIn == null) {
            this.managementNetworkSubnetMaskNotIn = new ArrayList<String>();
        }
        this.managementNetworkSubnetMaskNotIn.add(managementNetworkSubnetMaskNotInItem);
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskNotIn
     *
     * @return managementNetworkSubnetMaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkSubnetMaskNotIn() {
        return managementNetworkSubnetMaskNotIn;
    }

    public void setManagementNetworkSubnetMaskNotIn(List<String> managementNetworkSubnetMaskNotIn) {
        this.managementNetworkSubnetMaskNotIn = managementNetworkSubnetMaskNotIn;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public void setManagementNetworkSubnetMaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN);
        }
    }

    public boolean getManagementNetworkSubnetMaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_IN);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotStartsWith(
            String managementNetworkSubnetMaskNotStartsWith) {

        this.managementNetworkSubnetMaskNotStartsWith = managementNetworkSubnetMaskNotStartsWith;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskNotStartsWith
     *
     * @return managementNetworkSubnetMaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskNotStartsWith() {
        return managementNetworkSubnetMaskNotStartsWith;
    }

    public void setManagementNetworkSubnetMaskNotStartsWith(
            String managementNetworkSubnetMaskNotStartsWith) {
        this.managementNetworkSubnetMaskNotStartsWith = managementNetworkSubnetMaskNotStartsWith;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkSubnetMaskNotStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkSubnetMaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskStartsWith(
            String managementNetworkSubnetMaskStartsWith) {

        this.managementNetworkSubnetMaskStartsWith = managementNetworkSubnetMaskStartsWith;
        return this;
    }

    /**
     * Get managementNetworkSubnetMaskStartsWith
     *
     * @return managementNetworkSubnetMaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkSubnetMaskStartsWith() {
        return managementNetworkSubnetMaskStartsWith;
    }

    public void setManagementNetworkSubnetMaskStartsWith(
            String managementNetworkSubnetMaskStartsWith) {
        this.managementNetworkSubnetMaskStartsWith = managementNetworkSubnetMaskStartsWith;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkSubnetMaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkSubnetMaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkSubnetMaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_MANAGEMENT_NETWORK_SUBNET_MASK_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkVlan(String managementNetworkVlan) {

        this.managementNetworkVlan = managementNetworkVlan;
        return this;
    }

    /**
     * Get managementNetworkVlan
     *
     * @return managementNetworkVlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlan() {
        return managementNetworkVlan;
    }

    public void setManagementNetworkVlan(String managementNetworkVlan) {
        this.managementNetworkVlan = managementNetworkVlan;
    }

    public BackupServiceWhereInput managementNetworkVlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN);
        return this;
    }

    public void setManagementNetworkVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN);
        }
    }

    public boolean getManagementNetworkVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN);
    }

    public BackupServiceWhereInput managementNetworkVlanContains(
            String managementNetworkVlanContains) {

        this.managementNetworkVlanContains = managementNetworkVlanContains;
        return this;
    }

    /**
     * Get managementNetworkVlanContains
     *
     * @return managementNetworkVlanContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanContains() {
        return managementNetworkVlanContains;
    }

    public void setManagementNetworkVlanContains(String managementNetworkVlanContains) {
        this.managementNetworkVlanContains = managementNetworkVlanContains;
    }

    public BackupServiceWhereInput managementNetworkVlanContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public void setManagementNetworkVlanContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS);
        }
    }

    public boolean getManagementNetworkVlanContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkVlanEndsWith(
            String managementNetworkVlanEndsWith) {

        this.managementNetworkVlanEndsWith = managementNetworkVlanEndsWith;
        return this;
    }

    /**
     * Get managementNetworkVlanEndsWith
     *
     * @return managementNetworkVlanEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanEndsWith() {
        return managementNetworkVlanEndsWith;
    }

    public void setManagementNetworkVlanEndsWith(String managementNetworkVlanEndsWith) {
        this.managementNetworkVlanEndsWith = managementNetworkVlanEndsWith;
    }

    public BackupServiceWhereInput managementNetworkVlanEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkVlanEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkVlanEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkVlanGt(String managementNetworkVlanGt) {

        this.managementNetworkVlanGt = managementNetworkVlanGt;
        return this;
    }

    /**
     * Get managementNetworkVlanGt
     *
     * @return managementNetworkVlanGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanGt() {
        return managementNetworkVlanGt;
    }

    public void setManagementNetworkVlanGt(String managementNetworkVlanGt) {
        this.managementNetworkVlanGt = managementNetworkVlanGt;
    }

    public BackupServiceWhereInput managementNetworkVlanGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT);
        return this;
    }

    public void setManagementNetworkVlanGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT);
        }
    }

    public boolean getManagementNetworkVlanGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GT);
    }

    public BackupServiceWhereInput managementNetworkVlanGte(String managementNetworkVlanGte) {

        this.managementNetworkVlanGte = managementNetworkVlanGte;
        return this;
    }

    /**
     * Get managementNetworkVlanGte
     *
     * @return managementNetworkVlanGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanGte() {
        return managementNetworkVlanGte;
    }

    public void setManagementNetworkVlanGte(String managementNetworkVlanGte) {
        this.managementNetworkVlanGte = managementNetworkVlanGte;
    }

    public BackupServiceWhereInput managementNetworkVlanGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE);
        return this;
    }

    public void setManagementNetworkVlanGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE);
        }
    }

    public boolean getManagementNetworkVlanGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_GTE);
    }

    public BackupServiceWhereInput managementNetworkVlanIn(List<String> managementNetworkVlanIn) {

        this.managementNetworkVlanIn = managementNetworkVlanIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkVlanInItem(
            String managementNetworkVlanInItem) {
        if (this.managementNetworkVlanIn == null) {
            this.managementNetworkVlanIn = new ArrayList<String>();
        }
        this.managementNetworkVlanIn.add(managementNetworkVlanInItem);
        return this;
    }

    /**
     * Get managementNetworkVlanIn
     *
     * @return managementNetworkVlanIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkVlanIn() {
        return managementNetworkVlanIn;
    }

    public void setManagementNetworkVlanIn(List<String> managementNetworkVlanIn) {
        this.managementNetworkVlanIn = managementNetworkVlanIn;
    }

    public BackupServiceWhereInput managementNetworkVlanIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN);
        return this;
    }

    public void setManagementNetworkVlanIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN);
        }
    }

    public boolean getManagementNetworkVlanIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_IN);
    }

    public BackupServiceWhereInput managementNetworkVlanLt(String managementNetworkVlanLt) {

        this.managementNetworkVlanLt = managementNetworkVlanLt;
        return this;
    }

    /**
     * Get managementNetworkVlanLt
     *
     * @return managementNetworkVlanLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanLt() {
        return managementNetworkVlanLt;
    }

    public void setManagementNetworkVlanLt(String managementNetworkVlanLt) {
        this.managementNetworkVlanLt = managementNetworkVlanLt;
    }

    public BackupServiceWhereInput managementNetworkVlanLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT);
        return this;
    }

    public void setManagementNetworkVlanLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT);
        }
    }

    public boolean getManagementNetworkVlanLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LT);
    }

    public BackupServiceWhereInput managementNetworkVlanLte(String managementNetworkVlanLte) {

        this.managementNetworkVlanLte = managementNetworkVlanLte;
        return this;
    }

    /**
     * Get managementNetworkVlanLte
     *
     * @return managementNetworkVlanLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanLte() {
        return managementNetworkVlanLte;
    }

    public void setManagementNetworkVlanLte(String managementNetworkVlanLte) {
        this.managementNetworkVlanLte = managementNetworkVlanLte;
    }

    public BackupServiceWhereInput managementNetworkVlanLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE);
        return this;
    }

    public void setManagementNetworkVlanLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE);
        }
    }

    public boolean getManagementNetworkVlanLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_LTE);
    }

    public BackupServiceWhereInput managementNetworkVlanNot(String managementNetworkVlanNot) {

        this.managementNetworkVlanNot = managementNetworkVlanNot;
        return this;
    }

    /**
     * Get managementNetworkVlanNot
     *
     * @return managementNetworkVlanNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanNot() {
        return managementNetworkVlanNot;
    }

    public void setManagementNetworkVlanNot(String managementNetworkVlanNot) {
        this.managementNetworkVlanNot = managementNetworkVlanNot;
    }

    public BackupServiceWhereInput managementNetworkVlanNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT);
        return this;
    }

    public void setManagementNetworkVlanNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT);
        }
    }

    public boolean getManagementNetworkVlanNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT);
    }

    public BackupServiceWhereInput managementNetworkVlanNotContains(
            String managementNetworkVlanNotContains) {

        this.managementNetworkVlanNotContains = managementNetworkVlanNotContains;
        return this;
    }

    /**
     * Get managementNetworkVlanNotContains
     *
     * @return managementNetworkVlanNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanNotContains() {
        return managementNetworkVlanNotContains;
    }

    public void setManagementNetworkVlanNotContains(String managementNetworkVlanNotContains) {
        this.managementNetworkVlanNotContains = managementNetworkVlanNotContains;
    }

    public BackupServiceWhereInput managementNetworkVlanNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public void setManagementNetworkVlanNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS);
        }
    }

    public boolean getManagementNetworkVlanNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_CONTAINS);
    }

    public BackupServiceWhereInput managementNetworkVlanNotEndsWith(
            String managementNetworkVlanNotEndsWith) {

        this.managementNetworkVlanNotEndsWith = managementNetworkVlanNotEndsWith;
        return this;
    }

    /**
     * Get managementNetworkVlanNotEndsWith
     *
     * @return managementNetworkVlanNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanNotEndsWith() {
        return managementNetworkVlanNotEndsWith;
    }

    public void setManagementNetworkVlanNotEndsWith(String managementNetworkVlanNotEndsWith) {
        this.managementNetworkVlanNotEndsWith = managementNetworkVlanNotEndsWith;
    }

    public BackupServiceWhereInput managementNetworkVlanNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementNetworkVlanNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementNetworkVlanNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput managementNetworkVlanNotIn(
            List<String> managementNetworkVlanNotIn) {

        this.managementNetworkVlanNotIn = managementNetworkVlanNotIn;
        return this;
    }

    public BackupServiceWhereInput addManagementNetworkVlanNotInItem(
            String managementNetworkVlanNotInItem) {
        if (this.managementNetworkVlanNotIn == null) {
            this.managementNetworkVlanNotIn = new ArrayList<String>();
        }
        this.managementNetworkVlanNotIn.add(managementNetworkVlanNotInItem);
        return this;
    }

    /**
     * Get managementNetworkVlanNotIn
     *
     * @return managementNetworkVlanNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementNetworkVlanNotIn() {
        return managementNetworkVlanNotIn;
    }

    public void setManagementNetworkVlanNotIn(List<String> managementNetworkVlanNotIn) {
        this.managementNetworkVlanNotIn = managementNetworkVlanNotIn;
    }

    public BackupServiceWhereInput managementNetworkVlanNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public void setManagementNetworkVlanNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN);
        }
    }

    public boolean getManagementNetworkVlanNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_IN);
    }

    public BackupServiceWhereInput managementNetworkVlanNotStartsWith(
            String managementNetworkVlanNotStartsWith) {

        this.managementNetworkVlanNotStartsWith = managementNetworkVlanNotStartsWith;
        return this;
    }

    /**
     * Get managementNetworkVlanNotStartsWith
     *
     * @return managementNetworkVlanNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanNotStartsWith() {
        return managementNetworkVlanNotStartsWith;
    }

    public void setManagementNetworkVlanNotStartsWith(String managementNetworkVlanNotStartsWith) {
        this.managementNetworkVlanNotStartsWith = managementNetworkVlanNotStartsWith;
    }

    public BackupServiceWhereInput managementNetworkVlanNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkVlanNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkVlanNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput managementNetworkVlanStartsWith(
            String managementNetworkVlanStartsWith) {

        this.managementNetworkVlanStartsWith = managementNetworkVlanStartsWith;
        return this;
    }

    /**
     * Get managementNetworkVlanStartsWith
     *
     * @return managementNetworkVlanStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementNetworkVlanStartsWith() {
        return managementNetworkVlanStartsWith;
    }

    public void setManagementNetworkVlanStartsWith(String managementNetworkVlanStartsWith) {
        this.managementNetworkVlanStartsWith = managementNetworkVlanStartsWith;
    }

    public BackupServiceWhereInput managementNetworkVlanStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput managementNetworkVlanStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public void setManagementNetworkVlanStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH);
        }
    }

    public boolean getManagementNetworkVlanStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK_VLAN_STARTS_WITH);
    }

    public BackupServiceWhereInput maxJobRetryTimes(Integer maxJobRetryTimes) {

        this.maxJobRetryTimes = maxJobRetryTimes;
        return this;
    }

    /**
     * Get maxJobRetryTimes
     *
     * @return maxJobRetryTimes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimes() {
        return maxJobRetryTimes;
    }

    public void setMaxJobRetryTimes(Integer maxJobRetryTimes) {
        this.maxJobRetryTimes = maxJobRetryTimes;
    }

    public BackupServiceWhereInput maxJobRetryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES);
        return this;
    }

    public void setMaxJobRetryTimes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES);
        }
    }

    public boolean getMaxJobRetryTimes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES);
    }

    public BackupServiceWhereInput maxJobRetryTimesGt(Integer maxJobRetryTimesGt) {

        this.maxJobRetryTimesGt = maxJobRetryTimesGt;
        return this;
    }

    /**
     * Get maxJobRetryTimesGt
     *
     * @return maxJobRetryTimesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimesGt() {
        return maxJobRetryTimesGt;
    }

    public void setMaxJobRetryTimesGt(Integer maxJobRetryTimesGt) {
        this.maxJobRetryTimesGt = maxJobRetryTimesGt;
    }

    public BackupServiceWhereInput maxJobRetryTimesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT);
        return this;
    }

    public void setMaxJobRetryTimesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT);
        }
    }

    public boolean getMaxJobRetryTimesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GT);
    }

    public BackupServiceWhereInput maxJobRetryTimesGte(Integer maxJobRetryTimesGte) {

        this.maxJobRetryTimesGte = maxJobRetryTimesGte;
        return this;
    }

    /**
     * Get maxJobRetryTimesGte
     *
     * @return maxJobRetryTimesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimesGte() {
        return maxJobRetryTimesGte;
    }

    public void setMaxJobRetryTimesGte(Integer maxJobRetryTimesGte) {
        this.maxJobRetryTimesGte = maxJobRetryTimesGte;
    }

    public BackupServiceWhereInput maxJobRetryTimesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE);
        return this;
    }

    public void setMaxJobRetryTimesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE);
        }
    }

    public boolean getMaxJobRetryTimesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_GTE);
    }

    public BackupServiceWhereInput maxJobRetryTimesIn(List<Integer> maxJobRetryTimesIn) {

        this.maxJobRetryTimesIn = maxJobRetryTimesIn;
        return this;
    }

    public BackupServiceWhereInput addMaxJobRetryTimesInItem(Integer maxJobRetryTimesInItem) {
        if (this.maxJobRetryTimesIn == null) {
            this.maxJobRetryTimesIn = new ArrayList<Integer>();
        }
        this.maxJobRetryTimesIn.add(maxJobRetryTimesInItem);
        return this;
    }

    /**
     * Get maxJobRetryTimesIn
     *
     * @return maxJobRetryTimesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxJobRetryTimesIn() {
        return maxJobRetryTimesIn;
    }

    public void setMaxJobRetryTimesIn(List<Integer> maxJobRetryTimesIn) {
        this.maxJobRetryTimesIn = maxJobRetryTimesIn;
    }

    public BackupServiceWhereInput maxJobRetryTimesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN);
        return this;
    }

    public void setMaxJobRetryTimesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN);
        }
    }

    public boolean getMaxJobRetryTimesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_IN);
    }

    public BackupServiceWhereInput maxJobRetryTimesLt(Integer maxJobRetryTimesLt) {

        this.maxJobRetryTimesLt = maxJobRetryTimesLt;
        return this;
    }

    /**
     * Get maxJobRetryTimesLt
     *
     * @return maxJobRetryTimesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimesLt() {
        return maxJobRetryTimesLt;
    }

    public void setMaxJobRetryTimesLt(Integer maxJobRetryTimesLt) {
        this.maxJobRetryTimesLt = maxJobRetryTimesLt;
    }

    public BackupServiceWhereInput maxJobRetryTimesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT);
        return this;
    }

    public void setMaxJobRetryTimesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT);
        }
    }

    public boolean getMaxJobRetryTimesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LT);
    }

    public BackupServiceWhereInput maxJobRetryTimesLte(Integer maxJobRetryTimesLte) {

        this.maxJobRetryTimesLte = maxJobRetryTimesLte;
        return this;
    }

    /**
     * Get maxJobRetryTimesLte
     *
     * @return maxJobRetryTimesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimesLte() {
        return maxJobRetryTimesLte;
    }

    public void setMaxJobRetryTimesLte(Integer maxJobRetryTimesLte) {
        this.maxJobRetryTimesLte = maxJobRetryTimesLte;
    }

    public BackupServiceWhereInput maxJobRetryTimesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE);
        return this;
    }

    public void setMaxJobRetryTimesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE);
        }
    }

    public boolean getMaxJobRetryTimesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_LTE);
    }

    public BackupServiceWhereInput maxJobRetryTimesNot(Integer maxJobRetryTimesNot) {

        this.maxJobRetryTimesNot = maxJobRetryTimesNot;
        return this;
    }

    /**
     * Get maxJobRetryTimesNot
     *
     * @return maxJobRetryTimesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxJobRetryTimesNot() {
        return maxJobRetryTimesNot;
    }

    public void setMaxJobRetryTimesNot(Integer maxJobRetryTimesNot) {
        this.maxJobRetryTimesNot = maxJobRetryTimesNot;
    }

    public BackupServiceWhereInput maxJobRetryTimesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT);
        return this;
    }

    public void setMaxJobRetryTimesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT);
        }
    }

    public boolean getMaxJobRetryTimesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT);
    }

    public BackupServiceWhereInput maxJobRetryTimesNotIn(List<Integer> maxJobRetryTimesNotIn) {

        this.maxJobRetryTimesNotIn = maxJobRetryTimesNotIn;
        return this;
    }

    public BackupServiceWhereInput addMaxJobRetryTimesNotInItem(Integer maxJobRetryTimesNotInItem) {
        if (this.maxJobRetryTimesNotIn == null) {
            this.maxJobRetryTimesNotIn = new ArrayList<Integer>();
        }
        this.maxJobRetryTimesNotIn.add(maxJobRetryTimesNotInItem);
        return this;
    }

    /**
     * Get maxJobRetryTimesNotIn
     *
     * @return maxJobRetryTimesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxJobRetryTimesNotIn() {
        return maxJobRetryTimesNotIn;
    }

    public void setMaxJobRetryTimesNotIn(List<Integer> maxJobRetryTimesNotIn) {
        this.maxJobRetryTimesNotIn = maxJobRetryTimesNotIn;
    }

    public BackupServiceWhereInput maxJobRetryTimesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput maxJobRetryTimesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN);
        return this;
    }

    public void setMaxJobRetryTimesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN);
        }
    }

    public boolean getMaxJobRetryTimesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_JOB_RETRY_TIMES_NOT_IN);
    }

    public BackupServiceWhereInput maxParallelBackupJobs(Integer maxParallelBackupJobs) {

        this.maxParallelBackupJobs = maxParallelBackupJobs;
        return this;
    }

    /**
     * Get maxParallelBackupJobs
     *
     * @return maxParallelBackupJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobs() {
        return maxParallelBackupJobs;
    }

    public void setMaxParallelBackupJobs(Integer maxParallelBackupJobs) {
        this.maxParallelBackupJobs = maxParallelBackupJobs;
    }

    public BackupServiceWhereInput maxParallelBackupJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS);
        return this;
    }

    public void setMaxParallelBackupJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS);
        }
    }

    public boolean getMaxParallelBackupJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS);
    }

    public BackupServiceWhereInput maxParallelBackupJobsGt(Integer maxParallelBackupJobsGt) {

        this.maxParallelBackupJobsGt = maxParallelBackupJobsGt;
        return this;
    }

    /**
     * Get maxParallelBackupJobsGt
     *
     * @return maxParallelBackupJobsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobsGt() {
        return maxParallelBackupJobsGt;
    }

    public void setMaxParallelBackupJobsGt(Integer maxParallelBackupJobsGt) {
        this.maxParallelBackupJobsGt = maxParallelBackupJobsGt;
    }

    public BackupServiceWhereInput maxParallelBackupJobsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT);
        return this;
    }

    public void setMaxParallelBackupJobsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT);
        }
    }

    public boolean getMaxParallelBackupJobsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GT);
    }

    public BackupServiceWhereInput maxParallelBackupJobsGte(Integer maxParallelBackupJobsGte) {

        this.maxParallelBackupJobsGte = maxParallelBackupJobsGte;
        return this;
    }

    /**
     * Get maxParallelBackupJobsGte
     *
     * @return maxParallelBackupJobsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobsGte() {
        return maxParallelBackupJobsGte;
    }

    public void setMaxParallelBackupJobsGte(Integer maxParallelBackupJobsGte) {
        this.maxParallelBackupJobsGte = maxParallelBackupJobsGte;
    }

    public BackupServiceWhereInput maxParallelBackupJobsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE);
        return this;
    }

    public void setMaxParallelBackupJobsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE);
        }
    }

    public boolean getMaxParallelBackupJobsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_GTE);
    }

    public BackupServiceWhereInput maxParallelBackupJobsIn(List<Integer> maxParallelBackupJobsIn) {

        this.maxParallelBackupJobsIn = maxParallelBackupJobsIn;
        return this;
    }

    public BackupServiceWhereInput addMaxParallelBackupJobsInItem(
            Integer maxParallelBackupJobsInItem) {
        if (this.maxParallelBackupJobsIn == null) {
            this.maxParallelBackupJobsIn = new ArrayList<Integer>();
        }
        this.maxParallelBackupJobsIn.add(maxParallelBackupJobsInItem);
        return this;
    }

    /**
     * Get maxParallelBackupJobsIn
     *
     * @return maxParallelBackupJobsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxParallelBackupJobsIn() {
        return maxParallelBackupJobsIn;
    }

    public void setMaxParallelBackupJobsIn(List<Integer> maxParallelBackupJobsIn) {
        this.maxParallelBackupJobsIn = maxParallelBackupJobsIn;
    }

    public BackupServiceWhereInput maxParallelBackupJobsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN);
        return this;
    }

    public void setMaxParallelBackupJobsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN);
        }
    }

    public boolean getMaxParallelBackupJobsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_IN);
    }

    public BackupServiceWhereInput maxParallelBackupJobsLt(Integer maxParallelBackupJobsLt) {

        this.maxParallelBackupJobsLt = maxParallelBackupJobsLt;
        return this;
    }

    /**
     * Get maxParallelBackupJobsLt
     *
     * @return maxParallelBackupJobsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobsLt() {
        return maxParallelBackupJobsLt;
    }

    public void setMaxParallelBackupJobsLt(Integer maxParallelBackupJobsLt) {
        this.maxParallelBackupJobsLt = maxParallelBackupJobsLt;
    }

    public BackupServiceWhereInput maxParallelBackupJobsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT);
        return this;
    }

    public void setMaxParallelBackupJobsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT);
        }
    }

    public boolean getMaxParallelBackupJobsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LT);
    }

    public BackupServiceWhereInput maxParallelBackupJobsLte(Integer maxParallelBackupJobsLte) {

        this.maxParallelBackupJobsLte = maxParallelBackupJobsLte;
        return this;
    }

    /**
     * Get maxParallelBackupJobsLte
     *
     * @return maxParallelBackupJobsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobsLte() {
        return maxParallelBackupJobsLte;
    }

    public void setMaxParallelBackupJobsLte(Integer maxParallelBackupJobsLte) {
        this.maxParallelBackupJobsLte = maxParallelBackupJobsLte;
    }

    public BackupServiceWhereInput maxParallelBackupJobsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE);
        return this;
    }

    public void setMaxParallelBackupJobsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE);
        }
    }

    public boolean getMaxParallelBackupJobsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_LTE);
    }

    public BackupServiceWhereInput maxParallelBackupJobsNot(Integer maxParallelBackupJobsNot) {

        this.maxParallelBackupJobsNot = maxParallelBackupJobsNot;
        return this;
    }

    /**
     * Get maxParallelBackupJobsNot
     *
     * @return maxParallelBackupJobsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelBackupJobsNot() {
        return maxParallelBackupJobsNot;
    }

    public void setMaxParallelBackupJobsNot(Integer maxParallelBackupJobsNot) {
        this.maxParallelBackupJobsNot = maxParallelBackupJobsNot;
    }

    public BackupServiceWhereInput maxParallelBackupJobsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT);
        return this;
    }

    public void setMaxParallelBackupJobsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT);
        }
    }

    public boolean getMaxParallelBackupJobsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT);
    }

    public BackupServiceWhereInput maxParallelBackupJobsNotIn(
            List<Integer> maxParallelBackupJobsNotIn) {

        this.maxParallelBackupJobsNotIn = maxParallelBackupJobsNotIn;
        return this;
    }

    public BackupServiceWhereInput addMaxParallelBackupJobsNotInItem(
            Integer maxParallelBackupJobsNotInItem) {
        if (this.maxParallelBackupJobsNotIn == null) {
            this.maxParallelBackupJobsNotIn = new ArrayList<Integer>();
        }
        this.maxParallelBackupJobsNotIn.add(maxParallelBackupJobsNotInItem);
        return this;
    }

    /**
     * Get maxParallelBackupJobsNotIn
     *
     * @return maxParallelBackupJobsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxParallelBackupJobsNotIn() {
        return maxParallelBackupJobsNotIn;
    }

    public void setMaxParallelBackupJobsNotIn(List<Integer> maxParallelBackupJobsNotIn) {
        this.maxParallelBackupJobsNotIn = maxParallelBackupJobsNotIn;
    }

    public BackupServiceWhereInput maxParallelBackupJobsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput maxParallelBackupJobsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN);
        return this;
    }

    public void setMaxParallelBackupJobsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN);
        }
    }

    public boolean getMaxParallelBackupJobsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_BACKUP_JOBS_NOT_IN);
    }

    public BackupServiceWhereInput maxParallelRestoreJobs(Integer maxParallelRestoreJobs) {

        this.maxParallelRestoreJobs = maxParallelRestoreJobs;
        return this;
    }

    /**
     * Get maxParallelRestoreJobs
     *
     * @return maxParallelRestoreJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobs() {
        return maxParallelRestoreJobs;
    }

    public void setMaxParallelRestoreJobs(Integer maxParallelRestoreJobs) {
        this.maxParallelRestoreJobs = maxParallelRestoreJobs;
    }

    public BackupServiceWhereInput maxParallelRestoreJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS);
        return this;
    }

    public void setMaxParallelRestoreJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS);
        }
    }

    public boolean getMaxParallelRestoreJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGt(Integer maxParallelRestoreJobsGt) {

        this.maxParallelRestoreJobsGt = maxParallelRestoreJobsGt;
        return this;
    }

    /**
     * Get maxParallelRestoreJobsGt
     *
     * @return maxParallelRestoreJobsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobsGt() {
        return maxParallelRestoreJobsGt;
    }

    public void setMaxParallelRestoreJobsGt(Integer maxParallelRestoreJobsGt) {
        this.maxParallelRestoreJobsGt = maxParallelRestoreJobsGt;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT);
        return this;
    }

    public void setMaxParallelRestoreJobsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT);
        }
    }

    public boolean getMaxParallelRestoreJobsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GT);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGte(Integer maxParallelRestoreJobsGte) {

        this.maxParallelRestoreJobsGte = maxParallelRestoreJobsGte;
        return this;
    }

    /**
     * Get maxParallelRestoreJobsGte
     *
     * @return maxParallelRestoreJobsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobsGte() {
        return maxParallelRestoreJobsGte;
    }

    public void setMaxParallelRestoreJobsGte(Integer maxParallelRestoreJobsGte) {
        this.maxParallelRestoreJobsGte = maxParallelRestoreJobsGte;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE);
        return this;
    }

    public void setMaxParallelRestoreJobsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE);
        }
    }

    public boolean getMaxParallelRestoreJobsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_GTE);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsIn(
            List<Integer> maxParallelRestoreJobsIn) {

        this.maxParallelRestoreJobsIn = maxParallelRestoreJobsIn;
        return this;
    }

    public BackupServiceWhereInput addMaxParallelRestoreJobsInItem(
            Integer maxParallelRestoreJobsInItem) {
        if (this.maxParallelRestoreJobsIn == null) {
            this.maxParallelRestoreJobsIn = new ArrayList<Integer>();
        }
        this.maxParallelRestoreJobsIn.add(maxParallelRestoreJobsInItem);
        return this;
    }

    /**
     * Get maxParallelRestoreJobsIn
     *
     * @return maxParallelRestoreJobsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxParallelRestoreJobsIn() {
        return maxParallelRestoreJobsIn;
    }

    public void setMaxParallelRestoreJobsIn(List<Integer> maxParallelRestoreJobsIn) {
        this.maxParallelRestoreJobsIn = maxParallelRestoreJobsIn;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN);
        return this;
    }

    public void setMaxParallelRestoreJobsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN);
        }
    }

    public boolean getMaxParallelRestoreJobsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_IN);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLt(Integer maxParallelRestoreJobsLt) {

        this.maxParallelRestoreJobsLt = maxParallelRestoreJobsLt;
        return this;
    }

    /**
     * Get maxParallelRestoreJobsLt
     *
     * @return maxParallelRestoreJobsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobsLt() {
        return maxParallelRestoreJobsLt;
    }

    public void setMaxParallelRestoreJobsLt(Integer maxParallelRestoreJobsLt) {
        this.maxParallelRestoreJobsLt = maxParallelRestoreJobsLt;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT);
        return this;
    }

    public void setMaxParallelRestoreJobsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT);
        }
    }

    public boolean getMaxParallelRestoreJobsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LT);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLte(Integer maxParallelRestoreJobsLte) {

        this.maxParallelRestoreJobsLte = maxParallelRestoreJobsLte;
        return this;
    }

    /**
     * Get maxParallelRestoreJobsLte
     *
     * @return maxParallelRestoreJobsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobsLte() {
        return maxParallelRestoreJobsLte;
    }

    public void setMaxParallelRestoreJobsLte(Integer maxParallelRestoreJobsLte) {
        this.maxParallelRestoreJobsLte = maxParallelRestoreJobsLte;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE);
        return this;
    }

    public void setMaxParallelRestoreJobsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE);
        }
    }

    public boolean getMaxParallelRestoreJobsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_LTE);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNot(Integer maxParallelRestoreJobsNot) {

        this.maxParallelRestoreJobsNot = maxParallelRestoreJobsNot;
        return this;
    }

    /**
     * Get maxParallelRestoreJobsNot
     *
     * @return maxParallelRestoreJobsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxParallelRestoreJobsNot() {
        return maxParallelRestoreJobsNot;
    }

    public void setMaxParallelRestoreJobsNot(Integer maxParallelRestoreJobsNot) {
        this.maxParallelRestoreJobsNot = maxParallelRestoreJobsNot;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT);
        return this;
    }

    public void setMaxParallelRestoreJobsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT);
        }
    }

    public boolean getMaxParallelRestoreJobsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT);
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNotIn(
            List<Integer> maxParallelRestoreJobsNotIn) {

        this.maxParallelRestoreJobsNotIn = maxParallelRestoreJobsNotIn;
        return this;
    }

    public BackupServiceWhereInput addMaxParallelRestoreJobsNotInItem(
            Integer maxParallelRestoreJobsNotInItem) {
        if (this.maxParallelRestoreJobsNotIn == null) {
            this.maxParallelRestoreJobsNotIn = new ArrayList<Integer>();
        }
        this.maxParallelRestoreJobsNotIn.add(maxParallelRestoreJobsNotInItem);
        return this;
    }

    /**
     * Get maxParallelRestoreJobsNotIn
     *
     * @return maxParallelRestoreJobsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxParallelRestoreJobsNotIn() {
        return maxParallelRestoreJobsNotIn;
    }

    public void setMaxParallelRestoreJobsNotIn(List<Integer> maxParallelRestoreJobsNotIn) {
        this.maxParallelRestoreJobsNotIn = maxParallelRestoreJobsNotIn;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput maxParallelRestoreJobsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN);
        return this;
    }

    public void setMaxParallelRestoreJobsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN);
        }
    }

    public boolean getMaxParallelRestoreJobsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PARALLEL_RESTORE_JOBS_NOT_IN);
    }

    public BackupServiceWhereInput name(String name) {

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

    public BackupServiceWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupServiceWhereInput name_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameContains(String nameContains) {

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

    public BackupServiceWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput nameContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameEndsWith(String nameEndsWith) {

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

    public BackupServiceWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameGt(String nameGt) {

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

    public BackupServiceWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public BackupServiceWhereInput nameGt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameGte(String nameGte) {

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

    public BackupServiceWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public BackupServiceWhereInput nameGte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public BackupServiceWhereInput addNameInItem(String nameInItem) {
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

    public BackupServiceWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public BackupServiceWhereInput nameIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameLt(String nameLt) {

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

    public BackupServiceWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public BackupServiceWhereInput nameLt_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameLte(String nameLte) {

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

    public BackupServiceWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public BackupServiceWhereInput nameLte_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameNot(String nameNot) {

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

    public BackupServiceWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public BackupServiceWhereInput nameNot_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameNotContains(String nameNotContains) {

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

    public BackupServiceWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput nameNotContains_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public BackupServiceWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public BackupServiceWhereInput addNameNotInItem(String nameNotInItem) {
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

    public BackupServiceWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput nameNotIn_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public BackupServiceWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput nameStartsWith(String nameStartsWith) {

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

    public BackupServiceWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public BackupServiceWhereInput restoreRdIopsMax(Long restoreRdIopsMax) {

        this.restoreRdIopsMax = restoreRdIopsMax;
        return this;
    }

    /**
     * Get restoreRdIopsMax
     *
     * @return restoreRdIopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMax() {
        return restoreRdIopsMax;
    }

    public void setRestoreRdIopsMax(Long restoreRdIopsMax) {
        this.restoreRdIopsMax = restoreRdIopsMax;
    }

    public BackupServiceWhereInput restoreRdIopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX);
        return this;
    }

    public void setRestoreRdIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX);
        }
    }

    public boolean getRestoreRdIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX);
    }

    public BackupServiceWhereInput restoreRdIopsMaxGt(Long restoreRdIopsMaxGt) {

        this.restoreRdIopsMaxGt = restoreRdIopsMaxGt;
        return this;
    }

    /**
     * Get restoreRdIopsMaxGt
     *
     * @return restoreRdIopsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMaxGt() {
        return restoreRdIopsMaxGt;
    }

    public void setRestoreRdIopsMaxGt(Long restoreRdIopsMaxGt) {
        this.restoreRdIopsMaxGt = restoreRdIopsMaxGt;
    }

    public BackupServiceWhereInput restoreRdIopsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT);
        return this;
    }

    public void setRestoreRdIopsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT);
        }
    }

    public boolean getRestoreRdIopsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GT);
    }

    public BackupServiceWhereInput restoreRdIopsMaxGte(Long restoreRdIopsMaxGte) {

        this.restoreRdIopsMaxGte = restoreRdIopsMaxGte;
        return this;
    }

    /**
     * Get restoreRdIopsMaxGte
     *
     * @return restoreRdIopsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMaxGte() {
        return restoreRdIopsMaxGte;
    }

    public void setRestoreRdIopsMaxGte(Long restoreRdIopsMaxGte) {
        this.restoreRdIopsMaxGte = restoreRdIopsMaxGte;
    }

    public BackupServiceWhereInput restoreRdIopsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE);
        return this;
    }

    public void setRestoreRdIopsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE);
        }
    }

    public boolean getRestoreRdIopsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_GTE);
    }

    public BackupServiceWhereInput restoreRdIopsMaxIn(List<Long> restoreRdIopsMaxIn) {

        this.restoreRdIopsMaxIn = restoreRdIopsMaxIn;
        return this;
    }

    public BackupServiceWhereInput addRestoreRdIopsMaxInItem(Long restoreRdIopsMaxInItem) {
        if (this.restoreRdIopsMaxIn == null) {
            this.restoreRdIopsMaxIn = new ArrayList<Long>();
        }
        this.restoreRdIopsMaxIn.add(restoreRdIopsMaxInItem);
        return this;
    }

    /**
     * Get restoreRdIopsMaxIn
     *
     * @return restoreRdIopsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRestoreRdIopsMaxIn() {
        return restoreRdIopsMaxIn;
    }

    public void setRestoreRdIopsMaxIn(List<Long> restoreRdIopsMaxIn) {
        this.restoreRdIopsMaxIn = restoreRdIopsMaxIn;
    }

    public BackupServiceWhereInput restoreRdIopsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN);
        return this;
    }

    public void setRestoreRdIopsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN);
        }
    }

    public boolean getRestoreRdIopsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_IN);
    }

    public BackupServiceWhereInput restoreRdIopsMaxLt(Long restoreRdIopsMaxLt) {

        this.restoreRdIopsMaxLt = restoreRdIopsMaxLt;
        return this;
    }

    /**
     * Get restoreRdIopsMaxLt
     *
     * @return restoreRdIopsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMaxLt() {
        return restoreRdIopsMaxLt;
    }

    public void setRestoreRdIopsMaxLt(Long restoreRdIopsMaxLt) {
        this.restoreRdIopsMaxLt = restoreRdIopsMaxLt;
    }

    public BackupServiceWhereInput restoreRdIopsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT);
        return this;
    }

    public void setRestoreRdIopsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT);
        }
    }

    public boolean getRestoreRdIopsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LT);
    }

    public BackupServiceWhereInput restoreRdIopsMaxLte(Long restoreRdIopsMaxLte) {

        this.restoreRdIopsMaxLte = restoreRdIopsMaxLte;
        return this;
    }

    /**
     * Get restoreRdIopsMaxLte
     *
     * @return restoreRdIopsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMaxLte() {
        return restoreRdIopsMaxLte;
    }

    public void setRestoreRdIopsMaxLte(Long restoreRdIopsMaxLte) {
        this.restoreRdIopsMaxLte = restoreRdIopsMaxLte;
    }

    public BackupServiceWhereInput restoreRdIopsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE);
        return this;
    }

    public void setRestoreRdIopsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE);
        }
    }

    public boolean getRestoreRdIopsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_LTE);
    }

    public BackupServiceWhereInput restoreRdIopsMaxNot(Long restoreRdIopsMaxNot) {

        this.restoreRdIopsMaxNot = restoreRdIopsMaxNot;
        return this;
    }

    /**
     * Get restoreRdIopsMaxNot
     *
     * @return restoreRdIopsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreRdIopsMaxNot() {
        return restoreRdIopsMaxNot;
    }

    public void setRestoreRdIopsMaxNot(Long restoreRdIopsMaxNot) {
        this.restoreRdIopsMaxNot = restoreRdIopsMaxNot;
    }

    public BackupServiceWhereInput restoreRdIopsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT);
        return this;
    }

    public void setRestoreRdIopsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT);
        }
    }

    public boolean getRestoreRdIopsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT);
    }

    public BackupServiceWhereInput restoreRdIopsMaxNotIn(List<Long> restoreRdIopsMaxNotIn) {

        this.restoreRdIopsMaxNotIn = restoreRdIopsMaxNotIn;
        return this;
    }

    public BackupServiceWhereInput addRestoreRdIopsMaxNotInItem(Long restoreRdIopsMaxNotInItem) {
        if (this.restoreRdIopsMaxNotIn == null) {
            this.restoreRdIopsMaxNotIn = new ArrayList<Long>();
        }
        this.restoreRdIopsMaxNotIn.add(restoreRdIopsMaxNotInItem);
        return this;
    }

    /**
     * Get restoreRdIopsMaxNotIn
     *
     * @return restoreRdIopsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRestoreRdIopsMaxNotIn() {
        return restoreRdIopsMaxNotIn;
    }

    public void setRestoreRdIopsMaxNotIn(List<Long> restoreRdIopsMaxNotIn) {
        this.restoreRdIopsMaxNotIn = restoreRdIopsMaxNotIn;
    }

    public BackupServiceWhereInput restoreRdIopsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput restoreRdIopsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN);
        return this;
    }

    public void setRestoreRdIopsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN);
        }
    }

    public boolean getRestoreRdIopsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_RD_IOPS_MAX_NOT_IN);
    }

    public BackupServiceWhereInput restoreWrIopsMax(Long restoreWrIopsMax) {

        this.restoreWrIopsMax = restoreWrIopsMax;
        return this;
    }

    /**
     * Get restoreWrIopsMax
     *
     * @return restoreWrIopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMax() {
        return restoreWrIopsMax;
    }

    public void setRestoreWrIopsMax(Long restoreWrIopsMax) {
        this.restoreWrIopsMax = restoreWrIopsMax;
    }

    public BackupServiceWhereInput restoreWrIopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX);
        return this;
    }

    public void setRestoreWrIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX);
        }
    }

    public boolean getRestoreWrIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX);
    }

    public BackupServiceWhereInput restoreWrIopsMaxGt(Long restoreWrIopsMaxGt) {

        this.restoreWrIopsMaxGt = restoreWrIopsMaxGt;
        return this;
    }

    /**
     * Get restoreWrIopsMaxGt
     *
     * @return restoreWrIopsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMaxGt() {
        return restoreWrIopsMaxGt;
    }

    public void setRestoreWrIopsMaxGt(Long restoreWrIopsMaxGt) {
        this.restoreWrIopsMaxGt = restoreWrIopsMaxGt;
    }

    public BackupServiceWhereInput restoreWrIopsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT);
        return this;
    }

    public void setRestoreWrIopsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT);
        }
    }

    public boolean getRestoreWrIopsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GT);
    }

    public BackupServiceWhereInput restoreWrIopsMaxGte(Long restoreWrIopsMaxGte) {

        this.restoreWrIopsMaxGte = restoreWrIopsMaxGte;
        return this;
    }

    /**
     * Get restoreWrIopsMaxGte
     *
     * @return restoreWrIopsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMaxGte() {
        return restoreWrIopsMaxGte;
    }

    public void setRestoreWrIopsMaxGte(Long restoreWrIopsMaxGte) {
        this.restoreWrIopsMaxGte = restoreWrIopsMaxGte;
    }

    public BackupServiceWhereInput restoreWrIopsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE);
        return this;
    }

    public void setRestoreWrIopsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE);
        }
    }

    public boolean getRestoreWrIopsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_GTE);
    }

    public BackupServiceWhereInput restoreWrIopsMaxIn(List<Long> restoreWrIopsMaxIn) {

        this.restoreWrIopsMaxIn = restoreWrIopsMaxIn;
        return this;
    }

    public BackupServiceWhereInput addRestoreWrIopsMaxInItem(Long restoreWrIopsMaxInItem) {
        if (this.restoreWrIopsMaxIn == null) {
            this.restoreWrIopsMaxIn = new ArrayList<Long>();
        }
        this.restoreWrIopsMaxIn.add(restoreWrIopsMaxInItem);
        return this;
    }

    /**
     * Get restoreWrIopsMaxIn
     *
     * @return restoreWrIopsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRestoreWrIopsMaxIn() {
        return restoreWrIopsMaxIn;
    }

    public void setRestoreWrIopsMaxIn(List<Long> restoreWrIopsMaxIn) {
        this.restoreWrIopsMaxIn = restoreWrIopsMaxIn;
    }

    public BackupServiceWhereInput restoreWrIopsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN);
        return this;
    }

    public void setRestoreWrIopsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN);
        }
    }

    public boolean getRestoreWrIopsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_IN);
    }

    public BackupServiceWhereInput restoreWrIopsMaxLt(Long restoreWrIopsMaxLt) {

        this.restoreWrIopsMaxLt = restoreWrIopsMaxLt;
        return this;
    }

    /**
     * Get restoreWrIopsMaxLt
     *
     * @return restoreWrIopsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMaxLt() {
        return restoreWrIopsMaxLt;
    }

    public void setRestoreWrIopsMaxLt(Long restoreWrIopsMaxLt) {
        this.restoreWrIopsMaxLt = restoreWrIopsMaxLt;
    }

    public BackupServiceWhereInput restoreWrIopsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT);
        return this;
    }

    public void setRestoreWrIopsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT);
        }
    }

    public boolean getRestoreWrIopsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LT);
    }

    public BackupServiceWhereInput restoreWrIopsMaxLte(Long restoreWrIopsMaxLte) {

        this.restoreWrIopsMaxLte = restoreWrIopsMaxLte;
        return this;
    }

    /**
     * Get restoreWrIopsMaxLte
     *
     * @return restoreWrIopsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMaxLte() {
        return restoreWrIopsMaxLte;
    }

    public void setRestoreWrIopsMaxLte(Long restoreWrIopsMaxLte) {
        this.restoreWrIopsMaxLte = restoreWrIopsMaxLte;
    }

    public BackupServiceWhereInput restoreWrIopsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE);
        return this;
    }

    public void setRestoreWrIopsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE);
        }
    }

    public boolean getRestoreWrIopsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_LTE);
    }

    public BackupServiceWhereInput restoreWrIopsMaxNot(Long restoreWrIopsMaxNot) {

        this.restoreWrIopsMaxNot = restoreWrIopsMaxNot;
        return this;
    }

    /**
     * Get restoreWrIopsMaxNot
     *
     * @return restoreWrIopsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRestoreWrIopsMaxNot() {
        return restoreWrIopsMaxNot;
    }

    public void setRestoreWrIopsMaxNot(Long restoreWrIopsMaxNot) {
        this.restoreWrIopsMaxNot = restoreWrIopsMaxNot;
    }

    public BackupServiceWhereInput restoreWrIopsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT);
        return this;
    }

    public void setRestoreWrIopsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT);
        }
    }

    public boolean getRestoreWrIopsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT);
    }

    public BackupServiceWhereInput restoreWrIopsMaxNotIn(List<Long> restoreWrIopsMaxNotIn) {

        this.restoreWrIopsMaxNotIn = restoreWrIopsMaxNotIn;
        return this;
    }

    public BackupServiceWhereInput addRestoreWrIopsMaxNotInItem(Long restoreWrIopsMaxNotInItem) {
        if (this.restoreWrIopsMaxNotIn == null) {
            this.restoreWrIopsMaxNotIn = new ArrayList<Long>();
        }
        this.restoreWrIopsMaxNotIn.add(restoreWrIopsMaxNotInItem);
        return this;
    }

    /**
     * Get restoreWrIopsMaxNotIn
     *
     * @return restoreWrIopsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getRestoreWrIopsMaxNotIn() {
        return restoreWrIopsMaxNotIn;
    }

    public void setRestoreWrIopsMaxNotIn(List<Long> restoreWrIopsMaxNotIn) {
        this.restoreWrIopsMaxNotIn = restoreWrIopsMaxNotIn;
    }

    public BackupServiceWhereInput restoreWrIopsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput restoreWrIopsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN);
        return this;
    }

    public void setRestoreWrIopsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN);
        }
    }

    public boolean getRestoreWrIopsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_WR_IOPS_MAX_NOT_IN);
    }

    public BackupServiceWhereInput retryInterval(Integer retryInterval) {

        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * Get retryInterval
     *
     * @return retryInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public BackupServiceWhereInput retryInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public BackupServiceWhereInput retryInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public void setRetryInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        }
    }

    public boolean getRetryInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL);
    }

    public BackupServiceWhereInput retryIntervalGt(Integer retryIntervalGt) {

        this.retryIntervalGt = retryIntervalGt;
        return this;
    }

    /**
     * Get retryIntervalGt
     *
     * @return retryIntervalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalGt() {
        return retryIntervalGt;
    }

    public void setRetryIntervalGt(Integer retryIntervalGt) {
        this.retryIntervalGt = retryIntervalGt;
    }

    public BackupServiceWhereInput retryIntervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        return this;
    }

    public BackupServiceWhereInput retryIntervalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        return this;
    }

    public void setRetryIntervalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        }
    }

    public boolean getRetryIntervalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_GT);
    }

    public BackupServiceWhereInput retryIntervalGte(Integer retryIntervalGte) {

        this.retryIntervalGte = retryIntervalGte;
        return this;
    }

    /**
     * Get retryIntervalGte
     *
     * @return retryIntervalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalGte() {
        return retryIntervalGte;
    }

    public void setRetryIntervalGte(Integer retryIntervalGte) {
        this.retryIntervalGte = retryIntervalGte;
    }

    public BackupServiceWhereInput retryIntervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        return this;
    }

    public BackupServiceWhereInput retryIntervalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        return this;
    }

    public void setRetryIntervalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        }
    }

    public boolean getRetryIntervalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
    }

    public BackupServiceWhereInput retryIntervalIn(List<Integer> retryIntervalIn) {

        this.retryIntervalIn = retryIntervalIn;
        return this;
    }

    public BackupServiceWhereInput addRetryIntervalInItem(Integer retryIntervalInItem) {
        if (this.retryIntervalIn == null) {
            this.retryIntervalIn = new ArrayList<Integer>();
        }
        this.retryIntervalIn.add(retryIntervalInItem);
        return this;
    }

    /**
     * Get retryIntervalIn
     *
     * @return retryIntervalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryIntervalIn() {
        return retryIntervalIn;
    }

    public void setRetryIntervalIn(List<Integer> retryIntervalIn) {
        this.retryIntervalIn = retryIntervalIn;
    }

    public BackupServiceWhereInput retryIntervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        return this;
    }

    public BackupServiceWhereInput retryIntervalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        return this;
    }

    public void setRetryIntervalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        }
    }

    public boolean getRetryIntervalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_IN);
    }

    public BackupServiceWhereInput retryIntervalLt(Integer retryIntervalLt) {

        this.retryIntervalLt = retryIntervalLt;
        return this;
    }

    /**
     * Get retryIntervalLt
     *
     * @return retryIntervalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalLt() {
        return retryIntervalLt;
    }

    public void setRetryIntervalLt(Integer retryIntervalLt) {
        this.retryIntervalLt = retryIntervalLt;
    }

    public BackupServiceWhereInput retryIntervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        return this;
    }

    public BackupServiceWhereInput retryIntervalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        return this;
    }

    public void setRetryIntervalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        }
    }

    public boolean getRetryIntervalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_LT);
    }

    public BackupServiceWhereInput retryIntervalLte(Integer retryIntervalLte) {

        this.retryIntervalLte = retryIntervalLte;
        return this;
    }

    /**
     * Get retryIntervalLte
     *
     * @return retryIntervalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalLte() {
        return retryIntervalLte;
    }

    public void setRetryIntervalLte(Integer retryIntervalLte) {
        this.retryIntervalLte = retryIntervalLte;
    }

    public BackupServiceWhereInput retryIntervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        return this;
    }

    public BackupServiceWhereInput retryIntervalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        return this;
    }

    public void setRetryIntervalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        }
    }

    public boolean getRetryIntervalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
    }

    public BackupServiceWhereInput retryIntervalNot(Integer retryIntervalNot) {

        this.retryIntervalNot = retryIntervalNot;
        return this;
    }

    /**
     * Get retryIntervalNot
     *
     * @return retryIntervalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalNot() {
        return retryIntervalNot;
    }

    public void setRetryIntervalNot(Integer retryIntervalNot) {
        this.retryIntervalNot = retryIntervalNot;
    }

    public BackupServiceWhereInput retryIntervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        return this;
    }

    public BackupServiceWhereInput retryIntervalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        return this;
    }

    public void setRetryIntervalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        }
    }

    public boolean getRetryIntervalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
    }

    public BackupServiceWhereInput retryIntervalNotIn(List<Integer> retryIntervalNotIn) {

        this.retryIntervalNotIn = retryIntervalNotIn;
        return this;
    }

    public BackupServiceWhereInput addRetryIntervalNotInItem(Integer retryIntervalNotInItem) {
        if (this.retryIntervalNotIn == null) {
            this.retryIntervalNotIn = new ArrayList<Integer>();
        }
        this.retryIntervalNotIn.add(retryIntervalNotInItem);
        return this;
    }

    /**
     * Get retryIntervalNotIn
     *
     * @return retryIntervalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryIntervalNotIn() {
        return retryIntervalNotIn;
    }

    public void setRetryIntervalNotIn(List<Integer> retryIntervalNotIn) {
        this.retryIntervalNotIn = retryIntervalNotIn;
    }

    public BackupServiceWhereInput retryIntervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput retryIntervalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        return this;
    }

    public void setRetryIntervalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        }
    }

    public boolean getRetryIntervalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
    }

    public BackupServiceWhereInput runningVm(VmWhereInput runningVm) {

        this.runningVm = runningVm;
        return this;
    }

    /**
     * Get runningVm
     *
     * @return runningVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getRunningVm() {
        return runningVm;
    }

    public void setRunningVm(VmWhereInput runningVm) {
        this.runningVm = runningVm;
    }

    public BackupServiceWhereInput runningVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM);
        return this;
    }

    public BackupServiceWhereInput runningVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM);
        return this;
    }

    public void setRunningVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM);
        }
    }

    public boolean getRunningVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM);
    }

    public BackupServiceWhereInput status(BackupServiceStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceStatus getStatus() {
        return status;
    }

    public void setStatus(BackupServiceStatus status) {
        this.status = status;
    }

    public BackupServiceWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupServiceWhereInput status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public BackupServiceWhereInput statusIn(List<BackupServiceStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public BackupServiceWhereInput addStatusInItem(BackupServiceStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<BackupServiceStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<BackupServiceStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public BackupServiceWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public BackupServiceWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public BackupServiceWhereInput statusNot(BackupServiceStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(BackupServiceStatus statusNot) {
        this.statusNot = statusNot;
    }

    public BackupServiceWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public BackupServiceWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public BackupServiceWhereInput statusNotIn(List<BackupServiceStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public BackupServiceWhereInput addStatusNotInItem(BackupServiceStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<BackupServiceStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<BackupServiceStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public BackupServiceWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkGateway(String storageNetworkGateway) {

        this.storageNetworkGateway = storageNetworkGateway;
        return this;
    }

    /**
     * Get storageNetworkGateway
     *
     * @return storageNetworkGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGateway() {
        return storageNetworkGateway;
    }

    public void setStorageNetworkGateway(String storageNetworkGateway) {
        this.storageNetworkGateway = storageNetworkGateway;
    }

    public BackupServiceWhereInput storageNetworkGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY);
        return this;
    }

    public void setStorageNetworkGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY);
        }
    }

    public boolean getStorageNetworkGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY);
    }

    public BackupServiceWhereInput storageNetworkGatewayContains(
            String storageNetworkGatewayContains) {

        this.storageNetworkGatewayContains = storageNetworkGatewayContains;
        return this;
    }

    /**
     * Get storageNetworkGatewayContains
     *
     * @return storageNetworkGatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayContains() {
        return storageNetworkGatewayContains;
    }

    public void setStorageNetworkGatewayContains(String storageNetworkGatewayContains) {
        this.storageNetworkGatewayContains = storageNetworkGatewayContains;
    }

    public BackupServiceWhereInput storageNetworkGatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS);
        return this;
    }

    public void setStorageNetworkGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS);
        }
    }

    public boolean getStorageNetworkGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkGatewayEndsWith(
            String storageNetworkGatewayEndsWith) {

        this.storageNetworkGatewayEndsWith = storageNetworkGatewayEndsWith;
        return this;
    }

    /**
     * Get storageNetworkGatewayEndsWith
     *
     * @return storageNetworkGatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayEndsWith() {
        return storageNetworkGatewayEndsWith;
    }

    public void setStorageNetworkGatewayEndsWith(String storageNetworkGatewayEndsWith) {
        this.storageNetworkGatewayEndsWith = storageNetworkGatewayEndsWith;
    }

    public BackupServiceWhereInput storageNetworkGatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkGatewayGt(String storageNetworkGatewayGt) {

        this.storageNetworkGatewayGt = storageNetworkGatewayGt;
        return this;
    }

    /**
     * Get storageNetworkGatewayGt
     *
     * @return storageNetworkGatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayGt() {
        return storageNetworkGatewayGt;
    }

    public void setStorageNetworkGatewayGt(String storageNetworkGatewayGt) {
        this.storageNetworkGatewayGt = storageNetworkGatewayGt;
    }

    public BackupServiceWhereInput storageNetworkGatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT);
        return this;
    }

    public void setStorageNetworkGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT);
        }
    }

    public boolean getStorageNetworkGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GT);
    }

    public BackupServiceWhereInput storageNetworkGatewayGte(String storageNetworkGatewayGte) {

        this.storageNetworkGatewayGte = storageNetworkGatewayGte;
        return this;
    }

    /**
     * Get storageNetworkGatewayGte
     *
     * @return storageNetworkGatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayGte() {
        return storageNetworkGatewayGte;
    }

    public void setStorageNetworkGatewayGte(String storageNetworkGatewayGte) {
        this.storageNetworkGatewayGte = storageNetworkGatewayGte;
    }

    public BackupServiceWhereInput storageNetworkGatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE);
        return this;
    }

    public void setStorageNetworkGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE);
        }
    }

    public boolean getStorageNetworkGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_GTE);
    }

    public BackupServiceWhereInput storageNetworkGatewayIn(List<String> storageNetworkGatewayIn) {

        this.storageNetworkGatewayIn = storageNetworkGatewayIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkGatewayInItem(
            String storageNetworkGatewayInItem) {
        if (this.storageNetworkGatewayIn == null) {
            this.storageNetworkGatewayIn = new ArrayList<String>();
        }
        this.storageNetworkGatewayIn.add(storageNetworkGatewayInItem);
        return this;
    }

    /**
     * Get storageNetworkGatewayIn
     *
     * @return storageNetworkGatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkGatewayIn() {
        return storageNetworkGatewayIn;
    }

    public void setStorageNetworkGatewayIn(List<String> storageNetworkGatewayIn) {
        this.storageNetworkGatewayIn = storageNetworkGatewayIn;
    }

    public BackupServiceWhereInput storageNetworkGatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN);
        return this;
    }

    public void setStorageNetworkGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN);
        }
    }

    public boolean getStorageNetworkGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_IN);
    }

    public BackupServiceWhereInput storageNetworkGatewayLt(String storageNetworkGatewayLt) {

        this.storageNetworkGatewayLt = storageNetworkGatewayLt;
        return this;
    }

    /**
     * Get storageNetworkGatewayLt
     *
     * @return storageNetworkGatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayLt() {
        return storageNetworkGatewayLt;
    }

    public void setStorageNetworkGatewayLt(String storageNetworkGatewayLt) {
        this.storageNetworkGatewayLt = storageNetworkGatewayLt;
    }

    public BackupServiceWhereInput storageNetworkGatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT);
        return this;
    }

    public void setStorageNetworkGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT);
        }
    }

    public boolean getStorageNetworkGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LT);
    }

    public BackupServiceWhereInput storageNetworkGatewayLte(String storageNetworkGatewayLte) {

        this.storageNetworkGatewayLte = storageNetworkGatewayLte;
        return this;
    }

    /**
     * Get storageNetworkGatewayLte
     *
     * @return storageNetworkGatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayLte() {
        return storageNetworkGatewayLte;
    }

    public void setStorageNetworkGatewayLte(String storageNetworkGatewayLte) {
        this.storageNetworkGatewayLte = storageNetworkGatewayLte;
    }

    public BackupServiceWhereInput storageNetworkGatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE);
        return this;
    }

    public void setStorageNetworkGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE);
        }
    }

    public boolean getStorageNetworkGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_LTE);
    }

    public BackupServiceWhereInput storageNetworkGatewayNot(String storageNetworkGatewayNot) {

        this.storageNetworkGatewayNot = storageNetworkGatewayNot;
        return this;
    }

    /**
     * Get storageNetworkGatewayNot
     *
     * @return storageNetworkGatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayNot() {
        return storageNetworkGatewayNot;
    }

    public void setStorageNetworkGatewayNot(String storageNetworkGatewayNot) {
        this.storageNetworkGatewayNot = storageNetworkGatewayNot;
    }

    public BackupServiceWhereInput storageNetworkGatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT);
        return this;
    }

    public void setStorageNetworkGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT);
        }
    }

    public boolean getStorageNetworkGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT);
    }

    public BackupServiceWhereInput storageNetworkGatewayNotContains(
            String storageNetworkGatewayNotContains) {

        this.storageNetworkGatewayNotContains = storageNetworkGatewayNotContains;
        return this;
    }

    /**
     * Get storageNetworkGatewayNotContains
     *
     * @return storageNetworkGatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayNotContains() {
        return storageNetworkGatewayNotContains;
    }

    public void setStorageNetworkGatewayNotContains(String storageNetworkGatewayNotContains) {
        this.storageNetworkGatewayNotContains = storageNetworkGatewayNotContains;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setStorageNetworkGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getStorageNetworkGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkGatewayNotEndsWith(
            String storageNetworkGatewayNotEndsWith) {

        this.storageNetworkGatewayNotEndsWith = storageNetworkGatewayNotEndsWith;
        return this;
    }

    /**
     * Get storageNetworkGatewayNotEndsWith
     *
     * @return storageNetworkGatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayNotEndsWith() {
        return storageNetworkGatewayNotEndsWith;
    }

    public void setStorageNetworkGatewayNotEndsWith(String storageNetworkGatewayNotEndsWith) {
        this.storageNetworkGatewayNotEndsWith = storageNetworkGatewayNotEndsWith;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkGatewayNotIn(
            List<String> storageNetworkGatewayNotIn) {

        this.storageNetworkGatewayNotIn = storageNetworkGatewayNotIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkGatewayNotInItem(
            String storageNetworkGatewayNotInItem) {
        if (this.storageNetworkGatewayNotIn == null) {
            this.storageNetworkGatewayNotIn = new ArrayList<String>();
        }
        this.storageNetworkGatewayNotIn.add(storageNetworkGatewayNotInItem);
        return this;
    }

    /**
     * Get storageNetworkGatewayNotIn
     *
     * @return storageNetworkGatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkGatewayNotIn() {
        return storageNetworkGatewayNotIn;
    }

    public void setStorageNetworkGatewayNotIn(List<String> storageNetworkGatewayNotIn) {
        this.storageNetworkGatewayNotIn = storageNetworkGatewayNotIn;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN);
        return this;
    }

    public void setStorageNetworkGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN);
        }
    }

    public boolean getStorageNetworkGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkGatewayNotStartsWith(
            String storageNetworkGatewayNotStartsWith) {

        this.storageNetworkGatewayNotStartsWith = storageNetworkGatewayNotStartsWith;
        return this;
    }

    /**
     * Get storageNetworkGatewayNotStartsWith
     *
     * @return storageNetworkGatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayNotStartsWith() {
        return storageNetworkGatewayNotStartsWith;
    }

    public void setStorageNetworkGatewayNotStartsWith(String storageNetworkGatewayNotStartsWith) {
        this.storageNetworkGatewayNotStartsWith = storageNetworkGatewayNotStartsWith;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkGatewayStartsWith(
            String storageNetworkGatewayStartsWith) {

        this.storageNetworkGatewayStartsWith = storageNetworkGatewayStartsWith;
        return this;
    }

    /**
     * Get storageNetworkGatewayStartsWith
     *
     * @return storageNetworkGatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkGatewayStartsWith() {
        return storageNetworkGatewayStartsWith;
    }

    public void setStorageNetworkGatewayStartsWith(String storageNetworkGatewayStartsWith) {
        this.storageNetworkGatewayStartsWith = storageNetworkGatewayStartsWith;
    }

    public BackupServiceWhereInput storageNetworkGatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkGatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_GATEWAY_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkIp(String storageNetworkIp) {

        this.storageNetworkIp = storageNetworkIp;
        return this;
    }

    /**
     * Get storageNetworkIp
     *
     * @return storageNetworkIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIp() {
        return storageNetworkIp;
    }

    public void setStorageNetworkIp(String storageNetworkIp) {
        this.storageNetworkIp = storageNetworkIp;
    }

    public BackupServiceWhereInput storageNetworkIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP);
        return this;
    }

    public void setStorageNetworkIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP);
        }
    }

    public boolean getStorageNetworkIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP);
    }

    public BackupServiceWhereInput storageNetworkIpContains(String storageNetworkIpContains) {

        this.storageNetworkIpContains = storageNetworkIpContains;
        return this;
    }

    /**
     * Get storageNetworkIpContains
     *
     * @return storageNetworkIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpContains() {
        return storageNetworkIpContains;
    }

    public void setStorageNetworkIpContains(String storageNetworkIpContains) {
        this.storageNetworkIpContains = storageNetworkIpContains;
    }

    public BackupServiceWhereInput storageNetworkIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS);
        return this;
    }

    public void setStorageNetworkIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS);
        }
    }

    public boolean getStorageNetworkIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkIpEndsWith(String storageNetworkIpEndsWith) {

        this.storageNetworkIpEndsWith = storageNetworkIpEndsWith;
        return this;
    }

    /**
     * Get storageNetworkIpEndsWith
     *
     * @return storageNetworkIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpEndsWith() {
        return storageNetworkIpEndsWith;
    }

    public void setStorageNetworkIpEndsWith(String storageNetworkIpEndsWith) {
        this.storageNetworkIpEndsWith = storageNetworkIpEndsWith;
    }

    public BackupServiceWhereInput storageNetworkIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkIpGt(String storageNetworkIpGt) {

        this.storageNetworkIpGt = storageNetworkIpGt;
        return this;
    }

    /**
     * Get storageNetworkIpGt
     *
     * @return storageNetworkIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpGt() {
        return storageNetworkIpGt;
    }

    public void setStorageNetworkIpGt(String storageNetworkIpGt) {
        this.storageNetworkIpGt = storageNetworkIpGt;
    }

    public BackupServiceWhereInput storageNetworkIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT);
        return this;
    }

    public void setStorageNetworkIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT);
        }
    }

    public boolean getStorageNetworkIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_GT);
    }

    public BackupServiceWhereInput storageNetworkIpGte(String storageNetworkIpGte) {

        this.storageNetworkIpGte = storageNetworkIpGte;
        return this;
    }

    /**
     * Get storageNetworkIpGte
     *
     * @return storageNetworkIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpGte() {
        return storageNetworkIpGte;
    }

    public void setStorageNetworkIpGte(String storageNetworkIpGte) {
        this.storageNetworkIpGte = storageNetworkIpGte;
    }

    public BackupServiceWhereInput storageNetworkIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE);
        return this;
    }

    public void setStorageNetworkIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE);
        }
    }

    public boolean getStorageNetworkIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_GTE);
    }

    public BackupServiceWhereInput storageNetworkIpIn(List<String> storageNetworkIpIn) {

        this.storageNetworkIpIn = storageNetworkIpIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkIpInItem(String storageNetworkIpInItem) {
        if (this.storageNetworkIpIn == null) {
            this.storageNetworkIpIn = new ArrayList<String>();
        }
        this.storageNetworkIpIn.add(storageNetworkIpInItem);
        return this;
    }

    /**
     * Get storageNetworkIpIn
     *
     * @return storageNetworkIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkIpIn() {
        return storageNetworkIpIn;
    }

    public void setStorageNetworkIpIn(List<String> storageNetworkIpIn) {
        this.storageNetworkIpIn = storageNetworkIpIn;
    }

    public BackupServiceWhereInput storageNetworkIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN);
        return this;
    }

    public void setStorageNetworkIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN);
        }
    }

    public boolean getStorageNetworkIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_IN);
    }

    public BackupServiceWhereInput storageNetworkIpLt(String storageNetworkIpLt) {

        this.storageNetworkIpLt = storageNetworkIpLt;
        return this;
    }

    /**
     * Get storageNetworkIpLt
     *
     * @return storageNetworkIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpLt() {
        return storageNetworkIpLt;
    }

    public void setStorageNetworkIpLt(String storageNetworkIpLt) {
        this.storageNetworkIpLt = storageNetworkIpLt;
    }

    public BackupServiceWhereInput storageNetworkIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT);
        return this;
    }

    public void setStorageNetworkIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT);
        }
    }

    public boolean getStorageNetworkIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_LT);
    }

    public BackupServiceWhereInput storageNetworkIpLte(String storageNetworkIpLte) {

        this.storageNetworkIpLte = storageNetworkIpLte;
        return this;
    }

    /**
     * Get storageNetworkIpLte
     *
     * @return storageNetworkIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpLte() {
        return storageNetworkIpLte;
    }

    public void setStorageNetworkIpLte(String storageNetworkIpLte) {
        this.storageNetworkIpLte = storageNetworkIpLte;
    }

    public BackupServiceWhereInput storageNetworkIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE);
        return this;
    }

    public void setStorageNetworkIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE);
        }
    }

    public boolean getStorageNetworkIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_LTE);
    }

    public BackupServiceWhereInput storageNetworkIpNot(String storageNetworkIpNot) {

        this.storageNetworkIpNot = storageNetworkIpNot;
        return this;
    }

    /**
     * Get storageNetworkIpNot
     *
     * @return storageNetworkIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpNot() {
        return storageNetworkIpNot;
    }

    public void setStorageNetworkIpNot(String storageNetworkIpNot) {
        this.storageNetworkIpNot = storageNetworkIpNot;
    }

    public BackupServiceWhereInput storageNetworkIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT);
        return this;
    }

    public void setStorageNetworkIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT);
        }
    }

    public boolean getStorageNetworkIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT);
    }

    public BackupServiceWhereInput storageNetworkIpNotContains(String storageNetworkIpNotContains) {

        this.storageNetworkIpNotContains = storageNetworkIpNotContains;
        return this;
    }

    /**
     * Get storageNetworkIpNotContains
     *
     * @return storageNetworkIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpNotContains() {
        return storageNetworkIpNotContains;
    }

    public void setStorageNetworkIpNotContains(String storageNetworkIpNotContains) {
        this.storageNetworkIpNotContains = storageNetworkIpNotContains;
    }

    public BackupServiceWhereInput storageNetworkIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS);
        return this;
    }

    public void setStorageNetworkIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS);
        }
    }

    public boolean getStorageNetworkIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkIpNotEndsWith(String storageNetworkIpNotEndsWith) {

        this.storageNetworkIpNotEndsWith = storageNetworkIpNotEndsWith;
        return this;
    }

    /**
     * Get storageNetworkIpNotEndsWith
     *
     * @return storageNetworkIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpNotEndsWith() {
        return storageNetworkIpNotEndsWith;
    }

    public void setStorageNetworkIpNotEndsWith(String storageNetworkIpNotEndsWith) {
        this.storageNetworkIpNotEndsWith = storageNetworkIpNotEndsWith;
    }

    public BackupServiceWhereInput storageNetworkIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkIpNotIn(List<String> storageNetworkIpNotIn) {

        this.storageNetworkIpNotIn = storageNetworkIpNotIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkIpNotInItem(String storageNetworkIpNotInItem) {
        if (this.storageNetworkIpNotIn == null) {
            this.storageNetworkIpNotIn = new ArrayList<String>();
        }
        this.storageNetworkIpNotIn.add(storageNetworkIpNotInItem);
        return this;
    }

    /**
     * Get storageNetworkIpNotIn
     *
     * @return storageNetworkIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkIpNotIn() {
        return storageNetworkIpNotIn;
    }

    public void setStorageNetworkIpNotIn(List<String> storageNetworkIpNotIn) {
        this.storageNetworkIpNotIn = storageNetworkIpNotIn;
    }

    public BackupServiceWhereInput storageNetworkIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN);
        return this;
    }

    public void setStorageNetworkIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN);
        }
    }

    public boolean getStorageNetworkIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkIpNotStartsWith(
            String storageNetworkIpNotStartsWith) {

        this.storageNetworkIpNotStartsWith = storageNetworkIpNotStartsWith;
        return this;
    }

    /**
     * Get storageNetworkIpNotStartsWith
     *
     * @return storageNetworkIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpNotStartsWith() {
        return storageNetworkIpNotStartsWith;
    }

    public void setStorageNetworkIpNotStartsWith(String storageNetworkIpNotStartsWith) {
        this.storageNetworkIpNotStartsWith = storageNetworkIpNotStartsWith;
    }

    public BackupServiceWhereInput storageNetworkIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkIpStartsWith(String storageNetworkIpStartsWith) {

        this.storageNetworkIpStartsWith = storageNetworkIpStartsWith;
        return this;
    }

    /**
     * Get storageNetworkIpStartsWith
     *
     * @return storageNetworkIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkIpStartsWith() {
        return storageNetworkIpStartsWith;
    }

    public void setStorageNetworkIpStartsWith(String storageNetworkIpStartsWith) {
        this.storageNetworkIpStartsWith = storageNetworkIpStartsWith;
    }

    public BackupServiceWhereInput storageNetworkIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_IP_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkSubnetMask(String storageNetworkSubnetMask) {

        this.storageNetworkSubnetMask = storageNetworkSubnetMask;
        return this;
    }

    /**
     * Get storageNetworkSubnetMask
     *
     * @return storageNetworkSubnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMask() {
        return storageNetworkSubnetMask;
    }

    public void setStorageNetworkSubnetMask(String storageNetworkSubnetMask) {
        this.storageNetworkSubnetMask = storageNetworkSubnetMask;
    }

    public BackupServiceWhereInput storageNetworkSubnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK);
        return this;
    }

    public void setStorageNetworkSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK);
        }
    }

    public boolean getStorageNetworkSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskContains(
            String storageNetworkSubnetMaskContains) {

        this.storageNetworkSubnetMaskContains = storageNetworkSubnetMaskContains;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskContains
     *
     * @return storageNetworkSubnetMaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskContains() {
        return storageNetworkSubnetMaskContains;
    }

    public void setStorageNetworkSubnetMaskContains(String storageNetworkSubnetMaskContains) {
        this.storageNetworkSubnetMaskContains = storageNetworkSubnetMaskContains;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS);
        return this;
    }

    public void setStorageNetworkSubnetMaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS);
        }
    }

    public boolean getStorageNetworkSubnetMaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskEndsWith(
            String storageNetworkSubnetMaskEndsWith) {

        this.storageNetworkSubnetMaskEndsWith = storageNetworkSubnetMaskEndsWith;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskEndsWith
     *
     * @return storageNetworkSubnetMaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskEndsWith() {
        return storageNetworkSubnetMaskEndsWith;
    }

    public void setStorageNetworkSubnetMaskEndsWith(String storageNetworkSubnetMaskEndsWith) {
        this.storageNetworkSubnetMaskEndsWith = storageNetworkSubnetMaskEndsWith;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkSubnetMaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkSubnetMaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGt(String storageNetworkSubnetMaskGt) {

        this.storageNetworkSubnetMaskGt = storageNetworkSubnetMaskGt;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskGt
     *
     * @return storageNetworkSubnetMaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskGt() {
        return storageNetworkSubnetMaskGt;
    }

    public void setStorageNetworkSubnetMaskGt(String storageNetworkSubnetMaskGt) {
        this.storageNetworkSubnetMaskGt = storageNetworkSubnetMaskGt;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT);
        return this;
    }

    public void setStorageNetworkSubnetMaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT);
        }
    }

    public boolean getStorageNetworkSubnetMaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GT);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGte(String storageNetworkSubnetMaskGte) {

        this.storageNetworkSubnetMaskGte = storageNetworkSubnetMaskGte;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskGte
     *
     * @return storageNetworkSubnetMaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskGte() {
        return storageNetworkSubnetMaskGte;
    }

    public void setStorageNetworkSubnetMaskGte(String storageNetworkSubnetMaskGte) {
        this.storageNetworkSubnetMaskGte = storageNetworkSubnetMaskGte;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE);
        return this;
    }

    public void setStorageNetworkSubnetMaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE);
        }
    }

    public boolean getStorageNetworkSubnetMaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_GTE);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskIn(
            List<String> storageNetworkSubnetMaskIn) {

        this.storageNetworkSubnetMaskIn = storageNetworkSubnetMaskIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkSubnetMaskInItem(
            String storageNetworkSubnetMaskInItem) {
        if (this.storageNetworkSubnetMaskIn == null) {
            this.storageNetworkSubnetMaskIn = new ArrayList<String>();
        }
        this.storageNetworkSubnetMaskIn.add(storageNetworkSubnetMaskInItem);
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskIn
     *
     * @return storageNetworkSubnetMaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkSubnetMaskIn() {
        return storageNetworkSubnetMaskIn;
    }

    public void setStorageNetworkSubnetMaskIn(List<String> storageNetworkSubnetMaskIn) {
        this.storageNetworkSubnetMaskIn = storageNetworkSubnetMaskIn;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN);
        return this;
    }

    public void setStorageNetworkSubnetMaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN);
        }
    }

    public boolean getStorageNetworkSubnetMaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_IN);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLt(String storageNetworkSubnetMaskLt) {

        this.storageNetworkSubnetMaskLt = storageNetworkSubnetMaskLt;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskLt
     *
     * @return storageNetworkSubnetMaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskLt() {
        return storageNetworkSubnetMaskLt;
    }

    public void setStorageNetworkSubnetMaskLt(String storageNetworkSubnetMaskLt) {
        this.storageNetworkSubnetMaskLt = storageNetworkSubnetMaskLt;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT);
        return this;
    }

    public void setStorageNetworkSubnetMaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT);
        }
    }

    public boolean getStorageNetworkSubnetMaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LT);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLte(String storageNetworkSubnetMaskLte) {

        this.storageNetworkSubnetMaskLte = storageNetworkSubnetMaskLte;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskLte
     *
     * @return storageNetworkSubnetMaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskLte() {
        return storageNetworkSubnetMaskLte;
    }

    public void setStorageNetworkSubnetMaskLte(String storageNetworkSubnetMaskLte) {
        this.storageNetworkSubnetMaskLte = storageNetworkSubnetMaskLte;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE);
        return this;
    }

    public void setStorageNetworkSubnetMaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE);
        }
    }

    public boolean getStorageNetworkSubnetMaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_LTE);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNot(String storageNetworkSubnetMaskNot) {

        this.storageNetworkSubnetMaskNot = storageNetworkSubnetMaskNot;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskNot
     *
     * @return storageNetworkSubnetMaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskNot() {
        return storageNetworkSubnetMaskNot;
    }

    public void setStorageNetworkSubnetMaskNot(String storageNetworkSubnetMaskNot) {
        this.storageNetworkSubnetMaskNot = storageNetworkSubnetMaskNot;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT);
        return this;
    }

    public void setStorageNetworkSubnetMaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT);
        }
    }

    public boolean getStorageNetworkSubnetMaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotContains(
            String storageNetworkSubnetMaskNotContains) {

        this.storageNetworkSubnetMaskNotContains = storageNetworkSubnetMaskNotContains;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskNotContains
     *
     * @return storageNetworkSubnetMaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskNotContains() {
        return storageNetworkSubnetMaskNotContains;
    }

    public void setStorageNetworkSubnetMaskNotContains(String storageNetworkSubnetMaskNotContains) {
        this.storageNetworkSubnetMaskNotContains = storageNetworkSubnetMaskNotContains;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public void setStorageNetworkSubnetMaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS);
        }
    }

    public boolean getStorageNetworkSubnetMaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotEndsWith(
            String storageNetworkSubnetMaskNotEndsWith) {

        this.storageNetworkSubnetMaskNotEndsWith = storageNetworkSubnetMaskNotEndsWith;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskNotEndsWith
     *
     * @return storageNetworkSubnetMaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskNotEndsWith() {
        return storageNetworkSubnetMaskNotEndsWith;
    }

    public void setStorageNetworkSubnetMaskNotEndsWith(String storageNetworkSubnetMaskNotEndsWith) {
        this.storageNetworkSubnetMaskNotEndsWith = storageNetworkSubnetMaskNotEndsWith;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkSubnetMaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkSubnetMaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotIn(
            List<String> storageNetworkSubnetMaskNotIn) {

        this.storageNetworkSubnetMaskNotIn = storageNetworkSubnetMaskNotIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkSubnetMaskNotInItem(
            String storageNetworkSubnetMaskNotInItem) {
        if (this.storageNetworkSubnetMaskNotIn == null) {
            this.storageNetworkSubnetMaskNotIn = new ArrayList<String>();
        }
        this.storageNetworkSubnetMaskNotIn.add(storageNetworkSubnetMaskNotInItem);
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskNotIn
     *
     * @return storageNetworkSubnetMaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkSubnetMaskNotIn() {
        return storageNetworkSubnetMaskNotIn;
    }

    public void setStorageNetworkSubnetMaskNotIn(List<String> storageNetworkSubnetMaskNotIn) {
        this.storageNetworkSubnetMaskNotIn = storageNetworkSubnetMaskNotIn;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN);
        return this;
    }

    public void setStorageNetworkSubnetMaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN);
        }
    }

    public boolean getStorageNetworkSubnetMaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotStartsWith(
            String storageNetworkSubnetMaskNotStartsWith) {

        this.storageNetworkSubnetMaskNotStartsWith = storageNetworkSubnetMaskNotStartsWith;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskNotStartsWith
     *
     * @return storageNetworkSubnetMaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskNotStartsWith() {
        return storageNetworkSubnetMaskNotStartsWith;
    }

    public void setStorageNetworkSubnetMaskNotStartsWith(
            String storageNetworkSubnetMaskNotStartsWith) {
        this.storageNetworkSubnetMaskNotStartsWith = storageNetworkSubnetMaskNotStartsWith;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkSubnetMaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkSubnetMaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskStartsWith(
            String storageNetworkSubnetMaskStartsWith) {

        this.storageNetworkSubnetMaskStartsWith = storageNetworkSubnetMaskStartsWith;
        return this;
    }

    /**
     * Get storageNetworkSubnetMaskStartsWith
     *
     * @return storageNetworkSubnetMaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkSubnetMaskStartsWith() {
        return storageNetworkSubnetMaskStartsWith;
    }

    public void setStorageNetworkSubnetMaskStartsWith(String storageNetworkSubnetMaskStartsWith) {
        this.storageNetworkSubnetMaskStartsWith = storageNetworkSubnetMaskStartsWith;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkSubnetMaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkSubnetMaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkSubnetMaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_SUBNET_MASK_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkType(BackupServiceNetworkType storageNetworkType) {

        this.storageNetworkType = storageNetworkType;
        return this;
    }

    /**
     * Get storageNetworkType
     *
     * @return storageNetworkType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceNetworkType getStorageNetworkType() {
        return storageNetworkType;
    }

    public void setStorageNetworkType(BackupServiceNetworkType storageNetworkType) {
        this.storageNetworkType = storageNetworkType;
    }

    public BackupServiceWhereInput storageNetworkType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE);
        return this;
    }

    public void setStorageNetworkType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE);
        }
    }

    public boolean getStorageNetworkType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_TYPE);
    }

    public BackupServiceWhereInput storageNetworkTypeIn(
            List<BackupServiceNetworkType> storageNetworkTypeIn) {

        this.storageNetworkTypeIn = storageNetworkTypeIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkTypeInItem(
            BackupServiceNetworkType storageNetworkTypeInItem) {
        if (this.storageNetworkTypeIn == null) {
            this.storageNetworkTypeIn = new ArrayList<BackupServiceNetworkType>();
        }
        this.storageNetworkTypeIn.add(storageNetworkTypeInItem);
        return this;
    }

    /**
     * Get storageNetworkTypeIn
     *
     * @return storageNetworkTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceNetworkType> getStorageNetworkTypeIn() {
        return storageNetworkTypeIn;
    }

    public void setStorageNetworkTypeIn(List<BackupServiceNetworkType> storageNetworkTypeIn) {
        this.storageNetworkTypeIn = storageNetworkTypeIn;
    }

    public BackupServiceWhereInput storageNetworkTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN);
        return this;
    }

    public void setStorageNetworkTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN);
        }
    }

    public boolean getStorageNetworkTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_IN);
    }

    public BackupServiceWhereInput storageNetworkTypeNot(
            BackupServiceNetworkType storageNetworkTypeNot) {

        this.storageNetworkTypeNot = storageNetworkTypeNot;
        return this;
    }

    /**
     * Get storageNetworkTypeNot
     *
     * @return storageNetworkTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceNetworkType getStorageNetworkTypeNot() {
        return storageNetworkTypeNot;
    }

    public void setStorageNetworkTypeNot(BackupServiceNetworkType storageNetworkTypeNot) {
        this.storageNetworkTypeNot = storageNetworkTypeNot;
    }

    public BackupServiceWhereInput storageNetworkTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT);
        return this;
    }

    public void setStorageNetworkTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT);
        }
    }

    public boolean getStorageNetworkTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT);
    }

    public BackupServiceWhereInput storageNetworkTypeNotIn(
            List<BackupServiceNetworkType> storageNetworkTypeNotIn) {

        this.storageNetworkTypeNotIn = storageNetworkTypeNotIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkTypeNotInItem(
            BackupServiceNetworkType storageNetworkTypeNotInItem) {
        if (this.storageNetworkTypeNotIn == null) {
            this.storageNetworkTypeNotIn = new ArrayList<BackupServiceNetworkType>();
        }
        this.storageNetworkTypeNotIn.add(storageNetworkTypeNotInItem);
        return this;
    }

    /**
     * Get storageNetworkTypeNotIn
     *
     * @return storageNetworkTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupServiceNetworkType> getStorageNetworkTypeNotIn() {
        return storageNetworkTypeNotIn;
    }

    public void setStorageNetworkTypeNotIn(List<BackupServiceNetworkType> storageNetworkTypeNotIn) {
        this.storageNetworkTypeNotIn = storageNetworkTypeNotIn;
    }

    public BackupServiceWhereInput storageNetworkTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN);
        return this;
    }

    public void setStorageNetworkTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN);
        }
    }

    public boolean getStorageNetworkTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_TYPE_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkVlan(String storageNetworkVlan) {

        this.storageNetworkVlan = storageNetworkVlan;
        return this;
    }

    /**
     * Get storageNetworkVlan
     *
     * @return storageNetworkVlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlan() {
        return storageNetworkVlan;
    }

    public void setStorageNetworkVlan(String storageNetworkVlan) {
        this.storageNetworkVlan = storageNetworkVlan;
    }

    public BackupServiceWhereInput storageNetworkVlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN);
        return this;
    }

    public void setStorageNetworkVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN);
        }
    }

    public boolean getStorageNetworkVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN);
    }

    public BackupServiceWhereInput storageNetworkVlanContains(String storageNetworkVlanContains) {

        this.storageNetworkVlanContains = storageNetworkVlanContains;
        return this;
    }

    /**
     * Get storageNetworkVlanContains
     *
     * @return storageNetworkVlanContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanContains() {
        return storageNetworkVlanContains;
    }

    public void setStorageNetworkVlanContains(String storageNetworkVlanContains) {
        this.storageNetworkVlanContains = storageNetworkVlanContains;
    }

    public BackupServiceWhereInput storageNetworkVlanContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS);
        return this;
    }

    public void setStorageNetworkVlanContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS);
        }
    }

    public boolean getStorageNetworkVlanContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkVlanEndsWith(String storageNetworkVlanEndsWith) {

        this.storageNetworkVlanEndsWith = storageNetworkVlanEndsWith;
        return this;
    }

    /**
     * Get storageNetworkVlanEndsWith
     *
     * @return storageNetworkVlanEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanEndsWith() {
        return storageNetworkVlanEndsWith;
    }

    public void setStorageNetworkVlanEndsWith(String storageNetworkVlanEndsWith) {
        this.storageNetworkVlanEndsWith = storageNetworkVlanEndsWith;
    }

    public BackupServiceWhereInput storageNetworkVlanEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkVlanEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkVlanEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkVlanGt(String storageNetworkVlanGt) {

        this.storageNetworkVlanGt = storageNetworkVlanGt;
        return this;
    }

    /**
     * Get storageNetworkVlanGt
     *
     * @return storageNetworkVlanGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanGt() {
        return storageNetworkVlanGt;
    }

    public void setStorageNetworkVlanGt(String storageNetworkVlanGt) {
        this.storageNetworkVlanGt = storageNetworkVlanGt;
    }

    public BackupServiceWhereInput storageNetworkVlanGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT);
        return this;
    }

    public void setStorageNetworkVlanGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT);
        }
    }

    public boolean getStorageNetworkVlanGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GT);
    }

    public BackupServiceWhereInput storageNetworkVlanGte(String storageNetworkVlanGte) {

        this.storageNetworkVlanGte = storageNetworkVlanGte;
        return this;
    }

    /**
     * Get storageNetworkVlanGte
     *
     * @return storageNetworkVlanGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanGte() {
        return storageNetworkVlanGte;
    }

    public void setStorageNetworkVlanGte(String storageNetworkVlanGte) {
        this.storageNetworkVlanGte = storageNetworkVlanGte;
    }

    public BackupServiceWhereInput storageNetworkVlanGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE);
        return this;
    }

    public void setStorageNetworkVlanGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE);
        }
    }

    public boolean getStorageNetworkVlanGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_GTE);
    }

    public BackupServiceWhereInput storageNetworkVlanIn(List<String> storageNetworkVlanIn) {

        this.storageNetworkVlanIn = storageNetworkVlanIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkVlanInItem(String storageNetworkVlanInItem) {
        if (this.storageNetworkVlanIn == null) {
            this.storageNetworkVlanIn = new ArrayList<String>();
        }
        this.storageNetworkVlanIn.add(storageNetworkVlanInItem);
        return this;
    }

    /**
     * Get storageNetworkVlanIn
     *
     * @return storageNetworkVlanIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkVlanIn() {
        return storageNetworkVlanIn;
    }

    public void setStorageNetworkVlanIn(List<String> storageNetworkVlanIn) {
        this.storageNetworkVlanIn = storageNetworkVlanIn;
    }

    public BackupServiceWhereInput storageNetworkVlanIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN);
        return this;
    }

    public void setStorageNetworkVlanIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN);
        }
    }

    public boolean getStorageNetworkVlanIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_IN);
    }

    public BackupServiceWhereInput storageNetworkVlanLt(String storageNetworkVlanLt) {

        this.storageNetworkVlanLt = storageNetworkVlanLt;
        return this;
    }

    /**
     * Get storageNetworkVlanLt
     *
     * @return storageNetworkVlanLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanLt() {
        return storageNetworkVlanLt;
    }

    public void setStorageNetworkVlanLt(String storageNetworkVlanLt) {
        this.storageNetworkVlanLt = storageNetworkVlanLt;
    }

    public BackupServiceWhereInput storageNetworkVlanLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT);
        return this;
    }

    public void setStorageNetworkVlanLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT);
        }
    }

    public boolean getStorageNetworkVlanLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LT);
    }

    public BackupServiceWhereInput storageNetworkVlanLte(String storageNetworkVlanLte) {

        this.storageNetworkVlanLte = storageNetworkVlanLte;
        return this;
    }

    /**
     * Get storageNetworkVlanLte
     *
     * @return storageNetworkVlanLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanLte() {
        return storageNetworkVlanLte;
    }

    public void setStorageNetworkVlanLte(String storageNetworkVlanLte) {
        this.storageNetworkVlanLte = storageNetworkVlanLte;
    }

    public BackupServiceWhereInput storageNetworkVlanLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE);
        return this;
    }

    public void setStorageNetworkVlanLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE);
        }
    }

    public boolean getStorageNetworkVlanLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_LTE);
    }

    public BackupServiceWhereInput storageNetworkVlanNot(String storageNetworkVlanNot) {

        this.storageNetworkVlanNot = storageNetworkVlanNot;
        return this;
    }

    /**
     * Get storageNetworkVlanNot
     *
     * @return storageNetworkVlanNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanNot() {
        return storageNetworkVlanNot;
    }

    public void setStorageNetworkVlanNot(String storageNetworkVlanNot) {
        this.storageNetworkVlanNot = storageNetworkVlanNot;
    }

    public BackupServiceWhereInput storageNetworkVlanNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT);
        return this;
    }

    public void setStorageNetworkVlanNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT);
        }
    }

    public boolean getStorageNetworkVlanNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT);
    }

    public BackupServiceWhereInput storageNetworkVlanNotContains(
            String storageNetworkVlanNotContains) {

        this.storageNetworkVlanNotContains = storageNetworkVlanNotContains;
        return this;
    }

    /**
     * Get storageNetworkVlanNotContains
     *
     * @return storageNetworkVlanNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanNotContains() {
        return storageNetworkVlanNotContains;
    }

    public void setStorageNetworkVlanNotContains(String storageNetworkVlanNotContains) {
        this.storageNetworkVlanNotContains = storageNetworkVlanNotContains;
    }

    public BackupServiceWhereInput storageNetworkVlanNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS);
        return this;
    }

    public void setStorageNetworkVlanNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS);
        }
    }

    public boolean getStorageNetworkVlanNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_CONTAINS);
    }

    public BackupServiceWhereInput storageNetworkVlanNotEndsWith(
            String storageNetworkVlanNotEndsWith) {

        this.storageNetworkVlanNotEndsWith = storageNetworkVlanNotEndsWith;
        return this;
    }

    /**
     * Get storageNetworkVlanNotEndsWith
     *
     * @return storageNetworkVlanNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanNotEndsWith() {
        return storageNetworkVlanNotEndsWith;
    }

    public void setStorageNetworkVlanNotEndsWith(String storageNetworkVlanNotEndsWith) {
        this.storageNetworkVlanNotEndsWith = storageNetworkVlanNotEndsWith;
    }

    public BackupServiceWhereInput storageNetworkVlanNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageNetworkVlanNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageNetworkVlanNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_ENDS_WITH);
    }

    public BackupServiceWhereInput storageNetworkVlanNotIn(List<String> storageNetworkVlanNotIn) {

        this.storageNetworkVlanNotIn = storageNetworkVlanNotIn;
        return this;
    }

    public BackupServiceWhereInput addStorageNetworkVlanNotInItem(
            String storageNetworkVlanNotInItem) {
        if (this.storageNetworkVlanNotIn == null) {
            this.storageNetworkVlanNotIn = new ArrayList<String>();
        }
        this.storageNetworkVlanNotIn.add(storageNetworkVlanNotInItem);
        return this;
    }

    /**
     * Get storageNetworkVlanNotIn
     *
     * @return storageNetworkVlanNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageNetworkVlanNotIn() {
        return storageNetworkVlanNotIn;
    }

    public void setStorageNetworkVlanNotIn(List<String> storageNetworkVlanNotIn) {
        this.storageNetworkVlanNotIn = storageNetworkVlanNotIn;
    }

    public BackupServiceWhereInput storageNetworkVlanNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN);
        return this;
    }

    public void setStorageNetworkVlanNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN);
        }
    }

    public boolean getStorageNetworkVlanNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_IN);
    }

    public BackupServiceWhereInput storageNetworkVlanNotStartsWith(
            String storageNetworkVlanNotStartsWith) {

        this.storageNetworkVlanNotStartsWith = storageNetworkVlanNotStartsWith;
        return this;
    }

    /**
     * Get storageNetworkVlanNotStartsWith
     *
     * @return storageNetworkVlanNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanNotStartsWith() {
        return storageNetworkVlanNotStartsWith;
    }

    public void setStorageNetworkVlanNotStartsWith(String storageNetworkVlanNotStartsWith) {
        this.storageNetworkVlanNotStartsWith = storageNetworkVlanNotStartsWith;
    }

    public BackupServiceWhereInput storageNetworkVlanNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkVlanNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkVlanNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_NOT_STARTS_WITH);
    }

    public BackupServiceWhereInput storageNetworkVlanStartsWith(
            String storageNetworkVlanStartsWith) {

        this.storageNetworkVlanStartsWith = storageNetworkVlanStartsWith;
        return this;
    }

    /**
     * Get storageNetworkVlanStartsWith
     *
     * @return storageNetworkVlanStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageNetworkVlanStartsWith() {
        return storageNetworkVlanStartsWith;
    }

    public void setStorageNetworkVlanStartsWith(String storageNetworkVlanStartsWith) {
        this.storageNetworkVlanStartsWith = storageNetworkVlanStartsWith;
    }

    public BackupServiceWhereInput storageNetworkVlanStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public BackupServiceWhereInput storageNetworkVlanStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH);
        return this;
    }

    public void setStorageNetworkVlanStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH);
        }
    }

    public boolean getStorageNetworkVlanStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK_VLAN_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupServiceWhereInput backupServiceWhereInput = (BackupServiceWhereInput) o;
        return Objects.equals(this.AND, backupServiceWhereInput.AND)
                && Objects.equals(this.NOT, backupServiceWhereInput.NOT)
                && Objects.equals(this.OR, backupServiceWhereInput.OR)
                && Objects.equals(
                        this.backupClustersEvery, backupServiceWhereInput.backupClustersEvery)
                && Objects.equals(
                        this.backupClustersNone, backupServiceWhereInput.backupClustersNone)
                && Objects.equals(
                        this.backupClustersSome, backupServiceWhereInput.backupClustersSome)
                && Objects.equals(
                        this.backupNetworkGateway, backupServiceWhereInput.backupNetworkGateway)
                && Objects.equals(
                        this.backupNetworkGatewayContains,
                        backupServiceWhereInput.backupNetworkGatewayContains)
                && Objects.equals(
                        this.backupNetworkGatewayEndsWith,
                        backupServiceWhereInput.backupNetworkGatewayEndsWith)
                && Objects.equals(
                        this.backupNetworkGatewayGt, backupServiceWhereInput.backupNetworkGatewayGt)
                && Objects.equals(
                        this.backupNetworkGatewayGte,
                        backupServiceWhereInput.backupNetworkGatewayGte)
                && Objects.equals(
                        this.backupNetworkGatewayIn, backupServiceWhereInput.backupNetworkGatewayIn)
                && Objects.equals(
                        this.backupNetworkGatewayLt, backupServiceWhereInput.backupNetworkGatewayLt)
                && Objects.equals(
                        this.backupNetworkGatewayLte,
                        backupServiceWhereInput.backupNetworkGatewayLte)
                && Objects.equals(
                        this.backupNetworkGatewayNot,
                        backupServiceWhereInput.backupNetworkGatewayNot)
                && Objects.equals(
                        this.backupNetworkGatewayNotContains,
                        backupServiceWhereInput.backupNetworkGatewayNotContains)
                && Objects.equals(
                        this.backupNetworkGatewayNotEndsWith,
                        backupServiceWhereInput.backupNetworkGatewayNotEndsWith)
                && Objects.equals(
                        this.backupNetworkGatewayNotIn,
                        backupServiceWhereInput.backupNetworkGatewayNotIn)
                && Objects.equals(
                        this.backupNetworkGatewayNotStartsWith,
                        backupServiceWhereInput.backupNetworkGatewayNotStartsWith)
                && Objects.equals(
                        this.backupNetworkGatewayStartsWith,
                        backupServiceWhereInput.backupNetworkGatewayStartsWith)
                && Objects.equals(this.backupNetworkIp, backupServiceWhereInput.backupNetworkIp)
                && Objects.equals(
                        this.backupNetworkIpContains,
                        backupServiceWhereInput.backupNetworkIpContains)
                && Objects.equals(
                        this.backupNetworkIpEndsWith,
                        backupServiceWhereInput.backupNetworkIpEndsWith)
                && Objects.equals(this.backupNetworkIpGt, backupServiceWhereInput.backupNetworkIpGt)
                && Objects.equals(
                        this.backupNetworkIpGte, backupServiceWhereInput.backupNetworkIpGte)
                && Objects.equals(this.backupNetworkIpIn, backupServiceWhereInput.backupNetworkIpIn)
                && Objects.equals(this.backupNetworkIpLt, backupServiceWhereInput.backupNetworkIpLt)
                && Objects.equals(
                        this.backupNetworkIpLte, backupServiceWhereInput.backupNetworkIpLte)
                && Objects.equals(
                        this.backupNetworkIpNot, backupServiceWhereInput.backupNetworkIpNot)
                && Objects.equals(
                        this.backupNetworkIpNotContains,
                        backupServiceWhereInput.backupNetworkIpNotContains)
                && Objects.equals(
                        this.backupNetworkIpNotEndsWith,
                        backupServiceWhereInput.backupNetworkIpNotEndsWith)
                && Objects.equals(
                        this.backupNetworkIpNotIn, backupServiceWhereInput.backupNetworkIpNotIn)
                && Objects.equals(
                        this.backupNetworkIpNotStartsWith,
                        backupServiceWhereInput.backupNetworkIpNotStartsWith)
                && Objects.equals(
                        this.backupNetworkIpStartsWith,
                        backupServiceWhereInput.backupNetworkIpStartsWith)
                && Objects.equals(
                        this.backupNetworkSubnetMask,
                        backupServiceWhereInput.backupNetworkSubnetMask)
                && Objects.equals(
                        this.backupNetworkSubnetMaskContains,
                        backupServiceWhereInput.backupNetworkSubnetMaskContains)
                && Objects.equals(
                        this.backupNetworkSubnetMaskEndsWith,
                        backupServiceWhereInput.backupNetworkSubnetMaskEndsWith)
                && Objects.equals(
                        this.backupNetworkSubnetMaskGt,
                        backupServiceWhereInput.backupNetworkSubnetMaskGt)
                && Objects.equals(
                        this.backupNetworkSubnetMaskGte,
                        backupServiceWhereInput.backupNetworkSubnetMaskGte)
                && Objects.equals(
                        this.backupNetworkSubnetMaskIn,
                        backupServiceWhereInput.backupNetworkSubnetMaskIn)
                && Objects.equals(
                        this.backupNetworkSubnetMaskLt,
                        backupServiceWhereInput.backupNetworkSubnetMaskLt)
                && Objects.equals(
                        this.backupNetworkSubnetMaskLte,
                        backupServiceWhereInput.backupNetworkSubnetMaskLte)
                && Objects.equals(
                        this.backupNetworkSubnetMaskNot,
                        backupServiceWhereInput.backupNetworkSubnetMaskNot)
                && Objects.equals(
                        this.backupNetworkSubnetMaskNotContains,
                        backupServiceWhereInput.backupNetworkSubnetMaskNotContains)
                && Objects.equals(
                        this.backupNetworkSubnetMaskNotEndsWith,
                        backupServiceWhereInput.backupNetworkSubnetMaskNotEndsWith)
                && Objects.equals(
                        this.backupNetworkSubnetMaskNotIn,
                        backupServiceWhereInput.backupNetworkSubnetMaskNotIn)
                && Objects.equals(
                        this.backupNetworkSubnetMaskNotStartsWith,
                        backupServiceWhereInput.backupNetworkSubnetMaskNotStartsWith)
                && Objects.equals(
                        this.backupNetworkSubnetMaskStartsWith,
                        backupServiceWhereInput.backupNetworkSubnetMaskStartsWith)
                && Objects.equals(this.backupNetworkType, backupServiceWhereInput.backupNetworkType)
                && Objects.equals(
                        this.backupNetworkTypeIn, backupServiceWhereInput.backupNetworkTypeIn)
                && Objects.equals(
                        this.backupNetworkTypeNot, backupServiceWhereInput.backupNetworkTypeNot)
                && Objects.equals(
                        this.backupNetworkTypeNotIn, backupServiceWhereInput.backupNetworkTypeNotIn)
                && Objects.equals(this.backupNetworkVlan, backupServiceWhereInput.backupNetworkVlan)
                && Objects.equals(
                        this.backupNetworkVlanContains,
                        backupServiceWhereInput.backupNetworkVlanContains)
                && Objects.equals(
                        this.backupNetworkVlanEndsWith,
                        backupServiceWhereInput.backupNetworkVlanEndsWith)
                && Objects.equals(
                        this.backupNetworkVlanGt, backupServiceWhereInput.backupNetworkVlanGt)
                && Objects.equals(
                        this.backupNetworkVlanGte, backupServiceWhereInput.backupNetworkVlanGte)
                && Objects.equals(
                        this.backupNetworkVlanIn, backupServiceWhereInput.backupNetworkVlanIn)
                && Objects.equals(
                        this.backupNetworkVlanLt, backupServiceWhereInput.backupNetworkVlanLt)
                && Objects.equals(
                        this.backupNetworkVlanLte, backupServiceWhereInput.backupNetworkVlanLte)
                && Objects.equals(
                        this.backupNetworkVlanNot, backupServiceWhereInput.backupNetworkVlanNot)
                && Objects.equals(
                        this.backupNetworkVlanNotContains,
                        backupServiceWhereInput.backupNetworkVlanNotContains)
                && Objects.equals(
                        this.backupNetworkVlanNotEndsWith,
                        backupServiceWhereInput.backupNetworkVlanNotEndsWith)
                && Objects.equals(
                        this.backupNetworkVlanNotIn, backupServiceWhereInput.backupNetworkVlanNotIn)
                && Objects.equals(
                        this.backupNetworkVlanNotStartsWith,
                        backupServiceWhereInput.backupNetworkVlanNotStartsWith)
                && Objects.equals(
                        this.backupNetworkVlanStartsWith,
                        backupServiceWhereInput.backupNetworkVlanStartsWith)
                && Objects.equals(this.backupPlansEvery, backupServiceWhereInput.backupPlansEvery)
                && Objects.equals(this.backupPlansNone, backupServiceWhereInput.backupPlansNone)
                && Objects.equals(this.backupPlansSome, backupServiceWhereInput.backupPlansSome)
                && Objects.equals(this.backupRdIopsMax, backupServiceWhereInput.backupRdIopsMax)
                && Objects.equals(this.backupRdIopsMaxGt, backupServiceWhereInput.backupRdIopsMaxGt)
                && Objects.equals(
                        this.backupRdIopsMaxGte, backupServiceWhereInput.backupRdIopsMaxGte)
                && Objects.equals(this.backupRdIopsMaxIn, backupServiceWhereInput.backupRdIopsMaxIn)
                && Objects.equals(this.backupRdIopsMaxLt, backupServiceWhereInput.backupRdIopsMaxLt)
                && Objects.equals(
                        this.backupRdIopsMaxLte, backupServiceWhereInput.backupRdIopsMaxLte)
                && Objects.equals(
                        this.backupRdIopsMaxNot, backupServiceWhereInput.backupRdIopsMaxNot)
                && Objects.equals(
                        this.backupRdIopsMaxNotIn, backupServiceWhereInput.backupRdIopsMaxNotIn)
                && Objects.equals(
                        this.backupStoreRepositoriesEvery,
                        backupServiceWhereInput.backupStoreRepositoriesEvery)
                && Objects.equals(
                        this.backupStoreRepositoriesNone,
                        backupServiceWhereInput.backupStoreRepositoriesNone)
                && Objects.equals(
                        this.backupStoreRepositoriesSome,
                        backupServiceWhereInput.backupStoreRepositoriesSome)
                && Objects.equals(this.backupWrIopsMax, backupServiceWhereInput.backupWrIopsMax)
                && Objects.equals(this.backupWrIopsMaxGt, backupServiceWhereInput.backupWrIopsMaxGt)
                && Objects.equals(
                        this.backupWrIopsMaxGte, backupServiceWhereInput.backupWrIopsMaxGte)
                && Objects.equals(this.backupWrIopsMaxIn, backupServiceWhereInput.backupWrIopsMaxIn)
                && Objects.equals(this.backupWrIopsMaxLt, backupServiceWhereInput.backupWrIopsMaxLt)
                && Objects.equals(
                        this.backupWrIopsMaxLte, backupServiceWhereInput.backupWrIopsMaxLte)
                && Objects.equals(
                        this.backupWrIopsMaxNot, backupServiceWhereInput.backupWrIopsMaxNot)
                && Objects.equals(
                        this.backupWrIopsMaxNotIn, backupServiceWhereInput.backupWrIopsMaxNotIn)
                && Objects.equals(this.description, backupServiceWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, backupServiceWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, backupServiceWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, backupServiceWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, backupServiceWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, backupServiceWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, backupServiceWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, backupServiceWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, backupServiceWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, backupServiceWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, backupServiceWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, backupServiceWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        backupServiceWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, backupServiceWhereInput.descriptionStartsWith)
                && Objects.equals(this.entityAsyncStatus, backupServiceWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, backupServiceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, backupServiceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, backupServiceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, backupServiceWhereInput.id)
                && Objects.equals(this.idContains, backupServiceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupServiceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupServiceWhereInput.idGt)
                && Objects.equals(this.idGte, backupServiceWhereInput.idGte)
                && Objects.equals(this.idIn, backupServiceWhereInput.idIn)
                && Objects.equals(this.idLt, backupServiceWhereInput.idLt)
                && Objects.equals(this.idLte, backupServiceWhereInput.idLte)
                && Objects.equals(this.idNot, backupServiceWhereInput.idNot)
                && Objects.equals(this.idNotContains, backupServiceWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, backupServiceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupServiceWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, backupServiceWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupServiceWhereInput.idStartsWith)
                && Objects.equals(this.kubeConfig, backupServiceWhereInput.kubeConfig)
                && Objects.equals(
                        this.kubeConfigContains, backupServiceWhereInput.kubeConfigContains)
                && Objects.equals(
                        this.kubeConfigEndsWith, backupServiceWhereInput.kubeConfigEndsWith)
                && Objects.equals(this.kubeConfigGt, backupServiceWhereInput.kubeConfigGt)
                && Objects.equals(this.kubeConfigGte, backupServiceWhereInput.kubeConfigGte)
                && Objects.equals(this.kubeConfigIn, backupServiceWhereInput.kubeConfigIn)
                && Objects.equals(this.kubeConfigLt, backupServiceWhereInput.kubeConfigLt)
                && Objects.equals(this.kubeConfigLte, backupServiceWhereInput.kubeConfigLte)
                && Objects.equals(this.kubeConfigNot, backupServiceWhereInput.kubeConfigNot)
                && Objects.equals(
                        this.kubeConfigNotContains, backupServiceWhereInput.kubeConfigNotContains)
                && Objects.equals(
                        this.kubeConfigNotEndsWith, backupServiceWhereInput.kubeConfigNotEndsWith)
                && Objects.equals(this.kubeConfigNotIn, backupServiceWhereInput.kubeConfigNotIn)
                && Objects.equals(
                        this.kubeConfigNotStartsWith,
                        backupServiceWhereInput.kubeConfigNotStartsWith)
                && Objects.equals(
                        this.kubeConfigStartsWith, backupServiceWhereInput.kubeConfigStartsWith)
                && Objects.equals(
                        this.managementNetworkGateway,
                        backupServiceWhereInput.managementNetworkGateway)
                && Objects.equals(
                        this.managementNetworkGatewayContains,
                        backupServiceWhereInput.managementNetworkGatewayContains)
                && Objects.equals(
                        this.managementNetworkGatewayEndsWith,
                        backupServiceWhereInput.managementNetworkGatewayEndsWith)
                && Objects.equals(
                        this.managementNetworkGatewayGt,
                        backupServiceWhereInput.managementNetworkGatewayGt)
                && Objects.equals(
                        this.managementNetworkGatewayGte,
                        backupServiceWhereInput.managementNetworkGatewayGte)
                && Objects.equals(
                        this.managementNetworkGatewayIn,
                        backupServiceWhereInput.managementNetworkGatewayIn)
                && Objects.equals(
                        this.managementNetworkGatewayLt,
                        backupServiceWhereInput.managementNetworkGatewayLt)
                && Objects.equals(
                        this.managementNetworkGatewayLte,
                        backupServiceWhereInput.managementNetworkGatewayLte)
                && Objects.equals(
                        this.managementNetworkGatewayNot,
                        backupServiceWhereInput.managementNetworkGatewayNot)
                && Objects.equals(
                        this.managementNetworkGatewayNotContains,
                        backupServiceWhereInput.managementNetworkGatewayNotContains)
                && Objects.equals(
                        this.managementNetworkGatewayNotEndsWith,
                        backupServiceWhereInput.managementNetworkGatewayNotEndsWith)
                && Objects.equals(
                        this.managementNetworkGatewayNotIn,
                        backupServiceWhereInput.managementNetworkGatewayNotIn)
                && Objects.equals(
                        this.managementNetworkGatewayNotStartsWith,
                        backupServiceWhereInput.managementNetworkGatewayNotStartsWith)
                && Objects.equals(
                        this.managementNetworkGatewayStartsWith,
                        backupServiceWhereInput.managementNetworkGatewayStartsWith)
                && Objects.equals(
                        this.managementNetworkIp, backupServiceWhereInput.managementNetworkIp)
                && Objects.equals(
                        this.managementNetworkIpContains,
                        backupServiceWhereInput.managementNetworkIpContains)
                && Objects.equals(
                        this.managementNetworkIpEndsWith,
                        backupServiceWhereInput.managementNetworkIpEndsWith)
                && Objects.equals(
                        this.managementNetworkIpGt, backupServiceWhereInput.managementNetworkIpGt)
                && Objects.equals(
                        this.managementNetworkIpGte, backupServiceWhereInput.managementNetworkIpGte)
                && Objects.equals(
                        this.managementNetworkIpIn, backupServiceWhereInput.managementNetworkIpIn)
                && Objects.equals(
                        this.managementNetworkIpLt, backupServiceWhereInput.managementNetworkIpLt)
                && Objects.equals(
                        this.managementNetworkIpLte, backupServiceWhereInput.managementNetworkIpLte)
                && Objects.equals(
                        this.managementNetworkIpNot, backupServiceWhereInput.managementNetworkIpNot)
                && Objects.equals(
                        this.managementNetworkIpNotContains,
                        backupServiceWhereInput.managementNetworkIpNotContains)
                && Objects.equals(
                        this.managementNetworkIpNotEndsWith,
                        backupServiceWhereInput.managementNetworkIpNotEndsWith)
                && Objects.equals(
                        this.managementNetworkIpNotIn,
                        backupServiceWhereInput.managementNetworkIpNotIn)
                && Objects.equals(
                        this.managementNetworkIpNotStartsWith,
                        backupServiceWhereInput.managementNetworkIpNotStartsWith)
                && Objects.equals(
                        this.managementNetworkIpStartsWith,
                        backupServiceWhereInput.managementNetworkIpStartsWith)
                && Objects.equals(
                        this.managementNetworkSubnetMask,
                        backupServiceWhereInput.managementNetworkSubnetMask)
                && Objects.equals(
                        this.managementNetworkSubnetMaskContains,
                        backupServiceWhereInput.managementNetworkSubnetMaskContains)
                && Objects.equals(
                        this.managementNetworkSubnetMaskEndsWith,
                        backupServiceWhereInput.managementNetworkSubnetMaskEndsWith)
                && Objects.equals(
                        this.managementNetworkSubnetMaskGt,
                        backupServiceWhereInput.managementNetworkSubnetMaskGt)
                && Objects.equals(
                        this.managementNetworkSubnetMaskGte,
                        backupServiceWhereInput.managementNetworkSubnetMaskGte)
                && Objects.equals(
                        this.managementNetworkSubnetMaskIn,
                        backupServiceWhereInput.managementNetworkSubnetMaskIn)
                && Objects.equals(
                        this.managementNetworkSubnetMaskLt,
                        backupServiceWhereInput.managementNetworkSubnetMaskLt)
                && Objects.equals(
                        this.managementNetworkSubnetMaskLte,
                        backupServiceWhereInput.managementNetworkSubnetMaskLte)
                && Objects.equals(
                        this.managementNetworkSubnetMaskNot,
                        backupServiceWhereInput.managementNetworkSubnetMaskNot)
                && Objects.equals(
                        this.managementNetworkSubnetMaskNotContains,
                        backupServiceWhereInput.managementNetworkSubnetMaskNotContains)
                && Objects.equals(
                        this.managementNetworkSubnetMaskNotEndsWith,
                        backupServiceWhereInput.managementNetworkSubnetMaskNotEndsWith)
                && Objects.equals(
                        this.managementNetworkSubnetMaskNotIn,
                        backupServiceWhereInput.managementNetworkSubnetMaskNotIn)
                && Objects.equals(
                        this.managementNetworkSubnetMaskNotStartsWith,
                        backupServiceWhereInput.managementNetworkSubnetMaskNotStartsWith)
                && Objects.equals(
                        this.managementNetworkSubnetMaskStartsWith,
                        backupServiceWhereInput.managementNetworkSubnetMaskStartsWith)
                && Objects.equals(
                        this.managementNetworkVlan, backupServiceWhereInput.managementNetworkVlan)
                && Objects.equals(
                        this.managementNetworkVlanContains,
                        backupServiceWhereInput.managementNetworkVlanContains)
                && Objects.equals(
                        this.managementNetworkVlanEndsWith,
                        backupServiceWhereInput.managementNetworkVlanEndsWith)
                && Objects.equals(
                        this.managementNetworkVlanGt,
                        backupServiceWhereInput.managementNetworkVlanGt)
                && Objects.equals(
                        this.managementNetworkVlanGte,
                        backupServiceWhereInput.managementNetworkVlanGte)
                && Objects.equals(
                        this.managementNetworkVlanIn,
                        backupServiceWhereInput.managementNetworkVlanIn)
                && Objects.equals(
                        this.managementNetworkVlanLt,
                        backupServiceWhereInput.managementNetworkVlanLt)
                && Objects.equals(
                        this.managementNetworkVlanLte,
                        backupServiceWhereInput.managementNetworkVlanLte)
                && Objects.equals(
                        this.managementNetworkVlanNot,
                        backupServiceWhereInput.managementNetworkVlanNot)
                && Objects.equals(
                        this.managementNetworkVlanNotContains,
                        backupServiceWhereInput.managementNetworkVlanNotContains)
                && Objects.equals(
                        this.managementNetworkVlanNotEndsWith,
                        backupServiceWhereInput.managementNetworkVlanNotEndsWith)
                && Objects.equals(
                        this.managementNetworkVlanNotIn,
                        backupServiceWhereInput.managementNetworkVlanNotIn)
                && Objects.equals(
                        this.managementNetworkVlanNotStartsWith,
                        backupServiceWhereInput.managementNetworkVlanNotStartsWith)
                && Objects.equals(
                        this.managementNetworkVlanStartsWith,
                        backupServiceWhereInput.managementNetworkVlanStartsWith)
                && Objects.equals(this.maxJobRetryTimes, backupServiceWhereInput.maxJobRetryTimes)
                && Objects.equals(
                        this.maxJobRetryTimesGt, backupServiceWhereInput.maxJobRetryTimesGt)
                && Objects.equals(
                        this.maxJobRetryTimesGte, backupServiceWhereInput.maxJobRetryTimesGte)
                && Objects.equals(
                        this.maxJobRetryTimesIn, backupServiceWhereInput.maxJobRetryTimesIn)
                && Objects.equals(
                        this.maxJobRetryTimesLt, backupServiceWhereInput.maxJobRetryTimesLt)
                && Objects.equals(
                        this.maxJobRetryTimesLte, backupServiceWhereInput.maxJobRetryTimesLte)
                && Objects.equals(
                        this.maxJobRetryTimesNot, backupServiceWhereInput.maxJobRetryTimesNot)
                && Objects.equals(
                        this.maxJobRetryTimesNotIn, backupServiceWhereInput.maxJobRetryTimesNotIn)
                && Objects.equals(
                        this.maxParallelBackupJobs, backupServiceWhereInput.maxParallelBackupJobs)
                && Objects.equals(
                        this.maxParallelBackupJobsGt,
                        backupServiceWhereInput.maxParallelBackupJobsGt)
                && Objects.equals(
                        this.maxParallelBackupJobsGte,
                        backupServiceWhereInput.maxParallelBackupJobsGte)
                && Objects.equals(
                        this.maxParallelBackupJobsIn,
                        backupServiceWhereInput.maxParallelBackupJobsIn)
                && Objects.equals(
                        this.maxParallelBackupJobsLt,
                        backupServiceWhereInput.maxParallelBackupJobsLt)
                && Objects.equals(
                        this.maxParallelBackupJobsLte,
                        backupServiceWhereInput.maxParallelBackupJobsLte)
                && Objects.equals(
                        this.maxParallelBackupJobsNot,
                        backupServiceWhereInput.maxParallelBackupJobsNot)
                && Objects.equals(
                        this.maxParallelBackupJobsNotIn,
                        backupServiceWhereInput.maxParallelBackupJobsNotIn)
                && Objects.equals(
                        this.maxParallelRestoreJobs, backupServiceWhereInput.maxParallelRestoreJobs)
                && Objects.equals(
                        this.maxParallelRestoreJobsGt,
                        backupServiceWhereInput.maxParallelRestoreJobsGt)
                && Objects.equals(
                        this.maxParallelRestoreJobsGte,
                        backupServiceWhereInput.maxParallelRestoreJobsGte)
                && Objects.equals(
                        this.maxParallelRestoreJobsIn,
                        backupServiceWhereInput.maxParallelRestoreJobsIn)
                && Objects.equals(
                        this.maxParallelRestoreJobsLt,
                        backupServiceWhereInput.maxParallelRestoreJobsLt)
                && Objects.equals(
                        this.maxParallelRestoreJobsLte,
                        backupServiceWhereInput.maxParallelRestoreJobsLte)
                && Objects.equals(
                        this.maxParallelRestoreJobsNot,
                        backupServiceWhereInput.maxParallelRestoreJobsNot)
                && Objects.equals(
                        this.maxParallelRestoreJobsNotIn,
                        backupServiceWhereInput.maxParallelRestoreJobsNotIn)
                && Objects.equals(this.name, backupServiceWhereInput.name)
                && Objects.equals(this.nameContains, backupServiceWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, backupServiceWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, backupServiceWhereInput.nameGt)
                && Objects.equals(this.nameGte, backupServiceWhereInput.nameGte)
                && Objects.equals(this.nameIn, backupServiceWhereInput.nameIn)
                && Objects.equals(this.nameLt, backupServiceWhereInput.nameLt)
                && Objects.equals(this.nameLte, backupServiceWhereInput.nameLte)
                && Objects.equals(this.nameNot, backupServiceWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, backupServiceWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, backupServiceWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, backupServiceWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, backupServiceWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, backupServiceWhereInput.nameStartsWith)
                && Objects.equals(this.restoreRdIopsMax, backupServiceWhereInput.restoreRdIopsMax)
                && Objects.equals(
                        this.restoreRdIopsMaxGt, backupServiceWhereInput.restoreRdIopsMaxGt)
                && Objects.equals(
                        this.restoreRdIopsMaxGte, backupServiceWhereInput.restoreRdIopsMaxGte)
                && Objects.equals(
                        this.restoreRdIopsMaxIn, backupServiceWhereInput.restoreRdIopsMaxIn)
                && Objects.equals(
                        this.restoreRdIopsMaxLt, backupServiceWhereInput.restoreRdIopsMaxLt)
                && Objects.equals(
                        this.restoreRdIopsMaxLte, backupServiceWhereInput.restoreRdIopsMaxLte)
                && Objects.equals(
                        this.restoreRdIopsMaxNot, backupServiceWhereInput.restoreRdIopsMaxNot)
                && Objects.equals(
                        this.restoreRdIopsMaxNotIn, backupServiceWhereInput.restoreRdIopsMaxNotIn)
                && Objects.equals(this.restoreWrIopsMax, backupServiceWhereInput.restoreWrIopsMax)
                && Objects.equals(
                        this.restoreWrIopsMaxGt, backupServiceWhereInput.restoreWrIopsMaxGt)
                && Objects.equals(
                        this.restoreWrIopsMaxGte, backupServiceWhereInput.restoreWrIopsMaxGte)
                && Objects.equals(
                        this.restoreWrIopsMaxIn, backupServiceWhereInput.restoreWrIopsMaxIn)
                && Objects.equals(
                        this.restoreWrIopsMaxLt, backupServiceWhereInput.restoreWrIopsMaxLt)
                && Objects.equals(
                        this.restoreWrIopsMaxLte, backupServiceWhereInput.restoreWrIopsMaxLte)
                && Objects.equals(
                        this.restoreWrIopsMaxNot, backupServiceWhereInput.restoreWrIopsMaxNot)
                && Objects.equals(
                        this.restoreWrIopsMaxNotIn, backupServiceWhereInput.restoreWrIopsMaxNotIn)
                && Objects.equals(this.retryInterval, backupServiceWhereInput.retryInterval)
                && Objects.equals(this.retryIntervalGt, backupServiceWhereInput.retryIntervalGt)
                && Objects.equals(this.retryIntervalGte, backupServiceWhereInput.retryIntervalGte)
                && Objects.equals(this.retryIntervalIn, backupServiceWhereInput.retryIntervalIn)
                && Objects.equals(this.retryIntervalLt, backupServiceWhereInput.retryIntervalLt)
                && Objects.equals(this.retryIntervalLte, backupServiceWhereInput.retryIntervalLte)
                && Objects.equals(this.retryIntervalNot, backupServiceWhereInput.retryIntervalNot)
                && Objects.equals(
                        this.retryIntervalNotIn, backupServiceWhereInput.retryIntervalNotIn)
                && Objects.equals(this.runningVm, backupServiceWhereInput.runningVm)
                && Objects.equals(this.status, backupServiceWhereInput.status)
                && Objects.equals(this.statusIn, backupServiceWhereInput.statusIn)
                && Objects.equals(this.statusNot, backupServiceWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, backupServiceWhereInput.statusNotIn)
                && Objects.equals(
                        this.storageNetworkGateway, backupServiceWhereInput.storageNetworkGateway)
                && Objects.equals(
                        this.storageNetworkGatewayContains,
                        backupServiceWhereInput.storageNetworkGatewayContains)
                && Objects.equals(
                        this.storageNetworkGatewayEndsWith,
                        backupServiceWhereInput.storageNetworkGatewayEndsWith)
                && Objects.equals(
                        this.storageNetworkGatewayGt,
                        backupServiceWhereInput.storageNetworkGatewayGt)
                && Objects.equals(
                        this.storageNetworkGatewayGte,
                        backupServiceWhereInput.storageNetworkGatewayGte)
                && Objects.equals(
                        this.storageNetworkGatewayIn,
                        backupServiceWhereInput.storageNetworkGatewayIn)
                && Objects.equals(
                        this.storageNetworkGatewayLt,
                        backupServiceWhereInput.storageNetworkGatewayLt)
                && Objects.equals(
                        this.storageNetworkGatewayLte,
                        backupServiceWhereInput.storageNetworkGatewayLte)
                && Objects.equals(
                        this.storageNetworkGatewayNot,
                        backupServiceWhereInput.storageNetworkGatewayNot)
                && Objects.equals(
                        this.storageNetworkGatewayNotContains,
                        backupServiceWhereInput.storageNetworkGatewayNotContains)
                && Objects.equals(
                        this.storageNetworkGatewayNotEndsWith,
                        backupServiceWhereInput.storageNetworkGatewayNotEndsWith)
                && Objects.equals(
                        this.storageNetworkGatewayNotIn,
                        backupServiceWhereInput.storageNetworkGatewayNotIn)
                && Objects.equals(
                        this.storageNetworkGatewayNotStartsWith,
                        backupServiceWhereInput.storageNetworkGatewayNotStartsWith)
                && Objects.equals(
                        this.storageNetworkGatewayStartsWith,
                        backupServiceWhereInput.storageNetworkGatewayStartsWith)
                && Objects.equals(this.storageNetworkIp, backupServiceWhereInput.storageNetworkIp)
                && Objects.equals(
                        this.storageNetworkIpContains,
                        backupServiceWhereInput.storageNetworkIpContains)
                && Objects.equals(
                        this.storageNetworkIpEndsWith,
                        backupServiceWhereInput.storageNetworkIpEndsWith)
                && Objects.equals(
                        this.storageNetworkIpGt, backupServiceWhereInput.storageNetworkIpGt)
                && Objects.equals(
                        this.storageNetworkIpGte, backupServiceWhereInput.storageNetworkIpGte)
                && Objects.equals(
                        this.storageNetworkIpIn, backupServiceWhereInput.storageNetworkIpIn)
                && Objects.equals(
                        this.storageNetworkIpLt, backupServiceWhereInput.storageNetworkIpLt)
                && Objects.equals(
                        this.storageNetworkIpLte, backupServiceWhereInput.storageNetworkIpLte)
                && Objects.equals(
                        this.storageNetworkIpNot, backupServiceWhereInput.storageNetworkIpNot)
                && Objects.equals(
                        this.storageNetworkIpNotContains,
                        backupServiceWhereInput.storageNetworkIpNotContains)
                && Objects.equals(
                        this.storageNetworkIpNotEndsWith,
                        backupServiceWhereInput.storageNetworkIpNotEndsWith)
                && Objects.equals(
                        this.storageNetworkIpNotIn, backupServiceWhereInput.storageNetworkIpNotIn)
                && Objects.equals(
                        this.storageNetworkIpNotStartsWith,
                        backupServiceWhereInput.storageNetworkIpNotStartsWith)
                && Objects.equals(
                        this.storageNetworkIpStartsWith,
                        backupServiceWhereInput.storageNetworkIpStartsWith)
                && Objects.equals(
                        this.storageNetworkSubnetMask,
                        backupServiceWhereInput.storageNetworkSubnetMask)
                && Objects.equals(
                        this.storageNetworkSubnetMaskContains,
                        backupServiceWhereInput.storageNetworkSubnetMaskContains)
                && Objects.equals(
                        this.storageNetworkSubnetMaskEndsWith,
                        backupServiceWhereInput.storageNetworkSubnetMaskEndsWith)
                && Objects.equals(
                        this.storageNetworkSubnetMaskGt,
                        backupServiceWhereInput.storageNetworkSubnetMaskGt)
                && Objects.equals(
                        this.storageNetworkSubnetMaskGte,
                        backupServiceWhereInput.storageNetworkSubnetMaskGte)
                && Objects.equals(
                        this.storageNetworkSubnetMaskIn,
                        backupServiceWhereInput.storageNetworkSubnetMaskIn)
                && Objects.equals(
                        this.storageNetworkSubnetMaskLt,
                        backupServiceWhereInput.storageNetworkSubnetMaskLt)
                && Objects.equals(
                        this.storageNetworkSubnetMaskLte,
                        backupServiceWhereInput.storageNetworkSubnetMaskLte)
                && Objects.equals(
                        this.storageNetworkSubnetMaskNot,
                        backupServiceWhereInput.storageNetworkSubnetMaskNot)
                && Objects.equals(
                        this.storageNetworkSubnetMaskNotContains,
                        backupServiceWhereInput.storageNetworkSubnetMaskNotContains)
                && Objects.equals(
                        this.storageNetworkSubnetMaskNotEndsWith,
                        backupServiceWhereInput.storageNetworkSubnetMaskNotEndsWith)
                && Objects.equals(
                        this.storageNetworkSubnetMaskNotIn,
                        backupServiceWhereInput.storageNetworkSubnetMaskNotIn)
                && Objects.equals(
                        this.storageNetworkSubnetMaskNotStartsWith,
                        backupServiceWhereInput.storageNetworkSubnetMaskNotStartsWith)
                && Objects.equals(
                        this.storageNetworkSubnetMaskStartsWith,
                        backupServiceWhereInput.storageNetworkSubnetMaskStartsWith)
                && Objects.equals(
                        this.storageNetworkType, backupServiceWhereInput.storageNetworkType)
                && Objects.equals(
                        this.storageNetworkTypeIn, backupServiceWhereInput.storageNetworkTypeIn)
                && Objects.equals(
                        this.storageNetworkTypeNot, backupServiceWhereInput.storageNetworkTypeNot)
                && Objects.equals(
                        this.storageNetworkTypeNotIn,
                        backupServiceWhereInput.storageNetworkTypeNotIn)
                && Objects.equals(
                        this.storageNetworkVlan, backupServiceWhereInput.storageNetworkVlan)
                && Objects.equals(
                        this.storageNetworkVlanContains,
                        backupServiceWhereInput.storageNetworkVlanContains)
                && Objects.equals(
                        this.storageNetworkVlanEndsWith,
                        backupServiceWhereInput.storageNetworkVlanEndsWith)
                && Objects.equals(
                        this.storageNetworkVlanGt, backupServiceWhereInput.storageNetworkVlanGt)
                && Objects.equals(
                        this.storageNetworkVlanGte, backupServiceWhereInput.storageNetworkVlanGte)
                && Objects.equals(
                        this.storageNetworkVlanIn, backupServiceWhereInput.storageNetworkVlanIn)
                && Objects.equals(
                        this.storageNetworkVlanLt, backupServiceWhereInput.storageNetworkVlanLt)
                && Objects.equals(
                        this.storageNetworkVlanLte, backupServiceWhereInput.storageNetworkVlanLte)
                && Objects.equals(
                        this.storageNetworkVlanNot, backupServiceWhereInput.storageNetworkVlanNot)
                && Objects.equals(
                        this.storageNetworkVlanNotContains,
                        backupServiceWhereInput.storageNetworkVlanNotContains)
                && Objects.equals(
                        this.storageNetworkVlanNotEndsWith,
                        backupServiceWhereInput.storageNetworkVlanNotEndsWith)
                && Objects.equals(
                        this.storageNetworkVlanNotIn,
                        backupServiceWhereInput.storageNetworkVlanNotIn)
                && Objects.equals(
                        this.storageNetworkVlanNotStartsWith,
                        backupServiceWhereInput.storageNetworkVlanNotStartsWith)
                && Objects.equals(
                        this.storageNetworkVlanStartsWith,
                        backupServiceWhereInput.storageNetworkVlanStartsWith);
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
                backupClustersEvery,
                backupClustersNone,
                backupClustersSome,
                backupNetworkGateway,
                backupNetworkGatewayContains,
                backupNetworkGatewayEndsWith,
                backupNetworkGatewayGt,
                backupNetworkGatewayGte,
                backupNetworkGatewayIn,
                backupNetworkGatewayLt,
                backupNetworkGatewayLte,
                backupNetworkGatewayNot,
                backupNetworkGatewayNotContains,
                backupNetworkGatewayNotEndsWith,
                backupNetworkGatewayNotIn,
                backupNetworkGatewayNotStartsWith,
                backupNetworkGatewayStartsWith,
                backupNetworkIp,
                backupNetworkIpContains,
                backupNetworkIpEndsWith,
                backupNetworkIpGt,
                backupNetworkIpGte,
                backupNetworkIpIn,
                backupNetworkIpLt,
                backupNetworkIpLte,
                backupNetworkIpNot,
                backupNetworkIpNotContains,
                backupNetworkIpNotEndsWith,
                backupNetworkIpNotIn,
                backupNetworkIpNotStartsWith,
                backupNetworkIpStartsWith,
                backupNetworkSubnetMask,
                backupNetworkSubnetMaskContains,
                backupNetworkSubnetMaskEndsWith,
                backupNetworkSubnetMaskGt,
                backupNetworkSubnetMaskGte,
                backupNetworkSubnetMaskIn,
                backupNetworkSubnetMaskLt,
                backupNetworkSubnetMaskLte,
                backupNetworkSubnetMaskNot,
                backupNetworkSubnetMaskNotContains,
                backupNetworkSubnetMaskNotEndsWith,
                backupNetworkSubnetMaskNotIn,
                backupNetworkSubnetMaskNotStartsWith,
                backupNetworkSubnetMaskStartsWith,
                backupNetworkType,
                backupNetworkTypeIn,
                backupNetworkTypeNot,
                backupNetworkTypeNotIn,
                backupNetworkVlan,
                backupNetworkVlanContains,
                backupNetworkVlanEndsWith,
                backupNetworkVlanGt,
                backupNetworkVlanGte,
                backupNetworkVlanIn,
                backupNetworkVlanLt,
                backupNetworkVlanLte,
                backupNetworkVlanNot,
                backupNetworkVlanNotContains,
                backupNetworkVlanNotEndsWith,
                backupNetworkVlanNotIn,
                backupNetworkVlanNotStartsWith,
                backupNetworkVlanStartsWith,
                backupPlansEvery,
                backupPlansNone,
                backupPlansSome,
                backupRdIopsMax,
                backupRdIopsMaxGt,
                backupRdIopsMaxGte,
                backupRdIopsMaxIn,
                backupRdIopsMaxLt,
                backupRdIopsMaxLte,
                backupRdIopsMaxNot,
                backupRdIopsMaxNotIn,
                backupStoreRepositoriesEvery,
                backupStoreRepositoriesNone,
                backupStoreRepositoriesSome,
                backupWrIopsMax,
                backupWrIopsMaxGt,
                backupWrIopsMaxGte,
                backupWrIopsMaxIn,
                backupWrIopsMaxLt,
                backupWrIopsMaxLte,
                backupWrIopsMaxNot,
                backupWrIopsMaxNotIn,
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
                kubeConfig,
                kubeConfigContains,
                kubeConfigEndsWith,
                kubeConfigGt,
                kubeConfigGte,
                kubeConfigIn,
                kubeConfigLt,
                kubeConfigLte,
                kubeConfigNot,
                kubeConfigNotContains,
                kubeConfigNotEndsWith,
                kubeConfigNotIn,
                kubeConfigNotStartsWith,
                kubeConfigStartsWith,
                managementNetworkGateway,
                managementNetworkGatewayContains,
                managementNetworkGatewayEndsWith,
                managementNetworkGatewayGt,
                managementNetworkGatewayGte,
                managementNetworkGatewayIn,
                managementNetworkGatewayLt,
                managementNetworkGatewayLte,
                managementNetworkGatewayNot,
                managementNetworkGatewayNotContains,
                managementNetworkGatewayNotEndsWith,
                managementNetworkGatewayNotIn,
                managementNetworkGatewayNotStartsWith,
                managementNetworkGatewayStartsWith,
                managementNetworkIp,
                managementNetworkIpContains,
                managementNetworkIpEndsWith,
                managementNetworkIpGt,
                managementNetworkIpGte,
                managementNetworkIpIn,
                managementNetworkIpLt,
                managementNetworkIpLte,
                managementNetworkIpNot,
                managementNetworkIpNotContains,
                managementNetworkIpNotEndsWith,
                managementNetworkIpNotIn,
                managementNetworkIpNotStartsWith,
                managementNetworkIpStartsWith,
                managementNetworkSubnetMask,
                managementNetworkSubnetMaskContains,
                managementNetworkSubnetMaskEndsWith,
                managementNetworkSubnetMaskGt,
                managementNetworkSubnetMaskGte,
                managementNetworkSubnetMaskIn,
                managementNetworkSubnetMaskLt,
                managementNetworkSubnetMaskLte,
                managementNetworkSubnetMaskNot,
                managementNetworkSubnetMaskNotContains,
                managementNetworkSubnetMaskNotEndsWith,
                managementNetworkSubnetMaskNotIn,
                managementNetworkSubnetMaskNotStartsWith,
                managementNetworkSubnetMaskStartsWith,
                managementNetworkVlan,
                managementNetworkVlanContains,
                managementNetworkVlanEndsWith,
                managementNetworkVlanGt,
                managementNetworkVlanGte,
                managementNetworkVlanIn,
                managementNetworkVlanLt,
                managementNetworkVlanLte,
                managementNetworkVlanNot,
                managementNetworkVlanNotContains,
                managementNetworkVlanNotEndsWith,
                managementNetworkVlanNotIn,
                managementNetworkVlanNotStartsWith,
                managementNetworkVlanStartsWith,
                maxJobRetryTimes,
                maxJobRetryTimesGt,
                maxJobRetryTimesGte,
                maxJobRetryTimesIn,
                maxJobRetryTimesLt,
                maxJobRetryTimesLte,
                maxJobRetryTimesNot,
                maxJobRetryTimesNotIn,
                maxParallelBackupJobs,
                maxParallelBackupJobsGt,
                maxParallelBackupJobsGte,
                maxParallelBackupJobsIn,
                maxParallelBackupJobsLt,
                maxParallelBackupJobsLte,
                maxParallelBackupJobsNot,
                maxParallelBackupJobsNotIn,
                maxParallelRestoreJobs,
                maxParallelRestoreJobsGt,
                maxParallelRestoreJobsGte,
                maxParallelRestoreJobsIn,
                maxParallelRestoreJobsLt,
                maxParallelRestoreJobsLte,
                maxParallelRestoreJobsNot,
                maxParallelRestoreJobsNotIn,
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
                restoreRdIopsMax,
                restoreRdIopsMaxGt,
                restoreRdIopsMaxGte,
                restoreRdIopsMaxIn,
                restoreRdIopsMaxLt,
                restoreRdIopsMaxLte,
                restoreRdIopsMaxNot,
                restoreRdIopsMaxNotIn,
                restoreWrIopsMax,
                restoreWrIopsMaxGt,
                restoreWrIopsMaxGte,
                restoreWrIopsMaxIn,
                restoreWrIopsMaxLt,
                restoreWrIopsMaxLte,
                restoreWrIopsMaxNot,
                restoreWrIopsMaxNotIn,
                retryInterval,
                retryIntervalGt,
                retryIntervalGte,
                retryIntervalIn,
                retryIntervalLt,
                retryIntervalLte,
                retryIntervalNot,
                retryIntervalNotIn,
                runningVm,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                storageNetworkGateway,
                storageNetworkGatewayContains,
                storageNetworkGatewayEndsWith,
                storageNetworkGatewayGt,
                storageNetworkGatewayGte,
                storageNetworkGatewayIn,
                storageNetworkGatewayLt,
                storageNetworkGatewayLte,
                storageNetworkGatewayNot,
                storageNetworkGatewayNotContains,
                storageNetworkGatewayNotEndsWith,
                storageNetworkGatewayNotIn,
                storageNetworkGatewayNotStartsWith,
                storageNetworkGatewayStartsWith,
                storageNetworkIp,
                storageNetworkIpContains,
                storageNetworkIpEndsWith,
                storageNetworkIpGt,
                storageNetworkIpGte,
                storageNetworkIpIn,
                storageNetworkIpLt,
                storageNetworkIpLte,
                storageNetworkIpNot,
                storageNetworkIpNotContains,
                storageNetworkIpNotEndsWith,
                storageNetworkIpNotIn,
                storageNetworkIpNotStartsWith,
                storageNetworkIpStartsWith,
                storageNetworkSubnetMask,
                storageNetworkSubnetMaskContains,
                storageNetworkSubnetMaskEndsWith,
                storageNetworkSubnetMaskGt,
                storageNetworkSubnetMaskGte,
                storageNetworkSubnetMaskIn,
                storageNetworkSubnetMaskLt,
                storageNetworkSubnetMaskLte,
                storageNetworkSubnetMaskNot,
                storageNetworkSubnetMaskNotContains,
                storageNetworkSubnetMaskNotEndsWith,
                storageNetworkSubnetMaskNotIn,
                storageNetworkSubnetMaskNotStartsWith,
                storageNetworkSubnetMaskStartsWith,
                storageNetworkType,
                storageNetworkTypeIn,
                storageNetworkTypeNot,
                storageNetworkTypeNotIn,
                storageNetworkVlan,
                storageNetworkVlanContains,
                storageNetworkVlanEndsWith,
                storageNetworkVlanGt,
                storageNetworkVlanGte,
                storageNetworkVlanIn,
                storageNetworkVlanLt,
                storageNetworkVlanLte,
                storageNetworkVlanNot,
                storageNetworkVlanNotContains,
                storageNetworkVlanNotEndsWith,
                storageNetworkVlanNotIn,
                storageNetworkVlanNotStartsWith,
                storageNetworkVlanStartsWith);
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
        sb.append("class BackupServiceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupClustersEvery: ")
                .append(toIndentedString(backupClustersEvery))
                .append("\n");
        sb.append("    backupClustersNone: ")
                .append(toIndentedString(backupClustersNone))
                .append("\n");
        sb.append("    backupClustersSome: ")
                .append(toIndentedString(backupClustersSome))
                .append("\n");
        sb.append("    backupNetworkGateway: ")
                .append(toIndentedString(backupNetworkGateway))
                .append("\n");
        sb.append("    backupNetworkGatewayContains: ")
                .append(toIndentedString(backupNetworkGatewayContains))
                .append("\n");
        sb.append("    backupNetworkGatewayEndsWith: ")
                .append(toIndentedString(backupNetworkGatewayEndsWith))
                .append("\n");
        sb.append("    backupNetworkGatewayGt: ")
                .append(toIndentedString(backupNetworkGatewayGt))
                .append("\n");
        sb.append("    backupNetworkGatewayGte: ")
                .append(toIndentedString(backupNetworkGatewayGte))
                .append("\n");
        sb.append("    backupNetworkGatewayIn: ")
                .append(toIndentedString(backupNetworkGatewayIn))
                .append("\n");
        sb.append("    backupNetworkGatewayLt: ")
                .append(toIndentedString(backupNetworkGatewayLt))
                .append("\n");
        sb.append("    backupNetworkGatewayLte: ")
                .append(toIndentedString(backupNetworkGatewayLte))
                .append("\n");
        sb.append("    backupNetworkGatewayNot: ")
                .append(toIndentedString(backupNetworkGatewayNot))
                .append("\n");
        sb.append("    backupNetworkGatewayNotContains: ")
                .append(toIndentedString(backupNetworkGatewayNotContains))
                .append("\n");
        sb.append("    backupNetworkGatewayNotEndsWith: ")
                .append(toIndentedString(backupNetworkGatewayNotEndsWith))
                .append("\n");
        sb.append("    backupNetworkGatewayNotIn: ")
                .append(toIndentedString(backupNetworkGatewayNotIn))
                .append("\n");
        sb.append("    backupNetworkGatewayNotStartsWith: ")
                .append(toIndentedString(backupNetworkGatewayNotStartsWith))
                .append("\n");
        sb.append("    backupNetworkGatewayStartsWith: ")
                .append(toIndentedString(backupNetworkGatewayStartsWith))
                .append("\n");
        sb.append("    backupNetworkIp: ").append(toIndentedString(backupNetworkIp)).append("\n");
        sb.append("    backupNetworkIpContains: ")
                .append(toIndentedString(backupNetworkIpContains))
                .append("\n");
        sb.append("    backupNetworkIpEndsWith: ")
                .append(toIndentedString(backupNetworkIpEndsWith))
                .append("\n");
        sb.append("    backupNetworkIpGt: ")
                .append(toIndentedString(backupNetworkIpGt))
                .append("\n");
        sb.append("    backupNetworkIpGte: ")
                .append(toIndentedString(backupNetworkIpGte))
                .append("\n");
        sb.append("    backupNetworkIpIn: ")
                .append(toIndentedString(backupNetworkIpIn))
                .append("\n");
        sb.append("    backupNetworkIpLt: ")
                .append(toIndentedString(backupNetworkIpLt))
                .append("\n");
        sb.append("    backupNetworkIpLte: ")
                .append(toIndentedString(backupNetworkIpLte))
                .append("\n");
        sb.append("    backupNetworkIpNot: ")
                .append(toIndentedString(backupNetworkIpNot))
                .append("\n");
        sb.append("    backupNetworkIpNotContains: ")
                .append(toIndentedString(backupNetworkIpNotContains))
                .append("\n");
        sb.append("    backupNetworkIpNotEndsWith: ")
                .append(toIndentedString(backupNetworkIpNotEndsWith))
                .append("\n");
        sb.append("    backupNetworkIpNotIn: ")
                .append(toIndentedString(backupNetworkIpNotIn))
                .append("\n");
        sb.append("    backupNetworkIpNotStartsWith: ")
                .append(toIndentedString(backupNetworkIpNotStartsWith))
                .append("\n");
        sb.append("    backupNetworkIpStartsWith: ")
                .append(toIndentedString(backupNetworkIpStartsWith))
                .append("\n");
        sb.append("    backupNetworkSubnetMask: ")
                .append(toIndentedString(backupNetworkSubnetMask))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskContains: ")
                .append(toIndentedString(backupNetworkSubnetMaskContains))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskEndsWith: ")
                .append(toIndentedString(backupNetworkSubnetMaskEndsWith))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskGt: ")
                .append(toIndentedString(backupNetworkSubnetMaskGt))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskGte: ")
                .append(toIndentedString(backupNetworkSubnetMaskGte))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskIn: ")
                .append(toIndentedString(backupNetworkSubnetMaskIn))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskLt: ")
                .append(toIndentedString(backupNetworkSubnetMaskLt))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskLte: ")
                .append(toIndentedString(backupNetworkSubnetMaskLte))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskNot: ")
                .append(toIndentedString(backupNetworkSubnetMaskNot))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskNotContains: ")
                .append(toIndentedString(backupNetworkSubnetMaskNotContains))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskNotEndsWith: ")
                .append(toIndentedString(backupNetworkSubnetMaskNotEndsWith))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskNotIn: ")
                .append(toIndentedString(backupNetworkSubnetMaskNotIn))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskNotStartsWith: ")
                .append(toIndentedString(backupNetworkSubnetMaskNotStartsWith))
                .append("\n");
        sb.append("    backupNetworkSubnetMaskStartsWith: ")
                .append(toIndentedString(backupNetworkSubnetMaskStartsWith))
                .append("\n");
        sb.append("    backupNetworkType: ")
                .append(toIndentedString(backupNetworkType))
                .append("\n");
        sb.append("    backupNetworkTypeIn: ")
                .append(toIndentedString(backupNetworkTypeIn))
                .append("\n");
        sb.append("    backupNetworkTypeNot: ")
                .append(toIndentedString(backupNetworkTypeNot))
                .append("\n");
        sb.append("    backupNetworkTypeNotIn: ")
                .append(toIndentedString(backupNetworkTypeNotIn))
                .append("\n");
        sb.append("    backupNetworkVlan: ")
                .append(toIndentedString(backupNetworkVlan))
                .append("\n");
        sb.append("    backupNetworkVlanContains: ")
                .append(toIndentedString(backupNetworkVlanContains))
                .append("\n");
        sb.append("    backupNetworkVlanEndsWith: ")
                .append(toIndentedString(backupNetworkVlanEndsWith))
                .append("\n");
        sb.append("    backupNetworkVlanGt: ")
                .append(toIndentedString(backupNetworkVlanGt))
                .append("\n");
        sb.append("    backupNetworkVlanGte: ")
                .append(toIndentedString(backupNetworkVlanGte))
                .append("\n");
        sb.append("    backupNetworkVlanIn: ")
                .append(toIndentedString(backupNetworkVlanIn))
                .append("\n");
        sb.append("    backupNetworkVlanLt: ")
                .append(toIndentedString(backupNetworkVlanLt))
                .append("\n");
        sb.append("    backupNetworkVlanLte: ")
                .append(toIndentedString(backupNetworkVlanLte))
                .append("\n");
        sb.append("    backupNetworkVlanNot: ")
                .append(toIndentedString(backupNetworkVlanNot))
                .append("\n");
        sb.append("    backupNetworkVlanNotContains: ")
                .append(toIndentedString(backupNetworkVlanNotContains))
                .append("\n");
        sb.append("    backupNetworkVlanNotEndsWith: ")
                .append(toIndentedString(backupNetworkVlanNotEndsWith))
                .append("\n");
        sb.append("    backupNetworkVlanNotIn: ")
                .append(toIndentedString(backupNetworkVlanNotIn))
                .append("\n");
        sb.append("    backupNetworkVlanNotStartsWith: ")
                .append(toIndentedString(backupNetworkVlanNotStartsWith))
                .append("\n");
        sb.append("    backupNetworkVlanStartsWith: ")
                .append(toIndentedString(backupNetworkVlanStartsWith))
                .append("\n");
        sb.append("    backupPlansEvery: ").append(toIndentedString(backupPlansEvery)).append("\n");
        sb.append("    backupPlansNone: ").append(toIndentedString(backupPlansNone)).append("\n");
        sb.append("    backupPlansSome: ").append(toIndentedString(backupPlansSome)).append("\n");
        sb.append("    backupRdIopsMax: ").append(toIndentedString(backupRdIopsMax)).append("\n");
        sb.append("    backupRdIopsMaxGt: ")
                .append(toIndentedString(backupRdIopsMaxGt))
                .append("\n");
        sb.append("    backupRdIopsMaxGte: ")
                .append(toIndentedString(backupRdIopsMaxGte))
                .append("\n");
        sb.append("    backupRdIopsMaxIn: ")
                .append(toIndentedString(backupRdIopsMaxIn))
                .append("\n");
        sb.append("    backupRdIopsMaxLt: ")
                .append(toIndentedString(backupRdIopsMaxLt))
                .append("\n");
        sb.append("    backupRdIopsMaxLte: ")
                .append(toIndentedString(backupRdIopsMaxLte))
                .append("\n");
        sb.append("    backupRdIopsMaxNot: ")
                .append(toIndentedString(backupRdIopsMaxNot))
                .append("\n");
        sb.append("    backupRdIopsMaxNotIn: ")
                .append(toIndentedString(backupRdIopsMaxNotIn))
                .append("\n");
        sb.append("    backupStoreRepositoriesEvery: ")
                .append(toIndentedString(backupStoreRepositoriesEvery))
                .append("\n");
        sb.append("    backupStoreRepositoriesNone: ")
                .append(toIndentedString(backupStoreRepositoriesNone))
                .append("\n");
        sb.append("    backupStoreRepositoriesSome: ")
                .append(toIndentedString(backupStoreRepositoriesSome))
                .append("\n");
        sb.append("    backupWrIopsMax: ").append(toIndentedString(backupWrIopsMax)).append("\n");
        sb.append("    backupWrIopsMaxGt: ")
                .append(toIndentedString(backupWrIopsMaxGt))
                .append("\n");
        sb.append("    backupWrIopsMaxGte: ")
                .append(toIndentedString(backupWrIopsMaxGte))
                .append("\n");
        sb.append("    backupWrIopsMaxIn: ")
                .append(toIndentedString(backupWrIopsMaxIn))
                .append("\n");
        sb.append("    backupWrIopsMaxLt: ")
                .append(toIndentedString(backupWrIopsMaxLt))
                .append("\n");
        sb.append("    backupWrIopsMaxLte: ")
                .append(toIndentedString(backupWrIopsMaxLte))
                .append("\n");
        sb.append("    backupWrIopsMaxNot: ")
                .append(toIndentedString(backupWrIopsMaxNot))
                .append("\n");
        sb.append("    backupWrIopsMaxNotIn: ")
                .append(toIndentedString(backupWrIopsMaxNotIn))
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
        sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
        sb.append("    kubeConfigContains: ")
                .append(toIndentedString(kubeConfigContains))
                .append("\n");
        sb.append("    kubeConfigEndsWith: ")
                .append(toIndentedString(kubeConfigEndsWith))
                .append("\n");
        sb.append("    kubeConfigGt: ").append(toIndentedString(kubeConfigGt)).append("\n");
        sb.append("    kubeConfigGte: ").append(toIndentedString(kubeConfigGte)).append("\n");
        sb.append("    kubeConfigIn: ").append(toIndentedString(kubeConfigIn)).append("\n");
        sb.append("    kubeConfigLt: ").append(toIndentedString(kubeConfigLt)).append("\n");
        sb.append("    kubeConfigLte: ").append(toIndentedString(kubeConfigLte)).append("\n");
        sb.append("    kubeConfigNot: ").append(toIndentedString(kubeConfigNot)).append("\n");
        sb.append("    kubeConfigNotContains: ")
                .append(toIndentedString(kubeConfigNotContains))
                .append("\n");
        sb.append("    kubeConfigNotEndsWith: ")
                .append(toIndentedString(kubeConfigNotEndsWith))
                .append("\n");
        sb.append("    kubeConfigNotIn: ").append(toIndentedString(kubeConfigNotIn)).append("\n");
        sb.append("    kubeConfigNotStartsWith: ")
                .append(toIndentedString(kubeConfigNotStartsWith))
                .append("\n");
        sb.append("    kubeConfigStartsWith: ")
                .append(toIndentedString(kubeConfigStartsWith))
                .append("\n");
        sb.append("    managementNetworkGateway: ")
                .append(toIndentedString(managementNetworkGateway))
                .append("\n");
        sb.append("    managementNetworkGatewayContains: ")
                .append(toIndentedString(managementNetworkGatewayContains))
                .append("\n");
        sb.append("    managementNetworkGatewayEndsWith: ")
                .append(toIndentedString(managementNetworkGatewayEndsWith))
                .append("\n");
        sb.append("    managementNetworkGatewayGt: ")
                .append(toIndentedString(managementNetworkGatewayGt))
                .append("\n");
        sb.append("    managementNetworkGatewayGte: ")
                .append(toIndentedString(managementNetworkGatewayGte))
                .append("\n");
        sb.append("    managementNetworkGatewayIn: ")
                .append(toIndentedString(managementNetworkGatewayIn))
                .append("\n");
        sb.append("    managementNetworkGatewayLt: ")
                .append(toIndentedString(managementNetworkGatewayLt))
                .append("\n");
        sb.append("    managementNetworkGatewayLte: ")
                .append(toIndentedString(managementNetworkGatewayLte))
                .append("\n");
        sb.append("    managementNetworkGatewayNot: ")
                .append(toIndentedString(managementNetworkGatewayNot))
                .append("\n");
        sb.append("    managementNetworkGatewayNotContains: ")
                .append(toIndentedString(managementNetworkGatewayNotContains))
                .append("\n");
        sb.append("    managementNetworkGatewayNotEndsWith: ")
                .append(toIndentedString(managementNetworkGatewayNotEndsWith))
                .append("\n");
        sb.append("    managementNetworkGatewayNotIn: ")
                .append(toIndentedString(managementNetworkGatewayNotIn))
                .append("\n");
        sb.append("    managementNetworkGatewayNotStartsWith: ")
                .append(toIndentedString(managementNetworkGatewayNotStartsWith))
                .append("\n");
        sb.append("    managementNetworkGatewayStartsWith: ")
                .append(toIndentedString(managementNetworkGatewayStartsWith))
                .append("\n");
        sb.append("    managementNetworkIp: ")
                .append(toIndentedString(managementNetworkIp))
                .append("\n");
        sb.append("    managementNetworkIpContains: ")
                .append(toIndentedString(managementNetworkIpContains))
                .append("\n");
        sb.append("    managementNetworkIpEndsWith: ")
                .append(toIndentedString(managementNetworkIpEndsWith))
                .append("\n");
        sb.append("    managementNetworkIpGt: ")
                .append(toIndentedString(managementNetworkIpGt))
                .append("\n");
        sb.append("    managementNetworkIpGte: ")
                .append(toIndentedString(managementNetworkIpGte))
                .append("\n");
        sb.append("    managementNetworkIpIn: ")
                .append(toIndentedString(managementNetworkIpIn))
                .append("\n");
        sb.append("    managementNetworkIpLt: ")
                .append(toIndentedString(managementNetworkIpLt))
                .append("\n");
        sb.append("    managementNetworkIpLte: ")
                .append(toIndentedString(managementNetworkIpLte))
                .append("\n");
        sb.append("    managementNetworkIpNot: ")
                .append(toIndentedString(managementNetworkIpNot))
                .append("\n");
        sb.append("    managementNetworkIpNotContains: ")
                .append(toIndentedString(managementNetworkIpNotContains))
                .append("\n");
        sb.append("    managementNetworkIpNotEndsWith: ")
                .append(toIndentedString(managementNetworkIpNotEndsWith))
                .append("\n");
        sb.append("    managementNetworkIpNotIn: ")
                .append(toIndentedString(managementNetworkIpNotIn))
                .append("\n");
        sb.append("    managementNetworkIpNotStartsWith: ")
                .append(toIndentedString(managementNetworkIpNotStartsWith))
                .append("\n");
        sb.append("    managementNetworkIpStartsWith: ")
                .append(toIndentedString(managementNetworkIpStartsWith))
                .append("\n");
        sb.append("    managementNetworkSubnetMask: ")
                .append(toIndentedString(managementNetworkSubnetMask))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskContains: ")
                .append(toIndentedString(managementNetworkSubnetMaskContains))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskEndsWith: ")
                .append(toIndentedString(managementNetworkSubnetMaskEndsWith))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskGt: ")
                .append(toIndentedString(managementNetworkSubnetMaskGt))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskGte: ")
                .append(toIndentedString(managementNetworkSubnetMaskGte))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskIn: ")
                .append(toIndentedString(managementNetworkSubnetMaskIn))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskLt: ")
                .append(toIndentedString(managementNetworkSubnetMaskLt))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskLte: ")
                .append(toIndentedString(managementNetworkSubnetMaskLte))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskNot: ")
                .append(toIndentedString(managementNetworkSubnetMaskNot))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskNotContains: ")
                .append(toIndentedString(managementNetworkSubnetMaskNotContains))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskNotEndsWith: ")
                .append(toIndentedString(managementNetworkSubnetMaskNotEndsWith))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskNotIn: ")
                .append(toIndentedString(managementNetworkSubnetMaskNotIn))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskNotStartsWith: ")
                .append(toIndentedString(managementNetworkSubnetMaskNotStartsWith))
                .append("\n");
        sb.append("    managementNetworkSubnetMaskStartsWith: ")
                .append(toIndentedString(managementNetworkSubnetMaskStartsWith))
                .append("\n");
        sb.append("    managementNetworkVlan: ")
                .append(toIndentedString(managementNetworkVlan))
                .append("\n");
        sb.append("    managementNetworkVlanContains: ")
                .append(toIndentedString(managementNetworkVlanContains))
                .append("\n");
        sb.append("    managementNetworkVlanEndsWith: ")
                .append(toIndentedString(managementNetworkVlanEndsWith))
                .append("\n");
        sb.append("    managementNetworkVlanGt: ")
                .append(toIndentedString(managementNetworkVlanGt))
                .append("\n");
        sb.append("    managementNetworkVlanGte: ")
                .append(toIndentedString(managementNetworkVlanGte))
                .append("\n");
        sb.append("    managementNetworkVlanIn: ")
                .append(toIndentedString(managementNetworkVlanIn))
                .append("\n");
        sb.append("    managementNetworkVlanLt: ")
                .append(toIndentedString(managementNetworkVlanLt))
                .append("\n");
        sb.append("    managementNetworkVlanLte: ")
                .append(toIndentedString(managementNetworkVlanLte))
                .append("\n");
        sb.append("    managementNetworkVlanNot: ")
                .append(toIndentedString(managementNetworkVlanNot))
                .append("\n");
        sb.append("    managementNetworkVlanNotContains: ")
                .append(toIndentedString(managementNetworkVlanNotContains))
                .append("\n");
        sb.append("    managementNetworkVlanNotEndsWith: ")
                .append(toIndentedString(managementNetworkVlanNotEndsWith))
                .append("\n");
        sb.append("    managementNetworkVlanNotIn: ")
                .append(toIndentedString(managementNetworkVlanNotIn))
                .append("\n");
        sb.append("    managementNetworkVlanNotStartsWith: ")
                .append(toIndentedString(managementNetworkVlanNotStartsWith))
                .append("\n");
        sb.append("    managementNetworkVlanStartsWith: ")
                .append(toIndentedString(managementNetworkVlanStartsWith))
                .append("\n");
        sb.append("    maxJobRetryTimes: ").append(toIndentedString(maxJobRetryTimes)).append("\n");
        sb.append("    maxJobRetryTimesGt: ")
                .append(toIndentedString(maxJobRetryTimesGt))
                .append("\n");
        sb.append("    maxJobRetryTimesGte: ")
                .append(toIndentedString(maxJobRetryTimesGte))
                .append("\n");
        sb.append("    maxJobRetryTimesIn: ")
                .append(toIndentedString(maxJobRetryTimesIn))
                .append("\n");
        sb.append("    maxJobRetryTimesLt: ")
                .append(toIndentedString(maxJobRetryTimesLt))
                .append("\n");
        sb.append("    maxJobRetryTimesLte: ")
                .append(toIndentedString(maxJobRetryTimesLte))
                .append("\n");
        sb.append("    maxJobRetryTimesNot: ")
                .append(toIndentedString(maxJobRetryTimesNot))
                .append("\n");
        sb.append("    maxJobRetryTimesNotIn: ")
                .append(toIndentedString(maxJobRetryTimesNotIn))
                .append("\n");
        sb.append("    maxParallelBackupJobs: ")
                .append(toIndentedString(maxParallelBackupJobs))
                .append("\n");
        sb.append("    maxParallelBackupJobsGt: ")
                .append(toIndentedString(maxParallelBackupJobsGt))
                .append("\n");
        sb.append("    maxParallelBackupJobsGte: ")
                .append(toIndentedString(maxParallelBackupJobsGte))
                .append("\n");
        sb.append("    maxParallelBackupJobsIn: ")
                .append(toIndentedString(maxParallelBackupJobsIn))
                .append("\n");
        sb.append("    maxParallelBackupJobsLt: ")
                .append(toIndentedString(maxParallelBackupJobsLt))
                .append("\n");
        sb.append("    maxParallelBackupJobsLte: ")
                .append(toIndentedString(maxParallelBackupJobsLte))
                .append("\n");
        sb.append("    maxParallelBackupJobsNot: ")
                .append(toIndentedString(maxParallelBackupJobsNot))
                .append("\n");
        sb.append("    maxParallelBackupJobsNotIn: ")
                .append(toIndentedString(maxParallelBackupJobsNotIn))
                .append("\n");
        sb.append("    maxParallelRestoreJobs: ")
                .append(toIndentedString(maxParallelRestoreJobs))
                .append("\n");
        sb.append("    maxParallelRestoreJobsGt: ")
                .append(toIndentedString(maxParallelRestoreJobsGt))
                .append("\n");
        sb.append("    maxParallelRestoreJobsGte: ")
                .append(toIndentedString(maxParallelRestoreJobsGte))
                .append("\n");
        sb.append("    maxParallelRestoreJobsIn: ")
                .append(toIndentedString(maxParallelRestoreJobsIn))
                .append("\n");
        sb.append("    maxParallelRestoreJobsLt: ")
                .append(toIndentedString(maxParallelRestoreJobsLt))
                .append("\n");
        sb.append("    maxParallelRestoreJobsLte: ")
                .append(toIndentedString(maxParallelRestoreJobsLte))
                .append("\n");
        sb.append("    maxParallelRestoreJobsNot: ")
                .append(toIndentedString(maxParallelRestoreJobsNot))
                .append("\n");
        sb.append("    maxParallelRestoreJobsNotIn: ")
                .append(toIndentedString(maxParallelRestoreJobsNotIn))
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
        sb.append("    restoreRdIopsMax: ").append(toIndentedString(restoreRdIopsMax)).append("\n");
        sb.append("    restoreRdIopsMaxGt: ")
                .append(toIndentedString(restoreRdIopsMaxGt))
                .append("\n");
        sb.append("    restoreRdIopsMaxGte: ")
                .append(toIndentedString(restoreRdIopsMaxGte))
                .append("\n");
        sb.append("    restoreRdIopsMaxIn: ")
                .append(toIndentedString(restoreRdIopsMaxIn))
                .append("\n");
        sb.append("    restoreRdIopsMaxLt: ")
                .append(toIndentedString(restoreRdIopsMaxLt))
                .append("\n");
        sb.append("    restoreRdIopsMaxLte: ")
                .append(toIndentedString(restoreRdIopsMaxLte))
                .append("\n");
        sb.append("    restoreRdIopsMaxNot: ")
                .append(toIndentedString(restoreRdIopsMaxNot))
                .append("\n");
        sb.append("    restoreRdIopsMaxNotIn: ")
                .append(toIndentedString(restoreRdIopsMaxNotIn))
                .append("\n");
        sb.append("    restoreWrIopsMax: ").append(toIndentedString(restoreWrIopsMax)).append("\n");
        sb.append("    restoreWrIopsMaxGt: ")
                .append(toIndentedString(restoreWrIopsMaxGt))
                .append("\n");
        sb.append("    restoreWrIopsMaxGte: ")
                .append(toIndentedString(restoreWrIopsMaxGte))
                .append("\n");
        sb.append("    restoreWrIopsMaxIn: ")
                .append(toIndentedString(restoreWrIopsMaxIn))
                .append("\n");
        sb.append("    restoreWrIopsMaxLt: ")
                .append(toIndentedString(restoreWrIopsMaxLt))
                .append("\n");
        sb.append("    restoreWrIopsMaxLte: ")
                .append(toIndentedString(restoreWrIopsMaxLte))
                .append("\n");
        sb.append("    restoreWrIopsMaxNot: ")
                .append(toIndentedString(restoreWrIopsMaxNot))
                .append("\n");
        sb.append("    restoreWrIopsMaxNotIn: ")
                .append(toIndentedString(restoreWrIopsMaxNotIn))
                .append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    retryIntervalGt: ").append(toIndentedString(retryIntervalGt)).append("\n");
        sb.append("    retryIntervalGte: ").append(toIndentedString(retryIntervalGte)).append("\n");
        sb.append("    retryIntervalIn: ").append(toIndentedString(retryIntervalIn)).append("\n");
        sb.append("    retryIntervalLt: ").append(toIndentedString(retryIntervalLt)).append("\n");
        sb.append("    retryIntervalLte: ").append(toIndentedString(retryIntervalLte)).append("\n");
        sb.append("    retryIntervalNot: ").append(toIndentedString(retryIntervalNot)).append("\n");
        sb.append("    retryIntervalNotIn: ")
                .append(toIndentedString(retryIntervalNotIn))
                .append("\n");
        sb.append("    runningVm: ").append(toIndentedString(runningVm)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    storageNetworkGateway: ")
                .append(toIndentedString(storageNetworkGateway))
                .append("\n");
        sb.append("    storageNetworkGatewayContains: ")
                .append(toIndentedString(storageNetworkGatewayContains))
                .append("\n");
        sb.append("    storageNetworkGatewayEndsWith: ")
                .append(toIndentedString(storageNetworkGatewayEndsWith))
                .append("\n");
        sb.append("    storageNetworkGatewayGt: ")
                .append(toIndentedString(storageNetworkGatewayGt))
                .append("\n");
        sb.append("    storageNetworkGatewayGte: ")
                .append(toIndentedString(storageNetworkGatewayGte))
                .append("\n");
        sb.append("    storageNetworkGatewayIn: ")
                .append(toIndentedString(storageNetworkGatewayIn))
                .append("\n");
        sb.append("    storageNetworkGatewayLt: ")
                .append(toIndentedString(storageNetworkGatewayLt))
                .append("\n");
        sb.append("    storageNetworkGatewayLte: ")
                .append(toIndentedString(storageNetworkGatewayLte))
                .append("\n");
        sb.append("    storageNetworkGatewayNot: ")
                .append(toIndentedString(storageNetworkGatewayNot))
                .append("\n");
        sb.append("    storageNetworkGatewayNotContains: ")
                .append(toIndentedString(storageNetworkGatewayNotContains))
                .append("\n");
        sb.append("    storageNetworkGatewayNotEndsWith: ")
                .append(toIndentedString(storageNetworkGatewayNotEndsWith))
                .append("\n");
        sb.append("    storageNetworkGatewayNotIn: ")
                .append(toIndentedString(storageNetworkGatewayNotIn))
                .append("\n");
        sb.append("    storageNetworkGatewayNotStartsWith: ")
                .append(toIndentedString(storageNetworkGatewayNotStartsWith))
                .append("\n");
        sb.append("    storageNetworkGatewayStartsWith: ")
                .append(toIndentedString(storageNetworkGatewayStartsWith))
                .append("\n");
        sb.append("    storageNetworkIp: ").append(toIndentedString(storageNetworkIp)).append("\n");
        sb.append("    storageNetworkIpContains: ")
                .append(toIndentedString(storageNetworkIpContains))
                .append("\n");
        sb.append("    storageNetworkIpEndsWith: ")
                .append(toIndentedString(storageNetworkIpEndsWith))
                .append("\n");
        sb.append("    storageNetworkIpGt: ")
                .append(toIndentedString(storageNetworkIpGt))
                .append("\n");
        sb.append("    storageNetworkIpGte: ")
                .append(toIndentedString(storageNetworkIpGte))
                .append("\n");
        sb.append("    storageNetworkIpIn: ")
                .append(toIndentedString(storageNetworkIpIn))
                .append("\n");
        sb.append("    storageNetworkIpLt: ")
                .append(toIndentedString(storageNetworkIpLt))
                .append("\n");
        sb.append("    storageNetworkIpLte: ")
                .append(toIndentedString(storageNetworkIpLte))
                .append("\n");
        sb.append("    storageNetworkIpNot: ")
                .append(toIndentedString(storageNetworkIpNot))
                .append("\n");
        sb.append("    storageNetworkIpNotContains: ")
                .append(toIndentedString(storageNetworkIpNotContains))
                .append("\n");
        sb.append("    storageNetworkIpNotEndsWith: ")
                .append(toIndentedString(storageNetworkIpNotEndsWith))
                .append("\n");
        sb.append("    storageNetworkIpNotIn: ")
                .append(toIndentedString(storageNetworkIpNotIn))
                .append("\n");
        sb.append("    storageNetworkIpNotStartsWith: ")
                .append(toIndentedString(storageNetworkIpNotStartsWith))
                .append("\n");
        sb.append("    storageNetworkIpStartsWith: ")
                .append(toIndentedString(storageNetworkIpStartsWith))
                .append("\n");
        sb.append("    storageNetworkSubnetMask: ")
                .append(toIndentedString(storageNetworkSubnetMask))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskContains: ")
                .append(toIndentedString(storageNetworkSubnetMaskContains))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskEndsWith: ")
                .append(toIndentedString(storageNetworkSubnetMaskEndsWith))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskGt: ")
                .append(toIndentedString(storageNetworkSubnetMaskGt))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskGte: ")
                .append(toIndentedString(storageNetworkSubnetMaskGte))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskIn: ")
                .append(toIndentedString(storageNetworkSubnetMaskIn))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskLt: ")
                .append(toIndentedString(storageNetworkSubnetMaskLt))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskLte: ")
                .append(toIndentedString(storageNetworkSubnetMaskLte))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskNot: ")
                .append(toIndentedString(storageNetworkSubnetMaskNot))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskNotContains: ")
                .append(toIndentedString(storageNetworkSubnetMaskNotContains))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskNotEndsWith: ")
                .append(toIndentedString(storageNetworkSubnetMaskNotEndsWith))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskNotIn: ")
                .append(toIndentedString(storageNetworkSubnetMaskNotIn))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskNotStartsWith: ")
                .append(toIndentedString(storageNetworkSubnetMaskNotStartsWith))
                .append("\n");
        sb.append("    storageNetworkSubnetMaskStartsWith: ")
                .append(toIndentedString(storageNetworkSubnetMaskStartsWith))
                .append("\n");
        sb.append("    storageNetworkType: ")
                .append(toIndentedString(storageNetworkType))
                .append("\n");
        sb.append("    storageNetworkTypeIn: ")
                .append(toIndentedString(storageNetworkTypeIn))
                .append("\n");
        sb.append("    storageNetworkTypeNot: ")
                .append(toIndentedString(storageNetworkTypeNot))
                .append("\n");
        sb.append("    storageNetworkTypeNotIn: ")
                .append(toIndentedString(storageNetworkTypeNotIn))
                .append("\n");
        sb.append("    storageNetworkVlan: ")
                .append(toIndentedString(storageNetworkVlan))
                .append("\n");
        sb.append("    storageNetworkVlanContains: ")
                .append(toIndentedString(storageNetworkVlanContains))
                .append("\n");
        sb.append("    storageNetworkVlanEndsWith: ")
                .append(toIndentedString(storageNetworkVlanEndsWith))
                .append("\n");
        sb.append("    storageNetworkVlanGt: ")
                .append(toIndentedString(storageNetworkVlanGt))
                .append("\n");
        sb.append("    storageNetworkVlanGte: ")
                .append(toIndentedString(storageNetworkVlanGte))
                .append("\n");
        sb.append("    storageNetworkVlanIn: ")
                .append(toIndentedString(storageNetworkVlanIn))
                .append("\n");
        sb.append("    storageNetworkVlanLt: ")
                .append(toIndentedString(storageNetworkVlanLt))
                .append("\n");
        sb.append("    storageNetworkVlanLte: ")
                .append(toIndentedString(storageNetworkVlanLte))
                .append("\n");
        sb.append("    storageNetworkVlanNot: ")
                .append(toIndentedString(storageNetworkVlanNot))
                .append("\n");
        sb.append("    storageNetworkVlanNotContains: ")
                .append(toIndentedString(storageNetworkVlanNotContains))
                .append("\n");
        sb.append("    storageNetworkVlanNotEndsWith: ")
                .append(toIndentedString(storageNetworkVlanNotEndsWith))
                .append("\n");
        sb.append("    storageNetworkVlanNotIn: ")
                .append(toIndentedString(storageNetworkVlanNotIn))
                .append("\n");
        sb.append("    storageNetworkVlanNotStartsWith: ")
                .append(toIndentedString(storageNetworkVlanNotStartsWith))
                .append("\n");
        sb.append("    storageNetworkVlanStartsWith: ")
                .append(toIndentedString(storageNetworkVlanStartsWith))
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
