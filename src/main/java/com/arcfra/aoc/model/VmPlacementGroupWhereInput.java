package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmPlacementGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmPlacementGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmPlacementGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmPlacementGroupWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

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

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ENABLED_NOT = "enabled_not";

    @SerializedName(SERIALIZED_NAME_ENABLED_NOT)
    private Boolean enabledNot;

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

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
    private String localCreatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
    private String localCreatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
    private List<String> localCreatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
    private String localCreatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
    private String localCreatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
    private String localCreatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
    private List<String> localCreatedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
    private String localUpdatedAt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GT = "local_updated_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT)
    private String localUpdatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE = "local_updated_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE)
    private String localUpdatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_IN = "local_updated_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN)
    private List<String> localUpdatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LT = "local_updated_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT)
    private String localUpdatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE = "local_updated_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE)
    private String localUpdatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT = "local_updated_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT)
    private String localUpdatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN = "local_updated_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN)
    private List<String> localUpdatedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED)
    private Boolean vmHostMustEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT =
            "vm_host_must_enabled_not";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT)
    private Boolean vmHostMustEnabledNot;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY =
            "vm_host_must_host_uuids_every";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY)
    private HostWhereInput vmHostMustHostUuidsEvery;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE =
            "vm_host_must_host_uuids_none";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE)
    private HostWhereInput vmHostMustHostUuidsNone;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME =
            "vm_host_must_host_uuids_some";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME)
    private HostWhereInput vmHostMustHostUuidsSome;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY = "vm_host_must_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY)
    private Boolean vmHostMustPolicy;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT = "vm_host_must_policy_not";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT)
    private Boolean vmHostMustPolicyNot;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED)
    private Boolean vmHostPreferEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT =
            "vm_host_prefer_enabled_not";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT)
    private Boolean vmHostPreferEnabledNot;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY =
            "vm_host_prefer_host_uuids_every";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY)
    private HostWhereInput vmHostPreferHostUuidsEvery;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE =
            "vm_host_prefer_host_uuids_none";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE)
    private HostWhereInput vmHostPreferHostUuidsNone;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME =
            "vm_host_prefer_host_uuids_some";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME)
    private HostWhereInput vmHostPreferHostUuidsSome;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY)
    private Boolean vmHostPreferPolicy;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT =
            "vm_host_prefer_policy_not";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT)
    private Boolean vmHostPreferPolicyNot;

    public static final String SERIALIZED_NAME_VM_VM_POLICY = "vm_vm_policy";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY)
    private VmVmPolicy vmVmPolicy;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED)
    private Boolean vmVmPolicyEnabled;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT =
            "vm_vm_policy_enabled_not";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT)
    private Boolean vmVmPolicyEnabledNot;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_IN = "vm_vm_policy_in";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_IN)
    private List<VmVmPolicy> vmVmPolicyIn = null;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_NOT = "vm_vm_policy_not";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_NOT)
    private VmVmPolicy vmVmPolicyNot;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_NOT_IN = "vm_vm_policy_not_in";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN)
    private List<VmVmPolicy> vmVmPolicyNotIn = null;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public VmPlacementGroupWhereInput() {}

    public VmPlacementGroupWhereInput AND(List<VmPlacementGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmPlacementGroupWhereInput addANDItem(VmPlacementGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmPlacementGroupWhereInput>();
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
    public List<VmPlacementGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmPlacementGroupWhereInput> AND) {
        this.AND = AND;
    }

    public VmPlacementGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmPlacementGroupWhereInput AND_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput NOT(List<VmPlacementGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmPlacementGroupWhereInput addNOTItem(VmPlacementGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmPlacementGroupWhereInput>();
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
    public List<VmPlacementGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmPlacementGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmPlacementGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmPlacementGroupWhereInput NOT_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput OR(List<VmPlacementGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmPlacementGroupWhereInput addORItem(VmPlacementGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmPlacementGroupWhereInput>();
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
    public List<VmPlacementGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmPlacementGroupWhereInput> OR) {
        this.OR = OR;
    }

    public VmPlacementGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmPlacementGroupWhereInput OR_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public VmPlacementGroupWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmPlacementGroupWhereInput cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public VmPlacementGroupWhereInput description(String description) {

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

    public VmPlacementGroupWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmPlacementGroupWhereInput description_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionContains(String descriptionContains) {

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

    public VmPlacementGroupWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VmPlacementGroupWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionGt(String descriptionGt) {

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

    public VmPlacementGroupWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionGte(String descriptionGte) {

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

    public VmPlacementGroupWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VmPlacementGroupWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VmPlacementGroupWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionLt(String descriptionLt) {

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

    public VmPlacementGroupWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionLte(String descriptionLte) {

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

    public VmPlacementGroupWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionNot(String descriptionNot) {

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

    public VmPlacementGroupWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public VmPlacementGroupWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public VmPlacementGroupWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VmPlacementGroupWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public VmPlacementGroupWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VmPlacementGroupWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmPlacementGroupWhereInput enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmPlacementGroupWhereInput enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public VmPlacementGroupWhereInput enabledNot(Boolean enabledNot) {

        this.enabledNot = enabledNot;
        return this;
    }

    /**
     * Get enabledNot
     *
     * @return enabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledNot() {
        return enabledNot;
    }

    public void setEnabledNot(Boolean enabledNot) {
        this.enabledNot = enabledNot;
    }

    public VmPlacementGroupWhereInput enabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput enabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public void setEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        }
    }

    public boolean getEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_NOT);
    }

    public VmPlacementGroupWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmPlacementGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmPlacementGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmPlacementGroupWhereInput addEntityAsyncStatusInItem(
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

    public VmPlacementGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmPlacementGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmPlacementGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public VmPlacementGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput id(String id) {

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

    public VmPlacementGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmPlacementGroupWhereInput id_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idContains(String idContains) {

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

    public VmPlacementGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput idContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idEndsWith(String idEndsWith) {

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

    public VmPlacementGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idGt(String idGt) {

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

    public VmPlacementGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmPlacementGroupWhereInput idGt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idGte(String idGte) {

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

    public VmPlacementGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput idGte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmPlacementGroupWhereInput addIdInItem(String idInItem) {
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

    public VmPlacementGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmPlacementGroupWhereInput idIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idLt(String idLt) {

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

    public VmPlacementGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmPlacementGroupWhereInput idLt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idLte(String idLte) {

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

    public VmPlacementGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput idLte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idNot(String idNot) {

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

    public VmPlacementGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput idNot_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idNotContains(String idNotContains) {

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

    public VmPlacementGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmPlacementGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmPlacementGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmPlacementGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput idStartsWith(String idStartsWith) {

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

    public VmPlacementGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public VmPlacementGroupWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public VmPlacementGroupWhereInput localCreatedAtGt(String localCreatedAtGt) {

        this.localCreatedAtGt = localCreatedAtGt;
        return this;
    }

    /**
     * Get localCreatedAtGt
     *
     * @return localCreatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGt() {
        return localCreatedAtGt;
    }

    public void setLocalCreatedAtGt(String localCreatedAtGt) {
        this.localCreatedAtGt = localCreatedAtGt;
    }

    public VmPlacementGroupWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public void setLocalCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        }
    }

    public boolean getLocalCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
    }

    public VmPlacementGroupWhereInput localCreatedAtGte(String localCreatedAtGte) {

        this.localCreatedAtGte = localCreatedAtGte;
        return this;
    }

    /**
     * Get localCreatedAtGte
     *
     * @return localCreatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGte() {
        return localCreatedAtGte;
    }

    public void setLocalCreatedAtGte(String localCreatedAtGte) {
        this.localCreatedAtGte = localCreatedAtGte;
    }

    public VmPlacementGroupWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public void setLocalCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        }
    }

    public boolean getLocalCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
    }

    public VmPlacementGroupWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
        if (this.localCreatedAtIn == null) {
            this.localCreatedAtIn = new ArrayList<String>();
        }
        this.localCreatedAtIn.add(localCreatedAtInItem);
        return this;
    }

    /**
     * Get localCreatedAtIn
     *
     * @return localCreatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtIn() {
        return localCreatedAtIn;
    }

    public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
        this.localCreatedAtIn = localCreatedAtIn;
    }

    public VmPlacementGroupWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public void setLocalCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        }
    }

    public boolean getLocalCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
    }

    public VmPlacementGroupWhereInput localCreatedAtLt(String localCreatedAtLt) {

        this.localCreatedAtLt = localCreatedAtLt;
        return this;
    }

    /**
     * Get localCreatedAtLt
     *
     * @return localCreatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLt() {
        return localCreatedAtLt;
    }

    public void setLocalCreatedAtLt(String localCreatedAtLt) {
        this.localCreatedAtLt = localCreatedAtLt;
    }

    public VmPlacementGroupWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public void setLocalCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        }
    }

    public boolean getLocalCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
    }

    public VmPlacementGroupWhereInput localCreatedAtLte(String localCreatedAtLte) {

        this.localCreatedAtLte = localCreatedAtLte;
        return this;
    }

    /**
     * Get localCreatedAtLte
     *
     * @return localCreatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLte() {
        return localCreatedAtLte;
    }

    public void setLocalCreatedAtLte(String localCreatedAtLte) {
        this.localCreatedAtLte = localCreatedAtLte;
    }

    public VmPlacementGroupWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public void setLocalCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        }
    }

    public boolean getLocalCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
    }

    public VmPlacementGroupWhereInput localCreatedAtNot(String localCreatedAtNot) {

        this.localCreatedAtNot = localCreatedAtNot;
        return this;
    }

    /**
     * Get localCreatedAtNot
     *
     * @return localCreatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtNot() {
        return localCreatedAtNot;
    }

    public void setLocalCreatedAtNot(String localCreatedAtNot) {
        this.localCreatedAtNot = localCreatedAtNot;
    }

    public VmPlacementGroupWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public void setLocalCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        }
    }

    public boolean getLocalCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
    }

    public VmPlacementGroupWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
        if (this.localCreatedAtNotIn == null) {
            this.localCreatedAtNotIn = new ArrayList<String>();
        }
        this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
        return this;
    }

    /**
     * Get localCreatedAtNotIn
     *
     * @return localCreatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtNotIn() {
        return localCreatedAtNotIn;
    }

    public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
        this.localCreatedAtNotIn = localCreatedAtNotIn;
    }

    public VmPlacementGroupWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public void setLocalCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        }
    }

    public boolean getLocalCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
    }

    public VmPlacementGroupWhereInput localId(String localId) {

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

    public VmPlacementGroupWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmPlacementGroupWhereInput localId_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdContains(String localIdContains) {

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

    public VmPlacementGroupWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmPlacementGroupWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdGt(String localIdGt) {

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

    public VmPlacementGroupWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmPlacementGroupWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdGte(String localIdGte) {

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

    public VmPlacementGroupWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmPlacementGroupWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdLt(String localIdLt) {

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

    public VmPlacementGroupWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmPlacementGroupWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdLte(String localIdLte) {

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

    public VmPlacementGroupWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdNot(String localIdNot) {

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

    public VmPlacementGroupWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmPlacementGroupWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmPlacementGroupWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmPlacementGroupWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmPlacementGroupWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmPlacementGroupWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput localUpdatedAt(String localUpdatedAt) {

        this.localUpdatedAt = localUpdatedAt;
        return this;
    }

    /**
     * Get localUpdatedAt
     *
     * @return localUpdatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAt() {
        return localUpdatedAt;
    }

    public void setLocalUpdatedAt(String localUpdatedAt) {
        this.localUpdatedAt = localUpdatedAt;
    }

    public VmPlacementGroupWhereInput localUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public void setLocalUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        }
    }

    public boolean getLocalUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT);
    }

    public VmPlacementGroupWhereInput localUpdatedAtGt(String localUpdatedAtGt) {

        this.localUpdatedAtGt = localUpdatedAtGt;
        return this;
    }

    /**
     * Get localUpdatedAtGt
     *
     * @return localUpdatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGt() {
        return localUpdatedAtGt;
    }

    public void setLocalUpdatedAtGt(String localUpdatedAtGt) {
        this.localUpdatedAtGt = localUpdatedAtGt;
    }

    public VmPlacementGroupWhereInput localUpdatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public void setLocalUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        }
    }

    public boolean getLocalUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
    }

    public VmPlacementGroupWhereInput localUpdatedAtGte(String localUpdatedAtGte) {

        this.localUpdatedAtGte = localUpdatedAtGte;
        return this;
    }

    /**
     * Get localUpdatedAtGte
     *
     * @return localUpdatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGte() {
        return localUpdatedAtGte;
    }

    public void setLocalUpdatedAtGte(String localUpdatedAtGte) {
        this.localUpdatedAtGte = localUpdatedAtGte;
    }

    public VmPlacementGroupWhereInput localUpdatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public void setLocalUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        }
    }

    public boolean getLocalUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
    }

    public VmPlacementGroupWhereInput localUpdatedAtIn(List<String> localUpdatedAtIn) {

        this.localUpdatedAtIn = localUpdatedAtIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalUpdatedAtInItem(String localUpdatedAtInItem) {
        if (this.localUpdatedAtIn == null) {
            this.localUpdatedAtIn = new ArrayList<String>();
        }
        this.localUpdatedAtIn.add(localUpdatedAtInItem);
        return this;
    }

    /**
     * Get localUpdatedAtIn
     *
     * @return localUpdatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtIn() {
        return localUpdatedAtIn;
    }

    public void setLocalUpdatedAtIn(List<String> localUpdatedAtIn) {
        this.localUpdatedAtIn = localUpdatedAtIn;
    }

    public VmPlacementGroupWhereInput localUpdatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public void setLocalUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        }
    }

    public boolean getLocalUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
    }

    public VmPlacementGroupWhereInput localUpdatedAtLt(String localUpdatedAtLt) {

        this.localUpdatedAtLt = localUpdatedAtLt;
        return this;
    }

    /**
     * Get localUpdatedAtLt
     *
     * @return localUpdatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLt() {
        return localUpdatedAtLt;
    }

    public void setLocalUpdatedAtLt(String localUpdatedAtLt) {
        this.localUpdatedAtLt = localUpdatedAtLt;
    }

    public VmPlacementGroupWhereInput localUpdatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public void setLocalUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        }
    }

    public boolean getLocalUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
    }

    public VmPlacementGroupWhereInput localUpdatedAtLte(String localUpdatedAtLte) {

        this.localUpdatedAtLte = localUpdatedAtLte;
        return this;
    }

    /**
     * Get localUpdatedAtLte
     *
     * @return localUpdatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLte() {
        return localUpdatedAtLte;
    }

    public void setLocalUpdatedAtLte(String localUpdatedAtLte) {
        this.localUpdatedAtLte = localUpdatedAtLte;
    }

    public VmPlacementGroupWhereInput localUpdatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public void setLocalUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        }
    }

    public boolean getLocalUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
    }

    public VmPlacementGroupWhereInput localUpdatedAtNot(String localUpdatedAtNot) {

        this.localUpdatedAtNot = localUpdatedAtNot;
        return this;
    }

    /**
     * Get localUpdatedAtNot
     *
     * @return localUpdatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtNot() {
        return localUpdatedAtNot;
    }

    public void setLocalUpdatedAtNot(String localUpdatedAtNot) {
        this.localUpdatedAtNot = localUpdatedAtNot;
    }

    public VmPlacementGroupWhereInput localUpdatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public void setLocalUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        }
    }

    public boolean getLocalUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
    }

    public VmPlacementGroupWhereInput localUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {

        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addLocalUpdatedAtNotInItem(String localUpdatedAtNotInItem) {
        if (this.localUpdatedAtNotIn == null) {
            this.localUpdatedAtNotIn = new ArrayList<String>();
        }
        this.localUpdatedAtNotIn.add(localUpdatedAtNotInItem);
        return this;
    }

    /**
     * Get localUpdatedAtNotIn
     *
     * @return localUpdatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtNotIn() {
        return localUpdatedAtNotIn;
    }

    public void setLocalUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {
        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
    }

    public VmPlacementGroupWhereInput localUpdatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput localUpdatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setLocalUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getLocalUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
    }

    public VmPlacementGroupWhereInput name(String name) {

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

    public VmPlacementGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmPlacementGroupWhereInput name_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameContains(String nameContains) {

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

    public VmPlacementGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public VmPlacementGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameGt(String nameGt) {

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

    public VmPlacementGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VmPlacementGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameGte(String nameGte) {

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

    public VmPlacementGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VmPlacementGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VmPlacementGroupWhereInput addNameInItem(String nameInItem) {
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

    public VmPlacementGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VmPlacementGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameLt(String nameLt) {

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

    public VmPlacementGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VmPlacementGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameLte(String nameLte) {

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

    public VmPlacementGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VmPlacementGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameNot(String nameNot) {

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

    public VmPlacementGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameNotContains(String nameNotContains) {

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

    public VmPlacementGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VmPlacementGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VmPlacementGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VmPlacementGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VmPlacementGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public VmPlacementGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VmPlacementGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VmPlacementGroupWhereInput vmHostMustEnabled(Boolean vmHostMustEnabled) {

        this.vmHostMustEnabled = vmHostMustEnabled;
        return this;
    }

    /**
     * Get vmHostMustEnabled
     *
     * @return vmHostMustEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustEnabled() {
        return vmHostMustEnabled;
    }

    public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
        this.vmHostMustEnabled = vmHostMustEnabled;
    }

    public VmPlacementGroupWhereInput vmHostMustEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        return this;
    }

    public void setVmHostMustEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        }
    }

    public boolean getVmHostMustEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
    }

    public VmPlacementGroupWhereInput vmHostMustEnabledNot(Boolean vmHostMustEnabledNot) {

        this.vmHostMustEnabledNot = vmHostMustEnabledNot;
        return this;
    }

    /**
     * Get vmHostMustEnabledNot
     *
     * @return vmHostMustEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustEnabledNot() {
        return vmHostMustEnabledNot;
    }

    public void setVmHostMustEnabledNot(Boolean vmHostMustEnabledNot) {
        this.vmHostMustEnabledNot = vmHostMustEnabledNot;
    }

    public VmPlacementGroupWhereInput vmHostMustEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT);
        return this;
    }

    public void setVmHostMustEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT);
        }
    }

    public boolean getVmHostMustEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_ENABLED_NOT);
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsEvery(
            HostWhereInput vmHostMustHostUuidsEvery) {

        this.vmHostMustHostUuidsEvery = vmHostMustHostUuidsEvery;
        return this;
    }

    /**
     * Get vmHostMustHostUuidsEvery
     *
     * @return vmHostMustHostUuidsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostMustHostUuidsEvery() {
        return vmHostMustHostUuidsEvery;
    }

    public void setVmHostMustHostUuidsEvery(HostWhereInput vmHostMustHostUuidsEvery) {
        this.vmHostMustHostUuidsEvery = vmHostMustHostUuidsEvery;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY);
        return this;
    }

    public void setVmHostMustHostUuidsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY);
        }
    }

    public boolean getVmHostMustHostUuidsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_EVERY);
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsNone(
            HostWhereInput vmHostMustHostUuidsNone) {

        this.vmHostMustHostUuidsNone = vmHostMustHostUuidsNone;
        return this;
    }

    /**
     * Get vmHostMustHostUuidsNone
     *
     * @return vmHostMustHostUuidsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostMustHostUuidsNone() {
        return vmHostMustHostUuidsNone;
    }

    public void setVmHostMustHostUuidsNone(HostWhereInput vmHostMustHostUuidsNone) {
        this.vmHostMustHostUuidsNone = vmHostMustHostUuidsNone;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE);
        return this;
    }

    public void setVmHostMustHostUuidsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE);
        }
    }

    public boolean getVmHostMustHostUuidsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_NONE);
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsSome(
            HostWhereInput vmHostMustHostUuidsSome) {

        this.vmHostMustHostUuidsSome = vmHostMustHostUuidsSome;
        return this;
    }

    /**
     * Get vmHostMustHostUuidsSome
     *
     * @return vmHostMustHostUuidsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostMustHostUuidsSome() {
        return vmHostMustHostUuidsSome;
    }

    public void setVmHostMustHostUuidsSome(HostWhereInput vmHostMustHostUuidsSome) {
        this.vmHostMustHostUuidsSome = vmHostMustHostUuidsSome;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustHostUuidsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME);
        return this;
    }

    public void setVmHostMustHostUuidsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME);
        }
    }

    public boolean getVmHostMustHostUuidsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS_SOME);
    }

    public VmPlacementGroupWhereInput vmHostMustPolicy(Boolean vmHostMustPolicy) {

        this.vmHostMustPolicy = vmHostMustPolicy;
        return this;
    }

    /**
     * Get vmHostMustPolicy
     *
     * @return vmHostMustPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustPolicy() {
        return vmHostMustPolicy;
    }

    public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
        this.vmHostMustPolicy = vmHostMustPolicy;
    }

    public VmPlacementGroupWhereInput vmHostMustPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        return this;
    }

    public void setVmHostMustPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        }
    }

    public boolean getVmHostMustPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
    }

    public VmPlacementGroupWhereInput vmHostMustPolicyNot(Boolean vmHostMustPolicyNot) {

        this.vmHostMustPolicyNot = vmHostMustPolicyNot;
        return this;
    }

    /**
     * Get vmHostMustPolicyNot
     *
     * @return vmHostMustPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustPolicyNot() {
        return vmHostMustPolicyNot;
    }

    public void setVmHostMustPolicyNot(Boolean vmHostMustPolicyNot) {
        this.vmHostMustPolicyNot = vmHostMustPolicyNot;
    }

    public VmPlacementGroupWhereInput vmHostMustPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostMustPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT);
        return this;
    }

    public void setVmHostMustPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT);
        }
    }

    public boolean getVmHostMustPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_POLICY_NOT);
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabled(Boolean vmHostPreferEnabled) {

        this.vmHostPreferEnabled = vmHostPreferEnabled;
        return this;
    }

    /**
     * Get vmHostPreferEnabled
     *
     * @return vmHostPreferEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferEnabled() {
        return vmHostPreferEnabled;
    }

    public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
        this.vmHostPreferEnabled = vmHostPreferEnabled;
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        return this;
    }

    public void setVmHostPreferEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        }
    }

    public boolean getVmHostPreferEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabledNot(Boolean vmHostPreferEnabledNot) {

        this.vmHostPreferEnabledNot = vmHostPreferEnabledNot;
        return this;
    }

    /**
     * Get vmHostPreferEnabledNot
     *
     * @return vmHostPreferEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferEnabledNot() {
        return vmHostPreferEnabledNot;
    }

    public void setVmHostPreferEnabledNot(Boolean vmHostPreferEnabledNot) {
        this.vmHostPreferEnabledNot = vmHostPreferEnabledNot;
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT);
        return this;
    }

    public void setVmHostPreferEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT);
        }
    }

    public boolean getVmHostPreferEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED_NOT);
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsEvery(
            HostWhereInput vmHostPreferHostUuidsEvery) {

        this.vmHostPreferHostUuidsEvery = vmHostPreferHostUuidsEvery;
        return this;
    }

    /**
     * Get vmHostPreferHostUuidsEvery
     *
     * @return vmHostPreferHostUuidsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostPreferHostUuidsEvery() {
        return vmHostPreferHostUuidsEvery;
    }

    public void setVmHostPreferHostUuidsEvery(HostWhereInput vmHostPreferHostUuidsEvery) {
        this.vmHostPreferHostUuidsEvery = vmHostPreferHostUuidsEvery;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY);
        return this;
    }

    public void setVmHostPreferHostUuidsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY);
        }
    }

    public boolean getVmHostPreferHostUuidsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_EVERY);
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsNone(
            HostWhereInput vmHostPreferHostUuidsNone) {

        this.vmHostPreferHostUuidsNone = vmHostPreferHostUuidsNone;
        return this;
    }

    /**
     * Get vmHostPreferHostUuidsNone
     *
     * @return vmHostPreferHostUuidsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostPreferHostUuidsNone() {
        return vmHostPreferHostUuidsNone;
    }

    public void setVmHostPreferHostUuidsNone(HostWhereInput vmHostPreferHostUuidsNone) {
        this.vmHostPreferHostUuidsNone = vmHostPreferHostUuidsNone;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE);
        return this;
    }

    public void setVmHostPreferHostUuidsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE);
        }
    }

    public boolean getVmHostPreferHostUuidsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_NONE);
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsSome(
            HostWhereInput vmHostPreferHostUuidsSome) {

        this.vmHostPreferHostUuidsSome = vmHostPreferHostUuidsSome;
        return this;
    }

    /**
     * Get vmHostPreferHostUuidsSome
     *
     * @return vmHostPreferHostUuidsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getVmHostPreferHostUuidsSome() {
        return vmHostPreferHostUuidsSome;
    }

    public void setVmHostPreferHostUuidsSome(HostWhereInput vmHostPreferHostUuidsSome) {
        this.vmHostPreferHostUuidsSome = vmHostPreferHostUuidsSome;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferHostUuidsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME);
        return this;
    }

    public void setVmHostPreferHostUuidsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME);
        }
    }

    public boolean getVmHostPreferHostUuidsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS_SOME);
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicy(Boolean vmHostPreferPolicy) {

        this.vmHostPreferPolicy = vmHostPreferPolicy;
        return this;
    }

    /**
     * Get vmHostPreferPolicy
     *
     * @return vmHostPreferPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferPolicy() {
        return vmHostPreferPolicy;
    }

    public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
        this.vmHostPreferPolicy = vmHostPreferPolicy;
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        return this;
    }

    public void setVmHostPreferPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        }
    }

    public boolean getVmHostPreferPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicyNot(Boolean vmHostPreferPolicyNot) {

        this.vmHostPreferPolicyNot = vmHostPreferPolicyNot;
        return this;
    }

    /**
     * Get vmHostPreferPolicyNot
     *
     * @return vmHostPreferPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferPolicyNot() {
        return vmHostPreferPolicyNot;
    }

    public void setVmHostPreferPolicyNot(Boolean vmHostPreferPolicyNot) {
        this.vmHostPreferPolicyNot = vmHostPreferPolicyNot;
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmHostPreferPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT);
        return this;
    }

    public void setVmHostPreferPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT);
        }
    }

    public boolean getVmHostPreferPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_POLICY_NOT);
    }

    public VmPlacementGroupWhereInput vmVmPolicy(VmVmPolicy vmVmPolicy) {

        this.vmVmPolicy = vmVmPolicy;
        return this;
    }

    /**
     * Get vmVmPolicy
     *
     * @return vmVmPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVmPolicy getVmVmPolicy() {
        return vmVmPolicy;
    }

    public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
        this.vmVmPolicy = vmVmPolicy;
    }

    public VmPlacementGroupWhereInput vmVmPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY);
        return this;
    }

    public void setVmVmPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY);
        }
    }

    public boolean getVmVmPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY);
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {

        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
        return this;
    }

    /**
     * Get vmVmPolicyEnabled
     *
     * @return vmVmPolicyEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmVmPolicyEnabled() {
        return vmVmPolicyEnabled;
    }

    public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        return this;
    }

    public void setVmVmPolicyEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        }
    }

    public boolean getVmVmPolicyEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabledNot(Boolean vmVmPolicyEnabledNot) {

        this.vmVmPolicyEnabledNot = vmVmPolicyEnabledNot;
        return this;
    }

    /**
     * Get vmVmPolicyEnabledNot
     *
     * @return vmVmPolicyEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmVmPolicyEnabledNot() {
        return vmVmPolicyEnabledNot;
    }

    public void setVmVmPolicyEnabledNot(Boolean vmVmPolicyEnabledNot) {
        this.vmVmPolicyEnabledNot = vmVmPolicyEnabledNot;
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicyEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT);
        return this;
    }

    public void setVmVmPolicyEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT);
        }
    }

    public boolean getVmVmPolicyEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_ENABLED_NOT);
    }

    public VmPlacementGroupWhereInput vmVmPolicyIn(List<VmVmPolicy> vmVmPolicyIn) {

        this.vmVmPolicyIn = vmVmPolicyIn;
        return this;
    }

    public VmPlacementGroupWhereInput addVmVmPolicyInItem(VmVmPolicy vmVmPolicyInItem) {
        if (this.vmVmPolicyIn == null) {
            this.vmVmPolicyIn = new ArrayList<VmVmPolicy>();
        }
        this.vmVmPolicyIn.add(vmVmPolicyInItem);
        return this;
    }

    /**
     * Get vmVmPolicyIn
     *
     * @return vmVmPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVmPolicy> getVmVmPolicyIn() {
        return vmVmPolicyIn;
    }

    public void setVmVmPolicyIn(List<VmVmPolicy> vmVmPolicyIn) {
        this.vmVmPolicyIn = vmVmPolicyIn;
    }

    public VmPlacementGroupWhereInput vmVmPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_IN);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_IN);
        return this;
    }

    public void setVmVmPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_IN);
        }
    }

    public boolean getVmVmPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_IN);
    }

    public VmPlacementGroupWhereInput vmVmPolicyNot(VmVmPolicy vmVmPolicyNot) {

        this.vmVmPolicyNot = vmVmPolicyNot;
        return this;
    }

    /**
     * Get vmVmPolicyNot
     *
     * @return vmVmPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVmPolicy getVmVmPolicyNot() {
        return vmVmPolicyNot;
    }

    public void setVmVmPolicyNot(VmVmPolicy vmVmPolicyNot) {
        this.vmVmPolicyNot = vmVmPolicyNot;
    }

    public VmPlacementGroupWhereInput vmVmPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_NOT);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_NOT);
        return this;
    }

    public void setVmVmPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_NOT);
        }
    }

    public boolean getVmVmPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_NOT);
    }

    public VmPlacementGroupWhereInput vmVmPolicyNotIn(List<VmVmPolicy> vmVmPolicyNotIn) {

        this.vmVmPolicyNotIn = vmVmPolicyNotIn;
        return this;
    }

    public VmPlacementGroupWhereInput addVmVmPolicyNotInItem(VmVmPolicy vmVmPolicyNotInItem) {
        if (this.vmVmPolicyNotIn == null) {
            this.vmVmPolicyNotIn = new ArrayList<VmVmPolicy>();
        }
        this.vmVmPolicyNotIn.add(vmVmPolicyNotInItem);
        return this;
    }

    /**
     * Get vmVmPolicyNotIn
     *
     * @return vmVmPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVmPolicy> getVmVmPolicyNotIn() {
        return vmVmPolicyNotIn;
    }

    public void setVmVmPolicyNotIn(List<VmVmPolicy> vmVmPolicyNotIn) {
        this.vmVmPolicyNotIn = vmVmPolicyNotIn;
    }

    public VmPlacementGroupWhereInput vmVmPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN);
        return this;
    }

    public VmPlacementGroupWhereInput vmVmPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN);
        return this;
    }

    public void setVmVmPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN);
        }
    }

    public boolean getVmVmPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_NOT_IN);
    }

    public VmPlacementGroupWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public VmPlacementGroupWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public VmPlacementGroupWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public VmPlacementGroupWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public VmPlacementGroupWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public VmPlacementGroupWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public VmPlacementGroupWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public VmPlacementGroupWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public VmPlacementGroupWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmPlacementGroupWhereInput vmPlacementGroupWhereInput = (VmPlacementGroupWhereInput) o;
        return Objects.equals(this.AND, vmPlacementGroupWhereInput.AND)
                && Objects.equals(this.NOT, vmPlacementGroupWhereInput.NOT)
                && Objects.equals(this.OR, vmPlacementGroupWhereInput.OR)
                && Objects.equals(this.cluster, vmPlacementGroupWhereInput.cluster)
                && Objects.equals(this.description, vmPlacementGroupWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, vmPlacementGroupWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, vmPlacementGroupWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, vmPlacementGroupWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, vmPlacementGroupWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, vmPlacementGroupWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, vmPlacementGroupWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, vmPlacementGroupWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, vmPlacementGroupWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        vmPlacementGroupWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        vmPlacementGroupWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, vmPlacementGroupWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        vmPlacementGroupWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        vmPlacementGroupWhereInput.descriptionStartsWith)
                && Objects.equals(this.enabled, vmPlacementGroupWhereInput.enabled)
                && Objects.equals(this.enabledNot, vmPlacementGroupWhereInput.enabledNot)
                && Objects.equals(
                        this.entityAsyncStatus, vmPlacementGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vmPlacementGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmPlacementGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        vmPlacementGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, vmPlacementGroupWhereInput.id)
                && Objects.equals(this.idContains, vmPlacementGroupWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmPlacementGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmPlacementGroupWhereInput.idGt)
                && Objects.equals(this.idGte, vmPlacementGroupWhereInput.idGte)
                && Objects.equals(this.idIn, vmPlacementGroupWhereInput.idIn)
                && Objects.equals(this.idLt, vmPlacementGroupWhereInput.idLt)
                && Objects.equals(this.idLte, vmPlacementGroupWhereInput.idLte)
                && Objects.equals(this.idNot, vmPlacementGroupWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmPlacementGroupWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmPlacementGroupWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmPlacementGroupWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmPlacementGroupWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmPlacementGroupWhereInput.idStartsWith)
                && Objects.equals(this.localCreatedAt, vmPlacementGroupWhereInput.localCreatedAt)
                && Objects.equals(
                        this.localCreatedAtGt, vmPlacementGroupWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, vmPlacementGroupWhereInput.localCreatedAtGte)
                && Objects.equals(
                        this.localCreatedAtIn, vmPlacementGroupWhereInput.localCreatedAtIn)
                && Objects.equals(
                        this.localCreatedAtLt, vmPlacementGroupWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, vmPlacementGroupWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, vmPlacementGroupWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, vmPlacementGroupWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, vmPlacementGroupWhereInput.localId)
                && Objects.equals(this.localIdContains, vmPlacementGroupWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmPlacementGroupWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmPlacementGroupWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmPlacementGroupWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmPlacementGroupWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmPlacementGroupWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmPlacementGroupWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmPlacementGroupWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, vmPlacementGroupWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, vmPlacementGroupWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmPlacementGroupWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vmPlacementGroupWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, vmPlacementGroupWhereInput.localIdStartsWith)
                && Objects.equals(this.localUpdatedAt, vmPlacementGroupWhereInput.localUpdatedAt)
                && Objects.equals(
                        this.localUpdatedAtGt, vmPlacementGroupWhereInput.localUpdatedAtGt)
                && Objects.equals(
                        this.localUpdatedAtGte, vmPlacementGroupWhereInput.localUpdatedAtGte)
                && Objects.equals(
                        this.localUpdatedAtIn, vmPlacementGroupWhereInput.localUpdatedAtIn)
                && Objects.equals(
                        this.localUpdatedAtLt, vmPlacementGroupWhereInput.localUpdatedAtLt)
                && Objects.equals(
                        this.localUpdatedAtLte, vmPlacementGroupWhereInput.localUpdatedAtLte)
                && Objects.equals(
                        this.localUpdatedAtNot, vmPlacementGroupWhereInput.localUpdatedAtNot)
                && Objects.equals(
                        this.localUpdatedAtNotIn, vmPlacementGroupWhereInput.localUpdatedAtNotIn)
                && Objects.equals(this.name, vmPlacementGroupWhereInput.name)
                && Objects.equals(this.nameContains, vmPlacementGroupWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vmPlacementGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vmPlacementGroupWhereInput.nameGt)
                && Objects.equals(this.nameGte, vmPlacementGroupWhereInput.nameGte)
                && Objects.equals(this.nameIn, vmPlacementGroupWhereInput.nameIn)
                && Objects.equals(this.nameLt, vmPlacementGroupWhereInput.nameLt)
                && Objects.equals(this.nameLte, vmPlacementGroupWhereInput.nameLte)
                && Objects.equals(this.nameNot, vmPlacementGroupWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vmPlacementGroupWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vmPlacementGroupWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vmPlacementGroupWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, vmPlacementGroupWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vmPlacementGroupWhereInput.nameStartsWith)
                && Objects.equals(
                        this.vmHostMustEnabled, vmPlacementGroupWhereInput.vmHostMustEnabled)
                && Objects.equals(
                        this.vmHostMustEnabledNot, vmPlacementGroupWhereInput.vmHostMustEnabledNot)
                && Objects.equals(
                        this.vmHostMustHostUuidsEvery,
                        vmPlacementGroupWhereInput.vmHostMustHostUuidsEvery)
                && Objects.equals(
                        this.vmHostMustHostUuidsNone,
                        vmPlacementGroupWhereInput.vmHostMustHostUuidsNone)
                && Objects.equals(
                        this.vmHostMustHostUuidsSome,
                        vmPlacementGroupWhereInput.vmHostMustHostUuidsSome)
                && Objects.equals(
                        this.vmHostMustPolicy, vmPlacementGroupWhereInput.vmHostMustPolicy)
                && Objects.equals(
                        this.vmHostMustPolicyNot, vmPlacementGroupWhereInput.vmHostMustPolicyNot)
                && Objects.equals(
                        this.vmHostPreferEnabled, vmPlacementGroupWhereInput.vmHostPreferEnabled)
                && Objects.equals(
                        this.vmHostPreferEnabledNot,
                        vmPlacementGroupWhereInput.vmHostPreferEnabledNot)
                && Objects.equals(
                        this.vmHostPreferHostUuidsEvery,
                        vmPlacementGroupWhereInput.vmHostPreferHostUuidsEvery)
                && Objects.equals(
                        this.vmHostPreferHostUuidsNone,
                        vmPlacementGroupWhereInput.vmHostPreferHostUuidsNone)
                && Objects.equals(
                        this.vmHostPreferHostUuidsSome,
                        vmPlacementGroupWhereInput.vmHostPreferHostUuidsSome)
                && Objects.equals(
                        this.vmHostPreferPolicy, vmPlacementGroupWhereInput.vmHostPreferPolicy)
                && Objects.equals(
                        this.vmHostPreferPolicyNot,
                        vmPlacementGroupWhereInput.vmHostPreferPolicyNot)
                && Objects.equals(this.vmVmPolicy, vmPlacementGroupWhereInput.vmVmPolicy)
                && Objects.equals(
                        this.vmVmPolicyEnabled, vmPlacementGroupWhereInput.vmVmPolicyEnabled)
                && Objects.equals(
                        this.vmVmPolicyEnabledNot, vmPlacementGroupWhereInput.vmVmPolicyEnabledNot)
                && Objects.equals(this.vmVmPolicyIn, vmPlacementGroupWhereInput.vmVmPolicyIn)
                && Objects.equals(this.vmVmPolicyNot, vmPlacementGroupWhereInput.vmVmPolicyNot)
                && Objects.equals(this.vmVmPolicyNotIn, vmPlacementGroupWhereInput.vmVmPolicyNotIn)
                && Objects.equals(this.vmsEvery, vmPlacementGroupWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, vmPlacementGroupWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, vmPlacementGroupWhereInput.vmsSome);
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
                cluster,
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
                enabled,
                enabledNot,
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
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
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
                localUpdatedAt,
                localUpdatedAtGt,
                localUpdatedAtGte,
                localUpdatedAtIn,
                localUpdatedAtLt,
                localUpdatedAtLte,
                localUpdatedAtNot,
                localUpdatedAtNotIn,
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
                vmHostMustEnabled,
                vmHostMustEnabledNot,
                vmHostMustHostUuidsEvery,
                vmHostMustHostUuidsNone,
                vmHostMustHostUuidsSome,
                vmHostMustPolicy,
                vmHostMustPolicyNot,
                vmHostPreferEnabled,
                vmHostPreferEnabledNot,
                vmHostPreferHostUuidsEvery,
                vmHostPreferHostUuidsNone,
                vmHostPreferHostUuidsSome,
                vmHostPreferPolicy,
                vmHostPreferPolicyNot,
                vmVmPolicy,
                vmVmPolicyEnabled,
                vmVmPolicyEnabledNot,
                vmVmPolicyIn,
                vmVmPolicyNot,
                vmVmPolicyNotIn,
                vmsEvery,
                vmsNone,
                vmsSome);
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
        sb.append("class VmPlacementGroupWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    enabledNot: ").append(toIndentedString(enabledNot)).append("\n");
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
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
        sb.append("    localCreatedAtGte: ")
                .append(toIndentedString(localCreatedAtGte))
                .append("\n");
        sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
        sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
        sb.append("    localCreatedAtLte: ")
                .append(toIndentedString(localCreatedAtLte))
                .append("\n");
        sb.append("    localCreatedAtNot: ")
                .append(toIndentedString(localCreatedAtNot))
                .append("\n");
        sb.append("    localCreatedAtNotIn: ")
                .append(toIndentedString(localCreatedAtNotIn))
                .append("\n");
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
        sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
        sb.append("    localUpdatedAtGt: ").append(toIndentedString(localUpdatedAtGt)).append("\n");
        sb.append("    localUpdatedAtGte: ")
                .append(toIndentedString(localUpdatedAtGte))
                .append("\n");
        sb.append("    localUpdatedAtIn: ").append(toIndentedString(localUpdatedAtIn)).append("\n");
        sb.append("    localUpdatedAtLt: ").append(toIndentedString(localUpdatedAtLt)).append("\n");
        sb.append("    localUpdatedAtLte: ")
                .append(toIndentedString(localUpdatedAtLte))
                .append("\n");
        sb.append("    localUpdatedAtNot: ")
                .append(toIndentedString(localUpdatedAtNot))
                .append("\n");
        sb.append("    localUpdatedAtNotIn: ")
                .append(toIndentedString(localUpdatedAtNotIn))
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
        sb.append("    vmHostMustEnabled: ")
                .append(toIndentedString(vmHostMustEnabled))
                .append("\n");
        sb.append("    vmHostMustEnabledNot: ")
                .append(toIndentedString(vmHostMustEnabledNot))
                .append("\n");
        sb.append("    vmHostMustHostUuidsEvery: ")
                .append(toIndentedString(vmHostMustHostUuidsEvery))
                .append("\n");
        sb.append("    vmHostMustHostUuidsNone: ")
                .append(toIndentedString(vmHostMustHostUuidsNone))
                .append("\n");
        sb.append("    vmHostMustHostUuidsSome: ")
                .append(toIndentedString(vmHostMustHostUuidsSome))
                .append("\n");
        sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
        sb.append("    vmHostMustPolicyNot: ")
                .append(toIndentedString(vmHostMustPolicyNot))
                .append("\n");
        sb.append("    vmHostPreferEnabled: ")
                .append(toIndentedString(vmHostPreferEnabled))
                .append("\n");
        sb.append("    vmHostPreferEnabledNot: ")
                .append(toIndentedString(vmHostPreferEnabledNot))
                .append("\n");
        sb.append("    vmHostPreferHostUuidsEvery: ")
                .append(toIndentedString(vmHostPreferHostUuidsEvery))
                .append("\n");
        sb.append("    vmHostPreferHostUuidsNone: ")
                .append(toIndentedString(vmHostPreferHostUuidsNone))
                .append("\n");
        sb.append("    vmHostPreferHostUuidsSome: ")
                .append(toIndentedString(vmHostPreferHostUuidsSome))
                .append("\n");
        sb.append("    vmHostPreferPolicy: ")
                .append(toIndentedString(vmHostPreferPolicy))
                .append("\n");
        sb.append("    vmHostPreferPolicyNot: ")
                .append(toIndentedString(vmHostPreferPolicyNot))
                .append("\n");
        sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
        sb.append("    vmVmPolicyEnabled: ")
                .append(toIndentedString(vmVmPolicyEnabled))
                .append("\n");
        sb.append("    vmVmPolicyEnabledNot: ")
                .append(toIndentedString(vmVmPolicyEnabledNot))
                .append("\n");
        sb.append("    vmVmPolicyIn: ").append(toIndentedString(vmVmPolicyIn)).append("\n");
        sb.append("    vmVmPolicyNot: ").append(toIndentedString(vmVmPolicyNot)).append("\n");
        sb.append("    vmVmPolicyNotIn: ").append(toIndentedString(vmVmPolicyNotIn)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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
