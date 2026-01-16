package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetEverouteClustersConnectionRequestBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetEverouteClustersConnectionRequestBody
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
    private EverouteClusterOrderByInput orderBy;

    public static final String SERIALIZED_NAME_SKIP = "skip";

    @SerializedName(SERIALIZED_NAME_SKIP)
    private Integer skip;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private EverouteClusterWhereInput where;

    public GetEverouteClustersConnectionRequestBody() {}

    public GetEverouteClustersConnectionRequestBody after(String after) {

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

    public GetEverouteClustersConnectionRequestBody after_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AFTER);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody after_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody before(String before) {

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

    public GetEverouteClustersConnectionRequestBody before_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BEFORE);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody before_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody first(Integer first) {

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

    public GetEverouteClustersConnectionRequestBody first_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRST);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody first_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody last(Integer last) {

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

    public GetEverouteClustersConnectionRequestBody last_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody last_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody orderBy(EverouteClusterOrderByInput orderBy) {

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
    public EverouteClusterOrderByInput getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(EverouteClusterOrderByInput orderBy) {
        this.orderBy = orderBy;
    }

    public GetEverouteClustersConnectionRequestBody orderBy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_BY);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody orderBy_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody skip(Integer skip) {

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

    public GetEverouteClustersConnectionRequestBody skip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SKIP);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody skip_ExplictlyNonNull() {
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

    public GetEverouteClustersConnectionRequestBody where(EverouteClusterWhereInput where) {

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
    public EverouteClusterWhereInput getWhere() {
        return where;
    }

    public void setWhere(EverouteClusterWhereInput where) {
        this.where = where;
    }

    public GetEverouteClustersConnectionRequestBody where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public GetEverouteClustersConnectionRequestBody where_ExplictlyNonNull() {
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
        GetEverouteClustersConnectionRequestBody getEverouteClustersConnectionRequestBody =
                (GetEverouteClustersConnectionRequestBody) o;
        return Objects.equals(this.after, getEverouteClustersConnectionRequestBody.after)
                && Objects.equals(this.before, getEverouteClustersConnectionRequestBody.before)
                && Objects.equals(this.first, getEverouteClustersConnectionRequestBody.first)
                && Objects.equals(this.last, getEverouteClustersConnectionRequestBody.last)
                && Objects.equals(this.orderBy, getEverouteClustersConnectionRequestBody.orderBy)
                && Objects.equals(this.skip, getEverouteClustersConnectionRequestBody.skip)
                && Objects.equals(this.where, getEverouteClustersConnectionRequestBody.where);
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
        sb.append("class GetEverouteClustersConnectionRequestBody {\n");
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
