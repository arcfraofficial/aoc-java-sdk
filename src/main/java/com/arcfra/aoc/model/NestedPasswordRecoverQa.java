package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedPasswordRecoverQa */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedPasswordRecoverQa
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ITEMS = "items";

    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<NestedPasswordReoverQaItem> items = null;

    public NestedPasswordRecoverQa() {}

    public NestedPasswordRecoverQa enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public NestedPasswordRecoverQa enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public NestedPasswordRecoverQa enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public NestedPasswordRecoverQa items(List<NestedPasswordReoverQaItem> items) {

        this.items = items;
        return this;
    }

    public NestedPasswordRecoverQa addItemsItem(NestedPasswordReoverQaItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<NestedPasswordReoverQaItem>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     *
     * @return items
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedPasswordReoverQaItem> getItems() {
        return items;
    }

    public void setItems(List<NestedPasswordReoverQaItem> items) {
        this.items = items;
    }

    public NestedPasswordRecoverQa items_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ITEMS);
        return this;
    }

    public NestedPasswordRecoverQa items_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedPasswordRecoverQa nestedPasswordRecoverQa = (NestedPasswordRecoverQa) o;
        return Objects.equals(this.enabled, nestedPasswordRecoverQa.enabled)
                && Objects.equals(this.items, nestedPasswordRecoverQa.items);
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
        return Objects.hash(enabled, items);
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
        sb.append("class NestedPasswordRecoverQa {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
