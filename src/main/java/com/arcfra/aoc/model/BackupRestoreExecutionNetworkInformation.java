package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupRestoreExecutionNetworkInformation */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestoreExecutionNetworkInformation
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID = "vpc_subnet_local_id";

    @SerializedName(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID)
    private String vpcSubnetLocalId;

    public static final String SERIALIZED_NAME_VPC_LOCAL_ID = "vpc_local_id";

    @SerializedName(SERIALIZED_NAME_VPC_LOCAL_ID)
    private String vpcLocalId;

    public static final String SERIALIZED_NAME_VLAN_LOCAL_ID = "vlan_local_id";

    @SerializedName(SERIALIZED_NAME_VLAN_LOCAL_ID)
    private String vlanLocalId;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        BACKUPRESTOREEXECUTIONNETWORKINFORMATION("BackupRestoreExecutionNetworkInformation");

        private String value;

        TypenameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypenameEnum fromValue(String value) {
            for (TypenameEnum b : TypenameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypenameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypenameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypenameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPENAME = "__typename";

    @SerializedName(SERIALIZED_NAME_TYPENAME)
    private TypenameEnum typename;

    public BackupRestoreExecutionNetworkInformation() {}

    public BackupRestoreExecutionNetworkInformation vpcSubnetLocalId(String vpcSubnetLocalId) {

        this.vpcSubnetLocalId = vpcSubnetLocalId;
        return this;
    }

    /**
     * Get vpcSubnetLocalId
     *
     * @return vpcSubnetLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcSubnetLocalId() {
        return vpcSubnetLocalId;
    }

    public void setVpcSubnetLocalId(String vpcSubnetLocalId) {
        this.vpcSubnetLocalId = vpcSubnetLocalId;
    }

    public BackupRestoreExecutionNetworkInformation vpcSubnetLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        return this;
    }

    public BackupRestoreExecutionNetworkInformation vpcSubnetLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        return this;
    }

    public void setVpcSubnetLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        }
    }

    public boolean getVpcSubnetLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
    }

    public BackupRestoreExecutionNetworkInformation vpcLocalId(String vpcLocalId) {

        this.vpcLocalId = vpcLocalId;
        return this;
    }

    /**
     * Get vpcLocalId
     *
     * @return vpcLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVpcLocalId() {
        return vpcLocalId;
    }

    public void setVpcLocalId(String vpcLocalId) {
        this.vpcLocalId = vpcLocalId;
    }

    public BackupRestoreExecutionNetworkInformation vpcLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_LOCAL_ID);
        return this;
    }

    public BackupRestoreExecutionNetworkInformation vpcLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_LOCAL_ID);
        return this;
    }

    public void setVpcLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_LOCAL_ID);
        }
    }

    public boolean getVpcLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_LOCAL_ID);
    }

    public BackupRestoreExecutionNetworkInformation vlanLocalId(String vlanLocalId) {

        this.vlanLocalId = vlanLocalId;
        return this;
    }

    /**
     * Get vlanLocalId
     *
     * @return vlanLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVlanLocalId() {
        return vlanLocalId;
    }

    public void setVlanLocalId(String vlanLocalId) {
        this.vlanLocalId = vlanLocalId;
    }

    public BackupRestoreExecutionNetworkInformation vlanLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_LOCAL_ID);
        return this;
    }

    public BackupRestoreExecutionNetworkInformation vlanLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_LOCAL_ID);
        return this;
    }

    public void setVlanLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_LOCAL_ID);
        }
    }

    public boolean getVlanLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_LOCAL_ID);
    }

    public BackupRestoreExecutionNetworkInformation type(VmNicType type) {

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
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public BackupRestoreExecutionNetworkInformation type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupRestoreExecutionNetworkInformation type_ExplictlyNonNull() {
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

    public BackupRestoreExecutionNetworkInformation typename(TypenameEnum typename) {

        this.typename = typename;
        return this;
    }

    /**
     * Get typename
     *
     * @return typename
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TypenameEnum getTypename() {
        return typename;
    }

    public void setTypename(TypenameEnum typename) {
        this.typename = typename;
    }

    public BackupRestoreExecutionNetworkInformation typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public BackupRestoreExecutionNetworkInformation typename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public void setTypename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        }
    }

    public boolean getTypename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPENAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestoreExecutionNetworkInformation backupRestoreExecutionNetworkInformation =
                (BackupRestoreExecutionNetworkInformation) o;
        return Objects.equals(
                        this.vpcSubnetLocalId,
                        backupRestoreExecutionNetworkInformation.vpcSubnetLocalId)
                && Objects.equals(
                        this.vpcLocalId, backupRestoreExecutionNetworkInformation.vpcLocalId)
                && Objects.equals(
                        this.vlanLocalId, backupRestoreExecutionNetworkInformation.vlanLocalId)
                && Objects.equals(this.type, backupRestoreExecutionNetworkInformation.type)
                && Objects.equals(this.typename, backupRestoreExecutionNetworkInformation.typename);
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
        return Objects.hash(vpcSubnetLocalId, vpcLocalId, vlanLocalId, type, typename);
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
        sb.append("class BackupRestoreExecutionNetworkInformation {\n");
        sb.append("    vpcSubnetLocalId: ").append(toIndentedString(vpcSubnetLocalId)).append("\n");
        sb.append("    vpcLocalId: ").append(toIndentedString(vpcLocalId)).append("\n");
        sb.append("    vlanLocalId: ").append(toIndentedString(vlanLocalId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
