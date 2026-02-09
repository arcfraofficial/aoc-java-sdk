package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunSnapshotCreationEffect */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunSnapshotCreationEffect
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SYNC = "sync";

    @SerializedName(SERIALIZED_NAME_SYNC)
    private Boolean sync;

    public IscsiLunSnapshotCreationEffect() {}

    public IscsiLunSnapshotCreationEffect sync(Boolean sync) {

        this.sync = sync;
        return this;
    }

    /**
     * Get sync
     *
     * @return sync
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSync() {
        return sync;
    }

    public void setSync(Boolean sync) {
        this.sync = sync;
    }

    public IscsiLunSnapshotCreationEffect sync_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC);
        return this;
    }

    public IscsiLunSnapshotCreationEffect sync_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC);
        return this;
    }

    public void setSync_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC);
        }
    }

    public boolean getSync_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunSnapshotCreationEffect iscsiLunSnapshotCreationEffect =
                (IscsiLunSnapshotCreationEffect) o;
        return Objects.equals(this.sync, iscsiLunSnapshotCreationEffect.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunSnapshotCreationEffect {\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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
