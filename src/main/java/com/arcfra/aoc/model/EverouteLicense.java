package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EverouteLicense */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EverouteLicense extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    private String code;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM = "max_socket_num";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM)
    private Integer maxSocketNum;

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

    public EverouteLicense() {}

    public EverouteLicense code(String code) {

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

    public EverouteLicense code_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE);
        return this;
    }

    public EverouteLicense code_ExplictlyNonNull() {
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

    public EverouteLicense expireDate(String expireDate) {

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

    public EverouteLicense expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public EverouteLicense expireDate_ExplictlyNonNull() {
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

    public EverouteLicense id(String id) {

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

    public EverouteLicense id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EverouteLicense id_ExplictlyNonNull() {
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

    public EverouteLicense maxSocketNum(Integer maxSocketNum) {

        this.maxSocketNum = maxSocketNum;
        return this;
    }

    /**
     * Get maxSocketNum
     *
     * @return maxSocketNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMaxSocketNum() {
        return maxSocketNum;
    }

    public void setMaxSocketNum(Integer maxSocketNum) {
        this.maxSocketNum = maxSocketNum;
    }

    public EverouteLicense maxSocketNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM);
        return this;
    }

    public EverouteLicense maxSocketNum_ExplictlyNonNull() {
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

    public EverouteLicense serial(String serial) {

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

    public EverouteLicense serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public EverouteLicense serial_ExplictlyNonNull() {
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

    public EverouteLicense signDate(String signDate) {

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

    public EverouteLicense signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public EverouteLicense signDate_ExplictlyNonNull() {
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

    public EverouteLicense softwareEdition(SoftwareEdition softwareEdition) {

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

    public EverouteLicense softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public EverouteLicense softwareEdition_ExplictlyNonNull() {
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

    public EverouteLicense type(LicenseType type) {

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

    public EverouteLicense type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public EverouteLicense type_ExplictlyNonNull() {
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

    public EverouteLicense uid(String uid) {

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

    public EverouteLicense uid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID);
        return this;
    }

    public EverouteLicense uid_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EverouteLicense everouteLicense = (EverouteLicense) o;
        return Objects.equals(this.code, everouteLicense.code)
                && Objects.equals(this.expireDate, everouteLicense.expireDate)
                && Objects.equals(this.id, everouteLicense.id)
                && Objects.equals(this.maxSocketNum, everouteLicense.maxSocketNum)
                && Objects.equals(this.serial, everouteLicense.serial)
                && Objects.equals(this.signDate, everouteLicense.signDate)
                && Objects.equals(this.softwareEdition, everouteLicense.softwareEdition)
                && Objects.equals(this.type, everouteLicense.type)
                && Objects.equals(this.uid, everouteLicense.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                code, expireDate, id, maxSocketNum, serial, signDate, softwareEdition, type, uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EverouteLicense {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxSocketNum: ").append(toIndentedString(maxSocketNum)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
