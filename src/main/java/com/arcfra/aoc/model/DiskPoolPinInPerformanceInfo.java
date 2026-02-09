package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DiskPoolPinInPerformanceInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskPoolPinInPerformanceInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE =
            "planned_prioritized_space";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE)
    private Long plannedPrioritizedSpace;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public DiskPoolPinInPerformanceInfo() {}

    public DiskPoolPinInPerformanceInfo plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
        return this;
    }

    /**
     * Get plannedPrioritizedSpace
     *
     * @return plannedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpace() {
        return plannedPrioritizedSpace;
    }

    public void setPlannedPrioritizedSpace(Long plannedPrioritizedSpace) {
        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
    }

    public DiskPoolPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public DiskPoolPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public void setPlannedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        }
    }

    public boolean getPlannedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
    }

    public DiskPoolPinInPerformanceInfo prioSpacePercentage(Double prioSpacePercentage) {

        this.prioSpacePercentage = prioSpacePercentage;
        return this;
    }

    /**
     * Get prioSpacePercentage
     *
     * @return prioSpacePercentage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentage() {
        return prioSpacePercentage;
    }

    public void setPrioSpacePercentage(Double prioSpacePercentage) {
        this.prioSpacePercentage = prioSpacePercentage;
    }

    public DiskPoolPinInPerformanceInfo prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public DiskPoolPinInPerformanceInfo prioSpacePercentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public void setPrioSpacePercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        }
    }

    public boolean getPrioSpacePercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
    }

    public DiskPoolPinInPerformanceInfo id(String id) {

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

    public DiskPoolPinInPerformanceInfo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DiskPoolPinInPerformanceInfo id_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskPoolPinInPerformanceInfo diskPoolPinInPerformanceInfo =
                (DiskPoolPinInPerformanceInfo) o;
        return Objects.equals(
                        this.plannedPrioritizedSpace,
                        diskPoolPinInPerformanceInfo.plannedPrioritizedSpace)
                && Objects.equals(
                        this.prioSpacePercentage, diskPoolPinInPerformanceInfo.prioSpacePercentage)
                && Objects.equals(this.id, diskPoolPinInPerformanceInfo.id);
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
        return Objects.hash(plannedPrioritizedSpace, prioSpacePercentage, id);
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
        sb.append("class DiskPoolPinInPerformanceInfo {\n");
        sb.append("    plannedPrioritizedSpace: ")
                .append(toIndentedString(plannedPrioritizedSpace))
                .append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
