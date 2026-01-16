package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** V2EverouteLicense */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class V2EverouteLicense extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    private String code;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_FEATURE_TYPE = "feature_type";

    @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
    private EverouteFeatureType featureType;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM = "max_socket_num";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM)
    private Integer maxSocketNum;

    public static final String SERIALIZED_NAME_MAX_VCPU_NUM = "max_vcpu_num";

    @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM)
    private Integer maxVcpuNum;

    public static final String SERIALIZED_NAME_MAX_VM_NUM = "max_vm_num";

    @SerializedName(SERIALIZED_NAME_MAX_VM_NUM)
    private Integer maxVmNum;

    public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM = "max_vpc_socket_num";

    @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM)
    private Integer maxVpcSocketNum;

    public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";

    @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
    private EverouteLicensePricingType pricingType;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
    private SoftwareEdition softwareEdition;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private LicenseType type;

    public static final String SERIALIZED_NAME_UID = "uid";

    @SerializedName(SERIALIZED_NAME_UID)
    private String uid;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private Integer version;

    public V2EverouteLicense() {}

    public V2EverouteLicense code(String code) {

        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public V2EverouteLicense code_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE);
        return this;
    }

    public V2EverouteLicense code_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE);
        return this;
    }

    public void setCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE);
        }
    }

    public boolean getCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE);
    }

    public V2EverouteLicense expireDate(String expireDate) {

        this.expireDate = expireDate;
        return this;
    }

    /**
     * Get expireDate
     *
     * @return expireDate
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public V2EverouteLicense expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public V2EverouteLicense expireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public void setExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        }
    }

    public boolean getExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE);
    }

    public V2EverouteLicense featureType(EverouteFeatureType featureType) {

        this.featureType = featureType;
        return this;
    }

    /**
     * Get featureType
     *
     * @return featureType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public EverouteFeatureType getFeatureType() {
        return featureType;
    }

    public void setFeatureType(EverouteFeatureType featureType) {
        this.featureType = featureType;
    }

    public V2EverouteLicense featureType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FEATURE_TYPE);
        return this;
    }

    public V2EverouteLicense featureType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FEATURE_TYPE);
        return this;
    }

    public void setFeatureType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FEATURE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FEATURE_TYPE);
        }
    }

    public boolean getFeatureType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FEATURE_TYPE);
    }

    public V2EverouteLicense id(String id) {

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

    public V2EverouteLicense id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public V2EverouteLicense id_ExplictlyNonNull() {
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

    public V2EverouteLicense maxSocketNum(Integer maxSocketNum) {

        this.maxSocketNum = maxSocketNum;
        return this;
    }

    /**
     * Get maxSocketNum
     *
     * @return maxSocketNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNum() {
        return maxSocketNum;
    }

    public void setMaxSocketNum(Integer maxSocketNum) {
        this.maxSocketNum = maxSocketNum;
    }

    public V2EverouteLicense maxSocketNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM);
        return this;
    }

    public V2EverouteLicense maxSocketNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM);
        return this;
    }

    public void setMaxSocketNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM);
        }
    }

    public boolean getMaxSocketNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM);
    }

    public V2EverouteLicense maxVcpuNum(Integer maxVcpuNum) {

        this.maxVcpuNum = maxVcpuNum;
        return this;
    }

    /**
     * Get maxVcpuNum
     *
     * @return maxVcpuNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxVcpuNum() {
        return maxVcpuNum;
    }

    public void setMaxVcpuNum(Integer maxVcpuNum) {
        this.maxVcpuNum = maxVcpuNum;
    }

    public V2EverouteLicense maxVcpuNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_VCPU_NUM);
        return this;
    }

    public V2EverouteLicense maxVcpuNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_VCPU_NUM);
        return this;
    }

    public void setMaxVcpuNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_VCPU_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_VCPU_NUM);
        }
    }

    public boolean getMaxVcpuNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_VCPU_NUM);
    }

    public V2EverouteLicense maxVmNum(Integer maxVmNum) {

        this.maxVmNum = maxVmNum;
        return this;
    }

    /**
     * Get maxVmNum
     *
     * @return maxVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxVmNum() {
        return maxVmNum;
    }

    public void setMaxVmNum(Integer maxVmNum) {
        this.maxVmNum = maxVmNum;
    }

    public V2EverouteLicense maxVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_VM_NUM);
        return this;
    }

    public V2EverouteLicense maxVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_VM_NUM);
        return this;
    }

    public void setMaxVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_VM_NUM);
        }
    }

    public boolean getMaxVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_VM_NUM);
    }

    public V2EverouteLicense maxVpcSocketNum(Integer maxVpcSocketNum) {

        this.maxVpcSocketNum = maxVpcSocketNum;
        return this;
    }

    /**
     * Get maxVpcSocketNum
     *
     * @return maxVpcSocketNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxVpcSocketNum() {
        return maxVpcSocketNum;
    }

    public void setMaxVpcSocketNum(Integer maxVpcSocketNum) {
        this.maxVpcSocketNum = maxVpcSocketNum;
    }

    public V2EverouteLicense maxVpcSocketNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM);
        return this;
    }

    public V2EverouteLicense maxVpcSocketNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM);
        return this;
    }

    public void setMaxVpcSocketNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM);
        }
    }

    public boolean getMaxVpcSocketNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM);
    }

    public V2EverouteLicense pricingType(EverouteLicensePricingType pricingType) {

        this.pricingType = pricingType;
        return this;
    }

    /**
     * Get pricingType
     *
     * @return pricingType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteLicensePricingType getPricingType() {
        return pricingType;
    }

    public void setPricingType(EverouteLicensePricingType pricingType) {
        this.pricingType = pricingType;
    }

    public V2EverouteLicense pricingType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRICING_TYPE);
        return this;
    }

    public V2EverouteLicense pricingType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRICING_TYPE);
        return this;
    }

    public void setPricingType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRICING_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRICING_TYPE);
        }
    }

    public boolean getPricingType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRICING_TYPE);
    }

    public V2EverouteLicense serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public V2EverouteLicense serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public V2EverouteLicense serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public V2EverouteLicense signDate(String signDate) {

        this.signDate = signDate;
        return this;
    }

    /**
     * Get signDate
     *
     * @return signDate
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public V2EverouteLicense signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public V2EverouteLicense signDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public void setSignDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        }
    }

    public boolean getSignDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE);
    }

    public V2EverouteLicense softwareEdition(SoftwareEdition softwareEdition) {

        this.softwareEdition = softwareEdition;
        return this;
    }

    /**
     * Get softwareEdition
     *
     * @return softwareEdition
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SoftwareEdition getSoftwareEdition() {
        return softwareEdition;
    }

    public void setSoftwareEdition(SoftwareEdition softwareEdition) {
        this.softwareEdition = softwareEdition;
    }

    public V2EverouteLicense softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public V2EverouteLicense softwareEdition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public void setSoftwareEdition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        }
    }

    public boolean getSoftwareEdition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION);
    }

    public V2EverouteLicense type(LicenseType type) {

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
    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

    public V2EverouteLicense type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public V2EverouteLicense type_ExplictlyNonNull() {
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

    public V2EverouteLicense uid(String uid) {

        this.uid = uid;
        return this;
    }

    /**
     * Get uid
     *
     * @return uid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public V2EverouteLicense uid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID);
        return this;
    }

    public V2EverouteLicense uid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID);
        return this;
    }

    public void setUid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID);
        }
    }

    public boolean getUid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID);
    }

    public V2EverouteLicense version(Integer version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public V2EverouteLicense version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public V2EverouteLicense version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2EverouteLicense v2EverouteLicense = (V2EverouteLicense) o;
        return Objects.equals(this.code, v2EverouteLicense.code)
                && Objects.equals(this.expireDate, v2EverouteLicense.expireDate)
                && Objects.equals(this.featureType, v2EverouteLicense.featureType)
                && Objects.equals(this.id, v2EverouteLicense.id)
                && Objects.equals(this.maxSocketNum, v2EverouteLicense.maxSocketNum)
                && Objects.equals(this.maxVcpuNum, v2EverouteLicense.maxVcpuNum)
                && Objects.equals(this.maxVmNum, v2EverouteLicense.maxVmNum)
                && Objects.equals(this.maxVpcSocketNum, v2EverouteLicense.maxVpcSocketNum)
                && Objects.equals(this.pricingType, v2EverouteLicense.pricingType)
                && Objects.equals(this.serial, v2EverouteLicense.serial)
                && Objects.equals(this.signDate, v2EverouteLicense.signDate)
                && Objects.equals(this.softwareEdition, v2EverouteLicense.softwareEdition)
                && Objects.equals(this.type, v2EverouteLicense.type)
                && Objects.equals(this.uid, v2EverouteLicense.uid)
                && Objects.equals(this.version, v2EverouteLicense.version);
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
        return Objects.hash(
                code,
                expireDate,
                featureType,
                id,
                maxSocketNum,
                maxVcpuNum,
                maxVmNum,
                maxVpcSocketNum,
                pricingType,
                serial,
                signDate,
                softwareEdition,
                type,
                uid,
                version);
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
        sb.append("class V2EverouteLicense {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxSocketNum: ").append(toIndentedString(maxSocketNum)).append("\n");
        sb.append("    maxVcpuNum: ").append(toIndentedString(maxVcpuNum)).append("\n");
        sb.append("    maxVmNum: ").append(toIndentedString(maxVmNum)).append("\n");
        sb.append("    maxVpcSocketNum: ").append(toIndentedString(maxVpcSocketNum)).append("\n");
        sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
