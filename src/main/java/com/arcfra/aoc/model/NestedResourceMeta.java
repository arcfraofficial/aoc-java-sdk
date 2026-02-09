package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NestedResourceMeta */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedResourceMeta extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FIELDS = "fields";

    @SerializedName(SERIALIZED_NAME_FIELDS)
    private List<String> fields = new ArrayList<String>();

    public static final String SERIALIZED_NAME_FILTER = "filter";

    @SerializedName(SERIALIZED_NAME_FILTER)
    private Object filter;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReportResourceInputEnum type;

    public NestedResourceMeta() {}

    public NestedResourceMeta fields(List<String> fields) {

        this.fields = fields;
        return this;
    }

    public NestedResourceMeta addFieldsItem(String fieldsItem) {
        this.fields.add(fieldsItem);
        return this;
    }

    /**
     * Get fields
     *
     * @return fields
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public NestedResourceMeta fields_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIELDS);
        return this;
    }

    public NestedResourceMeta fields_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIELDS);
        return this;
    }

    public void setFields_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIELDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIELDS);
        }
    }

    public boolean getFields_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIELDS);
    }

    public NestedResourceMeta filter(Object filter) {

        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     *
     * @return filter
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public NestedResourceMeta filter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER);
        return this;
    }

    public NestedResourceMeta filter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER);
        return this;
    }

    public void setFilter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER);
        }
    }

    public boolean getFilter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER);
    }

    public NestedResourceMeta name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NestedResourceMeta name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedResourceMeta name_ExplictlyNonNull() {
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

    public NestedResourceMeta type(ReportResourceInputEnum type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReportResourceInputEnum getType() {
        return type;
    }

    public void setType(ReportResourceInputEnum type) {
        this.type = type;
    }

    public NestedResourceMeta type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedResourceMeta type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedResourceMeta nestedResourceMeta = (NestedResourceMeta) o;
        return Objects.equals(this.fields, nestedResourceMeta.fields)
                && Objects.equals(this.filter, nestedResourceMeta.filter)
                && Objects.equals(this.name, nestedResourceMeta.name)
                && Objects.equals(this.type, nestedResourceMeta.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, filter, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedResourceMeta {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
