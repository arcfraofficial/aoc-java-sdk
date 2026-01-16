package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedNetworkPolicyRule */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedNetworkPolicyRule
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXCEPT_IP_BLOCK = "except_ip_block";

    @SerializedName(SERIALIZED_NAME_EXCEPT_IP_BLOCK)
    private List<String> exceptIpBlock = null;

    public static final String SERIALIZED_NAME_IP_BLOCK = "ip_block";

    @SerializedName(SERIALIZED_NAME_IP_BLOCK)
    private String ipBlock;

    public static final String SERIALIZED_NAME_PORTS = "ports";

    @SerializedName(SERIALIZED_NAME_PORTS)
    private List<NestedNetworkPolicyRulePort> ports = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUP = "security_group";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP)
    private NestedSecurityGroup securityGroup;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_SELECTOR = "selector";

    @SerializedName(SERIALIZED_NAME_SELECTOR)
    private List<NestedLabel> selector = null;

    public static final String SERIALIZED_NAME_SELECTOR_IDS = "selector_ids";

    @SerializedName(SERIALIZED_NAME_SELECTOR_IDS)
    private List<String> selectorIds = null;

    public static final String SERIALIZED_NAME_SERVICE_IDS = "service_ids";

    @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
    private List<String> serviceIds = null;

    public static final String SERIALIZED_NAME_SERVICES = "services";

    @SerializedName(SERIALIZED_NAME_SERVICES)
    private List<NestedNetworkPolicyRuleService> services = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkPolicyRuleType type;

    public NestedNetworkPolicyRule() {}

    public NestedNetworkPolicyRule exceptIpBlock(List<String> exceptIpBlock) {

        this.exceptIpBlock = exceptIpBlock;
        return this;
    }

    public NestedNetworkPolicyRule addExceptIpBlockItem(String exceptIpBlockItem) {
        if (this.exceptIpBlock == null) {
            this.exceptIpBlock = new ArrayList<String>();
        }
        this.exceptIpBlock.add(exceptIpBlockItem);
        return this;
    }

    /**
     * Get exceptIpBlock
     *
     * @return exceptIpBlock
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExceptIpBlock() {
        return exceptIpBlock;
    }

    public void setExceptIpBlock(List<String> exceptIpBlock) {
        this.exceptIpBlock = exceptIpBlock;
    }

    public NestedNetworkPolicyRule exceptIpBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        return this;
    }

    public NestedNetworkPolicyRule exceptIpBlock_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        return this;
    }

    public void setExceptIpBlock_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        }
    }

    public boolean getExceptIpBlock_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
    }

    public NestedNetworkPolicyRule ipBlock(String ipBlock) {

        this.ipBlock = ipBlock;
        return this;
    }

    /**
     * Get ipBlock
     *
     * @return ipBlock
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NestedNetworkPolicyRule ipBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_BLOCK);
        return this;
    }

    public NestedNetworkPolicyRule ipBlock_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_BLOCK);
        return this;
    }

    public void setIpBlock_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_BLOCK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_BLOCK);
        }
    }

    public boolean getIpBlock_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_BLOCK);
    }

    public NestedNetworkPolicyRule ports(List<NestedNetworkPolicyRulePort> ports) {

        this.ports = ports;
        return this;
    }

    public NestedNetworkPolicyRule addPortsItem(NestedNetworkPolicyRulePort portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<NestedNetworkPolicyRulePort>();
        }
        this.ports.add(portsItem);
        return this;
    }

    /**
     * Get ports
     *
     * @return ports
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRulePort> getPorts() {
        return ports;
    }

    public void setPorts(List<NestedNetworkPolicyRulePort> ports) {
        this.ports = ports;
    }

    public NestedNetworkPolicyRule ports_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORTS);
        return this;
    }

    public NestedNetworkPolicyRule ports_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORTS);
        return this;
    }

    public void setPorts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORTS);
        }
    }

    public boolean getPorts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORTS);
    }

    public NestedNetworkPolicyRule securityGroup(NestedSecurityGroup securityGroup) {

        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * Get securityGroup
     *
     * @return securityGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(NestedSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    public NestedNetworkPolicyRule securityGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP);
        return this;
    }

    public NestedNetworkPolicyRule securityGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP);
        return this;
    }

    public void setSecurityGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP);
        }
    }

    public boolean getSecurityGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUP);
    }

    public NestedNetworkPolicyRule securityGroupId(String securityGroupId) {

        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * Get securityGroupId
     *
     * @return securityGroupId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public NestedNetworkPolicyRule securityGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP_ID);
        return this;
    }

    public NestedNetworkPolicyRule securityGroupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP_ID);
        return this;
    }

    public void setSecurityGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUP_ID);
        }
    }

    public boolean getSecurityGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUP_ID);
    }

    public NestedNetworkPolicyRule selector(List<NestedLabel> selector) {

        this.selector = selector;
        return this;
    }

    public NestedNetworkPolicyRule addSelectorItem(NestedLabel selectorItem) {
        if (this.selector == null) {
            this.selector = new ArrayList<NestedLabel>();
        }
        this.selector.add(selectorItem);
        return this;
    }

    /**
     * Get selector
     *
     * @return selector
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getSelector() {
        return selector;
    }

    public void setSelector(List<NestedLabel> selector) {
        this.selector = selector;
    }

    public NestedNetworkPolicyRule selector_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SELECTOR);
        return this;
    }

    public NestedNetworkPolicyRule selector_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SELECTOR);
        return this;
    }

    public void setSelector_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SELECTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SELECTOR);
        }
    }

    public boolean getSelector_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SELECTOR);
    }

    public NestedNetworkPolicyRule selectorIds(List<String> selectorIds) {

        this.selectorIds = selectorIds;
        return this;
    }

    public NestedNetworkPolicyRule addSelectorIdsItem(String selectorIdsItem) {
        if (this.selectorIds == null) {
            this.selectorIds = new ArrayList<String>();
        }
        this.selectorIds.add(selectorIdsItem);
        return this;
    }

    /**
     * Get selectorIds
     *
     * @return selectorIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSelectorIds() {
        return selectorIds;
    }

    public void setSelectorIds(List<String> selectorIds) {
        this.selectorIds = selectorIds;
    }

    public NestedNetworkPolicyRule selectorIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SELECTOR_IDS);
        return this;
    }

    public NestedNetworkPolicyRule selectorIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SELECTOR_IDS);
        return this;
    }

    public void setSelectorIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SELECTOR_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SELECTOR_IDS);
        }
    }

    public boolean getSelectorIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SELECTOR_IDS);
    }

    public NestedNetworkPolicyRule serviceIds(List<String> serviceIds) {

        this.serviceIds = serviceIds;
        return this;
    }

    public NestedNetworkPolicyRule addServiceIdsItem(String serviceIdsItem) {
        if (this.serviceIds == null) {
            this.serviceIds = new ArrayList<String>();
        }
        this.serviceIds.add(serviceIdsItem);
        return this;
    }

    /**
     * Get serviceIds
     *
     * @return serviceIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public NestedNetworkPolicyRule serviceIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_IDS);
        return this;
    }

    public NestedNetworkPolicyRule serviceIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_IDS);
        return this;
    }

    public void setServiceIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_IDS);
        }
    }

    public boolean getServiceIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_IDS);
    }

    public NestedNetworkPolicyRule services(List<NestedNetworkPolicyRuleService> services) {

        this.services = services;
        return this;
    }

    public NestedNetworkPolicyRule addServicesItem(NestedNetworkPolicyRuleService servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<NestedNetworkPolicyRuleService>();
        }
        this.services.add(servicesItem);
        return this;
    }

    /**
     * Get services
     *
     * @return services
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRuleService> getServices() {
        return services;
    }

    public void setServices(List<NestedNetworkPolicyRuleService> services) {
        this.services = services;
    }

    public NestedNetworkPolicyRule services_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public NestedNetworkPolicyRule services_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public void setServices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        }
    }

    public boolean getServices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICES);
    }

    public NestedNetworkPolicyRule type(NetworkPolicyRuleType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NetworkPolicyRuleType getType() {
        return type;
    }

    public void setType(NetworkPolicyRuleType type) {
        this.type = type;
    }

    public NestedNetworkPolicyRule type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedNetworkPolicyRule type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedNetworkPolicyRule nestedNetworkPolicyRule = (NestedNetworkPolicyRule) o;
        return Objects.equals(this.exceptIpBlock, nestedNetworkPolicyRule.exceptIpBlock)
                && Objects.equals(this.ipBlock, nestedNetworkPolicyRule.ipBlock)
                && Objects.equals(this.ports, nestedNetworkPolicyRule.ports)
                && Objects.equals(this.securityGroup, nestedNetworkPolicyRule.securityGroup)
                && Objects.equals(this.securityGroupId, nestedNetworkPolicyRule.securityGroupId)
                && Objects.equals(this.selector, nestedNetworkPolicyRule.selector)
                && Objects.equals(this.selectorIds, nestedNetworkPolicyRule.selectorIds)
                && Objects.equals(this.serviceIds, nestedNetworkPolicyRule.serviceIds)
                && Objects.equals(this.services, nestedNetworkPolicyRule.services)
                && Objects.equals(this.type, nestedNetworkPolicyRule.type);
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
                exceptIpBlock,
                ipBlock,
                ports,
                securityGroup,
                securityGroupId,
                selector,
                selectorIds,
                serviceIds,
                services,
                type);
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
        sb.append("class NestedNetworkPolicyRule {\n");
        sb.append("    exceptIpBlock: ").append(toIndentedString(exceptIpBlock)).append("\n");
        sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
        sb.append("    selectorIds: ").append(toIndentedString(selectorIds)).append("\n");
        sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
