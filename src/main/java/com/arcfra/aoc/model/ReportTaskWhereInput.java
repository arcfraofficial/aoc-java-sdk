package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReportTaskWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReportTaskWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReportTaskWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReportTaskWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReportTaskWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

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

    public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";

    @SerializedName(SERIALIZED_NAME_PLAN_ID)
    private String planId;

    public static final String SERIALIZED_NAME_PLAN_ID_CONTAINS = "plan_id_contains";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_CONTAINS)
    private String planIdContains;

    public static final String SERIALIZED_NAME_PLAN_ID_ENDS_WITH = "plan_id_ends_with";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_ENDS_WITH)
    private String planIdEndsWith;

    public static final String SERIALIZED_NAME_PLAN_ID_GT = "plan_id_gt";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_GT)
    private String planIdGt;

    public static final String SERIALIZED_NAME_PLAN_ID_GTE = "plan_id_gte";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_GTE)
    private String planIdGte;

    public static final String SERIALIZED_NAME_PLAN_ID_IN = "plan_id_in";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_IN)
    private List<String> planIdIn = null;

    public static final String SERIALIZED_NAME_PLAN_ID_LT = "plan_id_lt";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_LT)
    private String planIdLt;

    public static final String SERIALIZED_NAME_PLAN_ID_LTE = "plan_id_lte";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_LTE)
    private String planIdLte;

    public static final String SERIALIZED_NAME_PLAN_ID_NOT = "plan_id_not";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_NOT)
    private String planIdNot;

    public static final String SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS = "plan_id_not_contains";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS)
    private String planIdNotContains;

    public static final String SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH = "plan_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH)
    private String planIdNotEndsWith;

    public static final String SERIALIZED_NAME_PLAN_ID_NOT_IN = "plan_id_not_in";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_NOT_IN)
    private List<String> planIdNotIn = null;

    public static final String SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH = "plan_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH)
    private String planIdNotStartsWith;

    public static final String SERIALIZED_NAME_PLAN_ID_STARTS_WITH = "plan_id_starts_with";

    @SerializedName(SERIALIZED_NAME_PLAN_ID_STARTS_WITH)
    private String planIdStartsWith;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<TaskStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private TaskStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<TaskStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_TEMPLATE = "template";

    @SerializedName(SERIALIZED_NAME_TEMPLATE)
    private ReportTemplateWhereInput template;

    public ReportTaskWhereInput() {}

    public ReportTaskWhereInput AND(List<ReportTaskWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReportTaskWhereInput addANDItem(ReportTaskWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReportTaskWhereInput>();
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
    public List<ReportTaskWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReportTaskWhereInput> AND) {
        this.AND = AND;
    }

    public ReportTaskWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReportTaskWhereInput AND_ExplictlyNonNull() {
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

    public ReportTaskWhereInput NOT(List<ReportTaskWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReportTaskWhereInput addNOTItem(ReportTaskWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReportTaskWhereInput>();
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
    public List<ReportTaskWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReportTaskWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReportTaskWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReportTaskWhereInput NOT_ExplictlyNonNull() {
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

    public ReportTaskWhereInput OR(List<ReportTaskWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReportTaskWhereInput addORItem(ReportTaskWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReportTaskWhereInput>();
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
    public List<ReportTaskWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReportTaskWhereInput> OR) {
        this.OR = OR;
    }

    public ReportTaskWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReportTaskWhereInput OR_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAt(String createdAt) {

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

    public ReportTaskWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReportTaskWhereInput createdAt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtGt(String createdAtGt) {

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

    public ReportTaskWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReportTaskWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtGte(String createdAtGte) {

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

    public ReportTaskWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReportTaskWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReportTaskWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ReportTaskWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReportTaskWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtLt(String createdAtLt) {

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

    public ReportTaskWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReportTaskWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtLte(String createdAtLte) {

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

    public ReportTaskWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReportTaskWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtNot(String createdAtNot) {

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

    public ReportTaskWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReportTaskWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ReportTaskWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReportTaskWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ReportTaskWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReportTaskWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput id(String id) {

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

    public ReportTaskWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReportTaskWhereInput id_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idContains(String idContains) {

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

    public ReportTaskWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput idContains_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idEndsWith(String idEndsWith) {

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

    public ReportTaskWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idGt(String idGt) {

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

    public ReportTaskWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReportTaskWhereInput idGt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idGte(String idGte) {

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

    public ReportTaskWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReportTaskWhereInput idGte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReportTaskWhereInput addIdInItem(String idInItem) {
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

    public ReportTaskWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReportTaskWhereInput idIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idLt(String idLt) {

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

    public ReportTaskWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReportTaskWhereInput idLt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idLte(String idLte) {

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

    public ReportTaskWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReportTaskWhereInput idLte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idNot(String idNot) {

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

    public ReportTaskWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReportTaskWhereInput idNot_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idNotContains(String idNotContains) {

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

    public ReportTaskWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReportTaskWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReportTaskWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReportTaskWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReportTaskWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReportTaskWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput idStartsWith(String idStartsWith) {

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

    public ReportTaskWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public ReportTaskWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public ReportTaskWhereInput internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public ReportTaskWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public ReportTaskWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public ReportTaskWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public ReportTaskWhereInput name(String name) {

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

    public ReportTaskWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReportTaskWhereInput name_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameContains(String nameContains) {

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

    public ReportTaskWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput nameContains_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameEndsWith(String nameEndsWith) {

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

    public ReportTaskWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameGt(String nameGt) {

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

    public ReportTaskWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ReportTaskWhereInput nameGt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameGte(String nameGte) {

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

    public ReportTaskWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ReportTaskWhereInput nameGte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ReportTaskWhereInput addNameInItem(String nameInItem) {
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

    public ReportTaskWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ReportTaskWhereInput nameIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameLt(String nameLt) {

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

    public ReportTaskWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ReportTaskWhereInput nameLt_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameLte(String nameLte) {

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

    public ReportTaskWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ReportTaskWhereInput nameLte_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameNot(String nameNot) {

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

    public ReportTaskWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ReportTaskWhereInput nameNot_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameNotContains(String nameNotContains) {

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

    public ReportTaskWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ReportTaskWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ReportTaskWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ReportTaskWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ReportTaskWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ReportTaskWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput nameStartsWith(String nameStartsWith) {

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

    public ReportTaskWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ReportTaskWhereInput planId(String planId) {

        this.planId = planId;
        return this;
    }

    /**
     * Get planId
     *
     * @return planId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ReportTaskWhereInput planId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID);
        return this;
    }

    public ReportTaskWhereInput planId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID);
        return this;
    }

    public void setPlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID);
        }
    }

    public boolean getPlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID);
    }

    public ReportTaskWhereInput planIdContains(String planIdContains) {

        this.planIdContains = planIdContains;
        return this;
    }

    /**
     * Get planIdContains
     *
     * @return planIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdContains() {
        return planIdContains;
    }

    public void setPlanIdContains(String planIdContains) {
        this.planIdContains = planIdContains;
    }

    public ReportTaskWhereInput planIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput planIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_CONTAINS);
        return this;
    }

    public void setPlanIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_CONTAINS);
        }
    }

    public boolean getPlanIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_CONTAINS);
    }

    public ReportTaskWhereInput planIdEndsWith(String planIdEndsWith) {

        this.planIdEndsWith = planIdEndsWith;
        return this;
    }

    /**
     * Get planIdEndsWith
     *
     * @return planIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdEndsWith() {
        return planIdEndsWith;
    }

    public void setPlanIdEndsWith(String planIdEndsWith) {
        this.planIdEndsWith = planIdEndsWith;
    }

    public ReportTaskWhereInput planIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput planIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_ENDS_WITH);
        return this;
    }

    public void setPlanIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_ENDS_WITH);
        }
    }

    public boolean getPlanIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_ENDS_WITH);
    }

    public ReportTaskWhereInput planIdGt(String planIdGt) {

        this.planIdGt = planIdGt;
        return this;
    }

    /**
     * Get planIdGt
     *
     * @return planIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdGt() {
        return planIdGt;
    }

    public void setPlanIdGt(String planIdGt) {
        this.planIdGt = planIdGt;
    }

    public ReportTaskWhereInput planIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_GT);
        return this;
    }

    public ReportTaskWhereInput planIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_GT);
        return this;
    }

    public void setPlanIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_GT);
        }
    }

    public boolean getPlanIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_GT);
    }

    public ReportTaskWhereInput planIdGte(String planIdGte) {

        this.planIdGte = planIdGte;
        return this;
    }

    /**
     * Get planIdGte
     *
     * @return planIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdGte() {
        return planIdGte;
    }

    public void setPlanIdGte(String planIdGte) {
        this.planIdGte = planIdGte;
    }

    public ReportTaskWhereInput planIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_GTE);
        return this;
    }

    public ReportTaskWhereInput planIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_GTE);
        return this;
    }

    public void setPlanIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_GTE);
        }
    }

    public boolean getPlanIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_GTE);
    }

    public ReportTaskWhereInput planIdIn(List<String> planIdIn) {

        this.planIdIn = planIdIn;
        return this;
    }

    public ReportTaskWhereInput addPlanIdInItem(String planIdInItem) {
        if (this.planIdIn == null) {
            this.planIdIn = new ArrayList<String>();
        }
        this.planIdIn.add(planIdInItem);
        return this;
    }

    /**
     * Get planIdIn
     *
     * @return planIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlanIdIn() {
        return planIdIn;
    }

    public void setPlanIdIn(List<String> planIdIn) {
        this.planIdIn = planIdIn;
    }

    public ReportTaskWhereInput planIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_IN);
        return this;
    }

    public ReportTaskWhereInput planIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_IN);
        return this;
    }

    public void setPlanIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_IN);
        }
    }

    public boolean getPlanIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_IN);
    }

    public ReportTaskWhereInput planIdLt(String planIdLt) {

        this.planIdLt = planIdLt;
        return this;
    }

    /**
     * Get planIdLt
     *
     * @return planIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdLt() {
        return planIdLt;
    }

    public void setPlanIdLt(String planIdLt) {
        this.planIdLt = planIdLt;
    }

    public ReportTaskWhereInput planIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_LT);
        return this;
    }

    public ReportTaskWhereInput planIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_LT);
        return this;
    }

    public void setPlanIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_LT);
        }
    }

    public boolean getPlanIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_LT);
    }

    public ReportTaskWhereInput planIdLte(String planIdLte) {

        this.planIdLte = planIdLte;
        return this;
    }

    /**
     * Get planIdLte
     *
     * @return planIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdLte() {
        return planIdLte;
    }

    public void setPlanIdLte(String planIdLte) {
        this.planIdLte = planIdLte;
    }

    public ReportTaskWhereInput planIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_LTE);
        return this;
    }

    public ReportTaskWhereInput planIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_LTE);
        return this;
    }

    public void setPlanIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_LTE);
        }
    }

    public boolean getPlanIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_LTE);
    }

    public ReportTaskWhereInput planIdNot(String planIdNot) {

        this.planIdNot = planIdNot;
        return this;
    }

    /**
     * Get planIdNot
     *
     * @return planIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdNot() {
        return planIdNot;
    }

    public void setPlanIdNot(String planIdNot) {
        this.planIdNot = planIdNot;
    }

    public ReportTaskWhereInput planIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT);
        return this;
    }

    public ReportTaskWhereInput planIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT);
        return this;
    }

    public void setPlanIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT);
        }
    }

    public boolean getPlanIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_NOT);
    }

    public ReportTaskWhereInput planIdNotContains(String planIdNotContains) {

        this.planIdNotContains = planIdNotContains;
        return this;
    }

    /**
     * Get planIdNotContains
     *
     * @return planIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdNotContains() {
        return planIdNotContains;
    }

    public void setPlanIdNotContains(String planIdNotContains) {
        this.planIdNotContains = planIdNotContains;
    }

    public ReportTaskWhereInput planIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS);
        return this;
    }

    public ReportTaskWhereInput planIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS);
        return this;
    }

    public void setPlanIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS);
        }
    }

    public boolean getPlanIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_NOT_CONTAINS);
    }

    public ReportTaskWhereInput planIdNotEndsWith(String planIdNotEndsWith) {

        this.planIdNotEndsWith = planIdNotEndsWith;
        return this;
    }

    /**
     * Get planIdNotEndsWith
     *
     * @return planIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdNotEndsWith() {
        return planIdNotEndsWith;
    }

    public void setPlanIdNotEndsWith(String planIdNotEndsWith) {
        this.planIdNotEndsWith = planIdNotEndsWith;
    }

    public ReportTaskWhereInput planIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReportTaskWhereInput planIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setPlanIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getPlanIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_NOT_ENDS_WITH);
    }

    public ReportTaskWhereInput planIdNotIn(List<String> planIdNotIn) {

        this.planIdNotIn = planIdNotIn;
        return this;
    }

    public ReportTaskWhereInput addPlanIdNotInItem(String planIdNotInItem) {
        if (this.planIdNotIn == null) {
            this.planIdNotIn = new ArrayList<String>();
        }
        this.planIdNotIn.add(planIdNotInItem);
        return this;
    }

    /**
     * Get planIdNotIn
     *
     * @return planIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlanIdNotIn() {
        return planIdNotIn;
    }

    public void setPlanIdNotIn(List<String> planIdNotIn) {
        this.planIdNotIn = planIdNotIn;
    }

    public ReportTaskWhereInput planIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_IN);
        return this;
    }

    public ReportTaskWhereInput planIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_IN);
        return this;
    }

    public void setPlanIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_IN);
        }
    }

    public boolean getPlanIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_NOT_IN);
    }

    public ReportTaskWhereInput planIdNotStartsWith(String planIdNotStartsWith) {

        this.planIdNotStartsWith = planIdNotStartsWith;
        return this;
    }

    /**
     * Get planIdNotStartsWith
     *
     * @return planIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdNotStartsWith() {
        return planIdNotStartsWith;
    }

    public void setPlanIdNotStartsWith(String planIdNotStartsWith) {
        this.planIdNotStartsWith = planIdNotStartsWith;
    }

    public ReportTaskWhereInput planIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput planIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setPlanIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getPlanIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_NOT_STARTS_WITH);
    }

    public ReportTaskWhereInput planIdStartsWith(String planIdStartsWith) {

        this.planIdStartsWith = planIdStartsWith;
        return this;
    }

    /**
     * Get planIdStartsWith
     *
     * @return planIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlanIdStartsWith() {
        return planIdStartsWith;
    }

    public void setPlanIdStartsWith(String planIdStartsWith) {
        this.planIdStartsWith = planIdStartsWith;
    }

    public ReportTaskWhereInput planIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_STARTS_WITH);
        return this;
    }

    public ReportTaskWhereInput planIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_STARTS_WITH);
        return this;
    }

    public void setPlanIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLAN_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLAN_ID_STARTS_WITH);
        }
    }

    public boolean getPlanIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLAN_ID_STARTS_WITH);
    }

    public ReportTaskWhereInput status(TaskStatus status) {

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
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public ReportTaskWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ReportTaskWhereInput status_ExplictlyNonNull() {
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

    public ReportTaskWhereInput statusIn(List<TaskStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public ReportTaskWhereInput addStatusInItem(TaskStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<TaskStatus>();
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
    public List<TaskStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<TaskStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public ReportTaskWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public ReportTaskWhereInput statusIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput statusNot(TaskStatus statusNot) {

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
    public TaskStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(TaskStatus statusNot) {
        this.statusNot = statusNot;
    }

    public ReportTaskWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public ReportTaskWhereInput statusNot_ExplictlyNonNull() {
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

    public ReportTaskWhereInput statusNotIn(List<TaskStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public ReportTaskWhereInput addStatusNotInItem(TaskStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<TaskStatus>();
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
    public List<TaskStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<TaskStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public ReportTaskWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public ReportTaskWhereInput statusNotIn_ExplictlyNonNull() {
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

    public ReportTaskWhereInput template(ReportTemplateWhereInput template) {

        this.template = template;
        return this;
    }

    /**
     * Get template
     *
     * @return template
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReportTemplateWhereInput getTemplate() {
        return template;
    }

    public void setTemplate(ReportTemplateWhereInput template) {
        this.template = template;
    }

    public ReportTaskWhereInput template_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TEMPLATE);
        return this;
    }

    public ReportTaskWhereInput template_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE);
        return this;
    }

    public void setTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE);
        }
    }

    public boolean getTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TEMPLATE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTaskWhereInput reportTaskWhereInput = (ReportTaskWhereInput) o;
        return Objects.equals(this.AND, reportTaskWhereInput.AND)
                && Objects.equals(this.NOT, reportTaskWhereInput.NOT)
                && Objects.equals(this.OR, reportTaskWhereInput.OR)
                && Objects.equals(this.createdAt, reportTaskWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, reportTaskWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, reportTaskWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, reportTaskWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, reportTaskWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, reportTaskWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, reportTaskWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, reportTaskWhereInput.createdAtNotIn)
                && Objects.equals(this.id, reportTaskWhereInput.id)
                && Objects.equals(this.idContains, reportTaskWhereInput.idContains)
                && Objects.equals(this.idEndsWith, reportTaskWhereInput.idEndsWith)
                && Objects.equals(this.idGt, reportTaskWhereInput.idGt)
                && Objects.equals(this.idGte, reportTaskWhereInput.idGte)
                && Objects.equals(this.idIn, reportTaskWhereInput.idIn)
                && Objects.equals(this.idLt, reportTaskWhereInput.idLt)
                && Objects.equals(this.idLte, reportTaskWhereInput.idLte)
                && Objects.equals(this.idNot, reportTaskWhereInput.idNot)
                && Objects.equals(this.idNotContains, reportTaskWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, reportTaskWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, reportTaskWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, reportTaskWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, reportTaskWhereInput.idStartsWith)
                && Objects.equals(this.internal, reportTaskWhereInput.internal)
                && Objects.equals(this.internalNot, reportTaskWhereInput.internalNot)
                && Objects.equals(this.name, reportTaskWhereInput.name)
                && Objects.equals(this.nameContains, reportTaskWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, reportTaskWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, reportTaskWhereInput.nameGt)
                && Objects.equals(this.nameGte, reportTaskWhereInput.nameGte)
                && Objects.equals(this.nameIn, reportTaskWhereInput.nameIn)
                && Objects.equals(this.nameLt, reportTaskWhereInput.nameLt)
                && Objects.equals(this.nameLte, reportTaskWhereInput.nameLte)
                && Objects.equals(this.nameNot, reportTaskWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, reportTaskWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, reportTaskWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, reportTaskWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, reportTaskWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, reportTaskWhereInput.nameStartsWith)
                && Objects.equals(this.planId, reportTaskWhereInput.planId)
                && Objects.equals(this.planIdContains, reportTaskWhereInput.planIdContains)
                && Objects.equals(this.planIdEndsWith, reportTaskWhereInput.planIdEndsWith)
                && Objects.equals(this.planIdGt, reportTaskWhereInput.planIdGt)
                && Objects.equals(this.planIdGte, reportTaskWhereInput.planIdGte)
                && Objects.equals(this.planIdIn, reportTaskWhereInput.planIdIn)
                && Objects.equals(this.planIdLt, reportTaskWhereInput.planIdLt)
                && Objects.equals(this.planIdLte, reportTaskWhereInput.planIdLte)
                && Objects.equals(this.planIdNot, reportTaskWhereInput.planIdNot)
                && Objects.equals(this.planIdNotContains, reportTaskWhereInput.planIdNotContains)
                && Objects.equals(this.planIdNotEndsWith, reportTaskWhereInput.planIdNotEndsWith)
                && Objects.equals(this.planIdNotIn, reportTaskWhereInput.planIdNotIn)
                && Objects.equals(
                        this.planIdNotStartsWith, reportTaskWhereInput.planIdNotStartsWith)
                && Objects.equals(this.planIdStartsWith, reportTaskWhereInput.planIdStartsWith)
                && Objects.equals(this.status, reportTaskWhereInput.status)
                && Objects.equals(this.statusIn, reportTaskWhereInput.statusIn)
                && Objects.equals(this.statusNot, reportTaskWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, reportTaskWhereInput.statusNotIn)
                && Objects.equals(this.template, reportTaskWhereInput.template);
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
                internal,
                internalNot,
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
                planId,
                planIdContains,
                planIdEndsWith,
                planIdGt,
                planIdGte,
                planIdIn,
                planIdLt,
                planIdLte,
                planIdNot,
                planIdNotContains,
                planIdNotEndsWith,
                planIdNotIn,
                planIdNotStartsWith,
                planIdStartsWith,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                template);
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
        sb.append("class ReportTaskWhereInput {\n");
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
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
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
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planIdContains: ").append(toIndentedString(planIdContains)).append("\n");
        sb.append("    planIdEndsWith: ").append(toIndentedString(planIdEndsWith)).append("\n");
        sb.append("    planIdGt: ").append(toIndentedString(planIdGt)).append("\n");
        sb.append("    planIdGte: ").append(toIndentedString(planIdGte)).append("\n");
        sb.append("    planIdIn: ").append(toIndentedString(planIdIn)).append("\n");
        sb.append("    planIdLt: ").append(toIndentedString(planIdLt)).append("\n");
        sb.append("    planIdLte: ").append(toIndentedString(planIdLte)).append("\n");
        sb.append("    planIdNot: ").append(toIndentedString(planIdNot)).append("\n");
        sb.append("    planIdNotContains: ")
                .append(toIndentedString(planIdNotContains))
                .append("\n");
        sb.append("    planIdNotEndsWith: ")
                .append(toIndentedString(planIdNotEndsWith))
                .append("\n");
        sb.append("    planIdNotIn: ").append(toIndentedString(planIdNotIn)).append("\n");
        sb.append("    planIdNotStartsWith: ")
                .append(toIndentedString(planIdNotStartsWith))
                .append("\n");
        sb.append("    planIdStartsWith: ").append(toIndentedString(planIdStartsWith)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
