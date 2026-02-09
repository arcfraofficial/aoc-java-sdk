package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CloudTowerApplicationWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudTowerApplicationWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<CloudTowerApplicationWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<CloudTowerApplicationWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<CloudTowerApplicationWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_PACKAGE = "package";

    @SerializedName(SERIALIZED_NAME_PACKAGE)
    private CloudTowerApplicationPackageWhereInput _package;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION = "placementSituation";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION)
    private String placementSituation;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS =
            "placementSituation_contains";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS)
    private String placementSituationContains;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH =
            "placementSituation_ends_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH)
    private String placementSituationEndsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_GT = "placementSituation_gt";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_GT)
    private String placementSituationGt;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_GTE = "placementSituation_gte";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE)
    private String placementSituationGte;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_IN = "placementSituation_in";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_IN)
    private List<String> placementSituationIn = null;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_LT = "placementSituation_lt";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_LT)
    private String placementSituationLt;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_LTE = "placementSituation_lte";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE)
    private String placementSituationLte;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_NOT = "placementSituation_not";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT)
    private String placementSituationNot;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS =
            "placementSituation_not_contains";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS)
    private String placementSituationNotContains;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH =
            "placementSituation_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH)
    private String placementSituationNotEndsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN =
            "placementSituation_not_in";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN)
    private List<String> placementSituationNotIn = null;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH =
            "placementSituation_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH)
    private String placementSituationNotStartsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH =
            "placementSituation_starts_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH)
    private String placementSituationStartsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB = "placementVerb";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB)
    private String placementVerb;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS = "placementVerb_contains";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS)
    private String placementVerbContains;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH = "placementVerb_ends_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH)
    private String placementVerbEndsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_GT = "placementVerb_gt";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_GT)
    private String placementVerbGt;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_GTE = "placementVerb_gte";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_GTE)
    private String placementVerbGte;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_IN = "placementVerb_in";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_IN)
    private List<String> placementVerbIn = null;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_LT = "placementVerb_lt";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_LT)
    private String placementVerbLt;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_LTE = "placementVerb_lte";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_LTE)
    private String placementVerbLte;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_NOT = "placementVerb_not";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_NOT)
    private String placementVerbNot;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS =
            "placementVerb_not_contains";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS)
    private String placementVerbNotContains;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH =
            "placementVerb_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH)
    private String placementVerbNotEndsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN = "placementVerb_not_in";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN)
    private List<String> placementVerbNotIn = null;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH =
            "placementVerb_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH)
    private String placementVerbNotStartsWith;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH =
            "placementVerb_starts_with";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH)
    private String placementVerbStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GT = "resourceVersion_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GT)
    private Integer resourceVersionGt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GTE = "resourceVersion_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GTE)
    private Integer resourceVersionGte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_IN = "resourceVersion_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_IN)
    private List<Integer> resourceVersionIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LT = "resourceVersion_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LT)
    private Integer resourceVersionLt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LTE = "resourceVersion_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LTE)
    private Integer resourceVersionLte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT = "resourceVersion_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT)
    private Integer resourceVersionNot;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN = "resourceVersion_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN)
    private List<Integer> resourceVersionNotIn = null;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private CloudTowerApplicationState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<CloudTowerApplicationState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private CloudTowerApplicationState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<CloudTowerApplicationState> stateNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
    private String targetPackage;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS = "targetPackage_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS)
    private String targetPackageContains;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH = "targetPackage_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH)
    private String targetPackageEndsWith;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_GT = "targetPackage_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_GT)
    private String targetPackageGt;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_GTE = "targetPackage_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_GTE)
    private String targetPackageGte;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_IN = "targetPackage_in";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_IN)
    private List<String> targetPackageIn = null;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_LT = "targetPackage_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_LT)
    private String targetPackageLt;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_LTE = "targetPackage_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_LTE)
    private String targetPackageLte;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_NOT = "targetPackage_not";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_NOT)
    private String targetPackageNot;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS =
            "targetPackage_not_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS)
    private String targetPackageNotContains;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH =
            "targetPackage_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH)
    private String targetPackageNotEndsWith;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN = "targetPackage_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN)
    private List<String> targetPackageNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH =
            "targetPackage_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH)
    private String targetPackageNotStartsWith;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH =
            "targetPackage_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH)
    private String targetPackageStartsWith;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private UserWhereInput user;

    public CloudTowerApplicationWhereInput() {}

    public CloudTowerApplicationWhereInput AND(List<CloudTowerApplicationWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public CloudTowerApplicationWhereInput addANDItem(CloudTowerApplicationWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<CloudTowerApplicationWhereInput>();
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
    public List<CloudTowerApplicationWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<CloudTowerApplicationWhereInput> AND) {
        this.AND = AND;
    }

    public CloudTowerApplicationWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public CloudTowerApplicationWhereInput AND_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput NOT(List<CloudTowerApplicationWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public CloudTowerApplicationWhereInput addNOTItem(CloudTowerApplicationWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<CloudTowerApplicationWhereInput>();
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
    public List<CloudTowerApplicationWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<CloudTowerApplicationWhereInput> NOT) {
        this.NOT = NOT;
    }

    public CloudTowerApplicationWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public CloudTowerApplicationWhereInput NOT_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput OR(List<CloudTowerApplicationWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public CloudTowerApplicationWhereInput addORItem(CloudTowerApplicationWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<CloudTowerApplicationWhereInput>();
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
    public List<CloudTowerApplicationWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<CloudTowerApplicationWhereInput> OR) {
        this.OR = OR;
    }

    public CloudTowerApplicationWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public CloudTowerApplicationWhereInput OR_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public CloudTowerApplicationWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public CloudTowerApplicationWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addEntityAsyncStatusInItem(
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

    public CloudTowerApplicationWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput entityAsyncStatusNot(
            EntityAsyncStatus entityAsyncStatusNot) {

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

    public CloudTowerApplicationWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addEntityAsyncStatusNotInItem(
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

    public CloudTowerApplicationWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput id(String id) {

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

    public CloudTowerApplicationWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public CloudTowerApplicationWhereInput id_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idContains(String idContains) {

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

    public CloudTowerApplicationWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput idContains_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idEndsWith(String idEndsWith) {

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

    public CloudTowerApplicationWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput idEndsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idGt(String idGt) {

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

    public CloudTowerApplicationWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput idGt_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idGte(String idGte) {

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

    public CloudTowerApplicationWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput idGte_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addIdInItem(String idInItem) {
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

    public CloudTowerApplicationWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput idIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idLt(String idLt) {

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

    public CloudTowerApplicationWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput idLt_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idLte(String idLte) {

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

    public CloudTowerApplicationWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput idLte_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idNot(String idNot) {

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

    public CloudTowerApplicationWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput idNot_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idNotContains(String idNotContains) {

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

    public CloudTowerApplicationWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput idNotContains_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public CloudTowerApplicationWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addIdNotInItem(String idNotInItem) {
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

    public CloudTowerApplicationWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput idNotIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public CloudTowerApplicationWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput idStartsWith(String idStartsWith) {

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

    public CloudTowerApplicationWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput idStartsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput name(String name) {

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

    public CloudTowerApplicationWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public CloudTowerApplicationWhereInput name_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameContains(String nameContains) {

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

    public CloudTowerApplicationWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput nameContains_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameEndsWith(String nameEndsWith) {

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

    public CloudTowerApplicationWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameGt(String nameGt) {

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

    public CloudTowerApplicationWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput nameGt_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameGte(String nameGte) {

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

    public CloudTowerApplicationWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput nameGte_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addNameInItem(String nameInItem) {
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

    public CloudTowerApplicationWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput nameIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameLt(String nameLt) {

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

    public CloudTowerApplicationWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput nameLt_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameLte(String nameLte) {

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

    public CloudTowerApplicationWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput nameLte_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameNot(String nameNot) {

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

    public CloudTowerApplicationWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput nameNot_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameNotContains(String nameNotContains) {

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

    public CloudTowerApplicationWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput nameNotContains_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public CloudTowerApplicationWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addNameNotInItem(String nameNotInItem) {
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

    public CloudTowerApplicationWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput nameNotIn_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public CloudTowerApplicationWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput nameStartsWith(String nameStartsWith) {

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

    public CloudTowerApplicationWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public CloudTowerApplicationWhereInput _package(
            CloudTowerApplicationPackageWhereInput _package) {

        this._package = _package;
        return this;
    }

    /**
     * Get _package
     *
     * @return _package
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationPackageWhereInput getPackage() {
        return _package;
    }

    public void setPackage(CloudTowerApplicationPackageWhereInput _package) {
        this._package = _package;
    }

    public CloudTowerApplicationWhereInput _package_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PACKAGE);
        return this;
    }

    public CloudTowerApplicationWhereInput _package_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PACKAGE);
        return this;
    }

    public void setPackage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PACKAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PACKAGE);
        }
    }

    public boolean getPackage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PACKAGE);
    }

    public CloudTowerApplicationWhereInput placementSituation(String placementSituation) {

        this.placementSituation = placementSituation;
        return this;
    }

    /**
     * Get placementSituation
     *
     * @return placementSituation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituation() {
        return placementSituation;
    }

    public void setPlacementSituation(String placementSituation) {
        this.placementSituation = placementSituation;
    }

    public CloudTowerApplicationWhereInput placementSituation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION);
        return this;
    }

    public void setPlacementSituation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION);
        }
    }

    public boolean getPlacementSituation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION);
    }

    public CloudTowerApplicationWhereInput placementSituationContains(
            String placementSituationContains) {

        this.placementSituationContains = placementSituationContains;
        return this;
    }

    /**
     * Get placementSituationContains
     *
     * @return placementSituationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationContains() {
        return placementSituationContains;
    }

    public void setPlacementSituationContains(String placementSituationContains) {
        this.placementSituationContains = placementSituationContains;
    }

    public CloudTowerApplicationWhereInput placementSituationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS);
        return this;
    }

    public void setPlacementSituationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS);
        }
    }

    public boolean getPlacementSituationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_CONTAINS);
    }

    public CloudTowerApplicationWhereInput placementSituationEndsWith(
            String placementSituationEndsWith) {

        this.placementSituationEndsWith = placementSituationEndsWith;
        return this;
    }

    /**
     * Get placementSituationEndsWith
     *
     * @return placementSituationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationEndsWith() {
        return placementSituationEndsWith;
    }

    public void setPlacementSituationEndsWith(String placementSituationEndsWith) {
        this.placementSituationEndsWith = placementSituationEndsWith;
    }

    public CloudTowerApplicationWhereInput placementSituationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH);
        return this;
    }

    public void setPlacementSituationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH);
        }
    }

    public boolean getPlacementSituationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput placementSituationGt(String placementSituationGt) {

        this.placementSituationGt = placementSituationGt;
        return this;
    }

    /**
     * Get placementSituationGt
     *
     * @return placementSituationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationGt() {
        return placementSituationGt;
    }

    public void setPlacementSituationGt(String placementSituationGt) {
        this.placementSituationGt = placementSituationGt;
    }

    public CloudTowerApplicationWhereInput placementSituationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_GT);
        return this;
    }

    public void setPlacementSituationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_GT);
        }
    }

    public boolean getPlacementSituationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_GT);
    }

    public CloudTowerApplicationWhereInput placementSituationGte(String placementSituationGte) {

        this.placementSituationGte = placementSituationGte;
        return this;
    }

    /**
     * Get placementSituationGte
     *
     * @return placementSituationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationGte() {
        return placementSituationGte;
    }

    public void setPlacementSituationGte(String placementSituationGte) {
        this.placementSituationGte = placementSituationGte;
    }

    public CloudTowerApplicationWhereInput placementSituationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE);
        return this;
    }

    public void setPlacementSituationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE);
        }
    }

    public boolean getPlacementSituationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_GTE);
    }

    public CloudTowerApplicationWhereInput placementSituationIn(List<String> placementSituationIn) {

        this.placementSituationIn = placementSituationIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addPlacementSituationInItem(
            String placementSituationInItem) {
        if (this.placementSituationIn == null) {
            this.placementSituationIn = new ArrayList<String>();
        }
        this.placementSituationIn.add(placementSituationInItem);
        return this;
    }

    /**
     * Get placementSituationIn
     *
     * @return placementSituationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlacementSituationIn() {
        return placementSituationIn;
    }

    public void setPlacementSituationIn(List<String> placementSituationIn) {
        this.placementSituationIn = placementSituationIn;
    }

    public CloudTowerApplicationWhereInput placementSituationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_IN);
        return this;
    }

    public void setPlacementSituationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_IN);
        }
    }

    public boolean getPlacementSituationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_IN);
    }

    public CloudTowerApplicationWhereInput placementSituationLt(String placementSituationLt) {

        this.placementSituationLt = placementSituationLt;
        return this;
    }

    /**
     * Get placementSituationLt
     *
     * @return placementSituationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationLt() {
        return placementSituationLt;
    }

    public void setPlacementSituationLt(String placementSituationLt) {
        this.placementSituationLt = placementSituationLt;
    }

    public CloudTowerApplicationWhereInput placementSituationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_LT);
        return this;
    }

    public void setPlacementSituationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_LT);
        }
    }

    public boolean getPlacementSituationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_LT);
    }

    public CloudTowerApplicationWhereInput placementSituationLte(String placementSituationLte) {

        this.placementSituationLte = placementSituationLte;
        return this;
    }

    /**
     * Get placementSituationLte
     *
     * @return placementSituationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationLte() {
        return placementSituationLte;
    }

    public void setPlacementSituationLte(String placementSituationLte) {
        this.placementSituationLte = placementSituationLte;
    }

    public CloudTowerApplicationWhereInput placementSituationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE);
        return this;
    }

    public void setPlacementSituationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE);
        }
    }

    public boolean getPlacementSituationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_LTE);
    }

    public CloudTowerApplicationWhereInput placementSituationNot(String placementSituationNot) {

        this.placementSituationNot = placementSituationNot;
        return this;
    }

    /**
     * Get placementSituationNot
     *
     * @return placementSituationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationNot() {
        return placementSituationNot;
    }

    public void setPlacementSituationNot(String placementSituationNot) {
        this.placementSituationNot = placementSituationNot;
    }

    public CloudTowerApplicationWhereInput placementSituationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT);
        return this;
    }

    public void setPlacementSituationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT);
        }
    }

    public boolean getPlacementSituationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT);
    }

    public CloudTowerApplicationWhereInput placementSituationNotContains(
            String placementSituationNotContains) {

        this.placementSituationNotContains = placementSituationNotContains;
        return this;
    }

    /**
     * Get placementSituationNotContains
     *
     * @return placementSituationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationNotContains() {
        return placementSituationNotContains;
    }

    public void setPlacementSituationNotContains(String placementSituationNotContains) {
        this.placementSituationNotContains = placementSituationNotContains;
    }

    public CloudTowerApplicationWhereInput placementSituationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS);
        return this;
    }

    public void setPlacementSituationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS);
        }
    }

    public boolean getPlacementSituationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_CONTAINS);
    }

    public CloudTowerApplicationWhereInput placementSituationNotEndsWith(
            String placementSituationNotEndsWith) {

        this.placementSituationNotEndsWith = placementSituationNotEndsWith;
        return this;
    }

    /**
     * Get placementSituationNotEndsWith
     *
     * @return placementSituationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationNotEndsWith() {
        return placementSituationNotEndsWith;
    }

    public void setPlacementSituationNotEndsWith(String placementSituationNotEndsWith) {
        this.placementSituationNotEndsWith = placementSituationNotEndsWith;
    }

    public CloudTowerApplicationWhereInput placementSituationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH);
        return this;
    }

    public void setPlacementSituationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH);
        }
    }

    public boolean getPlacementSituationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput placementSituationNotIn(
            List<String> placementSituationNotIn) {

        this.placementSituationNotIn = placementSituationNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addPlacementSituationNotInItem(
            String placementSituationNotInItem) {
        if (this.placementSituationNotIn == null) {
            this.placementSituationNotIn = new ArrayList<String>();
        }
        this.placementSituationNotIn.add(placementSituationNotInItem);
        return this;
    }

    /**
     * Get placementSituationNotIn
     *
     * @return placementSituationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlacementSituationNotIn() {
        return placementSituationNotIn;
    }

    public void setPlacementSituationNotIn(List<String> placementSituationNotIn) {
        this.placementSituationNotIn = placementSituationNotIn;
    }

    public CloudTowerApplicationWhereInput placementSituationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN);
        return this;
    }

    public void setPlacementSituationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN);
        }
    }

    public boolean getPlacementSituationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_IN);
    }

    public CloudTowerApplicationWhereInput placementSituationNotStartsWith(
            String placementSituationNotStartsWith) {

        this.placementSituationNotStartsWith = placementSituationNotStartsWith;
        return this;
    }

    /**
     * Get placementSituationNotStartsWith
     *
     * @return placementSituationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationNotStartsWith() {
        return placementSituationNotStartsWith;
    }

    public void setPlacementSituationNotStartsWith(String placementSituationNotStartsWith) {
        this.placementSituationNotStartsWith = placementSituationNotStartsWith;
    }

    public CloudTowerApplicationWhereInput placementSituationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH);
        return this;
    }

    public void setPlacementSituationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH);
        }
    }

    public boolean getPlacementSituationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_NOT_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput placementSituationStartsWith(
            String placementSituationStartsWith) {

        this.placementSituationStartsWith = placementSituationStartsWith;
        return this;
    }

    /**
     * Get placementSituationStartsWith
     *
     * @return placementSituationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituationStartsWith() {
        return placementSituationStartsWith;
    }

    public void setPlacementSituationStartsWith(String placementSituationStartsWith) {
        this.placementSituationStartsWith = placementSituationStartsWith;
    }

    public CloudTowerApplicationWhereInput placementSituationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementSituationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH);
        return this;
    }

    public void setPlacementSituationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH);
        }
    }

    public boolean getPlacementSituationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput placementVerb(String placementVerb) {

        this.placementVerb = placementVerb;
        return this;
    }

    /**
     * Get placementVerb
     *
     * @return placementVerb
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerb() {
        return placementVerb;
    }

    public void setPlacementVerb(String placementVerb) {
        this.placementVerb = placementVerb;
    }

    public CloudTowerApplicationWhereInput placementVerb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerb_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB);
        return this;
    }

    public void setPlacementVerb_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB);
        }
    }

    public boolean getPlacementVerb_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB);
    }

    public CloudTowerApplicationWhereInput placementVerbContains(String placementVerbContains) {

        this.placementVerbContains = placementVerbContains;
        return this;
    }

    /**
     * Get placementVerbContains
     *
     * @return placementVerbContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbContains() {
        return placementVerbContains;
    }

    public void setPlacementVerbContains(String placementVerbContains) {
        this.placementVerbContains = placementVerbContains;
    }

    public CloudTowerApplicationWhereInput placementVerbContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS);
        return this;
    }

    public void setPlacementVerbContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS);
        }
    }

    public boolean getPlacementVerbContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_CONTAINS);
    }

    public CloudTowerApplicationWhereInput placementVerbEndsWith(String placementVerbEndsWith) {

        this.placementVerbEndsWith = placementVerbEndsWith;
        return this;
    }

    /**
     * Get placementVerbEndsWith
     *
     * @return placementVerbEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbEndsWith() {
        return placementVerbEndsWith;
    }

    public void setPlacementVerbEndsWith(String placementVerbEndsWith) {
        this.placementVerbEndsWith = placementVerbEndsWith;
    }

    public CloudTowerApplicationWhereInput placementVerbEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH);
        return this;
    }

    public void setPlacementVerbEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH);
        }
    }

    public boolean getPlacementVerbEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput placementVerbGt(String placementVerbGt) {

        this.placementVerbGt = placementVerbGt;
        return this;
    }

    /**
     * Get placementVerbGt
     *
     * @return placementVerbGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbGt() {
        return placementVerbGt;
    }

    public void setPlacementVerbGt(String placementVerbGt) {
        this.placementVerbGt = placementVerbGt;
    }

    public CloudTowerApplicationWhereInput placementVerbGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_GT);
        return this;
    }

    public void setPlacementVerbGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_GT);
        }
    }

    public boolean getPlacementVerbGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_GT);
    }

    public CloudTowerApplicationWhereInput placementVerbGte(String placementVerbGte) {

        this.placementVerbGte = placementVerbGte;
        return this;
    }

    /**
     * Get placementVerbGte
     *
     * @return placementVerbGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbGte() {
        return placementVerbGte;
    }

    public void setPlacementVerbGte(String placementVerbGte) {
        this.placementVerbGte = placementVerbGte;
    }

    public CloudTowerApplicationWhereInput placementVerbGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_GTE);
        return this;
    }

    public void setPlacementVerbGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_GTE);
        }
    }

    public boolean getPlacementVerbGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_GTE);
    }

    public CloudTowerApplicationWhereInput placementVerbIn(List<String> placementVerbIn) {

        this.placementVerbIn = placementVerbIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addPlacementVerbInItem(String placementVerbInItem) {
        if (this.placementVerbIn == null) {
            this.placementVerbIn = new ArrayList<String>();
        }
        this.placementVerbIn.add(placementVerbInItem);
        return this;
    }

    /**
     * Get placementVerbIn
     *
     * @return placementVerbIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlacementVerbIn() {
        return placementVerbIn;
    }

    public void setPlacementVerbIn(List<String> placementVerbIn) {
        this.placementVerbIn = placementVerbIn;
    }

    public CloudTowerApplicationWhereInput placementVerbIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_IN);
        return this;
    }

    public void setPlacementVerbIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_IN);
        }
    }

    public boolean getPlacementVerbIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_IN);
    }

    public CloudTowerApplicationWhereInput placementVerbLt(String placementVerbLt) {

        this.placementVerbLt = placementVerbLt;
        return this;
    }

    /**
     * Get placementVerbLt
     *
     * @return placementVerbLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbLt() {
        return placementVerbLt;
    }

    public void setPlacementVerbLt(String placementVerbLt) {
        this.placementVerbLt = placementVerbLt;
    }

    public CloudTowerApplicationWhereInput placementVerbLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_LT);
        return this;
    }

    public void setPlacementVerbLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_LT);
        }
    }

    public boolean getPlacementVerbLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_LT);
    }

    public CloudTowerApplicationWhereInput placementVerbLte(String placementVerbLte) {

        this.placementVerbLte = placementVerbLte;
        return this;
    }

    /**
     * Get placementVerbLte
     *
     * @return placementVerbLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbLte() {
        return placementVerbLte;
    }

    public void setPlacementVerbLte(String placementVerbLte) {
        this.placementVerbLte = placementVerbLte;
    }

    public CloudTowerApplicationWhereInput placementVerbLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_LTE);
        return this;
    }

    public void setPlacementVerbLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_LTE);
        }
    }

    public boolean getPlacementVerbLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_LTE);
    }

    public CloudTowerApplicationWhereInput placementVerbNot(String placementVerbNot) {

        this.placementVerbNot = placementVerbNot;
        return this;
    }

    /**
     * Get placementVerbNot
     *
     * @return placementVerbNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbNot() {
        return placementVerbNot;
    }

    public void setPlacementVerbNot(String placementVerbNot) {
        this.placementVerbNot = placementVerbNot;
    }

    public CloudTowerApplicationWhereInput placementVerbNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT);
        return this;
    }

    public void setPlacementVerbNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT);
        }
    }

    public boolean getPlacementVerbNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_NOT);
    }

    public CloudTowerApplicationWhereInput placementVerbNotContains(
            String placementVerbNotContains) {

        this.placementVerbNotContains = placementVerbNotContains;
        return this;
    }

    /**
     * Get placementVerbNotContains
     *
     * @return placementVerbNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbNotContains() {
        return placementVerbNotContains;
    }

    public void setPlacementVerbNotContains(String placementVerbNotContains) {
        this.placementVerbNotContains = placementVerbNotContains;
    }

    public CloudTowerApplicationWhereInput placementVerbNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS);
        return this;
    }

    public void setPlacementVerbNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS);
        }
    }

    public boolean getPlacementVerbNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_NOT_CONTAINS);
    }

    public CloudTowerApplicationWhereInput placementVerbNotEndsWith(
            String placementVerbNotEndsWith) {

        this.placementVerbNotEndsWith = placementVerbNotEndsWith;
        return this;
    }

    /**
     * Get placementVerbNotEndsWith
     *
     * @return placementVerbNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbNotEndsWith() {
        return placementVerbNotEndsWith;
    }

    public void setPlacementVerbNotEndsWith(String placementVerbNotEndsWith) {
        this.placementVerbNotEndsWith = placementVerbNotEndsWith;
    }

    public CloudTowerApplicationWhereInput placementVerbNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH);
        return this;
    }

    public void setPlacementVerbNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH);
        }
    }

    public boolean getPlacementVerbNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_NOT_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput placementVerbNotIn(List<String> placementVerbNotIn) {

        this.placementVerbNotIn = placementVerbNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addPlacementVerbNotInItem(
            String placementVerbNotInItem) {
        if (this.placementVerbNotIn == null) {
            this.placementVerbNotIn = new ArrayList<String>();
        }
        this.placementVerbNotIn.add(placementVerbNotInItem);
        return this;
    }

    /**
     * Get placementVerbNotIn
     *
     * @return placementVerbNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPlacementVerbNotIn() {
        return placementVerbNotIn;
    }

    public void setPlacementVerbNotIn(List<String> placementVerbNotIn) {
        this.placementVerbNotIn = placementVerbNotIn;
    }

    public CloudTowerApplicationWhereInput placementVerbNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN);
        return this;
    }

    public void setPlacementVerbNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN);
        }
    }

    public boolean getPlacementVerbNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_NOT_IN);
    }

    public CloudTowerApplicationWhereInput placementVerbNotStartsWith(
            String placementVerbNotStartsWith) {

        this.placementVerbNotStartsWith = placementVerbNotStartsWith;
        return this;
    }

    /**
     * Get placementVerbNotStartsWith
     *
     * @return placementVerbNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbNotStartsWith() {
        return placementVerbNotStartsWith;
    }

    public void setPlacementVerbNotStartsWith(String placementVerbNotStartsWith) {
        this.placementVerbNotStartsWith = placementVerbNotStartsWith;
    }

    public CloudTowerApplicationWhereInput placementVerbNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH);
        return this;
    }

    public void setPlacementVerbNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH);
        }
    }

    public boolean getPlacementVerbNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_NOT_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput placementVerbStartsWith(String placementVerbStartsWith) {

        this.placementVerbStartsWith = placementVerbStartsWith;
        return this;
    }

    /**
     * Get placementVerbStartsWith
     *
     * @return placementVerbStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerbStartsWith() {
        return placementVerbStartsWith;
    }

    public void setPlacementVerbStartsWith(String placementVerbStartsWith) {
        this.placementVerbStartsWith = placementVerbStartsWith;
    }

    public CloudTowerApplicationWhereInput placementVerbStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput placementVerbStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH);
        return this;
    }

    public void setPlacementVerbStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH);
        }
    }

    public boolean getPlacementVerbStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public CloudTowerApplicationWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public CloudTowerApplicationWhereInput resourceVersionGt(Integer resourceVersionGt) {

        this.resourceVersionGt = resourceVersionGt;
        return this;
    }

    /**
     * Get resourceVersionGt
     *
     * @return resourceVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGt() {
        return resourceVersionGt;
    }

    public void setResourceVersionGt(Integer resourceVersionGt) {
        this.resourceVersionGt = resourceVersionGt;
    }

    public CloudTowerApplicationWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public void setResourceVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        }
    }

    public boolean getResourceVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GT);
    }

    public CloudTowerApplicationWhereInput resourceVersionGte(Integer resourceVersionGte) {

        this.resourceVersionGte = resourceVersionGte;
        return this;
    }

    /**
     * Get resourceVersionGte
     *
     * @return resourceVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGte() {
        return resourceVersionGte;
    }

    public void setResourceVersionGte(Integer resourceVersionGte) {
        this.resourceVersionGte = resourceVersionGte;
    }

    public CloudTowerApplicationWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public void setResourceVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        }
    }

    public boolean getResourceVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
    }

    public CloudTowerApplicationWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addResourceVersionInItem(Integer resourceVersionInItem) {
        if (this.resourceVersionIn == null) {
            this.resourceVersionIn = new ArrayList<Integer>();
        }
        this.resourceVersionIn.add(resourceVersionInItem);
        return this;
    }

    /**
     * Get resourceVersionIn
     *
     * @return resourceVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionIn() {
        return resourceVersionIn;
    }

    public void setResourceVersionIn(List<Integer> resourceVersionIn) {
        this.resourceVersionIn = resourceVersionIn;
    }

    public CloudTowerApplicationWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public void setResourceVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        }
    }

    public boolean getResourceVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_IN);
    }

    public CloudTowerApplicationWhereInput resourceVersionLt(Integer resourceVersionLt) {

        this.resourceVersionLt = resourceVersionLt;
        return this;
    }

    /**
     * Get resourceVersionLt
     *
     * @return resourceVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLt() {
        return resourceVersionLt;
    }

    public void setResourceVersionLt(Integer resourceVersionLt) {
        this.resourceVersionLt = resourceVersionLt;
    }

    public CloudTowerApplicationWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public void setResourceVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        }
    }

    public boolean getResourceVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LT);
    }

    public CloudTowerApplicationWhereInput resourceVersionLte(Integer resourceVersionLte) {

        this.resourceVersionLte = resourceVersionLte;
        return this;
    }

    /**
     * Get resourceVersionLte
     *
     * @return resourceVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLte() {
        return resourceVersionLte;
    }

    public void setResourceVersionLte(Integer resourceVersionLte) {
        this.resourceVersionLte = resourceVersionLte;
    }

    public CloudTowerApplicationWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public void setResourceVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        }
    }

    public boolean getResourceVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
    }

    public CloudTowerApplicationWhereInput resourceVersionNot(Integer resourceVersionNot) {

        this.resourceVersionNot = resourceVersionNot;
        return this;
    }

    /**
     * Get resourceVersionNot
     *
     * @return resourceVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionNot() {
        return resourceVersionNot;
    }

    public void setResourceVersionNot(Integer resourceVersionNot) {
        this.resourceVersionNot = resourceVersionNot;
    }

    public CloudTowerApplicationWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public void setResourceVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        }
    }

    public boolean getResourceVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
    }

    public CloudTowerApplicationWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addResourceVersionNotInItem(
            Integer resourceVersionNotInItem) {
        if (this.resourceVersionNotIn == null) {
            this.resourceVersionNotIn = new ArrayList<Integer>();
        }
        this.resourceVersionNotIn.add(resourceVersionNotInItem);
        return this;
    }

    /**
     * Get resourceVersionNotIn
     *
     * @return resourceVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionNotIn() {
        return resourceVersionNotIn;
    }

    public void setResourceVersionNotIn(List<Integer> resourceVersionNotIn) {
        this.resourceVersionNotIn = resourceVersionNotIn;
    }

    public CloudTowerApplicationWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput resourceVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public void setResourceVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        }
    }

    public boolean getResourceVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
    }

    public CloudTowerApplicationWhereInput state(CloudTowerApplicationState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationState getState() {
        return state;
    }

    public void setState(CloudTowerApplicationState state) {
        this.state = state;
    }

    public CloudTowerApplicationWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public CloudTowerApplicationWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public CloudTowerApplicationWhereInput stateIn(List<CloudTowerApplicationState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addStateInItem(CloudTowerApplicationState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<CloudTowerApplicationState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<CloudTowerApplicationState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<CloudTowerApplicationState> stateIn) {
        this.stateIn = stateIn;
    }

    public CloudTowerApplicationWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public CloudTowerApplicationWhereInput stateNot(CloudTowerApplicationState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationState getStateNot() {
        return stateNot;
    }

    public void setStateNot(CloudTowerApplicationState stateNot) {
        this.stateNot = stateNot;
    }

    public CloudTowerApplicationWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public CloudTowerApplicationWhereInput stateNotIn(List<CloudTowerApplicationState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addStateNotInItem(
            CloudTowerApplicationState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<CloudTowerApplicationState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<CloudTowerApplicationState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<CloudTowerApplicationState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public CloudTowerApplicationWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    public CloudTowerApplicationWhereInput targetPackage(String targetPackage) {

        this.targetPackage = targetPackage;
        return this;
    }

    /**
     * Get targetPackage
     *
     * @return targetPackage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public CloudTowerApplicationWhereInput targetPackage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public void setTargetPackage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        }
    }

    public boolean getTargetPackage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE);
    }

    public CloudTowerApplicationWhereInput targetPackageContains(String targetPackageContains) {

        this.targetPackageContains = targetPackageContains;
        return this;
    }

    /**
     * Get targetPackageContains
     *
     * @return targetPackageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageContains() {
        return targetPackageContains;
    }

    public void setTargetPackageContains(String targetPackageContains) {
        this.targetPackageContains = targetPackageContains;
    }

    public CloudTowerApplicationWhereInput targetPackageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS);
        return this;
    }

    public void setTargetPackageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS);
        }
    }

    public boolean getTargetPackageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_CONTAINS);
    }

    public CloudTowerApplicationWhereInput targetPackageEndsWith(String targetPackageEndsWith) {

        this.targetPackageEndsWith = targetPackageEndsWith;
        return this;
    }

    /**
     * Get targetPackageEndsWith
     *
     * @return targetPackageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageEndsWith() {
        return targetPackageEndsWith;
    }

    public void setTargetPackageEndsWith(String targetPackageEndsWith) {
        this.targetPackageEndsWith = targetPackageEndsWith;
    }

    public CloudTowerApplicationWhereInput targetPackageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH);
        return this;
    }

    public void setTargetPackageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH);
        }
    }

    public boolean getTargetPackageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput targetPackageGt(String targetPackageGt) {

        this.targetPackageGt = targetPackageGt;
        return this;
    }

    /**
     * Get targetPackageGt
     *
     * @return targetPackageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageGt() {
        return targetPackageGt;
    }

    public void setTargetPackageGt(String targetPackageGt) {
        this.targetPackageGt = targetPackageGt;
    }

    public CloudTowerApplicationWhereInput targetPackageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_GT);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_GT);
        return this;
    }

    public void setTargetPackageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_GT);
        }
    }

    public boolean getTargetPackageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_GT);
    }

    public CloudTowerApplicationWhereInput targetPackageGte(String targetPackageGte) {

        this.targetPackageGte = targetPackageGte;
        return this;
    }

    /**
     * Get targetPackageGte
     *
     * @return targetPackageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageGte() {
        return targetPackageGte;
    }

    public void setTargetPackageGte(String targetPackageGte) {
        this.targetPackageGte = targetPackageGte;
    }

    public CloudTowerApplicationWhereInput targetPackageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_GTE);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_GTE);
        return this;
    }

    public void setTargetPackageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_GTE);
        }
    }

    public boolean getTargetPackageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_GTE);
    }

    public CloudTowerApplicationWhereInput targetPackageIn(List<String> targetPackageIn) {

        this.targetPackageIn = targetPackageIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addTargetPackageInItem(String targetPackageInItem) {
        if (this.targetPackageIn == null) {
            this.targetPackageIn = new ArrayList<String>();
        }
        this.targetPackageIn.add(targetPackageInItem);
        return this;
    }

    /**
     * Get targetPackageIn
     *
     * @return targetPackageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetPackageIn() {
        return targetPackageIn;
    }

    public void setTargetPackageIn(List<String> targetPackageIn) {
        this.targetPackageIn = targetPackageIn;
    }

    public CloudTowerApplicationWhereInput targetPackageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_IN);
        return this;
    }

    public void setTargetPackageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_IN);
        }
    }

    public boolean getTargetPackageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_IN);
    }

    public CloudTowerApplicationWhereInput targetPackageLt(String targetPackageLt) {

        this.targetPackageLt = targetPackageLt;
        return this;
    }

    /**
     * Get targetPackageLt
     *
     * @return targetPackageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageLt() {
        return targetPackageLt;
    }

    public void setTargetPackageLt(String targetPackageLt) {
        this.targetPackageLt = targetPackageLt;
    }

    public CloudTowerApplicationWhereInput targetPackageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_LT);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_LT);
        return this;
    }

    public void setTargetPackageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_LT);
        }
    }

    public boolean getTargetPackageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_LT);
    }

    public CloudTowerApplicationWhereInput targetPackageLte(String targetPackageLte) {

        this.targetPackageLte = targetPackageLte;
        return this;
    }

    /**
     * Get targetPackageLte
     *
     * @return targetPackageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageLte() {
        return targetPackageLte;
    }

    public void setTargetPackageLte(String targetPackageLte) {
        this.targetPackageLte = targetPackageLte;
    }

    public CloudTowerApplicationWhereInput targetPackageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_LTE);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_LTE);
        return this;
    }

    public void setTargetPackageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_LTE);
        }
    }

    public boolean getTargetPackageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_LTE);
    }

    public CloudTowerApplicationWhereInput targetPackageNot(String targetPackageNot) {

        this.targetPackageNot = targetPackageNot;
        return this;
    }

    /**
     * Get targetPackageNot
     *
     * @return targetPackageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageNot() {
        return targetPackageNot;
    }

    public void setTargetPackageNot(String targetPackageNot) {
        this.targetPackageNot = targetPackageNot;
    }

    public CloudTowerApplicationWhereInput targetPackageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT);
        return this;
    }

    public void setTargetPackageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT);
        }
    }

    public boolean getTargetPackageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_NOT);
    }

    public CloudTowerApplicationWhereInput targetPackageNotContains(
            String targetPackageNotContains) {

        this.targetPackageNotContains = targetPackageNotContains;
        return this;
    }

    /**
     * Get targetPackageNotContains
     *
     * @return targetPackageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageNotContains() {
        return targetPackageNotContains;
    }

    public void setTargetPackageNotContains(String targetPackageNotContains) {
        this.targetPackageNotContains = targetPackageNotContains;
    }

    public CloudTowerApplicationWhereInput targetPackageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS);
        return this;
    }

    public void setTargetPackageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS);
        }
    }

    public boolean getTargetPackageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_NOT_CONTAINS);
    }

    public CloudTowerApplicationWhereInput targetPackageNotEndsWith(
            String targetPackageNotEndsWith) {

        this.targetPackageNotEndsWith = targetPackageNotEndsWith;
        return this;
    }

    /**
     * Get targetPackageNotEndsWith
     *
     * @return targetPackageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageNotEndsWith() {
        return targetPackageNotEndsWith;
    }

    public void setTargetPackageNotEndsWith(String targetPackageNotEndsWith) {
        this.targetPackageNotEndsWith = targetPackageNotEndsWith;
    }

    public CloudTowerApplicationWhereInput targetPackageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setTargetPackageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getTargetPackageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_NOT_ENDS_WITH);
    }

    public CloudTowerApplicationWhereInput targetPackageNotIn(List<String> targetPackageNotIn) {

        this.targetPackageNotIn = targetPackageNotIn;
        return this;
    }

    public CloudTowerApplicationWhereInput addTargetPackageNotInItem(
            String targetPackageNotInItem) {
        if (this.targetPackageNotIn == null) {
            this.targetPackageNotIn = new ArrayList<String>();
        }
        this.targetPackageNotIn.add(targetPackageNotInItem);
        return this;
    }

    /**
     * Get targetPackageNotIn
     *
     * @return targetPackageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetPackageNotIn() {
        return targetPackageNotIn;
    }

    public void setTargetPackageNotIn(List<String> targetPackageNotIn) {
        this.targetPackageNotIn = targetPackageNotIn;
    }

    public CloudTowerApplicationWhereInput targetPackageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN);
        return this;
    }

    public void setTargetPackageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN);
        }
    }

    public boolean getTargetPackageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_NOT_IN);
    }

    public CloudTowerApplicationWhereInput targetPackageNotStartsWith(
            String targetPackageNotStartsWith) {

        this.targetPackageNotStartsWith = targetPackageNotStartsWith;
        return this;
    }

    /**
     * Get targetPackageNotStartsWith
     *
     * @return targetPackageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageNotStartsWith() {
        return targetPackageNotStartsWith;
    }

    public void setTargetPackageNotStartsWith(String targetPackageNotStartsWith) {
        this.targetPackageNotStartsWith = targetPackageNotStartsWith;
    }

    public CloudTowerApplicationWhereInput targetPackageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setTargetPackageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getTargetPackageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_NOT_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput targetPackageStartsWith(String targetPackageStartsWith) {

        this.targetPackageStartsWith = targetPackageStartsWith;
        return this;
    }

    /**
     * Get targetPackageStartsWith
     *
     * @return targetPackageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetPackageStartsWith() {
        return targetPackageStartsWith;
    }

    public void setTargetPackageStartsWith(String targetPackageStartsWith) {
        this.targetPackageStartsWith = targetPackageStartsWith;
    }

    public CloudTowerApplicationWhereInput targetPackageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH);
        return this;
    }

    public CloudTowerApplicationWhereInput targetPackageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH);
        return this;
    }

    public void setTargetPackageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH);
        }
    }

    public boolean getTargetPackageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE_STARTS_WITH);
    }

    public CloudTowerApplicationWhereInput user(UserWhereInput user) {

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

    public CloudTowerApplicationWhereInput user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public CloudTowerApplicationWhereInput user_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudTowerApplicationWhereInput cloudTowerApplicationWhereInput =
                (CloudTowerApplicationWhereInput) o;
        return Objects.equals(this.AND, cloudTowerApplicationWhereInput.AND)
                && Objects.equals(this.NOT, cloudTowerApplicationWhereInput.NOT)
                && Objects.equals(this.OR, cloudTowerApplicationWhereInput.OR)
                && Objects.equals(
                        this.entityAsyncStatus, cloudTowerApplicationWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        cloudTowerApplicationWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        cloudTowerApplicationWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        cloudTowerApplicationWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, cloudTowerApplicationWhereInput.id)
                && Objects.equals(this.idContains, cloudTowerApplicationWhereInput.idContains)
                && Objects.equals(this.idEndsWith, cloudTowerApplicationWhereInput.idEndsWith)
                && Objects.equals(this.idGt, cloudTowerApplicationWhereInput.idGt)
                && Objects.equals(this.idGte, cloudTowerApplicationWhereInput.idGte)
                && Objects.equals(this.idIn, cloudTowerApplicationWhereInput.idIn)
                && Objects.equals(this.idLt, cloudTowerApplicationWhereInput.idLt)
                && Objects.equals(this.idLte, cloudTowerApplicationWhereInput.idLte)
                && Objects.equals(this.idNot, cloudTowerApplicationWhereInput.idNot)
                && Objects.equals(this.idNotContains, cloudTowerApplicationWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, cloudTowerApplicationWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, cloudTowerApplicationWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, cloudTowerApplicationWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, cloudTowerApplicationWhereInput.idStartsWith)
                && Objects.equals(this.name, cloudTowerApplicationWhereInput.name)
                && Objects.equals(this.nameContains, cloudTowerApplicationWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, cloudTowerApplicationWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, cloudTowerApplicationWhereInput.nameGt)
                && Objects.equals(this.nameGte, cloudTowerApplicationWhereInput.nameGte)
                && Objects.equals(this.nameIn, cloudTowerApplicationWhereInput.nameIn)
                && Objects.equals(this.nameLt, cloudTowerApplicationWhereInput.nameLt)
                && Objects.equals(this.nameLte, cloudTowerApplicationWhereInput.nameLte)
                && Objects.equals(this.nameNot, cloudTowerApplicationWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, cloudTowerApplicationWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, cloudTowerApplicationWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, cloudTowerApplicationWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, cloudTowerApplicationWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, cloudTowerApplicationWhereInput.nameStartsWith)
                && Objects.equals(this._package, cloudTowerApplicationWhereInput._package)
                && Objects.equals(
                        this.placementSituation, cloudTowerApplicationWhereInput.placementSituation)
                && Objects.equals(
                        this.placementSituationContains,
                        cloudTowerApplicationWhereInput.placementSituationContains)
                && Objects.equals(
                        this.placementSituationEndsWith,
                        cloudTowerApplicationWhereInput.placementSituationEndsWith)
                && Objects.equals(
                        this.placementSituationGt,
                        cloudTowerApplicationWhereInput.placementSituationGt)
                && Objects.equals(
                        this.placementSituationGte,
                        cloudTowerApplicationWhereInput.placementSituationGte)
                && Objects.equals(
                        this.placementSituationIn,
                        cloudTowerApplicationWhereInput.placementSituationIn)
                && Objects.equals(
                        this.placementSituationLt,
                        cloudTowerApplicationWhereInput.placementSituationLt)
                && Objects.equals(
                        this.placementSituationLte,
                        cloudTowerApplicationWhereInput.placementSituationLte)
                && Objects.equals(
                        this.placementSituationNot,
                        cloudTowerApplicationWhereInput.placementSituationNot)
                && Objects.equals(
                        this.placementSituationNotContains,
                        cloudTowerApplicationWhereInput.placementSituationNotContains)
                && Objects.equals(
                        this.placementSituationNotEndsWith,
                        cloudTowerApplicationWhereInput.placementSituationNotEndsWith)
                && Objects.equals(
                        this.placementSituationNotIn,
                        cloudTowerApplicationWhereInput.placementSituationNotIn)
                && Objects.equals(
                        this.placementSituationNotStartsWith,
                        cloudTowerApplicationWhereInput.placementSituationNotStartsWith)
                && Objects.equals(
                        this.placementSituationStartsWith,
                        cloudTowerApplicationWhereInput.placementSituationStartsWith)
                && Objects.equals(this.placementVerb, cloudTowerApplicationWhereInput.placementVerb)
                && Objects.equals(
                        this.placementVerbContains,
                        cloudTowerApplicationWhereInput.placementVerbContains)
                && Objects.equals(
                        this.placementVerbEndsWith,
                        cloudTowerApplicationWhereInput.placementVerbEndsWith)
                && Objects.equals(
                        this.placementVerbGt, cloudTowerApplicationWhereInput.placementVerbGt)
                && Objects.equals(
                        this.placementVerbGte, cloudTowerApplicationWhereInput.placementVerbGte)
                && Objects.equals(
                        this.placementVerbIn, cloudTowerApplicationWhereInput.placementVerbIn)
                && Objects.equals(
                        this.placementVerbLt, cloudTowerApplicationWhereInput.placementVerbLt)
                && Objects.equals(
                        this.placementVerbLte, cloudTowerApplicationWhereInput.placementVerbLte)
                && Objects.equals(
                        this.placementVerbNot, cloudTowerApplicationWhereInput.placementVerbNot)
                && Objects.equals(
                        this.placementVerbNotContains,
                        cloudTowerApplicationWhereInput.placementVerbNotContains)
                && Objects.equals(
                        this.placementVerbNotEndsWith,
                        cloudTowerApplicationWhereInput.placementVerbNotEndsWith)
                && Objects.equals(
                        this.placementVerbNotIn, cloudTowerApplicationWhereInput.placementVerbNotIn)
                && Objects.equals(
                        this.placementVerbNotStartsWith,
                        cloudTowerApplicationWhereInput.placementVerbNotStartsWith)
                && Objects.equals(
                        this.placementVerbStartsWith,
                        cloudTowerApplicationWhereInput.placementVerbStartsWith)
                && Objects.equals(
                        this.resourceVersion, cloudTowerApplicationWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt, cloudTowerApplicationWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte, cloudTowerApplicationWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn, cloudTowerApplicationWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt, cloudTowerApplicationWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte, cloudTowerApplicationWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot, cloudTowerApplicationWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        cloudTowerApplicationWhereInput.resourceVersionNotIn)
                && Objects.equals(this.state, cloudTowerApplicationWhereInput.state)
                && Objects.equals(this.stateIn, cloudTowerApplicationWhereInput.stateIn)
                && Objects.equals(this.stateNot, cloudTowerApplicationWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, cloudTowerApplicationWhereInput.stateNotIn)
                && Objects.equals(this.targetPackage, cloudTowerApplicationWhereInput.targetPackage)
                && Objects.equals(
                        this.targetPackageContains,
                        cloudTowerApplicationWhereInput.targetPackageContains)
                && Objects.equals(
                        this.targetPackageEndsWith,
                        cloudTowerApplicationWhereInput.targetPackageEndsWith)
                && Objects.equals(
                        this.targetPackageGt, cloudTowerApplicationWhereInput.targetPackageGt)
                && Objects.equals(
                        this.targetPackageGte, cloudTowerApplicationWhereInput.targetPackageGte)
                && Objects.equals(
                        this.targetPackageIn, cloudTowerApplicationWhereInput.targetPackageIn)
                && Objects.equals(
                        this.targetPackageLt, cloudTowerApplicationWhereInput.targetPackageLt)
                && Objects.equals(
                        this.targetPackageLte, cloudTowerApplicationWhereInput.targetPackageLte)
                && Objects.equals(
                        this.targetPackageNot, cloudTowerApplicationWhereInput.targetPackageNot)
                && Objects.equals(
                        this.targetPackageNotContains,
                        cloudTowerApplicationWhereInput.targetPackageNotContains)
                && Objects.equals(
                        this.targetPackageNotEndsWith,
                        cloudTowerApplicationWhereInput.targetPackageNotEndsWith)
                && Objects.equals(
                        this.targetPackageNotIn, cloudTowerApplicationWhereInput.targetPackageNotIn)
                && Objects.equals(
                        this.targetPackageNotStartsWith,
                        cloudTowerApplicationWhereInput.targetPackageNotStartsWith)
                && Objects.equals(
                        this.targetPackageStartsWith,
                        cloudTowerApplicationWhereInput.targetPackageStartsWith)
                && Objects.equals(this.user, cloudTowerApplicationWhereInput.user);
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                _package,
                placementSituation,
                placementSituationContains,
                placementSituationEndsWith,
                placementSituationGt,
                placementSituationGte,
                placementSituationIn,
                placementSituationLt,
                placementSituationLte,
                placementSituationNot,
                placementSituationNotContains,
                placementSituationNotEndsWith,
                placementSituationNotIn,
                placementSituationNotStartsWith,
                placementSituationStartsWith,
                placementVerb,
                placementVerbContains,
                placementVerbEndsWith,
                placementVerbGt,
                placementVerbGte,
                placementVerbIn,
                placementVerbLt,
                placementVerbLte,
                placementVerbNot,
                placementVerbNotContains,
                placementVerbNotEndsWith,
                placementVerbNotIn,
                placementVerbNotStartsWith,
                placementVerbStartsWith,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                state,
                stateIn,
                stateNot,
                stateNotIn,
                targetPackage,
                targetPackageContains,
                targetPackageEndsWith,
                targetPackageGt,
                targetPackageGte,
                targetPackageIn,
                targetPackageLt,
                targetPackageLte,
                targetPackageNot,
                targetPackageNotContains,
                targetPackageNotEndsWith,
                targetPackageNotIn,
                targetPackageNotStartsWith,
                targetPackageStartsWith,
                user);
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
        sb.append("class CloudTowerApplicationWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    placementSituation: ")
                .append(toIndentedString(placementSituation))
                .append("\n");
        sb.append("    placementSituationContains: ")
                .append(toIndentedString(placementSituationContains))
                .append("\n");
        sb.append("    placementSituationEndsWith: ")
                .append(toIndentedString(placementSituationEndsWith))
                .append("\n");
        sb.append("    placementSituationGt: ")
                .append(toIndentedString(placementSituationGt))
                .append("\n");
        sb.append("    placementSituationGte: ")
                .append(toIndentedString(placementSituationGte))
                .append("\n");
        sb.append("    placementSituationIn: ")
                .append(toIndentedString(placementSituationIn))
                .append("\n");
        sb.append("    placementSituationLt: ")
                .append(toIndentedString(placementSituationLt))
                .append("\n");
        sb.append("    placementSituationLte: ")
                .append(toIndentedString(placementSituationLte))
                .append("\n");
        sb.append("    placementSituationNot: ")
                .append(toIndentedString(placementSituationNot))
                .append("\n");
        sb.append("    placementSituationNotContains: ")
                .append(toIndentedString(placementSituationNotContains))
                .append("\n");
        sb.append("    placementSituationNotEndsWith: ")
                .append(toIndentedString(placementSituationNotEndsWith))
                .append("\n");
        sb.append("    placementSituationNotIn: ")
                .append(toIndentedString(placementSituationNotIn))
                .append("\n");
        sb.append("    placementSituationNotStartsWith: ")
                .append(toIndentedString(placementSituationNotStartsWith))
                .append("\n");
        sb.append("    placementSituationStartsWith: ")
                .append(toIndentedString(placementSituationStartsWith))
                .append("\n");
        sb.append("    placementVerb: ").append(toIndentedString(placementVerb)).append("\n");
        sb.append("    placementVerbContains: ")
                .append(toIndentedString(placementVerbContains))
                .append("\n");
        sb.append("    placementVerbEndsWith: ")
                .append(toIndentedString(placementVerbEndsWith))
                .append("\n");
        sb.append("    placementVerbGt: ").append(toIndentedString(placementVerbGt)).append("\n");
        sb.append("    placementVerbGte: ").append(toIndentedString(placementVerbGte)).append("\n");
        sb.append("    placementVerbIn: ").append(toIndentedString(placementVerbIn)).append("\n");
        sb.append("    placementVerbLt: ").append(toIndentedString(placementVerbLt)).append("\n");
        sb.append("    placementVerbLte: ").append(toIndentedString(placementVerbLte)).append("\n");
        sb.append("    placementVerbNot: ").append(toIndentedString(placementVerbNot)).append("\n");
        sb.append("    placementVerbNotContains: ")
                .append(toIndentedString(placementVerbNotContains))
                .append("\n");
        sb.append("    placementVerbNotEndsWith: ")
                .append(toIndentedString(placementVerbNotEndsWith))
                .append("\n");
        sb.append("    placementVerbNotIn: ")
                .append(toIndentedString(placementVerbNotIn))
                .append("\n");
        sb.append("    placementVerbNotStartsWith: ")
                .append(toIndentedString(placementVerbNotStartsWith))
                .append("\n");
        sb.append("    placementVerbStartsWith: ")
                .append(toIndentedString(placementVerbStartsWith))
                .append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    resourceVersionGt: ")
                .append(toIndentedString(resourceVersionGt))
                .append("\n");
        sb.append("    resourceVersionGte: ")
                .append(toIndentedString(resourceVersionGte))
                .append("\n");
        sb.append("    resourceVersionIn: ")
                .append(toIndentedString(resourceVersionIn))
                .append("\n");
        sb.append("    resourceVersionLt: ")
                .append(toIndentedString(resourceVersionLt))
                .append("\n");
        sb.append("    resourceVersionLte: ")
                .append(toIndentedString(resourceVersionLte))
                .append("\n");
        sb.append("    resourceVersionNot: ")
                .append(toIndentedString(resourceVersionNot))
                .append("\n");
        sb.append("    resourceVersionNotIn: ")
                .append(toIndentedString(resourceVersionNotIn))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
        sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
        sb.append("    targetPackageContains: ")
                .append(toIndentedString(targetPackageContains))
                .append("\n");
        sb.append("    targetPackageEndsWith: ")
                .append(toIndentedString(targetPackageEndsWith))
                .append("\n");
        sb.append("    targetPackageGt: ").append(toIndentedString(targetPackageGt)).append("\n");
        sb.append("    targetPackageGte: ").append(toIndentedString(targetPackageGte)).append("\n");
        sb.append("    targetPackageIn: ").append(toIndentedString(targetPackageIn)).append("\n");
        sb.append("    targetPackageLt: ").append(toIndentedString(targetPackageLt)).append("\n");
        sb.append("    targetPackageLte: ").append(toIndentedString(targetPackageLte)).append("\n");
        sb.append("    targetPackageNot: ").append(toIndentedString(targetPackageNot)).append("\n");
        sb.append("    targetPackageNotContains: ")
                .append(toIndentedString(targetPackageNotContains))
                .append("\n");
        sb.append("    targetPackageNotEndsWith: ")
                .append(toIndentedString(targetPackageNotEndsWith))
                .append("\n");
        sb.append("    targetPackageNotIn: ")
                .append(toIndentedString(targetPackageNotIn))
                .append("\n");
        sb.append("    targetPackageNotStartsWith: ")
                .append(toIndentedString(targetPackageNotStartsWith))
                .append("\n");
        sb.append("    targetPackageStartsWith: ")
                .append(toIndentedString(targetPackageStartsWith))
                .append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
