package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VsphereEsxiAccountWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VsphereEsxiAccountWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VsphereEsxiAccountWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VsphereEsxiAccountWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VsphereEsxiAccountWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_IP_CONTAINS = "ip_contains";

    @SerializedName(SERIALIZED_NAME_IP_CONTAINS)
    private String ipContains;

    public static final String SERIALIZED_NAME_IP_ENDS_WITH = "ip_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ENDS_WITH)
    private String ipEndsWith;

    public static final String SERIALIZED_NAME_IP_GT = "ip_gt";

    @SerializedName(SERIALIZED_NAME_IP_GT)
    private String ipGt;

    public static final String SERIALIZED_NAME_IP_GTE = "ip_gte";

    @SerializedName(SERIALIZED_NAME_IP_GTE)
    private String ipGte;

    public static final String SERIALIZED_NAME_IP_IN = "ip_in";

    @SerializedName(SERIALIZED_NAME_IP_IN)
    private List<String> ipIn = null;

    public static final String SERIALIZED_NAME_IP_LT = "ip_lt";

    @SerializedName(SERIALIZED_NAME_IP_LT)
    private String ipLt;

    public static final String SERIALIZED_NAME_IP_LTE = "ip_lte";

    @SerializedName(SERIALIZED_NAME_IP_LTE)
    private String ipLte;

    public static final String SERIALIZED_NAME_IP_NOT = "ip_not";

    @SerializedName(SERIALIZED_NAME_IP_NOT)
    private String ipNot;

    public static final String SERIALIZED_NAME_IP_NOT_CONTAINS = "ip_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_NOT_CONTAINS)
    private String ipNotContains;

    public static final String SERIALIZED_NAME_IP_NOT_ENDS_WITH = "ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_NOT_ENDS_WITH)
    private String ipNotEndsWith;

    public static final String SERIALIZED_NAME_IP_NOT_IN = "ip_not_in";

    @SerializedName(SERIALIZED_NAME_IP_NOT_IN)
    private List<String> ipNotIn = null;

    public static final String SERIALIZED_NAME_IP_NOT_STARTS_WITH = "ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_NOT_STARTS_WITH)
    private String ipNotStartsWith;

    public static final String SERIALIZED_NAME_IP_STARTS_WITH = "ip_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_STARTS_WITH)
    private String ipStartsWith;

    public static final String SERIALIZED_NAME_IS_VALID = "is_valid";

    @SerializedName(SERIALIZED_NAME_IS_VALID)
    private Boolean isValid;

    public static final String SERIALIZED_NAME_IS_VALID_NOT = "is_valid_not";

    @SerializedName(SERIALIZED_NAME_IS_VALID_NOT)
    private Boolean isValidNot;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PORT_GT = "port_gt";

    @SerializedName(SERIALIZED_NAME_PORT_GT)
    private Integer portGt;

    public static final String SERIALIZED_NAME_PORT_GTE = "port_gte";

    @SerializedName(SERIALIZED_NAME_PORT_GTE)
    private Integer portGte;

    public static final String SERIALIZED_NAME_PORT_IN = "port_in";

    @SerializedName(SERIALIZED_NAME_PORT_IN)
    private List<Integer> portIn = null;

    public static final String SERIALIZED_NAME_PORT_LT = "port_lt";

    @SerializedName(SERIALIZED_NAME_PORT_LT)
    private Integer portLt;

    public static final String SERIALIZED_NAME_PORT_LTE = "port_lte";

    @SerializedName(SERIALIZED_NAME_PORT_LTE)
    private Integer portLte;

    public static final String SERIALIZED_NAME_PORT_NOT = "port_not";

    @SerializedName(SERIALIZED_NAME_PORT_NOT)
    private Integer portNot;

    public static final String SERIALIZED_NAME_PORT_NOT_IN = "port_not_in";

    @SerializedName(SERIALIZED_NAME_PORT_NOT_IN)
    private List<Integer> portNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
    private String usernameContains;

    public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
    private String usernameEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";

    @SerializedName(SERIALIZED_NAME_USERNAME_GT)
    private String usernameGt;

    public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";

    @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
    private String usernameGte;

    public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_IN)
    private List<String> usernameIn = null;

    public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";

    @SerializedName(SERIALIZED_NAME_USERNAME_LT)
    private String usernameLt;

    public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";

    @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
    private String usernameLte;

    public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
    private String usernameNot;

    public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
    private String usernameNotContains;

    public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
    private String usernameNotEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
    private List<String> usernameNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH =
            "username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
    private String usernameNotStartsWith;

    public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
    private String usernameStartsWith;

    public VsphereEsxiAccountWhereInput() {}

    public VsphereEsxiAccountWhereInput AND(List<VsphereEsxiAccountWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VsphereEsxiAccountWhereInput addANDItem(VsphereEsxiAccountWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VsphereEsxiAccountWhereInput>();
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
    public List<VsphereEsxiAccountWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VsphereEsxiAccountWhereInput> AND) {
        this.AND = AND;
    }

    public VsphereEsxiAccountWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VsphereEsxiAccountWhereInput AND_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput NOT(List<VsphereEsxiAccountWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VsphereEsxiAccountWhereInput addNOTItem(VsphereEsxiAccountWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VsphereEsxiAccountWhereInput>();
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
    public List<VsphereEsxiAccountWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VsphereEsxiAccountWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VsphereEsxiAccountWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VsphereEsxiAccountWhereInput NOT_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput OR(List<VsphereEsxiAccountWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VsphereEsxiAccountWhereInput addORItem(VsphereEsxiAccountWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VsphereEsxiAccountWhereInput>();
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
    public List<VsphereEsxiAccountWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VsphereEsxiAccountWhereInput> OR) {
        this.OR = OR;
    }

    public VsphereEsxiAccountWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VsphereEsxiAccountWhereInput OR_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput host(HostWhereInput host) {

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

    public VsphereEsxiAccountWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public VsphereEsxiAccountWhereInput host_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput id(String id) {

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

    public VsphereEsxiAccountWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VsphereEsxiAccountWhereInput id_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idContains(String idContains) {

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

    public VsphereEsxiAccountWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput idContains_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idEndsWith(String idEndsWith) {

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

    public VsphereEsxiAccountWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idGt(String idGt) {

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

    public VsphereEsxiAccountWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VsphereEsxiAccountWhereInput idGt_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idGte(String idGte) {

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

    public VsphereEsxiAccountWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput idGte_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addIdInItem(String idInItem) {
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

    public VsphereEsxiAccountWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput idIn_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idLt(String idLt) {

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

    public VsphereEsxiAccountWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VsphereEsxiAccountWhereInput idLt_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idLte(String idLte) {

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

    public VsphereEsxiAccountWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput idLte_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idNot(String idNot) {

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

    public VsphereEsxiAccountWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput idNot_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idNotContains(String idNotContains) {

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

    public VsphereEsxiAccountWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput idNotContains_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VsphereEsxiAccountWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addIdNotInItem(String idNotInItem) {
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

    public VsphereEsxiAccountWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput idNotIn_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VsphereEsxiAccountWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput idStartsWith(String idStartsWith) {

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

    public VsphereEsxiAccountWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput ip(String ip) {

        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     *
     * @return ip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public VsphereEsxiAccountWhereInput ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public VsphereEsxiAccountWhereInput ip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP);
        return this;
    }

    public void setIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP);
        }
    }

    public boolean getIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP);
    }

    public VsphereEsxiAccountWhereInput ipContains(String ipContains) {

        this.ipContains = ipContains;
        return this;
    }

    /**
     * Get ipContains
     *
     * @return ipContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpContains() {
        return ipContains;
    }

    public void setIpContains(String ipContains) {
        this.ipContains = ipContains;
    }

    public VsphereEsxiAccountWhereInput ipContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_CONTAINS);
        return this;
    }

    public void setIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_CONTAINS);
        }
    }

    public boolean getIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput ipEndsWith(String ipEndsWith) {

        this.ipEndsWith = ipEndsWith;
        return this;
    }

    /**
     * Get ipEndsWith
     *
     * @return ipEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpEndsWith() {
        return ipEndsWith;
    }

    public void setIpEndsWith(String ipEndsWith) {
        this.ipEndsWith = ipEndsWith;
    }

    public VsphereEsxiAccountWhereInput ipEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ENDS_WITH);
        return this;
    }

    public void setIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ENDS_WITH);
        }
    }

    public boolean getIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput ipGt(String ipGt) {

        this.ipGt = ipGt;
        return this;
    }

    /**
     * Get ipGt
     *
     * @return ipGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpGt() {
        return ipGt;
    }

    public void setIpGt(String ipGt) {
        this.ipGt = ipGt;
    }

    public VsphereEsxiAccountWhereInput ipGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_GT);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_GT);
        return this;
    }

    public void setIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_GT);
        }
    }

    public boolean getIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_GT);
    }

    public VsphereEsxiAccountWhereInput ipGte(String ipGte) {

        this.ipGte = ipGte;
        return this;
    }

    /**
     * Get ipGte
     *
     * @return ipGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpGte() {
        return ipGte;
    }

    public void setIpGte(String ipGte) {
        this.ipGte = ipGte;
    }

    public VsphereEsxiAccountWhereInput ipGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_GTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_GTE);
        return this;
    }

    public void setIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_GTE);
        }
    }

    public boolean getIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_GTE);
    }

    public VsphereEsxiAccountWhereInput ipIn(List<String> ipIn) {

        this.ipIn = ipIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addIpInItem(String ipInItem) {
        if (this.ipIn == null) {
            this.ipIn = new ArrayList<String>();
        }
        this.ipIn.add(ipInItem);
        return this;
    }

    /**
     * Get ipIn
     *
     * @return ipIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpIn() {
        return ipIn;
    }

    public void setIpIn(List<String> ipIn) {
        this.ipIn = ipIn;
    }

    public VsphereEsxiAccountWhereInput ipIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_IN);
        return this;
    }

    public void setIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_IN);
        }
    }

    public boolean getIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_IN);
    }

    public VsphereEsxiAccountWhereInput ipLt(String ipLt) {

        this.ipLt = ipLt;
        return this;
    }

    /**
     * Get ipLt
     *
     * @return ipLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpLt() {
        return ipLt;
    }

    public void setIpLt(String ipLt) {
        this.ipLt = ipLt;
    }

    public VsphereEsxiAccountWhereInput ipLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_LT);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_LT);
        return this;
    }

    public void setIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_LT);
        }
    }

    public boolean getIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_LT);
    }

    public VsphereEsxiAccountWhereInput ipLte(String ipLte) {

        this.ipLte = ipLte;
        return this;
    }

    /**
     * Get ipLte
     *
     * @return ipLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpLte() {
        return ipLte;
    }

    public void setIpLte(String ipLte) {
        this.ipLte = ipLte;
    }

    public VsphereEsxiAccountWhereInput ipLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_LTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_LTE);
        return this;
    }

    public void setIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_LTE);
        }
    }

    public boolean getIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_LTE);
    }

    public VsphereEsxiAccountWhereInput ipNot(String ipNot) {

        this.ipNot = ipNot;
        return this;
    }

    /**
     * Get ipNot
     *
     * @return ipNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNot() {
        return ipNot;
    }

    public void setIpNot(String ipNot) {
        this.ipNot = ipNot;
    }

    public VsphereEsxiAccountWhereInput ipNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT);
        return this;
    }

    public void setIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT);
        }
    }

    public boolean getIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT);
    }

    public VsphereEsxiAccountWhereInput ipNotContains(String ipNotContains) {

        this.ipNotContains = ipNotContains;
        return this;
    }

    /**
     * Get ipNotContains
     *
     * @return ipNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotContains() {
        return ipNotContains;
    }

    public void setIpNotContains(String ipNotContains) {
        this.ipNotContains = ipNotContains;
    }

    public VsphereEsxiAccountWhereInput ipNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_CONTAINS);
        return this;
    }

    public void setIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_CONTAINS);
        }
    }

    public boolean getIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput ipNotEndsWith(String ipNotEndsWith) {

        this.ipNotEndsWith = ipNotEndsWith;
        return this;
    }

    /**
     * Get ipNotEndsWith
     *
     * @return ipNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotEndsWith() {
        return ipNotEndsWith;
    }

    public void setIpNotEndsWith(String ipNotEndsWith) {
        this.ipNotEndsWith = ipNotEndsWith;
    }

    public VsphereEsxiAccountWhereInput ipNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput ipNotIn(List<String> ipNotIn) {

        this.ipNotIn = ipNotIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addIpNotInItem(String ipNotInItem) {
        if (this.ipNotIn == null) {
            this.ipNotIn = new ArrayList<String>();
        }
        this.ipNotIn.add(ipNotInItem);
        return this;
    }

    /**
     * Get ipNotIn
     *
     * @return ipNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpNotIn() {
        return ipNotIn;
    }

    public void setIpNotIn(List<String> ipNotIn) {
        this.ipNotIn = ipNotIn;
    }

    public VsphereEsxiAccountWhereInput ipNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_IN);
        return this;
    }

    public void setIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_IN);
        }
    }

    public boolean getIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_IN);
    }

    public VsphereEsxiAccountWhereInput ipNotStartsWith(String ipNotStartsWith) {

        this.ipNotStartsWith = ipNotStartsWith;
        return this;
    }

    /**
     * Get ipNotStartsWith
     *
     * @return ipNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpNotStartsWith() {
        return ipNotStartsWith;
    }

    public void setIpNotStartsWith(String ipNotStartsWith) {
        this.ipNotStartsWith = ipNotStartsWith;
    }

    public VsphereEsxiAccountWhereInput ipNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_NOT_STARTS_WITH);
    }

    public VsphereEsxiAccountWhereInput ipStartsWith(String ipStartsWith) {

        this.ipStartsWith = ipStartsWith;
        return this;
    }

    /**
     * Get ipStartsWith
     *
     * @return ipStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpStartsWith() {
        return ipStartsWith;
    }

    public void setIpStartsWith(String ipStartsWith) {
        this.ipStartsWith = ipStartsWith;
    }

    public VsphereEsxiAccountWhereInput ipStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput ipStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_STARTS_WITH);
        return this;
    }

    public void setIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_STARTS_WITH);
        }
    }

    public boolean getIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_STARTS_WITH);
    }

    public VsphereEsxiAccountWhereInput isValid(Boolean isValid) {

        this.isValid = isValid;
        return this;
    }

    /**
     * Get isValid
     *
     * @return isValid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public VsphereEsxiAccountWhereInput isValid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_VALID);
        return this;
    }

    public VsphereEsxiAccountWhereInput isValid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_VALID);
        return this;
    }

    public void setIsValid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_VALID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_VALID);
        }
    }

    public boolean getIsValid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_VALID);
    }

    public VsphereEsxiAccountWhereInput isValidNot(Boolean isValidNot) {

        this.isValidNot = isValidNot;
        return this;
    }

    /**
     * Get isValidNot
     *
     * @return isValidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsValidNot() {
        return isValidNot;
    }

    public void setIsValidNot(Boolean isValidNot) {
        this.isValidNot = isValidNot;
    }

    public VsphereEsxiAccountWhereInput isValidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_VALID_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput isValidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_VALID_NOT);
        return this;
    }

    public void setIsValidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_VALID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_VALID_NOT);
        }
    }

    public boolean getIsValidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_VALID_NOT);
    }

    public VsphereEsxiAccountWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VsphereEsxiAccountWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VsphereEsxiAccountWhereInput localId_ExplictlyNonNull() {
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

    public VsphereEsxiAccountWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public VsphereEsxiAccountWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public VsphereEsxiAccountWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public VsphereEsxiAccountWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public VsphereEsxiAccountWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public VsphereEsxiAccountWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public VsphereEsxiAccountWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public VsphereEsxiAccountWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public VsphereEsxiAccountWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public VsphereEsxiAccountWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public VsphereEsxiAccountWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public VsphereEsxiAccountWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public VsphereEsxiAccountWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public VsphereEsxiAccountWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public VsphereEsxiAccountWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public VsphereEsxiAccountWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public VsphereEsxiAccountWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public VsphereEsxiAccountWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public VsphereEsxiAccountWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public VsphereEsxiAccountWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public VsphereEsxiAccountWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public VsphereEsxiAccountWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public VsphereEsxiAccountWhereInput port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VsphereEsxiAccountWhereInput port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public VsphereEsxiAccountWhereInput port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public VsphereEsxiAccountWhereInput portGt(Integer portGt) {

        this.portGt = portGt;
        return this;
    }

    /**
     * Get portGt
     *
     * @return portGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGt() {
        return portGt;
    }

    public void setPortGt(Integer portGt) {
        this.portGt = portGt;
    }

    public VsphereEsxiAccountWhereInput portGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public VsphereEsxiAccountWhereInput portGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public void setPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        }
    }

    public boolean getPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GT);
    }

    public VsphereEsxiAccountWhereInput portGte(Integer portGte) {

        this.portGte = portGte;
        return this;
    }

    /**
     * Get portGte
     *
     * @return portGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGte() {
        return portGte;
    }

    public void setPortGte(Integer portGte) {
        this.portGte = portGte;
    }

    public VsphereEsxiAccountWhereInput portGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput portGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public void setPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        }
    }

    public boolean getPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GTE);
    }

    public VsphereEsxiAccountWhereInput portIn(List<Integer> portIn) {

        this.portIn = portIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addPortInItem(Integer portInItem) {
        if (this.portIn == null) {
            this.portIn = new ArrayList<Integer>();
        }
        this.portIn.add(portInItem);
        return this;
    }

    /**
     * Get portIn
     *
     * @return portIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortIn() {
        return portIn;
    }

    public void setPortIn(List<Integer> portIn) {
        this.portIn = portIn;
    }

    public VsphereEsxiAccountWhereInput portIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput portIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public void setPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        }
    }

    public boolean getPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_IN);
    }

    public VsphereEsxiAccountWhereInput portLt(Integer portLt) {

        this.portLt = portLt;
        return this;
    }

    /**
     * Get portLt
     *
     * @return portLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLt() {
        return portLt;
    }

    public void setPortLt(Integer portLt) {
        this.portLt = portLt;
    }

    public VsphereEsxiAccountWhereInput portLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public VsphereEsxiAccountWhereInput portLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public void setPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        }
    }

    public boolean getPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LT);
    }

    public VsphereEsxiAccountWhereInput portLte(Integer portLte) {

        this.portLte = portLte;
        return this;
    }

    /**
     * Get portLte
     *
     * @return portLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLte() {
        return portLte;
    }

    public void setPortLte(Integer portLte) {
        this.portLte = portLte;
    }

    public VsphereEsxiAccountWhereInput portLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput portLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public void setPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        }
    }

    public boolean getPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LTE);
    }

    public VsphereEsxiAccountWhereInput portNot(Integer portNot) {

        this.portNot = portNot;
        return this;
    }

    /**
     * Get portNot
     *
     * @return portNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortNot() {
        return portNot;
    }

    public void setPortNot(Integer portNot) {
        this.portNot = portNot;
    }

    public VsphereEsxiAccountWhereInput portNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput portNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public void setPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        }
    }

    public boolean getPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT);
    }

    public VsphereEsxiAccountWhereInput portNotIn(List<Integer> portNotIn) {

        this.portNotIn = portNotIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addPortNotInItem(Integer portNotInItem) {
        if (this.portNotIn == null) {
            this.portNotIn = new ArrayList<Integer>();
        }
        this.portNotIn.add(portNotInItem);
        return this;
    }

    /**
     * Get portNotIn
     *
     * @return portNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortNotIn() {
        return portNotIn;
    }

    public void setPortNotIn(List<Integer> portNotIn) {
        this.portNotIn = portNotIn;
    }

    public VsphereEsxiAccountWhereInput portNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput portNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public void setPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        }
    }

    public boolean getPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT_IN);
    }

    public VsphereEsxiAccountWhereInput username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public VsphereEsxiAccountWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public VsphereEsxiAccountWhereInput username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    public VsphereEsxiAccountWhereInput usernameContains(String usernameContains) {

        this.usernameContains = usernameContains;
        return this;
    }

    /**
     * Get usernameContains
     *
     * @return usernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameContains() {
        return usernameContains;
    }

    public void setUsernameContains(String usernameContains) {
        this.usernameContains = usernameContains;
    }

    public VsphereEsxiAccountWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public void setUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        }
    }

    public boolean getUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput usernameEndsWith(String usernameEndsWith) {

        this.usernameEndsWith = usernameEndsWith;
        return this;
    }

    /**
     * Get usernameEndsWith
     *
     * @return usernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameEndsWith() {
        return usernameEndsWith;
    }

    public void setUsernameEndsWith(String usernameEndsWith) {
        this.usernameEndsWith = usernameEndsWith;
    }

    public VsphereEsxiAccountWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public void setUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        }
    }

    public boolean getUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput usernameGt(String usernameGt) {

        this.usernameGt = usernameGt;
        return this;
    }

    /**
     * Get usernameGt
     *
     * @return usernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGt() {
        return usernameGt;
    }

    public void setUsernameGt(String usernameGt) {
        this.usernameGt = usernameGt;
    }

    public VsphereEsxiAccountWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public void setUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        }
    }

    public boolean getUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GT);
    }

    public VsphereEsxiAccountWhereInput usernameGte(String usernameGte) {

        this.usernameGte = usernameGte;
        return this;
    }

    /**
     * Get usernameGte
     *
     * @return usernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGte() {
        return usernameGte;
    }

    public void setUsernameGte(String usernameGte) {
        this.usernameGte = usernameGte;
    }

    public VsphereEsxiAccountWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public void setUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        }
    }

    public boolean getUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GTE);
    }

    public VsphereEsxiAccountWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addUsernameInItem(String usernameInItem) {
        if (this.usernameIn == null) {
            this.usernameIn = new ArrayList<String>();
        }
        this.usernameIn.add(usernameInItem);
        return this;
    }

    /**
     * Get usernameIn
     *
     * @return usernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(List<String> usernameIn) {
        this.usernameIn = usernameIn;
    }

    public VsphereEsxiAccountWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public void setUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        }
    }

    public boolean getUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_IN);
    }

    public VsphereEsxiAccountWhereInput usernameLt(String usernameLt) {

        this.usernameLt = usernameLt;
        return this;
    }

    /**
     * Get usernameLt
     *
     * @return usernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLt() {
        return usernameLt;
    }

    public void setUsernameLt(String usernameLt) {
        this.usernameLt = usernameLt;
    }

    public VsphereEsxiAccountWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public void setUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        }
    }

    public boolean getUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LT);
    }

    public VsphereEsxiAccountWhereInput usernameLte(String usernameLte) {

        this.usernameLte = usernameLte;
        return this;
    }

    /**
     * Get usernameLte
     *
     * @return usernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLte() {
        return usernameLte;
    }

    public void setUsernameLte(String usernameLte) {
        this.usernameLte = usernameLte;
    }

    public VsphereEsxiAccountWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public void setUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        }
    }

    public boolean getUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LTE);
    }

    public VsphereEsxiAccountWhereInput usernameNot(String usernameNot) {

        this.usernameNot = usernameNot;
        return this;
    }

    /**
     * Get usernameNot
     *
     * @return usernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNot() {
        return usernameNot;
    }

    public void setUsernameNot(String usernameNot) {
        this.usernameNot = usernameNot;
    }

    public VsphereEsxiAccountWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public void setUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        }
    }

    public boolean getUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT);
    }

    public VsphereEsxiAccountWhereInput usernameNotContains(String usernameNotContains) {

        this.usernameNotContains = usernameNotContains;
        return this;
    }

    /**
     * Get usernameNotContains
     *
     * @return usernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotContains() {
        return usernameNotContains;
    }

    public void setUsernameNotContains(String usernameNotContains) {
        this.usernameNotContains = usernameNotContains;
    }

    public VsphereEsxiAccountWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
    }

    public VsphereEsxiAccountWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

        this.usernameNotEndsWith = usernameNotEndsWith;
        return this;
    }

    /**
     * Get usernameNotEndsWith
     *
     * @return usernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotEndsWith() {
        return usernameNotEndsWith;
    }

    public void setUsernameNotEndsWith(String usernameNotEndsWith) {
        this.usernameNotEndsWith = usernameNotEndsWith;
    }

    public VsphereEsxiAccountWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
    }

    public VsphereEsxiAccountWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public VsphereEsxiAccountWhereInput addUsernameNotInItem(String usernameNotInItem) {
        if (this.usernameNotIn == null) {
            this.usernameNotIn = new ArrayList<String>();
        }
        this.usernameNotIn.add(usernameNotInItem);
        return this;
    }

    /**
     * Get usernameNotIn
     *
     * @return usernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameNotIn() {
        return usernameNotIn;
    }

    public void setUsernameNotIn(List<String> usernameNotIn) {
        this.usernameNotIn = usernameNotIn;
    }

    public VsphereEsxiAccountWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public void setUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        }
    }

    public boolean getUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_IN);
    }

    public VsphereEsxiAccountWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

        this.usernameNotStartsWith = usernameNotStartsWith;
        return this;
    }

    /**
     * Get usernameNotStartsWith
     *
     * @return usernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotStartsWith() {
        return usernameNotStartsWith;
    }

    public void setUsernameNotStartsWith(String usernameNotStartsWith) {
        this.usernameNotStartsWith = usernameNotStartsWith;
    }

    public VsphereEsxiAccountWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
    }

    public VsphereEsxiAccountWhereInput usernameStartsWith(String usernameStartsWith) {

        this.usernameStartsWith = usernameStartsWith;
        return this;
    }

    /**
     * Get usernameStartsWith
     *
     * @return usernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameStartsWith() {
        return usernameStartsWith;
    }

    public void setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
    }

    public VsphereEsxiAccountWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public VsphereEsxiAccountWhereInput usernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public void setUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        }
    }

    public boolean getUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VsphereEsxiAccountWhereInput vsphereEsxiAccountWhereInput =
                (VsphereEsxiAccountWhereInput) o;
        return Objects.equals(this.AND, vsphereEsxiAccountWhereInput.AND)
                && Objects.equals(this.NOT, vsphereEsxiAccountWhereInput.NOT)
                && Objects.equals(this.OR, vsphereEsxiAccountWhereInput.OR)
                && Objects.equals(this.host, vsphereEsxiAccountWhereInput.host)
                && Objects.equals(this.id, vsphereEsxiAccountWhereInput.id)
                && Objects.equals(this.idContains, vsphereEsxiAccountWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vsphereEsxiAccountWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vsphereEsxiAccountWhereInput.idGt)
                && Objects.equals(this.idGte, vsphereEsxiAccountWhereInput.idGte)
                && Objects.equals(this.idIn, vsphereEsxiAccountWhereInput.idIn)
                && Objects.equals(this.idLt, vsphereEsxiAccountWhereInput.idLt)
                && Objects.equals(this.idLte, vsphereEsxiAccountWhereInput.idLte)
                && Objects.equals(this.idNot, vsphereEsxiAccountWhereInput.idNot)
                && Objects.equals(this.idNotContains, vsphereEsxiAccountWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vsphereEsxiAccountWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vsphereEsxiAccountWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, vsphereEsxiAccountWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vsphereEsxiAccountWhereInput.idStartsWith)
                && Objects.equals(this.ip, vsphereEsxiAccountWhereInput.ip)
                && Objects.equals(this.ipContains, vsphereEsxiAccountWhereInput.ipContains)
                && Objects.equals(this.ipEndsWith, vsphereEsxiAccountWhereInput.ipEndsWith)
                && Objects.equals(this.ipGt, vsphereEsxiAccountWhereInput.ipGt)
                && Objects.equals(this.ipGte, vsphereEsxiAccountWhereInput.ipGte)
                && Objects.equals(this.ipIn, vsphereEsxiAccountWhereInput.ipIn)
                && Objects.equals(this.ipLt, vsphereEsxiAccountWhereInput.ipLt)
                && Objects.equals(this.ipLte, vsphereEsxiAccountWhereInput.ipLte)
                && Objects.equals(this.ipNot, vsphereEsxiAccountWhereInput.ipNot)
                && Objects.equals(this.ipNotContains, vsphereEsxiAccountWhereInput.ipNotContains)
                && Objects.equals(this.ipNotEndsWith, vsphereEsxiAccountWhereInput.ipNotEndsWith)
                && Objects.equals(this.ipNotIn, vsphereEsxiAccountWhereInput.ipNotIn)
                && Objects.equals(
                        this.ipNotStartsWith, vsphereEsxiAccountWhereInput.ipNotStartsWith)
                && Objects.equals(this.ipStartsWith, vsphereEsxiAccountWhereInput.ipStartsWith)
                && Objects.equals(this.isValid, vsphereEsxiAccountWhereInput.isValid)
                && Objects.equals(this.isValidNot, vsphereEsxiAccountWhereInput.isValidNot)
                && Objects.equals(this.localId, vsphereEsxiAccountWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, vsphereEsxiAccountWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, vsphereEsxiAccountWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vsphereEsxiAccountWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vsphereEsxiAccountWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vsphereEsxiAccountWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vsphereEsxiAccountWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vsphereEsxiAccountWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vsphereEsxiAccountWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, vsphereEsxiAccountWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, vsphereEsxiAccountWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vsphereEsxiAccountWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        vsphereEsxiAccountWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, vsphereEsxiAccountWhereInput.localIdStartsWith)
                && Objects.equals(this.port, vsphereEsxiAccountWhereInput.port)
                && Objects.equals(this.portGt, vsphereEsxiAccountWhereInput.portGt)
                && Objects.equals(this.portGte, vsphereEsxiAccountWhereInput.portGte)
                && Objects.equals(this.portIn, vsphereEsxiAccountWhereInput.portIn)
                && Objects.equals(this.portLt, vsphereEsxiAccountWhereInput.portLt)
                && Objects.equals(this.portLte, vsphereEsxiAccountWhereInput.portLte)
                && Objects.equals(this.portNot, vsphereEsxiAccountWhereInput.portNot)
                && Objects.equals(this.portNotIn, vsphereEsxiAccountWhereInput.portNotIn)
                && Objects.equals(this.username, vsphereEsxiAccountWhereInput.username)
                && Objects.equals(
                        this.usernameContains, vsphereEsxiAccountWhereInput.usernameContains)
                && Objects.equals(
                        this.usernameEndsWith, vsphereEsxiAccountWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, vsphereEsxiAccountWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, vsphereEsxiAccountWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, vsphereEsxiAccountWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, vsphereEsxiAccountWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, vsphereEsxiAccountWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, vsphereEsxiAccountWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains, vsphereEsxiAccountWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith, vsphereEsxiAccountWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, vsphereEsxiAccountWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith,
                        vsphereEsxiAccountWhereInput.usernameNotStartsWith)
                && Objects.equals(
                        this.usernameStartsWith, vsphereEsxiAccountWhereInput.usernameStartsWith);
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
                ip,
                ipContains,
                ipEndsWith,
                ipGt,
                ipGte,
                ipIn,
                ipLt,
                ipLte,
                ipNot,
                ipNotContains,
                ipNotEndsWith,
                ipNotIn,
                ipNotStartsWith,
                ipStartsWith,
                isValid,
                isValidNot,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                port,
                portGt,
                portGte,
                portIn,
                portLt,
                portLte,
                portNot,
                portNotIn,
                username,
                usernameContains,
                usernameEndsWith,
                usernameGt,
                usernameGte,
                usernameIn,
                usernameLt,
                usernameLte,
                usernameNot,
                usernameNotContains,
                usernameNotEndsWith,
                usernameNotIn,
                usernameNotStartsWith,
                usernameStartsWith);
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
        sb.append("class VsphereEsxiAccountWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ipContains: ").append(toIndentedString(ipContains)).append("\n");
        sb.append("    ipEndsWith: ").append(toIndentedString(ipEndsWith)).append("\n");
        sb.append("    ipGt: ").append(toIndentedString(ipGt)).append("\n");
        sb.append("    ipGte: ").append(toIndentedString(ipGte)).append("\n");
        sb.append("    ipIn: ").append(toIndentedString(ipIn)).append("\n");
        sb.append("    ipLt: ").append(toIndentedString(ipLt)).append("\n");
        sb.append("    ipLte: ").append(toIndentedString(ipLte)).append("\n");
        sb.append("    ipNot: ").append(toIndentedString(ipNot)).append("\n");
        sb.append("    ipNotContains: ").append(toIndentedString(ipNotContains)).append("\n");
        sb.append("    ipNotEndsWith: ").append(toIndentedString(ipNotEndsWith)).append("\n");
        sb.append("    ipNotIn: ").append(toIndentedString(ipNotIn)).append("\n");
        sb.append("    ipNotStartsWith: ").append(toIndentedString(ipNotStartsWith)).append("\n");
        sb.append("    ipStartsWith: ").append(toIndentedString(ipStartsWith)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    isValidNot: ").append(toIndentedString(isValidNot)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portGt: ").append(toIndentedString(portGt)).append("\n");
        sb.append("    portGte: ").append(toIndentedString(portGte)).append("\n");
        sb.append("    portIn: ").append(toIndentedString(portIn)).append("\n");
        sb.append("    portLt: ").append(toIndentedString(portLt)).append("\n");
        sb.append("    portLte: ").append(toIndentedString(portLte)).append("\n");
        sb.append("    portNot: ").append(toIndentedString(portNot)).append("\n");
        sb.append("    portNotIn: ").append(toIndentedString(portNotIn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
        sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
        sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
        sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
        sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
        sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
        sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
        sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
        sb.append("    usernameNotContains: ")
                .append(toIndentedString(usernameNotContains))
                .append("\n");
        sb.append("    usernameNotEndsWith: ")
                .append(toIndentedString(usernameNotEndsWith))
                .append("\n");
        sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
        sb.append("    usernameNotStartsWith: ")
                .append(toIndentedString(usernameNotStartsWith))
                .append("\n");
        sb.append("    usernameStartsWith: ")
                .append(toIndentedString(usernameStartsWith))
                .append("\n");
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
