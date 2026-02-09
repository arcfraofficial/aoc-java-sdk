package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** License */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class License extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
    private String licenseSerial;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
    private String maintenanceEndDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
    private String maintenanceStartDate;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
    private Integer maxChunkNum;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM = "max_cluster_num";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM)
    private Integer maxClusterNum;

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
    private SoftwareEdition softwareEdition;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private LicenseType type;

    public License() {}

    public License expireDate(String expireDate) {

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

    public License expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public License expireDate_ExplictlyNonNull() {
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

    public License id(String id) {

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

    public License id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public License id_ExplictlyNonNull() {
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

    public License licenseSerial(String licenseSerial) {

        this.licenseSerial = licenseSerial;
        return this;
    }

    /**
     * Get licenseSerial
     *
     * @return licenseSerial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLicenseSerial() {
        return licenseSerial;
    }

    public void setLicenseSerial(String licenseSerial) {
        this.licenseSerial = licenseSerial;
    }

    public License licenseSerial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public License licenseSerial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public void setLicenseSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        }
    }

    public boolean getLicenseSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL);
    }

    public License maintenanceEndDate(String maintenanceEndDate) {

        this.maintenanceEndDate = maintenanceEndDate;
        return this;
    }

    /**
     * Get maintenanceEndDate
     *
     * @return maintenanceEndDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDate() {
        return maintenanceEndDate;
    }

    public void setMaintenanceEndDate(String maintenanceEndDate) {
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public License maintenanceEndDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public License maintenanceEndDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public void setMaintenanceEndDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        }
    }

    public boolean getMaintenanceEndDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE);
    }

    public License maintenanceStartDate(String maintenanceStartDate) {

        this.maintenanceStartDate = maintenanceStartDate;
        return this;
    }

    /**
     * Get maintenanceStartDate
     *
     * @return maintenanceStartDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDate() {
        return maintenanceStartDate;
    }

    public void setMaintenanceStartDate(String maintenanceStartDate) {
        this.maintenanceStartDate = maintenanceStartDate;
    }

    public License maintenanceStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public License maintenanceStartDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public void setMaintenanceStartDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        }
    }

    public boolean getMaintenanceStartDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE);
    }

    public License maxChunkNum(Integer maxChunkNum) {

        this.maxChunkNum = maxChunkNum;
        return this;
    }

    /**
     * Get maxChunkNum
     *
     * @return maxChunkNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMaxChunkNum() {
        return maxChunkNum;
    }

    public void setMaxChunkNum(Integer maxChunkNum) {
        this.maxChunkNum = maxChunkNum;
    }

    public License maxChunkNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public License maxChunkNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public void setMaxChunkNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        }
    }

    public boolean getMaxChunkNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM);
    }

    public License maxClusterNum(Integer maxClusterNum) {

        this.maxClusterNum = maxClusterNum;
        return this;
    }

    /**
     * Get maxClusterNum
     *
     * @return maxClusterNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMaxClusterNum() {
        return maxClusterNum;
    }

    public void setMaxClusterNum(Integer maxClusterNum) {
        this.maxClusterNum = maxClusterNum;
    }

    public License maxClusterNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM);
        return this;
    }

    public License maxClusterNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM);
        return this;
    }

    public void setMaxClusterNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM);
        }
    }

    public boolean getMaxClusterNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM);
    }

    public License signDate(String signDate) {

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

    public License signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public License signDate_ExplictlyNonNull() {
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

    public License softwareEdition(SoftwareEdition softwareEdition) {

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

    public License softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public License softwareEdition_ExplictlyNonNull() {
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

    public License type(LicenseType type) {

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

    public License type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public License type_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(this.expireDate, license.expireDate)
                && Objects.equals(this.id, license.id)
                && Objects.equals(this.licenseSerial, license.licenseSerial)
                && Objects.equals(this.maintenanceEndDate, license.maintenanceEndDate)
                && Objects.equals(this.maintenanceStartDate, license.maintenanceStartDate)
                && Objects.equals(this.maxChunkNum, license.maxChunkNum)
                && Objects.equals(this.maxClusterNum, license.maxClusterNum)
                && Objects.equals(this.signDate, license.signDate)
                && Objects.equals(this.softwareEdition, license.softwareEdition)
                && Objects.equals(this.type, license.type);
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
                expireDate,
                id,
                licenseSerial,
                maintenanceEndDate,
                maintenanceStartDate,
                maxChunkNum,
                maxClusterNum,
                signDate,
                softwareEdition,
                type);
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
        sb.append("class License {\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
        sb.append("    maintenanceEndDate: ")
                .append(toIndentedString(maintenanceEndDate))
                .append("\n");
        sb.append("    maintenanceStartDate: ")
                .append(toIndentedString(maintenanceStartDate))
                .append("\n");
        sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
        sb.append("    maxClusterNum: ").append(toIndentedString(maxClusterNum)).append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
