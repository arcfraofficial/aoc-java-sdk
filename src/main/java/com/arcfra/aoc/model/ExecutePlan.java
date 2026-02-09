package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** ExecutePlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ExecutePlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_START_AT = "start_at";

    @SerializedName(SERIALIZED_NAME_START_AT)
    private String startAt;

    public static final String SERIALIZED_NAME_RETAIN = "retain";

    @SerializedName(SERIALIZED_NAME_RETAIN)
    private Integer retain;

    public static final String SERIALIZED_NAME_PERIOD = "period";

    @SerializedName(SERIALIZED_NAME_PERIOD)
    private String period;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        EXECUTEPLAN("ExecutePlan");

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

    public ExecutePlan() {}

    public ExecutePlan startAt(String startAt) {

        this.startAt = startAt;
        return this;
    }

    /**
     * Get startAt
     *
     * @return startAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public ExecutePlan startAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_AT);
        return this;
    }

    public ExecutePlan startAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_AT);
        return this;
    }

    public void setStartAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_AT);
        }
    }

    public boolean getStartAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_AT);
    }

    public ExecutePlan retain(Integer retain) {

        this.retain = retain;
        return this;
    }

    /**
     * Get retain
     *
     * @return retain
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getRetain() {
        return retain;
    }

    public void setRetain(Integer retain) {
        this.retain = retain;
    }

    public ExecutePlan retain_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETAIN);
        return this;
    }

    public ExecutePlan retain_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETAIN);
        return this;
    }

    public void setRetain_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETAIN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETAIN);
        }
    }

    public boolean getRetain_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETAIN);
    }

    public ExecutePlan period(String period) {

        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ExecutePlan period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public ExecutePlan period_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public void setPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        }
    }

    public boolean getPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD);
    }

    public ExecutePlan id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExecutePlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ExecutePlan id_ExplictlyNonNull() {
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

    public ExecutePlan enabled(Boolean enabled) {

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

    public ExecutePlan enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public ExecutePlan enabled_ExplictlyNonNull() {
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

    public ExecutePlan typename(TypenameEnum typename) {

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

    public ExecutePlan typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public ExecutePlan typename_ExplictlyNonNull() {
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
        ExecutePlan executePlan = (ExecutePlan) o;
        return Objects.equals(this.startAt, executePlan.startAt)
                && Objects.equals(this.retain, executePlan.retain)
                && Objects.equals(this.period, executePlan.period)
                && Objects.equals(this.id, executePlan.id)
                && Objects.equals(this.enabled, executePlan.enabled)
                && Objects.equals(this.typename, executePlan.typename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAt, retain, period, id, enabled, typename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutePlan {\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    retain: ").append(toIndentedString(retain)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
