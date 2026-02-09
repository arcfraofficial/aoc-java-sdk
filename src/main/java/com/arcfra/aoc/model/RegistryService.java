package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** RegistryService */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RegistryService extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_APPLICATION = "application";

    @SerializedName(SERIALIZED_NAME_APPLICATION)
    private NestedCloudTowerApplication application;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

    @SerializedName(SERIALIZED_NAME_HOSTNAME)
    private String hostname;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private RegistryServiceUsage usage;

    public RegistryService() {}

    public RegistryService application(NestedCloudTowerApplication application) {

        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCloudTowerApplication getApplication() {
        return application;
    }

    public void setApplication(NestedCloudTowerApplication application) {
        this.application = application;
    }

    public RegistryService application_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public RegistryService application_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public void setApplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        }
    }

    public boolean getApplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION);
    }

    public RegistryService description(String description) {

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

    public RegistryService description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public RegistryService description_ExplictlyNonNull() {
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

    public RegistryService entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public RegistryService entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public RegistryService entityAsyncStatus_ExplictlyNonNull() {
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

    public RegistryService hostname(String hostname) {

        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public RegistryService hostname_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public RegistryService hostname_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public void setHostname_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        }
    }

    public boolean getHostname_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME);
    }

    public RegistryService id(String id) {

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

    public RegistryService id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public RegistryService id_ExplictlyNonNull() {
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

    public RegistryService name(String name) {

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

    public RegistryService name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RegistryService name_ExplictlyNonNull() {
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

    public RegistryService usage(RegistryServiceUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public RegistryServiceUsage getUsage() {
        return usage;
    }

    public void setUsage(RegistryServiceUsage usage) {
        this.usage = usage;
    }

    public RegistryService usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public RegistryService usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegistryService registryService = (RegistryService) o;
        return Objects.equals(this.application, registryService.application)
                && Objects.equals(this.description, registryService.description)
                && Objects.equals(this.entityAsyncStatus, registryService.entityAsyncStatus)
                && Objects.equals(this.hostname, registryService.hostname)
                && Objects.equals(this.id, registryService.id)
                && Objects.equals(this.name, registryService.name)
                && Objects.equals(this.usage, registryService.usage);
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
        return Objects.hash(application, description, entityAsyncStatus, hostname, id, name, usage);
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
        sb.append("class RegistryService {\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
