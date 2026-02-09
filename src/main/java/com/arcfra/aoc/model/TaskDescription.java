package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TaskDescription */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TaskDescription extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EN_U_S = "en-US";

    @SerializedName(SERIALIZED_NAME_EN_U_S)
    private String enUS;

    public static final String SERIALIZED_NAME_ZH_C_N = "zh-CN";

    @SerializedName(SERIALIZED_NAME_ZH_C_N)
    private String zhCN;

    public TaskDescription() {}

    public TaskDescription enUS(String enUS) {

        this.enUS = enUS;
        return this;
    }

    /**
     * Get enUS
     *
     * @return enUS
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEnUS() {
        return enUS;
    }

    public void setEnUS(String enUS) {
        this.enUS = enUS;
    }

    public TaskDescription enUS_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EN_U_S);
        return this;
    }

    public TaskDescription enUS_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EN_U_S);
        return this;
    }

    public void setEnUS_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EN_U_S);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EN_U_S);
        }
    }

    public boolean getEnUS_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EN_U_S);
    }

    public TaskDescription zhCN(String zhCN) {

        this.zhCN = zhCN;
        return this;
    }

    /**
     * Get zhCN
     *
     * @return zhCN
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getZhCN() {
        return zhCN;
    }

    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
    }

    public TaskDescription zhCN_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZH_C_N);
        return this;
    }

    public TaskDescription zhCN_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZH_C_N);
        return this;
    }

    public void setZhCN_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZH_C_N);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZH_C_N);
        }
    }

    public boolean getZhCN_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZH_C_N);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDescription taskDescription = (TaskDescription) o;
        return Objects.equals(this.enUS, taskDescription.enUS)
                && Objects.equals(this.zhCN, taskDescription.zhCN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enUS, zhCN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDescription {\n");
        sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
        sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
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
