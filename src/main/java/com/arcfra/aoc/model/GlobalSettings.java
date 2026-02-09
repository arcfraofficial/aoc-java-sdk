package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GlobalSettings */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GlobalSettings extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTH = "auth";

    @SerializedName(SERIALIZED_NAME_AUTH)
    private NestedAuthSettings auth;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_VM_RECYCLE_BIN = "vm_recycle_bin";

    @SerializedName(SERIALIZED_NAME_VM_RECYCLE_BIN)
    private NestedVmRecycleBin vmRecycleBin;

    public GlobalSettings() {}

    public GlobalSettings auth(NestedAuthSettings auth) {

        this.auth = auth;
        return this;
    }

    /**
     * Get auth
     *
     * @return auth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedAuthSettings getAuth() {
        return auth;
    }

    public void setAuth(NestedAuthSettings auth) {
        this.auth = auth;
    }

    public GlobalSettings auth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH);
        return this;
    }

    public GlobalSettings auth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH);
        return this;
    }

    public void setAuth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH);
        }
    }

    public boolean getAuth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH);
    }

    public GlobalSettings id(String id) {

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

    public GlobalSettings id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public GlobalSettings id_ExplictlyNonNull() {
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

    public GlobalSettings vmRecycleBin(NestedVmRecycleBin vmRecycleBin) {

        this.vmRecycleBin = vmRecycleBin;
        return this;
    }

    /**
     * Get vmRecycleBin
     *
     * @return vmRecycleBin
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVmRecycleBin getVmRecycleBin() {
        return vmRecycleBin;
    }

    public void setVmRecycleBin(NestedVmRecycleBin vmRecycleBin) {
        this.vmRecycleBin = vmRecycleBin;
    }

    public GlobalSettings vmRecycleBin_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_RECYCLE_BIN);
        return this;
    }

    public GlobalSettings vmRecycleBin_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_RECYCLE_BIN);
        return this;
    }

    public void setVmRecycleBin_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_RECYCLE_BIN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_RECYCLE_BIN);
        }
    }

    public boolean getVmRecycleBin_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_RECYCLE_BIN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalSettings globalSettings = (GlobalSettings) o;
        return Objects.equals(this.auth, globalSettings.auth)
                && Objects.equals(this.id, globalSettings.id)
                && Objects.equals(this.vmRecycleBin, globalSettings.vmRecycleBin);
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
        return Objects.hash(auth, id, vmRecycleBin);
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
        sb.append("class GlobalSettings {\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmRecycleBin: ").append(toIndentedString(vmRecycleBin)).append("\n");
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
