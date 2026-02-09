package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LicenseWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LicenseWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<LicenseWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<LicenseWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<LicenseWhereInput> OR = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GT = "expire_date_gt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GT)
    private String expireDateGt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GTE = "expire_date_gte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GTE)
    private String expireDateGte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_IN = "expire_date_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_IN)
    private List<String> expireDateIn = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LT = "expire_date_lt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LT)
    private String expireDateLt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LTE = "expire_date_lte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LTE)
    private String expireDateLte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT = "expire_date_not";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT)
    private String expireDateNot;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT_IN = "expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN)
    private List<String> expireDateNotIn = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
    private String licenseSerial;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS = "license_serial_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS)
    private String licenseSerialContains;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH =
            "license_serial_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH)
    private String licenseSerialEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_GT = "license_serial_gt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_GT)
    private String licenseSerialGt;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_GTE = "license_serial_gte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_GTE)
    private String licenseSerialGte;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_IN = "license_serial_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_IN)
    private List<String> licenseSerialIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_LT = "license_serial_lt";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_LT)
    private String licenseSerialLt;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_LTE = "license_serial_lte";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_LTE)
    private String licenseSerialLte;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT = "license_serial_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT)
    private String licenseSerialNot;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS =
            "license_serial_not_contains";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS)
    private String licenseSerialNotContains;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH =
            "license_serial_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH)
    private String licenseSerialNotEndsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN = "license_serial_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN)
    private List<String> licenseSerialNotIn = null;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH =
            "license_serial_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH)
    private String licenseSerialNotStartsWith;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH =
            "license_serial_starts_with";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH)
    private String licenseSerialStartsWith;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
    private String maintenanceEndDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_GT = "maintenance_end_date_gt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT)
    private String maintenanceEndDateGt;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE =
            "maintenance_end_date_gte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE)
    private String maintenanceEndDateGte;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_IN = "maintenance_end_date_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN)
    private List<String> maintenanceEndDateIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_LT = "maintenance_end_date_lt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT)
    private String maintenanceEndDateLt;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE =
            "maintenance_end_date_lte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE)
    private String maintenanceEndDateLte;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT =
            "maintenance_end_date_not";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT)
    private String maintenanceEndDateNot;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN =
            "maintenance_end_date_not_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN)
    private List<String> maintenanceEndDateNotIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
    private String maintenanceStartDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_GT =
            "maintenance_start_date_gt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT)
    private String maintenanceStartDateGt;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE =
            "maintenance_start_date_gte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE)
    private String maintenanceStartDateGte;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_IN =
            "maintenance_start_date_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN)
    private List<String> maintenanceStartDateIn = null;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_LT =
            "maintenance_start_date_lt";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT)
    private String maintenanceStartDateLt;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE =
            "maintenance_start_date_lte";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE)
    private String maintenanceStartDateLte;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT =
            "maintenance_start_date_not";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT)
    private String maintenanceStartDateNot;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN =
            "maintenance_start_date_not_in";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN)
    private List<String> maintenanceStartDateNotIn = null;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
    private Integer maxChunkNum;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_GT = "max_chunk_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_GT)
    private Integer maxChunkNumGt;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_GTE = "max_chunk_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE)
    private Integer maxChunkNumGte;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_IN = "max_chunk_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_IN)
    private List<Integer> maxChunkNumIn = null;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_LT = "max_chunk_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_LT)
    private Integer maxChunkNumLt;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_LTE = "max_chunk_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE)
    private Integer maxChunkNumLte;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_NOT = "max_chunk_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT)
    private Integer maxChunkNumNot;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN = "max_chunk_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN)
    private List<Integer> maxChunkNumNotIn = null;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM = "max_cluster_num";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM)
    private Integer maxClusterNum;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_GT = "max_cluster_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT)
    private Integer maxClusterNumGt;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE = "max_cluster_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE)
    private Integer maxClusterNumGte;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_IN = "max_cluster_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN)
    private List<Integer> maxClusterNumIn = null;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_LT = "max_cluster_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT)
    private Integer maxClusterNumLt;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE = "max_cluster_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE)
    private Integer maxClusterNumLte;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT = "max_cluster_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT)
    private Integer maxClusterNumNot;

    public static final String SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN = "max_cluster_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN)
    private List<Integer> maxClusterNumNotIn = null;

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SIGN_DATE_GT = "sign_date_gt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GT)
    private String signDateGt;

    public static final String SERIALIZED_NAME_SIGN_DATE_GTE = "sign_date_gte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GTE)
    private String signDateGte;

    public static final String SERIALIZED_NAME_SIGN_DATE_IN = "sign_date_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_IN)
    private List<String> signDateIn = null;

    public static final String SERIALIZED_NAME_SIGN_DATE_LT = "sign_date_lt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LT)
    private String signDateLt;

    public static final String SERIALIZED_NAME_SIGN_DATE_LTE = "sign_date_lte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LTE)
    private String signDateLte;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT = "sign_date_not";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT)
    private String signDateNot;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT_IN = "sign_date_not_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT_IN)
    private List<String> signDateNotIn = null;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
    private SoftwareEdition softwareEdition;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_IN = "software_edition_in";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_IN)
    private List<SoftwareEdition> softwareEditionIn = null;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT = "software_edition_not";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT)
    private SoftwareEdition softwareEditionNot;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN = "software_edition_not_in";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN)
    private List<SoftwareEdition> softwareEditionNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private LicenseType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<LicenseType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private LicenseType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<LicenseType> typeNotIn = null;

    public LicenseWhereInput() {}

    public LicenseWhereInput AND(List<LicenseWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public LicenseWhereInput addANDItem(LicenseWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<LicenseWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<LicenseWhereInput> AND) {
        this.AND = AND;
    }

    public LicenseWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public LicenseWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public LicenseWhereInput NOT(List<LicenseWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public LicenseWhereInput addNOTItem(LicenseWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<LicenseWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<LicenseWhereInput> NOT) {
        this.NOT = NOT;
    }

    public LicenseWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public LicenseWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public LicenseWhereInput OR(List<LicenseWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public LicenseWhereInput addORItem(LicenseWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<LicenseWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<LicenseWhereInput> OR) {
        this.OR = OR;
    }

    public LicenseWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public LicenseWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public LicenseWhereInput expireDate(String expireDate) {

        this.expireDate = expireDate;
        return this;
    }

    /**
     * Get expireDate
     *
     * @return expireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public LicenseWhereInput expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public LicenseWhereInput expireDate_ExplictlyNonNull() {
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

    public LicenseWhereInput expireDateGt(String expireDateGt) {

        this.expireDateGt = expireDateGt;
        return this;
    }

    /**
     * Get expireDateGt
     *
     * @return expireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGt() {
        return expireDateGt;
    }

    public void setExpireDateGt(String expireDateGt) {
        this.expireDateGt = expireDateGt;
    }

    public LicenseWhereInput expireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public LicenseWhereInput expireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public void setExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        }
    }

    public boolean getExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GT);
    }

    public LicenseWhereInput expireDateGte(String expireDateGte) {

        this.expireDateGte = expireDateGte;
        return this;
    }

    /**
     * Get expireDateGte
     *
     * @return expireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGte() {
        return expireDateGte;
    }

    public void setExpireDateGte(String expireDateGte) {
        this.expireDateGte = expireDateGte;
    }

    public LicenseWhereInput expireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public LicenseWhereInput expireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public void setExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        }
    }

    public boolean getExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GTE);
    }

    public LicenseWhereInput expireDateIn(List<String> expireDateIn) {

        this.expireDateIn = expireDateIn;
        return this;
    }

    public LicenseWhereInput addExpireDateInItem(String expireDateInItem) {
        if (this.expireDateIn == null) {
            this.expireDateIn = new ArrayList<String>();
        }
        this.expireDateIn.add(expireDateInItem);
        return this;
    }

    /**
     * Get expireDateIn
     *
     * @return expireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateIn() {
        return expireDateIn;
    }

    public void setExpireDateIn(List<String> expireDateIn) {
        this.expireDateIn = expireDateIn;
    }

    public LicenseWhereInput expireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public LicenseWhereInput expireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public void setExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        }
    }

    public boolean getExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_IN);
    }

    public LicenseWhereInput expireDateLt(String expireDateLt) {

        this.expireDateLt = expireDateLt;
        return this;
    }

    /**
     * Get expireDateLt
     *
     * @return expireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLt() {
        return expireDateLt;
    }

    public void setExpireDateLt(String expireDateLt) {
        this.expireDateLt = expireDateLt;
    }

    public LicenseWhereInput expireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public LicenseWhereInput expireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public void setExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        }
    }

    public boolean getExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LT);
    }

    public LicenseWhereInput expireDateLte(String expireDateLte) {

        this.expireDateLte = expireDateLte;
        return this;
    }

    /**
     * Get expireDateLte
     *
     * @return expireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLte() {
        return expireDateLte;
    }

    public void setExpireDateLte(String expireDateLte) {
        this.expireDateLte = expireDateLte;
    }

    public LicenseWhereInput expireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public LicenseWhereInput expireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public void setExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        }
    }

    public boolean getExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LTE);
    }

    public LicenseWhereInput expireDateNot(String expireDateNot) {

        this.expireDateNot = expireDateNot;
        return this;
    }

    /**
     * Get expireDateNot
     *
     * @return expireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateNot() {
        return expireDateNot;
    }

    public void setExpireDateNot(String expireDateNot) {
        this.expireDateNot = expireDateNot;
    }

    public LicenseWhereInput expireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public LicenseWhereInput expireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public void setExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        }
    }

    public boolean getExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT);
    }

    public LicenseWhereInput expireDateNotIn(List<String> expireDateNotIn) {

        this.expireDateNotIn = expireDateNotIn;
        return this;
    }

    public LicenseWhereInput addExpireDateNotInItem(String expireDateNotInItem) {
        if (this.expireDateNotIn == null) {
            this.expireDateNotIn = new ArrayList<String>();
        }
        this.expireDateNotIn.add(expireDateNotInItem);
        return this;
    }

    /**
     * Get expireDateNotIn
     *
     * @return expireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateNotIn() {
        return expireDateNotIn;
    }

    public void setExpireDateNotIn(List<String> expireDateNotIn) {
        this.expireDateNotIn = expireDateNotIn;
    }

    public LicenseWhereInput expireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public LicenseWhereInput expireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
    }

    public LicenseWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LicenseWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public LicenseWhereInput id_ExplictlyNonNull() {
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

    public LicenseWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public LicenseWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public LicenseWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public LicenseWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public LicenseWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public LicenseWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public LicenseWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public LicenseWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public LicenseWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public LicenseWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public LicenseWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public LicenseWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public LicenseWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public LicenseWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public LicenseWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public LicenseWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public LicenseWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public LicenseWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public LicenseWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public LicenseWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public LicenseWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public LicenseWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public LicenseWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public LicenseWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public LicenseWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public LicenseWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public LicenseWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public LicenseWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public LicenseWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public LicenseWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public LicenseWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public LicenseWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public LicenseWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public LicenseWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public LicenseWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public LicenseWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public LicenseWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public LicenseWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public LicenseWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public LicenseWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public LicenseWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public LicenseWhereInput licenseSerial(String licenseSerial) {

        this.licenseSerial = licenseSerial;
        return this;
    }

    /**
     * Get licenseSerial
     *
     * @return licenseSerial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerial() {
        return licenseSerial;
    }

    public void setLicenseSerial(String licenseSerial) {
        this.licenseSerial = licenseSerial;
    }

    public LicenseWhereInput licenseSerial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public LicenseWhereInput licenseSerial_ExplictlyNonNull() {
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

    public LicenseWhereInput licenseSerialContains(String licenseSerialContains) {

        this.licenseSerialContains = licenseSerialContains;
        return this;
    }

    /**
     * Get licenseSerialContains
     *
     * @return licenseSerialContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialContains() {
        return licenseSerialContains;
    }

    public void setLicenseSerialContains(String licenseSerialContains) {
        this.licenseSerialContains = licenseSerialContains;
    }

    public LicenseWhereInput licenseSerialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        return this;
    }

    public LicenseWhereInput licenseSerialContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        return this;
    }

    public void setLicenseSerialContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
        }
    }

    public boolean getLicenseSerialContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_CONTAINS);
    }

    public LicenseWhereInput licenseSerialEndsWith(String licenseSerialEndsWith) {

        this.licenseSerialEndsWith = licenseSerialEndsWith;
        return this;
    }

    /**
     * Get licenseSerialEndsWith
     *
     * @return licenseSerialEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialEndsWith() {
        return licenseSerialEndsWith;
    }

    public void setLicenseSerialEndsWith(String licenseSerialEndsWith) {
        this.licenseSerialEndsWith = licenseSerialEndsWith;
    }

    public LicenseWhereInput licenseSerialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        return this;
    }

    public LicenseWhereInput licenseSerialEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        return this;
    }

    public void setLicenseSerialEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
        }
    }

    public boolean getLicenseSerialEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_ENDS_WITH);
    }

    public LicenseWhereInput licenseSerialGt(String licenseSerialGt) {

        this.licenseSerialGt = licenseSerialGt;
        return this;
    }

    /**
     * Get licenseSerialGt
     *
     * @return licenseSerialGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialGt() {
        return licenseSerialGt;
    }

    public void setLicenseSerialGt(String licenseSerialGt) {
        this.licenseSerialGt = licenseSerialGt;
    }

    public LicenseWhereInput licenseSerialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        return this;
    }

    public LicenseWhereInput licenseSerialGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        return this;
    }

    public void setLicenseSerialGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GT);
        }
    }

    public boolean getLicenseSerialGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_GT);
    }

    public LicenseWhereInput licenseSerialGte(String licenseSerialGte) {

        this.licenseSerialGte = licenseSerialGte;
        return this;
    }

    /**
     * Get licenseSerialGte
     *
     * @return licenseSerialGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialGte() {
        return licenseSerialGte;
    }

    public void setLicenseSerialGte(String licenseSerialGte) {
        this.licenseSerialGte = licenseSerialGte;
    }

    public LicenseWhereInput licenseSerialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        return this;
    }

    public LicenseWhereInput licenseSerialGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        return this;
    }

    public void setLicenseSerialGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
        }
    }

    public boolean getLicenseSerialGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_GTE);
    }

    public LicenseWhereInput licenseSerialIn(List<String> licenseSerialIn) {

        this.licenseSerialIn = licenseSerialIn;
        return this;
    }

    public LicenseWhereInput addLicenseSerialInItem(String licenseSerialInItem) {
        if (this.licenseSerialIn == null) {
            this.licenseSerialIn = new ArrayList<String>();
        }
        this.licenseSerialIn.add(licenseSerialInItem);
        return this;
    }

    /**
     * Get licenseSerialIn
     *
     * @return licenseSerialIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSerialIn() {
        return licenseSerialIn;
    }

    public void setLicenseSerialIn(List<String> licenseSerialIn) {
        this.licenseSerialIn = licenseSerialIn;
    }

    public LicenseWhereInput licenseSerialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        return this;
    }

    public LicenseWhereInput licenseSerialIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        return this;
    }

    public void setLicenseSerialIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_IN);
        }
    }

    public boolean getLicenseSerialIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_IN);
    }

    public LicenseWhereInput licenseSerialLt(String licenseSerialLt) {

        this.licenseSerialLt = licenseSerialLt;
        return this;
    }

    /**
     * Get licenseSerialLt
     *
     * @return licenseSerialLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialLt() {
        return licenseSerialLt;
    }

    public void setLicenseSerialLt(String licenseSerialLt) {
        this.licenseSerialLt = licenseSerialLt;
    }

    public LicenseWhereInput licenseSerialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        return this;
    }

    public LicenseWhereInput licenseSerialLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        return this;
    }

    public void setLicenseSerialLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LT);
        }
    }

    public boolean getLicenseSerialLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_LT);
    }

    public LicenseWhereInput licenseSerialLte(String licenseSerialLte) {

        this.licenseSerialLte = licenseSerialLte;
        return this;
    }

    /**
     * Get licenseSerialLte
     *
     * @return licenseSerialLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialLte() {
        return licenseSerialLte;
    }

    public void setLicenseSerialLte(String licenseSerialLte) {
        this.licenseSerialLte = licenseSerialLte;
    }

    public LicenseWhereInput licenseSerialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        return this;
    }

    public LicenseWhereInput licenseSerialLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        return this;
    }

    public void setLicenseSerialLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
        }
    }

    public boolean getLicenseSerialLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_LTE);
    }

    public LicenseWhereInput licenseSerialNot(String licenseSerialNot) {

        this.licenseSerialNot = licenseSerialNot;
        return this;
    }

    /**
     * Get licenseSerialNot
     *
     * @return licenseSerialNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNot() {
        return licenseSerialNot;
    }

    public void setLicenseSerialNot(String licenseSerialNot) {
        this.licenseSerialNot = licenseSerialNot;
    }

    public LicenseWhereInput licenseSerialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        return this;
    }

    public LicenseWhereInput licenseSerialNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        return this;
    }

    public void setLicenseSerialNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
        }
    }

    public boolean getLicenseSerialNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT);
    }

    public LicenseWhereInput licenseSerialNotContains(String licenseSerialNotContains) {

        this.licenseSerialNotContains = licenseSerialNotContains;
        return this;
    }

    /**
     * Get licenseSerialNotContains
     *
     * @return licenseSerialNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotContains() {
        return licenseSerialNotContains;
    }

    public void setLicenseSerialNotContains(String licenseSerialNotContains) {
        this.licenseSerialNotContains = licenseSerialNotContains;
    }

    public LicenseWhereInput licenseSerialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        return this;
    }

    public LicenseWhereInput licenseSerialNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        return this;
    }

    public void setLicenseSerialNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
        }
    }

    public boolean getLicenseSerialNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_CONTAINS);
    }

    public LicenseWhereInput licenseSerialNotEndsWith(String licenseSerialNotEndsWith) {

        this.licenseSerialNotEndsWith = licenseSerialNotEndsWith;
        return this;
    }

    /**
     * Get licenseSerialNotEndsWith
     *
     * @return licenseSerialNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotEndsWith() {
        return licenseSerialNotEndsWith;
    }

    public void setLicenseSerialNotEndsWith(String licenseSerialNotEndsWith) {
        this.licenseSerialNotEndsWith = licenseSerialNotEndsWith;
    }

    public LicenseWhereInput licenseSerialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public LicenseWhereInput licenseSerialNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public void setLicenseSerialNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
        }
    }

    public boolean getLicenseSerialNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_ENDS_WITH);
    }

    public LicenseWhereInput licenseSerialNotIn(List<String> licenseSerialNotIn) {

        this.licenseSerialNotIn = licenseSerialNotIn;
        return this;
    }

    public LicenseWhereInput addLicenseSerialNotInItem(String licenseSerialNotInItem) {
        if (this.licenseSerialNotIn == null) {
            this.licenseSerialNotIn = new ArrayList<String>();
        }
        this.licenseSerialNotIn.add(licenseSerialNotInItem);
        return this;
    }

    /**
     * Get licenseSerialNotIn
     *
     * @return licenseSerialNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLicenseSerialNotIn() {
        return licenseSerialNotIn;
    }

    public void setLicenseSerialNotIn(List<String> licenseSerialNotIn) {
        this.licenseSerialNotIn = licenseSerialNotIn;
    }

    public LicenseWhereInput licenseSerialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        return this;
    }

    public LicenseWhereInput licenseSerialNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        return this;
    }

    public void setLicenseSerialNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
        }
    }

    public boolean getLicenseSerialNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_IN);
    }

    public LicenseWhereInput licenseSerialNotStartsWith(String licenseSerialNotStartsWith) {

        this.licenseSerialNotStartsWith = licenseSerialNotStartsWith;
        return this;
    }

    /**
     * Get licenseSerialNotStartsWith
     *
     * @return licenseSerialNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialNotStartsWith() {
        return licenseSerialNotStartsWith;
    }

    public void setLicenseSerialNotStartsWith(String licenseSerialNotStartsWith) {
        this.licenseSerialNotStartsWith = licenseSerialNotStartsWith;
    }

    public LicenseWhereInput licenseSerialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public LicenseWhereInput licenseSerialNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public void setLicenseSerialNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
        }
    }

    public boolean getLicenseSerialNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_NOT_STARTS_WITH);
    }

    public LicenseWhereInput licenseSerialStartsWith(String licenseSerialStartsWith) {

        this.licenseSerialStartsWith = licenseSerialStartsWith;
        return this;
    }

    /**
     * Get licenseSerialStartsWith
     *
     * @return licenseSerialStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerialStartsWith() {
        return licenseSerialStartsWith;
    }

    public void setLicenseSerialStartsWith(String licenseSerialStartsWith) {
        this.licenseSerialStartsWith = licenseSerialStartsWith;
    }

    public LicenseWhereInput licenseSerialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        return this;
    }

    public LicenseWhereInput licenseSerialStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        return this;
    }

    public void setLicenseSerialStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
        }
    }

    public boolean getLicenseSerialStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL_STARTS_WITH);
    }

    public LicenseWhereInput maintenanceEndDate(String maintenanceEndDate) {

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

    public LicenseWhereInput maintenanceEndDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public LicenseWhereInput maintenanceEndDate_ExplictlyNonNull() {
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

    public LicenseWhereInput maintenanceEndDateGt(String maintenanceEndDateGt) {

        this.maintenanceEndDateGt = maintenanceEndDateGt;
        return this;
    }

    /**
     * Get maintenanceEndDateGt
     *
     * @return maintenanceEndDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateGt() {
        return maintenanceEndDateGt;
    }

    public void setMaintenanceEndDateGt(String maintenanceEndDateGt) {
        this.maintenanceEndDateGt = maintenanceEndDateGt;
    }

    public LicenseWhereInput maintenanceEndDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        return this;
    }

    public void setMaintenanceEndDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
        }
    }

    public boolean getMaintenanceEndDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_GT);
    }

    public LicenseWhereInput maintenanceEndDateGte(String maintenanceEndDateGte) {

        this.maintenanceEndDateGte = maintenanceEndDateGte;
        return this;
    }

    /**
     * Get maintenanceEndDateGte
     *
     * @return maintenanceEndDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateGte() {
        return maintenanceEndDateGte;
    }

    public void setMaintenanceEndDateGte(String maintenanceEndDateGte) {
        this.maintenanceEndDateGte = maintenanceEndDateGte;
    }

    public LicenseWhereInput maintenanceEndDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        return this;
    }

    public void setMaintenanceEndDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
        }
    }

    public boolean getMaintenanceEndDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_GTE);
    }

    public LicenseWhereInput maintenanceEndDateIn(List<String> maintenanceEndDateIn) {

        this.maintenanceEndDateIn = maintenanceEndDateIn;
        return this;
    }

    public LicenseWhereInput addMaintenanceEndDateInItem(String maintenanceEndDateInItem) {
        if (this.maintenanceEndDateIn == null) {
            this.maintenanceEndDateIn = new ArrayList<String>();
        }
        this.maintenanceEndDateIn.add(maintenanceEndDateInItem);
        return this;
    }

    /**
     * Get maintenanceEndDateIn
     *
     * @return maintenanceEndDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceEndDateIn() {
        return maintenanceEndDateIn;
    }

    public void setMaintenanceEndDateIn(List<String> maintenanceEndDateIn) {
        this.maintenanceEndDateIn = maintenanceEndDateIn;
    }

    public LicenseWhereInput maintenanceEndDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        return this;
    }

    public void setMaintenanceEndDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
        }
    }

    public boolean getMaintenanceEndDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_IN);
    }

    public LicenseWhereInput maintenanceEndDateLt(String maintenanceEndDateLt) {

        this.maintenanceEndDateLt = maintenanceEndDateLt;
        return this;
    }

    /**
     * Get maintenanceEndDateLt
     *
     * @return maintenanceEndDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateLt() {
        return maintenanceEndDateLt;
    }

    public void setMaintenanceEndDateLt(String maintenanceEndDateLt) {
        this.maintenanceEndDateLt = maintenanceEndDateLt;
    }

    public LicenseWhereInput maintenanceEndDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        return this;
    }

    public void setMaintenanceEndDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
        }
    }

    public boolean getMaintenanceEndDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_LT);
    }

    public LicenseWhereInput maintenanceEndDateLte(String maintenanceEndDateLte) {

        this.maintenanceEndDateLte = maintenanceEndDateLte;
        return this;
    }

    /**
     * Get maintenanceEndDateLte
     *
     * @return maintenanceEndDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateLte() {
        return maintenanceEndDateLte;
    }

    public void setMaintenanceEndDateLte(String maintenanceEndDateLte) {
        this.maintenanceEndDateLte = maintenanceEndDateLte;
    }

    public LicenseWhereInput maintenanceEndDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        return this;
    }

    public void setMaintenanceEndDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
        }
    }

    public boolean getMaintenanceEndDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_LTE);
    }

    public LicenseWhereInput maintenanceEndDateNot(String maintenanceEndDateNot) {

        this.maintenanceEndDateNot = maintenanceEndDateNot;
        return this;
    }

    /**
     * Get maintenanceEndDateNot
     *
     * @return maintenanceEndDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDateNot() {
        return maintenanceEndDateNot;
    }

    public void setMaintenanceEndDateNot(String maintenanceEndDateNot) {
        this.maintenanceEndDateNot = maintenanceEndDateNot;
    }

    public LicenseWhereInput maintenanceEndDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        return this;
    }

    public void setMaintenanceEndDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
        }
    }

    public boolean getMaintenanceEndDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT);
    }

    public LicenseWhereInput maintenanceEndDateNotIn(List<String> maintenanceEndDateNotIn) {

        this.maintenanceEndDateNotIn = maintenanceEndDateNotIn;
        return this;
    }

    public LicenseWhereInput addMaintenanceEndDateNotInItem(String maintenanceEndDateNotInItem) {
        if (this.maintenanceEndDateNotIn == null) {
            this.maintenanceEndDateNotIn = new ArrayList<String>();
        }
        this.maintenanceEndDateNotIn.add(maintenanceEndDateNotInItem);
        return this;
    }

    /**
     * Get maintenanceEndDateNotIn
     *
     * @return maintenanceEndDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceEndDateNotIn() {
        return maintenanceEndDateNotIn;
    }

    public void setMaintenanceEndDateNotIn(List<String> maintenanceEndDateNotIn) {
        this.maintenanceEndDateNotIn = maintenanceEndDateNotIn;
    }

    public LicenseWhereInput maintenanceEndDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        return this;
    }

    public LicenseWhereInput maintenanceEndDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        return this;
    }

    public void setMaintenanceEndDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
        }
    }

    public boolean getMaintenanceEndDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE_NOT_IN);
    }

    public LicenseWhereInput maintenanceStartDate(String maintenanceStartDate) {

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

    public LicenseWhereInput maintenanceStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public LicenseWhereInput maintenanceStartDate_ExplictlyNonNull() {
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

    public LicenseWhereInput maintenanceStartDateGt(String maintenanceStartDateGt) {

        this.maintenanceStartDateGt = maintenanceStartDateGt;
        return this;
    }

    /**
     * Get maintenanceStartDateGt
     *
     * @return maintenanceStartDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateGt() {
        return maintenanceStartDateGt;
    }

    public void setMaintenanceStartDateGt(String maintenanceStartDateGt) {
        this.maintenanceStartDateGt = maintenanceStartDateGt;
    }

    public LicenseWhereInput maintenanceStartDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        return this;
    }

    public void setMaintenanceStartDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
        }
    }

    public boolean getMaintenanceStartDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_GT);
    }

    public LicenseWhereInput maintenanceStartDateGte(String maintenanceStartDateGte) {

        this.maintenanceStartDateGte = maintenanceStartDateGte;
        return this;
    }

    /**
     * Get maintenanceStartDateGte
     *
     * @return maintenanceStartDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateGte() {
        return maintenanceStartDateGte;
    }

    public void setMaintenanceStartDateGte(String maintenanceStartDateGte) {
        this.maintenanceStartDateGte = maintenanceStartDateGte;
    }

    public LicenseWhereInput maintenanceStartDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        return this;
    }

    public void setMaintenanceStartDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
        }
    }

    public boolean getMaintenanceStartDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_GTE);
    }

    public LicenseWhereInput maintenanceStartDateIn(List<String> maintenanceStartDateIn) {

        this.maintenanceStartDateIn = maintenanceStartDateIn;
        return this;
    }

    public LicenseWhereInput addMaintenanceStartDateInItem(String maintenanceStartDateInItem) {
        if (this.maintenanceStartDateIn == null) {
            this.maintenanceStartDateIn = new ArrayList<String>();
        }
        this.maintenanceStartDateIn.add(maintenanceStartDateInItem);
        return this;
    }

    /**
     * Get maintenanceStartDateIn
     *
     * @return maintenanceStartDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceStartDateIn() {
        return maintenanceStartDateIn;
    }

    public void setMaintenanceStartDateIn(List<String> maintenanceStartDateIn) {
        this.maintenanceStartDateIn = maintenanceStartDateIn;
    }

    public LicenseWhereInput maintenanceStartDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        return this;
    }

    public void setMaintenanceStartDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
        }
    }

    public boolean getMaintenanceStartDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_IN);
    }

    public LicenseWhereInput maintenanceStartDateLt(String maintenanceStartDateLt) {

        this.maintenanceStartDateLt = maintenanceStartDateLt;
        return this;
    }

    /**
     * Get maintenanceStartDateLt
     *
     * @return maintenanceStartDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateLt() {
        return maintenanceStartDateLt;
    }

    public void setMaintenanceStartDateLt(String maintenanceStartDateLt) {
        this.maintenanceStartDateLt = maintenanceStartDateLt;
    }

    public LicenseWhereInput maintenanceStartDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        return this;
    }

    public void setMaintenanceStartDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
        }
    }

    public boolean getMaintenanceStartDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_LT);
    }

    public LicenseWhereInput maintenanceStartDateLte(String maintenanceStartDateLte) {

        this.maintenanceStartDateLte = maintenanceStartDateLte;
        return this;
    }

    /**
     * Get maintenanceStartDateLte
     *
     * @return maintenanceStartDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateLte() {
        return maintenanceStartDateLte;
    }

    public void setMaintenanceStartDateLte(String maintenanceStartDateLte) {
        this.maintenanceStartDateLte = maintenanceStartDateLte;
    }

    public LicenseWhereInput maintenanceStartDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        return this;
    }

    public void setMaintenanceStartDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
        }
    }

    public boolean getMaintenanceStartDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_LTE);
    }

    public LicenseWhereInput maintenanceStartDateNot(String maintenanceStartDateNot) {

        this.maintenanceStartDateNot = maintenanceStartDateNot;
        return this;
    }

    /**
     * Get maintenanceStartDateNot
     *
     * @return maintenanceStartDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDateNot() {
        return maintenanceStartDateNot;
    }

    public void setMaintenanceStartDateNot(String maintenanceStartDateNot) {
        this.maintenanceStartDateNot = maintenanceStartDateNot;
    }

    public LicenseWhereInput maintenanceStartDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        return this;
    }

    public void setMaintenanceStartDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
        }
    }

    public boolean getMaintenanceStartDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT);
    }

    public LicenseWhereInput maintenanceStartDateNotIn(List<String> maintenanceStartDateNotIn) {

        this.maintenanceStartDateNotIn = maintenanceStartDateNotIn;
        return this;
    }

    public LicenseWhereInput addMaintenanceStartDateNotInItem(
            String maintenanceStartDateNotInItem) {
        if (this.maintenanceStartDateNotIn == null) {
            this.maintenanceStartDateNotIn = new ArrayList<String>();
        }
        this.maintenanceStartDateNotIn.add(maintenanceStartDateNotInItem);
        return this;
    }

    /**
     * Get maintenanceStartDateNotIn
     *
     * @return maintenanceStartDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMaintenanceStartDateNotIn() {
        return maintenanceStartDateNotIn;
    }

    public void setMaintenanceStartDateNotIn(List<String> maintenanceStartDateNotIn) {
        this.maintenanceStartDateNotIn = maintenanceStartDateNotIn;
    }

    public LicenseWhereInput maintenanceStartDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        return this;
    }

    public LicenseWhereInput maintenanceStartDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        return this;
    }

    public void setMaintenanceStartDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
        }
    }

    public boolean getMaintenanceStartDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE_NOT_IN);
    }

    public LicenseWhereInput maxChunkNum(Integer maxChunkNum) {

        this.maxChunkNum = maxChunkNum;
        return this;
    }

    /**
     * Get maxChunkNum
     *
     * @return maxChunkNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNum() {
        return maxChunkNum;
    }

    public void setMaxChunkNum(Integer maxChunkNum) {
        this.maxChunkNum = maxChunkNum;
    }

    public LicenseWhereInput maxChunkNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public LicenseWhereInput maxChunkNum_ExplictlyNonNull() {
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

    public LicenseWhereInput maxChunkNumGt(Integer maxChunkNumGt) {

        this.maxChunkNumGt = maxChunkNumGt;
        return this;
    }

    /**
     * Get maxChunkNumGt
     *
     * @return maxChunkNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumGt() {
        return maxChunkNumGt;
    }

    public void setMaxChunkNumGt(Integer maxChunkNumGt) {
        this.maxChunkNumGt = maxChunkNumGt;
    }

    public LicenseWhereInput maxChunkNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        return this;
    }

    public LicenseWhereInput maxChunkNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        return this;
    }

    public void setMaxChunkNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
        }
    }

    public boolean getMaxChunkNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_GT);
    }

    public LicenseWhereInput maxChunkNumGte(Integer maxChunkNumGte) {

        this.maxChunkNumGte = maxChunkNumGte;
        return this;
    }

    /**
     * Get maxChunkNumGte
     *
     * @return maxChunkNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumGte() {
        return maxChunkNumGte;
    }

    public void setMaxChunkNumGte(Integer maxChunkNumGte) {
        this.maxChunkNumGte = maxChunkNumGte;
    }

    public LicenseWhereInput maxChunkNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        return this;
    }

    public LicenseWhereInput maxChunkNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        return this;
    }

    public void setMaxChunkNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
        }
    }

    public boolean getMaxChunkNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_GTE);
    }

    public LicenseWhereInput maxChunkNumIn(List<Integer> maxChunkNumIn) {

        this.maxChunkNumIn = maxChunkNumIn;
        return this;
    }

    public LicenseWhereInput addMaxChunkNumInItem(Integer maxChunkNumInItem) {
        if (this.maxChunkNumIn == null) {
            this.maxChunkNumIn = new ArrayList<Integer>();
        }
        this.maxChunkNumIn.add(maxChunkNumInItem);
        return this;
    }

    /**
     * Get maxChunkNumIn
     *
     * @return maxChunkNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxChunkNumIn() {
        return maxChunkNumIn;
    }

    public void setMaxChunkNumIn(List<Integer> maxChunkNumIn) {
        this.maxChunkNumIn = maxChunkNumIn;
    }

    public LicenseWhereInput maxChunkNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        return this;
    }

    public LicenseWhereInput maxChunkNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        return this;
    }

    public void setMaxChunkNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
        }
    }

    public boolean getMaxChunkNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_IN);
    }

    public LicenseWhereInput maxChunkNumLt(Integer maxChunkNumLt) {

        this.maxChunkNumLt = maxChunkNumLt;
        return this;
    }

    /**
     * Get maxChunkNumLt
     *
     * @return maxChunkNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumLt() {
        return maxChunkNumLt;
    }

    public void setMaxChunkNumLt(Integer maxChunkNumLt) {
        this.maxChunkNumLt = maxChunkNumLt;
    }

    public LicenseWhereInput maxChunkNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        return this;
    }

    public LicenseWhereInput maxChunkNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        return this;
    }

    public void setMaxChunkNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
        }
    }

    public boolean getMaxChunkNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_LT);
    }

    public LicenseWhereInput maxChunkNumLte(Integer maxChunkNumLte) {

        this.maxChunkNumLte = maxChunkNumLte;
        return this;
    }

    /**
     * Get maxChunkNumLte
     *
     * @return maxChunkNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumLte() {
        return maxChunkNumLte;
    }

    public void setMaxChunkNumLte(Integer maxChunkNumLte) {
        this.maxChunkNumLte = maxChunkNumLte;
    }

    public LicenseWhereInput maxChunkNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        return this;
    }

    public LicenseWhereInput maxChunkNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        return this;
    }

    public void setMaxChunkNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
        }
    }

    public boolean getMaxChunkNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_LTE);
    }

    public LicenseWhereInput maxChunkNumNot(Integer maxChunkNumNot) {

        this.maxChunkNumNot = maxChunkNumNot;
        return this;
    }

    /**
     * Get maxChunkNumNot
     *
     * @return maxChunkNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNumNot() {
        return maxChunkNumNot;
    }

    public void setMaxChunkNumNot(Integer maxChunkNumNot) {
        this.maxChunkNumNot = maxChunkNumNot;
    }

    public LicenseWhereInput maxChunkNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        return this;
    }

    public LicenseWhereInput maxChunkNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        return this;
    }

    public void setMaxChunkNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
        }
    }

    public boolean getMaxChunkNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT);
    }

    public LicenseWhereInput maxChunkNumNotIn(List<Integer> maxChunkNumNotIn) {

        this.maxChunkNumNotIn = maxChunkNumNotIn;
        return this;
    }

    public LicenseWhereInput addMaxChunkNumNotInItem(Integer maxChunkNumNotInItem) {
        if (this.maxChunkNumNotIn == null) {
            this.maxChunkNumNotIn = new ArrayList<Integer>();
        }
        this.maxChunkNumNotIn.add(maxChunkNumNotInItem);
        return this;
    }

    /**
     * Get maxChunkNumNotIn
     *
     * @return maxChunkNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxChunkNumNotIn() {
        return maxChunkNumNotIn;
    }

    public void setMaxChunkNumNotIn(List<Integer> maxChunkNumNotIn) {
        this.maxChunkNumNotIn = maxChunkNumNotIn;
    }

    public LicenseWhereInput maxChunkNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        return this;
    }

    public LicenseWhereInput maxChunkNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        return this;
    }

    public void setMaxChunkNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
        }
    }

    public boolean getMaxChunkNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM_NOT_IN);
    }

    public LicenseWhereInput maxClusterNum(Integer maxClusterNum) {

        this.maxClusterNum = maxClusterNum;
        return this;
    }

    /**
     * Get maxClusterNum
     *
     * @return maxClusterNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNum() {
        return maxClusterNum;
    }

    public void setMaxClusterNum(Integer maxClusterNum) {
        this.maxClusterNum = maxClusterNum;
    }

    public LicenseWhereInput maxClusterNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM);
        return this;
    }

    public LicenseWhereInput maxClusterNum_ExplictlyNonNull() {
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

    public LicenseWhereInput maxClusterNumGt(Integer maxClusterNumGt) {

        this.maxClusterNumGt = maxClusterNumGt;
        return this;
    }

    /**
     * Get maxClusterNumGt
     *
     * @return maxClusterNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNumGt() {
        return maxClusterNumGt;
    }

    public void setMaxClusterNumGt(Integer maxClusterNumGt) {
        this.maxClusterNumGt = maxClusterNumGt;
    }

    public LicenseWhereInput maxClusterNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT);
        return this;
    }

    public LicenseWhereInput maxClusterNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT);
        return this;
    }

    public void setMaxClusterNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT);
        }
    }

    public boolean getMaxClusterNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_GT);
    }

    public LicenseWhereInput maxClusterNumGte(Integer maxClusterNumGte) {

        this.maxClusterNumGte = maxClusterNumGte;
        return this;
    }

    /**
     * Get maxClusterNumGte
     *
     * @return maxClusterNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNumGte() {
        return maxClusterNumGte;
    }

    public void setMaxClusterNumGte(Integer maxClusterNumGte) {
        this.maxClusterNumGte = maxClusterNumGte;
    }

    public LicenseWhereInput maxClusterNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE);
        return this;
    }

    public LicenseWhereInput maxClusterNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE);
        return this;
    }

    public void setMaxClusterNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE);
        }
    }

    public boolean getMaxClusterNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_GTE);
    }

    public LicenseWhereInput maxClusterNumIn(List<Integer> maxClusterNumIn) {

        this.maxClusterNumIn = maxClusterNumIn;
        return this;
    }

    public LicenseWhereInput addMaxClusterNumInItem(Integer maxClusterNumInItem) {
        if (this.maxClusterNumIn == null) {
            this.maxClusterNumIn = new ArrayList<Integer>();
        }
        this.maxClusterNumIn.add(maxClusterNumInItem);
        return this;
    }

    /**
     * Get maxClusterNumIn
     *
     * @return maxClusterNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxClusterNumIn() {
        return maxClusterNumIn;
    }

    public void setMaxClusterNumIn(List<Integer> maxClusterNumIn) {
        this.maxClusterNumIn = maxClusterNumIn;
    }

    public LicenseWhereInput maxClusterNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN);
        return this;
    }

    public LicenseWhereInput maxClusterNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN);
        return this;
    }

    public void setMaxClusterNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN);
        }
    }

    public boolean getMaxClusterNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_IN);
    }

    public LicenseWhereInput maxClusterNumLt(Integer maxClusterNumLt) {

        this.maxClusterNumLt = maxClusterNumLt;
        return this;
    }

    /**
     * Get maxClusterNumLt
     *
     * @return maxClusterNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNumLt() {
        return maxClusterNumLt;
    }

    public void setMaxClusterNumLt(Integer maxClusterNumLt) {
        this.maxClusterNumLt = maxClusterNumLt;
    }

    public LicenseWhereInput maxClusterNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT);
        return this;
    }

    public LicenseWhereInput maxClusterNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT);
        return this;
    }

    public void setMaxClusterNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT);
        }
    }

    public boolean getMaxClusterNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_LT);
    }

    public LicenseWhereInput maxClusterNumLte(Integer maxClusterNumLte) {

        this.maxClusterNumLte = maxClusterNumLte;
        return this;
    }

    /**
     * Get maxClusterNumLte
     *
     * @return maxClusterNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNumLte() {
        return maxClusterNumLte;
    }

    public void setMaxClusterNumLte(Integer maxClusterNumLte) {
        this.maxClusterNumLte = maxClusterNumLte;
    }

    public LicenseWhereInput maxClusterNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE);
        return this;
    }

    public LicenseWhereInput maxClusterNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE);
        return this;
    }

    public void setMaxClusterNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE);
        }
    }

    public boolean getMaxClusterNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_LTE);
    }

    public LicenseWhereInput maxClusterNumNot(Integer maxClusterNumNot) {

        this.maxClusterNumNot = maxClusterNumNot;
        return this;
    }

    /**
     * Get maxClusterNumNot
     *
     * @return maxClusterNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxClusterNumNot() {
        return maxClusterNumNot;
    }

    public void setMaxClusterNumNot(Integer maxClusterNumNot) {
        this.maxClusterNumNot = maxClusterNumNot;
    }

    public LicenseWhereInput maxClusterNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT);
        return this;
    }

    public LicenseWhereInput maxClusterNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT);
        return this;
    }

    public void setMaxClusterNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT);
        }
    }

    public boolean getMaxClusterNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT);
    }

    public LicenseWhereInput maxClusterNumNotIn(List<Integer> maxClusterNumNotIn) {

        this.maxClusterNumNotIn = maxClusterNumNotIn;
        return this;
    }

    public LicenseWhereInput addMaxClusterNumNotInItem(Integer maxClusterNumNotInItem) {
        if (this.maxClusterNumNotIn == null) {
            this.maxClusterNumNotIn = new ArrayList<Integer>();
        }
        this.maxClusterNumNotIn.add(maxClusterNumNotInItem);
        return this;
    }

    /**
     * Get maxClusterNumNotIn
     *
     * @return maxClusterNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxClusterNumNotIn() {
        return maxClusterNumNotIn;
    }

    public void setMaxClusterNumNotIn(List<Integer> maxClusterNumNotIn) {
        this.maxClusterNumNotIn = maxClusterNumNotIn;
    }

    public LicenseWhereInput maxClusterNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN);
        return this;
    }

    public LicenseWhereInput maxClusterNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN);
        return this;
    }

    public void setMaxClusterNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN);
        }
    }

    public boolean getMaxClusterNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CLUSTER_NUM_NOT_IN);
    }

    public LicenseWhereInput signDate(String signDate) {

        this.signDate = signDate;
        return this;
    }

    /**
     * Get signDate
     *
     * @return signDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public LicenseWhereInput signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public LicenseWhereInput signDate_ExplictlyNonNull() {
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

    public LicenseWhereInput signDateGt(String signDateGt) {

        this.signDateGt = signDateGt;
        return this;
    }

    /**
     * Get signDateGt
     *
     * @return signDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGt() {
        return signDateGt;
    }

    public void setSignDateGt(String signDateGt) {
        this.signDateGt = signDateGt;
    }

    public LicenseWhereInput signDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public LicenseWhereInput signDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public void setSignDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        }
    }

    public boolean getSignDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GT);
    }

    public LicenseWhereInput signDateGte(String signDateGte) {

        this.signDateGte = signDateGte;
        return this;
    }

    /**
     * Get signDateGte
     *
     * @return signDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGte() {
        return signDateGte;
    }

    public void setSignDateGte(String signDateGte) {
        this.signDateGte = signDateGte;
    }

    public LicenseWhereInput signDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public LicenseWhereInput signDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public void setSignDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        }
    }

    public boolean getSignDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GTE);
    }

    public LicenseWhereInput signDateIn(List<String> signDateIn) {

        this.signDateIn = signDateIn;
        return this;
    }

    public LicenseWhereInput addSignDateInItem(String signDateInItem) {
        if (this.signDateIn == null) {
            this.signDateIn = new ArrayList<String>();
        }
        this.signDateIn.add(signDateInItem);
        return this;
    }

    /**
     * Get signDateIn
     *
     * @return signDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateIn() {
        return signDateIn;
    }

    public void setSignDateIn(List<String> signDateIn) {
        this.signDateIn = signDateIn;
    }

    public LicenseWhereInput signDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public LicenseWhereInput signDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public void setSignDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        }
    }

    public boolean getSignDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_IN);
    }

    public LicenseWhereInput signDateLt(String signDateLt) {

        this.signDateLt = signDateLt;
        return this;
    }

    /**
     * Get signDateLt
     *
     * @return signDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLt() {
        return signDateLt;
    }

    public void setSignDateLt(String signDateLt) {
        this.signDateLt = signDateLt;
    }

    public LicenseWhereInput signDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public LicenseWhereInput signDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public void setSignDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        }
    }

    public boolean getSignDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LT);
    }

    public LicenseWhereInput signDateLte(String signDateLte) {

        this.signDateLte = signDateLte;
        return this;
    }

    /**
     * Get signDateLte
     *
     * @return signDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLte() {
        return signDateLte;
    }

    public void setSignDateLte(String signDateLte) {
        this.signDateLte = signDateLte;
    }

    public LicenseWhereInput signDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public LicenseWhereInput signDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public void setSignDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        }
    }

    public boolean getSignDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LTE);
    }

    public LicenseWhereInput signDateNot(String signDateNot) {

        this.signDateNot = signDateNot;
        return this;
    }

    /**
     * Get signDateNot
     *
     * @return signDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateNot() {
        return signDateNot;
    }

    public void setSignDateNot(String signDateNot) {
        this.signDateNot = signDateNot;
    }

    public LicenseWhereInput signDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public LicenseWhereInput signDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public void setSignDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        }
    }

    public boolean getSignDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT);
    }

    public LicenseWhereInput signDateNotIn(List<String> signDateNotIn) {

        this.signDateNotIn = signDateNotIn;
        return this;
    }

    public LicenseWhereInput addSignDateNotInItem(String signDateNotInItem) {
        if (this.signDateNotIn == null) {
            this.signDateNotIn = new ArrayList<String>();
        }
        this.signDateNotIn.add(signDateNotInItem);
        return this;
    }

    /**
     * Get signDateNotIn
     *
     * @return signDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateNotIn() {
        return signDateNotIn;
    }

    public void setSignDateNotIn(List<String> signDateNotIn) {
        this.signDateNotIn = signDateNotIn;
    }

    public LicenseWhereInput signDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public LicenseWhereInput signDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public void setSignDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        }
    }

    public boolean getSignDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
    }

    public LicenseWhereInput softwareEdition(SoftwareEdition softwareEdition) {

        this.softwareEdition = softwareEdition;
        return this;
    }

    /**
     * Get softwareEdition
     *
     * @return softwareEdition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SoftwareEdition getSoftwareEdition() {
        return softwareEdition;
    }

    public void setSoftwareEdition(SoftwareEdition softwareEdition) {
        this.softwareEdition = softwareEdition;
    }

    public LicenseWhereInput softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public LicenseWhereInput softwareEdition_ExplictlyNonNull() {
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

    public LicenseWhereInput softwareEditionIn(List<SoftwareEdition> softwareEditionIn) {

        this.softwareEditionIn = softwareEditionIn;
        return this;
    }

    public LicenseWhereInput addSoftwareEditionInItem(SoftwareEdition softwareEditionInItem) {
        if (this.softwareEditionIn == null) {
            this.softwareEditionIn = new ArrayList<SoftwareEdition>();
        }
        this.softwareEditionIn.add(softwareEditionInItem);
        return this;
    }

    /**
     * Get softwareEditionIn
     *
     * @return softwareEditionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SoftwareEdition> getSoftwareEditionIn() {
        return softwareEditionIn;
    }

    public void setSoftwareEditionIn(List<SoftwareEdition> softwareEditionIn) {
        this.softwareEditionIn = softwareEditionIn;
    }

    public LicenseWhereInput softwareEditionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        return this;
    }

    public LicenseWhereInput softwareEditionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        return this;
    }

    public void setSoftwareEditionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        }
    }

    public boolean getSoftwareEditionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
    }

    public LicenseWhereInput softwareEditionNot(SoftwareEdition softwareEditionNot) {

        this.softwareEditionNot = softwareEditionNot;
        return this;
    }

    /**
     * Get softwareEditionNot
     *
     * @return softwareEditionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SoftwareEdition getSoftwareEditionNot() {
        return softwareEditionNot;
    }

    public void setSoftwareEditionNot(SoftwareEdition softwareEditionNot) {
        this.softwareEditionNot = softwareEditionNot;
    }

    public LicenseWhereInput softwareEditionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        return this;
    }

    public LicenseWhereInput softwareEditionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        return this;
    }

    public void setSoftwareEditionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        }
    }

    public boolean getSoftwareEditionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
    }

    public LicenseWhereInput softwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {

        this.softwareEditionNotIn = softwareEditionNotIn;
        return this;
    }

    public LicenseWhereInput addSoftwareEditionNotInItem(SoftwareEdition softwareEditionNotInItem) {
        if (this.softwareEditionNotIn == null) {
            this.softwareEditionNotIn = new ArrayList<SoftwareEdition>();
        }
        this.softwareEditionNotIn.add(softwareEditionNotInItem);
        return this;
    }

    /**
     * Get softwareEditionNotIn
     *
     * @return softwareEditionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SoftwareEdition> getSoftwareEditionNotIn() {
        return softwareEditionNotIn;
    }

    public void setSoftwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {
        this.softwareEditionNotIn = softwareEditionNotIn;
    }

    public LicenseWhereInput softwareEditionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        return this;
    }

    public LicenseWhereInput softwareEditionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        return this;
    }

    public void setSoftwareEditionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        }
    }

    public boolean getSoftwareEditionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
    }

    public LicenseWhereInput type(LicenseType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

    public LicenseWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public LicenseWhereInput type_ExplictlyNonNull() {
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

    public LicenseWhereInput typeIn(List<LicenseType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public LicenseWhereInput addTypeInItem(LicenseType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<LicenseType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<LicenseType> typeIn) {
        this.typeIn = typeIn;
    }

    public LicenseWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public LicenseWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public LicenseWhereInput typeNot(LicenseType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(LicenseType typeNot) {
        this.typeNot = typeNot;
    }

    public LicenseWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public LicenseWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public LicenseWhereInput typeNotIn(List<LicenseType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public LicenseWhereInput addTypeNotInItem(LicenseType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<LicenseType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<LicenseType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public LicenseWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public LicenseWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicenseWhereInput licenseWhereInput = (LicenseWhereInput) o;
        return Objects.equals(this.AND, licenseWhereInput.AND)
                && Objects.equals(this.NOT, licenseWhereInput.NOT)
                && Objects.equals(this.OR, licenseWhereInput.OR)
                && Objects.equals(this.expireDate, licenseWhereInput.expireDate)
                && Objects.equals(this.expireDateGt, licenseWhereInput.expireDateGt)
                && Objects.equals(this.expireDateGte, licenseWhereInput.expireDateGte)
                && Objects.equals(this.expireDateIn, licenseWhereInput.expireDateIn)
                && Objects.equals(this.expireDateLt, licenseWhereInput.expireDateLt)
                && Objects.equals(this.expireDateLte, licenseWhereInput.expireDateLte)
                && Objects.equals(this.expireDateNot, licenseWhereInput.expireDateNot)
                && Objects.equals(this.expireDateNotIn, licenseWhereInput.expireDateNotIn)
                && Objects.equals(this.id, licenseWhereInput.id)
                && Objects.equals(this.idContains, licenseWhereInput.idContains)
                && Objects.equals(this.idEndsWith, licenseWhereInput.idEndsWith)
                && Objects.equals(this.idGt, licenseWhereInput.idGt)
                && Objects.equals(this.idGte, licenseWhereInput.idGte)
                && Objects.equals(this.idIn, licenseWhereInput.idIn)
                && Objects.equals(this.idLt, licenseWhereInput.idLt)
                && Objects.equals(this.idLte, licenseWhereInput.idLte)
                && Objects.equals(this.idNot, licenseWhereInput.idNot)
                && Objects.equals(this.idNotContains, licenseWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, licenseWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, licenseWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, licenseWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, licenseWhereInput.idStartsWith)
                && Objects.equals(this.licenseSerial, licenseWhereInput.licenseSerial)
                && Objects.equals(
                        this.licenseSerialContains, licenseWhereInput.licenseSerialContains)
                && Objects.equals(
                        this.licenseSerialEndsWith, licenseWhereInput.licenseSerialEndsWith)
                && Objects.equals(this.licenseSerialGt, licenseWhereInput.licenseSerialGt)
                && Objects.equals(this.licenseSerialGte, licenseWhereInput.licenseSerialGte)
                && Objects.equals(this.licenseSerialIn, licenseWhereInput.licenseSerialIn)
                && Objects.equals(this.licenseSerialLt, licenseWhereInput.licenseSerialLt)
                && Objects.equals(this.licenseSerialLte, licenseWhereInput.licenseSerialLte)
                && Objects.equals(this.licenseSerialNot, licenseWhereInput.licenseSerialNot)
                && Objects.equals(
                        this.licenseSerialNotContains, licenseWhereInput.licenseSerialNotContains)
                && Objects.equals(
                        this.licenseSerialNotEndsWith, licenseWhereInput.licenseSerialNotEndsWith)
                && Objects.equals(this.licenseSerialNotIn, licenseWhereInput.licenseSerialNotIn)
                && Objects.equals(
                        this.licenseSerialNotStartsWith,
                        licenseWhereInput.licenseSerialNotStartsWith)
                && Objects.equals(
                        this.licenseSerialStartsWith, licenseWhereInput.licenseSerialStartsWith)
                && Objects.equals(this.maintenanceEndDate, licenseWhereInput.maintenanceEndDate)
                && Objects.equals(this.maintenanceEndDateGt, licenseWhereInput.maintenanceEndDateGt)
                && Objects.equals(
                        this.maintenanceEndDateGte, licenseWhereInput.maintenanceEndDateGte)
                && Objects.equals(this.maintenanceEndDateIn, licenseWhereInput.maintenanceEndDateIn)
                && Objects.equals(this.maintenanceEndDateLt, licenseWhereInput.maintenanceEndDateLt)
                && Objects.equals(
                        this.maintenanceEndDateLte, licenseWhereInput.maintenanceEndDateLte)
                && Objects.equals(
                        this.maintenanceEndDateNot, licenseWhereInput.maintenanceEndDateNot)
                && Objects.equals(
                        this.maintenanceEndDateNotIn, licenseWhereInput.maintenanceEndDateNotIn)
                && Objects.equals(this.maintenanceStartDate, licenseWhereInput.maintenanceStartDate)
                && Objects.equals(
                        this.maintenanceStartDateGt, licenseWhereInput.maintenanceStartDateGt)
                && Objects.equals(
                        this.maintenanceStartDateGte, licenseWhereInput.maintenanceStartDateGte)
                && Objects.equals(
                        this.maintenanceStartDateIn, licenseWhereInput.maintenanceStartDateIn)
                && Objects.equals(
                        this.maintenanceStartDateLt, licenseWhereInput.maintenanceStartDateLt)
                && Objects.equals(
                        this.maintenanceStartDateLte, licenseWhereInput.maintenanceStartDateLte)
                && Objects.equals(
                        this.maintenanceStartDateNot, licenseWhereInput.maintenanceStartDateNot)
                && Objects.equals(
                        this.maintenanceStartDateNotIn, licenseWhereInput.maintenanceStartDateNotIn)
                && Objects.equals(this.maxChunkNum, licenseWhereInput.maxChunkNum)
                && Objects.equals(this.maxChunkNumGt, licenseWhereInput.maxChunkNumGt)
                && Objects.equals(this.maxChunkNumGte, licenseWhereInput.maxChunkNumGte)
                && Objects.equals(this.maxChunkNumIn, licenseWhereInput.maxChunkNumIn)
                && Objects.equals(this.maxChunkNumLt, licenseWhereInput.maxChunkNumLt)
                && Objects.equals(this.maxChunkNumLte, licenseWhereInput.maxChunkNumLte)
                && Objects.equals(this.maxChunkNumNot, licenseWhereInput.maxChunkNumNot)
                && Objects.equals(this.maxChunkNumNotIn, licenseWhereInput.maxChunkNumNotIn)
                && Objects.equals(this.maxClusterNum, licenseWhereInput.maxClusterNum)
                && Objects.equals(this.maxClusterNumGt, licenseWhereInput.maxClusterNumGt)
                && Objects.equals(this.maxClusterNumGte, licenseWhereInput.maxClusterNumGte)
                && Objects.equals(this.maxClusterNumIn, licenseWhereInput.maxClusterNumIn)
                && Objects.equals(this.maxClusterNumLt, licenseWhereInput.maxClusterNumLt)
                && Objects.equals(this.maxClusterNumLte, licenseWhereInput.maxClusterNumLte)
                && Objects.equals(this.maxClusterNumNot, licenseWhereInput.maxClusterNumNot)
                && Objects.equals(this.maxClusterNumNotIn, licenseWhereInput.maxClusterNumNotIn)
                && Objects.equals(this.signDate, licenseWhereInput.signDate)
                && Objects.equals(this.signDateGt, licenseWhereInput.signDateGt)
                && Objects.equals(this.signDateGte, licenseWhereInput.signDateGte)
                && Objects.equals(this.signDateIn, licenseWhereInput.signDateIn)
                && Objects.equals(this.signDateLt, licenseWhereInput.signDateLt)
                && Objects.equals(this.signDateLte, licenseWhereInput.signDateLte)
                && Objects.equals(this.signDateNot, licenseWhereInput.signDateNot)
                && Objects.equals(this.signDateNotIn, licenseWhereInput.signDateNotIn)
                && Objects.equals(this.softwareEdition, licenseWhereInput.softwareEdition)
                && Objects.equals(this.softwareEditionIn, licenseWhereInput.softwareEditionIn)
                && Objects.equals(this.softwareEditionNot, licenseWhereInput.softwareEditionNot)
                && Objects.equals(this.softwareEditionNotIn, licenseWhereInput.softwareEditionNotIn)
                && Objects.equals(this.type, licenseWhereInput.type)
                && Objects.equals(this.typeIn, licenseWhereInput.typeIn)
                && Objects.equals(this.typeNot, licenseWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, licenseWhereInput.typeNotIn);
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
                AND,
                NOT,
                OR,
                expireDate,
                expireDateGt,
                expireDateGte,
                expireDateIn,
                expireDateLt,
                expireDateLte,
                expireDateNot,
                expireDateNotIn,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                licenseSerial,
                licenseSerialContains,
                licenseSerialEndsWith,
                licenseSerialGt,
                licenseSerialGte,
                licenseSerialIn,
                licenseSerialLt,
                licenseSerialLte,
                licenseSerialNot,
                licenseSerialNotContains,
                licenseSerialNotEndsWith,
                licenseSerialNotIn,
                licenseSerialNotStartsWith,
                licenseSerialStartsWith,
                maintenanceEndDate,
                maintenanceEndDateGt,
                maintenanceEndDateGte,
                maintenanceEndDateIn,
                maintenanceEndDateLt,
                maintenanceEndDateLte,
                maintenanceEndDateNot,
                maintenanceEndDateNotIn,
                maintenanceStartDate,
                maintenanceStartDateGt,
                maintenanceStartDateGte,
                maintenanceStartDateIn,
                maintenanceStartDateLt,
                maintenanceStartDateLte,
                maintenanceStartDateNot,
                maintenanceStartDateNotIn,
                maxChunkNum,
                maxChunkNumGt,
                maxChunkNumGte,
                maxChunkNumIn,
                maxChunkNumLt,
                maxChunkNumLte,
                maxChunkNumNot,
                maxChunkNumNotIn,
                maxClusterNum,
                maxClusterNumGt,
                maxClusterNumGte,
                maxClusterNumIn,
                maxClusterNumLt,
                maxClusterNumLte,
                maxClusterNumNot,
                maxClusterNumNotIn,
                signDate,
                signDateGt,
                signDateGte,
                signDateIn,
                signDateLt,
                signDateLte,
                signDateNot,
                signDateNotIn,
                softwareEdition,
                softwareEditionIn,
                softwareEditionNot,
                softwareEditionNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn);
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
        sb.append("class LicenseWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    expireDateGt: ").append(toIndentedString(expireDateGt)).append("\n");
        sb.append("    expireDateGte: ").append(toIndentedString(expireDateGte)).append("\n");
        sb.append("    expireDateIn: ").append(toIndentedString(expireDateIn)).append("\n");
        sb.append("    expireDateLt: ").append(toIndentedString(expireDateLt)).append("\n");
        sb.append("    expireDateLte: ").append(toIndentedString(expireDateLte)).append("\n");
        sb.append("    expireDateNot: ").append(toIndentedString(expireDateNot)).append("\n");
        sb.append("    expireDateNotIn: ").append(toIndentedString(expireDateNotIn)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
        sb.append("    licenseSerialContains: ")
                .append(toIndentedString(licenseSerialContains))
                .append("\n");
        sb.append("    licenseSerialEndsWith: ")
                .append(toIndentedString(licenseSerialEndsWith))
                .append("\n");
        sb.append("    licenseSerialGt: ").append(toIndentedString(licenseSerialGt)).append("\n");
        sb.append("    licenseSerialGte: ").append(toIndentedString(licenseSerialGte)).append("\n");
        sb.append("    licenseSerialIn: ").append(toIndentedString(licenseSerialIn)).append("\n");
        sb.append("    licenseSerialLt: ").append(toIndentedString(licenseSerialLt)).append("\n");
        sb.append("    licenseSerialLte: ").append(toIndentedString(licenseSerialLte)).append("\n");
        sb.append("    licenseSerialNot: ").append(toIndentedString(licenseSerialNot)).append("\n");
        sb.append("    licenseSerialNotContains: ")
                .append(toIndentedString(licenseSerialNotContains))
                .append("\n");
        sb.append("    licenseSerialNotEndsWith: ")
                .append(toIndentedString(licenseSerialNotEndsWith))
                .append("\n");
        sb.append("    licenseSerialNotIn: ")
                .append(toIndentedString(licenseSerialNotIn))
                .append("\n");
        sb.append("    licenseSerialNotStartsWith: ")
                .append(toIndentedString(licenseSerialNotStartsWith))
                .append("\n");
        sb.append("    licenseSerialStartsWith: ")
                .append(toIndentedString(licenseSerialStartsWith))
                .append("\n");
        sb.append("    maintenanceEndDate: ")
                .append(toIndentedString(maintenanceEndDate))
                .append("\n");
        sb.append("    maintenanceEndDateGt: ")
                .append(toIndentedString(maintenanceEndDateGt))
                .append("\n");
        sb.append("    maintenanceEndDateGte: ")
                .append(toIndentedString(maintenanceEndDateGte))
                .append("\n");
        sb.append("    maintenanceEndDateIn: ")
                .append(toIndentedString(maintenanceEndDateIn))
                .append("\n");
        sb.append("    maintenanceEndDateLt: ")
                .append(toIndentedString(maintenanceEndDateLt))
                .append("\n");
        sb.append("    maintenanceEndDateLte: ")
                .append(toIndentedString(maintenanceEndDateLte))
                .append("\n");
        sb.append("    maintenanceEndDateNot: ")
                .append(toIndentedString(maintenanceEndDateNot))
                .append("\n");
        sb.append("    maintenanceEndDateNotIn: ")
                .append(toIndentedString(maintenanceEndDateNotIn))
                .append("\n");
        sb.append("    maintenanceStartDate: ")
                .append(toIndentedString(maintenanceStartDate))
                .append("\n");
        sb.append("    maintenanceStartDateGt: ")
                .append(toIndentedString(maintenanceStartDateGt))
                .append("\n");
        sb.append("    maintenanceStartDateGte: ")
                .append(toIndentedString(maintenanceStartDateGte))
                .append("\n");
        sb.append("    maintenanceStartDateIn: ")
                .append(toIndentedString(maintenanceStartDateIn))
                .append("\n");
        sb.append("    maintenanceStartDateLt: ")
                .append(toIndentedString(maintenanceStartDateLt))
                .append("\n");
        sb.append("    maintenanceStartDateLte: ")
                .append(toIndentedString(maintenanceStartDateLte))
                .append("\n");
        sb.append("    maintenanceStartDateNot: ")
                .append(toIndentedString(maintenanceStartDateNot))
                .append("\n");
        sb.append("    maintenanceStartDateNotIn: ")
                .append(toIndentedString(maintenanceStartDateNotIn))
                .append("\n");
        sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
        sb.append("    maxChunkNumGt: ").append(toIndentedString(maxChunkNumGt)).append("\n");
        sb.append("    maxChunkNumGte: ").append(toIndentedString(maxChunkNumGte)).append("\n");
        sb.append("    maxChunkNumIn: ").append(toIndentedString(maxChunkNumIn)).append("\n");
        sb.append("    maxChunkNumLt: ").append(toIndentedString(maxChunkNumLt)).append("\n");
        sb.append("    maxChunkNumLte: ").append(toIndentedString(maxChunkNumLte)).append("\n");
        sb.append("    maxChunkNumNot: ").append(toIndentedString(maxChunkNumNot)).append("\n");
        sb.append("    maxChunkNumNotIn: ").append(toIndentedString(maxChunkNumNotIn)).append("\n");
        sb.append("    maxClusterNum: ").append(toIndentedString(maxClusterNum)).append("\n");
        sb.append("    maxClusterNumGt: ").append(toIndentedString(maxClusterNumGt)).append("\n");
        sb.append("    maxClusterNumGte: ").append(toIndentedString(maxClusterNumGte)).append("\n");
        sb.append("    maxClusterNumIn: ").append(toIndentedString(maxClusterNumIn)).append("\n");
        sb.append("    maxClusterNumLt: ").append(toIndentedString(maxClusterNumLt)).append("\n");
        sb.append("    maxClusterNumLte: ").append(toIndentedString(maxClusterNumLte)).append("\n");
        sb.append("    maxClusterNumNot: ").append(toIndentedString(maxClusterNumNot)).append("\n");
        sb.append("    maxClusterNumNotIn: ")
                .append(toIndentedString(maxClusterNumNotIn))
                .append("\n");
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    signDateGt: ").append(toIndentedString(signDateGt)).append("\n");
        sb.append("    signDateGte: ").append(toIndentedString(signDateGte)).append("\n");
        sb.append("    signDateIn: ").append(toIndentedString(signDateIn)).append("\n");
        sb.append("    signDateLt: ").append(toIndentedString(signDateLt)).append("\n");
        sb.append("    signDateLte: ").append(toIndentedString(signDateLte)).append("\n");
        sb.append("    signDateNot: ").append(toIndentedString(signDateNot)).append("\n");
        sb.append("    signDateNotIn: ").append(toIndentedString(signDateNotIn)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    softwareEditionIn: ")
                .append(toIndentedString(softwareEditionIn))
                .append("\n");
        sb.append("    softwareEditionNot: ")
                .append(toIndentedString(softwareEditionNot))
                .append("\n");
        sb.append("    softwareEditionNotIn: ")
                .append(toIndentedString(softwareEditionNotIn))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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
