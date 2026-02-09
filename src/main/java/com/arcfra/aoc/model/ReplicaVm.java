package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicaVm */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicaVm extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWER = "external_cloudtower";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER)
    private NestedExternalCloudTower externalCloudtower;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR =
            "failover_test_object_descriptor";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR)
    private NestedReplicationObjectDescriptor failoverTestObjectDescriptor;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP =
            "failover_test_replica_group";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP)
    private String failoverTestReplicaGroup;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_VM = "failover_test_vm";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_VM)
    private NestedVm failoverTestVm;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INBOUND = "inbound";

    @SerializedName(SERIALIZED_NAME_INBOUND)
    private Boolean inbound;

    public static final String SERIALIZED_NAME_ISCSI_LUN = "iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN)
    private NestedIscsiLun iscsiLun;

    public static final String SERIALIZED_NAME_OBJECT_DESCRIPTOR = "object_descriptor";

    @SerializedName(SERIALIZED_NAME_OBJECT_DESCRIPTOR)
    private NestedReplicationObjectDescriptor objectDescriptor;

    public static final String SERIALIZED_NAME_ORIGIN_ISCSI_LUN = "origin_iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ORIGIN_ISCSI_LUN)
    private NestedIscsiLun originIscsiLun;

    public static final String SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR =
            "origin_object_descriptor";

    @SerializedName(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR)
    private NestedReplicationObjectDescriptor originObjectDescriptor;

    public static final String SERIALIZED_NAME_ORIGIN_VM = "origin_vm";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM)
    private NestedVm originVm;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID =
            "origin_vm_cluster_local_id";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID)
    private String originVmClusterLocalId;

    public static final String SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME = "origin_vm_cluster_name";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME)
    private String originVmClusterName;

    public static final String SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID = "origin_vm_local_id";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID)
    private String originVmLocalId;

    public static final String SERIALIZED_NAME_ORIGIN_VM_NAME = "origin_vm_name";

    @SerializedName(SERIALIZED_NAME_ORIGIN_VM_NAME)
    private String originVmName;

    public static final String SERIALIZED_NAME_REPLICA_GROUP = "replica_group";

    @SerializedName(SERIALIZED_NAME_REPLICA_GROUP)
    private String replicaGroup;

    public static final String SERIALIZED_NAME_REPLICATION_GROUP = "replication_group";

    @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP)
    private String replicationGroup;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN = "replication_plan";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN)
    private NestedReplicationPlan replicationPlan;

    public static final String SERIALIZED_NAME_REPLICATION_SERVICE = "replication_service";

    @SerializedName(SERIALIZED_NAME_REPLICATION_SERVICE)
    private NestedReplicationService replicationService;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS =
            "replication_target_executions";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS)
    private List<NestedReplicationTargetExecution> replicationTargetExecutions = null;

    public static final String SERIALIZED_NAME_RESTORE_POINTS = "restore_points";

    @SerializedName(SERIALIZED_NAME_RESTORE_POINTS)
    private List<NestedReplicationRestorePoint> restorePoints = null;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private ReplicaVmState state;

    public static final String SERIALIZED_NAME_TARGETS_DELETABLE = "targets_deletable";

    @SerializedName(SERIALIZED_NAME_TARGETS_DELETABLE)
    private Boolean targetsDeletable;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReplicationObjectType type;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public ReplicaVm() {}

    public ReplicaVm createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ReplicaVm createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicaVm createdAt_ExplictlyNonNull() {
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

    public ReplicaVm entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicaVm entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicaVm entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicaVm externalCloudtower(NestedExternalCloudTower externalCloudtower) {

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
    public NestedExternalCloudTower getExternalCloudtower() {
        return externalCloudtower;
    }

    public void setExternalCloudtower(NestedExternalCloudTower externalCloudtower) {
        this.externalCloudtower = externalCloudtower;
    }

    public ReplicaVm externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public ReplicaVm externalCloudtower_ExplictlyNonNull() {
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

    public ReplicaVm failoverTestObjectDescriptor(
            NestedReplicationObjectDescriptor failoverTestObjectDescriptor) {

        this.failoverTestObjectDescriptor = failoverTestObjectDescriptor;
        return this;
    }

    /**
     * Get failoverTestObjectDescriptor
     *
     * @return failoverTestObjectDescriptor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedReplicationObjectDescriptor getFailoverTestObjectDescriptor() {
        return failoverTestObjectDescriptor;
    }

    public void setFailoverTestObjectDescriptor(
            NestedReplicationObjectDescriptor failoverTestObjectDescriptor) {
        this.failoverTestObjectDescriptor = failoverTestObjectDescriptor;
    }

    public ReplicaVm failoverTestObjectDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR);
        return this;
    }

    public ReplicaVm failoverTestObjectDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR);
        return this;
    }

    public void setFailoverTestObjectDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR);
        }
    }

    public boolean getFailoverTestObjectDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_OBJECT_DESCRIPTOR);
    }

    public ReplicaVm failoverTestReplicaGroup(String failoverTestReplicaGroup) {

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

    public ReplicaVm failoverTestReplicaGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_REPLICA_GROUP);
        return this;
    }

    public ReplicaVm failoverTestReplicaGroup_ExplictlyNonNull() {
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

    public ReplicaVm failoverTestVm(NestedVm failoverTestVm) {

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
    public NestedVm getFailoverTestVm() {
        return failoverTestVm;
    }

    public void setFailoverTestVm(NestedVm failoverTestVm) {
        this.failoverTestVm = failoverTestVm;
    }

    public ReplicaVm failoverTestVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_VM);
        return this;
    }

    public ReplicaVm failoverTestVm_ExplictlyNonNull() {
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

    public ReplicaVm id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReplicaVm id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicaVm id_ExplictlyNonNull() {
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

    public ReplicaVm inbound(Boolean inbound) {

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

    public ReplicaVm inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public ReplicaVm inbound_ExplictlyNonNull() {
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

    public ReplicaVm iscsiLun(NestedIscsiLun iscsiLun) {

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
    public NestedIscsiLun getIscsiLun() {
        return iscsiLun;
    }

    public void setIscsiLun(NestedIscsiLun iscsiLun) {
        this.iscsiLun = iscsiLun;
    }

    public ReplicaVm iscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public ReplicaVm iscsiLun_ExplictlyNonNull() {
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

    public ReplicaVm objectDescriptor(NestedReplicationObjectDescriptor objectDescriptor) {

        this.objectDescriptor = objectDescriptor;
        return this;
    }

    /**
     * Get objectDescriptor
     *
     * @return objectDescriptor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedReplicationObjectDescriptor getObjectDescriptor() {
        return objectDescriptor;
    }

    public void setObjectDescriptor(NestedReplicationObjectDescriptor objectDescriptor) {
        this.objectDescriptor = objectDescriptor;
    }

    public ReplicaVm objectDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_DESCRIPTOR);
        return this;
    }

    public ReplicaVm objectDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_DESCRIPTOR);
        return this;
    }

    public void setObjectDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_DESCRIPTOR);
        }
    }

    public boolean getObjectDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_DESCRIPTOR);
    }

    public ReplicaVm originIscsiLun(NestedIscsiLun originIscsiLun) {

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
    public NestedIscsiLun getOriginIscsiLun() {
        return originIscsiLun;
    }

    public void setOriginIscsiLun(NestedIscsiLun originIscsiLun) {
        this.originIscsiLun = originIscsiLun;
    }

    public ReplicaVm originIscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_ISCSI_LUN);
        return this;
    }

    public ReplicaVm originIscsiLun_ExplictlyNonNull() {
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

    public ReplicaVm originObjectDescriptor(
            NestedReplicationObjectDescriptor originObjectDescriptor) {

        this.originObjectDescriptor = originObjectDescriptor;
        return this;
    }

    /**
     * Get originObjectDescriptor
     *
     * @return originObjectDescriptor
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationObjectDescriptor getOriginObjectDescriptor() {
        return originObjectDescriptor;
    }

    public void setOriginObjectDescriptor(
            NestedReplicationObjectDescriptor originObjectDescriptor) {
        this.originObjectDescriptor = originObjectDescriptor;
    }

    public ReplicaVm originObjectDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR);
        return this;
    }

    public ReplicaVm originObjectDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR);
        return this;
    }

    public void setOriginObjectDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR);
        }
    }

    public boolean getOriginObjectDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGIN_OBJECT_DESCRIPTOR);
    }

    public ReplicaVm originVm(NestedVm originVm) {

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
    public NestedVm getOriginVm() {
        return originVm;
    }

    public void setOriginVm(NestedVm originVm) {
        this.originVm = originVm;
    }

    public ReplicaVm originVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM);
        return this;
    }

    public ReplicaVm originVm_ExplictlyNonNull() {
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

    public ReplicaVm originVmClusterLocalId(String originVmClusterLocalId) {

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

    public ReplicaVm originVmClusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_LOCAL_ID);
        return this;
    }

    public ReplicaVm originVmClusterLocalId_ExplictlyNonNull() {
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

    public ReplicaVm originVmClusterName(String originVmClusterName) {

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

    public ReplicaVm originVmClusterName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_CLUSTER_NAME);
        return this;
    }

    public ReplicaVm originVmClusterName_ExplictlyNonNull() {
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

    public ReplicaVm originVmLocalId(String originVmLocalId) {

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

    public ReplicaVm originVmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_LOCAL_ID);
        return this;
    }

    public ReplicaVm originVmLocalId_ExplictlyNonNull() {
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

    public ReplicaVm originVmName(String originVmName) {

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

    public ReplicaVm originVmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGIN_VM_NAME);
        return this;
    }

    public ReplicaVm originVmName_ExplictlyNonNull() {
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

    public ReplicaVm replicaGroup(String replicaGroup) {

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

    public ReplicaVm replicaGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_GROUP);
        return this;
    }

    public ReplicaVm replicaGroup_ExplictlyNonNull() {
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

    public ReplicaVm replicationGroup(String replicationGroup) {

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

    public ReplicaVm replicationGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_GROUP);
        return this;
    }

    public ReplicaVm replicationGroup_ExplictlyNonNull() {
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

    public ReplicaVm replicationPlan(NestedReplicationPlan replicationPlan) {

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
    public NestedReplicationPlan getReplicationPlan() {
        return replicationPlan;
    }

    public void setReplicationPlan(NestedReplicationPlan replicationPlan) {
        this.replicationPlan = replicationPlan;
    }

    public ReplicaVm replicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public ReplicaVm replicationPlan_ExplictlyNonNull() {
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

    public ReplicaVm replicationService(NestedReplicationService replicationService) {

        this.replicationService = replicationService;
        return this;
    }

    /**
     * Get replicationService
     *
     * @return replicationService
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationService getReplicationService() {
        return replicationService;
    }

    public void setReplicationService(NestedReplicationService replicationService) {
        this.replicationService = replicationService;
    }

    public ReplicaVm replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public ReplicaVm replicationService_ExplictlyNonNull() {
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

    public ReplicaVm replicationTargetExecutions(
            List<NestedReplicationTargetExecution> replicationTargetExecutions) {

        this.replicationTargetExecutions = replicationTargetExecutions;
        return this;
    }

    public ReplicaVm addReplicationTargetExecutionsItem(
            NestedReplicationTargetExecution replicationTargetExecutionsItem) {
        if (this.replicationTargetExecutions == null) {
            this.replicationTargetExecutions = new ArrayList<NestedReplicationTargetExecution>();
        }
        this.replicationTargetExecutions.add(replicationTargetExecutionsItem);
        return this;
    }

    /**
     * Get replicationTargetExecutions
     *
     * @return replicationTargetExecutions
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicationTargetExecution> getReplicationTargetExecutions() {
        return replicationTargetExecutions;
    }

    public void setReplicationTargetExecutions(
            List<NestedReplicationTargetExecution> replicationTargetExecutions) {
        this.replicationTargetExecutions = replicationTargetExecutions;
    }

    public ReplicaVm replicationTargetExecutions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS);
        return this;
    }

    public ReplicaVm replicationTargetExecutions_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS);
        return this;
    }

    public void setReplicationTargetExecutions_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS);
        }
    }

    public boolean getReplicationTargetExecutions_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS);
    }

    public ReplicaVm restorePoints(List<NestedReplicationRestorePoint> restorePoints) {

        this.restorePoints = restorePoints;
        return this;
    }

    public ReplicaVm addRestorePointsItem(NestedReplicationRestorePoint restorePointsItem) {
        if (this.restorePoints == null) {
            this.restorePoints = new ArrayList<NestedReplicationRestorePoint>();
        }
        this.restorePoints.add(restorePointsItem);
        return this;
    }

    /**
     * Get restorePoints
     *
     * @return restorePoints
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicationRestorePoint> getRestorePoints() {
        return restorePoints;
    }

    public void setRestorePoints(List<NestedReplicationRestorePoint> restorePoints) {
        this.restorePoints = restorePoints;
    }

    public ReplicaVm restorePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS);
        return this;
    }

    public ReplicaVm restorePoints_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS);
        return this;
    }

    public void setRestorePoints_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESTORE_POINTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESTORE_POINTS);
        }
    }

    public boolean getRestorePoints_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESTORE_POINTS);
    }

    public ReplicaVm state(ReplicaVmState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicaVmState getState() {
        return state;
    }

    public void setState(ReplicaVmState state) {
        this.state = state;
    }

    public ReplicaVm state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public ReplicaVm state_ExplictlyNonNull() {
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

    public ReplicaVm targetsDeletable(Boolean targetsDeletable) {

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

    public ReplicaVm targetsDeletable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGETS_DELETABLE);
        return this;
    }

    public ReplicaVm targetsDeletable_ExplictlyNonNull() {
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

    public ReplicaVm type(ReplicationObjectType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicationObjectType getType() {
        return type;
    }

    public void setType(ReplicationObjectType type) {
        this.type = type;
    }

    public ReplicaVm type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicaVm type_ExplictlyNonNull() {
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

    public ReplicaVm updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReplicaVm updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicaVm updatedAt_ExplictlyNonNull() {
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

    public ReplicaVm vm(NestedVm vm) {

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
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public ReplicaVm vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public ReplicaVm vm_ExplictlyNonNull() {
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
        ReplicaVm replicaVm = (ReplicaVm) o;
        return Objects.equals(this.createdAt, replicaVm.createdAt)
                && Objects.equals(this.entityAsyncStatus, replicaVm.entityAsyncStatus)
                && Objects.equals(this.externalCloudtower, replicaVm.externalCloudtower)
                && Objects.equals(
                        this.failoverTestObjectDescriptor, replicaVm.failoverTestObjectDescriptor)
                && Objects.equals(this.failoverTestReplicaGroup, replicaVm.failoverTestReplicaGroup)
                && Objects.equals(this.failoverTestVm, replicaVm.failoverTestVm)
                && Objects.equals(this.id, replicaVm.id)
                && Objects.equals(this.inbound, replicaVm.inbound)
                && Objects.equals(this.iscsiLun, replicaVm.iscsiLun)
                && Objects.equals(this.objectDescriptor, replicaVm.objectDescriptor)
                && Objects.equals(this.originIscsiLun, replicaVm.originIscsiLun)
                && Objects.equals(this.originObjectDescriptor, replicaVm.originObjectDescriptor)
                && Objects.equals(this.originVm, replicaVm.originVm)
                && Objects.equals(this.originVmClusterLocalId, replicaVm.originVmClusterLocalId)
                && Objects.equals(this.originVmClusterName, replicaVm.originVmClusterName)
                && Objects.equals(this.originVmLocalId, replicaVm.originVmLocalId)
                && Objects.equals(this.originVmName, replicaVm.originVmName)
                && Objects.equals(this.replicaGroup, replicaVm.replicaGroup)
                && Objects.equals(this.replicationGroup, replicaVm.replicationGroup)
                && Objects.equals(this.replicationPlan, replicaVm.replicationPlan)
                && Objects.equals(this.replicationService, replicaVm.replicationService)
                && Objects.equals(
                        this.replicationTargetExecutions, replicaVm.replicationTargetExecutions)
                && Objects.equals(this.restorePoints, replicaVm.restorePoints)
                && Objects.equals(this.state, replicaVm.state)
                && Objects.equals(this.targetsDeletable, replicaVm.targetsDeletable)
                && Objects.equals(this.type, replicaVm.type)
                && Objects.equals(this.updatedAt, replicaVm.updatedAt)
                && Objects.equals(this.vm, replicaVm.vm);
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
                createdAt,
                entityAsyncStatus,
                externalCloudtower,
                failoverTestObjectDescriptor,
                failoverTestReplicaGroup,
                failoverTestVm,
                id,
                inbound,
                iscsiLun,
                objectDescriptor,
                originIscsiLun,
                originObjectDescriptor,
                originVm,
                originVmClusterLocalId,
                originVmClusterName,
                originVmLocalId,
                originVmName,
                replicaGroup,
                replicationGroup,
                replicationPlan,
                replicationService,
                replicationTargetExecutions,
                restorePoints,
                state,
                targetsDeletable,
                type,
                updatedAt,
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
        sb.append("class ReplicaVm {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    externalCloudtower: ")
                .append(toIndentedString(externalCloudtower))
                .append("\n");
        sb.append("    failoverTestObjectDescriptor: ")
                .append(toIndentedString(failoverTestObjectDescriptor))
                .append("\n");
        sb.append("    failoverTestReplicaGroup: ")
                .append(toIndentedString(failoverTestReplicaGroup))
                .append("\n");
        sb.append("    failoverTestVm: ").append(toIndentedString(failoverTestVm)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
        sb.append("    iscsiLun: ").append(toIndentedString(iscsiLun)).append("\n");
        sb.append("    objectDescriptor: ").append(toIndentedString(objectDescriptor)).append("\n");
        sb.append("    originIscsiLun: ").append(toIndentedString(originIscsiLun)).append("\n");
        sb.append("    originObjectDescriptor: ")
                .append(toIndentedString(originObjectDescriptor))
                .append("\n");
        sb.append("    originVm: ").append(toIndentedString(originVm)).append("\n");
        sb.append("    originVmClusterLocalId: ")
                .append(toIndentedString(originVmClusterLocalId))
                .append("\n");
        sb.append("    originVmClusterName: ")
                .append(toIndentedString(originVmClusterName))
                .append("\n");
        sb.append("    originVmLocalId: ").append(toIndentedString(originVmLocalId)).append("\n");
        sb.append("    originVmName: ").append(toIndentedString(originVmName)).append("\n");
        sb.append("    replicaGroup: ").append(toIndentedString(replicaGroup)).append("\n");
        sb.append("    replicationGroup: ").append(toIndentedString(replicationGroup)).append("\n");
        sb.append("    replicationPlan: ").append(toIndentedString(replicationPlan)).append("\n");
        sb.append("    replicationService: ")
                .append(toIndentedString(replicationService))
                .append("\n");
        sb.append("    replicationTargetExecutions: ")
                .append(toIndentedString(replicationTargetExecutions))
                .append("\n");
        sb.append("    restorePoints: ").append(toIndentedString(restorePoints)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetsDeletable: ").append(toIndentedString(targetsDeletable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
