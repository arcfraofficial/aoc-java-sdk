package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SecurityGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_SOME = "security_policies_some";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_SOME)
    private SecurityPolicyWhereInput securityPoliciesSome;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_NONE = "security_policies_none";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_NONE)
    private SecurityPolicyWhereInput securityPoliciesNone;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_EVERY = "security_policies_every";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_EVERY)
    private SecurityPolicyWhereInput securityPoliciesEvery;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SecurityGroupWhereInput> OR = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SecurityGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_MEMBER_TYPE_NOT_IN = "member_type_not_in";

    @SerializedName(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN)
    private List<SecurityGroupMemberType> memberTypeNotIn = null;

    public static final String SERIALIZED_NAME_MEMBER_TYPE_NOT = "member_type_not";

    @SerializedName(SERIALIZED_NAME_MEMBER_TYPE_NOT)
    private SecurityGroupMemberType memberTypeNot;

    public static final String SERIALIZED_NAME_MEMBER_TYPE_IN = "member_type_in";

    @SerializedName(SERIALIZED_NAME_MEMBER_TYPE_IN)
    private List<SecurityGroupMemberType> memberTypeIn = null;

    public static final String SERIALIZED_NAME_MEMBER_TYPE = "member_type";

    @SerializedName(SERIALIZED_NAME_MEMBER_TYPE)
    private SecurityGroupMemberType memberType;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_SOME = "isolation_policies_some";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_SOME)
    private IsolationPolicyWhereInput isolationPoliciesSome;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_NONE = "isolation_policies_none";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_NONE)
    private IsolationPolicyWhereInput isolationPoliciesNone;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_EVERY =
            "isolation_policies_every";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY)
    private IsolationPolicyWhereInput isolationPoliciesEvery;

    public static final String SERIALIZED_NAME_IPS_STARTS_WITH = "ips_starts_with";

    @SerializedName(SERIALIZED_NAME_IPS_STARTS_WITH)
    private String ipsStartsWith;

    public static final String SERIALIZED_NAME_IPS_NOT_STARTS_WITH = "ips_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IPS_NOT_STARTS_WITH)
    private String ipsNotStartsWith;

    public static final String SERIALIZED_NAME_IPS_NOT_IN = "ips_not_in";

    @SerializedName(SERIALIZED_NAME_IPS_NOT_IN)
    private List<String> ipsNotIn = null;

    public static final String SERIALIZED_NAME_IPS_NOT_ENDS_WITH = "ips_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IPS_NOT_ENDS_WITH)
    private String ipsNotEndsWith;

    public static final String SERIALIZED_NAME_IPS_NOT_CONTAINS = "ips_not_contains";

    @SerializedName(SERIALIZED_NAME_IPS_NOT_CONTAINS)
    private String ipsNotContains;

    public static final String SERIALIZED_NAME_IPS_NOT = "ips_not";

    @SerializedName(SERIALIZED_NAME_IPS_NOT)
    private String ipsNot;

    public static final String SERIALIZED_NAME_IPS_LTE = "ips_lte";

    @SerializedName(SERIALIZED_NAME_IPS_LTE)
    private String ipsLte;

    public static final String SERIALIZED_NAME_IPS_LT = "ips_lt";

    @SerializedName(SERIALIZED_NAME_IPS_LT)
    private String ipsLt;

    public static final String SERIALIZED_NAME_IPS_IN = "ips_in";

    @SerializedName(SERIALIZED_NAME_IPS_IN)
    private List<String> ipsIn = null;

    public static final String SERIALIZED_NAME_IPS_GTE = "ips_gte";

    @SerializedName(SERIALIZED_NAME_IPS_GTE)
    private String ipsGte;

    public static final String SERIALIZED_NAME_IPS_GT = "ips_gt";

    @SerializedName(SERIALIZED_NAME_IPS_GT)
    private String ipsGt;

    public static final String SERIALIZED_NAME_IPS_ENDS_WITH = "ips_ends_with";

    @SerializedName(SERIALIZED_NAME_IPS_ENDS_WITH)
    private String ipsEndsWith;

    public static final String SERIALIZED_NAME_IPS_CONTAINS = "ips_contains";

    @SerializedName(SERIALIZED_NAME_IPS_CONTAINS)
    private String ipsContains;

    public static final String SERIALIZED_NAME_IPS = "ips";

    @SerializedName(SERIALIZED_NAME_IPS)
    private String ips;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH = "exclude_ips_starts_with";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH)
    private String excludeIpsStartsWith;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH =
            "exclude_ips_not_starts_with";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH)
    private String excludeIpsNotStartsWith;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN = "exclude_ips_not_in";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN)
    private List<String> excludeIpsNotIn = null;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH =
            "exclude_ips_not_ends_with";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH)
    private String excludeIpsNotEndsWith;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS =
            "exclude_ips_not_contains";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS)
    private String excludeIpsNotContains;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_NOT = "exclude_ips_not";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_NOT)
    private String excludeIpsNot;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_LTE = "exclude_ips_lte";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_LTE)
    private String excludeIpsLte;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_LT = "exclude_ips_lt";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_LT)
    private String excludeIpsLt;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_IN = "exclude_ips_in";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_IN)
    private List<String> excludeIpsIn = null;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_GTE = "exclude_ips_gte";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_GTE)
    private String excludeIpsGte;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_GT = "exclude_ips_gt";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_GT)
    private String excludeIpsGt;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH = "exclude_ips_ends_with";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH)
    private String excludeIpsEndsWith;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS = "exclude_ips_contains";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS)
    private String excludeIpsContains;

    public static final String SERIALIZED_NAME_EXCLUDE_IPS = "exclude_ips";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IPS)
    private String excludeIps;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private EverouteClusterWhereInput everouteCluster;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SecurityGroupWhereInput> AND = null;

    public SecurityGroupWhereInput() {}

    public SecurityGroupWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public SecurityGroupWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public SecurityGroupWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    public SecurityGroupWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public SecurityGroupWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public SecurityGroupWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public SecurityGroupWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public SecurityGroupWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public SecurityGroupWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public SecurityGroupWhereInput securityPoliciesSome(
            SecurityPolicyWhereInput securityPoliciesSome) {

        this.securityPoliciesSome = securityPoliciesSome;
        return this;
    }

    /**
     * Get securityPoliciesSome
     *
     * @return securityPoliciesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityPolicyWhereInput getSecurityPoliciesSome() {
        return securityPoliciesSome;
    }

    public void setSecurityPoliciesSome(SecurityPolicyWhereInput securityPoliciesSome) {
        this.securityPoliciesSome = securityPoliciesSome;
    }

    public SecurityGroupWhereInput securityPoliciesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        return this;
    }

    public SecurityGroupWhereInput securityPoliciesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        return this;
    }

    public void setSecurityPoliciesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        }
    }

    public boolean getSecurityPoliciesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
    }

    public SecurityGroupWhereInput securityPoliciesNone(
            SecurityPolicyWhereInput securityPoliciesNone) {

        this.securityPoliciesNone = securityPoliciesNone;
        return this;
    }

    /**
     * Get securityPoliciesNone
     *
     * @return securityPoliciesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityPolicyWhereInput getSecurityPoliciesNone() {
        return securityPoliciesNone;
    }

    public void setSecurityPoliciesNone(SecurityPolicyWhereInput securityPoliciesNone) {
        this.securityPoliciesNone = securityPoliciesNone;
    }

    public SecurityGroupWhereInput securityPoliciesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        return this;
    }

    public SecurityGroupWhereInput securityPoliciesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        return this;
    }

    public void setSecurityPoliciesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        }
    }

    public boolean getSecurityPoliciesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
    }

    public SecurityGroupWhereInput securityPoliciesEvery(
            SecurityPolicyWhereInput securityPoliciesEvery) {

        this.securityPoliciesEvery = securityPoliciesEvery;
        return this;
    }

    /**
     * Get securityPoliciesEvery
     *
     * @return securityPoliciesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityPolicyWhereInput getSecurityPoliciesEvery() {
        return securityPoliciesEvery;
    }

    public void setSecurityPoliciesEvery(SecurityPolicyWhereInput securityPoliciesEvery) {
        this.securityPoliciesEvery = securityPoliciesEvery;
    }

    public SecurityGroupWhereInput securityPoliciesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        return this;
    }

    public SecurityGroupWhereInput securityPoliciesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        return this;
    }

    public void setSecurityPoliciesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        }
    }

    public boolean getSecurityPoliciesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
    }

    public SecurityGroupWhereInput OR(List<SecurityGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SecurityGroupWhereInput addORItem(SecurityGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SecurityGroupWhereInput>();
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
    public List<SecurityGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SecurityGroupWhereInput> OR) {
        this.OR = OR;
    }

    public SecurityGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SecurityGroupWhereInput OR_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput NOT(List<SecurityGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SecurityGroupWhereInput addNOTItem(SecurityGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SecurityGroupWhereInput>();
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
    public List<SecurityGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SecurityGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SecurityGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SecurityGroupWhereInput NOT_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public SecurityGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public SecurityGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public SecurityGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public SecurityGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SecurityGroupWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public SecurityGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public SecurityGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public SecurityGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public SecurityGroupWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public SecurityGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public SecurityGroupWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public SecurityGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SecurityGroupWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public SecurityGroupWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public SecurityGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SecurityGroupWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public SecurityGroupWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public SecurityGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SecurityGroupWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public SecurityGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SecurityGroupWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public SecurityGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SecurityGroupWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public SecurityGroupWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public SecurityGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SecurityGroupWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public SecurityGroupWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public SecurityGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SecurityGroupWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public SecurityGroupWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public SecurityGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public SecurityGroupWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public SecurityGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public SecurityGroupWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SecurityGroupWhereInput name_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput memberTypeNotIn(List<SecurityGroupMemberType> memberTypeNotIn) {

        this.memberTypeNotIn = memberTypeNotIn;
        return this;
    }

    public SecurityGroupWhereInput addMemberTypeNotInItem(
            SecurityGroupMemberType memberTypeNotInItem) {
        if (this.memberTypeNotIn == null) {
            this.memberTypeNotIn = new ArrayList<SecurityGroupMemberType>();
        }
        this.memberTypeNotIn.add(memberTypeNotInItem);
        return this;
    }

    /**
     * Get memberTypeNotIn
     *
     * @return memberTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SecurityGroupMemberType> getMemberTypeNotIn() {
        return memberTypeNotIn;
    }

    public void setMemberTypeNotIn(List<SecurityGroupMemberType> memberTypeNotIn) {
        this.memberTypeNotIn = memberTypeNotIn;
    }

    public SecurityGroupWhereInput memberTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput memberTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN);
        return this;
    }

    public void setMemberTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN);
        }
    }

    public boolean getMemberTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMBER_TYPE_NOT_IN);
    }

    public SecurityGroupWhereInput memberTypeNot(SecurityGroupMemberType memberTypeNot) {

        this.memberTypeNot = memberTypeNot;
        return this;
    }

    /**
     * Get memberTypeNot
     *
     * @return memberTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityGroupMemberType getMemberTypeNot() {
        return memberTypeNot;
    }

    public void setMemberTypeNot(SecurityGroupMemberType memberTypeNot) {
        this.memberTypeNot = memberTypeNot;
    }

    public SecurityGroupWhereInput memberTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_NOT);
        return this;
    }

    public SecurityGroupWhereInput memberTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_NOT);
        return this;
    }

    public void setMemberTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_NOT);
        }
    }

    public boolean getMemberTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMBER_TYPE_NOT);
    }

    public SecurityGroupWhereInput memberTypeIn(List<SecurityGroupMemberType> memberTypeIn) {

        this.memberTypeIn = memberTypeIn;
        return this;
    }

    public SecurityGroupWhereInput addMemberTypeInItem(SecurityGroupMemberType memberTypeInItem) {
        if (this.memberTypeIn == null) {
            this.memberTypeIn = new ArrayList<SecurityGroupMemberType>();
        }
        this.memberTypeIn.add(memberTypeInItem);
        return this;
    }

    /**
     * Get memberTypeIn
     *
     * @return memberTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SecurityGroupMemberType> getMemberTypeIn() {
        return memberTypeIn;
    }

    public void setMemberTypeIn(List<SecurityGroupMemberType> memberTypeIn) {
        this.memberTypeIn = memberTypeIn;
    }

    public SecurityGroupWhereInput memberTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_IN);
        return this;
    }

    public SecurityGroupWhereInput memberTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_IN);
        return this;
    }

    public void setMemberTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE_IN);
        }
    }

    public boolean getMemberTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMBER_TYPE_IN);
    }

    public SecurityGroupWhereInput memberType(SecurityGroupMemberType memberType) {

        this.memberType = memberType;
        return this;
    }

    /**
     * Get memberType
     *
     * @return memberType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityGroupMemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(SecurityGroupMemberType memberType) {
        this.memberType = memberType;
    }

    public SecurityGroupWhereInput memberType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE);
        return this;
    }

    public SecurityGroupWhereInput memberType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE);
        return this;
    }

    public void setMemberType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMBER_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMBER_TYPE);
        }
    }

    public boolean getMemberType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMBER_TYPE);
    }

    public SecurityGroupWhereInput isolationPoliciesSome(
            IsolationPolicyWhereInput isolationPoliciesSome) {

        this.isolationPoliciesSome = isolationPoliciesSome;
        return this;
    }

    /**
     * Get isolationPoliciesSome
     *
     * @return isolationPoliciesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IsolationPolicyWhereInput getIsolationPoliciesSome() {
        return isolationPoliciesSome;
    }

    public void setIsolationPoliciesSome(IsolationPolicyWhereInput isolationPoliciesSome) {
        this.isolationPoliciesSome = isolationPoliciesSome;
    }

    public SecurityGroupWhereInput isolationPoliciesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
        return this;
    }

    public SecurityGroupWhereInput isolationPoliciesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
        return this;
    }

    public void setIsolationPoliciesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
        }
    }

    public boolean getIsolationPoliciesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
    }

    public SecurityGroupWhereInput isolationPoliciesNone(
            IsolationPolicyWhereInput isolationPoliciesNone) {

        this.isolationPoliciesNone = isolationPoliciesNone;
        return this;
    }

    /**
     * Get isolationPoliciesNone
     *
     * @return isolationPoliciesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IsolationPolicyWhereInput getIsolationPoliciesNone() {
        return isolationPoliciesNone;
    }

    public void setIsolationPoliciesNone(IsolationPolicyWhereInput isolationPoliciesNone) {
        this.isolationPoliciesNone = isolationPoliciesNone;
    }

    public SecurityGroupWhereInput isolationPoliciesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
        return this;
    }

    public SecurityGroupWhereInput isolationPoliciesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
        return this;
    }

    public void setIsolationPoliciesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
        }
    }

    public boolean getIsolationPoliciesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
    }

    public SecurityGroupWhereInput isolationPoliciesEvery(
            IsolationPolicyWhereInput isolationPoliciesEvery) {

        this.isolationPoliciesEvery = isolationPoliciesEvery;
        return this;
    }

    /**
     * Get isolationPoliciesEvery
     *
     * @return isolationPoliciesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IsolationPolicyWhereInput getIsolationPoliciesEvery() {
        return isolationPoliciesEvery;
    }

    public void setIsolationPoliciesEvery(IsolationPolicyWhereInput isolationPoliciesEvery) {
        this.isolationPoliciesEvery = isolationPoliciesEvery;
    }

    public SecurityGroupWhereInput isolationPoliciesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
        return this;
    }

    public SecurityGroupWhereInput isolationPoliciesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
        return this;
    }

    public void setIsolationPoliciesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
        }
    }

    public boolean getIsolationPoliciesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
    }

    public SecurityGroupWhereInput ipsStartsWith(String ipsStartsWith) {

        this.ipsStartsWith = ipsStartsWith;
        return this;
    }

    /**
     * Get ipsStartsWith
     *
     * @return ipsStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsStartsWith() {
        return ipsStartsWith;
    }

    public void setIpsStartsWith(String ipsStartsWith) {
        this.ipsStartsWith = ipsStartsWith;
    }

    public SecurityGroupWhereInput ipsStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput ipsStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_STARTS_WITH);
        return this;
    }

    public void setIpsStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_STARTS_WITH);
        }
    }

    public boolean getIpsStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_STARTS_WITH);
    }

    public SecurityGroupWhereInput ipsNotStartsWith(String ipsNotStartsWith) {

        this.ipsNotStartsWith = ipsNotStartsWith;
        return this;
    }

    /**
     * Get ipsNotStartsWith
     *
     * @return ipsNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsNotStartsWith() {
        return ipsNotStartsWith;
    }

    public void setIpsNotStartsWith(String ipsNotStartsWith) {
        this.ipsNotStartsWith = ipsNotStartsWith;
    }

    public SecurityGroupWhereInput ipsNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput ipsNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_STARTS_WITH);
        return this;
    }

    public void setIpsNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_STARTS_WITH);
        }
    }

    public boolean getIpsNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_NOT_STARTS_WITH);
    }

    public SecurityGroupWhereInput ipsNotIn(List<String> ipsNotIn) {

        this.ipsNotIn = ipsNotIn;
        return this;
    }

    public SecurityGroupWhereInput addIpsNotInItem(String ipsNotInItem) {
        if (this.ipsNotIn == null) {
            this.ipsNotIn = new ArrayList<String>();
        }
        this.ipsNotIn.add(ipsNotInItem);
        return this;
    }

    /**
     * Get ipsNotIn
     *
     * @return ipsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpsNotIn() {
        return ipsNotIn;
    }

    public void setIpsNotIn(List<String> ipsNotIn) {
        this.ipsNotIn = ipsNotIn;
    }

    public SecurityGroupWhereInput ipsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput ipsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_IN);
        return this;
    }

    public void setIpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_IN);
        }
    }

    public boolean getIpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_NOT_IN);
    }

    public SecurityGroupWhereInput ipsNotEndsWith(String ipsNotEndsWith) {

        this.ipsNotEndsWith = ipsNotEndsWith;
        return this;
    }

    /**
     * Get ipsNotEndsWith
     *
     * @return ipsNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsNotEndsWith() {
        return ipsNotEndsWith;
    }

    public void setIpsNotEndsWith(String ipsNotEndsWith) {
        this.ipsNotEndsWith = ipsNotEndsWith;
    }

    public SecurityGroupWhereInput ipsNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput ipsNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_ENDS_WITH);
        return this;
    }

    public void setIpsNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_ENDS_WITH);
        }
    }

    public boolean getIpsNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_NOT_ENDS_WITH);
    }

    public SecurityGroupWhereInput ipsNotContains(String ipsNotContains) {

        this.ipsNotContains = ipsNotContains;
        return this;
    }

    /**
     * Get ipsNotContains
     *
     * @return ipsNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsNotContains() {
        return ipsNotContains;
    }

    public void setIpsNotContains(String ipsNotContains) {
        this.ipsNotContains = ipsNotContains;
    }

    public SecurityGroupWhereInput ipsNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput ipsNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_CONTAINS);
        return this;
    }

    public void setIpsNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT_CONTAINS);
        }
    }

    public boolean getIpsNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_NOT_CONTAINS);
    }

    public SecurityGroupWhereInput ipsNot(String ipsNot) {

        this.ipsNot = ipsNot;
        return this;
    }

    /**
     * Get ipsNot
     *
     * @return ipsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsNot() {
        return ipsNot;
    }

    public void setIpsNot(String ipsNot) {
        this.ipsNot = ipsNot;
    }

    public SecurityGroupWhereInput ipsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_NOT);
        return this;
    }

    public SecurityGroupWhereInput ipsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT);
        return this;
    }

    public void setIpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_NOT);
        }
    }

    public boolean getIpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_NOT);
    }

    public SecurityGroupWhereInput ipsLte(String ipsLte) {

        this.ipsLte = ipsLte;
        return this;
    }

    /**
     * Get ipsLte
     *
     * @return ipsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsLte() {
        return ipsLte;
    }

    public void setIpsLte(String ipsLte) {
        this.ipsLte = ipsLte;
    }

    public SecurityGroupWhereInput ipsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_LTE);
        return this;
    }

    public SecurityGroupWhereInput ipsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_LTE);
        return this;
    }

    public void setIpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_LTE);
        }
    }

    public boolean getIpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_LTE);
    }

    public SecurityGroupWhereInput ipsLt(String ipsLt) {

        this.ipsLt = ipsLt;
        return this;
    }

    /**
     * Get ipsLt
     *
     * @return ipsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsLt() {
        return ipsLt;
    }

    public void setIpsLt(String ipsLt) {
        this.ipsLt = ipsLt;
    }

    public SecurityGroupWhereInput ipsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_LT);
        return this;
    }

    public SecurityGroupWhereInput ipsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_LT);
        return this;
    }

    public void setIpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_LT);
        }
    }

    public boolean getIpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_LT);
    }

    public SecurityGroupWhereInput ipsIn(List<String> ipsIn) {

        this.ipsIn = ipsIn;
        return this;
    }

    public SecurityGroupWhereInput addIpsInItem(String ipsInItem) {
        if (this.ipsIn == null) {
            this.ipsIn = new ArrayList<String>();
        }
        this.ipsIn.add(ipsInItem);
        return this;
    }

    /**
     * Get ipsIn
     *
     * @return ipsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpsIn() {
        return ipsIn;
    }

    public void setIpsIn(List<String> ipsIn) {
        this.ipsIn = ipsIn;
    }

    public SecurityGroupWhereInput ipsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_IN);
        return this;
    }

    public SecurityGroupWhereInput ipsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_IN);
        return this;
    }

    public void setIpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_IN);
        }
    }

    public boolean getIpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_IN);
    }

    public SecurityGroupWhereInput ipsGte(String ipsGte) {

        this.ipsGte = ipsGte;
        return this;
    }

    /**
     * Get ipsGte
     *
     * @return ipsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsGte() {
        return ipsGte;
    }

    public void setIpsGte(String ipsGte) {
        this.ipsGte = ipsGte;
    }

    public SecurityGroupWhereInput ipsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_GTE);
        return this;
    }

    public SecurityGroupWhereInput ipsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_GTE);
        return this;
    }

    public void setIpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_GTE);
        }
    }

    public boolean getIpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_GTE);
    }

    public SecurityGroupWhereInput ipsGt(String ipsGt) {

        this.ipsGt = ipsGt;
        return this;
    }

    /**
     * Get ipsGt
     *
     * @return ipsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsGt() {
        return ipsGt;
    }

    public void setIpsGt(String ipsGt) {
        this.ipsGt = ipsGt;
    }

    public SecurityGroupWhereInput ipsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_GT);
        return this;
    }

    public SecurityGroupWhereInput ipsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_GT);
        return this;
    }

    public void setIpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_GT);
        }
    }

    public boolean getIpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_GT);
    }

    public SecurityGroupWhereInput ipsEndsWith(String ipsEndsWith) {

        this.ipsEndsWith = ipsEndsWith;
        return this;
    }

    /**
     * Get ipsEndsWith
     *
     * @return ipsEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsEndsWith() {
        return ipsEndsWith;
    }

    public void setIpsEndsWith(String ipsEndsWith) {
        this.ipsEndsWith = ipsEndsWith;
    }

    public SecurityGroupWhereInput ipsEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput ipsEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_ENDS_WITH);
        return this;
    }

    public void setIpsEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_ENDS_WITH);
        }
    }

    public boolean getIpsEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_ENDS_WITH);
    }

    public SecurityGroupWhereInput ipsContains(String ipsContains) {

        this.ipsContains = ipsContains;
        return this;
    }

    /**
     * Get ipsContains
     *
     * @return ipsContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpsContains() {
        return ipsContains;
    }

    public void setIpsContains(String ipsContains) {
        this.ipsContains = ipsContains;
    }

    public SecurityGroupWhereInput ipsContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput ipsContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS_CONTAINS);
        return this;
    }

    public void setIpsContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS_CONTAINS);
        }
    }

    public boolean getIpsContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS_CONTAINS);
    }

    public SecurityGroupWhereInput ips(String ips) {

        this.ips = ips;
        return this;
    }

    /**
     * Get ips
     *
     * @return ips
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public SecurityGroupWhereInput ips_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS);
        return this;
    }

    public SecurityGroupWhereInput ips_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS);
        return this;
    }

    public void setIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS);
        }
    }

    public boolean getIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS);
    }

    public SecurityGroupWhereInput idStartsWith(String idStartsWith) {

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

    public SecurityGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SecurityGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SecurityGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public SecurityGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SecurityGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idNotContains(String idNotContains) {

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

    public SecurityGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idNot(String idNot) {

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

    public SecurityGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SecurityGroupWhereInput idNot_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idLte(String idLte) {

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

    public SecurityGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SecurityGroupWhereInput idLte_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idLt(String idLt) {

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

    public SecurityGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SecurityGroupWhereInput idLt_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SecurityGroupWhereInput addIdInItem(String idInItem) {
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

    public SecurityGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SecurityGroupWhereInput idIn_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idGte(String idGte) {

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

    public SecurityGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SecurityGroupWhereInput idGte_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idGt(String idGt) {

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

    public SecurityGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SecurityGroupWhereInput idGt_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idEndsWith(String idEndsWith) {

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

    public SecurityGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput idContains(String idContains) {

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

    public SecurityGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput idContains_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput id(String id) {

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

    public SecurityGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SecurityGroupWhereInput id_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput excludeIpsStartsWith(String excludeIpsStartsWith) {

        this.excludeIpsStartsWith = excludeIpsStartsWith;
        return this;
    }

    /**
     * Get excludeIpsStartsWith
     *
     * @return excludeIpsStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsStartsWith() {
        return excludeIpsStartsWith;
    }

    public void setExcludeIpsStartsWith(String excludeIpsStartsWith) {
        this.excludeIpsStartsWith = excludeIpsStartsWith;
    }

    public SecurityGroupWhereInput excludeIpsStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH);
        return this;
    }

    public void setExcludeIpsStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH);
        }
    }

    public boolean getExcludeIpsStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_STARTS_WITH);
    }

    public SecurityGroupWhereInput excludeIpsNotStartsWith(String excludeIpsNotStartsWith) {

        this.excludeIpsNotStartsWith = excludeIpsNotStartsWith;
        return this;
    }

    /**
     * Get excludeIpsNotStartsWith
     *
     * @return excludeIpsNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsNotStartsWith() {
        return excludeIpsNotStartsWith;
    }

    public void setExcludeIpsNotStartsWith(String excludeIpsNotStartsWith) {
        this.excludeIpsNotStartsWith = excludeIpsNotStartsWith;
    }

    public SecurityGroupWhereInput excludeIpsNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH);
        return this;
    }

    public void setExcludeIpsNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH);
        }
    }

    public boolean getExcludeIpsNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_NOT_STARTS_WITH);
    }

    public SecurityGroupWhereInput excludeIpsNotIn(List<String> excludeIpsNotIn) {

        this.excludeIpsNotIn = excludeIpsNotIn;
        return this;
    }

    public SecurityGroupWhereInput addExcludeIpsNotInItem(String excludeIpsNotInItem) {
        if (this.excludeIpsNotIn == null) {
            this.excludeIpsNotIn = new ArrayList<String>();
        }
        this.excludeIpsNotIn.add(excludeIpsNotInItem);
        return this;
    }

    /**
     * Get excludeIpsNotIn
     *
     * @return excludeIpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExcludeIpsNotIn() {
        return excludeIpsNotIn;
    }

    public void setExcludeIpsNotIn(List<String> excludeIpsNotIn) {
        this.excludeIpsNotIn = excludeIpsNotIn;
    }

    public SecurityGroupWhereInput excludeIpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN);
        return this;
    }

    public void setExcludeIpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN);
        }
    }

    public boolean getExcludeIpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_NOT_IN);
    }

    public SecurityGroupWhereInput excludeIpsNotEndsWith(String excludeIpsNotEndsWith) {

        this.excludeIpsNotEndsWith = excludeIpsNotEndsWith;
        return this;
    }

    /**
     * Get excludeIpsNotEndsWith
     *
     * @return excludeIpsNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsNotEndsWith() {
        return excludeIpsNotEndsWith;
    }

    public void setExcludeIpsNotEndsWith(String excludeIpsNotEndsWith) {
        this.excludeIpsNotEndsWith = excludeIpsNotEndsWith;
    }

    public SecurityGroupWhereInput excludeIpsNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH);
        return this;
    }

    public void setExcludeIpsNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH);
        }
    }

    public boolean getExcludeIpsNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_NOT_ENDS_WITH);
    }

    public SecurityGroupWhereInput excludeIpsNotContains(String excludeIpsNotContains) {

        this.excludeIpsNotContains = excludeIpsNotContains;
        return this;
    }

    /**
     * Get excludeIpsNotContains
     *
     * @return excludeIpsNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsNotContains() {
        return excludeIpsNotContains;
    }

    public void setExcludeIpsNotContains(String excludeIpsNotContains) {
        this.excludeIpsNotContains = excludeIpsNotContains;
    }

    public SecurityGroupWhereInput excludeIpsNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS);
        return this;
    }

    public void setExcludeIpsNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS);
        }
    }

    public boolean getExcludeIpsNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_NOT_CONTAINS);
    }

    public SecurityGroupWhereInput excludeIpsNot(String excludeIpsNot) {

        this.excludeIpsNot = excludeIpsNot;
        return this;
    }

    /**
     * Get excludeIpsNot
     *
     * @return excludeIpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsNot() {
        return excludeIpsNot;
    }

    public void setExcludeIpsNot(String excludeIpsNot) {
        this.excludeIpsNot = excludeIpsNot;
    }

    public SecurityGroupWhereInput excludeIpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT);
        return this;
    }

    public void setExcludeIpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_NOT);
        }
    }

    public boolean getExcludeIpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_NOT);
    }

    public SecurityGroupWhereInput excludeIpsLte(String excludeIpsLte) {

        this.excludeIpsLte = excludeIpsLte;
        return this;
    }

    /**
     * Get excludeIpsLte
     *
     * @return excludeIpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsLte() {
        return excludeIpsLte;
    }

    public void setExcludeIpsLte(String excludeIpsLte) {
        this.excludeIpsLte = excludeIpsLte;
    }

    public SecurityGroupWhereInput excludeIpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_LTE);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_LTE);
        return this;
    }

    public void setExcludeIpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_LTE);
        }
    }

    public boolean getExcludeIpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_LTE);
    }

    public SecurityGroupWhereInput excludeIpsLt(String excludeIpsLt) {

        this.excludeIpsLt = excludeIpsLt;
        return this;
    }

    /**
     * Get excludeIpsLt
     *
     * @return excludeIpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsLt() {
        return excludeIpsLt;
    }

    public void setExcludeIpsLt(String excludeIpsLt) {
        this.excludeIpsLt = excludeIpsLt;
    }

    public SecurityGroupWhereInput excludeIpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_LT);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_LT);
        return this;
    }

    public void setExcludeIpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_LT);
        }
    }

    public boolean getExcludeIpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_LT);
    }

    public SecurityGroupWhereInput excludeIpsIn(List<String> excludeIpsIn) {

        this.excludeIpsIn = excludeIpsIn;
        return this;
    }

    public SecurityGroupWhereInput addExcludeIpsInItem(String excludeIpsInItem) {
        if (this.excludeIpsIn == null) {
            this.excludeIpsIn = new ArrayList<String>();
        }
        this.excludeIpsIn.add(excludeIpsInItem);
        return this;
    }

    /**
     * Get excludeIpsIn
     *
     * @return excludeIpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExcludeIpsIn() {
        return excludeIpsIn;
    }

    public void setExcludeIpsIn(List<String> excludeIpsIn) {
        this.excludeIpsIn = excludeIpsIn;
    }

    public SecurityGroupWhereInput excludeIpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_IN);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_IN);
        return this;
    }

    public void setExcludeIpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_IN);
        }
    }

    public boolean getExcludeIpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_IN);
    }

    public SecurityGroupWhereInput excludeIpsGte(String excludeIpsGte) {

        this.excludeIpsGte = excludeIpsGte;
        return this;
    }

    /**
     * Get excludeIpsGte
     *
     * @return excludeIpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsGte() {
        return excludeIpsGte;
    }

    public void setExcludeIpsGte(String excludeIpsGte) {
        this.excludeIpsGte = excludeIpsGte;
    }

    public SecurityGroupWhereInput excludeIpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_GTE);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_GTE);
        return this;
    }

    public void setExcludeIpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_GTE);
        }
    }

    public boolean getExcludeIpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_GTE);
    }

    public SecurityGroupWhereInput excludeIpsGt(String excludeIpsGt) {

        this.excludeIpsGt = excludeIpsGt;
        return this;
    }

    /**
     * Get excludeIpsGt
     *
     * @return excludeIpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsGt() {
        return excludeIpsGt;
    }

    public void setExcludeIpsGt(String excludeIpsGt) {
        this.excludeIpsGt = excludeIpsGt;
    }

    public SecurityGroupWhereInput excludeIpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_GT);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_GT);
        return this;
    }

    public void setExcludeIpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_GT);
        }
    }

    public boolean getExcludeIpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_GT);
    }

    public SecurityGroupWhereInput excludeIpsEndsWith(String excludeIpsEndsWith) {

        this.excludeIpsEndsWith = excludeIpsEndsWith;
        return this;
    }

    /**
     * Get excludeIpsEndsWith
     *
     * @return excludeIpsEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsEndsWith() {
        return excludeIpsEndsWith;
    }

    public void setExcludeIpsEndsWith(String excludeIpsEndsWith) {
        this.excludeIpsEndsWith = excludeIpsEndsWith;
    }

    public SecurityGroupWhereInput excludeIpsEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH);
        return this;
    }

    public void setExcludeIpsEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH);
        }
    }

    public boolean getExcludeIpsEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_ENDS_WITH);
    }

    public SecurityGroupWhereInput excludeIpsContains(String excludeIpsContains) {

        this.excludeIpsContains = excludeIpsContains;
        return this;
    }

    /**
     * Get excludeIpsContains
     *
     * @return excludeIpsContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIpsContains() {
        return excludeIpsContains;
    }

    public void setExcludeIpsContains(String excludeIpsContains) {
        this.excludeIpsContains = excludeIpsContains;
    }

    public SecurityGroupWhereInput excludeIpsContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput excludeIpsContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS);
        return this;
    }

    public void setExcludeIpsContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS);
        }
    }

    public boolean getExcludeIpsContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS_CONTAINS);
    }

    public SecurityGroupWhereInput excludeIps(String excludeIps) {

        this.excludeIps = excludeIps;
        return this;
    }

    /**
     * Get excludeIps
     *
     * @return excludeIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExcludeIps() {
        return excludeIps;
    }

    public void setExcludeIps(String excludeIps) {
        this.excludeIps = excludeIps;
    }

    public SecurityGroupWhereInput excludeIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS);
        return this;
    }

    public SecurityGroupWhereInput excludeIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS);
        return this;
    }

    public void setExcludeIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IPS);
        }
    }

    public boolean getExcludeIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IPS);
    }

    public SecurityGroupWhereInput everouteCluster(EverouteClusterWhereInput everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterWhereInput getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(EverouteClusterWhereInput everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public SecurityGroupWhereInput everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public SecurityGroupWhereInput everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public SecurityGroupWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public SecurityGroupWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public SecurityGroupWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public SecurityGroupWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public SecurityGroupWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public SecurityGroupWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public SecurityGroupWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public SecurityGroupWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public SecurityGroupWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public SecurityGroupWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public SecurityGroupWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public SecurityGroupWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public SecurityGroupWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public SecurityGroupWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public SecurityGroupWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public SecurityGroupWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public SecurityGroupWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public SecurityGroupWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public SecurityGroupWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public SecurityGroupWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public SecurityGroupWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public SecurityGroupWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public SecurityGroupWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public SecurityGroupWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public SecurityGroupWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public SecurityGroupWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public SecurityGroupWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public SecurityGroupWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public SecurityGroupWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public SecurityGroupWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public SecurityGroupWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public SecurityGroupWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public SecurityGroupWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public SecurityGroupWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public SecurityGroupWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public SecurityGroupWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public SecurityGroupWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public SecurityGroupWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public SecurityGroupWhereInput description(String description) {

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

    public SecurityGroupWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SecurityGroupWhereInput description_ExplictlyNonNull() {
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

    public SecurityGroupWhereInput AND(List<SecurityGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SecurityGroupWhereInput addANDItem(SecurityGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SecurityGroupWhereInput>();
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
    public List<SecurityGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SecurityGroupWhereInput> AND) {
        this.AND = AND;
    }

    public SecurityGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SecurityGroupWhereInput AND_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroupWhereInput securityGroupWhereInput = (SecurityGroupWhereInput) o;
        return Objects.equals(this.vmsSome, securityGroupWhereInput.vmsSome)
                && Objects.equals(this.vmsNone, securityGroupWhereInput.vmsNone)
                && Objects.equals(this.vmsEvery, securityGroupWhereInput.vmsEvery)
                && Objects.equals(
                        this.securityPoliciesSome, securityGroupWhereInput.securityPoliciesSome)
                && Objects.equals(
                        this.securityPoliciesNone, securityGroupWhereInput.securityPoliciesNone)
                && Objects.equals(
                        this.securityPoliciesEvery, securityGroupWhereInput.securityPoliciesEvery)
                && Objects.equals(this.OR, securityGroupWhereInput.OR)
                && Objects.equals(this.NOT, securityGroupWhereInput.NOT)
                && Objects.equals(this.nameStartsWith, securityGroupWhereInput.nameStartsWith)
                && Objects.equals(this.nameNotStartsWith, securityGroupWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameNotIn, securityGroupWhereInput.nameNotIn)
                && Objects.equals(this.nameNotEndsWith, securityGroupWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotContains, securityGroupWhereInput.nameNotContains)
                && Objects.equals(this.nameNot, securityGroupWhereInput.nameNot)
                && Objects.equals(this.nameLte, securityGroupWhereInput.nameLte)
                && Objects.equals(this.nameLt, securityGroupWhereInput.nameLt)
                && Objects.equals(this.nameIn, securityGroupWhereInput.nameIn)
                && Objects.equals(this.nameGte, securityGroupWhereInput.nameGte)
                && Objects.equals(this.nameGt, securityGroupWhereInput.nameGt)
                && Objects.equals(this.nameEndsWith, securityGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameContains, securityGroupWhereInput.nameContains)
                && Objects.equals(this.name, securityGroupWhereInput.name)
                && Objects.equals(this.memberTypeNotIn, securityGroupWhereInput.memberTypeNotIn)
                && Objects.equals(this.memberTypeNot, securityGroupWhereInput.memberTypeNot)
                && Objects.equals(this.memberTypeIn, securityGroupWhereInput.memberTypeIn)
                && Objects.equals(this.memberType, securityGroupWhereInput.memberType)
                && Objects.equals(
                        this.isolationPoliciesSome, securityGroupWhereInput.isolationPoliciesSome)
                && Objects.equals(
                        this.isolationPoliciesNone, securityGroupWhereInput.isolationPoliciesNone)
                && Objects.equals(
                        this.isolationPoliciesEvery, securityGroupWhereInput.isolationPoliciesEvery)
                && Objects.equals(this.ipsStartsWith, securityGroupWhereInput.ipsStartsWith)
                && Objects.equals(this.ipsNotStartsWith, securityGroupWhereInput.ipsNotStartsWith)
                && Objects.equals(this.ipsNotIn, securityGroupWhereInput.ipsNotIn)
                && Objects.equals(this.ipsNotEndsWith, securityGroupWhereInput.ipsNotEndsWith)
                && Objects.equals(this.ipsNotContains, securityGroupWhereInput.ipsNotContains)
                && Objects.equals(this.ipsNot, securityGroupWhereInput.ipsNot)
                && Objects.equals(this.ipsLte, securityGroupWhereInput.ipsLte)
                && Objects.equals(this.ipsLt, securityGroupWhereInput.ipsLt)
                && Objects.equals(this.ipsIn, securityGroupWhereInput.ipsIn)
                && Objects.equals(this.ipsGte, securityGroupWhereInput.ipsGte)
                && Objects.equals(this.ipsGt, securityGroupWhereInput.ipsGt)
                && Objects.equals(this.ipsEndsWith, securityGroupWhereInput.ipsEndsWith)
                && Objects.equals(this.ipsContains, securityGroupWhereInput.ipsContains)
                && Objects.equals(this.ips, securityGroupWhereInput.ips)
                && Objects.equals(this.idStartsWith, securityGroupWhereInput.idStartsWith)
                && Objects.equals(this.idNotStartsWith, securityGroupWhereInput.idNotStartsWith)
                && Objects.equals(this.idNotIn, securityGroupWhereInput.idNotIn)
                && Objects.equals(this.idNotEndsWith, securityGroupWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotContains, securityGroupWhereInput.idNotContains)
                && Objects.equals(this.idNot, securityGroupWhereInput.idNot)
                && Objects.equals(this.idLte, securityGroupWhereInput.idLte)
                && Objects.equals(this.idLt, securityGroupWhereInput.idLt)
                && Objects.equals(this.idIn, securityGroupWhereInput.idIn)
                && Objects.equals(this.idGte, securityGroupWhereInput.idGte)
                && Objects.equals(this.idGt, securityGroupWhereInput.idGt)
                && Objects.equals(this.idEndsWith, securityGroupWhereInput.idEndsWith)
                && Objects.equals(this.idContains, securityGroupWhereInput.idContains)
                && Objects.equals(this.id, securityGroupWhereInput.id)
                && Objects.equals(
                        this.excludeIpsStartsWith, securityGroupWhereInput.excludeIpsStartsWith)
                && Objects.equals(
                        this.excludeIpsNotStartsWith,
                        securityGroupWhereInput.excludeIpsNotStartsWith)
                && Objects.equals(this.excludeIpsNotIn, securityGroupWhereInput.excludeIpsNotIn)
                && Objects.equals(
                        this.excludeIpsNotEndsWith, securityGroupWhereInput.excludeIpsNotEndsWith)
                && Objects.equals(
                        this.excludeIpsNotContains, securityGroupWhereInput.excludeIpsNotContains)
                && Objects.equals(this.excludeIpsNot, securityGroupWhereInput.excludeIpsNot)
                && Objects.equals(this.excludeIpsLte, securityGroupWhereInput.excludeIpsLte)
                && Objects.equals(this.excludeIpsLt, securityGroupWhereInput.excludeIpsLt)
                && Objects.equals(this.excludeIpsIn, securityGroupWhereInput.excludeIpsIn)
                && Objects.equals(this.excludeIpsGte, securityGroupWhereInput.excludeIpsGte)
                && Objects.equals(this.excludeIpsGt, securityGroupWhereInput.excludeIpsGt)
                && Objects.equals(
                        this.excludeIpsEndsWith, securityGroupWhereInput.excludeIpsEndsWith)
                && Objects.equals(
                        this.excludeIpsContains, securityGroupWhereInput.excludeIpsContains)
                && Objects.equals(this.excludeIps, securityGroupWhereInput.excludeIps)
                && Objects.equals(this.everouteCluster, securityGroupWhereInput.everouteCluster)
                && Objects.equals(
                        this.descriptionStartsWith, securityGroupWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        securityGroupWhereInput.descriptionNotStartsWith)
                && Objects.equals(this.descriptionNotIn, securityGroupWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotEndsWith, securityGroupWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotContains, securityGroupWhereInput.descriptionNotContains)
                && Objects.equals(this.descriptionNot, securityGroupWhereInput.descriptionNot)
                && Objects.equals(this.descriptionLte, securityGroupWhereInput.descriptionLte)
                && Objects.equals(this.descriptionLt, securityGroupWhereInput.descriptionLt)
                && Objects.equals(this.descriptionIn, securityGroupWhereInput.descriptionIn)
                && Objects.equals(this.descriptionGte, securityGroupWhereInput.descriptionGte)
                && Objects.equals(this.descriptionGt, securityGroupWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionEndsWith, securityGroupWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionContains, securityGroupWhereInput.descriptionContains)
                && Objects.equals(this.description, securityGroupWhereInput.description)
                && Objects.equals(this.AND, securityGroupWhereInput.AND);
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
                vmsSome,
                vmsNone,
                vmsEvery,
                securityPoliciesSome,
                securityPoliciesNone,
                securityPoliciesEvery,
                OR,
                NOT,
                nameStartsWith,
                nameNotStartsWith,
                nameNotIn,
                nameNotEndsWith,
                nameNotContains,
                nameNot,
                nameLte,
                nameLt,
                nameIn,
                nameGte,
                nameGt,
                nameEndsWith,
                nameContains,
                name,
                memberTypeNotIn,
                memberTypeNot,
                memberTypeIn,
                memberType,
                isolationPoliciesSome,
                isolationPoliciesNone,
                isolationPoliciesEvery,
                ipsStartsWith,
                ipsNotStartsWith,
                ipsNotIn,
                ipsNotEndsWith,
                ipsNotContains,
                ipsNot,
                ipsLte,
                ipsLt,
                ipsIn,
                ipsGte,
                ipsGt,
                ipsEndsWith,
                ipsContains,
                ips,
                idStartsWith,
                idNotStartsWith,
                idNotIn,
                idNotEndsWith,
                idNotContains,
                idNot,
                idLte,
                idLt,
                idIn,
                idGte,
                idGt,
                idEndsWith,
                idContains,
                id,
                excludeIpsStartsWith,
                excludeIpsNotStartsWith,
                excludeIpsNotIn,
                excludeIpsNotEndsWith,
                excludeIpsNotContains,
                excludeIpsNot,
                excludeIpsLte,
                excludeIpsLt,
                excludeIpsIn,
                excludeIpsGte,
                excludeIpsGt,
                excludeIpsEndsWith,
                excludeIpsContains,
                excludeIps,
                everouteCluster,
                descriptionStartsWith,
                descriptionNotStartsWith,
                descriptionNotIn,
                descriptionNotEndsWith,
                descriptionNotContains,
                descriptionNot,
                descriptionLte,
                descriptionLt,
                descriptionIn,
                descriptionGte,
                descriptionGt,
                descriptionEndsWith,
                descriptionContains,
                description,
                AND);
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
        sb.append("class SecurityGroupWhereInput {\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    securityPoliciesSome: ")
                .append(toIndentedString(securityPoliciesSome))
                .append("\n");
        sb.append("    securityPoliciesNone: ")
                .append(toIndentedString(securityPoliciesNone))
                .append("\n");
        sb.append("    securityPoliciesEvery: ")
                .append(toIndentedString(securityPoliciesEvery))
                .append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    memberTypeNotIn: ").append(toIndentedString(memberTypeNotIn)).append("\n");
        sb.append("    memberTypeNot: ").append(toIndentedString(memberTypeNot)).append("\n");
        sb.append("    memberTypeIn: ").append(toIndentedString(memberTypeIn)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    isolationPoliciesSome: ")
                .append(toIndentedString(isolationPoliciesSome))
                .append("\n");
        sb.append("    isolationPoliciesNone: ")
                .append(toIndentedString(isolationPoliciesNone))
                .append("\n");
        sb.append("    isolationPoliciesEvery: ")
                .append(toIndentedString(isolationPoliciesEvery))
                .append("\n");
        sb.append("    ipsStartsWith: ").append(toIndentedString(ipsStartsWith)).append("\n");
        sb.append("    ipsNotStartsWith: ").append(toIndentedString(ipsNotStartsWith)).append("\n");
        sb.append("    ipsNotIn: ").append(toIndentedString(ipsNotIn)).append("\n");
        sb.append("    ipsNotEndsWith: ").append(toIndentedString(ipsNotEndsWith)).append("\n");
        sb.append("    ipsNotContains: ").append(toIndentedString(ipsNotContains)).append("\n");
        sb.append("    ipsNot: ").append(toIndentedString(ipsNot)).append("\n");
        sb.append("    ipsLte: ").append(toIndentedString(ipsLte)).append("\n");
        sb.append("    ipsLt: ").append(toIndentedString(ipsLt)).append("\n");
        sb.append("    ipsIn: ").append(toIndentedString(ipsIn)).append("\n");
        sb.append("    ipsGte: ").append(toIndentedString(ipsGte)).append("\n");
        sb.append("    ipsGt: ").append(toIndentedString(ipsGt)).append("\n");
        sb.append("    ipsEndsWith: ").append(toIndentedString(ipsEndsWith)).append("\n");
        sb.append("    ipsContains: ").append(toIndentedString(ipsContains)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    excludeIpsStartsWith: ")
                .append(toIndentedString(excludeIpsStartsWith))
                .append("\n");
        sb.append("    excludeIpsNotStartsWith: ")
                .append(toIndentedString(excludeIpsNotStartsWith))
                .append("\n");
        sb.append("    excludeIpsNotIn: ").append(toIndentedString(excludeIpsNotIn)).append("\n");
        sb.append("    excludeIpsNotEndsWith: ")
                .append(toIndentedString(excludeIpsNotEndsWith))
                .append("\n");
        sb.append("    excludeIpsNotContains: ")
                .append(toIndentedString(excludeIpsNotContains))
                .append("\n");
        sb.append("    excludeIpsNot: ").append(toIndentedString(excludeIpsNot)).append("\n");
        sb.append("    excludeIpsLte: ").append(toIndentedString(excludeIpsLte)).append("\n");
        sb.append("    excludeIpsLt: ").append(toIndentedString(excludeIpsLt)).append("\n");
        sb.append("    excludeIpsIn: ").append(toIndentedString(excludeIpsIn)).append("\n");
        sb.append("    excludeIpsGte: ").append(toIndentedString(excludeIpsGte)).append("\n");
        sb.append("    excludeIpsGt: ").append(toIndentedString(excludeIpsGt)).append("\n");
        sb.append("    excludeIpsEndsWith: ")
                .append(toIndentedString(excludeIpsEndsWith))
                .append("\n");
        sb.append("    excludeIpsContains: ")
                .append(toIndentedString(excludeIpsContains))
                .append("\n");
        sb.append("    excludeIps: ").append(toIndentedString(excludeIps)).append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
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
