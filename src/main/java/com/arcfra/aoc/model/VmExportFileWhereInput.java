package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmExportFileWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportFileWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmExportFileWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmExportFileWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmExportFileWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE =
            "content_library_vm_template";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate;

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

    public static final String SERIALIZED_NAME_DAMAGED = "damaged";

    @SerializedName(SERIALIZED_NAME_DAMAGED)
    private Boolean damaged;

    public static final String SERIALIZED_NAME_DAMAGED_NOT = "damaged_not";

    @SerializedName(SERIALIZED_NAME_DAMAGED_NOT)
    private Boolean damagedNot;

    public static final String SERIALIZED_NAME_DATA_PORT_ID = "data_port_id";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID)
    private String dataPortId;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_CONTAINS = "data_port_id_contains";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS)
    private String dataPortIdContains;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH = "data_port_id_ends_with";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH)
    private String dataPortIdEndsWith;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_GT = "data_port_id_gt";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_GT)
    private String dataPortIdGt;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_GTE = "data_port_id_gte";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_GTE)
    private String dataPortIdGte;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_IN = "data_port_id_in";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_IN)
    private List<String> dataPortIdIn = null;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_LT = "data_port_id_lt";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_LT)
    private String dataPortIdLt;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_LTE = "data_port_id_lte";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_LTE)
    private String dataPortIdLte;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_NOT = "data_port_id_not";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_NOT)
    private String dataPortIdNot;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS =
            "data_port_id_not_contains";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS)
    private String dataPortIdNotContains;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH =
            "data_port_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH)
    private String dataPortIdNotEndsWith;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_NOT_IN = "data_port_id_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN)
    private List<String> dataPortIdNotIn = null;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH =
            "data_port_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH)
    private String dataPortIdNotStartsWith;

    public static final String SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH =
            "data_port_id_starts_with";

    @SerializedName(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH)
    private String dataPortIdStartsWith;

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

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID = "storage_cluster_id";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID)
    private String storageClusterId;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS =
            "storage_cluster_id_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS)
    private String storageClusterIdContains;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH =
            "storage_cluster_id_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH)
    private String storageClusterIdEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT = "storage_cluster_id_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT)
    private String storageClusterIdGt;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE = "storage_cluster_id_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE)
    private String storageClusterIdGte;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN = "storage_cluster_id_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN)
    private List<String> storageClusterIdIn = null;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT = "storage_cluster_id_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT)
    private String storageClusterIdLt;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE = "storage_cluster_id_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE)
    private String storageClusterIdLte;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT = "storage_cluster_id_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT)
    private String storageClusterIdNot;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS =
            "storage_cluster_id_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS)
    private String storageClusterIdNotContains;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH =
            "storage_cluster_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH)
    private String storageClusterIdNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN =
            "storage_cluster_id_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN)
    private List<String> storageClusterIdNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH =
            "storage_cluster_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH)
    private String storageClusterIdNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH =
            "storage_cluster_id_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH)
    private String storageClusterIdStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmExportFileType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmExportFileType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmExportFileType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmExportFileType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private VmVolumeWhereInput vmVolume;

    public VmExportFileWhereInput() {}

    public VmExportFileWhereInput AND(List<VmExportFileWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmExportFileWhereInput addANDItem(VmExportFileWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmExportFileWhereInput>();
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
    public List<VmExportFileWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmExportFileWhereInput> AND) {
        this.AND = AND;
    }

    public VmExportFileWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmExportFileWhereInput AND_ExplictlyNonNull() {
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

    public VmExportFileWhereInput NOT(List<VmExportFileWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmExportFileWhereInput addNOTItem(VmExportFileWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmExportFileWhereInput>();
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
    public List<VmExportFileWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmExportFileWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmExportFileWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmExportFileWhereInput NOT_ExplictlyNonNull() {
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

    public VmExportFileWhereInput OR(List<VmExportFileWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmExportFileWhereInput addORItem(VmExportFileWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmExportFileWhereInput>();
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
    public List<VmExportFileWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmExportFileWhereInput> OR) {
        this.OR = OR;
    }

    public VmExportFileWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmExportFileWhereInput OR_ExplictlyNonNull() {
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

    public VmExportFileWhereInput contentLibraryVmTemplate(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {

        this.contentLibraryVmTemplate = contentLibraryVmTemplate;
        return this;
    }

    /**
     * Get contentLibraryVmTemplate
     *
     * @return contentLibraryVmTemplate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplate() {
        return contentLibraryVmTemplate;
    }

    public void setContentLibraryVmTemplate(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {
        this.contentLibraryVmTemplate = contentLibraryVmTemplate;
    }

    public VmExportFileWhereInput contentLibraryVmTemplate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        return this;
    }

    public VmExportFileWhereInput contentLibraryVmTemplate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        return this;
    }

    public void setContentLibraryVmTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        }
    }

    public boolean getContentLibraryVmTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
    }

    public VmExportFileWhereInput createdAt(String createdAt) {

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

    public VmExportFileWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public VmExportFileWhereInput createdAt_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtGt(String createdAtGt) {

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

    public VmExportFileWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public VmExportFileWhereInput createdAtGt_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtGte(String createdAtGte) {

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

    public VmExportFileWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public VmExportFileWhereInput createdAtGte_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public VmExportFileWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public VmExportFileWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public VmExportFileWhereInput createdAtIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtLt(String createdAtLt) {

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

    public VmExportFileWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public VmExportFileWhereInput createdAtLt_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtLte(String createdAtLte) {

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

    public VmExportFileWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public VmExportFileWhereInput createdAtLte_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtNot(String createdAtNot) {

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

    public VmExportFileWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public VmExportFileWhereInput createdAtNot_ExplictlyNonNull() {
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

    public VmExportFileWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public VmExportFileWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public VmExportFileWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput damaged(Boolean damaged) {

        this.damaged = damaged;
        return this;
    }

    /**
     * Get damaged
     *
     * @return damaged
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDamaged() {
        return damaged;
    }

    public void setDamaged(Boolean damaged) {
        this.damaged = damaged;
    }

    public VmExportFileWhereInput damaged_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DAMAGED);
        return this;
    }

    public VmExportFileWhereInput damaged_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DAMAGED);
        return this;
    }

    public void setDamaged_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DAMAGED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DAMAGED);
        }
    }

    public boolean getDamaged_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DAMAGED);
    }

    public VmExportFileWhereInput damagedNot(Boolean damagedNot) {

        this.damagedNot = damagedNot;
        return this;
    }

    /**
     * Get damagedNot
     *
     * @return damagedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDamagedNot() {
        return damagedNot;
    }

    public void setDamagedNot(Boolean damagedNot) {
        this.damagedNot = damagedNot;
    }

    public VmExportFileWhereInput damagedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DAMAGED_NOT);
        return this;
    }

    public VmExportFileWhereInput damagedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DAMAGED_NOT);
        return this;
    }

    public void setDamagedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DAMAGED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DAMAGED_NOT);
        }
    }

    public boolean getDamagedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DAMAGED_NOT);
    }

    public VmExportFileWhereInput dataPortId(String dataPortId) {

        this.dataPortId = dataPortId;
        return this;
    }

    /**
     * Get dataPortId
     *
     * @return dataPortId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortId() {
        return dataPortId;
    }

    public void setDataPortId(String dataPortId) {
        this.dataPortId = dataPortId;
    }

    public VmExportFileWhereInput dataPortId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID);
        return this;
    }

    public VmExportFileWhereInput dataPortId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID);
        return this;
    }

    public void setDataPortId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID);
        }
    }

    public boolean getDataPortId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID);
    }

    public VmExportFileWhereInput dataPortIdContains(String dataPortIdContains) {

        this.dataPortIdContains = dataPortIdContains;
        return this;
    }

    /**
     * Get dataPortIdContains
     *
     * @return dataPortIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdContains() {
        return dataPortIdContains;
    }

    public void setDataPortIdContains(String dataPortIdContains) {
        this.dataPortIdContains = dataPortIdContains;
    }

    public VmExportFileWhereInput dataPortIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput dataPortIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS);
        return this;
    }

    public void setDataPortIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS);
        }
    }

    public boolean getDataPortIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_CONTAINS);
    }

    public VmExportFileWhereInput dataPortIdEndsWith(String dataPortIdEndsWith) {

        this.dataPortIdEndsWith = dataPortIdEndsWith;
        return this;
    }

    /**
     * Get dataPortIdEndsWith
     *
     * @return dataPortIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdEndsWith() {
        return dataPortIdEndsWith;
    }

    public void setDataPortIdEndsWith(String dataPortIdEndsWith) {
        this.dataPortIdEndsWith = dataPortIdEndsWith;
    }

    public VmExportFileWhereInput dataPortIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput dataPortIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH);
        return this;
    }

    public void setDataPortIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH);
        }
    }

    public boolean getDataPortIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_ENDS_WITH);
    }

    public VmExportFileWhereInput dataPortIdGt(String dataPortIdGt) {

        this.dataPortIdGt = dataPortIdGt;
        return this;
    }

    /**
     * Get dataPortIdGt
     *
     * @return dataPortIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdGt() {
        return dataPortIdGt;
    }

    public void setDataPortIdGt(String dataPortIdGt) {
        this.dataPortIdGt = dataPortIdGt;
    }

    public VmExportFileWhereInput dataPortIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_GT);
        return this;
    }

    public VmExportFileWhereInput dataPortIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_GT);
        return this;
    }

    public void setDataPortIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_GT);
        }
    }

    public boolean getDataPortIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_GT);
    }

    public VmExportFileWhereInput dataPortIdGte(String dataPortIdGte) {

        this.dataPortIdGte = dataPortIdGte;
        return this;
    }

    /**
     * Get dataPortIdGte
     *
     * @return dataPortIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdGte() {
        return dataPortIdGte;
    }

    public void setDataPortIdGte(String dataPortIdGte) {
        this.dataPortIdGte = dataPortIdGte;
    }

    public VmExportFileWhereInput dataPortIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_GTE);
        return this;
    }

    public VmExportFileWhereInput dataPortIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_GTE);
        return this;
    }

    public void setDataPortIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_GTE);
        }
    }

    public boolean getDataPortIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_GTE);
    }

    public VmExportFileWhereInput dataPortIdIn(List<String> dataPortIdIn) {

        this.dataPortIdIn = dataPortIdIn;
        return this;
    }

    public VmExportFileWhereInput addDataPortIdInItem(String dataPortIdInItem) {
        if (this.dataPortIdIn == null) {
            this.dataPortIdIn = new ArrayList<String>();
        }
        this.dataPortIdIn.add(dataPortIdInItem);
        return this;
    }

    /**
     * Get dataPortIdIn
     *
     * @return dataPortIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDataPortIdIn() {
        return dataPortIdIn;
    }

    public void setDataPortIdIn(List<String> dataPortIdIn) {
        this.dataPortIdIn = dataPortIdIn;
    }

    public VmExportFileWhereInput dataPortIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_IN);
        return this;
    }

    public VmExportFileWhereInput dataPortIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_IN);
        return this;
    }

    public void setDataPortIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_IN);
        }
    }

    public boolean getDataPortIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_IN);
    }

    public VmExportFileWhereInput dataPortIdLt(String dataPortIdLt) {

        this.dataPortIdLt = dataPortIdLt;
        return this;
    }

    /**
     * Get dataPortIdLt
     *
     * @return dataPortIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdLt() {
        return dataPortIdLt;
    }

    public void setDataPortIdLt(String dataPortIdLt) {
        this.dataPortIdLt = dataPortIdLt;
    }

    public VmExportFileWhereInput dataPortIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_LT);
        return this;
    }

    public VmExportFileWhereInput dataPortIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_LT);
        return this;
    }

    public void setDataPortIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_LT);
        }
    }

    public boolean getDataPortIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_LT);
    }

    public VmExportFileWhereInput dataPortIdLte(String dataPortIdLte) {

        this.dataPortIdLte = dataPortIdLte;
        return this;
    }

    /**
     * Get dataPortIdLte
     *
     * @return dataPortIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdLte() {
        return dataPortIdLte;
    }

    public void setDataPortIdLte(String dataPortIdLte) {
        this.dataPortIdLte = dataPortIdLte;
    }

    public VmExportFileWhereInput dataPortIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_LTE);
        return this;
    }

    public VmExportFileWhereInput dataPortIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_LTE);
        return this;
    }

    public void setDataPortIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_LTE);
        }
    }

    public boolean getDataPortIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_LTE);
    }

    public VmExportFileWhereInput dataPortIdNot(String dataPortIdNot) {

        this.dataPortIdNot = dataPortIdNot;
        return this;
    }

    /**
     * Get dataPortIdNot
     *
     * @return dataPortIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdNot() {
        return dataPortIdNot;
    }

    public void setDataPortIdNot(String dataPortIdNot) {
        this.dataPortIdNot = dataPortIdNot;
    }

    public VmExportFileWhereInput dataPortIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT);
        return this;
    }

    public VmExportFileWhereInput dataPortIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT);
        return this;
    }

    public void setDataPortIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT);
        }
    }

    public boolean getDataPortIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_NOT);
    }

    public VmExportFileWhereInput dataPortIdNotContains(String dataPortIdNotContains) {

        this.dataPortIdNotContains = dataPortIdNotContains;
        return this;
    }

    /**
     * Get dataPortIdNotContains
     *
     * @return dataPortIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdNotContains() {
        return dataPortIdNotContains;
    }

    public void setDataPortIdNotContains(String dataPortIdNotContains) {
        this.dataPortIdNotContains = dataPortIdNotContains;
    }

    public VmExportFileWhereInput dataPortIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput dataPortIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS);
        return this;
    }

    public void setDataPortIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS);
        }
    }

    public boolean getDataPortIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_NOT_CONTAINS);
    }

    public VmExportFileWhereInput dataPortIdNotEndsWith(String dataPortIdNotEndsWith) {

        this.dataPortIdNotEndsWith = dataPortIdNotEndsWith;
        return this;
    }

    /**
     * Get dataPortIdNotEndsWith
     *
     * @return dataPortIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdNotEndsWith() {
        return dataPortIdNotEndsWith;
    }

    public void setDataPortIdNotEndsWith(String dataPortIdNotEndsWith) {
        this.dataPortIdNotEndsWith = dataPortIdNotEndsWith;
    }

    public VmExportFileWhereInput dataPortIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput dataPortIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setDataPortIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getDataPortIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_NOT_ENDS_WITH);
    }

    public VmExportFileWhereInput dataPortIdNotIn(List<String> dataPortIdNotIn) {

        this.dataPortIdNotIn = dataPortIdNotIn;
        return this;
    }

    public VmExportFileWhereInput addDataPortIdNotInItem(String dataPortIdNotInItem) {
        if (this.dataPortIdNotIn == null) {
            this.dataPortIdNotIn = new ArrayList<String>();
        }
        this.dataPortIdNotIn.add(dataPortIdNotInItem);
        return this;
    }

    /**
     * Get dataPortIdNotIn
     *
     * @return dataPortIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDataPortIdNotIn() {
        return dataPortIdNotIn;
    }

    public void setDataPortIdNotIn(List<String> dataPortIdNotIn) {
        this.dataPortIdNotIn = dataPortIdNotIn;
    }

    public VmExportFileWhereInput dataPortIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput dataPortIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN);
        return this;
    }

    public void setDataPortIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN);
        }
    }

    public boolean getDataPortIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_NOT_IN);
    }

    public VmExportFileWhereInput dataPortIdNotStartsWith(String dataPortIdNotStartsWith) {

        this.dataPortIdNotStartsWith = dataPortIdNotStartsWith;
        return this;
    }

    /**
     * Get dataPortIdNotStartsWith
     *
     * @return dataPortIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdNotStartsWith() {
        return dataPortIdNotStartsWith;
    }

    public void setDataPortIdNotStartsWith(String dataPortIdNotStartsWith) {
        this.dataPortIdNotStartsWith = dataPortIdNotStartsWith;
    }

    public VmExportFileWhereInput dataPortIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput dataPortIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setDataPortIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getDataPortIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_NOT_STARTS_WITH);
    }

    public VmExportFileWhereInput dataPortIdStartsWith(String dataPortIdStartsWith) {

        this.dataPortIdStartsWith = dataPortIdStartsWith;
        return this;
    }

    /**
     * Get dataPortIdStartsWith
     *
     * @return dataPortIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataPortIdStartsWith() {
        return dataPortIdStartsWith;
    }

    public void setDataPortIdStartsWith(String dataPortIdStartsWith) {
        this.dataPortIdStartsWith = dataPortIdStartsWith;
    }

    public VmExportFileWhereInput dataPortIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput dataPortIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH);
        return this;
    }

    public void setDataPortIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH);
        }
    }

    public boolean getDataPortIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_PORT_ID_STARTS_WITH);
    }

    public VmExportFileWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmExportFileWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmExportFileWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmExportFileWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmExportFileWhereInput addEntityAsyncStatusInItem(
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

    public VmExportFileWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmExportFileWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmExportFileWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmExportFileWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmExportFileWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmExportFileWhereInput addEntityAsyncStatusNotInItem(
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

    public VmExportFileWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput id(String id) {

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

    public VmExportFileWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmExportFileWhereInput id_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idContains(String idContains) {

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

    public VmExportFileWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput idContains_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idEndsWith(String idEndsWith) {

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

    public VmExportFileWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idGt(String idGt) {

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

    public VmExportFileWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmExportFileWhereInput idGt_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idGte(String idGte) {

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

    public VmExportFileWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmExportFileWhereInput idGte_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmExportFileWhereInput addIdInItem(String idInItem) {
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

    public VmExportFileWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmExportFileWhereInput idIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idLt(String idLt) {

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

    public VmExportFileWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmExportFileWhereInput idLt_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idLte(String idLte) {

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

    public VmExportFileWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmExportFileWhereInput idLte_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idNot(String idNot) {

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

    public VmExportFileWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmExportFileWhereInput idNot_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idNotContains(String idNotContains) {

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

    public VmExportFileWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmExportFileWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmExportFileWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmExportFileWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmExportFileWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmExportFileWhereInput idStartsWith(String idStartsWith) {

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

    public VmExportFileWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmExportFileWhereInput storageClusterId(String storageClusterId) {

        this.storageClusterId = storageClusterId;
        return this;
    }

    /**
     * Get storageClusterId
     *
     * @return storageClusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterId() {
        return storageClusterId;
    }

    public void setStorageClusterId(String storageClusterId) {
        this.storageClusterId = storageClusterId;
    }

    public VmExportFileWhereInput storageClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        return this;
    }

    public VmExportFileWhereInput storageClusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        return this;
    }

    public void setStorageClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
        }
    }

    public boolean getStorageClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID);
    }

    public VmExportFileWhereInput storageClusterIdContains(String storageClusterIdContains) {

        this.storageClusterIdContains = storageClusterIdContains;
        return this;
    }

    /**
     * Get storageClusterIdContains
     *
     * @return storageClusterIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdContains() {
        return storageClusterIdContains;
    }

    public void setStorageClusterIdContains(String storageClusterIdContains) {
        this.storageClusterIdContains = storageClusterIdContains;
    }

    public VmExportFileWhereInput storageClusterIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS);
        return this;
    }

    public void setStorageClusterIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS);
        }
    }

    public boolean getStorageClusterIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_CONTAINS);
    }

    public VmExportFileWhereInput storageClusterIdEndsWith(String storageClusterIdEndsWith) {

        this.storageClusterIdEndsWith = storageClusterIdEndsWith;
        return this;
    }

    /**
     * Get storageClusterIdEndsWith
     *
     * @return storageClusterIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdEndsWith() {
        return storageClusterIdEndsWith;
    }

    public void setStorageClusterIdEndsWith(String storageClusterIdEndsWith) {
        this.storageClusterIdEndsWith = storageClusterIdEndsWith;
    }

    public VmExportFileWhereInput storageClusterIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH);
        return this;
    }

    public void setStorageClusterIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH);
        }
    }

    public boolean getStorageClusterIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_ENDS_WITH);
    }

    public VmExportFileWhereInput storageClusterIdGt(String storageClusterIdGt) {

        this.storageClusterIdGt = storageClusterIdGt;
        return this;
    }

    /**
     * Get storageClusterIdGt
     *
     * @return storageClusterIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdGt() {
        return storageClusterIdGt;
    }

    public void setStorageClusterIdGt(String storageClusterIdGt) {
        this.storageClusterIdGt = storageClusterIdGt;
    }

    public VmExportFileWhereInput storageClusterIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT);
        return this;
    }

    public void setStorageClusterIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT);
        }
    }

    public boolean getStorageClusterIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GT);
    }

    public VmExportFileWhereInput storageClusterIdGte(String storageClusterIdGte) {

        this.storageClusterIdGte = storageClusterIdGte;
        return this;
    }

    /**
     * Get storageClusterIdGte
     *
     * @return storageClusterIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdGte() {
        return storageClusterIdGte;
    }

    public void setStorageClusterIdGte(String storageClusterIdGte) {
        this.storageClusterIdGte = storageClusterIdGte;
    }

    public VmExportFileWhereInput storageClusterIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE);
        return this;
    }

    public void setStorageClusterIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE);
        }
    }

    public boolean getStorageClusterIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_GTE);
    }

    public VmExportFileWhereInput storageClusterIdIn(List<String> storageClusterIdIn) {

        this.storageClusterIdIn = storageClusterIdIn;
        return this;
    }

    public VmExportFileWhereInput addStorageClusterIdInItem(String storageClusterIdInItem) {
        if (this.storageClusterIdIn == null) {
            this.storageClusterIdIn = new ArrayList<String>();
        }
        this.storageClusterIdIn.add(storageClusterIdInItem);
        return this;
    }

    /**
     * Get storageClusterIdIn
     *
     * @return storageClusterIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageClusterIdIn() {
        return storageClusterIdIn;
    }

    public void setStorageClusterIdIn(List<String> storageClusterIdIn) {
        this.storageClusterIdIn = storageClusterIdIn;
    }

    public VmExportFileWhereInput storageClusterIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN);
        return this;
    }

    public void setStorageClusterIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN);
        }
    }

    public boolean getStorageClusterIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_IN);
    }

    public VmExportFileWhereInput storageClusterIdLt(String storageClusterIdLt) {

        this.storageClusterIdLt = storageClusterIdLt;
        return this;
    }

    /**
     * Get storageClusterIdLt
     *
     * @return storageClusterIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdLt() {
        return storageClusterIdLt;
    }

    public void setStorageClusterIdLt(String storageClusterIdLt) {
        this.storageClusterIdLt = storageClusterIdLt;
    }

    public VmExportFileWhereInput storageClusterIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT);
        return this;
    }

    public void setStorageClusterIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT);
        }
    }

    public boolean getStorageClusterIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LT);
    }

    public VmExportFileWhereInput storageClusterIdLte(String storageClusterIdLte) {

        this.storageClusterIdLte = storageClusterIdLte;
        return this;
    }

    /**
     * Get storageClusterIdLte
     *
     * @return storageClusterIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdLte() {
        return storageClusterIdLte;
    }

    public void setStorageClusterIdLte(String storageClusterIdLte) {
        this.storageClusterIdLte = storageClusterIdLte;
    }

    public VmExportFileWhereInput storageClusterIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE);
        return this;
    }

    public void setStorageClusterIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE);
        }
    }

    public boolean getStorageClusterIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_LTE);
    }

    public VmExportFileWhereInput storageClusterIdNot(String storageClusterIdNot) {

        this.storageClusterIdNot = storageClusterIdNot;
        return this;
    }

    /**
     * Get storageClusterIdNot
     *
     * @return storageClusterIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdNot() {
        return storageClusterIdNot;
    }

    public void setStorageClusterIdNot(String storageClusterIdNot) {
        this.storageClusterIdNot = storageClusterIdNot;
    }

    public VmExportFileWhereInput storageClusterIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT);
        return this;
    }

    public void setStorageClusterIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT);
        }
    }

    public boolean getStorageClusterIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT);
    }

    public VmExportFileWhereInput storageClusterIdNotContains(String storageClusterIdNotContains) {

        this.storageClusterIdNotContains = storageClusterIdNotContains;
        return this;
    }

    /**
     * Get storageClusterIdNotContains
     *
     * @return storageClusterIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdNotContains() {
        return storageClusterIdNotContains;
    }

    public void setStorageClusterIdNotContains(String storageClusterIdNotContains) {
        this.storageClusterIdNotContains = storageClusterIdNotContains;
    }

    public VmExportFileWhereInput storageClusterIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS);
        return this;
    }

    public void setStorageClusterIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS);
        }
    }

    public boolean getStorageClusterIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_CONTAINS);
    }

    public VmExportFileWhereInput storageClusterIdNotEndsWith(String storageClusterIdNotEndsWith) {

        this.storageClusterIdNotEndsWith = storageClusterIdNotEndsWith;
        return this;
    }

    /**
     * Get storageClusterIdNotEndsWith
     *
     * @return storageClusterIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdNotEndsWith() {
        return storageClusterIdNotEndsWith;
    }

    public void setStorageClusterIdNotEndsWith(String storageClusterIdNotEndsWith) {
        this.storageClusterIdNotEndsWith = storageClusterIdNotEndsWith;
    }

    public VmExportFileWhereInput storageClusterIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageClusterIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageClusterIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_ENDS_WITH);
    }

    public VmExportFileWhereInput storageClusterIdNotIn(List<String> storageClusterIdNotIn) {

        this.storageClusterIdNotIn = storageClusterIdNotIn;
        return this;
    }

    public VmExportFileWhereInput addStorageClusterIdNotInItem(String storageClusterIdNotInItem) {
        if (this.storageClusterIdNotIn == null) {
            this.storageClusterIdNotIn = new ArrayList<String>();
        }
        this.storageClusterIdNotIn.add(storageClusterIdNotInItem);
        return this;
    }

    /**
     * Get storageClusterIdNotIn
     *
     * @return storageClusterIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageClusterIdNotIn() {
        return storageClusterIdNotIn;
    }

    public void setStorageClusterIdNotIn(List<String> storageClusterIdNotIn) {
        this.storageClusterIdNotIn = storageClusterIdNotIn;
    }

    public VmExportFileWhereInput storageClusterIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN);
        return this;
    }

    public void setStorageClusterIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN);
        }
    }

    public boolean getStorageClusterIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_IN);
    }

    public VmExportFileWhereInput storageClusterIdNotStartsWith(
            String storageClusterIdNotStartsWith) {

        this.storageClusterIdNotStartsWith = storageClusterIdNotStartsWith;
        return this;
    }

    /**
     * Get storageClusterIdNotStartsWith
     *
     * @return storageClusterIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdNotStartsWith() {
        return storageClusterIdNotStartsWith;
    }

    public void setStorageClusterIdNotStartsWith(String storageClusterIdNotStartsWith) {
        this.storageClusterIdNotStartsWith = storageClusterIdNotStartsWith;
    }

    public VmExportFileWhereInput storageClusterIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageClusterIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageClusterIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_NOT_STARTS_WITH);
    }

    public VmExportFileWhereInput storageClusterIdStartsWith(String storageClusterIdStartsWith) {

        this.storageClusterIdStartsWith = storageClusterIdStartsWith;
        return this;
    }

    /**
     * Get storageClusterIdStartsWith
     *
     * @return storageClusterIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageClusterIdStartsWith() {
        return storageClusterIdStartsWith;
    }

    public void setStorageClusterIdStartsWith(String storageClusterIdStartsWith) {
        this.storageClusterIdStartsWith = storageClusterIdStartsWith;
    }

    public VmExportFileWhereInput storageClusterIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH);
        return this;
    }

    public VmExportFileWhereInput storageClusterIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH);
        return this;
    }

    public void setStorageClusterIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH);
        }
    }

    public boolean getStorageClusterIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER_ID_STARTS_WITH);
    }

    public VmExportFileWhereInput type(VmExportFileType type) {

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
    public VmExportFileType getType() {
        return type;
    }

    public void setType(VmExportFileType type) {
        this.type = type;
    }

    public VmExportFileWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmExportFileWhereInput type_ExplictlyNonNull() {
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

    public VmExportFileWhereInput typeIn(List<VmExportFileType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmExportFileWhereInput addTypeInItem(VmExportFileType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmExportFileType>();
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
    public List<VmExportFileType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmExportFileType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmExportFileWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmExportFileWhereInput typeIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput typeNot(VmExportFileType typeNot) {

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
    public VmExportFileType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmExportFileType typeNot) {
        this.typeNot = typeNot;
    }

    public VmExportFileWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmExportFileWhereInput typeNot_ExplictlyNonNull() {
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

    public VmExportFileWhereInput typeNotIn(List<VmExportFileType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmExportFileWhereInput addTypeNotInItem(VmExportFileType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmExportFileType>();
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
    public List<VmExportFileType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmExportFileType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmExportFileWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmExportFileWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmExportFileWhereInput vm(VmWhereInput vm) {

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

    public VmExportFileWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmExportFileWhereInput vm_ExplictlyNonNull() {
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

    public VmExportFileWhereInput vmVolume(VmVolumeWhereInput vmVolume) {

        this.vmVolume = vmVolume;
        return this;
    }

    /**
     * Get vmVolume
     *
     * @return vmVolume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolume() {
        return vmVolume;
    }

    public void setVmVolume(VmVolumeWhereInput vmVolume) {
        this.vmVolume = vmVolume;
    }

    public VmExportFileWhereInput vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public VmExportFileWhereInput vmVolume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public void setVmVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        }
    }

    public boolean getVmVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmExportFileWhereInput vmExportFileWhereInput = (VmExportFileWhereInput) o;
        return Objects.equals(this.AND, vmExportFileWhereInput.AND)
                && Objects.equals(this.NOT, vmExportFileWhereInput.NOT)
                && Objects.equals(this.OR, vmExportFileWhereInput.OR)
                && Objects.equals(
                        this.contentLibraryVmTemplate,
                        vmExportFileWhereInput.contentLibraryVmTemplate)
                && Objects.equals(this.createdAt, vmExportFileWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, vmExportFileWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, vmExportFileWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, vmExportFileWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, vmExportFileWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, vmExportFileWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, vmExportFileWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, vmExportFileWhereInput.createdAtNotIn)
                && Objects.equals(this.damaged, vmExportFileWhereInput.damaged)
                && Objects.equals(this.damagedNot, vmExportFileWhereInput.damagedNot)
                && Objects.equals(this.dataPortId, vmExportFileWhereInput.dataPortId)
                && Objects.equals(
                        this.dataPortIdContains, vmExportFileWhereInput.dataPortIdContains)
                && Objects.equals(
                        this.dataPortIdEndsWith, vmExportFileWhereInput.dataPortIdEndsWith)
                && Objects.equals(this.dataPortIdGt, vmExportFileWhereInput.dataPortIdGt)
                && Objects.equals(this.dataPortIdGte, vmExportFileWhereInput.dataPortIdGte)
                && Objects.equals(this.dataPortIdIn, vmExportFileWhereInput.dataPortIdIn)
                && Objects.equals(this.dataPortIdLt, vmExportFileWhereInput.dataPortIdLt)
                && Objects.equals(this.dataPortIdLte, vmExportFileWhereInput.dataPortIdLte)
                && Objects.equals(this.dataPortIdNot, vmExportFileWhereInput.dataPortIdNot)
                && Objects.equals(
                        this.dataPortIdNotContains, vmExportFileWhereInput.dataPortIdNotContains)
                && Objects.equals(
                        this.dataPortIdNotEndsWith, vmExportFileWhereInput.dataPortIdNotEndsWith)
                && Objects.equals(this.dataPortIdNotIn, vmExportFileWhereInput.dataPortIdNotIn)
                && Objects.equals(
                        this.dataPortIdNotStartsWith,
                        vmExportFileWhereInput.dataPortIdNotStartsWith)
                && Objects.equals(
                        this.dataPortIdStartsWith, vmExportFileWhereInput.dataPortIdStartsWith)
                && Objects.equals(this.entityAsyncStatus, vmExportFileWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vmExportFileWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmExportFileWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, vmExportFileWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, vmExportFileWhereInput.id)
                && Objects.equals(this.idContains, vmExportFileWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmExportFileWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmExportFileWhereInput.idGt)
                && Objects.equals(this.idGte, vmExportFileWhereInput.idGte)
                && Objects.equals(this.idIn, vmExportFileWhereInput.idIn)
                && Objects.equals(this.idLt, vmExportFileWhereInput.idLt)
                && Objects.equals(this.idLte, vmExportFileWhereInput.idLte)
                && Objects.equals(this.idNot, vmExportFileWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmExportFileWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmExportFileWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmExportFileWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmExportFileWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmExportFileWhereInput.idStartsWith)
                && Objects.equals(this.storageClusterId, vmExportFileWhereInput.storageClusterId)
                && Objects.equals(
                        this.storageClusterIdContains,
                        vmExportFileWhereInput.storageClusterIdContains)
                && Objects.equals(
                        this.storageClusterIdEndsWith,
                        vmExportFileWhereInput.storageClusterIdEndsWith)
                && Objects.equals(
                        this.storageClusterIdGt, vmExportFileWhereInput.storageClusterIdGt)
                && Objects.equals(
                        this.storageClusterIdGte, vmExportFileWhereInput.storageClusterIdGte)
                && Objects.equals(
                        this.storageClusterIdIn, vmExportFileWhereInput.storageClusterIdIn)
                && Objects.equals(
                        this.storageClusterIdLt, vmExportFileWhereInput.storageClusterIdLt)
                && Objects.equals(
                        this.storageClusterIdLte, vmExportFileWhereInput.storageClusterIdLte)
                && Objects.equals(
                        this.storageClusterIdNot, vmExportFileWhereInput.storageClusterIdNot)
                && Objects.equals(
                        this.storageClusterIdNotContains,
                        vmExportFileWhereInput.storageClusterIdNotContains)
                && Objects.equals(
                        this.storageClusterIdNotEndsWith,
                        vmExportFileWhereInput.storageClusterIdNotEndsWith)
                && Objects.equals(
                        this.storageClusterIdNotIn, vmExportFileWhereInput.storageClusterIdNotIn)
                && Objects.equals(
                        this.storageClusterIdNotStartsWith,
                        vmExportFileWhereInput.storageClusterIdNotStartsWith)
                && Objects.equals(
                        this.storageClusterIdStartsWith,
                        vmExportFileWhereInput.storageClusterIdStartsWith)
                && Objects.equals(this.type, vmExportFileWhereInput.type)
                && Objects.equals(this.typeIn, vmExportFileWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmExportFileWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmExportFileWhereInput.typeNotIn)
                && Objects.equals(this.vm, vmExportFileWhereInput.vm)
                && Objects.equals(this.vmVolume, vmExportFileWhereInput.vmVolume);
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
                contentLibraryVmTemplate,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                damaged,
                damagedNot,
                dataPortId,
                dataPortIdContains,
                dataPortIdEndsWith,
                dataPortIdGt,
                dataPortIdGte,
                dataPortIdIn,
                dataPortIdLt,
                dataPortIdLte,
                dataPortIdNot,
                dataPortIdNotContains,
                dataPortIdNotEndsWith,
                dataPortIdNotIn,
                dataPortIdNotStartsWith,
                dataPortIdStartsWith,
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
                storageClusterId,
                storageClusterIdContains,
                storageClusterIdEndsWith,
                storageClusterIdGt,
                storageClusterIdGte,
                storageClusterIdIn,
                storageClusterIdLt,
                storageClusterIdLte,
                storageClusterIdNot,
                storageClusterIdNotContains,
                storageClusterIdNotEndsWith,
                storageClusterIdNotIn,
                storageClusterIdNotStartsWith,
                storageClusterIdStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vm,
                vmVolume);
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
        sb.append("class VmExportFileWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    contentLibraryVmTemplate: ")
                .append(toIndentedString(contentLibraryVmTemplate))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    damaged: ").append(toIndentedString(damaged)).append("\n");
        sb.append("    damagedNot: ").append(toIndentedString(damagedNot)).append("\n");
        sb.append("    dataPortId: ").append(toIndentedString(dataPortId)).append("\n");
        sb.append("    dataPortIdContains: ")
                .append(toIndentedString(dataPortIdContains))
                .append("\n");
        sb.append("    dataPortIdEndsWith: ")
                .append(toIndentedString(dataPortIdEndsWith))
                .append("\n");
        sb.append("    dataPortIdGt: ").append(toIndentedString(dataPortIdGt)).append("\n");
        sb.append("    dataPortIdGte: ").append(toIndentedString(dataPortIdGte)).append("\n");
        sb.append("    dataPortIdIn: ").append(toIndentedString(dataPortIdIn)).append("\n");
        sb.append("    dataPortIdLt: ").append(toIndentedString(dataPortIdLt)).append("\n");
        sb.append("    dataPortIdLte: ").append(toIndentedString(dataPortIdLte)).append("\n");
        sb.append("    dataPortIdNot: ").append(toIndentedString(dataPortIdNot)).append("\n");
        sb.append("    dataPortIdNotContains: ")
                .append(toIndentedString(dataPortIdNotContains))
                .append("\n");
        sb.append("    dataPortIdNotEndsWith: ")
                .append(toIndentedString(dataPortIdNotEndsWith))
                .append("\n");
        sb.append("    dataPortIdNotIn: ").append(toIndentedString(dataPortIdNotIn)).append("\n");
        sb.append("    dataPortIdNotStartsWith: ")
                .append(toIndentedString(dataPortIdNotStartsWith))
                .append("\n");
        sb.append("    dataPortIdStartsWith: ")
                .append(toIndentedString(dataPortIdStartsWith))
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
        sb.append("    storageClusterId: ").append(toIndentedString(storageClusterId)).append("\n");
        sb.append("    storageClusterIdContains: ")
                .append(toIndentedString(storageClusterIdContains))
                .append("\n");
        sb.append("    storageClusterIdEndsWith: ")
                .append(toIndentedString(storageClusterIdEndsWith))
                .append("\n");
        sb.append("    storageClusterIdGt: ")
                .append(toIndentedString(storageClusterIdGt))
                .append("\n");
        sb.append("    storageClusterIdGte: ")
                .append(toIndentedString(storageClusterIdGte))
                .append("\n");
        sb.append("    storageClusterIdIn: ")
                .append(toIndentedString(storageClusterIdIn))
                .append("\n");
        sb.append("    storageClusterIdLt: ")
                .append(toIndentedString(storageClusterIdLt))
                .append("\n");
        sb.append("    storageClusterIdLte: ")
                .append(toIndentedString(storageClusterIdLte))
                .append("\n");
        sb.append("    storageClusterIdNot: ")
                .append(toIndentedString(storageClusterIdNot))
                .append("\n");
        sb.append("    storageClusterIdNotContains: ")
                .append(toIndentedString(storageClusterIdNotContains))
                .append("\n");
        sb.append("    storageClusterIdNotEndsWith: ")
                .append(toIndentedString(storageClusterIdNotEndsWith))
                .append("\n");
        sb.append("    storageClusterIdNotIn: ")
                .append(toIndentedString(storageClusterIdNotIn))
                .append("\n");
        sb.append("    storageClusterIdNotStartsWith: ")
                .append(toIndentedString(storageClusterIdNotStartsWith))
                .append("\n");
        sb.append("    storageClusterIdStartsWith: ")
                .append(toIndentedString(storageClusterIdStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
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
