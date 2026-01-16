package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NestedMetroCheckResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMetroCheckResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CRITICAL = "critical";

    @SerializedName(SERIALIZED_NAME_CRITICAL)
    private Integer critical;

    public static final String SERIALIZED_NAME_INFO = "info";

    @SerializedName(SERIALIZED_NAME_INFO)
    private Integer info;

    public static final String SERIALIZED_NAME_ITEMS = "items";

    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<NestedMetroCheckItem> items = new ArrayList<NestedMetroCheckItem>();

    public static final String SERIALIZED_NAME_NOTICE = "notice";

    @SerializedName(SERIALIZED_NAME_NOTICE)
    private Integer notice;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private MetroCheckStatusEnum status;

    public NestedMetroCheckResult() {}

    public NestedMetroCheckResult critical(Integer critical) {

        this.critical = critical;
        return this;
    }

    /**
     * Get critical
     *
     * @return critical
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public NestedMetroCheckResult critical_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CRITICAL);
        return this;
    }

    public NestedMetroCheckResult critical_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CRITICAL);
        return this;
    }

    public void setCritical_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CRITICAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CRITICAL);
        }
    }

    public boolean getCritical_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CRITICAL);
    }

    public NestedMetroCheckResult info(Integer info) {

        this.info = info;
        return this;
    }

    /**
     * Get info
     *
     * @return info
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public NestedMetroCheckResult info_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INFO);
        return this;
    }

    public NestedMetroCheckResult info_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INFO);
        return this;
    }

    public void setInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INFO);
        }
    }

    public boolean getInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INFO);
    }

    public NestedMetroCheckResult items(List<NestedMetroCheckItem> items) {

        this.items = items;
        return this;
    }

    public NestedMetroCheckResult addItemsItem(NestedMetroCheckItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     *
     * @return items
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedMetroCheckItem> getItems() {
        return items;
    }

    public void setItems(List<NestedMetroCheckItem> items) {
        this.items = items;
    }

    public NestedMetroCheckResult items_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ITEMS);
        return this;
    }

    public NestedMetroCheckResult items_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ITEMS);
        return this;
    }

    public void setItems_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ITEMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ITEMS);
        }
    }

    public boolean getItems_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ITEMS);
    }

    public NestedMetroCheckResult notice(Integer notice) {

        this.notice = notice;
        return this;
    }

    /**
     * Get notice
     *
     * @return notice
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNotice() {
        return notice;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
    }

    public NestedMetroCheckResult notice_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NOTICE);
        return this;
    }

    public NestedMetroCheckResult notice_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NOTICE);
        return this;
    }

    public void setNotice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NOTICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NOTICE);
        }
    }

    public boolean getNotice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NOTICE);
    }

    public NestedMetroCheckResult status(MetroCheckStatusEnum status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MetroCheckStatusEnum getStatus() {
        return status;
    }

    public void setStatus(MetroCheckStatusEnum status) {
        this.status = status;
    }

    public NestedMetroCheckResult status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public NestedMetroCheckResult status_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedMetroCheckResult nestedMetroCheckResult = (NestedMetroCheckResult) o;
        return Objects.equals(this.critical, nestedMetroCheckResult.critical)
                && Objects.equals(this.info, nestedMetroCheckResult.info)
                && Objects.equals(this.items, nestedMetroCheckResult.items)
                && Objects.equals(this.notice, nestedMetroCheckResult.notice)
                && Objects.equals(this.status, nestedMetroCheckResult.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical, info, items, notice, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedMetroCheckResult {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
