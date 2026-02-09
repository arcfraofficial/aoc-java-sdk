package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** GetClusterStorageInfoRequestBody */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetClusterStorageInfoRequestBody
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EFFECT = "effect";

    @SerializedName(SERIALIZED_NAME_EFFECT)
    private GetClusterStorageInfoEffect effect;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ClusterWhereInput where;

    public GetClusterStorageInfoRequestBody() {}

    public GetClusterStorageInfoRequestBody effect(GetClusterStorageInfoEffect effect) {

        this.effect = effect;
        return this;
    }

    /**
     * Get effect
     *
     * @return effect
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public GetClusterStorageInfoEffect getEffect() {
        return effect;
    }

    public void setEffect(GetClusterStorageInfoEffect effect) {
        this.effect = effect;
    }

    public GetClusterStorageInfoRequestBody effect_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EFFECT);
        return this;
    }

    public GetClusterStorageInfoRequestBody effect_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EFFECT);
        return this;
    }

    public void setEffect_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EFFECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EFFECT);
        }
    }

    public boolean getEffect_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EFFECT);
    }

    public GetClusterStorageInfoRequestBody where(ClusterWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterWhereInput getWhere() {
        return where;
    }

    public void setWhere(ClusterWhereInput where) {
        this.where = where;
    }

    public GetClusterStorageInfoRequestBody where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public GetClusterStorageInfoRequestBody where_ExplictlyNonNull() {
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
        GetClusterStorageInfoRequestBody getClusterStorageInfoRequestBody =
                (GetClusterStorageInfoRequestBody) o;
        return Objects.equals(this.effect, getClusterStorageInfoRequestBody.effect)
                && Objects.equals(this.where, getClusterStorageInfoRequestBody.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterStorageInfoRequestBody {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
