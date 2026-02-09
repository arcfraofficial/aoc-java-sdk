package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedInitiator */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedInitiator extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";

    @SerializedName(SERIALIZED_NAME_CHAP_NAME)
    private String chapName;

    public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";

    @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
    private String chapSecret;

    public static final String SERIALIZED_NAME_ENABLE_CHAP = "enable_chap";

    @SerializedName(SERIALIZED_NAME_ENABLE_CHAP)
    private Boolean enableChap;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    private String identifier;

    public static final String SERIALIZED_NAME_IPS = "ips";

    @SerializedName(SERIALIZED_NAME_IPS)
    private String ips;

    public NestedInitiator() {}

    public NestedInitiator chapName(String chapName) {

        this.chapName = chapName;
        return this;
    }

    /**
     * Get chapName
     *
     * @return chapName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName;
    }

    public NestedInitiator chapName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_NAME);
        return this;
    }

    public NestedInitiator chapName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_NAME);
        return this;
    }

    public void setChapName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_NAME);
        }
    }

    public boolean getChapName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_NAME);
    }

    public NestedInitiator chapSecret(String chapSecret) {

        this.chapSecret = chapSecret;
        return this;
    }

    /**
     * Get chapSecret
     *
     * @return chapSecret
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapSecret() {
        return chapSecret;
    }

    public void setChapSecret(String chapSecret) {
        this.chapSecret = chapSecret;
    }

    public NestedInitiator chapSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_SECRET);
        return this;
    }

    public NestedInitiator chapSecret_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_SECRET);
        return this;
    }

    public void setChapSecret_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_SECRET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_SECRET);
        }
    }

    public boolean getChapSecret_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_SECRET);
    }

    public NestedInitiator enableChap(Boolean enableChap) {

        this.enableChap = enableChap;
        return this;
    }

    /**
     * Get enableChap
     *
     * @return enableChap
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableChap() {
        return enableChap;
    }

    public void setEnableChap(Boolean enableChap) {
        this.enableChap = enableChap;
    }

    public NestedInitiator enableChap_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_CHAP);
        return this;
    }

    public NestedInitiator enableChap_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_CHAP);
        return this;
    }

    public void setEnableChap_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_CHAP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_CHAP);
        }
    }

    public boolean getEnableChap_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_CHAP);
    }

    public NestedInitiator identifier(String identifier) {

        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     *
     * @return identifier
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public NestedInitiator identifier_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER);
        return this;
    }

    public NestedInitiator identifier_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER);
        return this;
    }

    public void setIdentifier_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER);
        }
    }

    public boolean getIdentifier_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER);
    }

    public NestedInitiator ips(String ips) {

        this.ips = ips;
        return this;
    }

    /**
     * Get ips
     *
     * @return ips
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public NestedInitiator ips_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS);
        return this;
    }

    public NestedInitiator ips_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS);
        return this;
    }

    public void setIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS);
        }
    }

    public boolean getIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedInitiator nestedInitiator = (NestedInitiator) o;
        return Objects.equals(this.chapName, nestedInitiator.chapName)
                && Objects.equals(this.chapSecret, nestedInitiator.chapSecret)
                && Objects.equals(this.enableChap, nestedInitiator.enableChap)
                && Objects.equals(this.identifier, nestedInitiator.identifier)
                && Objects.equals(this.ips, nestedInitiator.ips);
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
        return Objects.hash(chapName, chapSecret, enableChap, identifier, ips);
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
        sb.append("class NestedInitiator {\n");
        sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
        sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
        sb.append("    enableChap: ").append(toIndentedString(enableChap)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
