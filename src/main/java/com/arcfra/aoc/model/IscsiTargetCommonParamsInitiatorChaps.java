package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiTargetCommonParamsInitiatorChaps */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetCommonParamsInitiatorChaps
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";

    @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
    private String chapSecret;

    public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";

    @SerializedName(SERIALIZED_NAME_CHAP_NAME)
    private String chapName;

    public static final String SERIALIZED_NAME_INITIATOR_IQN = "initiator_iqn";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IQN)
    private String initiatorIqn;

    public IscsiTargetCommonParamsInitiatorChaps() {}

    public IscsiTargetCommonParamsInitiatorChaps chapSecret(String chapSecret) {

        this.chapSecret = chapSecret;
        return this;
    }

    /**
     * Get chapSecret
     *
     * @return chapSecret
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getChapSecret() {
        return chapSecret;
    }

    public void setChapSecret(String chapSecret) {
        this.chapSecret = chapSecret;
    }

    public IscsiTargetCommonParamsInitiatorChaps chapSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_SECRET);
        return this;
    }

    public IscsiTargetCommonParamsInitiatorChaps chapSecret_ExplictlyNonNull() {
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

    public IscsiTargetCommonParamsInitiatorChaps chapName(String chapName) {

        this.chapName = chapName;
        return this;
    }

    /**
     * Get chapName
     *
     * @return chapName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName;
    }

    public IscsiTargetCommonParamsInitiatorChaps chapName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_NAME);
        return this;
    }

    public IscsiTargetCommonParamsInitiatorChaps chapName_ExplictlyNonNull() {
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

    public IscsiTargetCommonParamsInitiatorChaps initiatorIqn(String initiatorIqn) {

        this.initiatorIqn = initiatorIqn;
        return this;
    }

    /**
     * Get initiatorIqn
     *
     * @return initiatorIqn
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getInitiatorIqn() {
        return initiatorIqn;
    }

    public void setInitiatorIqn(String initiatorIqn) {
        this.initiatorIqn = initiatorIqn;
    }

    public IscsiTargetCommonParamsInitiatorChaps initiatorIqn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IQN);
        return this;
    }

    public IscsiTargetCommonParamsInitiatorChaps initiatorIqn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IQN);
        return this;
    }

    public void setInitiatorIqn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IQN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IQN);
        }
    }

    public boolean getInitiatorIqn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IQN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiTargetCommonParamsInitiatorChaps iscsiTargetCommonParamsInitiatorChaps =
                (IscsiTargetCommonParamsInitiatorChaps) o;
        return Objects.equals(this.chapSecret, iscsiTargetCommonParamsInitiatorChaps.chapSecret)
                && Objects.equals(this.chapName, iscsiTargetCommonParamsInitiatorChaps.chapName)
                && Objects.equals(
                        this.initiatorIqn, iscsiTargetCommonParamsInitiatorChaps.initiatorIqn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapSecret, chapName, initiatorIqn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiTargetCommonParamsInitiatorChaps {\n");
        sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
        sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
        sb.append("    initiatorIqn: ").append(toIndentedString(initiatorIqn)).append("\n");
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
