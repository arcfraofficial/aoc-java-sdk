package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** IPSecurityPolicy */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IPSecurityPolicy extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXCEPT_IP_BLOCK = "except_ip_block";

    @SerializedName(SERIALIZED_NAME_EXCEPT_IP_BLOCK)
    private List<String> exceptIpBlock = null;

    public static final String SERIALIZED_NAME_IP_BLOCK = "ip_block";

    @SerializedName(SERIALIZED_NAME_IP_BLOCK)
    private String ipBlock;

    public IPSecurityPolicy() {}

    public IPSecurityPolicy exceptIpBlock(List<String> exceptIpBlock) {

        this.exceptIpBlock = exceptIpBlock;
        return this;
    }

    public IPSecurityPolicy addExceptIpBlockItem(String exceptIpBlockItem) {
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

    public IPSecurityPolicy exceptIpBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCEPT_IP_BLOCK);
        return this;
    }

    public IPSecurityPolicy exceptIpBlock_ExplictlyNonNull() {
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

    public IPSecurityPolicy ipBlock(String ipBlock) {

        this.ipBlock = ipBlock;
        return this;
    }

    /**
     * Get ipBlock
     *
     * @return ipBlock
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
    }

    public IPSecurityPolicy ipBlock_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_BLOCK);
        return this;
    }

    public IPSecurityPolicy ipBlock_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IPSecurityPolicy ipSecurityPolicy = (IPSecurityPolicy) o;
        return Objects.equals(this.exceptIpBlock, ipSecurityPolicy.exceptIpBlock)
                && Objects.equals(this.ipBlock, ipSecurityPolicy.ipBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exceptIpBlock, ipBlock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IPSecurityPolicy {\n");
        sb.append("    exceptIpBlock: ").append(toIndentedString(exceptIpBlock)).append("\n");
        sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
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
