package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IscsiConnectionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiConnectionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<IscsiConnectionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<IscsiConnectionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<IscsiConnectionWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLIENT_PORT = "client_port";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT)
    private Integer clientPort;

    public static final String SERIALIZED_NAME_CLIENT_PORT_GT = "client_port_gt";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_GT)
    private Integer clientPortGt;

    public static final String SERIALIZED_NAME_CLIENT_PORT_GTE = "client_port_gte";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_GTE)
    private Integer clientPortGte;

    public static final String SERIALIZED_NAME_CLIENT_PORT_IN = "client_port_in";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_IN)
    private List<Integer> clientPortIn = null;

    public static final String SERIALIZED_NAME_CLIENT_PORT_LT = "client_port_lt";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_LT)
    private Integer clientPortLt;

    public static final String SERIALIZED_NAME_CLIENT_PORT_LTE = "client_port_lte";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_LTE)
    private Integer clientPortLte;

    public static final String SERIALIZED_NAME_CLIENT_PORT_NOT = "client_port_not";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_NOT)
    private Integer clientPortNot;

    public static final String SERIALIZED_NAME_CLIENT_PORT_NOT_IN = "client_port_not_in";

    @SerializedName(SERIALIZED_NAME_CLIENT_PORT_NOT_IN)
    private List<Integer> clientPortNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_INITIATOR_IP = "initiator_ip";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP)
    private String initiatorIp;

    public static final String SERIALIZED_NAME_INITIATOR_IP_CONTAINS = "initiator_ip_contains";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_CONTAINS)
    private String initiatorIpContains;

    public static final String SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH = "initiator_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH)
    private String initiatorIpEndsWith;

    public static final String SERIALIZED_NAME_INITIATOR_IP_GT = "initiator_ip_gt";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_GT)
    private String initiatorIpGt;

    public static final String SERIALIZED_NAME_INITIATOR_IP_GTE = "initiator_ip_gte";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_GTE)
    private String initiatorIpGte;

    public static final String SERIALIZED_NAME_INITIATOR_IP_IN = "initiator_ip_in";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_IN)
    private List<String> initiatorIpIn = null;

    public static final String SERIALIZED_NAME_INITIATOR_IP_LT = "initiator_ip_lt";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_LT)
    private String initiatorIpLt;

    public static final String SERIALIZED_NAME_INITIATOR_IP_LTE = "initiator_ip_lte";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_LTE)
    private String initiatorIpLte;

    public static final String SERIALIZED_NAME_INITIATOR_IP_NOT = "initiator_ip_not";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_NOT)
    private String initiatorIpNot;

    public static final String SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS =
            "initiator_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS)
    private String initiatorIpNotContains;

    public static final String SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH =
            "initiator_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH)
    private String initiatorIpNotEndsWith;

    public static final String SERIALIZED_NAME_INITIATOR_IP_NOT_IN = "initiator_ip_not_in";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_NOT_IN)
    private List<String> initiatorIpNotIn = null;

    public static final String SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH =
            "initiator_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH)
    private String initiatorIpNotStartsWith;

    public static final String SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH =
            "initiator_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH)
    private String initiatorIpStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
    private IscsiTargetWhereInput iscsiTarget;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NvmfSubsystemWhereInput nvmfSubsystem;

    public static final String SERIALIZED_NAME_TR_TYPE = "tr_type";

    @SerializedName(SERIALIZED_NAME_TR_TYPE)
    private StoreTransportType trType;

    public static final String SERIALIZED_NAME_TR_TYPE_IN = "tr_type_in";

    @SerializedName(SERIALIZED_NAME_TR_TYPE_IN)
    private List<StoreTransportType> trTypeIn = null;

    public static final String SERIALIZED_NAME_TR_TYPE_NOT = "tr_type_not";

    @SerializedName(SERIALIZED_NAME_TR_TYPE_NOT)
    private StoreTransportType trTypeNot;

    public static final String SERIALIZED_NAME_TR_TYPE_NOT_IN = "tr_type_not_in";

    @SerializedName(SERIALIZED_NAME_TR_TYPE_NOT_IN)
    private List<StoreTransportType> trTypeNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StoreConnectionType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<StoreConnectionType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private StoreConnectionType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<StoreConnectionType> typeNotIn = null;

    public IscsiConnectionWhereInput() {}

    public IscsiConnectionWhereInput AND(List<IscsiConnectionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public IscsiConnectionWhereInput addANDItem(IscsiConnectionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<IscsiConnectionWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IscsiConnectionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<IscsiConnectionWhereInput> AND) {
        this.AND = AND;
    }

    public IscsiConnectionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public IscsiConnectionWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public IscsiConnectionWhereInput NOT(List<IscsiConnectionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public IscsiConnectionWhereInput addNOTItem(IscsiConnectionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<IscsiConnectionWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IscsiConnectionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<IscsiConnectionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public IscsiConnectionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public IscsiConnectionWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public IscsiConnectionWhereInput OR(List<IscsiConnectionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public IscsiConnectionWhereInput addORItem(IscsiConnectionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<IscsiConnectionWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IscsiConnectionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<IscsiConnectionWhereInput> OR) {
        this.OR = OR;
    }

    public IscsiConnectionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public IscsiConnectionWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public IscsiConnectionWhereInput clientPort(Integer clientPort) {

        this.clientPort = clientPort;
        return this;
    }

    /**
     * Get clientPort
     *
     * @return clientPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public IscsiConnectionWhereInput clientPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT);
        return this;
    }

    public IscsiConnectionWhereInput clientPort_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput clientPortGt(Integer clientPortGt) {

        this.clientPortGt = clientPortGt;
        return this;
    }

    /**
     * Get clientPortGt
     *
     * @return clientPortGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPortGt() {
        return clientPortGt;
    }

    public void setClientPortGt(Integer clientPortGt) {
        this.clientPortGt = clientPortGt;
    }

    public IscsiConnectionWhereInput clientPortGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_GT);
        return this;
    }

    public IscsiConnectionWhereInput clientPortGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_GT);
        return this;
    }

    public void setClientPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_GT);
        }
    }

    public boolean getClientPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_GT);
    }

    public IscsiConnectionWhereInput clientPortGte(Integer clientPortGte) {

        this.clientPortGte = clientPortGte;
        return this;
    }

    /**
     * Get clientPortGte
     *
     * @return clientPortGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPortGte() {
        return clientPortGte;
    }

    public void setClientPortGte(Integer clientPortGte) {
        this.clientPortGte = clientPortGte;
    }

    public IscsiConnectionWhereInput clientPortGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_GTE);
        return this;
    }

    public IscsiConnectionWhereInput clientPortGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_GTE);
        return this;
    }

    public void setClientPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_GTE);
        }
    }

    public boolean getClientPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_GTE);
    }

    public IscsiConnectionWhereInput clientPortIn(List<Integer> clientPortIn) {

        this.clientPortIn = clientPortIn;
        return this;
    }

    public IscsiConnectionWhereInput addClientPortInItem(Integer clientPortInItem) {
        if (this.clientPortIn == null) {
            this.clientPortIn = new ArrayList<Integer>();
        }
        this.clientPortIn.add(clientPortInItem);
        return this;
    }

    /**
     * Get clientPortIn
     *
     * @return clientPortIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getClientPortIn() {
        return clientPortIn;
    }

    public void setClientPortIn(List<Integer> clientPortIn) {
        this.clientPortIn = clientPortIn;
    }

    public IscsiConnectionWhereInput clientPortIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_IN);
        return this;
    }

    public IscsiConnectionWhereInput clientPortIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_IN);
        return this;
    }

    public void setClientPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_IN);
        }
    }

    public boolean getClientPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_IN);
    }

    public IscsiConnectionWhereInput clientPortLt(Integer clientPortLt) {

        this.clientPortLt = clientPortLt;
        return this;
    }

    /**
     * Get clientPortLt
     *
     * @return clientPortLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPortLt() {
        return clientPortLt;
    }

    public void setClientPortLt(Integer clientPortLt) {
        this.clientPortLt = clientPortLt;
    }

    public IscsiConnectionWhereInput clientPortLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_LT);
        return this;
    }

    public IscsiConnectionWhereInput clientPortLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_LT);
        return this;
    }

    public void setClientPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_LT);
        }
    }

    public boolean getClientPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_LT);
    }

    public IscsiConnectionWhereInput clientPortLte(Integer clientPortLte) {

        this.clientPortLte = clientPortLte;
        return this;
    }

    /**
     * Get clientPortLte
     *
     * @return clientPortLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPortLte() {
        return clientPortLte;
    }

    public void setClientPortLte(Integer clientPortLte) {
        this.clientPortLte = clientPortLte;
    }

    public IscsiConnectionWhereInput clientPortLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_LTE);
        return this;
    }

    public IscsiConnectionWhereInput clientPortLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_LTE);
        return this;
    }

    public void setClientPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_LTE);
        }
    }

    public boolean getClientPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_LTE);
    }

    public IscsiConnectionWhereInput clientPortNot(Integer clientPortNot) {

        this.clientPortNot = clientPortNot;
        return this;
    }

    /**
     * Get clientPortNot
     *
     * @return clientPortNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClientPortNot() {
        return clientPortNot;
    }

    public void setClientPortNot(Integer clientPortNot) {
        this.clientPortNot = clientPortNot;
    }

    public IscsiConnectionWhereInput clientPortNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_NOT);
        return this;
    }

    public IscsiConnectionWhereInput clientPortNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_NOT);
        return this;
    }

    public void setClientPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_NOT);
        }
    }

    public boolean getClientPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_NOT);
    }

    public IscsiConnectionWhereInput clientPortNotIn(List<Integer> clientPortNotIn) {

        this.clientPortNotIn = clientPortNotIn;
        return this;
    }

    public IscsiConnectionWhereInput addClientPortNotInItem(Integer clientPortNotInItem) {
        if (this.clientPortNotIn == null) {
            this.clientPortNotIn = new ArrayList<Integer>();
        }
        this.clientPortNotIn.add(clientPortNotInItem);
        return this;
    }

    /**
     * Get clientPortNotIn
     *
     * @return clientPortNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getClientPortNotIn() {
        return clientPortNotIn;
    }

    public void setClientPortNotIn(List<Integer> clientPortNotIn) {
        this.clientPortNotIn = clientPortNotIn;
    }

    public IscsiConnectionWhereInput clientPortNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_NOT_IN);
        return this;
    }

    public IscsiConnectionWhereInput clientPortNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_NOT_IN);
        return this;
    }

    public void setClientPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLIENT_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLIENT_PORT_NOT_IN);
        }
    }

    public boolean getClientPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLIENT_PORT_NOT_IN);
    }

    public IscsiConnectionWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public IscsiConnectionWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public IscsiConnectionWhereInput cluster_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput host(HostWhereInput host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public IscsiConnectionWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public IscsiConnectionWhereInput host_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IscsiConnectionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public IscsiConnectionWhereInput id_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public IscsiConnectionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public IscsiConnectionWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public IscsiConnectionWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public IscsiConnectionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public IscsiConnectionWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public IscsiConnectionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public IscsiConnectionWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public IscsiConnectionWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public IscsiConnectionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public IscsiConnectionWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public IscsiConnectionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public IscsiConnectionWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public IscsiConnectionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public IscsiConnectionWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public IscsiConnectionWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public IscsiConnectionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public IscsiConnectionWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public IscsiConnectionWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public IscsiConnectionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public IscsiConnectionWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public IscsiConnectionWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public IscsiConnectionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public IscsiConnectionWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public IscsiConnectionWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public IscsiConnectionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public IscsiConnectionWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public IscsiConnectionWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public IscsiConnectionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public IscsiConnectionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public IscsiConnectionWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public IscsiConnectionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public IscsiConnectionWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public IscsiConnectionWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public IscsiConnectionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public IscsiConnectionWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public IscsiConnectionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public IscsiConnectionWhereInput initiatorIp(String initiatorIp) {

        this.initiatorIp = initiatorIp;
        return this;
    }

    /**
     * Get initiatorIp
     *
     * @return initiatorIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIp() {
        return initiatorIp;
    }

    public void setInitiatorIp(String initiatorIp) {
        this.initiatorIp = initiatorIp;
    }

    public IscsiConnectionWhereInput initiatorIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIp_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput initiatorIpContains(String initiatorIpContains) {

        this.initiatorIpContains = initiatorIpContains;
        return this;
    }

    /**
     * Get initiatorIpContains
     *
     * @return initiatorIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpContains() {
        return initiatorIpContains;
    }

    public void setInitiatorIpContains(String initiatorIpContains) {
        this.initiatorIpContains = initiatorIpContains;
    }

    public IscsiConnectionWhereInput initiatorIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_CONTAINS);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_CONTAINS);
        return this;
    }

    public void setInitiatorIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_CONTAINS);
        }
    }

    public boolean getInitiatorIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_CONTAINS);
    }

    public IscsiConnectionWhereInput initiatorIpEndsWith(String initiatorIpEndsWith) {

        this.initiatorIpEndsWith = initiatorIpEndsWith;
        return this;
    }

    /**
     * Get initiatorIpEndsWith
     *
     * @return initiatorIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpEndsWith() {
        return initiatorIpEndsWith;
    }

    public void setInitiatorIpEndsWith(String initiatorIpEndsWith) {
        this.initiatorIpEndsWith = initiatorIpEndsWith;
    }

    public IscsiConnectionWhereInput initiatorIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH);
        return this;
    }

    public void setInitiatorIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH);
        }
    }

    public boolean getInitiatorIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_ENDS_WITH);
    }

    public IscsiConnectionWhereInput initiatorIpGt(String initiatorIpGt) {

        this.initiatorIpGt = initiatorIpGt;
        return this;
    }

    /**
     * Get initiatorIpGt
     *
     * @return initiatorIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpGt() {
        return initiatorIpGt;
    }

    public void setInitiatorIpGt(String initiatorIpGt) {
        this.initiatorIpGt = initiatorIpGt;
    }

    public IscsiConnectionWhereInput initiatorIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_GT);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_GT);
        return this;
    }

    public void setInitiatorIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_GT);
        }
    }

    public boolean getInitiatorIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_GT);
    }

    public IscsiConnectionWhereInput initiatorIpGte(String initiatorIpGte) {

        this.initiatorIpGte = initiatorIpGte;
        return this;
    }

    /**
     * Get initiatorIpGte
     *
     * @return initiatorIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpGte() {
        return initiatorIpGte;
    }

    public void setInitiatorIpGte(String initiatorIpGte) {
        this.initiatorIpGte = initiatorIpGte;
    }

    public IscsiConnectionWhereInput initiatorIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_GTE);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_GTE);
        return this;
    }

    public void setInitiatorIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_GTE);
        }
    }

    public boolean getInitiatorIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_GTE);
    }

    public IscsiConnectionWhereInput initiatorIpIn(List<String> initiatorIpIn) {

        this.initiatorIpIn = initiatorIpIn;
        return this;
    }

    public IscsiConnectionWhereInput addInitiatorIpInItem(String initiatorIpInItem) {
        if (this.initiatorIpIn == null) {
            this.initiatorIpIn = new ArrayList<String>();
        }
        this.initiatorIpIn.add(initiatorIpInItem);
        return this;
    }

    /**
     * Get initiatorIpIn
     *
     * @return initiatorIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitiatorIpIn() {
        return initiatorIpIn;
    }

    public void setInitiatorIpIn(List<String> initiatorIpIn) {
        this.initiatorIpIn = initiatorIpIn;
    }

    public IscsiConnectionWhereInput initiatorIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_IN);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_IN);
        return this;
    }

    public void setInitiatorIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_IN);
        }
    }

    public boolean getInitiatorIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_IN);
    }

    public IscsiConnectionWhereInput initiatorIpLt(String initiatorIpLt) {

        this.initiatorIpLt = initiatorIpLt;
        return this;
    }

    /**
     * Get initiatorIpLt
     *
     * @return initiatorIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpLt() {
        return initiatorIpLt;
    }

    public void setInitiatorIpLt(String initiatorIpLt) {
        this.initiatorIpLt = initiatorIpLt;
    }

    public IscsiConnectionWhereInput initiatorIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_LT);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_LT);
        return this;
    }

    public void setInitiatorIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_LT);
        }
    }

    public boolean getInitiatorIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_LT);
    }

    public IscsiConnectionWhereInput initiatorIpLte(String initiatorIpLte) {

        this.initiatorIpLte = initiatorIpLte;
        return this;
    }

    /**
     * Get initiatorIpLte
     *
     * @return initiatorIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpLte() {
        return initiatorIpLte;
    }

    public void setInitiatorIpLte(String initiatorIpLte) {
        this.initiatorIpLte = initiatorIpLte;
    }

    public IscsiConnectionWhereInput initiatorIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_LTE);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_LTE);
        return this;
    }

    public void setInitiatorIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_LTE);
        }
    }

    public boolean getInitiatorIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_LTE);
    }

    public IscsiConnectionWhereInput initiatorIpNot(String initiatorIpNot) {

        this.initiatorIpNot = initiatorIpNot;
        return this;
    }

    /**
     * Get initiatorIpNot
     *
     * @return initiatorIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpNot() {
        return initiatorIpNot;
    }

    public void setInitiatorIpNot(String initiatorIpNot) {
        this.initiatorIpNot = initiatorIpNot;
    }

    public IscsiConnectionWhereInput initiatorIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT);
        return this;
    }

    public void setInitiatorIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT);
        }
    }

    public boolean getInitiatorIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_NOT);
    }

    public IscsiConnectionWhereInput initiatorIpNotContains(String initiatorIpNotContains) {

        this.initiatorIpNotContains = initiatorIpNotContains;
        return this;
    }

    /**
     * Get initiatorIpNotContains
     *
     * @return initiatorIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpNotContains() {
        return initiatorIpNotContains;
    }

    public void setInitiatorIpNotContains(String initiatorIpNotContains) {
        this.initiatorIpNotContains = initiatorIpNotContains;
    }

    public IscsiConnectionWhereInput initiatorIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS);
        return this;
    }

    public void setInitiatorIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS);
        }
    }

    public boolean getInitiatorIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_NOT_CONTAINS);
    }

    public IscsiConnectionWhereInput initiatorIpNotEndsWith(String initiatorIpNotEndsWith) {

        this.initiatorIpNotEndsWith = initiatorIpNotEndsWith;
        return this;
    }

    /**
     * Get initiatorIpNotEndsWith
     *
     * @return initiatorIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpNotEndsWith() {
        return initiatorIpNotEndsWith;
    }

    public void setInitiatorIpNotEndsWith(String initiatorIpNotEndsWith) {
        this.initiatorIpNotEndsWith = initiatorIpNotEndsWith;
    }

    public IscsiConnectionWhereInput initiatorIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setInitiatorIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getInitiatorIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_NOT_ENDS_WITH);
    }

    public IscsiConnectionWhereInput initiatorIpNotIn(List<String> initiatorIpNotIn) {

        this.initiatorIpNotIn = initiatorIpNotIn;
        return this;
    }

    public IscsiConnectionWhereInput addInitiatorIpNotInItem(String initiatorIpNotInItem) {
        if (this.initiatorIpNotIn == null) {
            this.initiatorIpNotIn = new ArrayList<String>();
        }
        this.initiatorIpNotIn.add(initiatorIpNotInItem);
        return this;
    }

    /**
     * Get initiatorIpNotIn
     *
     * @return initiatorIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitiatorIpNotIn() {
        return initiatorIpNotIn;
    }

    public void setInitiatorIpNotIn(List<String> initiatorIpNotIn) {
        this.initiatorIpNotIn = initiatorIpNotIn;
    }

    public IscsiConnectionWhereInput initiatorIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_IN);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_IN);
        return this;
    }

    public void setInitiatorIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_IN);
        }
    }

    public boolean getInitiatorIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_NOT_IN);
    }

    public IscsiConnectionWhereInput initiatorIpNotStartsWith(String initiatorIpNotStartsWith) {

        this.initiatorIpNotStartsWith = initiatorIpNotStartsWith;
        return this;
    }

    /**
     * Get initiatorIpNotStartsWith
     *
     * @return initiatorIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpNotStartsWith() {
        return initiatorIpNotStartsWith;
    }

    public void setInitiatorIpNotStartsWith(String initiatorIpNotStartsWith) {
        this.initiatorIpNotStartsWith = initiatorIpNotStartsWith;
    }

    public IscsiConnectionWhereInput initiatorIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setInitiatorIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getInitiatorIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_NOT_STARTS_WITH);
    }

    public IscsiConnectionWhereInput initiatorIpStartsWith(String initiatorIpStartsWith) {

        this.initiatorIpStartsWith = initiatorIpStartsWith;
        return this;
    }

    /**
     * Get initiatorIpStartsWith
     *
     * @return initiatorIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorIpStartsWith() {
        return initiatorIpStartsWith;
    }

    public void setInitiatorIpStartsWith(String initiatorIpStartsWith) {
        this.initiatorIpStartsWith = initiatorIpStartsWith;
    }

    public IscsiConnectionWhereInput initiatorIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH);
        return this;
    }

    public IscsiConnectionWhereInput initiatorIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH);
        return this;
    }

    public void setInitiatorIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH);
        }
    }

    public boolean getInitiatorIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_IP_STARTS_WITH);
    }

    public IscsiConnectionWhereInput iscsiTarget(IscsiTargetWhereInput iscsiTarget) {

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
    public IscsiTargetWhereInput getIscsiTarget() {
        return iscsiTarget;
    }

    public void setIscsiTarget(IscsiTargetWhereInput iscsiTarget) {
        this.iscsiTarget = iscsiTarget;
    }

    public IscsiConnectionWhereInput iscsiTarget_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET);
        return this;
    }

    public IscsiConnectionWhereInput iscsiTarget_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput nvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {

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
    public NvmfSubsystemWhereInput getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public IscsiConnectionWhereInput nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public IscsiConnectionWhereInput nvmfSubsystem_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput trType(StoreTransportType trType) {

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

    public IscsiConnectionWhereInput trType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TR_TYPE);
        return this;
    }

    public IscsiConnectionWhereInput trType_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput trTypeIn(List<StoreTransportType> trTypeIn) {

        this.trTypeIn = trTypeIn;
        return this;
    }

    public IscsiConnectionWhereInput addTrTypeInItem(StoreTransportType trTypeInItem) {
        if (this.trTypeIn == null) {
            this.trTypeIn = new ArrayList<StoreTransportType>();
        }
        this.trTypeIn.add(trTypeInItem);
        return this;
    }

    /**
     * Get trTypeIn
     *
     * @return trTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StoreTransportType> getTrTypeIn() {
        return trTypeIn;
    }

    public void setTrTypeIn(List<StoreTransportType> trTypeIn) {
        this.trTypeIn = trTypeIn;
    }

    public IscsiConnectionWhereInput trTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_IN);
        return this;
    }

    public IscsiConnectionWhereInput trTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_IN);
        return this;
    }

    public void setTrTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_IN);
        }
    }

    public boolean getTrTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TR_TYPE_IN);
    }

    public IscsiConnectionWhereInput trTypeNot(StoreTransportType trTypeNot) {

        this.trTypeNot = trTypeNot;
        return this;
    }

    /**
     * Get trTypeNot
     *
     * @return trTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StoreTransportType getTrTypeNot() {
        return trTypeNot;
    }

    public void setTrTypeNot(StoreTransportType trTypeNot) {
        this.trTypeNot = trTypeNot;
    }

    public IscsiConnectionWhereInput trTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_NOT);
        return this;
    }

    public IscsiConnectionWhereInput trTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_NOT);
        return this;
    }

    public void setTrTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_NOT);
        }
    }

    public boolean getTrTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TR_TYPE_NOT);
    }

    public IscsiConnectionWhereInput trTypeNotIn(List<StoreTransportType> trTypeNotIn) {

        this.trTypeNotIn = trTypeNotIn;
        return this;
    }

    public IscsiConnectionWhereInput addTrTypeNotInItem(StoreTransportType trTypeNotInItem) {
        if (this.trTypeNotIn == null) {
            this.trTypeNotIn = new ArrayList<StoreTransportType>();
        }
        this.trTypeNotIn.add(trTypeNotInItem);
        return this;
    }

    /**
     * Get trTypeNotIn
     *
     * @return trTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StoreTransportType> getTrTypeNotIn() {
        return trTypeNotIn;
    }

    public void setTrTypeNotIn(List<StoreTransportType> trTypeNotIn) {
        this.trTypeNotIn = trTypeNotIn;
    }

    public IscsiConnectionWhereInput trTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_NOT_IN);
        return this;
    }

    public IscsiConnectionWhereInput trTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_NOT_IN);
        return this;
    }

    public void setTrTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TR_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TR_TYPE_NOT_IN);
        }
    }

    public boolean getTrTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TR_TYPE_NOT_IN);
    }

    public IscsiConnectionWhereInput type(StoreConnectionType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StoreConnectionType getType() {
        return type;
    }

    public void setType(StoreConnectionType type) {
        this.type = type;
    }

    public IscsiConnectionWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public IscsiConnectionWhereInput type_ExplictlyNonNull() {
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

    public IscsiConnectionWhereInput typeIn(List<StoreConnectionType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public IscsiConnectionWhereInput addTypeInItem(StoreConnectionType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<StoreConnectionType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StoreConnectionType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<StoreConnectionType> typeIn) {
        this.typeIn = typeIn;
    }

    public IscsiConnectionWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public IscsiConnectionWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public IscsiConnectionWhereInput typeNot(StoreConnectionType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StoreConnectionType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(StoreConnectionType typeNot) {
        this.typeNot = typeNot;
    }

    public IscsiConnectionWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public IscsiConnectionWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public IscsiConnectionWhereInput typeNotIn(List<StoreConnectionType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public IscsiConnectionWhereInput addTypeNotInItem(StoreConnectionType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<StoreConnectionType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StoreConnectionType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<StoreConnectionType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public IscsiConnectionWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public IscsiConnectionWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiConnectionWhereInput iscsiConnectionWhereInput = (IscsiConnectionWhereInput) o;
        return Objects.equals(this.AND, iscsiConnectionWhereInput.AND)
                && Objects.equals(this.NOT, iscsiConnectionWhereInput.NOT)
                && Objects.equals(this.OR, iscsiConnectionWhereInput.OR)
                && Objects.equals(this.clientPort, iscsiConnectionWhereInput.clientPort)
                && Objects.equals(this.clientPortGt, iscsiConnectionWhereInput.clientPortGt)
                && Objects.equals(this.clientPortGte, iscsiConnectionWhereInput.clientPortGte)
                && Objects.equals(this.clientPortIn, iscsiConnectionWhereInput.clientPortIn)
                && Objects.equals(this.clientPortLt, iscsiConnectionWhereInput.clientPortLt)
                && Objects.equals(this.clientPortLte, iscsiConnectionWhereInput.clientPortLte)
                && Objects.equals(this.clientPortNot, iscsiConnectionWhereInput.clientPortNot)
                && Objects.equals(this.clientPortNotIn, iscsiConnectionWhereInput.clientPortNotIn)
                && Objects.equals(this.cluster, iscsiConnectionWhereInput.cluster)
                && Objects.equals(this.host, iscsiConnectionWhereInput.host)
                && Objects.equals(this.id, iscsiConnectionWhereInput.id)
                && Objects.equals(this.idContains, iscsiConnectionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, iscsiConnectionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, iscsiConnectionWhereInput.idGt)
                && Objects.equals(this.idGte, iscsiConnectionWhereInput.idGte)
                && Objects.equals(this.idIn, iscsiConnectionWhereInput.idIn)
                && Objects.equals(this.idLt, iscsiConnectionWhereInput.idLt)
                && Objects.equals(this.idLte, iscsiConnectionWhereInput.idLte)
                && Objects.equals(this.idNot, iscsiConnectionWhereInput.idNot)
                && Objects.equals(this.idNotContains, iscsiConnectionWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, iscsiConnectionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, iscsiConnectionWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, iscsiConnectionWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, iscsiConnectionWhereInput.idStartsWith)
                && Objects.equals(this.initiatorIp, iscsiConnectionWhereInput.initiatorIp)
                && Objects.equals(
                        this.initiatorIpContains, iscsiConnectionWhereInput.initiatorIpContains)
                && Objects.equals(
                        this.initiatorIpEndsWith, iscsiConnectionWhereInput.initiatorIpEndsWith)
                && Objects.equals(this.initiatorIpGt, iscsiConnectionWhereInput.initiatorIpGt)
                && Objects.equals(this.initiatorIpGte, iscsiConnectionWhereInput.initiatorIpGte)
                && Objects.equals(this.initiatorIpIn, iscsiConnectionWhereInput.initiatorIpIn)
                && Objects.equals(this.initiatorIpLt, iscsiConnectionWhereInput.initiatorIpLt)
                && Objects.equals(this.initiatorIpLte, iscsiConnectionWhereInput.initiatorIpLte)
                && Objects.equals(this.initiatorIpNot, iscsiConnectionWhereInput.initiatorIpNot)
                && Objects.equals(
                        this.initiatorIpNotContains,
                        iscsiConnectionWhereInput.initiatorIpNotContains)
                && Objects.equals(
                        this.initiatorIpNotEndsWith,
                        iscsiConnectionWhereInput.initiatorIpNotEndsWith)
                && Objects.equals(this.initiatorIpNotIn, iscsiConnectionWhereInput.initiatorIpNotIn)
                && Objects.equals(
                        this.initiatorIpNotStartsWith,
                        iscsiConnectionWhereInput.initiatorIpNotStartsWith)
                && Objects.equals(
                        this.initiatorIpStartsWith, iscsiConnectionWhereInput.initiatorIpStartsWith)
                && Objects.equals(this.iscsiTarget, iscsiConnectionWhereInput.iscsiTarget)
                && Objects.equals(this.nvmfSubsystem, iscsiConnectionWhereInput.nvmfSubsystem)
                && Objects.equals(this.trType, iscsiConnectionWhereInput.trType)
                && Objects.equals(this.trTypeIn, iscsiConnectionWhereInput.trTypeIn)
                && Objects.equals(this.trTypeNot, iscsiConnectionWhereInput.trTypeNot)
                && Objects.equals(this.trTypeNotIn, iscsiConnectionWhereInput.trTypeNotIn)
                && Objects.equals(this.type, iscsiConnectionWhereInput.type)
                && Objects.equals(this.typeIn, iscsiConnectionWhereInput.typeIn)
                && Objects.equals(this.typeNot, iscsiConnectionWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, iscsiConnectionWhereInput.typeNotIn);
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
                AND,
                NOT,
                OR,
                clientPort,
                clientPortGt,
                clientPortGte,
                clientPortIn,
                clientPortLt,
                clientPortLte,
                clientPortNot,
                clientPortNotIn,
                cluster,
                host,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                initiatorIp,
                initiatorIpContains,
                initiatorIpEndsWith,
                initiatorIpGt,
                initiatorIpGte,
                initiatorIpIn,
                initiatorIpLt,
                initiatorIpLte,
                initiatorIpNot,
                initiatorIpNotContains,
                initiatorIpNotEndsWith,
                initiatorIpNotIn,
                initiatorIpNotStartsWith,
                initiatorIpStartsWith,
                iscsiTarget,
                nvmfSubsystem,
                trType,
                trTypeIn,
                trTypeNot,
                trTypeNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn);
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
        sb.append("class IscsiConnectionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    clientPortGt: ").append(toIndentedString(clientPortGt)).append("\n");
        sb.append("    clientPortGte: ").append(toIndentedString(clientPortGte)).append("\n");
        sb.append("    clientPortIn: ").append(toIndentedString(clientPortIn)).append("\n");
        sb.append("    clientPortLt: ").append(toIndentedString(clientPortLt)).append("\n");
        sb.append("    clientPortLte: ").append(toIndentedString(clientPortLte)).append("\n");
        sb.append("    clientPortNot: ").append(toIndentedString(clientPortNot)).append("\n");
        sb.append("    clientPortNotIn: ").append(toIndentedString(clientPortNotIn)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    initiatorIp: ").append(toIndentedString(initiatorIp)).append("\n");
        sb.append("    initiatorIpContains: ")
                .append(toIndentedString(initiatorIpContains))
                .append("\n");
        sb.append("    initiatorIpEndsWith: ")
                .append(toIndentedString(initiatorIpEndsWith))
                .append("\n");
        sb.append("    initiatorIpGt: ").append(toIndentedString(initiatorIpGt)).append("\n");
        sb.append("    initiatorIpGte: ").append(toIndentedString(initiatorIpGte)).append("\n");
        sb.append("    initiatorIpIn: ").append(toIndentedString(initiatorIpIn)).append("\n");
        sb.append("    initiatorIpLt: ").append(toIndentedString(initiatorIpLt)).append("\n");
        sb.append("    initiatorIpLte: ").append(toIndentedString(initiatorIpLte)).append("\n");
        sb.append("    initiatorIpNot: ").append(toIndentedString(initiatorIpNot)).append("\n");
        sb.append("    initiatorIpNotContains: ")
                .append(toIndentedString(initiatorIpNotContains))
                .append("\n");
        sb.append("    initiatorIpNotEndsWith: ")
                .append(toIndentedString(initiatorIpNotEndsWith))
                .append("\n");
        sb.append("    initiatorIpNotIn: ").append(toIndentedString(initiatorIpNotIn)).append("\n");
        sb.append("    initiatorIpNotStartsWith: ")
                .append(toIndentedString(initiatorIpNotStartsWith))
                .append("\n");
        sb.append("    initiatorIpStartsWith: ")
                .append(toIndentedString(initiatorIpStartsWith))
                .append("\n");
        sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    trType: ").append(toIndentedString(trType)).append("\n");
        sb.append("    trTypeIn: ").append(toIndentedString(trTypeIn)).append("\n");
        sb.append("    trTypeNot: ").append(toIndentedString(trTypeNot)).append("\n");
        sb.append("    trTypeNotIn: ").append(toIndentedString(trTypeNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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
