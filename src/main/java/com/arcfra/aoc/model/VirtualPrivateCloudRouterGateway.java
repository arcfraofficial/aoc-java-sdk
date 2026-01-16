package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudRouterGateway */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouterGateway
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS = "associated_subnets";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS)
    private List<NestedVirtualPrivateCloudSubnet> associatedSubnets = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<NestedVpcGatewaysCommonExternalIpsType> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET = "external_subnet";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET)
    private NestedVirtualPrivateCloudExternalSubnet externalSubnet;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP = "external_subnet_group";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP)
    private NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NEXTHOP_IP = "nexthop_ip";

    @SerializedName(SERIALIZED_NAME_NEXTHOP_IP)
    private String nexthopIp;

    public static final String SERIALIZED_NAME_RULES = "rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<NestedVpcRouterGatewayRuleType> rules =
            new ArrayList<NestedVpcRouterGatewayRuleType>();

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudRouterGateway() {}

    public VirtualPrivateCloudRouterGateway associatedSubnets(
            List<NestedVirtualPrivateCloudSubnet> associatedSubnets) {

        this.associatedSubnets = associatedSubnets;
        return this;
    }

    public VirtualPrivateCloudRouterGateway addAssociatedSubnetsItem(
            NestedVirtualPrivateCloudSubnet associatedSubnetsItem) {
        if (this.associatedSubnets == null) {
            this.associatedSubnets = new ArrayList<NestedVirtualPrivateCloudSubnet>();
        }
        this.associatedSubnets.add(associatedSubnetsItem);
        return this;
    }

    /**
     * Get associatedSubnets
     *
     * @return associatedSubnets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudSubnet> getAssociatedSubnets() {
        return associatedSubnets;
    }

    public void setAssociatedSubnets(List<NestedVirtualPrivateCloudSubnet> associatedSubnets) {
        this.associatedSubnets = associatedSubnets;
    }

    public VirtualPrivateCloudRouterGateway associatedSubnets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS);
        return this;
    }

    public VirtualPrivateCloudRouterGateway associatedSubnets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS);
        return this;
    }

    public void setAssociatedSubnets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS);
        }
    }

    public boolean getAssociatedSubnets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATED_SUBNETS);
    }

    public VirtualPrivateCloudRouterGateway entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public VirtualPrivateCloudRouterGateway entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudRouterGateway entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public VirtualPrivateCloudRouterGateway externalIp(String externalIp) {

        this.externalIp = externalIp;
        return this;
    }

    /**
     * Get externalIp
     *
     * @return externalIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public VirtualPrivateCloudRouterGateway externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGateway externalIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public void setExternalIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        }
    }

    public boolean getExternalIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP);
    }

    public VirtualPrivateCloudRouterGateway externalIps(
            List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudRouterGateway addExternalIpsItem(
            NestedVpcGatewaysCommonExternalIpsType externalIpsItem) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<NestedVpcGatewaysCommonExternalIpsType>();
        }
        this.externalIps.add(externalIpsItem);
        return this;
    }

    /**
     * Get externalIps
     *
     * @return externalIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVpcGatewaysCommonExternalIpsType> getExternalIps() {
        return externalIps;
    }

    public void setExternalIps(List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {
        this.externalIps = externalIps;
    }

    public VirtualPrivateCloudRouterGateway externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudRouterGateway externalIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public void setExternalIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        }
    }

    public boolean getExternalIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IPS);
    }

    public VirtualPrivateCloudRouterGateway externalSubnet(
            NestedVirtualPrivateCloudExternalSubnet externalSubnet) {

        this.externalSubnet = externalSubnet;
        return this;
    }

    /**
     * Get externalSubnet
     *
     * @return externalSubnet
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudExternalSubnet getExternalSubnet() {
        return externalSubnet;
    }

    public void setExternalSubnet(NestedVirtualPrivateCloudExternalSubnet externalSubnet) {
        this.externalSubnet = externalSubnet;
    }

    public VirtualPrivateCloudRouterGateway externalSubnet_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public VirtualPrivateCloudRouterGateway externalSubnet_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public void setExternalSubnet_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        }
    }

    public boolean getExternalSubnet_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET);
    }

    public VirtualPrivateCloudRouterGateway externalSubnetGroup(
            NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup) {

        this.externalSubnetGroup = externalSubnetGroup;
        return this;
    }

    /**
     * Get externalSubnetGroup
     *
     * @return externalSubnetGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudExternalSubnetGroup getExternalSubnetGroup() {
        return externalSubnetGroup;
    }

    public void setExternalSubnetGroup(
            NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup) {
        this.externalSubnetGroup = externalSubnetGroup;
    }

    public VirtualPrivateCloudRouterGateway externalSubnetGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public VirtualPrivateCloudRouterGateway externalSubnetGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public void setExternalSubnetGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        }
    }

    public boolean getExternalSubnetGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
    }

    public VirtualPrivateCloudRouterGateway id(String id) {

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

    public VirtualPrivateCloudRouterGateway id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGateway id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGateway localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VirtualPrivateCloudRouterGateway localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGateway localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public VirtualPrivateCloudRouterGateway name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualPrivateCloudRouterGateway name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouterGateway name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public VirtualPrivateCloudRouterGateway nexthopIp(String nexthopIp) {

        this.nexthopIp = nexthopIp;
        return this;
    }

    /**
     * Get nexthopIp
     *
     * @return nexthopIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthopIp() {
        return nexthopIp;
    }

    public void setNexthopIp(String nexthopIp) {
        this.nexthopIp = nexthopIp;
    }

    public VirtualPrivateCloudRouterGateway nexthopIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGateway nexthopIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP);
        return this;
    }

    public void setNexthopIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP_IP);
        }
    }

    public boolean getNexthopIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP_IP);
    }

    public VirtualPrivateCloudRouterGateway rules(List<NestedVpcRouterGatewayRuleType> rules) {

        this.rules = rules;
        return this;
    }

    public VirtualPrivateCloudRouterGateway addRulesItem(NestedVpcRouterGatewayRuleType rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Get rules
     *
     * @return rules
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedVpcRouterGatewayRuleType> getRules() {
        return rules;
    }

    public void setRules(List<NestedVpcRouterGatewayRuleType> rules) {
        this.rules = rules;
    }

    public VirtualPrivateCloudRouterGateway rules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RULES);
        return this;
    }

    public VirtualPrivateCloudRouterGateway rules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RULES);
        return this;
    }

    public void setRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RULES);
        }
    }

    public boolean getRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RULES);
    }

    public VirtualPrivateCloudRouterGateway vpc(NestedVirtualPrivateCloud vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloud getVpc() {
        return vpc;
    }

    public void setVpc(NestedVirtualPrivateCloud vpc) {
        this.vpc = vpc;
    }

    public VirtualPrivateCloudRouterGateway vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudRouterGateway vpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC);
        return this;
    }

    public void setVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC);
        }
    }

    public boolean getVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouterGateway virtualPrivateCloudRouterGateway =
                (VirtualPrivateCloudRouterGateway) o;
        return Objects.equals(
                        this.associatedSubnets, virtualPrivateCloudRouterGateway.associatedSubnets)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudRouterGateway.entityAsyncStatus)
                && Objects.equals(this.externalIp, virtualPrivateCloudRouterGateway.externalIp)
                && Objects.equals(this.externalIps, virtualPrivateCloudRouterGateway.externalIps)
                && Objects.equals(
                        this.externalSubnet, virtualPrivateCloudRouterGateway.externalSubnet)
                && Objects.equals(
                        this.externalSubnetGroup,
                        virtualPrivateCloudRouterGateway.externalSubnetGroup)
                && Objects.equals(this.id, virtualPrivateCloudRouterGateway.id)
                && Objects.equals(this.localId, virtualPrivateCloudRouterGateway.localId)
                && Objects.equals(this.name, virtualPrivateCloudRouterGateway.name)
                && Objects.equals(this.nexthopIp, virtualPrivateCloudRouterGateway.nexthopIp)
                && Objects.equals(this.rules, virtualPrivateCloudRouterGateway.rules)
                && Objects.equals(this.vpc, virtualPrivateCloudRouterGateway.vpc);
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
                associatedSubnets,
                entityAsyncStatus,
                externalIp,
                externalIps,
                externalSubnet,
                externalSubnetGroup,
                id,
                localId,
                name,
                nexthopIp,
                rules,
                vpc);
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
        sb.append("class VirtualPrivateCloudRouterGateway {\n");
        sb.append("    associatedSubnets: ")
                .append(toIndentedString(associatedSubnets))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalSubnet: ").append(toIndentedString(externalSubnet)).append("\n");
        sb.append("    externalSubnetGroup: ")
                .append(toIndentedString(externalSubnetGroup))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nexthopIp: ").append(toIndentedString(nexthopIp)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
