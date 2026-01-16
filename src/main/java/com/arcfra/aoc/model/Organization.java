package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Organization */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Organization extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";

    @SerializedName(SERIALIZED_NAME_DATACENTERS)
    private List<NestedDatacenter> datacenters = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public Organization() {}

    public Organization datacenters(List<NestedDatacenter> datacenters) {

        this.datacenters = datacenters;
        return this;
    }

    public Organization addDatacentersItem(NestedDatacenter datacentersItem) {
        if (this.datacenters == null) {
            this.datacenters = new ArrayList<NestedDatacenter>();
        }
        this.datacenters.add(datacentersItem);
        return this;
    }

    /**
     * Get datacenters
     *
     * @return datacenters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedDatacenter> getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(List<NestedDatacenter> datacenters) {
        this.datacenters = datacenters;
    }

    public Organization datacenters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public Organization datacenters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public void setDatacenters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        }
    }

    public boolean getDatacenters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS);
    }

    public Organization id(String id) {

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

    public Organization id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Organization id_ExplictlyNonNull() {
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

    public Organization name(String name) {

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

    public Organization name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Organization name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Organization organization = (Organization) o;
        return Objects.equals(this.datacenters, organization.datacenters)
                && Objects.equals(this.id, organization.id)
                && Objects.equals(this.name, organization.name);
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
        return Objects.hash(datacenters, id, name);
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
        sb.append("class Organization {\n");
        sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
