package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetSecurityGroupsConnectionRequestBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetSecurityGroupsConnectionRequestBody
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AFTER = "after";

    @SerializedName(SERIALIZED_NAME_AFTER)
    private String after;

    public static final String SERIALIZED_NAME_BEFORE = "before";

    @SerializedName(SERIALIZED_NAME_BEFORE)
    private String before;

    public static final String SERIALIZED_NAME_FIRST = "first";

    @SerializedName(SERIALIZED_NAME_FIRST)
    private Integer first;

    public static final String SERIALIZED_NAME_LAST = "last";

    @SerializedName(SERIALIZED_NAME_LAST)
    private Integer last;

    public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";

    @SerializedName(SERIALIZED_NAME_ORDER_BY)
    private SecurityGroupOrderByInput orderBy;

    public static final String SERIALIZED_NAME_SKIP = "skip";

    @SerializedName(SERIALIZED_NAME_SKIP)
    private Integer skip;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private SecurityGroupWhereInput where;

    public GetSecurityGroupsConnectionRequestBody() {}

    public GetSecurityGroupsConnectionRequestBody after(String after) {

        this.after = after;
        return this;
    }

    /**
     * Get after
     *
     * @return after
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public GetSecurityGroupsConnectionRequestBody after_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AFTER);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody after_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AFTER);
        return this;
    }

    public void setAfter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AFTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AFTER);
        }
    }

    public boolean getAfter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AFTER);
    }

    public GetSecurityGroupsConnectionRequestBody before(String before) {

        this.before = before;
        return this;
    }

    /**
     * Get before
     *
     * @return before
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public GetSecurityGroupsConnectionRequestBody before_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BEFORE);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody before_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BEFORE);
        return this;
    }

    public void setBefore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BEFORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BEFORE);
        }
    }

    public boolean getBefore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BEFORE);
    }

    public GetSecurityGroupsConnectionRequestBody first(Integer first) {

        this.first = first;
        return this;
    }

    /**
     * Get first
     *
     * @return first
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public GetSecurityGroupsConnectionRequestBody first_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRST);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody first_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRST);
        return this;
    }

    public void setFirst_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRST);
        }
    }

    public boolean getFirst_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRST);
    }

    public GetSecurityGroupsConnectionRequestBody last(Integer last) {

        this.last = last;
        return this;
    }

    /**
     * Get last
     *
     * @return last
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public GetSecurityGroupsConnectionRequestBody last_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody last_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST);
        return this;
    }

    public void setLast_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST);
        }
    }

    public boolean getLast_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST);
    }

    public GetSecurityGroupsConnectionRequestBody orderBy(SecurityGroupOrderByInput orderBy) {

        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get orderBy
     *
     * @return orderBy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityGroupOrderByInput getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(SecurityGroupOrderByInput orderBy) {
        this.orderBy = orderBy;
    }

    public GetSecurityGroupsConnectionRequestBody orderBy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_BY);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody orderBy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_BY);
        return this;
    }

    public void setOrderBy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_BY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_BY);
        }
    }

    public boolean getOrderBy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_BY);
    }

    public GetSecurityGroupsConnectionRequestBody skip(Integer skip) {

        this.skip = skip;
        return this;
    }

    /**
     * Get skip
     *
     * @return skip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public GetSecurityGroupsConnectionRequestBody skip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SKIP);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody skip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SKIP);
        return this;
    }

    public void setSkip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SKIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SKIP);
        }
    }

    public boolean getSkip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SKIP);
    }

    public GetSecurityGroupsConnectionRequestBody where(SecurityGroupWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityGroupWhereInput getWhere() {
        return where;
    }

    public void setWhere(SecurityGroupWhereInput where) {
        this.where = where;
    }

    public GetSecurityGroupsConnectionRequestBody where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public GetSecurityGroupsConnectionRequestBody where_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        return this;
    }

    public void setWhere_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHERE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        }
    }

    public boolean getWhere_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHERE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSecurityGroupsConnectionRequestBody getSecurityGroupsConnectionRequestBody =
                (GetSecurityGroupsConnectionRequestBody) o;
        return Objects.equals(this.after, getSecurityGroupsConnectionRequestBody.after)
                && Objects.equals(this.before, getSecurityGroupsConnectionRequestBody.before)
                && Objects.equals(this.first, getSecurityGroupsConnectionRequestBody.first)
                && Objects.equals(this.last, getSecurityGroupsConnectionRequestBody.last)
                && Objects.equals(this.orderBy, getSecurityGroupsConnectionRequestBody.orderBy)
                && Objects.equals(this.skip, getSecurityGroupsConnectionRequestBody.skip)
                && Objects.equals(this.where, getSecurityGroupsConnectionRequestBody.where);
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
        return Objects.hash(after, before, first, last, orderBy, skip, where);
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
        sb.append("class GetSecurityGroupsConnectionRequestBody {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    last: ").append(toIndentedString(last)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
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
