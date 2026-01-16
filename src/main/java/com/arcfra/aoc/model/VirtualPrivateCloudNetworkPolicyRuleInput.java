package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudNetworkPolicyRuleInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudNetworkPolicyRuleInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VirtualPrivateCloudNetworkPolicyRuleType type;

    public static final String SERIALIZED_NAME_SELECTOR_IDS = "selector_ids";

    @SerializedName(SERIALIZED_NAME_SELECTOR_IDS)
    private List<String> selectorIds = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_PORTS = "ports";

    @SerializedName(SERIALIZED_NAME_PORTS)
    private List<VirtualPrivateCloudNetworkPolicyRulePortInput> ports = null;

    public static final String SERIALIZED_NAME_IP_BLOCK = "ip_block";

    @SerializedName(SERIALIZED_NAME_IP_BLOCK)
    private String ipBlock;

    public static final String SERIALIZED_NAME_EXCEPT_IP_BLOCK = "except_ip_block";

    @SerializedName(SERIALIZED_NAME_EXCEPT_IP_BLOCK)
    private List<String> exceptIpBlock = null;

    public VirtualPrivateCloudNetworkPolicyRuleInput() {}

    public VirtualPrivateCloudNetworkPolicyRuleInput type(
            VirtualPrivateCloudNetworkPolicyRuleType type) {

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
    public VirtualPrivateCloudNetworkPolicyRuleType getType() {
        return type;
    }

    public void setType(VirtualPrivateCloudNetworkPolicyRuleType type) {
        this.type = type;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput type_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput selectorIds(List<String> selectorIds) {

        this.selectorIds = selectorIds;
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput addSelectorIdsItem(String selectorIdsItem) {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput selectorIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SELECTOR_IDS);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput selectorIds_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput securityGroupId(String securityGroupId) {

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

    public VirtualPrivateCloudNetworkPolicyRuleInput securityGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUP_ID);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput securityGroupId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput ports(
            List<VirtualPrivateCloudNetworkPolicyRulePortInput> ports) {

        this.ports = ports;
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput addPortsItem(
            VirtualPrivateCloudNetworkPolicyRulePortInput portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<VirtualPrivateCloudNetworkPolicyRulePortInput>();
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
    public List<VirtualPrivateCloudNetworkPolicyRulePortInput> getPorts() {
        return ports;
    }

    public void setPorts(List<VirtualPrivateCloudNetworkPolicyRulePortInput> ports) {
        this.ports = ports;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput ports_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORTS);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput ports_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput ipBlock(String ipBlock) {

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

    public VirtualPrivateCloudNetworkPolicyRuleInput ipBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_BLOCK);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput ipBlock_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput exceptIpBlock(List<String> exceptIpBlock) {

        this.exceptIpBlock = exceptIpBlock;
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput addExceptIpBlockItem(
            String exceptIpBlockItem) {
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

    public VirtualPrivateCloudNetworkPolicyRuleInput exceptIpBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        return this;
    }

    public VirtualPrivateCloudNetworkPolicyRuleInput exceptIpBlock_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudNetworkPolicyRuleInput virtualPrivateCloudNetworkPolicyRuleInput =
                (VirtualPrivateCloudNetworkPolicyRuleInput) o;
        return Objects.equals(this.type, virtualPrivateCloudNetworkPolicyRuleInput.type)
                && Objects.equals(
                        this.selectorIds, virtualPrivateCloudNetworkPolicyRuleInput.selectorIds)
                && Objects.equals(
                        this.securityGroupId,
                        virtualPrivateCloudNetworkPolicyRuleInput.securityGroupId)
                && Objects.equals(this.ports, virtualPrivateCloudNetworkPolicyRuleInput.ports)
                && Objects.equals(this.ipBlock, virtualPrivateCloudNetworkPolicyRuleInput.ipBlock)
                && Objects.equals(
                        this.exceptIpBlock,
                        virtualPrivateCloudNetworkPolicyRuleInput.exceptIpBlock);
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
        return Objects.hash(type, selectorIds, securityGroupId, ports, ipBlock, exceptIpBlock);
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
        sb.append("class VirtualPrivateCloudNetworkPolicyRuleInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    selectorIds: ").append(toIndentedString(selectorIds)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
        sb.append("    exceptIpBlock: ").append(toIndentedString(exceptIpBlock)).append("\n");
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
