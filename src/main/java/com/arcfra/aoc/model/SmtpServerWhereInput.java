package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SmtpServerWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SmtpServerWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SmtpServerWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SmtpServerWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SmtpServerWhereInput> OR = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private String host;

    public static final String SERIALIZED_NAME_HOST_CONTAINS = "host_contains";

    @SerializedName(SERIALIZED_NAME_HOST_CONTAINS)
    private String hostContains;

    public static final String SERIALIZED_NAME_HOST_ENDS_WITH = "host_ends_with";

    @SerializedName(SERIALIZED_NAME_HOST_ENDS_WITH)
    private String hostEndsWith;

    public static final String SERIALIZED_NAME_HOST_GT = "host_gt";

    @SerializedName(SERIALIZED_NAME_HOST_GT)
    private String hostGt;

    public static final String SERIALIZED_NAME_HOST_GTE = "host_gte";

    @SerializedName(SERIALIZED_NAME_HOST_GTE)
    private String hostGte;

    public static final String SERIALIZED_NAME_HOST_IN = "host_in";

    @SerializedName(SERIALIZED_NAME_HOST_IN)
    private List<String> hostIn = null;

    public static final String SERIALIZED_NAME_HOST_LT = "host_lt";

    @SerializedName(SERIALIZED_NAME_HOST_LT)
    private String hostLt;

    public static final String SERIALIZED_NAME_HOST_LTE = "host_lte";

    @SerializedName(SERIALIZED_NAME_HOST_LTE)
    private String hostLte;

    public static final String SERIALIZED_NAME_HOST_NOT = "host_not";

    @SerializedName(SERIALIZED_NAME_HOST_NOT)
    private String hostNot;

    public static final String SERIALIZED_NAME_HOST_NOT_CONTAINS = "host_not_contains";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_CONTAINS)
    private String hostNotContains;

    public static final String SERIALIZED_NAME_HOST_NOT_ENDS_WITH = "host_not_ends_with";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_ENDS_WITH)
    private String hostNotEndsWith;

    public static final String SERIALIZED_NAME_HOST_NOT_IN = "host_not_in";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_IN)
    private List<String> hostNotIn = null;

    public static final String SERIALIZED_NAME_HOST_NOT_STARTS_WITH = "host_not_starts_with";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_STARTS_WITH)
    private String hostNotStartsWith;

    public static final String SERIALIZED_NAME_HOST_STARTS_WITH = "host_starts_with";

    @SerializedName(SERIALIZED_NAME_HOST_STARTS_WITH)
    private String hostStartsWith;

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

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PORT_GT = "port_gt";

    @SerializedName(SERIALIZED_NAME_PORT_GT)
    private Integer portGt;

    public static final String SERIALIZED_NAME_PORT_GTE = "port_gte";

    @SerializedName(SERIALIZED_NAME_PORT_GTE)
    private Integer portGte;

    public static final String SERIALIZED_NAME_PORT_IN = "port_in";

    @SerializedName(SERIALIZED_NAME_PORT_IN)
    private List<Integer> portIn = null;

    public static final String SERIALIZED_NAME_PORT_LT = "port_lt";

    @SerializedName(SERIALIZED_NAME_PORT_LT)
    private Integer portLt;

    public static final String SERIALIZED_NAME_PORT_LTE = "port_lte";

    @SerializedName(SERIALIZED_NAME_PORT_LTE)
    private Integer portLte;

    public static final String SERIALIZED_NAME_PORT_NOT = "port_not";

    @SerializedName(SERIALIZED_NAME_PORT_NOT)
    private Integer portNot;

    public static final String SERIALIZED_NAME_PORT_NOT_IN = "port_not_in";

    @SerializedName(SERIALIZED_NAME_PORT_NOT_IN)
    private List<Integer> portNotIn = null;

    public static final String SERIALIZED_NAME_SECURE_MODE = "secure_mode";

    @SerializedName(SERIALIZED_NAME_SECURE_MODE)
    private SmtpSecureMode secureMode;

    public static final String SERIALIZED_NAME_SECURE_MODE_IN = "secure_mode_in";

    @SerializedName(SERIALIZED_NAME_SECURE_MODE_IN)
    private List<SmtpSecureMode> secureModeIn = null;

    public static final String SERIALIZED_NAME_SECURE_MODE_NOT = "secure_mode_not";

    @SerializedName(SERIALIZED_NAME_SECURE_MODE_NOT)
    private SmtpSecureMode secureModeNot;

    public static final String SERIALIZED_NAME_SECURE_MODE_NOT_IN = "secure_mode_not_in";

    @SerializedName(SERIALIZED_NAME_SECURE_MODE_NOT_IN)
    private List<SmtpSecureMode> secureModeNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
    private String usernameContains;

    public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
    private String usernameEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";

    @SerializedName(SERIALIZED_NAME_USERNAME_GT)
    private String usernameGt;

    public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";

    @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
    private String usernameGte;

    public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_IN)
    private List<String> usernameIn = null;

    public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";

    @SerializedName(SERIALIZED_NAME_USERNAME_LT)
    private String usernameLt;

    public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";

    @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
    private String usernameLte;

    public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
    private String usernameNot;

    public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
    private String usernameNotContains;

    public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
    private String usernameNotEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
    private List<String> usernameNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH =
            "username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
    private String usernameNotStartsWith;

    public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
    private String usernameStartsWith;

    public SmtpServerWhereInput() {}

    public SmtpServerWhereInput AND(List<SmtpServerWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SmtpServerWhereInput addANDItem(SmtpServerWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SmtpServerWhereInput>();
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
    public List<SmtpServerWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SmtpServerWhereInput> AND) {
        this.AND = AND;
    }

    public SmtpServerWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SmtpServerWhereInput AND_ExplictlyNonNull() {
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

    public SmtpServerWhereInput NOT(List<SmtpServerWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SmtpServerWhereInput addNOTItem(SmtpServerWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SmtpServerWhereInput>();
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
    public List<SmtpServerWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SmtpServerWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SmtpServerWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SmtpServerWhereInput NOT_ExplictlyNonNull() {
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

    public SmtpServerWhereInput OR(List<SmtpServerWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SmtpServerWhereInput addORItem(SmtpServerWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SmtpServerWhereInput>();
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
    public List<SmtpServerWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SmtpServerWhereInput> OR) {
        this.OR = OR;
    }

    public SmtpServerWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SmtpServerWhereInput OR_ExplictlyNonNull() {
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

    public SmtpServerWhereInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SmtpServerWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SmtpServerWhereInput description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public SmtpServerWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public SmtpServerWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public SmtpServerWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public SmtpServerWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public SmtpServerWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public SmtpServerWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public SmtpServerWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public SmtpServerWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public SmtpServerWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public SmtpServerWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public SmtpServerWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public SmtpServerWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public SmtpServerWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public SmtpServerWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public SmtpServerWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public SmtpServerWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public SmtpServerWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public SmtpServerWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public SmtpServerWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public SmtpServerWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public SmtpServerWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public SmtpServerWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public SmtpServerWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public SmtpServerWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public SmtpServerWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public SmtpServerWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public SmtpServerWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public SmtpServerWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public SmtpServerWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public SmtpServerWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public SmtpServerWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public SmtpServerWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public SmtpServerWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public SmtpServerWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public SmtpServerWhereInput host(String host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SmtpServerWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public SmtpServerWhereInput host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public SmtpServerWhereInput hostContains(String hostContains) {

        this.hostContains = hostContains;
        return this;
    }

    /**
     * Get hostContains
     *
     * @return hostContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostContains() {
        return hostContains;
    }

    public void setHostContains(String hostContains) {
        this.hostContains = hostContains;
    }

    public SmtpServerWhereInput hostContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput hostContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONTAINS);
        return this;
    }

    public void setHostContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONTAINS);
        }
    }

    public boolean getHostContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONTAINS);
    }

    public SmtpServerWhereInput hostEndsWith(String hostEndsWith) {

        this.hostEndsWith = hostEndsWith;
        return this;
    }

    /**
     * Get hostEndsWith
     *
     * @return hostEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostEndsWith() {
        return hostEndsWith;
    }

    public void setHostEndsWith(String hostEndsWith) {
        this.hostEndsWith = hostEndsWith;
    }

    public SmtpServerWhereInput hostEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput hostEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ENDS_WITH);
        return this;
    }

    public void setHostEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ENDS_WITH);
        }
    }

    public boolean getHostEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ENDS_WITH);
    }

    public SmtpServerWhereInput hostGt(String hostGt) {

        this.hostGt = hostGt;
        return this;
    }

    /**
     * Get hostGt
     *
     * @return hostGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostGt() {
        return hostGt;
    }

    public void setHostGt(String hostGt) {
        this.hostGt = hostGt;
    }

    public SmtpServerWhereInput hostGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_GT);
        return this;
    }

    public SmtpServerWhereInput hostGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_GT);
        return this;
    }

    public void setHostGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_GT);
        }
    }

    public boolean getHostGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_GT);
    }

    public SmtpServerWhereInput hostGte(String hostGte) {

        this.hostGte = hostGte;
        return this;
    }

    /**
     * Get hostGte
     *
     * @return hostGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostGte() {
        return hostGte;
    }

    public void setHostGte(String hostGte) {
        this.hostGte = hostGte;
    }

    public SmtpServerWhereInput hostGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_GTE);
        return this;
    }

    public SmtpServerWhereInput hostGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_GTE);
        return this;
    }

    public void setHostGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_GTE);
        }
    }

    public boolean getHostGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_GTE);
    }

    public SmtpServerWhereInput hostIn(List<String> hostIn) {

        this.hostIn = hostIn;
        return this;
    }

    public SmtpServerWhereInput addHostInItem(String hostInItem) {
        if (this.hostIn == null) {
            this.hostIn = new ArrayList<String>();
        }
        this.hostIn.add(hostInItem);
        return this;
    }

    /**
     * Get hostIn
     *
     * @return hostIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostIn() {
        return hostIn;
    }

    public void setHostIn(List<String> hostIn) {
        this.hostIn = hostIn;
    }

    public SmtpServerWhereInput hostIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_IN);
        return this;
    }

    public SmtpServerWhereInput hostIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_IN);
        return this;
    }

    public void setHostIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_IN);
        }
    }

    public boolean getHostIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_IN);
    }

    public SmtpServerWhereInput hostLt(String hostLt) {

        this.hostLt = hostLt;
        return this;
    }

    /**
     * Get hostLt
     *
     * @return hostLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostLt() {
        return hostLt;
    }

    public void setHostLt(String hostLt) {
        this.hostLt = hostLt;
    }

    public SmtpServerWhereInput hostLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_LT);
        return this;
    }

    public SmtpServerWhereInput hostLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_LT);
        return this;
    }

    public void setHostLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_LT);
        }
    }

    public boolean getHostLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_LT);
    }

    public SmtpServerWhereInput hostLte(String hostLte) {

        this.hostLte = hostLte;
        return this;
    }

    /**
     * Get hostLte
     *
     * @return hostLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostLte() {
        return hostLte;
    }

    public void setHostLte(String hostLte) {
        this.hostLte = hostLte;
    }

    public SmtpServerWhereInput hostLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_LTE);
        return this;
    }

    public SmtpServerWhereInput hostLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_LTE);
        return this;
    }

    public void setHostLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_LTE);
        }
    }

    public boolean getHostLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_LTE);
    }

    public SmtpServerWhereInput hostNot(String hostNot) {

        this.hostNot = hostNot;
        return this;
    }

    /**
     * Get hostNot
     *
     * @return hostNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNot() {
        return hostNot;
    }

    public void setHostNot(String hostNot) {
        this.hostNot = hostNot;
    }

    public SmtpServerWhereInput hostNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT);
        return this;
    }

    public SmtpServerWhereInput hostNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT);
        return this;
    }

    public void setHostNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT);
        }
    }

    public boolean getHostNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT);
    }

    public SmtpServerWhereInput hostNotContains(String hostNotContains) {

        this.hostNotContains = hostNotContains;
        return this;
    }

    /**
     * Get hostNotContains
     *
     * @return hostNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotContains() {
        return hostNotContains;
    }

    public void setHostNotContains(String hostNotContains) {
        this.hostNotContains = hostNotContains;
    }

    public SmtpServerWhereInput hostNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput hostNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        return this;
    }

    public void setHostNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        }
    }

    public boolean getHostNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_CONTAINS);
    }

    public SmtpServerWhereInput hostNotEndsWith(String hostNotEndsWith) {

        this.hostNotEndsWith = hostNotEndsWith;
        return this;
    }

    /**
     * Get hostNotEndsWith
     *
     * @return hostNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotEndsWith() {
        return hostNotEndsWith;
    }

    public void setHostNotEndsWith(String hostNotEndsWith) {
        this.hostNotEndsWith = hostNotEndsWith;
    }

    public SmtpServerWhereInput hostNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput hostNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        return this;
    }

    public void setHostNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        }
    }

    public boolean getHostNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
    }

    public SmtpServerWhereInput hostNotIn(List<String> hostNotIn) {

        this.hostNotIn = hostNotIn;
        return this;
    }

    public SmtpServerWhereInput addHostNotInItem(String hostNotInItem) {
        if (this.hostNotIn == null) {
            this.hostNotIn = new ArrayList<String>();
        }
        this.hostNotIn.add(hostNotInItem);
        return this;
    }

    /**
     * Get hostNotIn
     *
     * @return hostNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostNotIn() {
        return hostNotIn;
    }

    public void setHostNotIn(List<String> hostNotIn) {
        this.hostNotIn = hostNotIn;
    }

    public SmtpServerWhereInput hostNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput hostNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_IN);
        return this;
    }

    public void setHostNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_IN);
        }
    }

    public boolean getHostNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_IN);
    }

    public SmtpServerWhereInput hostNotStartsWith(String hostNotStartsWith) {

        this.hostNotStartsWith = hostNotStartsWith;
        return this;
    }

    /**
     * Get hostNotStartsWith
     *
     * @return hostNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotStartsWith() {
        return hostNotStartsWith;
    }

    public void setHostNotStartsWith(String hostNotStartsWith) {
        this.hostNotStartsWith = hostNotStartsWith;
    }

    public SmtpServerWhereInput hostNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput hostNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        return this;
    }

    public void setHostNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        }
    }

    public boolean getHostNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
    }

    public SmtpServerWhereInput hostStartsWith(String hostStartsWith) {

        this.hostStartsWith = hostStartsWith;
        return this;
    }

    /**
     * Get hostStartsWith
     *
     * @return hostStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostStartsWith() {
        return hostStartsWith;
    }

    public void setHostStartsWith(String hostStartsWith) {
        this.hostStartsWith = hostStartsWith;
    }

    public SmtpServerWhereInput hostStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput hostStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_STARTS_WITH);
        return this;
    }

    public void setHostStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_STARTS_WITH);
        }
    }

    public boolean getHostStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_STARTS_WITH);
    }

    public SmtpServerWhereInput id(String id) {

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

    public SmtpServerWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SmtpServerWhereInput id_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idContains(String idContains) {

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

    public SmtpServerWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput idContains_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idEndsWith(String idEndsWith) {

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

    public SmtpServerWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idGt(String idGt) {

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

    public SmtpServerWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SmtpServerWhereInput idGt_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idGte(String idGte) {

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

    public SmtpServerWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SmtpServerWhereInput idGte_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SmtpServerWhereInput addIdInItem(String idInItem) {
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

    public SmtpServerWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SmtpServerWhereInput idIn_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idLt(String idLt) {

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

    public SmtpServerWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SmtpServerWhereInput idLt_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idLte(String idLte) {

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

    public SmtpServerWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SmtpServerWhereInput idLte_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idNot(String idNot) {

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

    public SmtpServerWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SmtpServerWhereInput idNot_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idNotContains(String idNotContains) {

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

    public SmtpServerWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput idNotContains_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SmtpServerWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SmtpServerWhereInput addIdNotInItem(String idNotInItem) {
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

    public SmtpServerWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput idNotIn_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SmtpServerWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SmtpServerWhereInput idStartsWith(String idStartsWith) {

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

    public SmtpServerWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SmtpServerWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmtpServerWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SmtpServerWhereInput name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public SmtpServerWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public SmtpServerWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public SmtpServerWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public SmtpServerWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public SmtpServerWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public SmtpServerWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SmtpServerWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public SmtpServerWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public SmtpServerWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SmtpServerWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public SmtpServerWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SmtpServerWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public SmtpServerWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SmtpServerWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public SmtpServerWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public SmtpServerWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SmtpServerWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public SmtpServerWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public SmtpServerWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SmtpServerWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public SmtpServerWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public SmtpServerWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SmtpServerWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public SmtpServerWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public SmtpServerWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public SmtpServerWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public SmtpServerWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public SmtpServerWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SmtpServerWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public SmtpServerWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public SmtpServerWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public SmtpServerWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public SmtpServerWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public SmtpServerWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public SmtpServerWhereInput port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SmtpServerWhereInput port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public SmtpServerWhereInput port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public SmtpServerWhereInput portGt(Integer portGt) {

        this.portGt = portGt;
        return this;
    }

    /**
     * Get portGt
     *
     * @return portGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGt() {
        return portGt;
    }

    public void setPortGt(Integer portGt) {
        this.portGt = portGt;
    }

    public SmtpServerWhereInput portGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public SmtpServerWhereInput portGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public void setPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        }
    }

    public boolean getPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GT);
    }

    public SmtpServerWhereInput portGte(Integer portGte) {

        this.portGte = portGte;
        return this;
    }

    /**
     * Get portGte
     *
     * @return portGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGte() {
        return portGte;
    }

    public void setPortGte(Integer portGte) {
        this.portGte = portGte;
    }

    public SmtpServerWhereInput portGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public SmtpServerWhereInput portGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public void setPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        }
    }

    public boolean getPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GTE);
    }

    public SmtpServerWhereInput portIn(List<Integer> portIn) {

        this.portIn = portIn;
        return this;
    }

    public SmtpServerWhereInput addPortInItem(Integer portInItem) {
        if (this.portIn == null) {
            this.portIn = new ArrayList<Integer>();
        }
        this.portIn.add(portInItem);
        return this;
    }

    /**
     * Get portIn
     *
     * @return portIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortIn() {
        return portIn;
    }

    public void setPortIn(List<Integer> portIn) {
        this.portIn = portIn;
    }

    public SmtpServerWhereInput portIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public SmtpServerWhereInput portIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public void setPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        }
    }

    public boolean getPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_IN);
    }

    public SmtpServerWhereInput portLt(Integer portLt) {

        this.portLt = portLt;
        return this;
    }

    /**
     * Get portLt
     *
     * @return portLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLt() {
        return portLt;
    }

    public void setPortLt(Integer portLt) {
        this.portLt = portLt;
    }

    public SmtpServerWhereInput portLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public SmtpServerWhereInput portLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public void setPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        }
    }

    public boolean getPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LT);
    }

    public SmtpServerWhereInput portLte(Integer portLte) {

        this.portLte = portLte;
        return this;
    }

    /**
     * Get portLte
     *
     * @return portLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLte() {
        return portLte;
    }

    public void setPortLte(Integer portLte) {
        this.portLte = portLte;
    }

    public SmtpServerWhereInput portLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public SmtpServerWhereInput portLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public void setPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        }
    }

    public boolean getPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LTE);
    }

    public SmtpServerWhereInput portNot(Integer portNot) {

        this.portNot = portNot;
        return this;
    }

    /**
     * Get portNot
     *
     * @return portNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortNot() {
        return portNot;
    }

    public void setPortNot(Integer portNot) {
        this.portNot = portNot;
    }

    public SmtpServerWhereInput portNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public SmtpServerWhereInput portNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public void setPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        }
    }

    public boolean getPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT);
    }

    public SmtpServerWhereInput portNotIn(List<Integer> portNotIn) {

        this.portNotIn = portNotIn;
        return this;
    }

    public SmtpServerWhereInput addPortNotInItem(Integer portNotInItem) {
        if (this.portNotIn == null) {
            this.portNotIn = new ArrayList<Integer>();
        }
        this.portNotIn.add(portNotInItem);
        return this;
    }

    /**
     * Get portNotIn
     *
     * @return portNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortNotIn() {
        return portNotIn;
    }

    public void setPortNotIn(List<Integer> portNotIn) {
        this.portNotIn = portNotIn;
    }

    public SmtpServerWhereInput portNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput portNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public void setPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        }
    }

    public boolean getPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT_IN);
    }

    public SmtpServerWhereInput secureMode(SmtpSecureMode secureMode) {

        this.secureMode = secureMode;
        return this;
    }

    /**
     * Get secureMode
     *
     * @return secureMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SmtpSecureMode getSecureMode() {
        return secureMode;
    }

    public void setSecureMode(SmtpSecureMode secureMode) {
        this.secureMode = secureMode;
    }

    public SmtpServerWhereInput secureMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE);
        return this;
    }

    public SmtpServerWhereInput secureMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE);
        return this;
    }

    public void setSecureMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE);
        }
    }

    public boolean getSecureMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_MODE);
    }

    public SmtpServerWhereInput secureModeIn(List<SmtpSecureMode> secureModeIn) {

        this.secureModeIn = secureModeIn;
        return this;
    }

    public SmtpServerWhereInput addSecureModeInItem(SmtpSecureMode secureModeInItem) {
        if (this.secureModeIn == null) {
            this.secureModeIn = new ArrayList<SmtpSecureMode>();
        }
        this.secureModeIn.add(secureModeInItem);
        return this;
    }

    /**
     * Get secureModeIn
     *
     * @return secureModeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SmtpSecureMode> getSecureModeIn() {
        return secureModeIn;
    }

    public void setSecureModeIn(List<SmtpSecureMode> secureModeIn) {
        this.secureModeIn = secureModeIn;
    }

    public SmtpServerWhereInput secureModeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_IN);
        return this;
    }

    public SmtpServerWhereInput secureModeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_IN);
        return this;
    }

    public void setSecureModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_IN);
        }
    }

    public boolean getSecureModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_MODE_IN);
    }

    public SmtpServerWhereInput secureModeNot(SmtpSecureMode secureModeNot) {

        this.secureModeNot = secureModeNot;
        return this;
    }

    /**
     * Get secureModeNot
     *
     * @return secureModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SmtpSecureMode getSecureModeNot() {
        return secureModeNot;
    }

    public void setSecureModeNot(SmtpSecureMode secureModeNot) {
        this.secureModeNot = secureModeNot;
    }

    public SmtpServerWhereInput secureModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_NOT);
        return this;
    }

    public SmtpServerWhereInput secureModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_NOT);
        return this;
    }

    public void setSecureModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_NOT);
        }
    }

    public boolean getSecureModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_MODE_NOT);
    }

    public SmtpServerWhereInput secureModeNotIn(List<SmtpSecureMode> secureModeNotIn) {

        this.secureModeNotIn = secureModeNotIn;
        return this;
    }

    public SmtpServerWhereInput addSecureModeNotInItem(SmtpSecureMode secureModeNotInItem) {
        if (this.secureModeNotIn == null) {
            this.secureModeNotIn = new ArrayList<SmtpSecureMode>();
        }
        this.secureModeNotIn.add(secureModeNotInItem);
        return this;
    }

    /**
     * Get secureModeNotIn
     *
     * @return secureModeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SmtpSecureMode> getSecureModeNotIn() {
        return secureModeNotIn;
    }

    public void setSecureModeNotIn(List<SmtpSecureMode> secureModeNotIn) {
        this.secureModeNotIn = secureModeNotIn;
    }

    public SmtpServerWhereInput secureModeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput secureModeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_NOT_IN);
        return this;
    }

    public void setSecureModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_MODE_NOT_IN);
        }
    }

    public boolean getSecureModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_MODE_NOT_IN);
    }

    public SmtpServerWhereInput username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SmtpServerWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public SmtpServerWhereInput username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    public SmtpServerWhereInput usernameContains(String usernameContains) {

        this.usernameContains = usernameContains;
        return this;
    }

    /**
     * Get usernameContains
     *
     * @return usernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameContains() {
        return usernameContains;
    }

    public void setUsernameContains(String usernameContains) {
        this.usernameContains = usernameContains;
    }

    public SmtpServerWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput usernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public void setUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        }
    }

    public boolean getUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_CONTAINS);
    }

    public SmtpServerWhereInput usernameEndsWith(String usernameEndsWith) {

        this.usernameEndsWith = usernameEndsWith;
        return this;
    }

    /**
     * Get usernameEndsWith
     *
     * @return usernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameEndsWith() {
        return usernameEndsWith;
    }

    public void setUsernameEndsWith(String usernameEndsWith) {
        this.usernameEndsWith = usernameEndsWith;
    }

    public SmtpServerWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput usernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public void setUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        }
    }

    public boolean getUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_ENDS_WITH);
    }

    public SmtpServerWhereInput usernameGt(String usernameGt) {

        this.usernameGt = usernameGt;
        return this;
    }

    /**
     * Get usernameGt
     *
     * @return usernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGt() {
        return usernameGt;
    }

    public void setUsernameGt(String usernameGt) {
        this.usernameGt = usernameGt;
    }

    public SmtpServerWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public SmtpServerWhereInput usernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public void setUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        }
    }

    public boolean getUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GT);
    }

    public SmtpServerWhereInput usernameGte(String usernameGte) {

        this.usernameGte = usernameGte;
        return this;
    }

    /**
     * Get usernameGte
     *
     * @return usernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGte() {
        return usernameGte;
    }

    public void setUsernameGte(String usernameGte) {
        this.usernameGte = usernameGte;
    }

    public SmtpServerWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public SmtpServerWhereInput usernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public void setUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        }
    }

    public boolean getUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GTE);
    }

    public SmtpServerWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public SmtpServerWhereInput addUsernameInItem(String usernameInItem) {
        if (this.usernameIn == null) {
            this.usernameIn = new ArrayList<String>();
        }
        this.usernameIn.add(usernameInItem);
        return this;
    }

    /**
     * Get usernameIn
     *
     * @return usernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(List<String> usernameIn) {
        this.usernameIn = usernameIn;
    }

    public SmtpServerWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public SmtpServerWhereInput usernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public void setUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        }
    }

    public boolean getUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_IN);
    }

    public SmtpServerWhereInput usernameLt(String usernameLt) {

        this.usernameLt = usernameLt;
        return this;
    }

    /**
     * Get usernameLt
     *
     * @return usernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLt() {
        return usernameLt;
    }

    public void setUsernameLt(String usernameLt) {
        this.usernameLt = usernameLt;
    }

    public SmtpServerWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public SmtpServerWhereInput usernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public void setUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        }
    }

    public boolean getUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LT);
    }

    public SmtpServerWhereInput usernameLte(String usernameLte) {

        this.usernameLte = usernameLte;
        return this;
    }

    /**
     * Get usernameLte
     *
     * @return usernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLte() {
        return usernameLte;
    }

    public void setUsernameLte(String usernameLte) {
        this.usernameLte = usernameLte;
    }

    public SmtpServerWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public SmtpServerWhereInput usernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public void setUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        }
    }

    public boolean getUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LTE);
    }

    public SmtpServerWhereInput usernameNot(String usernameNot) {

        this.usernameNot = usernameNot;
        return this;
    }

    /**
     * Get usernameNot
     *
     * @return usernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNot() {
        return usernameNot;
    }

    public void setUsernameNot(String usernameNot) {
        this.usernameNot = usernameNot;
    }

    public SmtpServerWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public SmtpServerWhereInput usernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public void setUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        }
    }

    public boolean getUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT);
    }

    public SmtpServerWhereInput usernameNotContains(String usernameNotContains) {

        this.usernameNotContains = usernameNotContains;
        return this;
    }

    /**
     * Get usernameNotContains
     *
     * @return usernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotContains() {
        return usernameNotContains;
    }

    public void setUsernameNotContains(String usernameNotContains) {
        this.usernameNotContains = usernameNotContains;
    }

    public SmtpServerWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public SmtpServerWhereInput usernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
    }

    public SmtpServerWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

        this.usernameNotEndsWith = usernameNotEndsWith;
        return this;
    }

    /**
     * Get usernameNotEndsWith
     *
     * @return usernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotEndsWith() {
        return usernameNotEndsWith;
    }

    public void setUsernameNotEndsWith(String usernameNotEndsWith) {
        this.usernameNotEndsWith = usernameNotEndsWith;
    }

    public SmtpServerWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public SmtpServerWhereInput usernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
    }

    public SmtpServerWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public SmtpServerWhereInput addUsernameNotInItem(String usernameNotInItem) {
        if (this.usernameNotIn == null) {
            this.usernameNotIn = new ArrayList<String>();
        }
        this.usernameNotIn.add(usernameNotInItem);
        return this;
    }

    /**
     * Get usernameNotIn
     *
     * @return usernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameNotIn() {
        return usernameNotIn;
    }

    public void setUsernameNotIn(List<String> usernameNotIn) {
        this.usernameNotIn = usernameNotIn;
    }

    public SmtpServerWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public SmtpServerWhereInput usernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public void setUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        }
    }

    public boolean getUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_IN);
    }

    public SmtpServerWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

        this.usernameNotStartsWith = usernameNotStartsWith;
        return this;
    }

    /**
     * Get usernameNotStartsWith
     *
     * @return usernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotStartsWith() {
        return usernameNotStartsWith;
    }

    public void setUsernameNotStartsWith(String usernameNotStartsWith) {
        this.usernameNotStartsWith = usernameNotStartsWith;
    }

    public SmtpServerWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput usernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
    }

    public SmtpServerWhereInput usernameStartsWith(String usernameStartsWith) {

        this.usernameStartsWith = usernameStartsWith;
        return this;
    }

    /**
     * Get usernameStartsWith
     *
     * @return usernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameStartsWith() {
        return usernameStartsWith;
    }

    public void setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
    }

    public SmtpServerWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public SmtpServerWhereInput usernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public void setUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        }
    }

    public boolean getUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmtpServerWhereInput smtpServerWhereInput = (SmtpServerWhereInput) o;
        return Objects.equals(this.AND, smtpServerWhereInput.AND)
                && Objects.equals(this.NOT, smtpServerWhereInput.NOT)
                && Objects.equals(this.OR, smtpServerWhereInput.OR)
                && Objects.equals(this.description, smtpServerWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, smtpServerWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, smtpServerWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, smtpServerWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, smtpServerWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, smtpServerWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, smtpServerWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, smtpServerWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, smtpServerWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, smtpServerWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, smtpServerWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, smtpServerWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        smtpServerWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, smtpServerWhereInput.descriptionStartsWith)
                && Objects.equals(this.host, smtpServerWhereInput.host)
                && Objects.equals(this.hostContains, smtpServerWhereInput.hostContains)
                && Objects.equals(this.hostEndsWith, smtpServerWhereInput.hostEndsWith)
                && Objects.equals(this.hostGt, smtpServerWhereInput.hostGt)
                && Objects.equals(this.hostGte, smtpServerWhereInput.hostGte)
                && Objects.equals(this.hostIn, smtpServerWhereInput.hostIn)
                && Objects.equals(this.hostLt, smtpServerWhereInput.hostLt)
                && Objects.equals(this.hostLte, smtpServerWhereInput.hostLte)
                && Objects.equals(this.hostNot, smtpServerWhereInput.hostNot)
                && Objects.equals(this.hostNotContains, smtpServerWhereInput.hostNotContains)
                && Objects.equals(this.hostNotEndsWith, smtpServerWhereInput.hostNotEndsWith)
                && Objects.equals(this.hostNotIn, smtpServerWhereInput.hostNotIn)
                && Objects.equals(this.hostNotStartsWith, smtpServerWhereInput.hostNotStartsWith)
                && Objects.equals(this.hostStartsWith, smtpServerWhereInput.hostStartsWith)
                && Objects.equals(this.id, smtpServerWhereInput.id)
                && Objects.equals(this.idContains, smtpServerWhereInput.idContains)
                && Objects.equals(this.idEndsWith, smtpServerWhereInput.idEndsWith)
                && Objects.equals(this.idGt, smtpServerWhereInput.idGt)
                && Objects.equals(this.idGte, smtpServerWhereInput.idGte)
                && Objects.equals(this.idIn, smtpServerWhereInput.idIn)
                && Objects.equals(this.idLt, smtpServerWhereInput.idLt)
                && Objects.equals(this.idLte, smtpServerWhereInput.idLte)
                && Objects.equals(this.idNot, smtpServerWhereInput.idNot)
                && Objects.equals(this.idNotContains, smtpServerWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, smtpServerWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, smtpServerWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, smtpServerWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, smtpServerWhereInput.idStartsWith)
                && Objects.equals(this.name, smtpServerWhereInput.name)
                && Objects.equals(this.nameContains, smtpServerWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, smtpServerWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, smtpServerWhereInput.nameGt)
                && Objects.equals(this.nameGte, smtpServerWhereInput.nameGte)
                && Objects.equals(this.nameIn, smtpServerWhereInput.nameIn)
                && Objects.equals(this.nameLt, smtpServerWhereInput.nameLt)
                && Objects.equals(this.nameLte, smtpServerWhereInput.nameLte)
                && Objects.equals(this.nameNot, smtpServerWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, smtpServerWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, smtpServerWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, smtpServerWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, smtpServerWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, smtpServerWhereInput.nameStartsWith)
                && Objects.equals(this.port, smtpServerWhereInput.port)
                && Objects.equals(this.portGt, smtpServerWhereInput.portGt)
                && Objects.equals(this.portGte, smtpServerWhereInput.portGte)
                && Objects.equals(this.portIn, smtpServerWhereInput.portIn)
                && Objects.equals(this.portLt, smtpServerWhereInput.portLt)
                && Objects.equals(this.portLte, smtpServerWhereInput.portLte)
                && Objects.equals(this.portNot, smtpServerWhereInput.portNot)
                && Objects.equals(this.portNotIn, smtpServerWhereInput.portNotIn)
                && Objects.equals(this.secureMode, smtpServerWhereInput.secureMode)
                && Objects.equals(this.secureModeIn, smtpServerWhereInput.secureModeIn)
                && Objects.equals(this.secureModeNot, smtpServerWhereInput.secureModeNot)
                && Objects.equals(this.secureModeNotIn, smtpServerWhereInput.secureModeNotIn)
                && Objects.equals(this.username, smtpServerWhereInput.username)
                && Objects.equals(this.usernameContains, smtpServerWhereInput.usernameContains)
                && Objects.equals(this.usernameEndsWith, smtpServerWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, smtpServerWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, smtpServerWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, smtpServerWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, smtpServerWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, smtpServerWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, smtpServerWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains, smtpServerWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith, smtpServerWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, smtpServerWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith, smtpServerWhereInput.usernameNotStartsWith)
                && Objects.equals(this.usernameStartsWith, smtpServerWhereInput.usernameStartsWith);
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
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                host,
                hostContains,
                hostEndsWith,
                hostGt,
                hostGte,
                hostIn,
                hostLt,
                hostLte,
                hostNot,
                hostNotContains,
                hostNotEndsWith,
                hostNotIn,
                hostNotStartsWith,
                hostStartsWith,
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
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                port,
                portGt,
                portGte,
                portIn,
                portLt,
                portLte,
                portNot,
                portNotIn,
                secureMode,
                secureModeIn,
                secureModeNot,
                secureModeNotIn,
                username,
                usernameContains,
                usernameEndsWith,
                usernameGt,
                usernameGte,
                usernameIn,
                usernameLt,
                usernameLte,
                usernameNot,
                usernameNotContains,
                usernameNotEndsWith,
                usernameNotIn,
                usernameNotStartsWith,
                usernameStartsWith);
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
        sb.append("class SmtpServerWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    hostContains: ").append(toIndentedString(hostContains)).append("\n");
        sb.append("    hostEndsWith: ").append(toIndentedString(hostEndsWith)).append("\n");
        sb.append("    hostGt: ").append(toIndentedString(hostGt)).append("\n");
        sb.append("    hostGte: ").append(toIndentedString(hostGte)).append("\n");
        sb.append("    hostIn: ").append(toIndentedString(hostIn)).append("\n");
        sb.append("    hostLt: ").append(toIndentedString(hostLt)).append("\n");
        sb.append("    hostLte: ").append(toIndentedString(hostLte)).append("\n");
        sb.append("    hostNot: ").append(toIndentedString(hostNot)).append("\n");
        sb.append("    hostNotContains: ").append(toIndentedString(hostNotContains)).append("\n");
        sb.append("    hostNotEndsWith: ").append(toIndentedString(hostNotEndsWith)).append("\n");
        sb.append("    hostNotIn: ").append(toIndentedString(hostNotIn)).append("\n");
        sb.append("    hostNotStartsWith: ")
                .append(toIndentedString(hostNotStartsWith))
                .append("\n");
        sb.append("    hostStartsWith: ").append(toIndentedString(hostStartsWith)).append("\n");
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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portGt: ").append(toIndentedString(portGt)).append("\n");
        sb.append("    portGte: ").append(toIndentedString(portGte)).append("\n");
        sb.append("    portIn: ").append(toIndentedString(portIn)).append("\n");
        sb.append("    portLt: ").append(toIndentedString(portLt)).append("\n");
        sb.append("    portLte: ").append(toIndentedString(portLte)).append("\n");
        sb.append("    portNot: ").append(toIndentedString(portNot)).append("\n");
        sb.append("    portNotIn: ").append(toIndentedString(portNotIn)).append("\n");
        sb.append("    secureMode: ").append(toIndentedString(secureMode)).append("\n");
        sb.append("    secureModeIn: ").append(toIndentedString(secureModeIn)).append("\n");
        sb.append("    secureModeNot: ").append(toIndentedString(secureModeNot)).append("\n");
        sb.append("    secureModeNotIn: ").append(toIndentedString(secureModeNotIn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
        sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
        sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
        sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
        sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
        sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
        sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
        sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
        sb.append("    usernameNotContains: ")
                .append(toIndentedString(usernameNotContains))
                .append("\n");
        sb.append("    usernameNotEndsWith: ")
                .append(toIndentedString(usernameNotEndsWith))
                .append("\n");
        sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
        sb.append("    usernameNotStartsWith: ")
                .append(toIndentedString(usernameNotStartsWith))
                .append("\n");
        sb.append("    usernameStartsWith: ")
                .append(toIndentedString(usernameStartsWith))
                .append("\n");
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
