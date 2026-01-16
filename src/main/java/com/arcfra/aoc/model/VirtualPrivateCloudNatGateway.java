package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudNatGateway */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudNatGateway
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DNAT_RULES = "dnat_rules";

    @SerializedName(SERIALIZED_NAME_DNAT_RULES)
    private List<NestedVpcDnatRuleType> dnatRules = null;

    public static final String SERIALIZED_NAME_ENABLE_DNAT = "enable_dnat";

    @SerializedName(SERIALIZED_NAME_ENABLE_DNAT)
    private Boolean enableDnat;

    public static final String SERIALIZED_NAME_ENABLE_SNAT = "enable_snat";

    @SerializedName(SERIALIZED_NAME_ENABLE_SNAT)
    private Boolean enableSnat;

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

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudNatGateway() {}

    public VirtualPrivateCloudNatGateway dnatRules(List<NestedVpcDnatRuleType> dnatRules) {

        this.dnatRules = dnatRules;
        return this;
    }

    public VirtualPrivateCloudNatGateway addDnatRulesItem(NestedVpcDnatRuleType dnatRulesItem) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<NestedVpcDnatRuleType>();
        }
        this.dnatRules.add(dnatRulesItem);
        return this;
    }

    /**
     * Get dnatRules
     *
     * @return dnatRules
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVpcDnatRuleType> getDnatRules() {
        return dnatRules;
    }

    public void setDnatRules(List<NestedVpcDnatRuleType> dnatRules) {
        this.dnatRules = dnatRules;
    }

    public VirtualPrivateCloudNatGateway dnatRules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNAT_RULES);
        return this;
    }

    public VirtualPrivateCloudNatGateway dnatRules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNAT_RULES);
        return this;
    }

    public void setDnatRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNAT_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNAT_RULES);
        }
    }

    public boolean getDnatRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNAT_RULES);
    }

    public VirtualPrivateCloudNatGateway enableDnat(Boolean enableDnat) {

        this.enableDnat = enableDnat;
        return this;
    }

    /**
     * Get enableDnat
     *
     * @return enableDnat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableDnat() {
        return enableDnat;
    }

    public void setEnableDnat(Boolean enableDnat) {
        this.enableDnat = enableDnat;
    }

    public VirtualPrivateCloudNatGateway enableDnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_DNAT);
        return this;
    }

    public VirtualPrivateCloudNatGateway enableDnat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_DNAT);
        return this;
    }

    public void setEnableDnat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_DNAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_DNAT);
        }
    }

    public boolean getEnableDnat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_DNAT);
    }

    public VirtualPrivateCloudNatGateway enableSnat(Boolean enableSnat) {

        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * Get enableSnat
     *
     * @return enableSnat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    public VirtualPrivateCloudNatGateway enableSnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_SNAT);
        return this;
    }

    public VirtualPrivateCloudNatGateway enableSnat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_SNAT);
        return this;
    }

    public void setEnableSnat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_SNAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_SNAT);
        }
    }

    public boolean getEnableSnat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_SNAT);
    }

    public VirtualPrivateCloudNatGateway entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudNatGateway entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudNatGateway entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway externalIp(String externalIp) {

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

    public VirtualPrivateCloudNatGateway externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudNatGateway externalIp_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway externalIps(
            List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudNatGateway addExternalIpsItem(
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

    public VirtualPrivateCloudNatGateway externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudNatGateway externalIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway externalSubnet(
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

    public VirtualPrivateCloudNatGateway externalSubnet_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public VirtualPrivateCloudNatGateway externalSubnet_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway externalSubnetGroup(
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

    public VirtualPrivateCloudNatGateway externalSubnetGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public VirtualPrivateCloudNatGateway externalSubnetGroup_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway id(String id) {

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

    public VirtualPrivateCloudNatGateway id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudNatGateway id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway localId(String localId) {

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

    public VirtualPrivateCloudNatGateway localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudNatGateway localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway name(String name) {

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

    public VirtualPrivateCloudNatGateway name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudNatGateway name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGateway vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudNatGateway vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudNatGateway vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudNatGateway virtualPrivateCloudNatGateway =
                (VirtualPrivateCloudNatGateway) o;
        return Objects.equals(this.dnatRules, virtualPrivateCloudNatGateway.dnatRules)
                && Objects.equals(this.enableDnat, virtualPrivateCloudNatGateway.enableDnat)
                && Objects.equals(this.enableSnat, virtualPrivateCloudNatGateway.enableSnat)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudNatGateway.entityAsyncStatus)
                && Objects.equals(this.externalIp, virtualPrivateCloudNatGateway.externalIp)
                && Objects.equals(this.externalIps, virtualPrivateCloudNatGateway.externalIps)
                && Objects.equals(this.externalSubnet, virtualPrivateCloudNatGateway.externalSubnet)
                && Objects.equals(
                        this.externalSubnetGroup, virtualPrivateCloudNatGateway.externalSubnetGroup)
                && Objects.equals(this.id, virtualPrivateCloudNatGateway.id)
                && Objects.equals(this.localId, virtualPrivateCloudNatGateway.localId)
                && Objects.equals(this.name, virtualPrivateCloudNatGateway.name)
                && Objects.equals(this.vpc, virtualPrivateCloudNatGateway.vpc);
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
                dnatRules,
                enableDnat,
                enableSnat,
                entityAsyncStatus,
                externalIp,
                externalIps,
                externalSubnet,
                externalSubnetGroup,
                id,
                localId,
                name,
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
        sb.append("class VirtualPrivateCloudNatGateway {\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
        sb.append("    enableDnat: ").append(toIndentedString(enableDnat)).append("\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
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
