package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudSecurityPolicy */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityPolicy
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";

    @SerializedName(SERIALIZED_NAME_APPLY_TO)
    private List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo =
            new ArrayList<NestedVirtualPrivateCloudSecurityPolicyApply>();

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<NestedVirtualPrivateCloudNetworkPolicyRule> egress = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";

    @SerializedName(SERIALIZED_NAME_POLICY_MODE)
    private VirtualPrivateCloudSecurityPolicyMode policyMode;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudSecurityPolicy() {}

    public VirtualPrivateCloudSecurityPolicy applyTo(
            List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo) {

        this.applyTo = applyTo;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy addApplyToItem(
            NestedVirtualPrivateCloudSecurityPolicyApply applyToItem) {
        this.applyTo.add(applyToItem);
        return this;
    }

    /**
     * Get applyTo
     *
     * @return applyTo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedVirtualPrivateCloudSecurityPolicyApply> getApplyTo() {
        return applyTo;
    }

    public void setApplyTo(List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo) {
        this.applyTo = applyTo;
    }

    public VirtualPrivateCloudSecurityPolicy applyTo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy applyTo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public void setApplyTo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        }
    }

    public boolean getApplyTo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLY_TO);
    }

    public VirtualPrivateCloudSecurityPolicy description(String description) {

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

    public VirtualPrivateCloudSecurityPolicy description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicy egress(
            List<NestedVirtualPrivateCloudNetworkPolicyRule> egress) {

        this.egress = egress;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy addEgressItem(
            NestedVirtualPrivateCloudNetworkPolicyRule egressItem) {
        if (this.egress == null) {
            this.egress = new ArrayList<NestedVirtualPrivateCloudNetworkPolicyRule>();
        }
        this.egress.add(egressItem);
        return this;
    }

    /**
     * Get egress
     *
     * @return egress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudNetworkPolicyRule> getEgress() {
        return egress;
    }

    public void setEgress(List<NestedVirtualPrivateCloudNetworkPolicyRule> egress) {
        this.egress = egress;
    }

    public VirtualPrivateCloudSecurityPolicy egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy egress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public void setEgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        }
    }

    public boolean getEgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS);
    }

    public VirtualPrivateCloudSecurityPolicy entityAsyncStatus(
            EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudSecurityPolicy entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicy id(String id) {

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

    public VirtualPrivateCloudSecurityPolicy id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicy ingress(
            List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress) {

        this.ingress = ingress;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy addIngressItem(
            NestedVirtualPrivateCloudNetworkPolicyRule ingressItem) {
        if (this.ingress == null) {
            this.ingress = new ArrayList<NestedVirtualPrivateCloudNetworkPolicyRule>();
        }
        this.ingress.add(ingressItem);
        return this;
    }

    /**
     * Get ingress
     *
     * @return ingress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudNetworkPolicyRule> getIngress() {
        return ingress;
    }

    public void setIngress(List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress) {
        this.ingress = ingress;
    }

    public VirtualPrivateCloudSecurityPolicy ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy ingress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public void setIngress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        }
    }

    public boolean getIngress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS);
    }

    public VirtualPrivateCloudSecurityPolicy localId(String localId) {

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

    public VirtualPrivateCloudSecurityPolicy localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicy name(String name) {

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

    public VirtualPrivateCloudSecurityPolicy name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicy policyMode(
            VirtualPrivateCloudSecurityPolicyMode policyMode) {

        this.policyMode = policyMode;
        return this;
    }

    /**
     * Get policyMode
     *
     * @return policyMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VirtualPrivateCloudSecurityPolicyMode getPolicyMode() {
        return policyMode;
    }

    public void setPolicyMode(VirtualPrivateCloudSecurityPolicyMode policyMode) {
        this.policyMode = policyMode;
    }

    public VirtualPrivateCloudSecurityPolicy policyMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy policyMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public void setPolicyMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        }
    }

    public boolean getPolicyMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_MODE);
    }

    public VirtualPrivateCloudSecurityPolicy vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudSecurityPolicy vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicy vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudSecurityPolicy virtualPrivateCloudSecurityPolicy =
                (VirtualPrivateCloudSecurityPolicy) o;
        return Objects.equals(this.applyTo, virtualPrivateCloudSecurityPolicy.applyTo)
                && Objects.equals(this.description, virtualPrivateCloudSecurityPolicy.description)
                && Objects.equals(this.egress, virtualPrivateCloudSecurityPolicy.egress)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudSecurityPolicy.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloudSecurityPolicy.id)
                && Objects.equals(this.ingress, virtualPrivateCloudSecurityPolicy.ingress)
                && Objects.equals(this.localId, virtualPrivateCloudSecurityPolicy.localId)
                && Objects.equals(this.name, virtualPrivateCloudSecurityPolicy.name)
                && Objects.equals(this.policyMode, virtualPrivateCloudSecurityPolicy.policyMode)
                && Objects.equals(this.vpc, virtualPrivateCloudSecurityPolicy.vpc);
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
                applyTo,
                description,
                egress,
                entityAsyncStatus,
                id,
                ingress,
                localId,
                name,
                policyMode,
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
        sb.append("class VirtualPrivateCloudSecurityPolicy {\n");
        sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
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
