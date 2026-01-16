package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** VmUpdateOwnerParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateOwnerParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    /** Gets or Sets searchFor */
    @JsonAdapter(SearchForEnum.Adapter.class)
    public enum SearchForEnum {
        USERNAME("username"),

        ID("id");

        private String value;

        SearchForEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SearchForEnum fromValue(String value) {
            for (SearchForEnum b : SearchForEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SearchForEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SearchForEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SearchForEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SearchForEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SEARCH_FOR = "search_for";

    @SerializedName(SERIALIZED_NAME_SEARCH_FOR)
    private SearchForEnum searchFor;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public VmUpdateOwnerParamsData() {}

    public VmUpdateOwnerParamsData searchFor(SearchForEnum searchFor) {

        this.searchFor = searchFor;
        return this;
    }

    /**
     * Get searchFor
     *
     * @return searchFor
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SearchForEnum getSearchFor() {
        return searchFor;
    }

    public void setSearchFor(SearchForEnum searchFor) {
        this.searchFor = searchFor;
    }

    public VmUpdateOwnerParamsData searchFor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SEARCH_FOR);
        return this;
    }

    public VmUpdateOwnerParamsData searchFor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SEARCH_FOR);
        return this;
    }

    public void setSearchFor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SEARCH_FOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SEARCH_FOR);
        }
    }

    public boolean getSearchFor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SEARCH_FOR);
    }

    public VmUpdateOwnerParamsData value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public VmUpdateOwnerParamsData value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public VmUpdateOwnerParamsData value_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        return this;
    }

    public void setValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        }
    }

    public boolean getValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateOwnerParamsData vmUpdateOwnerParamsData = (VmUpdateOwnerParamsData) o;
        return Objects.equals(this.searchFor, vmUpdateOwnerParamsData.searchFor)
                && Objects.equals(this.value, vmUpdateOwnerParamsData.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchFor, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateOwnerParamsData {\n");
        sb.append("    searchFor: ").append(toIndentedString(searchFor)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
