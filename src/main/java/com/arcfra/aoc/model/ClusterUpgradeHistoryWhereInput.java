package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterUpgradeHistoryWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterUpgradeHistoryWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ClusterUpgradeHistoryWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ClusterUpgradeHistoryWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ClusterUpgradeHistoryWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DATE = "date";

    @SerializedName(SERIALIZED_NAME_DATE)
    private String date;

    public static final String SERIALIZED_NAME_DATE_GT = "date_gt";

    @SerializedName(SERIALIZED_NAME_DATE_GT)
    private String dateGt;

    public static final String SERIALIZED_NAME_DATE_GTE = "date_gte";

    @SerializedName(SERIALIZED_NAME_DATE_GTE)
    private String dateGte;

    public static final String SERIALIZED_NAME_DATE_IN = "date_in";

    @SerializedName(SERIALIZED_NAME_DATE_IN)
    private List<String> dateIn = null;

    public static final String SERIALIZED_NAME_DATE_LT = "date_lt";

    @SerializedName(SERIALIZED_NAME_DATE_LT)
    private String dateLt;

    public static final String SERIALIZED_NAME_DATE_LTE = "date_lte";

    @SerializedName(SERIALIZED_NAME_DATE_LTE)
    private String dateLte;

    public static final String SERIALIZED_NAME_DATE_NOT = "date_not";

    @SerializedName(SERIALIZED_NAME_DATE_NOT)
    private String dateNot;

    public static final String SERIALIZED_NAME_DATE_NOT_IN = "date_not_in";

    @SerializedName(SERIALIZED_NAME_DATE_NOT_IN)
    private List<String> dateNotIn = null;

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

    public static final String SERIALIZED_NAME_RESULT = "result";

    @SerializedName(SERIALIZED_NAME_RESULT)
    private String result;

    public static final String SERIALIZED_NAME_RESULT_CONTAINS = "result_contains";

    @SerializedName(SERIALIZED_NAME_RESULT_CONTAINS)
    private String resultContains;

    public static final String SERIALIZED_NAME_RESULT_ENDS_WITH = "result_ends_with";

    @SerializedName(SERIALIZED_NAME_RESULT_ENDS_WITH)
    private String resultEndsWith;

    public static final String SERIALIZED_NAME_RESULT_GT = "result_gt";

    @SerializedName(SERIALIZED_NAME_RESULT_GT)
    private String resultGt;

    public static final String SERIALIZED_NAME_RESULT_GTE = "result_gte";

    @SerializedName(SERIALIZED_NAME_RESULT_GTE)
    private String resultGte;

    public static final String SERIALIZED_NAME_RESULT_IN = "result_in";

    @SerializedName(SERIALIZED_NAME_RESULT_IN)
    private List<String> resultIn = null;

    public static final String SERIALIZED_NAME_RESULT_LT = "result_lt";

    @SerializedName(SERIALIZED_NAME_RESULT_LT)
    private String resultLt;

    public static final String SERIALIZED_NAME_RESULT_LTE = "result_lte";

    @SerializedName(SERIALIZED_NAME_RESULT_LTE)
    private String resultLte;

    public static final String SERIALIZED_NAME_RESULT_NOT = "result_not";

    @SerializedName(SERIALIZED_NAME_RESULT_NOT)
    private String resultNot;

    public static final String SERIALIZED_NAME_RESULT_NOT_CONTAINS = "result_not_contains";

    @SerializedName(SERIALIZED_NAME_RESULT_NOT_CONTAINS)
    private String resultNotContains;

    public static final String SERIALIZED_NAME_RESULT_NOT_ENDS_WITH = "result_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH)
    private String resultNotEndsWith;

    public static final String SERIALIZED_NAME_RESULT_NOT_IN = "result_not_in";

    @SerializedName(SERIALIZED_NAME_RESULT_NOT_IN)
    private List<String> resultNotIn = null;

    public static final String SERIALIZED_NAME_RESULT_NOT_STARTS_WITH = "result_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH)
    private String resultNotStartsWith;

    public static final String SERIALIZED_NAME_RESULT_STARTS_WITH = "result_starts_with";

    @SerializedName(SERIALIZED_NAME_RESULT_STARTS_WITH)
    private String resultStartsWith;

    public static final String SERIALIZED_NAME_TASK_UUID = "task_uuid";

    @SerializedName(SERIALIZED_NAME_TASK_UUID)
    private String taskUuid;

    public static final String SERIALIZED_NAME_TASK_UUID_CONTAINS = "task_uuid_contains";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_CONTAINS)
    private String taskUuidContains;

    public static final String SERIALIZED_NAME_TASK_UUID_ENDS_WITH = "task_uuid_ends_with";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_ENDS_WITH)
    private String taskUuidEndsWith;

    public static final String SERIALIZED_NAME_TASK_UUID_GT = "task_uuid_gt";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_GT)
    private String taskUuidGt;

    public static final String SERIALIZED_NAME_TASK_UUID_GTE = "task_uuid_gte";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_GTE)
    private String taskUuidGte;

    public static final String SERIALIZED_NAME_TASK_UUID_IN = "task_uuid_in";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_IN)
    private List<String> taskUuidIn = null;

    public static final String SERIALIZED_NAME_TASK_UUID_LT = "task_uuid_lt";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_LT)
    private String taskUuidLt;

    public static final String SERIALIZED_NAME_TASK_UUID_LTE = "task_uuid_lte";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_LTE)
    private String taskUuidLte;

    public static final String SERIALIZED_NAME_TASK_UUID_NOT = "task_uuid_not";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT)
    private String taskUuidNot;

    public static final String SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS = "task_uuid_not_contains";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS)
    private String taskUuidNotContains;

    public static final String SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH = "task_uuid_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH)
    private String taskUuidNotEndsWith;

    public static final String SERIALIZED_NAME_TASK_UUID_NOT_IN = "task_uuid_not_in";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_IN)
    private List<String> taskUuidNotIn = null;

    public static final String SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH =
            "task_uuid_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH)
    private String taskUuidNotStartsWith;

    public static final String SERIALIZED_NAME_TASK_UUID_STARTS_WITH = "task_uuid_starts_with";

    @SerializedName(SERIALIZED_NAME_TASK_UUID_STARTS_WITH)
    private String taskUuidStartsWith;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
    private String versionContains;

    public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
    private String versionEndsWith;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private String versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private String versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<String> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private String versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private String versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private String versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
    private String versionNotContains;

    public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
    private String versionNotEndsWith;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<String> versionNotIn = null;

    public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
    private String versionNotStartsWith;

    public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
    private String versionStartsWith;

    public ClusterUpgradeHistoryWhereInput() {}

    public ClusterUpgradeHistoryWhereInput AND(List<ClusterUpgradeHistoryWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addANDItem(ClusterUpgradeHistoryWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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
    public List<ClusterUpgradeHistoryWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ClusterUpgradeHistoryWhereInput> AND) {
        this.AND = AND;
    }

    public ClusterUpgradeHistoryWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput AND_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput NOT(List<ClusterUpgradeHistoryWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addNOTItem(ClusterUpgradeHistoryWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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
    public List<ClusterUpgradeHistoryWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ClusterUpgradeHistoryWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ClusterUpgradeHistoryWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput NOT_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput OR(List<ClusterUpgradeHistoryWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addORItem(ClusterUpgradeHistoryWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ClusterUpgradeHistoryWhereInput>();
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
    public List<ClusterUpgradeHistoryWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ClusterUpgradeHistoryWhereInput> OR) {
        this.OR = OR;
    }

    public ClusterUpgradeHistoryWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput OR_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput cluster(ClusterWhereInput cluster) {

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

    public ClusterUpgradeHistoryWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput cluster_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput date(String date) {

        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ClusterUpgradeHistoryWhereInput date_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput date_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE);
        return this;
    }

    public void setDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE);
        }
    }

    public boolean getDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE);
    }

    public ClusterUpgradeHistoryWhereInput dateGt(String dateGt) {

        this.dateGt = dateGt;
        return this;
    }

    /**
     * Get dateGt
     *
     * @return dateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDateGt() {
        return dateGt;
    }

    public void setDateGt(String dateGt) {
        this.dateGt = dateGt;
    }

    public ClusterUpgradeHistoryWhereInput dateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_GT);
        return this;
    }

    public void setDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_GT);
        }
    }

    public boolean getDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_GT);
    }

    public ClusterUpgradeHistoryWhereInput dateGte(String dateGte) {

        this.dateGte = dateGte;
        return this;
    }

    /**
     * Get dateGte
     *
     * @return dateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDateGte() {
        return dateGte;
    }

    public void setDateGte(String dateGte) {
        this.dateGte = dateGte;
    }

    public ClusterUpgradeHistoryWhereInput dateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_GTE);
        return this;
    }

    public void setDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_GTE);
        }
    }

    public boolean getDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_GTE);
    }

    public ClusterUpgradeHistoryWhereInput dateIn(List<String> dateIn) {

        this.dateIn = dateIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addDateInItem(String dateInItem) {
        if (this.dateIn == null) {
            this.dateIn = new ArrayList<String>();
        }
        this.dateIn.add(dateInItem);
        return this;
    }

    /**
     * Get dateIn
     *
     * @return dateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDateIn() {
        return dateIn;
    }

    public void setDateIn(List<String> dateIn) {
        this.dateIn = dateIn;
    }

    public ClusterUpgradeHistoryWhereInput dateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_IN);
        return this;
    }

    public void setDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_IN);
        }
    }

    public boolean getDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_IN);
    }

    public ClusterUpgradeHistoryWhereInput dateLt(String dateLt) {

        this.dateLt = dateLt;
        return this;
    }

    /**
     * Get dateLt
     *
     * @return dateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDateLt() {
        return dateLt;
    }

    public void setDateLt(String dateLt) {
        this.dateLt = dateLt;
    }

    public ClusterUpgradeHistoryWhereInput dateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_LT);
        return this;
    }

    public void setDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_LT);
        }
    }

    public boolean getDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_LT);
    }

    public ClusterUpgradeHistoryWhereInput dateLte(String dateLte) {

        this.dateLte = dateLte;
        return this;
    }

    /**
     * Get dateLte
     *
     * @return dateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDateLte() {
        return dateLte;
    }

    public void setDateLte(String dateLte) {
        this.dateLte = dateLte;
    }

    public ClusterUpgradeHistoryWhereInput dateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_LTE);
        return this;
    }

    public void setDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_LTE);
        }
    }

    public boolean getDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_LTE);
    }

    public ClusterUpgradeHistoryWhereInput dateNot(String dateNot) {

        this.dateNot = dateNot;
        return this;
    }

    /**
     * Get dateNot
     *
     * @return dateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDateNot() {
        return dateNot;
    }

    public void setDateNot(String dateNot) {
        this.dateNot = dateNot;
    }

    public ClusterUpgradeHistoryWhereInput dateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_NOT);
        return this;
    }

    public void setDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_NOT);
        }
    }

    public boolean getDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_NOT);
    }

    public ClusterUpgradeHistoryWhereInput dateNotIn(List<String> dateNotIn) {

        this.dateNotIn = dateNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addDateNotInItem(String dateNotInItem) {
        if (this.dateNotIn == null) {
            this.dateNotIn = new ArrayList<String>();
        }
        this.dateNotIn.add(dateNotInItem);
        return this;
    }

    /**
     * Get dateNotIn
     *
     * @return dateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDateNotIn() {
        return dateNotIn;
    }

    public void setDateNotIn(List<String> dateNotIn) {
        this.dateNotIn = dateNotIn;
    }

    public ClusterUpgradeHistoryWhereInput dateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput dateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_NOT_IN);
        return this;
    }

    public void setDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_NOT_IN);
        }
    }

    public boolean getDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_NOT_IN);
    }

    public ClusterUpgradeHistoryWhereInput id(String id) {

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

    public ClusterUpgradeHistoryWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput id_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idContains(String idContains) {

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

    public ClusterUpgradeHistoryWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idContains_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idEndsWith(String idEndsWith) {

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

    public ClusterUpgradeHistoryWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idGt(String idGt) {

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

    public ClusterUpgradeHistoryWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idGt_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idGte(String idGte) {

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

    public ClusterUpgradeHistoryWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idGte_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addIdInItem(String idInItem) {
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

    public ClusterUpgradeHistoryWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idIn_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idLt(String idLt) {

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

    public ClusterUpgradeHistoryWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idLt_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idLte(String idLte) {

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

    public ClusterUpgradeHistoryWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idLte_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idNot(String idNot) {

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

    public ClusterUpgradeHistoryWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idNot_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idNotContains(String idNotContains) {

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

    public ClusterUpgradeHistoryWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idNotContains_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ClusterUpgradeHistoryWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addIdNotInItem(String idNotInItem) {
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

    public ClusterUpgradeHistoryWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idNotIn_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ClusterUpgradeHistoryWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput idStartsWith(String idStartsWith) {

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

    public ClusterUpgradeHistoryWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localId(String localId) {

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

    public ClusterUpgradeHistoryWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localId_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdContains(String localIdContains) {

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

    public ClusterUpgradeHistoryWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdContains_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ClusterUpgradeHistoryWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdGt(String localIdGt) {

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

    public ClusterUpgradeHistoryWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdGt_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdGte(String localIdGte) {

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

    public ClusterUpgradeHistoryWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdGte_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ClusterUpgradeHistoryWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdIn_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdLt(String localIdLt) {

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

    public ClusterUpgradeHistoryWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdLt_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdLte(String localIdLte) {

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

    public ClusterUpgradeHistoryWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdLte_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdNot(String localIdNot) {

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

    public ClusterUpgradeHistoryWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdNot_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdNotContains(String localIdNotContains) {

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

    public ClusterUpgradeHistoryWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ClusterUpgradeHistoryWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ClusterUpgradeHistoryWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ClusterUpgradeHistoryWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ClusterUpgradeHistoryWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ClusterUpgradeHistoryWhereInput result(String result) {

        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ClusterUpgradeHistoryWhereInput result_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput result_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        return this;
    }

    public void setResult_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        }
    }

    public boolean getResult_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT);
    }

    public ClusterUpgradeHistoryWhereInput resultContains(String resultContains) {

        this.resultContains = resultContains;
        return this;
    }

    /**
     * Get resultContains
     *
     * @return resultContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultContains() {
        return resultContains;
    }

    public void setResultContains(String resultContains) {
        this.resultContains = resultContains;
    }

    public ClusterUpgradeHistoryWhereInput resultContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_CONTAINS);
        return this;
    }

    public void setResultContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_CONTAINS);
        }
    }

    public boolean getResultContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput resultEndsWith(String resultEndsWith) {

        this.resultEndsWith = resultEndsWith;
        return this;
    }

    /**
     * Get resultEndsWith
     *
     * @return resultEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultEndsWith() {
        return resultEndsWith;
    }

    public void setResultEndsWith(String resultEndsWith) {
        this.resultEndsWith = resultEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput resultEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_ENDS_WITH);
        return this;
    }

    public void setResultEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_ENDS_WITH);
        }
    }

    public boolean getResultEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput resultGt(String resultGt) {

        this.resultGt = resultGt;
        return this;
    }

    /**
     * Get resultGt
     *
     * @return resultGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultGt() {
        return resultGt;
    }

    public void setResultGt(String resultGt) {
        this.resultGt = resultGt;
    }

    public ClusterUpgradeHistoryWhereInput resultGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_GT);
        return this;
    }

    public void setResultGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_GT);
        }
    }

    public boolean getResultGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_GT);
    }

    public ClusterUpgradeHistoryWhereInput resultGte(String resultGte) {

        this.resultGte = resultGte;
        return this;
    }

    /**
     * Get resultGte
     *
     * @return resultGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultGte() {
        return resultGte;
    }

    public void setResultGte(String resultGte) {
        this.resultGte = resultGte;
    }

    public ClusterUpgradeHistoryWhereInput resultGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_GTE);
        return this;
    }

    public void setResultGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_GTE);
        }
    }

    public boolean getResultGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_GTE);
    }

    public ClusterUpgradeHistoryWhereInput resultIn(List<String> resultIn) {

        this.resultIn = resultIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addResultInItem(String resultInItem) {
        if (this.resultIn == null) {
            this.resultIn = new ArrayList<String>();
        }
        this.resultIn.add(resultInItem);
        return this;
    }

    /**
     * Get resultIn
     *
     * @return resultIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResultIn() {
        return resultIn;
    }

    public void setResultIn(List<String> resultIn) {
        this.resultIn = resultIn;
    }

    public ClusterUpgradeHistoryWhereInput resultIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_IN);
        return this;
    }

    public void setResultIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_IN);
        }
    }

    public boolean getResultIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_IN);
    }

    public ClusterUpgradeHistoryWhereInput resultLt(String resultLt) {

        this.resultLt = resultLt;
        return this;
    }

    /**
     * Get resultLt
     *
     * @return resultLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultLt() {
        return resultLt;
    }

    public void setResultLt(String resultLt) {
        this.resultLt = resultLt;
    }

    public ClusterUpgradeHistoryWhereInput resultLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_LT);
        return this;
    }

    public void setResultLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_LT);
        }
    }

    public boolean getResultLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_LT);
    }

    public ClusterUpgradeHistoryWhereInput resultLte(String resultLte) {

        this.resultLte = resultLte;
        return this;
    }

    /**
     * Get resultLte
     *
     * @return resultLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultLte() {
        return resultLte;
    }

    public void setResultLte(String resultLte) {
        this.resultLte = resultLte;
    }

    public ClusterUpgradeHistoryWhereInput resultLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_LTE);
        return this;
    }

    public void setResultLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_LTE);
        }
    }

    public boolean getResultLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_LTE);
    }

    public ClusterUpgradeHistoryWhereInput resultNot(String resultNot) {

        this.resultNot = resultNot;
        return this;
    }

    /**
     * Get resultNot
     *
     * @return resultNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultNot() {
        return resultNot;
    }

    public void setResultNot(String resultNot) {
        this.resultNot = resultNot;
    }

    public ClusterUpgradeHistoryWhereInput resultNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT);
        return this;
    }

    public void setResultNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT);
        }
    }

    public boolean getResultNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_NOT);
    }

    public ClusterUpgradeHistoryWhereInput resultNotContains(String resultNotContains) {

        this.resultNotContains = resultNotContains;
        return this;
    }

    /**
     * Get resultNotContains
     *
     * @return resultNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultNotContains() {
        return resultNotContains;
    }

    public void setResultNotContains(String resultNotContains) {
        this.resultNotContains = resultNotContains;
    }

    public ClusterUpgradeHistoryWhereInput resultNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_CONTAINS);
        return this;
    }

    public void setResultNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_CONTAINS);
        }
    }

    public boolean getResultNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_NOT_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput resultNotEndsWith(String resultNotEndsWith) {

        this.resultNotEndsWith = resultNotEndsWith;
        return this;
    }

    /**
     * Get resultNotEndsWith
     *
     * @return resultNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultNotEndsWith() {
        return resultNotEndsWith;
    }

    public void setResultNotEndsWith(String resultNotEndsWith) {
        this.resultNotEndsWith = resultNotEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput resultNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH);
        return this;
    }

    public void setResultNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH);
        }
    }

    public boolean getResultNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_NOT_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput resultNotIn(List<String> resultNotIn) {

        this.resultNotIn = resultNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addResultNotInItem(String resultNotInItem) {
        if (this.resultNotIn == null) {
            this.resultNotIn = new ArrayList<String>();
        }
        this.resultNotIn.add(resultNotInItem);
        return this;
    }

    /**
     * Get resultNotIn
     *
     * @return resultNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResultNotIn() {
        return resultNotIn;
    }

    public void setResultNotIn(List<String> resultNotIn) {
        this.resultNotIn = resultNotIn;
    }

    public ClusterUpgradeHistoryWhereInput resultNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_IN);
        return this;
    }

    public void setResultNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_IN);
        }
    }

    public boolean getResultNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_NOT_IN);
    }

    public ClusterUpgradeHistoryWhereInput resultNotStartsWith(String resultNotStartsWith) {

        this.resultNotStartsWith = resultNotStartsWith;
        return this;
    }

    /**
     * Get resultNotStartsWith
     *
     * @return resultNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultNotStartsWith() {
        return resultNotStartsWith;
    }

    public void setResultNotStartsWith(String resultNotStartsWith) {
        this.resultNotStartsWith = resultNotStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput resultNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH);
        return this;
    }

    public void setResultNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH);
        }
    }

    public boolean getResultNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_NOT_STARTS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput resultStartsWith(String resultStartsWith) {

        this.resultStartsWith = resultStartsWith;
        return this;
    }

    /**
     * Get resultStartsWith
     *
     * @return resultStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResultStartsWith() {
        return resultStartsWith;
    }

    public void setResultStartsWith(String resultStartsWith) {
        this.resultStartsWith = resultStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput resultStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput resultStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT_STARTS_WITH);
        return this;
    }

    public void setResultStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT_STARTS_WITH);
        }
    }

    public boolean getResultStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT_STARTS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput taskUuid(String taskUuid) {

        this.taskUuid = taskUuid;
        return this;
    }

    /**
     * Get taskUuid
     *
     * @return taskUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    public ClusterUpgradeHistoryWhereInput taskUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID);
        return this;
    }

    public void setTaskUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID);
        }
    }

    public boolean getTaskUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidContains(String taskUuidContains) {

        this.taskUuidContains = taskUuidContains;
        return this;
    }

    /**
     * Get taskUuidContains
     *
     * @return taskUuidContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidContains() {
        return taskUuidContains;
    }

    public void setTaskUuidContains(String taskUuidContains) {
        this.taskUuidContains = taskUuidContains;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_CONTAINS);
        return this;
    }

    public void setTaskUuidContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_CONTAINS);
        }
    }

    public boolean getTaskUuidContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidEndsWith(String taskUuidEndsWith) {

        this.taskUuidEndsWith = taskUuidEndsWith;
        return this;
    }

    /**
     * Get taskUuidEndsWith
     *
     * @return taskUuidEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidEndsWith() {
        return taskUuidEndsWith;
    }

    public void setTaskUuidEndsWith(String taskUuidEndsWith) {
        this.taskUuidEndsWith = taskUuidEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_ENDS_WITH);
        return this;
    }

    public void setTaskUuidEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_ENDS_WITH);
        }
    }

    public boolean getTaskUuidEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGt(String taskUuidGt) {

        this.taskUuidGt = taskUuidGt;
        return this;
    }

    /**
     * Get taskUuidGt
     *
     * @return taskUuidGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidGt() {
        return taskUuidGt;
    }

    public void setTaskUuidGt(String taskUuidGt) {
        this.taskUuidGt = taskUuidGt;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_GT);
        return this;
    }

    public void setTaskUuidGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_GT);
        }
    }

    public boolean getTaskUuidGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_GT);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGte(String taskUuidGte) {

        this.taskUuidGte = taskUuidGte;
        return this;
    }

    /**
     * Get taskUuidGte
     *
     * @return taskUuidGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidGte() {
        return taskUuidGte;
    }

    public void setTaskUuidGte(String taskUuidGte) {
        this.taskUuidGte = taskUuidGte;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_GTE);
        return this;
    }

    public void setTaskUuidGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_GTE);
        }
    }

    public boolean getTaskUuidGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_GTE);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidIn(List<String> taskUuidIn) {

        this.taskUuidIn = taskUuidIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addTaskUuidInItem(String taskUuidInItem) {
        if (this.taskUuidIn == null) {
            this.taskUuidIn = new ArrayList<String>();
        }
        this.taskUuidIn.add(taskUuidInItem);
        return this;
    }

    /**
     * Get taskUuidIn
     *
     * @return taskUuidIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTaskUuidIn() {
        return taskUuidIn;
    }

    public void setTaskUuidIn(List<String> taskUuidIn) {
        this.taskUuidIn = taskUuidIn;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_IN);
        return this;
    }

    public void setTaskUuidIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_IN);
        }
    }

    public boolean getTaskUuidIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_IN);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLt(String taskUuidLt) {

        this.taskUuidLt = taskUuidLt;
        return this;
    }

    /**
     * Get taskUuidLt
     *
     * @return taskUuidLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidLt() {
        return taskUuidLt;
    }

    public void setTaskUuidLt(String taskUuidLt) {
        this.taskUuidLt = taskUuidLt;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_LT);
        return this;
    }

    public void setTaskUuidLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_LT);
        }
    }

    public boolean getTaskUuidLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_LT);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLte(String taskUuidLte) {

        this.taskUuidLte = taskUuidLte;
        return this;
    }

    /**
     * Get taskUuidLte
     *
     * @return taskUuidLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidLte() {
        return taskUuidLte;
    }

    public void setTaskUuidLte(String taskUuidLte) {
        this.taskUuidLte = taskUuidLte;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_LTE);
        return this;
    }

    public void setTaskUuidLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_LTE);
        }
    }

    public boolean getTaskUuidLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_LTE);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNot(String taskUuidNot) {

        this.taskUuidNot = taskUuidNot;
        return this;
    }

    /**
     * Get taskUuidNot
     *
     * @return taskUuidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidNot() {
        return taskUuidNot;
    }

    public void setTaskUuidNot(String taskUuidNot) {
        this.taskUuidNot = taskUuidNot;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT);
        return this;
    }

    public void setTaskUuidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT);
        }
    }

    public boolean getTaskUuidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_NOT);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotContains(String taskUuidNotContains) {

        this.taskUuidNotContains = taskUuidNotContains;
        return this;
    }

    /**
     * Get taskUuidNotContains
     *
     * @return taskUuidNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidNotContains() {
        return taskUuidNotContains;
    }

    public void setTaskUuidNotContains(String taskUuidNotContains) {
        this.taskUuidNotContains = taskUuidNotContains;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS);
        return this;
    }

    public void setTaskUuidNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS);
        }
    }

    public boolean getTaskUuidNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_NOT_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotEndsWith(String taskUuidNotEndsWith) {

        this.taskUuidNotEndsWith = taskUuidNotEndsWith;
        return this;
    }

    /**
     * Get taskUuidNotEndsWith
     *
     * @return taskUuidNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidNotEndsWith() {
        return taskUuidNotEndsWith;
    }

    public void setTaskUuidNotEndsWith(String taskUuidNotEndsWith) {
        this.taskUuidNotEndsWith = taskUuidNotEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH);
        return this;
    }

    public void setTaskUuidNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH);
        }
    }

    public boolean getTaskUuidNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_NOT_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotIn(List<String> taskUuidNotIn) {

        this.taskUuidNotIn = taskUuidNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addTaskUuidNotInItem(String taskUuidNotInItem) {
        if (this.taskUuidNotIn == null) {
            this.taskUuidNotIn = new ArrayList<String>();
        }
        this.taskUuidNotIn.add(taskUuidNotInItem);
        return this;
    }

    /**
     * Get taskUuidNotIn
     *
     * @return taskUuidNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTaskUuidNotIn() {
        return taskUuidNotIn;
    }

    public void setTaskUuidNotIn(List<String> taskUuidNotIn) {
        this.taskUuidNotIn = taskUuidNotIn;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_IN);
        return this;
    }

    public void setTaskUuidNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_IN);
        }
    }

    public boolean getTaskUuidNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_NOT_IN);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotStartsWith(String taskUuidNotStartsWith) {

        this.taskUuidNotStartsWith = taskUuidNotStartsWith;
        return this;
    }

    /**
     * Get taskUuidNotStartsWith
     *
     * @return taskUuidNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidNotStartsWith() {
        return taskUuidNotStartsWith;
    }

    public void setTaskUuidNotStartsWith(String taskUuidNotStartsWith) {
        this.taskUuidNotStartsWith = taskUuidNotStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH);
        return this;
    }

    public void setTaskUuidNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH);
        }
    }

    public boolean getTaskUuidNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_NOT_STARTS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput taskUuidStartsWith(String taskUuidStartsWith) {

        this.taskUuidStartsWith = taskUuidStartsWith;
        return this;
    }

    /**
     * Get taskUuidStartsWith
     *
     * @return taskUuidStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskUuidStartsWith() {
        return taskUuidStartsWith;
    }

    public void setTaskUuidStartsWith(String taskUuidStartsWith) {
        this.taskUuidStartsWith = taskUuidStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput taskUuidStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_STARTS_WITH);
        return this;
    }

    public void setTaskUuidStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID_STARTS_WITH);
        }
    }

    public boolean getTaskUuidStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID_STARTS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterUpgradeHistoryWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public ClusterUpgradeHistoryWhereInput versionContains(String versionContains) {

        this.versionContains = versionContains;
        return this;
    }

    /**
     * Get versionContains
     *
     * @return versionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionContains() {
        return versionContains;
    }

    public void setVersionContains(String versionContains) {
        this.versionContains = versionContains;
    }

    public ClusterUpgradeHistoryWhereInput versionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public void setVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        }
    }

    public boolean getVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput versionEndsWith(String versionEndsWith) {

        this.versionEndsWith = versionEndsWith;
        return this;
    }

    /**
     * Get versionEndsWith
     *
     * @return versionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionEndsWith() {
        return versionEndsWith;
    }

    public void setVersionEndsWith(String versionEndsWith) {
        this.versionEndsWith = versionEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput versionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public void setVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        }
    }

    public boolean getVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput versionGt(String versionGt) {

        this.versionGt = versionGt;
        return this;
    }

    /**
     * Get versionGt
     *
     * @return versionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(String versionGt) {
        this.versionGt = versionGt;
    }

    public ClusterUpgradeHistoryWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public void setVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        }
    }

    public boolean getVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GT);
    }

    public ClusterUpgradeHistoryWhereInput versionGte(String versionGte) {

        this.versionGte = versionGte;
        return this;
    }

    /**
     * Get versionGte
     *
     * @return versionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(String versionGte) {
        this.versionGte = versionGte;
    }

    public ClusterUpgradeHistoryWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public void setVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        }
    }

    public boolean getVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GTE);
    }

    public ClusterUpgradeHistoryWhereInput versionIn(List<String> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addVersionInItem(String versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<String>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<String> versionIn) {
        this.versionIn = versionIn;
    }

    public ClusterUpgradeHistoryWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public ClusterUpgradeHistoryWhereInput versionLt(String versionLt) {

        this.versionLt = versionLt;
        return this;
    }

    /**
     * Get versionLt
     *
     * @return versionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(String versionLt) {
        this.versionLt = versionLt;
    }

    public ClusterUpgradeHistoryWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public void setVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        }
    }

    public boolean getVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LT);
    }

    public ClusterUpgradeHistoryWhereInput versionLte(String versionLte) {

        this.versionLte = versionLte;
        return this;
    }

    /**
     * Get versionLte
     *
     * @return versionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(String versionLte) {
        this.versionLte = versionLte;
    }

    public ClusterUpgradeHistoryWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public void setVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        }
    }

    public boolean getVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LTE);
    }

    public ClusterUpgradeHistoryWhereInput versionNot(String versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(String versionNot) {
        this.versionNot = versionNot;
    }

    public ClusterUpgradeHistoryWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public ClusterUpgradeHistoryWhereInput versionNotContains(String versionNotContains) {

        this.versionNotContains = versionNotContains;
        return this;
    }

    /**
     * Get versionNotContains
     *
     * @return versionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotContains() {
        return versionNotContains;
    }

    public void setVersionNotContains(String versionNotContains) {
        this.versionNotContains = versionNotContains;
    }

    public ClusterUpgradeHistoryWhereInput versionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
    }

    public ClusterUpgradeHistoryWhereInput versionNotEndsWith(String versionNotEndsWith) {

        this.versionNotEndsWith = versionNotEndsWith;
        return this;
    }

    /**
     * Get versionNotEndsWith
     *
     * @return versionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotEndsWith() {
        return versionNotEndsWith;
    }

    public void setVersionNotEndsWith(String versionNotEndsWith) {
        this.versionNotEndsWith = versionNotEndsWith;
    }

    public ClusterUpgradeHistoryWhereInput versionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput versionNotIn(List<String> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public ClusterUpgradeHistoryWhereInput addVersionNotInItem(String versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<String>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<String> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public ClusterUpgradeHistoryWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    public ClusterUpgradeHistoryWhereInput versionNotStartsWith(String versionNotStartsWith) {

        this.versionNotStartsWith = versionNotStartsWith;
        return this;
    }

    /**
     * Get versionNotStartsWith
     *
     * @return versionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotStartsWith() {
        return versionNotStartsWith;
    }

    public void setVersionNotStartsWith(String versionNotStartsWith) {
        this.versionNotStartsWith = versionNotStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput versionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
    }

    public ClusterUpgradeHistoryWhereInput versionStartsWith(String versionStartsWith) {

        this.versionStartsWith = versionStartsWith;
        return this;
    }

    /**
     * Get versionStartsWith
     *
     * @return versionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionStartsWith() {
        return versionStartsWith;
    }

    public void setVersionStartsWith(String versionStartsWith) {
        this.versionStartsWith = versionStartsWith;
    }

    public ClusterUpgradeHistoryWhereInput versionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterUpgradeHistoryWhereInput versionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public void setVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        }
    }

    public boolean getVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterUpgradeHistoryWhereInput clusterUpgradeHistoryWhereInput =
                (ClusterUpgradeHistoryWhereInput) o;
        return Objects.equals(this.AND, clusterUpgradeHistoryWhereInput.AND)
                && Objects.equals(this.NOT, clusterUpgradeHistoryWhereInput.NOT)
                && Objects.equals(this.OR, clusterUpgradeHistoryWhereInput.OR)
                && Objects.equals(this.cluster, clusterUpgradeHistoryWhereInput.cluster)
                && Objects.equals(this.date, clusterUpgradeHistoryWhereInput.date)
                && Objects.equals(this.dateGt, clusterUpgradeHistoryWhereInput.dateGt)
                && Objects.equals(this.dateGte, clusterUpgradeHistoryWhereInput.dateGte)
                && Objects.equals(this.dateIn, clusterUpgradeHistoryWhereInput.dateIn)
                && Objects.equals(this.dateLt, clusterUpgradeHistoryWhereInput.dateLt)
                && Objects.equals(this.dateLte, clusterUpgradeHistoryWhereInput.dateLte)
                && Objects.equals(this.dateNot, clusterUpgradeHistoryWhereInput.dateNot)
                && Objects.equals(this.dateNotIn, clusterUpgradeHistoryWhereInput.dateNotIn)
                && Objects.equals(this.id, clusterUpgradeHistoryWhereInput.id)
                && Objects.equals(this.idContains, clusterUpgradeHistoryWhereInput.idContains)
                && Objects.equals(this.idEndsWith, clusterUpgradeHistoryWhereInput.idEndsWith)
                && Objects.equals(this.idGt, clusterUpgradeHistoryWhereInput.idGt)
                && Objects.equals(this.idGte, clusterUpgradeHistoryWhereInput.idGte)
                && Objects.equals(this.idIn, clusterUpgradeHistoryWhereInput.idIn)
                && Objects.equals(this.idLt, clusterUpgradeHistoryWhereInput.idLt)
                && Objects.equals(this.idLte, clusterUpgradeHistoryWhereInput.idLte)
                && Objects.equals(this.idNot, clusterUpgradeHistoryWhereInput.idNot)
                && Objects.equals(this.idNotContains, clusterUpgradeHistoryWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, clusterUpgradeHistoryWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, clusterUpgradeHistoryWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, clusterUpgradeHistoryWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, clusterUpgradeHistoryWhereInput.idStartsWith)
                && Objects.equals(this.localId, clusterUpgradeHistoryWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, clusterUpgradeHistoryWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, clusterUpgradeHistoryWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, clusterUpgradeHistoryWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, clusterUpgradeHistoryWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, clusterUpgradeHistoryWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, clusterUpgradeHistoryWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, clusterUpgradeHistoryWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, clusterUpgradeHistoryWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, clusterUpgradeHistoryWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, clusterUpgradeHistoryWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, clusterUpgradeHistoryWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        clusterUpgradeHistoryWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, clusterUpgradeHistoryWhereInput.localIdStartsWith)
                && Objects.equals(this.result, clusterUpgradeHistoryWhereInput.result)
                && Objects.equals(
                        this.resultContains, clusterUpgradeHistoryWhereInput.resultContains)
                && Objects.equals(
                        this.resultEndsWith, clusterUpgradeHistoryWhereInput.resultEndsWith)
                && Objects.equals(this.resultGt, clusterUpgradeHistoryWhereInput.resultGt)
                && Objects.equals(this.resultGte, clusterUpgradeHistoryWhereInput.resultGte)
                && Objects.equals(this.resultIn, clusterUpgradeHistoryWhereInput.resultIn)
                && Objects.equals(this.resultLt, clusterUpgradeHistoryWhereInput.resultLt)
                && Objects.equals(this.resultLte, clusterUpgradeHistoryWhereInput.resultLte)
                && Objects.equals(this.resultNot, clusterUpgradeHistoryWhereInput.resultNot)
                && Objects.equals(
                        this.resultNotContains, clusterUpgradeHistoryWhereInput.resultNotContains)
                && Objects.equals(
                        this.resultNotEndsWith, clusterUpgradeHistoryWhereInput.resultNotEndsWith)
                && Objects.equals(this.resultNotIn, clusterUpgradeHistoryWhereInput.resultNotIn)
                && Objects.equals(
                        this.resultNotStartsWith,
                        clusterUpgradeHistoryWhereInput.resultNotStartsWith)
                && Objects.equals(
                        this.resultStartsWith, clusterUpgradeHistoryWhereInput.resultStartsWith)
                && Objects.equals(this.taskUuid, clusterUpgradeHistoryWhereInput.taskUuid)
                && Objects.equals(
                        this.taskUuidContains, clusterUpgradeHistoryWhereInput.taskUuidContains)
                && Objects.equals(
                        this.taskUuidEndsWith, clusterUpgradeHistoryWhereInput.taskUuidEndsWith)
                && Objects.equals(this.taskUuidGt, clusterUpgradeHistoryWhereInput.taskUuidGt)
                && Objects.equals(this.taskUuidGte, clusterUpgradeHistoryWhereInput.taskUuidGte)
                && Objects.equals(this.taskUuidIn, clusterUpgradeHistoryWhereInput.taskUuidIn)
                && Objects.equals(this.taskUuidLt, clusterUpgradeHistoryWhereInput.taskUuidLt)
                && Objects.equals(this.taskUuidLte, clusterUpgradeHistoryWhereInput.taskUuidLte)
                && Objects.equals(this.taskUuidNot, clusterUpgradeHistoryWhereInput.taskUuidNot)
                && Objects.equals(
                        this.taskUuidNotContains,
                        clusterUpgradeHistoryWhereInput.taskUuidNotContains)
                && Objects.equals(
                        this.taskUuidNotEndsWith,
                        clusterUpgradeHistoryWhereInput.taskUuidNotEndsWith)
                && Objects.equals(this.taskUuidNotIn, clusterUpgradeHistoryWhereInput.taskUuidNotIn)
                && Objects.equals(
                        this.taskUuidNotStartsWith,
                        clusterUpgradeHistoryWhereInput.taskUuidNotStartsWith)
                && Objects.equals(
                        this.taskUuidStartsWith, clusterUpgradeHistoryWhereInput.taskUuidStartsWith)
                && Objects.equals(this.version, clusterUpgradeHistoryWhereInput.version)
                && Objects.equals(
                        this.versionContains, clusterUpgradeHistoryWhereInput.versionContains)
                && Objects.equals(
                        this.versionEndsWith, clusterUpgradeHistoryWhereInput.versionEndsWith)
                && Objects.equals(this.versionGt, clusterUpgradeHistoryWhereInput.versionGt)
                && Objects.equals(this.versionGte, clusterUpgradeHistoryWhereInput.versionGte)
                && Objects.equals(this.versionIn, clusterUpgradeHistoryWhereInput.versionIn)
                && Objects.equals(this.versionLt, clusterUpgradeHistoryWhereInput.versionLt)
                && Objects.equals(this.versionLte, clusterUpgradeHistoryWhereInput.versionLte)
                && Objects.equals(this.versionNot, clusterUpgradeHistoryWhereInput.versionNot)
                && Objects.equals(
                        this.versionNotContains, clusterUpgradeHistoryWhereInput.versionNotContains)
                && Objects.equals(
                        this.versionNotEndsWith, clusterUpgradeHistoryWhereInput.versionNotEndsWith)
                && Objects.equals(this.versionNotIn, clusterUpgradeHistoryWhereInput.versionNotIn)
                && Objects.equals(
                        this.versionNotStartsWith,
                        clusterUpgradeHistoryWhereInput.versionNotStartsWith)
                && Objects.equals(
                        this.versionStartsWith, clusterUpgradeHistoryWhereInput.versionStartsWith);
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
                date,
                dateGt,
                dateGte,
                dateIn,
                dateLt,
                dateLte,
                dateNot,
                dateNotIn,
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
                result,
                resultContains,
                resultEndsWith,
                resultGt,
                resultGte,
                resultIn,
                resultLt,
                resultLte,
                resultNot,
                resultNotContains,
                resultNotEndsWith,
                resultNotIn,
                resultNotStartsWith,
                resultStartsWith,
                taskUuid,
                taskUuidContains,
                taskUuidEndsWith,
                taskUuidGt,
                taskUuidGte,
                taskUuidIn,
                taskUuidLt,
                taskUuidLte,
                taskUuidNot,
                taskUuidNotContains,
                taskUuidNotEndsWith,
                taskUuidNotIn,
                taskUuidNotStartsWith,
                taskUuidStartsWith,
                version,
                versionContains,
                versionEndsWith,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotContains,
                versionNotEndsWith,
                versionNotIn,
                versionNotStartsWith,
                versionStartsWith);
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
        sb.append("class ClusterUpgradeHistoryWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    dateGt: ").append(toIndentedString(dateGt)).append("\n");
        sb.append("    dateGte: ").append(toIndentedString(dateGte)).append("\n");
        sb.append("    dateIn: ").append(toIndentedString(dateIn)).append("\n");
        sb.append("    dateLt: ").append(toIndentedString(dateLt)).append("\n");
        sb.append("    dateLte: ").append(toIndentedString(dateLte)).append("\n");
        sb.append("    dateNot: ").append(toIndentedString(dateNot)).append("\n");
        sb.append("    dateNotIn: ").append(toIndentedString(dateNotIn)).append("\n");
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
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    resultContains: ").append(toIndentedString(resultContains)).append("\n");
        sb.append("    resultEndsWith: ").append(toIndentedString(resultEndsWith)).append("\n");
        sb.append("    resultGt: ").append(toIndentedString(resultGt)).append("\n");
        sb.append("    resultGte: ").append(toIndentedString(resultGte)).append("\n");
        sb.append("    resultIn: ").append(toIndentedString(resultIn)).append("\n");
        sb.append("    resultLt: ").append(toIndentedString(resultLt)).append("\n");
        sb.append("    resultLte: ").append(toIndentedString(resultLte)).append("\n");
        sb.append("    resultNot: ").append(toIndentedString(resultNot)).append("\n");
        sb.append("    resultNotContains: ")
                .append(toIndentedString(resultNotContains))
                .append("\n");
        sb.append("    resultNotEndsWith: ")
                .append(toIndentedString(resultNotEndsWith))
                .append("\n");
        sb.append("    resultNotIn: ").append(toIndentedString(resultNotIn)).append("\n");
        sb.append("    resultNotStartsWith: ")
                .append(toIndentedString(resultNotStartsWith))
                .append("\n");
        sb.append("    resultStartsWith: ").append(toIndentedString(resultStartsWith)).append("\n");
        sb.append("    taskUuid: ").append(toIndentedString(taskUuid)).append("\n");
        sb.append("    taskUuidContains: ").append(toIndentedString(taskUuidContains)).append("\n");
        sb.append("    taskUuidEndsWith: ").append(toIndentedString(taskUuidEndsWith)).append("\n");
        sb.append("    taskUuidGt: ").append(toIndentedString(taskUuidGt)).append("\n");
        sb.append("    taskUuidGte: ").append(toIndentedString(taskUuidGte)).append("\n");
        sb.append("    taskUuidIn: ").append(toIndentedString(taskUuidIn)).append("\n");
        sb.append("    taskUuidLt: ").append(toIndentedString(taskUuidLt)).append("\n");
        sb.append("    taskUuidLte: ").append(toIndentedString(taskUuidLte)).append("\n");
        sb.append("    taskUuidNot: ").append(toIndentedString(taskUuidNot)).append("\n");
        sb.append("    taskUuidNotContains: ")
                .append(toIndentedString(taskUuidNotContains))
                .append("\n");
        sb.append("    taskUuidNotEndsWith: ")
                .append(toIndentedString(taskUuidNotEndsWith))
                .append("\n");
        sb.append("    taskUuidNotIn: ").append(toIndentedString(taskUuidNotIn)).append("\n");
        sb.append("    taskUuidNotStartsWith: ")
                .append(toIndentedString(taskUuidNotStartsWith))
                .append("\n");
        sb.append("    taskUuidStartsWith: ")
                .append(toIndentedString(taskUuidStartsWith))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
        sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotContains: ")
                .append(toIndentedString(versionNotContains))
                .append("\n");
        sb.append("    versionNotEndsWith: ")
                .append(toIndentedString(versionNotEndsWith))
                .append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    versionNotStartsWith: ")
                .append(toIndentedString(versionNotStartsWith))
                .append("\n");
        sb.append("    versionStartsWith: ")
                .append(toIndentedString(versionStartsWith))
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
