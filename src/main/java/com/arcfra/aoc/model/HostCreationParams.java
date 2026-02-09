package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** HostCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostCreationParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTH_INFO = "auth_info";

    @SerializedName(SERIALIZED_NAME_AUTH_INFO)
    private HostAuthInfo authInfo;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private List<HostCreationParamsData> data = new ArrayList<HostCreationParamsData>();

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public HostCreationParams() {}

    public HostCreationParams authInfo(HostAuthInfo authInfo) {

        this.authInfo = authInfo;
        return this;
    }

    /**
     * Get authInfo
     *
     * @return authInfo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostAuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(HostAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public HostCreationParams authInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_INFO);
        return this;
    }

    public HostCreationParams authInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_INFO);
        return this;
    }

    public void setAuthInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_INFO);
        }
    }

    public boolean getAuthInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_INFO);
    }

    public HostCreationParams data(List<HostCreationParamsData> data) {

        this.data = data;
        return this;
    }

    public HostCreationParams addDataItem(HostCreationParamsData dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<HostCreationParamsData> getData() {
        return data;
    }

    public void setData(List<HostCreationParamsData> data) {
        this.data = data;
    }

    public HostCreationParams data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public HostCreationParams data_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA);
        return this;
    }

    public void setData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA);
        }
    }

    public boolean getData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA);
    }

    public HostCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public HostCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public HostCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostCreationParams hostCreationParams = (HostCreationParams) o;
        return Objects.equals(this.authInfo, hostCreationParams.authInfo)
                && Objects.equals(this.data, hostCreationParams.data)
                && Objects.equals(this.clusterId, hostCreationParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfo, data, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostCreationParams {\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
