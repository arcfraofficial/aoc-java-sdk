package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteClusterAgentStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteClusterAgentStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CURRENT_NUMBER = "currentNumber";

    @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER)
    private Integer currentNumber;

    public static final String SERIALIZED_NAME_EXPECT_NUMBER = "expectNumber";

    @SerializedName(SERIALIZED_NAME_EXPECT_NUMBER)
    private Integer expectNumber;

    public static final String SERIALIZED_NAME_INSTANCES = "instances";

    @SerializedName(SERIALIZED_NAME_INSTANCES)
    private List<NestedEverouteAgentStatus> instances = null;

    public static final String SERIALIZED_NAME_MANAGE_V_D_SES = "manageVDSes";

    @SerializedName(SERIALIZED_NAME_MANAGE_V_D_SES)
    private List<NestedEverouteManageVDSStatus> manageVDSes = null;

    public static final String SERIALIZED_NAME_NUMBER_HEALTH = "numberHealth";

    @SerializedName(SERIALIZED_NAME_NUMBER_HEALTH)
    private Integer numberHealth;

    public NestedEverouteClusterAgentStatus() {}

    public NestedEverouteClusterAgentStatus currentNumber(Integer currentNumber) {

        this.currentNumber = currentNumber;
        return this;
    }

    /**
     * Get currentNumber
     *
     * @return currentNumber
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    public NestedEverouteClusterAgentStatus currentNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_NUMBER);
        return this;
    }

    public NestedEverouteClusterAgentStatus currentNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_NUMBER);
        return this;
    }

    public void setCurrentNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_NUMBER);
        }
    }

    public boolean getCurrentNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_NUMBER);
    }

    public NestedEverouteClusterAgentStatus expectNumber(Integer expectNumber) {

        this.expectNumber = expectNumber;
        return this;
    }

    /**
     * Get expectNumber
     *
     * @return expectNumber
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getExpectNumber() {
        return expectNumber;
    }

    public void setExpectNumber(Integer expectNumber) {
        this.expectNumber = expectNumber;
    }

    public NestedEverouteClusterAgentStatus expectNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPECT_NUMBER);
        return this;
    }

    public NestedEverouteClusterAgentStatus expectNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPECT_NUMBER);
        return this;
    }

    public void setExpectNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPECT_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPECT_NUMBER);
        }
    }

    public boolean getExpectNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPECT_NUMBER);
    }

    public NestedEverouteClusterAgentStatus instances(List<NestedEverouteAgentStatus> instances) {

        this.instances = instances;
        return this;
    }

    public NestedEverouteClusterAgentStatus addInstancesItem(
            NestedEverouteAgentStatus instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<NestedEverouteAgentStatus>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Get instances
     *
     * @return instances
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedEverouteAgentStatus> getInstances() {
        return instances;
    }

    public void setInstances(List<NestedEverouteAgentStatus> instances) {
        this.instances = instances;
    }

    public NestedEverouteClusterAgentStatus instances_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public NestedEverouteClusterAgentStatus instances_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public void setInstances_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        }
    }

    public boolean getInstances_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCES);
    }

    public NestedEverouteClusterAgentStatus manageVDSes(
            List<NestedEverouteManageVDSStatus> manageVDSes) {

        this.manageVDSes = manageVDSes;
        return this;
    }

    public NestedEverouteClusterAgentStatus addManageVDSesItem(
            NestedEverouteManageVDSStatus manageVDSesItem) {
        if (this.manageVDSes == null) {
            this.manageVDSes = new ArrayList<NestedEverouteManageVDSStatus>();
        }
        this.manageVDSes.add(manageVDSesItem);
        return this;
    }

    /**
     * Get manageVDSes
     *
     * @return manageVDSes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedEverouteManageVDSStatus> getManageVDSes() {
        return manageVDSes;
    }

    public void setManageVDSes(List<NestedEverouteManageVDSStatus> manageVDSes) {
        this.manageVDSes = manageVDSes;
    }

    public NestedEverouteClusterAgentStatus manageVDSes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGE_V_D_SES);
        return this;
    }

    public NestedEverouteClusterAgentStatus manageVDSes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGE_V_D_SES);
        return this;
    }

    public void setManageVDSes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGE_V_D_SES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGE_V_D_SES);
        }
    }

    public boolean getManageVDSes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGE_V_D_SES);
    }

    public NestedEverouteClusterAgentStatus numberHealth(Integer numberHealth) {

        this.numberHealth = numberHealth;
        return this;
    }

    /**
     * Get numberHealth
     *
     * @return numberHealth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumberHealth() {
        return numberHealth;
    }

    public void setNumberHealth(Integer numberHealth) {
        this.numberHealth = numberHealth;
    }

    public NestedEverouteClusterAgentStatus numberHealth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMBER_HEALTH);
        return this;
    }

    public NestedEverouteClusterAgentStatus numberHealth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMBER_HEALTH);
        return this;
    }

    public void setNumberHealth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMBER_HEALTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMBER_HEALTH);
        }
    }

    public boolean getNumberHealth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMBER_HEALTH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteClusterAgentStatus nestedEverouteClusterAgentStatus =
                (NestedEverouteClusterAgentStatus) o;
        return Objects.equals(this.currentNumber, nestedEverouteClusterAgentStatus.currentNumber)
                && Objects.equals(this.expectNumber, nestedEverouteClusterAgentStatus.expectNumber)
                && Objects.equals(this.instances, nestedEverouteClusterAgentStatus.instances)
                && Objects.equals(this.manageVDSes, nestedEverouteClusterAgentStatus.manageVDSes)
                && Objects.equals(this.numberHealth, nestedEverouteClusterAgentStatus.numberHealth);
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
        return Objects.hash(currentNumber, expectNumber, instances, manageVDSes, numberHealth);
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
        sb.append("class NestedEverouteClusterAgentStatus {\n");
        sb.append("    currentNumber: ").append(toIndentedString(currentNumber)).append("\n");
        sb.append("    expectNumber: ").append(toIndentedString(expectNumber)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    manageVDSes: ").append(toIndentedString(manageVDSes)).append("\n");
        sb.append("    numberHealth: ").append(toIndentedString(numberHealth)).append("\n");
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
