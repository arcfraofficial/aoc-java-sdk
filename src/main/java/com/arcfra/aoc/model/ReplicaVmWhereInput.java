package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicaVmWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicaVmWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicaVmWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicaVmWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicaVmWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWER = "external_cloudtower";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER)
    private ExternalCloudTowerWhereInput externalCloudtower;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP =
            "failover_test_replica_group";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP)
    private String failoverTestReplicaGroup;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS =
            "failover_test_replica_group_contains";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS)
    private String failoverTestReplicaGroupContains;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH =
            "failover_test_replica_group_ends_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH)
    private String failoverTestReplicaGroupEndsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT =
            "failover_test_replica_group_gt";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT)
    private String failoverTestReplicaGroupGt;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE =
            "failover_test_replica_group_gte";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE)
    private String failoverTestReplicaGroupGte;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN =
            "failover_test_replica_group_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN)
    private List<String> failoverTestReplicaGroupIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT =
            "failover_test_replica_group_lt";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT)
    private String failoverTestReplicaGroupLt;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE =
            "failover_test_replica_group_lte";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE)
    private String failoverTestReplicaGroupLte;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT =
            "failover_test_replica_group_not";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT)
    private String failoverTestReplicaGroupNot;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS =
            "failover_test_replica_group_not_contains";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS)
    private String failoverTestReplicaGroupNotContains;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH =
            "failover_test_replica_group_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH)
    private String failoverTestReplicaGroupNotEndsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN =
            "failover_test_replica_group_not_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN)
    private List<String> failoverTestReplicaGroupNotIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH =
            "failover_test_replica_group_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH)
    private String failoverTestReplicaGroupNotStartsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH =
            "failover_test_replica_group_starts_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH)
    private String failoverTestReplicaGroupStartsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_VM = "failover_test_vm";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_VM)
    private VmWhereInput failoverTestVm;

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

    public static final String SERIALIZED_NAME_INBOUND = "inbound";

    @SerializedName(SERIALIZED_NAME_INBOUND)
    private Boolean inbound;

    public static final String SERIALIZED_NAME_INBOUND_NOT = "inbound_not";

    @SerializedName(SERIALIZED_NAME_INBOUND_NOT)
    private Boolean inboundNot;

    public static final String SERIALIZED_NAME_ISCSI_LUN = "iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN)
    private IscsiLunWhereInput iscsiLun;

    public static final String SERIALIZED_NAME_ORIGIN_ISCSI_LUN = "origin_iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ORIGIN_ISCSI_LUN)
    private IscsiLunWhereInput originIscsiLun;

    public static final String SERIALIZED_NAME_ORIGIN_VM = "origin_vm";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM)
    private VmWhereInput originVm;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID =
            "origin_vm_cluster_local_id";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID)
    private String originVmClusterLocalId;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS =
            "origin_vm_cluster_local_id_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS)
    private String originVmClusterLocalIdContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH =
            "origin_vm_cluster_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH)
    private String originVmClusterLocalIdEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT =
            "origin_vm_cluster_local_id_gt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT)
    private String originVmClusterLocalIdGt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE =
            "origin_vm_cluster_local_id_gte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE)
    private String originVmClusterLocalIdGte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN =
            "origin_vm_cluster_local_id_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN)
    private List<String> originVmClusterLocalIdIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT =
            "origin_vm_cluster_local_id_lt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT)
    private String originVmClusterLocalIdLt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE =
            "origin_vm_cluster_local_id_lte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE)
    private String originVmClusterLocalIdLte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT =
            "origin_vm_cluster_local_id_not";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT)
    private String originVmClusterLocalIdNot;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS =
            "origin_vm_cluster_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS)
    private String originVmClusterLocalIdNotContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH =
            "origin_vm_cluster_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH)
    private String originVmClusterLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN =
            "origin_vm_cluster_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN)
    private List<String> originVmClusterLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH =
            "origin_vm_cluster_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH)
    private String originVmClusterLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH =
            "origin_vm_cluster_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH)
    private String originVmClusterLocalIdStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME = "origin_vm_cluster_name";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME)
    private String originVmClusterName;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS =
            "origin_vm_cluster_name_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS)
    private String originVmClusterNameContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH =
            "origin_vm_cluster_name_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH)
    private String originVmClusterNameEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT =
            "origin_vm_cluster_name_gt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT)
    private String originVmClusterNameGt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE =
            "origin_vm_cluster_name_gte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE)
    private String originVmClusterNameGte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN =
            "origin_vm_cluster_name_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN)
    private List<String> originVmClusterNameIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT =
            "origin_vm_cluster_name_lt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT)
    private String originVmClusterNameLt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE =
            "origin_vm_cluster_name_lte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE)
    private String originVmClusterNameLte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT =
            "origin_vm_cluster_name_not";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT)
    private String originVmClusterNameNot;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS =
            "origin_vm_cluster_name_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS)
    private String originVmClusterNameNotContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH =
            "origin_vm_cluster_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH)
    private String originVmClusterNameNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN =
            "origin_vm_cluster_name_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN)
    private List<String> originVmClusterNameNotIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH =
            "origin_vm_cluster_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH)
    private String originVmClusterNameNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH =
            "origin_vm_cluster_name_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH)
    private String originVmClusterNameStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID = "origin_vm_local_id";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID)
    private String originVmLocalId;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS =
            "origin_vm_local_id_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS)
    private String originVmLocalIdContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH =
            "origin_vm_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH)
    private String originVmLocalIdEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT = "origin_vm_local_id_gt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT)
    private String originVmLocalIdGt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE = "origin_vm_local_id_gte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE)
    private String originVmLocalIdGte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN = "origin_vm_local_id_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN)
    private List<String> originVmLocalIdIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT = "origin_vm_local_id_lt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT)
    private String originVmLocalIdLt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE = "origin_vm_local_id_lte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE)
    private String originVmLocalIdLte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT = "origin_vm_local_id_not";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT)
    private String originVmLocalIdNot;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS =
            "origin_vm_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS)
    private String originVmLocalIdNotContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH =
            "origin_vm_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH)
    private String originVmLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN =
            "origin_vm_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN)
    private List<String> originVmLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH =
            "origin_vm_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH)
    private String originVmLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH =
            "origin_vm_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH)
    private String originVmLocalIdStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME = "origin_vm_name";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME)
    private String originVmName;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS = "origin_vm_name_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS)
    private String originVmNameContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH =
            "origin_vm_name_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH)
    private String originVmNameEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_GT = "origin_vm_name_gt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_GT)
    private String originVmNameGt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_GTE = "origin_vm_name_gte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE)
    private String originVmNameGte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_IN = "origin_vm_name_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_IN)
    private List<String> originVmNameIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_LT = "origin_vm_name_lt";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_LT)
    private String originVmNameLt;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_LTE = "origin_vm_name_lte";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE)
    private String originVmNameLte;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_NOT = "origin_vm_name_not";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT)
    private String originVmNameNot;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS =
            "origin_vm_name_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS)
    private String originVmNameNotContains;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH =
            "origin_vm_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH)
    private String originVmNameNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN = "origin_vm_name_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN)
    private List<String> originVmNameNotIn = null;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH =
            "origin_vm_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH)
    private String originVmNameNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH =
            "origin_vm_name_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH)
    private String originVmNameStartsWith;

    public static final String SERIALIZED_NAME_REPLICA_GROUP = "replica_group";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP)
    private String replicaGroup;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_CONTAINS = "replica_group_contains";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS)
    private String replicaGroupContains;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH = "replica_group_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH)
    private String replicaGroupEndsWith;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_GT = "replica_group_gt";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_GT)
    private String replicaGroupGt;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_GTE = "replica_group_gte";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_GTE)
    private String replicaGroupGte;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_IN = "replica_group_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_IN)
    private List<String> replicaGroupIn = null;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_LT = "replica_group_lt";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_LT)
    private String replicaGroupLt;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_LTE = "replica_group_lte";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_LTE)
    private String replicaGroupLte;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_NOT = "replica_group_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_NOT)
    private String replicaGroupNot;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS =
            "replica_group_not_contains";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS)
    private String replicaGroupNotContains;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH =
            "replica_group_not_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH)
    private String replicaGroupNotEndsWith;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_NOT_IN = "replica_group_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN)
    private List<String> replicaGroupNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH =
            "replica_group_not_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH)
    private String replicaGroupNotStartsWith;

    public static final String SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH =
            "replica_group_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH)
    private String replicaGroupStartsWith;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP = "replication_group";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP)
    private String replicationGroup;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS =
            "replication_group_contains";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS)
    private String replicationGroupContains;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH =
            "replication_group_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH)
    private String replicationGroupEndsWith;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_GT = "replication_group_gt";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_GT)
    private String replicationGroupGt;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_GTE = "replication_group_gte";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_GTE)
    private String replicationGroupGte;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_IN = "replication_group_in";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_IN)
    private List<String> replicationGroupIn = null;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_LT = "replication_group_lt";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_LT)
    private String replicationGroupLt;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_LTE = "replication_group_lte";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_LTE)
    private String replicationGroupLte;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_NOT = "replication_group_not";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_NOT)
    private String replicationGroupNot;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS =
            "replication_group_not_contains";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS)
    private String replicationGroupNotContains;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH =
            "replication_group_not_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH)
    private String replicationGroupNotEndsWith;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN =
            "replication_group_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN)
    private List<String> replicationGroupNotIn = null;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH =
            "replication_group_not_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH)
    private String replicationGroupNotStartsWith;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH =
            "replication_group_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH)
    private String replicationGroupStartsWith;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN = "replication_plan";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN)
    private ReplicationPlanWhereInput replicationPlan;

    public static final String SERIALIZED_NAME_REPLICATION_SERVICE = "replication_service";

    @SerializedName(SERIALIZED_NAME_REPLICATION_SERVICE)
    private ReplicationServiceWhereInput replicationService;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY =
            "replication_target_executions_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE =
            "replication_target_executions_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME =
            "replication_target_executions_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome;

    public static final String SERIALIZED_NAME_RESTORE_POINTS_EVERY = "restore_points_every";

    @SerializedName(SERIALIZED_NAME_RESTORE_POINTS_EVERY)
    private ReplicationRestorePointWhereInput restorePointsEvery;

    public static final String SERIALIZED_NAME_RESTORE_POINTS_NONE = "restore_points_none";

    @SerializedName(SERIALIZED_NAME_RESTORE_POINTS_NONE)
    private ReplicationRestorePointWhereInput restorePointsNone;

    public static final String SERIALIZED_NAME_RESTORE_POINTS_SOME = "restore_points_some";

    @SerializedName(SERIALIZED_NAME_RESTORE_POINTS_SOME)
    private ReplicationRestorePointWhereInput restorePointsSome;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private ReplicaVmState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<ReplicaVmState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private ReplicaVmState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<ReplicaVmState> stateNotIn = null;

    public static final String SERIALIZED_NAME_TARGETS_DELETABLE = "targets_deletable";

    @SerializedName(SERIALIZED_NAME_TARGETS_DELETABLE)
    private Boolean targetsDeletable;

    public static final String SERIALIZED_NAME_TARGETS_DELETABLE_NOT = "targets_deletable_not";

    @SerializedName(SERIALIZED_NAME_TARGETS_DELETABLE_NOT)
    private Boolean targetsDeletableNot;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReplicationObjectType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<ReplicationObjectType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private ReplicationObjectType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<ReplicationObjectType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GT = "updatedAt_gt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GT)
    private String updatedAtGt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updatedAt_gte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
    private String updatedAtGte;

    public static final String SERIALIZED_NAME_UPDATED_AT_IN = "updatedAt_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_IN)
    private List<String> updatedAtIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT_LT = "updatedAt_lt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LT)
    private String updatedAtLt;

    public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updatedAt_lte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
    private String updatedAtLte;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT = "updatedAt_not";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT)
    private String updatedAtNot;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT_IN = "updatedAt_not_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT_IN)
    private List<String> updatedAtNotIn = null;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public ReplicaVmWhereInput() {}

    public ReplicaVmWhereInput AND(List<ReplicaVmWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicaVmWhereInput addANDItem(ReplicaVmWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicaVmWhereInput>();
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
    public List<ReplicaVmWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicaVmWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicaVmWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicaVmWhereInput AND_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput NOT(List<ReplicaVmWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicaVmWhereInput addNOTItem(ReplicaVmWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicaVmWhereInput>();
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
    public List<ReplicaVmWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicaVmWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicaVmWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicaVmWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput OR(List<ReplicaVmWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicaVmWhereInput addORItem(ReplicaVmWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicaVmWhereInput>();
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
    public List<ReplicaVmWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicaVmWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicaVmWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicaVmWhereInput OR_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAt(String createdAt) {

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

    public ReplicaVmWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicaVmWhereInput createdAt_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtGt(String createdAtGt) {

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

    public ReplicaVmWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReplicaVmWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtGte(String createdAtGte) {

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

    public ReplicaVmWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReplicaVmWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReplicaVmWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ReplicaVmWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReplicaVmWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtLt(String createdAtLt) {

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

    public ReplicaVmWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReplicaVmWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtLte(String createdAtLte) {

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

    public ReplicaVmWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReplicaVmWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtNot(String createdAtNot) {

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

    public ReplicaVmWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReplicaVmWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReplicaVmWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ReplicaVmWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicaVmWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicaVmWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicaVmWhereInput addEntityAsyncStatusInItem(
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

    public ReplicaVmWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicaVmWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public ReplicaVmWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicaVmWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicaVmWhereInput addEntityAsyncStatusNotInItem(
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

    public ReplicaVmWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput externalCloudtower(ExternalCloudTowerWhereInput externalCloudtower) {

        this.externalCloudtower = externalCloudtower;
        return this;
    }

    /**
     * Get externalCloudtower
     *
     * @return externalCloudtower
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ExternalCloudTowerWhereInput getExternalCloudtower() {
        return externalCloudtower;
    }

    public void setExternalCloudtower(ExternalCloudTowerWhereInput externalCloudtower) {
        this.externalCloudtower = externalCloudtower;
    }

    public ReplicaVmWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public ReplicaVmWhereInput externalCloudtower_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public void setExternalCloudtower_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        }
    }

    public boolean getExternalCloudtower_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroup(String failoverTestReplicaGroup) {

        this.failoverTestReplicaGroup = failoverTestReplicaGroup;
        return this;
    }

    /**
     * Get failoverTestReplicaGroup
     *
     * @return failoverTestReplicaGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroup() {
        return failoverTestReplicaGroup;
    }

    public void setFailoverTestReplicaGroup(String failoverTestReplicaGroup) {
        this.failoverTestReplicaGroup = failoverTestReplicaGroup;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
        return this;
    }

    public void setFailoverTestReplicaGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
        }
    }

    public boolean getFailoverTestReplicaGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupContains(
            String failoverTestReplicaGroupContains) {

        this.failoverTestReplicaGroupContains = failoverTestReplicaGroupContains;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupContains
     *
     * @return failoverTestReplicaGroupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupContains() {
        return failoverTestReplicaGroupContains;
    }

    public void setFailoverTestReplicaGroupContains(String failoverTestReplicaGroupContains) {
        this.failoverTestReplicaGroupContains = failoverTestReplicaGroupContains;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS);
        return this;
    }

    public void setFailoverTestReplicaGroupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS);
        }
    }

    public boolean getFailoverTestReplicaGroupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_CONTAINS);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupEndsWith(
            String failoverTestReplicaGroupEndsWith) {

        this.failoverTestReplicaGroupEndsWith = failoverTestReplicaGroupEndsWith;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupEndsWith
     *
     * @return failoverTestReplicaGroupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupEndsWith() {
        return failoverTestReplicaGroupEndsWith;
    }

    public void setFailoverTestReplicaGroupEndsWith(String failoverTestReplicaGroupEndsWith) {
        this.failoverTestReplicaGroupEndsWith = failoverTestReplicaGroupEndsWith;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH);
        return this;
    }

    public void setFailoverTestReplicaGroupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH);
        }
    }

    public boolean getFailoverTestReplicaGroupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_ENDS_WITH);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGt(String failoverTestReplicaGroupGt) {

        this.failoverTestReplicaGroupGt = failoverTestReplicaGroupGt;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupGt
     *
     * @return failoverTestReplicaGroupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupGt() {
        return failoverTestReplicaGroupGt;
    }

    public void setFailoverTestReplicaGroupGt(String failoverTestReplicaGroupGt) {
        this.failoverTestReplicaGroupGt = failoverTestReplicaGroupGt;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT);
        return this;
    }

    public void setFailoverTestReplicaGroupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT);
        }
    }

    public boolean getFailoverTestReplicaGroupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GT);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGte(String failoverTestReplicaGroupGte) {

        this.failoverTestReplicaGroupGte = failoverTestReplicaGroupGte;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupGte
     *
     * @return failoverTestReplicaGroupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupGte() {
        return failoverTestReplicaGroupGte;
    }

    public void setFailoverTestReplicaGroupGte(String failoverTestReplicaGroupGte) {
        this.failoverTestReplicaGroupGte = failoverTestReplicaGroupGte;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE);
        return this;
    }

    public void setFailoverTestReplicaGroupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE);
        }
    }

    public boolean getFailoverTestReplicaGroupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_GTE);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupIn(List<String> failoverTestReplicaGroupIn) {

        this.failoverTestReplicaGroupIn = failoverTestReplicaGroupIn;
        return this;
    }

    public ReplicaVmWhereInput addFailoverTestReplicaGroupInItem(
            String failoverTestReplicaGroupInItem) {
        if (this.failoverTestReplicaGroupIn == null) {
            this.failoverTestReplicaGroupIn = new ArrayList<String>();
        }
        this.failoverTestReplicaGroupIn.add(failoverTestReplicaGroupInItem);
        return this;
    }

    /**
     * Get failoverTestReplicaGroupIn
     *
     * @return failoverTestReplicaGroupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFailoverTestReplicaGroupIn() {
        return failoverTestReplicaGroupIn;
    }

    public void setFailoverTestReplicaGroupIn(List<String> failoverTestReplicaGroupIn) {
        this.failoverTestReplicaGroupIn = failoverTestReplicaGroupIn;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN);
        return this;
    }

    public void setFailoverTestReplicaGroupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN);
        }
    }

    public boolean getFailoverTestReplicaGroupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_IN);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLt(String failoverTestReplicaGroupLt) {

        this.failoverTestReplicaGroupLt = failoverTestReplicaGroupLt;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupLt
     *
     * @return failoverTestReplicaGroupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupLt() {
        return failoverTestReplicaGroupLt;
    }

    public void setFailoverTestReplicaGroupLt(String failoverTestReplicaGroupLt) {
        this.failoverTestReplicaGroupLt = failoverTestReplicaGroupLt;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT);
        return this;
    }

    public void setFailoverTestReplicaGroupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT);
        }
    }

    public boolean getFailoverTestReplicaGroupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LT);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLte(String failoverTestReplicaGroupLte) {

        this.failoverTestReplicaGroupLte = failoverTestReplicaGroupLte;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupLte
     *
     * @return failoverTestReplicaGroupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupLte() {
        return failoverTestReplicaGroupLte;
    }

    public void setFailoverTestReplicaGroupLte(String failoverTestReplicaGroupLte) {
        this.failoverTestReplicaGroupLte = failoverTestReplicaGroupLte;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE);
        return this;
    }

    public void setFailoverTestReplicaGroupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE);
        }
    }

    public boolean getFailoverTestReplicaGroupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_LTE);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNot(String failoverTestReplicaGroupNot) {

        this.failoverTestReplicaGroupNot = failoverTestReplicaGroupNot;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupNot
     *
     * @return failoverTestReplicaGroupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupNot() {
        return failoverTestReplicaGroupNot;
    }

    public void setFailoverTestReplicaGroupNot(String failoverTestReplicaGroupNot) {
        this.failoverTestReplicaGroupNot = failoverTestReplicaGroupNot;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT);
        return this;
    }

    public void setFailoverTestReplicaGroupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT);
        }
    }

    public boolean getFailoverTestReplicaGroupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotContains(
            String failoverTestReplicaGroupNotContains) {

        this.failoverTestReplicaGroupNotContains = failoverTestReplicaGroupNotContains;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupNotContains
     *
     * @return failoverTestReplicaGroupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupNotContains() {
        return failoverTestReplicaGroupNotContains;
    }

    public void setFailoverTestReplicaGroupNotContains(String failoverTestReplicaGroupNotContains) {
        this.failoverTestReplicaGroupNotContains = failoverTestReplicaGroupNotContains;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS);
        return this;
    }

    public void setFailoverTestReplicaGroupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS);
        }
    }

    public boolean getFailoverTestReplicaGroupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotEndsWith(
            String failoverTestReplicaGroupNotEndsWith) {

        this.failoverTestReplicaGroupNotEndsWith = failoverTestReplicaGroupNotEndsWith;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupNotEndsWith
     *
     * @return failoverTestReplicaGroupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupNotEndsWith() {
        return failoverTestReplicaGroupNotEndsWith;
    }

    public void setFailoverTestReplicaGroupNotEndsWith(String failoverTestReplicaGroupNotEndsWith) {
        this.failoverTestReplicaGroupNotEndsWith = failoverTestReplicaGroupNotEndsWith;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public void setFailoverTestReplicaGroupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH);
        }
    }

    public boolean getFailoverTestReplicaGroupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotIn(
            List<String> failoverTestReplicaGroupNotIn) {

        this.failoverTestReplicaGroupNotIn = failoverTestReplicaGroupNotIn;
        return this;
    }

    public ReplicaVmWhereInput addFailoverTestReplicaGroupNotInItem(
            String failoverTestReplicaGroupNotInItem) {
        if (this.failoverTestReplicaGroupNotIn == null) {
            this.failoverTestReplicaGroupNotIn = new ArrayList<String>();
        }
        this.failoverTestReplicaGroupNotIn.add(failoverTestReplicaGroupNotInItem);
        return this;
    }

    /**
     * Get failoverTestReplicaGroupNotIn
     *
     * @return failoverTestReplicaGroupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFailoverTestReplicaGroupNotIn() {
        return failoverTestReplicaGroupNotIn;
    }

    public void setFailoverTestReplicaGroupNotIn(List<String> failoverTestReplicaGroupNotIn) {
        this.failoverTestReplicaGroupNotIn = failoverTestReplicaGroupNotIn;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN);
        return this;
    }

    public void setFailoverTestReplicaGroupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN);
        }
    }

    public boolean getFailoverTestReplicaGroupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_IN);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotStartsWith(
            String failoverTestReplicaGroupNotStartsWith) {

        this.failoverTestReplicaGroupNotStartsWith = failoverTestReplicaGroupNotStartsWith;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupNotStartsWith
     *
     * @return failoverTestReplicaGroupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupNotStartsWith() {
        return failoverTestReplicaGroupNotStartsWith;
    }

    public void setFailoverTestReplicaGroupNotStartsWith(
            String failoverTestReplicaGroupNotStartsWith) {
        this.failoverTestReplicaGroupNotStartsWith = failoverTestReplicaGroupNotStartsWith;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public void setFailoverTestReplicaGroupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH);
        }
    }

    public boolean getFailoverTestReplicaGroupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupStartsWith(
            String failoverTestReplicaGroupStartsWith) {

        this.failoverTestReplicaGroupStartsWith = failoverTestReplicaGroupStartsWith;
        return this;
    }

    /**
     * Get failoverTestReplicaGroupStartsWith
     *
     * @return failoverTestReplicaGroupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestReplicaGroupStartsWith() {
        return failoverTestReplicaGroupStartsWith;
    }

    public void setFailoverTestReplicaGroupStartsWith(String failoverTestReplicaGroupStartsWith) {
        this.failoverTestReplicaGroupStartsWith = failoverTestReplicaGroupStartsWith;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput failoverTestReplicaGroupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH);
        return this;
    }

    public void setFailoverTestReplicaGroupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH);
        }
    }

    public boolean getFailoverTestReplicaGroupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP_STARTS_WITH);
    }

    public ReplicaVmWhereInput failoverTestVm(VmWhereInput failoverTestVm) {

        this.failoverTestVm = failoverTestVm;
        return this;
    }

    /**
     * Get failoverTestVm
     *
     * @return failoverTestVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getFailoverTestVm() {
        return failoverTestVm;
    }

    public void setFailoverTestVm(VmWhereInput failoverTestVm) {
        this.failoverTestVm = failoverTestVm;
    }

    public ReplicaVmWhereInput failoverTestVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_VM);
        return this;
    }

    public ReplicaVmWhereInput failoverTestVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_VM);
        return this;
    }

    public void setFailoverTestVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_VM);
        }
    }

    public boolean getFailoverTestVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_VM);
    }

    public ReplicaVmWhereInput id(String id) {

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

    public ReplicaVmWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicaVmWhereInput id_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idContains(String idContains) {

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

    public ReplicaVmWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicaVmWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idGt(String idGt) {

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

    public ReplicaVmWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicaVmWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idGte(String idGte) {

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

    public ReplicaVmWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicaVmWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicaVmWhereInput addIdInItem(String idInItem) {
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

    public ReplicaVmWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicaVmWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idLt(String idLt) {

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

    public ReplicaVmWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicaVmWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idLte(String idLte) {

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

    public ReplicaVmWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicaVmWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idNot(String idNot) {

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

    public ReplicaVmWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicaVmWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idNotContains(String idNotContains) {

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

    public ReplicaVmWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicaVmWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicaVmWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicaVmWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicaVmWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicaVmWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicaVmWhereInput inbound(Boolean inbound) {

        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     *
     * @return inbound
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInbound() {
        return inbound;
    }

    public void setInbound(Boolean inbound) {
        this.inbound = inbound;
    }

    public ReplicaVmWhereInput inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public ReplicaVmWhereInput inbound_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public void setInbound_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        }
    }

    public boolean getInbound_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INBOUND);
    }

    public ReplicaVmWhereInput inboundNot(Boolean inboundNot) {

        this.inboundNot = inboundNot;
        return this;
    }

    /**
     * Get inboundNot
     *
     * @return inboundNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInboundNot() {
        return inboundNot;
    }

    public void setInboundNot(Boolean inboundNot) {
        this.inboundNot = inboundNot;
    }

    public ReplicaVmWhereInput inboundNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND_NOT);
        return this;
    }

    public ReplicaVmWhereInput inboundNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INBOUND_NOT);
        return this;
    }

    public void setInboundNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INBOUND_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INBOUND_NOT);
        }
    }

    public boolean getInboundNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INBOUND_NOT);
    }

    public ReplicaVmWhereInput iscsiLun(IscsiLunWhereInput iscsiLun) {

        this.iscsiLun = iscsiLun;
        return this;
    }

    /**
     * Get iscsiLun
     *
     * @return iscsiLun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLun() {
        return iscsiLun;
    }

    public void setIscsiLun(IscsiLunWhereInput iscsiLun) {
        this.iscsiLun = iscsiLun;
    }

    public ReplicaVmWhereInput iscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public ReplicaVmWhereInput iscsiLun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public void setIscsiLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        }
    }

    public boolean getIscsiLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN);
    }

    public ReplicaVmWhereInput originIscsiLun(IscsiLunWhereInput originIscsiLun) {

        this.originIscsiLun = originIscsiLun;
        return this;
    }

    /**
     * Get originIscsiLun
     *
     * @return originIscsiLun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getOriginIscsiLun() {
        return originIscsiLun;
    }

    public void setOriginIscsiLun(IscsiLunWhereInput originIscsiLun) {
        this.originIscsiLun = originIscsiLun;
    }

    public ReplicaVmWhereInput originIscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
        return this;
    }

    public ReplicaVmWhereInput originIscsiLun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
        return this;
    }

    public void setOriginIscsiLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
        }
    }

    public boolean getOriginIscsiLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
    }

    public ReplicaVmWhereInput originVm(VmWhereInput originVm) {

        this.originVm = originVm;
        return this;
    }

    /**
     * Get originVm
     *
     * @return originVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getOriginVm() {
        return originVm;
    }

    public void setOriginVm(VmWhereInput originVm) {
        this.originVm = originVm;
    }

    public ReplicaVmWhereInput originVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM);
        return this;
    }

    public ReplicaVmWhereInput originVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM);
        return this;
    }

    public void setOriginVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM);
        }
    }

    public boolean getOriginVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM);
    }

    public ReplicaVmWhereInput originVmClusterLocalId(String originVmClusterLocalId) {

        this.originVmClusterLocalId = originVmClusterLocalId;
        return this;
    }

    /**
     * Get originVmClusterLocalId
     *
     * @return originVmClusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalId() {
        return originVmClusterLocalId;
    }

    public void setOriginVmClusterLocalId(String originVmClusterLocalId) {
        this.originVmClusterLocalId = originVmClusterLocalId;
    }

    public ReplicaVmWhereInput originVmClusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setOriginVmClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getOriginVmClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdContains(
            String originVmClusterLocalIdContains) {

        this.originVmClusterLocalIdContains = originVmClusterLocalIdContains;
        return this;
    }

    /**
     * Get originVmClusterLocalIdContains
     *
     * @return originVmClusterLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdContains() {
        return originVmClusterLocalIdContains;
    }

    public void setOriginVmClusterLocalIdContains(String originVmClusterLocalIdContains) {
        this.originVmClusterLocalIdContains = originVmClusterLocalIdContains;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setOriginVmClusterLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getOriginVmClusterLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_CONTAINS);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdEndsWith(
            String originVmClusterLocalIdEndsWith) {

        this.originVmClusterLocalIdEndsWith = originVmClusterLocalIdEndsWith;
        return this;
    }

    /**
     * Get originVmClusterLocalIdEndsWith
     *
     * @return originVmClusterLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdEndsWith() {
        return originVmClusterLocalIdEndsWith;
    }

    public void setOriginVmClusterLocalIdEndsWith(String originVmClusterLocalIdEndsWith) {
        this.originVmClusterLocalIdEndsWith = originVmClusterLocalIdEndsWith;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setOriginVmClusterLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getOriginVmClusterLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGt(String originVmClusterLocalIdGt) {

        this.originVmClusterLocalIdGt = originVmClusterLocalIdGt;
        return this;
    }

    /**
     * Get originVmClusterLocalIdGt
     *
     * @return originVmClusterLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdGt() {
        return originVmClusterLocalIdGt;
    }

    public void setOriginVmClusterLocalIdGt(String originVmClusterLocalIdGt) {
        this.originVmClusterLocalIdGt = originVmClusterLocalIdGt;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public void setOriginVmClusterLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT);
        }
    }

    public boolean getOriginVmClusterLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GT);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGte(String originVmClusterLocalIdGte) {

        this.originVmClusterLocalIdGte = originVmClusterLocalIdGte;
        return this;
    }

    /**
     * Get originVmClusterLocalIdGte
     *
     * @return originVmClusterLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdGte() {
        return originVmClusterLocalIdGte;
    }

    public void setOriginVmClusterLocalIdGte(String originVmClusterLocalIdGte) {
        this.originVmClusterLocalIdGte = originVmClusterLocalIdGte;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public void setOriginVmClusterLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE);
        }
    }

    public boolean getOriginVmClusterLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_GTE);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdIn(List<String> originVmClusterLocalIdIn) {

        this.originVmClusterLocalIdIn = originVmClusterLocalIdIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmClusterLocalIdInItem(
            String originVmClusterLocalIdInItem) {
        if (this.originVmClusterLocalIdIn == null) {
            this.originVmClusterLocalIdIn = new ArrayList<String>();
        }
        this.originVmClusterLocalIdIn.add(originVmClusterLocalIdInItem);
        return this;
    }

    /**
     * Get originVmClusterLocalIdIn
     *
     * @return originVmClusterLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmClusterLocalIdIn() {
        return originVmClusterLocalIdIn;
    }

    public void setOriginVmClusterLocalIdIn(List<String> originVmClusterLocalIdIn) {
        this.originVmClusterLocalIdIn = originVmClusterLocalIdIn;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public void setOriginVmClusterLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN);
        }
    }

    public boolean getOriginVmClusterLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_IN);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLt(String originVmClusterLocalIdLt) {

        this.originVmClusterLocalIdLt = originVmClusterLocalIdLt;
        return this;
    }

    /**
     * Get originVmClusterLocalIdLt
     *
     * @return originVmClusterLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdLt() {
        return originVmClusterLocalIdLt;
    }

    public void setOriginVmClusterLocalIdLt(String originVmClusterLocalIdLt) {
        this.originVmClusterLocalIdLt = originVmClusterLocalIdLt;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public void setOriginVmClusterLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT);
        }
    }

    public boolean getOriginVmClusterLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LT);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLte(String originVmClusterLocalIdLte) {

        this.originVmClusterLocalIdLte = originVmClusterLocalIdLte;
        return this;
    }

    /**
     * Get originVmClusterLocalIdLte
     *
     * @return originVmClusterLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdLte() {
        return originVmClusterLocalIdLte;
    }

    public void setOriginVmClusterLocalIdLte(String originVmClusterLocalIdLte) {
        this.originVmClusterLocalIdLte = originVmClusterLocalIdLte;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public void setOriginVmClusterLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE);
        }
    }

    public boolean getOriginVmClusterLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_LTE);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNot(String originVmClusterLocalIdNot) {

        this.originVmClusterLocalIdNot = originVmClusterLocalIdNot;
        return this;
    }

    /**
     * Get originVmClusterLocalIdNot
     *
     * @return originVmClusterLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdNot() {
        return originVmClusterLocalIdNot;
    }

    public void setOriginVmClusterLocalIdNot(String originVmClusterLocalIdNot) {
        this.originVmClusterLocalIdNot = originVmClusterLocalIdNot;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public void setOriginVmClusterLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT);
        }
    }

    public boolean getOriginVmClusterLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotContains(
            String originVmClusterLocalIdNotContains) {

        this.originVmClusterLocalIdNotContains = originVmClusterLocalIdNotContains;
        return this;
    }

    /**
     * Get originVmClusterLocalIdNotContains
     *
     * @return originVmClusterLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdNotContains() {
        return originVmClusterLocalIdNotContains;
    }

    public void setOriginVmClusterLocalIdNotContains(String originVmClusterLocalIdNotContains) {
        this.originVmClusterLocalIdNotContains = originVmClusterLocalIdNotContains;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setOriginVmClusterLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getOriginVmClusterLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotEndsWith(
            String originVmClusterLocalIdNotEndsWith) {

        this.originVmClusterLocalIdNotEndsWith = originVmClusterLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get originVmClusterLocalIdNotEndsWith
     *
     * @return originVmClusterLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdNotEndsWith() {
        return originVmClusterLocalIdNotEndsWith;
    }

    public void setOriginVmClusterLocalIdNotEndsWith(String originVmClusterLocalIdNotEndsWith) {
        this.originVmClusterLocalIdNotEndsWith = originVmClusterLocalIdNotEndsWith;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginVmClusterLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginVmClusterLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotIn(
            List<String> originVmClusterLocalIdNotIn) {

        this.originVmClusterLocalIdNotIn = originVmClusterLocalIdNotIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmClusterLocalIdNotInItem(
            String originVmClusterLocalIdNotInItem) {
        if (this.originVmClusterLocalIdNotIn == null) {
            this.originVmClusterLocalIdNotIn = new ArrayList<String>();
        }
        this.originVmClusterLocalIdNotIn.add(originVmClusterLocalIdNotInItem);
        return this;
    }

    /**
     * Get originVmClusterLocalIdNotIn
     *
     * @return originVmClusterLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmClusterLocalIdNotIn() {
        return originVmClusterLocalIdNotIn;
    }

    public void setOriginVmClusterLocalIdNotIn(List<String> originVmClusterLocalIdNotIn) {
        this.originVmClusterLocalIdNotIn = originVmClusterLocalIdNotIn;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setOriginVmClusterLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getOriginVmClusterLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_IN);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotStartsWith(
            String originVmClusterLocalIdNotStartsWith) {

        this.originVmClusterLocalIdNotStartsWith = originVmClusterLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get originVmClusterLocalIdNotStartsWith
     *
     * @return originVmClusterLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdNotStartsWith() {
        return originVmClusterLocalIdNotStartsWith;
    }

    public void setOriginVmClusterLocalIdNotStartsWith(String originVmClusterLocalIdNotStartsWith) {
        this.originVmClusterLocalIdNotStartsWith = originVmClusterLocalIdNotStartsWith;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginVmClusterLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginVmClusterLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterLocalIdStartsWith(
            String originVmClusterLocalIdStartsWith) {

        this.originVmClusterLocalIdStartsWith = originVmClusterLocalIdStartsWith;
        return this;
    }

    /**
     * Get originVmClusterLocalIdStartsWith
     *
     * @return originVmClusterLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterLocalIdStartsWith() {
        return originVmClusterLocalIdStartsWith;
    }

    public void setOriginVmClusterLocalIdStartsWith(String originVmClusterLocalIdStartsWith) {
        this.originVmClusterLocalIdStartsWith = originVmClusterLocalIdStartsWith;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setOriginVmClusterLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getOriginVmClusterLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterName(String originVmClusterName) {

        this.originVmClusterName = originVmClusterName;
        return this;
    }

    /**
     * Get originVmClusterName
     *
     * @return originVmClusterName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterName() {
        return originVmClusterName;
    }

    public void setOriginVmClusterName(String originVmClusterName) {
        this.originVmClusterName = originVmClusterName;
    }

    public ReplicaVmWhereInput originVmClusterName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
        return this;
    }

    public void setOriginVmClusterName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
        }
    }

    public boolean getOriginVmClusterName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
    }

    public ReplicaVmWhereInput originVmClusterNameContains(String originVmClusterNameContains) {

        this.originVmClusterNameContains = originVmClusterNameContains;
        return this;
    }

    /**
     * Get originVmClusterNameContains
     *
     * @return originVmClusterNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameContains() {
        return originVmClusterNameContains;
    }

    public void setOriginVmClusterNameContains(String originVmClusterNameContains) {
        this.originVmClusterNameContains = originVmClusterNameContains;
    }

    public ReplicaVmWhereInput originVmClusterNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS);
        return this;
    }

    public void setOriginVmClusterNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS);
        }
    }

    public boolean getOriginVmClusterNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_CONTAINS);
    }

    public ReplicaVmWhereInput originVmClusterNameEndsWith(String originVmClusterNameEndsWith) {

        this.originVmClusterNameEndsWith = originVmClusterNameEndsWith;
        return this;
    }

    /**
     * Get originVmClusterNameEndsWith
     *
     * @return originVmClusterNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameEndsWith() {
        return originVmClusterNameEndsWith;
    }

    public void setOriginVmClusterNameEndsWith(String originVmClusterNameEndsWith) {
        this.originVmClusterNameEndsWith = originVmClusterNameEndsWith;
    }

    public ReplicaVmWhereInput originVmClusterNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH);
        return this;
    }

    public void setOriginVmClusterNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH);
        }
    }

    public boolean getOriginVmClusterNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterNameGt(String originVmClusterNameGt) {

        this.originVmClusterNameGt = originVmClusterNameGt;
        return this;
    }

    /**
     * Get originVmClusterNameGt
     *
     * @return originVmClusterNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameGt() {
        return originVmClusterNameGt;
    }

    public void setOriginVmClusterNameGt(String originVmClusterNameGt) {
        this.originVmClusterNameGt = originVmClusterNameGt;
    }

    public ReplicaVmWhereInput originVmClusterNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT);
        return this;
    }

    public void setOriginVmClusterNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT);
        }
    }

    public boolean getOriginVmClusterNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GT);
    }

    public ReplicaVmWhereInput originVmClusterNameGte(String originVmClusterNameGte) {

        this.originVmClusterNameGte = originVmClusterNameGte;
        return this;
    }

    /**
     * Get originVmClusterNameGte
     *
     * @return originVmClusterNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameGte() {
        return originVmClusterNameGte;
    }

    public void setOriginVmClusterNameGte(String originVmClusterNameGte) {
        this.originVmClusterNameGte = originVmClusterNameGte;
    }

    public ReplicaVmWhereInput originVmClusterNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE);
        return this;
    }

    public void setOriginVmClusterNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE);
        }
    }

    public boolean getOriginVmClusterNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_GTE);
    }

    public ReplicaVmWhereInput originVmClusterNameIn(List<String> originVmClusterNameIn) {

        this.originVmClusterNameIn = originVmClusterNameIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmClusterNameInItem(String originVmClusterNameInItem) {
        if (this.originVmClusterNameIn == null) {
            this.originVmClusterNameIn = new ArrayList<String>();
        }
        this.originVmClusterNameIn.add(originVmClusterNameInItem);
        return this;
    }

    /**
     * Get originVmClusterNameIn
     *
     * @return originVmClusterNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmClusterNameIn() {
        return originVmClusterNameIn;
    }

    public void setOriginVmClusterNameIn(List<String> originVmClusterNameIn) {
        this.originVmClusterNameIn = originVmClusterNameIn;
    }

    public ReplicaVmWhereInput originVmClusterNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN);
        return this;
    }

    public void setOriginVmClusterNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN);
        }
    }

    public boolean getOriginVmClusterNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_IN);
    }

    public ReplicaVmWhereInput originVmClusterNameLt(String originVmClusterNameLt) {

        this.originVmClusterNameLt = originVmClusterNameLt;
        return this;
    }

    /**
     * Get originVmClusterNameLt
     *
     * @return originVmClusterNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameLt() {
        return originVmClusterNameLt;
    }

    public void setOriginVmClusterNameLt(String originVmClusterNameLt) {
        this.originVmClusterNameLt = originVmClusterNameLt;
    }

    public ReplicaVmWhereInput originVmClusterNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT);
        return this;
    }

    public void setOriginVmClusterNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT);
        }
    }

    public boolean getOriginVmClusterNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LT);
    }

    public ReplicaVmWhereInput originVmClusterNameLte(String originVmClusterNameLte) {

        this.originVmClusterNameLte = originVmClusterNameLte;
        return this;
    }

    /**
     * Get originVmClusterNameLte
     *
     * @return originVmClusterNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameLte() {
        return originVmClusterNameLte;
    }

    public void setOriginVmClusterNameLte(String originVmClusterNameLte) {
        this.originVmClusterNameLte = originVmClusterNameLte;
    }

    public ReplicaVmWhereInput originVmClusterNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE);
        return this;
    }

    public void setOriginVmClusterNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE);
        }
    }

    public boolean getOriginVmClusterNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_LTE);
    }

    public ReplicaVmWhereInput originVmClusterNameNot(String originVmClusterNameNot) {

        this.originVmClusterNameNot = originVmClusterNameNot;
        return this;
    }

    /**
     * Get originVmClusterNameNot
     *
     * @return originVmClusterNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameNot() {
        return originVmClusterNameNot;
    }

    public void setOriginVmClusterNameNot(String originVmClusterNameNot) {
        this.originVmClusterNameNot = originVmClusterNameNot;
    }

    public ReplicaVmWhereInput originVmClusterNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT);
        return this;
    }

    public void setOriginVmClusterNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT);
        }
    }

    public boolean getOriginVmClusterNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT);
    }

    public ReplicaVmWhereInput originVmClusterNameNotContains(
            String originVmClusterNameNotContains) {

        this.originVmClusterNameNotContains = originVmClusterNameNotContains;
        return this;
    }

    /**
     * Get originVmClusterNameNotContains
     *
     * @return originVmClusterNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameNotContains() {
        return originVmClusterNameNotContains;
    }

    public void setOriginVmClusterNameNotContains(String originVmClusterNameNotContains) {
        this.originVmClusterNameNotContains = originVmClusterNameNotContains;
    }

    public ReplicaVmWhereInput originVmClusterNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS);
        return this;
    }

    public void setOriginVmClusterNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS);
        }
    }

    public boolean getOriginVmClusterNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput originVmClusterNameNotEndsWith(
            String originVmClusterNameNotEndsWith) {

        this.originVmClusterNameNotEndsWith = originVmClusterNameNotEndsWith;
        return this;
    }

    /**
     * Get originVmClusterNameNotEndsWith
     *
     * @return originVmClusterNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameNotEndsWith() {
        return originVmClusterNameNotEndsWith;
    }

    public void setOriginVmClusterNameNotEndsWith(String originVmClusterNameNotEndsWith) {
        this.originVmClusterNameNotEndsWith = originVmClusterNameNotEndsWith;
    }

    public ReplicaVmWhereInput originVmClusterNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginVmClusterNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginVmClusterNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterNameNotIn(List<String> originVmClusterNameNotIn) {

        this.originVmClusterNameNotIn = originVmClusterNameNotIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmClusterNameNotInItem(
            String originVmClusterNameNotInItem) {
        if (this.originVmClusterNameNotIn == null) {
            this.originVmClusterNameNotIn = new ArrayList<String>();
        }
        this.originVmClusterNameNotIn.add(originVmClusterNameNotInItem);
        return this;
    }

    /**
     * Get originVmClusterNameNotIn
     *
     * @return originVmClusterNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmClusterNameNotIn() {
        return originVmClusterNameNotIn;
    }

    public void setOriginVmClusterNameNotIn(List<String> originVmClusterNameNotIn) {
        this.originVmClusterNameNotIn = originVmClusterNameNotIn;
    }

    public ReplicaVmWhereInput originVmClusterNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN);
        return this;
    }

    public void setOriginVmClusterNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN);
        }
    }

    public boolean getOriginVmClusterNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_IN);
    }

    public ReplicaVmWhereInput originVmClusterNameNotStartsWith(
            String originVmClusterNameNotStartsWith) {

        this.originVmClusterNameNotStartsWith = originVmClusterNameNotStartsWith;
        return this;
    }

    /**
     * Get originVmClusterNameNotStartsWith
     *
     * @return originVmClusterNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameNotStartsWith() {
        return originVmClusterNameNotStartsWith;
    }

    public void setOriginVmClusterNameNotStartsWith(String originVmClusterNameNotStartsWith) {
        this.originVmClusterNameNotStartsWith = originVmClusterNameNotStartsWith;
    }

    public ReplicaVmWhereInput originVmClusterNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginVmClusterNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginVmClusterNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmClusterNameStartsWith(String originVmClusterNameStartsWith) {

        this.originVmClusterNameStartsWith = originVmClusterNameStartsWith;
        return this;
    }

    /**
     * Get originVmClusterNameStartsWith
     *
     * @return originVmClusterNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmClusterNameStartsWith() {
        return originVmClusterNameStartsWith;
    }

    public void setOriginVmClusterNameStartsWith(String originVmClusterNameStartsWith) {
        this.originVmClusterNameStartsWith = originVmClusterNameStartsWith;
    }

    public ReplicaVmWhereInput originVmClusterNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmClusterNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH);
        return this;
    }

    public void setOriginVmClusterNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH);
        }
    }

    public boolean getOriginVmClusterNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmLocalId(String originVmLocalId) {

        this.originVmLocalId = originVmLocalId;
        return this;
    }

    /**
     * Get originVmLocalId
     *
     * @return originVmLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalId() {
        return originVmLocalId;
    }

    public void setOriginVmLocalId(String originVmLocalId) {
        this.originVmLocalId = originVmLocalId;
    }

    public ReplicaVmWhereInput originVmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
        return this;
    }

    public void setOriginVmLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
        }
    }

    public boolean getOriginVmLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
    }

    public ReplicaVmWhereInput originVmLocalIdContains(String originVmLocalIdContains) {

        this.originVmLocalIdContains = originVmLocalIdContains;
        return this;
    }

    /**
     * Get originVmLocalIdContains
     *
     * @return originVmLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdContains() {
        return originVmLocalIdContains;
    }

    public void setOriginVmLocalIdContains(String originVmLocalIdContains) {
        this.originVmLocalIdContains = originVmLocalIdContains;
    }

    public ReplicaVmWhereInput originVmLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setOriginVmLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getOriginVmLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_CONTAINS);
    }

    public ReplicaVmWhereInput originVmLocalIdEndsWith(String originVmLocalIdEndsWith) {

        this.originVmLocalIdEndsWith = originVmLocalIdEndsWith;
        return this;
    }

    /**
     * Get originVmLocalIdEndsWith
     *
     * @return originVmLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdEndsWith() {
        return originVmLocalIdEndsWith;
    }

    public void setOriginVmLocalIdEndsWith(String originVmLocalIdEndsWith) {
        this.originVmLocalIdEndsWith = originVmLocalIdEndsWith;
    }

    public ReplicaVmWhereInput originVmLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setOriginVmLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getOriginVmLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmLocalIdGt(String originVmLocalIdGt) {

        this.originVmLocalIdGt = originVmLocalIdGt;
        return this;
    }

    /**
     * Get originVmLocalIdGt
     *
     * @return originVmLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdGt() {
        return originVmLocalIdGt;
    }

    public void setOriginVmLocalIdGt(String originVmLocalIdGt) {
        this.originVmLocalIdGt = originVmLocalIdGt;
    }

    public ReplicaVmWhereInput originVmLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT);
        return this;
    }

    public void setOriginVmLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT);
        }
    }

    public boolean getOriginVmLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GT);
    }

    public ReplicaVmWhereInput originVmLocalIdGte(String originVmLocalIdGte) {

        this.originVmLocalIdGte = originVmLocalIdGte;
        return this;
    }

    /**
     * Get originVmLocalIdGte
     *
     * @return originVmLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdGte() {
        return originVmLocalIdGte;
    }

    public void setOriginVmLocalIdGte(String originVmLocalIdGte) {
        this.originVmLocalIdGte = originVmLocalIdGte;
    }

    public ReplicaVmWhereInput originVmLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE);
        return this;
    }

    public void setOriginVmLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE);
        }
    }

    public boolean getOriginVmLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_GTE);
    }

    public ReplicaVmWhereInput originVmLocalIdIn(List<String> originVmLocalIdIn) {

        this.originVmLocalIdIn = originVmLocalIdIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmLocalIdInItem(String originVmLocalIdInItem) {
        if (this.originVmLocalIdIn == null) {
            this.originVmLocalIdIn = new ArrayList<String>();
        }
        this.originVmLocalIdIn.add(originVmLocalIdInItem);
        return this;
    }

    /**
     * Get originVmLocalIdIn
     *
     * @return originVmLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmLocalIdIn() {
        return originVmLocalIdIn;
    }

    public void setOriginVmLocalIdIn(List<String> originVmLocalIdIn) {
        this.originVmLocalIdIn = originVmLocalIdIn;
    }

    public ReplicaVmWhereInput originVmLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN);
        return this;
    }

    public void setOriginVmLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN);
        }
    }

    public boolean getOriginVmLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_IN);
    }

    public ReplicaVmWhereInput originVmLocalIdLt(String originVmLocalIdLt) {

        this.originVmLocalIdLt = originVmLocalIdLt;
        return this;
    }

    /**
     * Get originVmLocalIdLt
     *
     * @return originVmLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdLt() {
        return originVmLocalIdLt;
    }

    public void setOriginVmLocalIdLt(String originVmLocalIdLt) {
        this.originVmLocalIdLt = originVmLocalIdLt;
    }

    public ReplicaVmWhereInput originVmLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT);
        return this;
    }

    public void setOriginVmLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT);
        }
    }

    public boolean getOriginVmLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LT);
    }

    public ReplicaVmWhereInput originVmLocalIdLte(String originVmLocalIdLte) {

        this.originVmLocalIdLte = originVmLocalIdLte;
        return this;
    }

    /**
     * Get originVmLocalIdLte
     *
     * @return originVmLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdLte() {
        return originVmLocalIdLte;
    }

    public void setOriginVmLocalIdLte(String originVmLocalIdLte) {
        this.originVmLocalIdLte = originVmLocalIdLte;
    }

    public ReplicaVmWhereInput originVmLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE);
        return this;
    }

    public void setOriginVmLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE);
        }
    }

    public boolean getOriginVmLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_LTE);
    }

    public ReplicaVmWhereInput originVmLocalIdNot(String originVmLocalIdNot) {

        this.originVmLocalIdNot = originVmLocalIdNot;
        return this;
    }

    /**
     * Get originVmLocalIdNot
     *
     * @return originVmLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdNot() {
        return originVmLocalIdNot;
    }

    public void setOriginVmLocalIdNot(String originVmLocalIdNot) {
        this.originVmLocalIdNot = originVmLocalIdNot;
    }

    public ReplicaVmWhereInput originVmLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT);
        return this;
    }

    public void setOriginVmLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT);
        }
    }

    public boolean getOriginVmLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT);
    }

    public ReplicaVmWhereInput originVmLocalIdNotContains(String originVmLocalIdNotContains) {

        this.originVmLocalIdNotContains = originVmLocalIdNotContains;
        return this;
    }

    /**
     * Get originVmLocalIdNotContains
     *
     * @return originVmLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdNotContains() {
        return originVmLocalIdNotContains;
    }

    public void setOriginVmLocalIdNotContains(String originVmLocalIdNotContains) {
        this.originVmLocalIdNotContains = originVmLocalIdNotContains;
    }

    public ReplicaVmWhereInput originVmLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setOriginVmLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getOriginVmLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput originVmLocalIdNotEndsWith(String originVmLocalIdNotEndsWith) {

        this.originVmLocalIdNotEndsWith = originVmLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get originVmLocalIdNotEndsWith
     *
     * @return originVmLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdNotEndsWith() {
        return originVmLocalIdNotEndsWith;
    }

    public void setOriginVmLocalIdNotEndsWith(String originVmLocalIdNotEndsWith) {
        this.originVmLocalIdNotEndsWith = originVmLocalIdNotEndsWith;
    }

    public ReplicaVmWhereInput originVmLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginVmLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginVmLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmLocalIdNotIn(List<String> originVmLocalIdNotIn) {

        this.originVmLocalIdNotIn = originVmLocalIdNotIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmLocalIdNotInItem(String originVmLocalIdNotInItem) {
        if (this.originVmLocalIdNotIn == null) {
            this.originVmLocalIdNotIn = new ArrayList<String>();
        }
        this.originVmLocalIdNotIn.add(originVmLocalIdNotInItem);
        return this;
    }

    /**
     * Get originVmLocalIdNotIn
     *
     * @return originVmLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmLocalIdNotIn() {
        return originVmLocalIdNotIn;
    }

    public void setOriginVmLocalIdNotIn(List<String> originVmLocalIdNotIn) {
        this.originVmLocalIdNotIn = originVmLocalIdNotIn;
    }

    public ReplicaVmWhereInput originVmLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setOriginVmLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getOriginVmLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_IN);
    }

    public ReplicaVmWhereInput originVmLocalIdNotStartsWith(String originVmLocalIdNotStartsWith) {

        this.originVmLocalIdNotStartsWith = originVmLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get originVmLocalIdNotStartsWith
     *
     * @return originVmLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdNotStartsWith() {
        return originVmLocalIdNotStartsWith;
    }

    public void setOriginVmLocalIdNotStartsWith(String originVmLocalIdNotStartsWith) {
        this.originVmLocalIdNotStartsWith = originVmLocalIdNotStartsWith;
    }

    public ReplicaVmWhereInput originVmLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginVmLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginVmLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmLocalIdStartsWith(String originVmLocalIdStartsWith) {

        this.originVmLocalIdStartsWith = originVmLocalIdStartsWith;
        return this;
    }

    /**
     * Get originVmLocalIdStartsWith
     *
     * @return originVmLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmLocalIdStartsWith() {
        return originVmLocalIdStartsWith;
    }

    public void setOriginVmLocalIdStartsWith(String originVmLocalIdStartsWith) {
        this.originVmLocalIdStartsWith = originVmLocalIdStartsWith;
    }

    public ReplicaVmWhereInput originVmLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setOriginVmLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getOriginVmLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmName(String originVmName) {

        this.originVmName = originVmName;
        return this;
    }

    /**
     * Get originVmName
     *
     * @return originVmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmName() {
        return originVmName;
    }

    public void setOriginVmName(String originVmName) {
        this.originVmName = originVmName;
    }

    public ReplicaVmWhereInput originVmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME);
        return this;
    }

    public ReplicaVmWhereInput originVmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME);
        return this;
    }

    public void setOriginVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME);
        }
    }

    public boolean getOriginVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME);
    }

    public ReplicaVmWhereInput originVmNameContains(String originVmNameContains) {

        this.originVmNameContains = originVmNameContains;
        return this;
    }

    /**
     * Get originVmNameContains
     *
     * @return originVmNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameContains() {
        return originVmNameContains;
    }

    public void setOriginVmNameContains(String originVmNameContains) {
        this.originVmNameContains = originVmNameContains;
    }

    public ReplicaVmWhereInput originVmNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS);
        return this;
    }

    public void setOriginVmNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS);
        }
    }

    public boolean getOriginVmNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_CONTAINS);
    }

    public ReplicaVmWhereInput originVmNameEndsWith(String originVmNameEndsWith) {

        this.originVmNameEndsWith = originVmNameEndsWith;
        return this;
    }

    /**
     * Get originVmNameEndsWith
     *
     * @return originVmNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameEndsWith() {
        return originVmNameEndsWith;
    }

    public void setOriginVmNameEndsWith(String originVmNameEndsWith) {
        this.originVmNameEndsWith = originVmNameEndsWith;
    }

    public ReplicaVmWhereInput originVmNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH);
        return this;
    }

    public void setOriginVmNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH);
        }
    }

    public boolean getOriginVmNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmNameGt(String originVmNameGt) {

        this.originVmNameGt = originVmNameGt;
        return this;
    }

    /**
     * Get originVmNameGt
     *
     * @return originVmNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameGt() {
        return originVmNameGt;
    }

    public void setOriginVmNameGt(String originVmNameGt) {
        this.originVmNameGt = originVmNameGt;
    }

    public ReplicaVmWhereInput originVmNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_GT);
        return this;
    }

    public ReplicaVmWhereInput originVmNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_GT);
        return this;
    }

    public void setOriginVmNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_GT);
        }
    }

    public boolean getOriginVmNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_GT);
    }

    public ReplicaVmWhereInput originVmNameGte(String originVmNameGte) {

        this.originVmNameGte = originVmNameGte;
        return this;
    }

    /**
     * Get originVmNameGte
     *
     * @return originVmNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameGte() {
        return originVmNameGte;
    }

    public void setOriginVmNameGte(String originVmNameGte) {
        this.originVmNameGte = originVmNameGte;
    }

    public ReplicaVmWhereInput originVmNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE);
        return this;
    }

    public ReplicaVmWhereInput originVmNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE);
        return this;
    }

    public void setOriginVmNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE);
        }
    }

    public boolean getOriginVmNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_GTE);
    }

    public ReplicaVmWhereInput originVmNameIn(List<String> originVmNameIn) {

        this.originVmNameIn = originVmNameIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmNameInItem(String originVmNameInItem) {
        if (this.originVmNameIn == null) {
            this.originVmNameIn = new ArrayList<String>();
        }
        this.originVmNameIn.add(originVmNameInItem);
        return this;
    }

    /**
     * Get originVmNameIn
     *
     * @return originVmNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmNameIn() {
        return originVmNameIn;
    }

    public void setOriginVmNameIn(List<String> originVmNameIn) {
        this.originVmNameIn = originVmNameIn;
    }

    public ReplicaVmWhereInput originVmNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_IN);
        return this;
    }

    public void setOriginVmNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_IN);
        }
    }

    public boolean getOriginVmNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_IN);
    }

    public ReplicaVmWhereInput originVmNameLt(String originVmNameLt) {

        this.originVmNameLt = originVmNameLt;
        return this;
    }

    /**
     * Get originVmNameLt
     *
     * @return originVmNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameLt() {
        return originVmNameLt;
    }

    public void setOriginVmNameLt(String originVmNameLt) {
        this.originVmNameLt = originVmNameLt;
    }

    public ReplicaVmWhereInput originVmNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_LT);
        return this;
    }

    public ReplicaVmWhereInput originVmNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_LT);
        return this;
    }

    public void setOriginVmNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_LT);
        }
    }

    public boolean getOriginVmNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_LT);
    }

    public ReplicaVmWhereInput originVmNameLte(String originVmNameLte) {

        this.originVmNameLte = originVmNameLte;
        return this;
    }

    /**
     * Get originVmNameLte
     *
     * @return originVmNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameLte() {
        return originVmNameLte;
    }

    public void setOriginVmNameLte(String originVmNameLte) {
        this.originVmNameLte = originVmNameLte;
    }

    public ReplicaVmWhereInput originVmNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE);
        return this;
    }

    public ReplicaVmWhereInput originVmNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE);
        return this;
    }

    public void setOriginVmNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE);
        }
    }

    public boolean getOriginVmNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_LTE);
    }

    public ReplicaVmWhereInput originVmNameNot(String originVmNameNot) {

        this.originVmNameNot = originVmNameNot;
        return this;
    }

    /**
     * Get originVmNameNot
     *
     * @return originVmNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameNot() {
        return originVmNameNot;
    }

    public void setOriginVmNameNot(String originVmNameNot) {
        this.originVmNameNot = originVmNameNot;
    }

    public ReplicaVmWhereInput originVmNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT);
        return this;
    }

    public ReplicaVmWhereInput originVmNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT);
        return this;
    }

    public void setOriginVmNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT);
        }
    }

    public boolean getOriginVmNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT);
    }

    public ReplicaVmWhereInput originVmNameNotContains(String originVmNameNotContains) {

        this.originVmNameNotContains = originVmNameNotContains;
        return this;
    }

    /**
     * Get originVmNameNotContains
     *
     * @return originVmNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameNotContains() {
        return originVmNameNotContains;
    }

    public void setOriginVmNameNotContains(String originVmNameNotContains) {
        this.originVmNameNotContains = originVmNameNotContains;
    }

    public ReplicaVmWhereInput originVmNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput originVmNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public void setOriginVmNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS);
        }
    }

    public boolean getOriginVmNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput originVmNameNotEndsWith(String originVmNameNotEndsWith) {

        this.originVmNameNotEndsWith = originVmNameNotEndsWith;
        return this;
    }

    /**
     * Get originVmNameNotEndsWith
     *
     * @return originVmNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameNotEndsWith() {
        return originVmNameNotEndsWith;
    }

    public void setOriginVmNameNotEndsWith(String originVmNameNotEndsWith) {
        this.originVmNameNotEndsWith = originVmNameNotEndsWith;
    }

    public ReplicaVmWhereInput originVmNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginVmNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginVmNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput originVmNameNotIn(List<String> originVmNameNotIn) {

        this.originVmNameNotIn = originVmNameNotIn;
        return this;
    }

    public ReplicaVmWhereInput addOriginVmNameNotInItem(String originVmNameNotInItem) {
        if (this.originVmNameNotIn == null) {
            this.originVmNameNotIn = new ArrayList<String>();
        }
        this.originVmNameNotIn.add(originVmNameNotInItem);
        return this;
    }

    /**
     * Get originVmNameNotIn
     *
     * @return originVmNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginVmNameNotIn() {
        return originVmNameNotIn;
    }

    public void setOriginVmNameNotIn(List<String> originVmNameNotIn) {
        this.originVmNameNotIn = originVmNameNotIn;
    }

    public ReplicaVmWhereInput originVmNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput originVmNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN);
        return this;
    }

    public void setOriginVmNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN);
        }
    }

    public boolean getOriginVmNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_IN);
    }

    public ReplicaVmWhereInput originVmNameNotStartsWith(String originVmNameNotStartsWith) {

        this.originVmNameNotStartsWith = originVmNameNotStartsWith;
        return this;
    }

    /**
     * Get originVmNameNotStartsWith
     *
     * @return originVmNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameNotStartsWith() {
        return originVmNameNotStartsWith;
    }

    public void setOriginVmNameNotStartsWith(String originVmNameNotStartsWith) {
        this.originVmNameNotStartsWith = originVmNameNotStartsWith;
    }

    public ReplicaVmWhereInput originVmNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginVmNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginVmNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput originVmNameStartsWith(String originVmNameStartsWith) {

        this.originVmNameStartsWith = originVmNameStartsWith;
        return this;
    }

    /**
     * Get originVmNameStartsWith
     *
     * @return originVmNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginVmNameStartsWith() {
        return originVmNameStartsWith;
    }

    public void setOriginVmNameStartsWith(String originVmNameStartsWith) {
        this.originVmNameStartsWith = originVmNameStartsWith;
    }

    public ReplicaVmWhereInput originVmNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput originVmNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH);
        return this;
    }

    public void setOriginVmNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH);
        }
    }

    public boolean getOriginVmNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_VM_NAME_STARTS_WITH);
    }

    public ReplicaVmWhereInput replicaGroup(String replicaGroup) {

        this.replicaGroup = replicaGroup;
        return this;
    }

    /**
     * Get replicaGroup
     *
     * @return replicaGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroup() {
        return replicaGroup;
    }

    public void setReplicaGroup(String replicaGroup) {
        this.replicaGroup = replicaGroup;
    }

    public ReplicaVmWhereInput replicaGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP);
        return this;
    }

    public ReplicaVmWhereInput replicaGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP);
        return this;
    }

    public void setReplicaGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP);
        }
    }

    public boolean getReplicaGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP);
    }

    public ReplicaVmWhereInput replicaGroupContains(String replicaGroupContains) {

        this.replicaGroupContains = replicaGroupContains;
        return this;
    }

    /**
     * Get replicaGroupContains
     *
     * @return replicaGroupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupContains() {
        return replicaGroupContains;
    }

    public void setReplicaGroupContains(String replicaGroupContains) {
        this.replicaGroupContains = replicaGroupContains;
    }

    public ReplicaVmWhereInput replicaGroupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS);
        return this;
    }

    public void setReplicaGroupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS);
        }
    }

    public boolean getReplicaGroupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_CONTAINS);
    }

    public ReplicaVmWhereInput replicaGroupEndsWith(String replicaGroupEndsWith) {

        this.replicaGroupEndsWith = replicaGroupEndsWith;
        return this;
    }

    /**
     * Get replicaGroupEndsWith
     *
     * @return replicaGroupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupEndsWith() {
        return replicaGroupEndsWith;
    }

    public void setReplicaGroupEndsWith(String replicaGroupEndsWith) {
        this.replicaGroupEndsWith = replicaGroupEndsWith;
    }

    public ReplicaVmWhereInput replicaGroupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH);
        return this;
    }

    public void setReplicaGroupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH);
        }
    }

    public boolean getReplicaGroupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_ENDS_WITH);
    }

    public ReplicaVmWhereInput replicaGroupGt(String replicaGroupGt) {

        this.replicaGroupGt = replicaGroupGt;
        return this;
    }

    /**
     * Get replicaGroupGt
     *
     * @return replicaGroupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupGt() {
        return replicaGroupGt;
    }

    public void setReplicaGroupGt(String replicaGroupGt) {
        this.replicaGroupGt = replicaGroupGt;
    }

    public ReplicaVmWhereInput replicaGroupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_GT);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_GT);
        return this;
    }

    public void setReplicaGroupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_GT);
        }
    }

    public boolean getReplicaGroupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_GT);
    }

    public ReplicaVmWhereInput replicaGroupGte(String replicaGroupGte) {

        this.replicaGroupGte = replicaGroupGte;
        return this;
    }

    /**
     * Get replicaGroupGte
     *
     * @return replicaGroupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupGte() {
        return replicaGroupGte;
    }

    public void setReplicaGroupGte(String replicaGroupGte) {
        this.replicaGroupGte = replicaGroupGte;
    }

    public ReplicaVmWhereInput replicaGroupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_GTE);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_GTE);
        return this;
    }

    public void setReplicaGroupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_GTE);
        }
    }

    public boolean getReplicaGroupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_GTE);
    }

    public ReplicaVmWhereInput replicaGroupIn(List<String> replicaGroupIn) {

        this.replicaGroupIn = replicaGroupIn;
        return this;
    }

    public ReplicaVmWhereInput addReplicaGroupInItem(String replicaGroupInItem) {
        if (this.replicaGroupIn == null) {
            this.replicaGroupIn = new ArrayList<String>();
        }
        this.replicaGroupIn.add(replicaGroupInItem);
        return this;
    }

    /**
     * Get replicaGroupIn
     *
     * @return replicaGroupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicaGroupIn() {
        return replicaGroupIn;
    }

    public void setReplicaGroupIn(List<String> replicaGroupIn) {
        this.replicaGroupIn = replicaGroupIn;
    }

    public ReplicaVmWhereInput replicaGroupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_IN);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_IN);
        return this;
    }

    public void setReplicaGroupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_IN);
        }
    }

    public boolean getReplicaGroupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_IN);
    }

    public ReplicaVmWhereInput replicaGroupLt(String replicaGroupLt) {

        this.replicaGroupLt = replicaGroupLt;
        return this;
    }

    /**
     * Get replicaGroupLt
     *
     * @return replicaGroupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupLt() {
        return replicaGroupLt;
    }

    public void setReplicaGroupLt(String replicaGroupLt) {
        this.replicaGroupLt = replicaGroupLt;
    }

    public ReplicaVmWhereInput replicaGroupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_LT);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_LT);
        return this;
    }

    public void setReplicaGroupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_LT);
        }
    }

    public boolean getReplicaGroupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_LT);
    }

    public ReplicaVmWhereInput replicaGroupLte(String replicaGroupLte) {

        this.replicaGroupLte = replicaGroupLte;
        return this;
    }

    /**
     * Get replicaGroupLte
     *
     * @return replicaGroupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupLte() {
        return replicaGroupLte;
    }

    public void setReplicaGroupLte(String replicaGroupLte) {
        this.replicaGroupLte = replicaGroupLte;
    }

    public ReplicaVmWhereInput replicaGroupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_LTE);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_LTE);
        return this;
    }

    public void setReplicaGroupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_LTE);
        }
    }

    public boolean getReplicaGroupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_LTE);
    }

    public ReplicaVmWhereInput replicaGroupNot(String replicaGroupNot) {

        this.replicaGroupNot = replicaGroupNot;
        return this;
    }

    /**
     * Get replicaGroupNot
     *
     * @return replicaGroupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupNot() {
        return replicaGroupNot;
    }

    public void setReplicaGroupNot(String replicaGroupNot) {
        this.replicaGroupNot = replicaGroupNot;
    }

    public ReplicaVmWhereInput replicaGroupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT);
        return this;
    }

    public void setReplicaGroupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT);
        }
    }

    public boolean getReplicaGroupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_NOT);
    }

    public ReplicaVmWhereInput replicaGroupNotContains(String replicaGroupNotContains) {

        this.replicaGroupNotContains = replicaGroupNotContains;
        return this;
    }

    /**
     * Get replicaGroupNotContains
     *
     * @return replicaGroupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupNotContains() {
        return replicaGroupNotContains;
    }

    public void setReplicaGroupNotContains(String replicaGroupNotContains) {
        this.replicaGroupNotContains = replicaGroupNotContains;
    }

    public ReplicaVmWhereInput replicaGroupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS);
        return this;
    }

    public void setReplicaGroupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS);
        }
    }

    public boolean getReplicaGroupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput replicaGroupNotEndsWith(String replicaGroupNotEndsWith) {

        this.replicaGroupNotEndsWith = replicaGroupNotEndsWith;
        return this;
    }

    /**
     * Get replicaGroupNotEndsWith
     *
     * @return replicaGroupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupNotEndsWith() {
        return replicaGroupNotEndsWith;
    }

    public void setReplicaGroupNotEndsWith(String replicaGroupNotEndsWith) {
        this.replicaGroupNotEndsWith = replicaGroupNotEndsWith;
    }

    public ReplicaVmWhereInput replicaGroupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public void setReplicaGroupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH);
        }
    }

    public boolean getReplicaGroupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput replicaGroupNotIn(List<String> replicaGroupNotIn) {

        this.replicaGroupNotIn = replicaGroupNotIn;
        return this;
    }

    public ReplicaVmWhereInput addReplicaGroupNotInItem(String replicaGroupNotInItem) {
        if (this.replicaGroupNotIn == null) {
            this.replicaGroupNotIn = new ArrayList<String>();
        }
        this.replicaGroupNotIn.add(replicaGroupNotInItem);
        return this;
    }

    /**
     * Get replicaGroupNotIn
     *
     * @return replicaGroupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicaGroupNotIn() {
        return replicaGroupNotIn;
    }

    public void setReplicaGroupNotIn(List<String> replicaGroupNotIn) {
        this.replicaGroupNotIn = replicaGroupNotIn;
    }

    public ReplicaVmWhereInput replicaGroupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN);
        return this;
    }

    public void setReplicaGroupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN);
        }
    }

    public boolean getReplicaGroupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_NOT_IN);
    }

    public ReplicaVmWhereInput replicaGroupNotStartsWith(String replicaGroupNotStartsWith) {

        this.replicaGroupNotStartsWith = replicaGroupNotStartsWith;
        return this;
    }

    /**
     * Get replicaGroupNotStartsWith
     *
     * @return replicaGroupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupNotStartsWith() {
        return replicaGroupNotStartsWith;
    }

    public void setReplicaGroupNotStartsWith(String replicaGroupNotStartsWith) {
        this.replicaGroupNotStartsWith = replicaGroupNotStartsWith;
    }

    public ReplicaVmWhereInput replicaGroupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public void setReplicaGroupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH);
        }
    }

    public boolean getReplicaGroupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput replicaGroupStartsWith(String replicaGroupStartsWith) {

        this.replicaGroupStartsWith = replicaGroupStartsWith;
        return this;
    }

    /**
     * Get replicaGroupStartsWith
     *
     * @return replicaGroupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaGroupStartsWith() {
        return replicaGroupStartsWith;
    }

    public void setReplicaGroupStartsWith(String replicaGroupStartsWith) {
        this.replicaGroupStartsWith = replicaGroupStartsWith;
    }

    public ReplicaVmWhereInput replicaGroupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicaGroupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH);
        return this;
    }

    public void setReplicaGroupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH);
        }
    }

    public boolean getReplicaGroupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_GROUP_STARTS_WITH);
    }

    public ReplicaVmWhereInput replicationGroup(String replicationGroup) {

        this.replicationGroup = replicationGroup;
        return this;
    }

    /**
     * Get replicationGroup
     *
     * @return replicationGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroup() {
        return replicationGroup;
    }

    public void setReplicationGroup(String replicationGroup) {
        this.replicationGroup = replicationGroup;
    }

    public ReplicaVmWhereInput replicationGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP);
        return this;
    }

    public ReplicaVmWhereInput replicationGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP);
        return this;
    }

    public void setReplicationGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP);
        }
    }

    public boolean getReplicationGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP);
    }

    public ReplicaVmWhereInput replicationGroupContains(String replicationGroupContains) {

        this.replicationGroupContains = replicationGroupContains;
        return this;
    }

    /**
     * Get replicationGroupContains
     *
     * @return replicationGroupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupContains() {
        return replicationGroupContains;
    }

    public void setReplicationGroupContains(String replicationGroupContains) {
        this.replicationGroupContains = replicationGroupContains;
    }

    public ReplicaVmWhereInput replicationGroupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS);
        return this;
    }

    public void setReplicationGroupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS);
        }
    }

    public boolean getReplicationGroupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_CONTAINS);
    }

    public ReplicaVmWhereInput replicationGroupEndsWith(String replicationGroupEndsWith) {

        this.replicationGroupEndsWith = replicationGroupEndsWith;
        return this;
    }

    /**
     * Get replicationGroupEndsWith
     *
     * @return replicationGroupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupEndsWith() {
        return replicationGroupEndsWith;
    }

    public void setReplicationGroupEndsWith(String replicationGroupEndsWith) {
        this.replicationGroupEndsWith = replicationGroupEndsWith;
    }

    public ReplicaVmWhereInput replicationGroupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH);
        return this;
    }

    public void setReplicationGroupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH);
        }
    }

    public boolean getReplicationGroupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_ENDS_WITH);
    }

    public ReplicaVmWhereInput replicationGroupGt(String replicationGroupGt) {

        this.replicationGroupGt = replicationGroupGt;
        return this;
    }

    /**
     * Get replicationGroupGt
     *
     * @return replicationGroupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupGt() {
        return replicationGroupGt;
    }

    public void setReplicationGroupGt(String replicationGroupGt) {
        this.replicationGroupGt = replicationGroupGt;
    }

    public ReplicaVmWhereInput replicationGroupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_GT);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_GT);
        return this;
    }

    public void setReplicationGroupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_GT);
        }
    }

    public boolean getReplicationGroupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_GT);
    }

    public ReplicaVmWhereInput replicationGroupGte(String replicationGroupGte) {

        this.replicationGroupGte = replicationGroupGte;
        return this;
    }

    /**
     * Get replicationGroupGte
     *
     * @return replicationGroupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupGte() {
        return replicationGroupGte;
    }

    public void setReplicationGroupGte(String replicationGroupGte) {
        this.replicationGroupGte = replicationGroupGte;
    }

    public ReplicaVmWhereInput replicationGroupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_GTE);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_GTE);
        return this;
    }

    public void setReplicationGroupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_GTE);
        }
    }

    public boolean getReplicationGroupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_GTE);
    }

    public ReplicaVmWhereInput replicationGroupIn(List<String> replicationGroupIn) {

        this.replicationGroupIn = replicationGroupIn;
        return this;
    }

    public ReplicaVmWhereInput addReplicationGroupInItem(String replicationGroupInItem) {
        if (this.replicationGroupIn == null) {
            this.replicationGroupIn = new ArrayList<String>();
        }
        this.replicationGroupIn.add(replicationGroupInItem);
        return this;
    }

    /**
     * Get replicationGroupIn
     *
     * @return replicationGroupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicationGroupIn() {
        return replicationGroupIn;
    }

    public void setReplicationGroupIn(List<String> replicationGroupIn) {
        this.replicationGroupIn = replicationGroupIn;
    }

    public ReplicaVmWhereInput replicationGroupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_IN);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_IN);
        return this;
    }

    public void setReplicationGroupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_IN);
        }
    }

    public boolean getReplicationGroupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_IN);
    }

    public ReplicaVmWhereInput replicationGroupLt(String replicationGroupLt) {

        this.replicationGroupLt = replicationGroupLt;
        return this;
    }

    /**
     * Get replicationGroupLt
     *
     * @return replicationGroupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupLt() {
        return replicationGroupLt;
    }

    public void setReplicationGroupLt(String replicationGroupLt) {
        this.replicationGroupLt = replicationGroupLt;
    }

    public ReplicaVmWhereInput replicationGroupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_LT);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_LT);
        return this;
    }

    public void setReplicationGroupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_LT);
        }
    }

    public boolean getReplicationGroupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_LT);
    }

    public ReplicaVmWhereInput replicationGroupLte(String replicationGroupLte) {

        this.replicationGroupLte = replicationGroupLte;
        return this;
    }

    /**
     * Get replicationGroupLte
     *
     * @return replicationGroupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupLte() {
        return replicationGroupLte;
    }

    public void setReplicationGroupLte(String replicationGroupLte) {
        this.replicationGroupLte = replicationGroupLte;
    }

    public ReplicaVmWhereInput replicationGroupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_LTE);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_LTE);
        return this;
    }

    public void setReplicationGroupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_LTE);
        }
    }

    public boolean getReplicationGroupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_LTE);
    }

    public ReplicaVmWhereInput replicationGroupNot(String replicationGroupNot) {

        this.replicationGroupNot = replicationGroupNot;
        return this;
    }

    /**
     * Get replicationGroupNot
     *
     * @return replicationGroupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupNot() {
        return replicationGroupNot;
    }

    public void setReplicationGroupNot(String replicationGroupNot) {
        this.replicationGroupNot = replicationGroupNot;
    }

    public ReplicaVmWhereInput replicationGroupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT);
        return this;
    }

    public void setReplicationGroupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT);
        }
    }

    public boolean getReplicationGroupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_NOT);
    }

    public ReplicaVmWhereInput replicationGroupNotContains(String replicationGroupNotContains) {

        this.replicationGroupNotContains = replicationGroupNotContains;
        return this;
    }

    /**
     * Get replicationGroupNotContains
     *
     * @return replicationGroupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupNotContains() {
        return replicationGroupNotContains;
    }

    public void setReplicationGroupNotContains(String replicationGroupNotContains) {
        this.replicationGroupNotContains = replicationGroupNotContains;
    }

    public ReplicaVmWhereInput replicationGroupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS);
        return this;
    }

    public void setReplicationGroupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS);
        }
    }

    public boolean getReplicationGroupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_NOT_CONTAINS);
    }

    public ReplicaVmWhereInput replicationGroupNotEndsWith(String replicationGroupNotEndsWith) {

        this.replicationGroupNotEndsWith = replicationGroupNotEndsWith;
        return this;
    }

    /**
     * Get replicationGroupNotEndsWith
     *
     * @return replicationGroupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupNotEndsWith() {
        return replicationGroupNotEndsWith;
    }

    public void setReplicationGroupNotEndsWith(String replicationGroupNotEndsWith) {
        this.replicationGroupNotEndsWith = replicationGroupNotEndsWith;
    }

    public ReplicaVmWhereInput replicationGroupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public void setReplicationGroupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH);
        }
    }

    public boolean getReplicationGroupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_NOT_ENDS_WITH);
    }

    public ReplicaVmWhereInput replicationGroupNotIn(List<String> replicationGroupNotIn) {

        this.replicationGroupNotIn = replicationGroupNotIn;
        return this;
    }

    public ReplicaVmWhereInput addReplicationGroupNotInItem(String replicationGroupNotInItem) {
        if (this.replicationGroupNotIn == null) {
            this.replicationGroupNotIn = new ArrayList<String>();
        }
        this.replicationGroupNotIn.add(replicationGroupNotInItem);
        return this;
    }

    /**
     * Get replicationGroupNotIn
     *
     * @return replicationGroupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicationGroupNotIn() {
        return replicationGroupNotIn;
    }

    public void setReplicationGroupNotIn(List<String> replicationGroupNotIn) {
        this.replicationGroupNotIn = replicationGroupNotIn;
    }

    public ReplicaVmWhereInput replicationGroupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN);
        return this;
    }

    public void setReplicationGroupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN);
        }
    }

    public boolean getReplicationGroupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_NOT_IN);
    }

    public ReplicaVmWhereInput replicationGroupNotStartsWith(String replicationGroupNotStartsWith) {

        this.replicationGroupNotStartsWith = replicationGroupNotStartsWith;
        return this;
    }

    /**
     * Get replicationGroupNotStartsWith
     *
     * @return replicationGroupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupNotStartsWith() {
        return replicationGroupNotStartsWith;
    }

    public void setReplicationGroupNotStartsWith(String replicationGroupNotStartsWith) {
        this.replicationGroupNotStartsWith = replicationGroupNotStartsWith;
    }

    public ReplicaVmWhereInput replicationGroupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public void setReplicationGroupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH);
        }
    }

    public boolean getReplicationGroupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_NOT_STARTS_WITH);
    }

    public ReplicaVmWhereInput replicationGroupStartsWith(String replicationGroupStartsWith) {

        this.replicationGroupStartsWith = replicationGroupStartsWith;
        return this;
    }

    /**
     * Get replicationGroupStartsWith
     *
     * @return replicationGroupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicationGroupStartsWith() {
        return replicationGroupStartsWith;
    }

    public void setReplicationGroupStartsWith(String replicationGroupStartsWith) {
        this.replicationGroupStartsWith = replicationGroupStartsWith;
    }

    public ReplicaVmWhereInput replicationGroupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH);
        return this;
    }

    public ReplicaVmWhereInput replicationGroupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH);
        return this;
    }

    public void setReplicationGroupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH);
        }
    }

    public boolean getReplicationGroupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_GROUP_STARTS_WITH);
    }

    public ReplicaVmWhereInput replicationPlan(ReplicationPlanWhereInput replicationPlan) {

        this.replicationPlan = replicationPlan;
        return this;
    }

    /**
     * Get replicationPlan
     *
     * @return replicationPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlan() {
        return replicationPlan;
    }

    public void setReplicationPlan(ReplicationPlanWhereInput replicationPlan) {
        this.replicationPlan = replicationPlan;
    }

    public ReplicaVmWhereInput replicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public ReplicaVmWhereInput replicationPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public void setReplicationPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        }
    }

    public boolean getReplicationPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN);
    }

    public ReplicaVmWhereInput replicationService(ReplicationServiceWhereInput replicationService) {

        this.replicationService = replicationService;
        return this;
    }

    /**
     * Get replicationService
     *
     * @return replicationService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationServiceWhereInput getReplicationService() {
        return replicationService;
    }

    public void setReplicationService(ReplicationServiceWhereInput replicationService) {
        this.replicationService = replicationService;
    }

    public ReplicaVmWhereInput replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public ReplicaVmWhereInput replicationService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public void setReplicationService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        }
    }

    public boolean getReplicationService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_SERVICE);
    }

    public ReplicaVmWhereInput replicationTargetExecutionsEvery(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery) {

        this.replicationTargetExecutionsEvery = replicationTargetExecutionsEvery;
        return this;
    }

    /**
     * Get replicationTargetExecutionsEvery
     *
     * @return replicationTargetExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsEvery() {
        return replicationTargetExecutionsEvery;
    }

    public void setReplicationTargetExecutionsEvery(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery) {
        this.replicationTargetExecutionsEvery = replicationTargetExecutionsEvery;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public void setReplicationTargetExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        }
    }

    public boolean getReplicationTargetExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
    }

    public ReplicaVmWhereInput replicationTargetExecutionsNone(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone) {

        this.replicationTargetExecutionsNone = replicationTargetExecutionsNone;
        return this;
    }

    /**
     * Get replicationTargetExecutionsNone
     *
     * @return replicationTargetExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsNone() {
        return replicationTargetExecutionsNone;
    }

    public void setReplicationTargetExecutionsNone(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone) {
        this.replicationTargetExecutionsNone = replicationTargetExecutionsNone;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public void setReplicationTargetExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        }
    }

    public boolean getReplicationTargetExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
    }

    public ReplicaVmWhereInput replicationTargetExecutionsSome(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome) {

        this.replicationTargetExecutionsSome = replicationTargetExecutionsSome;
        return this;
    }

    /**
     * Get replicationTargetExecutionsSome
     *
     * @return replicationTargetExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsSome() {
        return replicationTargetExecutionsSome;
    }

    public void setReplicationTargetExecutionsSome(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome) {
        this.replicationTargetExecutionsSome = replicationTargetExecutionsSome;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public ReplicaVmWhereInput replicationTargetExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public void setReplicationTargetExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        }
    }

    public boolean getReplicationTargetExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
    }

    public ReplicaVmWhereInput restorePointsEvery(
            ReplicationRestorePointWhereInput restorePointsEvery) {

        this.restorePointsEvery = restorePointsEvery;
        return this;
    }

    /**
     * Get restorePointsEvery
     *
     * @return restorePointsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getRestorePointsEvery() {
        return restorePointsEvery;
    }

    public void setRestorePointsEvery(ReplicationRestorePointWhereInput restorePointsEvery) {
        this.restorePointsEvery = restorePointsEvery;
    }

    public ReplicaVmWhereInput restorePointsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_EVERY);
        return this;
    }

    public ReplicaVmWhereInput restorePointsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_EVERY);
        return this;
    }

    public void setRestorePointsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_EVERY);
        }
    }

    public boolean getRestorePointsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_POINTS_EVERY);
    }

    public ReplicaVmWhereInput restorePointsNone(
            ReplicationRestorePointWhereInput restorePointsNone) {

        this.restorePointsNone = restorePointsNone;
        return this;
    }

    /**
     * Get restorePointsNone
     *
     * @return restorePointsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getRestorePointsNone() {
        return restorePointsNone;
    }

    public void setRestorePointsNone(ReplicationRestorePointWhereInput restorePointsNone) {
        this.restorePointsNone = restorePointsNone;
    }

    public ReplicaVmWhereInput restorePointsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_NONE);
        return this;
    }

    public ReplicaVmWhereInput restorePointsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_NONE);
        return this;
    }

    public void setRestorePointsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_NONE);
        }
    }

    public boolean getRestorePointsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_POINTS_NONE);
    }

    public ReplicaVmWhereInput restorePointsSome(
            ReplicationRestorePointWhereInput restorePointsSome) {

        this.restorePointsSome = restorePointsSome;
        return this;
    }

    /**
     * Get restorePointsSome
     *
     * @return restorePointsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getRestorePointsSome() {
        return restorePointsSome;
    }

    public void setRestorePointsSome(ReplicationRestorePointWhereInput restorePointsSome) {
        this.restorePointsSome = restorePointsSome;
    }

    public ReplicaVmWhereInput restorePointsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_SOME);
        return this;
    }

    public ReplicaVmWhereInput restorePointsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_SOME);
        return this;
    }

    public void setRestorePointsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS_SOME);
        }
    }

    public boolean getRestorePointsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_POINTS_SOME);
    }

    public ReplicaVmWhereInput state(ReplicaVmState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmState getState() {
        return state;
    }

    public void setState(ReplicaVmState state) {
        this.state = state;
    }

    public ReplicaVmWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public ReplicaVmWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public ReplicaVmWhereInput stateIn(List<ReplicaVmState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public ReplicaVmWhereInput addStateInItem(ReplicaVmState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<ReplicaVmState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaVmState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<ReplicaVmState> stateIn) {
        this.stateIn = stateIn;
    }

    public ReplicaVmWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public ReplicaVmWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public ReplicaVmWhereInput stateNot(ReplicaVmState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmState getStateNot() {
        return stateNot;
    }

    public void setStateNot(ReplicaVmState stateNot) {
        this.stateNot = stateNot;
    }

    public ReplicaVmWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public ReplicaVmWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public ReplicaVmWhereInput stateNotIn(List<ReplicaVmState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public ReplicaVmWhereInput addStateNotInItem(ReplicaVmState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<ReplicaVmState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaVmState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<ReplicaVmState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public ReplicaVmWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    public ReplicaVmWhereInput targetsDeletable(Boolean targetsDeletable) {

        this.targetsDeletable = targetsDeletable;
        return this;
    }

    /**
     * Get targetsDeletable
     *
     * @return targetsDeletable
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getTargetsDeletable() {
        return targetsDeletable;
    }

    public void setTargetsDeletable(Boolean targetsDeletable) {
        this.targetsDeletable = targetsDeletable;
    }

    public ReplicaVmWhereInput targetsDeletable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGETS_DELETABLE);
        return this;
    }

    public ReplicaVmWhereInput targetsDeletable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGETS_DELETABLE);
        return this;
    }

    public void setTargetsDeletable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGETS_DELETABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGETS_DELETABLE);
        }
    }

    public boolean getTargetsDeletable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGETS_DELETABLE);
    }

    public ReplicaVmWhereInput targetsDeletableNot(Boolean targetsDeletableNot) {

        this.targetsDeletableNot = targetsDeletableNot;
        return this;
    }

    /**
     * Get targetsDeletableNot
     *
     * @return targetsDeletableNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getTargetsDeletableNot() {
        return targetsDeletableNot;
    }

    public void setTargetsDeletableNot(Boolean targetsDeletableNot) {
        this.targetsDeletableNot = targetsDeletableNot;
    }

    public ReplicaVmWhereInput targetsDeletableNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGETS_DELETABLE_NOT);
        return this;
    }

    public ReplicaVmWhereInput targetsDeletableNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGETS_DELETABLE_NOT);
        return this;
    }

    public void setTargetsDeletableNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGETS_DELETABLE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGETS_DELETABLE_NOT);
        }
    }

    public boolean getTargetsDeletableNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGETS_DELETABLE_NOT);
    }

    public ReplicaVmWhereInput type(ReplicationObjectType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationObjectType getType() {
        return type;
    }

    public void setType(ReplicationObjectType type) {
        this.type = type;
    }

    public ReplicaVmWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicaVmWhereInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ReplicaVmWhereInput typeIn(List<ReplicationObjectType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ReplicaVmWhereInput addTypeInItem(ReplicationObjectType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<ReplicationObjectType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationObjectType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<ReplicationObjectType> typeIn) {
        this.typeIn = typeIn;
    }

    public ReplicaVmWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ReplicaVmWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public ReplicaVmWhereInput typeNot(ReplicationObjectType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationObjectType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(ReplicationObjectType typeNot) {
        this.typeNot = typeNot;
    }

    public ReplicaVmWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ReplicaVmWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public ReplicaVmWhereInput typeNotIn(List<ReplicationObjectType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ReplicaVmWhereInput addTypeNotInItem(ReplicationObjectType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<ReplicationObjectType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationObjectType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<ReplicationObjectType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ReplicaVmWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public ReplicaVmWhereInput updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReplicaVmWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicaVmWhereInput updatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public void setUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        }
    }

    public boolean getUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT);
    }

    public ReplicaVmWhereInput updatedAtGt(String updatedAtGt) {

        this.updatedAtGt = updatedAtGt;
        return this;
    }

    /**
     * Get updatedAtGt
     *
     * @return updatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGt() {
        return updatedAtGt;
    }

    public void setUpdatedAtGt(String updatedAtGt) {
        this.updatedAtGt = updatedAtGt;
    }

    public ReplicaVmWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public ReplicaVmWhereInput updatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public void setUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        }
    }

    public boolean getUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GT);
    }

    public ReplicaVmWhereInput updatedAtGte(String updatedAtGte) {

        this.updatedAtGte = updatedAtGte;
        return this;
    }

    /**
     * Get updatedAtGte
     *
     * @return updatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGte() {
        return updatedAtGte;
    }

    public void setUpdatedAtGte(String updatedAtGte) {
        this.updatedAtGte = updatedAtGte;
    }

    public ReplicaVmWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public ReplicaVmWhereInput updatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public void setUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        }
    }

    public boolean getUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GTE);
    }

    public ReplicaVmWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public ReplicaVmWhereInput addUpdatedAtInItem(String updatedAtInItem) {
        if (this.updatedAtIn == null) {
            this.updatedAtIn = new ArrayList<String>();
        }
        this.updatedAtIn.add(updatedAtInItem);
        return this;
    }

    /**
     * Get updatedAtIn
     *
     * @return updatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtIn() {
        return updatedAtIn;
    }

    public void setUpdatedAtIn(List<String> updatedAtIn) {
        this.updatedAtIn = updatedAtIn;
    }

    public ReplicaVmWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public ReplicaVmWhereInput updatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public void setUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        }
    }

    public boolean getUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_IN);
    }

    public ReplicaVmWhereInput updatedAtLt(String updatedAtLt) {

        this.updatedAtLt = updatedAtLt;
        return this;
    }

    /**
     * Get updatedAtLt
     *
     * @return updatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLt() {
        return updatedAtLt;
    }

    public void setUpdatedAtLt(String updatedAtLt) {
        this.updatedAtLt = updatedAtLt;
    }

    public ReplicaVmWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public ReplicaVmWhereInput updatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public void setUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        }
    }

    public boolean getUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LT);
    }

    public ReplicaVmWhereInput updatedAtLte(String updatedAtLte) {

        this.updatedAtLte = updatedAtLte;
        return this;
    }

    /**
     * Get updatedAtLte
     *
     * @return updatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLte() {
        return updatedAtLte;
    }

    public void setUpdatedAtLte(String updatedAtLte) {
        this.updatedAtLte = updatedAtLte;
    }

    public ReplicaVmWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public ReplicaVmWhereInput updatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public void setUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        }
    }

    public boolean getUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LTE);
    }

    public ReplicaVmWhereInput updatedAtNot(String updatedAtNot) {

        this.updatedAtNot = updatedAtNot;
        return this;
    }

    /**
     * Get updatedAtNot
     *
     * @return updatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtNot() {
        return updatedAtNot;
    }

    public void setUpdatedAtNot(String updatedAtNot) {
        this.updatedAtNot = updatedAtNot;
    }

    public ReplicaVmWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public ReplicaVmWhereInput updatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public void setUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        }
    }

    public boolean getUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT);
    }

    public ReplicaVmWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public ReplicaVmWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
        if (this.updatedAtNotIn == null) {
            this.updatedAtNotIn = new ArrayList<String>();
        }
        this.updatedAtNotIn.add(updatedAtNotInItem);
        return this;
    }

    /**
     * Get updatedAtNotIn
     *
     * @return updatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtNotIn() {
        return updatedAtNotIn;
    }

    public void setUpdatedAtNotIn(List<String> updatedAtNotIn) {
        this.updatedAtNotIn = updatedAtNotIn;
    }

    public ReplicaVmWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public ReplicaVmWhereInput updatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
    }

    public ReplicaVmWhereInput vm(VmWhereInput vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVm() {
        return vm;
    }

    public void setVm(VmWhereInput vm) {
        this.vm = vm;
    }

    public ReplicaVmWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public ReplicaVmWhereInput vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicaVmWhereInput replicaVmWhereInput = (ReplicaVmWhereInput) o;
        return Objects.equals(this.AND, replicaVmWhereInput.AND)
                && Objects.equals(this.NOT, replicaVmWhereInput.NOT)
                && Objects.equals(this.OR, replicaVmWhereInput.OR)
                && Objects.equals(this.createdAt, replicaVmWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, replicaVmWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, replicaVmWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, replicaVmWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, replicaVmWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, replicaVmWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, replicaVmWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, replicaVmWhereInput.createdAtNotIn)
                && Objects.equals(this.entityAsyncStatus, replicaVmWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, replicaVmWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, replicaVmWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, replicaVmWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.externalCloudtower, replicaVmWhereInput.externalCloudtower)
                && Objects.equals(
                        this.failoverTestReplicaGroup, replicaVmWhereInput.failoverTestReplicaGroup)
                && Objects.equals(
                        this.failoverTestReplicaGroupContains,
                        replicaVmWhereInput.failoverTestReplicaGroupContains)
                && Objects.equals(
                        this.failoverTestReplicaGroupEndsWith,
                        replicaVmWhereInput.failoverTestReplicaGroupEndsWith)
                && Objects.equals(
                        this.failoverTestReplicaGroupGt,
                        replicaVmWhereInput.failoverTestReplicaGroupGt)
                && Objects.equals(
                        this.failoverTestReplicaGroupGte,
                        replicaVmWhereInput.failoverTestReplicaGroupGte)
                && Objects.equals(
                        this.failoverTestReplicaGroupIn,
                        replicaVmWhereInput.failoverTestReplicaGroupIn)
                && Objects.equals(
                        this.failoverTestReplicaGroupLt,
                        replicaVmWhereInput.failoverTestReplicaGroupLt)
                && Objects.equals(
                        this.failoverTestReplicaGroupLte,
                        replicaVmWhereInput.failoverTestReplicaGroupLte)
                && Objects.equals(
                        this.failoverTestReplicaGroupNot,
                        replicaVmWhereInput.failoverTestReplicaGroupNot)
                && Objects.equals(
                        this.failoverTestReplicaGroupNotContains,
                        replicaVmWhereInput.failoverTestReplicaGroupNotContains)
                && Objects.equals(
                        this.failoverTestReplicaGroupNotEndsWith,
                        replicaVmWhereInput.failoverTestReplicaGroupNotEndsWith)
                && Objects.equals(
                        this.failoverTestReplicaGroupNotIn,
                        replicaVmWhereInput.failoverTestReplicaGroupNotIn)
                && Objects.equals(
                        this.failoverTestReplicaGroupNotStartsWith,
                        replicaVmWhereInput.failoverTestReplicaGroupNotStartsWith)
                && Objects.equals(
                        this.failoverTestReplicaGroupStartsWith,
                        replicaVmWhereInput.failoverTestReplicaGroupStartsWith)
                && Objects.equals(this.failoverTestVm, replicaVmWhereInput.failoverTestVm)
                && Objects.equals(this.id, replicaVmWhereInput.id)
                && Objects.equals(this.idContains, replicaVmWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicaVmWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicaVmWhereInput.idGt)
                && Objects.equals(this.idGte, replicaVmWhereInput.idGte)
                && Objects.equals(this.idIn, replicaVmWhereInput.idIn)
                && Objects.equals(this.idLt, replicaVmWhereInput.idLt)
                && Objects.equals(this.idLte, replicaVmWhereInput.idLte)
                && Objects.equals(this.idNot, replicaVmWhereInput.idNot)
                && Objects.equals(this.idNotContains, replicaVmWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, replicaVmWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicaVmWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, replicaVmWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, replicaVmWhereInput.idStartsWith)
                && Objects.equals(this.inbound, replicaVmWhereInput.inbound)
                && Objects.equals(this.inboundNot, replicaVmWhereInput.inboundNot)
                && Objects.equals(this.iscsiLun, replicaVmWhereInput.iscsiLun)
                && Objects.equals(this.originIscsiLun, replicaVmWhereInput.originIscsiLun)
                && Objects.equals(this.originVm, replicaVmWhereInput.originVm)
                && Objects.equals(
                        this.originVmClusterLocalId, replicaVmWhereInput.originVmClusterLocalId)
                && Objects.equals(
                        this.originVmClusterLocalIdContains,
                        replicaVmWhereInput.originVmClusterLocalIdContains)
                && Objects.equals(
                        this.originVmClusterLocalIdEndsWith,
                        replicaVmWhereInput.originVmClusterLocalIdEndsWith)
                && Objects.equals(
                        this.originVmClusterLocalIdGt, replicaVmWhereInput.originVmClusterLocalIdGt)
                && Objects.equals(
                        this.originVmClusterLocalIdGte,
                        replicaVmWhereInput.originVmClusterLocalIdGte)
                && Objects.equals(
                        this.originVmClusterLocalIdIn, replicaVmWhereInput.originVmClusterLocalIdIn)
                && Objects.equals(
                        this.originVmClusterLocalIdLt, replicaVmWhereInput.originVmClusterLocalIdLt)
                && Objects.equals(
                        this.originVmClusterLocalIdLte,
                        replicaVmWhereInput.originVmClusterLocalIdLte)
                && Objects.equals(
                        this.originVmClusterLocalIdNot,
                        replicaVmWhereInput.originVmClusterLocalIdNot)
                && Objects.equals(
                        this.originVmClusterLocalIdNotContains,
                        replicaVmWhereInput.originVmClusterLocalIdNotContains)
                && Objects.equals(
                        this.originVmClusterLocalIdNotEndsWith,
                        replicaVmWhereInput.originVmClusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.originVmClusterLocalIdNotIn,
                        replicaVmWhereInput.originVmClusterLocalIdNotIn)
                && Objects.equals(
                        this.originVmClusterLocalIdNotStartsWith,
                        replicaVmWhereInput.originVmClusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.originVmClusterLocalIdStartsWith,
                        replicaVmWhereInput.originVmClusterLocalIdStartsWith)
                && Objects.equals(this.originVmClusterName, replicaVmWhereInput.originVmClusterName)
                && Objects.equals(
                        this.originVmClusterNameContains,
                        replicaVmWhereInput.originVmClusterNameContains)
                && Objects.equals(
                        this.originVmClusterNameEndsWith,
                        replicaVmWhereInput.originVmClusterNameEndsWith)
                && Objects.equals(
                        this.originVmClusterNameGt, replicaVmWhereInput.originVmClusterNameGt)
                && Objects.equals(
                        this.originVmClusterNameGte, replicaVmWhereInput.originVmClusterNameGte)
                && Objects.equals(
                        this.originVmClusterNameIn, replicaVmWhereInput.originVmClusterNameIn)
                && Objects.equals(
                        this.originVmClusterNameLt, replicaVmWhereInput.originVmClusterNameLt)
                && Objects.equals(
                        this.originVmClusterNameLte, replicaVmWhereInput.originVmClusterNameLte)
                && Objects.equals(
                        this.originVmClusterNameNot, replicaVmWhereInput.originVmClusterNameNot)
                && Objects.equals(
                        this.originVmClusterNameNotContains,
                        replicaVmWhereInput.originVmClusterNameNotContains)
                && Objects.equals(
                        this.originVmClusterNameNotEndsWith,
                        replicaVmWhereInput.originVmClusterNameNotEndsWith)
                && Objects.equals(
                        this.originVmClusterNameNotIn, replicaVmWhereInput.originVmClusterNameNotIn)
                && Objects.equals(
                        this.originVmClusterNameNotStartsWith,
                        replicaVmWhereInput.originVmClusterNameNotStartsWith)
                && Objects.equals(
                        this.originVmClusterNameStartsWith,
                        replicaVmWhereInput.originVmClusterNameStartsWith)
                && Objects.equals(this.originVmLocalId, replicaVmWhereInput.originVmLocalId)
                && Objects.equals(
                        this.originVmLocalIdContains, replicaVmWhereInput.originVmLocalIdContains)
                && Objects.equals(
                        this.originVmLocalIdEndsWith, replicaVmWhereInput.originVmLocalIdEndsWith)
                && Objects.equals(this.originVmLocalIdGt, replicaVmWhereInput.originVmLocalIdGt)
                && Objects.equals(this.originVmLocalIdGte, replicaVmWhereInput.originVmLocalIdGte)
                && Objects.equals(this.originVmLocalIdIn, replicaVmWhereInput.originVmLocalIdIn)
                && Objects.equals(this.originVmLocalIdLt, replicaVmWhereInput.originVmLocalIdLt)
                && Objects.equals(this.originVmLocalIdLte, replicaVmWhereInput.originVmLocalIdLte)
                && Objects.equals(this.originVmLocalIdNot, replicaVmWhereInput.originVmLocalIdNot)
                && Objects.equals(
                        this.originVmLocalIdNotContains,
                        replicaVmWhereInput.originVmLocalIdNotContains)
                && Objects.equals(
                        this.originVmLocalIdNotEndsWith,
                        replicaVmWhereInput.originVmLocalIdNotEndsWith)
                && Objects.equals(
                        this.originVmLocalIdNotIn, replicaVmWhereInput.originVmLocalIdNotIn)
                && Objects.equals(
                        this.originVmLocalIdNotStartsWith,
                        replicaVmWhereInput.originVmLocalIdNotStartsWith)
                && Objects.equals(
                        this.originVmLocalIdStartsWith,
                        replicaVmWhereInput.originVmLocalIdStartsWith)
                && Objects.equals(this.originVmName, replicaVmWhereInput.originVmName)
                && Objects.equals(
                        this.originVmNameContains, replicaVmWhereInput.originVmNameContains)
                && Objects.equals(
                        this.originVmNameEndsWith, replicaVmWhereInput.originVmNameEndsWith)
                && Objects.equals(this.originVmNameGt, replicaVmWhereInput.originVmNameGt)
                && Objects.equals(this.originVmNameGte, replicaVmWhereInput.originVmNameGte)
                && Objects.equals(this.originVmNameIn, replicaVmWhereInput.originVmNameIn)
                && Objects.equals(this.originVmNameLt, replicaVmWhereInput.originVmNameLt)
                && Objects.equals(this.originVmNameLte, replicaVmWhereInput.originVmNameLte)
                && Objects.equals(this.originVmNameNot, replicaVmWhereInput.originVmNameNot)
                && Objects.equals(
                        this.originVmNameNotContains, replicaVmWhereInput.originVmNameNotContains)
                && Objects.equals(
                        this.originVmNameNotEndsWith, replicaVmWhereInput.originVmNameNotEndsWith)
                && Objects.equals(this.originVmNameNotIn, replicaVmWhereInput.originVmNameNotIn)
                && Objects.equals(
                        this.originVmNameNotStartsWith,
                        replicaVmWhereInput.originVmNameNotStartsWith)
                && Objects.equals(
                        this.originVmNameStartsWith, replicaVmWhereInput.originVmNameStartsWith)
                && Objects.equals(this.replicaGroup, replicaVmWhereInput.replicaGroup)
                && Objects.equals(
                        this.replicaGroupContains, replicaVmWhereInput.replicaGroupContains)
                && Objects.equals(
                        this.replicaGroupEndsWith, replicaVmWhereInput.replicaGroupEndsWith)
                && Objects.equals(this.replicaGroupGt, replicaVmWhereInput.replicaGroupGt)
                && Objects.equals(this.replicaGroupGte, replicaVmWhereInput.replicaGroupGte)
                && Objects.equals(this.replicaGroupIn, replicaVmWhereInput.replicaGroupIn)
                && Objects.equals(this.replicaGroupLt, replicaVmWhereInput.replicaGroupLt)
                && Objects.equals(this.replicaGroupLte, replicaVmWhereInput.replicaGroupLte)
                && Objects.equals(this.replicaGroupNot, replicaVmWhereInput.replicaGroupNot)
                && Objects.equals(
                        this.replicaGroupNotContains, replicaVmWhereInput.replicaGroupNotContains)
                && Objects.equals(
                        this.replicaGroupNotEndsWith, replicaVmWhereInput.replicaGroupNotEndsWith)
                && Objects.equals(this.replicaGroupNotIn, replicaVmWhereInput.replicaGroupNotIn)
                && Objects.equals(
                        this.replicaGroupNotStartsWith,
                        replicaVmWhereInput.replicaGroupNotStartsWith)
                && Objects.equals(
                        this.replicaGroupStartsWith, replicaVmWhereInput.replicaGroupStartsWith)
                && Objects.equals(this.replicationGroup, replicaVmWhereInput.replicationGroup)
                && Objects.equals(
                        this.replicationGroupContains, replicaVmWhereInput.replicationGroupContains)
                && Objects.equals(
                        this.replicationGroupEndsWith, replicaVmWhereInput.replicationGroupEndsWith)
                && Objects.equals(this.replicationGroupGt, replicaVmWhereInput.replicationGroupGt)
                && Objects.equals(this.replicationGroupGte, replicaVmWhereInput.replicationGroupGte)
                && Objects.equals(this.replicationGroupIn, replicaVmWhereInput.replicationGroupIn)
                && Objects.equals(this.replicationGroupLt, replicaVmWhereInput.replicationGroupLt)
                && Objects.equals(this.replicationGroupLte, replicaVmWhereInput.replicationGroupLte)
                && Objects.equals(this.replicationGroupNot, replicaVmWhereInput.replicationGroupNot)
                && Objects.equals(
                        this.replicationGroupNotContains,
                        replicaVmWhereInput.replicationGroupNotContains)
                && Objects.equals(
                        this.replicationGroupNotEndsWith,
                        replicaVmWhereInput.replicationGroupNotEndsWith)
                && Objects.equals(
                        this.replicationGroupNotIn, replicaVmWhereInput.replicationGroupNotIn)
                && Objects.equals(
                        this.replicationGroupNotStartsWith,
                        replicaVmWhereInput.replicationGroupNotStartsWith)
                && Objects.equals(
                        this.replicationGroupStartsWith,
                        replicaVmWhereInput.replicationGroupStartsWith)
                && Objects.equals(this.replicationPlan, replicaVmWhereInput.replicationPlan)
                && Objects.equals(this.replicationService, replicaVmWhereInput.replicationService)
                && Objects.equals(
                        this.replicationTargetExecutionsEvery,
                        replicaVmWhereInput.replicationTargetExecutionsEvery)
                && Objects.equals(
                        this.replicationTargetExecutionsNone,
                        replicaVmWhereInput.replicationTargetExecutionsNone)
                && Objects.equals(
                        this.replicationTargetExecutionsSome,
                        replicaVmWhereInput.replicationTargetExecutionsSome)
                && Objects.equals(this.restorePointsEvery, replicaVmWhereInput.restorePointsEvery)
                && Objects.equals(this.restorePointsNone, replicaVmWhereInput.restorePointsNone)
                && Objects.equals(this.restorePointsSome, replicaVmWhereInput.restorePointsSome)
                && Objects.equals(this.state, replicaVmWhereInput.state)
                && Objects.equals(this.stateIn, replicaVmWhereInput.stateIn)
                && Objects.equals(this.stateNot, replicaVmWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, replicaVmWhereInput.stateNotIn)
                && Objects.equals(this.targetsDeletable, replicaVmWhereInput.targetsDeletable)
                && Objects.equals(this.targetsDeletableNot, replicaVmWhereInput.targetsDeletableNot)
                && Objects.equals(this.type, replicaVmWhereInput.type)
                && Objects.equals(this.typeIn, replicaVmWhereInput.typeIn)
                && Objects.equals(this.typeNot, replicaVmWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, replicaVmWhereInput.typeNotIn)
                && Objects.equals(this.updatedAt, replicaVmWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, replicaVmWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, replicaVmWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, replicaVmWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, replicaVmWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, replicaVmWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, replicaVmWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, replicaVmWhereInput.updatedAtNotIn)
                && Objects.equals(this.vm, replicaVmWhereInput.vm);
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                externalCloudtower,
                failoverTestReplicaGroup,
                failoverTestReplicaGroupContains,
                failoverTestReplicaGroupEndsWith,
                failoverTestReplicaGroupGt,
                failoverTestReplicaGroupGte,
                failoverTestReplicaGroupIn,
                failoverTestReplicaGroupLt,
                failoverTestReplicaGroupLte,
                failoverTestReplicaGroupNot,
                failoverTestReplicaGroupNotContains,
                failoverTestReplicaGroupNotEndsWith,
                failoverTestReplicaGroupNotIn,
                failoverTestReplicaGroupNotStartsWith,
                failoverTestReplicaGroupStartsWith,
                failoverTestVm,
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
                inbound,
                inboundNot,
                iscsiLun,
                originIscsiLun,
                originVm,
                originVmClusterLocalId,
                originVmClusterLocalIdContains,
                originVmClusterLocalIdEndsWith,
                originVmClusterLocalIdGt,
                originVmClusterLocalIdGte,
                originVmClusterLocalIdIn,
                originVmClusterLocalIdLt,
                originVmClusterLocalIdLte,
                originVmClusterLocalIdNot,
                originVmClusterLocalIdNotContains,
                originVmClusterLocalIdNotEndsWith,
                originVmClusterLocalIdNotIn,
                originVmClusterLocalIdNotStartsWith,
                originVmClusterLocalIdStartsWith,
                originVmClusterName,
                originVmClusterNameContains,
                originVmClusterNameEndsWith,
                originVmClusterNameGt,
                originVmClusterNameGte,
                originVmClusterNameIn,
                originVmClusterNameLt,
                originVmClusterNameLte,
                originVmClusterNameNot,
                originVmClusterNameNotContains,
                originVmClusterNameNotEndsWith,
                originVmClusterNameNotIn,
                originVmClusterNameNotStartsWith,
                originVmClusterNameStartsWith,
                originVmLocalId,
                originVmLocalIdContains,
                originVmLocalIdEndsWith,
                originVmLocalIdGt,
                originVmLocalIdGte,
                originVmLocalIdIn,
                originVmLocalIdLt,
                originVmLocalIdLte,
                originVmLocalIdNot,
                originVmLocalIdNotContains,
                originVmLocalIdNotEndsWith,
                originVmLocalIdNotIn,
                originVmLocalIdNotStartsWith,
                originVmLocalIdStartsWith,
                originVmName,
                originVmNameContains,
                originVmNameEndsWith,
                originVmNameGt,
                originVmNameGte,
                originVmNameIn,
                originVmNameLt,
                originVmNameLte,
                originVmNameNot,
                originVmNameNotContains,
                originVmNameNotEndsWith,
                originVmNameNotIn,
                originVmNameNotStartsWith,
                originVmNameStartsWith,
                replicaGroup,
                replicaGroupContains,
                replicaGroupEndsWith,
                replicaGroupGt,
                replicaGroupGte,
                replicaGroupIn,
                replicaGroupLt,
                replicaGroupLte,
                replicaGroupNot,
                replicaGroupNotContains,
                replicaGroupNotEndsWith,
                replicaGroupNotIn,
                replicaGroupNotStartsWith,
                replicaGroupStartsWith,
                replicationGroup,
                replicationGroupContains,
                replicationGroupEndsWith,
                replicationGroupGt,
                replicationGroupGte,
                replicationGroupIn,
                replicationGroupLt,
                replicationGroupLte,
                replicationGroupNot,
                replicationGroupNotContains,
                replicationGroupNotEndsWith,
                replicationGroupNotIn,
                replicationGroupNotStartsWith,
                replicationGroupStartsWith,
                replicationPlan,
                replicationService,
                replicationTargetExecutionsEvery,
                replicationTargetExecutionsNone,
                replicationTargetExecutionsSome,
                restorePointsEvery,
                restorePointsNone,
                restorePointsSome,
                state,
                stateIn,
                stateNot,
                stateNotIn,
                targetsDeletable,
                targetsDeletableNot,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                updatedAt,
                updatedAtGt,
                updatedAtGte,
                updatedAtIn,
                updatedAtLt,
                updatedAtLte,
                updatedAtNot,
                updatedAtNotIn,
                vm);
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
        sb.append("class ReplicaVmWhereInput {\n");
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
        sb.append("    externalCloudtower: ")
                .append(toIndentedString(externalCloudtower))
                .append("\n");
        sb.append("    failoverTestReplicaGroup: ")
                .append(toIndentedString(failoverTestReplicaGroup))
                .append("\n");
        sb.append("    failoverTestReplicaGroupContains: ")
                .append(toIndentedString(failoverTestReplicaGroupContains))
                .append("\n");
        sb.append("    failoverTestReplicaGroupEndsWith: ")
                .append(toIndentedString(failoverTestReplicaGroupEndsWith))
                .append("\n");
        sb.append("    failoverTestReplicaGroupGt: ")
                .append(toIndentedString(failoverTestReplicaGroupGt))
                .append("\n");
        sb.append("    failoverTestReplicaGroupGte: ")
                .append(toIndentedString(failoverTestReplicaGroupGte))
                .append("\n");
        sb.append("    failoverTestReplicaGroupIn: ")
                .append(toIndentedString(failoverTestReplicaGroupIn))
                .append("\n");
        sb.append("    failoverTestReplicaGroupLt: ")
                .append(toIndentedString(failoverTestReplicaGroupLt))
                .append("\n");
        sb.append("    failoverTestReplicaGroupLte: ")
                .append(toIndentedString(failoverTestReplicaGroupLte))
                .append("\n");
        sb.append("    failoverTestReplicaGroupNot: ")
                .append(toIndentedString(failoverTestReplicaGroupNot))
                .append("\n");
        sb.append("    failoverTestReplicaGroupNotContains: ")
                .append(toIndentedString(failoverTestReplicaGroupNotContains))
                .append("\n");
        sb.append("    failoverTestReplicaGroupNotEndsWith: ")
                .append(toIndentedString(failoverTestReplicaGroupNotEndsWith))
                .append("\n");
        sb.append("    failoverTestReplicaGroupNotIn: ")
                .append(toIndentedString(failoverTestReplicaGroupNotIn))
                .append("\n");
        sb.append("    failoverTestReplicaGroupNotStartsWith: ")
                .append(toIndentedString(failoverTestReplicaGroupNotStartsWith))
                .append("\n");
        sb.append("    failoverTestReplicaGroupStartsWith: ")
                .append(toIndentedString(failoverTestReplicaGroupStartsWith))
                .append("\n");
        sb.append("    failoverTestVm: ").append(toIndentedString(failoverTestVm)).append("\n");
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
        sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
        sb.append("    inboundNot: ").append(toIndentedString(inboundNot)).append("\n");
        sb.append("    iscsiLun: ").append(toIndentedString(iscsiLun)).append("\n");
        sb.append("    originIscsiLun: ").append(toIndentedString(originIscsiLun)).append("\n");
        sb.append("    originVm: ").append(toIndentedString(originVm)).append("\n");
        sb.append("    originVmClusterLocalId: ")
                .append(toIndentedString(originVmClusterLocalId))
                .append("\n");
        sb.append("    originVmClusterLocalIdContains: ")
                .append(toIndentedString(originVmClusterLocalIdContains))
                .append("\n");
        sb.append("    originVmClusterLocalIdEndsWith: ")
                .append(toIndentedString(originVmClusterLocalIdEndsWith))
                .append("\n");
        sb.append("    originVmClusterLocalIdGt: ")
                .append(toIndentedString(originVmClusterLocalIdGt))
                .append("\n");
        sb.append("    originVmClusterLocalIdGte: ")
                .append(toIndentedString(originVmClusterLocalIdGte))
                .append("\n");
        sb.append("    originVmClusterLocalIdIn: ")
                .append(toIndentedString(originVmClusterLocalIdIn))
                .append("\n");
        sb.append("    originVmClusterLocalIdLt: ")
                .append(toIndentedString(originVmClusterLocalIdLt))
                .append("\n");
        sb.append("    originVmClusterLocalIdLte: ")
                .append(toIndentedString(originVmClusterLocalIdLte))
                .append("\n");
        sb.append("    originVmClusterLocalIdNot: ")
                .append(toIndentedString(originVmClusterLocalIdNot))
                .append("\n");
        sb.append("    originVmClusterLocalIdNotContains: ")
                .append(toIndentedString(originVmClusterLocalIdNotContains))
                .append("\n");
        sb.append("    originVmClusterLocalIdNotEndsWith: ")
                .append(toIndentedString(originVmClusterLocalIdNotEndsWith))
                .append("\n");
        sb.append("    originVmClusterLocalIdNotIn: ")
                .append(toIndentedString(originVmClusterLocalIdNotIn))
                .append("\n");
        sb.append("    originVmClusterLocalIdNotStartsWith: ")
                .append(toIndentedString(originVmClusterLocalIdNotStartsWith))
                .append("\n");
        sb.append("    originVmClusterLocalIdStartsWith: ")
                .append(toIndentedString(originVmClusterLocalIdStartsWith))
                .append("\n");
        sb.append("    originVmClusterName: ")
                .append(toIndentedString(originVmClusterName))
                .append("\n");
        sb.append("    originVmClusterNameContains: ")
                .append(toIndentedString(originVmClusterNameContains))
                .append("\n");
        sb.append("    originVmClusterNameEndsWith: ")
                .append(toIndentedString(originVmClusterNameEndsWith))
                .append("\n");
        sb.append("    originVmClusterNameGt: ")
                .append(toIndentedString(originVmClusterNameGt))
                .append("\n");
        sb.append("    originVmClusterNameGte: ")
                .append(toIndentedString(originVmClusterNameGte))
                .append("\n");
        sb.append("    originVmClusterNameIn: ")
                .append(toIndentedString(originVmClusterNameIn))
                .append("\n");
        sb.append("    originVmClusterNameLt: ")
                .append(toIndentedString(originVmClusterNameLt))
                .append("\n");
        sb.append("    originVmClusterNameLte: ")
                .append(toIndentedString(originVmClusterNameLte))
                .append("\n");
        sb.append("    originVmClusterNameNot: ")
                .append(toIndentedString(originVmClusterNameNot))
                .append("\n");
        sb.append("    originVmClusterNameNotContains: ")
                .append(toIndentedString(originVmClusterNameNotContains))
                .append("\n");
        sb.append("    originVmClusterNameNotEndsWith: ")
                .append(toIndentedString(originVmClusterNameNotEndsWith))
                .append("\n");
        sb.append("    originVmClusterNameNotIn: ")
                .append(toIndentedString(originVmClusterNameNotIn))
                .append("\n");
        sb.append("    originVmClusterNameNotStartsWith: ")
                .append(toIndentedString(originVmClusterNameNotStartsWith))
                .append("\n");
        sb.append("    originVmClusterNameStartsWith: ")
                .append(toIndentedString(originVmClusterNameStartsWith))
                .append("\n");
        sb.append("    originVmLocalId: ").append(toIndentedString(originVmLocalId)).append("\n");
        sb.append("    originVmLocalIdContains: ")
                .append(toIndentedString(originVmLocalIdContains))
                .append("\n");
        sb.append("    originVmLocalIdEndsWith: ")
                .append(toIndentedString(originVmLocalIdEndsWith))
                .append("\n");
        sb.append("    originVmLocalIdGt: ")
                .append(toIndentedString(originVmLocalIdGt))
                .append("\n");
        sb.append("    originVmLocalIdGte: ")
                .append(toIndentedString(originVmLocalIdGte))
                .append("\n");
        sb.append("    originVmLocalIdIn: ")
                .append(toIndentedString(originVmLocalIdIn))
                .append("\n");
        sb.append("    originVmLocalIdLt: ")
                .append(toIndentedString(originVmLocalIdLt))
                .append("\n");
        sb.append("    originVmLocalIdLte: ")
                .append(toIndentedString(originVmLocalIdLte))
                .append("\n");
        sb.append("    originVmLocalIdNot: ")
                .append(toIndentedString(originVmLocalIdNot))
                .append("\n");
        sb.append("    originVmLocalIdNotContains: ")
                .append(toIndentedString(originVmLocalIdNotContains))
                .append("\n");
        sb.append("    originVmLocalIdNotEndsWith: ")
                .append(toIndentedString(originVmLocalIdNotEndsWith))
                .append("\n");
        sb.append("    originVmLocalIdNotIn: ")
                .append(toIndentedString(originVmLocalIdNotIn))
                .append("\n");
        sb.append("    originVmLocalIdNotStartsWith: ")
                .append(toIndentedString(originVmLocalIdNotStartsWith))
                .append("\n");
        sb.append("    originVmLocalIdStartsWith: ")
                .append(toIndentedString(originVmLocalIdStartsWith))
                .append("\n");
        sb.append("    originVmName: ").append(toIndentedString(originVmName)).append("\n");
        sb.append("    originVmNameContains: ")
                .append(toIndentedString(originVmNameContains))
                .append("\n");
        sb.append("    originVmNameEndsWith: ")
                .append(toIndentedString(originVmNameEndsWith))
                .append("\n");
        sb.append("    originVmNameGt: ").append(toIndentedString(originVmNameGt)).append("\n");
        sb.append("    originVmNameGte: ").append(toIndentedString(originVmNameGte)).append("\n");
        sb.append("    originVmNameIn: ").append(toIndentedString(originVmNameIn)).append("\n");
        sb.append("    originVmNameLt: ").append(toIndentedString(originVmNameLt)).append("\n");
        sb.append("    originVmNameLte: ").append(toIndentedString(originVmNameLte)).append("\n");
        sb.append("    originVmNameNot: ").append(toIndentedString(originVmNameNot)).append("\n");
        sb.append("    originVmNameNotContains: ")
                .append(toIndentedString(originVmNameNotContains))
                .append("\n");
        sb.append("    originVmNameNotEndsWith: ")
                .append(toIndentedString(originVmNameNotEndsWith))
                .append("\n");
        sb.append("    originVmNameNotIn: ")
                .append(toIndentedString(originVmNameNotIn))
                .append("\n");
        sb.append("    originVmNameNotStartsWith: ")
                .append(toIndentedString(originVmNameNotStartsWith))
                .append("\n");
        sb.append("    originVmNameStartsWith: ")
                .append(toIndentedString(originVmNameStartsWith))
                .append("\n");
        sb.append("    replicaGroup: ").append(toIndentedString(replicaGroup)).append("\n");
        sb.append("    replicaGroupContains: ")
                .append(toIndentedString(replicaGroupContains))
                .append("\n");
        sb.append("    replicaGroupEndsWith: ")
                .append(toIndentedString(replicaGroupEndsWith))
                .append("\n");
        sb.append("    replicaGroupGt: ").append(toIndentedString(replicaGroupGt)).append("\n");
        sb.append("    replicaGroupGte: ").append(toIndentedString(replicaGroupGte)).append("\n");
        sb.append("    replicaGroupIn: ").append(toIndentedString(replicaGroupIn)).append("\n");
        sb.append("    replicaGroupLt: ").append(toIndentedString(replicaGroupLt)).append("\n");
        sb.append("    replicaGroupLte: ").append(toIndentedString(replicaGroupLte)).append("\n");
        sb.append("    replicaGroupNot: ").append(toIndentedString(replicaGroupNot)).append("\n");
        sb.append("    replicaGroupNotContains: ")
                .append(toIndentedString(replicaGroupNotContains))
                .append("\n");
        sb.append("    replicaGroupNotEndsWith: ")
                .append(toIndentedString(replicaGroupNotEndsWith))
                .append("\n");
        sb.append("    replicaGroupNotIn: ")
                .append(toIndentedString(replicaGroupNotIn))
                .append("\n");
        sb.append("    replicaGroupNotStartsWith: ")
                .append(toIndentedString(replicaGroupNotStartsWith))
                .append("\n");
        sb.append("    replicaGroupStartsWith: ")
                .append(toIndentedString(replicaGroupStartsWith))
                .append("\n");
        sb.append("    replicationGroup: ").append(toIndentedString(replicationGroup)).append("\n");
        sb.append("    replicationGroupContains: ")
                .append(toIndentedString(replicationGroupContains))
                .append("\n");
        sb.append("    replicationGroupEndsWith: ")
                .append(toIndentedString(replicationGroupEndsWith))
                .append("\n");
        sb.append("    replicationGroupGt: ")
                .append(toIndentedString(replicationGroupGt))
                .append("\n");
        sb.append("    replicationGroupGte: ")
                .append(toIndentedString(replicationGroupGte))
                .append("\n");
        sb.append("    replicationGroupIn: ")
                .append(toIndentedString(replicationGroupIn))
                .append("\n");
        sb.append("    replicationGroupLt: ")
                .append(toIndentedString(replicationGroupLt))
                .append("\n");
        sb.append("    replicationGroupLte: ")
                .append(toIndentedString(replicationGroupLte))
                .append("\n");
        sb.append("    replicationGroupNot: ")
                .append(toIndentedString(replicationGroupNot))
                .append("\n");
        sb.append("    replicationGroupNotContains: ")
                .append(toIndentedString(replicationGroupNotContains))
                .append("\n");
        sb.append("    replicationGroupNotEndsWith: ")
                .append(toIndentedString(replicationGroupNotEndsWith))
                .append("\n");
        sb.append("    replicationGroupNotIn: ")
                .append(toIndentedString(replicationGroupNotIn))
                .append("\n");
        sb.append("    replicationGroupNotStartsWith: ")
                .append(toIndentedString(replicationGroupNotStartsWith))
                .append("\n");
        sb.append("    replicationGroupStartsWith: ")
                .append(toIndentedString(replicationGroupStartsWith))
                .append("\n");
        sb.append("    replicationPlan: ").append(toIndentedString(replicationPlan)).append("\n");
        sb.append("    replicationService: ")
                .append(toIndentedString(replicationService))
                .append("\n");
        sb.append("    replicationTargetExecutionsEvery: ")
                .append(toIndentedString(replicationTargetExecutionsEvery))
                .append("\n");
        sb.append("    replicationTargetExecutionsNone: ")
                .append(toIndentedString(replicationTargetExecutionsNone))
                .append("\n");
        sb.append("    replicationTargetExecutionsSome: ")
                .append(toIndentedString(replicationTargetExecutionsSome))
                .append("\n");
        sb.append("    restorePointsEvery: ")
                .append(toIndentedString(restorePointsEvery))
                .append("\n");
        sb.append("    restorePointsNone: ")
                .append(toIndentedString(restorePointsNone))
                .append("\n");
        sb.append("    restorePointsSome: ")
                .append(toIndentedString(restorePointsSome))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
        sb.append("    targetsDeletable: ").append(toIndentedString(targetsDeletable)).append("\n");
        sb.append("    targetsDeletableNot: ")
                .append(toIndentedString(targetsDeletableNot))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
        sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
        sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
        sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
        sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
        sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
        sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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
