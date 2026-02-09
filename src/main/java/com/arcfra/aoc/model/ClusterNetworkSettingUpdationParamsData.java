package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ClusterNetworkSettingUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterNetworkSettingUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MGT_IP_MAPPER = "mgt_ip_mapper";

    @SerializedName(SERIALIZED_NAME_MGT_IP_MAPPER)
    private List<MgtIpMapper> mgtIpMapper = null;

    public static final String SERIALIZED_NAME_MGT_NETMASK = "mgt_netmask";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK)
    private String mgtNetmask;

    public static final String SERIALIZED_NAME_MGT_GATEWAY = "mgt_gateway";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY)
    private String mgtGateway;

    public static final String SERIALIZED_NAME_NTP_MODE = "ntp_mode";

    @SerializedName(SERIALIZED_NAME_NTP_MODE)
    private NtpMode ntpMode;

    public static final String SERIALIZED_NAME_NTP_SERVERS = "ntp_servers";

    @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
    private List<String> ntpServers = null;

    public static final String SERIALIZED_NAME_DNS = "dns";

    @SerializedName(SERIALIZED_NAME_DNS)
    private List<String> dns = null;

    public static final String SERIALIZED_NAME_ISCSI_VIP = "iscsi_vip";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP)
    private String iscsiVip;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP = "management_vip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP)
    private String managementVip;

    public ClusterNetworkSettingUpdationParamsData() {}

    public ClusterNetworkSettingUpdationParamsData mgtIpMapper(List<MgtIpMapper> mgtIpMapper) {

        this.mgtIpMapper = mgtIpMapper;
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData addMgtIpMapperItem(MgtIpMapper mgtIpMapperItem) {
        if (this.mgtIpMapper == null) {
            this.mgtIpMapper = new ArrayList<MgtIpMapper>();
        }
        this.mgtIpMapper.add(mgtIpMapperItem);
        return this;
    }

    /**
     * Get mgtIpMapper
     *
     * @return mgtIpMapper
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<MgtIpMapper> getMgtIpMapper() {
        return mgtIpMapper;
    }

    public void setMgtIpMapper(List<MgtIpMapper> mgtIpMapper) {
        this.mgtIpMapper = mgtIpMapper;
    }

    public ClusterNetworkSettingUpdationParamsData mgtIpMapper_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_IP_MAPPER);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData mgtIpMapper_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_IP_MAPPER);
        return this;
    }

    public void setMgtIpMapper_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_IP_MAPPER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_IP_MAPPER);
        }
    }

    public boolean getMgtIpMapper_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_IP_MAPPER);
    }

    public ClusterNetworkSettingUpdationParamsData mgtNetmask(String mgtNetmask) {

        this.mgtNetmask = mgtNetmask;
        return this;
    }

    /**
     * Get mgtNetmask
     *
     * @return mgtNetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmask() {
        return mgtNetmask;
    }

    public void setMgtNetmask(String mgtNetmask) {
        this.mgtNetmask = mgtNetmask;
    }

    public ClusterNetworkSettingUpdationParamsData mgtNetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData mgtNetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public void setMgtNetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        }
    }

    public boolean getMgtNetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK);
    }

    public ClusterNetworkSettingUpdationParamsData mgtGateway(String mgtGateway) {

        this.mgtGateway = mgtGateway;
        return this;
    }

    /**
     * Get mgtGateway
     *
     * @return mgtGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGateway() {
        return mgtGateway;
    }

    public void setMgtGateway(String mgtGateway) {
        this.mgtGateway = mgtGateway;
    }

    public ClusterNetworkSettingUpdationParamsData mgtGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData mgtGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public void setMgtGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        }
    }

    public boolean getMgtGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY);
    }

    public ClusterNetworkSettingUpdationParamsData ntpMode(NtpMode ntpMode) {

        this.ntpMode = ntpMode;
        return this;
    }

    /**
     * Get ntpMode
     *
     * @return ntpMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NtpMode getNtpMode() {
        return ntpMode;
    }

    public void setNtpMode(NtpMode ntpMode) {
        this.ntpMode = ntpMode;
    }

    public ClusterNetworkSettingUpdationParamsData ntpMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData ntpMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public void setNtpMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        }
    }

    public boolean getNtpMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE);
    }

    public ClusterNetworkSettingUpdationParamsData ntpServers(List<String> ntpServers) {

        this.ntpServers = ntpServers;
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData addNtpServersItem(String ntpServersItem) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<String>();
        }
        this.ntpServers.add(ntpServersItem);
        return this;
    }

    /**
     * Get ntpServers
     *
     * @return ntpServers
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    public ClusterNetworkSettingUpdationParamsData ntpServers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData ntpServers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
        return this;
    }

    public void setNtpServers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
        }
    }

    public boolean getNtpServers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_SERVERS);
    }

    public ClusterNetworkSettingUpdationParamsData dns(List<String> dns) {

        this.dns = dns;
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData addDnsItem(String dnsItem) {
        if (this.dns == null) {
            this.dns = new ArrayList<String>();
        }
        this.dns.add(dnsItem);
        return this;
    }

    /**
     * Get dns
     *
     * @return dns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public ClusterNetworkSettingUpdationParamsData dns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNS);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData dns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNS);
        return this;
    }

    public void setDns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNS);
        }
    }

    public boolean getDns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNS);
    }

    public ClusterNetworkSettingUpdationParamsData iscsiVip(String iscsiVip) {

        this.iscsiVip = iscsiVip;
        return this;
    }

    /**
     * Get iscsiVip
     *
     * @return iscsiVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVip() {
        return iscsiVip;
    }

    public void setIscsiVip(String iscsiVip) {
        this.iscsiVip = iscsiVip;
    }

    public ClusterNetworkSettingUpdationParamsData iscsiVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData iscsiVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public void setIscsiVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        }
    }

    public boolean getIscsiVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP);
    }

    public ClusterNetworkSettingUpdationParamsData managementVip(String managementVip) {

        this.managementVip = managementVip;
        return this;
    }

    /**
     * Get managementVip
     *
     * @return managementVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVip() {
        return managementVip;
    }

    public void setManagementVip(String managementVip) {
        this.managementVip = managementVip;
    }

    public ClusterNetworkSettingUpdationParamsData managementVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public ClusterNetworkSettingUpdationParamsData managementVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public void setManagementVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        }
    }

    public boolean getManagementVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterNetworkSettingUpdationParamsData clusterNetworkSettingUpdationParamsData =
                (ClusterNetworkSettingUpdationParamsData) o;
        return Objects.equals(this.mgtIpMapper, clusterNetworkSettingUpdationParamsData.mgtIpMapper)
                && Objects.equals(
                        this.mgtNetmask, clusterNetworkSettingUpdationParamsData.mgtNetmask)
                && Objects.equals(
                        this.mgtGateway, clusterNetworkSettingUpdationParamsData.mgtGateway)
                && Objects.equals(this.ntpMode, clusterNetworkSettingUpdationParamsData.ntpMode)
                && Objects.equals(
                        this.ntpServers, clusterNetworkSettingUpdationParamsData.ntpServers)
                && Objects.equals(this.dns, clusterNetworkSettingUpdationParamsData.dns)
                && Objects.equals(this.iscsiVip, clusterNetworkSettingUpdationParamsData.iscsiVip)
                && Objects.equals(
                        this.managementVip, clusterNetworkSettingUpdationParamsData.managementVip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                mgtIpMapper,
                mgtNetmask,
                mgtGateway,
                ntpMode,
                ntpServers,
                dns,
                iscsiVip,
                managementVip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNetworkSettingUpdationParamsData {\n");
        sb.append("    mgtIpMapper: ").append(toIndentedString(mgtIpMapper)).append("\n");
        sb.append("    mgtNetmask: ").append(toIndentedString(mgtNetmask)).append("\n");
        sb.append("    mgtGateway: ").append(toIndentedString(mgtGateway)).append("\n");
        sb.append("    ntpMode: ").append(toIndentedString(ntpMode)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
        sb.append("    iscsiVip: ").append(toIndentedString(iscsiVip)).append("\n");
        sb.append("    managementVip: ").append(toIndentedString(managementVip)).append("\n");
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
