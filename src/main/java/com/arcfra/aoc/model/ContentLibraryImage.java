package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ContentLibraryImage */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryImage
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private List<NestedCluster> clusters = null;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ELF_IMAGE_UUIDS = "elf_image_uuids";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_UUIDS)
    private List<String> elfImageUuids = new ArrayList<String>();

    public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
    private List<NestedElfImage> elfImages = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private List<NestedIscsiLun> iscsiLuns = null;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";

    @SerializedName(SERIALIZED_NAME_VM_DISKS)
    private List<NestedVmDisk> vmDisks = null;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
    private List<NestedVmSnapshot> vmSnapshots = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
    private List<NestedVmTemplate> vmTemplates = null;

    public ContentLibraryImage() {}

    public ContentLibraryImage clusters(List<NestedCluster> clusters) {

        this.clusters = clusters;
        return this;
    }

    public ContentLibraryImage addClustersItem(NestedCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<NestedCluster>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<NestedCluster> clusters) {
        this.clusters = clusters;
    }

    public ContentLibraryImage clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public ContentLibraryImage clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    public ContentLibraryImage createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ContentLibraryImage createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ContentLibraryImage createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public ContentLibraryImage description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContentLibraryImage description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ContentLibraryImage description_ExplictlyNonNull() {
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

    public ContentLibraryImage elfImageUuids(List<String> elfImageUuids) {

        this.elfImageUuids = elfImageUuids;
        return this;
    }

    public ContentLibraryImage addElfImageUuidsItem(String elfImageUuidsItem) {
        this.elfImageUuids.add(elfImageUuidsItem);
        return this;
    }

    /**
     * Get elfImageUuids
     *
     * @return elfImageUuids
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getElfImageUuids() {
        return elfImageUuids;
    }

    public void setElfImageUuids(List<String> elfImageUuids) {
        this.elfImageUuids = elfImageUuids;
    }

    public ContentLibraryImage elfImageUuids_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_UUIDS);
        return this;
    }

    public ContentLibraryImage elfImageUuids_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_UUIDS);
        return this;
    }

    public void setElfImageUuids_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_UUIDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_UUIDS);
        }
    }

    public boolean getElfImageUuids_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_UUIDS);
    }

    public ContentLibraryImage elfImages(List<NestedElfImage> elfImages) {

        this.elfImages = elfImages;
        return this;
    }

    public ContentLibraryImage addElfImagesItem(NestedElfImage elfImagesItem) {
        if (this.elfImages == null) {
            this.elfImages = new ArrayList<NestedElfImage>();
        }
        this.elfImages.add(elfImagesItem);
        return this;
    }

    /**
     * Get elfImages
     *
     * @return elfImages
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedElfImage> getElfImages() {
        return elfImages;
    }

    public void setElfImages(List<NestedElfImage> elfImages) {
        this.elfImages = elfImages;
    }

    public ContentLibraryImage elfImages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES);
        return this;
    }

    public ContentLibraryImage elfImages_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES);
        return this;
    }

    public void setElfImages_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES);
        }
    }

    public boolean getElfImages_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGES);
    }

    public ContentLibraryImage entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ContentLibraryImage entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ContentLibraryImage entityAsyncStatus_ExplictlyNonNull() {
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

    public ContentLibraryImage id(String id) {

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

    public ContentLibraryImage id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ContentLibraryImage id_ExplictlyNonNull() {
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

    public ContentLibraryImage iscsiLuns(List<NestedIscsiLun> iscsiLuns) {

        this.iscsiLuns = iscsiLuns;
        return this;
    }

    public ContentLibraryImage addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
        if (this.iscsiLuns == null) {
            this.iscsiLuns = new ArrayList<NestedIscsiLun>();
        }
        this.iscsiLuns.add(iscsiLunsItem);
        return this;
    }

    /**
     * Get iscsiLuns
     *
     * @return iscsiLuns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiLun> getIscsiLuns() {
        return iscsiLuns;
    }

    public void setIscsiLuns(List<NestedIscsiLun> iscsiLuns) {
        this.iscsiLuns = iscsiLuns;
    }

    public ContentLibraryImage iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public ContentLibraryImage iscsiLuns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public void setIscsiLuns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        }
    }

    public boolean getIscsiLuns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS);
    }

    public ContentLibraryImage labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public ContentLibraryImage addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public ContentLibraryImage labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public ContentLibraryImage labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public ContentLibraryImage name(String name) {

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

    public ContentLibraryImage name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ContentLibraryImage name_ExplictlyNonNull() {
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

    public ContentLibraryImage path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContentLibraryImage path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public ContentLibraryImage path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public ContentLibraryImage size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ContentLibraryImage size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public ContentLibraryImage size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public ContentLibraryImage vmDisks(List<NestedVmDisk> vmDisks) {

        this.vmDisks = vmDisks;
        return this;
    }

    public ContentLibraryImage addVmDisksItem(NestedVmDisk vmDisksItem) {
        if (this.vmDisks == null) {
            this.vmDisks = new ArrayList<NestedVmDisk>();
        }
        this.vmDisks.add(vmDisksItem);
        return this;
    }

    /**
     * Get vmDisks
     *
     * @return vmDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmDisk> getVmDisks() {
        return vmDisks;
    }

    public void setVmDisks(List<NestedVmDisk> vmDisks) {
        this.vmDisks = vmDisks;
    }

    public ContentLibraryImage vmDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public ContentLibraryImage vmDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public void setVmDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        }
    }

    public boolean getVmDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS);
    }

    public ContentLibraryImage vmSnapshots(List<NestedVmSnapshot> vmSnapshots) {

        this.vmSnapshots = vmSnapshots;
        return this;
    }

    public ContentLibraryImage addVmSnapshotsItem(NestedVmSnapshot vmSnapshotsItem) {
        if (this.vmSnapshots == null) {
            this.vmSnapshots = new ArrayList<NestedVmSnapshot>();
        }
        this.vmSnapshots.add(vmSnapshotsItem);
        return this;
    }

    /**
     * Get vmSnapshots
     *
     * @return vmSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmSnapshot> getVmSnapshots() {
        return vmSnapshots;
    }

    public void setVmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
        this.vmSnapshots = vmSnapshots;
    }

    public ContentLibraryImage vmSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public ContentLibraryImage vmSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public void setVmSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        }
    }

    public boolean getVmSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS);
    }

    public ContentLibraryImage vmTemplates(List<NestedVmTemplate> vmTemplates) {

        this.vmTemplates = vmTemplates;
        return this;
    }

    public ContentLibraryImage addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
        if (this.vmTemplates == null) {
            this.vmTemplates = new ArrayList<NestedVmTemplate>();
        }
        this.vmTemplates.add(vmTemplatesItem);
        return this;
    }

    /**
     * Get vmTemplates
     *
     * @return vmTemplates
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmTemplate> getVmTemplates() {
        return vmTemplates;
    }

    public void setVmTemplates(List<NestedVmTemplate> vmTemplates) {
        this.vmTemplates = vmTemplates;
    }

    public ContentLibraryImage vmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public ContentLibraryImage vmTemplates_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public void setVmTemplates_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        }
    }

    public boolean getVmTemplates_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryImage contentLibraryImage = (ContentLibraryImage) o;
        return Objects.equals(this.clusters, contentLibraryImage.clusters)
                && Objects.equals(this.createdAt, contentLibraryImage.createdAt)
                && Objects.equals(this.description, contentLibraryImage.description)
                && Objects.equals(this.elfImageUuids, contentLibraryImage.elfImageUuids)
                && Objects.equals(this.elfImages, contentLibraryImage.elfImages)
                && Objects.equals(this.entityAsyncStatus, contentLibraryImage.entityAsyncStatus)
                && Objects.equals(this.id, contentLibraryImage.id)
                && Objects.equals(this.iscsiLuns, contentLibraryImage.iscsiLuns)
                && Objects.equals(this.labels, contentLibraryImage.labels)
                && Objects.equals(this.name, contentLibraryImage.name)
                && Objects.equals(this.path, contentLibraryImage.path)
                && Objects.equals(this.size, contentLibraryImage.size)
                && Objects.equals(this.vmDisks, contentLibraryImage.vmDisks)
                && Objects.equals(this.vmSnapshots, contentLibraryImage.vmSnapshots)
                && Objects.equals(this.vmTemplates, contentLibraryImage.vmTemplates);
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
                clusters,
                createdAt,
                description,
                elfImageUuids,
                elfImages,
                entityAsyncStatus,
                id,
                iscsiLuns,
                labels,
                name,
                path,
                size,
                vmDisks,
                vmSnapshots,
                vmTemplates);
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
        sb.append("class ContentLibraryImage {\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    elfImageUuids: ").append(toIndentedString(elfImageUuids)).append("\n");
        sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
        sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
        sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
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
