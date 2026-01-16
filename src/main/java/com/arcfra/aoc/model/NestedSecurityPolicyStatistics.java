package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedSecurityPolicyStatistics */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedSecurityPolicyStatistics
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COUNT_RESET_TIMESTAMP = "count_reset_timestamp";

    @SerializedName(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP)
    private String countResetTimestamp;

    public static final String SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP = "count_update_timestamp";

    @SerializedName(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP)
    private String countUpdateTimestamp;

    public static final String SERIALIZED_NAME_MATCH_ALLOW_COUNT = "match_allow_count";

    @SerializedName(SERIALIZED_NAME_MATCH_ALLOW_COUNT)
    private Integer matchAllowCount;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT =
            "match_default_allow_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT)
    private Integer matchDefaultAllowCount;

    public static final String SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT =
            "match_default_drop_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT)
    private Integer matchDefaultDropCount;

    public static final String SERIALIZED_NAME_MATCH_DROP_COUNT = "match_drop_count";

    @SerializedName(SERIALIZED_NAME_MATCH_DROP_COUNT)
    private Integer matchDropCount;

    public static final String SERIALIZED_NAME_MATCH_WHITELIST_COUNT = "match_whitelist_count";

    @SerializedName(SERIALIZED_NAME_MATCH_WHITELIST_COUNT)
    private Integer matchWhitelistCount;

    public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
    private Integer totalCount;

    public NestedSecurityPolicyStatistics() {}

    public NestedSecurityPolicyStatistics countResetTimestamp(String countResetTimestamp) {

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

    public NestedSecurityPolicyStatistics countResetTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_RESET_TIMESTAMP);
        return this;
    }

    public NestedSecurityPolicyStatistics countResetTimestamp_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics countUpdateTimestamp(String countUpdateTimestamp) {

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

    public NestedSecurityPolicyStatistics countUpdateTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT_UPDATE_TIMESTAMP);
        return this;
    }

    public NestedSecurityPolicyStatistics countUpdateTimestamp_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics matchAllowCount(Integer matchAllowCount) {

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

    public NestedSecurityPolicyStatistics matchAllowCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_ALLOW_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics matchAllowCount_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics matchDefaultAllowCount(Integer matchDefaultAllowCount) {

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

    public NestedSecurityPolicyStatistics matchDefaultAllowCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_ALLOW_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics matchDefaultAllowCount_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics matchDefaultDropCount(Integer matchDefaultDropCount) {

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

    public NestedSecurityPolicyStatistics matchDefaultDropCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DEFAULT_DROP_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics matchDefaultDropCount_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics matchDropCount(Integer matchDropCount) {

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

    public NestedSecurityPolicyStatistics matchDropCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_DROP_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics matchDropCount_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics matchWhitelistCount(Integer matchWhitelistCount) {

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

    public NestedSecurityPolicyStatistics matchWhitelistCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MATCH_WHITELIST_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics matchWhitelistCount_ExplictlyNonNull() {
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

    public NestedSecurityPolicyStatistics totalCount(Integer totalCount) {

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

    public NestedSecurityPolicyStatistics totalCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_COUNT);
        return this;
    }

    public NestedSecurityPolicyStatistics totalCount_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedSecurityPolicyStatistics nestedSecurityPolicyStatistics =
                (NestedSecurityPolicyStatistics) o;
        return Objects.equals(
                        this.countResetTimestamp,
                        nestedSecurityPolicyStatistics.countResetTimestamp)
                && Objects.equals(
                        this.countUpdateTimestamp,
                        nestedSecurityPolicyStatistics.countUpdateTimestamp)
                && Objects.equals(
                        this.matchAllowCount, nestedSecurityPolicyStatistics.matchAllowCount)
                && Objects.equals(
                        this.matchDefaultAllowCount,
                        nestedSecurityPolicyStatistics.matchDefaultAllowCount)
                && Objects.equals(
                        this.matchDefaultDropCount,
                        nestedSecurityPolicyStatistics.matchDefaultDropCount)
                && Objects.equals(
                        this.matchDropCount, nestedSecurityPolicyStatistics.matchDropCount)
                && Objects.equals(
                        this.matchWhitelistCount,
                        nestedSecurityPolicyStatistics.matchWhitelistCount)
                && Objects.equals(this.totalCount, nestedSecurityPolicyStatistics.totalCount);
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
                countResetTimestamp,
                countUpdateTimestamp,
                matchAllowCount,
                matchDefaultAllowCount,
                matchDefaultDropCount,
                matchDropCount,
                matchWhitelistCount,
                totalCount);
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
        sb.append("class NestedSecurityPolicyStatistics {\n");
        sb.append("    countResetTimestamp: ")
                .append(toIndentedString(countResetTimestamp))
                .append("\n");
        sb.append("    countUpdateTimestamp: ")
                .append(toIndentedString(countUpdateTimestamp))
                .append("\n");
        sb.append("    matchAllowCount: ").append(toIndentedString(matchAllowCount)).append("\n");
        sb.append("    matchDefaultAllowCount: ")
                .append(toIndentedString(matchDefaultAllowCount))
                .append("\n");
        sb.append("    matchDefaultDropCount: ")
                .append(toIndentedString(matchDefaultDropCount))
                .append("\n");
        sb.append("    matchDropCount: ").append(toIndentedString(matchDropCount)).append("\n");
        sb.append("    matchWhitelistCount: ")
                .append(toIndentedString(matchWhitelistCount))
                .append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
