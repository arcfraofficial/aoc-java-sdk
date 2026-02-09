package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReportTemplateWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReportTemplateWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReportTemplateWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReportTemplateWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReportTemplateWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_PRESET = "preset";

    @SerializedName(SERIALIZED_NAME_PRESET)
    private String preset;

    public static final String SERIALIZED_NAME_PRESET_CONTAINS = "preset_contains";

    @SerializedName(SERIALIZED_NAME_PRESET_CONTAINS)
    private String presetContains;

    public static final String SERIALIZED_NAME_PRESET_ENDS_WITH = "preset_ends_with";

    @SerializedName(SERIALIZED_NAME_PRESET_ENDS_WITH)
    private String presetEndsWith;

    public static final String SERIALIZED_NAME_PRESET_GT = "preset_gt";

    @SerializedName(SERIALIZED_NAME_PRESET_GT)
    private String presetGt;

    public static final String SERIALIZED_NAME_PRESET_GTE = "preset_gte";

    @SerializedName(SERIALIZED_NAME_PRESET_GTE)
    private String presetGte;

    public static final String SERIALIZED_NAME_PRESET_IN = "preset_in";

    @SerializedName(SERIALIZED_NAME_PRESET_IN)
    private List<String> presetIn = null;

    public static final String SERIALIZED_NAME_PRESET_LT = "preset_lt";

    @SerializedName(SERIALIZED_NAME_PRESET_LT)
    private String presetLt;

    public static final String SERIALIZED_NAME_PRESET_LTE = "preset_lte";

    @SerializedName(SERIALIZED_NAME_PRESET_LTE)
    private String presetLte;

    public static final String SERIALIZED_NAME_PRESET_NOT = "preset_not";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT)
    private String presetNot;

    public static final String SERIALIZED_NAME_PRESET_NOT_CONTAINS = "preset_not_contains";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_CONTAINS)
    private String presetNotContains;

    public static final String SERIALIZED_NAME_PRESET_NOT_ENDS_WITH = "preset_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH)
    private String presetNotEndsWith;

    public static final String SERIALIZED_NAME_PRESET_NOT_IN = "preset_not_in";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_IN)
    private List<String> presetNotIn = null;

    public static final String SERIALIZED_NAME_PRESET_NOT_STARTS_WITH = "preset_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH)
    private String presetNotStartsWith;

    public static final String SERIALIZED_NAME_PRESET_STARTS_WITH = "preset_starts_with";

    @SerializedName(SERIALIZED_NAME_PRESET_STARTS_WITH)
    private String presetStartsWith;

    public static final String SERIALIZED_NAME_TASK_NUM = "task_num";

    @SerializedName(SERIALIZED_NAME_TASK_NUM)
    private Integer taskNum;

    public static final String SERIALIZED_NAME_TASK_NUM_GT = "task_num_gt";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_GT)
    private Integer taskNumGt;

    public static final String SERIALIZED_NAME_TASK_NUM_GTE = "task_num_gte";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_GTE)
    private Integer taskNumGte;

    public static final String SERIALIZED_NAME_TASK_NUM_IN = "task_num_in";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_IN)
    private List<Integer> taskNumIn = null;

    public static final String SERIALIZED_NAME_TASK_NUM_LT = "task_num_lt";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_LT)
    private Integer taskNumLt;

    public static final String SERIALIZED_NAME_TASK_NUM_LTE = "task_num_lte";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_LTE)
    private Integer taskNumLte;

    public static final String SERIALIZED_NAME_TASK_NUM_NOT = "task_num_not";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_NOT)
    private Integer taskNumNot;

    public static final String SERIALIZED_NAME_TASK_NUM_NOT_IN = "task_num_not_in";

    @SerializedName(SERIALIZED_NAME_TASK_NUM_NOT_IN)
    private List<Integer> taskNumNotIn = null;

    public static final String SERIALIZED_NAME_TASKS_EVERY = "tasks_every";

    @SerializedName(SERIALIZED_NAME_TASKS_EVERY)
    private ReportTaskWhereInput tasksEvery;

    public static final String SERIALIZED_NAME_TASKS_NONE = "tasks_none";

    @SerializedName(SERIALIZED_NAME_TASKS_NONE)
    private ReportTaskWhereInput tasksNone;

    public static final String SERIALIZED_NAME_TASKS_SOME = "tasks_some";

    @SerializedName(SERIALIZED_NAME_TASKS_SOME)
    private ReportTaskWhereInput tasksSome;

    public ReportTemplateWhereInput() {}

    public ReportTemplateWhereInput AND(List<ReportTemplateWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReportTemplateWhereInput addANDItem(ReportTemplateWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReportTemplateWhereInput>();
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
    public List<ReportTemplateWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReportTemplateWhereInput> AND) {
        this.AND = AND;
    }

    public ReportTemplateWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReportTemplateWhereInput AND_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput NOT(List<ReportTemplateWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReportTemplateWhereInput addNOTItem(ReportTemplateWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReportTemplateWhereInput>();
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
    public List<ReportTemplateWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReportTemplateWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReportTemplateWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReportTemplateWhereInput NOT_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput OR(List<ReportTemplateWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReportTemplateWhereInput addORItem(ReportTemplateWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReportTemplateWhereInput>();
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
    public List<ReportTemplateWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReportTemplateWhereInput> OR) {
        this.OR = OR;
    }

    public ReportTemplateWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReportTemplateWhereInput OR_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAt(String createdAt) {

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

    public ReportTemplateWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReportTemplateWhereInput createdAt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtGt(String createdAtGt) {

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

    public ReportTemplateWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReportTemplateWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtGte(String createdAtGte) {

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

    public ReportTemplateWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReportTemplateWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReportTemplateWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ReportTemplateWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReportTemplateWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtLt(String createdAtLt) {

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

    public ReportTemplateWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReportTemplateWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtLte(String createdAtLte) {

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

    public ReportTemplateWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReportTemplateWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtNot(String createdAtNot) {

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

    public ReportTemplateWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReportTemplateWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReportTemplateWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ReportTemplateWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput description(String description) {

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

    public ReportTemplateWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReportTemplateWhereInput description_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionContains(String descriptionContains) {

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

    public ReportTemplateWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput descriptionContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public ReportTemplateWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionGt(String descriptionGt) {

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

    public ReportTemplateWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ReportTemplateWhereInput descriptionGt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionGte(String descriptionGte) {

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

    public ReportTemplateWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ReportTemplateWhereInput descriptionGte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ReportTemplateWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public ReportTemplateWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ReportTemplateWhereInput descriptionIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionLt(String descriptionLt) {

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

    public ReportTemplateWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ReportTemplateWhereInput descriptionLt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionLte(String descriptionLte) {

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

    public ReportTemplateWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ReportTemplateWhereInput descriptionLte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionNot(String descriptionNot) {

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

    public ReportTemplateWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ReportTemplateWhereInput descriptionNot_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public ReportTemplateWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public ReportTemplateWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ReportTemplateWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public ReportTemplateWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public ReportTemplateWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public ReportTemplateWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput id(String id) {

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

    public ReportTemplateWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReportTemplateWhereInput id_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idContains(String idContains) {

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

    public ReportTemplateWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput idContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idEndsWith(String idEndsWith) {

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

    public ReportTemplateWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idGt(String idGt) {

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

    public ReportTemplateWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReportTemplateWhereInput idGt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idGte(String idGte) {

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

    public ReportTemplateWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReportTemplateWhereInput idGte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReportTemplateWhereInput addIdInItem(String idInItem) {
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

    public ReportTemplateWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReportTemplateWhereInput idIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idLt(String idLt) {

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

    public ReportTemplateWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReportTemplateWhereInput idLt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idLte(String idLte) {

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

    public ReportTemplateWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReportTemplateWhereInput idLte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idNot(String idNot) {

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

    public ReportTemplateWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReportTemplateWhereInput idNot_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idNotContains(String idNotContains) {

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

    public ReportTemplateWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReportTemplateWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReportTemplateWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReportTemplateWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReportTemplateWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput idStartsWith(String idStartsWith) {

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

    public ReportTemplateWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput name(String name) {

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

    public ReportTemplateWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReportTemplateWhereInput name_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameContains(String nameContains) {

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

    public ReportTemplateWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput nameContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameEndsWith(String nameEndsWith) {

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

    public ReportTemplateWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameGt(String nameGt) {

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

    public ReportTemplateWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ReportTemplateWhereInput nameGt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameGte(String nameGte) {

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

    public ReportTemplateWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ReportTemplateWhereInput nameGte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ReportTemplateWhereInput addNameInItem(String nameInItem) {
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

    public ReportTemplateWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ReportTemplateWhereInput nameIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameLt(String nameLt) {

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

    public ReportTemplateWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ReportTemplateWhereInput nameLt_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameLte(String nameLte) {

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

    public ReportTemplateWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ReportTemplateWhereInput nameLte_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameNot(String nameNot) {

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

    public ReportTemplateWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ReportTemplateWhereInput nameNot_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameNotContains(String nameNotContains) {

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

    public ReportTemplateWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ReportTemplateWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ReportTemplateWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ReportTemplateWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ReportTemplateWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput nameStartsWith(String nameStartsWith) {

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

    public ReportTemplateWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ReportTemplateWhereInput preset(String preset) {

        this.preset = preset;
        return this;
    }

    /**
     * Get preset
     *
     * @return preset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public ReportTemplateWhereInput preset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET);
        return this;
    }

    public ReportTemplateWhereInput preset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        return this;
    }

    public void setPreset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        }
    }

    public boolean getPreset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET);
    }

    public ReportTemplateWhereInput presetContains(String presetContains) {

        this.presetContains = presetContains;
        return this;
    }

    /**
     * Get presetContains
     *
     * @return presetContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetContains() {
        return presetContains;
    }

    public void setPresetContains(String presetContains) {
        this.presetContains = presetContains;
    }

    public ReportTemplateWhereInput presetContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput presetContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_CONTAINS);
        return this;
    }

    public void setPresetContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_CONTAINS);
        }
    }

    public boolean getPresetContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_CONTAINS);
    }

    public ReportTemplateWhereInput presetEndsWith(String presetEndsWith) {

        this.presetEndsWith = presetEndsWith;
        return this;
    }

    /**
     * Get presetEndsWith
     *
     * @return presetEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetEndsWith() {
        return presetEndsWith;
    }

    public void setPresetEndsWith(String presetEndsWith) {
        this.presetEndsWith = presetEndsWith;
    }

    public ReportTemplateWhereInput presetEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput presetEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_ENDS_WITH);
        return this;
    }

    public void setPresetEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_ENDS_WITH);
        }
    }

    public boolean getPresetEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_ENDS_WITH);
    }

    public ReportTemplateWhereInput presetGt(String presetGt) {

        this.presetGt = presetGt;
        return this;
    }

    /**
     * Get presetGt
     *
     * @return presetGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetGt() {
        return presetGt;
    }

    public void setPresetGt(String presetGt) {
        this.presetGt = presetGt;
    }

    public ReportTemplateWhereInput presetGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_GT);
        return this;
    }

    public ReportTemplateWhereInput presetGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_GT);
        return this;
    }

    public void setPresetGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_GT);
        }
    }

    public boolean getPresetGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_GT);
    }

    public ReportTemplateWhereInput presetGte(String presetGte) {

        this.presetGte = presetGte;
        return this;
    }

    /**
     * Get presetGte
     *
     * @return presetGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetGte() {
        return presetGte;
    }

    public void setPresetGte(String presetGte) {
        this.presetGte = presetGte;
    }

    public ReportTemplateWhereInput presetGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_GTE);
        return this;
    }

    public ReportTemplateWhereInput presetGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_GTE);
        return this;
    }

    public void setPresetGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_GTE);
        }
    }

    public boolean getPresetGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_GTE);
    }

    public ReportTemplateWhereInput presetIn(List<String> presetIn) {

        this.presetIn = presetIn;
        return this;
    }

    public ReportTemplateWhereInput addPresetInItem(String presetInItem) {
        if (this.presetIn == null) {
            this.presetIn = new ArrayList<String>();
        }
        this.presetIn.add(presetInItem);
        return this;
    }

    /**
     * Get presetIn
     *
     * @return presetIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPresetIn() {
        return presetIn;
    }

    public void setPresetIn(List<String> presetIn) {
        this.presetIn = presetIn;
    }

    public ReportTemplateWhereInput presetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public ReportTemplateWhereInput presetIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public void setPresetIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        }
    }

    public boolean getPresetIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_IN);
    }

    public ReportTemplateWhereInput presetLt(String presetLt) {

        this.presetLt = presetLt;
        return this;
    }

    /**
     * Get presetLt
     *
     * @return presetLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetLt() {
        return presetLt;
    }

    public void setPresetLt(String presetLt) {
        this.presetLt = presetLt;
    }

    public ReportTemplateWhereInput presetLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_LT);
        return this;
    }

    public ReportTemplateWhereInput presetLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_LT);
        return this;
    }

    public void setPresetLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_LT);
        }
    }

    public boolean getPresetLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_LT);
    }

    public ReportTemplateWhereInput presetLte(String presetLte) {

        this.presetLte = presetLte;
        return this;
    }

    /**
     * Get presetLte
     *
     * @return presetLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetLte() {
        return presetLte;
    }

    public void setPresetLte(String presetLte) {
        this.presetLte = presetLte;
    }

    public ReportTemplateWhereInput presetLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_LTE);
        return this;
    }

    public ReportTemplateWhereInput presetLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_LTE);
        return this;
    }

    public void setPresetLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_LTE);
        }
    }

    public boolean getPresetLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_LTE);
    }

    public ReportTemplateWhereInput presetNot(String presetNot) {

        this.presetNot = presetNot;
        return this;
    }

    /**
     * Get presetNot
     *
     * @return presetNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNot() {
        return presetNot;
    }

    public void setPresetNot(String presetNot) {
        this.presetNot = presetNot;
    }

    public ReportTemplateWhereInput presetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public ReportTemplateWhereInput presetNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public void setPresetNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        }
    }

    public boolean getPresetNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT);
    }

    public ReportTemplateWhereInput presetNotContains(String presetNotContains) {

        this.presetNotContains = presetNotContains;
        return this;
    }

    /**
     * Get presetNotContains
     *
     * @return presetNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotContains() {
        return presetNotContains;
    }

    public void setPresetNotContains(String presetNotContains) {
        this.presetNotContains = presetNotContains;
    }

    public ReportTemplateWhereInput presetNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        return this;
    }

    public ReportTemplateWhereInput presetNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        return this;
    }

    public void setPresetNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        }
    }

    public boolean getPresetNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
    }

    public ReportTemplateWhereInput presetNotEndsWith(String presetNotEndsWith) {

        this.presetNotEndsWith = presetNotEndsWith;
        return this;
    }

    /**
     * Get presetNotEndsWith
     *
     * @return presetNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotEndsWith() {
        return presetNotEndsWith;
    }

    public void setPresetNotEndsWith(String presetNotEndsWith) {
        this.presetNotEndsWith = presetNotEndsWith;
    }

    public ReportTemplateWhereInput presetNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        return this;
    }

    public ReportTemplateWhereInput presetNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        return this;
    }

    public void setPresetNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        }
    }

    public boolean getPresetNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
    }

    public ReportTemplateWhereInput presetNotIn(List<String> presetNotIn) {

        this.presetNotIn = presetNotIn;
        return this;
    }

    public ReportTemplateWhereInput addPresetNotInItem(String presetNotInItem) {
        if (this.presetNotIn == null) {
            this.presetNotIn = new ArrayList<String>();
        }
        this.presetNotIn.add(presetNotInItem);
        return this;
    }

    /**
     * Get presetNotIn
     *
     * @return presetNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPresetNotIn() {
        return presetNotIn;
    }

    public void setPresetNotIn(List<String> presetNotIn) {
        this.presetNotIn = presetNotIn;
    }

    public ReportTemplateWhereInput presetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput presetNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public void setPresetNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        }
    }

    public boolean getPresetNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_IN);
    }

    public ReportTemplateWhereInput presetNotStartsWith(String presetNotStartsWith) {

        this.presetNotStartsWith = presetNotStartsWith;
        return this;
    }

    /**
     * Get presetNotStartsWith
     *
     * @return presetNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotStartsWith() {
        return presetNotStartsWith;
    }

    public void setPresetNotStartsWith(String presetNotStartsWith) {
        this.presetNotStartsWith = presetNotStartsWith;
    }

    public ReportTemplateWhereInput presetNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput presetNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        return this;
    }

    public void setPresetNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        }
    }

    public boolean getPresetNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
    }

    public ReportTemplateWhereInput presetStartsWith(String presetStartsWith) {

        this.presetStartsWith = presetStartsWith;
        return this;
    }

    /**
     * Get presetStartsWith
     *
     * @return presetStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetStartsWith() {
        return presetStartsWith;
    }

    public void setPresetStartsWith(String presetStartsWith) {
        this.presetStartsWith = presetStartsWith;
    }

    public ReportTemplateWhereInput presetStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_STARTS_WITH);
        return this;
    }

    public ReportTemplateWhereInput presetStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_STARTS_WITH);
        return this;
    }

    public void setPresetStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_STARTS_WITH);
        }
    }

    public boolean getPresetStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_STARTS_WITH);
    }

    public ReportTemplateWhereInput taskNum(Integer taskNum) {

        this.taskNum = taskNum;
        return this;
    }

    /**
     * Get taskNum
     *
     * @return taskNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public ReportTemplateWhereInput taskNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM);
        return this;
    }

    public ReportTemplateWhereInput taskNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM);
        return this;
    }

    public void setTaskNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM);
        }
    }

    public boolean getTaskNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM);
    }

    public ReportTemplateWhereInput taskNumGt(Integer taskNumGt) {

        this.taskNumGt = taskNumGt;
        return this;
    }

    /**
     * Get taskNumGt
     *
     * @return taskNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNumGt() {
        return taskNumGt;
    }

    public void setTaskNumGt(Integer taskNumGt) {
        this.taskNumGt = taskNumGt;
    }

    public ReportTemplateWhereInput taskNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_GT);
        return this;
    }

    public ReportTemplateWhereInput taskNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_GT);
        return this;
    }

    public void setTaskNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_GT);
        }
    }

    public boolean getTaskNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_GT);
    }

    public ReportTemplateWhereInput taskNumGte(Integer taskNumGte) {

        this.taskNumGte = taskNumGte;
        return this;
    }

    /**
     * Get taskNumGte
     *
     * @return taskNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNumGte() {
        return taskNumGte;
    }

    public void setTaskNumGte(Integer taskNumGte) {
        this.taskNumGte = taskNumGte;
    }

    public ReportTemplateWhereInput taskNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_GTE);
        return this;
    }

    public ReportTemplateWhereInput taskNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_GTE);
        return this;
    }

    public void setTaskNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_GTE);
        }
    }

    public boolean getTaskNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_GTE);
    }

    public ReportTemplateWhereInput taskNumIn(List<Integer> taskNumIn) {

        this.taskNumIn = taskNumIn;
        return this;
    }

    public ReportTemplateWhereInput addTaskNumInItem(Integer taskNumInItem) {
        if (this.taskNumIn == null) {
            this.taskNumIn = new ArrayList<Integer>();
        }
        this.taskNumIn.add(taskNumInItem);
        return this;
    }

    /**
     * Get taskNumIn
     *
     * @return taskNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTaskNumIn() {
        return taskNumIn;
    }

    public void setTaskNumIn(List<Integer> taskNumIn) {
        this.taskNumIn = taskNumIn;
    }

    public ReportTemplateWhereInput taskNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_IN);
        return this;
    }

    public ReportTemplateWhereInput taskNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_IN);
        return this;
    }

    public void setTaskNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_IN);
        }
    }

    public boolean getTaskNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_IN);
    }

    public ReportTemplateWhereInput taskNumLt(Integer taskNumLt) {

        this.taskNumLt = taskNumLt;
        return this;
    }

    /**
     * Get taskNumLt
     *
     * @return taskNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNumLt() {
        return taskNumLt;
    }

    public void setTaskNumLt(Integer taskNumLt) {
        this.taskNumLt = taskNumLt;
    }

    public ReportTemplateWhereInput taskNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_LT);
        return this;
    }

    public ReportTemplateWhereInput taskNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_LT);
        return this;
    }

    public void setTaskNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_LT);
        }
    }

    public boolean getTaskNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_LT);
    }

    public ReportTemplateWhereInput taskNumLte(Integer taskNumLte) {

        this.taskNumLte = taskNumLte;
        return this;
    }

    /**
     * Get taskNumLte
     *
     * @return taskNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNumLte() {
        return taskNumLte;
    }

    public void setTaskNumLte(Integer taskNumLte) {
        this.taskNumLte = taskNumLte;
    }

    public ReportTemplateWhereInput taskNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_LTE);
        return this;
    }

    public ReportTemplateWhereInput taskNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_LTE);
        return this;
    }

    public void setTaskNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_LTE);
        }
    }

    public boolean getTaskNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_LTE);
    }

    public ReportTemplateWhereInput taskNumNot(Integer taskNumNot) {

        this.taskNumNot = taskNumNot;
        return this;
    }

    /**
     * Get taskNumNot
     *
     * @return taskNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTaskNumNot() {
        return taskNumNot;
    }

    public void setTaskNumNot(Integer taskNumNot) {
        this.taskNumNot = taskNumNot;
    }

    public ReportTemplateWhereInput taskNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_NOT);
        return this;
    }

    public ReportTemplateWhereInput taskNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_NOT);
        return this;
    }

    public void setTaskNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_NOT);
        }
    }

    public boolean getTaskNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_NOT);
    }

    public ReportTemplateWhereInput taskNumNotIn(List<Integer> taskNumNotIn) {

        this.taskNumNotIn = taskNumNotIn;
        return this;
    }

    public ReportTemplateWhereInput addTaskNumNotInItem(Integer taskNumNotInItem) {
        if (this.taskNumNotIn == null) {
            this.taskNumNotIn = new ArrayList<Integer>();
        }
        this.taskNumNotIn.add(taskNumNotInItem);
        return this;
    }

    /**
     * Get taskNumNotIn
     *
     * @return taskNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTaskNumNotIn() {
        return taskNumNotIn;
    }

    public void setTaskNumNotIn(List<Integer> taskNumNotIn) {
        this.taskNumNotIn = taskNumNotIn;
    }

    public ReportTemplateWhereInput taskNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_NOT_IN);
        return this;
    }

    public ReportTemplateWhereInput taskNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_NOT_IN);
        return this;
    }

    public void setTaskNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NUM_NOT_IN);
        }
    }

    public boolean getTaskNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NUM_NOT_IN);
    }

    public ReportTemplateWhereInput tasksEvery(ReportTaskWhereInput tasksEvery) {

        this.tasksEvery = tasksEvery;
        return this;
    }

    /**
     * Get tasksEvery
     *
     * @return tasksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReportTaskWhereInput getTasksEvery() {
        return tasksEvery;
    }

    public void setTasksEvery(ReportTaskWhereInput tasksEvery) {
        this.tasksEvery = tasksEvery;
    }

    public ReportTemplateWhereInput tasksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS_EVERY);
        return this;
    }

    public ReportTemplateWhereInput tasksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS_EVERY);
        return this;
    }

    public void setTasksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS_EVERY);
        }
    }

    public boolean getTasksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS_EVERY);
    }

    public ReportTemplateWhereInput tasksNone(ReportTaskWhereInput tasksNone) {

        this.tasksNone = tasksNone;
        return this;
    }

    /**
     * Get tasksNone
     *
     * @return tasksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReportTaskWhereInput getTasksNone() {
        return tasksNone;
    }

    public void setTasksNone(ReportTaskWhereInput tasksNone) {
        this.tasksNone = tasksNone;
    }

    public ReportTemplateWhereInput tasksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS_NONE);
        return this;
    }

    public ReportTemplateWhereInput tasksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS_NONE);
        return this;
    }

    public void setTasksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS_NONE);
        }
    }

    public boolean getTasksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS_NONE);
    }

    public ReportTemplateWhereInput tasksSome(ReportTaskWhereInput tasksSome) {

        this.tasksSome = tasksSome;
        return this;
    }

    /**
     * Get tasksSome
     *
     * @return tasksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReportTaskWhereInput getTasksSome() {
        return tasksSome;
    }

    public void setTasksSome(ReportTaskWhereInput tasksSome) {
        this.tasksSome = tasksSome;
    }

    public ReportTemplateWhereInput tasksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS_SOME);
        return this;
    }

    public ReportTemplateWhereInput tasksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS_SOME);
        return this;
    }

    public void setTasksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS_SOME);
        }
    }

    public boolean getTasksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTemplateWhereInput reportTemplateWhereInput = (ReportTemplateWhereInput) o;
        return Objects.equals(this.AND, reportTemplateWhereInput.AND)
                && Objects.equals(this.NOT, reportTemplateWhereInput.NOT)
                && Objects.equals(this.OR, reportTemplateWhereInput.OR)
                && Objects.equals(this.createdAt, reportTemplateWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, reportTemplateWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, reportTemplateWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, reportTemplateWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, reportTemplateWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, reportTemplateWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, reportTemplateWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, reportTemplateWhereInput.createdAtNotIn)
                && Objects.equals(this.description, reportTemplateWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, reportTemplateWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, reportTemplateWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, reportTemplateWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, reportTemplateWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, reportTemplateWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, reportTemplateWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, reportTemplateWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, reportTemplateWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        reportTemplateWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        reportTemplateWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, reportTemplateWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        reportTemplateWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, reportTemplateWhereInput.descriptionStartsWith)
                && Objects.equals(this.id, reportTemplateWhereInput.id)
                && Objects.equals(this.idContains, reportTemplateWhereInput.idContains)
                && Objects.equals(this.idEndsWith, reportTemplateWhereInput.idEndsWith)
                && Objects.equals(this.idGt, reportTemplateWhereInput.idGt)
                && Objects.equals(this.idGte, reportTemplateWhereInput.idGte)
                && Objects.equals(this.idIn, reportTemplateWhereInput.idIn)
                && Objects.equals(this.idLt, reportTemplateWhereInput.idLt)
                && Objects.equals(this.idLte, reportTemplateWhereInput.idLte)
                && Objects.equals(this.idNot, reportTemplateWhereInput.idNot)
                && Objects.equals(this.idNotContains, reportTemplateWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, reportTemplateWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, reportTemplateWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, reportTemplateWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, reportTemplateWhereInput.idStartsWith)
                && Objects.equals(this.name, reportTemplateWhereInput.name)
                && Objects.equals(this.nameContains, reportTemplateWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, reportTemplateWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, reportTemplateWhereInput.nameGt)
                && Objects.equals(this.nameGte, reportTemplateWhereInput.nameGte)
                && Objects.equals(this.nameIn, reportTemplateWhereInput.nameIn)
                && Objects.equals(this.nameLt, reportTemplateWhereInput.nameLt)
                && Objects.equals(this.nameLte, reportTemplateWhereInput.nameLte)
                && Objects.equals(this.nameNot, reportTemplateWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, reportTemplateWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, reportTemplateWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, reportTemplateWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, reportTemplateWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, reportTemplateWhereInput.nameStartsWith)
                && Objects.equals(this.preset, reportTemplateWhereInput.preset)
                && Objects.equals(this.presetContains, reportTemplateWhereInput.presetContains)
                && Objects.equals(this.presetEndsWith, reportTemplateWhereInput.presetEndsWith)
                && Objects.equals(this.presetGt, reportTemplateWhereInput.presetGt)
                && Objects.equals(this.presetGte, reportTemplateWhereInput.presetGte)
                && Objects.equals(this.presetIn, reportTemplateWhereInput.presetIn)
                && Objects.equals(this.presetLt, reportTemplateWhereInput.presetLt)
                && Objects.equals(this.presetLte, reportTemplateWhereInput.presetLte)
                && Objects.equals(this.presetNot, reportTemplateWhereInput.presetNot)
                && Objects.equals(
                        this.presetNotContains, reportTemplateWhereInput.presetNotContains)
                && Objects.equals(
                        this.presetNotEndsWith, reportTemplateWhereInput.presetNotEndsWith)
                && Objects.equals(this.presetNotIn, reportTemplateWhereInput.presetNotIn)
                && Objects.equals(
                        this.presetNotStartsWith, reportTemplateWhereInput.presetNotStartsWith)
                && Objects.equals(this.presetStartsWith, reportTemplateWhereInput.presetStartsWith)
                && Objects.equals(this.taskNum, reportTemplateWhereInput.taskNum)
                && Objects.equals(this.taskNumGt, reportTemplateWhereInput.taskNumGt)
                && Objects.equals(this.taskNumGte, reportTemplateWhereInput.taskNumGte)
                && Objects.equals(this.taskNumIn, reportTemplateWhereInput.taskNumIn)
                && Objects.equals(this.taskNumLt, reportTemplateWhereInput.taskNumLt)
                && Objects.equals(this.taskNumLte, reportTemplateWhereInput.taskNumLte)
                && Objects.equals(this.taskNumNot, reportTemplateWhereInput.taskNumNot)
                && Objects.equals(this.taskNumNotIn, reportTemplateWhereInput.taskNumNotIn)
                && Objects.equals(this.tasksEvery, reportTemplateWhereInput.tasksEvery)
                && Objects.equals(this.tasksNone, reportTemplateWhereInput.tasksNone)
                && Objects.equals(this.tasksSome, reportTemplateWhereInput.tasksSome);
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
                preset,
                presetContains,
                presetEndsWith,
                presetGt,
                presetGte,
                presetIn,
                presetLt,
                presetLte,
                presetNot,
                presetNotContains,
                presetNotEndsWith,
                presetNotIn,
                presetNotStartsWith,
                presetStartsWith,
                taskNum,
                taskNumGt,
                taskNumGte,
                taskNumIn,
                taskNumLt,
                taskNumLte,
                taskNumNot,
                taskNumNotIn,
                tasksEvery,
                tasksNone,
                tasksSome);
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
        sb.append("class ReportTemplateWhereInput {\n");
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
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    presetContains: ").append(toIndentedString(presetContains)).append("\n");
        sb.append("    presetEndsWith: ").append(toIndentedString(presetEndsWith)).append("\n");
        sb.append("    presetGt: ").append(toIndentedString(presetGt)).append("\n");
        sb.append("    presetGte: ").append(toIndentedString(presetGte)).append("\n");
        sb.append("    presetIn: ").append(toIndentedString(presetIn)).append("\n");
        sb.append("    presetLt: ").append(toIndentedString(presetLt)).append("\n");
        sb.append("    presetLte: ").append(toIndentedString(presetLte)).append("\n");
        sb.append("    presetNot: ").append(toIndentedString(presetNot)).append("\n");
        sb.append("    presetNotContains: ")
                .append(toIndentedString(presetNotContains))
                .append("\n");
        sb.append("    presetNotEndsWith: ")
                .append(toIndentedString(presetNotEndsWith))
                .append("\n");
        sb.append("    presetNotIn: ").append(toIndentedString(presetNotIn)).append("\n");
        sb.append("    presetNotStartsWith: ")
                .append(toIndentedString(presetNotStartsWith))
                .append("\n");
        sb.append("    presetStartsWith: ").append(toIndentedString(presetStartsWith)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    taskNumGt: ").append(toIndentedString(taskNumGt)).append("\n");
        sb.append("    taskNumGte: ").append(toIndentedString(taskNumGte)).append("\n");
        sb.append("    taskNumIn: ").append(toIndentedString(taskNumIn)).append("\n");
        sb.append("    taskNumLt: ").append(toIndentedString(taskNumLt)).append("\n");
        sb.append("    taskNumLte: ").append(toIndentedString(taskNumLte)).append("\n");
        sb.append("    taskNumNot: ").append(toIndentedString(taskNumNot)).append("\n");
        sb.append("    taskNumNotIn: ").append(toIndentedString(taskNumNotIn)).append("\n");
        sb.append("    tasksEvery: ").append(toIndentedString(tasksEvery)).append("\n");
        sb.append("    tasksNone: ").append(toIndentedString(tasksNone)).append("\n");
        sb.append("    tasksSome: ").append(toIndentedString(tasksSome)).append("\n");
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
