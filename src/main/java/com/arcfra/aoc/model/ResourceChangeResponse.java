package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ResourceChangeResponse */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ResourceChangeResponse
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CURRENT_REVISION = "currentRevision";

    @SerializedName(SERIALIZED_NAME_CURRENT_REVISION)
    private String currentRevision;

    public static final String SERIALIZED_NAME_COMPACT_REVISION = "compactRevision";

    @SerializedName(SERIALIZED_NAME_COMPACT_REVISION)
    private String compactRevision;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private List<ResourceChangeEvent> data = new ArrayList<ResourceChangeEvent>();

    public static final String SERIALIZED_NAME_ERROR = "error";

    @SerializedName(SERIALIZED_NAME_ERROR)
    private Object error = null;

    public static final String SERIALIZED_NAME_EC = "ec";

    @SerializedName(SERIALIZED_NAME_EC)
    private String ec;

    public ResourceChangeResponse() {}

    public ResourceChangeResponse currentRevision(String currentRevision) {

        this.currentRevision = currentRevision;
        return this;
    }

    /**
     * Get currentRevision
     *
     * @return currentRevision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
    }

    public ResourceChangeResponse currentRevision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_REVISION);
        return this;
    }

    public ResourceChangeResponse currentRevision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_REVISION);
        return this;
    }

    public void setCurrentRevision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_REVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_REVISION);
        }
    }

    public boolean getCurrentRevision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_REVISION);
    }

    public ResourceChangeResponse compactRevision(String compactRevision) {

        this.compactRevision = compactRevision;
        return this;
    }

    /**
     * Get compactRevision
     *
     * @return compactRevision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCompactRevision() {
        return compactRevision;
    }

    public void setCompactRevision(String compactRevision) {
        this.compactRevision = compactRevision;
    }

    public ResourceChangeResponse compactRevision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPACT_REVISION);
        return this;
    }

    public ResourceChangeResponse compactRevision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPACT_REVISION);
        return this;
    }

    public void setCompactRevision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPACT_REVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPACT_REVISION);
        }
    }

    public boolean getCompactRevision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPACT_REVISION);
    }

    public ResourceChangeResponse data(List<ResourceChangeEvent> data) {

        this.data = data;
        return this;
    }

    public ResourceChangeResponse addDataItem(ResourceChangeEvent dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ResourceChangeEvent> getData() {
        return data;
    }

    public void setData(List<ResourceChangeEvent> data) {
        this.data = data;
    }

    public ResourceChangeResponse data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public ResourceChangeResponse data_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA);
        return this;
    }

    public void setData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA);
        }
    }

    public boolean getData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA);
    }

    public ResourceChangeResponse error(Object error) {

        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public ResourceChangeResponse error_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR);
        return this;
    }

    public ResourceChangeResponse error_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR);
        return this;
    }

    public void setError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR);
        }
    }

    public boolean getError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR);
    }

    public ResourceChangeResponse ec(String ec) {

        this.ec = ec;
        return this;
    }

    /**
     * Get ec
     *
     * @return ec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public ResourceChangeResponse ec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC);
        return this;
    }

    public ResourceChangeResponse ec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC);
        return this;
    }

    public void setEc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC);
        }
    }

    public boolean getEc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceChangeResponse resourceChangeResponse = (ResourceChangeResponse) o;
        return Objects.equals(this.currentRevision, resourceChangeResponse.currentRevision)
                && Objects.equals(this.compactRevision, resourceChangeResponse.compactRevision)
                && Objects.equals(this.data, resourceChangeResponse.data)
                && Objects.equals(this.error, resourceChangeResponse.error)
                && Objects.equals(this.ec, resourceChangeResponse.ec);
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
        return Objects.hash(currentRevision, compactRevision, data, error, ec);
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
        sb.append("class ResourceChangeResponse {\n");
        sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
        sb.append("    compactRevision: ").append(toIndentedString(compactRevision)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    ec: ").append(toIndentedString(ec)).append("\n");
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
