package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SecurityPolicyStatisticsWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyStatisticsWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SecurityPolicyStatisticsWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SecurityPolicyStatisticsWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SecurityPolicyStatisticsWhereInput> OR = null;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP = "count_reset_timestamp";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP)
    private String countResetTimestamp;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT =
            "count_reset_timestamp_gt";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT)
    private String countResetTimestampGt;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE =
            "count_reset_timestamp_gte";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE)
    private String countResetTimestampGte;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN =
            "count_reset_timestamp_in";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN)
    private List<String> countResetTimestampIn = null;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT =
            "count_reset_timestamp_lt";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT)
    private String countResetTimestampLt;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE =
            "count_reset_timestamp_lte";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE)
    private String countResetTimestampLte;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT =
            "count_reset_timestamp_not";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT)
    private String countResetTimestampNot;

    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN =
            "count_reset_timestamp_not_in";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN)
    private List<String> countResetTimestampNotIn = null;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP = "count_update_timestamp";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP)
    private String countUpdateTimestamp;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT =
            "count_update_timestamp_gt";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT)
    private String countUpdateTimestampGt;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE =
            "count_update_timestamp_gte";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE)
    private String countUpdateTimestampGte;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN =
            "count_update_timestamp_in";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN)
    private List<String> countUpdateTimestampIn = null;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT =
            "count_update_timestamp_lt";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT)
    private String countUpdateTimestampLt;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE =
            "count_update_timestamp_lte";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE)
    private String countUpdateTimestampLte;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT =
            "count_update_timestamp_not";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT)
    private String countUpdateTimestampNot;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN =
            "count_update_timestamp_not_in";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN)
    private List<String> countUpdateTimestampNotIn = null;

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

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT = "match_allow_count";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT)
    private Integer matchAllowCount;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT = "match_allow_count_gt";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT)
    private Integer matchAllowCountGt;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE = "match_allow_count_gte";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE)
    private Integer matchAllowCountGte;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN = "match_allow_count_in";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN)
    private List<Integer> matchAllowCountIn = null;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT = "match_allow_count_lt";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT)
    private Integer matchAllowCountLt;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE = "match_allow_count_lte";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE)
    private Integer matchAllowCountLte;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT = "match_allow_count_not";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT)
    private Integer matchAllowCountNot;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN =
            "match_allow_count_not_in";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN)
    private List<Integer> matchAllowCountNotIn = null;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT =
            "match_default_allow_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT)
    private Integer matchDefaultAllowCount;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT =
            "match_default_allow_count_gt";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT)
    private Integer matchDefaultAllowCountGt;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE =
            "match_default_allow_count_gte";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE)
    private Integer matchDefaultAllowCountGte;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN =
            "match_default_allow_count_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN)
    private List<Integer> matchDefaultAllowCountIn = null;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT =
            "match_default_allow_count_lt";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT)
    private Integer matchDefaultAllowCountLt;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE =
            "match_default_allow_count_lte";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE)
    private Integer matchDefaultAllowCountLte;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT =
            "match_default_allow_count_not";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT)
    private Integer matchDefaultAllowCountNot;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN =
            "match_default_allow_count_not_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN)
    private List<Integer> matchDefaultAllowCountNotIn = null;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT =
            "match_default_drop_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT)
    private Integer matchDefaultDropCount;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT =
            "match_default_drop_count_gt";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT)
    private Integer matchDefaultDropCountGt;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE =
            "match_default_drop_count_gte";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE)
    private Integer matchDefaultDropCountGte;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN =
            "match_default_drop_count_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN)
    private List<Integer> matchDefaultDropCountIn = null;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT =
            "match_default_drop_count_lt";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT)
    private Integer matchDefaultDropCountLt;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE =
            "match_default_drop_count_lte";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE)
    private Integer matchDefaultDropCountLte;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT =
            "match_default_drop_count_not";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT)
    private Integer matchDefaultDropCountNot;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN =
            "match_default_drop_count_not_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN)
    private List<Integer> matchDefaultDropCountNotIn = null;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT = "match_drop_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT)
    private Integer matchDropCount;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_GT = "match_drop_count_gt";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_GT)
    private Integer matchDropCountGt;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_GTE = "match_drop_count_gte";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE)
    private Integer matchDropCountGte;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_IN = "match_drop_count_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_IN)
    private List<Integer> matchDropCountIn = null;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_LT = "match_drop_count_lt";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_LT)
    private Integer matchDropCountLt;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_LTE = "match_drop_count_lte";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE)
    private Integer matchDropCountLte;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_NOT = "match_drop_count_not";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT)
    private Integer matchDropCountNot;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN = "match_drop_count_not_in";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN)
    private List<Integer> matchDropCountNotIn = null;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT = "match_whitelist_count";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT)
    private Integer matchWhitelistCount;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT =
            "match_whitelist_count_gt";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT)
    private Integer matchWhitelistCountGt;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE =
            "match_whitelist_count_gte";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE)
    private Integer matchWhitelistCountGte;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN =
            "match_whitelist_count_in";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN)
    private List<Integer> matchWhitelistCountIn = null;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT =
            "match_whitelist_count_lt";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT)
    private Integer matchWhitelistCountLt;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE =
            "match_whitelist_count_lte";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE)
    private Integer matchWhitelistCountLte;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT =
            "match_whitelist_count_not";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT)
    private Integer matchWhitelistCountNot;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN =
            "match_whitelist_count_not_in";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN)
    private List<Integer> matchWhitelistCountNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
    private Integer totalCount;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_GT = "total_count_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_GT)
    private Integer totalCountGt;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_GTE = "total_count_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_GTE)
    private Integer totalCountGte;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_IN = "total_count_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_IN)
    private List<Integer> totalCountIn = null;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_LT = "total_count_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_LT)
    private Integer totalCountLt;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_LTE = "total_count_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_LTE)
    private Integer totalCountLte;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_NOT = "total_count_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_NOT)
    private Integer totalCountNot;

    public static final String SERIALIZED_NAME_TOTAL_COUNT_NOT_IN = "total_count_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN)
    private List<Integer> totalCountNotIn = null;

    public SecurityPolicyStatisticsWhereInput() {}

    public SecurityPolicyStatisticsWhereInput AND(List<SecurityPolicyStatisticsWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addANDItem(
            SecurityPolicyStatisticsWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SecurityPolicyStatisticsWhereInput>();
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
    public List<SecurityPolicyStatisticsWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SecurityPolicyStatisticsWhereInput> AND) {
        this.AND = AND;
    }

    public SecurityPolicyStatisticsWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput AND_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput NOT(List<SecurityPolicyStatisticsWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addNOTItem(
            SecurityPolicyStatisticsWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SecurityPolicyStatisticsWhereInput>();
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
    public List<SecurityPolicyStatisticsWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SecurityPolicyStatisticsWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SecurityPolicyStatisticsWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput NOT_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput OR(List<SecurityPolicyStatisticsWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addORItem(SecurityPolicyStatisticsWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SecurityPolicyStatisticsWhereInput>();
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
    public List<SecurityPolicyStatisticsWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SecurityPolicyStatisticsWhereInput> OR) {
        this.OR = OR;
    }

    public SecurityPolicyStatisticsWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput OR_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput countResetTimestamp(String countResetTimestamp) {

        this.countResetTimestamp = countResetTimestamp;
        return this;
    }

    /**
     * Get countResetTimestamp
     *
     * @return countResetTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestamp() {
        return countResetTimestamp;
    }

    public void setCountResetTimestamp(String countResetTimestamp) {
        this.countResetTimestamp = countResetTimestamp;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
        return this;
    }

    public void setCountResetTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
        }
    }

    public boolean getCountResetTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGt(String countResetTimestampGt) {

        this.countResetTimestampGt = countResetTimestampGt;
        return this;
    }

    /**
     * Get countResetTimestampGt
     *
     * @return countResetTimestampGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestampGt() {
        return countResetTimestampGt;
    }

    public void setCountResetTimestampGt(String countResetTimestampGt) {
        this.countResetTimestampGt = countResetTimestampGt;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT);
        return this;
    }

    public void setCountResetTimestampGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT);
        }
    }

    public boolean getCountResetTimestampGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GT);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGte(
            String countResetTimestampGte) {

        this.countResetTimestampGte = countResetTimestampGte;
        return this;
    }

    /**
     * Get countResetTimestampGte
     *
     * @return countResetTimestampGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestampGte() {
        return countResetTimestampGte;
    }

    public void setCountResetTimestampGte(String countResetTimestampGte) {
        this.countResetTimestampGte = countResetTimestampGte;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE);
        return this;
    }

    public void setCountResetTimestampGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE);
        }
    }

    public boolean getCountResetTimestampGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_GTE);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampIn(
            List<String> countResetTimestampIn) {

        this.countResetTimestampIn = countResetTimestampIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addCountResetTimestampInItem(
            String countResetTimestampInItem) {
        if (this.countResetTimestampIn == null) {
            this.countResetTimestampIn = new ArrayList<String>();
        }
        this.countResetTimestampIn.add(countResetTimestampInItem);
        return this;
    }

    /**
     * Get countResetTimestampIn
     *
     * @return countResetTimestampIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCountResetTimestampIn() {
        return countResetTimestampIn;
    }

    public void setCountResetTimestampIn(List<String> countResetTimestampIn) {
        this.countResetTimestampIn = countResetTimestampIn;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN);
        return this;
    }

    public void setCountResetTimestampIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN);
        }
    }

    public boolean getCountResetTimestampIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_IN);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLt(String countResetTimestampLt) {

        this.countResetTimestampLt = countResetTimestampLt;
        return this;
    }

    /**
     * Get countResetTimestampLt
     *
     * @return countResetTimestampLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestampLt() {
        return countResetTimestampLt;
    }

    public void setCountResetTimestampLt(String countResetTimestampLt) {
        this.countResetTimestampLt = countResetTimestampLt;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT);
        return this;
    }

    public void setCountResetTimestampLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT);
        }
    }

    public boolean getCountResetTimestampLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LT);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLte(
            String countResetTimestampLte) {

        this.countResetTimestampLte = countResetTimestampLte;
        return this;
    }

    /**
     * Get countResetTimestampLte
     *
     * @return countResetTimestampLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestampLte() {
        return countResetTimestampLte;
    }

    public void setCountResetTimestampLte(String countResetTimestampLte) {
        this.countResetTimestampLte = countResetTimestampLte;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE);
        return this;
    }

    public void setCountResetTimestampLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE);
        }
    }

    public boolean getCountResetTimestampLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_LTE);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNot(
            String countResetTimestampNot) {

        this.countResetTimestampNot = countResetTimestampNot;
        return this;
    }

    /**
     * Get countResetTimestampNot
     *
     * @return countResetTimestampNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountResetTimestampNot() {
        return countResetTimestampNot;
    }

    public void setCountResetTimestampNot(String countResetTimestampNot) {
        this.countResetTimestampNot = countResetTimestampNot;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT);
        return this;
    }

    public void setCountResetTimestampNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT);
        }
    }

    public boolean getCountResetTimestampNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT);
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNotIn(
            List<String> countResetTimestampNotIn) {

        this.countResetTimestampNotIn = countResetTimestampNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addCountResetTimestampNotInItem(
            String countResetTimestampNotInItem) {
        if (this.countResetTimestampNotIn == null) {
            this.countResetTimestampNotIn = new ArrayList<String>();
        }
        this.countResetTimestampNotIn.add(countResetTimestampNotInItem);
        return this;
    }

    /**
     * Get countResetTimestampNotIn
     *
     * @return countResetTimestampNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCountResetTimestampNotIn() {
        return countResetTimestampNotIn;
    }

    public void setCountResetTimestampNotIn(List<String> countResetTimestampNotIn) {
        this.countResetTimestampNotIn = countResetTimestampNotIn;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countResetTimestampNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN);
        return this;
    }

    public void setCountResetTimestampNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN);
        }
    }

    public boolean getCountResetTimestampNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestamp(String countUpdateTimestamp) {

        this.countUpdateTimestamp = countUpdateTimestamp;
        return this;
    }

    /**
     * Get countUpdateTimestamp
     *
     * @return countUpdateTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestamp() {
        return countUpdateTimestamp;
    }

    public void setCountUpdateTimestamp(String countUpdateTimestamp) {
        this.countUpdateTimestamp = countUpdateTimestamp;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
        return this;
    }

    public void setCountUpdateTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
        }
    }

    public boolean getCountUpdateTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGt(
            String countUpdateTimestampGt) {

        this.countUpdateTimestampGt = countUpdateTimestampGt;
        return this;
    }

    /**
     * Get countUpdateTimestampGt
     *
     * @return countUpdateTimestampGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestampGt() {
        return countUpdateTimestampGt;
    }

    public void setCountUpdateTimestampGt(String countUpdateTimestampGt) {
        this.countUpdateTimestampGt = countUpdateTimestampGt;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT);
        return this;
    }

    public void setCountUpdateTimestampGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT);
        }
    }

    public boolean getCountUpdateTimestampGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GT);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGte(
            String countUpdateTimestampGte) {

        this.countUpdateTimestampGte = countUpdateTimestampGte;
        return this;
    }

    /**
     * Get countUpdateTimestampGte
     *
     * @return countUpdateTimestampGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestampGte() {
        return countUpdateTimestampGte;
    }

    public void setCountUpdateTimestampGte(String countUpdateTimestampGte) {
        this.countUpdateTimestampGte = countUpdateTimestampGte;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE);
        return this;
    }

    public void setCountUpdateTimestampGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE);
        }
    }

    public boolean getCountUpdateTimestampGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_GTE);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampIn(
            List<String> countUpdateTimestampIn) {

        this.countUpdateTimestampIn = countUpdateTimestampIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addCountUpdateTimestampInItem(
            String countUpdateTimestampInItem) {
        if (this.countUpdateTimestampIn == null) {
            this.countUpdateTimestampIn = new ArrayList<String>();
        }
        this.countUpdateTimestampIn.add(countUpdateTimestampInItem);
        return this;
    }

    /**
     * Get countUpdateTimestampIn
     *
     * @return countUpdateTimestampIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCountUpdateTimestampIn() {
        return countUpdateTimestampIn;
    }

    public void setCountUpdateTimestampIn(List<String> countUpdateTimestampIn) {
        this.countUpdateTimestampIn = countUpdateTimestampIn;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN);
        return this;
    }

    public void setCountUpdateTimestampIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN);
        }
    }

    public boolean getCountUpdateTimestampIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_IN);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLt(
            String countUpdateTimestampLt) {

        this.countUpdateTimestampLt = countUpdateTimestampLt;
        return this;
    }

    /**
     * Get countUpdateTimestampLt
     *
     * @return countUpdateTimestampLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestampLt() {
        return countUpdateTimestampLt;
    }

    public void setCountUpdateTimestampLt(String countUpdateTimestampLt) {
        this.countUpdateTimestampLt = countUpdateTimestampLt;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT);
        return this;
    }

    public void setCountUpdateTimestampLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT);
        }
    }

    public boolean getCountUpdateTimestampLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LT);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLte(
            String countUpdateTimestampLte) {

        this.countUpdateTimestampLte = countUpdateTimestampLte;
        return this;
    }

    /**
     * Get countUpdateTimestampLte
     *
     * @return countUpdateTimestampLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestampLte() {
        return countUpdateTimestampLte;
    }

    public void setCountUpdateTimestampLte(String countUpdateTimestampLte) {
        this.countUpdateTimestampLte = countUpdateTimestampLte;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE);
        return this;
    }

    public void setCountUpdateTimestampLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE);
        }
    }

    public boolean getCountUpdateTimestampLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_LTE);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNot(
            String countUpdateTimestampNot) {

        this.countUpdateTimestampNot = countUpdateTimestampNot;
        return this;
    }

    /**
     * Get countUpdateTimestampNot
     *
     * @return countUpdateTimestampNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCountUpdateTimestampNot() {
        return countUpdateTimestampNot;
    }

    public void setCountUpdateTimestampNot(String countUpdateTimestampNot) {
        this.countUpdateTimestampNot = countUpdateTimestampNot;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT);
        return this;
    }

    public void setCountUpdateTimestampNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT);
        }
    }

    public boolean getCountUpdateTimestampNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT);
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNotIn(
            List<String> countUpdateTimestampNotIn) {

        this.countUpdateTimestampNotIn = countUpdateTimestampNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addCountUpdateTimestampNotInItem(
            String countUpdateTimestampNotInItem) {
        if (this.countUpdateTimestampNotIn == null) {
            this.countUpdateTimestampNotIn = new ArrayList<String>();
        }
        this.countUpdateTimestampNotIn.add(countUpdateTimestampNotInItem);
        return this;
    }

    /**
     * Get countUpdateTimestampNotIn
     *
     * @return countUpdateTimestampNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCountUpdateTimestampNotIn() {
        return countUpdateTimestampNotIn;
    }

    public void setCountUpdateTimestampNotIn(List<String> countUpdateTimestampNotIn) {
        this.countUpdateTimestampNotIn = countUpdateTimestampNotIn;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput countUpdateTimestampNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN);
        return this;
    }

    public void setCountUpdateTimestampNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN);
        }
    }

    public boolean getCountUpdateTimestampNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput id(String id) {

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

    public SecurityPolicyStatisticsWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput id_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idContains(String idContains) {

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

    public SecurityPolicyStatisticsWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idContains_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idEndsWith(String idEndsWith) {

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

    public SecurityPolicyStatisticsWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idGt(String idGt) {

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

    public SecurityPolicyStatisticsWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idGt_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idGte(String idGte) {

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

    public SecurityPolicyStatisticsWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idGte_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addIdInItem(String idInItem) {
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

    public SecurityPolicyStatisticsWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idIn_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idLt(String idLt) {

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

    public SecurityPolicyStatisticsWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idLt_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idLte(String idLte) {

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

    public SecurityPolicyStatisticsWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idLte_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idNot(String idNot) {

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

    public SecurityPolicyStatisticsWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idNot_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idNotContains(String idNotContains) {

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

    public SecurityPolicyStatisticsWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idNotContains_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SecurityPolicyStatisticsWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addIdNotInItem(String idNotInItem) {
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

    public SecurityPolicyStatisticsWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idNotIn_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SecurityPolicyStatisticsWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput idStartsWith(String idStartsWith) {

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

    public SecurityPolicyStatisticsWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localId(String localId) {

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

    public SecurityPolicyStatisticsWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localId_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdContains(String localIdContains) {

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

    public SecurityPolicyStatisticsWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdContains_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public SecurityPolicyStatisticsWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdGt(String localIdGt) {

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

    public SecurityPolicyStatisticsWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdGt_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdGte(String localIdGte) {

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

    public SecurityPolicyStatisticsWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdGte_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addLocalIdInItem(String localIdInItem) {
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

    public SecurityPolicyStatisticsWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdIn_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdLt(String localIdLt) {

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

    public SecurityPolicyStatisticsWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdLt_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdLte(String localIdLte) {

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

    public SecurityPolicyStatisticsWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdLte_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdNot(String localIdNot) {

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

    public SecurityPolicyStatisticsWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdNot_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdNotContains(String localIdNotContains) {

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

    public SecurityPolicyStatisticsWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public SecurityPolicyStatisticsWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public SecurityPolicyStatisticsWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public SecurityPolicyStatisticsWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public SecurityPolicyStatisticsWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public SecurityPolicyStatisticsWhereInput matchAllowCount(Integer matchAllowCount) {

        this.matchAllowCount = matchAllowCount;
        return this;
    }

    /**
     * Get matchAllowCount
     *
     * @return matchAllowCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCount() {
        return matchAllowCount;
    }

    public void setMatchAllowCount(Integer matchAllowCount) {
        this.matchAllowCount = matchAllowCount;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
        return this;
    }

    public void setMatchAllowCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
        }
    }

    public boolean getMatchAllowCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGt(Integer matchAllowCountGt) {

        this.matchAllowCountGt = matchAllowCountGt;
        return this;
    }

    /**
     * Get matchAllowCountGt
     *
     * @return matchAllowCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCountGt() {
        return matchAllowCountGt;
    }

    public void setMatchAllowCountGt(Integer matchAllowCountGt) {
        this.matchAllowCountGt = matchAllowCountGt;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT);
        return this;
    }

    public void setMatchAllowCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT);
        }
    }

    public boolean getMatchAllowCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGte(Integer matchAllowCountGte) {

        this.matchAllowCountGte = matchAllowCountGte;
        return this;
    }

    /**
     * Get matchAllowCountGte
     *
     * @return matchAllowCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCountGte() {
        return matchAllowCountGte;
    }

    public void setMatchAllowCountGte(Integer matchAllowCountGte) {
        this.matchAllowCountGte = matchAllowCountGte;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE);
        return this;
    }

    public void setMatchAllowCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE);
        }
    }

    public boolean getMatchAllowCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountIn(List<Integer> matchAllowCountIn) {

        this.matchAllowCountIn = matchAllowCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchAllowCountInItem(
            Integer matchAllowCountInItem) {
        if (this.matchAllowCountIn == null) {
            this.matchAllowCountIn = new ArrayList<Integer>();
        }
        this.matchAllowCountIn.add(matchAllowCountInItem);
        return this;
    }

    /**
     * Get matchAllowCountIn
     *
     * @return matchAllowCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchAllowCountIn() {
        return matchAllowCountIn;
    }

    public void setMatchAllowCountIn(List<Integer> matchAllowCountIn) {
        this.matchAllowCountIn = matchAllowCountIn;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN);
        return this;
    }

    public void setMatchAllowCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN);
        }
    }

    public boolean getMatchAllowCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLt(Integer matchAllowCountLt) {

        this.matchAllowCountLt = matchAllowCountLt;
        return this;
    }

    /**
     * Get matchAllowCountLt
     *
     * @return matchAllowCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCountLt() {
        return matchAllowCountLt;
    }

    public void setMatchAllowCountLt(Integer matchAllowCountLt) {
        this.matchAllowCountLt = matchAllowCountLt;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT);
        return this;
    }

    public void setMatchAllowCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT);
        }
    }

    public boolean getMatchAllowCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLte(Integer matchAllowCountLte) {

        this.matchAllowCountLte = matchAllowCountLte;
        return this;
    }

    /**
     * Get matchAllowCountLte
     *
     * @return matchAllowCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCountLte() {
        return matchAllowCountLte;
    }

    public void setMatchAllowCountLte(Integer matchAllowCountLte) {
        this.matchAllowCountLte = matchAllowCountLte;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE);
        return this;
    }

    public void setMatchAllowCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE);
        }
    }

    public boolean getMatchAllowCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNot(Integer matchAllowCountNot) {

        this.matchAllowCountNot = matchAllowCountNot;
        return this;
    }

    /**
     * Get matchAllowCountNot
     *
     * @return matchAllowCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchAllowCountNot() {
        return matchAllowCountNot;
    }

    public void setMatchAllowCountNot(Integer matchAllowCountNot) {
        this.matchAllowCountNot = matchAllowCountNot;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT);
        return this;
    }

    public void setMatchAllowCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT);
        }
    }

    public boolean getMatchAllowCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNotIn(
            List<Integer> matchAllowCountNotIn) {

        this.matchAllowCountNotIn = matchAllowCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchAllowCountNotInItem(
            Integer matchAllowCountNotInItem) {
        if (this.matchAllowCountNotIn == null) {
            this.matchAllowCountNotIn = new ArrayList<Integer>();
        }
        this.matchAllowCountNotIn.add(matchAllowCountNotInItem);
        return this;
    }

    /**
     * Get matchAllowCountNotIn
     *
     * @return matchAllowCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchAllowCountNotIn() {
        return matchAllowCountNotIn;
    }

    public void setMatchAllowCountNotIn(List<Integer> matchAllowCountNotIn) {
        this.matchAllowCountNotIn = matchAllowCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchAllowCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN);
        return this;
    }

    public void setMatchAllowCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN);
        }
    }

    public boolean getMatchAllowCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_ALLOW_COUNT_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCount(
            Integer matchDefaultAllowCount) {

        this.matchDefaultAllowCount = matchDefaultAllowCount;
        return this;
    }

    /**
     * Get matchDefaultAllowCount
     *
     * @return matchDefaultAllowCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCount() {
        return matchDefaultAllowCount;
    }

    public void setMatchDefaultAllowCount(Integer matchDefaultAllowCount) {
        this.matchDefaultAllowCount = matchDefaultAllowCount;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
        return this;
    }

    public void setMatchDefaultAllowCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
        }
    }

    public boolean getMatchDefaultAllowCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGt(
            Integer matchDefaultAllowCountGt) {

        this.matchDefaultAllowCountGt = matchDefaultAllowCountGt;
        return this;
    }

    /**
     * Get matchDefaultAllowCountGt
     *
     * @return matchDefaultAllowCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCountGt() {
        return matchDefaultAllowCountGt;
    }

    public void setMatchDefaultAllowCountGt(Integer matchDefaultAllowCountGt) {
        this.matchDefaultAllowCountGt = matchDefaultAllowCountGt;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT);
        return this;
    }

    public void setMatchDefaultAllowCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT);
        }
    }

    public boolean getMatchDefaultAllowCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGte(
            Integer matchDefaultAllowCountGte) {

        this.matchDefaultAllowCountGte = matchDefaultAllowCountGte;
        return this;
    }

    /**
     * Get matchDefaultAllowCountGte
     *
     * @return matchDefaultAllowCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCountGte() {
        return matchDefaultAllowCountGte;
    }

    public void setMatchDefaultAllowCountGte(Integer matchDefaultAllowCountGte) {
        this.matchDefaultAllowCountGte = matchDefaultAllowCountGte;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE);
        return this;
    }

    public void setMatchDefaultAllowCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE);
        }
    }

    public boolean getMatchDefaultAllowCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountIn(
            List<Integer> matchDefaultAllowCountIn) {

        this.matchDefaultAllowCountIn = matchDefaultAllowCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDefaultAllowCountInItem(
            Integer matchDefaultAllowCountInItem) {
        if (this.matchDefaultAllowCountIn == null) {
            this.matchDefaultAllowCountIn = new ArrayList<Integer>();
        }
        this.matchDefaultAllowCountIn.add(matchDefaultAllowCountInItem);
        return this;
    }

    /**
     * Get matchDefaultAllowCountIn
     *
     * @return matchDefaultAllowCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDefaultAllowCountIn() {
        return matchDefaultAllowCountIn;
    }

    public void setMatchDefaultAllowCountIn(List<Integer> matchDefaultAllowCountIn) {
        this.matchDefaultAllowCountIn = matchDefaultAllowCountIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN);
        return this;
    }

    public void setMatchDefaultAllowCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN);
        }
    }

    public boolean getMatchDefaultAllowCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLt(
            Integer matchDefaultAllowCountLt) {

        this.matchDefaultAllowCountLt = matchDefaultAllowCountLt;
        return this;
    }

    /**
     * Get matchDefaultAllowCountLt
     *
     * @return matchDefaultAllowCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCountLt() {
        return matchDefaultAllowCountLt;
    }

    public void setMatchDefaultAllowCountLt(Integer matchDefaultAllowCountLt) {
        this.matchDefaultAllowCountLt = matchDefaultAllowCountLt;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT);
        return this;
    }

    public void setMatchDefaultAllowCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT);
        }
    }

    public boolean getMatchDefaultAllowCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLte(
            Integer matchDefaultAllowCountLte) {

        this.matchDefaultAllowCountLte = matchDefaultAllowCountLte;
        return this;
    }

    /**
     * Get matchDefaultAllowCountLte
     *
     * @return matchDefaultAllowCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCountLte() {
        return matchDefaultAllowCountLte;
    }

    public void setMatchDefaultAllowCountLte(Integer matchDefaultAllowCountLte) {
        this.matchDefaultAllowCountLte = matchDefaultAllowCountLte;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE);
        return this;
    }

    public void setMatchDefaultAllowCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE);
        }
    }

    public boolean getMatchDefaultAllowCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNot(
            Integer matchDefaultAllowCountNot) {

        this.matchDefaultAllowCountNot = matchDefaultAllowCountNot;
        return this;
    }

    /**
     * Get matchDefaultAllowCountNot
     *
     * @return matchDefaultAllowCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultAllowCountNot() {
        return matchDefaultAllowCountNot;
    }

    public void setMatchDefaultAllowCountNot(Integer matchDefaultAllowCountNot) {
        this.matchDefaultAllowCountNot = matchDefaultAllowCountNot;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT);
        return this;
    }

    public void setMatchDefaultAllowCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT);
        }
    }

    public boolean getMatchDefaultAllowCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNotIn(
            List<Integer> matchDefaultAllowCountNotIn) {

        this.matchDefaultAllowCountNotIn = matchDefaultAllowCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDefaultAllowCountNotInItem(
            Integer matchDefaultAllowCountNotInItem) {
        if (this.matchDefaultAllowCountNotIn == null) {
            this.matchDefaultAllowCountNotIn = new ArrayList<Integer>();
        }
        this.matchDefaultAllowCountNotIn.add(matchDefaultAllowCountNotInItem);
        return this;
    }

    /**
     * Get matchDefaultAllowCountNotIn
     *
     * @return matchDefaultAllowCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDefaultAllowCountNotIn() {
        return matchDefaultAllowCountNotIn;
    }

    public void setMatchDefaultAllowCountNotIn(List<Integer> matchDefaultAllowCountNotIn) {
        this.matchDefaultAllowCountNotIn = matchDefaultAllowCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultAllowCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN);
        return this;
    }

    public void setMatchDefaultAllowCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN);
        }
    }

    public boolean getMatchDefaultAllowCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCount(Integer matchDefaultDropCount) {

        this.matchDefaultDropCount = matchDefaultDropCount;
        return this;
    }

    /**
     * Get matchDefaultDropCount
     *
     * @return matchDefaultDropCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCount() {
        return matchDefaultDropCount;
    }

    public void setMatchDefaultDropCount(Integer matchDefaultDropCount) {
        this.matchDefaultDropCount = matchDefaultDropCount;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
        return this;
    }

    public void setMatchDefaultDropCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
        }
    }

    public boolean getMatchDefaultDropCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGt(
            Integer matchDefaultDropCountGt) {

        this.matchDefaultDropCountGt = matchDefaultDropCountGt;
        return this;
    }

    /**
     * Get matchDefaultDropCountGt
     *
     * @return matchDefaultDropCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCountGt() {
        return matchDefaultDropCountGt;
    }

    public void setMatchDefaultDropCountGt(Integer matchDefaultDropCountGt) {
        this.matchDefaultDropCountGt = matchDefaultDropCountGt;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT);
        return this;
    }

    public void setMatchDefaultDropCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT);
        }
    }

    public boolean getMatchDefaultDropCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGte(
            Integer matchDefaultDropCountGte) {

        this.matchDefaultDropCountGte = matchDefaultDropCountGte;
        return this;
    }

    /**
     * Get matchDefaultDropCountGte
     *
     * @return matchDefaultDropCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCountGte() {
        return matchDefaultDropCountGte;
    }

    public void setMatchDefaultDropCountGte(Integer matchDefaultDropCountGte) {
        this.matchDefaultDropCountGte = matchDefaultDropCountGte;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE);
        return this;
    }

    public void setMatchDefaultDropCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE);
        }
    }

    public boolean getMatchDefaultDropCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountIn(
            List<Integer> matchDefaultDropCountIn) {

        this.matchDefaultDropCountIn = matchDefaultDropCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDefaultDropCountInItem(
            Integer matchDefaultDropCountInItem) {
        if (this.matchDefaultDropCountIn == null) {
            this.matchDefaultDropCountIn = new ArrayList<Integer>();
        }
        this.matchDefaultDropCountIn.add(matchDefaultDropCountInItem);
        return this;
    }

    /**
     * Get matchDefaultDropCountIn
     *
     * @return matchDefaultDropCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDefaultDropCountIn() {
        return matchDefaultDropCountIn;
    }

    public void setMatchDefaultDropCountIn(List<Integer> matchDefaultDropCountIn) {
        this.matchDefaultDropCountIn = matchDefaultDropCountIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN);
        return this;
    }

    public void setMatchDefaultDropCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN);
        }
    }

    public boolean getMatchDefaultDropCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLt(
            Integer matchDefaultDropCountLt) {

        this.matchDefaultDropCountLt = matchDefaultDropCountLt;
        return this;
    }

    /**
     * Get matchDefaultDropCountLt
     *
     * @return matchDefaultDropCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCountLt() {
        return matchDefaultDropCountLt;
    }

    public void setMatchDefaultDropCountLt(Integer matchDefaultDropCountLt) {
        this.matchDefaultDropCountLt = matchDefaultDropCountLt;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT);
        return this;
    }

    public void setMatchDefaultDropCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT);
        }
    }

    public boolean getMatchDefaultDropCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLte(
            Integer matchDefaultDropCountLte) {

        this.matchDefaultDropCountLte = matchDefaultDropCountLte;
        return this;
    }

    /**
     * Get matchDefaultDropCountLte
     *
     * @return matchDefaultDropCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCountLte() {
        return matchDefaultDropCountLte;
    }

    public void setMatchDefaultDropCountLte(Integer matchDefaultDropCountLte) {
        this.matchDefaultDropCountLte = matchDefaultDropCountLte;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE);
        return this;
    }

    public void setMatchDefaultDropCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE);
        }
    }

    public boolean getMatchDefaultDropCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNot(
            Integer matchDefaultDropCountNot) {

        this.matchDefaultDropCountNot = matchDefaultDropCountNot;
        return this;
    }

    /**
     * Get matchDefaultDropCountNot
     *
     * @return matchDefaultDropCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDefaultDropCountNot() {
        return matchDefaultDropCountNot;
    }

    public void setMatchDefaultDropCountNot(Integer matchDefaultDropCountNot) {
        this.matchDefaultDropCountNot = matchDefaultDropCountNot;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT);
        return this;
    }

    public void setMatchDefaultDropCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT);
        }
    }

    public boolean getMatchDefaultDropCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNotIn(
            List<Integer> matchDefaultDropCountNotIn) {

        this.matchDefaultDropCountNotIn = matchDefaultDropCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDefaultDropCountNotInItem(
            Integer matchDefaultDropCountNotInItem) {
        if (this.matchDefaultDropCountNotIn == null) {
            this.matchDefaultDropCountNotIn = new ArrayList<Integer>();
        }
        this.matchDefaultDropCountNotIn.add(matchDefaultDropCountNotInItem);
        return this;
    }

    /**
     * Get matchDefaultDropCountNotIn
     *
     * @return matchDefaultDropCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDefaultDropCountNotIn() {
        return matchDefaultDropCountNotIn;
    }

    public void setMatchDefaultDropCountNotIn(List<Integer> matchDefaultDropCountNotIn) {
        this.matchDefaultDropCountNotIn = matchDefaultDropCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDefaultDropCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN);
        return this;
    }

    public void setMatchDefaultDropCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN);
        }
    }

    public boolean getMatchDefaultDropCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCount(Integer matchDropCount) {

        this.matchDropCount = matchDropCount;
        return this;
    }

    /**
     * Get matchDropCount
     *
     * @return matchDropCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCount() {
        return matchDropCount;
    }

    public void setMatchDropCount(Integer matchDropCount) {
        this.matchDropCount = matchDropCount;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT);
        return this;
    }

    public void setMatchDropCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT);
        }
    }

    public boolean getMatchDropCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGt(Integer matchDropCountGt) {

        this.matchDropCountGt = matchDropCountGt;
        return this;
    }

    /**
     * Get matchDropCountGt
     *
     * @return matchDropCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCountGt() {
        return matchDropCountGt;
    }

    public void setMatchDropCountGt(Integer matchDropCountGt) {
        this.matchDropCountGt = matchDropCountGt;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_GT);
        return this;
    }

    public void setMatchDropCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_GT);
        }
    }

    public boolean getMatchDropCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGte(Integer matchDropCountGte) {

        this.matchDropCountGte = matchDropCountGte;
        return this;
    }

    /**
     * Get matchDropCountGte
     *
     * @return matchDropCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCountGte() {
        return matchDropCountGte;
    }

    public void setMatchDropCountGte(Integer matchDropCountGte) {
        this.matchDropCountGte = matchDropCountGte;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE);
        return this;
    }

    public void setMatchDropCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE);
        }
    }

    public boolean getMatchDropCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountIn(List<Integer> matchDropCountIn) {

        this.matchDropCountIn = matchDropCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDropCountInItem(
            Integer matchDropCountInItem) {
        if (this.matchDropCountIn == null) {
            this.matchDropCountIn = new ArrayList<Integer>();
        }
        this.matchDropCountIn.add(matchDropCountInItem);
        return this;
    }

    /**
     * Get matchDropCountIn
     *
     * @return matchDropCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDropCountIn() {
        return matchDropCountIn;
    }

    public void setMatchDropCountIn(List<Integer> matchDropCountIn) {
        this.matchDropCountIn = matchDropCountIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_IN);
        return this;
    }

    public void setMatchDropCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_IN);
        }
    }

    public boolean getMatchDropCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLt(Integer matchDropCountLt) {

        this.matchDropCountLt = matchDropCountLt;
        return this;
    }

    /**
     * Get matchDropCountLt
     *
     * @return matchDropCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCountLt() {
        return matchDropCountLt;
    }

    public void setMatchDropCountLt(Integer matchDropCountLt) {
        this.matchDropCountLt = matchDropCountLt;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_LT);
        return this;
    }

    public void setMatchDropCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_LT);
        }
    }

    public boolean getMatchDropCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLte(Integer matchDropCountLte) {

        this.matchDropCountLte = matchDropCountLte;
        return this;
    }

    /**
     * Get matchDropCountLte
     *
     * @return matchDropCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCountLte() {
        return matchDropCountLte;
    }

    public void setMatchDropCountLte(Integer matchDropCountLte) {
        this.matchDropCountLte = matchDropCountLte;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE);
        return this;
    }

    public void setMatchDropCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE);
        }
    }

    public boolean getMatchDropCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNot(Integer matchDropCountNot) {

        this.matchDropCountNot = matchDropCountNot;
        return this;
    }

    /**
     * Get matchDropCountNot
     *
     * @return matchDropCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchDropCountNot() {
        return matchDropCountNot;
    }

    public void setMatchDropCountNot(Integer matchDropCountNot) {
        this.matchDropCountNot = matchDropCountNot;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT);
        return this;
    }

    public void setMatchDropCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT);
        }
    }

    public boolean getMatchDropCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNotIn(
            List<Integer> matchDropCountNotIn) {

        this.matchDropCountNotIn = matchDropCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchDropCountNotInItem(
            Integer matchDropCountNotInItem) {
        if (this.matchDropCountNotIn == null) {
            this.matchDropCountNotIn = new ArrayList<Integer>();
        }
        this.matchDropCountNotIn.add(matchDropCountNotInItem);
        return this;
    }

    /**
     * Get matchDropCountNotIn
     *
     * @return matchDropCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchDropCountNotIn() {
        return matchDropCountNotIn;
    }

    public void setMatchDropCountNotIn(List<Integer> matchDropCountNotIn) {
        this.matchDropCountNotIn = matchDropCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchDropCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN);
        return this;
    }

    public void setMatchDropCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN);
        }
    }

    public boolean getMatchDropCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_DROP_COUNT_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCount(Integer matchWhitelistCount) {

        this.matchWhitelistCount = matchWhitelistCount;
        return this;
    }

    /**
     * Get matchWhitelistCount
     *
     * @return matchWhitelistCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCount() {
        return matchWhitelistCount;
    }

    public void setMatchWhitelistCount(Integer matchWhitelistCount) {
        this.matchWhitelistCount = matchWhitelistCount;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
        return this;
    }

    public void setMatchWhitelistCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
        }
    }

    public boolean getMatchWhitelistCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGt(Integer matchWhitelistCountGt) {

        this.matchWhitelistCountGt = matchWhitelistCountGt;
        return this;
    }

    /**
     * Get matchWhitelistCountGt
     *
     * @return matchWhitelistCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCountGt() {
        return matchWhitelistCountGt;
    }

    public void setMatchWhitelistCountGt(Integer matchWhitelistCountGt) {
        this.matchWhitelistCountGt = matchWhitelistCountGt;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT);
        return this;
    }

    public void setMatchWhitelistCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT);
        }
    }

    public boolean getMatchWhitelistCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGte(
            Integer matchWhitelistCountGte) {

        this.matchWhitelistCountGte = matchWhitelistCountGte;
        return this;
    }

    /**
     * Get matchWhitelistCountGte
     *
     * @return matchWhitelistCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCountGte() {
        return matchWhitelistCountGte;
    }

    public void setMatchWhitelistCountGte(Integer matchWhitelistCountGte) {
        this.matchWhitelistCountGte = matchWhitelistCountGte;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE);
        return this;
    }

    public void setMatchWhitelistCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE);
        }
    }

    public boolean getMatchWhitelistCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountIn(
            List<Integer> matchWhitelistCountIn) {

        this.matchWhitelistCountIn = matchWhitelistCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchWhitelistCountInItem(
            Integer matchWhitelistCountInItem) {
        if (this.matchWhitelistCountIn == null) {
            this.matchWhitelistCountIn = new ArrayList<Integer>();
        }
        this.matchWhitelistCountIn.add(matchWhitelistCountInItem);
        return this;
    }

    /**
     * Get matchWhitelistCountIn
     *
     * @return matchWhitelistCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchWhitelistCountIn() {
        return matchWhitelistCountIn;
    }

    public void setMatchWhitelistCountIn(List<Integer> matchWhitelistCountIn) {
        this.matchWhitelistCountIn = matchWhitelistCountIn;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN);
        return this;
    }

    public void setMatchWhitelistCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN);
        }
    }

    public boolean getMatchWhitelistCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLt(Integer matchWhitelistCountLt) {

        this.matchWhitelistCountLt = matchWhitelistCountLt;
        return this;
    }

    /**
     * Get matchWhitelistCountLt
     *
     * @return matchWhitelistCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCountLt() {
        return matchWhitelistCountLt;
    }

    public void setMatchWhitelistCountLt(Integer matchWhitelistCountLt) {
        this.matchWhitelistCountLt = matchWhitelistCountLt;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT);
        return this;
    }

    public void setMatchWhitelistCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT);
        }
    }

    public boolean getMatchWhitelistCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLte(
            Integer matchWhitelistCountLte) {

        this.matchWhitelistCountLte = matchWhitelistCountLte;
        return this;
    }

    /**
     * Get matchWhitelistCountLte
     *
     * @return matchWhitelistCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCountLte() {
        return matchWhitelistCountLte;
    }

    public void setMatchWhitelistCountLte(Integer matchWhitelistCountLte) {
        this.matchWhitelistCountLte = matchWhitelistCountLte;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE);
        return this;
    }

    public void setMatchWhitelistCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE);
        }
    }

    public boolean getMatchWhitelistCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNot(
            Integer matchWhitelistCountNot) {

        this.matchWhitelistCountNot = matchWhitelistCountNot;
        return this;
    }

    /**
     * Get matchWhitelistCountNot
     *
     * @return matchWhitelistCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMatchWhitelistCountNot() {
        return matchWhitelistCountNot;
    }

    public void setMatchWhitelistCountNot(Integer matchWhitelistCountNot) {
        this.matchWhitelistCountNot = matchWhitelistCountNot;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT);
        return this;
    }

    public void setMatchWhitelistCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT);
        }
    }

    public boolean getMatchWhitelistCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNotIn(
            List<Integer> matchWhitelistCountNotIn) {

        this.matchWhitelistCountNotIn = matchWhitelistCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addMatchWhitelistCountNotInItem(
            Integer matchWhitelistCountNotInItem) {
        if (this.matchWhitelistCountNotIn == null) {
            this.matchWhitelistCountNotIn = new ArrayList<Integer>();
        }
        this.matchWhitelistCountNotIn.add(matchWhitelistCountNotInItem);
        return this;
    }

    /**
     * Get matchWhitelistCountNotIn
     *
     * @return matchWhitelistCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMatchWhitelistCountNotIn() {
        return matchWhitelistCountNotIn;
    }

    public void setMatchWhitelistCountNotIn(List<Integer> matchWhitelistCountNotIn) {
        this.matchWhitelistCountNotIn = matchWhitelistCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput matchWhitelistCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN);
        return this;
    }

    public void setMatchWhitelistCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN);
        }
    }

    public boolean getMatchWhitelistCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MATCH_WHITELIST_COUNT_NOT_IN);
    }

    public SecurityPolicyStatisticsWhereInput totalCount(Integer totalCount) {

        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     *
     * @return totalCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public SecurityPolicyStatisticsWhereInput totalCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT);
        return this;
    }

    public void setTotalCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT);
        }
    }

    public boolean getTotalCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT);
    }

    public SecurityPolicyStatisticsWhereInput totalCountGt(Integer totalCountGt) {

        this.totalCountGt = totalCountGt;
        return this;
    }

    /**
     * Get totalCountGt
     *
     * @return totalCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCountGt() {
        return totalCountGt;
    }

    public void setTotalCountGt(Integer totalCountGt) {
        this.totalCountGt = totalCountGt;
    }

    public SecurityPolicyStatisticsWhereInput totalCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_GT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_GT);
        return this;
    }

    public void setTotalCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_GT);
        }
    }

    public boolean getTotalCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_GT);
    }

    public SecurityPolicyStatisticsWhereInput totalCountGte(Integer totalCountGte) {

        this.totalCountGte = totalCountGte;
        return this;
    }

    /**
     * Get totalCountGte
     *
     * @return totalCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCountGte() {
        return totalCountGte;
    }

    public void setTotalCountGte(Integer totalCountGte) {
        this.totalCountGte = totalCountGte;
    }

    public SecurityPolicyStatisticsWhereInput totalCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_GTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_GTE);
        return this;
    }

    public void setTotalCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_GTE);
        }
    }

    public boolean getTotalCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_GTE);
    }

    public SecurityPolicyStatisticsWhereInput totalCountIn(List<Integer> totalCountIn) {

        this.totalCountIn = totalCountIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addTotalCountInItem(Integer totalCountInItem) {
        if (this.totalCountIn == null) {
            this.totalCountIn = new ArrayList<Integer>();
        }
        this.totalCountIn.add(totalCountInItem);
        return this;
    }

    /**
     * Get totalCountIn
     *
     * @return totalCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCountIn() {
        return totalCountIn;
    }

    public void setTotalCountIn(List<Integer> totalCountIn) {
        this.totalCountIn = totalCountIn;
    }

    public SecurityPolicyStatisticsWhereInput totalCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_IN);
        return this;
    }

    public void setTotalCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_IN);
        }
    }

    public boolean getTotalCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_IN);
    }

    public SecurityPolicyStatisticsWhereInput totalCountLt(Integer totalCountLt) {

        this.totalCountLt = totalCountLt;
        return this;
    }

    /**
     * Get totalCountLt
     *
     * @return totalCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCountLt() {
        return totalCountLt;
    }

    public void setTotalCountLt(Integer totalCountLt) {
        this.totalCountLt = totalCountLt;
    }

    public SecurityPolicyStatisticsWhereInput totalCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_LT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_LT);
        return this;
    }

    public void setTotalCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_LT);
        }
    }

    public boolean getTotalCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_LT);
    }

    public SecurityPolicyStatisticsWhereInput totalCountLte(Integer totalCountLte) {

        this.totalCountLte = totalCountLte;
        return this;
    }

    /**
     * Get totalCountLte
     *
     * @return totalCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCountLte() {
        return totalCountLte;
    }

    public void setTotalCountLte(Integer totalCountLte) {
        this.totalCountLte = totalCountLte;
    }

    public SecurityPolicyStatisticsWhereInput totalCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_LTE);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_LTE);
        return this;
    }

    public void setTotalCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_LTE);
        }
    }

    public boolean getTotalCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_LTE);
    }

    public SecurityPolicyStatisticsWhereInput totalCountNot(Integer totalCountNot) {

        this.totalCountNot = totalCountNot;
        return this;
    }

    /**
     * Get totalCountNot
     *
     * @return totalCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCountNot() {
        return totalCountNot;
    }

    public void setTotalCountNot(Integer totalCountNot) {
        this.totalCountNot = totalCountNot;
    }

    public SecurityPolicyStatisticsWhereInput totalCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_NOT);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_NOT);
        return this;
    }

    public void setTotalCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_NOT);
        }
    }

    public boolean getTotalCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_NOT);
    }

    public SecurityPolicyStatisticsWhereInput totalCountNotIn(List<Integer> totalCountNotIn) {

        this.totalCountNotIn = totalCountNotIn;
        return this;
    }

    public SecurityPolicyStatisticsWhereInput addTotalCountNotInItem(Integer totalCountNotInItem) {
        if (this.totalCountNotIn == null) {
            this.totalCountNotIn = new ArrayList<Integer>();
        }
        this.totalCountNotIn.add(totalCountNotInItem);
        return this;
    }

    /**
     * Get totalCountNotIn
     *
     * @return totalCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCountNotIn() {
        return totalCountNotIn;
    }

    public void setTotalCountNotIn(List<Integer> totalCountNotIn) {
        this.totalCountNotIn = totalCountNotIn;
    }

    public SecurityPolicyStatisticsWhereInput totalCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN);
        return this;
    }

    public SecurityPolicyStatisticsWhereInput totalCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN);
        return this;
    }

    public void setTotalCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN);
        }
    }

    public boolean getTotalCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_COUNT_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicyStatisticsWhereInput securityPolicyStatisticsWhereInput =
                (SecurityPolicyStatisticsWhereInput) o;
        return Objects.equals(this.AND, securityPolicyStatisticsWhereInput.AND)
                && Objects.equals(this.NOT, securityPolicyStatisticsWhereInput.NOT)
                && Objects.equals(this.OR, securityPolicyStatisticsWhereInput.OR)
                && Objects.equals(
                        this.countResetTimestamp,
                        securityPolicyStatisticsWhereInput.countResetTimestamp)
                && Objects.equals(
                        this.countResetTimestampGt,
                        securityPolicyStatisticsWhereInput.countResetTimestampGt)
                && Objects.equals(
                        this.countResetTimestampGte,
                        securityPolicyStatisticsWhereInput.countResetTimestampGte)
                && Objects.equals(
                        this.countResetTimestampIn,
                        securityPolicyStatisticsWhereInput.countResetTimestampIn)
                && Objects.equals(
                        this.countResetTimestampLt,
                        securityPolicyStatisticsWhereInput.countResetTimestampLt)
                && Objects.equals(
                        this.countResetTimestampLte,
                        securityPolicyStatisticsWhereInput.countResetTimestampLte)
                && Objects.equals(
                        this.countResetTimestampNot,
                        securityPolicyStatisticsWhereInput.countResetTimestampNot)
                && Objects.equals(
                        this.countResetTimestampNotIn,
                        securityPolicyStatisticsWhereInput.countResetTimestampNotIn)
                && Objects.equals(
                        this.countUpdateTimestamp,
                        securityPolicyStatisticsWhereInput.countUpdateTimestamp)
                && Objects.equals(
                        this.countUpdateTimestampGt,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampGt)
                && Objects.equals(
                        this.countUpdateTimestampGte,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampGte)
                && Objects.equals(
                        this.countUpdateTimestampIn,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampIn)
                && Objects.equals(
                        this.countUpdateTimestampLt,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampLt)
                && Objects.equals(
                        this.countUpdateTimestampLte,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampLte)
                && Objects.equals(
                        this.countUpdateTimestampNot,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampNot)
                && Objects.equals(
                        this.countUpdateTimestampNotIn,
                        securityPolicyStatisticsWhereInput.countUpdateTimestampNotIn)
                && Objects.equals(this.id, securityPolicyStatisticsWhereInput.id)
                && Objects.equals(this.idContains, securityPolicyStatisticsWhereInput.idContains)
                && Objects.equals(this.idEndsWith, securityPolicyStatisticsWhereInput.idEndsWith)
                && Objects.equals(this.idGt, securityPolicyStatisticsWhereInput.idGt)
                && Objects.equals(this.idGte, securityPolicyStatisticsWhereInput.idGte)
                && Objects.equals(this.idIn, securityPolicyStatisticsWhereInput.idIn)
                && Objects.equals(this.idLt, securityPolicyStatisticsWhereInput.idLt)
                && Objects.equals(this.idLte, securityPolicyStatisticsWhereInput.idLte)
                && Objects.equals(this.idNot, securityPolicyStatisticsWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, securityPolicyStatisticsWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, securityPolicyStatisticsWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, securityPolicyStatisticsWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, securityPolicyStatisticsWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, securityPolicyStatisticsWhereInput.idStartsWith)
                && Objects.equals(this.localId, securityPolicyStatisticsWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, securityPolicyStatisticsWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, securityPolicyStatisticsWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, securityPolicyStatisticsWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, securityPolicyStatisticsWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, securityPolicyStatisticsWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, securityPolicyStatisticsWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, securityPolicyStatisticsWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, securityPolicyStatisticsWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        securityPolicyStatisticsWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        securityPolicyStatisticsWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, securityPolicyStatisticsWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        securityPolicyStatisticsWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        securityPolicyStatisticsWhereInput.localIdStartsWith)
                && Objects.equals(
                        this.matchAllowCount, securityPolicyStatisticsWhereInput.matchAllowCount)
                && Objects.equals(
                        this.matchAllowCountGt,
                        securityPolicyStatisticsWhereInput.matchAllowCountGt)
                && Objects.equals(
                        this.matchAllowCountGte,
                        securityPolicyStatisticsWhereInput.matchAllowCountGte)
                && Objects.equals(
                        this.matchAllowCountIn,
                        securityPolicyStatisticsWhereInput.matchAllowCountIn)
                && Objects.equals(
                        this.matchAllowCountLt,
                        securityPolicyStatisticsWhereInput.matchAllowCountLt)
                && Objects.equals(
                        this.matchAllowCountLte,
                        securityPolicyStatisticsWhereInput.matchAllowCountLte)
                && Objects.equals(
                        this.matchAllowCountNot,
                        securityPolicyStatisticsWhereInput.matchAllowCountNot)
                && Objects.equals(
                        this.matchAllowCountNotIn,
                        securityPolicyStatisticsWhereInput.matchAllowCountNotIn)
                && Objects.equals(
                        this.matchDefaultAllowCount,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCount)
                && Objects.equals(
                        this.matchDefaultAllowCountGt,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountGt)
                && Objects.equals(
                        this.matchDefaultAllowCountGte,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountGte)
                && Objects.equals(
                        this.matchDefaultAllowCountIn,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountIn)
                && Objects.equals(
                        this.matchDefaultAllowCountLt,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountLt)
                && Objects.equals(
                        this.matchDefaultAllowCountLte,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountLte)
                && Objects.equals(
                        this.matchDefaultAllowCountNot,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountNot)
                && Objects.equals(
                        this.matchDefaultAllowCountNotIn,
                        securityPolicyStatisticsWhereInput.matchDefaultAllowCountNotIn)
                && Objects.equals(
                        this.matchDefaultDropCount,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCount)
                && Objects.equals(
                        this.matchDefaultDropCountGt,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountGt)
                && Objects.equals(
                        this.matchDefaultDropCountGte,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountGte)
                && Objects.equals(
                        this.matchDefaultDropCountIn,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountIn)
                && Objects.equals(
                        this.matchDefaultDropCountLt,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountLt)
                && Objects.equals(
                        this.matchDefaultDropCountLte,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountLte)
                && Objects.equals(
                        this.matchDefaultDropCountNot,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountNot)
                && Objects.equals(
                        this.matchDefaultDropCountNotIn,
                        securityPolicyStatisticsWhereInput.matchDefaultDropCountNotIn)
                && Objects.equals(
                        this.matchDropCount, securityPolicyStatisticsWhereInput.matchDropCount)
                && Objects.equals(
                        this.matchDropCountGt, securityPolicyStatisticsWhereInput.matchDropCountGt)
                && Objects.equals(
                        this.matchDropCountGte,
                        securityPolicyStatisticsWhereInput.matchDropCountGte)
                && Objects.equals(
                        this.matchDropCountIn, securityPolicyStatisticsWhereInput.matchDropCountIn)
                && Objects.equals(
                        this.matchDropCountLt, securityPolicyStatisticsWhereInput.matchDropCountLt)
                && Objects.equals(
                        this.matchDropCountLte,
                        securityPolicyStatisticsWhereInput.matchDropCountLte)
                && Objects.equals(
                        this.matchDropCountNot,
                        securityPolicyStatisticsWhereInput.matchDropCountNot)
                && Objects.equals(
                        this.matchDropCountNotIn,
                        securityPolicyStatisticsWhereInput.matchDropCountNotIn)
                && Objects.equals(
                        this.matchWhitelistCount,
                        securityPolicyStatisticsWhereInput.matchWhitelistCount)
                && Objects.equals(
                        this.matchWhitelistCountGt,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountGt)
                && Objects.equals(
                        this.matchWhitelistCountGte,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountGte)
                && Objects.equals(
                        this.matchWhitelistCountIn,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountIn)
                && Objects.equals(
                        this.matchWhitelistCountLt,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountLt)
                && Objects.equals(
                        this.matchWhitelistCountLte,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountLte)
                && Objects.equals(
                        this.matchWhitelistCountNot,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountNot)
                && Objects.equals(
                        this.matchWhitelistCountNotIn,
                        securityPolicyStatisticsWhereInput.matchWhitelistCountNotIn)
                && Objects.equals(this.totalCount, securityPolicyStatisticsWhereInput.totalCount)
                && Objects.equals(
                        this.totalCountGt, securityPolicyStatisticsWhereInput.totalCountGt)
                && Objects.equals(
                        this.totalCountGte, securityPolicyStatisticsWhereInput.totalCountGte)
                && Objects.equals(
                        this.totalCountIn, securityPolicyStatisticsWhereInput.totalCountIn)
                && Objects.equals(
                        this.totalCountLt, securityPolicyStatisticsWhereInput.totalCountLt)
                && Objects.equals(
                        this.totalCountLte, securityPolicyStatisticsWhereInput.totalCountLte)
                && Objects.equals(
                        this.totalCountNot, securityPolicyStatisticsWhereInput.totalCountNot)
                && Objects.equals(
                        this.totalCountNotIn, securityPolicyStatisticsWhereInput.totalCountNotIn);
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
                countResetTimestamp,
                countResetTimestampGt,
                countResetTimestampGte,
                countResetTimestampIn,
                countResetTimestampLt,
                countResetTimestampLte,
                countResetTimestampNot,
                countResetTimestampNotIn,
                countUpdateTimestamp,
                countUpdateTimestampGt,
                countUpdateTimestampGte,
                countUpdateTimestampIn,
                countUpdateTimestampLt,
                countUpdateTimestampLte,
                countUpdateTimestampNot,
                countUpdateTimestampNotIn,
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
                matchAllowCount,
                matchAllowCountGt,
                matchAllowCountGte,
                matchAllowCountIn,
                matchAllowCountLt,
                matchAllowCountLte,
                matchAllowCountNot,
                matchAllowCountNotIn,
                matchDefaultAllowCount,
                matchDefaultAllowCountGt,
                matchDefaultAllowCountGte,
                matchDefaultAllowCountIn,
                matchDefaultAllowCountLt,
                matchDefaultAllowCountLte,
                matchDefaultAllowCountNot,
                matchDefaultAllowCountNotIn,
                matchDefaultDropCount,
                matchDefaultDropCountGt,
                matchDefaultDropCountGte,
                matchDefaultDropCountIn,
                matchDefaultDropCountLt,
                matchDefaultDropCountLte,
                matchDefaultDropCountNot,
                matchDefaultDropCountNotIn,
                matchDropCount,
                matchDropCountGt,
                matchDropCountGte,
                matchDropCountIn,
                matchDropCountLt,
                matchDropCountLte,
                matchDropCountNot,
                matchDropCountNotIn,
                matchWhitelistCount,
                matchWhitelistCountGt,
                matchWhitelistCountGte,
                matchWhitelistCountIn,
                matchWhitelistCountLt,
                matchWhitelistCountLte,
                matchWhitelistCountNot,
                matchWhitelistCountNotIn,
                totalCount,
                totalCountGt,
                totalCountGte,
                totalCountIn,
                totalCountLt,
                totalCountLte,
                totalCountNot,
                totalCountNotIn);
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
        sb.append("class SecurityPolicyStatisticsWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    countResetTimestamp: ")
                .append(toIndentedString(countResetTimestamp))
                .append("\n");
        sb.append("    countResetTimestampGt: ")
                .append(toIndentedString(countResetTimestampGt))
                .append("\n");
        sb.append("    countResetTimestampGte: ")
                .append(toIndentedString(countResetTimestampGte))
                .append("\n");
        sb.append("    countResetTimestampIn: ")
                .append(toIndentedString(countResetTimestampIn))
                .append("\n");
        sb.append("    countResetTimestampLt: ")
                .append(toIndentedString(countResetTimestampLt))
                .append("\n");
        sb.append("    countResetTimestampLte: ")
                .append(toIndentedString(countResetTimestampLte))
                .append("\n");
        sb.append("    countResetTimestampNot: ")
                .append(toIndentedString(countResetTimestampNot))
                .append("\n");
        sb.append("    countResetTimestampNotIn: ")
                .append(toIndentedString(countResetTimestampNotIn))
                .append("\n");
        sb.append("    countUpdateTimestamp: ")
                .append(toIndentedString(countUpdateTimestamp))
                .append("\n");
        sb.append("    countUpdateTimestampGt: ")
                .append(toIndentedString(countUpdateTimestampGt))
                .append("\n");
        sb.append("    countUpdateTimestampGte: ")
                .append(toIndentedString(countUpdateTimestampGte))
                .append("\n");
        sb.append("    countUpdateTimestampIn: ")
                .append(toIndentedString(countUpdateTimestampIn))
                .append("\n");
        sb.append("    countUpdateTimestampLt: ")
                .append(toIndentedString(countUpdateTimestampLt))
                .append("\n");
        sb.append("    countUpdateTimestampLte: ")
                .append(toIndentedString(countUpdateTimestampLte))
                .append("\n");
        sb.append("    countUpdateTimestampNot: ")
                .append(toIndentedString(countUpdateTimestampNot))
                .append("\n");
        sb.append("    countUpdateTimestampNotIn: ")
                .append(toIndentedString(countUpdateTimestampNotIn))
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
        sb.append("    matchAllowCount: ").append(toIndentedString(matchAllowCount)).append("\n");
        sb.append("    matchAllowCountGt: ")
                .append(toIndentedString(matchAllowCountGt))
                .append("\n");
        sb.append("    matchAllowCountGte: ")
                .append(toIndentedString(matchAllowCountGte))
                .append("\n");
        sb.append("    matchAllowCountIn: ")
                .append(toIndentedString(matchAllowCountIn))
                .append("\n");
        sb.append("    matchAllowCountLt: ")
                .append(toIndentedString(matchAllowCountLt))
                .append("\n");
        sb.append("    matchAllowCountLte: ")
                .append(toIndentedString(matchAllowCountLte))
                .append("\n");
        sb.append("    matchAllowCountNot: ")
                .append(toIndentedString(matchAllowCountNot))
                .append("\n");
        sb.append("    matchAllowCountNotIn: ")
                .append(toIndentedString(matchAllowCountNotIn))
                .append("\n");
        sb.append("    matchDefaultAllowCount: ")
                .append(toIndentedString(matchDefaultAllowCount))
                .append("\n");
        sb.append("    matchDefaultAllowCountGt: ")
                .append(toIndentedString(matchDefaultAllowCountGt))
                .append("\n");
        sb.append("    matchDefaultAllowCountGte: ")
                .append(toIndentedString(matchDefaultAllowCountGte))
                .append("\n");
        sb.append("    matchDefaultAllowCountIn: ")
                .append(toIndentedString(matchDefaultAllowCountIn))
                .append("\n");
        sb.append("    matchDefaultAllowCountLt: ")
                .append(toIndentedString(matchDefaultAllowCountLt))
                .append("\n");
        sb.append("    matchDefaultAllowCountLte: ")
                .append(toIndentedString(matchDefaultAllowCountLte))
                .append("\n");
        sb.append("    matchDefaultAllowCountNot: ")
                .append(toIndentedString(matchDefaultAllowCountNot))
                .append("\n");
        sb.append("    matchDefaultAllowCountNotIn: ")
                .append(toIndentedString(matchDefaultAllowCountNotIn))
                .append("\n");
        sb.append("    matchDefaultDropCount: ")
                .append(toIndentedString(matchDefaultDropCount))
                .append("\n");
        sb.append("    matchDefaultDropCountGt: ")
                .append(toIndentedString(matchDefaultDropCountGt))
                .append("\n");
        sb.append("    matchDefaultDropCountGte: ")
                .append(toIndentedString(matchDefaultDropCountGte))
                .append("\n");
        sb.append("    matchDefaultDropCountIn: ")
                .append(toIndentedString(matchDefaultDropCountIn))
                .append("\n");
        sb.append("    matchDefaultDropCountLt: ")
                .append(toIndentedString(matchDefaultDropCountLt))
                .append("\n");
        sb.append("    matchDefaultDropCountLte: ")
                .append(toIndentedString(matchDefaultDropCountLte))
                .append("\n");
        sb.append("    matchDefaultDropCountNot: ")
                .append(toIndentedString(matchDefaultDropCountNot))
                .append("\n");
        sb.append("    matchDefaultDropCountNotIn: ")
                .append(toIndentedString(matchDefaultDropCountNotIn))
                .append("\n");
        sb.append("    matchDropCount: ").append(toIndentedString(matchDropCount)).append("\n");
        sb.append("    matchDropCountGt: ").append(toIndentedString(matchDropCountGt)).append("\n");
        sb.append("    matchDropCountGte: ")
                .append(toIndentedString(matchDropCountGte))
                .append("\n");
        sb.append("    matchDropCountIn: ").append(toIndentedString(matchDropCountIn)).append("\n");
        sb.append("    matchDropCountLt: ").append(toIndentedString(matchDropCountLt)).append("\n");
        sb.append("    matchDropCountLte: ")
                .append(toIndentedString(matchDropCountLte))
                .append("\n");
        sb.append("    matchDropCountNot: ")
                .append(toIndentedString(matchDropCountNot))
                .append("\n");
        sb.append("    matchDropCountNotIn: ")
                .append(toIndentedString(matchDropCountNotIn))
                .append("\n");
        sb.append("    matchWhitelistCount: ")
                .append(toIndentedString(matchWhitelistCount))
                .append("\n");
        sb.append("    matchWhitelistCountGt: ")
                .append(toIndentedString(matchWhitelistCountGt))
                .append("\n");
        sb.append("    matchWhitelistCountGte: ")
                .append(toIndentedString(matchWhitelistCountGte))
                .append("\n");
        sb.append("    matchWhitelistCountIn: ")
                .append(toIndentedString(matchWhitelistCountIn))
                .append("\n");
        sb.append("    matchWhitelistCountLt: ")
                .append(toIndentedString(matchWhitelistCountLt))
                .append("\n");
        sb.append("    matchWhitelistCountLte: ")
                .append(toIndentedString(matchWhitelistCountLte))
                .append("\n");
        sb.append("    matchWhitelistCountNot: ")
                .append(toIndentedString(matchWhitelistCountNot))
                .append("\n");
        sb.append("    matchWhitelistCountNotIn: ")
                .append(toIndentedString(matchWhitelistCountNotIn))
                .append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalCountGt: ").append(toIndentedString(totalCountGt)).append("\n");
        sb.append("    totalCountGte: ").append(toIndentedString(totalCountGte)).append("\n");
        sb.append("    totalCountIn: ").append(toIndentedString(totalCountIn)).append("\n");
        sb.append("    totalCountLt: ").append(toIndentedString(totalCountLt)).append("\n");
        sb.append("    totalCountLte: ").append(toIndentedString(totalCountLte)).append("\n");
        sb.append("    totalCountNot: ").append(toIndentedString(totalCountNot)).append("\n");
        sb.append("    totalCountNotIn: ").append(toIndentedString(totalCountNotIn)).append("\n");
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
