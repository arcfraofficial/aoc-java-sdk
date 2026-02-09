package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CloudTowerApplication */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudTowerApplication
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INSTANCE_STATUSES = "instanceStatuses";

    @SerializedName(SERIALIZED_NAME_INSTANCE_STATUSES)
    private Object instanceStatuses;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PACKAGE = "package";

    @SerializedName(SERIALIZED_NAME_PACKAGE)
    private NestedCloudTowerApplicationPackage _package;

    public static final String SERIALIZED_NAME_PLACEMENT_SITUATION = "placementSituation";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_SITUATION)
    private String placementSituation;

    public static final String SERIALIZED_NAME_PLACEMENT_VERB = "placementVerb";

    @SerializedName(SERIALIZED_NAME_PLACEMENT_VERB)
    private String placementVerb;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private CloudTowerApplicationState state;

    public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";

    @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
    private String targetPackage;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private NestedUser user;

    public static final String SERIALIZED_NAME_VM_SPEC = "vmSpec";

    @SerializedName(SERIALIZED_NAME_VM_SPEC)
    private Object vmSpec;

    public CloudTowerApplication() {}

    public CloudTowerApplication entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public CloudTowerApplication entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public CloudTowerApplication entityAsyncStatus_ExplictlyNonNull() {
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

    public CloudTowerApplication id(String id) {

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

    public CloudTowerApplication id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public CloudTowerApplication id_ExplictlyNonNull() {
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

    public CloudTowerApplication instanceStatuses(Object instanceStatuses) {

        this.instanceStatuses = instanceStatuses;
        return this;
    }

    /**
     * Get instanceStatuses
     *
     * @return instanceStatuses
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getInstanceStatuses() {
        return instanceStatuses;
    }

    public void setInstanceStatuses(Object instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
    }

    public CloudTowerApplication instanceStatuses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCE_STATUSES);
        return this;
    }

    public CloudTowerApplication instanceStatuses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCE_STATUSES);
        return this;
    }

    public void setInstanceStatuses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCE_STATUSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCE_STATUSES);
        }
    }

    public boolean getInstanceStatuses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCE_STATUSES);
    }

    public CloudTowerApplication name(String name) {

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

    public CloudTowerApplication name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public CloudTowerApplication name_ExplictlyNonNull() {
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

    public CloudTowerApplication _package(NestedCloudTowerApplicationPackage _package) {

        this._package = _package;
        return this;
    }

    /**
     * Get _package
     *
     * @return _package
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCloudTowerApplicationPackage getPackage() {
        return _package;
    }

    public void setPackage(NestedCloudTowerApplicationPackage _package) {
        this._package = _package;
    }

    public CloudTowerApplication _package_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PACKAGE);
        return this;
    }

    public CloudTowerApplication _package_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PACKAGE);
        return this;
    }

    public void setPackage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PACKAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PACKAGE);
        }
    }

    public boolean getPackage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PACKAGE);
    }

    public CloudTowerApplication placementSituation(String placementSituation) {

        this.placementSituation = placementSituation;
        return this;
    }

    /**
     * Get placementSituation
     *
     * @return placementSituation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementSituation() {
        return placementSituation;
    }

    public void setPlacementSituation(String placementSituation) {
        this.placementSituation = placementSituation;
    }

    public CloudTowerApplication placementSituation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION);
        return this;
    }

    public CloudTowerApplication placementSituation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION);
        return this;
    }

    public void setPlacementSituation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_SITUATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_SITUATION);
        }
    }

    public boolean getPlacementSituation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_SITUATION);
    }

    public CloudTowerApplication placementVerb(String placementVerb) {

        this.placementVerb = placementVerb;
        return this;
    }

    /**
     * Get placementVerb
     *
     * @return placementVerb
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPlacementVerb() {
        return placementVerb;
    }

    public void setPlacementVerb(String placementVerb) {
        this.placementVerb = placementVerb;
    }

    public CloudTowerApplication placementVerb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB);
        return this;
    }

    public CloudTowerApplication placementVerb_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB);
        return this;
    }

    public void setPlacementVerb_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLACEMENT_VERB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLACEMENT_VERB);
        }
    }

    public boolean getPlacementVerb_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLACEMENT_VERB);
    }

    public CloudTowerApplication resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public CloudTowerApplication resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public CloudTowerApplication resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public CloudTowerApplication state(CloudTowerApplicationState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationState getState() {
        return state;
    }

    public void setState(CloudTowerApplicationState state) {
        this.state = state;
    }

    public CloudTowerApplication state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public CloudTowerApplication state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public CloudTowerApplication targetPackage(String targetPackage) {

        this.targetPackage = targetPackage;
        return this;
    }

    /**
     * Get targetPackage
     *
     * @return targetPackage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public CloudTowerApplication targetPackage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public CloudTowerApplication targetPackage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        return this;
    }

    public void setTargetPackage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PACKAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PACKAGE);
        }
    }

    public boolean getTargetPackage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PACKAGE);
    }

    public CloudTowerApplication user(NestedUser user) {

        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedUser getUser() {
        return user;
    }

    public void setUser(NestedUser user) {
        this.user = user;
    }

    public CloudTowerApplication user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public CloudTowerApplication user_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER);
        return this;
    }

    public void setUser_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER);
        }
    }

    public boolean getUser_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER);
    }

    public CloudTowerApplication vmSpec(Object vmSpec) {

        this.vmSpec = vmSpec;
        return this;
    }

    /**
     * Get vmSpec
     *
     * @return vmSpec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getVmSpec() {
        return vmSpec;
    }

    public void setVmSpec(Object vmSpec) {
        this.vmSpec = vmSpec;
    }

    public CloudTowerApplication vmSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public CloudTowerApplication vmSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public void setVmSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        }
    }

    public boolean getVmSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SPEC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudTowerApplication cloudTowerApplication = (CloudTowerApplication) o;
        return Objects.equals(this.entityAsyncStatus, cloudTowerApplication.entityAsyncStatus)
                && Objects.equals(this.id, cloudTowerApplication.id)
                && Objects.equals(this.instanceStatuses, cloudTowerApplication.instanceStatuses)
                && Objects.equals(this.name, cloudTowerApplication.name)
                && Objects.equals(this._package, cloudTowerApplication._package)
                && Objects.equals(this.placementSituation, cloudTowerApplication.placementSituation)
                && Objects.equals(this.placementVerb, cloudTowerApplication.placementVerb)
                && Objects.equals(this.resourceVersion, cloudTowerApplication.resourceVersion)
                && Objects.equals(this.state, cloudTowerApplication.state)
                && Objects.equals(this.targetPackage, cloudTowerApplication.targetPackage)
                && Objects.equals(this.user, cloudTowerApplication.user)
                && Objects.equals(this.vmSpec, cloudTowerApplication.vmSpec);
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
                entityAsyncStatus,
                id,
                instanceStatuses,
                name,
                _package,
                placementSituation,
                placementVerb,
                resourceVersion,
                state,
                targetPackage,
                user,
                vmSpec);
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
        sb.append("class CloudTowerApplication {\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceStatuses: ").append(toIndentedString(instanceStatuses)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    placementSituation: ")
                .append(toIndentedString(placementSituation))
                .append("\n");
        sb.append("    placementVerb: ").append(toIndentedString(placementVerb)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    vmSpec: ").append(toIndentedString(vmSpec)).append("\n");
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
