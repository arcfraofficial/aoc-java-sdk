package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DiscoveredHost */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiscoveredHost extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ALL_FLASH = "all_flash";

    @SerializedName(SERIALIZED_NAME_ALL_FLASH)
    private Boolean allFlash;

    public static final String SERIALIZED_NAME_DEPLOYED = "deployed";

    @SerializedName(SERIALIZED_NAME_DEPLOYED)
    private Boolean deployed;

    public static final String SERIALIZED_NAME_DIMMS = "dimms";

    @SerializedName(SERIALIZED_NAME_DIMMS)
    private List<NestedDiscoveredHostDimms> dimms = null;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private List<NestedDiscoveredHostDisk> disks = new ArrayList<NestedDiscoveredHostDisk>();

    public static final String SERIALIZED_NAME_HOST_IP = "host_ip";

    @SerializedName(SERIALIZED_NAME_HOST_IP)
    private String hostIp;

    public static final String SERIALIZED_NAME_HOST_UUID = "host_uuid";

    @SerializedName(SERIALIZED_NAME_HOST_UUID)
    private String hostUuid;

    public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

    @SerializedName(SERIALIZED_NAME_HOSTNAME)
    private String hostname;

    public static final String SERIALIZED_NAME_IFACES = "ifaces";

    @SerializedName(SERIALIZED_NAME_IFACES)
    private List<NestedDiscoveredHostIface> ifaces = new ArrayList<NestedDiscoveredHostIface>();

    public static final String SERIALIZED_NAME_IPMI_IP = "ipmi_ip";

    @SerializedName(SERIALIZED_NAME_IPMI_IP)
    private String ipmiIp;

    public static final String SERIALIZED_NAME_IS_OS_IN_RAID1 = "is_os_in_raid1";

    @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1)
    private Boolean isOsInRaid1;

    public static final String SERIALIZED_NAME_PRODUCT = "product";

    @SerializedName(SERIALIZED_NAME_PRODUCT)
    private String product;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SOCKETS = "sockets";

    @SerializedName(SERIALIZED_NAME_SOCKETS)
    private Integer sockets;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_ZBS_SPEC = "zbs_spec";

    @SerializedName(SERIALIZED_NAME_ZBS_SPEC)
    private String zbsSpec;

    public DiscoveredHost() {}

    public DiscoveredHost allFlash(Boolean allFlash) {

        this.allFlash = allFlash;
        return this;
    }

    /**
     * Get allFlash
     *
     * @return allFlash
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getAllFlash() {
        return allFlash;
    }

    public void setAllFlash(Boolean allFlash) {
        this.allFlash = allFlash;
    }

    public DiscoveredHost allFlash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALL_FLASH);
        return this;
    }

    public DiscoveredHost allFlash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALL_FLASH);
        return this;
    }

    public void setAllFlash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALL_FLASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALL_FLASH);
        }
    }

    public boolean getAllFlash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALL_FLASH);
    }

    public DiscoveredHost deployed(Boolean deployed) {

        this.deployed = deployed;
        return this;
    }

    /**
     * Get deployed
     *
     * @return deployed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeployed() {
        return deployed;
    }

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    public DiscoveredHost deployed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOYED);
        return this;
    }

    public DiscoveredHost deployed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOYED);
        return this;
    }

    public void setDeployed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOYED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOYED);
        }
    }

    public boolean getDeployed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOYED);
    }

    public DiscoveredHost dimms(List<NestedDiscoveredHostDimms> dimms) {

        this.dimms = dimms;
        return this;
    }

    public DiscoveredHost addDimmsItem(NestedDiscoveredHostDimms dimmsItem) {
        if (this.dimms == null) {
            this.dimms = new ArrayList<NestedDiscoveredHostDimms>();
        }
        this.dimms.add(dimmsItem);
        return this;
    }

    /**
     * Get dimms
     *
     * @return dimms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedDiscoveredHostDimms> getDimms() {
        return dimms;
    }

    public void setDimms(List<NestedDiscoveredHostDimms> dimms) {
        this.dimms = dimms;
    }

    public DiscoveredHost dimms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIMMS);
        return this;
    }

    public DiscoveredHost dimms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIMMS);
        return this;
    }

    public void setDimms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIMMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIMMS);
        }
    }

    public boolean getDimms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIMMS);
    }

    public DiscoveredHost disks(List<NestedDiscoveredHostDisk> disks) {

        this.disks = disks;
        return this;
    }

    public DiscoveredHost addDisksItem(NestedDiscoveredHostDisk disksItem) {
        this.disks.add(disksItem);
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedDiscoveredHostDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<NestedDiscoveredHostDisk> disks) {
        this.disks = disks;
    }

    public DiscoveredHost disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public DiscoveredHost disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public DiscoveredHost hostIp(String hostIp) {

        this.hostIp = hostIp;
        return this;
    }

    /**
     * Get hostIp
     *
     * @return hostIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public DiscoveredHost hostIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_IP);
        return this;
    }

    public DiscoveredHost hostIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_IP);
        return this;
    }

    public void setHostIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_IP);
        }
    }

    public boolean getHostIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_IP);
    }

    public DiscoveredHost hostUuid(String hostUuid) {

        this.hostUuid = hostUuid;
        return this;
    }

    /**
     * Get hostUuid
     *
     * @return hostUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostUuid() {
        return hostUuid;
    }

    public void setHostUuid(String hostUuid) {
        this.hostUuid = hostUuid;
    }

    public DiscoveredHost hostUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_UUID);
        return this;
    }

    public DiscoveredHost hostUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_UUID);
        return this;
    }

    public void setHostUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_UUID);
        }
    }

    public boolean getHostUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_UUID);
    }

    public DiscoveredHost hostname(String hostname) {

        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public DiscoveredHost hostname_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public DiscoveredHost hostname_ExplictlyNonNull() {
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

    public DiscoveredHost ifaces(List<NestedDiscoveredHostIface> ifaces) {

        this.ifaces = ifaces;
        return this;
    }

    public DiscoveredHost addIfacesItem(NestedDiscoveredHostIface ifacesItem) {
        this.ifaces.add(ifacesItem);
        return this;
    }

    /**
     * Get ifaces
     *
     * @return ifaces
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedDiscoveredHostIface> getIfaces() {
        return ifaces;
    }

    public void setIfaces(List<NestedDiscoveredHostIface> ifaces) {
        this.ifaces = ifaces;
    }

    public DiscoveredHost ifaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IFACES);
        return this;
    }

    public DiscoveredHost ifaces_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IFACES);
        return this;
    }

    public void setIfaces_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IFACES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IFACES);
        }
    }

    public boolean getIfaces_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IFACES);
    }

    public DiscoveredHost ipmiIp(String ipmiIp) {

        this.ipmiIp = ipmiIp;
        return this;
    }

    /**
     * Get ipmiIp
     *
     * @return ipmiIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpmiIp() {
        return ipmiIp;
    }

    public void setIpmiIp(String ipmiIp) {
        this.ipmiIp = ipmiIp;
    }

    public DiscoveredHost ipmiIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPMI_IP);
        return this;
    }

    public DiscoveredHost ipmiIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPMI_IP);
        return this;
    }

    public void setIpmiIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPMI_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPMI_IP);
        }
    }

    public boolean getIpmiIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPMI_IP);
    }

    public DiscoveredHost isOsInRaid1(Boolean isOsInRaid1) {

        this.isOsInRaid1 = isOsInRaid1;
        return this;
    }

    /**
     * Get isOsInRaid1
     *
     * @return isOsInRaid1
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsOsInRaid1() {
        return isOsInRaid1;
    }

    public void setIsOsInRaid1(Boolean isOsInRaid1) {
        this.isOsInRaid1 = isOsInRaid1;
    }

    public DiscoveredHost isOsInRaid1_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_OS_IN_RAID1);
        return this;
    }

    public DiscoveredHost isOsInRaid1_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_OS_IN_RAID1);
        return this;
    }

    public void setIsOsInRaid1_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_OS_IN_RAID1);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_OS_IN_RAID1);
        }
    }

    public boolean getIsOsInRaid1_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_OS_IN_RAID1);
    }

    public DiscoveredHost product(String product) {

        this.product = product;
        return this;
    }

    /**
     * Get product
     *
     * @return product
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public DiscoveredHost product_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT);
        return this;
    }

    public DiscoveredHost product_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT);
        return this;
    }

    public void setProduct_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT);
        }
    }

    public boolean getProduct_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT);
    }

    public DiscoveredHost serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public DiscoveredHost serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public DiscoveredHost serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public DiscoveredHost sockets(Integer sockets) {

        this.sockets = sockets;
        return this;
    }

    /**
     * Get sockets
     *
     * @return sockets
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    public DiscoveredHost sockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOCKETS);
        return this;
    }

    public DiscoveredHost sockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOCKETS);
        return this;
    }

    public void setSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOCKETS);
        }
    }

    public boolean getSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOCKETS);
    }

    public DiscoveredHost version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DiscoveredHost version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public DiscoveredHost version_ExplictlyNonNull() {
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

    public DiscoveredHost zbsSpec(String zbsSpec) {

        this.zbsSpec = zbsSpec;
        return this;
    }

    /**
     * Get zbsSpec
     *
     * @return zbsSpec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSpec() {
        return zbsSpec;
    }

    public void setZbsSpec(String zbsSpec) {
        this.zbsSpec = zbsSpec;
    }

    public DiscoveredHost zbsSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SPEC);
        return this;
    }

    public DiscoveredHost zbsSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SPEC);
        return this;
    }

    public void setZbsSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SPEC);
        }
    }

    public boolean getZbsSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SPEC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscoveredHost discoveredHost = (DiscoveredHost) o;
        return Objects.equals(this.allFlash, discoveredHost.allFlash)
                && Objects.equals(this.deployed, discoveredHost.deployed)
                && Objects.equals(this.dimms, discoveredHost.dimms)
                && Objects.equals(this.disks, discoveredHost.disks)
                && Objects.equals(this.hostIp, discoveredHost.hostIp)
                && Objects.equals(this.hostUuid, discoveredHost.hostUuid)
                && Objects.equals(this.hostname, discoveredHost.hostname)
                && Objects.equals(this.ifaces, discoveredHost.ifaces)
                && Objects.equals(this.ipmiIp, discoveredHost.ipmiIp)
                && Objects.equals(this.isOsInRaid1, discoveredHost.isOsInRaid1)
                && Objects.equals(this.product, discoveredHost.product)
                && Objects.equals(this.serial, discoveredHost.serial)
                && Objects.equals(this.sockets, discoveredHost.sockets)
                && Objects.equals(this.version, discoveredHost.version)
                && Objects.equals(this.zbsSpec, discoveredHost.zbsSpec);
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
                allFlash,
                deployed,
                dimms,
                disks,
                hostIp,
                hostUuid,
                hostname,
                ifaces,
                ipmiIp,
                isOsInRaid1,
                product,
                serial,
                sockets,
                version,
                zbsSpec);
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
        sb.append("class DiscoveredHost {\n");
        sb.append("    allFlash: ").append(toIndentedString(allFlash)).append("\n");
        sb.append("    deployed: ").append(toIndentedString(deployed)).append("\n");
        sb.append("    dimms: ").append(toIndentedString(dimms)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ifaces: ").append(toIndentedString(ifaces)).append("\n");
        sb.append("    ipmiIp: ").append(toIndentedString(ipmiIp)).append("\n");
        sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    zbsSpec: ").append(toIndentedString(zbsSpec)).append("\n");
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
