package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ResourceMeta */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ResourceMeta extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReportResourceInputEnum type;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_FILTER = "filter";

    @SerializedName(SERIALIZED_NAME_FILTER)
    private Object filter = null;

    public static final String SERIALIZED_NAME_FIELDS = "fields";

    @SerializedName(SERIALIZED_NAME_FIELDS)
    private List<String> fields = new ArrayList<String>();

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        RESOURCEMETA("ResourceMeta");

        private String value;

        TypenameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypenameEnum fromValue(String value) {
            for (TypenameEnum b : TypenameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypenameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypenameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypenameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPENAME = "__typename";

    @SerializedName(SERIALIZED_NAME_TYPENAME)
    private TypenameEnum typename;

    public ResourceMeta() {}

    public ResourceMeta type(ReportResourceInputEnum type) {

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

    public ResourceMeta type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ResourceMeta type_ExplictlyNonNull() {
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

    public ResourceMeta name(String name) {

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

    public ResourceMeta name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ResourceMeta name_ExplictlyNonNull() {
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

    public ResourceMeta filter(Object filter) {

        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     *
     * @return filter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "")
    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public ResourceMeta filter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER);
        return this;
    }

    public ResourceMeta filter_ExplictlyNonNull() {
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

    public ResourceMeta fields(List<String> fields) {

        this.fields = fields;
        return this;
    }

    public ResourceMeta addFieldsItem(String fieldsItem) {
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

    public ResourceMeta fields_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIELDS);
        return this;
    }

    public ResourceMeta fields_ExplictlyNonNull() {
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

    public ResourceMeta typename(TypenameEnum typename) {

        this.typename = typename;
        return this;
    }

    /**
     * Get typename
     *
     * @return typename
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TypenameEnum getTypename() {
        return typename;
    }

    public void setTypename(TypenameEnum typename) {
        this.typename = typename;
    }

    public ResourceMeta typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public ResourceMeta typename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public void setTypename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        }
    }

    public boolean getTypename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPENAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceMeta resourceMeta = (ResourceMeta) o;
        return Objects.equals(this.type, resourceMeta.type)
                && Objects.equals(this.name, resourceMeta.name)
                && Objects.equals(this.filter, resourceMeta.filter)
                && Objects.equals(this.fields, resourceMeta.fields)
                && Objects.equals(this.typename, resourceMeta.typename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, filter, fields, typename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceMeta {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
