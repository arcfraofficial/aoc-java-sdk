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

/** BackupRestoreExecutionNetworkMapping */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestoreExecutionNetworkMapping
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TARGET = "target";

    @SerializedName(SERIALIZED_NAME_TARGET)
    private BackupRestoreExecutionNetworkInformation target;

    public static final String SERIALIZED_NAME_SRC_VLAN_ID = "src_vlan_id";

    @SerializedName(SERIALIZED_NAME_SRC_VLAN_ID)
    private String srcVlanId;

    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private BackupRestoreExecutionNetworkInformation source;

    public static final String SERIALIZED_NAME_DST_VLAN_ID = "dst_vlan_id";

    @SerializedName(SERIALIZED_NAME_DST_VLAN_ID)
    private String dstVlanId;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        BACKUPRESTOREEXECUTIONNETWORKMAPPING("BackupRestoreExecutionNetworkMapping");

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

    public BackupRestoreExecutionNetworkMapping() {}

    public BackupRestoreExecutionNetworkMapping target(
            BackupRestoreExecutionNetworkInformation target) {

        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionNetworkInformation getTarget() {
        return target;
    }

    public void setTarget(BackupRestoreExecutionNetworkInformation target) {
        this.target = target;
    }

    public BackupRestoreExecutionNetworkMapping target_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET);
        return this;
    }

    public BackupRestoreExecutionNetworkMapping target_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        return this;
    }

    public void setTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        }
    }

    public boolean getTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET);
    }

    public BackupRestoreExecutionNetworkMapping srcVlanId(String srcVlanId) {

        this.srcVlanId = srcVlanId;
        return this;
    }

    /**
     * Get srcVlanId
     *
     * @return srcVlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSrcVlanId() {
        return srcVlanId;
    }

    public void setSrcVlanId(String srcVlanId) {
        this.srcVlanId = srcVlanId;
    }

    public BackupRestoreExecutionNetworkMapping srcVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_ID);
        return this;
    }

    public BackupRestoreExecutionNetworkMapping srcVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_ID);
        return this;
    }

    public void setSrcVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_ID);
        }
    }

    public boolean getSrcVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRC_VLAN_ID);
    }

    public BackupRestoreExecutionNetworkMapping source(
            BackupRestoreExecutionNetworkInformation source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionNetworkInformation getSource() {
        return source;
    }

    public void setSource(BackupRestoreExecutionNetworkInformation source) {
        this.source = source;
    }

    public BackupRestoreExecutionNetworkMapping source_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public BackupRestoreExecutionNetworkMapping source_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public void setSource_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        }
    }

    public boolean getSource_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE);
    }

    public BackupRestoreExecutionNetworkMapping dstVlanId(String dstVlanId) {

        this.dstVlanId = dstVlanId;
        return this;
    }

    /**
     * Get dstVlanId
     *
     * @return dstVlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDstVlanId() {
        return dstVlanId;
    }

    public void setDstVlanId(String dstVlanId) {
        this.dstVlanId = dstVlanId;
    }

    public BackupRestoreExecutionNetworkMapping dstVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DST_VLAN_ID);
        return this;
    }

    public BackupRestoreExecutionNetworkMapping dstVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DST_VLAN_ID);
        return this;
    }

    public void setDstVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DST_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DST_VLAN_ID);
        }
    }

    public boolean getDstVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DST_VLAN_ID);
    }

    public BackupRestoreExecutionNetworkMapping typename(TypenameEnum typename) {

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

    public BackupRestoreExecutionNetworkMapping typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public BackupRestoreExecutionNetworkMapping typename_ExplictlyNonNull() {
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
        BackupRestoreExecutionNetworkMapping backupRestoreExecutionNetworkMapping =
                (BackupRestoreExecutionNetworkMapping) o;
        return Objects.equals(this.target, backupRestoreExecutionNetworkMapping.target)
                && Objects.equals(this.srcVlanId, backupRestoreExecutionNetworkMapping.srcVlanId)
                && Objects.equals(this.source, backupRestoreExecutionNetworkMapping.source)
                && Objects.equals(this.dstVlanId, backupRestoreExecutionNetworkMapping.dstVlanId)
                && Objects.equals(this.typename, backupRestoreExecutionNetworkMapping.typename);
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
        return Objects.hash(target, srcVlanId, source, dstVlanId, typename);
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
        sb.append("class BackupRestoreExecutionNetworkMapping {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    srcVlanId: ").append(toIndentedString(srcVlanId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    dstVlanId: ").append(toIndentedString(dstVlanId)).append("\n");
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
