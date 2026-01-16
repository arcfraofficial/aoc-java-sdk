package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EverouteLicenseWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EverouteLicenseWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<EverouteLicenseWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<EverouteLicenseWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<EverouteLicenseWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    private String code;

    public static final String SERIALIZED_NAME_CODE_CONTAINS = "code_contains";

    @SerializedName(SERIALIZED_NAME_CODE_CONTAINS)
    private String codeContains;

    public static final String SERIALIZED_NAME_CODE_ENDS_WITH = "code_ends_with";

    @SerializedName(SERIALIZED_NAME_CODE_ENDS_WITH)
    private String codeEndsWith;

    public static final String SERIALIZED_NAME_CODE_GT = "code_gt";

    @SerializedName(SERIALIZED_NAME_CODE_GT)
    private String codeGt;

    public static final String SERIALIZED_NAME_CODE_GTE = "code_gte";

    @SerializedName(SERIALIZED_NAME_CODE_GTE)
    private String codeGte;

    public static final String SERIALIZED_NAME_CODE_IN = "code_in";

    @SerializedName(SERIALIZED_NAME_CODE_IN)
    private List<String> codeIn = null;

    public static final String SERIALIZED_NAME_CODE_LT = "code_lt";

    @SerializedName(SERIALIZED_NAME_CODE_LT)
    private String codeLt;

    public static final String SERIALIZED_NAME_CODE_LTE = "code_lte";

    @SerializedName(SERIALIZED_NAME_CODE_LTE)
    private String codeLte;

    public static final String SERIALIZED_NAME_CODE_NOT = "code_not";

    @SerializedName(SERIALIZED_NAME_CODE_NOT)
    private String codeNot;

    public static final String SERIALIZED_NAME_CODE_NOT_CONTAINS = "code_not_contains";

    @SerializedName(SERIALIZED_NAME_CODE_NOT_CONTAINS)
    private String codeNotContains;

    public static final String SERIALIZED_NAME_CODE_NOT_ENDS_WITH = "code_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CODE_NOT_ENDS_WITH)
    private String codeNotEndsWith;

    public static final String SERIALIZED_NAME_CODE_NOT_IN = "code_not_in";

    @SerializedName(SERIALIZED_NAME_CODE_NOT_IN)
    private List<String> codeNotIn = null;

    public static final String SERIALIZED_NAME_CODE_NOT_STARTS_WITH = "code_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CODE_NOT_STARTS_WITH)
    private String codeNotStartsWith;

    public static final String SERIALIZED_NAME_CODE_STARTS_WITH = "code_starts_with";

    @SerializedName(SERIALIZED_NAME_CODE_STARTS_WITH)
    private String codeStartsWith;

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

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM = "max_socket_num";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM)
    private Integer maxSocketNum;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_GT = "max_socket_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_GT)
    private Integer maxSocketNumGt;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_GTE = "max_socket_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE)
    private Integer maxSocketNumGte;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_IN = "max_socket_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_IN)
    private List<Integer> maxSocketNumIn = null;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_LT = "max_socket_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_LT)
    private Integer maxSocketNumLt;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_LTE = "max_socket_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE)
    private Integer maxSocketNumLte;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_NOT = "max_socket_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT)
    private Integer maxSocketNumNot;

    public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN = "max_socket_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN)
    private List<Integer> maxSocketNumNotIn = null;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SERIAL_CONTAINS = "serial_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_CONTAINS)
    private String serialContains;

    public static final String SERIALIZED_NAME_SERIAL_ENDS_WITH = "serial_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_ENDS_WITH)
    private String serialEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_GT = "serial_gt";

    @SerializedName(SERIALIZED_NAME_SERIAL_GT)
    private String serialGt;

    public static final String SERIALIZED_NAME_SERIAL_GTE = "serial_gte";

    @SerializedName(SERIALIZED_NAME_SERIAL_GTE)
    private String serialGte;

    public static final String SERIALIZED_NAME_SERIAL_IN = "serial_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_IN)
    private List<String> serialIn = null;

    public static final String SERIALIZED_NAME_SERIAL_LT = "serial_lt";

    @SerializedName(SERIALIZED_NAME_SERIAL_LT)
    private String serialLt;

    public static final String SERIALIZED_NAME_SERIAL_LTE = "serial_lte";

    @SerializedName(SERIALIZED_NAME_SERIAL_LTE)
    private String serialLte;

    public static final String SERIALIZED_NAME_SERIAL_NOT = "serial_not";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT)
    private String serialNot;

    public static final String SERIALIZED_NAME_SERIAL_NOT_CONTAINS = "serial_not_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_CONTAINS)
    private String serialNotContains;

    public static final String SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH = "serial_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH)
    private String serialNotEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_NOT_IN = "serial_not_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_IN)
    private List<String> serialNotIn = null;

    public static final String SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH = "serial_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH)
    private String serialNotStartsWith;

    public static final String SERIALIZED_NAME_SERIAL_STARTS_WITH = "serial_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_STARTS_WITH)
    private String serialStartsWith;

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

    public static final String SERIALIZED_NAME_UID = "uid";

    @SerializedName(SERIALIZED_NAME_UID)
    private String uid;

    public static final String SERIALIZED_NAME_UID_CONTAINS = "uid_contains";

    @SerializedName(SERIALIZED_NAME_UID_CONTAINS)
    private String uidContains;

    public static final String SERIALIZED_NAME_UID_ENDS_WITH = "uid_ends_with";

    @SerializedName(SERIALIZED_NAME_UID_ENDS_WITH)
    private String uidEndsWith;

    public static final String SERIALIZED_NAME_UID_GT = "uid_gt";

    @SerializedName(SERIALIZED_NAME_UID_GT)
    private String uidGt;

    public static final String SERIALIZED_NAME_UID_GTE = "uid_gte";

    @SerializedName(SERIALIZED_NAME_UID_GTE)
    private String uidGte;

    public static final String SERIALIZED_NAME_UID_IN = "uid_in";

    @SerializedName(SERIALIZED_NAME_UID_IN)
    private List<String> uidIn = null;

    public static final String SERIALIZED_NAME_UID_LT = "uid_lt";

    @SerializedName(SERIALIZED_NAME_UID_LT)
    private String uidLt;

    public static final String SERIALIZED_NAME_UID_LTE = "uid_lte";

    @SerializedName(SERIALIZED_NAME_UID_LTE)
    private String uidLte;

    public static final String SERIALIZED_NAME_UID_NOT = "uid_not";

    @SerializedName(SERIALIZED_NAME_UID_NOT)
    private String uidNot;

    public static final String SERIALIZED_NAME_UID_NOT_CONTAINS = "uid_not_contains";

    @SerializedName(SERIALIZED_NAME_UID_NOT_CONTAINS)
    private String uidNotContains;

    public static final String SERIALIZED_NAME_UID_NOT_ENDS_WITH = "uid_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UID_NOT_ENDS_WITH)
    private String uidNotEndsWith;

    public static final String SERIALIZED_NAME_UID_NOT_IN = "uid_not_in";

    @SerializedName(SERIALIZED_NAME_UID_NOT_IN)
    private List<String> uidNotIn = null;

    public static final String SERIALIZED_NAME_UID_NOT_STARTS_WITH = "uid_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UID_NOT_STARTS_WITH)
    private String uidNotStartsWith;

    public static final String SERIALIZED_NAME_UID_STARTS_WITH = "uid_starts_with";

    @SerializedName(SERIALIZED_NAME_UID_STARTS_WITH)
    private String uidStartsWith;

    public EverouteLicenseWhereInput() {}

    public EverouteLicenseWhereInput AND(List<EverouteLicenseWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public EverouteLicenseWhereInput addANDItem(EverouteLicenseWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<EverouteLicenseWhereInput>();
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
    public List<EverouteLicenseWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<EverouteLicenseWhereInput> AND) {
        this.AND = AND;
    }

    public EverouteLicenseWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public EverouteLicenseWhereInput AND_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput NOT(List<EverouteLicenseWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public EverouteLicenseWhereInput addNOTItem(EverouteLicenseWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<EverouteLicenseWhereInput>();
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
    public List<EverouteLicenseWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<EverouteLicenseWhereInput> NOT) {
        this.NOT = NOT;
    }

    public EverouteLicenseWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public EverouteLicenseWhereInput NOT_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput OR(List<EverouteLicenseWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public EverouteLicenseWhereInput addORItem(EverouteLicenseWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<EverouteLicenseWhereInput>();
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
    public List<EverouteLicenseWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<EverouteLicenseWhereInput> OR) {
        this.OR = OR;
    }

    public EverouteLicenseWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public EverouteLicenseWhereInput OR_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput code(String code) {

        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EverouteLicenseWhereInput code_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE);
        return this;
    }

    public EverouteLicenseWhereInput code_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput codeContains(String codeContains) {

        this.codeContains = codeContains;
        return this;
    }

    /**
     * Get codeContains
     *
     * @return codeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeContains() {
        return codeContains;
    }

    public void setCodeContains(String codeContains) {
        this.codeContains = codeContains;
    }

    public EverouteLicenseWhereInput codeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput codeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_CONTAINS);
        return this;
    }

    public void setCodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_CONTAINS);
        }
    }

    public boolean getCodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_CONTAINS);
    }

    public EverouteLicenseWhereInput codeEndsWith(String codeEndsWith) {

        this.codeEndsWith = codeEndsWith;
        return this;
    }

    /**
     * Get codeEndsWith
     *
     * @return codeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeEndsWith() {
        return codeEndsWith;
    }

    public void setCodeEndsWith(String codeEndsWith) {
        this.codeEndsWith = codeEndsWith;
    }

    public EverouteLicenseWhereInput codeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput codeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_ENDS_WITH);
        return this;
    }

    public void setCodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_ENDS_WITH);
        }
    }

    public boolean getCodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_ENDS_WITH);
    }

    public EverouteLicenseWhereInput codeGt(String codeGt) {

        this.codeGt = codeGt;
        return this;
    }

    /**
     * Get codeGt
     *
     * @return codeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeGt() {
        return codeGt;
    }

    public void setCodeGt(String codeGt) {
        this.codeGt = codeGt;
    }

    public EverouteLicenseWhereInput codeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_GT);
        return this;
    }

    public EverouteLicenseWhereInput codeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_GT);
        return this;
    }

    public void setCodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_GT);
        }
    }

    public boolean getCodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_GT);
    }

    public EverouteLicenseWhereInput codeGte(String codeGte) {

        this.codeGte = codeGte;
        return this;
    }

    /**
     * Get codeGte
     *
     * @return codeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeGte() {
        return codeGte;
    }

    public void setCodeGte(String codeGte) {
        this.codeGte = codeGte;
    }

    public EverouteLicenseWhereInput codeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_GTE);
        return this;
    }

    public EverouteLicenseWhereInput codeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_GTE);
        return this;
    }

    public void setCodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_GTE);
        }
    }

    public boolean getCodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_GTE);
    }

    public EverouteLicenseWhereInput codeIn(List<String> codeIn) {

        this.codeIn = codeIn;
        return this;
    }

    public EverouteLicenseWhereInput addCodeInItem(String codeInItem) {
        if (this.codeIn == null) {
            this.codeIn = new ArrayList<String>();
        }
        this.codeIn.add(codeInItem);
        return this;
    }

    /**
     * Get codeIn
     *
     * @return codeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCodeIn() {
        return codeIn;
    }

    public void setCodeIn(List<String> codeIn) {
        this.codeIn = codeIn;
    }

    public EverouteLicenseWhereInput codeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_IN);
        return this;
    }

    public EverouteLicenseWhereInput codeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_IN);
        return this;
    }

    public void setCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_IN);
        }
    }

    public boolean getCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_IN);
    }

    public EverouteLicenseWhereInput codeLt(String codeLt) {

        this.codeLt = codeLt;
        return this;
    }

    /**
     * Get codeLt
     *
     * @return codeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeLt() {
        return codeLt;
    }

    public void setCodeLt(String codeLt) {
        this.codeLt = codeLt;
    }

    public EverouteLicenseWhereInput codeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_LT);
        return this;
    }

    public EverouteLicenseWhereInput codeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_LT);
        return this;
    }

    public void setCodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_LT);
        }
    }

    public boolean getCodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_LT);
    }

    public EverouteLicenseWhereInput codeLte(String codeLte) {

        this.codeLte = codeLte;
        return this;
    }

    /**
     * Get codeLte
     *
     * @return codeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeLte() {
        return codeLte;
    }

    public void setCodeLte(String codeLte) {
        this.codeLte = codeLte;
    }

    public EverouteLicenseWhereInput codeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_LTE);
        return this;
    }

    public EverouteLicenseWhereInput codeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_LTE);
        return this;
    }

    public void setCodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_LTE);
        }
    }

    public boolean getCodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_LTE);
    }

    public EverouteLicenseWhereInput codeNot(String codeNot) {

        this.codeNot = codeNot;
        return this;
    }

    /**
     * Get codeNot
     *
     * @return codeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeNot() {
        return codeNot;
    }

    public void setCodeNot(String codeNot) {
        this.codeNot = codeNot;
    }

    public EverouteLicenseWhereInput codeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_NOT);
        return this;
    }

    public EverouteLicenseWhereInput codeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT);
        return this;
    }

    public void setCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT);
        }
    }

    public boolean getCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_NOT);
    }

    public EverouteLicenseWhereInput codeNotContains(String codeNotContains) {

        this.codeNotContains = codeNotContains;
        return this;
    }

    /**
     * Get codeNotContains
     *
     * @return codeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeNotContains() {
        return codeNotContains;
    }

    public void setCodeNotContains(String codeNotContains) {
        this.codeNotContains = codeNotContains;
    }

    public EverouteLicenseWhereInput codeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput codeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_CONTAINS);
        return this;
    }

    public void setCodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_CONTAINS);
        }
    }

    public boolean getCodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_NOT_CONTAINS);
    }

    public EverouteLicenseWhereInput codeNotEndsWith(String codeNotEndsWith) {

        this.codeNotEndsWith = codeNotEndsWith;
        return this;
    }

    /**
     * Get codeNotEndsWith
     *
     * @return codeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeNotEndsWith() {
        return codeNotEndsWith;
    }

    public void setCodeNotEndsWith(String codeNotEndsWith) {
        this.codeNotEndsWith = codeNotEndsWith;
    }

    public EverouteLicenseWhereInput codeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput codeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_ENDS_WITH);
        return this;
    }

    public void setCodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_ENDS_WITH);
        }
    }

    public boolean getCodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_NOT_ENDS_WITH);
    }

    public EverouteLicenseWhereInput codeNotIn(List<String> codeNotIn) {

        this.codeNotIn = codeNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addCodeNotInItem(String codeNotInItem) {
        if (this.codeNotIn == null) {
            this.codeNotIn = new ArrayList<String>();
        }
        this.codeNotIn.add(codeNotInItem);
        return this;
    }

    /**
     * Get codeNotIn
     *
     * @return codeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCodeNotIn() {
        return codeNotIn;
    }

    public void setCodeNotIn(List<String> codeNotIn) {
        this.codeNotIn = codeNotIn;
    }

    public EverouteLicenseWhereInput codeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput codeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_IN);
        return this;
    }

    public void setCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_IN);
        }
    }

    public boolean getCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_NOT_IN);
    }

    public EverouteLicenseWhereInput codeNotStartsWith(String codeNotStartsWith) {

        this.codeNotStartsWith = codeNotStartsWith;
        return this;
    }

    /**
     * Get codeNotStartsWith
     *
     * @return codeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeNotStartsWith() {
        return codeNotStartsWith;
    }

    public void setCodeNotStartsWith(String codeNotStartsWith) {
        this.codeNotStartsWith = codeNotStartsWith;
    }

    public EverouteLicenseWhereInput codeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput codeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_STARTS_WITH);
        return this;
    }

    public void setCodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_NOT_STARTS_WITH);
        }
    }

    public boolean getCodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_NOT_STARTS_WITH);
    }

    public EverouteLicenseWhereInput codeStartsWith(String codeStartsWith) {

        this.codeStartsWith = codeStartsWith;
        return this;
    }

    /**
     * Get codeStartsWith
     *
     * @return codeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCodeStartsWith() {
        return codeStartsWith;
    }

    public void setCodeStartsWith(String codeStartsWith) {
        this.codeStartsWith = codeStartsWith;
    }

    public EverouteLicenseWhereInput codeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CODE_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput codeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CODE_STARTS_WITH);
        return this;
    }

    public void setCodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CODE_STARTS_WITH);
        }
    }

    public boolean getCodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CODE_STARTS_WITH);
    }

    public EverouteLicenseWhereInput expireDate(String expireDate) {

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

    public EverouteLicenseWhereInput expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public EverouteLicenseWhereInput expireDate_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateGt(String expireDateGt) {

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

    public EverouteLicenseWhereInput expireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public EverouteLicenseWhereInput expireDateGt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateGte(String expireDateGte) {

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

    public EverouteLicenseWhereInput expireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public EverouteLicenseWhereInput expireDateGte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateIn(List<String> expireDateIn) {

        this.expireDateIn = expireDateIn;
        return this;
    }

    public EverouteLicenseWhereInput addExpireDateInItem(String expireDateInItem) {
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

    public EverouteLicenseWhereInput expireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public EverouteLicenseWhereInput expireDateIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateLt(String expireDateLt) {

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

    public EverouteLicenseWhereInput expireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public EverouteLicenseWhereInput expireDateLt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateLte(String expireDateLte) {

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

    public EverouteLicenseWhereInput expireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public EverouteLicenseWhereInput expireDateLte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateNot(String expireDateNot) {

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

    public EverouteLicenseWhereInput expireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public EverouteLicenseWhereInput expireDateNot_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput expireDateNotIn(List<String> expireDateNotIn) {

        this.expireDateNotIn = expireDateNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addExpireDateNotInItem(String expireDateNotInItem) {
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

    public EverouteLicenseWhereInput expireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput expireDateNotIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput id(String id) {

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

    public EverouteLicenseWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EverouteLicenseWhereInput id_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idContains(String idContains) {

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

    public EverouteLicenseWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput idContains_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idEndsWith(String idEndsWith) {

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

    public EverouteLicenseWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput idEndsWith_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idGt(String idGt) {

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

    public EverouteLicenseWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public EverouteLicenseWhereInput idGt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idGte(String idGte) {

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

    public EverouteLicenseWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public EverouteLicenseWhereInput idGte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public EverouteLicenseWhereInput addIdInItem(String idInItem) {
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

    public EverouteLicenseWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public EverouteLicenseWhereInput idIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idLt(String idLt) {

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

    public EverouteLicenseWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public EverouteLicenseWhereInput idLt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idLte(String idLte) {

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

    public EverouteLicenseWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public EverouteLicenseWhereInput idLte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idNot(String idNot) {

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

    public EverouteLicenseWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public EverouteLicenseWhereInput idNot_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idNotContains(String idNotContains) {

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

    public EverouteLicenseWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput idNotContains_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public EverouteLicenseWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addIdNotInItem(String idNotInItem) {
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

    public EverouteLicenseWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput idNotIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public EverouteLicenseWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput idStartsWith(String idStartsWith) {

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

    public EverouteLicenseWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput idStartsWith_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput maxSocketNum(Integer maxSocketNum) {

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

    public EverouteLicenseWhereInput maxSocketNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNum_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput maxSocketNumGt(Integer maxSocketNumGt) {

        this.maxSocketNumGt = maxSocketNumGt;
        return this;
    }

    /**
     * Get maxSocketNumGt
     *
     * @return maxSocketNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNumGt() {
        return maxSocketNumGt;
    }

    public void setMaxSocketNumGt(Integer maxSocketNumGt) {
        this.maxSocketNumGt = maxSocketNumGt;
    }

    public EverouteLicenseWhereInput maxSocketNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_GT);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_GT);
        return this;
    }

    public void setMaxSocketNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_GT);
        }
    }

    public boolean getMaxSocketNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_GT);
    }

    public EverouteLicenseWhereInput maxSocketNumGte(Integer maxSocketNumGte) {

        this.maxSocketNumGte = maxSocketNumGte;
        return this;
    }

    /**
     * Get maxSocketNumGte
     *
     * @return maxSocketNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNumGte() {
        return maxSocketNumGte;
    }

    public void setMaxSocketNumGte(Integer maxSocketNumGte) {
        this.maxSocketNumGte = maxSocketNumGte;
    }

    public EverouteLicenseWhereInput maxSocketNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE);
        return this;
    }

    public void setMaxSocketNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE);
        }
    }

    public boolean getMaxSocketNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE);
    }

    public EverouteLicenseWhereInput maxSocketNumIn(List<Integer> maxSocketNumIn) {

        this.maxSocketNumIn = maxSocketNumIn;
        return this;
    }

    public EverouteLicenseWhereInput addMaxSocketNumInItem(Integer maxSocketNumInItem) {
        if (this.maxSocketNumIn == null) {
            this.maxSocketNumIn = new ArrayList<Integer>();
        }
        this.maxSocketNumIn.add(maxSocketNumInItem);
        return this;
    }

    /**
     * Get maxSocketNumIn
     *
     * @return maxSocketNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxSocketNumIn() {
        return maxSocketNumIn;
    }

    public void setMaxSocketNumIn(List<Integer> maxSocketNumIn) {
        this.maxSocketNumIn = maxSocketNumIn;
    }

    public EverouteLicenseWhereInput maxSocketNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_IN);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_IN);
        return this;
    }

    public void setMaxSocketNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_IN);
        }
    }

    public boolean getMaxSocketNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_IN);
    }

    public EverouteLicenseWhereInput maxSocketNumLt(Integer maxSocketNumLt) {

        this.maxSocketNumLt = maxSocketNumLt;
        return this;
    }

    /**
     * Get maxSocketNumLt
     *
     * @return maxSocketNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNumLt() {
        return maxSocketNumLt;
    }

    public void setMaxSocketNumLt(Integer maxSocketNumLt) {
        this.maxSocketNumLt = maxSocketNumLt;
    }

    public EverouteLicenseWhereInput maxSocketNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_LT);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_LT);
        return this;
    }

    public void setMaxSocketNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_LT);
        }
    }

    public boolean getMaxSocketNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_LT);
    }

    public EverouteLicenseWhereInput maxSocketNumLte(Integer maxSocketNumLte) {

        this.maxSocketNumLte = maxSocketNumLte;
        return this;
    }

    /**
     * Get maxSocketNumLte
     *
     * @return maxSocketNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNumLte() {
        return maxSocketNumLte;
    }

    public void setMaxSocketNumLte(Integer maxSocketNumLte) {
        this.maxSocketNumLte = maxSocketNumLte;
    }

    public EverouteLicenseWhereInput maxSocketNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE);
        return this;
    }

    public void setMaxSocketNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE);
        }
    }

    public boolean getMaxSocketNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE);
    }

    public EverouteLicenseWhereInput maxSocketNumNot(Integer maxSocketNumNot) {

        this.maxSocketNumNot = maxSocketNumNot;
        return this;
    }

    /**
     * Get maxSocketNumNot
     *
     * @return maxSocketNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxSocketNumNot() {
        return maxSocketNumNot;
    }

    public void setMaxSocketNumNot(Integer maxSocketNumNot) {
        this.maxSocketNumNot = maxSocketNumNot;
    }

    public EverouteLicenseWhereInput maxSocketNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT);
        return this;
    }

    public void setMaxSocketNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT);
        }
    }

    public boolean getMaxSocketNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT);
    }

    public EverouteLicenseWhereInput maxSocketNumNotIn(List<Integer> maxSocketNumNotIn) {

        this.maxSocketNumNotIn = maxSocketNumNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addMaxSocketNumNotInItem(Integer maxSocketNumNotInItem) {
        if (this.maxSocketNumNotIn == null) {
            this.maxSocketNumNotIn = new ArrayList<Integer>();
        }
        this.maxSocketNumNotIn.add(maxSocketNumNotInItem);
        return this;
    }

    /**
     * Get maxSocketNumNotIn
     *
     * @return maxSocketNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxSocketNumNotIn() {
        return maxSocketNumNotIn;
    }

    public void setMaxSocketNumNotIn(List<Integer> maxSocketNumNotIn) {
        this.maxSocketNumNotIn = maxSocketNumNotIn;
    }

    public EverouteLicenseWhereInput maxSocketNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput maxSocketNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN);
        return this;
    }

    public void setMaxSocketNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN);
        }
    }

    public boolean getMaxSocketNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN);
    }

    public EverouteLicenseWhereInput serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public EverouteLicenseWhereInput serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public EverouteLicenseWhereInput serial_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput serialContains(String serialContains) {

        this.serialContains = serialContains;
        return this;
    }

    /**
     * Get serialContains
     *
     * @return serialContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialContains() {
        return serialContains;
    }

    public void setSerialContains(String serialContains) {
        this.serialContains = serialContains;
    }

    public EverouteLicenseWhereInput serialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput serialContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public void setSerialContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        }
    }

    public boolean getSerialContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_CONTAINS);
    }

    public EverouteLicenseWhereInput serialEndsWith(String serialEndsWith) {

        this.serialEndsWith = serialEndsWith;
        return this;
    }

    /**
     * Get serialEndsWith
     *
     * @return serialEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialEndsWith() {
        return serialEndsWith;
    }

    public void setSerialEndsWith(String serialEndsWith) {
        this.serialEndsWith = serialEndsWith;
    }

    public EverouteLicenseWhereInput serialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput serialEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public void setSerialEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        }
    }

    public boolean getSerialEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_ENDS_WITH);
    }

    public EverouteLicenseWhereInput serialGt(String serialGt) {

        this.serialGt = serialGt;
        return this;
    }

    /**
     * Get serialGt
     *
     * @return serialGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGt() {
        return serialGt;
    }

    public void setSerialGt(String serialGt) {
        this.serialGt = serialGt;
    }

    public EverouteLicenseWhereInput serialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public EverouteLicenseWhereInput serialGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public void setSerialGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        }
    }

    public boolean getSerialGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GT);
    }

    public EverouteLicenseWhereInput serialGte(String serialGte) {

        this.serialGte = serialGte;
        return this;
    }

    /**
     * Get serialGte
     *
     * @return serialGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGte() {
        return serialGte;
    }

    public void setSerialGte(String serialGte) {
        this.serialGte = serialGte;
    }

    public EverouteLicenseWhereInput serialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public EverouteLicenseWhereInput serialGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public void setSerialGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        }
    }

    public boolean getSerialGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GTE);
    }

    public EverouteLicenseWhereInput serialIn(List<String> serialIn) {

        this.serialIn = serialIn;
        return this;
    }

    public EverouteLicenseWhereInput addSerialInItem(String serialInItem) {
        if (this.serialIn == null) {
            this.serialIn = new ArrayList<String>();
        }
        this.serialIn.add(serialInItem);
        return this;
    }

    /**
     * Get serialIn
     *
     * @return serialIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialIn() {
        return serialIn;
    }

    public void setSerialIn(List<String> serialIn) {
        this.serialIn = serialIn;
    }

    public EverouteLicenseWhereInput serialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public EverouteLicenseWhereInput serialIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public void setSerialIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        }
    }

    public boolean getSerialIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_IN);
    }

    public EverouteLicenseWhereInput serialLt(String serialLt) {

        this.serialLt = serialLt;
        return this;
    }

    /**
     * Get serialLt
     *
     * @return serialLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLt() {
        return serialLt;
    }

    public void setSerialLt(String serialLt) {
        this.serialLt = serialLt;
    }

    public EverouteLicenseWhereInput serialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public EverouteLicenseWhereInput serialLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public void setSerialLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        }
    }

    public boolean getSerialLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LT);
    }

    public EverouteLicenseWhereInput serialLte(String serialLte) {

        this.serialLte = serialLte;
        return this;
    }

    /**
     * Get serialLte
     *
     * @return serialLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLte() {
        return serialLte;
    }

    public void setSerialLte(String serialLte) {
        this.serialLte = serialLte;
    }

    public EverouteLicenseWhereInput serialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public EverouteLicenseWhereInput serialLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public void setSerialLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        }
    }

    public boolean getSerialLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LTE);
    }

    public EverouteLicenseWhereInput serialNot(String serialNot) {

        this.serialNot = serialNot;
        return this;
    }

    /**
     * Get serialNot
     *
     * @return serialNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNot() {
        return serialNot;
    }

    public void setSerialNot(String serialNot) {
        this.serialNot = serialNot;
    }

    public EverouteLicenseWhereInput serialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public EverouteLicenseWhereInput serialNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public void setSerialNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        }
    }

    public boolean getSerialNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT);
    }

    public EverouteLicenseWhereInput serialNotContains(String serialNotContains) {

        this.serialNotContains = serialNotContains;
        return this;
    }

    /**
     * Get serialNotContains
     *
     * @return serialNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotContains() {
        return serialNotContains;
    }

    public void setSerialNotContains(String serialNotContains) {
        this.serialNotContains = serialNotContains;
    }

    public EverouteLicenseWhereInput serialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput serialNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public void setSerialNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        }
    }

    public boolean getSerialNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
    }

    public EverouteLicenseWhereInput serialNotEndsWith(String serialNotEndsWith) {

        this.serialNotEndsWith = serialNotEndsWith;
        return this;
    }

    /**
     * Get serialNotEndsWith
     *
     * @return serialNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotEndsWith() {
        return serialNotEndsWith;
    }

    public void setSerialNotEndsWith(String serialNotEndsWith) {
        this.serialNotEndsWith = serialNotEndsWith;
    }

    public EverouteLicenseWhereInput serialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput serialNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public void setSerialNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        }
    }

    public boolean getSerialNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
    }

    public EverouteLicenseWhereInput serialNotIn(List<String> serialNotIn) {

        this.serialNotIn = serialNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addSerialNotInItem(String serialNotInItem) {
        if (this.serialNotIn == null) {
            this.serialNotIn = new ArrayList<String>();
        }
        this.serialNotIn.add(serialNotInItem);
        return this;
    }

    /**
     * Get serialNotIn
     *
     * @return serialNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialNotIn() {
        return serialNotIn;
    }

    public void setSerialNotIn(List<String> serialNotIn) {
        this.serialNotIn = serialNotIn;
    }

    public EverouteLicenseWhereInput serialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput serialNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public void setSerialNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        }
    }

    public boolean getSerialNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_IN);
    }

    public EverouteLicenseWhereInput serialNotStartsWith(String serialNotStartsWith) {

        this.serialNotStartsWith = serialNotStartsWith;
        return this;
    }

    /**
     * Get serialNotStartsWith
     *
     * @return serialNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotStartsWith() {
        return serialNotStartsWith;
    }

    public void setSerialNotStartsWith(String serialNotStartsWith) {
        this.serialNotStartsWith = serialNotStartsWith;
    }

    public EverouteLicenseWhereInput serialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput serialNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public void setSerialNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        }
    }

    public boolean getSerialNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
    }

    public EverouteLicenseWhereInput serialStartsWith(String serialStartsWith) {

        this.serialStartsWith = serialStartsWith;
        return this;
    }

    /**
     * Get serialStartsWith
     *
     * @return serialStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialStartsWith() {
        return serialStartsWith;
    }

    public void setSerialStartsWith(String serialStartsWith) {
        this.serialStartsWith = serialStartsWith;
    }

    public EverouteLicenseWhereInput serialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput serialStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public void setSerialStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        }
    }

    public boolean getSerialStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_STARTS_WITH);
    }

    public EverouteLicenseWhereInput signDate(String signDate) {

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

    public EverouteLicenseWhereInput signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public EverouteLicenseWhereInput signDate_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateGt(String signDateGt) {

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

    public EverouteLicenseWhereInput signDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public EverouteLicenseWhereInput signDateGt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateGte(String signDateGte) {

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

    public EverouteLicenseWhereInput signDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public EverouteLicenseWhereInput signDateGte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateIn(List<String> signDateIn) {

        this.signDateIn = signDateIn;
        return this;
    }

    public EverouteLicenseWhereInput addSignDateInItem(String signDateInItem) {
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

    public EverouteLicenseWhereInput signDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public EverouteLicenseWhereInput signDateIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateLt(String signDateLt) {

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

    public EverouteLicenseWhereInput signDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public EverouteLicenseWhereInput signDateLt_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateLte(String signDateLte) {

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

    public EverouteLicenseWhereInput signDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public EverouteLicenseWhereInput signDateLte_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateNot(String signDateNot) {

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

    public EverouteLicenseWhereInput signDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public EverouteLicenseWhereInput signDateNot_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput signDateNotIn(List<String> signDateNotIn) {

        this.signDateNotIn = signDateNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addSignDateNotInItem(String signDateNotInItem) {
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

    public EverouteLicenseWhereInput signDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput signDateNotIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput softwareEdition(SoftwareEdition softwareEdition) {

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

    public EverouteLicenseWhereInput softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public EverouteLicenseWhereInput softwareEdition_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput softwareEditionIn(List<SoftwareEdition> softwareEditionIn) {

        this.softwareEditionIn = softwareEditionIn;
        return this;
    }

    public EverouteLicenseWhereInput addSoftwareEditionInItem(
            SoftwareEdition softwareEditionInItem) {
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

    public EverouteLicenseWhereInput softwareEditionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_IN);
        return this;
    }

    public EverouteLicenseWhereInput softwareEditionIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput softwareEditionNot(SoftwareEdition softwareEditionNot) {

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

    public EverouteLicenseWhereInput softwareEditionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT);
        return this;
    }

    public EverouteLicenseWhereInput softwareEditionNot_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput softwareEditionNotIn(
            List<SoftwareEdition> softwareEditionNotIn) {

        this.softwareEditionNotIn = softwareEditionNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addSoftwareEditionNotInItem(
            SoftwareEdition softwareEditionNotInItem) {
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

    public EverouteLicenseWhereInput softwareEditionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput softwareEditionNotIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput type(LicenseType type) {

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

    public EverouteLicenseWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public EverouteLicenseWhereInput type_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput typeIn(List<LicenseType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public EverouteLicenseWhereInput addTypeInItem(LicenseType typeInItem) {
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

    public EverouteLicenseWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public EverouteLicenseWhereInput typeIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput typeNot(LicenseType typeNot) {

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

    public EverouteLicenseWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public EverouteLicenseWhereInput typeNot_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput typeNotIn(List<LicenseType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addTypeNotInItem(LicenseType typeNotInItem) {
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

    public EverouteLicenseWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput typeNotIn_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput uid(String uid) {

        this.uid = uid;
        return this;
    }

    /**
     * Get uid
     *
     * @return uid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public EverouteLicenseWhereInput uid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID);
        return this;
    }

    public EverouteLicenseWhereInput uid_ExplictlyNonNull() {
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

    public EverouteLicenseWhereInput uidContains(String uidContains) {

        this.uidContains = uidContains;
        return this;
    }

    /**
     * Get uidContains
     *
     * @return uidContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidContains() {
        return uidContains;
    }

    public void setUidContains(String uidContains) {
        this.uidContains = uidContains;
    }

    public EverouteLicenseWhereInput uidContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput uidContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_CONTAINS);
        return this;
    }

    public void setUidContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_CONTAINS);
        }
    }

    public boolean getUidContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_CONTAINS);
    }

    public EverouteLicenseWhereInput uidEndsWith(String uidEndsWith) {

        this.uidEndsWith = uidEndsWith;
        return this;
    }

    /**
     * Get uidEndsWith
     *
     * @return uidEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidEndsWith() {
        return uidEndsWith;
    }

    public void setUidEndsWith(String uidEndsWith) {
        this.uidEndsWith = uidEndsWith;
    }

    public EverouteLicenseWhereInput uidEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput uidEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_ENDS_WITH);
        return this;
    }

    public void setUidEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_ENDS_WITH);
        }
    }

    public boolean getUidEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_ENDS_WITH);
    }

    public EverouteLicenseWhereInput uidGt(String uidGt) {

        this.uidGt = uidGt;
        return this;
    }

    /**
     * Get uidGt
     *
     * @return uidGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidGt() {
        return uidGt;
    }

    public void setUidGt(String uidGt) {
        this.uidGt = uidGt;
    }

    public EverouteLicenseWhereInput uidGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_GT);
        return this;
    }

    public EverouteLicenseWhereInput uidGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_GT);
        return this;
    }

    public void setUidGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_GT);
        }
    }

    public boolean getUidGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_GT);
    }

    public EverouteLicenseWhereInput uidGte(String uidGte) {

        this.uidGte = uidGte;
        return this;
    }

    /**
     * Get uidGte
     *
     * @return uidGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidGte() {
        return uidGte;
    }

    public void setUidGte(String uidGte) {
        this.uidGte = uidGte;
    }

    public EverouteLicenseWhereInput uidGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_GTE);
        return this;
    }

    public EverouteLicenseWhereInput uidGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_GTE);
        return this;
    }

    public void setUidGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_GTE);
        }
    }

    public boolean getUidGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_GTE);
    }

    public EverouteLicenseWhereInput uidIn(List<String> uidIn) {

        this.uidIn = uidIn;
        return this;
    }

    public EverouteLicenseWhereInput addUidInItem(String uidInItem) {
        if (this.uidIn == null) {
            this.uidIn = new ArrayList<String>();
        }
        this.uidIn.add(uidInItem);
        return this;
    }

    /**
     * Get uidIn
     *
     * @return uidIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUidIn() {
        return uidIn;
    }

    public void setUidIn(List<String> uidIn) {
        this.uidIn = uidIn;
    }

    public EverouteLicenseWhereInput uidIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_IN);
        return this;
    }

    public EverouteLicenseWhereInput uidIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_IN);
        return this;
    }

    public void setUidIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_IN);
        }
    }

    public boolean getUidIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_IN);
    }

    public EverouteLicenseWhereInput uidLt(String uidLt) {

        this.uidLt = uidLt;
        return this;
    }

    /**
     * Get uidLt
     *
     * @return uidLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidLt() {
        return uidLt;
    }

    public void setUidLt(String uidLt) {
        this.uidLt = uidLt;
    }

    public EverouteLicenseWhereInput uidLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_LT);
        return this;
    }

    public EverouteLicenseWhereInput uidLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_LT);
        return this;
    }

    public void setUidLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_LT);
        }
    }

    public boolean getUidLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_LT);
    }

    public EverouteLicenseWhereInput uidLte(String uidLte) {

        this.uidLte = uidLte;
        return this;
    }

    /**
     * Get uidLte
     *
     * @return uidLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidLte() {
        return uidLte;
    }

    public void setUidLte(String uidLte) {
        this.uidLte = uidLte;
    }

    public EverouteLicenseWhereInput uidLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_LTE);
        return this;
    }

    public EverouteLicenseWhereInput uidLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_LTE);
        return this;
    }

    public void setUidLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_LTE);
        }
    }

    public boolean getUidLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_LTE);
    }

    public EverouteLicenseWhereInput uidNot(String uidNot) {

        this.uidNot = uidNot;
        return this;
    }

    /**
     * Get uidNot
     *
     * @return uidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidNot() {
        return uidNot;
    }

    public void setUidNot(String uidNot) {
        this.uidNot = uidNot;
    }

    public EverouteLicenseWhereInput uidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_NOT);
        return this;
    }

    public EverouteLicenseWhereInput uidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_NOT);
        return this;
    }

    public void setUidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_NOT);
        }
    }

    public boolean getUidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_NOT);
    }

    public EverouteLicenseWhereInput uidNotContains(String uidNotContains) {

        this.uidNotContains = uidNotContains;
        return this;
    }

    /**
     * Get uidNotContains
     *
     * @return uidNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidNotContains() {
        return uidNotContains;
    }

    public void setUidNotContains(String uidNotContains) {
        this.uidNotContains = uidNotContains;
    }

    public EverouteLicenseWhereInput uidNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_NOT_CONTAINS);
        return this;
    }

    public EverouteLicenseWhereInput uidNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_CONTAINS);
        return this;
    }

    public void setUidNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_CONTAINS);
        }
    }

    public boolean getUidNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_NOT_CONTAINS);
    }

    public EverouteLicenseWhereInput uidNotEndsWith(String uidNotEndsWith) {

        this.uidNotEndsWith = uidNotEndsWith;
        return this;
    }

    /**
     * Get uidNotEndsWith
     *
     * @return uidNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidNotEndsWith() {
        return uidNotEndsWith;
    }

    public void setUidNotEndsWith(String uidNotEndsWith) {
        this.uidNotEndsWith = uidNotEndsWith;
    }

    public EverouteLicenseWhereInput uidNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_NOT_ENDS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput uidNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_ENDS_WITH);
        return this;
    }

    public void setUidNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_ENDS_WITH);
        }
    }

    public boolean getUidNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_NOT_ENDS_WITH);
    }

    public EverouteLicenseWhereInput uidNotIn(List<String> uidNotIn) {

        this.uidNotIn = uidNotIn;
        return this;
    }

    public EverouteLicenseWhereInput addUidNotInItem(String uidNotInItem) {
        if (this.uidNotIn == null) {
            this.uidNotIn = new ArrayList<String>();
        }
        this.uidNotIn.add(uidNotInItem);
        return this;
    }

    /**
     * Get uidNotIn
     *
     * @return uidNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUidNotIn() {
        return uidNotIn;
    }

    public void setUidNotIn(List<String> uidNotIn) {
        this.uidNotIn = uidNotIn;
    }

    public EverouteLicenseWhereInput uidNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_NOT_IN);
        return this;
    }

    public EverouteLicenseWhereInput uidNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_IN);
        return this;
    }

    public void setUidNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_IN);
        }
    }

    public boolean getUidNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_NOT_IN);
    }

    public EverouteLicenseWhereInput uidNotStartsWith(String uidNotStartsWith) {

        this.uidNotStartsWith = uidNotStartsWith;
        return this;
    }

    /**
     * Get uidNotStartsWith
     *
     * @return uidNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidNotStartsWith() {
        return uidNotStartsWith;
    }

    public void setUidNotStartsWith(String uidNotStartsWith) {
        this.uidNotStartsWith = uidNotStartsWith;
    }

    public EverouteLicenseWhereInput uidNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_NOT_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput uidNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_STARTS_WITH);
        return this;
    }

    public void setUidNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_NOT_STARTS_WITH);
        }
    }

    public boolean getUidNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_NOT_STARTS_WITH);
    }

    public EverouteLicenseWhereInput uidStartsWith(String uidStartsWith) {

        this.uidStartsWith = uidStartsWith;
        return this;
    }

    /**
     * Get uidStartsWith
     *
     * @return uidStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUidStartsWith() {
        return uidStartsWith;
    }

    public void setUidStartsWith(String uidStartsWith) {
        this.uidStartsWith = uidStartsWith;
    }

    public EverouteLicenseWhereInput uidStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UID_STARTS_WITH);
        return this;
    }

    public EverouteLicenseWhereInput uidStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UID_STARTS_WITH);
        return this;
    }

    public void setUidStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UID_STARTS_WITH);
        }
    }

    public boolean getUidStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UID_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EverouteLicenseWhereInput everouteLicenseWhereInput = (EverouteLicenseWhereInput) o;
        return Objects.equals(this.AND, everouteLicenseWhereInput.AND)
                && Objects.equals(this.NOT, everouteLicenseWhereInput.NOT)
                && Objects.equals(this.OR, everouteLicenseWhereInput.OR)
                && Objects.equals(this.code, everouteLicenseWhereInput.code)
                && Objects.equals(this.codeContains, everouteLicenseWhereInput.codeContains)
                && Objects.equals(this.codeEndsWith, everouteLicenseWhereInput.codeEndsWith)
                && Objects.equals(this.codeGt, everouteLicenseWhereInput.codeGt)
                && Objects.equals(this.codeGte, everouteLicenseWhereInput.codeGte)
                && Objects.equals(this.codeIn, everouteLicenseWhereInput.codeIn)
                && Objects.equals(this.codeLt, everouteLicenseWhereInput.codeLt)
                && Objects.equals(this.codeLte, everouteLicenseWhereInput.codeLte)
                && Objects.equals(this.codeNot, everouteLicenseWhereInput.codeNot)
                && Objects.equals(this.codeNotContains, everouteLicenseWhereInput.codeNotContains)
                && Objects.equals(this.codeNotEndsWith, everouteLicenseWhereInput.codeNotEndsWith)
                && Objects.equals(this.codeNotIn, everouteLicenseWhereInput.codeNotIn)
                && Objects.equals(
                        this.codeNotStartsWith, everouteLicenseWhereInput.codeNotStartsWith)
                && Objects.equals(this.codeStartsWith, everouteLicenseWhereInput.codeStartsWith)
                && Objects.equals(this.expireDate, everouteLicenseWhereInput.expireDate)
                && Objects.equals(this.expireDateGt, everouteLicenseWhereInput.expireDateGt)
                && Objects.equals(this.expireDateGte, everouteLicenseWhereInput.expireDateGte)
                && Objects.equals(this.expireDateIn, everouteLicenseWhereInput.expireDateIn)
                && Objects.equals(this.expireDateLt, everouteLicenseWhereInput.expireDateLt)
                && Objects.equals(this.expireDateLte, everouteLicenseWhereInput.expireDateLte)
                && Objects.equals(this.expireDateNot, everouteLicenseWhereInput.expireDateNot)
                && Objects.equals(this.expireDateNotIn, everouteLicenseWhereInput.expireDateNotIn)
                && Objects.equals(this.id, everouteLicenseWhereInput.id)
                && Objects.equals(this.idContains, everouteLicenseWhereInput.idContains)
                && Objects.equals(this.idEndsWith, everouteLicenseWhereInput.idEndsWith)
                && Objects.equals(this.idGt, everouteLicenseWhereInput.idGt)
                && Objects.equals(this.idGte, everouteLicenseWhereInput.idGte)
                && Objects.equals(this.idIn, everouteLicenseWhereInput.idIn)
                && Objects.equals(this.idLt, everouteLicenseWhereInput.idLt)
                && Objects.equals(this.idLte, everouteLicenseWhereInput.idLte)
                && Objects.equals(this.idNot, everouteLicenseWhereInput.idNot)
                && Objects.equals(this.idNotContains, everouteLicenseWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, everouteLicenseWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, everouteLicenseWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, everouteLicenseWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, everouteLicenseWhereInput.idStartsWith)
                && Objects.equals(this.maxSocketNum, everouteLicenseWhereInput.maxSocketNum)
                && Objects.equals(this.maxSocketNumGt, everouteLicenseWhereInput.maxSocketNumGt)
                && Objects.equals(this.maxSocketNumGte, everouteLicenseWhereInput.maxSocketNumGte)
                && Objects.equals(this.maxSocketNumIn, everouteLicenseWhereInput.maxSocketNumIn)
                && Objects.equals(this.maxSocketNumLt, everouteLicenseWhereInput.maxSocketNumLt)
                && Objects.equals(this.maxSocketNumLte, everouteLicenseWhereInput.maxSocketNumLte)
                && Objects.equals(this.maxSocketNumNot, everouteLicenseWhereInput.maxSocketNumNot)
                && Objects.equals(
                        this.maxSocketNumNotIn, everouteLicenseWhereInput.maxSocketNumNotIn)
                && Objects.equals(this.serial, everouteLicenseWhereInput.serial)
                && Objects.equals(this.serialContains, everouteLicenseWhereInput.serialContains)
                && Objects.equals(this.serialEndsWith, everouteLicenseWhereInput.serialEndsWith)
                && Objects.equals(this.serialGt, everouteLicenseWhereInput.serialGt)
                && Objects.equals(this.serialGte, everouteLicenseWhereInput.serialGte)
                && Objects.equals(this.serialIn, everouteLicenseWhereInput.serialIn)
                && Objects.equals(this.serialLt, everouteLicenseWhereInput.serialLt)
                && Objects.equals(this.serialLte, everouteLicenseWhereInput.serialLte)
                && Objects.equals(this.serialNot, everouteLicenseWhereInput.serialNot)
                && Objects.equals(
                        this.serialNotContains, everouteLicenseWhereInput.serialNotContains)
                && Objects.equals(
                        this.serialNotEndsWith, everouteLicenseWhereInput.serialNotEndsWith)
                && Objects.equals(this.serialNotIn, everouteLicenseWhereInput.serialNotIn)
                && Objects.equals(
                        this.serialNotStartsWith, everouteLicenseWhereInput.serialNotStartsWith)
                && Objects.equals(this.serialStartsWith, everouteLicenseWhereInput.serialStartsWith)
                && Objects.equals(this.signDate, everouteLicenseWhereInput.signDate)
                && Objects.equals(this.signDateGt, everouteLicenseWhereInput.signDateGt)
                && Objects.equals(this.signDateGte, everouteLicenseWhereInput.signDateGte)
                && Objects.equals(this.signDateIn, everouteLicenseWhereInput.signDateIn)
                && Objects.equals(this.signDateLt, everouteLicenseWhereInput.signDateLt)
                && Objects.equals(this.signDateLte, everouteLicenseWhereInput.signDateLte)
                && Objects.equals(this.signDateNot, everouteLicenseWhereInput.signDateNot)
                && Objects.equals(this.signDateNotIn, everouteLicenseWhereInput.signDateNotIn)
                && Objects.equals(this.softwareEdition, everouteLicenseWhereInput.softwareEdition)
                && Objects.equals(
                        this.softwareEditionIn, everouteLicenseWhereInput.softwareEditionIn)
                && Objects.equals(
                        this.softwareEditionNot, everouteLicenseWhereInput.softwareEditionNot)
                && Objects.equals(
                        this.softwareEditionNotIn, everouteLicenseWhereInput.softwareEditionNotIn)
                && Objects.equals(this.type, everouteLicenseWhereInput.type)
                && Objects.equals(this.typeIn, everouteLicenseWhereInput.typeIn)
                && Objects.equals(this.typeNot, everouteLicenseWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, everouteLicenseWhereInput.typeNotIn)
                && Objects.equals(this.uid, everouteLicenseWhereInput.uid)
                && Objects.equals(this.uidContains, everouteLicenseWhereInput.uidContains)
                && Objects.equals(this.uidEndsWith, everouteLicenseWhereInput.uidEndsWith)
                && Objects.equals(this.uidGt, everouteLicenseWhereInput.uidGt)
                && Objects.equals(this.uidGte, everouteLicenseWhereInput.uidGte)
                && Objects.equals(this.uidIn, everouteLicenseWhereInput.uidIn)
                && Objects.equals(this.uidLt, everouteLicenseWhereInput.uidLt)
                && Objects.equals(this.uidLte, everouteLicenseWhereInput.uidLte)
                && Objects.equals(this.uidNot, everouteLicenseWhereInput.uidNot)
                && Objects.equals(this.uidNotContains, everouteLicenseWhereInput.uidNotContains)
                && Objects.equals(this.uidNotEndsWith, everouteLicenseWhereInput.uidNotEndsWith)
                && Objects.equals(this.uidNotIn, everouteLicenseWhereInput.uidNotIn)
                && Objects.equals(this.uidNotStartsWith, everouteLicenseWhereInput.uidNotStartsWith)
                && Objects.equals(this.uidStartsWith, everouteLicenseWhereInput.uidStartsWith);
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
                code,
                codeContains,
                codeEndsWith,
                codeGt,
                codeGte,
                codeIn,
                codeLt,
                codeLte,
                codeNot,
                codeNotContains,
                codeNotEndsWith,
                codeNotIn,
                codeNotStartsWith,
                codeStartsWith,
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
                maxSocketNum,
                maxSocketNumGt,
                maxSocketNumGte,
                maxSocketNumIn,
                maxSocketNumLt,
                maxSocketNumLte,
                maxSocketNumNot,
                maxSocketNumNotIn,
                serial,
                serialContains,
                serialEndsWith,
                serialGt,
                serialGte,
                serialIn,
                serialLt,
                serialLte,
                serialNot,
                serialNotContains,
                serialNotEndsWith,
                serialNotIn,
                serialNotStartsWith,
                serialStartsWith,
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
                typeNotIn,
                uid,
                uidContains,
                uidEndsWith,
                uidGt,
                uidGte,
                uidIn,
                uidLt,
                uidLte,
                uidNot,
                uidNotContains,
                uidNotEndsWith,
                uidNotIn,
                uidNotStartsWith,
                uidStartsWith);
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
        sb.append("class EverouteLicenseWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    codeContains: ").append(toIndentedString(codeContains)).append("\n");
        sb.append("    codeEndsWith: ").append(toIndentedString(codeEndsWith)).append("\n");
        sb.append("    codeGt: ").append(toIndentedString(codeGt)).append("\n");
        sb.append("    codeGte: ").append(toIndentedString(codeGte)).append("\n");
        sb.append("    codeIn: ").append(toIndentedString(codeIn)).append("\n");
        sb.append("    codeLt: ").append(toIndentedString(codeLt)).append("\n");
        sb.append("    codeLte: ").append(toIndentedString(codeLte)).append("\n");
        sb.append("    codeNot: ").append(toIndentedString(codeNot)).append("\n");
        sb.append("    codeNotContains: ").append(toIndentedString(codeNotContains)).append("\n");
        sb.append("    codeNotEndsWith: ").append(toIndentedString(codeNotEndsWith)).append("\n");
        sb.append("    codeNotIn: ").append(toIndentedString(codeNotIn)).append("\n");
        sb.append("    codeNotStartsWith: ")
                .append(toIndentedString(codeNotStartsWith))
                .append("\n");
        sb.append("    codeStartsWith: ").append(toIndentedString(codeStartsWith)).append("\n");
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
        sb.append("    maxSocketNum: ").append(toIndentedString(maxSocketNum)).append("\n");
        sb.append("    maxSocketNumGt: ").append(toIndentedString(maxSocketNumGt)).append("\n");
        sb.append("    maxSocketNumGte: ").append(toIndentedString(maxSocketNumGte)).append("\n");
        sb.append("    maxSocketNumIn: ").append(toIndentedString(maxSocketNumIn)).append("\n");
        sb.append("    maxSocketNumLt: ").append(toIndentedString(maxSocketNumLt)).append("\n");
        sb.append("    maxSocketNumLte: ").append(toIndentedString(maxSocketNumLte)).append("\n");
        sb.append("    maxSocketNumNot: ").append(toIndentedString(maxSocketNumNot)).append("\n");
        sb.append("    maxSocketNumNotIn: ")
                .append(toIndentedString(maxSocketNumNotIn))
                .append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    serialContains: ").append(toIndentedString(serialContains)).append("\n");
        sb.append("    serialEndsWith: ").append(toIndentedString(serialEndsWith)).append("\n");
        sb.append("    serialGt: ").append(toIndentedString(serialGt)).append("\n");
        sb.append("    serialGte: ").append(toIndentedString(serialGte)).append("\n");
        sb.append("    serialIn: ").append(toIndentedString(serialIn)).append("\n");
        sb.append("    serialLt: ").append(toIndentedString(serialLt)).append("\n");
        sb.append("    serialLte: ").append(toIndentedString(serialLte)).append("\n");
        sb.append("    serialNot: ").append(toIndentedString(serialNot)).append("\n");
        sb.append("    serialNotContains: ")
                .append(toIndentedString(serialNotContains))
                .append("\n");
        sb.append("    serialNotEndsWith: ")
                .append(toIndentedString(serialNotEndsWith))
                .append("\n");
        sb.append("    serialNotIn: ").append(toIndentedString(serialNotIn)).append("\n");
        sb.append("    serialNotStartsWith: ")
                .append(toIndentedString(serialNotStartsWith))
                .append("\n");
        sb.append("    serialStartsWith: ").append(toIndentedString(serialStartsWith)).append("\n");
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
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    uidContains: ").append(toIndentedString(uidContains)).append("\n");
        sb.append("    uidEndsWith: ").append(toIndentedString(uidEndsWith)).append("\n");
        sb.append("    uidGt: ").append(toIndentedString(uidGt)).append("\n");
        sb.append("    uidGte: ").append(toIndentedString(uidGte)).append("\n");
        sb.append("    uidIn: ").append(toIndentedString(uidIn)).append("\n");
        sb.append("    uidLt: ").append(toIndentedString(uidLt)).append("\n");
        sb.append("    uidLte: ").append(toIndentedString(uidLte)).append("\n");
        sb.append("    uidNot: ").append(toIndentedString(uidNot)).append("\n");
        sb.append("    uidNotContains: ").append(toIndentedString(uidNotContains)).append("\n");
        sb.append("    uidNotEndsWith: ").append(toIndentedString(uidNotEndsWith)).append("\n");
        sb.append("    uidNotIn: ").append(toIndentedString(uidNotIn)).append("\n");
        sb.append("    uidNotStartsWith: ").append(toIndentedString(uidNotStartsWith)).append("\n");
        sb.append("    uidStartsWith: ").append(toIndentedString(uidStartsWith)).append("\n");
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
