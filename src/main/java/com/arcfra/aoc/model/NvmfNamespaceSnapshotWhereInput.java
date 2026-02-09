package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvmfNamespaceSnapshotWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceSnapshotWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<NvmfNamespaceSnapshotWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<NvmfNamespaceSnapshotWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<NvmfNamespaceSnapshotWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT =
            "consistency_group_snapshot";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT)
    private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshot;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_K_GT = "ec_k_gt";

    @SerializedName(SERIALIZED_NAME_EC_K_GT)
    private Integer ecKGt;

    public static final String SERIALIZED_NAME_EC_K_GTE = "ec_k_gte";

    @SerializedName(SERIALIZED_NAME_EC_K_GTE)
    private Integer ecKGte;

    public static final String SERIALIZED_NAME_EC_K_IN = "ec_k_in";

    @SerializedName(SERIALIZED_NAME_EC_K_IN)
    private List<Integer> ecKIn = null;

    public static final String SERIALIZED_NAME_EC_K_LT = "ec_k_lt";

    @SerializedName(SERIALIZED_NAME_EC_K_LT)
    private Integer ecKLt;

    public static final String SERIALIZED_NAME_EC_K_LTE = "ec_k_lte";

    @SerializedName(SERIALIZED_NAME_EC_K_LTE)
    private Integer ecKLte;

    public static final String SERIALIZED_NAME_EC_K_NOT = "ec_k_not";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT)
    private Integer ecKNot;

    public static final String SERIALIZED_NAME_EC_K_NOT_IN = "ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT_IN)
    private List<Integer> ecKNotIn = null;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_EC_M_GT = "ec_m_gt";

    @SerializedName(SERIALIZED_NAME_EC_M_GT)
    private Integer ecMGt;

    public static final String SERIALIZED_NAME_EC_M_GTE = "ec_m_gte";

    @SerializedName(SERIALIZED_NAME_EC_M_GTE)
    private Integer ecMGte;

    public static final String SERIALIZED_NAME_EC_M_IN = "ec_m_in";

    @SerializedName(SERIALIZED_NAME_EC_M_IN)
    private List<Integer> ecMIn = null;

    public static final String SERIALIZED_NAME_EC_M_LT = "ec_m_lt";

    @SerializedName(SERIALIZED_NAME_EC_M_LT)
    private Integer ecMLt;

    public static final String SERIALIZED_NAME_EC_M_LTE = "ec_m_lte";

    @SerializedName(SERIALIZED_NAME_EC_M_LTE)
    private Integer ecMLte;

    public static final String SERIALIZED_NAME_EC_M_NOT = "ec_m_not";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT)
    private Integer ecMNot;

    public static final String SERIALIZED_NAME_EC_M_NOT_IN = "ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT_IN)
    private List<Integer> ecMNotIn = null;

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

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

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

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE = "nvmf_namespace";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE)
    private NvmfNamespaceWhereInput nvmfNamespace;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NvmfSubsystemWhereInput nvmfSubsystem;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_IN = "resiliency_type_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_IN)
    private List<ResiliencyType> resiliencyTypeIn = null;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT = "resiliency_type_not";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT)
    private ResiliencyType resiliencyTypeNot;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN = "resiliency_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN)
    private List<ResiliencyType> resiliencyTypeNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP = "snapshot_group";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP)
    private SnapshotGroupWhereInput snapshotGroup;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GT = "unique_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GT)
    private Long uniqueSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GTE = "unique_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GTE)
    private Long uniqueSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_IN = "unique_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_IN)
    private List<Long> uniqueSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LT = "unique_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LT)
    private Long uniqueSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LTE = "unique_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LTE)
    private Long uniqueSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT = "unique_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT)
    private Long uniqueSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN = "unique_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN)
    private List<Long> uniqueSizeNotIn = null;

    public NvmfNamespaceSnapshotWhereInput() {}

    public NvmfNamespaceSnapshotWhereInput AND(List<NvmfNamespaceSnapshotWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addANDItem(NvmfNamespaceSnapshotWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<NvmfNamespaceSnapshotWhereInput>();
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
    public List<NvmfNamespaceSnapshotWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<NvmfNamespaceSnapshotWhereInput> AND) {
        this.AND = AND;
    }

    public NvmfNamespaceSnapshotWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput AND_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput NOT(List<NvmfNamespaceSnapshotWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addNOTItem(NvmfNamespaceSnapshotWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<NvmfNamespaceSnapshotWhereInput>();
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
    public List<NvmfNamespaceSnapshotWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<NvmfNamespaceSnapshotWhereInput> NOT) {
        this.NOT = NOT;
    }

    public NvmfNamespaceSnapshotWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput NOT_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput OR(List<NvmfNamespaceSnapshotWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addORItem(NvmfNamespaceSnapshotWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<NvmfNamespaceSnapshotWhereInput>();
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
    public List<NvmfNamespaceSnapshotWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<NvmfNamespaceSnapshotWhereInput> OR) {
        this.OR = OR;
    }

    public NvmfNamespaceSnapshotWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput OR_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput consistencyGroupSnapshot(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshot) {

        this.consistencyGroupSnapshot = consistencyGroupSnapshot;
        return this;
    }

    /**
     * Get consistencyGroupSnapshot
     *
     * @return consistencyGroupSnapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshot() {
        return consistencyGroupSnapshot;
    }

    public void setConsistencyGroupSnapshot(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshot) {
        this.consistencyGroupSnapshot = consistencyGroupSnapshot;
    }

    public NvmfNamespaceSnapshotWhereInput consistencyGroupSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput consistencyGroupSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        return this;
    }

    public void setConsistencyGroupSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        }
    }

    public boolean getConsistencyGroupSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
    }

    public NvmfNamespaceSnapshotWhereInput ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public NvmfNamespaceSnapshotWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public NvmfNamespaceSnapshotWhereInput ecKGt(Integer ecKGt) {

        this.ecKGt = ecKGt;
        return this;
    }

    /**
     * Get ecKGt
     *
     * @return ecKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGt() {
        return ecKGt;
    }

    public void setEcKGt(Integer ecKGt) {
        this.ecKGt = ecKGt;
    }

    public NvmfNamespaceSnapshotWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public void setEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        }
    }

    public boolean getEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GT);
    }

    public NvmfNamespaceSnapshotWhereInput ecKGte(Integer ecKGte) {

        this.ecKGte = ecKGte;
        return this;
    }

    /**
     * Get ecKGte
     *
     * @return ecKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGte() {
        return ecKGte;
    }

    public void setEcKGte(Integer ecKGte) {
        this.ecKGte = ecKGte;
    }

    public NvmfNamespaceSnapshotWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public void setEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        }
    }

    public boolean getEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GTE);
    }

    public NvmfNamespaceSnapshotWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEcKInItem(Integer ecKInItem) {
        if (this.ecKIn == null) {
            this.ecKIn = new ArrayList<Integer>();
        }
        this.ecKIn.add(ecKInItem);
        return this;
    }

    /**
     * Get ecKIn
     *
     * @return ecKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKIn() {
        return ecKIn;
    }

    public void setEcKIn(List<Integer> ecKIn) {
        this.ecKIn = ecKIn;
    }

    public NvmfNamespaceSnapshotWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public void setEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        }
    }

    public boolean getEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_IN);
    }

    public NvmfNamespaceSnapshotWhereInput ecKLt(Integer ecKLt) {

        this.ecKLt = ecKLt;
        return this;
    }

    /**
     * Get ecKLt
     *
     * @return ecKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLt() {
        return ecKLt;
    }

    public void setEcKLt(Integer ecKLt) {
        this.ecKLt = ecKLt;
    }

    public NvmfNamespaceSnapshotWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public void setEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        }
    }

    public boolean getEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LT);
    }

    public NvmfNamespaceSnapshotWhereInput ecKLte(Integer ecKLte) {

        this.ecKLte = ecKLte;
        return this;
    }

    /**
     * Get ecKLte
     *
     * @return ecKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLte() {
        return ecKLte;
    }

    public void setEcKLte(Integer ecKLte) {
        this.ecKLte = ecKLte;
    }

    public NvmfNamespaceSnapshotWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public void setEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        }
    }

    public boolean getEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LTE);
    }

    public NvmfNamespaceSnapshotWhereInput ecKNot(Integer ecKNot) {

        this.ecKNot = ecKNot;
        return this;
    }

    /**
     * Get ecKNot
     *
     * @return ecKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKNot() {
        return ecKNot;
    }

    public void setEcKNot(Integer ecKNot) {
        this.ecKNot = ecKNot;
    }

    public NvmfNamespaceSnapshotWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public void setEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        }
    }

    public boolean getEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT);
    }

    public NvmfNamespaceSnapshotWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEcKNotInItem(Integer ecKNotInItem) {
        if (this.ecKNotIn == null) {
            this.ecKNotIn = new ArrayList<Integer>();
        }
        this.ecKNotIn.add(ecKNotInItem);
        return this;
    }

    /**
     * Get ecKNotIn
     *
     * @return ecKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKNotIn() {
        return ecKNotIn;
    }

    public void setEcKNotIn(List<Integer> ecKNotIn) {
        this.ecKNotIn = ecKNotIn;
    }

    public NvmfNamespaceSnapshotWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public void setEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        }
    }

    public boolean getEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT_IN);
    }

    public NvmfNamespaceSnapshotWhereInput ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public NvmfNamespaceSnapshotWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public NvmfNamespaceSnapshotWhereInput ecMGt(Integer ecMGt) {

        this.ecMGt = ecMGt;
        return this;
    }

    /**
     * Get ecMGt
     *
     * @return ecMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGt() {
        return ecMGt;
    }

    public void setEcMGt(Integer ecMGt) {
        this.ecMGt = ecMGt;
    }

    public NvmfNamespaceSnapshotWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public void setEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        }
    }

    public boolean getEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GT);
    }

    public NvmfNamespaceSnapshotWhereInput ecMGte(Integer ecMGte) {

        this.ecMGte = ecMGte;
        return this;
    }

    /**
     * Get ecMGte
     *
     * @return ecMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGte() {
        return ecMGte;
    }

    public void setEcMGte(Integer ecMGte) {
        this.ecMGte = ecMGte;
    }

    public NvmfNamespaceSnapshotWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public void setEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        }
    }

    public boolean getEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GTE);
    }

    public NvmfNamespaceSnapshotWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEcMInItem(Integer ecMInItem) {
        if (this.ecMIn == null) {
            this.ecMIn = new ArrayList<Integer>();
        }
        this.ecMIn.add(ecMInItem);
        return this;
    }

    /**
     * Get ecMIn
     *
     * @return ecMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMIn() {
        return ecMIn;
    }

    public void setEcMIn(List<Integer> ecMIn) {
        this.ecMIn = ecMIn;
    }

    public NvmfNamespaceSnapshotWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public void setEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        }
    }

    public boolean getEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_IN);
    }

    public NvmfNamespaceSnapshotWhereInput ecMLt(Integer ecMLt) {

        this.ecMLt = ecMLt;
        return this;
    }

    /**
     * Get ecMLt
     *
     * @return ecMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLt() {
        return ecMLt;
    }

    public void setEcMLt(Integer ecMLt) {
        this.ecMLt = ecMLt;
    }

    public NvmfNamespaceSnapshotWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public void setEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        }
    }

    public boolean getEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LT);
    }

    public NvmfNamespaceSnapshotWhereInput ecMLte(Integer ecMLte) {

        this.ecMLte = ecMLte;
        return this;
    }

    /**
     * Get ecMLte
     *
     * @return ecMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLte() {
        return ecMLte;
    }

    public void setEcMLte(Integer ecMLte) {
        this.ecMLte = ecMLte;
    }

    public NvmfNamespaceSnapshotWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public void setEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        }
    }

    public boolean getEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LTE);
    }

    public NvmfNamespaceSnapshotWhereInput ecMNot(Integer ecMNot) {

        this.ecMNot = ecMNot;
        return this;
    }

    /**
     * Get ecMNot
     *
     * @return ecMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMNot() {
        return ecMNot;
    }

    public void setEcMNot(Integer ecMNot) {
        this.ecMNot = ecMNot;
    }

    public NvmfNamespaceSnapshotWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public void setEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        }
    }

    public boolean getEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT);
    }

    public NvmfNamespaceSnapshotWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEcMNotInItem(Integer ecMNotInItem) {
        if (this.ecMNotIn == null) {
            this.ecMNotIn = new ArrayList<Integer>();
        }
        this.ecMNotIn.add(ecMNotInItem);
        return this;
    }

    /**
     * Get ecMNotIn
     *
     * @return ecMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMNotIn() {
        return ecMNotIn;
    }

    public void setEcMNotIn(List<Integer> ecMNotIn) {
        this.ecMNotIn = ecMNotIn;
    }

    public NvmfNamespaceSnapshotWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput ecMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public void setEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        }
    }

    public boolean getEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT_IN);
    }

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEntityAsyncStatusInItem(
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNot(
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addEntityAsyncStatusNotInItem(
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

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput id(String id) {

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

    public NvmfNamespaceSnapshotWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput id_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idContains(String idContains) {

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

    public NvmfNamespaceSnapshotWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idEndsWith(String idEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idGt(String idGt) {

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

    public NvmfNamespaceSnapshotWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idGt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idGte(String idGte) {

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

    public NvmfNamespaceSnapshotWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idGte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addIdInItem(String idInItem) {
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

    public NvmfNamespaceSnapshotWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idLt(String idLt) {

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

    public NvmfNamespaceSnapshotWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idLt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idLte(String idLte) {

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

    public NvmfNamespaceSnapshotWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idLte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idNot(String idNot) {

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

    public NvmfNamespaceSnapshotWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idNot_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idNotContains(String idNotContains) {

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

    public NvmfNamespaceSnapshotWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idNotContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addIdNotInItem(String idNotInItem) {
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

    public NvmfNamespaceSnapshotWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idNotIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput idStartsWith(String idStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput idStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public NvmfNamespaceSnapshotWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public NvmfNamespaceSnapshotWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public NvmfNamespaceSnapshotWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public NvmfNamespaceSnapshotWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public NvmfNamespaceSnapshotWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAt(String localCreatedAt) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addLocalCreatedAtNotInItem(
            String localCreatedAtNotInItem) {
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

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localId(String localId) {

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

    public NvmfNamespaceSnapshotWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localId_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdContains(String localIdContains) {

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

    public NvmfNamespaceSnapshotWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdGt(String localIdGt) {

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

    public NvmfNamespaceSnapshotWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdGt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdGte(String localIdGte) {

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

    public NvmfNamespaceSnapshotWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdGte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addLocalIdInItem(String localIdInItem) {
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

    public NvmfNamespaceSnapshotWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdLt(String localIdLt) {

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

    public NvmfNamespaceSnapshotWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdLt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdLte(String localIdLte) {

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

    public NvmfNamespaceSnapshotWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdLte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdNot(String localIdNot) {

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

    public NvmfNamespaceSnapshotWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdNot_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdNotContains(String localIdNotContains) {

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

    public NvmfNamespaceSnapshotWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public NvmfNamespaceSnapshotWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput name(String name) {

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

    public NvmfNamespaceSnapshotWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput name_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameContains(String nameContains) {

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

    public NvmfNamespaceSnapshotWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameEndsWith(String nameEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameGt(String nameGt) {

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

    public NvmfNamespaceSnapshotWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameGt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameGte(String nameGte) {

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

    public NvmfNamespaceSnapshotWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameGte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addNameInItem(String nameInItem) {
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

    public NvmfNamespaceSnapshotWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameLt(String nameLt) {

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

    public NvmfNamespaceSnapshotWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameLt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameLte(String nameLte) {

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

    public NvmfNamespaceSnapshotWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameLte_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameNot(String nameNot) {

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

    public NvmfNamespaceSnapshotWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameNot_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameNotContains(String nameNotContains) {

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

    public NvmfNamespaceSnapshotWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameNotContains_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public NvmfNamespaceSnapshotWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addNameNotInItem(String nameNotInItem) {
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

    public NvmfNamespaceSnapshotWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameNotIn_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nameStartsWith(String nameStartsWith) {

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

    public NvmfNamespaceSnapshotWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotWhereInput nvmfNamespace(NvmfNamespaceWhereInput nvmfNamespace) {

        this.nvmfNamespace = nvmfNamespace;
        return this;
    }

    /**
     * Get nvmfNamespace
     *
     * @return nvmfNamespace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNvmfNamespace() {
        return nvmfNamespace;
    }

    public void setNvmfNamespace(NvmfNamespaceWhereInput nvmfNamespace) {
        this.nvmfNamespace = nvmfNamespace;
    }

    public NvmfNamespaceSnapshotWhereInput nvmfNamespace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nvmfNamespace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE);
        return this;
    }

    public void setNvmfNamespace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE);
        }
    }

    public boolean getNvmfNamespace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE);
    }

    public NvmfNamespaceSnapshotWhereInput nvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public NvmfNamespaceSnapshotWhereInput nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput nvmfSubsystem_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public void setNvmfSubsystem_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        }
    }

    public boolean getNvmfSubsystem_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM);
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addResiliencyTypeInItem(
            ResiliencyType resiliencyTypeInItem) {
        if (this.resiliencyTypeIn == null) {
            this.resiliencyTypeIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeIn.add(resiliencyTypeInItem);
        return this;
    }

    /**
     * Get resiliencyTypeIn
     *
     * @return resiliencyTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeIn() {
        return resiliencyTypeIn;
    }

    public void setResiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {
        this.resiliencyTypeIn = resiliencyTypeIn;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public void setResiliencyTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        }
    }

    public boolean getResiliencyTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

        this.resiliencyTypeNot = resiliencyTypeNot;
        return this;
    }

    /**
     * Get resiliencyTypeNot
     *
     * @return resiliencyTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyTypeNot() {
        return resiliencyTypeNot;
    }

    public void setResiliencyTypeNot(ResiliencyType resiliencyTypeNot) {
        this.resiliencyTypeNot = resiliencyTypeNot;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public void setResiliencyTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        }
    }

    public boolean getResiliencyTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNotIn(
            List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addResiliencyTypeNotInItem(
            ResiliencyType resiliencyTypeNotInItem) {
        if (this.resiliencyTypeNotIn == null) {
            this.resiliencyTypeNotIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeNotIn.add(resiliencyTypeNotInItem);
        return this;
    }

    /**
     * Get resiliencyTypeNotIn
     *
     * @return resiliencyTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeNotIn() {
        return resiliencyTypeNotIn;
    }

    public void setResiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {
        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public void setResiliencyTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        }
    }

    public boolean getResiliencyTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
    }

    public NvmfNamespaceSnapshotWhereInput snapshotGroup(SnapshotGroupWhereInput snapshotGroup) {

        this.snapshotGroup = snapshotGroup;
        return this;
    }

    /**
     * Get snapshotGroup
     *
     * @return snapshotGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotGroupWhereInput getSnapshotGroup() {
        return snapshotGroup;
    }

    public void setSnapshotGroup(SnapshotGroupWhereInput snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
    }

    public NvmfNamespaceSnapshotWhereInput snapshotGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput snapshotGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP);
        return this;
    }

    public void setSnapshotGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP);
        }
    }

    public boolean getSnapshotGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGt(Long uniqueSizeGt) {

        this.uniqueSizeGt = uniqueSizeGt;
        return this;
    }

    /**
     * Get uniqueSizeGt
     *
     * @return uniqueSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeGt() {
        return uniqueSizeGt;
    }

    public void setUniqueSizeGt(Long uniqueSizeGt) {
        this.uniqueSizeGt = uniqueSizeGt;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public void setUniqueSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        }
    }

    public boolean getUniqueSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GT);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGte(Long uniqueSizeGte) {

        this.uniqueSizeGte = uniqueSizeGte;
        return this;
    }

    /**
     * Get uniqueSizeGte
     *
     * @return uniqueSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeGte() {
        return uniqueSizeGte;
    }

    public void setUniqueSizeGte(Long uniqueSizeGte) {
        this.uniqueSizeGte = uniqueSizeGte;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public void setUniqueSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        }
    }

    public boolean getUniqueSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeIn(List<Long> uniqueSizeIn) {

        this.uniqueSizeIn = uniqueSizeIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addUniqueSizeInItem(Long uniqueSizeInItem) {
        if (this.uniqueSizeIn == null) {
            this.uniqueSizeIn = new ArrayList<Long>();
        }
        this.uniqueSizeIn.add(uniqueSizeInItem);
        return this;
    }

    /**
     * Get uniqueSizeIn
     *
     * @return uniqueSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUniqueSizeIn() {
        return uniqueSizeIn;
    }

    public void setUniqueSizeIn(List<Long> uniqueSizeIn) {
        this.uniqueSizeIn = uniqueSizeIn;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public void setUniqueSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        }
    }

    public boolean getUniqueSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_IN);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLt(Long uniqueSizeLt) {

        this.uniqueSizeLt = uniqueSizeLt;
        return this;
    }

    /**
     * Get uniqueSizeLt
     *
     * @return uniqueSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeLt() {
        return uniqueSizeLt;
    }

    public void setUniqueSizeLt(Long uniqueSizeLt) {
        this.uniqueSizeLt = uniqueSizeLt;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public void setUniqueSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        }
    }

    public boolean getUniqueSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LT);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLte(Long uniqueSizeLte) {

        this.uniqueSizeLte = uniqueSizeLte;
        return this;
    }

    /**
     * Get uniqueSizeLte
     *
     * @return uniqueSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeLte() {
        return uniqueSizeLte;
    }

    public void setUniqueSizeLte(Long uniqueSizeLte) {
        this.uniqueSizeLte = uniqueSizeLte;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public void setUniqueSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        }
    }

    public boolean getUniqueSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNot(Long uniqueSizeNot) {

        this.uniqueSizeNot = uniqueSizeNot;
        return this;
    }

    /**
     * Get uniqueSizeNot
     *
     * @return uniqueSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeNot() {
        return uniqueSizeNot;
    }

    public void setUniqueSizeNot(Long uniqueSizeNot) {
        this.uniqueSizeNot = uniqueSizeNot;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public void setUniqueSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        }
    }

    public boolean getUniqueSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNotIn(List<Long> uniqueSizeNotIn) {

        this.uniqueSizeNotIn = uniqueSizeNotIn;
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput addUniqueSizeNotInItem(Long uniqueSizeNotInItem) {
        if (this.uniqueSizeNotIn == null) {
            this.uniqueSizeNotIn = new ArrayList<Long>();
        }
        this.uniqueSizeNotIn.add(uniqueSizeNotInItem);
        return this;
    }

    /**
     * Get uniqueSizeNotIn
     *
     * @return uniqueSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUniqueSizeNotIn() {
        return uniqueSizeNotIn;
    }

    public void setUniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
        this.uniqueSizeNotIn = uniqueSizeNotIn;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public NvmfNamespaceSnapshotWhereInput uniqueSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public void setUniqueSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        }
    }

    public boolean getUniqueSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotWhereInput =
                (NvmfNamespaceSnapshotWhereInput) o;
        return Objects.equals(this.AND, nvmfNamespaceSnapshotWhereInput.AND)
                && Objects.equals(this.NOT, nvmfNamespaceSnapshotWhereInput.NOT)
                && Objects.equals(this.OR, nvmfNamespaceSnapshotWhereInput.OR)
                && Objects.equals(
                        this.consistencyGroupSnapshot,
                        nvmfNamespaceSnapshotWhereInput.consistencyGroupSnapshot)
                && Objects.equals(this.ecK, nvmfNamespaceSnapshotWhereInput.ecK)
                && Objects.equals(this.ecKGt, nvmfNamespaceSnapshotWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, nvmfNamespaceSnapshotWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, nvmfNamespaceSnapshotWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, nvmfNamespaceSnapshotWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, nvmfNamespaceSnapshotWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, nvmfNamespaceSnapshotWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, nvmfNamespaceSnapshotWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, nvmfNamespaceSnapshotWhereInput.ecM)
                && Objects.equals(this.ecMGt, nvmfNamespaceSnapshotWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, nvmfNamespaceSnapshotWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, nvmfNamespaceSnapshotWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, nvmfNamespaceSnapshotWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, nvmfNamespaceSnapshotWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, nvmfNamespaceSnapshotWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, nvmfNamespaceSnapshotWhereInput.ecMNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, nvmfNamespaceSnapshotWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        nvmfNamespaceSnapshotWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        nvmfNamespaceSnapshotWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        nvmfNamespaceSnapshotWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, nvmfNamespaceSnapshotWhereInput.id)
                && Objects.equals(this.idContains, nvmfNamespaceSnapshotWhereInput.idContains)
                && Objects.equals(this.idEndsWith, nvmfNamespaceSnapshotWhereInput.idEndsWith)
                && Objects.equals(this.idGt, nvmfNamespaceSnapshotWhereInput.idGt)
                && Objects.equals(this.idGte, nvmfNamespaceSnapshotWhereInput.idGte)
                && Objects.equals(this.idIn, nvmfNamespaceSnapshotWhereInput.idIn)
                && Objects.equals(this.idLt, nvmfNamespaceSnapshotWhereInput.idLt)
                && Objects.equals(this.idLte, nvmfNamespaceSnapshotWhereInput.idLte)
                && Objects.equals(this.idNot, nvmfNamespaceSnapshotWhereInput.idNot)
                && Objects.equals(this.idNotContains, nvmfNamespaceSnapshotWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, nvmfNamespaceSnapshotWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, nvmfNamespaceSnapshotWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, nvmfNamespaceSnapshotWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, nvmfNamespaceSnapshotWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, nvmfNamespaceSnapshotWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, nvmfNamespaceSnapshotWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, nvmfNamespaceSnapshotWhereInput.labelsSome)
                && Objects.equals(
                        this.localCreatedAt, nvmfNamespaceSnapshotWhereInput.localCreatedAt)
                && Objects.equals(
                        this.localCreatedAtGt, nvmfNamespaceSnapshotWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, nvmfNamespaceSnapshotWhereInput.localCreatedAtGte)
                && Objects.equals(
                        this.localCreatedAtIn, nvmfNamespaceSnapshotWhereInput.localCreatedAtIn)
                && Objects.equals(
                        this.localCreatedAtLt, nvmfNamespaceSnapshotWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, nvmfNamespaceSnapshotWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, nvmfNamespaceSnapshotWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn,
                        nvmfNamespaceSnapshotWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, nvmfNamespaceSnapshotWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, nvmfNamespaceSnapshotWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, nvmfNamespaceSnapshotWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, nvmfNamespaceSnapshotWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, nvmfNamespaceSnapshotWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, nvmfNamespaceSnapshotWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, nvmfNamespaceSnapshotWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, nvmfNamespaceSnapshotWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, nvmfNamespaceSnapshotWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, nvmfNamespaceSnapshotWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, nvmfNamespaceSnapshotWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, nvmfNamespaceSnapshotWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        nvmfNamespaceSnapshotWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, nvmfNamespaceSnapshotWhereInput.localIdStartsWith)
                && Objects.equals(this.name, nvmfNamespaceSnapshotWhereInput.name)
                && Objects.equals(this.nameContains, nvmfNamespaceSnapshotWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, nvmfNamespaceSnapshotWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, nvmfNamespaceSnapshotWhereInput.nameGt)
                && Objects.equals(this.nameGte, nvmfNamespaceSnapshotWhereInput.nameGte)
                && Objects.equals(this.nameIn, nvmfNamespaceSnapshotWhereInput.nameIn)
                && Objects.equals(this.nameLt, nvmfNamespaceSnapshotWhereInput.nameLt)
                && Objects.equals(this.nameLte, nvmfNamespaceSnapshotWhereInput.nameLte)
                && Objects.equals(this.nameNot, nvmfNamespaceSnapshotWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, nvmfNamespaceSnapshotWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, nvmfNamespaceSnapshotWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, nvmfNamespaceSnapshotWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, nvmfNamespaceSnapshotWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, nvmfNamespaceSnapshotWhereInput.nameStartsWith)
                && Objects.equals(this.nvmfNamespace, nvmfNamespaceSnapshotWhereInput.nvmfNamespace)
                && Objects.equals(this.nvmfSubsystem, nvmfNamespaceSnapshotWhereInput.nvmfSubsystem)
                && Objects.equals(
                        this.resiliencyType, nvmfNamespaceSnapshotWhereInput.resiliencyType)
                && Objects.equals(
                        this.resiliencyTypeIn, nvmfNamespaceSnapshotWhereInput.resiliencyTypeIn)
                && Objects.equals(
                        this.resiliencyTypeNot, nvmfNamespaceSnapshotWhereInput.resiliencyTypeNot)
                && Objects.equals(
                        this.resiliencyTypeNotIn,
                        nvmfNamespaceSnapshotWhereInput.resiliencyTypeNotIn)
                && Objects.equals(this.snapshotGroup, nvmfNamespaceSnapshotWhereInput.snapshotGroup)
                && Objects.equals(this.uniqueSize, nvmfNamespaceSnapshotWhereInput.uniqueSize)
                && Objects.equals(this.uniqueSizeGt, nvmfNamespaceSnapshotWhereInput.uniqueSizeGt)
                && Objects.equals(this.uniqueSizeGte, nvmfNamespaceSnapshotWhereInput.uniqueSizeGte)
                && Objects.equals(this.uniqueSizeIn, nvmfNamespaceSnapshotWhereInput.uniqueSizeIn)
                && Objects.equals(this.uniqueSizeLt, nvmfNamespaceSnapshotWhereInput.uniqueSizeLt)
                && Objects.equals(this.uniqueSizeLte, nvmfNamespaceSnapshotWhereInput.uniqueSizeLte)
                && Objects.equals(this.uniqueSizeNot, nvmfNamespaceSnapshotWhereInput.uniqueSizeNot)
                && Objects.equals(
                        this.uniqueSizeNotIn, nvmfNamespaceSnapshotWhereInput.uniqueSizeNotIn);
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
                consistencyGroupSnapshot,
                ecK,
                ecKGt,
                ecKGte,
                ecKIn,
                ecKLt,
                ecKLte,
                ecKNot,
                ecKNotIn,
                ecM,
                ecMGt,
                ecMGte,
                ecMIn,
                ecMLt,
                ecMLte,
                ecMNot,
                ecMNotIn,
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
                labelsEvery,
                labelsNone,
                labelsSome,
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
                nvmfNamespace,
                nvmfSubsystem,
                resiliencyType,
                resiliencyTypeIn,
                resiliencyTypeNot,
                resiliencyTypeNotIn,
                snapshotGroup,
                uniqueSize,
                uniqueSizeGt,
                uniqueSizeGte,
                uniqueSizeIn,
                uniqueSizeLt,
                uniqueSizeLte,
                uniqueSizeNot,
                uniqueSizeNotIn);
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
        sb.append("class NvmfNamespaceSnapshotWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    consistencyGroupSnapshot: ")
                .append(toIndentedString(consistencyGroupSnapshot))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecKGt: ").append(toIndentedString(ecKGt)).append("\n");
        sb.append("    ecKGte: ").append(toIndentedString(ecKGte)).append("\n");
        sb.append("    ecKIn: ").append(toIndentedString(ecKIn)).append("\n");
        sb.append("    ecKLt: ").append(toIndentedString(ecKLt)).append("\n");
        sb.append("    ecKLte: ").append(toIndentedString(ecKLte)).append("\n");
        sb.append("    ecKNot: ").append(toIndentedString(ecKNot)).append("\n");
        sb.append("    ecKNotIn: ").append(toIndentedString(ecKNotIn)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    ecMGt: ").append(toIndentedString(ecMGt)).append("\n");
        sb.append("    ecMGte: ").append(toIndentedString(ecMGte)).append("\n");
        sb.append("    ecMIn: ").append(toIndentedString(ecMIn)).append("\n");
        sb.append("    ecMLt: ").append(toIndentedString(ecMLt)).append("\n");
        sb.append("    ecMLte: ").append(toIndentedString(ecMLte)).append("\n");
        sb.append("    ecMNot: ").append(toIndentedString(ecMNot)).append("\n");
        sb.append("    ecMNotIn: ").append(toIndentedString(ecMNotIn)).append("\n");
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
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
        sb.append("    nvmfNamespace: ").append(toIndentedString(nvmfNamespace)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resiliencyTypeIn: ").append(toIndentedString(resiliencyTypeIn)).append("\n");
        sb.append("    resiliencyTypeNot: ")
                .append(toIndentedString(resiliencyTypeNot))
                .append("\n");
        sb.append("    resiliencyTypeNotIn: ")
                .append(toIndentedString(resiliencyTypeNotIn))
                .append("\n");
        sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    uniqueSizeGt: ").append(toIndentedString(uniqueSizeGt)).append("\n");
        sb.append("    uniqueSizeGte: ").append(toIndentedString(uniqueSizeGte)).append("\n");
        sb.append("    uniqueSizeIn: ").append(toIndentedString(uniqueSizeIn)).append("\n");
        sb.append("    uniqueSizeLt: ").append(toIndentedString(uniqueSizeLt)).append("\n");
        sb.append("    uniqueSizeLte: ").append(toIndentedString(uniqueSizeLte)).append("\n");
        sb.append("    uniqueSizeNot: ").append(toIndentedString(uniqueSizeNot)).append("\n");
        sb.append("    uniqueSizeNotIn: ").append(toIndentedString(uniqueSizeNotIn)).append("\n");
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
