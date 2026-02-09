package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PmemDimmWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class PmemDimmWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<PmemDimmWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<PmemDimmWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<PmemDimmWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CAPACITY = "capacity";

    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private Long capacity;

    public static final String SERIALIZED_NAME_CAPACITY_GT = "capacity_gt";

    @SerializedName(SERIALIZED_NAME_CAPACITY_GT)
    private Long capacityGt;

    public static final String SERIALIZED_NAME_CAPACITY_GTE = "capacity_gte";

    @SerializedName(SERIALIZED_NAME_CAPACITY_GTE)
    private Long capacityGte;

    public static final String SERIALIZED_NAME_CAPACITY_IN = "capacity_in";

    @SerializedName(SERIALIZED_NAME_CAPACITY_IN)
    private List<Long> capacityIn = null;

    public static final String SERIALIZED_NAME_CAPACITY_LT = "capacity_lt";

    @SerializedName(SERIALIZED_NAME_CAPACITY_LT)
    private Long capacityLt;

    public static final String SERIALIZED_NAME_CAPACITY_LTE = "capacity_lte";

    @SerializedName(SERIALIZED_NAME_CAPACITY_LTE)
    private Long capacityLte;

    public static final String SERIALIZED_NAME_CAPACITY_NOT = "capacity_not";

    @SerializedName(SERIALIZED_NAME_CAPACITY_NOT)
    private Long capacityNot;

    public static final String SERIALIZED_NAME_CAPACITY_NOT_IN = "capacity_not_in";

    @SerializedName(SERIALIZED_NAME_CAPACITY_NOT_IN)
    private List<Long> capacityNotIn = null;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR = "device_locator";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR)
    private String deviceLocator;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS = "device_locator_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS)
    private String deviceLocatorContains;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH =
            "device_locator_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH)
    private String deviceLocatorEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_GT = "device_locator_gt";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_GT)
    private String deviceLocatorGt;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_GTE = "device_locator_gte";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_GTE)
    private String deviceLocatorGte;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_IN = "device_locator_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_IN)
    private List<String> deviceLocatorIn = null;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_LT = "device_locator_lt";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_LT)
    private String deviceLocatorLt;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_LTE = "device_locator_lte";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_LTE)
    private String deviceLocatorLte;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_NOT = "device_locator_not";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_NOT)
    private String deviceLocatorNot;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS =
            "device_locator_not_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS)
    private String deviceLocatorNotContains;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH =
            "device_locator_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH)
    private String deviceLocatorNotEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN = "device_locator_not_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN)
    private List<String> deviceLocatorNotIn = null;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH =
            "device_locator_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH)
    private String deviceLocatorNotStartsWith;

    public static final String SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH =
            "device_locator_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH)
    private String deviceLocatorStartsWith;

    public static final String SERIALIZED_NAME_DISK = "disk";

    @SerializedName(SERIALIZED_NAME_DISK)
    private DiskWhereInput disk;

    public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
    private DiskHealthStatus healthStatus;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_IN = "health_status_in";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_IN)
    private List<DiskHealthStatus> healthStatusIn = null;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_NOT = "health_status_not";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_NOT)
    private DiskHealthStatus healthStatusNot;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_NOT_IN = "health_status_not_in";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN)
    private List<DiskHealthStatus> healthStatusNotIn = null;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

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

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

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

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private Integer numaNode;

    public static final String SERIALIZED_NAME_NUMA_NODE_GT = "numa_node_gt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GT)
    private Integer numaNodeGt;

    public static final String SERIALIZED_NAME_NUMA_NODE_GTE = "numa_node_gte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GTE)
    private Integer numaNodeGte;

    public static final String SERIALIZED_NAME_NUMA_NODE_IN = "numa_node_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_IN)
    private List<Integer> numaNodeIn = null;

    public static final String SERIALIZED_NAME_NUMA_NODE_LT = "numa_node_lt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LT)
    private Integer numaNodeLt;

    public static final String SERIALIZED_NAME_NUMA_NODE_LTE = "numa_node_lte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LTE)
    private Integer numaNodeLte;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT = "numa_node_not";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT)
    private Integer numaNodeNot;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_IN = "numa_node_not_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_IN)
    private List<Integer> numaNodeNotIn = null;

    public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER)
    private String partNumber;

    public static final String SERIALIZED_NAME_PART_NUMBER_CONTAINS = "part_number_contains";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_CONTAINS)
    private String partNumberContains;

    public static final String SERIALIZED_NAME_PART_NUMBER_ENDS_WITH = "part_number_ends_with";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH)
    private String partNumberEndsWith;

    public static final String SERIALIZED_NAME_PART_NUMBER_GT = "part_number_gt";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_GT)
    private String partNumberGt;

    public static final String SERIALIZED_NAME_PART_NUMBER_GTE = "part_number_gte";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_GTE)
    private String partNumberGte;

    public static final String SERIALIZED_NAME_PART_NUMBER_IN = "part_number_in";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_IN)
    private List<String> partNumberIn = null;

    public static final String SERIALIZED_NAME_PART_NUMBER_LT = "part_number_lt";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_LT)
    private String partNumberLt;

    public static final String SERIALIZED_NAME_PART_NUMBER_LTE = "part_number_lte";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_LTE)
    private String partNumberLte;

    public static final String SERIALIZED_NAME_PART_NUMBER_NOT = "part_number_not";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_NOT)
    private String partNumberNot;

    public static final String SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS =
            "part_number_not_contains";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS)
    private String partNumberNotContains;

    public static final String SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH =
            "part_number_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH)
    private String partNumberNotEndsWith;

    public static final String SERIALIZED_NAME_PART_NUMBER_NOT_IN = "part_number_not_in";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_NOT_IN)
    private List<String> partNumberNotIn = null;

    public static final String SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH =
            "part_number_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH)
    private String partNumberNotStartsWith;

    public static final String SERIALIZED_NAME_PART_NUMBER_STARTS_WITH = "part_number_starts_with";

    @SerializedName(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH)
    private String partNumberStartsWith;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT = "remaining_life_percent";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT)
    private Integer remainingLifePercent;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT =
            "remaining_life_percent_gt";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT)
    private Integer remainingLifePercentGt;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE =
            "remaining_life_percent_gte";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE)
    private Integer remainingLifePercentGte;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN =
            "remaining_life_percent_in";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN)
    private List<Integer> remainingLifePercentIn = null;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT =
            "remaining_life_percent_lt";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT)
    private Integer remainingLifePercentLt;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE =
            "remaining_life_percent_lte";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE)
    private Integer remainingLifePercentLte;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT =
            "remaining_life_percent_not";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT)
    private Integer remainingLifePercentNot;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN =
            "remaining_life_percent_not_in";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN)
    private List<Integer> remainingLifePercentNotIn = null;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
    private String versionContains;

    public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
    private String versionEndsWith;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private String versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private String versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<String> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private String versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private String versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private String versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
    private String versionNotContains;

    public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
    private String versionNotEndsWith;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<String> versionNotIn = null;

    public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
    private String versionNotStartsWith;

    public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
    private String versionStartsWith;

    public PmemDimmWhereInput() {}

    public PmemDimmWhereInput AND(List<PmemDimmWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public PmemDimmWhereInput addANDItem(PmemDimmWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<PmemDimmWhereInput>();
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
    public List<PmemDimmWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<PmemDimmWhereInput> AND) {
        this.AND = AND;
    }

    public PmemDimmWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public PmemDimmWhereInput AND_ExplictlyNonNull() {
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

    public PmemDimmWhereInput NOT(List<PmemDimmWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public PmemDimmWhereInput addNOTItem(PmemDimmWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<PmemDimmWhereInput>();
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
    public List<PmemDimmWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<PmemDimmWhereInput> NOT) {
        this.NOT = NOT;
    }

    public PmemDimmWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public PmemDimmWhereInput NOT_ExplictlyNonNull() {
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

    public PmemDimmWhereInput OR(List<PmemDimmWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public PmemDimmWhereInput addORItem(PmemDimmWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<PmemDimmWhereInput>();
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
    public List<PmemDimmWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<PmemDimmWhereInput> OR) {
        this.OR = OR;
    }

    public PmemDimmWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public PmemDimmWhereInput OR_ExplictlyNonNull() {
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

    public PmemDimmWhereInput capacity(Long capacity) {

        this.capacity = capacity;
        return this;
    }

    /**
     * Get capacity
     *
     * @return capacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public PmemDimmWhereInput capacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public PmemDimmWhereInput capacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public void setCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        }
    }

    public boolean getCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY);
    }

    public PmemDimmWhereInput capacityGt(Long capacityGt) {

        this.capacityGt = capacityGt;
        return this;
    }

    /**
     * Get capacityGt
     *
     * @return capacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacityGt() {
        return capacityGt;
    }

    public void setCapacityGt(Long capacityGt) {
        this.capacityGt = capacityGt;
    }

    public PmemDimmWhereInput capacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_GT);
        return this;
    }

    public PmemDimmWhereInput capacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_GT);
        return this;
    }

    public void setCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_GT);
        }
    }

    public boolean getCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_GT);
    }

    public PmemDimmWhereInput capacityGte(Long capacityGte) {

        this.capacityGte = capacityGte;
        return this;
    }

    /**
     * Get capacityGte
     *
     * @return capacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacityGte() {
        return capacityGte;
    }

    public void setCapacityGte(Long capacityGte) {
        this.capacityGte = capacityGte;
    }

    public PmemDimmWhereInput capacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_GTE);
        return this;
    }

    public PmemDimmWhereInput capacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_GTE);
        return this;
    }

    public void setCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_GTE);
        }
    }

    public boolean getCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_GTE);
    }

    public PmemDimmWhereInput capacityIn(List<Long> capacityIn) {

        this.capacityIn = capacityIn;
        return this;
    }

    public PmemDimmWhereInput addCapacityInItem(Long capacityInItem) {
        if (this.capacityIn == null) {
            this.capacityIn = new ArrayList<Long>();
        }
        this.capacityIn.add(capacityInItem);
        return this;
    }

    /**
     * Get capacityIn
     *
     * @return capacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getCapacityIn() {
        return capacityIn;
    }

    public void setCapacityIn(List<Long> capacityIn) {
        this.capacityIn = capacityIn;
    }

    public PmemDimmWhereInput capacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_IN);
        return this;
    }

    public PmemDimmWhereInput capacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_IN);
        return this;
    }

    public void setCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_IN);
        }
    }

    public boolean getCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_IN);
    }

    public PmemDimmWhereInput capacityLt(Long capacityLt) {

        this.capacityLt = capacityLt;
        return this;
    }

    /**
     * Get capacityLt
     *
     * @return capacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacityLt() {
        return capacityLt;
    }

    public void setCapacityLt(Long capacityLt) {
        this.capacityLt = capacityLt;
    }

    public PmemDimmWhereInput capacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_LT);
        return this;
    }

    public PmemDimmWhereInput capacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_LT);
        return this;
    }

    public void setCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_LT);
        }
    }

    public boolean getCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_LT);
    }

    public PmemDimmWhereInput capacityLte(Long capacityLte) {

        this.capacityLte = capacityLte;
        return this;
    }

    /**
     * Get capacityLte
     *
     * @return capacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacityLte() {
        return capacityLte;
    }

    public void setCapacityLte(Long capacityLte) {
        this.capacityLte = capacityLte;
    }

    public PmemDimmWhereInput capacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_LTE);
        return this;
    }

    public PmemDimmWhereInput capacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_LTE);
        return this;
    }

    public void setCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_LTE);
        }
    }

    public boolean getCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_LTE);
    }

    public PmemDimmWhereInput capacityNot(Long capacityNot) {

        this.capacityNot = capacityNot;
        return this;
    }

    /**
     * Get capacityNot
     *
     * @return capacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapacityNot() {
        return capacityNot;
    }

    public void setCapacityNot(Long capacityNot) {
        this.capacityNot = capacityNot;
    }

    public PmemDimmWhereInput capacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_NOT);
        return this;
    }

    public PmemDimmWhereInput capacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_NOT);
        return this;
    }

    public void setCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_NOT);
        }
    }

    public boolean getCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_NOT);
    }

    public PmemDimmWhereInput capacityNotIn(List<Long> capacityNotIn) {

        this.capacityNotIn = capacityNotIn;
        return this;
    }

    public PmemDimmWhereInput addCapacityNotInItem(Long capacityNotInItem) {
        if (this.capacityNotIn == null) {
            this.capacityNotIn = new ArrayList<Long>();
        }
        this.capacityNotIn.add(capacityNotInItem);
        return this;
    }

    /**
     * Get capacityNotIn
     *
     * @return capacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getCapacityNotIn() {
        return capacityNotIn;
    }

    public void setCapacityNotIn(List<Long> capacityNotIn) {
        this.capacityNotIn = capacityNotIn;
    }

    public PmemDimmWhereInput capacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput capacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_NOT_IN);
        return this;
    }

    public void setCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_NOT_IN);
        }
    }

    public boolean getCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_NOT_IN);
    }

    public PmemDimmWhereInput deviceLocator(String deviceLocator) {

        this.deviceLocator = deviceLocator;
        return this;
    }

    /**
     * Get deviceLocator
     *
     * @return deviceLocator
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocator() {
        return deviceLocator;
    }

    public void setDeviceLocator(String deviceLocator) {
        this.deviceLocator = deviceLocator;
    }

    public PmemDimmWhereInput deviceLocator_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR);
        return this;
    }

    public PmemDimmWhereInput deviceLocator_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR);
        return this;
    }

    public void setDeviceLocator_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR);
        }
    }

    public boolean getDeviceLocator_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR);
    }

    public PmemDimmWhereInput deviceLocatorContains(String deviceLocatorContains) {

        this.deviceLocatorContains = deviceLocatorContains;
        return this;
    }

    /**
     * Get deviceLocatorContains
     *
     * @return deviceLocatorContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorContains() {
        return deviceLocatorContains;
    }

    public void setDeviceLocatorContains(String deviceLocatorContains) {
        this.deviceLocatorContains = deviceLocatorContains;
    }

    public PmemDimmWhereInput deviceLocatorContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS);
        return this;
    }

    public void setDeviceLocatorContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS);
        }
    }

    public boolean getDeviceLocatorContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_CONTAINS);
    }

    public PmemDimmWhereInput deviceLocatorEndsWith(String deviceLocatorEndsWith) {

        this.deviceLocatorEndsWith = deviceLocatorEndsWith;
        return this;
    }

    /**
     * Get deviceLocatorEndsWith
     *
     * @return deviceLocatorEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorEndsWith() {
        return deviceLocatorEndsWith;
    }

    public void setDeviceLocatorEndsWith(String deviceLocatorEndsWith) {
        this.deviceLocatorEndsWith = deviceLocatorEndsWith;
    }

    public PmemDimmWhereInput deviceLocatorEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH);
        return this;
    }

    public void setDeviceLocatorEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH);
        }
    }

    public boolean getDeviceLocatorEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_ENDS_WITH);
    }

    public PmemDimmWhereInput deviceLocatorGt(String deviceLocatorGt) {

        this.deviceLocatorGt = deviceLocatorGt;
        return this;
    }

    /**
     * Get deviceLocatorGt
     *
     * @return deviceLocatorGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorGt() {
        return deviceLocatorGt;
    }

    public void setDeviceLocatorGt(String deviceLocatorGt) {
        this.deviceLocatorGt = deviceLocatorGt;
    }

    public PmemDimmWhereInput deviceLocatorGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_GT);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_GT);
        return this;
    }

    public void setDeviceLocatorGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_GT);
        }
    }

    public boolean getDeviceLocatorGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_GT);
    }

    public PmemDimmWhereInput deviceLocatorGte(String deviceLocatorGte) {

        this.deviceLocatorGte = deviceLocatorGte;
        return this;
    }

    /**
     * Get deviceLocatorGte
     *
     * @return deviceLocatorGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorGte() {
        return deviceLocatorGte;
    }

    public void setDeviceLocatorGte(String deviceLocatorGte) {
        this.deviceLocatorGte = deviceLocatorGte;
    }

    public PmemDimmWhereInput deviceLocatorGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_GTE);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_GTE);
        return this;
    }

    public void setDeviceLocatorGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_GTE);
        }
    }

    public boolean getDeviceLocatorGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_GTE);
    }

    public PmemDimmWhereInput deviceLocatorIn(List<String> deviceLocatorIn) {

        this.deviceLocatorIn = deviceLocatorIn;
        return this;
    }

    public PmemDimmWhereInput addDeviceLocatorInItem(String deviceLocatorInItem) {
        if (this.deviceLocatorIn == null) {
            this.deviceLocatorIn = new ArrayList<String>();
        }
        this.deviceLocatorIn.add(deviceLocatorInItem);
        return this;
    }

    /**
     * Get deviceLocatorIn
     *
     * @return deviceLocatorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceLocatorIn() {
        return deviceLocatorIn;
    }

    public void setDeviceLocatorIn(List<String> deviceLocatorIn) {
        this.deviceLocatorIn = deviceLocatorIn;
    }

    public PmemDimmWhereInput deviceLocatorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_IN);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_IN);
        return this;
    }

    public void setDeviceLocatorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_IN);
        }
    }

    public boolean getDeviceLocatorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_IN);
    }

    public PmemDimmWhereInput deviceLocatorLt(String deviceLocatorLt) {

        this.deviceLocatorLt = deviceLocatorLt;
        return this;
    }

    /**
     * Get deviceLocatorLt
     *
     * @return deviceLocatorLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorLt() {
        return deviceLocatorLt;
    }

    public void setDeviceLocatorLt(String deviceLocatorLt) {
        this.deviceLocatorLt = deviceLocatorLt;
    }

    public PmemDimmWhereInput deviceLocatorLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_LT);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_LT);
        return this;
    }

    public void setDeviceLocatorLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_LT);
        }
    }

    public boolean getDeviceLocatorLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_LT);
    }

    public PmemDimmWhereInput deviceLocatorLte(String deviceLocatorLte) {

        this.deviceLocatorLte = deviceLocatorLte;
        return this;
    }

    /**
     * Get deviceLocatorLte
     *
     * @return deviceLocatorLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorLte() {
        return deviceLocatorLte;
    }

    public void setDeviceLocatorLte(String deviceLocatorLte) {
        this.deviceLocatorLte = deviceLocatorLte;
    }

    public PmemDimmWhereInput deviceLocatorLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_LTE);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_LTE);
        return this;
    }

    public void setDeviceLocatorLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_LTE);
        }
    }

    public boolean getDeviceLocatorLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_LTE);
    }

    public PmemDimmWhereInput deviceLocatorNot(String deviceLocatorNot) {

        this.deviceLocatorNot = deviceLocatorNot;
        return this;
    }

    /**
     * Get deviceLocatorNot
     *
     * @return deviceLocatorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorNot() {
        return deviceLocatorNot;
    }

    public void setDeviceLocatorNot(String deviceLocatorNot) {
        this.deviceLocatorNot = deviceLocatorNot;
    }

    public PmemDimmWhereInput deviceLocatorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT);
        return this;
    }

    public void setDeviceLocatorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT);
        }
    }

    public boolean getDeviceLocatorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_NOT);
    }

    public PmemDimmWhereInput deviceLocatorNotContains(String deviceLocatorNotContains) {

        this.deviceLocatorNotContains = deviceLocatorNotContains;
        return this;
    }

    /**
     * Get deviceLocatorNotContains
     *
     * @return deviceLocatorNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorNotContains() {
        return deviceLocatorNotContains;
    }

    public void setDeviceLocatorNotContains(String deviceLocatorNotContains) {
        this.deviceLocatorNotContains = deviceLocatorNotContains;
    }

    public PmemDimmWhereInput deviceLocatorNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS);
        return this;
    }

    public void setDeviceLocatorNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS);
        }
    }

    public boolean getDeviceLocatorNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_CONTAINS);
    }

    public PmemDimmWhereInput deviceLocatorNotEndsWith(String deviceLocatorNotEndsWith) {

        this.deviceLocatorNotEndsWith = deviceLocatorNotEndsWith;
        return this;
    }

    /**
     * Get deviceLocatorNotEndsWith
     *
     * @return deviceLocatorNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorNotEndsWith() {
        return deviceLocatorNotEndsWith;
    }

    public void setDeviceLocatorNotEndsWith(String deviceLocatorNotEndsWith) {
        this.deviceLocatorNotEndsWith = deviceLocatorNotEndsWith;
    }

    public PmemDimmWhereInput deviceLocatorNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH);
        return this;
    }

    public void setDeviceLocatorNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH);
        }
    }

    public boolean getDeviceLocatorNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_ENDS_WITH);
    }

    public PmemDimmWhereInput deviceLocatorNotIn(List<String> deviceLocatorNotIn) {

        this.deviceLocatorNotIn = deviceLocatorNotIn;
        return this;
    }

    public PmemDimmWhereInput addDeviceLocatorNotInItem(String deviceLocatorNotInItem) {
        if (this.deviceLocatorNotIn == null) {
            this.deviceLocatorNotIn = new ArrayList<String>();
        }
        this.deviceLocatorNotIn.add(deviceLocatorNotInItem);
        return this;
    }

    /**
     * Get deviceLocatorNotIn
     *
     * @return deviceLocatorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceLocatorNotIn() {
        return deviceLocatorNotIn;
    }

    public void setDeviceLocatorNotIn(List<String> deviceLocatorNotIn) {
        this.deviceLocatorNotIn = deviceLocatorNotIn;
    }

    public PmemDimmWhereInput deviceLocatorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN);
        return this;
    }

    public void setDeviceLocatorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN);
        }
    }

    public boolean getDeviceLocatorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_IN);
    }

    public PmemDimmWhereInput deviceLocatorNotStartsWith(String deviceLocatorNotStartsWith) {

        this.deviceLocatorNotStartsWith = deviceLocatorNotStartsWith;
        return this;
    }

    /**
     * Get deviceLocatorNotStartsWith
     *
     * @return deviceLocatorNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorNotStartsWith() {
        return deviceLocatorNotStartsWith;
    }

    public void setDeviceLocatorNotStartsWith(String deviceLocatorNotStartsWith) {
        this.deviceLocatorNotStartsWith = deviceLocatorNotStartsWith;
    }

    public PmemDimmWhereInput deviceLocatorNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH);
        return this;
    }

    public void setDeviceLocatorNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH);
        }
    }

    public boolean getDeviceLocatorNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_NOT_STARTS_WITH);
    }

    public PmemDimmWhereInput deviceLocatorStartsWith(String deviceLocatorStartsWith) {

        this.deviceLocatorStartsWith = deviceLocatorStartsWith;
        return this;
    }

    /**
     * Get deviceLocatorStartsWith
     *
     * @return deviceLocatorStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLocatorStartsWith() {
        return deviceLocatorStartsWith;
    }

    public void setDeviceLocatorStartsWith(String deviceLocatorStartsWith) {
        this.deviceLocatorStartsWith = deviceLocatorStartsWith;
    }

    public PmemDimmWhereInput deviceLocatorStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput deviceLocatorStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH);
        return this;
    }

    public void setDeviceLocatorStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH);
        }
    }

    public boolean getDeviceLocatorStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LOCATOR_STARTS_WITH);
    }

    public PmemDimmWhereInput disk(DiskWhereInput disk) {

        this.disk = disk;
        return this;
    }

    /**
     * Get disk
     *
     * @return disk
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisk() {
        return disk;
    }

    public void setDisk(DiskWhereInput disk) {
        this.disk = disk;
    }

    public PmemDimmWhereInput disk_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK);
        return this;
    }

    public PmemDimmWhereInput disk_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK);
        return this;
    }

    public void setDisk_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK);
        }
    }

    public boolean getDisk_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK);
    }

    public PmemDimmWhereInput healthStatus(DiskHealthStatus healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     *
     * @return healthStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(DiskHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public PmemDimmWhereInput healthStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public PmemDimmWhereInput healthStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public void setHealthStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        }
    }

    public boolean getHealthStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS);
    }

    public PmemDimmWhereInput healthStatusIn(List<DiskHealthStatus> healthStatusIn) {

        this.healthStatusIn = healthStatusIn;
        return this;
    }

    public PmemDimmWhereInput addHealthStatusInItem(DiskHealthStatus healthStatusInItem) {
        if (this.healthStatusIn == null) {
            this.healthStatusIn = new ArrayList<DiskHealthStatus>();
        }
        this.healthStatusIn.add(healthStatusInItem);
        return this;
    }

    /**
     * Get healthStatusIn
     *
     * @return healthStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskHealthStatus> getHealthStatusIn() {
        return healthStatusIn;
    }

    public void setHealthStatusIn(List<DiskHealthStatus> healthStatusIn) {
        this.healthStatusIn = healthStatusIn;
    }

    public PmemDimmWhereInput healthStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_IN);
        return this;
    }

    public PmemDimmWhereInput healthStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_IN);
        return this;
    }

    public void setHealthStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_IN);
        }
    }

    public boolean getHealthStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_IN);
    }

    public PmemDimmWhereInput healthStatusNot(DiskHealthStatus healthStatusNot) {

        this.healthStatusNot = healthStatusNot;
        return this;
    }

    /**
     * Get healthStatusNot
     *
     * @return healthStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatusNot() {
        return healthStatusNot;
    }

    public void setHealthStatusNot(DiskHealthStatus healthStatusNot) {
        this.healthStatusNot = healthStatusNot;
    }

    public PmemDimmWhereInput healthStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        return this;
    }

    public PmemDimmWhereInput healthStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        return this;
    }

    public void setHealthStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        }
    }

    public boolean getHealthStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_NOT);
    }

    public PmemDimmWhereInput healthStatusNotIn(List<DiskHealthStatus> healthStatusNotIn) {

        this.healthStatusNotIn = healthStatusNotIn;
        return this;
    }

    public PmemDimmWhereInput addHealthStatusNotInItem(DiskHealthStatus healthStatusNotInItem) {
        if (this.healthStatusNotIn == null) {
            this.healthStatusNotIn = new ArrayList<DiskHealthStatus>();
        }
        this.healthStatusNotIn.add(healthStatusNotInItem);
        return this;
    }

    /**
     * Get healthStatusNotIn
     *
     * @return healthStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskHealthStatus> getHealthStatusNotIn() {
        return healthStatusNotIn;
    }

    public void setHealthStatusNotIn(List<DiskHealthStatus> healthStatusNotIn) {
        this.healthStatusNotIn = healthStatusNotIn;
    }

    public PmemDimmWhereInput healthStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput healthStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        return this;
    }

    public void setHealthStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        }
    }

    public boolean getHealthStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
    }

    public PmemDimmWhereInput host(HostWhereInput host) {

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
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public PmemDimmWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public PmemDimmWhereInput host_ExplictlyNonNull() {
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

    public PmemDimmWhereInput id(String id) {

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

    public PmemDimmWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public PmemDimmWhereInput id_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idContains(String idContains) {

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

    public PmemDimmWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput idContains_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idEndsWith(String idEndsWith) {

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

    public PmemDimmWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput idEndsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idGt(String idGt) {

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

    public PmemDimmWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public PmemDimmWhereInput idGt_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idGte(String idGte) {

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

    public PmemDimmWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public PmemDimmWhereInput idGte_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public PmemDimmWhereInput addIdInItem(String idInItem) {
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

    public PmemDimmWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public PmemDimmWhereInput idIn_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idLt(String idLt) {

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

    public PmemDimmWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public PmemDimmWhereInput idLt_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idLte(String idLte) {

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

    public PmemDimmWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public PmemDimmWhereInput idLte_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idNot(String idNot) {

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

    public PmemDimmWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public PmemDimmWhereInput idNot_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idNotContains(String idNotContains) {

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

    public PmemDimmWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput idNotContains_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public PmemDimmWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public PmemDimmWhereInput addIdNotInItem(String idNotInItem) {
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

    public PmemDimmWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput idNotIn_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public PmemDimmWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput idStartsWith(String idStartsWith) {

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

    public PmemDimmWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput idStartsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public PmemDimmWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public PmemDimmWhereInput localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public PmemDimmWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public PmemDimmWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public PmemDimmWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public PmemDimmWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public PmemDimmWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public PmemDimmWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public PmemDimmWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public PmemDimmWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public PmemDimmWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public PmemDimmWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public PmemDimmWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public PmemDimmWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public PmemDimmWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public PmemDimmWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public PmemDimmWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public PmemDimmWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public PmemDimmWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public PmemDimmWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public PmemDimmWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public PmemDimmWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public PmemDimmWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public PmemDimmWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public PmemDimmWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public PmemDimmWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public PmemDimmWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public PmemDimmWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public PmemDimmWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public PmemDimmWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public PmemDimmWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public PmemDimmWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public PmemDimmWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public PmemDimmWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public PmemDimmWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public PmemDimmWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public PmemDimmWhereInput name(String name) {

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

    public PmemDimmWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public PmemDimmWhereInput name_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameContains(String nameContains) {

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

    public PmemDimmWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput nameContains_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameEndsWith(String nameEndsWith) {

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

    public PmemDimmWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameGt(String nameGt) {

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

    public PmemDimmWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public PmemDimmWhereInput nameGt_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameGte(String nameGte) {

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

    public PmemDimmWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public PmemDimmWhereInput nameGte_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public PmemDimmWhereInput addNameInItem(String nameInItem) {
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

    public PmemDimmWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public PmemDimmWhereInput nameIn_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameLt(String nameLt) {

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

    public PmemDimmWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public PmemDimmWhereInput nameLt_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameLte(String nameLte) {

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

    public PmemDimmWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public PmemDimmWhereInput nameLte_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameNot(String nameNot) {

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

    public PmemDimmWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public PmemDimmWhereInput nameNot_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameNotContains(String nameNotContains) {

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

    public PmemDimmWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput nameNotContains_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public PmemDimmWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public PmemDimmWhereInput addNameNotInItem(String nameNotInItem) {
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

    public PmemDimmWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput nameNotIn_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public PmemDimmWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput nameStartsWith(String nameStartsWith) {

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

    public PmemDimmWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public PmemDimmWhereInput numaNode(Integer numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public PmemDimmWhereInput numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public PmemDimmWhereInput numaNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public void setNumaNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        }
    }

    public boolean getNumaNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE);
    }

    public PmemDimmWhereInput numaNodeGt(Integer numaNodeGt) {

        this.numaNodeGt = numaNodeGt;
        return this;
    }

    /**
     * Get numaNodeGt
     *
     * @return numaNodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeGt() {
        return numaNodeGt;
    }

    public void setNumaNodeGt(Integer numaNodeGt) {
        this.numaNodeGt = numaNodeGt;
    }

    public PmemDimmWhereInput numaNodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public PmemDimmWhereInput numaNodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public void setNumaNodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        }
    }

    public boolean getNumaNodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GT);
    }

    public PmemDimmWhereInput numaNodeGte(Integer numaNodeGte) {

        this.numaNodeGte = numaNodeGte;
        return this;
    }

    /**
     * Get numaNodeGte
     *
     * @return numaNodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeGte() {
        return numaNodeGte;
    }

    public void setNumaNodeGte(Integer numaNodeGte) {
        this.numaNodeGte = numaNodeGte;
    }

    public PmemDimmWhereInput numaNodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public PmemDimmWhereInput numaNodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public void setNumaNodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        }
    }

    public boolean getNumaNodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GTE);
    }

    public PmemDimmWhereInput numaNodeIn(List<Integer> numaNodeIn) {

        this.numaNodeIn = numaNodeIn;
        return this;
    }

    public PmemDimmWhereInput addNumaNodeInItem(Integer numaNodeInItem) {
        if (this.numaNodeIn == null) {
            this.numaNodeIn = new ArrayList<Integer>();
        }
        this.numaNodeIn.add(numaNodeInItem);
        return this;
    }

    /**
     * Get numaNodeIn
     *
     * @return numaNodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNumaNodeIn() {
        return numaNodeIn;
    }

    public void setNumaNodeIn(List<Integer> numaNodeIn) {
        this.numaNodeIn = numaNodeIn;
    }

    public PmemDimmWhereInput numaNodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public PmemDimmWhereInput numaNodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public void setNumaNodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        }
    }

    public boolean getNumaNodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_IN);
    }

    public PmemDimmWhereInput numaNodeLt(Integer numaNodeLt) {

        this.numaNodeLt = numaNodeLt;
        return this;
    }

    /**
     * Get numaNodeLt
     *
     * @return numaNodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeLt() {
        return numaNodeLt;
    }

    public void setNumaNodeLt(Integer numaNodeLt) {
        this.numaNodeLt = numaNodeLt;
    }

    public PmemDimmWhereInput numaNodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public PmemDimmWhereInput numaNodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public void setNumaNodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        }
    }

    public boolean getNumaNodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LT);
    }

    public PmemDimmWhereInput numaNodeLte(Integer numaNodeLte) {

        this.numaNodeLte = numaNodeLte;
        return this;
    }

    /**
     * Get numaNodeLte
     *
     * @return numaNodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeLte() {
        return numaNodeLte;
    }

    public void setNumaNodeLte(Integer numaNodeLte) {
        this.numaNodeLte = numaNodeLte;
    }

    public PmemDimmWhereInput numaNodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public PmemDimmWhereInput numaNodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public void setNumaNodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        }
    }

    public boolean getNumaNodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LTE);
    }

    public PmemDimmWhereInput numaNodeNot(Integer numaNodeNot) {

        this.numaNodeNot = numaNodeNot;
        return this;
    }

    /**
     * Get numaNodeNot
     *
     * @return numaNodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeNot() {
        return numaNodeNot;
    }

    public void setNumaNodeNot(Integer numaNodeNot) {
        this.numaNodeNot = numaNodeNot;
    }

    public PmemDimmWhereInput numaNodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public PmemDimmWhereInput numaNodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public void setNumaNodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        }
    }

    public boolean getNumaNodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT);
    }

    public PmemDimmWhereInput numaNodeNotIn(List<Integer> numaNodeNotIn) {

        this.numaNodeNotIn = numaNodeNotIn;
        return this;
    }

    public PmemDimmWhereInput addNumaNodeNotInItem(Integer numaNodeNotInItem) {
        if (this.numaNodeNotIn == null) {
            this.numaNodeNotIn = new ArrayList<Integer>();
        }
        this.numaNodeNotIn.add(numaNodeNotInItem);
        return this;
    }

    /**
     * Get numaNodeNotIn
     *
     * @return numaNodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNumaNodeNotIn() {
        return numaNodeNotIn;
    }

    public void setNumaNodeNotIn(List<Integer> numaNodeNotIn) {
        this.numaNodeNotIn = numaNodeNotIn;
    }

    public PmemDimmWhereInput numaNodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput numaNodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public void setNumaNodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        }
    }

    public boolean getNumaNodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
    }

    public PmemDimmWhereInput partNumber(String partNumber) {

        this.partNumber = partNumber;
        return this;
    }

    /**
     * Get partNumber
     *
     * @return partNumber
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public PmemDimmWhereInput partNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER);
        return this;
    }

    public PmemDimmWhereInput partNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER);
        return this;
    }

    public void setPartNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER);
        }
    }

    public boolean getPartNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER);
    }

    public PmemDimmWhereInput partNumberContains(String partNumberContains) {

        this.partNumberContains = partNumberContains;
        return this;
    }

    /**
     * Get partNumberContains
     *
     * @return partNumberContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberContains() {
        return partNumberContains;
    }

    public void setPartNumberContains(String partNumberContains) {
        this.partNumberContains = partNumberContains;
    }

    public PmemDimmWhereInput partNumberContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput partNumberContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_CONTAINS);
        return this;
    }

    public void setPartNumberContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_CONTAINS);
        }
    }

    public boolean getPartNumberContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_CONTAINS);
    }

    public PmemDimmWhereInput partNumberEndsWith(String partNumberEndsWith) {

        this.partNumberEndsWith = partNumberEndsWith;
        return this;
    }

    /**
     * Get partNumberEndsWith
     *
     * @return partNumberEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberEndsWith() {
        return partNumberEndsWith;
    }

    public void setPartNumberEndsWith(String partNumberEndsWith) {
        this.partNumberEndsWith = partNumberEndsWith;
    }

    public PmemDimmWhereInput partNumberEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput partNumberEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH);
        return this;
    }

    public void setPartNumberEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH);
        }
    }

    public boolean getPartNumberEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_ENDS_WITH);
    }

    public PmemDimmWhereInput partNumberGt(String partNumberGt) {

        this.partNumberGt = partNumberGt;
        return this;
    }

    /**
     * Get partNumberGt
     *
     * @return partNumberGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberGt() {
        return partNumberGt;
    }

    public void setPartNumberGt(String partNumberGt) {
        this.partNumberGt = partNumberGt;
    }

    public PmemDimmWhereInput partNumberGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_GT);
        return this;
    }

    public PmemDimmWhereInput partNumberGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_GT);
        return this;
    }

    public void setPartNumberGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_GT);
        }
    }

    public boolean getPartNumberGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_GT);
    }

    public PmemDimmWhereInput partNumberGte(String partNumberGte) {

        this.partNumberGte = partNumberGte;
        return this;
    }

    /**
     * Get partNumberGte
     *
     * @return partNumberGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberGte() {
        return partNumberGte;
    }

    public void setPartNumberGte(String partNumberGte) {
        this.partNumberGte = partNumberGte;
    }

    public PmemDimmWhereInput partNumberGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_GTE);
        return this;
    }

    public PmemDimmWhereInput partNumberGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_GTE);
        return this;
    }

    public void setPartNumberGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_GTE);
        }
    }

    public boolean getPartNumberGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_GTE);
    }

    public PmemDimmWhereInput partNumberIn(List<String> partNumberIn) {

        this.partNumberIn = partNumberIn;
        return this;
    }

    public PmemDimmWhereInput addPartNumberInItem(String partNumberInItem) {
        if (this.partNumberIn == null) {
            this.partNumberIn = new ArrayList<String>();
        }
        this.partNumberIn.add(partNumberInItem);
        return this;
    }

    /**
     * Get partNumberIn
     *
     * @return partNumberIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPartNumberIn() {
        return partNumberIn;
    }

    public void setPartNumberIn(List<String> partNumberIn) {
        this.partNumberIn = partNumberIn;
    }

    public PmemDimmWhereInput partNumberIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_IN);
        return this;
    }

    public PmemDimmWhereInput partNumberIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_IN);
        return this;
    }

    public void setPartNumberIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_IN);
        }
    }

    public boolean getPartNumberIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_IN);
    }

    public PmemDimmWhereInput partNumberLt(String partNumberLt) {

        this.partNumberLt = partNumberLt;
        return this;
    }

    /**
     * Get partNumberLt
     *
     * @return partNumberLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberLt() {
        return partNumberLt;
    }

    public void setPartNumberLt(String partNumberLt) {
        this.partNumberLt = partNumberLt;
    }

    public PmemDimmWhereInput partNumberLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_LT);
        return this;
    }

    public PmemDimmWhereInput partNumberLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_LT);
        return this;
    }

    public void setPartNumberLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_LT);
        }
    }

    public boolean getPartNumberLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_LT);
    }

    public PmemDimmWhereInput partNumberLte(String partNumberLte) {

        this.partNumberLte = partNumberLte;
        return this;
    }

    /**
     * Get partNumberLte
     *
     * @return partNumberLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberLte() {
        return partNumberLte;
    }

    public void setPartNumberLte(String partNumberLte) {
        this.partNumberLte = partNumberLte;
    }

    public PmemDimmWhereInput partNumberLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_LTE);
        return this;
    }

    public PmemDimmWhereInput partNumberLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_LTE);
        return this;
    }

    public void setPartNumberLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_LTE);
        }
    }

    public boolean getPartNumberLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_LTE);
    }

    public PmemDimmWhereInput partNumberNot(String partNumberNot) {

        this.partNumberNot = partNumberNot;
        return this;
    }

    /**
     * Get partNumberNot
     *
     * @return partNumberNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberNot() {
        return partNumberNot;
    }

    public void setPartNumberNot(String partNumberNot) {
        this.partNumberNot = partNumberNot;
    }

    public PmemDimmWhereInput partNumberNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT);
        return this;
    }

    public PmemDimmWhereInput partNumberNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT);
        return this;
    }

    public void setPartNumberNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT);
        }
    }

    public boolean getPartNumberNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_NOT);
    }

    public PmemDimmWhereInput partNumberNotContains(String partNumberNotContains) {

        this.partNumberNotContains = partNumberNotContains;
        return this;
    }

    /**
     * Get partNumberNotContains
     *
     * @return partNumberNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberNotContains() {
        return partNumberNotContains;
    }

    public void setPartNumberNotContains(String partNumberNotContains) {
        this.partNumberNotContains = partNumberNotContains;
    }

    public PmemDimmWhereInput partNumberNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput partNumberNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS);
        return this;
    }

    public void setPartNumberNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS);
        }
    }

    public boolean getPartNumberNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_NOT_CONTAINS);
    }

    public PmemDimmWhereInput partNumberNotEndsWith(String partNumberNotEndsWith) {

        this.partNumberNotEndsWith = partNumberNotEndsWith;
        return this;
    }

    /**
     * Get partNumberNotEndsWith
     *
     * @return partNumberNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberNotEndsWith() {
        return partNumberNotEndsWith;
    }

    public void setPartNumberNotEndsWith(String partNumberNotEndsWith) {
        this.partNumberNotEndsWith = partNumberNotEndsWith;
    }

    public PmemDimmWhereInput partNumberNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput partNumberNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH);
        return this;
    }

    public void setPartNumberNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH);
        }
    }

    public boolean getPartNumberNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_NOT_ENDS_WITH);
    }

    public PmemDimmWhereInput partNumberNotIn(List<String> partNumberNotIn) {

        this.partNumberNotIn = partNumberNotIn;
        return this;
    }

    public PmemDimmWhereInput addPartNumberNotInItem(String partNumberNotInItem) {
        if (this.partNumberNotIn == null) {
            this.partNumberNotIn = new ArrayList<String>();
        }
        this.partNumberNotIn.add(partNumberNotInItem);
        return this;
    }

    /**
     * Get partNumberNotIn
     *
     * @return partNumberNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPartNumberNotIn() {
        return partNumberNotIn;
    }

    public void setPartNumberNotIn(List<String> partNumberNotIn) {
        this.partNumberNotIn = partNumberNotIn;
    }

    public PmemDimmWhereInput partNumberNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput partNumberNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_IN);
        return this;
    }

    public void setPartNumberNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_IN);
        }
    }

    public boolean getPartNumberNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_NOT_IN);
    }

    public PmemDimmWhereInput partNumberNotStartsWith(String partNumberNotStartsWith) {

        this.partNumberNotStartsWith = partNumberNotStartsWith;
        return this;
    }

    /**
     * Get partNumberNotStartsWith
     *
     * @return partNumberNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberNotStartsWith() {
        return partNumberNotStartsWith;
    }

    public void setPartNumberNotStartsWith(String partNumberNotStartsWith) {
        this.partNumberNotStartsWith = partNumberNotStartsWith;
    }

    public PmemDimmWhereInput partNumberNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput partNumberNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH);
        return this;
    }

    public void setPartNumberNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH);
        }
    }

    public boolean getPartNumberNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_NOT_STARTS_WITH);
    }

    public PmemDimmWhereInput partNumberStartsWith(String partNumberStartsWith) {

        this.partNumberStartsWith = partNumberStartsWith;
        return this;
    }

    /**
     * Get partNumberStartsWith
     *
     * @return partNumberStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPartNumberStartsWith() {
        return partNumberStartsWith;
    }

    public void setPartNumberStartsWith(String partNumberStartsWith) {
        this.partNumberStartsWith = partNumberStartsWith;
    }

    public PmemDimmWhereInput partNumberStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput partNumberStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH);
        return this;
    }

    public void setPartNumberStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH);
        }
    }

    public boolean getPartNumberStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PART_NUMBER_STARTS_WITH);
    }

    public PmemDimmWhereInput remainingLifePercent(Integer remainingLifePercent) {

        this.remainingLifePercent = remainingLifePercent;
        return this;
    }

    /**
     * Get remainingLifePercent
     *
     * @return remainingLifePercent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercent() {
        return remainingLifePercent;
    }

    public void setRemainingLifePercent(Integer remainingLifePercent) {
        this.remainingLifePercent = remainingLifePercent;
    }

    public PmemDimmWhereInput remainingLifePercent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public void setRemainingLifePercent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        }
    }

    public boolean getRemainingLifePercent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
    }

    public PmemDimmWhereInput remainingLifePercentGt(Integer remainingLifePercentGt) {

        this.remainingLifePercentGt = remainingLifePercentGt;
        return this;
    }

    /**
     * Get remainingLifePercentGt
     *
     * @return remainingLifePercentGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentGt() {
        return remainingLifePercentGt;
    }

    public void setRemainingLifePercentGt(Integer remainingLifePercentGt) {
        this.remainingLifePercentGt = remainingLifePercentGt;
    }

    public PmemDimmWhereInput remainingLifePercentGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        return this;
    }

    public void setRemainingLifePercentGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        }
    }

    public boolean getRemainingLifePercentGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
    }

    public PmemDimmWhereInput remainingLifePercentGte(Integer remainingLifePercentGte) {

        this.remainingLifePercentGte = remainingLifePercentGte;
        return this;
    }

    /**
     * Get remainingLifePercentGte
     *
     * @return remainingLifePercentGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentGte() {
        return remainingLifePercentGte;
    }

    public void setRemainingLifePercentGte(Integer remainingLifePercentGte) {
        this.remainingLifePercentGte = remainingLifePercentGte;
    }

    public PmemDimmWhereInput remainingLifePercentGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        return this;
    }

    public void setRemainingLifePercentGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        }
    }

    public boolean getRemainingLifePercentGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
    }

    public PmemDimmWhereInput remainingLifePercentIn(List<Integer> remainingLifePercentIn) {

        this.remainingLifePercentIn = remainingLifePercentIn;
        return this;
    }

    public PmemDimmWhereInput addRemainingLifePercentInItem(Integer remainingLifePercentInItem) {
        if (this.remainingLifePercentIn == null) {
            this.remainingLifePercentIn = new ArrayList<Integer>();
        }
        this.remainingLifePercentIn.add(remainingLifePercentInItem);
        return this;
    }

    /**
     * Get remainingLifePercentIn
     *
     * @return remainingLifePercentIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainingLifePercentIn() {
        return remainingLifePercentIn;
    }

    public void setRemainingLifePercentIn(List<Integer> remainingLifePercentIn) {
        this.remainingLifePercentIn = remainingLifePercentIn;
    }

    public PmemDimmWhereInput remainingLifePercentIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        return this;
    }

    public void setRemainingLifePercentIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        }
    }

    public boolean getRemainingLifePercentIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
    }

    public PmemDimmWhereInput remainingLifePercentLt(Integer remainingLifePercentLt) {

        this.remainingLifePercentLt = remainingLifePercentLt;
        return this;
    }

    /**
     * Get remainingLifePercentLt
     *
     * @return remainingLifePercentLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentLt() {
        return remainingLifePercentLt;
    }

    public void setRemainingLifePercentLt(Integer remainingLifePercentLt) {
        this.remainingLifePercentLt = remainingLifePercentLt;
    }

    public PmemDimmWhereInput remainingLifePercentLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        return this;
    }

    public void setRemainingLifePercentLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        }
    }

    public boolean getRemainingLifePercentLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
    }

    public PmemDimmWhereInput remainingLifePercentLte(Integer remainingLifePercentLte) {

        this.remainingLifePercentLte = remainingLifePercentLte;
        return this;
    }

    /**
     * Get remainingLifePercentLte
     *
     * @return remainingLifePercentLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentLte() {
        return remainingLifePercentLte;
    }

    public void setRemainingLifePercentLte(Integer remainingLifePercentLte) {
        this.remainingLifePercentLte = remainingLifePercentLte;
    }

    public PmemDimmWhereInput remainingLifePercentLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        return this;
    }

    public void setRemainingLifePercentLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        }
    }

    public boolean getRemainingLifePercentLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
    }

    public PmemDimmWhereInput remainingLifePercentNot(Integer remainingLifePercentNot) {

        this.remainingLifePercentNot = remainingLifePercentNot;
        return this;
    }

    /**
     * Get remainingLifePercentNot
     *
     * @return remainingLifePercentNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentNot() {
        return remainingLifePercentNot;
    }

    public void setRemainingLifePercentNot(Integer remainingLifePercentNot) {
        this.remainingLifePercentNot = remainingLifePercentNot;
    }

    public PmemDimmWhereInput remainingLifePercentNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        return this;
    }

    public void setRemainingLifePercentNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        }
    }

    public boolean getRemainingLifePercentNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
    }

    public PmemDimmWhereInput remainingLifePercentNotIn(List<Integer> remainingLifePercentNotIn) {

        this.remainingLifePercentNotIn = remainingLifePercentNotIn;
        return this;
    }

    public PmemDimmWhereInput addRemainingLifePercentNotInItem(
            Integer remainingLifePercentNotInItem) {
        if (this.remainingLifePercentNotIn == null) {
            this.remainingLifePercentNotIn = new ArrayList<Integer>();
        }
        this.remainingLifePercentNotIn.add(remainingLifePercentNotInItem);
        return this;
    }

    /**
     * Get remainingLifePercentNotIn
     *
     * @return remainingLifePercentNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainingLifePercentNotIn() {
        return remainingLifePercentNotIn;
    }

    public void setRemainingLifePercentNotIn(List<Integer> remainingLifePercentNotIn) {
        this.remainingLifePercentNotIn = remainingLifePercentNotIn;
    }

    public PmemDimmWhereInput remainingLifePercentNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput remainingLifePercentNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        return this;
    }

    public void setRemainingLifePercentNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        }
    }

    public boolean getRemainingLifePercentNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
    }

    public PmemDimmWhereInput version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PmemDimmWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public PmemDimmWhereInput version_ExplictlyNonNull() {
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

    public PmemDimmWhereInput versionContains(String versionContains) {

        this.versionContains = versionContains;
        return this;
    }

    /**
     * Get versionContains
     *
     * @return versionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionContains() {
        return versionContains;
    }

    public void setVersionContains(String versionContains) {
        this.versionContains = versionContains;
    }

    public PmemDimmWhereInput versionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput versionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public void setVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        }
    }

    public boolean getVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_CONTAINS);
    }

    public PmemDimmWhereInput versionEndsWith(String versionEndsWith) {

        this.versionEndsWith = versionEndsWith;
        return this;
    }

    /**
     * Get versionEndsWith
     *
     * @return versionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionEndsWith() {
        return versionEndsWith;
    }

    public void setVersionEndsWith(String versionEndsWith) {
        this.versionEndsWith = versionEndsWith;
    }

    public PmemDimmWhereInput versionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput versionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public void setVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        }
    }

    public boolean getVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_ENDS_WITH);
    }

    public PmemDimmWhereInput versionGt(String versionGt) {

        this.versionGt = versionGt;
        return this;
    }

    /**
     * Get versionGt
     *
     * @return versionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(String versionGt) {
        this.versionGt = versionGt;
    }

    public PmemDimmWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public PmemDimmWhereInput versionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public void setVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        }
    }

    public boolean getVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GT);
    }

    public PmemDimmWhereInput versionGte(String versionGte) {

        this.versionGte = versionGte;
        return this;
    }

    /**
     * Get versionGte
     *
     * @return versionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(String versionGte) {
        this.versionGte = versionGte;
    }

    public PmemDimmWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public PmemDimmWhereInput versionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public void setVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        }
    }

    public boolean getVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GTE);
    }

    public PmemDimmWhereInput versionIn(List<String> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public PmemDimmWhereInput addVersionInItem(String versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<String>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<String> versionIn) {
        this.versionIn = versionIn;
    }

    public PmemDimmWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public PmemDimmWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public PmemDimmWhereInput versionLt(String versionLt) {

        this.versionLt = versionLt;
        return this;
    }

    /**
     * Get versionLt
     *
     * @return versionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(String versionLt) {
        this.versionLt = versionLt;
    }

    public PmemDimmWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public PmemDimmWhereInput versionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public void setVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        }
    }

    public boolean getVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LT);
    }

    public PmemDimmWhereInput versionLte(String versionLte) {

        this.versionLte = versionLte;
        return this;
    }

    /**
     * Get versionLte
     *
     * @return versionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(String versionLte) {
        this.versionLte = versionLte;
    }

    public PmemDimmWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public PmemDimmWhereInput versionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public void setVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        }
    }

    public boolean getVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LTE);
    }

    public PmemDimmWhereInput versionNot(String versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(String versionNot) {
        this.versionNot = versionNot;
    }

    public PmemDimmWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public PmemDimmWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public PmemDimmWhereInput versionNotContains(String versionNotContains) {

        this.versionNotContains = versionNotContains;
        return this;
    }

    /**
     * Get versionNotContains
     *
     * @return versionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotContains() {
        return versionNotContains;
    }

    public void setVersionNotContains(String versionNotContains) {
        this.versionNotContains = versionNotContains;
    }

    public PmemDimmWhereInput versionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public PmemDimmWhereInput versionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
    }

    public PmemDimmWhereInput versionNotEndsWith(String versionNotEndsWith) {

        this.versionNotEndsWith = versionNotEndsWith;
        return this;
    }

    /**
     * Get versionNotEndsWith
     *
     * @return versionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotEndsWith() {
        return versionNotEndsWith;
    }

    public void setVersionNotEndsWith(String versionNotEndsWith) {
        this.versionNotEndsWith = versionNotEndsWith;
    }

    public PmemDimmWhereInput versionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public PmemDimmWhereInput versionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
    }

    public PmemDimmWhereInput versionNotIn(List<String> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public PmemDimmWhereInput addVersionNotInItem(String versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<String>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<String> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public PmemDimmWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public PmemDimmWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    public PmemDimmWhereInput versionNotStartsWith(String versionNotStartsWith) {

        this.versionNotStartsWith = versionNotStartsWith;
        return this;
    }

    /**
     * Get versionNotStartsWith
     *
     * @return versionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotStartsWith() {
        return versionNotStartsWith;
    }

    public void setVersionNotStartsWith(String versionNotStartsWith) {
        this.versionNotStartsWith = versionNotStartsWith;
    }

    public PmemDimmWhereInput versionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput versionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
    }

    public PmemDimmWhereInput versionStartsWith(String versionStartsWith) {

        this.versionStartsWith = versionStartsWith;
        return this;
    }

    /**
     * Get versionStartsWith
     *
     * @return versionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionStartsWith() {
        return versionStartsWith;
    }

    public void setVersionStartsWith(String versionStartsWith) {
        this.versionStartsWith = versionStartsWith;
    }

    public PmemDimmWhereInput versionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public PmemDimmWhereInput versionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public void setVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        }
    }

    public boolean getVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PmemDimmWhereInput pmemDimmWhereInput = (PmemDimmWhereInput) o;
        return Objects.equals(this.AND, pmemDimmWhereInput.AND)
                && Objects.equals(this.NOT, pmemDimmWhereInput.NOT)
                && Objects.equals(this.OR, pmemDimmWhereInput.OR)
                && Objects.equals(this.capacity, pmemDimmWhereInput.capacity)
                && Objects.equals(this.capacityGt, pmemDimmWhereInput.capacityGt)
                && Objects.equals(this.capacityGte, pmemDimmWhereInput.capacityGte)
                && Objects.equals(this.capacityIn, pmemDimmWhereInput.capacityIn)
                && Objects.equals(this.capacityLt, pmemDimmWhereInput.capacityLt)
                && Objects.equals(this.capacityLte, pmemDimmWhereInput.capacityLte)
                && Objects.equals(this.capacityNot, pmemDimmWhereInput.capacityNot)
                && Objects.equals(this.capacityNotIn, pmemDimmWhereInput.capacityNotIn)
                && Objects.equals(this.deviceLocator, pmemDimmWhereInput.deviceLocator)
                && Objects.equals(
                        this.deviceLocatorContains, pmemDimmWhereInput.deviceLocatorContains)
                && Objects.equals(
                        this.deviceLocatorEndsWith, pmemDimmWhereInput.deviceLocatorEndsWith)
                && Objects.equals(this.deviceLocatorGt, pmemDimmWhereInput.deviceLocatorGt)
                && Objects.equals(this.deviceLocatorGte, pmemDimmWhereInput.deviceLocatorGte)
                && Objects.equals(this.deviceLocatorIn, pmemDimmWhereInput.deviceLocatorIn)
                && Objects.equals(this.deviceLocatorLt, pmemDimmWhereInput.deviceLocatorLt)
                && Objects.equals(this.deviceLocatorLte, pmemDimmWhereInput.deviceLocatorLte)
                && Objects.equals(this.deviceLocatorNot, pmemDimmWhereInput.deviceLocatorNot)
                && Objects.equals(
                        this.deviceLocatorNotContains, pmemDimmWhereInput.deviceLocatorNotContains)
                && Objects.equals(
                        this.deviceLocatorNotEndsWith, pmemDimmWhereInput.deviceLocatorNotEndsWith)
                && Objects.equals(this.deviceLocatorNotIn, pmemDimmWhereInput.deviceLocatorNotIn)
                && Objects.equals(
                        this.deviceLocatorNotStartsWith,
                        pmemDimmWhereInput.deviceLocatorNotStartsWith)
                && Objects.equals(
                        this.deviceLocatorStartsWith, pmemDimmWhereInput.deviceLocatorStartsWith)
                && Objects.equals(this.disk, pmemDimmWhereInput.disk)
                && Objects.equals(this.healthStatus, pmemDimmWhereInput.healthStatus)
                && Objects.equals(this.healthStatusIn, pmemDimmWhereInput.healthStatusIn)
                && Objects.equals(this.healthStatusNot, pmemDimmWhereInput.healthStatusNot)
                && Objects.equals(this.healthStatusNotIn, pmemDimmWhereInput.healthStatusNotIn)
                && Objects.equals(this.host, pmemDimmWhereInput.host)
                && Objects.equals(this.id, pmemDimmWhereInput.id)
                && Objects.equals(this.idContains, pmemDimmWhereInput.idContains)
                && Objects.equals(this.idEndsWith, pmemDimmWhereInput.idEndsWith)
                && Objects.equals(this.idGt, pmemDimmWhereInput.idGt)
                && Objects.equals(this.idGte, pmemDimmWhereInput.idGte)
                && Objects.equals(this.idIn, pmemDimmWhereInput.idIn)
                && Objects.equals(this.idLt, pmemDimmWhereInput.idLt)
                && Objects.equals(this.idLte, pmemDimmWhereInput.idLte)
                && Objects.equals(this.idNot, pmemDimmWhereInput.idNot)
                && Objects.equals(this.idNotContains, pmemDimmWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, pmemDimmWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, pmemDimmWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, pmemDimmWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, pmemDimmWhereInput.idStartsWith)
                && Objects.equals(this.localId, pmemDimmWhereInput.localId)
                && Objects.equals(this.localIdContains, pmemDimmWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, pmemDimmWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, pmemDimmWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, pmemDimmWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, pmemDimmWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, pmemDimmWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, pmemDimmWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, pmemDimmWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, pmemDimmWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, pmemDimmWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, pmemDimmWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, pmemDimmWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, pmemDimmWhereInput.localIdStartsWith)
                && Objects.equals(this.name, pmemDimmWhereInput.name)
                && Objects.equals(this.nameContains, pmemDimmWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, pmemDimmWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, pmemDimmWhereInput.nameGt)
                && Objects.equals(this.nameGte, pmemDimmWhereInput.nameGte)
                && Objects.equals(this.nameIn, pmemDimmWhereInput.nameIn)
                && Objects.equals(this.nameLt, pmemDimmWhereInput.nameLt)
                && Objects.equals(this.nameLte, pmemDimmWhereInput.nameLte)
                && Objects.equals(this.nameNot, pmemDimmWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, pmemDimmWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, pmemDimmWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, pmemDimmWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, pmemDimmWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, pmemDimmWhereInput.nameStartsWith)
                && Objects.equals(this.numaNode, pmemDimmWhereInput.numaNode)
                && Objects.equals(this.numaNodeGt, pmemDimmWhereInput.numaNodeGt)
                && Objects.equals(this.numaNodeGte, pmemDimmWhereInput.numaNodeGte)
                && Objects.equals(this.numaNodeIn, pmemDimmWhereInput.numaNodeIn)
                && Objects.equals(this.numaNodeLt, pmemDimmWhereInput.numaNodeLt)
                && Objects.equals(this.numaNodeLte, pmemDimmWhereInput.numaNodeLte)
                && Objects.equals(this.numaNodeNot, pmemDimmWhereInput.numaNodeNot)
                && Objects.equals(this.numaNodeNotIn, pmemDimmWhereInput.numaNodeNotIn)
                && Objects.equals(this.partNumber, pmemDimmWhereInput.partNumber)
                && Objects.equals(this.partNumberContains, pmemDimmWhereInput.partNumberContains)
                && Objects.equals(this.partNumberEndsWith, pmemDimmWhereInput.partNumberEndsWith)
                && Objects.equals(this.partNumberGt, pmemDimmWhereInput.partNumberGt)
                && Objects.equals(this.partNumberGte, pmemDimmWhereInput.partNumberGte)
                && Objects.equals(this.partNumberIn, pmemDimmWhereInput.partNumberIn)
                && Objects.equals(this.partNumberLt, pmemDimmWhereInput.partNumberLt)
                && Objects.equals(this.partNumberLte, pmemDimmWhereInput.partNumberLte)
                && Objects.equals(this.partNumberNot, pmemDimmWhereInput.partNumberNot)
                && Objects.equals(
                        this.partNumberNotContains, pmemDimmWhereInput.partNumberNotContains)
                && Objects.equals(
                        this.partNumberNotEndsWith, pmemDimmWhereInput.partNumberNotEndsWith)
                && Objects.equals(this.partNumberNotIn, pmemDimmWhereInput.partNumberNotIn)
                && Objects.equals(
                        this.partNumberNotStartsWith, pmemDimmWhereInput.partNumberNotStartsWith)
                && Objects.equals(
                        this.partNumberStartsWith, pmemDimmWhereInput.partNumberStartsWith)
                && Objects.equals(
                        this.remainingLifePercent, pmemDimmWhereInput.remainingLifePercent)
                && Objects.equals(
                        this.remainingLifePercentGt, pmemDimmWhereInput.remainingLifePercentGt)
                && Objects.equals(
                        this.remainingLifePercentGte, pmemDimmWhereInput.remainingLifePercentGte)
                && Objects.equals(
                        this.remainingLifePercentIn, pmemDimmWhereInput.remainingLifePercentIn)
                && Objects.equals(
                        this.remainingLifePercentLt, pmemDimmWhereInput.remainingLifePercentLt)
                && Objects.equals(
                        this.remainingLifePercentLte, pmemDimmWhereInput.remainingLifePercentLte)
                && Objects.equals(
                        this.remainingLifePercentNot, pmemDimmWhereInput.remainingLifePercentNot)
                && Objects.equals(
                        this.remainingLifePercentNotIn,
                        pmemDimmWhereInput.remainingLifePercentNotIn)
                && Objects.equals(this.version, pmemDimmWhereInput.version)
                && Objects.equals(this.versionContains, pmemDimmWhereInput.versionContains)
                && Objects.equals(this.versionEndsWith, pmemDimmWhereInput.versionEndsWith)
                && Objects.equals(this.versionGt, pmemDimmWhereInput.versionGt)
                && Objects.equals(this.versionGte, pmemDimmWhereInput.versionGte)
                && Objects.equals(this.versionIn, pmemDimmWhereInput.versionIn)
                && Objects.equals(this.versionLt, pmemDimmWhereInput.versionLt)
                && Objects.equals(this.versionLte, pmemDimmWhereInput.versionLte)
                && Objects.equals(this.versionNot, pmemDimmWhereInput.versionNot)
                && Objects.equals(this.versionNotContains, pmemDimmWhereInput.versionNotContains)
                && Objects.equals(this.versionNotEndsWith, pmemDimmWhereInput.versionNotEndsWith)
                && Objects.equals(this.versionNotIn, pmemDimmWhereInput.versionNotIn)
                && Objects.equals(
                        this.versionNotStartsWith, pmemDimmWhereInput.versionNotStartsWith)
                && Objects.equals(this.versionStartsWith, pmemDimmWhereInput.versionStartsWith);
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
                capacity,
                capacityGt,
                capacityGte,
                capacityIn,
                capacityLt,
                capacityLte,
                capacityNot,
                capacityNotIn,
                deviceLocator,
                deviceLocatorContains,
                deviceLocatorEndsWith,
                deviceLocatorGt,
                deviceLocatorGte,
                deviceLocatorIn,
                deviceLocatorLt,
                deviceLocatorLte,
                deviceLocatorNot,
                deviceLocatorNotContains,
                deviceLocatorNotEndsWith,
                deviceLocatorNotIn,
                deviceLocatorNotStartsWith,
                deviceLocatorStartsWith,
                disk,
                healthStatus,
                healthStatusIn,
                healthStatusNot,
                healthStatusNotIn,
                host,
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
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
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
                numaNode,
                numaNodeGt,
                numaNodeGte,
                numaNodeIn,
                numaNodeLt,
                numaNodeLte,
                numaNodeNot,
                numaNodeNotIn,
                partNumber,
                partNumberContains,
                partNumberEndsWith,
                partNumberGt,
                partNumberGte,
                partNumberIn,
                partNumberLt,
                partNumberLte,
                partNumberNot,
                partNumberNotContains,
                partNumberNotEndsWith,
                partNumberNotIn,
                partNumberNotStartsWith,
                partNumberStartsWith,
                remainingLifePercent,
                remainingLifePercentGt,
                remainingLifePercentGte,
                remainingLifePercentIn,
                remainingLifePercentLt,
                remainingLifePercentLte,
                remainingLifePercentNot,
                remainingLifePercentNotIn,
                version,
                versionContains,
                versionEndsWith,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotContains,
                versionNotEndsWith,
                versionNotIn,
                versionNotStartsWith,
                versionStartsWith);
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
        sb.append("class PmemDimmWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    capacityGt: ").append(toIndentedString(capacityGt)).append("\n");
        sb.append("    capacityGte: ").append(toIndentedString(capacityGte)).append("\n");
        sb.append("    capacityIn: ").append(toIndentedString(capacityIn)).append("\n");
        sb.append("    capacityLt: ").append(toIndentedString(capacityLt)).append("\n");
        sb.append("    capacityLte: ").append(toIndentedString(capacityLte)).append("\n");
        sb.append("    capacityNot: ").append(toIndentedString(capacityNot)).append("\n");
        sb.append("    capacityNotIn: ").append(toIndentedString(capacityNotIn)).append("\n");
        sb.append("    deviceLocator: ").append(toIndentedString(deviceLocator)).append("\n");
        sb.append("    deviceLocatorContains: ")
                .append(toIndentedString(deviceLocatorContains))
                .append("\n");
        sb.append("    deviceLocatorEndsWith: ")
                .append(toIndentedString(deviceLocatorEndsWith))
                .append("\n");
        sb.append("    deviceLocatorGt: ").append(toIndentedString(deviceLocatorGt)).append("\n");
        sb.append("    deviceLocatorGte: ").append(toIndentedString(deviceLocatorGte)).append("\n");
        sb.append("    deviceLocatorIn: ").append(toIndentedString(deviceLocatorIn)).append("\n");
        sb.append("    deviceLocatorLt: ").append(toIndentedString(deviceLocatorLt)).append("\n");
        sb.append("    deviceLocatorLte: ").append(toIndentedString(deviceLocatorLte)).append("\n");
        sb.append("    deviceLocatorNot: ").append(toIndentedString(deviceLocatorNot)).append("\n");
        sb.append("    deviceLocatorNotContains: ")
                .append(toIndentedString(deviceLocatorNotContains))
                .append("\n");
        sb.append("    deviceLocatorNotEndsWith: ")
                .append(toIndentedString(deviceLocatorNotEndsWith))
                .append("\n");
        sb.append("    deviceLocatorNotIn: ")
                .append(toIndentedString(deviceLocatorNotIn))
                .append("\n");
        sb.append("    deviceLocatorNotStartsWith: ")
                .append(toIndentedString(deviceLocatorNotStartsWith))
                .append("\n");
        sb.append("    deviceLocatorStartsWith: ")
                .append(toIndentedString(deviceLocatorStartsWith))
                .append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    healthStatusIn: ").append(toIndentedString(healthStatusIn)).append("\n");
        sb.append("    healthStatusNot: ").append(toIndentedString(healthStatusNot)).append("\n");
        sb.append("    healthStatusNotIn: ")
                .append(toIndentedString(healthStatusNotIn))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
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
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    numaNodeGt: ").append(toIndentedString(numaNodeGt)).append("\n");
        sb.append("    numaNodeGte: ").append(toIndentedString(numaNodeGte)).append("\n");
        sb.append("    numaNodeIn: ").append(toIndentedString(numaNodeIn)).append("\n");
        sb.append("    numaNodeLt: ").append(toIndentedString(numaNodeLt)).append("\n");
        sb.append("    numaNodeLte: ").append(toIndentedString(numaNodeLte)).append("\n");
        sb.append("    numaNodeNot: ").append(toIndentedString(numaNodeNot)).append("\n");
        sb.append("    numaNodeNotIn: ").append(toIndentedString(numaNodeNotIn)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    partNumberContains: ")
                .append(toIndentedString(partNumberContains))
                .append("\n");
        sb.append("    partNumberEndsWith: ")
                .append(toIndentedString(partNumberEndsWith))
                .append("\n");
        sb.append("    partNumberGt: ").append(toIndentedString(partNumberGt)).append("\n");
        sb.append("    partNumberGte: ").append(toIndentedString(partNumberGte)).append("\n");
        sb.append("    partNumberIn: ").append(toIndentedString(partNumberIn)).append("\n");
        sb.append("    partNumberLt: ").append(toIndentedString(partNumberLt)).append("\n");
        sb.append("    partNumberLte: ").append(toIndentedString(partNumberLte)).append("\n");
        sb.append("    partNumberNot: ").append(toIndentedString(partNumberNot)).append("\n");
        sb.append("    partNumberNotContains: ")
                .append(toIndentedString(partNumberNotContains))
                .append("\n");
        sb.append("    partNumberNotEndsWith: ")
                .append(toIndentedString(partNumberNotEndsWith))
                .append("\n");
        sb.append("    partNumberNotIn: ").append(toIndentedString(partNumberNotIn)).append("\n");
        sb.append("    partNumberNotStartsWith: ")
                .append(toIndentedString(partNumberNotStartsWith))
                .append("\n");
        sb.append("    partNumberStartsWith: ")
                .append(toIndentedString(partNumberStartsWith))
                .append("\n");
        sb.append("    remainingLifePercent: ")
                .append(toIndentedString(remainingLifePercent))
                .append("\n");
        sb.append("    remainingLifePercentGt: ")
                .append(toIndentedString(remainingLifePercentGt))
                .append("\n");
        sb.append("    remainingLifePercentGte: ")
                .append(toIndentedString(remainingLifePercentGte))
                .append("\n");
        sb.append("    remainingLifePercentIn: ")
                .append(toIndentedString(remainingLifePercentIn))
                .append("\n");
        sb.append("    remainingLifePercentLt: ")
                .append(toIndentedString(remainingLifePercentLt))
                .append("\n");
        sb.append("    remainingLifePercentLte: ")
                .append(toIndentedString(remainingLifePercentLte))
                .append("\n");
        sb.append("    remainingLifePercentNot: ")
                .append(toIndentedString(remainingLifePercentNot))
                .append("\n");
        sb.append("    remainingLifePercentNotIn: ")
                .append(toIndentedString(remainingLifePercentNotIn))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
        sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotContains: ")
                .append(toIndentedString(versionNotContains))
                .append("\n");
        sb.append("    versionNotEndsWith: ")
                .append(toIndentedString(versionNotEndsWith))
                .append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    versionNotStartsWith: ")
                .append(toIndentedString(versionNotStartsWith))
                .append("\n");
        sb.append("    versionStartsWith: ")
                .append(toIndentedString(versionStartsWith))
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
