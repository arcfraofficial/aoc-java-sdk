package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** UserRoleNextWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserRoleNextWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<UserRoleNextWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<UserRoleNextWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<UserRoleNextWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_PLATFORM = "platform";

    @SerializedName(SERIALIZED_NAME_PLATFORM)
    private UserRolePlatform platform;

    public static final String SERIALIZED_NAME_PLATFORM_IN = "platform_in";

    @SerializedName(SERIALIZED_NAME_PLATFORM_IN)
    private List<UserRolePlatform> platformIn = null;

    public static final String SERIALIZED_NAME_PLATFORM_NOT = "platform_not";

    @SerializedName(SERIALIZED_NAME_PLATFORM_NOT)
    private UserRolePlatform platformNot;

    public static final String SERIALIZED_NAME_PLATFORM_NOT_IN = "platform_not_in";

    @SerializedName(SERIALIZED_NAME_PLATFORM_NOT_IN)
    private List<UserRolePlatform> platformNotIn = null;

    public static final String SERIALIZED_NAME_PRESET = "preset";

    @SerializedName(SERIALIZED_NAME_PRESET)
    private UserRolePreset preset;

    public static final String SERIALIZED_NAME_PRESET_IN = "preset_in";

    @SerializedName(SERIALIZED_NAME_PRESET_IN)
    private List<UserRolePreset> presetIn = null;

    public static final String SERIALIZED_NAME_PRESET_NOT = "preset_not";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT)
    private UserRolePreset presetNot;

    public static final String SERIALIZED_NAME_PRESET_NOT_IN = "preset_not_in";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_IN)
    private List<UserRolePreset> presetNotIn = null;

    public static final String SERIALIZED_NAME_USERS_EVERY = "users_every";

    @SerializedName(SERIALIZED_NAME_USERS_EVERY)
    private UserWhereInput usersEvery;

    public static final String SERIALIZED_NAME_USERS_NONE = "users_none";

    @SerializedName(SERIALIZED_NAME_USERS_NONE)
    private UserWhereInput usersNone;

    public static final String SERIALIZED_NAME_USERS_SOME = "users_some";

    @SerializedName(SERIALIZED_NAME_USERS_SOME)
    private UserWhereInput usersSome;

    public UserRoleNextWhereInput() {}

    public UserRoleNextWhereInput AND(List<UserRoleNextWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public UserRoleNextWhereInput addANDItem(UserRoleNextWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<UserRoleNextWhereInput>();
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
    public List<UserRoleNextWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<UserRoleNextWhereInput> AND) {
        this.AND = AND;
    }

    public UserRoleNextWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public UserRoleNextWhereInput AND_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput NOT(List<UserRoleNextWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public UserRoleNextWhereInput addNOTItem(UserRoleNextWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<UserRoleNextWhereInput>();
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
    public List<UserRoleNextWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<UserRoleNextWhereInput> NOT) {
        this.NOT = NOT;
    }

    public UserRoleNextWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public UserRoleNextWhereInput NOT_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput OR(List<UserRoleNextWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public UserRoleNextWhereInput addORItem(UserRoleNextWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<UserRoleNextWhereInput>();
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
    public List<UserRoleNextWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<UserRoleNextWhereInput> OR) {
        this.OR = OR;
    }

    public UserRoleNextWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public UserRoleNextWhereInput OR_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput id(String id) {

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

    public UserRoleNextWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public UserRoleNextWhereInput id_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idContains(String idContains) {

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

    public UserRoleNextWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public UserRoleNextWhereInput idContains_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idEndsWith(String idEndsWith) {

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

    public UserRoleNextWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public UserRoleNextWhereInput idEndsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idGt(String idGt) {

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

    public UserRoleNextWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public UserRoleNextWhereInput idGt_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idGte(String idGte) {

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

    public UserRoleNextWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public UserRoleNextWhereInput idGte_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public UserRoleNextWhereInput addIdInItem(String idInItem) {
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

    public UserRoleNextWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public UserRoleNextWhereInput idIn_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idLt(String idLt) {

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

    public UserRoleNextWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public UserRoleNextWhereInput idLt_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idLte(String idLte) {

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

    public UserRoleNextWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public UserRoleNextWhereInput idLte_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idNot(String idNot) {

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

    public UserRoleNextWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public UserRoleNextWhereInput idNot_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idNotContains(String idNotContains) {

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

    public UserRoleNextWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public UserRoleNextWhereInput idNotContains_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public UserRoleNextWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public UserRoleNextWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public UserRoleNextWhereInput addIdNotInItem(String idNotInItem) {
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

    public UserRoleNextWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public UserRoleNextWhereInput idNotIn_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public UserRoleNextWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public UserRoleNextWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput idStartsWith(String idStartsWith) {

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

    public UserRoleNextWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public UserRoleNextWhereInput idStartsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput name(String name) {

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

    public UserRoleNextWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public UserRoleNextWhereInput name_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameContains(String nameContains) {

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

    public UserRoleNextWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public UserRoleNextWhereInput nameContains_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameEndsWith(String nameEndsWith) {

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

    public UserRoleNextWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public UserRoleNextWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameGt(String nameGt) {

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

    public UserRoleNextWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public UserRoleNextWhereInput nameGt_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameGte(String nameGte) {

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

    public UserRoleNextWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public UserRoleNextWhereInput nameGte_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public UserRoleNextWhereInput addNameInItem(String nameInItem) {
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

    public UserRoleNextWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public UserRoleNextWhereInput nameIn_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameLt(String nameLt) {

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

    public UserRoleNextWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public UserRoleNextWhereInput nameLt_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameLte(String nameLte) {

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

    public UserRoleNextWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public UserRoleNextWhereInput nameLte_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameNot(String nameNot) {

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

    public UserRoleNextWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public UserRoleNextWhereInput nameNot_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameNotContains(String nameNotContains) {

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

    public UserRoleNextWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public UserRoleNextWhereInput nameNotContains_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public UserRoleNextWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public UserRoleNextWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public UserRoleNextWhereInput addNameNotInItem(String nameNotInItem) {
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

    public UserRoleNextWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public UserRoleNextWhereInput nameNotIn_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public UserRoleNextWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public UserRoleNextWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput nameStartsWith(String nameStartsWith) {

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

    public UserRoleNextWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public UserRoleNextWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public UserRoleNextWhereInput platform(UserRolePlatform platform) {

        this.platform = platform;
        return this;
    }

    /**
     * Get platform
     *
     * @return platform
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRolePlatform getPlatform() {
        return platform;
    }

    public void setPlatform(UserRolePlatform platform) {
        this.platform = platform;
    }

    public UserRoleNextWhereInput platform_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLATFORM);
        return this;
    }

    public UserRoleNextWhereInput platform_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLATFORM);
        return this;
    }

    public void setPlatform_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLATFORM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLATFORM);
        }
    }

    public boolean getPlatform_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLATFORM);
    }

    public UserRoleNextWhereInput platformIn(List<UserRolePlatform> platformIn) {

        this.platformIn = platformIn;
        return this;
    }

    public UserRoleNextWhereInput addPlatformInItem(UserRolePlatform platformInItem) {
        if (this.platformIn == null) {
            this.platformIn = new ArrayList<UserRolePlatform>();
        }
        this.platformIn.add(platformInItem);
        return this;
    }

    /**
     * Get platformIn
     *
     * @return platformIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRolePlatform> getPlatformIn() {
        return platformIn;
    }

    public void setPlatformIn(List<UserRolePlatform> platformIn) {
        this.platformIn = platformIn;
    }

    public UserRoleNextWhereInput platformIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLATFORM_IN);
        return this;
    }

    public UserRoleNextWhereInput platformIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_IN);
        return this;
    }

    public void setPlatformIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLATFORM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_IN);
        }
    }

    public boolean getPlatformIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLATFORM_IN);
    }

    public UserRoleNextWhereInput platformNot(UserRolePlatform platformNot) {

        this.platformNot = platformNot;
        return this;
    }

    /**
     * Get platformNot
     *
     * @return platformNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRolePlatform getPlatformNot() {
        return platformNot;
    }

    public void setPlatformNot(UserRolePlatform platformNot) {
        this.platformNot = platformNot;
    }

    public UserRoleNextWhereInput platformNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLATFORM_NOT);
        return this;
    }

    public UserRoleNextWhereInput platformNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_NOT);
        return this;
    }

    public void setPlatformNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLATFORM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_NOT);
        }
    }

    public boolean getPlatformNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLATFORM_NOT);
    }

    public UserRoleNextWhereInput platformNotIn(List<UserRolePlatform> platformNotIn) {

        this.platformNotIn = platformNotIn;
        return this;
    }

    public UserRoleNextWhereInput addPlatformNotInItem(UserRolePlatform platformNotInItem) {
        if (this.platformNotIn == null) {
            this.platformNotIn = new ArrayList<UserRolePlatform>();
        }
        this.platformNotIn.add(platformNotInItem);
        return this;
    }

    /**
     * Get platformNotIn
     *
     * @return platformNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRolePlatform> getPlatformNotIn() {
        return platformNotIn;
    }

    public void setPlatformNotIn(List<UserRolePlatform> platformNotIn) {
        this.platformNotIn = platformNotIn;
    }

    public UserRoleNextWhereInput platformNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLATFORM_NOT_IN);
        return this;
    }

    public UserRoleNextWhereInput platformNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_NOT_IN);
        return this;
    }

    public void setPlatformNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLATFORM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLATFORM_NOT_IN);
        }
    }

    public boolean getPlatformNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLATFORM_NOT_IN);
    }

    public UserRoleNextWhereInput preset(UserRolePreset preset) {

        this.preset = preset;
        return this;
    }

    /**
     * Get preset
     *
     * @return preset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRolePreset getPreset() {
        return preset;
    }

    public void setPreset(UserRolePreset preset) {
        this.preset = preset;
    }

    public UserRoleNextWhereInput preset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET);
        return this;
    }

    public UserRoleNextWhereInput preset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        return this;
    }

    public void setPreset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        }
    }

    public boolean getPreset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET);
    }

    public UserRoleNextWhereInput presetIn(List<UserRolePreset> presetIn) {

        this.presetIn = presetIn;
        return this;
    }

    public UserRoleNextWhereInput addPresetInItem(UserRolePreset presetInItem) {
        if (this.presetIn == null) {
            this.presetIn = new ArrayList<UserRolePreset>();
        }
        this.presetIn.add(presetInItem);
        return this;
    }

    /**
     * Get presetIn
     *
     * @return presetIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRolePreset> getPresetIn() {
        return presetIn;
    }

    public void setPresetIn(List<UserRolePreset> presetIn) {
        this.presetIn = presetIn;
    }

    public UserRoleNextWhereInput presetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public UserRoleNextWhereInput presetIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public void setPresetIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        }
    }

    public boolean getPresetIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_IN);
    }

    public UserRoleNextWhereInput presetNot(UserRolePreset presetNot) {

        this.presetNot = presetNot;
        return this;
    }

    /**
     * Get presetNot
     *
     * @return presetNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserRolePreset getPresetNot() {
        return presetNot;
    }

    public void setPresetNot(UserRolePreset presetNot) {
        this.presetNot = presetNot;
    }

    public UserRoleNextWhereInput presetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public UserRoleNextWhereInput presetNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public void setPresetNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        }
    }

    public boolean getPresetNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT);
    }

    public UserRoleNextWhereInput presetNotIn(List<UserRolePreset> presetNotIn) {

        this.presetNotIn = presetNotIn;
        return this;
    }

    public UserRoleNextWhereInput addPresetNotInItem(UserRolePreset presetNotInItem) {
        if (this.presetNotIn == null) {
            this.presetNotIn = new ArrayList<UserRolePreset>();
        }
        this.presetNotIn.add(presetNotInItem);
        return this;
    }

    /**
     * Get presetNotIn
     *
     * @return presetNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserRolePreset> getPresetNotIn() {
        return presetNotIn;
    }

    public void setPresetNotIn(List<UserRolePreset> presetNotIn) {
        this.presetNotIn = presetNotIn;
    }

    public UserRoleNextWhereInput presetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public UserRoleNextWhereInput presetNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public void setPresetNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        }
    }

    public boolean getPresetNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_IN);
    }

    public UserRoleNextWhereInput usersEvery(UserWhereInput usersEvery) {

        this.usersEvery = usersEvery;
        return this;
    }

    /**
     * Get usersEvery
     *
     * @return usersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUsersEvery() {
        return usersEvery;
    }

    public void setUsersEvery(UserWhereInput usersEvery) {
        this.usersEvery = usersEvery;
    }

    public UserRoleNextWhereInput usersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERS_EVERY);
        return this;
    }

    public UserRoleNextWhereInput usersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERS_EVERY);
        return this;
    }

    public void setUsersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERS_EVERY);
        }
    }

    public boolean getUsersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERS_EVERY);
    }

    public UserRoleNextWhereInput usersNone(UserWhereInput usersNone) {

        this.usersNone = usersNone;
        return this;
    }

    /**
     * Get usersNone
     *
     * @return usersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUsersNone() {
        return usersNone;
    }

    public void setUsersNone(UserWhereInput usersNone) {
        this.usersNone = usersNone;
    }

    public UserRoleNextWhereInput usersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERS_NONE);
        return this;
    }

    public UserRoleNextWhereInput usersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERS_NONE);
        return this;
    }

    public void setUsersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERS_NONE);
        }
    }

    public boolean getUsersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERS_NONE);
    }

    public UserRoleNextWhereInput usersSome(UserWhereInput usersSome) {

        this.usersSome = usersSome;
        return this;
    }

    /**
     * Get usersSome
     *
     * @return usersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUsersSome() {
        return usersSome;
    }

    public void setUsersSome(UserWhereInput usersSome) {
        this.usersSome = usersSome;
    }

    public UserRoleNextWhereInput usersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERS_SOME);
        return this;
    }

    public UserRoleNextWhereInput usersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERS_SOME);
        return this;
    }

    public void setUsersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERS_SOME);
        }
    }

    public boolean getUsersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRoleNextWhereInput userRoleNextWhereInput = (UserRoleNextWhereInput) o;
        return Objects.equals(this.AND, userRoleNextWhereInput.AND)
                && Objects.equals(this.NOT, userRoleNextWhereInput.NOT)
                && Objects.equals(this.OR, userRoleNextWhereInput.OR)
                && Objects.equals(this.id, userRoleNextWhereInput.id)
                && Objects.equals(this.idContains, userRoleNextWhereInput.idContains)
                && Objects.equals(this.idEndsWith, userRoleNextWhereInput.idEndsWith)
                && Objects.equals(this.idGt, userRoleNextWhereInput.idGt)
                && Objects.equals(this.idGte, userRoleNextWhereInput.idGte)
                && Objects.equals(this.idIn, userRoleNextWhereInput.idIn)
                && Objects.equals(this.idLt, userRoleNextWhereInput.idLt)
                && Objects.equals(this.idLte, userRoleNextWhereInput.idLte)
                && Objects.equals(this.idNot, userRoleNextWhereInput.idNot)
                && Objects.equals(this.idNotContains, userRoleNextWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, userRoleNextWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, userRoleNextWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, userRoleNextWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, userRoleNextWhereInput.idStartsWith)
                && Objects.equals(this.name, userRoleNextWhereInput.name)
                && Objects.equals(this.nameContains, userRoleNextWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, userRoleNextWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, userRoleNextWhereInput.nameGt)
                && Objects.equals(this.nameGte, userRoleNextWhereInput.nameGte)
                && Objects.equals(this.nameIn, userRoleNextWhereInput.nameIn)
                && Objects.equals(this.nameLt, userRoleNextWhereInput.nameLt)
                && Objects.equals(this.nameLte, userRoleNextWhereInput.nameLte)
                && Objects.equals(this.nameNot, userRoleNextWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, userRoleNextWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, userRoleNextWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, userRoleNextWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, userRoleNextWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, userRoleNextWhereInput.nameStartsWith)
                && Objects.equals(this.platform, userRoleNextWhereInput.platform)
                && Objects.equals(this.platformIn, userRoleNextWhereInput.platformIn)
                && Objects.equals(this.platformNot, userRoleNextWhereInput.platformNot)
                && Objects.equals(this.platformNotIn, userRoleNextWhereInput.platformNotIn)
                && Objects.equals(this.preset, userRoleNextWhereInput.preset)
                && Objects.equals(this.presetIn, userRoleNextWhereInput.presetIn)
                && Objects.equals(this.presetNot, userRoleNextWhereInput.presetNot)
                && Objects.equals(this.presetNotIn, userRoleNextWhereInput.presetNotIn)
                && Objects.equals(this.usersEvery, userRoleNextWhereInput.usersEvery)
                && Objects.equals(this.usersNone, userRoleNextWhereInput.usersNone)
                && Objects.equals(this.usersSome, userRoleNextWhereInput.usersSome);
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
                platform,
                platformIn,
                platformNot,
                platformNotIn,
                preset,
                presetIn,
                presetNot,
                presetNotIn,
                usersEvery,
                usersNone,
                usersSome);
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
        sb.append("class UserRoleNextWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    platformIn: ").append(toIndentedString(platformIn)).append("\n");
        sb.append("    platformNot: ").append(toIndentedString(platformNot)).append("\n");
        sb.append("    platformNotIn: ").append(toIndentedString(platformNotIn)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    presetIn: ").append(toIndentedString(presetIn)).append("\n");
        sb.append("    presetNot: ").append(toIndentedString(presetNot)).append("\n");
        sb.append("    presetNotIn: ").append(toIndentedString(presetNotIn)).append("\n");
        sb.append("    usersEvery: ").append(toIndentedString(usersEvery)).append("\n");
        sb.append("    usersNone: ").append(toIndentedString(usersNone)).append("\n");
        sb.append("    usersSome: ").append(toIndentedString(usersSome)).append("\n");
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
