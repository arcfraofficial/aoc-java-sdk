package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmVncInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVncInfo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private Vm vm;

    public static final String SERIALIZED_NAME_TERMINAL = "terminal";

    @SerializedName(SERIALIZED_NAME_TERMINAL)
    private String terminal;

    public static final String SERIALIZED_NAME_REDIRECT = "redirect";

    @SerializedName(SERIALIZED_NAME_REDIRECT)
    private String redirect;

    public static final String SERIALIZED_NAME_DIRECT = "direct";

    @SerializedName(SERIALIZED_NAME_DIRECT)
    private String direct;

    public static final String SERIALIZED_NAME_CLUSTER_IP = "cluster_ip";

    @SerializedName(SERIALIZED_NAME_CLUSTER_IP)
    private String clusterIp;

    public VmVncInfo() {}

    public VmVncInfo vm(Vm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Vm getVm() {
        return vm;
    }

    public void setVm(Vm vm) {
        this.vm = vm;
    }

    public VmVncInfo vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmVncInfo vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public VmVncInfo terminal(String terminal) {

        this.terminal = terminal;
        return this;
    }

    /**
     * Get terminal
     *
     * @return terminal
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public VmVncInfo terminal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TERMINAL);
        return this;
    }

    public VmVncInfo terminal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TERMINAL);
        return this;
    }

    public void setTerminal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TERMINAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TERMINAL);
        }
    }

    public boolean getTerminal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TERMINAL);
    }

    public VmVncInfo redirect(String redirect) {

        this.redirect = redirect;
        return this;
    }

    /**
     * Get redirect
     *
     * @return redirect
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public VmVncInfo redirect_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REDIRECT);
        return this;
    }

    public VmVncInfo redirect_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REDIRECT);
        return this;
    }

    public void setRedirect_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REDIRECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REDIRECT);
        }
    }

    public boolean getRedirect_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REDIRECT);
    }

    public VmVncInfo direct(String direct) {

        this.direct = direct;
        return this;
    }

    /**
     * Get direct
     *
     * @return direct
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public VmVncInfo direct_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRECT);
        return this;
    }

    public VmVncInfo direct_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRECT);
        return this;
    }

    public void setDirect_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRECT);
        }
    }

    public boolean getDirect_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRECT);
    }

    public VmVncInfo clusterIp(String clusterIp) {

        this.clusterIp = clusterIp;
        return this;
    }

    /**
     * Get clusterIp
     *
     * @return clusterIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterIp() {
        return clusterIp;
    }

    public void setClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
    }

    public VmVncInfo clusterIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_IP);
        return this;
    }

    public VmVncInfo clusterIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_IP);
        return this;
    }

    public void setClusterIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_IP);
        }
    }

    public boolean getClusterIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_IP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVncInfo vmVncInfo = (VmVncInfo) o;
        return Objects.equals(this.vm, vmVncInfo.vm)
                && Objects.equals(this.terminal, vmVncInfo.terminal)
                && Objects.equals(this.redirect, vmVncInfo.redirect)
                && Objects.equals(this.direct, vmVncInfo.direct)
                && Objects.equals(this.clusterIp, vmVncInfo.clusterIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vm, terminal, redirect, direct, clusterIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmVncInfo {\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
        sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
        sb.append("    clusterIp: ").append(toIndentedString(clusterIp)).append("\n");
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
