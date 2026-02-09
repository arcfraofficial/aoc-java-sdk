package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IscsiConnection */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiConnection extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLIENT_PORT = "client_port";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT)
    private Integer clientPort;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INITIATOR_IP = "initiator_ip";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP)
    private String initiatorIp;

    public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
    private NestedIscsiTarget iscsiTarget;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NestedNvmfSubsystem nvmfSubsystem;

    public static final String SERIALIZED_NAME_TR_TYPE = "tr_type";

    @SerializedName(SERIALIZED_NAME_TR_TYPE)
    private StoreTransportType trType;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StoreConnectionType type;

    public IscsiConnection() {}

    public IscsiConnection clientPort(Integer clientPort) {

        this.clientPort = clientPort;
        return this;
    }

    /**
     * Get clientPort
     *
     * @return clientPort
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public IscsiConnection clientPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT);
        return this;
    }

    public IscsiConnection clientPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT);
        return this;
    }

    public void setClientPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT);
        }
    }

    public boolean getClientPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT);
    }

    public IscsiConnection cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public IscsiConnection cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public IscsiConnection cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public IscsiConnection host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public IscsiConnection host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public IscsiConnection host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public IscsiConnection id(String id) {

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

    public IscsiConnection id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public IscsiConnection id_ExplictlyNonNull() {
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

    public IscsiConnection initiatorIp(String initiatorIp) {

        this.initiatorIp = initiatorIp;
        return this;
    }

    /**
     * Get initiatorIp
     *
     * @return initiatorIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getInitiatorIp() {
        return initiatorIp;
    }

    public void setInitiatorIp(String initiatorIp) {
        this.initiatorIp = initiatorIp;
    }

    public IscsiConnection initiatorIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP);
        return this;
    }

    public IscsiConnection initiatorIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP);
        return this;
    }

    public void setInitiatorIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP);
        }
    }

    public boolean getInitiatorIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP);
    }

    public IscsiConnection iscsiTarget(NestedIscsiTarget iscsiTarget) {

        this.iscsiTarget = iscsiTarget;
        return this;
    }

    /**
     * Get iscsiTarget
     *
     * @return iscsiTarget
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedIscsiTarget getIscsiTarget() {
        return iscsiTarget;
    }

    public void setIscsiTarget(NestedIscsiTarget iscsiTarget) {
        this.iscsiTarget = iscsiTarget;
    }

    public IscsiConnection iscsiTarget_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET);
        return this;
    }

    public IscsiConnection iscsiTarget_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET);
        return this;
    }

    public void setIscsiTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET);
        }
    }

    public boolean getIscsiTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET);
    }

    public IscsiConnection nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedNvmfSubsystem getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public IscsiConnection nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public IscsiConnection nvmfSubsystem_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public void setNvmfSubsystem_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        }
    }

    public boolean getNvmfSubsystem_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM);
    }

    public IscsiConnection trType(StoreTransportType trType) {

        this.trType = trType;
        return this;
    }

    /**
     * Get trType
     *
     * @return trType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StoreTransportType getTrType() {
        return trType;
    }

    public void setTrType(StoreTransportType trType) {
        this.trType = trType;
    }

    public IscsiConnection trType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TR_TYPE);
        return this;
    }

    public IscsiConnection trType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE);
        return this;
    }

    public void setTrType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TR_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE);
        }
    }

    public boolean getTrType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TR_TYPE);
    }

    public IscsiConnection type(StoreConnectionType type) {

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
    public StoreConnectionType getType() {
        return type;
    }

    public void setType(StoreConnectionType type) {
        this.type = type;
    }

    public IscsiConnection type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public IscsiConnection type_ExplictlyNonNull() {
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
        IscsiConnection iscsiConnection = (IscsiConnection) o;
        return Objects.equals(this.clientPort, iscsiConnection.clientPort)
                && Objects.equals(this.cluster, iscsiConnection.cluster)
                && Objects.equals(this.host, iscsiConnection.host)
                && Objects.equals(this.id, iscsiConnection.id)
                && Objects.equals(this.initiatorIp, iscsiConnection.initiatorIp)
                && Objects.equals(this.iscsiTarget, iscsiConnection.iscsiTarget)
                && Objects.equals(this.nvmfSubsystem, iscsiConnection.nvmfSubsystem)
                && Objects.equals(this.trType, iscsiConnection.trType)
                && Objects.equals(this.type, iscsiConnection.type);
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
                clientPort,
                cluster,
                host,
                id,
                initiatorIp,
                iscsiTarget,
                nvmfSubsystem,
                trType,
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
        sb.append("class IscsiConnection {\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    initiatorIp: ").append(toIndentedString(initiatorIp)).append("\n");
        sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    trType: ").append(toIndentedString(trType)).append("\n");
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
