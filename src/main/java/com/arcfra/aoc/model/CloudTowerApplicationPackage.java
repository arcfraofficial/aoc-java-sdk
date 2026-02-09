package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CloudTowerApplicationPackage */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudTowerApplicationPackage
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_APPLICATIONS = "applications";

    @SerializedName(SERIALIZED_NAME_APPLICATIONS)
    private List<NestedCloudTowerApplication> applications = null;

    public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private Architecture architecture;

    public static final String SERIALIZED_NAME_CONTAINERS = "containers";

    @SerializedName(SERIALIZED_NAME_CONTAINERS)
    private Object containers;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IMAGES = "images";

    @SerializedName(SERIALIZED_NAME_IMAGES)
    private Object images;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SCOS_VERSION = "scosVersion";

    @SerializedName(SERIALIZED_NAME_SCOS_VERSION)
    private String scosVersion;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public CloudTowerApplicationPackage() {}

    public CloudTowerApplicationPackage applications(
            List<NestedCloudTowerApplication> applications) {

        this.applications = applications;
        return this;
    }

    public CloudTowerApplicationPackage addApplicationsItem(
            NestedCloudTowerApplication applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<NestedCloudTowerApplication>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    /**
     * Get applications
     *
     * @return applications
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCloudTowerApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<NestedCloudTowerApplication> applications) {
        this.applications = applications;
    }

    public CloudTowerApplicationPackage applications_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS);
        return this;
    }

    public CloudTowerApplicationPackage applications_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS);
        return this;
    }

    public void setApplications_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATIONS);
        }
    }

    public boolean getApplications_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATIONS);
    }

    public CloudTowerApplicationPackage architecture(Architecture architecture) {

        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Architecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture;
    }

    public CloudTowerApplicationPackage architecture_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public CloudTowerApplicationPackage architecture_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public void setArchitecture_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        }
    }

    public boolean getArchitecture_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE);
    }

    public CloudTowerApplicationPackage containers(Object containers) {

        this.containers = containers;
        return this;
    }

    /**
     * Get containers
     *
     * @return containers
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getContainers() {
        return containers;
    }

    public void setContainers(Object containers) {
        this.containers = containers;
    }

    public CloudTowerApplicationPackage containers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTAINERS);
        return this;
    }

    public CloudTowerApplicationPackage containers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTAINERS);
        return this;
    }

    public void setContainers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTAINERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTAINERS);
        }
    }

    public boolean getContainers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTAINERS);
    }

    public CloudTowerApplicationPackage id(String id) {

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

    public CloudTowerApplicationPackage id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public CloudTowerApplicationPackage id_ExplictlyNonNull() {
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

    public CloudTowerApplicationPackage images(Object images) {

        this.images = images;
        return this;
    }

    /**
     * Get images
     *
     * @return images
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public CloudTowerApplicationPackage images_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGES);
        return this;
    }

    public CloudTowerApplicationPackage images_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGES);
        return this;
    }

    public void setImages_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGES);
        }
    }

    public boolean getImages_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGES);
    }

    public CloudTowerApplicationPackage name(String name) {

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

    public CloudTowerApplicationPackage name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public CloudTowerApplicationPackage name_ExplictlyNonNull() {
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

    public CloudTowerApplicationPackage scosVersion(String scosVersion) {

        this.scosVersion = scosVersion;
        return this;
    }

    /**
     * Get scosVersion
     *
     * @return scosVersion
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getScosVersion() {
        return scosVersion;
    }

    public void setScosVersion(String scosVersion) {
        this.scosVersion = scosVersion;
    }

    public CloudTowerApplicationPackage scosVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCOS_VERSION);
        return this;
    }

    public CloudTowerApplicationPackage scosVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCOS_VERSION);
        return this;
    }

    public void setScosVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCOS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCOS_VERSION);
        }
    }

    public boolean getScosVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCOS_VERSION);
    }

    public CloudTowerApplicationPackage version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CloudTowerApplicationPackage version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public CloudTowerApplicationPackage version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudTowerApplicationPackage cloudTowerApplicationPackage =
                (CloudTowerApplicationPackage) o;
        return Objects.equals(this.applications, cloudTowerApplicationPackage.applications)
                && Objects.equals(this.architecture, cloudTowerApplicationPackage.architecture)
                && Objects.equals(this.containers, cloudTowerApplicationPackage.containers)
                && Objects.equals(this.id, cloudTowerApplicationPackage.id)
                && Objects.equals(this.images, cloudTowerApplicationPackage.images)
                && Objects.equals(this.name, cloudTowerApplicationPackage.name)
                && Objects.equals(this.scosVersion, cloudTowerApplicationPackage.scosVersion)
                && Objects.equals(this.version, cloudTowerApplicationPackage.version);
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
                applications, architecture, containers, id, images, name, scosVersion, version);
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
        sb.append("class CloudTowerApplicationPackage {\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scosVersion: ").append(toIndentedString(scosVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
