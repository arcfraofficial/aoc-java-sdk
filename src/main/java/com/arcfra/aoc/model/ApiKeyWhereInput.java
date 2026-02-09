package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ApiKeyWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApiKeyWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ApiKeyWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ApiKeyWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ApiKeyWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_EDITABLE = "editable";

    @SerializedName(SERIALIZED_NAME_EDITABLE)
    private Boolean editable;

    public static final String SERIALIZED_NAME_EDITABLE_NOT = "editable_not";

    @SerializedName(SERIALIZED_NAME_EDITABLE_NOT)
    private Boolean editableNot;

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY =
            "external_cloudtowers_every";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY)
    private ExternalCloudTowerWhereInput externalCloudtowersEvery;

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE =
            "external_cloudtowers_none";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE)
    private ExternalCloudTowerWhereInput externalCloudtowersNone;

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME =
            "external_cloudtowers_some";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME)
    private ExternalCloudTowerWhereInput externalCloudtowersSome;

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

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_KEY_CONTAINS = "key_contains";

    @SerializedName(SERIALIZED_NAME_KEY_CONTAINS)
    private String keyContains;

    public static final String SERIALIZED_NAME_KEY_ENDS_WITH = "key_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_ENDS_WITH)
    private String keyEndsWith;

    public static final String SERIALIZED_NAME_KEY_GT = "key_gt";

    @SerializedName(SERIALIZED_NAME_KEY_GT)
    private String keyGt;

    public static final String SERIALIZED_NAME_KEY_GTE = "key_gte";

    @SerializedName(SERIALIZED_NAME_KEY_GTE)
    private String keyGte;

    public static final String SERIALIZED_NAME_KEY_IN = "key_in";

    @SerializedName(SERIALIZED_NAME_KEY_IN)
    private List<String> keyIn = null;

    public static final String SERIALIZED_NAME_KEY_LT = "key_lt";

    @SerializedName(SERIALIZED_NAME_KEY_LT)
    private String keyLt;

    public static final String SERIALIZED_NAME_KEY_LTE = "key_lte";

    @SerializedName(SERIALIZED_NAME_KEY_LTE)
    private String keyLte;

    public static final String SERIALIZED_NAME_KEY_NOT = "key_not";

    @SerializedName(SERIALIZED_NAME_KEY_NOT)
    private String keyNot;

    public static final String SERIALIZED_NAME_KEY_NOT_CONTAINS = "key_not_contains";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_CONTAINS)
    private String keyNotContains;

    public static final String SERIALIZED_NAME_KEY_NOT_ENDS_WITH = "key_not_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_ENDS_WITH)
    private String keyNotEndsWith;

    public static final String SERIALIZED_NAME_KEY_NOT_IN = "key_not_in";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_IN)
    private List<String> keyNotIn = null;

    public static final String SERIALIZED_NAME_KEY_NOT_STARTS_WITH = "key_not_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_STARTS_WITH)
    private String keyNotStartsWith;

    public static final String SERIALIZED_NAME_KEY_STARTS_WITH = "key_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_STARTS_WITH)
    private String keyStartsWith;

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

    public static final String SERIALIZED_NAME_ROLES_EVERY = "roles_every";

    @SerializedName(SERIALIZED_NAME_ROLES_EVERY)
    private UserRoleNextWhereInput rolesEvery;

    public static final String SERIALIZED_NAME_ROLES_NONE = "roles_none";

    @SerializedName(SERIALIZED_NAME_ROLES_NONE)
    private UserRoleNextWhereInput rolesNone;

    public static final String SERIALIZED_NAME_ROLES_SOME = "roles_some";

    @SerializedName(SERIALIZED_NAME_ROLES_SOME)
    private UserRoleNextWhereInput rolesSome;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private UserWhereInput user;

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

    public ApiKeyWhereInput() {}

    public ApiKeyWhereInput AND(List<ApiKeyWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ApiKeyWhereInput addANDItem(ApiKeyWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ApiKeyWhereInput>();
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
    public List<ApiKeyWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ApiKeyWhereInput> AND) {
        this.AND = AND;
    }

    public ApiKeyWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ApiKeyWhereInput AND_ExplictlyNonNull() {
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

    public ApiKeyWhereInput NOT(List<ApiKeyWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ApiKeyWhereInput addNOTItem(ApiKeyWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ApiKeyWhereInput>();
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
    public List<ApiKeyWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ApiKeyWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ApiKeyWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ApiKeyWhereInput NOT_ExplictlyNonNull() {
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

    public ApiKeyWhereInput OR(List<ApiKeyWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ApiKeyWhereInput addORItem(ApiKeyWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ApiKeyWhereInput>();
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
    public List<ApiKeyWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ApiKeyWhereInput> OR) {
        this.OR = OR;
    }

    public ApiKeyWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ApiKeyWhereInput OR_ExplictlyNonNull() {
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

    public ApiKeyWhereInput description(String description) {

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

    public ApiKeyWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ApiKeyWhereInput description_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionContains(String descriptionContains) {

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

    public ApiKeyWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput descriptionContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public ApiKeyWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionGt(String descriptionGt) {

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

    public ApiKeyWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ApiKeyWhereInput descriptionGt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionGte(String descriptionGte) {

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

    public ApiKeyWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ApiKeyWhereInput descriptionGte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ApiKeyWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public ApiKeyWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ApiKeyWhereInput descriptionIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionLt(String descriptionLt) {

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

    public ApiKeyWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ApiKeyWhereInput descriptionLt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionLte(String descriptionLte) {

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

    public ApiKeyWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ApiKeyWhereInput descriptionLte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionNot(String descriptionNot) {

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

    public ApiKeyWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ApiKeyWhereInput descriptionNot_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public ApiKeyWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public ApiKeyWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ApiKeyWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public ApiKeyWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ApiKeyWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public ApiKeyWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public ApiKeyWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput editable(Boolean editable) {

        this.editable = editable;
        return this;
    }

    /**
     * Get editable
     *
     * @return editable
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public ApiKeyWhereInput editable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDITABLE);
        return this;
    }

    public ApiKeyWhereInput editable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDITABLE);
        return this;
    }

    public void setEditable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDITABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDITABLE);
        }
    }

    public boolean getEditable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDITABLE);
    }

    public ApiKeyWhereInput editableNot(Boolean editableNot) {

        this.editableNot = editableNot;
        return this;
    }

    /**
     * Get editableNot
     *
     * @return editableNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEditableNot() {
        return editableNot;
    }

    public void setEditableNot(Boolean editableNot) {
        this.editableNot = editableNot;
    }

    public ApiKeyWhereInput editableNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDITABLE_NOT);
        return this;
    }

    public ApiKeyWhereInput editableNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDITABLE_NOT);
        return this;
    }

    public void setEditableNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDITABLE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDITABLE_NOT);
        }
    }

    public boolean getEditableNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDITABLE_NOT);
    }

    public ApiKeyWhereInput externalCloudtowersEvery(
            ExternalCloudTowerWhereInput externalCloudtowersEvery) {

        this.externalCloudtowersEvery = externalCloudtowersEvery;
        return this;
    }

    /**
     * Get externalCloudtowersEvery
     *
     * @return externalCloudtowersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ExternalCloudTowerWhereInput getExternalCloudtowersEvery() {
        return externalCloudtowersEvery;
    }

    public void setExternalCloudtowersEvery(ExternalCloudTowerWhereInput externalCloudtowersEvery) {
        this.externalCloudtowersEvery = externalCloudtowersEvery;
    }

    public ApiKeyWhereInput externalCloudtowersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY);
        return this;
    }

    public ApiKeyWhereInput externalCloudtowersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY);
        return this;
    }

    public void setExternalCloudtowersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY);
        }
    }

    public boolean getExternalCloudtowersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_EVERY);
    }

    public ApiKeyWhereInput externalCloudtowersNone(
            ExternalCloudTowerWhereInput externalCloudtowersNone) {

        this.externalCloudtowersNone = externalCloudtowersNone;
        return this;
    }

    /**
     * Get externalCloudtowersNone
     *
     * @return externalCloudtowersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ExternalCloudTowerWhereInput getExternalCloudtowersNone() {
        return externalCloudtowersNone;
    }

    public void setExternalCloudtowersNone(ExternalCloudTowerWhereInput externalCloudtowersNone) {
        this.externalCloudtowersNone = externalCloudtowersNone;
    }

    public ApiKeyWhereInput externalCloudtowersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE);
        return this;
    }

    public ApiKeyWhereInput externalCloudtowersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE);
        return this;
    }

    public void setExternalCloudtowersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE);
        }
    }

    public boolean getExternalCloudtowersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_NONE);
    }

    public ApiKeyWhereInput externalCloudtowersSome(
            ExternalCloudTowerWhereInput externalCloudtowersSome) {

        this.externalCloudtowersSome = externalCloudtowersSome;
        return this;
    }

    /**
     * Get externalCloudtowersSome
     *
     * @return externalCloudtowersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ExternalCloudTowerWhereInput getExternalCloudtowersSome() {
        return externalCloudtowersSome;
    }

    public void setExternalCloudtowersSome(ExternalCloudTowerWhereInput externalCloudtowersSome) {
        this.externalCloudtowersSome = externalCloudtowersSome;
    }

    public ApiKeyWhereInput externalCloudtowersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME);
        return this;
    }

    public ApiKeyWhereInput externalCloudtowersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME);
        return this;
    }

    public void setExternalCloudtowersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME);
        }
    }

    public boolean getExternalCloudtowersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_CLOUDTOWERS_SOME);
    }

    public ApiKeyWhereInput id(String id) {

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

    public ApiKeyWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ApiKeyWhereInput id_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idContains(String idContains) {

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

    public ApiKeyWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput idContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idEndsWith(String idEndsWith) {

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

    public ApiKeyWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idGt(String idGt) {

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

    public ApiKeyWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ApiKeyWhereInput idGt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idGte(String idGte) {

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

    public ApiKeyWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ApiKeyWhereInput idGte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ApiKeyWhereInput addIdInItem(String idInItem) {
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

    public ApiKeyWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ApiKeyWhereInput idIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idLt(String idLt) {

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

    public ApiKeyWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ApiKeyWhereInput idLt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idLte(String idLte) {

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

    public ApiKeyWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ApiKeyWhereInput idLte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idNot(String idNot) {

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

    public ApiKeyWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ApiKeyWhereInput idNot_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idNotContains(String idNotContains) {

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

    public ApiKeyWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput idNotContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ApiKeyWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ApiKeyWhereInput addIdNotInItem(String idNotInItem) {
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

    public ApiKeyWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ApiKeyWhereInput idNotIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ApiKeyWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput idStartsWith(String idStartsWith) {

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

    public ApiKeyWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ApiKeyWhereInput key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public ApiKeyWhereInput key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public ApiKeyWhereInput keyContains(String keyContains) {

        this.keyContains = keyContains;
        return this;
    }

    /**
     * Get keyContains
     *
     * @return keyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyContains() {
        return keyContains;
    }

    public void setKeyContains(String keyContains) {
        this.keyContains = keyContains;
    }

    public ApiKeyWhereInput keyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput keyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public void setKeyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        }
    }

    public boolean getKeyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_CONTAINS);
    }

    public ApiKeyWhereInput keyEndsWith(String keyEndsWith) {

        this.keyEndsWith = keyEndsWith;
        return this;
    }

    /**
     * Get keyEndsWith
     *
     * @return keyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyEndsWith() {
        return keyEndsWith;
    }

    public void setKeyEndsWith(String keyEndsWith) {
        this.keyEndsWith = keyEndsWith;
    }

    public ApiKeyWhereInput keyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput keyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public void setKeyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        }
    }

    public boolean getKeyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_ENDS_WITH);
    }

    public ApiKeyWhereInput keyGt(String keyGt) {

        this.keyGt = keyGt;
        return this;
    }

    /**
     * Get keyGt
     *
     * @return keyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyGt() {
        return keyGt;
    }

    public void setKeyGt(String keyGt) {
        this.keyGt = keyGt;
    }

    public ApiKeyWhereInput keyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public ApiKeyWhereInput keyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public void setKeyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        }
    }

    public boolean getKeyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GT);
    }

    public ApiKeyWhereInput keyGte(String keyGte) {

        this.keyGte = keyGte;
        return this;
    }

    /**
     * Get keyGte
     *
     * @return keyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyGte() {
        return keyGte;
    }

    public void setKeyGte(String keyGte) {
        this.keyGte = keyGte;
    }

    public ApiKeyWhereInput keyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public ApiKeyWhereInput keyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public void setKeyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        }
    }

    public boolean getKeyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GTE);
    }

    public ApiKeyWhereInput keyIn(List<String> keyIn) {

        this.keyIn = keyIn;
        return this;
    }

    public ApiKeyWhereInput addKeyInItem(String keyInItem) {
        if (this.keyIn == null) {
            this.keyIn = new ArrayList<String>();
        }
        this.keyIn.add(keyInItem);
        return this;
    }

    /**
     * Get keyIn
     *
     * @return keyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKeyIn() {
        return keyIn;
    }

    public void setKeyIn(List<String> keyIn) {
        this.keyIn = keyIn;
    }

    public ApiKeyWhereInput keyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public ApiKeyWhereInput keyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public void setKeyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        }
    }

    public boolean getKeyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_IN);
    }

    public ApiKeyWhereInput keyLt(String keyLt) {

        this.keyLt = keyLt;
        return this;
    }

    /**
     * Get keyLt
     *
     * @return keyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyLt() {
        return keyLt;
    }

    public void setKeyLt(String keyLt) {
        this.keyLt = keyLt;
    }

    public ApiKeyWhereInput keyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public ApiKeyWhereInput keyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public void setKeyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        }
    }

    public boolean getKeyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LT);
    }

    public ApiKeyWhereInput keyLte(String keyLte) {

        this.keyLte = keyLte;
        return this;
    }

    /**
     * Get keyLte
     *
     * @return keyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyLte() {
        return keyLte;
    }

    public void setKeyLte(String keyLte) {
        this.keyLte = keyLte;
    }

    public ApiKeyWhereInput keyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public ApiKeyWhereInput keyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public void setKeyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        }
    }

    public boolean getKeyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LTE);
    }

    public ApiKeyWhereInput keyNot(String keyNot) {

        this.keyNot = keyNot;
        return this;
    }

    /**
     * Get keyNot
     *
     * @return keyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNot() {
        return keyNot;
    }

    public void setKeyNot(String keyNot) {
        this.keyNot = keyNot;
    }

    public ApiKeyWhereInput keyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public ApiKeyWhereInput keyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public void setKeyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        }
    }

    public boolean getKeyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT);
    }

    public ApiKeyWhereInput keyNotContains(String keyNotContains) {

        this.keyNotContains = keyNotContains;
        return this;
    }

    /**
     * Get keyNotContains
     *
     * @return keyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotContains() {
        return keyNotContains;
    }

    public void setKeyNotContains(String keyNotContains) {
        this.keyNotContains = keyNotContains;
    }

    public ApiKeyWhereInput keyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput keyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public void setKeyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        }
    }

    public boolean getKeyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_CONTAINS);
    }

    public ApiKeyWhereInput keyNotEndsWith(String keyNotEndsWith) {

        this.keyNotEndsWith = keyNotEndsWith;
        return this;
    }

    /**
     * Get keyNotEndsWith
     *
     * @return keyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotEndsWith() {
        return keyNotEndsWith;
    }

    public void setKeyNotEndsWith(String keyNotEndsWith) {
        this.keyNotEndsWith = keyNotEndsWith;
    }

    public ApiKeyWhereInput keyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput keyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public void setKeyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        }
    }

    public boolean getKeyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
    }

    public ApiKeyWhereInput keyNotIn(List<String> keyNotIn) {

        this.keyNotIn = keyNotIn;
        return this;
    }

    public ApiKeyWhereInput addKeyNotInItem(String keyNotInItem) {
        if (this.keyNotIn == null) {
            this.keyNotIn = new ArrayList<String>();
        }
        this.keyNotIn.add(keyNotInItem);
        return this;
    }

    /**
     * Get keyNotIn
     *
     * @return keyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKeyNotIn() {
        return keyNotIn;
    }

    public void setKeyNotIn(List<String> keyNotIn) {
        this.keyNotIn = keyNotIn;
    }

    public ApiKeyWhereInput keyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public ApiKeyWhereInput keyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public void setKeyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        }
    }

    public boolean getKeyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_IN);
    }

    public ApiKeyWhereInput keyNotStartsWith(String keyNotStartsWith) {

        this.keyNotStartsWith = keyNotStartsWith;
        return this;
    }

    /**
     * Get keyNotStartsWith
     *
     * @return keyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotStartsWith() {
        return keyNotStartsWith;
    }

    public void setKeyNotStartsWith(String keyNotStartsWith) {
        this.keyNotStartsWith = keyNotStartsWith;
    }

    public ApiKeyWhereInput keyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput keyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public void setKeyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        }
    }

    public boolean getKeyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
    }

    public ApiKeyWhereInput keyStartsWith(String keyStartsWith) {

        this.keyStartsWith = keyStartsWith;
        return this;
    }

    /**
     * Get keyStartsWith
     *
     * @return keyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyStartsWith() {
        return keyStartsWith;
    }

    public void setKeyStartsWith(String keyStartsWith) {
        this.keyStartsWith = keyStartsWith;
    }

    public ApiKeyWhereInput keyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput keyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public void setKeyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        }
    }

    public boolean getKeyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_STARTS_WITH);
    }

    public ApiKeyWhereInput name(String name) {

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

    public ApiKeyWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ApiKeyWhereInput name_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameContains(String nameContains) {

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

    public ApiKeyWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput nameContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameEndsWith(String nameEndsWith) {

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

    public ApiKeyWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameGt(String nameGt) {

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

    public ApiKeyWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ApiKeyWhereInput nameGt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameGte(String nameGte) {

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

    public ApiKeyWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ApiKeyWhereInput nameGte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ApiKeyWhereInput addNameInItem(String nameInItem) {
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

    public ApiKeyWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ApiKeyWhereInput nameIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameLt(String nameLt) {

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

    public ApiKeyWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ApiKeyWhereInput nameLt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameLte(String nameLte) {

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

    public ApiKeyWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ApiKeyWhereInput nameLte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameNot(String nameNot) {

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

    public ApiKeyWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ApiKeyWhereInput nameNot_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameNotContains(String nameNotContains) {

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

    public ApiKeyWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ApiKeyWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ApiKeyWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ApiKeyWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ApiKeyWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ApiKeyWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput nameStartsWith(String nameStartsWith) {

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

    public ApiKeyWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput rolesEvery(UserRoleNextWhereInput rolesEvery) {

        this.rolesEvery = rolesEvery;
        return this;
    }

    /**
     * Get rolesEvery
     *
     * @return rolesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesEvery() {
        return rolesEvery;
    }

    public void setRolesEvery(UserRoleNextWhereInput rolesEvery) {
        this.rolesEvery = rolesEvery;
    }

    public ApiKeyWhereInput rolesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_EVERY);
        return this;
    }

    public ApiKeyWhereInput rolesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_EVERY);
        return this;
    }

    public void setRolesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_EVERY);
        }
    }

    public boolean getRolesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_EVERY);
    }

    public ApiKeyWhereInput rolesNone(UserRoleNextWhereInput rolesNone) {

        this.rolesNone = rolesNone;
        return this;
    }

    /**
     * Get rolesNone
     *
     * @return rolesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesNone() {
        return rolesNone;
    }

    public void setRolesNone(UserRoleNextWhereInput rolesNone) {
        this.rolesNone = rolesNone;
    }

    public ApiKeyWhereInput rolesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_NONE);
        return this;
    }

    public ApiKeyWhereInput rolesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_NONE);
        return this;
    }

    public void setRolesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_NONE);
        }
    }

    public boolean getRolesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_NONE);
    }

    public ApiKeyWhereInput rolesSome(UserRoleNextWhereInput rolesSome) {

        this.rolesSome = rolesSome;
        return this;
    }

    /**
     * Get rolesSome
     *
     * @return rolesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRoleNextWhereInput getRolesSome() {
        return rolesSome;
    }

    public void setRolesSome(UserRoleNextWhereInput rolesSome) {
        this.rolesSome = rolesSome;
    }

    public ApiKeyWhereInput rolesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROLES_SOME);
        return this;
    }

    public ApiKeyWhereInput rolesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROLES_SOME);
        return this;
    }

    public void setRolesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROLES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROLES_SOME);
        }
    }

    public boolean getRolesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROLES_SOME);
    }

    public ApiKeyWhereInput user(UserWhereInput user) {

        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUser() {
        return user;
    }

    public void setUser(UserWhereInput user) {
        this.user = user;
    }

    public ApiKeyWhereInput user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public ApiKeyWhereInput user_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER);
        return this;
    }

    public void setUser_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER);
        }
    }

    public boolean getUser_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER);
    }

    public ApiKeyWhereInput username(String username) {

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

    public ApiKeyWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public ApiKeyWhereInput username_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameContains(String usernameContains) {

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

    public ApiKeyWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput usernameContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameEndsWith(String usernameEndsWith) {

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

    public ApiKeyWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput usernameEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameGt(String usernameGt) {

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

    public ApiKeyWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public ApiKeyWhereInput usernameGt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameGte(String usernameGte) {

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

    public ApiKeyWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public ApiKeyWhereInput usernameGte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public ApiKeyWhereInput addUsernameInItem(String usernameInItem) {
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

    public ApiKeyWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public ApiKeyWhereInput usernameIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameLt(String usernameLt) {

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

    public ApiKeyWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public ApiKeyWhereInput usernameLt_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameLte(String usernameLte) {

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

    public ApiKeyWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public ApiKeyWhereInput usernameLte_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameNot(String usernameNot) {

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

    public ApiKeyWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public ApiKeyWhereInput usernameNot_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameNotContains(String usernameNotContains) {

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

    public ApiKeyWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public ApiKeyWhereInput usernameNotContains_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

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

    public ApiKeyWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public ApiKeyWhereInput usernameNotEndsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public ApiKeyWhereInput addUsernameNotInItem(String usernameNotInItem) {
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

    public ApiKeyWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public ApiKeyWhereInput usernameNotIn_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

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

    public ApiKeyWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput usernameNotStartsWith_ExplictlyNonNull() {
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

    public ApiKeyWhereInput usernameStartsWith(String usernameStartsWith) {

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

    public ApiKeyWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public ApiKeyWhereInput usernameStartsWith_ExplictlyNonNull() {
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
        ApiKeyWhereInput apiKeyWhereInput = (ApiKeyWhereInput) o;
        return Objects.equals(this.AND, apiKeyWhereInput.AND)
                && Objects.equals(this.NOT, apiKeyWhereInput.NOT)
                && Objects.equals(this.OR, apiKeyWhereInput.OR)
                && Objects.equals(this.description, apiKeyWhereInput.description)
                && Objects.equals(this.descriptionContains, apiKeyWhereInput.descriptionContains)
                && Objects.equals(this.descriptionEndsWith, apiKeyWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, apiKeyWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, apiKeyWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, apiKeyWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, apiKeyWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, apiKeyWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, apiKeyWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, apiKeyWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, apiKeyWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, apiKeyWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith, apiKeyWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, apiKeyWhereInput.descriptionStartsWith)
                && Objects.equals(this.editable, apiKeyWhereInput.editable)
                && Objects.equals(this.editableNot, apiKeyWhereInput.editableNot)
                && Objects.equals(
                        this.externalCloudtowersEvery, apiKeyWhereInput.externalCloudtowersEvery)
                && Objects.equals(
                        this.externalCloudtowersNone, apiKeyWhereInput.externalCloudtowersNone)
                && Objects.equals(
                        this.externalCloudtowersSome, apiKeyWhereInput.externalCloudtowersSome)
                && Objects.equals(this.id, apiKeyWhereInput.id)
                && Objects.equals(this.idContains, apiKeyWhereInput.idContains)
                && Objects.equals(this.idEndsWith, apiKeyWhereInput.idEndsWith)
                && Objects.equals(this.idGt, apiKeyWhereInput.idGt)
                && Objects.equals(this.idGte, apiKeyWhereInput.idGte)
                && Objects.equals(this.idIn, apiKeyWhereInput.idIn)
                && Objects.equals(this.idLt, apiKeyWhereInput.idLt)
                && Objects.equals(this.idLte, apiKeyWhereInput.idLte)
                && Objects.equals(this.idNot, apiKeyWhereInput.idNot)
                && Objects.equals(this.idNotContains, apiKeyWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, apiKeyWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, apiKeyWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, apiKeyWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, apiKeyWhereInput.idStartsWith)
                && Objects.equals(this.key, apiKeyWhereInput.key)
                && Objects.equals(this.keyContains, apiKeyWhereInput.keyContains)
                && Objects.equals(this.keyEndsWith, apiKeyWhereInput.keyEndsWith)
                && Objects.equals(this.keyGt, apiKeyWhereInput.keyGt)
                && Objects.equals(this.keyGte, apiKeyWhereInput.keyGte)
                && Objects.equals(this.keyIn, apiKeyWhereInput.keyIn)
                && Objects.equals(this.keyLt, apiKeyWhereInput.keyLt)
                && Objects.equals(this.keyLte, apiKeyWhereInput.keyLte)
                && Objects.equals(this.keyNot, apiKeyWhereInput.keyNot)
                && Objects.equals(this.keyNotContains, apiKeyWhereInput.keyNotContains)
                && Objects.equals(this.keyNotEndsWith, apiKeyWhereInput.keyNotEndsWith)
                && Objects.equals(this.keyNotIn, apiKeyWhereInput.keyNotIn)
                && Objects.equals(this.keyNotStartsWith, apiKeyWhereInput.keyNotStartsWith)
                && Objects.equals(this.keyStartsWith, apiKeyWhereInput.keyStartsWith)
                && Objects.equals(this.name, apiKeyWhereInput.name)
                && Objects.equals(this.nameContains, apiKeyWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, apiKeyWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, apiKeyWhereInput.nameGt)
                && Objects.equals(this.nameGte, apiKeyWhereInput.nameGte)
                && Objects.equals(this.nameIn, apiKeyWhereInput.nameIn)
                && Objects.equals(this.nameLt, apiKeyWhereInput.nameLt)
                && Objects.equals(this.nameLte, apiKeyWhereInput.nameLte)
                && Objects.equals(this.nameNot, apiKeyWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, apiKeyWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, apiKeyWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, apiKeyWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, apiKeyWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, apiKeyWhereInput.nameStartsWith)
                && Objects.equals(this.rolesEvery, apiKeyWhereInput.rolesEvery)
                && Objects.equals(this.rolesNone, apiKeyWhereInput.rolesNone)
                && Objects.equals(this.rolesSome, apiKeyWhereInput.rolesSome)
                && Objects.equals(this.user, apiKeyWhereInput.user)
                && Objects.equals(this.username, apiKeyWhereInput.username)
                && Objects.equals(this.usernameContains, apiKeyWhereInput.usernameContains)
                && Objects.equals(this.usernameEndsWith, apiKeyWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, apiKeyWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, apiKeyWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, apiKeyWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, apiKeyWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, apiKeyWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, apiKeyWhereInput.usernameNot)
                && Objects.equals(this.usernameNotContains, apiKeyWhereInput.usernameNotContains)
                && Objects.equals(this.usernameNotEndsWith, apiKeyWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, apiKeyWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith, apiKeyWhereInput.usernameNotStartsWith)
                && Objects.equals(this.usernameStartsWith, apiKeyWhereInput.usernameStartsWith);
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
                editable,
                editableNot,
                externalCloudtowersEvery,
                externalCloudtowersNone,
                externalCloudtowersSome,
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
                key,
                keyContains,
                keyEndsWith,
                keyGt,
                keyGte,
                keyIn,
                keyLt,
                keyLte,
                keyNot,
                keyNotContains,
                keyNotEndsWith,
                keyNotIn,
                keyNotStartsWith,
                keyStartsWith,
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
                rolesEvery,
                rolesNone,
                rolesSome,
                user,
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
        sb.append("class ApiKeyWhereInput {\n");
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
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    editableNot: ").append(toIndentedString(editableNot)).append("\n");
        sb.append("    externalCloudtowersEvery: ")
                .append(toIndentedString(externalCloudtowersEvery))
                .append("\n");
        sb.append("    externalCloudtowersNone: ")
                .append(toIndentedString(externalCloudtowersNone))
                .append("\n");
        sb.append("    externalCloudtowersSome: ")
                .append(toIndentedString(externalCloudtowersSome))
                .append("\n");
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
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyContains: ").append(toIndentedString(keyContains)).append("\n");
        sb.append("    keyEndsWith: ").append(toIndentedString(keyEndsWith)).append("\n");
        sb.append("    keyGt: ").append(toIndentedString(keyGt)).append("\n");
        sb.append("    keyGte: ").append(toIndentedString(keyGte)).append("\n");
        sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
        sb.append("    keyLt: ").append(toIndentedString(keyLt)).append("\n");
        sb.append("    keyLte: ").append(toIndentedString(keyLte)).append("\n");
        sb.append("    keyNot: ").append(toIndentedString(keyNot)).append("\n");
        sb.append("    keyNotContains: ").append(toIndentedString(keyNotContains)).append("\n");
        sb.append("    keyNotEndsWith: ").append(toIndentedString(keyNotEndsWith)).append("\n");
        sb.append("    keyNotIn: ").append(toIndentedString(keyNotIn)).append("\n");
        sb.append("    keyNotStartsWith: ").append(toIndentedString(keyNotStartsWith)).append("\n");
        sb.append("    keyStartsWith: ").append(toIndentedString(keyStartsWith)).append("\n");
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
        sb.append("    rolesEvery: ").append(toIndentedString(rolesEvery)).append("\n");
        sb.append("    rolesNone: ").append(toIndentedString(rolesNone)).append("\n");
        sb.append("    rolesSome: ").append(toIndentedString(rolesSome)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
