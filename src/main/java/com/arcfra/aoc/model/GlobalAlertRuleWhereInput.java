package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GlobalAlertRuleWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GlobalAlertRuleWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<GlobalAlertRuleWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<GlobalAlertRuleWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<GlobalAlertRuleWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ALERT_RULES_EVERY = "alert_rules_every";

    @SerializedName(SERIALIZED_NAME_ALERT_RULES_EVERY)
    private AlertRuleWhereInput alertRulesEvery;

    public static final String SERIALIZED_NAME_ALERT_RULES_NONE = "alert_rules_none";

    @SerializedName(SERIALIZED_NAME_ALERT_RULES_NONE)
    private AlertRuleWhereInput alertRulesNone;

    public static final String SERIALIZED_NAME_ALERT_RULES_SOME = "alert_rules_some";

    @SerializedName(SERIALIZED_NAME_ALERT_RULES_SOME)
    private AlertRuleWhereInput alertRulesSome;

    public static final String SERIALIZED_NAME_BOOLEAN = "boolean";

    @SerializedName(SERIALIZED_NAME_BOOLEAN)
    private Boolean _boolean;

    public static final String SERIALIZED_NAME_BOOLEAN_NOT = "boolean_not";

    @SerializedName(SERIALIZED_NAME_BOOLEAN_NOT)
    private Boolean booleanNot;

    public static final String SERIALIZED_NAME_CAUSE = "cause";

    @SerializedName(SERIALIZED_NAME_CAUSE)
    private String cause;

    public static final String SERIALIZED_NAME_CAUSE_CONTAINS = "cause_contains";

    @SerializedName(SERIALIZED_NAME_CAUSE_CONTAINS)
    private String causeContains;

    public static final String SERIALIZED_NAME_CAUSE_ENDS_WITH = "cause_ends_with";

    @SerializedName(SERIALIZED_NAME_CAUSE_ENDS_WITH)
    private String causeEndsWith;

    public static final String SERIALIZED_NAME_CAUSE_GT = "cause_gt";

    @SerializedName(SERIALIZED_NAME_CAUSE_GT)
    private String causeGt;

    public static final String SERIALIZED_NAME_CAUSE_GTE = "cause_gte";

    @SerializedName(SERIALIZED_NAME_CAUSE_GTE)
    private String causeGte;

    public static final String SERIALIZED_NAME_CAUSE_IN = "cause_in";

    @SerializedName(SERIALIZED_NAME_CAUSE_IN)
    private List<String> causeIn = null;

    public static final String SERIALIZED_NAME_CAUSE_LT = "cause_lt";

    @SerializedName(SERIALIZED_NAME_CAUSE_LT)
    private String causeLt;

    public static final String SERIALIZED_NAME_CAUSE_LTE = "cause_lte";

    @SerializedName(SERIALIZED_NAME_CAUSE_LTE)
    private String causeLte;

    public static final String SERIALIZED_NAME_CAUSE_NOT = "cause_not";

    @SerializedName(SERIALIZED_NAME_CAUSE_NOT)
    private String causeNot;

    public static final String SERIALIZED_NAME_CAUSE_NOT_CONTAINS = "cause_not_contains";

    @SerializedName(SERIALIZED_NAME_CAUSE_NOT_CONTAINS)
    private String causeNotContains;

    public static final String SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH = "cause_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH)
    private String causeNotEndsWith;

    public static final String SERIALIZED_NAME_CAUSE_NOT_IN = "cause_not_in";

    @SerializedName(SERIALIZED_NAME_CAUSE_NOT_IN)
    private List<String> causeNotIn = null;

    public static final String SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH = "cause_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH)
    private String causeNotStartsWith;

    public static final String SERIALIZED_NAME_CAUSE_STARTS_WITH = "cause_starts_with";

    @SerializedName(SERIALIZED_NAME_CAUSE_STARTS_WITH)
    private String causeStartsWith;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISABLED_NOT = "disabled_not";

    @SerializedName(SERIALIZED_NAME_DISABLED_NOT)
    private Boolean disabledNot;

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

    public static final String SERIALIZED_NAME_IMPACT = "impact";

    @SerializedName(SERIALIZED_NAME_IMPACT)
    private String impact;

    public static final String SERIALIZED_NAME_IMPACT_CONTAINS = "impact_contains";

    @SerializedName(SERIALIZED_NAME_IMPACT_CONTAINS)
    private String impactContains;

    public static final String SERIALIZED_NAME_IMPACT_ENDS_WITH = "impact_ends_with";

    @SerializedName(SERIALIZED_NAME_IMPACT_ENDS_WITH)
    private String impactEndsWith;

    public static final String SERIALIZED_NAME_IMPACT_GT = "impact_gt";

    @SerializedName(SERIALIZED_NAME_IMPACT_GT)
    private String impactGt;

    public static final String SERIALIZED_NAME_IMPACT_GTE = "impact_gte";

    @SerializedName(SERIALIZED_NAME_IMPACT_GTE)
    private String impactGte;

    public static final String SERIALIZED_NAME_IMPACT_IN = "impact_in";

    @SerializedName(SERIALIZED_NAME_IMPACT_IN)
    private List<String> impactIn = null;

    public static final String SERIALIZED_NAME_IMPACT_LT = "impact_lt";

    @SerializedName(SERIALIZED_NAME_IMPACT_LT)
    private String impactLt;

    public static final String SERIALIZED_NAME_IMPACT_LTE = "impact_lte";

    @SerializedName(SERIALIZED_NAME_IMPACT_LTE)
    private String impactLte;

    public static final String SERIALIZED_NAME_IMPACT_NOT = "impact_not";

    @SerializedName(SERIALIZED_NAME_IMPACT_NOT)
    private String impactNot;

    public static final String SERIALIZED_NAME_IMPACT_NOT_CONTAINS = "impact_not_contains";

    @SerializedName(SERIALIZED_NAME_IMPACT_NOT_CONTAINS)
    private String impactNotContains;

    public static final String SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH = "impact_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH)
    private String impactNotEndsWith;

    public static final String SERIALIZED_NAME_IMPACT_NOT_IN = "impact_not_in";

    @SerializedName(SERIALIZED_NAME_IMPACT_NOT_IN)
    private List<String> impactNotIn = null;

    public static final String SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH = "impact_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH)
    private String impactNotStartsWith;

    public static final String SERIALIZED_NAME_IMPACT_STARTS_WITH = "impact_starts_with";

    @SerializedName(SERIALIZED_NAME_IMPACT_STARTS_WITH)
    private String impactStartsWith;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_MESSAGE_CONTAINS = "message_contains";

    @SerializedName(SERIALIZED_NAME_MESSAGE_CONTAINS)
    private String messageContains;

    public static final String SERIALIZED_NAME_MESSAGE_ENDS_WITH = "message_ends_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_ENDS_WITH)
    private String messageEndsWith;

    public static final String SERIALIZED_NAME_MESSAGE_GT = "message_gt";

    @SerializedName(SERIALIZED_NAME_MESSAGE_GT)
    private String messageGt;

    public static final String SERIALIZED_NAME_MESSAGE_GTE = "message_gte";

    @SerializedName(SERIALIZED_NAME_MESSAGE_GTE)
    private String messageGte;

    public static final String SERIALIZED_NAME_MESSAGE_IN = "message_in";

    @SerializedName(SERIALIZED_NAME_MESSAGE_IN)
    private List<String> messageIn = null;

    public static final String SERIALIZED_NAME_MESSAGE_LT = "message_lt";

    @SerializedName(SERIALIZED_NAME_MESSAGE_LT)
    private String messageLt;

    public static final String SERIALIZED_NAME_MESSAGE_LTE = "message_lte";

    @SerializedName(SERIALIZED_NAME_MESSAGE_LTE)
    private String messageLte;

    public static final String SERIALIZED_NAME_MESSAGE_NOT = "message_not";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT)
    private String messageNot;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_CONTAINS = "message_not_contains";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS)
    private String messageNotContains;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH = "message_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH)
    private String messageNotEndsWith;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_IN = "message_not_in";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_IN)
    private List<String> messageNotIn = null;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH = "message_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH)
    private String messageNotStartsWith;

    public static final String SERIALIZED_NAME_MESSAGE_STARTS_WITH = "message_starts_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_STARTS_WITH)
    private String messageStartsWith;

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

    public static final String SERIALIZED_NAME_OBJECT = "object";

    @SerializedName(SERIALIZED_NAME_OBJECT)
    private AlertRuleObject _object;

    public static final String SERIALIZED_NAME_OBJECT_IN = "object_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_IN)
    private List<AlertRuleObject> objectIn = null;

    public static final String SERIALIZED_NAME_OBJECT_NOT = "object_not";

    @SerializedName(SERIALIZED_NAME_OBJECT_NOT)
    private AlertRuleObject objectNot;

    public static final String SERIALIZED_NAME_OBJECT_NOT_IN = "object_not_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_NOT_IN)
    private List<AlertRuleObject> objectNotIn = null;

    public static final String SERIALIZED_NAME_OPERATOR = "operator";

    @SerializedName(SERIALIZED_NAME_OPERATOR)
    private String operator;

    public static final String SERIALIZED_NAME_OPERATOR_CONTAINS = "operator_contains";

    @SerializedName(SERIALIZED_NAME_OPERATOR_CONTAINS)
    private String operatorContains;

    public static final String SERIALIZED_NAME_OPERATOR_ENDS_WITH = "operator_ends_with";

    @SerializedName(SERIALIZED_NAME_OPERATOR_ENDS_WITH)
    private String operatorEndsWith;

    public static final String SERIALIZED_NAME_OPERATOR_GT = "operator_gt";

    @SerializedName(SERIALIZED_NAME_OPERATOR_GT)
    private String operatorGt;

    public static final String SERIALIZED_NAME_OPERATOR_GTE = "operator_gte";

    @SerializedName(SERIALIZED_NAME_OPERATOR_GTE)
    private String operatorGte;

    public static final String SERIALIZED_NAME_OPERATOR_IN = "operator_in";

    @SerializedName(SERIALIZED_NAME_OPERATOR_IN)
    private List<String> operatorIn = null;

    public static final String SERIALIZED_NAME_OPERATOR_LT = "operator_lt";

    @SerializedName(SERIALIZED_NAME_OPERATOR_LT)
    private String operatorLt;

    public static final String SERIALIZED_NAME_OPERATOR_LTE = "operator_lte";

    @SerializedName(SERIALIZED_NAME_OPERATOR_LTE)
    private String operatorLte;

    public static final String SERIALIZED_NAME_OPERATOR_NOT = "operator_not";

    @SerializedName(SERIALIZED_NAME_OPERATOR_NOT)
    private String operatorNot;

    public static final String SERIALIZED_NAME_OPERATOR_NOT_CONTAINS = "operator_not_contains";

    @SerializedName(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS)
    private String operatorNotContains;

    public static final String SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH = "operator_not_ends_with";

    @SerializedName(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH)
    private String operatorNotEndsWith;

    public static final String SERIALIZED_NAME_OPERATOR_NOT_IN = "operator_not_in";

    @SerializedName(SERIALIZED_NAME_OPERATOR_NOT_IN)
    private List<String> operatorNotIn = null;

    public static final String SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH =
            "operator_not_starts_with";

    @SerializedName(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH)
    private String operatorNotStartsWith;

    public static final String SERIALIZED_NAME_OPERATOR_STARTS_WITH = "operator_starts_with";

    @SerializedName(SERIALIZED_NAME_OPERATOR_STARTS_WITH)
    private String operatorStartsWith;

    public static final String SERIALIZED_NAME_SOLUTION = "solution";

    @SerializedName(SERIALIZED_NAME_SOLUTION)
    private String solution;

    public static final String SERIALIZED_NAME_SOLUTION_CONTAINS = "solution_contains";

    @SerializedName(SERIALIZED_NAME_SOLUTION_CONTAINS)
    private String solutionContains;

    public static final String SERIALIZED_NAME_SOLUTION_ENDS_WITH = "solution_ends_with";

    @SerializedName(SERIALIZED_NAME_SOLUTION_ENDS_WITH)
    private String solutionEndsWith;

    public static final String SERIALIZED_NAME_SOLUTION_GT = "solution_gt";

    @SerializedName(SERIALIZED_NAME_SOLUTION_GT)
    private String solutionGt;

    public static final String SERIALIZED_NAME_SOLUTION_GTE = "solution_gte";

    @SerializedName(SERIALIZED_NAME_SOLUTION_GTE)
    private String solutionGte;

    public static final String SERIALIZED_NAME_SOLUTION_IN = "solution_in";

    @SerializedName(SERIALIZED_NAME_SOLUTION_IN)
    private List<String> solutionIn = null;

    public static final String SERIALIZED_NAME_SOLUTION_LT = "solution_lt";

    @SerializedName(SERIALIZED_NAME_SOLUTION_LT)
    private String solutionLt;

    public static final String SERIALIZED_NAME_SOLUTION_LTE = "solution_lte";

    @SerializedName(SERIALIZED_NAME_SOLUTION_LTE)
    private String solutionLte;

    public static final String SERIALIZED_NAME_SOLUTION_NOT = "solution_not";

    @SerializedName(SERIALIZED_NAME_SOLUTION_NOT)
    private String solutionNot;

    public static final String SERIALIZED_NAME_SOLUTION_NOT_CONTAINS = "solution_not_contains";

    @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS)
    private String solutionNotContains;

    public static final String SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH = "solution_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH)
    private String solutionNotEndsWith;

    public static final String SERIALIZED_NAME_SOLUTION_NOT_IN = "solution_not_in";

    @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_IN)
    private List<String> solutionNotIn = null;

    public static final String SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH =
            "solution_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH)
    private String solutionNotStartsWith;

    public static final String SERIALIZED_NAME_SOLUTION_STARTS_WITH = "solution_starts_with";

    @SerializedName(SERIALIZED_NAME_SOLUTION_STARTS_WITH)
    private String solutionStartsWith;

    public static final String SERIALIZED_NAME_UNIT = "unit";

    @SerializedName(SERIALIZED_NAME_UNIT)
    private AlertRuleUnit unit;

    public static final String SERIALIZED_NAME_UNIT_IN = "unit_in";

    @SerializedName(SERIALIZED_NAME_UNIT_IN)
    private List<AlertRuleUnit> unitIn = null;

    public static final String SERIALIZED_NAME_UNIT_NOT = "unit_not";

    @SerializedName(SERIALIZED_NAME_UNIT_NOT)
    private AlertRuleUnit unitNot;

    public static final String SERIALIZED_NAME_UNIT_NOT_IN = "unit_not_in";

    @SerializedName(SERIALIZED_NAME_UNIT_NOT_IN)
    private List<AlertRuleUnit> unitNotIn = null;

    public GlobalAlertRuleWhereInput() {}

    public GlobalAlertRuleWhereInput AND(List<GlobalAlertRuleWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public GlobalAlertRuleWhereInput addANDItem(GlobalAlertRuleWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<GlobalAlertRuleWhereInput>();
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
    public List<GlobalAlertRuleWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<GlobalAlertRuleWhereInput> AND) {
        this.AND = AND;
    }

    public GlobalAlertRuleWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public GlobalAlertRuleWhereInput AND_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput NOT(List<GlobalAlertRuleWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public GlobalAlertRuleWhereInput addNOTItem(GlobalAlertRuleWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<GlobalAlertRuleWhereInput>();
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
    public List<GlobalAlertRuleWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<GlobalAlertRuleWhereInput> NOT) {
        this.NOT = NOT;
    }

    public GlobalAlertRuleWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public GlobalAlertRuleWhereInput NOT_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput OR(List<GlobalAlertRuleWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public GlobalAlertRuleWhereInput addORItem(GlobalAlertRuleWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<GlobalAlertRuleWhereInput>();
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
    public List<GlobalAlertRuleWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<GlobalAlertRuleWhereInput> OR) {
        this.OR = OR;
    }

    public GlobalAlertRuleWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public GlobalAlertRuleWhereInput OR_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput alertRulesEvery(AlertRuleWhereInput alertRulesEvery) {

        this.alertRulesEvery = alertRulesEvery;
        return this;
    }

    /**
     * Get alertRulesEvery
     *
     * @return alertRulesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleWhereInput getAlertRulesEvery() {
        return alertRulesEvery;
    }

    public void setAlertRulesEvery(AlertRuleWhereInput alertRulesEvery) {
        this.alertRulesEvery = alertRulesEvery;
    }

    public GlobalAlertRuleWhereInput alertRulesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_EVERY);
        return this;
    }

    public GlobalAlertRuleWhereInput alertRulesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_EVERY);
        return this;
    }

    public void setAlertRulesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_EVERY);
        }
    }

    public boolean getAlertRulesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALERT_RULES_EVERY);
    }

    public GlobalAlertRuleWhereInput alertRulesNone(AlertRuleWhereInput alertRulesNone) {

        this.alertRulesNone = alertRulesNone;
        return this;
    }

    /**
     * Get alertRulesNone
     *
     * @return alertRulesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleWhereInput getAlertRulesNone() {
        return alertRulesNone;
    }

    public void setAlertRulesNone(AlertRuleWhereInput alertRulesNone) {
        this.alertRulesNone = alertRulesNone;
    }

    public GlobalAlertRuleWhereInput alertRulesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_NONE);
        return this;
    }

    public GlobalAlertRuleWhereInput alertRulesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_NONE);
        return this;
    }

    public void setAlertRulesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_NONE);
        }
    }

    public boolean getAlertRulesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALERT_RULES_NONE);
    }

    public GlobalAlertRuleWhereInput alertRulesSome(AlertRuleWhereInput alertRulesSome) {

        this.alertRulesSome = alertRulesSome;
        return this;
    }

    /**
     * Get alertRulesSome
     *
     * @return alertRulesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleWhereInput getAlertRulesSome() {
        return alertRulesSome;
    }

    public void setAlertRulesSome(AlertRuleWhereInput alertRulesSome) {
        this.alertRulesSome = alertRulesSome;
    }

    public GlobalAlertRuleWhereInput alertRulesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_SOME);
        return this;
    }

    public GlobalAlertRuleWhereInput alertRulesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_SOME);
        return this;
    }

    public void setAlertRulesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES_SOME);
        }
    }

    public boolean getAlertRulesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALERT_RULES_SOME);
    }

    public GlobalAlertRuleWhereInput _boolean(Boolean _boolean) {

        this._boolean = _boolean;
        return this;
    }

    /**
     * Get _boolean
     *
     * @return _boolean
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getBoolean() {
        return _boolean;
    }

    public void setBoolean(Boolean _boolean) {
        this._boolean = _boolean;
    }

    public GlobalAlertRuleWhereInput _boolean_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOLEAN);
        return this;
    }

    public GlobalAlertRuleWhereInput _boolean_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN);
        return this;
    }

    public void setBoolean_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOLEAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN);
        }
    }

    public boolean getBoolean_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOLEAN);
    }

    public GlobalAlertRuleWhereInput booleanNot(Boolean booleanNot) {

        this.booleanNot = booleanNot;
        return this;
    }

    /**
     * Get booleanNot
     *
     * @return booleanNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getBooleanNot() {
        return booleanNot;
    }

    public void setBooleanNot(Boolean booleanNot) {
        this.booleanNot = booleanNot;
    }

    public GlobalAlertRuleWhereInput booleanNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOLEAN_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput booleanNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN_NOT);
        return this;
    }

    public void setBooleanNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOLEAN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN_NOT);
        }
    }

    public boolean getBooleanNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOLEAN_NOT);
    }

    public GlobalAlertRuleWhereInput cause(String cause) {

        this.cause = cause;
        return this;
    }

    /**
     * Get cause
     *
     * @return cause
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public GlobalAlertRuleWhereInput cause_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public GlobalAlertRuleWhereInput cause_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public void setCause_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        }
    }

    public boolean getCause_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE);
    }

    public GlobalAlertRuleWhereInput causeContains(String causeContains) {

        this.causeContains = causeContains;
        return this;
    }

    /**
     * Get causeContains
     *
     * @return causeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseContains() {
        return causeContains;
    }

    public void setCauseContains(String causeContains) {
        this.causeContains = causeContains;
    }

    public GlobalAlertRuleWhereInput causeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput causeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_CONTAINS);
        return this;
    }

    public void setCauseContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_CONTAINS);
        }
    }

    public boolean getCauseContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_CONTAINS);
    }

    public GlobalAlertRuleWhereInput causeEndsWith(String causeEndsWith) {

        this.causeEndsWith = causeEndsWith;
        return this;
    }

    /**
     * Get causeEndsWith
     *
     * @return causeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseEndsWith() {
        return causeEndsWith;
    }

    public void setCauseEndsWith(String causeEndsWith) {
        this.causeEndsWith = causeEndsWith;
    }

    public GlobalAlertRuleWhereInput causeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput causeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_ENDS_WITH);
        return this;
    }

    public void setCauseEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_ENDS_WITH);
        }
    }

    public boolean getCauseEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput causeGt(String causeGt) {

        this.causeGt = causeGt;
        return this;
    }

    /**
     * Get causeGt
     *
     * @return causeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseGt() {
        return causeGt;
    }

    public void setCauseGt(String causeGt) {
        this.causeGt = causeGt;
    }

    public GlobalAlertRuleWhereInput causeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput causeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_GT);
        return this;
    }

    public void setCauseGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_GT);
        }
    }

    public boolean getCauseGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_GT);
    }

    public GlobalAlertRuleWhereInput causeGte(String causeGte) {

        this.causeGte = causeGte;
        return this;
    }

    /**
     * Get causeGte
     *
     * @return causeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseGte() {
        return causeGte;
    }

    public void setCauseGte(String causeGte) {
        this.causeGte = causeGte;
    }

    public GlobalAlertRuleWhereInput causeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput causeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_GTE);
        return this;
    }

    public void setCauseGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_GTE);
        }
    }

    public boolean getCauseGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_GTE);
    }

    public GlobalAlertRuleWhereInput causeIn(List<String> causeIn) {

        this.causeIn = causeIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addCauseInItem(String causeInItem) {
        if (this.causeIn == null) {
            this.causeIn = new ArrayList<String>();
        }
        this.causeIn.add(causeInItem);
        return this;
    }

    /**
     * Get causeIn
     *
     * @return causeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCauseIn() {
        return causeIn;
    }

    public void setCauseIn(List<String> causeIn) {
        this.causeIn = causeIn;
    }

    public GlobalAlertRuleWhereInput causeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput causeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_IN);
        return this;
    }

    public void setCauseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_IN);
        }
    }

    public boolean getCauseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_IN);
    }

    public GlobalAlertRuleWhereInput causeLt(String causeLt) {

        this.causeLt = causeLt;
        return this;
    }

    /**
     * Get causeLt
     *
     * @return causeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseLt() {
        return causeLt;
    }

    public void setCauseLt(String causeLt) {
        this.causeLt = causeLt;
    }

    public GlobalAlertRuleWhereInput causeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput causeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_LT);
        return this;
    }

    public void setCauseLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_LT);
        }
    }

    public boolean getCauseLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_LT);
    }

    public GlobalAlertRuleWhereInput causeLte(String causeLte) {

        this.causeLte = causeLte;
        return this;
    }

    /**
     * Get causeLte
     *
     * @return causeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseLte() {
        return causeLte;
    }

    public void setCauseLte(String causeLte) {
        this.causeLte = causeLte;
    }

    public GlobalAlertRuleWhereInput causeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput causeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_LTE);
        return this;
    }

    public void setCauseLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_LTE);
        }
    }

    public boolean getCauseLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_LTE);
    }

    public GlobalAlertRuleWhereInput causeNot(String causeNot) {

        this.causeNot = causeNot;
        return this;
    }

    /**
     * Get causeNot
     *
     * @return causeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseNot() {
        return causeNot;
    }

    public void setCauseNot(String causeNot) {
        this.causeNot = causeNot;
    }

    public GlobalAlertRuleWhereInput causeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput causeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT);
        return this;
    }

    public void setCauseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT);
        }
    }

    public boolean getCauseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_NOT);
    }

    public GlobalAlertRuleWhereInput causeNotContains(String causeNotContains) {

        this.causeNotContains = causeNotContains;
        return this;
    }

    /**
     * Get causeNotContains
     *
     * @return causeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseNotContains() {
        return causeNotContains;
    }

    public void setCauseNotContains(String causeNotContains) {
        this.causeNotContains = causeNotContains;
    }

    public GlobalAlertRuleWhereInput causeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput causeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_CONTAINS);
        return this;
    }

    public void setCauseNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_CONTAINS);
        }
    }

    public boolean getCauseNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_NOT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput causeNotEndsWith(String causeNotEndsWith) {

        this.causeNotEndsWith = causeNotEndsWith;
        return this;
    }

    /**
     * Get causeNotEndsWith
     *
     * @return causeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseNotEndsWith() {
        return causeNotEndsWith;
    }

    public void setCauseNotEndsWith(String causeNotEndsWith) {
        this.causeNotEndsWith = causeNotEndsWith;
    }

    public GlobalAlertRuleWhereInput causeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput causeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH);
        return this;
    }

    public void setCauseNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH);
        }
    }

    public boolean getCauseNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput causeNotIn(List<String> causeNotIn) {

        this.causeNotIn = causeNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addCauseNotInItem(String causeNotInItem) {
        if (this.causeNotIn == null) {
            this.causeNotIn = new ArrayList<String>();
        }
        this.causeNotIn.add(causeNotInItem);
        return this;
    }

    /**
     * Get causeNotIn
     *
     * @return causeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCauseNotIn() {
        return causeNotIn;
    }

    public void setCauseNotIn(List<String> causeNotIn) {
        this.causeNotIn = causeNotIn;
    }

    public GlobalAlertRuleWhereInput causeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput causeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_IN);
        return this;
    }

    public void setCauseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_IN);
        }
    }

    public boolean getCauseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_NOT_IN);
    }

    public GlobalAlertRuleWhereInput causeNotStartsWith(String causeNotStartsWith) {

        this.causeNotStartsWith = causeNotStartsWith;
        return this;
    }

    /**
     * Get causeNotStartsWith
     *
     * @return causeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseNotStartsWith() {
        return causeNotStartsWith;
    }

    public void setCauseNotStartsWith(String causeNotStartsWith) {
        this.causeNotStartsWith = causeNotStartsWith;
    }

    public GlobalAlertRuleWhereInput causeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput causeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH);
        return this;
    }

    public void setCauseNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH);
        }
    }

    public boolean getCauseNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput causeStartsWith(String causeStartsWith) {

        this.causeStartsWith = causeStartsWith;
        return this;
    }

    /**
     * Get causeStartsWith
     *
     * @return causeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCauseStartsWith() {
        return causeStartsWith;
    }

    public void setCauseStartsWith(String causeStartsWith) {
        this.causeStartsWith = causeStartsWith;
    }

    public GlobalAlertRuleWhereInput causeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput causeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE_STARTS_WITH);
        return this;
    }

    public void setCauseStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE_STARTS_WITH);
        }
    }

    public boolean getCauseStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public GlobalAlertRuleWhereInput disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public GlobalAlertRuleWhereInput disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public GlobalAlertRuleWhereInput disabledNot(Boolean disabledNot) {

        this.disabledNot = disabledNot;
        return this;
    }

    /**
     * Get disabledNot
     *
     * @return disabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabledNot() {
        return disabledNot;
    }

    public void setDisabledNot(Boolean disabledNot) {
        this.disabledNot = disabledNot;
    }

    public GlobalAlertRuleWhereInput disabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput disabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public void setDisabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        }
    }

    public boolean getDisabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED_NOT);
    }

    public GlobalAlertRuleWhereInput id(String id) {

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

    public GlobalAlertRuleWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public GlobalAlertRuleWhereInput id_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idContains(String idContains) {

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

    public GlobalAlertRuleWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput idContains_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idEndsWith(String idEndsWith) {

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

    public GlobalAlertRuleWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput idEndsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idGt(String idGt) {

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

    public GlobalAlertRuleWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput idGt_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idGte(String idGte) {

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

    public GlobalAlertRuleWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput idGte_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addIdInItem(String idInItem) {
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

    public GlobalAlertRuleWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput idIn_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idLt(String idLt) {

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

    public GlobalAlertRuleWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput idLt_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idLte(String idLte) {

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

    public GlobalAlertRuleWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput idLte_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idNot(String idNot) {

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

    public GlobalAlertRuleWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput idNot_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idNotContains(String idNotContains) {

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

    public GlobalAlertRuleWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput idNotContains_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public GlobalAlertRuleWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addIdNotInItem(String idNotInItem) {
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

    public GlobalAlertRuleWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput idNotIn_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public GlobalAlertRuleWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput idStartsWith(String idStartsWith) {

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

    public GlobalAlertRuleWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput idStartsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput impact(String impact) {

        this.impact = impact;
        return this;
    }

    /**
     * Get impact
     *
     * @return impact
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public GlobalAlertRuleWhereInput impact_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public GlobalAlertRuleWhereInput impact_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public void setImpact_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        }
    }

    public boolean getImpact_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT);
    }

    public GlobalAlertRuleWhereInput impactContains(String impactContains) {

        this.impactContains = impactContains;
        return this;
    }

    /**
     * Get impactContains
     *
     * @return impactContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactContains() {
        return impactContains;
    }

    public void setImpactContains(String impactContains) {
        this.impactContains = impactContains;
    }

    public GlobalAlertRuleWhereInput impactContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput impactContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_CONTAINS);
        return this;
    }

    public void setImpactContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_CONTAINS);
        }
    }

    public boolean getImpactContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput impactEndsWith(String impactEndsWith) {

        this.impactEndsWith = impactEndsWith;
        return this;
    }

    /**
     * Get impactEndsWith
     *
     * @return impactEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactEndsWith() {
        return impactEndsWith;
    }

    public void setImpactEndsWith(String impactEndsWith) {
        this.impactEndsWith = impactEndsWith;
    }

    public GlobalAlertRuleWhereInput impactEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput impactEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_ENDS_WITH);
        return this;
    }

    public void setImpactEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_ENDS_WITH);
        }
    }

    public boolean getImpactEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput impactGt(String impactGt) {

        this.impactGt = impactGt;
        return this;
    }

    /**
     * Get impactGt
     *
     * @return impactGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactGt() {
        return impactGt;
    }

    public void setImpactGt(String impactGt) {
        this.impactGt = impactGt;
    }

    public GlobalAlertRuleWhereInput impactGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput impactGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_GT);
        return this;
    }

    public void setImpactGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_GT);
        }
    }

    public boolean getImpactGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_GT);
    }

    public GlobalAlertRuleWhereInput impactGte(String impactGte) {

        this.impactGte = impactGte;
        return this;
    }

    /**
     * Get impactGte
     *
     * @return impactGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactGte() {
        return impactGte;
    }

    public void setImpactGte(String impactGte) {
        this.impactGte = impactGte;
    }

    public GlobalAlertRuleWhereInput impactGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput impactGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_GTE);
        return this;
    }

    public void setImpactGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_GTE);
        }
    }

    public boolean getImpactGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_GTE);
    }

    public GlobalAlertRuleWhereInput impactIn(List<String> impactIn) {

        this.impactIn = impactIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addImpactInItem(String impactInItem) {
        if (this.impactIn == null) {
            this.impactIn = new ArrayList<String>();
        }
        this.impactIn.add(impactInItem);
        return this;
    }

    /**
     * Get impactIn
     *
     * @return impactIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getImpactIn() {
        return impactIn;
    }

    public void setImpactIn(List<String> impactIn) {
        this.impactIn = impactIn;
    }

    public GlobalAlertRuleWhereInput impactIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput impactIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_IN);
        return this;
    }

    public void setImpactIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_IN);
        }
    }

    public boolean getImpactIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_IN);
    }

    public GlobalAlertRuleWhereInput impactLt(String impactLt) {

        this.impactLt = impactLt;
        return this;
    }

    /**
     * Get impactLt
     *
     * @return impactLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactLt() {
        return impactLt;
    }

    public void setImpactLt(String impactLt) {
        this.impactLt = impactLt;
    }

    public GlobalAlertRuleWhereInput impactLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput impactLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_LT);
        return this;
    }

    public void setImpactLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_LT);
        }
    }

    public boolean getImpactLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_LT);
    }

    public GlobalAlertRuleWhereInput impactLte(String impactLte) {

        this.impactLte = impactLte;
        return this;
    }

    /**
     * Get impactLte
     *
     * @return impactLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactLte() {
        return impactLte;
    }

    public void setImpactLte(String impactLte) {
        this.impactLte = impactLte;
    }

    public GlobalAlertRuleWhereInput impactLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput impactLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_LTE);
        return this;
    }

    public void setImpactLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_LTE);
        }
    }

    public boolean getImpactLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_LTE);
    }

    public GlobalAlertRuleWhereInput impactNot(String impactNot) {

        this.impactNot = impactNot;
        return this;
    }

    /**
     * Get impactNot
     *
     * @return impactNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactNot() {
        return impactNot;
    }

    public void setImpactNot(String impactNot) {
        this.impactNot = impactNot;
    }

    public GlobalAlertRuleWhereInput impactNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput impactNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT);
        return this;
    }

    public void setImpactNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT);
        }
    }

    public boolean getImpactNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_NOT);
    }

    public GlobalAlertRuleWhereInput impactNotContains(String impactNotContains) {

        this.impactNotContains = impactNotContains;
        return this;
    }

    /**
     * Get impactNotContains
     *
     * @return impactNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactNotContains() {
        return impactNotContains;
    }

    public void setImpactNotContains(String impactNotContains) {
        this.impactNotContains = impactNotContains;
    }

    public GlobalAlertRuleWhereInput impactNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput impactNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_CONTAINS);
        return this;
    }

    public void setImpactNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_CONTAINS);
        }
    }

    public boolean getImpactNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_NOT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput impactNotEndsWith(String impactNotEndsWith) {

        this.impactNotEndsWith = impactNotEndsWith;
        return this;
    }

    /**
     * Get impactNotEndsWith
     *
     * @return impactNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactNotEndsWith() {
        return impactNotEndsWith;
    }

    public void setImpactNotEndsWith(String impactNotEndsWith) {
        this.impactNotEndsWith = impactNotEndsWith;
    }

    public GlobalAlertRuleWhereInput impactNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput impactNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH);
        return this;
    }

    public void setImpactNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH);
        }
    }

    public boolean getImpactNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput impactNotIn(List<String> impactNotIn) {

        this.impactNotIn = impactNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addImpactNotInItem(String impactNotInItem) {
        if (this.impactNotIn == null) {
            this.impactNotIn = new ArrayList<String>();
        }
        this.impactNotIn.add(impactNotInItem);
        return this;
    }

    /**
     * Get impactNotIn
     *
     * @return impactNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getImpactNotIn() {
        return impactNotIn;
    }

    public void setImpactNotIn(List<String> impactNotIn) {
        this.impactNotIn = impactNotIn;
    }

    public GlobalAlertRuleWhereInput impactNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput impactNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_IN);
        return this;
    }

    public void setImpactNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_IN);
        }
    }

    public boolean getImpactNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_NOT_IN);
    }

    public GlobalAlertRuleWhereInput impactNotStartsWith(String impactNotStartsWith) {

        this.impactNotStartsWith = impactNotStartsWith;
        return this;
    }

    /**
     * Get impactNotStartsWith
     *
     * @return impactNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactNotStartsWith() {
        return impactNotStartsWith;
    }

    public void setImpactNotStartsWith(String impactNotStartsWith) {
        this.impactNotStartsWith = impactNotStartsWith;
    }

    public GlobalAlertRuleWhereInput impactNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput impactNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH);
        return this;
    }

    public void setImpactNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH);
        }
    }

    public boolean getImpactNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput impactStartsWith(String impactStartsWith) {

        this.impactStartsWith = impactStartsWith;
        return this;
    }

    /**
     * Get impactStartsWith
     *
     * @return impactStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImpactStartsWith() {
        return impactStartsWith;
    }

    public void setImpactStartsWith(String impactStartsWith) {
        this.impactStartsWith = impactStartsWith;
    }

    public GlobalAlertRuleWhereInput impactStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput impactStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT_STARTS_WITH);
        return this;
    }

    public void setImpactStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT_STARTS_WITH);
        }
    }

    public boolean getImpactStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GlobalAlertRuleWhereInput message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public GlobalAlertRuleWhereInput message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public GlobalAlertRuleWhereInput messageContains(String messageContains) {

        this.messageContains = messageContains;
        return this;
    }

    /**
     * Get messageContains
     *
     * @return messageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageContains() {
        return messageContains;
    }

    public void setMessageContains(String messageContains) {
        this.messageContains = messageContains;
    }

    public GlobalAlertRuleWhereInput messageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput messageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_CONTAINS);
        return this;
    }

    public void setMessageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_CONTAINS);
        }
    }

    public boolean getMessageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_CONTAINS);
    }

    public GlobalAlertRuleWhereInput messageEndsWith(String messageEndsWith) {

        this.messageEndsWith = messageEndsWith;
        return this;
    }

    /**
     * Get messageEndsWith
     *
     * @return messageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageEndsWith() {
        return messageEndsWith;
    }

    public void setMessageEndsWith(String messageEndsWith) {
        this.messageEndsWith = messageEndsWith;
    }

    public GlobalAlertRuleWhereInput messageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput messageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        return this;
    }

    public void setMessageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        }
    }

    public boolean getMessageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput messageGt(String messageGt) {

        this.messageGt = messageGt;
        return this;
    }

    /**
     * Get messageGt
     *
     * @return messageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageGt() {
        return messageGt;
    }

    public void setMessageGt(String messageGt) {
        this.messageGt = messageGt;
    }

    public GlobalAlertRuleWhereInput messageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput messageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GT);
        return this;
    }

    public void setMessageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GT);
        }
    }

    public boolean getMessageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_GT);
    }

    public GlobalAlertRuleWhereInput messageGte(String messageGte) {

        this.messageGte = messageGte;
        return this;
    }

    /**
     * Get messageGte
     *
     * @return messageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageGte() {
        return messageGte;
    }

    public void setMessageGte(String messageGte) {
        this.messageGte = messageGte;
    }

    public GlobalAlertRuleWhereInput messageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput messageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GTE);
        return this;
    }

    public void setMessageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GTE);
        }
    }

    public boolean getMessageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_GTE);
    }

    public GlobalAlertRuleWhereInput messageIn(List<String> messageIn) {

        this.messageIn = messageIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addMessageInItem(String messageInItem) {
        if (this.messageIn == null) {
            this.messageIn = new ArrayList<String>();
        }
        this.messageIn.add(messageInItem);
        return this;
    }

    /**
     * Get messageIn
     *
     * @return messageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMessageIn() {
        return messageIn;
    }

    public void setMessageIn(List<String> messageIn) {
        this.messageIn = messageIn;
    }

    public GlobalAlertRuleWhereInput messageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput messageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_IN);
        return this;
    }

    public void setMessageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_IN);
        }
    }

    public boolean getMessageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_IN);
    }

    public GlobalAlertRuleWhereInput messageLt(String messageLt) {

        this.messageLt = messageLt;
        return this;
    }

    /**
     * Get messageLt
     *
     * @return messageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageLt() {
        return messageLt;
    }

    public void setMessageLt(String messageLt) {
        this.messageLt = messageLt;
    }

    public GlobalAlertRuleWhereInput messageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput messageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LT);
        return this;
    }

    public void setMessageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LT);
        }
    }

    public boolean getMessageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_LT);
    }

    public GlobalAlertRuleWhereInput messageLte(String messageLte) {

        this.messageLte = messageLte;
        return this;
    }

    /**
     * Get messageLte
     *
     * @return messageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageLte() {
        return messageLte;
    }

    public void setMessageLte(String messageLte) {
        this.messageLte = messageLte;
    }

    public GlobalAlertRuleWhereInput messageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput messageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LTE);
        return this;
    }

    public void setMessageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LTE);
        }
    }

    public boolean getMessageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_LTE);
    }

    public GlobalAlertRuleWhereInput messageNot(String messageNot) {

        this.messageNot = messageNot;
        return this;
    }

    /**
     * Get messageNot
     *
     * @return messageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNot() {
        return messageNot;
    }

    public void setMessageNot(String messageNot) {
        this.messageNot = messageNot;
    }

    public GlobalAlertRuleWhereInput messageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput messageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT);
        return this;
    }

    public void setMessageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT);
        }
    }

    public boolean getMessageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT);
    }

    public GlobalAlertRuleWhereInput messageNotContains(String messageNotContains) {

        this.messageNotContains = messageNotContains;
        return this;
    }

    /**
     * Get messageNotContains
     *
     * @return messageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotContains() {
        return messageNotContains;
    }

    public void setMessageNotContains(String messageNotContains) {
        this.messageNotContains = messageNotContains;
    }

    public GlobalAlertRuleWhereInput messageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput messageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public void setMessageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        }
    }

    public boolean getMessageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput messageNotEndsWith(String messageNotEndsWith) {

        this.messageNotEndsWith = messageNotEndsWith;
        return this;
    }

    /**
     * Get messageNotEndsWith
     *
     * @return messageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotEndsWith() {
        return messageNotEndsWith;
    }

    public void setMessageNotEndsWith(String messageNotEndsWith) {
        this.messageNotEndsWith = messageNotEndsWith;
    }

    public GlobalAlertRuleWhereInput messageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput messageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setMessageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getMessageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput messageNotIn(List<String> messageNotIn) {

        this.messageNotIn = messageNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addMessageNotInItem(String messageNotInItem) {
        if (this.messageNotIn == null) {
            this.messageNotIn = new ArrayList<String>();
        }
        this.messageNotIn.add(messageNotInItem);
        return this;
    }

    /**
     * Get messageNotIn
     *
     * @return messageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMessageNotIn() {
        return messageNotIn;
    }

    public void setMessageNotIn(List<String> messageNotIn) {
        this.messageNotIn = messageNotIn;
    }

    public GlobalAlertRuleWhereInput messageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput messageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_IN);
        return this;
    }

    public void setMessageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_IN);
        }
    }

    public boolean getMessageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_IN);
    }

    public GlobalAlertRuleWhereInput messageNotStartsWith(String messageNotStartsWith) {

        this.messageNotStartsWith = messageNotStartsWith;
        return this;
    }

    /**
     * Get messageNotStartsWith
     *
     * @return messageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotStartsWith() {
        return messageNotStartsWith;
    }

    public void setMessageNotStartsWith(String messageNotStartsWith) {
        this.messageNotStartsWith = messageNotStartsWith;
    }

    public GlobalAlertRuleWhereInput messageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput messageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setMessageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getMessageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput messageStartsWith(String messageStartsWith) {

        this.messageStartsWith = messageStartsWith;
        return this;
    }

    /**
     * Get messageStartsWith
     *
     * @return messageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageStartsWith() {
        return messageStartsWith;
    }

    public void setMessageStartsWith(String messageStartsWith) {
        this.messageStartsWith = messageStartsWith;
    }

    public GlobalAlertRuleWhereInput messageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput messageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        return this;
    }

    public void setMessageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        }
    }

    public boolean getMessageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput name(String name) {

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

    public GlobalAlertRuleWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public GlobalAlertRuleWhereInput name_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameContains(String nameContains) {

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

    public GlobalAlertRuleWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput nameContains_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameEndsWith(String nameEndsWith) {

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

    public GlobalAlertRuleWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameGt(String nameGt) {

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

    public GlobalAlertRuleWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput nameGt_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameGte(String nameGte) {

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

    public GlobalAlertRuleWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput nameGte_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addNameInItem(String nameInItem) {
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

    public GlobalAlertRuleWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput nameIn_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameLt(String nameLt) {

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

    public GlobalAlertRuleWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput nameLt_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameLte(String nameLte) {

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

    public GlobalAlertRuleWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput nameLte_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameNot(String nameNot) {

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

    public GlobalAlertRuleWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput nameNot_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameNotContains(String nameNotContains) {

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

    public GlobalAlertRuleWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput nameNotContains_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public GlobalAlertRuleWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addNameNotInItem(String nameNotInItem) {
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

    public GlobalAlertRuleWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput nameNotIn_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public GlobalAlertRuleWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput nameStartsWith(String nameStartsWith) {

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

    public GlobalAlertRuleWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public GlobalAlertRuleWhereInput _object(AlertRuleObject _object) {

        this._object = _object;
        return this;
    }

    /**
     * Get _object
     *
     * @return _object
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleObject getObject() {
        return _object;
    }

    public void setObject(AlertRuleObject _object) {
        this._object = _object;
    }

    public GlobalAlertRuleWhereInput _object_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT);
        return this;
    }

    public GlobalAlertRuleWhereInput _object_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT);
        return this;
    }

    public void setObject_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT);
        }
    }

    public boolean getObject_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT);
    }

    public GlobalAlertRuleWhereInput objectIn(List<AlertRuleObject> objectIn) {

        this.objectIn = objectIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addObjectInItem(AlertRuleObject objectInItem) {
        if (this.objectIn == null) {
            this.objectIn = new ArrayList<AlertRuleObject>();
        }
        this.objectIn.add(objectInItem);
        return this;
    }

    /**
     * Get objectIn
     *
     * @return objectIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<AlertRuleObject> getObjectIn() {
        return objectIn;
    }

    public void setObjectIn(List<AlertRuleObject> objectIn) {
        this.objectIn = objectIn;
    }

    public GlobalAlertRuleWhereInput objectIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput objectIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_IN);
        return this;
    }

    public void setObjectIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_IN);
        }
    }

    public boolean getObjectIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_IN);
    }

    public GlobalAlertRuleWhereInput objectNot(AlertRuleObject objectNot) {

        this.objectNot = objectNot;
        return this;
    }

    /**
     * Get objectNot
     *
     * @return objectNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleObject getObjectNot() {
        return objectNot;
    }

    public void setObjectNot(AlertRuleObject objectNot) {
        this.objectNot = objectNot;
    }

    public GlobalAlertRuleWhereInput objectNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput objectNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NOT);
        return this;
    }

    public void setObjectNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NOT);
        }
    }

    public boolean getObjectNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NOT);
    }

    public GlobalAlertRuleWhereInput objectNotIn(List<AlertRuleObject> objectNotIn) {

        this.objectNotIn = objectNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addObjectNotInItem(AlertRuleObject objectNotInItem) {
        if (this.objectNotIn == null) {
            this.objectNotIn = new ArrayList<AlertRuleObject>();
        }
        this.objectNotIn.add(objectNotInItem);
        return this;
    }

    /**
     * Get objectNotIn
     *
     * @return objectNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<AlertRuleObject> getObjectNotIn() {
        return objectNotIn;
    }

    public void setObjectNotIn(List<AlertRuleObject> objectNotIn) {
        this.objectNotIn = objectNotIn;
    }

    public GlobalAlertRuleWhereInput objectNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput objectNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NOT_IN);
        return this;
    }

    public void setObjectNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NOT_IN);
        }
    }

    public boolean getObjectNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NOT_IN);
    }

    public GlobalAlertRuleWhereInput operator(String operator) {

        this.operator = operator;
        return this;
    }

    /**
     * Get operator
     *
     * @return operator
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public GlobalAlertRuleWhereInput operator_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR);
        return this;
    }

    public GlobalAlertRuleWhereInput operator_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR);
        return this;
    }

    public void setOperator_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR);
        }
    }

    public boolean getOperator_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR);
    }

    public GlobalAlertRuleWhereInput operatorContains(String operatorContains) {

        this.operatorContains = operatorContains;
        return this;
    }

    /**
     * Get operatorContains
     *
     * @return operatorContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorContains() {
        return operatorContains;
    }

    public void setOperatorContains(String operatorContains) {
        this.operatorContains = operatorContains;
    }

    public GlobalAlertRuleWhereInput operatorContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_CONTAINS);
        return this;
    }

    public void setOperatorContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_CONTAINS);
        }
    }

    public boolean getOperatorContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_CONTAINS);
    }

    public GlobalAlertRuleWhereInput operatorEndsWith(String operatorEndsWith) {

        this.operatorEndsWith = operatorEndsWith;
        return this;
    }

    /**
     * Get operatorEndsWith
     *
     * @return operatorEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorEndsWith() {
        return operatorEndsWith;
    }

    public void setOperatorEndsWith(String operatorEndsWith) {
        this.operatorEndsWith = operatorEndsWith;
    }

    public GlobalAlertRuleWhereInput operatorEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_ENDS_WITH);
        return this;
    }

    public void setOperatorEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_ENDS_WITH);
        }
    }

    public boolean getOperatorEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput operatorGt(String operatorGt) {

        this.operatorGt = operatorGt;
        return this;
    }

    /**
     * Get operatorGt
     *
     * @return operatorGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorGt() {
        return operatorGt;
    }

    public void setOperatorGt(String operatorGt) {
        this.operatorGt = operatorGt;
    }

    public GlobalAlertRuleWhereInput operatorGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_GT);
        return this;
    }

    public void setOperatorGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_GT);
        }
    }

    public boolean getOperatorGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_GT);
    }

    public GlobalAlertRuleWhereInput operatorGte(String operatorGte) {

        this.operatorGte = operatorGte;
        return this;
    }

    /**
     * Get operatorGte
     *
     * @return operatorGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorGte() {
        return operatorGte;
    }

    public void setOperatorGte(String operatorGte) {
        this.operatorGte = operatorGte;
    }

    public GlobalAlertRuleWhereInput operatorGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_GTE);
        return this;
    }

    public void setOperatorGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_GTE);
        }
    }

    public boolean getOperatorGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_GTE);
    }

    public GlobalAlertRuleWhereInput operatorIn(List<String> operatorIn) {

        this.operatorIn = operatorIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addOperatorInItem(String operatorInItem) {
        if (this.operatorIn == null) {
            this.operatorIn = new ArrayList<String>();
        }
        this.operatorIn.add(operatorInItem);
        return this;
    }

    /**
     * Get operatorIn
     *
     * @return operatorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOperatorIn() {
        return operatorIn;
    }

    public void setOperatorIn(List<String> operatorIn) {
        this.operatorIn = operatorIn;
    }

    public GlobalAlertRuleWhereInput operatorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_IN);
        return this;
    }

    public void setOperatorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_IN);
        }
    }

    public boolean getOperatorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_IN);
    }

    public GlobalAlertRuleWhereInput operatorLt(String operatorLt) {

        this.operatorLt = operatorLt;
        return this;
    }

    /**
     * Get operatorLt
     *
     * @return operatorLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorLt() {
        return operatorLt;
    }

    public void setOperatorLt(String operatorLt) {
        this.operatorLt = operatorLt;
    }

    public GlobalAlertRuleWhereInput operatorLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_LT);
        return this;
    }

    public void setOperatorLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_LT);
        }
    }

    public boolean getOperatorLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_LT);
    }

    public GlobalAlertRuleWhereInput operatorLte(String operatorLte) {

        this.operatorLte = operatorLte;
        return this;
    }

    /**
     * Get operatorLte
     *
     * @return operatorLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorLte() {
        return operatorLte;
    }

    public void setOperatorLte(String operatorLte) {
        this.operatorLte = operatorLte;
    }

    public GlobalAlertRuleWhereInput operatorLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_LTE);
        return this;
    }

    public void setOperatorLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_LTE);
        }
    }

    public boolean getOperatorLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_LTE);
    }

    public GlobalAlertRuleWhereInput operatorNot(String operatorNot) {

        this.operatorNot = operatorNot;
        return this;
    }

    /**
     * Get operatorNot
     *
     * @return operatorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorNot() {
        return operatorNot;
    }

    public void setOperatorNot(String operatorNot) {
        this.operatorNot = operatorNot;
    }

    public GlobalAlertRuleWhereInput operatorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT);
        return this;
    }

    public void setOperatorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT);
        }
    }

    public boolean getOperatorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_NOT);
    }

    public GlobalAlertRuleWhereInput operatorNotContains(String operatorNotContains) {

        this.operatorNotContains = operatorNotContains;
        return this;
    }

    /**
     * Get operatorNotContains
     *
     * @return operatorNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorNotContains() {
        return operatorNotContains;
    }

    public void setOperatorNotContains(String operatorNotContains) {
        this.operatorNotContains = operatorNotContains;
    }

    public GlobalAlertRuleWhereInput operatorNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS);
        return this;
    }

    public void setOperatorNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS);
        }
    }

    public boolean getOperatorNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_NOT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput operatorNotEndsWith(String operatorNotEndsWith) {

        this.operatorNotEndsWith = operatorNotEndsWith;
        return this;
    }

    /**
     * Get operatorNotEndsWith
     *
     * @return operatorNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorNotEndsWith() {
        return operatorNotEndsWith;
    }

    public void setOperatorNotEndsWith(String operatorNotEndsWith) {
        this.operatorNotEndsWith = operatorNotEndsWith;
    }

    public GlobalAlertRuleWhereInput operatorNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH);
        return this;
    }

    public void setOperatorNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH);
        }
    }

    public boolean getOperatorNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_NOT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput operatorNotIn(List<String> operatorNotIn) {

        this.operatorNotIn = operatorNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addOperatorNotInItem(String operatorNotInItem) {
        if (this.operatorNotIn == null) {
            this.operatorNotIn = new ArrayList<String>();
        }
        this.operatorNotIn.add(operatorNotInItem);
        return this;
    }

    /**
     * Get operatorNotIn
     *
     * @return operatorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOperatorNotIn() {
        return operatorNotIn;
    }

    public void setOperatorNotIn(List<String> operatorNotIn) {
        this.operatorNotIn = operatorNotIn;
    }

    public GlobalAlertRuleWhereInput operatorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_IN);
        return this;
    }

    public void setOperatorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_IN);
        }
    }

    public boolean getOperatorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_NOT_IN);
    }

    public GlobalAlertRuleWhereInput operatorNotStartsWith(String operatorNotStartsWith) {

        this.operatorNotStartsWith = operatorNotStartsWith;
        return this;
    }

    /**
     * Get operatorNotStartsWith
     *
     * @return operatorNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorNotStartsWith() {
        return operatorNotStartsWith;
    }

    public void setOperatorNotStartsWith(String operatorNotStartsWith) {
        this.operatorNotStartsWith = operatorNotStartsWith;
    }

    public GlobalAlertRuleWhereInput operatorNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH);
        return this;
    }

    public void setOperatorNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH);
        }
    }

    public boolean getOperatorNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_NOT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput operatorStartsWith(String operatorStartsWith) {

        this.operatorStartsWith = operatorStartsWith;
        return this;
    }

    /**
     * Get operatorStartsWith
     *
     * @return operatorStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOperatorStartsWith() {
        return operatorStartsWith;
    }

    public void setOperatorStartsWith(String operatorStartsWith) {
        this.operatorStartsWith = operatorStartsWith;
    }

    public GlobalAlertRuleWhereInput operatorStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput operatorStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_STARTS_WITH);
        return this;
    }

    public void setOperatorStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR_STARTS_WITH);
        }
    }

    public boolean getOperatorStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput solution(String solution) {

        this.solution = solution;
        return this;
    }

    /**
     * Get solution
     *
     * @return solution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public GlobalAlertRuleWhereInput solution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public GlobalAlertRuleWhereInput solution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public void setSolution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        }
    }

    public boolean getSolution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION);
    }

    public GlobalAlertRuleWhereInput solutionContains(String solutionContains) {

        this.solutionContains = solutionContains;
        return this;
    }

    /**
     * Get solutionContains
     *
     * @return solutionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionContains() {
        return solutionContains;
    }

    public void setSolutionContains(String solutionContains) {
        this.solutionContains = solutionContains;
    }

    public GlobalAlertRuleWhereInput solutionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_CONTAINS);
        return this;
    }

    public void setSolutionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_CONTAINS);
        }
    }

    public boolean getSolutionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_CONTAINS);
    }

    public GlobalAlertRuleWhereInput solutionEndsWith(String solutionEndsWith) {

        this.solutionEndsWith = solutionEndsWith;
        return this;
    }

    /**
     * Get solutionEndsWith
     *
     * @return solutionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionEndsWith() {
        return solutionEndsWith;
    }

    public void setSolutionEndsWith(String solutionEndsWith) {
        this.solutionEndsWith = solutionEndsWith;
    }

    public GlobalAlertRuleWhereInput solutionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_ENDS_WITH);
        return this;
    }

    public void setSolutionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_ENDS_WITH);
        }
    }

    public boolean getSolutionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput solutionGt(String solutionGt) {

        this.solutionGt = solutionGt;
        return this;
    }

    /**
     * Get solutionGt
     *
     * @return solutionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionGt() {
        return solutionGt;
    }

    public void setSolutionGt(String solutionGt) {
        this.solutionGt = solutionGt;
    }

    public GlobalAlertRuleWhereInput solutionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_GT);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_GT);
        return this;
    }

    public void setSolutionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_GT);
        }
    }

    public boolean getSolutionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_GT);
    }

    public GlobalAlertRuleWhereInput solutionGte(String solutionGte) {

        this.solutionGte = solutionGte;
        return this;
    }

    /**
     * Get solutionGte
     *
     * @return solutionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionGte() {
        return solutionGte;
    }

    public void setSolutionGte(String solutionGte) {
        this.solutionGte = solutionGte;
    }

    public GlobalAlertRuleWhereInput solutionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_GTE);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_GTE);
        return this;
    }

    public void setSolutionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_GTE);
        }
    }

    public boolean getSolutionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_GTE);
    }

    public GlobalAlertRuleWhereInput solutionIn(List<String> solutionIn) {

        this.solutionIn = solutionIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addSolutionInItem(String solutionInItem) {
        if (this.solutionIn == null) {
            this.solutionIn = new ArrayList<String>();
        }
        this.solutionIn.add(solutionInItem);
        return this;
    }

    /**
     * Get solutionIn
     *
     * @return solutionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSolutionIn() {
        return solutionIn;
    }

    public void setSolutionIn(List<String> solutionIn) {
        this.solutionIn = solutionIn;
    }

    public GlobalAlertRuleWhereInput solutionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_IN);
        return this;
    }

    public void setSolutionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_IN);
        }
    }

    public boolean getSolutionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_IN);
    }

    public GlobalAlertRuleWhereInput solutionLt(String solutionLt) {

        this.solutionLt = solutionLt;
        return this;
    }

    /**
     * Get solutionLt
     *
     * @return solutionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionLt() {
        return solutionLt;
    }

    public void setSolutionLt(String solutionLt) {
        this.solutionLt = solutionLt;
    }

    public GlobalAlertRuleWhereInput solutionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_LT);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_LT);
        return this;
    }

    public void setSolutionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_LT);
        }
    }

    public boolean getSolutionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_LT);
    }

    public GlobalAlertRuleWhereInput solutionLte(String solutionLte) {

        this.solutionLte = solutionLte;
        return this;
    }

    /**
     * Get solutionLte
     *
     * @return solutionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionLte() {
        return solutionLte;
    }

    public void setSolutionLte(String solutionLte) {
        this.solutionLte = solutionLte;
    }

    public GlobalAlertRuleWhereInput solutionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_LTE);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_LTE);
        return this;
    }

    public void setSolutionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_LTE);
        }
    }

    public boolean getSolutionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_LTE);
    }

    public GlobalAlertRuleWhereInput solutionNot(String solutionNot) {

        this.solutionNot = solutionNot;
        return this;
    }

    /**
     * Get solutionNot
     *
     * @return solutionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionNot() {
        return solutionNot;
    }

    public void setSolutionNot(String solutionNot) {
        this.solutionNot = solutionNot;
    }

    public GlobalAlertRuleWhereInput solutionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT);
        return this;
    }

    public void setSolutionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT);
        }
    }

    public boolean getSolutionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_NOT);
    }

    public GlobalAlertRuleWhereInput solutionNotContains(String solutionNotContains) {

        this.solutionNotContains = solutionNotContains;
        return this;
    }

    /**
     * Get solutionNotContains
     *
     * @return solutionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionNotContains() {
        return solutionNotContains;
    }

    public void setSolutionNotContains(String solutionNotContains) {
        this.solutionNotContains = solutionNotContains;
    }

    public GlobalAlertRuleWhereInput solutionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS);
        return this;
    }

    public void setSolutionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS);
        }
    }

    public boolean getSolutionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS);
    }

    public GlobalAlertRuleWhereInput solutionNotEndsWith(String solutionNotEndsWith) {

        this.solutionNotEndsWith = solutionNotEndsWith;
        return this;
    }

    /**
     * Get solutionNotEndsWith
     *
     * @return solutionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionNotEndsWith() {
        return solutionNotEndsWith;
    }

    public void setSolutionNotEndsWith(String solutionNotEndsWith) {
        this.solutionNotEndsWith = solutionNotEndsWith;
    }

    public GlobalAlertRuleWhereInput solutionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH);
        return this;
    }

    public void setSolutionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH);
        }
    }

    public boolean getSolutionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH);
    }

    public GlobalAlertRuleWhereInput solutionNotIn(List<String> solutionNotIn) {

        this.solutionNotIn = solutionNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addSolutionNotInItem(String solutionNotInItem) {
        if (this.solutionNotIn == null) {
            this.solutionNotIn = new ArrayList<String>();
        }
        this.solutionNotIn.add(solutionNotInItem);
        return this;
    }

    /**
     * Get solutionNotIn
     *
     * @return solutionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSolutionNotIn() {
        return solutionNotIn;
    }

    public void setSolutionNotIn(List<String> solutionNotIn) {
        this.solutionNotIn = solutionNotIn;
    }

    public GlobalAlertRuleWhereInput solutionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_IN);
        return this;
    }

    public void setSolutionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_IN);
        }
    }

    public boolean getSolutionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_NOT_IN);
    }

    public GlobalAlertRuleWhereInput solutionNotStartsWith(String solutionNotStartsWith) {

        this.solutionNotStartsWith = solutionNotStartsWith;
        return this;
    }

    /**
     * Get solutionNotStartsWith
     *
     * @return solutionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionNotStartsWith() {
        return solutionNotStartsWith;
    }

    public void setSolutionNotStartsWith(String solutionNotStartsWith) {
        this.solutionNotStartsWith = solutionNotStartsWith;
    }

    public GlobalAlertRuleWhereInput solutionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH);
        return this;
    }

    public void setSolutionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH);
        }
    }

    public boolean getSolutionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput solutionStartsWith(String solutionStartsWith) {

        this.solutionStartsWith = solutionStartsWith;
        return this;
    }

    /**
     * Get solutionStartsWith
     *
     * @return solutionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSolutionStartsWith() {
        return solutionStartsWith;
    }

    public void setSolutionStartsWith(String solutionStartsWith) {
        this.solutionStartsWith = solutionStartsWith;
    }

    public GlobalAlertRuleWhereInput solutionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION_STARTS_WITH);
        return this;
    }

    public GlobalAlertRuleWhereInput solutionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_STARTS_WITH);
        return this;
    }

    public void setSolutionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION_STARTS_WITH);
        }
    }

    public boolean getSolutionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION_STARTS_WITH);
    }

    public GlobalAlertRuleWhereInput unit(AlertRuleUnit unit) {

        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleUnit getUnit() {
        return unit;
    }

    public void setUnit(AlertRuleUnit unit) {
        this.unit = unit;
    }

    public GlobalAlertRuleWhereInput unit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIT);
        return this;
    }

    public GlobalAlertRuleWhereInput unit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIT);
        return this;
    }

    public void setUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIT);
        }
    }

    public boolean getUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIT);
    }

    public GlobalAlertRuleWhereInput unitIn(List<AlertRuleUnit> unitIn) {

        this.unitIn = unitIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addUnitInItem(AlertRuleUnit unitInItem) {
        if (this.unitIn == null) {
            this.unitIn = new ArrayList<AlertRuleUnit>();
        }
        this.unitIn.add(unitInItem);
        return this;
    }

    /**
     * Get unitIn
     *
     * @return unitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<AlertRuleUnit> getUnitIn() {
        return unitIn;
    }

    public void setUnitIn(List<AlertRuleUnit> unitIn) {
        this.unitIn = unitIn;
    }

    public GlobalAlertRuleWhereInput unitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput unitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIT_IN);
        return this;
    }

    public void setUnitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIT_IN);
        }
    }

    public boolean getUnitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIT_IN);
    }

    public GlobalAlertRuleWhereInput unitNot(AlertRuleUnit unitNot) {

        this.unitNot = unitNot;
        return this;
    }

    /**
     * Get unitNot
     *
     * @return unitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleUnit getUnitNot() {
        return unitNot;
    }

    public void setUnitNot(AlertRuleUnit unitNot) {
        this.unitNot = unitNot;
    }

    public GlobalAlertRuleWhereInput unitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIT_NOT);
        return this;
    }

    public GlobalAlertRuleWhereInput unitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIT_NOT);
        return this;
    }

    public void setUnitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIT_NOT);
        }
    }

    public boolean getUnitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIT_NOT);
    }

    public GlobalAlertRuleWhereInput unitNotIn(List<AlertRuleUnit> unitNotIn) {

        this.unitNotIn = unitNotIn;
        return this;
    }

    public GlobalAlertRuleWhereInput addUnitNotInItem(AlertRuleUnit unitNotInItem) {
        if (this.unitNotIn == null) {
            this.unitNotIn = new ArrayList<AlertRuleUnit>();
        }
        this.unitNotIn.add(unitNotInItem);
        return this;
    }

    /**
     * Get unitNotIn
     *
     * @return unitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<AlertRuleUnit> getUnitNotIn() {
        return unitNotIn;
    }

    public void setUnitNotIn(List<AlertRuleUnit> unitNotIn) {
        this.unitNotIn = unitNotIn;
    }

    public GlobalAlertRuleWhereInput unitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIT_NOT_IN);
        return this;
    }

    public GlobalAlertRuleWhereInput unitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIT_NOT_IN);
        return this;
    }

    public void setUnitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIT_NOT_IN);
        }
    }

    public boolean getUnitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIT_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAlertRuleWhereInput globalAlertRuleWhereInput = (GlobalAlertRuleWhereInput) o;
        return Objects.equals(this.AND, globalAlertRuleWhereInput.AND)
                && Objects.equals(this.NOT, globalAlertRuleWhereInput.NOT)
                && Objects.equals(this.OR, globalAlertRuleWhereInput.OR)
                && Objects.equals(this.alertRulesEvery, globalAlertRuleWhereInput.alertRulesEvery)
                && Objects.equals(this.alertRulesNone, globalAlertRuleWhereInput.alertRulesNone)
                && Objects.equals(this.alertRulesSome, globalAlertRuleWhereInput.alertRulesSome)
                && Objects.equals(this._boolean, globalAlertRuleWhereInput._boolean)
                && Objects.equals(this.booleanNot, globalAlertRuleWhereInput.booleanNot)
                && Objects.equals(this.cause, globalAlertRuleWhereInput.cause)
                && Objects.equals(this.causeContains, globalAlertRuleWhereInput.causeContains)
                && Objects.equals(this.causeEndsWith, globalAlertRuleWhereInput.causeEndsWith)
                && Objects.equals(this.causeGt, globalAlertRuleWhereInput.causeGt)
                && Objects.equals(this.causeGte, globalAlertRuleWhereInput.causeGte)
                && Objects.equals(this.causeIn, globalAlertRuleWhereInput.causeIn)
                && Objects.equals(this.causeLt, globalAlertRuleWhereInput.causeLt)
                && Objects.equals(this.causeLte, globalAlertRuleWhereInput.causeLte)
                && Objects.equals(this.causeNot, globalAlertRuleWhereInput.causeNot)
                && Objects.equals(this.causeNotContains, globalAlertRuleWhereInput.causeNotContains)
                && Objects.equals(this.causeNotEndsWith, globalAlertRuleWhereInput.causeNotEndsWith)
                && Objects.equals(this.causeNotIn, globalAlertRuleWhereInput.causeNotIn)
                && Objects.equals(
                        this.causeNotStartsWith, globalAlertRuleWhereInput.causeNotStartsWith)
                && Objects.equals(this.causeStartsWith, globalAlertRuleWhereInput.causeStartsWith)
                && Objects.equals(this.disabled, globalAlertRuleWhereInput.disabled)
                && Objects.equals(this.disabledNot, globalAlertRuleWhereInput.disabledNot)
                && Objects.equals(this.id, globalAlertRuleWhereInput.id)
                && Objects.equals(this.idContains, globalAlertRuleWhereInput.idContains)
                && Objects.equals(this.idEndsWith, globalAlertRuleWhereInput.idEndsWith)
                && Objects.equals(this.idGt, globalAlertRuleWhereInput.idGt)
                && Objects.equals(this.idGte, globalAlertRuleWhereInput.idGte)
                && Objects.equals(this.idIn, globalAlertRuleWhereInput.idIn)
                && Objects.equals(this.idLt, globalAlertRuleWhereInput.idLt)
                && Objects.equals(this.idLte, globalAlertRuleWhereInput.idLte)
                && Objects.equals(this.idNot, globalAlertRuleWhereInput.idNot)
                && Objects.equals(this.idNotContains, globalAlertRuleWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, globalAlertRuleWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, globalAlertRuleWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, globalAlertRuleWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, globalAlertRuleWhereInput.idStartsWith)
                && Objects.equals(this.impact, globalAlertRuleWhereInput.impact)
                && Objects.equals(this.impactContains, globalAlertRuleWhereInput.impactContains)
                && Objects.equals(this.impactEndsWith, globalAlertRuleWhereInput.impactEndsWith)
                && Objects.equals(this.impactGt, globalAlertRuleWhereInput.impactGt)
                && Objects.equals(this.impactGte, globalAlertRuleWhereInput.impactGte)
                && Objects.equals(this.impactIn, globalAlertRuleWhereInput.impactIn)
                && Objects.equals(this.impactLt, globalAlertRuleWhereInput.impactLt)
                && Objects.equals(this.impactLte, globalAlertRuleWhereInput.impactLte)
                && Objects.equals(this.impactNot, globalAlertRuleWhereInput.impactNot)
                && Objects.equals(
                        this.impactNotContains, globalAlertRuleWhereInput.impactNotContains)
                && Objects.equals(
                        this.impactNotEndsWith, globalAlertRuleWhereInput.impactNotEndsWith)
                && Objects.equals(this.impactNotIn, globalAlertRuleWhereInput.impactNotIn)
                && Objects.equals(
                        this.impactNotStartsWith, globalAlertRuleWhereInput.impactNotStartsWith)
                && Objects.equals(this.impactStartsWith, globalAlertRuleWhereInput.impactStartsWith)
                && Objects.equals(this.message, globalAlertRuleWhereInput.message)
                && Objects.equals(this.messageContains, globalAlertRuleWhereInput.messageContains)
                && Objects.equals(this.messageEndsWith, globalAlertRuleWhereInput.messageEndsWith)
                && Objects.equals(this.messageGt, globalAlertRuleWhereInput.messageGt)
                && Objects.equals(this.messageGte, globalAlertRuleWhereInput.messageGte)
                && Objects.equals(this.messageIn, globalAlertRuleWhereInput.messageIn)
                && Objects.equals(this.messageLt, globalAlertRuleWhereInput.messageLt)
                && Objects.equals(this.messageLte, globalAlertRuleWhereInput.messageLte)
                && Objects.equals(this.messageNot, globalAlertRuleWhereInput.messageNot)
                && Objects.equals(
                        this.messageNotContains, globalAlertRuleWhereInput.messageNotContains)
                && Objects.equals(
                        this.messageNotEndsWith, globalAlertRuleWhereInput.messageNotEndsWith)
                && Objects.equals(this.messageNotIn, globalAlertRuleWhereInput.messageNotIn)
                && Objects.equals(
                        this.messageNotStartsWith, globalAlertRuleWhereInput.messageNotStartsWith)
                && Objects.equals(
                        this.messageStartsWith, globalAlertRuleWhereInput.messageStartsWith)
                && Objects.equals(this.name, globalAlertRuleWhereInput.name)
                && Objects.equals(this.nameContains, globalAlertRuleWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, globalAlertRuleWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, globalAlertRuleWhereInput.nameGt)
                && Objects.equals(this.nameGte, globalAlertRuleWhereInput.nameGte)
                && Objects.equals(this.nameIn, globalAlertRuleWhereInput.nameIn)
                && Objects.equals(this.nameLt, globalAlertRuleWhereInput.nameLt)
                && Objects.equals(this.nameLte, globalAlertRuleWhereInput.nameLte)
                && Objects.equals(this.nameNot, globalAlertRuleWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, globalAlertRuleWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, globalAlertRuleWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, globalAlertRuleWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, globalAlertRuleWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, globalAlertRuleWhereInput.nameStartsWith)
                && Objects.equals(this._object, globalAlertRuleWhereInput._object)
                && Objects.equals(this.objectIn, globalAlertRuleWhereInput.objectIn)
                && Objects.equals(this.objectNot, globalAlertRuleWhereInput.objectNot)
                && Objects.equals(this.objectNotIn, globalAlertRuleWhereInput.objectNotIn)
                && Objects.equals(this.operator, globalAlertRuleWhereInput.operator)
                && Objects.equals(this.operatorContains, globalAlertRuleWhereInput.operatorContains)
                && Objects.equals(this.operatorEndsWith, globalAlertRuleWhereInput.operatorEndsWith)
                && Objects.equals(this.operatorGt, globalAlertRuleWhereInput.operatorGt)
                && Objects.equals(this.operatorGte, globalAlertRuleWhereInput.operatorGte)
                && Objects.equals(this.operatorIn, globalAlertRuleWhereInput.operatorIn)
                && Objects.equals(this.operatorLt, globalAlertRuleWhereInput.operatorLt)
                && Objects.equals(this.operatorLte, globalAlertRuleWhereInput.operatorLte)
                && Objects.equals(this.operatorNot, globalAlertRuleWhereInput.operatorNot)
                && Objects.equals(
                        this.operatorNotContains, globalAlertRuleWhereInput.operatorNotContains)
                && Objects.equals(
                        this.operatorNotEndsWith, globalAlertRuleWhereInput.operatorNotEndsWith)
                && Objects.equals(this.operatorNotIn, globalAlertRuleWhereInput.operatorNotIn)
                && Objects.equals(
                        this.operatorNotStartsWith, globalAlertRuleWhereInput.operatorNotStartsWith)
                && Objects.equals(
                        this.operatorStartsWith, globalAlertRuleWhereInput.operatorStartsWith)
                && Objects.equals(this.solution, globalAlertRuleWhereInput.solution)
                && Objects.equals(this.solutionContains, globalAlertRuleWhereInput.solutionContains)
                && Objects.equals(this.solutionEndsWith, globalAlertRuleWhereInput.solutionEndsWith)
                && Objects.equals(this.solutionGt, globalAlertRuleWhereInput.solutionGt)
                && Objects.equals(this.solutionGte, globalAlertRuleWhereInput.solutionGte)
                && Objects.equals(this.solutionIn, globalAlertRuleWhereInput.solutionIn)
                && Objects.equals(this.solutionLt, globalAlertRuleWhereInput.solutionLt)
                && Objects.equals(this.solutionLte, globalAlertRuleWhereInput.solutionLte)
                && Objects.equals(this.solutionNot, globalAlertRuleWhereInput.solutionNot)
                && Objects.equals(
                        this.solutionNotContains, globalAlertRuleWhereInput.solutionNotContains)
                && Objects.equals(
                        this.solutionNotEndsWith, globalAlertRuleWhereInput.solutionNotEndsWith)
                && Objects.equals(this.solutionNotIn, globalAlertRuleWhereInput.solutionNotIn)
                && Objects.equals(
                        this.solutionNotStartsWith, globalAlertRuleWhereInput.solutionNotStartsWith)
                && Objects.equals(
                        this.solutionStartsWith, globalAlertRuleWhereInput.solutionStartsWith)
                && Objects.equals(this.unit, globalAlertRuleWhereInput.unit)
                && Objects.equals(this.unitIn, globalAlertRuleWhereInput.unitIn)
                && Objects.equals(this.unitNot, globalAlertRuleWhereInput.unitNot)
                && Objects.equals(this.unitNotIn, globalAlertRuleWhereInput.unitNotIn);
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
                alertRulesEvery,
                alertRulesNone,
                alertRulesSome,
                _boolean,
                booleanNot,
                cause,
                causeContains,
                causeEndsWith,
                causeGt,
                causeGte,
                causeIn,
                causeLt,
                causeLte,
                causeNot,
                causeNotContains,
                causeNotEndsWith,
                causeNotIn,
                causeNotStartsWith,
                causeStartsWith,
                disabled,
                disabledNot,
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
                impact,
                impactContains,
                impactEndsWith,
                impactGt,
                impactGte,
                impactIn,
                impactLt,
                impactLte,
                impactNot,
                impactNotContains,
                impactNotEndsWith,
                impactNotIn,
                impactNotStartsWith,
                impactStartsWith,
                message,
                messageContains,
                messageEndsWith,
                messageGt,
                messageGte,
                messageIn,
                messageLt,
                messageLte,
                messageNot,
                messageNotContains,
                messageNotEndsWith,
                messageNotIn,
                messageNotStartsWith,
                messageStartsWith,
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
                _object,
                objectIn,
                objectNot,
                objectNotIn,
                operator,
                operatorContains,
                operatorEndsWith,
                operatorGt,
                operatorGte,
                operatorIn,
                operatorLt,
                operatorLte,
                operatorNot,
                operatorNotContains,
                operatorNotEndsWith,
                operatorNotIn,
                operatorNotStartsWith,
                operatorStartsWith,
                solution,
                solutionContains,
                solutionEndsWith,
                solutionGt,
                solutionGte,
                solutionIn,
                solutionLt,
                solutionLte,
                solutionNot,
                solutionNotContains,
                solutionNotEndsWith,
                solutionNotIn,
                solutionNotStartsWith,
                solutionStartsWith,
                unit,
                unitIn,
                unitNot,
                unitNotIn);
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
        sb.append("class GlobalAlertRuleWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    alertRulesEvery: ").append(toIndentedString(alertRulesEvery)).append("\n");
        sb.append("    alertRulesNone: ").append(toIndentedString(alertRulesNone)).append("\n");
        sb.append("    alertRulesSome: ").append(toIndentedString(alertRulesSome)).append("\n");
        sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
        sb.append("    booleanNot: ").append(toIndentedString(booleanNot)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    causeContains: ").append(toIndentedString(causeContains)).append("\n");
        sb.append("    causeEndsWith: ").append(toIndentedString(causeEndsWith)).append("\n");
        sb.append("    causeGt: ").append(toIndentedString(causeGt)).append("\n");
        sb.append("    causeGte: ").append(toIndentedString(causeGte)).append("\n");
        sb.append("    causeIn: ").append(toIndentedString(causeIn)).append("\n");
        sb.append("    causeLt: ").append(toIndentedString(causeLt)).append("\n");
        sb.append("    causeLte: ").append(toIndentedString(causeLte)).append("\n");
        sb.append("    causeNot: ").append(toIndentedString(causeNot)).append("\n");
        sb.append("    causeNotContains: ").append(toIndentedString(causeNotContains)).append("\n");
        sb.append("    causeNotEndsWith: ").append(toIndentedString(causeNotEndsWith)).append("\n");
        sb.append("    causeNotIn: ").append(toIndentedString(causeNotIn)).append("\n");
        sb.append("    causeNotStartsWith: ")
                .append(toIndentedString(causeNotStartsWith))
                .append("\n");
        sb.append("    causeStartsWith: ").append(toIndentedString(causeStartsWith)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    disabledNot: ").append(toIndentedString(disabledNot)).append("\n");
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
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    impactContains: ").append(toIndentedString(impactContains)).append("\n");
        sb.append("    impactEndsWith: ").append(toIndentedString(impactEndsWith)).append("\n");
        sb.append("    impactGt: ").append(toIndentedString(impactGt)).append("\n");
        sb.append("    impactGte: ").append(toIndentedString(impactGte)).append("\n");
        sb.append("    impactIn: ").append(toIndentedString(impactIn)).append("\n");
        sb.append("    impactLt: ").append(toIndentedString(impactLt)).append("\n");
        sb.append("    impactLte: ").append(toIndentedString(impactLte)).append("\n");
        sb.append("    impactNot: ").append(toIndentedString(impactNot)).append("\n");
        sb.append("    impactNotContains: ")
                .append(toIndentedString(impactNotContains))
                .append("\n");
        sb.append("    impactNotEndsWith: ")
                .append(toIndentedString(impactNotEndsWith))
                .append("\n");
        sb.append("    impactNotIn: ").append(toIndentedString(impactNotIn)).append("\n");
        sb.append("    impactNotStartsWith: ")
                .append(toIndentedString(impactNotStartsWith))
                .append("\n");
        sb.append("    impactStartsWith: ").append(toIndentedString(impactStartsWith)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    messageContains: ").append(toIndentedString(messageContains)).append("\n");
        sb.append("    messageEndsWith: ").append(toIndentedString(messageEndsWith)).append("\n");
        sb.append("    messageGt: ").append(toIndentedString(messageGt)).append("\n");
        sb.append("    messageGte: ").append(toIndentedString(messageGte)).append("\n");
        sb.append("    messageIn: ").append(toIndentedString(messageIn)).append("\n");
        sb.append("    messageLt: ").append(toIndentedString(messageLt)).append("\n");
        sb.append("    messageLte: ").append(toIndentedString(messageLte)).append("\n");
        sb.append("    messageNot: ").append(toIndentedString(messageNot)).append("\n");
        sb.append("    messageNotContains: ")
                .append(toIndentedString(messageNotContains))
                .append("\n");
        sb.append("    messageNotEndsWith: ")
                .append(toIndentedString(messageNotEndsWith))
                .append("\n");
        sb.append("    messageNotIn: ").append(toIndentedString(messageNotIn)).append("\n");
        sb.append("    messageNotStartsWith: ")
                .append(toIndentedString(messageNotStartsWith))
                .append("\n");
        sb.append("    messageStartsWith: ")
                .append(toIndentedString(messageStartsWith))
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
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    objectIn: ").append(toIndentedString(objectIn)).append("\n");
        sb.append("    objectNot: ").append(toIndentedString(objectNot)).append("\n");
        sb.append("    objectNotIn: ").append(toIndentedString(objectNotIn)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operatorContains: ").append(toIndentedString(operatorContains)).append("\n");
        sb.append("    operatorEndsWith: ").append(toIndentedString(operatorEndsWith)).append("\n");
        sb.append("    operatorGt: ").append(toIndentedString(operatorGt)).append("\n");
        sb.append("    operatorGte: ").append(toIndentedString(operatorGte)).append("\n");
        sb.append("    operatorIn: ").append(toIndentedString(operatorIn)).append("\n");
        sb.append("    operatorLt: ").append(toIndentedString(operatorLt)).append("\n");
        sb.append("    operatorLte: ").append(toIndentedString(operatorLte)).append("\n");
        sb.append("    operatorNot: ").append(toIndentedString(operatorNot)).append("\n");
        sb.append("    operatorNotContains: ")
                .append(toIndentedString(operatorNotContains))
                .append("\n");
        sb.append("    operatorNotEndsWith: ")
                .append(toIndentedString(operatorNotEndsWith))
                .append("\n");
        sb.append("    operatorNotIn: ").append(toIndentedString(operatorNotIn)).append("\n");
        sb.append("    operatorNotStartsWith: ")
                .append(toIndentedString(operatorNotStartsWith))
                .append("\n");
        sb.append("    operatorStartsWith: ")
                .append(toIndentedString(operatorStartsWith))
                .append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    solutionContains: ").append(toIndentedString(solutionContains)).append("\n");
        sb.append("    solutionEndsWith: ").append(toIndentedString(solutionEndsWith)).append("\n");
        sb.append("    solutionGt: ").append(toIndentedString(solutionGt)).append("\n");
        sb.append("    solutionGte: ").append(toIndentedString(solutionGte)).append("\n");
        sb.append("    solutionIn: ").append(toIndentedString(solutionIn)).append("\n");
        sb.append("    solutionLt: ").append(toIndentedString(solutionLt)).append("\n");
        sb.append("    solutionLte: ").append(toIndentedString(solutionLte)).append("\n");
        sb.append("    solutionNot: ").append(toIndentedString(solutionNot)).append("\n");
        sb.append("    solutionNotContains: ")
                .append(toIndentedString(solutionNotContains))
                .append("\n");
        sb.append("    solutionNotEndsWith: ")
                .append(toIndentedString(solutionNotEndsWith))
                .append("\n");
        sb.append("    solutionNotIn: ").append(toIndentedString(solutionNotIn)).append("\n");
        sb.append("    solutionNotStartsWith: ")
                .append(toIndentedString(solutionNotStartsWith))
                .append("\n");
        sb.append("    solutionStartsWith: ")
                .append(toIndentedString(solutionStartsWith))
                .append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    unitIn: ").append(toIndentedString(unitIn)).append("\n");
        sb.append("    unitNot: ").append(toIndentedString(unitNot)).append("\n");
        sb.append("    unitNotIn: ").append(toIndentedString(unitNotIn)).append("\n");
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
