package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedBackupPlanTimePoint */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedBackupPlanTimePoint
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATE = "date";

    @SerializedName(SERIALIZED_NAME_DATE)
    private Integer date;

    public static final String SERIALIZED_NAME_DATE_POSITION = "date_position";

    @SerializedName(SERIALIZED_NAME_DATE_POSITION)
    private List<Integer> datePosition = null;

    public static final String SERIALIZED_NAME_HOUR = "hour";

    @SerializedName(SERIALIZED_NAME_HOUR)
    private Integer hour;

    public static final String SERIALIZED_NAME_MINUTE = "minute";

    @SerializedName(SERIALIZED_NAME_MINUTE)
    private Integer minute;

    public static final String SERIALIZED_NAME_WEEKDAY = "weekday";

    @SerializedName(SERIALIZED_NAME_WEEKDAY)
    private WeekdayTypeEnum weekday;

    public NestedBackupPlanTimePoint() {}

    public NestedBackupPlanTimePoint date(Integer date) {

        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public NestedBackupPlanTimePoint date_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE);
        return this;
    }

    public NestedBackupPlanTimePoint date_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE);
        return this;
    }

    public void setDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE);
        }
    }

    public boolean getDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE);
    }

    public NestedBackupPlanTimePoint datePosition(List<Integer> datePosition) {

        this.datePosition = datePosition;
        return this;
    }

    public NestedBackupPlanTimePoint addDatePositionItem(Integer datePositionItem) {
        if (this.datePosition == null) {
            this.datePosition = new ArrayList<Integer>();
        }
        this.datePosition.add(datePositionItem);
        return this;
    }

    /**
     * Get datePosition
     *
     * @return datePosition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDatePosition() {
        return datePosition;
    }

    public void setDatePosition(List<Integer> datePosition) {
        this.datePosition = datePosition;
    }

    public NestedBackupPlanTimePoint datePosition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE_POSITION);
        return this;
    }

    public NestedBackupPlanTimePoint datePosition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE_POSITION);
        return this;
    }

    public void setDatePosition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE_POSITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE_POSITION);
        }
    }

    public boolean getDatePosition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE_POSITION);
    }

    public NestedBackupPlanTimePoint hour(Integer hour) {

        this.hour = hour;
        return this;
    }

    /**
     * Get hour
     *
     * @return hour
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public NestedBackupPlanTimePoint hour_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOUR);
        return this;
    }

    public NestedBackupPlanTimePoint hour_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOUR);
        return this;
    }

    public void setHour_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOUR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOUR);
        }
    }

    public boolean getHour_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOUR);
    }

    public NestedBackupPlanTimePoint minute(Integer minute) {

        this.minute = minute;
        return this;
    }

    /**
     * Get minute
     *
     * @return minute
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public NestedBackupPlanTimePoint minute_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MINUTE);
        return this;
    }

    public NestedBackupPlanTimePoint minute_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MINUTE);
        return this;
    }

    public void setMinute_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MINUTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MINUTE);
        }
    }

    public boolean getMinute_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MINUTE);
    }

    public NestedBackupPlanTimePoint weekday(WeekdayTypeEnum weekday) {

        this.weekday = weekday;
        return this;
    }

    /**
     * Get weekday
     *
     * @return weekday
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public WeekdayTypeEnum getWeekday() {
        return weekday;
    }

    public void setWeekday(WeekdayTypeEnum weekday) {
        this.weekday = weekday;
    }

    public NestedBackupPlanTimePoint weekday_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WEEKDAY);
        return this;
    }

    public NestedBackupPlanTimePoint weekday_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WEEKDAY);
        return this;
    }

    public void setWeekday_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WEEKDAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WEEKDAY);
        }
    }

    public boolean getWeekday_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WEEKDAY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedBackupPlanTimePoint nestedBackupPlanTimePoint = (NestedBackupPlanTimePoint) o;
        return Objects.equals(this.date, nestedBackupPlanTimePoint.date)
                && Objects.equals(this.datePosition, nestedBackupPlanTimePoint.datePosition)
                && Objects.equals(this.hour, nestedBackupPlanTimePoint.hour)
                && Objects.equals(this.minute, nestedBackupPlanTimePoint.minute)
                && Objects.equals(this.weekday, nestedBackupPlanTimePoint.weekday);
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
        return Objects.hash(date, datePosition, hour, minute, weekday);
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
        sb.append("class NestedBackupPlanTimePoint {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    datePosition: ").append(toIndentedString(datePosition)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
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
