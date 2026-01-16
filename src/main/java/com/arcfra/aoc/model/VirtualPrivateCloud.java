package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloud */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloud
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM =
            "associate_external_subnet_num";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM)
    private Integer associateExternalSubnetNum;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MTU = "mtu";

    @SerializedName(SERIALIZED_NAME_MTU)
    private Integer mtu;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ROUTE_TABLES = "route_tables";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLES)
    private List<NestedVirtualPrivateCloudRouteTable> routeTables = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security_groups";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
    private List<NestedVirtualPrivateCloudSecurityGroup> securityGroups = null;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES = "security_policies";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES)
    private List<NestedVirtualPrivateCloudSecurityPolicy> securityPolicies = null;

    public static final String SERIALIZED_NAME_SUBNETS = "subnets";

    @SerializedName(SERIALIZED_NAME_SUBNETS)
    private List<NestedVirtualPrivateCloudSubnet> subnets = null;

    public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";

    @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
    private NestedVirtualPrivateCloudService vpcService;

    public VirtualPrivateCloud() {}

    public VirtualPrivateCloud associateExternalSubnetNum(Integer associateExternalSubnetNum) {

        this.associateExternalSubnetNum = associateExternalSubnetNum;
        return this;
    }

    /**
     * Get associateExternalSubnetNum
     *
     * @return associateExternalSubnetNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssociateExternalSubnetNum() {
        return associateExternalSubnetNum;
    }

    public void setAssociateExternalSubnetNum(Integer associateExternalSubnetNum) {
        this.associateExternalSubnetNum = associateExternalSubnetNum;
    }

    public VirtualPrivateCloud associateExternalSubnetNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        return this;
    }

    public VirtualPrivateCloud associateExternalSubnetNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        return this;
    }

    public void setAssociateExternalSubnetNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
        }
    }

    public boolean getAssociateExternalSubnetNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATE_EXTERNAL_SUBNET_NUM);
    }

    public VirtualPrivateCloud description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualPrivateCloud description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloud description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public VirtualPrivateCloud entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloud entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloud entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloud id(String id) {

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

    public VirtualPrivateCloud id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloud id_ExplictlyNonNull() {
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

    public VirtualPrivateCloud localId(String localId) {

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

    public VirtualPrivateCloud localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloud localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloud mtu(Integer mtu) {

        this.mtu = mtu;
        return this;
    }

    /**
     * Get mtu
     *
     * @return mtu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public VirtualPrivateCloud mtu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU);
        return this;
    }

    public VirtualPrivateCloud mtu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU);
        return this;
    }

    public void setMtu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU);
        }
    }

    public boolean getMtu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU);
    }

    public VirtualPrivateCloud name(String name) {

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

    public VirtualPrivateCloud name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloud name_ExplictlyNonNull() {
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

    public VirtualPrivateCloud routeTables(List<NestedVirtualPrivateCloudRouteTable> routeTables) {

        this.routeTables = routeTables;
        return this;
    }

    public VirtualPrivateCloud addRouteTablesItem(
            NestedVirtualPrivateCloudRouteTable routeTablesItem) {
        if (this.routeTables == null) {
            this.routeTables = new ArrayList<NestedVirtualPrivateCloudRouteTable>();
        }
        this.routeTables.add(routeTablesItem);
        return this;
    }

    /**
     * Get routeTables
     *
     * @return routeTables
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudRouteTable> getRouteTables() {
        return routeTables;
    }

    public void setRouteTables(List<NestedVirtualPrivateCloudRouteTable> routeTables) {
        this.routeTables = routeTables;
    }

    public VirtualPrivateCloud routeTables_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES);
        return this;
    }

    public VirtualPrivateCloud routeTables_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES);
        return this;
    }

    public void setRouteTables_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLES);
        }
    }

    public boolean getRouteTables_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLES);
    }

    public VirtualPrivateCloud securityGroups(
            List<NestedVirtualPrivateCloudSecurityGroup> securityGroups) {

        this.securityGroups = securityGroups;
        return this;
    }

    public VirtualPrivateCloud addSecurityGroupsItem(
            NestedVirtualPrivateCloudSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<NestedVirtualPrivateCloudSecurityGroup>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    /**
     * Get securityGroups
     *
     * @return securityGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NestedVirtualPrivateCloudSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public VirtualPrivateCloud securityGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS);
        return this;
    }

    public VirtualPrivateCloud securityGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS);
        return this;
    }

    public void setSecurityGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS);
        }
    }

    public boolean getSecurityGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUPS);
    }

    public VirtualPrivateCloud securityPolicies(
            List<NestedVirtualPrivateCloudSecurityPolicy> securityPolicies) {

        this.securityPolicies = securityPolicies;
        return this;
    }

    public VirtualPrivateCloud addSecurityPoliciesItem(
            NestedVirtualPrivateCloudSecurityPolicy securityPoliciesItem) {
        if (this.securityPolicies == null) {
            this.securityPolicies = new ArrayList<NestedVirtualPrivateCloudSecurityPolicy>();
        }
        this.securityPolicies.add(securityPoliciesItem);
        return this;
    }

    /**
     * Get securityPolicies
     *
     * @return securityPolicies
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudSecurityPolicy> getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(
            List<NestedVirtualPrivateCloudSecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
    }

    public VirtualPrivateCloud securityPolicies_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES);
        return this;
    }

    public VirtualPrivateCloud securityPolicies_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES);
        return this;
    }

    public void setSecurityPolicies_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES);
        }
    }

    public boolean getSecurityPolicies_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES);
    }

    public VirtualPrivateCloud subnets(List<NestedVirtualPrivateCloudSubnet> subnets) {

        this.subnets = subnets;
        return this;
    }

    public VirtualPrivateCloud addSubnetsItem(NestedVirtualPrivateCloudSubnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<NestedVirtualPrivateCloudSubnet>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    /**
     * Get subnets
     *
     * @return subnets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<NestedVirtualPrivateCloudSubnet> subnets) {
        this.subnets = subnets;
    }

    public VirtualPrivateCloud subnets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETS);
        return this;
    }

    public VirtualPrivateCloud subnets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETS);
        return this;
    }

    public void setSubnets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETS);
        }
    }

    public boolean getSubnets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETS);
    }

    public VirtualPrivateCloud vpcService(NestedVirtualPrivateCloudService vpcService) {

        this.vpcService = vpcService;
        return this;
    }

    /**
     * Get vpcService
     *
     * @return vpcService
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloudService getVpcService() {
        return vpcService;
    }

    public void setVpcService(NestedVirtualPrivateCloudService vpcService) {
        this.vpcService = vpcService;
    }

    public VirtualPrivateCloud vpcService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public VirtualPrivateCloud vpcService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public void setVpcService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        }
    }

    public boolean getVpcService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SERVICE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloud virtualPrivateCloud = (VirtualPrivateCloud) o;
        return Objects.equals(
                        this.associateExternalSubnetNum,
                        virtualPrivateCloud.associateExternalSubnetNum)
                && Objects.equals(this.description, virtualPrivateCloud.description)
                && Objects.equals(this.entityAsyncStatus, virtualPrivateCloud.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloud.id)
                && Objects.equals(this.localId, virtualPrivateCloud.localId)
                && Objects.equals(this.mtu, virtualPrivateCloud.mtu)
                && Objects.equals(this.name, virtualPrivateCloud.name)
                && Objects.equals(this.routeTables, virtualPrivateCloud.routeTables)
                && Objects.equals(this.securityGroups, virtualPrivateCloud.securityGroups)
                && Objects.equals(this.securityPolicies, virtualPrivateCloud.securityPolicies)
                && Objects.equals(this.subnets, virtualPrivateCloud.subnets)
                && Objects.equals(this.vpcService, virtualPrivateCloud.vpcService);
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
                associateExternalSubnetNum,
                description,
                entityAsyncStatus,
                id,
                localId,
                mtu,
                name,
                routeTables,
                securityGroups,
                securityPolicies,
                subnets,
                vpcService);
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
        sb.append("class VirtualPrivateCloud {\n");
        sb.append("    associateExternalSubnetNum: ")
                .append(toIndentedString(associateExternalSubnetNum))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routeTables: ").append(toIndentedString(routeTables)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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
