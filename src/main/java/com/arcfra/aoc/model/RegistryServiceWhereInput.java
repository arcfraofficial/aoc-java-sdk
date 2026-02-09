package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** RegistryServiceWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RegistryServiceWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<RegistryServiceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<RegistryServiceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<RegistryServiceWhereInput> OR = null;

    public static final String SERIALIZED_NAME_APPLICATION = "application";

    @SerializedName(SERIALIZED_NAME_APPLICATION)
    private CloudTowerApplicationWhereInput application;

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

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

    @SerializedName(SERIALIZED_NAME_HOSTNAME)
    private String hostname;

    public static final String SERIALIZED_NAME_HOSTNAME_CONTAINS = "hostname_contains";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_CONTAINS)
    private String hostnameContains;

    public static final String SERIALIZED_NAME_HOSTNAME_ENDS_WITH = "hostname_ends_with";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_ENDS_WITH)
    private String hostnameEndsWith;

    public static final String SERIALIZED_NAME_HOSTNAME_GT = "hostname_gt";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_GT)
    private String hostnameGt;

    public static final String SERIALIZED_NAME_HOSTNAME_GTE = "hostname_gte";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_GTE)
    private String hostnameGte;

    public static final String SERIALIZED_NAME_HOSTNAME_IN = "hostname_in";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_IN)
    private List<String> hostnameIn = null;

    public static final String SERIALIZED_NAME_HOSTNAME_LT = "hostname_lt";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_LT)
    private String hostnameLt;

    public static final String SERIALIZED_NAME_HOSTNAME_LTE = "hostname_lte";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_LTE)
    private String hostnameLte;

    public static final String SERIALIZED_NAME_HOSTNAME_NOT = "hostname_not";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT)
    private String hostnameNot;

    public static final String SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS = "hostname_not_contains";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS)
    private String hostnameNotContains;

    public static final String SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH = "hostname_not_ends_with";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH)
    private String hostnameNotEndsWith;

    public static final String SERIALIZED_NAME_HOSTNAME_NOT_IN = "hostname_not_in";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_IN)
    private List<String> hostnameNotIn = null;

    public static final String SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH =
            "hostname_not_starts_with";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH)
    private String hostnameNotStartsWith;

    public static final String SERIALIZED_NAME_HOSTNAME_STARTS_WITH = "hostname_starts_with";

    @SerializedName(SERIALIZED_NAME_HOSTNAME_STARTS_WITH)
    private String hostnameStartsWith;

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

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private RegistryServiceUsage usage;

    public static final String SERIALIZED_NAME_USAGE_IN = "usage_in";

    @SerializedName(SERIALIZED_NAME_USAGE_IN)
    private List<RegistryServiceUsage> usageIn = null;

    public static final String SERIALIZED_NAME_USAGE_NOT = "usage_not";

    @SerializedName(SERIALIZED_NAME_USAGE_NOT)
    private RegistryServiceUsage usageNot;

    public static final String SERIALIZED_NAME_USAGE_NOT_IN = "usage_not_in";

    @SerializedName(SERIALIZED_NAME_USAGE_NOT_IN)
    private List<RegistryServiceUsage> usageNotIn = null;

    public RegistryServiceWhereInput() {}

    public RegistryServiceWhereInput AND(List<RegistryServiceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public RegistryServiceWhereInput addANDItem(RegistryServiceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<RegistryServiceWhereInput>();
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
    public List<RegistryServiceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<RegistryServiceWhereInput> AND) {
        this.AND = AND;
    }

    public RegistryServiceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public RegistryServiceWhereInput AND_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput NOT(List<RegistryServiceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public RegistryServiceWhereInput addNOTItem(RegistryServiceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<RegistryServiceWhereInput>();
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
    public List<RegistryServiceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<RegistryServiceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public RegistryServiceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public RegistryServiceWhereInput NOT_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput OR(List<RegistryServiceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public RegistryServiceWhereInput addORItem(RegistryServiceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<RegistryServiceWhereInput>();
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
    public List<RegistryServiceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<RegistryServiceWhereInput> OR) {
        this.OR = OR;
    }

    public RegistryServiceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public RegistryServiceWhereInput OR_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput application(CloudTowerApplicationWhereInput application) {

        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationWhereInput getApplication() {
        return application;
    }

    public void setApplication(CloudTowerApplicationWhereInput application) {
        this.application = application;
    }

    public RegistryServiceWhereInput application_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public RegistryServiceWhereInput application_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public void setApplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        }
    }

    public boolean getApplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION);
    }

    public RegistryServiceWhereInput description(String description) {

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

    public RegistryServiceWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public RegistryServiceWhereInput description_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionContains(String descriptionContains) {

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

    public RegistryServiceWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput descriptionContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public RegistryServiceWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionGt(String descriptionGt) {

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

    public RegistryServiceWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public RegistryServiceWhereInput descriptionGt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionGte(String descriptionGte) {

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

    public RegistryServiceWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public RegistryServiceWhereInput descriptionGte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public RegistryServiceWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public RegistryServiceWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public RegistryServiceWhereInput descriptionIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionLt(String descriptionLt) {

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

    public RegistryServiceWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public RegistryServiceWhereInput descriptionLt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionLte(String descriptionLte) {

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

    public RegistryServiceWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public RegistryServiceWhereInput descriptionLte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionNot(String descriptionNot) {

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

    public RegistryServiceWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public RegistryServiceWhereInput descriptionNot_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public RegistryServiceWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public RegistryServiceWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public RegistryServiceWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public RegistryServiceWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public RegistryServiceWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public RegistryServiceWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public RegistryServiceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public RegistryServiceWhereInput entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public RegistryServiceWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public RegistryServiceWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public RegistryServiceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public RegistryServiceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public RegistryServiceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public RegistryServiceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public RegistryServiceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public RegistryServiceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public RegistryServiceWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public RegistryServiceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public RegistryServiceWhereInput hostname(String hostname) {

        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public RegistryServiceWhereInput hostname_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public RegistryServiceWhereInput hostname_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public void setHostname_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        }
    }

    public boolean getHostname_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME);
    }

    public RegistryServiceWhereInput hostnameContains(String hostnameContains) {

        this.hostnameContains = hostnameContains;
        return this;
    }

    /**
     * Get hostnameContains
     *
     * @return hostnameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameContains() {
        return hostnameContains;
    }

    public void setHostnameContains(String hostnameContains) {
        this.hostnameContains = hostnameContains;
    }

    public RegistryServiceWhereInput hostnameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput hostnameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_CONTAINS);
        return this;
    }

    public void setHostnameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_CONTAINS);
        }
    }

    public boolean getHostnameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_CONTAINS);
    }

    public RegistryServiceWhereInput hostnameEndsWith(String hostnameEndsWith) {

        this.hostnameEndsWith = hostnameEndsWith;
        return this;
    }

    /**
     * Get hostnameEndsWith
     *
     * @return hostnameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameEndsWith() {
        return hostnameEndsWith;
    }

    public void setHostnameEndsWith(String hostnameEndsWith) {
        this.hostnameEndsWith = hostnameEndsWith;
    }

    public RegistryServiceWhereInput hostnameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput hostnameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_ENDS_WITH);
        return this;
    }

    public void setHostnameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_ENDS_WITH);
        }
    }

    public boolean getHostnameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_ENDS_WITH);
    }

    public RegistryServiceWhereInput hostnameGt(String hostnameGt) {

        this.hostnameGt = hostnameGt;
        return this;
    }

    /**
     * Get hostnameGt
     *
     * @return hostnameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameGt() {
        return hostnameGt;
    }

    public void setHostnameGt(String hostnameGt) {
        this.hostnameGt = hostnameGt;
    }

    public RegistryServiceWhereInput hostnameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_GT);
        return this;
    }

    public RegistryServiceWhereInput hostnameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_GT);
        return this;
    }

    public void setHostnameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_GT);
        }
    }

    public boolean getHostnameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_GT);
    }

    public RegistryServiceWhereInput hostnameGte(String hostnameGte) {

        this.hostnameGte = hostnameGte;
        return this;
    }

    /**
     * Get hostnameGte
     *
     * @return hostnameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameGte() {
        return hostnameGte;
    }

    public void setHostnameGte(String hostnameGte) {
        this.hostnameGte = hostnameGte;
    }

    public RegistryServiceWhereInput hostnameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_GTE);
        return this;
    }

    public RegistryServiceWhereInput hostnameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_GTE);
        return this;
    }

    public void setHostnameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_GTE);
        }
    }

    public boolean getHostnameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_GTE);
    }

    public RegistryServiceWhereInput hostnameIn(List<String> hostnameIn) {

        this.hostnameIn = hostnameIn;
        return this;
    }

    public RegistryServiceWhereInput addHostnameInItem(String hostnameInItem) {
        if (this.hostnameIn == null) {
            this.hostnameIn = new ArrayList<String>();
        }
        this.hostnameIn.add(hostnameInItem);
        return this;
    }

    /**
     * Get hostnameIn
     *
     * @return hostnameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostnameIn() {
        return hostnameIn;
    }

    public void setHostnameIn(List<String> hostnameIn) {
        this.hostnameIn = hostnameIn;
    }

    public RegistryServiceWhereInput hostnameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_IN);
        return this;
    }

    public RegistryServiceWhereInput hostnameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_IN);
        return this;
    }

    public void setHostnameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_IN);
        }
    }

    public boolean getHostnameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_IN);
    }

    public RegistryServiceWhereInput hostnameLt(String hostnameLt) {

        this.hostnameLt = hostnameLt;
        return this;
    }

    /**
     * Get hostnameLt
     *
     * @return hostnameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameLt() {
        return hostnameLt;
    }

    public void setHostnameLt(String hostnameLt) {
        this.hostnameLt = hostnameLt;
    }

    public RegistryServiceWhereInput hostnameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_LT);
        return this;
    }

    public RegistryServiceWhereInput hostnameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_LT);
        return this;
    }

    public void setHostnameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_LT);
        }
    }

    public boolean getHostnameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_LT);
    }

    public RegistryServiceWhereInput hostnameLte(String hostnameLte) {

        this.hostnameLte = hostnameLte;
        return this;
    }

    /**
     * Get hostnameLte
     *
     * @return hostnameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameLte() {
        return hostnameLte;
    }

    public void setHostnameLte(String hostnameLte) {
        this.hostnameLte = hostnameLte;
    }

    public RegistryServiceWhereInput hostnameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_LTE);
        return this;
    }

    public RegistryServiceWhereInput hostnameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_LTE);
        return this;
    }

    public void setHostnameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_LTE);
        }
    }

    public boolean getHostnameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_LTE);
    }

    public RegistryServiceWhereInput hostnameNot(String hostnameNot) {

        this.hostnameNot = hostnameNot;
        return this;
    }

    /**
     * Get hostnameNot
     *
     * @return hostnameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameNot() {
        return hostnameNot;
    }

    public void setHostnameNot(String hostnameNot) {
        this.hostnameNot = hostnameNot;
    }

    public RegistryServiceWhereInput hostnameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT);
        return this;
    }

    public RegistryServiceWhereInput hostnameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT);
        return this;
    }

    public void setHostnameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT);
        }
    }

    public boolean getHostnameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_NOT);
    }

    public RegistryServiceWhereInput hostnameNotContains(String hostnameNotContains) {

        this.hostnameNotContains = hostnameNotContains;
        return this;
    }

    /**
     * Get hostnameNotContains
     *
     * @return hostnameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameNotContains() {
        return hostnameNotContains;
    }

    public void setHostnameNotContains(String hostnameNotContains) {
        this.hostnameNotContains = hostnameNotContains;
    }

    public RegistryServiceWhereInput hostnameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput hostnameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS);
        return this;
    }

    public void setHostnameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS);
        }
    }

    public boolean getHostnameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS);
    }

    public RegistryServiceWhereInput hostnameNotEndsWith(String hostnameNotEndsWith) {

        this.hostnameNotEndsWith = hostnameNotEndsWith;
        return this;
    }

    /**
     * Get hostnameNotEndsWith
     *
     * @return hostnameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameNotEndsWith() {
        return hostnameNotEndsWith;
    }

    public void setHostnameNotEndsWith(String hostnameNotEndsWith) {
        this.hostnameNotEndsWith = hostnameNotEndsWith;
    }

    public RegistryServiceWhereInput hostnameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput hostnameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setHostnameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getHostnameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH);
    }

    public RegistryServiceWhereInput hostnameNotIn(List<String> hostnameNotIn) {

        this.hostnameNotIn = hostnameNotIn;
        return this;
    }

    public RegistryServiceWhereInput addHostnameNotInItem(String hostnameNotInItem) {
        if (this.hostnameNotIn == null) {
            this.hostnameNotIn = new ArrayList<String>();
        }
        this.hostnameNotIn.add(hostnameNotInItem);
        return this;
    }

    /**
     * Get hostnameNotIn
     *
     * @return hostnameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostnameNotIn() {
        return hostnameNotIn;
    }

    public void setHostnameNotIn(List<String> hostnameNotIn) {
        this.hostnameNotIn = hostnameNotIn;
    }

    public RegistryServiceWhereInput hostnameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput hostnameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_IN);
        return this;
    }

    public void setHostnameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_IN);
        }
    }

    public boolean getHostnameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_NOT_IN);
    }

    public RegistryServiceWhereInput hostnameNotStartsWith(String hostnameNotStartsWith) {

        this.hostnameNotStartsWith = hostnameNotStartsWith;
        return this;
    }

    /**
     * Get hostnameNotStartsWith
     *
     * @return hostnameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameNotStartsWith() {
        return hostnameNotStartsWith;
    }

    public void setHostnameNotStartsWith(String hostnameNotStartsWith) {
        this.hostnameNotStartsWith = hostnameNotStartsWith;
    }

    public RegistryServiceWhereInput hostnameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput hostnameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setHostnameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getHostnameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH);
    }

    public RegistryServiceWhereInput hostnameStartsWith(String hostnameStartsWith) {

        this.hostnameStartsWith = hostnameStartsWith;
        return this;
    }

    /**
     * Get hostnameStartsWith
     *
     * @return hostnameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostnameStartsWith() {
        return hostnameStartsWith;
    }

    public void setHostnameStartsWith(String hostnameStartsWith) {
        this.hostnameStartsWith = hostnameStartsWith;
    }

    public RegistryServiceWhereInput hostnameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput hostnameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_STARTS_WITH);
        return this;
    }

    public void setHostnameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME_STARTS_WITH);
        }
    }

    public boolean getHostnameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME_STARTS_WITH);
    }

    public RegistryServiceWhereInput id(String id) {

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

    public RegistryServiceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public RegistryServiceWhereInput id_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idContains(String idContains) {

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

    public RegistryServiceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput idContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idEndsWith(String idEndsWith) {

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

    public RegistryServiceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idGt(String idGt) {

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

    public RegistryServiceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public RegistryServiceWhereInput idGt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idGte(String idGte) {

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

    public RegistryServiceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public RegistryServiceWhereInput idGte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public RegistryServiceWhereInput addIdInItem(String idInItem) {
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

    public RegistryServiceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public RegistryServiceWhereInput idIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idLt(String idLt) {

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

    public RegistryServiceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public RegistryServiceWhereInput idLt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idLte(String idLte) {

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

    public RegistryServiceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public RegistryServiceWhereInput idLte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idNot(String idNot) {

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

    public RegistryServiceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public RegistryServiceWhereInput idNot_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idNotContains(String idNotContains) {

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

    public RegistryServiceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput idNotContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public RegistryServiceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public RegistryServiceWhereInput addIdNotInItem(String idNotInItem) {
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

    public RegistryServiceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput idNotIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public RegistryServiceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput idStartsWith(String idStartsWith) {

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

    public RegistryServiceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput name(String name) {

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

    public RegistryServiceWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RegistryServiceWhereInput name_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameContains(String nameContains) {

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

    public RegistryServiceWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput nameContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameEndsWith(String nameEndsWith) {

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

    public RegistryServiceWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameGt(String nameGt) {

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

    public RegistryServiceWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public RegistryServiceWhereInput nameGt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameGte(String nameGte) {

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

    public RegistryServiceWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public RegistryServiceWhereInput nameGte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public RegistryServiceWhereInput addNameInItem(String nameInItem) {
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

    public RegistryServiceWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public RegistryServiceWhereInput nameIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameLt(String nameLt) {

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

    public RegistryServiceWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public RegistryServiceWhereInput nameLt_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameLte(String nameLte) {

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

    public RegistryServiceWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public RegistryServiceWhereInput nameLte_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameNot(String nameNot) {

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

    public RegistryServiceWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public RegistryServiceWhereInput nameNot_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameNotContains(String nameNotContains) {

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

    public RegistryServiceWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public RegistryServiceWhereInput nameNotContains_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public RegistryServiceWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public RegistryServiceWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public RegistryServiceWhereInput addNameNotInItem(String nameNotInItem) {
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

    public RegistryServiceWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput nameNotIn_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public RegistryServiceWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput nameStartsWith(String nameStartsWith) {

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

    public RegistryServiceWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public RegistryServiceWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public RegistryServiceWhereInput usage(RegistryServiceUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public RegistryServiceUsage getUsage() {
        return usage;
    }

    public void setUsage(RegistryServiceUsage usage) {
        this.usage = usage;
    }

    public RegistryServiceWhereInput usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public RegistryServiceWhereInput usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    public RegistryServiceWhereInput usageIn(List<RegistryServiceUsage> usageIn) {

        this.usageIn = usageIn;
        return this;
    }

    public RegistryServiceWhereInput addUsageInItem(RegistryServiceUsage usageInItem) {
        if (this.usageIn == null) {
            this.usageIn = new ArrayList<RegistryServiceUsage>();
        }
        this.usageIn.add(usageInItem);
        return this;
    }

    /**
     * Get usageIn
     *
     * @return usageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<RegistryServiceUsage> getUsageIn() {
        return usageIn;
    }

    public void setUsageIn(List<RegistryServiceUsage> usageIn) {
        this.usageIn = usageIn;
    }

    public RegistryServiceWhereInput usageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_IN);
        return this;
    }

    public RegistryServiceWhereInput usageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_IN);
        return this;
    }

    public void setUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_IN);
        }
    }

    public boolean getUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_IN);
    }

    public RegistryServiceWhereInput usageNot(RegistryServiceUsage usageNot) {

        this.usageNot = usageNot;
        return this;
    }

    /**
     * Get usageNot
     *
     * @return usageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public RegistryServiceUsage getUsageNot() {
        return usageNot;
    }

    public void setUsageNot(RegistryServiceUsage usageNot) {
        this.usageNot = usageNot;
    }

    public RegistryServiceWhereInput usageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT);
        return this;
    }

    public RegistryServiceWhereInput usageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT);
        return this;
    }

    public void setUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT);
        }
    }

    public boolean getUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_NOT);
    }

    public RegistryServiceWhereInput usageNotIn(List<RegistryServiceUsage> usageNotIn) {

        this.usageNotIn = usageNotIn;
        return this;
    }

    public RegistryServiceWhereInput addUsageNotInItem(RegistryServiceUsage usageNotInItem) {
        if (this.usageNotIn == null) {
            this.usageNotIn = new ArrayList<RegistryServiceUsage>();
        }
        this.usageNotIn.add(usageNotInItem);
        return this;
    }

    /**
     * Get usageNotIn
     *
     * @return usageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<RegistryServiceUsage> getUsageNotIn() {
        return usageNotIn;
    }

    public void setUsageNotIn(List<RegistryServiceUsage> usageNotIn) {
        this.usageNotIn = usageNotIn;
    }

    public RegistryServiceWhereInput usageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT_IN);
        return this;
    }

    public RegistryServiceWhereInput usageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT_IN);
        return this;
    }

    public void setUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT_IN);
        }
    }

    public boolean getUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegistryServiceWhereInput registryServiceWhereInput = (RegistryServiceWhereInput) o;
        return Objects.equals(this.AND, registryServiceWhereInput.AND)
                && Objects.equals(this.NOT, registryServiceWhereInput.NOT)
                && Objects.equals(this.OR, registryServiceWhereInput.OR)
                && Objects.equals(this.application, registryServiceWhereInput.application)
                && Objects.equals(this.description, registryServiceWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, registryServiceWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, registryServiceWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, registryServiceWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, registryServiceWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, registryServiceWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, registryServiceWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, registryServiceWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, registryServiceWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        registryServiceWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        registryServiceWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, registryServiceWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        registryServiceWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, registryServiceWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, registryServiceWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, registryServiceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, registryServiceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        registryServiceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.hostname, registryServiceWhereInput.hostname)
                && Objects.equals(this.hostnameContains, registryServiceWhereInput.hostnameContains)
                && Objects.equals(this.hostnameEndsWith, registryServiceWhereInput.hostnameEndsWith)
                && Objects.equals(this.hostnameGt, registryServiceWhereInput.hostnameGt)
                && Objects.equals(this.hostnameGte, registryServiceWhereInput.hostnameGte)
                && Objects.equals(this.hostnameIn, registryServiceWhereInput.hostnameIn)
                && Objects.equals(this.hostnameLt, registryServiceWhereInput.hostnameLt)
                && Objects.equals(this.hostnameLte, registryServiceWhereInput.hostnameLte)
                && Objects.equals(this.hostnameNot, registryServiceWhereInput.hostnameNot)
                && Objects.equals(
                        this.hostnameNotContains, registryServiceWhereInput.hostnameNotContains)
                && Objects.equals(
                        this.hostnameNotEndsWith, registryServiceWhereInput.hostnameNotEndsWith)
                && Objects.equals(this.hostnameNotIn, registryServiceWhereInput.hostnameNotIn)
                && Objects.equals(
                        this.hostnameNotStartsWith, registryServiceWhereInput.hostnameNotStartsWith)
                && Objects.equals(
                        this.hostnameStartsWith, registryServiceWhereInput.hostnameStartsWith)
                && Objects.equals(this.id, registryServiceWhereInput.id)
                && Objects.equals(this.idContains, registryServiceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, registryServiceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, registryServiceWhereInput.idGt)
                && Objects.equals(this.idGte, registryServiceWhereInput.idGte)
                && Objects.equals(this.idIn, registryServiceWhereInput.idIn)
                && Objects.equals(this.idLt, registryServiceWhereInput.idLt)
                && Objects.equals(this.idLte, registryServiceWhereInput.idLte)
                && Objects.equals(this.idNot, registryServiceWhereInput.idNot)
                && Objects.equals(this.idNotContains, registryServiceWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, registryServiceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, registryServiceWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, registryServiceWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, registryServiceWhereInput.idStartsWith)
                && Objects.equals(this.name, registryServiceWhereInput.name)
                && Objects.equals(this.nameContains, registryServiceWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, registryServiceWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, registryServiceWhereInput.nameGt)
                && Objects.equals(this.nameGte, registryServiceWhereInput.nameGte)
                && Objects.equals(this.nameIn, registryServiceWhereInput.nameIn)
                && Objects.equals(this.nameLt, registryServiceWhereInput.nameLt)
                && Objects.equals(this.nameLte, registryServiceWhereInput.nameLte)
                && Objects.equals(this.nameNot, registryServiceWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, registryServiceWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, registryServiceWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, registryServiceWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, registryServiceWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, registryServiceWhereInput.nameStartsWith)
                && Objects.equals(this.usage, registryServiceWhereInput.usage)
                && Objects.equals(this.usageIn, registryServiceWhereInput.usageIn)
                && Objects.equals(this.usageNot, registryServiceWhereInput.usageNot)
                && Objects.equals(this.usageNotIn, registryServiceWhereInput.usageNotIn);
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
                application,
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                hostname,
                hostnameContains,
                hostnameEndsWith,
                hostnameGt,
                hostnameGte,
                hostnameIn,
                hostnameLt,
                hostnameLte,
                hostnameNot,
                hostnameNotContains,
                hostnameNotEndsWith,
                hostnameNotIn,
                hostnameNotStartsWith,
                hostnameStartsWith,
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
                usage,
                usageIn,
                usageNot,
                usageNotIn);
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
        sb.append("class RegistryServiceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    hostnameContains: ").append(toIndentedString(hostnameContains)).append("\n");
        sb.append("    hostnameEndsWith: ").append(toIndentedString(hostnameEndsWith)).append("\n");
        sb.append("    hostnameGt: ").append(toIndentedString(hostnameGt)).append("\n");
        sb.append("    hostnameGte: ").append(toIndentedString(hostnameGte)).append("\n");
        sb.append("    hostnameIn: ").append(toIndentedString(hostnameIn)).append("\n");
        sb.append("    hostnameLt: ").append(toIndentedString(hostnameLt)).append("\n");
        sb.append("    hostnameLte: ").append(toIndentedString(hostnameLte)).append("\n");
        sb.append("    hostnameNot: ").append(toIndentedString(hostnameNot)).append("\n");
        sb.append("    hostnameNotContains: ")
                .append(toIndentedString(hostnameNotContains))
                .append("\n");
        sb.append("    hostnameNotEndsWith: ")
                .append(toIndentedString(hostnameNotEndsWith))
                .append("\n");
        sb.append("    hostnameNotIn: ").append(toIndentedString(hostnameNotIn)).append("\n");
        sb.append("    hostnameNotStartsWith: ")
                .append(toIndentedString(hostnameNotStartsWith))
                .append("\n");
        sb.append("    hostnameStartsWith: ")
                .append(toIndentedString(hostnameStartsWith))
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
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageIn: ").append(toIndentedString(usageIn)).append("\n");
        sb.append("    usageNot: ").append(toIndentedString(usageNot)).append("\n");
        sb.append("    usageNotIn: ").append(toIndentedString(usageNotIn)).append("\n");
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
