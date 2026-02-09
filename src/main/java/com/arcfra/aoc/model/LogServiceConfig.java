package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LogServiceConfig */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LogServiceConfig extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";

    @SerializedName(SERIALIZED_NAME_GROUP_NAME)
    private String groupName;

    public static final String SERIALIZED_NAME_SERVICE_LIST = "service_list";

    @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
    private List<String> serviceList = new ArrayList<String>();

    public LogServiceConfig() {}

    public LogServiceConfig groupName(String groupName) {

        this.groupName = groupName;
        return this;
    }

    /**
     * Get groupName
     *
     * @return groupName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LogServiceConfig groupName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GROUP_NAME);
        return this;
    }

    public LogServiceConfig groupName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GROUP_NAME);
        return this;
    }

    public void setGroupName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GROUP_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GROUP_NAME);
        }
    }

    public boolean getGroupName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GROUP_NAME);
    }

    public LogServiceConfig serviceList(List<String> serviceList) {

        this.serviceList = serviceList;
        return this;
    }

    public LogServiceConfig addServiceListItem(String serviceListItem) {
        this.serviceList.add(serviceListItem);
        return this;
    }

    /**
     * Get serviceList
     *
     * @return serviceList
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<String> serviceList) {
        this.serviceList = serviceList;
    }

    public LogServiceConfig serviceList_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_LIST);
        return this;
    }

    public LogServiceConfig serviceList_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LIST);
        return this;
    }

    public void setServiceList_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_LIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LIST);
        }
    }

    public boolean getServiceList_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_LIST);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogServiceConfig logServiceConfig = (LogServiceConfig) o;
        return Objects.equals(this.groupName, logServiceConfig.groupName)
                && Objects.equals(this.serviceList, logServiceConfig.serviceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, serviceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogServiceConfig {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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
