package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LabelWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LabelWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<LabelWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<LabelWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<LabelWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER_NUM = "cluster_num";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM)
    private Integer clusterNum;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_GT = "cluster_num_gt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GT)
    private Integer clusterNumGt;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_GTE = "cluster_num_gte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GTE)
    private Integer clusterNumGte;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_IN = "cluster_num_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_IN)
    private List<Integer> clusterNumIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_LT = "cluster_num_lt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LT)
    private Integer clusterNumLt;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_LTE = "cluster_num_lte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LTE)
    private Integer clusterNumLte;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT = "cluster_num_not";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT)
    private Integer clusterNumNot;

    public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT_IN = "cluster_num_not_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN)
    private List<Integer> clusterNumNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
    private ClusterWhereInput clustersEvery;

    public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
    private ClusterWhereInput clustersNone;

    public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
    private ClusterWhereInput clustersSome;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM = "consistency_group_num";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM)
    private Integer consistencyGroupNum;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT =
            "consistency_group_num_gt";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT)
    private Integer consistencyGroupNumGt;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE =
            "consistency_group_num_gte";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE)
    private Integer consistencyGroupNumGte;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN =
            "consistency_group_num_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN)
    private List<Integer> consistencyGroupNumIn = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT =
            "consistency_group_num_lt";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT)
    private Integer consistencyGroupNumLt;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE =
            "consistency_group_num_lte";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE)
    private Integer consistencyGroupNumLte;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT =
            "consistency_group_num_not";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT)
    private Integer consistencyGroupNumNot;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN =
            "consistency_group_num_not_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN)
    private List<Integer> consistencyGroupNumNotIn = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM =
            "consistency_group_snapshot_num";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM)
    private Integer consistencyGroupSnapshotNum;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT =
            "consistency_group_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT)
    private Integer consistencyGroupSnapshotNumGt;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE =
            "consistency_group_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE)
    private Integer consistencyGroupSnapshotNumGte;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN =
            "consistency_group_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN)
    private List<Integer> consistencyGroupSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT =
            "consistency_group_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT)
    private Integer consistencyGroupSnapshotNumLt;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE =
            "consistency_group_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE)
    private Integer consistencyGroupSnapshotNumLte;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT =
            "consistency_group_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT)
    private Integer consistencyGroupSnapshotNumNot;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN =
            "consistency_group_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> consistencyGroupSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY =
            "consistency_group_snapshots_every";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY)
    private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsEvery;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE =
            "consistency_group_snapshots_none";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE)
    private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsNone;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME =
            "consistency_group_snapshots_some";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME)
    private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsSome;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY =
            "consistency_groups_every";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY)
    private ConsistencyGroupWhereInput consistencyGroupsEvery;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE = "consistency_groups_none";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE)
    private ConsistencyGroupWhereInput consistencyGroupsNone;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME = "consistency_groups_some";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME)
    private ConsistencyGroupWhereInput consistencyGroupsSome;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM =
            "content_library_image_num";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM)
    private Integer contentLibraryImageNum;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT =
            "content_library_image_num_gt";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT)
    private Integer contentLibraryImageNumGt;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE =
            "content_library_image_num_gte";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE)
    private Integer contentLibraryImageNumGte;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN =
            "content_library_image_num_in";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN)
    private List<Integer> contentLibraryImageNumIn = null;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT =
            "content_library_image_num_lt";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT)
    private Integer contentLibraryImageNumLt;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE =
            "content_library_image_num_lte";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE)
    private Integer contentLibraryImageNumLte;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT =
            "content_library_image_num_not";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT)
    private Integer contentLibraryImageNumNot;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN =
            "content_library_image_num_not_in";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN)
    private List<Integer> contentLibraryImageNumNotIn = null;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY =
            "content_library_images_every";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY)
    private ContentLibraryImageWhereInput contentLibraryImagesEvery;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE =
            "content_library_images_none";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE)
    private ContentLibraryImageWhereInput contentLibraryImagesNone;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME =
            "content_library_images_some";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME)
    private ContentLibraryImageWhereInput contentLibraryImagesSome;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM =
            "content_library_vm_template_num";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM)
    private Integer contentLibraryVmTemplateNum;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT =
            "content_library_vm_template_num_gt";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT)
    private Integer contentLibraryVmTemplateNumGt;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE =
            "content_library_vm_template_num_gte";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE)
    private Integer contentLibraryVmTemplateNumGte;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN =
            "content_library_vm_template_num_in";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN)
    private List<Integer> contentLibraryVmTemplateNumIn = null;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT =
            "content_library_vm_template_num_lt";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT)
    private Integer contentLibraryVmTemplateNumLt;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE =
            "content_library_vm_template_num_lte";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE)
    private Integer contentLibraryVmTemplateNumLte;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT =
            "content_library_vm_template_num_not";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT)
    private Integer contentLibraryVmTemplateNumNot;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN =
            "content_library_vm_template_num_not_in";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN)
    private List<Integer> contentLibraryVmTemplateNumNotIn = null;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY =
            "content_library_vm_templates_every";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE =
            "content_library_vm_templates_none";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME =
            "content_library_vm_templates_some";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
    private String createdAtGt;

    public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
    private String createdAtGte;

    public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
    private List<String> createdAtIn = null;

    public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
    private String createdAtLt;

    public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
    private String createdAtLte;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
    private String createdAtNot;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
    private List<String> createdAtNotIn = null;

    public static final String SERIALIZED_NAME_DATACENTER_NUM = "datacenter_num";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM)
    private Integer datacenterNum;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_GT = "datacenter_num_gt";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_GT)
    private Integer datacenterNumGt;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_GTE = "datacenter_num_gte";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_GTE)
    private Integer datacenterNumGte;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_IN = "datacenter_num_in";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_IN)
    private List<Integer> datacenterNumIn = null;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_LT = "datacenter_num_lt";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_LT)
    private Integer datacenterNumLt;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_LTE = "datacenter_num_lte";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_LTE)
    private Integer datacenterNumLte;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_NOT = "datacenter_num_not";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_NOT)
    private Integer datacenterNumNot;

    public static final String SERIALIZED_NAME_DATACENTER_NUM_NOT_IN = "datacenter_num_not_in";

    @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN)
    private List<Integer> datacenterNumNotIn = null;

    public static final String SERIALIZED_NAME_DATACENTERS_EVERY = "datacenters_every";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_EVERY)
    private DatacenterWhereInput datacentersEvery;

    public static final String SERIALIZED_NAME_DATACENTERS_NONE = "datacenters_none";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_NONE)
    private DatacenterWhereInput datacentersNone;

    public static final String SERIALIZED_NAME_DATACENTERS_SOME = "datacenters_some";

    @SerializedName(SERIALIZED_NAME_DATACENTERS_SOME)
    private DatacenterWhereInput datacentersSome;

    public static final String SERIALIZED_NAME_DISK_NUM = "disk_num";

    @SerializedName(SERIALIZED_NAME_DISK_NUM)
    private Integer diskNum;

    public static final String SERIALIZED_NAME_DISK_NUM_GT = "disk_num_gt";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_GT)
    private Integer diskNumGt;

    public static final String SERIALIZED_NAME_DISK_NUM_GTE = "disk_num_gte";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_GTE)
    private Integer diskNumGte;

    public static final String SERIALIZED_NAME_DISK_NUM_IN = "disk_num_in";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_IN)
    private List<Integer> diskNumIn = null;

    public static final String SERIALIZED_NAME_DISK_NUM_LT = "disk_num_lt";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_LT)
    private Integer diskNumLt;

    public static final String SERIALIZED_NAME_DISK_NUM_LTE = "disk_num_lte";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_LTE)
    private Integer diskNumLte;

    public static final String SERIALIZED_NAME_DISK_NUM_NOT = "disk_num_not";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_NOT)
    private Integer diskNumNot;

    public static final String SERIALIZED_NAME_DISK_NUM_NOT_IN = "disk_num_not_in";

    @SerializedName(SERIALIZED_NAME_DISK_NUM_NOT_IN)
    private List<Integer> diskNumNotIn = null;

    public static final String SERIALIZED_NAME_DISKS_EVERY = "disks_every";

    @SerializedName(SERIALIZED_NAME_DISKS_EVERY)
    private DiskWhereInput disksEvery;

    public static final String SERIALIZED_NAME_DISKS_NONE = "disks_none";

    @SerializedName(SERIALIZED_NAME_DISKS_NONE)
    private DiskWhereInput disksNone;

    public static final String SERIALIZED_NAME_DISKS_SOME = "disks_some";

    @SerializedName(SERIALIZED_NAME_DISKS_SOME)
    private DiskWhereInput disksSome;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM = "elf_image_num";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM)
    private Integer elfImageNum;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_GT = "elf_image_num_gt";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_GT)
    private Integer elfImageNumGt;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_GTE = "elf_image_num_gte";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE)
    private Integer elfImageNumGte;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_IN = "elf_image_num_in";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_IN)
    private List<Integer> elfImageNumIn = null;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_LT = "elf_image_num_lt";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_LT)
    private Integer elfImageNumLt;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_LTE = "elf_image_num_lte";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE)
    private Integer elfImageNumLte;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_NOT = "elf_image_num_not";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT)
    private Integer elfImageNumNot;

    public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN = "elf_image_num_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN)
    private List<Integer> elfImageNumNotIn = null;

    public static final String SERIALIZED_NAME_ELF_IMAGES_EVERY = "elf_images_every";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES_EVERY)
    private ElfImageWhereInput elfImagesEvery;

    public static final String SERIALIZED_NAME_ELF_IMAGES_NONE = "elf_images_none";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES_NONE)
    private ElfImageWhereInput elfImagesNone;

    public static final String SERIALIZED_NAME_ELF_IMAGES_SOME = "elf_images_some";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES_SOME)
    private ElfImageWhereInput elfImagesSome;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM = "gpu_device_num";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM)
    private Integer gpuDeviceNum;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_GT = "gpu_device_num_gt";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_GT)
    private Integer gpuDeviceNumGt;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_GTE = "gpu_device_num_gte";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE)
    private Integer gpuDeviceNumGte;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_IN = "gpu_device_num_in";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_IN)
    private List<Integer> gpuDeviceNumIn = null;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_LT = "gpu_device_num_lt";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_LT)
    private Integer gpuDeviceNumLt;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_LTE = "gpu_device_num_lte";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE)
    private Integer gpuDeviceNumLte;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_NOT = "gpu_device_num_not";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT)
    private Integer gpuDeviceNumNot;

    public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN = "gpu_device_num_not_in";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN)
    private List<Integer> gpuDeviceNumNotIn = null;

    public static final String SERIALIZED_NAME_GPU_DEVICES_EVERY = "gpu_devices_every";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES_EVERY)
    private GpuDeviceWhereInput gpuDevicesEvery;

    public static final String SERIALIZED_NAME_GPU_DEVICES_NONE = "gpu_devices_none";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES_NONE)
    private GpuDeviceWhereInput gpuDevicesNone;

    public static final String SERIALIZED_NAME_GPU_DEVICES_SOME = "gpu_devices_some";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES_SOME)
    private GpuDeviceWhereInput gpuDevicesSome;

    public static final String SERIALIZED_NAME_HOST_NUM = "host_num";

    @SerializedName(SERIALIZED_NAME_HOST_NUM)
    private Integer hostNum;

    public static final String SERIALIZED_NAME_HOST_NUM_GT = "host_num_gt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GT)
    private Integer hostNumGt;

    public static final String SERIALIZED_NAME_HOST_NUM_GTE = "host_num_gte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GTE)
    private Integer hostNumGte;

    public static final String SERIALIZED_NAME_HOST_NUM_IN = "host_num_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_IN)
    private List<Integer> hostNumIn = null;

    public static final String SERIALIZED_NAME_HOST_NUM_LT = "host_num_lt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LT)
    private Integer hostNumLt;

    public static final String SERIALIZED_NAME_HOST_NUM_LTE = "host_num_lte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LTE)
    private Integer hostNumLte;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT = "host_num_not";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT)
    private Integer hostNumNot;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT_IN = "host_num_not_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT_IN)
    private List<Integer> hostNumNotIn = null;

    public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";

    @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
    private HostWhereInput hostsEvery;

    public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";

    @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
    private HostWhereInput hostsNone;

    public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";

    @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
    private HostWhereInput hostsSome;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM = "iscsi_lun_num";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM)
    private Integer iscsiLunNum;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_GT = "iscsi_lun_num_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_GT)
    private Integer iscsiLunNumGt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_GTE = "iscsi_lun_num_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE)
    private Integer iscsiLunNumGte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_IN = "iscsi_lun_num_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_IN)
    private List<Integer> iscsiLunNumIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_LT = "iscsi_lun_num_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_LT)
    private Integer iscsiLunNumLt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_LTE = "iscsi_lun_num_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE)
    private Integer iscsiLunNumLte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_NOT = "iscsi_lun_num_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT)
    private Integer iscsiLunNumNot;

    public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN = "iscsi_lun_num_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN)
    private List<Integer> iscsiLunNumNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM = "iscsi_lun_snapshot_num";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM)
    private Integer iscsiLunSnapshotNum;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT =
            "iscsi_lun_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT)
    private Integer iscsiLunSnapshotNumGt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE =
            "iscsi_lun_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE)
    private Integer iscsiLunSnapshotNumGte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN =
            "iscsi_lun_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN)
    private List<Integer> iscsiLunSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT =
            "iscsi_lun_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT)
    private Integer iscsiLunSnapshotNumLt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE =
            "iscsi_lun_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE)
    private Integer iscsiLunSnapshotNumLte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT =
            "iscsi_lun_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT)
    private Integer iscsiLunSnapshotNumNot;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN =
            "iscsi_lun_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> iscsiLunSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY =
            "iscsi_lun_snapshots_every";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY)
    private IscsiLunSnapshotWhereInput iscsiLunSnapshotsEvery;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE =
            "iscsi_lun_snapshots_none";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE)
    private IscsiLunSnapshotWhereInput iscsiLunSnapshotsNone;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME =
            "iscsi_lun_snapshots_some";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME)
    private IscsiLunSnapshotWhereInput iscsiLunSnapshotsSome;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_EVERY = "iscsi_luns_every";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_EVERY)
    private IscsiLunWhereInput iscsiLunsEvery;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_NONE = "iscsi_luns_none";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_NONE)
    private IscsiLunWhereInput iscsiLunsNone;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_SOME = "iscsi_luns_some";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_SOME)
    private IscsiLunWhereInput iscsiLunsSome;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM = "iscsi_target_num";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM)
    private Integer iscsiTargetNum;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_GT = "iscsi_target_num_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT)
    private Integer iscsiTargetNumGt;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE = "iscsi_target_num_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE)
    private Integer iscsiTargetNumGte;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_IN = "iscsi_target_num_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN)
    private List<Integer> iscsiTargetNumIn = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_LT = "iscsi_target_num_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT)
    private Integer iscsiTargetNumLt;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE = "iscsi_target_num_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE)
    private Integer iscsiTargetNumLte;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT = "iscsi_target_num_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT)
    private Integer iscsiTargetNumNot;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN = "iscsi_target_num_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN)
    private List<Integer> iscsiTargetNumNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS_EVERY = "iscsi_targets_every";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_EVERY)
    private IscsiTargetWhereInput iscsiTargetsEvery;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS_NONE = "iscsi_targets_none";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_NONE)
    private IscsiTargetWhereInput iscsiTargetsNone;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS_SOME = "iscsi_targets_some";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_SOME)
    private IscsiTargetWhereInput iscsiTargetsSome;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_EVERY =
            "isolation_policies_every";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY)
    private IsolationPolicyWhereInput isolationPoliciesEvery;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_NONE = "isolation_policies_none";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_NONE)
    private IsolationPolicyWhereInput isolationPoliciesNone;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES_SOME = "isolation_policies_some";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES_SOME)
    private IsolationPolicyWhereInput isolationPoliciesSome;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM = "isolation_policy_num";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM)
    private Integer isolationPolicyNum;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT = "isolation_policy_num_gt";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT)
    private Integer isolationPolicyNumGt;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE =
            "isolation_policy_num_gte";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE)
    private Integer isolationPolicyNumGte;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN = "isolation_policy_num_in";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN)
    private List<Integer> isolationPolicyNumIn = null;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT = "isolation_policy_num_lt";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT)
    private Integer isolationPolicyNumLt;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE =
            "isolation_policy_num_lte";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE)
    private Integer isolationPolicyNumLte;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT =
            "isolation_policy_num_not";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT)
    private Integer isolationPolicyNumNot;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN =
            "isolation_policy_num_not_in";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN)
    private List<Integer> isolationPolicyNumNotIn = null;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_KEY_CONTAINS = "key_contains";

    @SerializedName(SERIALIZED_NAME_KEY_CONTAINS)
    private String keyContains;

    public static final String SERIALIZED_NAME_KEY_ENDS_WITH = "key_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_ENDS_WITH)
    private String keyEndsWith;

    public static final String SERIALIZED_NAME_KEY_GT = "key_gt";

    @SerializedName(SERIALIZED_NAME_KEY_GT)
    private String keyGt;

    public static final String SERIALIZED_NAME_KEY_GTE = "key_gte";

    @SerializedName(SERIALIZED_NAME_KEY_GTE)
    private String keyGte;

    public static final String SERIALIZED_NAME_KEY_IN = "key_in";

    @SerializedName(SERIALIZED_NAME_KEY_IN)
    private List<String> keyIn = null;

    public static final String SERIALIZED_NAME_KEY_LT = "key_lt";

    @SerializedName(SERIALIZED_NAME_KEY_LT)
    private String keyLt;

    public static final String SERIALIZED_NAME_KEY_LTE = "key_lte";

    @SerializedName(SERIALIZED_NAME_KEY_LTE)
    private String keyLte;

    public static final String SERIALIZED_NAME_KEY_NOT = "key_not";

    @SerializedName(SERIALIZED_NAME_KEY_NOT)
    private String keyNot;

    public static final String SERIALIZED_NAME_KEY_NOT_CONTAINS = "key_not_contains";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_CONTAINS)
    private String keyNotContains;

    public static final String SERIALIZED_NAME_KEY_NOT_ENDS_WITH = "key_not_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_ENDS_WITH)
    private String keyNotEndsWith;

    public static final String SERIALIZED_NAME_KEY_NOT_IN = "key_not_in";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_IN)
    private List<String> keyNotIn = null;

    public static final String SERIALIZED_NAME_KEY_NOT_STARTS_WITH = "key_not_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_STARTS_WITH)
    private String keyNotStartsWith;

    public static final String SERIALIZED_NAME_KEY_STARTS_WITH = "key_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_STARTS_WITH)
    private String keyStartsWith;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM = "namespace_group_num";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM)
    private Integer namespaceGroupNum;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT = "namespace_group_num_gt";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT)
    private Integer namespaceGroupNumGt;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE = "namespace_group_num_gte";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE)
    private Integer namespaceGroupNumGte;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN = "namespace_group_num_in";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN)
    private List<Integer> namespaceGroupNumIn = null;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT = "namespace_group_num_lt";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT)
    private Integer namespaceGroupNumLt;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE = "namespace_group_num_lte";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE)
    private Integer namespaceGroupNumLte;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT = "namespace_group_num_not";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT)
    private Integer namespaceGroupNumNot;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN =
            "namespace_group_num_not_in";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN)
    private List<Integer> namespaceGroupNumNotIn = null;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY = "namespace_groups_every";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY)
    private NamespaceGroupWhereInput namespaceGroupsEvery;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_NONE = "namespace_groups_none";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE)
    private NamespaceGroupWhereInput namespaceGroupsNone;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_SOME = "namespace_groups_some";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME)
    private NamespaceGroupWhereInput namespaceGroupsSome;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM = "nfs_export_num";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM)
    private Integer nfsExportNum;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_GT = "nfs_export_num_gt";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_GT)
    private Integer nfsExportNumGt;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_GTE = "nfs_export_num_gte";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE)
    private Integer nfsExportNumGte;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_IN = "nfs_export_num_in";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_IN)
    private List<Integer> nfsExportNumIn = null;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_LT = "nfs_export_num_lt";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_LT)
    private Integer nfsExportNumLt;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_LTE = "nfs_export_num_lte";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE)
    private Integer nfsExportNumLte;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_NOT = "nfs_export_num_not";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT)
    private Integer nfsExportNumNot;

    public static final String SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN = "nfs_export_num_not_in";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN)
    private List<Integer> nfsExportNumNotIn = null;

    public static final String SERIALIZED_NAME_NFS_EXPORTS_EVERY = "nfs_exports_every";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORTS_EVERY)
    private NfsExportWhereInput nfsExportsEvery;

    public static final String SERIALIZED_NAME_NFS_EXPORTS_NONE = "nfs_exports_none";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORTS_NONE)
    private NfsExportWhereInput nfsExportsNone;

    public static final String SERIALIZED_NAME_NFS_EXPORTS_SOME = "nfs_exports_some";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORTS_SOME)
    private NfsExportWhereInput nfsExportsSome;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM = "nfs_inode_num";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM)
    private Integer nfsInodeNum;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_GT = "nfs_inode_num_gt";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_GT)
    private Integer nfsInodeNumGt;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_GTE = "nfs_inode_num_gte";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_GTE)
    private Integer nfsInodeNumGte;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_IN = "nfs_inode_num_in";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_IN)
    private List<Integer> nfsInodeNumIn = null;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_LT = "nfs_inode_num_lt";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_LT)
    private Integer nfsInodeNumLt;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_LTE = "nfs_inode_num_lte";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_LTE)
    private Integer nfsInodeNumLte;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_NOT = "nfs_inode_num_not";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_NOT)
    private Integer nfsInodeNumNot;

    public static final String SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN = "nfs_inode_num_not_in";

    @SerializedName(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN)
    private List<Integer> nfsInodeNumNotIn = null;

    public static final String SERIALIZED_NAME_NFS_INODES_EVERY = "nfs_inodes_every";

    @SerializedName(SERIALIZED_NAME_NFS_INODES_EVERY)
    private NfsInodeWhereInput nfsInodesEvery;

    public static final String SERIALIZED_NAME_NFS_INODES_NONE = "nfs_inodes_none";

    @SerializedName(SERIALIZED_NAME_NFS_INODES_NONE)
    private NfsInodeWhereInput nfsInodesNone;

    public static final String SERIALIZED_NAME_NFS_INODES_SOME = "nfs_inodes_some";

    @SerializedName(SERIALIZED_NAME_NFS_INODES_SOME)
    private NfsInodeWhereInput nfsInodesSome;

    public static final String SERIALIZED_NAME_NIC_NUM = "nic_num";

    @SerializedName(SERIALIZED_NAME_NIC_NUM)
    private Integer nicNum;

    public static final String SERIALIZED_NAME_NIC_NUM_GT = "nic_num_gt";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_GT)
    private Integer nicNumGt;

    public static final String SERIALIZED_NAME_NIC_NUM_GTE = "nic_num_gte";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_GTE)
    private Integer nicNumGte;

    public static final String SERIALIZED_NAME_NIC_NUM_IN = "nic_num_in";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_IN)
    private List<Integer> nicNumIn = null;

    public static final String SERIALIZED_NAME_NIC_NUM_LT = "nic_num_lt";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_LT)
    private Integer nicNumLt;

    public static final String SERIALIZED_NAME_NIC_NUM_LTE = "nic_num_lte";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_LTE)
    private Integer nicNumLte;

    public static final String SERIALIZED_NAME_NIC_NUM_NOT = "nic_num_not";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_NOT)
    private Integer nicNumNot;

    public static final String SERIALIZED_NAME_NIC_NUM_NOT_IN = "nic_num_not_in";

    @SerializedName(SERIALIZED_NAME_NIC_NUM_NOT_IN)
    private List<Integer> nicNumNotIn = null;

    public static final String SERIALIZED_NAME_NICS_EVERY = "nics_every";

    @SerializedName(SERIALIZED_NAME_NICS_EVERY)
    private NicWhereInput nicsEvery;

    public static final String SERIALIZED_NAME_NICS_NONE = "nics_none";

    @SerializedName(SERIALIZED_NAME_NICS_NONE)
    private NicWhereInput nicsNone;

    public static final String SERIALIZED_NAME_NICS_SOME = "nics_some";

    @SerializedName(SERIALIZED_NAME_NICS_SOME)
    private NicWhereInput nicsSome;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM = "nvmf_namespace_num";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM)
    private Integer nvmfNamespaceNum;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT = "nvmf_namespace_num_gt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT)
    private Integer nvmfNamespaceNumGt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE = "nvmf_namespace_num_gte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE)
    private Integer nvmfNamespaceNumGte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN = "nvmf_namespace_num_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN)
    private List<Integer> nvmfNamespaceNumIn = null;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT = "nvmf_namespace_num_lt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT)
    private Integer nvmfNamespaceNumLt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE = "nvmf_namespace_num_lte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE)
    private Integer nvmfNamespaceNumLte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT = "nvmf_namespace_num_not";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT)
    private Integer nvmfNamespaceNumNot;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN =
            "nvmf_namespace_num_not_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN)
    private List<Integer> nvmfNamespaceNumNotIn = null;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM =
            "nvmf_namespace_snapshot_num";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM)
    private Integer nvmfNamespaceSnapshotNum;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT =
            "nvmf_namespace_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT)
    private Integer nvmfNamespaceSnapshotNumGt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE =
            "nvmf_namespace_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE)
    private Integer nvmfNamespaceSnapshotNumGte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN =
            "nvmf_namespace_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN)
    private List<Integer> nvmfNamespaceSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT =
            "nvmf_namespace_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT)
    private Integer nvmfNamespaceSnapshotNumLt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE =
            "nvmf_namespace_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE)
    private Integer nvmfNamespaceSnapshotNumLte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT =
            "nvmf_namespace_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT)
    private Integer nvmfNamespaceSnapshotNumNot;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN =
            "nvmf_namespace_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> nvmfNamespaceSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY =
            "nvmf_namespace_snapshots_every";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY)
    private NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsEvery;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE =
            "nvmf_namespace_snapshots_none";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE)
    private NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsNone;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME =
            "nvmf_namespace_snapshots_some";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME)
    private NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsSome;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_EVERY = "nvmf_namespaces_every";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY)
    private NvmfNamespaceWhereInput nvmfNamespacesEvery;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NONE = "nvmf_namespaces_none";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NONE)
    private NvmfNamespaceWhereInput nvmfNamespacesNone;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_SOME = "nvmf_namespaces_some";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_SOME)
    private NvmfNamespaceWhereInput nvmfNamespacesSome;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM = "nvmf_subsystem_num";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM)
    private Integer nvmfSubsystemNum;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT = "nvmf_subsystem_num_gt";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT)
    private Integer nvmfSubsystemNumGt;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE = "nvmf_subsystem_num_gte";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE)
    private Integer nvmfSubsystemNumGte;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN = "nvmf_subsystem_num_in";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN)
    private List<Integer> nvmfSubsystemNumIn = null;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT = "nvmf_subsystem_num_lt";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT)
    private Integer nvmfSubsystemNumLt;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE = "nvmf_subsystem_num_lte";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE)
    private Integer nvmfSubsystemNumLte;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT = "nvmf_subsystem_num_not";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT)
    private Integer nvmfSubsystemNumNot;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN =
            "nvmf_subsystem_num_not_in";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN)
    private List<Integer> nvmfSubsystemNumNotIn = null;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY = "nvmf_subsystems_every";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY)
    private NvmfSubsystemWhereInput nvmfSubsystemsEvery;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE = "nvmf_subsystems_none";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE)
    private NvmfSubsystemWhereInput nvmfSubsystemsNone;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME = "nvmf_subsystems_some";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME)
    private NvmfSubsystemWhereInput nvmfSubsystemsSome;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_EVERY = "security_policies_every";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_EVERY)
    private SecurityPolicyWhereInput securityPoliciesEvery;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_NONE = "security_policies_none";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_NONE)
    private SecurityPolicyWhereInput securityPoliciesNone;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES_SOME = "security_policies_some";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES_SOME)
    private SecurityPolicyWhereInput securityPoliciesSome;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM = "security_policy_num";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM)
    private Integer securityPolicyNum;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_GT = "security_policy_num_gt";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT)
    private Integer securityPolicyNumGt;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE = "security_policy_num_gte";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE)
    private Integer securityPolicyNumGte;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_IN = "security_policy_num_in";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN)
    private List<Integer> securityPolicyNumIn = null;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_LT = "security_policy_num_lt";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT)
    private Integer securityPolicyNumLt;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE = "security_policy_num_lte";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE)
    private Integer securityPolicyNumLte;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT = "security_policy_num_not";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT)
    private Integer securityPolicyNumNot;

    public static final String SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN =
            "security_policy_num_not_in";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN)
    private List<Integer> securityPolicyNumNotIn = null;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM = "system_vlan_num";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM)
    private Integer systemVlanNum;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT = "system_vlan_num_gt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT)
    private Integer systemVlanNumGt;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE = "system_vlan_num_gte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE)
    private Integer systemVlanNumGte;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN = "system_vlan_num_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN)
    private List<Integer> systemVlanNumIn = null;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT = "system_vlan_num_lt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT)
    private Integer systemVlanNumLt;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE = "system_vlan_num_lte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE)
    private Integer systemVlanNumLte;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT = "system_vlan_num_not";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT)
    private Integer systemVlanNumNot;

    public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN = "system_vlan_num_not_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN)
    private List<Integer> systemVlanNumNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
    private Integer totalNum;

    public static final String SERIALIZED_NAME_TOTAL_NUM_GT = "total_num_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_GT)
    private Integer totalNumGt;

    public static final String SERIALIZED_NAME_TOTAL_NUM_GTE = "total_num_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_GTE)
    private Integer totalNumGte;

    public static final String SERIALIZED_NAME_TOTAL_NUM_IN = "total_num_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_IN)
    private List<Integer> totalNumIn = null;

    public static final String SERIALIZED_NAME_TOTAL_NUM_LT = "total_num_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_LT)
    private Integer totalNumLt;

    public static final String SERIALIZED_NAME_TOTAL_NUM_LTE = "total_num_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_LTE)
    private Integer totalNumLte;

    public static final String SERIALIZED_NAME_TOTAL_NUM_NOT = "total_num_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_NOT)
    private Integer totalNumNot;

    public static final String SERIALIZED_NAME_TOTAL_NUM_NOT_IN = "total_num_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM_NOT_IN)
    private List<Integer> totalNumNotIn = null;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_VALUE_CONTAINS = "value_contains";

    @SerializedName(SERIALIZED_NAME_VALUE_CONTAINS)
    private String valueContains;

    public static final String SERIALIZED_NAME_VALUE_ENDS_WITH = "value_ends_with";

    @SerializedName(SERIALIZED_NAME_VALUE_ENDS_WITH)
    private String valueEndsWith;

    public static final String SERIALIZED_NAME_VALUE_GT = "value_gt";

    @SerializedName(SERIALIZED_NAME_VALUE_GT)
    private String valueGt;

    public static final String SERIALIZED_NAME_VALUE_GTE = "value_gte";

    @SerializedName(SERIALIZED_NAME_VALUE_GTE)
    private String valueGte;

    public static final String SERIALIZED_NAME_VALUE_IN = "value_in";

    @SerializedName(SERIALIZED_NAME_VALUE_IN)
    private List<String> valueIn = null;

    public static final String SERIALIZED_NAME_VALUE_LT = "value_lt";

    @SerializedName(SERIALIZED_NAME_VALUE_LT)
    private String valueLt;

    public static final String SERIALIZED_NAME_VALUE_LTE = "value_lte";

    @SerializedName(SERIALIZED_NAME_VALUE_LTE)
    private String valueLte;

    public static final String SERIALIZED_NAME_VALUE_NOT = "value_not";

    @SerializedName(SERIALIZED_NAME_VALUE_NOT)
    private String valueNot;

    public static final String SERIALIZED_NAME_VALUE_NOT_CONTAINS = "value_not_contains";

    @SerializedName(SERIALIZED_NAME_VALUE_NOT_CONTAINS)
    private String valueNotContains;

    public static final String SERIALIZED_NAME_VALUE_NOT_ENDS_WITH = "value_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH)
    private String valueNotEndsWith;

    public static final String SERIALIZED_NAME_VALUE_NOT_IN = "value_not_in";

    @SerializedName(SERIALIZED_NAME_VALUE_NOT_IN)
    private List<String> valueNotIn = null;

    public static final String SERIALIZED_NAME_VALUE_NOT_STARTS_WITH = "value_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH)
    private String valueNotStartsWith;

    public static final String SERIALIZED_NAME_VALUE_STARTS_WITH = "value_starts_with";

    @SerializedName(SERIALIZED_NAME_VALUE_STARTS_WITH)
    private String valueStartsWith;

    public static final String SERIALIZED_NAME_VDS_NUM = "vds_num";

    @SerializedName(SERIALIZED_NAME_VDS_NUM)
    private Integer vdsNum;

    public static final String SERIALIZED_NAME_VDS_NUM_GT = "vds_num_gt";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_GT)
    private Integer vdsNumGt;

    public static final String SERIALIZED_NAME_VDS_NUM_GTE = "vds_num_gte";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_GTE)
    private Integer vdsNumGte;

    public static final String SERIALIZED_NAME_VDS_NUM_IN = "vds_num_in";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_IN)
    private List<Integer> vdsNumIn = null;

    public static final String SERIALIZED_NAME_VDS_NUM_LT = "vds_num_lt";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_LT)
    private Integer vdsNumLt;

    public static final String SERIALIZED_NAME_VDS_NUM_LTE = "vds_num_lte";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_LTE)
    private Integer vdsNumLte;

    public static final String SERIALIZED_NAME_VDS_NUM_NOT = "vds_num_not";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_NOT)
    private Integer vdsNumNot;

    public static final String SERIALIZED_NAME_VDS_NUM_NOT_IN = "vds_num_not_in";

    @SerializedName(SERIALIZED_NAME_VDS_NUM_NOT_IN)
    private List<Integer> vdsNumNotIn = null;

    public static final String SERIALIZED_NAME_VDSES_EVERY = "vdses_every";

    @SerializedName(SERIALIZED_NAME_VDSES_EVERY)
    private VdsWhereInput vdsesEvery;

    public static final String SERIALIZED_NAME_VDSES_NONE = "vdses_none";

    @SerializedName(SERIALIZED_NAME_VDSES_NONE)
    private VdsWhereInput vdsesNone;

    public static final String SERIALIZED_NAME_VDSES_SOME = "vdses_some";

    @SerializedName(SERIALIZED_NAME_VDSES_SOME)
    private VdsWhereInput vdsesSome;

    public static final String SERIALIZED_NAME_VLANS_EVERY = "vlans_every";

    @SerializedName(SERIALIZED_NAME_VLANS_EVERY)
    private VlanWhereInput vlansEvery;

    public static final String SERIALIZED_NAME_VLANS_NONE = "vlans_none";

    @SerializedName(SERIALIZED_NAME_VLANS_NONE)
    private VlanWhereInput vlansNone;

    public static final String SERIALIZED_NAME_VLANS_SOME = "vlans_some";

    @SerializedName(SERIALIZED_NAME_VLANS_SOME)
    private VlanWhereInput vlansSome;

    public static final String SERIALIZED_NAME_VM_NUM = "vm_num";

    @SerializedName(SERIALIZED_NAME_VM_NUM)
    private Integer vmNum;

    public static final String SERIALIZED_NAME_VM_NUM_GT = "vm_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GT)
    private Integer vmNumGt;

    public static final String SERIALIZED_NAME_VM_NUM_GTE = "vm_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GTE)
    private Integer vmNumGte;

    public static final String SERIALIZED_NAME_VM_NUM_IN = "vm_num_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_IN)
    private List<Integer> vmNumIn = null;

    public static final String SERIALIZED_NAME_VM_NUM_LT = "vm_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LT)
    private Integer vmNumLt;

    public static final String SERIALIZED_NAME_VM_NUM_LTE = "vm_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LTE)
    private Integer vmNumLte;

    public static final String SERIALIZED_NAME_VM_NUM_NOT = "vm_num_not";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT)
    private Integer vmNumNot;

    public static final String SERIALIZED_NAME_VM_NUM_NOT_IN = "vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT_IN)
    private List<Integer> vmNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM = "vm_snapshot_num";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM)
    private Integer vmSnapshotNum;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT = "vm_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT)
    private Integer vmSnapshotNumGt;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE = "vm_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE)
    private Integer vmSnapshotNumGte;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN = "vm_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN)
    private List<Integer> vmSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT = "vm_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT)
    private Integer vmSnapshotNumLt;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE = "vm_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE)
    private Integer vmSnapshotNumLte;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT = "vm_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT)
    private Integer vmSnapshotNumNot;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN = "vm_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> vmSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_EVERY = "vm_snapshots_every";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY)
    private VmSnapshotWhereInput vmSnapshotsEvery;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_NONE = "vm_snapshots_none";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_NONE)
    private VmSnapshotWhereInput vmSnapshotsNone;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_SOME = "vm_snapshots_some";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_SOME)
    private VmSnapshotWhereInput vmSnapshotsSome;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM = "vm_template_num";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM)
    private Integer vmTemplateNum;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_GT = "vm_template_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT)
    private Integer vmTemplateNumGt;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE = "vm_template_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE)
    private Integer vmTemplateNumGte;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_IN = "vm_template_num_in";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN)
    private List<Integer> vmTemplateNumIn = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_LT = "vm_template_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT)
    private Integer vmTemplateNumLt;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE = "vm_template_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE)
    private Integer vmTemplateNumLte;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT = "vm_template_num_not";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT)
    private Integer vmTemplateNumNot;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN = "vm_template_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN)
    private List<Integer> vmTemplateNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
    private VmTemplateWhereInput vmTemplatesEvery;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
    private VmTemplateWhereInput vmTemplatesNone;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
    private VmTemplateWhereInput vmTemplatesSome;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM = "vm_vlan_num";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM)
    private Integer vmVlanNum;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_GT = "vm_vlan_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_GT)
    private Integer vmVlanNumGt;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_GTE = "vm_vlan_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_GTE)
    private Integer vmVlanNumGte;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_IN = "vm_vlan_num_in";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_IN)
    private List<Integer> vmVlanNumIn = null;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_LT = "vm_vlan_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_LT)
    private Integer vmVlanNumLt;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_LTE = "vm_vlan_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_LTE)
    private Integer vmVlanNumLte;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_NOT = "vm_vlan_num_not";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_NOT)
    private Integer vmVlanNumNot;

    public static final String SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN = "vm_vlan_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN)
    private List<Integer> vmVlanNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM = "vm_volume_num";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM)
    private Integer vmVolumeNum;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_GT = "vm_volume_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_GT)
    private Integer vmVolumeNumGt;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_GTE = "vm_volume_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_GTE)
    private Integer vmVolumeNumGte;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_IN = "vm_volume_num_in";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_IN)
    private List<Integer> vmVolumeNumIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_LT = "vm_volume_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_LT)
    private Integer vmVolumeNumLt;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_LTE = "vm_volume_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_LTE)
    private Integer vmVolumeNumLte;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_NOT = "vm_volume_num_not";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_NOT)
    private Integer vmVolumeNumNot;

    public static final String SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN = "vm_volume_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN)
    private List<Integer> vmVolumeNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM = "vm_volume_snapshot_num";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM)
    private Integer vmVolumeSnapshotNum;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT =
            "vm_volume_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT)
    private Integer vmVolumeSnapshotNumGt;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE =
            "vm_volume_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE)
    private Integer vmVolumeSnapshotNumGte;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN =
            "vm_volume_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN)
    private List<Integer> vmVolumeSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT =
            "vm_volume_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT)
    private Integer vmVolumeSnapshotNumLt;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE =
            "vm_volume_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE)
    private Integer vmVolumeSnapshotNumLte;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT =
            "vm_volume_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT)
    private Integer vmVolumeSnapshotNumNot;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN =
            "vm_volume_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> vmVolumeSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY =
            "vm_volume_snapshots_every";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY)
    private VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE =
            "vm_volume_snapshots_none";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE)
    private VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME =
            "vm_volume_snapshots_some";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME)
    private VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome;

    public static final String SERIALIZED_NAME_VM_VOLUMES_EVERY = "vm_volumes_every";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_EVERY)
    private VmVolumeWhereInput vmVolumesEvery;

    public static final String SERIALIZED_NAME_VM_VOLUMES_NONE = "vm_volumes_none";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_NONE)
    private VmVolumeWhereInput vmVolumesNone;

    public static final String SERIALIZED_NAME_VM_VOLUMES_SOME = "vm_volumes_some";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_SOME)
    private VmVolumeWhereInput vmVolumesSome;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public LabelWhereInput() {}

    public LabelWhereInput AND(List<LabelWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public LabelWhereInput addANDItem(LabelWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<LabelWhereInput>();
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
    public List<LabelWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<LabelWhereInput> AND) {
        this.AND = AND;
    }

    public LabelWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public LabelWhereInput AND_ExplictlyNonNull() {
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

    public LabelWhereInput NOT(List<LabelWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public LabelWhereInput addNOTItem(LabelWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<LabelWhereInput>();
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
    public List<LabelWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<LabelWhereInput> NOT) {
        this.NOT = NOT;
    }

    public LabelWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public LabelWhereInput NOT_ExplictlyNonNull() {
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

    public LabelWhereInput OR(List<LabelWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public LabelWhereInput addORItem(LabelWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<LabelWhereInput>();
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
    public List<LabelWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<LabelWhereInput> OR) {
        this.OR = OR;
    }

    public LabelWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public LabelWhereInput OR_ExplictlyNonNull() {
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

    public LabelWhereInput clusterNum(Integer clusterNum) {

        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * Get clusterNum
     *
     * @return clusterNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    public LabelWhereInput clusterNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM);
        return this;
    }

    public LabelWhereInput clusterNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM);
        return this;
    }

    public void setClusterNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM);
        }
    }

    public boolean getClusterNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM);
    }

    public LabelWhereInput clusterNumGt(Integer clusterNumGt) {

        this.clusterNumGt = clusterNumGt;
        return this;
    }

    /**
     * Get clusterNumGt
     *
     * @return clusterNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNumGt() {
        return clusterNumGt;
    }

    public void setClusterNumGt(Integer clusterNumGt) {
        this.clusterNumGt = clusterNumGt;
    }

    public LabelWhereInput clusterNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_GT);
        return this;
    }

    public LabelWhereInput clusterNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_GT);
        return this;
    }

    public void setClusterNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_GT);
        }
    }

    public boolean getClusterNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_GT);
    }

    public LabelWhereInput clusterNumGte(Integer clusterNumGte) {

        this.clusterNumGte = clusterNumGte;
        return this;
    }

    /**
     * Get clusterNumGte
     *
     * @return clusterNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNumGte() {
        return clusterNumGte;
    }

    public void setClusterNumGte(Integer clusterNumGte) {
        this.clusterNumGte = clusterNumGte;
    }

    public LabelWhereInput clusterNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_GTE);
        return this;
    }

    public LabelWhereInput clusterNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_GTE);
        return this;
    }

    public void setClusterNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_GTE);
        }
    }

    public boolean getClusterNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_GTE);
    }

    public LabelWhereInput clusterNumIn(List<Integer> clusterNumIn) {

        this.clusterNumIn = clusterNumIn;
        return this;
    }

    public LabelWhereInput addClusterNumInItem(Integer clusterNumInItem) {
        if (this.clusterNumIn == null) {
            this.clusterNumIn = new ArrayList<Integer>();
        }
        this.clusterNumIn.add(clusterNumInItem);
        return this;
    }

    /**
     * Get clusterNumIn
     *
     * @return clusterNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getClusterNumIn() {
        return clusterNumIn;
    }

    public void setClusterNumIn(List<Integer> clusterNumIn) {
        this.clusterNumIn = clusterNumIn;
    }

    public LabelWhereInput clusterNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_IN);
        return this;
    }

    public LabelWhereInput clusterNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_IN);
        return this;
    }

    public void setClusterNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_IN);
        }
    }

    public boolean getClusterNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_IN);
    }

    public LabelWhereInput clusterNumLt(Integer clusterNumLt) {

        this.clusterNumLt = clusterNumLt;
        return this;
    }

    /**
     * Get clusterNumLt
     *
     * @return clusterNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNumLt() {
        return clusterNumLt;
    }

    public void setClusterNumLt(Integer clusterNumLt) {
        this.clusterNumLt = clusterNumLt;
    }

    public LabelWhereInput clusterNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_LT);
        return this;
    }

    public LabelWhereInput clusterNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_LT);
        return this;
    }

    public void setClusterNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_LT);
        }
    }

    public boolean getClusterNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_LT);
    }

    public LabelWhereInput clusterNumLte(Integer clusterNumLte) {

        this.clusterNumLte = clusterNumLte;
        return this;
    }

    /**
     * Get clusterNumLte
     *
     * @return clusterNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNumLte() {
        return clusterNumLte;
    }

    public void setClusterNumLte(Integer clusterNumLte) {
        this.clusterNumLte = clusterNumLte;
    }

    public LabelWhereInput clusterNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_LTE);
        return this;
    }

    public LabelWhereInput clusterNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_LTE);
        return this;
    }

    public void setClusterNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_LTE);
        }
    }

    public boolean getClusterNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_LTE);
    }

    public LabelWhereInput clusterNumNot(Integer clusterNumNot) {

        this.clusterNumNot = clusterNumNot;
        return this;
    }

    /**
     * Get clusterNumNot
     *
     * @return clusterNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getClusterNumNot() {
        return clusterNumNot;
    }

    public void setClusterNumNot(Integer clusterNumNot) {
        this.clusterNumNot = clusterNumNot;
    }

    public LabelWhereInput clusterNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_NOT);
        return this;
    }

    public LabelWhereInput clusterNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_NOT);
        return this;
    }

    public void setClusterNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_NOT);
        }
    }

    public boolean getClusterNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_NOT);
    }

    public LabelWhereInput clusterNumNotIn(List<Integer> clusterNumNotIn) {

        this.clusterNumNotIn = clusterNumNotIn;
        return this;
    }

    public LabelWhereInput addClusterNumNotInItem(Integer clusterNumNotInItem) {
        if (this.clusterNumNotIn == null) {
            this.clusterNumNotIn = new ArrayList<Integer>();
        }
        this.clusterNumNotIn.add(clusterNumNotInItem);
        return this;
    }

    /**
     * Get clusterNumNotIn
     *
     * @return clusterNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getClusterNumNotIn() {
        return clusterNumNotIn;
    }

    public void setClusterNumNotIn(List<Integer> clusterNumNotIn) {
        this.clusterNumNotIn = clusterNumNotIn;
    }

    public LabelWhereInput clusterNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput clusterNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN);
        return this;
    }

    public void setClusterNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN);
        }
    }

    public boolean getClusterNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN);
    }

    public LabelWhereInput clustersEvery(ClusterWhereInput clustersEvery) {

        this.clustersEvery = clustersEvery;
        return this;
    }

    /**
     * Get clustersEvery
     *
     * @return clustersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersEvery() {
        return clustersEvery;
    }

    public void setClustersEvery(ClusterWhereInput clustersEvery) {
        this.clustersEvery = clustersEvery;
    }

    public LabelWhereInput clustersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public LabelWhereInput clustersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public void setClustersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        }
    }

    public boolean getClustersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_EVERY);
    }

    public LabelWhereInput clustersNone(ClusterWhereInput clustersNone) {

        this.clustersNone = clustersNone;
        return this;
    }

    /**
     * Get clustersNone
     *
     * @return clustersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersNone() {
        return clustersNone;
    }

    public void setClustersNone(ClusterWhereInput clustersNone) {
        this.clustersNone = clustersNone;
    }

    public LabelWhereInput clustersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public LabelWhereInput clustersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public void setClustersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        }
    }

    public boolean getClustersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_NONE);
    }

    public LabelWhereInput clustersSome(ClusterWhereInput clustersSome) {

        this.clustersSome = clustersSome;
        return this;
    }

    /**
     * Get clustersSome
     *
     * @return clustersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersSome() {
        return clustersSome;
    }

    public void setClustersSome(ClusterWhereInput clustersSome) {
        this.clustersSome = clustersSome;
    }

    public LabelWhereInput clustersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public LabelWhereInput clustersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public void setClustersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        }
    }

    public boolean getClustersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_SOME);
    }

    public LabelWhereInput consistencyGroupNum(Integer consistencyGroupNum) {

        this.consistencyGroupNum = consistencyGroupNum;
        return this;
    }

    /**
     * Get consistencyGroupNum
     *
     * @return consistencyGroupNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNum() {
        return consistencyGroupNum;
    }

    public void setConsistencyGroupNum(Integer consistencyGroupNum) {
        this.consistencyGroupNum = consistencyGroupNum;
    }

    public LabelWhereInput consistencyGroupNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM);
        return this;
    }

    public LabelWhereInput consistencyGroupNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM);
        return this;
    }

    public void setConsistencyGroupNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM);
        }
    }

    public boolean getConsistencyGroupNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM);
    }

    public LabelWhereInput consistencyGroupNumGt(Integer consistencyGroupNumGt) {

        this.consistencyGroupNumGt = consistencyGroupNumGt;
        return this;
    }

    /**
     * Get consistencyGroupNumGt
     *
     * @return consistencyGroupNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNumGt() {
        return consistencyGroupNumGt;
    }

    public void setConsistencyGroupNumGt(Integer consistencyGroupNumGt) {
        this.consistencyGroupNumGt = consistencyGroupNumGt;
    }

    public LabelWhereInput consistencyGroupNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT);
        return this;
    }

    public LabelWhereInput consistencyGroupNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT);
        return this;
    }

    public void setConsistencyGroupNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT);
        }
    }

    public boolean getConsistencyGroupNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GT);
    }

    public LabelWhereInput consistencyGroupNumGte(Integer consistencyGroupNumGte) {

        this.consistencyGroupNumGte = consistencyGroupNumGte;
        return this;
    }

    /**
     * Get consistencyGroupNumGte
     *
     * @return consistencyGroupNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNumGte() {
        return consistencyGroupNumGte;
    }

    public void setConsistencyGroupNumGte(Integer consistencyGroupNumGte) {
        this.consistencyGroupNumGte = consistencyGroupNumGte;
    }

    public LabelWhereInput consistencyGroupNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE);
        return this;
    }

    public LabelWhereInput consistencyGroupNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE);
        return this;
    }

    public void setConsistencyGroupNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE);
        }
    }

    public boolean getConsistencyGroupNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_GTE);
    }

    public LabelWhereInput consistencyGroupNumIn(List<Integer> consistencyGroupNumIn) {

        this.consistencyGroupNumIn = consistencyGroupNumIn;
        return this;
    }

    public LabelWhereInput addConsistencyGroupNumInItem(Integer consistencyGroupNumInItem) {
        if (this.consistencyGroupNumIn == null) {
            this.consistencyGroupNumIn = new ArrayList<Integer>();
        }
        this.consistencyGroupNumIn.add(consistencyGroupNumInItem);
        return this;
    }

    /**
     * Get consistencyGroupNumIn
     *
     * @return consistencyGroupNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getConsistencyGroupNumIn() {
        return consistencyGroupNumIn;
    }

    public void setConsistencyGroupNumIn(List<Integer> consistencyGroupNumIn) {
        this.consistencyGroupNumIn = consistencyGroupNumIn;
    }

    public LabelWhereInput consistencyGroupNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN);
        return this;
    }

    public LabelWhereInput consistencyGroupNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN);
        return this;
    }

    public void setConsistencyGroupNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN);
        }
    }

    public boolean getConsistencyGroupNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_IN);
    }

    public LabelWhereInput consistencyGroupNumLt(Integer consistencyGroupNumLt) {

        this.consistencyGroupNumLt = consistencyGroupNumLt;
        return this;
    }

    /**
     * Get consistencyGroupNumLt
     *
     * @return consistencyGroupNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNumLt() {
        return consistencyGroupNumLt;
    }

    public void setConsistencyGroupNumLt(Integer consistencyGroupNumLt) {
        this.consistencyGroupNumLt = consistencyGroupNumLt;
    }

    public LabelWhereInput consistencyGroupNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT);
        return this;
    }

    public LabelWhereInput consistencyGroupNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT);
        return this;
    }

    public void setConsistencyGroupNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT);
        }
    }

    public boolean getConsistencyGroupNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LT);
    }

    public LabelWhereInput consistencyGroupNumLte(Integer consistencyGroupNumLte) {

        this.consistencyGroupNumLte = consistencyGroupNumLte;
        return this;
    }

    /**
     * Get consistencyGroupNumLte
     *
     * @return consistencyGroupNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNumLte() {
        return consistencyGroupNumLte;
    }

    public void setConsistencyGroupNumLte(Integer consistencyGroupNumLte) {
        this.consistencyGroupNumLte = consistencyGroupNumLte;
    }

    public LabelWhereInput consistencyGroupNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE);
        return this;
    }

    public LabelWhereInput consistencyGroupNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE);
        return this;
    }

    public void setConsistencyGroupNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE);
        }
    }

    public boolean getConsistencyGroupNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_LTE);
    }

    public LabelWhereInput consistencyGroupNumNot(Integer consistencyGroupNumNot) {

        this.consistencyGroupNumNot = consistencyGroupNumNot;
        return this;
    }

    /**
     * Get consistencyGroupNumNot
     *
     * @return consistencyGroupNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupNumNot() {
        return consistencyGroupNumNot;
    }

    public void setConsistencyGroupNumNot(Integer consistencyGroupNumNot) {
        this.consistencyGroupNumNot = consistencyGroupNumNot;
    }

    public LabelWhereInput consistencyGroupNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT);
        return this;
    }

    public LabelWhereInput consistencyGroupNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT);
        return this;
    }

    public void setConsistencyGroupNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT);
        }
    }

    public boolean getConsistencyGroupNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT);
    }

    public LabelWhereInput consistencyGroupNumNotIn(List<Integer> consistencyGroupNumNotIn) {

        this.consistencyGroupNumNotIn = consistencyGroupNumNotIn;
        return this;
    }

    public LabelWhereInput addConsistencyGroupNumNotInItem(Integer consistencyGroupNumNotInItem) {
        if (this.consistencyGroupNumNotIn == null) {
            this.consistencyGroupNumNotIn = new ArrayList<Integer>();
        }
        this.consistencyGroupNumNotIn.add(consistencyGroupNumNotInItem);
        return this;
    }

    /**
     * Get consistencyGroupNumNotIn
     *
     * @return consistencyGroupNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getConsistencyGroupNumNotIn() {
        return consistencyGroupNumNotIn;
    }

    public void setConsistencyGroupNumNotIn(List<Integer> consistencyGroupNumNotIn) {
        this.consistencyGroupNumNotIn = consistencyGroupNumNotIn;
    }

    public LabelWhereInput consistencyGroupNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput consistencyGroupNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN);
        return this;
    }

    public void setConsistencyGroupNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN);
        }
    }

    public boolean getConsistencyGroupNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_NUM_NOT_IN);
    }

    public LabelWhereInput consistencyGroupSnapshotNum(Integer consistencyGroupSnapshotNum) {

        this.consistencyGroupSnapshotNum = consistencyGroupSnapshotNum;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNum
     *
     * @return consistencyGroupSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNum() {
        return consistencyGroupSnapshotNum;
    }

    public void setConsistencyGroupSnapshotNum(Integer consistencyGroupSnapshotNum) {
        this.consistencyGroupSnapshotNum = consistencyGroupSnapshotNum;
    }

    public LabelWhereInput consistencyGroupSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM);
        return this;
    }

    public void setConsistencyGroupSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM);
        }
    }

    public boolean getConsistencyGroupSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM);
    }

    public LabelWhereInput consistencyGroupSnapshotNumGt(Integer consistencyGroupSnapshotNumGt) {

        this.consistencyGroupSnapshotNumGt = consistencyGroupSnapshotNumGt;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumGt
     *
     * @return consistencyGroupSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNumGt() {
        return consistencyGroupSnapshotNumGt;
    }

    public void setConsistencyGroupSnapshotNumGt(Integer consistencyGroupSnapshotNumGt) {
        this.consistencyGroupSnapshotNumGt = consistencyGroupSnapshotNumGt;
    }

    public LabelWhereInput consistencyGroupSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setConsistencyGroupSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getConsistencyGroupSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GT);
    }

    public LabelWhereInput consistencyGroupSnapshotNumGte(Integer consistencyGroupSnapshotNumGte) {

        this.consistencyGroupSnapshotNumGte = consistencyGroupSnapshotNumGte;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumGte
     *
     * @return consistencyGroupSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNumGte() {
        return consistencyGroupSnapshotNumGte;
    }

    public void setConsistencyGroupSnapshotNumGte(Integer consistencyGroupSnapshotNumGte) {
        this.consistencyGroupSnapshotNumGte = consistencyGroupSnapshotNumGte;
    }

    public LabelWhereInput consistencyGroupSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setConsistencyGroupSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getConsistencyGroupSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_GTE);
    }

    public LabelWhereInput consistencyGroupSnapshotNumIn(
            List<Integer> consistencyGroupSnapshotNumIn) {

        this.consistencyGroupSnapshotNumIn = consistencyGroupSnapshotNumIn;
        return this;
    }

    public LabelWhereInput addConsistencyGroupSnapshotNumInItem(
            Integer consistencyGroupSnapshotNumInItem) {
        if (this.consistencyGroupSnapshotNumIn == null) {
            this.consistencyGroupSnapshotNumIn = new ArrayList<Integer>();
        }
        this.consistencyGroupSnapshotNumIn.add(consistencyGroupSnapshotNumInItem);
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumIn
     *
     * @return consistencyGroupSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getConsistencyGroupSnapshotNumIn() {
        return consistencyGroupSnapshotNumIn;
    }

    public void setConsistencyGroupSnapshotNumIn(List<Integer> consistencyGroupSnapshotNumIn) {
        this.consistencyGroupSnapshotNumIn = consistencyGroupSnapshotNumIn;
    }

    public LabelWhereInput consistencyGroupSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setConsistencyGroupSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getConsistencyGroupSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_IN);
    }

    public LabelWhereInput consistencyGroupSnapshotNumLt(Integer consistencyGroupSnapshotNumLt) {

        this.consistencyGroupSnapshotNumLt = consistencyGroupSnapshotNumLt;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumLt
     *
     * @return consistencyGroupSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNumLt() {
        return consistencyGroupSnapshotNumLt;
    }

    public void setConsistencyGroupSnapshotNumLt(Integer consistencyGroupSnapshotNumLt) {
        this.consistencyGroupSnapshotNumLt = consistencyGroupSnapshotNumLt;
    }

    public LabelWhereInput consistencyGroupSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setConsistencyGroupSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getConsistencyGroupSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LT);
    }

    public LabelWhereInput consistencyGroupSnapshotNumLte(Integer consistencyGroupSnapshotNumLte) {

        this.consistencyGroupSnapshotNumLte = consistencyGroupSnapshotNumLte;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumLte
     *
     * @return consistencyGroupSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNumLte() {
        return consistencyGroupSnapshotNumLte;
    }

    public void setConsistencyGroupSnapshotNumLte(Integer consistencyGroupSnapshotNumLte) {
        this.consistencyGroupSnapshotNumLte = consistencyGroupSnapshotNumLte;
    }

    public LabelWhereInput consistencyGroupSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setConsistencyGroupSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getConsistencyGroupSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_LTE);
    }

    public LabelWhereInput consistencyGroupSnapshotNumNot(Integer consistencyGroupSnapshotNumNot) {

        this.consistencyGroupSnapshotNumNot = consistencyGroupSnapshotNumNot;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumNot
     *
     * @return consistencyGroupSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getConsistencyGroupSnapshotNumNot() {
        return consistencyGroupSnapshotNumNot;
    }

    public void setConsistencyGroupSnapshotNumNot(Integer consistencyGroupSnapshotNumNot) {
        this.consistencyGroupSnapshotNumNot = consistencyGroupSnapshotNumNot;
    }

    public LabelWhereInput consistencyGroupSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setConsistencyGroupSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getConsistencyGroupSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT);
    }

    public LabelWhereInput consistencyGroupSnapshotNumNotIn(
            List<Integer> consistencyGroupSnapshotNumNotIn) {

        this.consistencyGroupSnapshotNumNotIn = consistencyGroupSnapshotNumNotIn;
        return this;
    }

    public LabelWhereInput addConsistencyGroupSnapshotNumNotInItem(
            Integer consistencyGroupSnapshotNumNotInItem) {
        if (this.consistencyGroupSnapshotNumNotIn == null) {
            this.consistencyGroupSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.consistencyGroupSnapshotNumNotIn.add(consistencyGroupSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get consistencyGroupSnapshotNumNotIn
     *
     * @return consistencyGroupSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getConsistencyGroupSnapshotNumNotIn() {
        return consistencyGroupSnapshotNumNotIn;
    }

    public void setConsistencyGroupSnapshotNumNotIn(
            List<Integer> consistencyGroupSnapshotNumNotIn) {
        this.consistencyGroupSnapshotNumNotIn = consistencyGroupSnapshotNumNotIn;
    }

    public LabelWhereInput consistencyGroupSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setConsistencyGroupSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getConsistencyGroupSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT_NUM_NOT_IN);
    }

    public LabelWhereInput consistencyGroupSnapshotsEvery(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsEvery) {

        this.consistencyGroupSnapshotsEvery = consistencyGroupSnapshotsEvery;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotsEvery
     *
     * @return consistencyGroupSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshotsEvery() {
        return consistencyGroupSnapshotsEvery;
    }

    public void setConsistencyGroupSnapshotsEvery(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsEvery) {
        this.consistencyGroupSnapshotsEvery = consistencyGroupSnapshotsEvery;
    }

    public LabelWhereInput consistencyGroupSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY);
        return this;
    }

    public void setConsistencyGroupSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY);
        }
    }

    public boolean getConsistencyGroupSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_EVERY);
    }

    public LabelWhereInput consistencyGroupSnapshotsNone(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsNone) {

        this.consistencyGroupSnapshotsNone = consistencyGroupSnapshotsNone;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotsNone
     *
     * @return consistencyGroupSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshotsNone() {
        return consistencyGroupSnapshotsNone;
    }

    public void setConsistencyGroupSnapshotsNone(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsNone) {
        this.consistencyGroupSnapshotsNone = consistencyGroupSnapshotsNone;
    }

    public LabelWhereInput consistencyGroupSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE);
        return this;
    }

    public void setConsistencyGroupSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE);
        }
    }

    public boolean getConsistencyGroupSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_NONE);
    }

    public LabelWhereInput consistencyGroupSnapshotsSome(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsSome) {

        this.consistencyGroupSnapshotsSome = consistencyGroupSnapshotsSome;
        return this;
    }

    /**
     * Get consistencyGroupSnapshotsSome
     *
     * @return consistencyGroupSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshotsSome() {
        return consistencyGroupSnapshotsSome;
    }

    public void setConsistencyGroupSnapshotsSome(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshotsSome) {
        this.consistencyGroupSnapshotsSome = consistencyGroupSnapshotsSome;
    }

    public LabelWhereInput consistencyGroupSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME);
        return this;
    }

    public LabelWhereInput consistencyGroupSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME);
        return this;
    }

    public void setConsistencyGroupSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME);
        }
    }

    public boolean getConsistencyGroupSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS_SOME);
    }

    public LabelWhereInput consistencyGroupsEvery(
            ConsistencyGroupWhereInput consistencyGroupsEvery) {

        this.consistencyGroupsEvery = consistencyGroupsEvery;
        return this;
    }

    /**
     * Get consistencyGroupsEvery
     *
     * @return consistencyGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsEvery() {
        return consistencyGroupsEvery;
    }

    public void setConsistencyGroupsEvery(ConsistencyGroupWhereInput consistencyGroupsEvery) {
        this.consistencyGroupsEvery = consistencyGroupsEvery;
    }

    public LabelWhereInput consistencyGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        return this;
    }

    public LabelWhereInput consistencyGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        return this;
    }

    public void setConsistencyGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
        }
    }

    public boolean getConsistencyGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_EVERY);
    }

    public LabelWhereInput consistencyGroupsNone(ConsistencyGroupWhereInput consistencyGroupsNone) {

        this.consistencyGroupsNone = consistencyGroupsNone;
        return this;
    }

    /**
     * Get consistencyGroupsNone
     *
     * @return consistencyGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsNone() {
        return consistencyGroupsNone;
    }

    public void setConsistencyGroupsNone(ConsistencyGroupWhereInput consistencyGroupsNone) {
        this.consistencyGroupsNone = consistencyGroupsNone;
    }

    public LabelWhereInput consistencyGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        return this;
    }

    public LabelWhereInput consistencyGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        return this;
    }

    public void setConsistencyGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
        }
    }

    public boolean getConsistencyGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_NONE);
    }

    public LabelWhereInput consistencyGroupsSome(ConsistencyGroupWhereInput consistencyGroupsSome) {

        this.consistencyGroupsSome = consistencyGroupsSome;
        return this;
    }

    /**
     * Get consistencyGroupsSome
     *
     * @return consistencyGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroupsSome() {
        return consistencyGroupsSome;
    }

    public void setConsistencyGroupsSome(ConsistencyGroupWhereInput consistencyGroupsSome) {
        this.consistencyGroupsSome = consistencyGroupsSome;
    }

    public LabelWhereInput consistencyGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        return this;
    }

    public LabelWhereInput consistencyGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        return this;
    }

    public void setConsistencyGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
        }
    }

    public boolean getConsistencyGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS_SOME);
    }

    public LabelWhereInput contentLibraryImageNum(Integer contentLibraryImageNum) {

        this.contentLibraryImageNum = contentLibraryImageNum;
        return this;
    }

    /**
     * Get contentLibraryImageNum
     *
     * @return contentLibraryImageNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNum() {
        return contentLibraryImageNum;
    }

    public void setContentLibraryImageNum(Integer contentLibraryImageNum) {
        this.contentLibraryImageNum = contentLibraryImageNum;
    }

    public LabelWhereInput contentLibraryImageNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM);
        return this;
    }

    public LabelWhereInput contentLibraryImageNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM);
        return this;
    }

    public void setContentLibraryImageNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM);
        }
    }

    public boolean getContentLibraryImageNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM);
    }

    public LabelWhereInput contentLibraryImageNumGt(Integer contentLibraryImageNumGt) {

        this.contentLibraryImageNumGt = contentLibraryImageNumGt;
        return this;
    }

    /**
     * Get contentLibraryImageNumGt
     *
     * @return contentLibraryImageNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNumGt() {
        return contentLibraryImageNumGt;
    }

    public void setContentLibraryImageNumGt(Integer contentLibraryImageNumGt) {
        this.contentLibraryImageNumGt = contentLibraryImageNumGt;
    }

    public LabelWhereInput contentLibraryImageNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT);
        return this;
    }

    public void setContentLibraryImageNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT);
        }
    }

    public boolean getContentLibraryImageNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT);
    }

    public LabelWhereInput contentLibraryImageNumGte(Integer contentLibraryImageNumGte) {

        this.contentLibraryImageNumGte = contentLibraryImageNumGte;
        return this;
    }

    /**
     * Get contentLibraryImageNumGte
     *
     * @return contentLibraryImageNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNumGte() {
        return contentLibraryImageNumGte;
    }

    public void setContentLibraryImageNumGte(Integer contentLibraryImageNumGte) {
        this.contentLibraryImageNumGte = contentLibraryImageNumGte;
    }

    public LabelWhereInput contentLibraryImageNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE);
        return this;
    }

    public void setContentLibraryImageNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE);
        }
    }

    public boolean getContentLibraryImageNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE);
    }

    public LabelWhereInput contentLibraryImageNumIn(List<Integer> contentLibraryImageNumIn) {

        this.contentLibraryImageNumIn = contentLibraryImageNumIn;
        return this;
    }

    public LabelWhereInput addContentLibraryImageNumInItem(Integer contentLibraryImageNumInItem) {
        if (this.contentLibraryImageNumIn == null) {
            this.contentLibraryImageNumIn = new ArrayList<Integer>();
        }
        this.contentLibraryImageNumIn.add(contentLibraryImageNumInItem);
        return this;
    }

    /**
     * Get contentLibraryImageNumIn
     *
     * @return contentLibraryImageNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getContentLibraryImageNumIn() {
        return contentLibraryImageNumIn;
    }

    public void setContentLibraryImageNumIn(List<Integer> contentLibraryImageNumIn) {
        this.contentLibraryImageNumIn = contentLibraryImageNumIn;
    }

    public LabelWhereInput contentLibraryImageNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN);
        return this;
    }

    public void setContentLibraryImageNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN);
        }
    }

    public boolean getContentLibraryImageNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN);
    }

    public LabelWhereInput contentLibraryImageNumLt(Integer contentLibraryImageNumLt) {

        this.contentLibraryImageNumLt = contentLibraryImageNumLt;
        return this;
    }

    /**
     * Get contentLibraryImageNumLt
     *
     * @return contentLibraryImageNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNumLt() {
        return contentLibraryImageNumLt;
    }

    public void setContentLibraryImageNumLt(Integer contentLibraryImageNumLt) {
        this.contentLibraryImageNumLt = contentLibraryImageNumLt;
    }

    public LabelWhereInput contentLibraryImageNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT);
        return this;
    }

    public void setContentLibraryImageNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT);
        }
    }

    public boolean getContentLibraryImageNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT);
    }

    public LabelWhereInput contentLibraryImageNumLte(Integer contentLibraryImageNumLte) {

        this.contentLibraryImageNumLte = contentLibraryImageNumLte;
        return this;
    }

    /**
     * Get contentLibraryImageNumLte
     *
     * @return contentLibraryImageNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNumLte() {
        return contentLibraryImageNumLte;
    }

    public void setContentLibraryImageNumLte(Integer contentLibraryImageNumLte) {
        this.contentLibraryImageNumLte = contentLibraryImageNumLte;
    }

    public LabelWhereInput contentLibraryImageNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE);
        return this;
    }

    public void setContentLibraryImageNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE);
        }
    }

    public boolean getContentLibraryImageNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE);
    }

    public LabelWhereInput contentLibraryImageNumNot(Integer contentLibraryImageNumNot) {

        this.contentLibraryImageNumNot = contentLibraryImageNumNot;
        return this;
    }

    /**
     * Get contentLibraryImageNumNot
     *
     * @return contentLibraryImageNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryImageNumNot() {
        return contentLibraryImageNumNot;
    }

    public void setContentLibraryImageNumNot(Integer contentLibraryImageNumNot) {
        this.contentLibraryImageNumNot = contentLibraryImageNumNot;
    }

    public LabelWhereInput contentLibraryImageNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT);
        return this;
    }

    public void setContentLibraryImageNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT);
        }
    }

    public boolean getContentLibraryImageNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT);
    }

    public LabelWhereInput contentLibraryImageNumNotIn(List<Integer> contentLibraryImageNumNotIn) {

        this.contentLibraryImageNumNotIn = contentLibraryImageNumNotIn;
        return this;
    }

    public LabelWhereInput addContentLibraryImageNumNotInItem(
            Integer contentLibraryImageNumNotInItem) {
        if (this.contentLibraryImageNumNotIn == null) {
            this.contentLibraryImageNumNotIn = new ArrayList<Integer>();
        }
        this.contentLibraryImageNumNotIn.add(contentLibraryImageNumNotInItem);
        return this;
    }

    /**
     * Get contentLibraryImageNumNotIn
     *
     * @return contentLibraryImageNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getContentLibraryImageNumNotIn() {
        return contentLibraryImageNumNotIn;
    }

    public void setContentLibraryImageNumNotIn(List<Integer> contentLibraryImageNumNotIn) {
        this.contentLibraryImageNumNotIn = contentLibraryImageNumNotIn;
    }

    public LabelWhereInput contentLibraryImageNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput contentLibraryImageNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN);
        return this;
    }

    public void setContentLibraryImageNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN);
        }
    }

    public boolean getContentLibraryImageNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN);
    }

    public LabelWhereInput contentLibraryImagesEvery(
            ContentLibraryImageWhereInput contentLibraryImagesEvery) {

        this.contentLibraryImagesEvery = contentLibraryImagesEvery;
        return this;
    }

    /**
     * Get contentLibraryImagesEvery
     *
     * @return contentLibraryImagesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryImageWhereInput getContentLibraryImagesEvery() {
        return contentLibraryImagesEvery;
    }

    public void setContentLibraryImagesEvery(
            ContentLibraryImageWhereInput contentLibraryImagesEvery) {
        this.contentLibraryImagesEvery = contentLibraryImagesEvery;
    }

    public LabelWhereInput contentLibraryImagesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY);
        return this;
    }

    public LabelWhereInput contentLibraryImagesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY);
        return this;
    }

    public void setContentLibraryImagesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY);
        }
    }

    public boolean getContentLibraryImagesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY);
    }

    public LabelWhereInput contentLibraryImagesNone(
            ContentLibraryImageWhereInput contentLibraryImagesNone) {

        this.contentLibraryImagesNone = contentLibraryImagesNone;
        return this;
    }

    /**
     * Get contentLibraryImagesNone
     *
     * @return contentLibraryImagesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryImageWhereInput getContentLibraryImagesNone() {
        return contentLibraryImagesNone;
    }

    public void setContentLibraryImagesNone(
            ContentLibraryImageWhereInput contentLibraryImagesNone) {
        this.contentLibraryImagesNone = contentLibraryImagesNone;
    }

    public LabelWhereInput contentLibraryImagesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE);
        return this;
    }

    public LabelWhereInput contentLibraryImagesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE);
        return this;
    }

    public void setContentLibraryImagesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE);
        }
    }

    public boolean getContentLibraryImagesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE);
    }

    public LabelWhereInput contentLibraryImagesSome(
            ContentLibraryImageWhereInput contentLibraryImagesSome) {

        this.contentLibraryImagesSome = contentLibraryImagesSome;
        return this;
    }

    /**
     * Get contentLibraryImagesSome
     *
     * @return contentLibraryImagesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryImageWhereInput getContentLibraryImagesSome() {
        return contentLibraryImagesSome;
    }

    public void setContentLibraryImagesSome(
            ContentLibraryImageWhereInput contentLibraryImagesSome) {
        this.contentLibraryImagesSome = contentLibraryImagesSome;
    }

    public LabelWhereInput contentLibraryImagesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME);
        return this;
    }

    public LabelWhereInput contentLibraryImagesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME);
        return this;
    }

    public void setContentLibraryImagesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME);
        }
    }

    public boolean getContentLibraryImagesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME);
    }

    public LabelWhereInput contentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {

        this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNum
     *
     * @return contentLibraryVmTemplateNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNum() {
        return contentLibraryVmTemplateNum;
    }

    public void setContentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
        this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
    }

    public LabelWhereInput contentLibraryVmTemplateNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM);
        return this;
    }

    public void setContentLibraryVmTemplateNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM);
        }
    }

    public boolean getContentLibraryVmTemplateNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM);
    }

    public LabelWhereInput contentLibraryVmTemplateNumGt(Integer contentLibraryVmTemplateNumGt) {

        this.contentLibraryVmTemplateNumGt = contentLibraryVmTemplateNumGt;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumGt
     *
     * @return contentLibraryVmTemplateNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNumGt() {
        return contentLibraryVmTemplateNumGt;
    }

    public void setContentLibraryVmTemplateNumGt(Integer contentLibraryVmTemplateNumGt) {
        this.contentLibraryVmTemplateNumGt = contentLibraryVmTemplateNumGt;
    }

    public LabelWhereInput contentLibraryVmTemplateNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT);
        return this;
    }

    public void setContentLibraryVmTemplateNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT);
        }
    }

    public boolean getContentLibraryVmTemplateNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT);
    }

    public LabelWhereInput contentLibraryVmTemplateNumGte(Integer contentLibraryVmTemplateNumGte) {

        this.contentLibraryVmTemplateNumGte = contentLibraryVmTemplateNumGte;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumGte
     *
     * @return contentLibraryVmTemplateNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNumGte() {
        return contentLibraryVmTemplateNumGte;
    }

    public void setContentLibraryVmTemplateNumGte(Integer contentLibraryVmTemplateNumGte) {
        this.contentLibraryVmTemplateNumGte = contentLibraryVmTemplateNumGte;
    }

    public LabelWhereInput contentLibraryVmTemplateNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE);
        return this;
    }

    public void setContentLibraryVmTemplateNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE);
        }
    }

    public boolean getContentLibraryVmTemplateNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE);
    }

    public LabelWhereInput contentLibraryVmTemplateNumIn(
            List<Integer> contentLibraryVmTemplateNumIn) {

        this.contentLibraryVmTemplateNumIn = contentLibraryVmTemplateNumIn;
        return this;
    }

    public LabelWhereInput addContentLibraryVmTemplateNumInItem(
            Integer contentLibraryVmTemplateNumInItem) {
        if (this.contentLibraryVmTemplateNumIn == null) {
            this.contentLibraryVmTemplateNumIn = new ArrayList<Integer>();
        }
        this.contentLibraryVmTemplateNumIn.add(contentLibraryVmTemplateNumInItem);
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumIn
     *
     * @return contentLibraryVmTemplateNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getContentLibraryVmTemplateNumIn() {
        return contentLibraryVmTemplateNumIn;
    }

    public void setContentLibraryVmTemplateNumIn(List<Integer> contentLibraryVmTemplateNumIn) {
        this.contentLibraryVmTemplateNumIn = contentLibraryVmTemplateNumIn;
    }

    public LabelWhereInput contentLibraryVmTemplateNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN);
        return this;
    }

    public void setContentLibraryVmTemplateNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN);
        }
    }

    public boolean getContentLibraryVmTemplateNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN);
    }

    public LabelWhereInput contentLibraryVmTemplateNumLt(Integer contentLibraryVmTemplateNumLt) {

        this.contentLibraryVmTemplateNumLt = contentLibraryVmTemplateNumLt;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumLt
     *
     * @return contentLibraryVmTemplateNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNumLt() {
        return contentLibraryVmTemplateNumLt;
    }

    public void setContentLibraryVmTemplateNumLt(Integer contentLibraryVmTemplateNumLt) {
        this.contentLibraryVmTemplateNumLt = contentLibraryVmTemplateNumLt;
    }

    public LabelWhereInput contentLibraryVmTemplateNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT);
        return this;
    }

    public void setContentLibraryVmTemplateNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT);
        }
    }

    public boolean getContentLibraryVmTemplateNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT);
    }

    public LabelWhereInput contentLibraryVmTemplateNumLte(Integer contentLibraryVmTemplateNumLte) {

        this.contentLibraryVmTemplateNumLte = contentLibraryVmTemplateNumLte;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumLte
     *
     * @return contentLibraryVmTemplateNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNumLte() {
        return contentLibraryVmTemplateNumLte;
    }

    public void setContentLibraryVmTemplateNumLte(Integer contentLibraryVmTemplateNumLte) {
        this.contentLibraryVmTemplateNumLte = contentLibraryVmTemplateNumLte;
    }

    public LabelWhereInput contentLibraryVmTemplateNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE);
        return this;
    }

    public void setContentLibraryVmTemplateNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE);
        }
    }

    public boolean getContentLibraryVmTemplateNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE);
    }

    public LabelWhereInput contentLibraryVmTemplateNumNot(Integer contentLibraryVmTemplateNumNot) {

        this.contentLibraryVmTemplateNumNot = contentLibraryVmTemplateNumNot;
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumNot
     *
     * @return contentLibraryVmTemplateNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getContentLibraryVmTemplateNumNot() {
        return contentLibraryVmTemplateNumNot;
    }

    public void setContentLibraryVmTemplateNumNot(Integer contentLibraryVmTemplateNumNot) {
        this.contentLibraryVmTemplateNumNot = contentLibraryVmTemplateNumNot;
    }

    public LabelWhereInput contentLibraryVmTemplateNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT);
        return this;
    }

    public void setContentLibraryVmTemplateNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT);
        }
    }

    public boolean getContentLibraryVmTemplateNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT);
    }

    public LabelWhereInput contentLibraryVmTemplateNumNotIn(
            List<Integer> contentLibraryVmTemplateNumNotIn) {

        this.contentLibraryVmTemplateNumNotIn = contentLibraryVmTemplateNumNotIn;
        return this;
    }

    public LabelWhereInput addContentLibraryVmTemplateNumNotInItem(
            Integer contentLibraryVmTemplateNumNotInItem) {
        if (this.contentLibraryVmTemplateNumNotIn == null) {
            this.contentLibraryVmTemplateNumNotIn = new ArrayList<Integer>();
        }
        this.contentLibraryVmTemplateNumNotIn.add(contentLibraryVmTemplateNumNotInItem);
        return this;
    }

    /**
     * Get contentLibraryVmTemplateNumNotIn
     *
     * @return contentLibraryVmTemplateNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getContentLibraryVmTemplateNumNotIn() {
        return contentLibraryVmTemplateNumNotIn;
    }

    public void setContentLibraryVmTemplateNumNotIn(
            List<Integer> contentLibraryVmTemplateNumNotIn) {
        this.contentLibraryVmTemplateNumNotIn = contentLibraryVmTemplateNumNotIn;
    }

    public LabelWhereInput contentLibraryVmTemplateNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplateNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN);
        return this;
    }

    public void setContentLibraryVmTemplateNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN);
        }
    }

    public boolean getContentLibraryVmTemplateNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN);
    }

    public LabelWhereInput contentLibraryVmTemplatesEvery(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery) {

        this.contentLibraryVmTemplatesEvery = contentLibraryVmTemplatesEvery;
        return this;
    }

    /**
     * Get contentLibraryVmTemplatesEvery
     *
     * @return contentLibraryVmTemplatesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesEvery() {
        return contentLibraryVmTemplatesEvery;
    }

    public void setContentLibraryVmTemplatesEvery(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery) {
        this.contentLibraryVmTemplatesEvery = contentLibraryVmTemplatesEvery;
    }

    public LabelWhereInput contentLibraryVmTemplatesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplatesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY);
        return this;
    }

    public void setContentLibraryVmTemplatesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY);
        }
    }

    public boolean getContentLibraryVmTemplatesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY);
    }

    public LabelWhereInput contentLibraryVmTemplatesNone(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone) {

        this.contentLibraryVmTemplatesNone = contentLibraryVmTemplatesNone;
        return this;
    }

    /**
     * Get contentLibraryVmTemplatesNone
     *
     * @return contentLibraryVmTemplatesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesNone() {
        return contentLibraryVmTemplatesNone;
    }

    public void setContentLibraryVmTemplatesNone(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone) {
        this.contentLibraryVmTemplatesNone = contentLibraryVmTemplatesNone;
    }

    public LabelWhereInput contentLibraryVmTemplatesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplatesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE);
        return this;
    }

    public void setContentLibraryVmTemplatesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE);
        }
    }

    public boolean getContentLibraryVmTemplatesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE);
    }

    public LabelWhereInput contentLibraryVmTemplatesSome(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome) {

        this.contentLibraryVmTemplatesSome = contentLibraryVmTemplatesSome;
        return this;
    }

    /**
     * Get contentLibraryVmTemplatesSome
     *
     * @return contentLibraryVmTemplatesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesSome() {
        return contentLibraryVmTemplatesSome;
    }

    public void setContentLibraryVmTemplatesSome(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome) {
        this.contentLibraryVmTemplatesSome = contentLibraryVmTemplatesSome;
    }

    public LabelWhereInput contentLibraryVmTemplatesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME);
        return this;
    }

    public LabelWhereInput contentLibraryVmTemplatesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME);
        return this;
    }

    public void setContentLibraryVmTemplatesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME);
        }
    }

    public boolean getContentLibraryVmTemplatesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME);
    }

    public LabelWhereInput createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LabelWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public LabelWhereInput createdAt_ExplictlyNonNull() {
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

    public LabelWhereInput createdAtGt(String createdAtGt) {

        this.createdAtGt = createdAtGt;
        return this;
    }

    /**
     * Get createdAtGt
     *
     * @return createdAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGt() {
        return createdAtGt;
    }

    public void setCreatedAtGt(String createdAtGt) {
        this.createdAtGt = createdAtGt;
    }

    public LabelWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public LabelWhereInput createdAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public void setCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        }
    }

    public boolean getCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GT);
    }

    public LabelWhereInput createdAtGte(String createdAtGte) {

        this.createdAtGte = createdAtGte;
        return this;
    }

    /**
     * Get createdAtGte
     *
     * @return createdAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGte() {
        return createdAtGte;
    }

    public void setCreatedAtGte(String createdAtGte) {
        this.createdAtGte = createdAtGte;
    }

    public LabelWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public LabelWhereInput createdAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public void setCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        }
    }

    public boolean getCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GTE);
    }

    public LabelWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public LabelWhereInput addCreatedAtInItem(String createdAtInItem) {
        if (this.createdAtIn == null) {
            this.createdAtIn = new ArrayList<String>();
        }
        this.createdAtIn.add(createdAtInItem);
        return this;
    }

    /**
     * Get createdAtIn
     *
     * @return createdAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtIn() {
        return createdAtIn;
    }

    public void setCreatedAtIn(List<String> createdAtIn) {
        this.createdAtIn = createdAtIn;
    }

    public LabelWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public LabelWhereInput createdAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public void setCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        }
    }

    public boolean getCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_IN);
    }

    public LabelWhereInput createdAtLt(String createdAtLt) {

        this.createdAtLt = createdAtLt;
        return this;
    }

    /**
     * Get createdAtLt
     *
     * @return createdAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLt() {
        return createdAtLt;
    }

    public void setCreatedAtLt(String createdAtLt) {
        this.createdAtLt = createdAtLt;
    }

    public LabelWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public LabelWhereInput createdAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public void setCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        }
    }

    public boolean getCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LT);
    }

    public LabelWhereInput createdAtLte(String createdAtLte) {

        this.createdAtLte = createdAtLte;
        return this;
    }

    /**
     * Get createdAtLte
     *
     * @return createdAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLte() {
        return createdAtLte;
    }

    public void setCreatedAtLte(String createdAtLte) {
        this.createdAtLte = createdAtLte;
    }

    public LabelWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public LabelWhereInput createdAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public void setCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        }
    }

    public boolean getCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LTE);
    }

    public LabelWhereInput createdAtNot(String createdAtNot) {

        this.createdAtNot = createdAtNot;
        return this;
    }

    /**
     * Get createdAtNot
     *
     * @return createdAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtNot() {
        return createdAtNot;
    }

    public void setCreatedAtNot(String createdAtNot) {
        this.createdAtNot = createdAtNot;
    }

    public LabelWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public LabelWhereInput createdAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public void setCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        }
    }

    public boolean getCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT);
    }

    public LabelWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public LabelWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
        if (this.createdAtNotIn == null) {
            this.createdAtNotIn = new ArrayList<String>();
        }
        this.createdAtNotIn.add(createdAtNotInItem);
        return this;
    }

    /**
     * Get createdAtNotIn
     *
     * @return createdAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtNotIn() {
        return createdAtNotIn;
    }

    public void setCreatedAtNotIn(List<String> createdAtNotIn) {
        this.createdAtNotIn = createdAtNotIn;
    }

    public LabelWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public LabelWhereInput createdAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public void setCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        }
    }

    public boolean getCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT_IN);
    }

    public LabelWhereInput datacenterNum(Integer datacenterNum) {

        this.datacenterNum = datacenterNum;
        return this;
    }

    /**
     * Get datacenterNum
     *
     * @return datacenterNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNum() {
        return datacenterNum;
    }

    public void setDatacenterNum(Integer datacenterNum) {
        this.datacenterNum = datacenterNum;
    }

    public LabelWhereInput datacenterNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM);
        return this;
    }

    public LabelWhereInput datacenterNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM);
        return this;
    }

    public void setDatacenterNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM);
        }
    }

    public boolean getDatacenterNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM);
    }

    public LabelWhereInput datacenterNumGt(Integer datacenterNumGt) {

        this.datacenterNumGt = datacenterNumGt;
        return this;
    }

    /**
     * Get datacenterNumGt
     *
     * @return datacenterNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNumGt() {
        return datacenterNumGt;
    }

    public void setDatacenterNumGt(Integer datacenterNumGt) {
        this.datacenterNumGt = datacenterNumGt;
    }

    public LabelWhereInput datacenterNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_GT);
        return this;
    }

    public LabelWhereInput datacenterNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_GT);
        return this;
    }

    public void setDatacenterNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_GT);
        }
    }

    public boolean getDatacenterNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_GT);
    }

    public LabelWhereInput datacenterNumGte(Integer datacenterNumGte) {

        this.datacenterNumGte = datacenterNumGte;
        return this;
    }

    /**
     * Get datacenterNumGte
     *
     * @return datacenterNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNumGte() {
        return datacenterNumGte;
    }

    public void setDatacenterNumGte(Integer datacenterNumGte) {
        this.datacenterNumGte = datacenterNumGte;
    }

    public LabelWhereInput datacenterNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_GTE);
        return this;
    }

    public LabelWhereInput datacenterNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_GTE);
        return this;
    }

    public void setDatacenterNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_GTE);
        }
    }

    public boolean getDatacenterNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_GTE);
    }

    public LabelWhereInput datacenterNumIn(List<Integer> datacenterNumIn) {

        this.datacenterNumIn = datacenterNumIn;
        return this;
    }

    public LabelWhereInput addDatacenterNumInItem(Integer datacenterNumInItem) {
        if (this.datacenterNumIn == null) {
            this.datacenterNumIn = new ArrayList<Integer>();
        }
        this.datacenterNumIn.add(datacenterNumInItem);
        return this;
    }

    /**
     * Get datacenterNumIn
     *
     * @return datacenterNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDatacenterNumIn() {
        return datacenterNumIn;
    }

    public void setDatacenterNumIn(List<Integer> datacenterNumIn) {
        this.datacenterNumIn = datacenterNumIn;
    }

    public LabelWhereInput datacenterNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_IN);
        return this;
    }

    public LabelWhereInput datacenterNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_IN);
        return this;
    }

    public void setDatacenterNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_IN);
        }
    }

    public boolean getDatacenterNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_IN);
    }

    public LabelWhereInput datacenterNumLt(Integer datacenterNumLt) {

        this.datacenterNumLt = datacenterNumLt;
        return this;
    }

    /**
     * Get datacenterNumLt
     *
     * @return datacenterNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNumLt() {
        return datacenterNumLt;
    }

    public void setDatacenterNumLt(Integer datacenterNumLt) {
        this.datacenterNumLt = datacenterNumLt;
    }

    public LabelWhereInput datacenterNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_LT);
        return this;
    }

    public LabelWhereInput datacenterNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_LT);
        return this;
    }

    public void setDatacenterNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_LT);
        }
    }

    public boolean getDatacenterNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_LT);
    }

    public LabelWhereInput datacenterNumLte(Integer datacenterNumLte) {

        this.datacenterNumLte = datacenterNumLte;
        return this;
    }

    /**
     * Get datacenterNumLte
     *
     * @return datacenterNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNumLte() {
        return datacenterNumLte;
    }

    public void setDatacenterNumLte(Integer datacenterNumLte) {
        this.datacenterNumLte = datacenterNumLte;
    }

    public LabelWhereInput datacenterNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_LTE);
        return this;
    }

    public LabelWhereInput datacenterNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_LTE);
        return this;
    }

    public void setDatacenterNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_LTE);
        }
    }

    public boolean getDatacenterNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_LTE);
    }

    public LabelWhereInput datacenterNumNot(Integer datacenterNumNot) {

        this.datacenterNumNot = datacenterNumNot;
        return this;
    }

    /**
     * Get datacenterNumNot
     *
     * @return datacenterNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDatacenterNumNot() {
        return datacenterNumNot;
    }

    public void setDatacenterNumNot(Integer datacenterNumNot) {
        this.datacenterNumNot = datacenterNumNot;
    }

    public LabelWhereInput datacenterNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_NOT);
        return this;
    }

    public LabelWhereInput datacenterNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_NOT);
        return this;
    }

    public void setDatacenterNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_NOT);
        }
    }

    public boolean getDatacenterNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_NOT);
    }

    public LabelWhereInput datacenterNumNotIn(List<Integer> datacenterNumNotIn) {

        this.datacenterNumNotIn = datacenterNumNotIn;
        return this;
    }

    public LabelWhereInput addDatacenterNumNotInItem(Integer datacenterNumNotInItem) {
        if (this.datacenterNumNotIn == null) {
            this.datacenterNumNotIn = new ArrayList<Integer>();
        }
        this.datacenterNumNotIn.add(datacenterNumNotInItem);
        return this;
    }

    /**
     * Get datacenterNumNotIn
     *
     * @return datacenterNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDatacenterNumNotIn() {
        return datacenterNumNotIn;
    }

    public void setDatacenterNumNotIn(List<Integer> datacenterNumNotIn) {
        this.datacenterNumNotIn = datacenterNumNotIn;
    }

    public LabelWhereInput datacenterNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput datacenterNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN);
        return this;
    }

    public void setDatacenterNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN);
        }
    }

    public boolean getDatacenterNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN);
    }

    public LabelWhereInput datacentersEvery(DatacenterWhereInput datacentersEvery) {

        this.datacentersEvery = datacentersEvery;
        return this;
    }

    /**
     * Get datacentersEvery
     *
     * @return datacentersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersEvery() {
        return datacentersEvery;
    }

    public void setDatacentersEvery(DatacenterWhereInput datacentersEvery) {
        this.datacentersEvery = datacentersEvery;
    }

    public LabelWhereInput datacentersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_EVERY);
        return this;
    }

    public LabelWhereInput datacentersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_EVERY);
        return this;
    }

    public void setDatacentersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_EVERY);
        }
    }

    public boolean getDatacentersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_EVERY);
    }

    public LabelWhereInput datacentersNone(DatacenterWhereInput datacentersNone) {

        this.datacentersNone = datacentersNone;
        return this;
    }

    /**
     * Get datacentersNone
     *
     * @return datacentersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersNone() {
        return datacentersNone;
    }

    public void setDatacentersNone(DatacenterWhereInput datacentersNone) {
        this.datacentersNone = datacentersNone;
    }

    public LabelWhereInput datacentersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_NONE);
        return this;
    }

    public LabelWhereInput datacentersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_NONE);
        return this;
    }

    public void setDatacentersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_NONE);
        }
    }

    public boolean getDatacentersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_NONE);
    }

    public LabelWhereInput datacentersSome(DatacenterWhereInput datacentersSome) {

        this.datacentersSome = datacentersSome;
        return this;
    }

    /**
     * Get datacentersSome
     *
     * @return datacentersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacentersSome() {
        return datacentersSome;
    }

    public void setDatacentersSome(DatacenterWhereInput datacentersSome) {
        this.datacentersSome = datacentersSome;
    }

    public LabelWhereInput datacentersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_SOME);
        return this;
    }

    public LabelWhereInput datacentersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_SOME);
        return this;
    }

    public void setDatacentersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS_SOME);
        }
    }

    public boolean getDatacentersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS_SOME);
    }

    public LabelWhereInput diskNum(Integer diskNum) {

        this.diskNum = diskNum;
        return this;
    }

    /**
     * Get diskNum
     *
     * @return diskNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNum() {
        return diskNum;
    }

    public void setDiskNum(Integer diskNum) {
        this.diskNum = diskNum;
    }

    public LabelWhereInput diskNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM);
        return this;
    }

    public LabelWhereInput diskNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM);
        return this;
    }

    public void setDiskNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM);
        }
    }

    public boolean getDiskNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM);
    }

    public LabelWhereInput diskNumGt(Integer diskNumGt) {

        this.diskNumGt = diskNumGt;
        return this;
    }

    /**
     * Get diskNumGt
     *
     * @return diskNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNumGt() {
        return diskNumGt;
    }

    public void setDiskNumGt(Integer diskNumGt) {
        this.diskNumGt = diskNumGt;
    }

    public LabelWhereInput diskNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_GT);
        return this;
    }

    public LabelWhereInput diskNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_GT);
        return this;
    }

    public void setDiskNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_GT);
        }
    }

    public boolean getDiskNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_GT);
    }

    public LabelWhereInput diskNumGte(Integer diskNumGte) {

        this.diskNumGte = diskNumGte;
        return this;
    }

    /**
     * Get diskNumGte
     *
     * @return diskNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNumGte() {
        return diskNumGte;
    }

    public void setDiskNumGte(Integer diskNumGte) {
        this.diskNumGte = diskNumGte;
    }

    public LabelWhereInput diskNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_GTE);
        return this;
    }

    public LabelWhereInput diskNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_GTE);
        return this;
    }

    public void setDiskNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_GTE);
        }
    }

    public boolean getDiskNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_GTE);
    }

    public LabelWhereInput diskNumIn(List<Integer> diskNumIn) {

        this.diskNumIn = diskNumIn;
        return this;
    }

    public LabelWhereInput addDiskNumInItem(Integer diskNumInItem) {
        if (this.diskNumIn == null) {
            this.diskNumIn = new ArrayList<Integer>();
        }
        this.diskNumIn.add(diskNumInItem);
        return this;
    }

    /**
     * Get diskNumIn
     *
     * @return diskNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDiskNumIn() {
        return diskNumIn;
    }

    public void setDiskNumIn(List<Integer> diskNumIn) {
        this.diskNumIn = diskNumIn;
    }

    public LabelWhereInput diskNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_IN);
        return this;
    }

    public LabelWhereInput diskNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_IN);
        return this;
    }

    public void setDiskNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_IN);
        }
    }

    public boolean getDiskNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_IN);
    }

    public LabelWhereInput diskNumLt(Integer diskNumLt) {

        this.diskNumLt = diskNumLt;
        return this;
    }

    /**
     * Get diskNumLt
     *
     * @return diskNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNumLt() {
        return diskNumLt;
    }

    public void setDiskNumLt(Integer diskNumLt) {
        this.diskNumLt = diskNumLt;
    }

    public LabelWhereInput diskNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_LT);
        return this;
    }

    public LabelWhereInput diskNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_LT);
        return this;
    }

    public void setDiskNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_LT);
        }
    }

    public boolean getDiskNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_LT);
    }

    public LabelWhereInput diskNumLte(Integer diskNumLte) {

        this.diskNumLte = diskNumLte;
        return this;
    }

    /**
     * Get diskNumLte
     *
     * @return diskNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNumLte() {
        return diskNumLte;
    }

    public void setDiskNumLte(Integer diskNumLte) {
        this.diskNumLte = diskNumLte;
    }

    public LabelWhereInput diskNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_LTE);
        return this;
    }

    public LabelWhereInput diskNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_LTE);
        return this;
    }

    public void setDiskNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_LTE);
        }
    }

    public boolean getDiskNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_LTE);
    }

    public LabelWhereInput diskNumNot(Integer diskNumNot) {

        this.diskNumNot = diskNumNot;
        return this;
    }

    /**
     * Get diskNumNot
     *
     * @return diskNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDiskNumNot() {
        return diskNumNot;
    }

    public void setDiskNumNot(Integer diskNumNot) {
        this.diskNumNot = diskNumNot;
    }

    public LabelWhereInput diskNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_NOT);
        return this;
    }

    public LabelWhereInput diskNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_NOT);
        return this;
    }

    public void setDiskNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_NOT);
        }
    }

    public boolean getDiskNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_NOT);
    }

    public LabelWhereInput diskNumNotIn(List<Integer> diskNumNotIn) {

        this.diskNumNotIn = diskNumNotIn;
        return this;
    }

    public LabelWhereInput addDiskNumNotInItem(Integer diskNumNotInItem) {
        if (this.diskNumNotIn == null) {
            this.diskNumNotIn = new ArrayList<Integer>();
        }
        this.diskNumNotIn.add(diskNumNotInItem);
        return this;
    }

    /**
     * Get diskNumNotIn
     *
     * @return diskNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDiskNumNotIn() {
        return diskNumNotIn;
    }

    public void setDiskNumNotIn(List<Integer> diskNumNotIn) {
        this.diskNumNotIn = diskNumNotIn;
    }

    public LabelWhereInput diskNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput diskNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_NOT_IN);
        return this;
    }

    public void setDiskNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NUM_NOT_IN);
        }
    }

    public boolean getDiskNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NUM_NOT_IN);
    }

    public LabelWhereInput disksEvery(DiskWhereInput disksEvery) {

        this.disksEvery = disksEvery;
        return this;
    }

    /**
     * Get disksEvery
     *
     * @return disksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksEvery() {
        return disksEvery;
    }

    public void setDisksEvery(DiskWhereInput disksEvery) {
        this.disksEvery = disksEvery;
    }

    public LabelWhereInput disksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public LabelWhereInput disksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public void setDisksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        }
    }

    public boolean getDisksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_EVERY);
    }

    public LabelWhereInput disksNone(DiskWhereInput disksNone) {

        this.disksNone = disksNone;
        return this;
    }

    /**
     * Get disksNone
     *
     * @return disksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksNone() {
        return disksNone;
    }

    public void setDisksNone(DiskWhereInput disksNone) {
        this.disksNone = disksNone;
    }

    public LabelWhereInput disksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public LabelWhereInput disksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public void setDisksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        }
    }

    public boolean getDisksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_NONE);
    }

    public LabelWhereInput disksSome(DiskWhereInput disksSome) {

        this.disksSome = disksSome;
        return this;
    }

    /**
     * Get disksSome
     *
     * @return disksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksSome() {
        return disksSome;
    }

    public void setDisksSome(DiskWhereInput disksSome) {
        this.disksSome = disksSome;
    }

    public LabelWhereInput disksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public LabelWhereInput disksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public void setDisksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        }
    }

    public boolean getDisksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_SOME);
    }

    public LabelWhereInput elfImageNum(Integer elfImageNum) {

        this.elfImageNum = elfImageNum;
        return this;
    }

    /**
     * Get elfImageNum
     *
     * @return elfImageNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNum() {
        return elfImageNum;
    }

    public void setElfImageNum(Integer elfImageNum) {
        this.elfImageNum = elfImageNum;
    }

    public LabelWhereInput elfImageNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM);
        return this;
    }

    public LabelWhereInput elfImageNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM);
        return this;
    }

    public void setElfImageNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM);
        }
    }

    public boolean getElfImageNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM);
    }

    public LabelWhereInput elfImageNumGt(Integer elfImageNumGt) {

        this.elfImageNumGt = elfImageNumGt;
        return this;
    }

    /**
     * Get elfImageNumGt
     *
     * @return elfImageNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNumGt() {
        return elfImageNumGt;
    }

    public void setElfImageNumGt(Integer elfImageNumGt) {
        this.elfImageNumGt = elfImageNumGt;
    }

    public LabelWhereInput elfImageNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_GT);
        return this;
    }

    public LabelWhereInput elfImageNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_GT);
        return this;
    }

    public void setElfImageNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_GT);
        }
    }

    public boolean getElfImageNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_GT);
    }

    public LabelWhereInput elfImageNumGte(Integer elfImageNumGte) {

        this.elfImageNumGte = elfImageNumGte;
        return this;
    }

    /**
     * Get elfImageNumGte
     *
     * @return elfImageNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNumGte() {
        return elfImageNumGte;
    }

    public void setElfImageNumGte(Integer elfImageNumGte) {
        this.elfImageNumGte = elfImageNumGte;
    }

    public LabelWhereInput elfImageNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE);
        return this;
    }

    public LabelWhereInput elfImageNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE);
        return this;
    }

    public void setElfImageNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE);
        }
    }

    public boolean getElfImageNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE);
    }

    public LabelWhereInput elfImageNumIn(List<Integer> elfImageNumIn) {

        this.elfImageNumIn = elfImageNumIn;
        return this;
    }

    public LabelWhereInput addElfImageNumInItem(Integer elfImageNumInItem) {
        if (this.elfImageNumIn == null) {
            this.elfImageNumIn = new ArrayList<Integer>();
        }
        this.elfImageNumIn.add(elfImageNumInItem);
        return this;
    }

    /**
     * Get elfImageNumIn
     *
     * @return elfImageNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfImageNumIn() {
        return elfImageNumIn;
    }

    public void setElfImageNumIn(List<Integer> elfImageNumIn) {
        this.elfImageNumIn = elfImageNumIn;
    }

    public LabelWhereInput elfImageNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_IN);
        return this;
    }

    public LabelWhereInput elfImageNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_IN);
        return this;
    }

    public void setElfImageNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_IN);
        }
    }

    public boolean getElfImageNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_IN);
    }

    public LabelWhereInput elfImageNumLt(Integer elfImageNumLt) {

        this.elfImageNumLt = elfImageNumLt;
        return this;
    }

    /**
     * Get elfImageNumLt
     *
     * @return elfImageNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNumLt() {
        return elfImageNumLt;
    }

    public void setElfImageNumLt(Integer elfImageNumLt) {
        this.elfImageNumLt = elfImageNumLt;
    }

    public LabelWhereInput elfImageNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_LT);
        return this;
    }

    public LabelWhereInput elfImageNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_LT);
        return this;
    }

    public void setElfImageNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_LT);
        }
    }

    public boolean getElfImageNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_LT);
    }

    public LabelWhereInput elfImageNumLte(Integer elfImageNumLte) {

        this.elfImageNumLte = elfImageNumLte;
        return this;
    }

    /**
     * Get elfImageNumLte
     *
     * @return elfImageNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNumLte() {
        return elfImageNumLte;
    }

    public void setElfImageNumLte(Integer elfImageNumLte) {
        this.elfImageNumLte = elfImageNumLte;
    }

    public LabelWhereInput elfImageNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE);
        return this;
    }

    public LabelWhereInput elfImageNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE);
        return this;
    }

    public void setElfImageNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE);
        }
    }

    public boolean getElfImageNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE);
    }

    public LabelWhereInput elfImageNumNot(Integer elfImageNumNot) {

        this.elfImageNumNot = elfImageNumNot;
        return this;
    }

    /**
     * Get elfImageNumNot
     *
     * @return elfImageNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfImageNumNot() {
        return elfImageNumNot;
    }

    public void setElfImageNumNot(Integer elfImageNumNot) {
        this.elfImageNumNot = elfImageNumNot;
    }

    public LabelWhereInput elfImageNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT);
        return this;
    }

    public LabelWhereInput elfImageNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT);
        return this;
    }

    public void setElfImageNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT);
        }
    }

    public boolean getElfImageNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT);
    }

    public LabelWhereInput elfImageNumNotIn(List<Integer> elfImageNumNotIn) {

        this.elfImageNumNotIn = elfImageNumNotIn;
        return this;
    }

    public LabelWhereInput addElfImageNumNotInItem(Integer elfImageNumNotInItem) {
        if (this.elfImageNumNotIn == null) {
            this.elfImageNumNotIn = new ArrayList<Integer>();
        }
        this.elfImageNumNotIn.add(elfImageNumNotInItem);
        return this;
    }

    /**
     * Get elfImageNumNotIn
     *
     * @return elfImageNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfImageNumNotIn() {
        return elfImageNumNotIn;
    }

    public void setElfImageNumNotIn(List<Integer> elfImageNumNotIn) {
        this.elfImageNumNotIn = elfImageNumNotIn;
    }

    public LabelWhereInput elfImageNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput elfImageNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN);
        return this;
    }

    public void setElfImageNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN);
        }
    }

    public boolean getElfImageNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN);
    }

    public LabelWhereInput elfImagesEvery(ElfImageWhereInput elfImagesEvery) {

        this.elfImagesEvery = elfImagesEvery;
        return this;
    }

    /**
     * Get elfImagesEvery
     *
     * @return elfImagesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfImageWhereInput getElfImagesEvery() {
        return elfImagesEvery;
    }

    public void setElfImagesEvery(ElfImageWhereInput elfImagesEvery) {
        this.elfImagesEvery = elfImagesEvery;
    }

    public LabelWhereInput elfImagesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_EVERY);
        return this;
    }

    public LabelWhereInput elfImagesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_EVERY);
        return this;
    }

    public void setElfImagesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_EVERY);
        }
    }

    public boolean getElfImagesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGES_EVERY);
    }

    public LabelWhereInput elfImagesNone(ElfImageWhereInput elfImagesNone) {

        this.elfImagesNone = elfImagesNone;
        return this;
    }

    /**
     * Get elfImagesNone
     *
     * @return elfImagesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfImageWhereInput getElfImagesNone() {
        return elfImagesNone;
    }

    public void setElfImagesNone(ElfImageWhereInput elfImagesNone) {
        this.elfImagesNone = elfImagesNone;
    }

    public LabelWhereInput elfImagesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_NONE);
        return this;
    }

    public LabelWhereInput elfImagesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_NONE);
        return this;
    }

    public void setElfImagesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_NONE);
        }
    }

    public boolean getElfImagesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGES_NONE);
    }

    public LabelWhereInput elfImagesSome(ElfImageWhereInput elfImagesSome) {

        this.elfImagesSome = elfImagesSome;
        return this;
    }

    /**
     * Get elfImagesSome
     *
     * @return elfImagesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfImageWhereInput getElfImagesSome() {
        return elfImagesSome;
    }

    public void setElfImagesSome(ElfImageWhereInput elfImagesSome) {
        this.elfImagesSome = elfImagesSome;
    }

    public LabelWhereInput elfImagesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_SOME);
        return this;
    }

    public LabelWhereInput elfImagesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_SOME);
        return this;
    }

    public void setElfImagesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES_SOME);
        }
    }

    public boolean getElfImagesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGES_SOME);
    }

    public LabelWhereInput gpuDeviceNum(Integer gpuDeviceNum) {

        this.gpuDeviceNum = gpuDeviceNum;
        return this;
    }

    /**
     * Get gpuDeviceNum
     *
     * @return gpuDeviceNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNum() {
        return gpuDeviceNum;
    }

    public void setGpuDeviceNum(Integer gpuDeviceNum) {
        this.gpuDeviceNum = gpuDeviceNum;
    }

    public LabelWhereInput gpuDeviceNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM);
        return this;
    }

    public LabelWhereInput gpuDeviceNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM);
        return this;
    }

    public void setGpuDeviceNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM);
        }
    }

    public boolean getGpuDeviceNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM);
    }

    public LabelWhereInput gpuDeviceNumGt(Integer gpuDeviceNumGt) {

        this.gpuDeviceNumGt = gpuDeviceNumGt;
        return this;
    }

    /**
     * Get gpuDeviceNumGt
     *
     * @return gpuDeviceNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNumGt() {
        return gpuDeviceNumGt;
    }

    public void setGpuDeviceNumGt(Integer gpuDeviceNumGt) {
        this.gpuDeviceNumGt = gpuDeviceNumGt;
    }

    public LabelWhereInput gpuDeviceNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_GT);
        return this;
    }

    public LabelWhereInput gpuDeviceNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_GT);
        return this;
    }

    public void setGpuDeviceNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_GT);
        }
    }

    public boolean getGpuDeviceNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_GT);
    }

    public LabelWhereInput gpuDeviceNumGte(Integer gpuDeviceNumGte) {

        this.gpuDeviceNumGte = gpuDeviceNumGte;
        return this;
    }

    /**
     * Get gpuDeviceNumGte
     *
     * @return gpuDeviceNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNumGte() {
        return gpuDeviceNumGte;
    }

    public void setGpuDeviceNumGte(Integer gpuDeviceNumGte) {
        this.gpuDeviceNumGte = gpuDeviceNumGte;
    }

    public LabelWhereInput gpuDeviceNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE);
        return this;
    }

    public LabelWhereInput gpuDeviceNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE);
        return this;
    }

    public void setGpuDeviceNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE);
        }
    }

    public boolean getGpuDeviceNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE);
    }

    public LabelWhereInput gpuDeviceNumIn(List<Integer> gpuDeviceNumIn) {

        this.gpuDeviceNumIn = gpuDeviceNumIn;
        return this;
    }

    public LabelWhereInput addGpuDeviceNumInItem(Integer gpuDeviceNumInItem) {
        if (this.gpuDeviceNumIn == null) {
            this.gpuDeviceNumIn = new ArrayList<Integer>();
        }
        this.gpuDeviceNumIn.add(gpuDeviceNumInItem);
        return this;
    }

    /**
     * Get gpuDeviceNumIn
     *
     * @return gpuDeviceNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getGpuDeviceNumIn() {
        return gpuDeviceNumIn;
    }

    public void setGpuDeviceNumIn(List<Integer> gpuDeviceNumIn) {
        this.gpuDeviceNumIn = gpuDeviceNumIn;
    }

    public LabelWhereInput gpuDeviceNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_IN);
        return this;
    }

    public LabelWhereInput gpuDeviceNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_IN);
        return this;
    }

    public void setGpuDeviceNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_IN);
        }
    }

    public boolean getGpuDeviceNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_IN);
    }

    public LabelWhereInput gpuDeviceNumLt(Integer gpuDeviceNumLt) {

        this.gpuDeviceNumLt = gpuDeviceNumLt;
        return this;
    }

    /**
     * Get gpuDeviceNumLt
     *
     * @return gpuDeviceNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNumLt() {
        return gpuDeviceNumLt;
    }

    public void setGpuDeviceNumLt(Integer gpuDeviceNumLt) {
        this.gpuDeviceNumLt = gpuDeviceNumLt;
    }

    public LabelWhereInput gpuDeviceNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_LT);
        return this;
    }

    public LabelWhereInput gpuDeviceNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_LT);
        return this;
    }

    public void setGpuDeviceNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_LT);
        }
    }

    public boolean getGpuDeviceNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_LT);
    }

    public LabelWhereInput gpuDeviceNumLte(Integer gpuDeviceNumLte) {

        this.gpuDeviceNumLte = gpuDeviceNumLte;
        return this;
    }

    /**
     * Get gpuDeviceNumLte
     *
     * @return gpuDeviceNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNumLte() {
        return gpuDeviceNumLte;
    }

    public void setGpuDeviceNumLte(Integer gpuDeviceNumLte) {
        this.gpuDeviceNumLte = gpuDeviceNumLte;
    }

    public LabelWhereInput gpuDeviceNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE);
        return this;
    }

    public LabelWhereInput gpuDeviceNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE);
        return this;
    }

    public void setGpuDeviceNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE);
        }
    }

    public boolean getGpuDeviceNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE);
    }

    public LabelWhereInput gpuDeviceNumNot(Integer gpuDeviceNumNot) {

        this.gpuDeviceNumNot = gpuDeviceNumNot;
        return this;
    }

    /**
     * Get gpuDeviceNumNot
     *
     * @return gpuDeviceNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getGpuDeviceNumNot() {
        return gpuDeviceNumNot;
    }

    public void setGpuDeviceNumNot(Integer gpuDeviceNumNot) {
        this.gpuDeviceNumNot = gpuDeviceNumNot;
    }

    public LabelWhereInput gpuDeviceNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT);
        return this;
    }

    public LabelWhereInput gpuDeviceNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT);
        return this;
    }

    public void setGpuDeviceNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT);
        }
    }

    public boolean getGpuDeviceNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT);
    }

    public LabelWhereInput gpuDeviceNumNotIn(List<Integer> gpuDeviceNumNotIn) {

        this.gpuDeviceNumNotIn = gpuDeviceNumNotIn;
        return this;
    }

    public LabelWhereInput addGpuDeviceNumNotInItem(Integer gpuDeviceNumNotInItem) {
        if (this.gpuDeviceNumNotIn == null) {
            this.gpuDeviceNumNotIn = new ArrayList<Integer>();
        }
        this.gpuDeviceNumNotIn.add(gpuDeviceNumNotInItem);
        return this;
    }

    /**
     * Get gpuDeviceNumNotIn
     *
     * @return gpuDeviceNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getGpuDeviceNumNotIn() {
        return gpuDeviceNumNotIn;
    }

    public void setGpuDeviceNumNotIn(List<Integer> gpuDeviceNumNotIn) {
        this.gpuDeviceNumNotIn = gpuDeviceNumNotIn;
    }

    public LabelWhereInput gpuDeviceNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput gpuDeviceNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN);
        return this;
    }

    public void setGpuDeviceNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN);
        }
    }

    public boolean getGpuDeviceNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN);
    }

    public LabelWhereInput gpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {

        this.gpuDevicesEvery = gpuDevicesEvery;
        return this;
    }

    /**
     * Get gpuDevicesEvery
     *
     * @return gpuDevicesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GpuDeviceWhereInput getGpuDevicesEvery() {
        return gpuDevicesEvery;
    }

    public void setGpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
        this.gpuDevicesEvery = gpuDevicesEvery;
    }

    public LabelWhereInput gpuDevicesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_EVERY);
        return this;
    }

    public LabelWhereInput gpuDevicesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_EVERY);
        return this;
    }

    public void setGpuDevicesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_EVERY);
        }
    }

    public boolean getGpuDevicesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES_EVERY);
    }

    public LabelWhereInput gpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {

        this.gpuDevicesNone = gpuDevicesNone;
        return this;
    }

    /**
     * Get gpuDevicesNone
     *
     * @return gpuDevicesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GpuDeviceWhereInput getGpuDevicesNone() {
        return gpuDevicesNone;
    }

    public void setGpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
        this.gpuDevicesNone = gpuDevicesNone;
    }

    public LabelWhereInput gpuDevicesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_NONE);
        return this;
    }

    public LabelWhereInput gpuDevicesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_NONE);
        return this;
    }

    public void setGpuDevicesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_NONE);
        }
    }

    public boolean getGpuDevicesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES_NONE);
    }

    public LabelWhereInput gpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {

        this.gpuDevicesSome = gpuDevicesSome;
        return this;
    }

    /**
     * Get gpuDevicesSome
     *
     * @return gpuDevicesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GpuDeviceWhereInput getGpuDevicesSome() {
        return gpuDevicesSome;
    }

    public void setGpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
        this.gpuDevicesSome = gpuDevicesSome;
    }

    public LabelWhereInput gpuDevicesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_SOME);
        return this;
    }

    public LabelWhereInput gpuDevicesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_SOME);
        return this;
    }

    public void setGpuDevicesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES_SOME);
        }
    }

    public boolean getGpuDevicesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES_SOME);
    }

    public LabelWhereInput hostNum(Integer hostNum) {

        this.hostNum = hostNum;
        return this;
    }

    /**
     * Get hostNum
     *
     * @return hostNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public LabelWhereInput hostNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public LabelWhereInput hostNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public void setHostNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        }
    }

    public boolean getHostNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM);
    }

    public LabelWhereInput hostNumGt(Integer hostNumGt) {

        this.hostNumGt = hostNumGt;
        return this;
    }

    /**
     * Get hostNumGt
     *
     * @return hostNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGt() {
        return hostNumGt;
    }

    public void setHostNumGt(Integer hostNumGt) {
        this.hostNumGt = hostNumGt;
    }

    public LabelWhereInput hostNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public LabelWhereInput hostNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public void setHostNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        }
    }

    public boolean getHostNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GT);
    }

    public LabelWhereInput hostNumGte(Integer hostNumGte) {

        this.hostNumGte = hostNumGte;
        return this;
    }

    /**
     * Get hostNumGte
     *
     * @return hostNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGte() {
        return hostNumGte;
    }

    public void setHostNumGte(Integer hostNumGte) {
        this.hostNumGte = hostNumGte;
    }

    public LabelWhereInput hostNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public LabelWhereInput hostNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public void setHostNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        }
    }

    public boolean getHostNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GTE);
    }

    public LabelWhereInput hostNumIn(List<Integer> hostNumIn) {

        this.hostNumIn = hostNumIn;
        return this;
    }

    public LabelWhereInput addHostNumInItem(Integer hostNumInItem) {
        if (this.hostNumIn == null) {
            this.hostNumIn = new ArrayList<Integer>();
        }
        this.hostNumIn.add(hostNumInItem);
        return this;
    }

    /**
     * Get hostNumIn
     *
     * @return hostNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumIn() {
        return hostNumIn;
    }

    public void setHostNumIn(List<Integer> hostNumIn) {
        this.hostNumIn = hostNumIn;
    }

    public LabelWhereInput hostNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public LabelWhereInput hostNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public void setHostNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        }
    }

    public boolean getHostNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_IN);
    }

    public LabelWhereInput hostNumLt(Integer hostNumLt) {

        this.hostNumLt = hostNumLt;
        return this;
    }

    /**
     * Get hostNumLt
     *
     * @return hostNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLt() {
        return hostNumLt;
    }

    public void setHostNumLt(Integer hostNumLt) {
        this.hostNumLt = hostNumLt;
    }

    public LabelWhereInput hostNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public LabelWhereInput hostNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public void setHostNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        }
    }

    public boolean getHostNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LT);
    }

    public LabelWhereInput hostNumLte(Integer hostNumLte) {

        this.hostNumLte = hostNumLte;
        return this;
    }

    /**
     * Get hostNumLte
     *
     * @return hostNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLte() {
        return hostNumLte;
    }

    public void setHostNumLte(Integer hostNumLte) {
        this.hostNumLte = hostNumLte;
    }

    public LabelWhereInput hostNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public LabelWhereInput hostNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public void setHostNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        }
    }

    public boolean getHostNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LTE);
    }

    public LabelWhereInput hostNumNot(Integer hostNumNot) {

        this.hostNumNot = hostNumNot;
        return this;
    }

    /**
     * Get hostNumNot
     *
     * @return hostNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumNot() {
        return hostNumNot;
    }

    public void setHostNumNot(Integer hostNumNot) {
        this.hostNumNot = hostNumNot;
    }

    public LabelWhereInput hostNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public LabelWhereInput hostNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public void setHostNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        }
    }

    public boolean getHostNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT);
    }

    public LabelWhereInput hostNumNotIn(List<Integer> hostNumNotIn) {

        this.hostNumNotIn = hostNumNotIn;
        return this;
    }

    public LabelWhereInput addHostNumNotInItem(Integer hostNumNotInItem) {
        if (this.hostNumNotIn == null) {
            this.hostNumNotIn = new ArrayList<Integer>();
        }
        this.hostNumNotIn.add(hostNumNotInItem);
        return this;
    }

    /**
     * Get hostNumNotIn
     *
     * @return hostNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumNotIn() {
        return hostNumNotIn;
    }

    public void setHostNumNotIn(List<Integer> hostNumNotIn) {
        this.hostNumNotIn = hostNumNotIn;
    }

    public LabelWhereInput hostNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput hostNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public void setHostNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        }
    }

    public boolean getHostNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT_IN);
    }

    public LabelWhereInput hostsEvery(HostWhereInput hostsEvery) {

        this.hostsEvery = hostsEvery;
        return this;
    }

    /**
     * Get hostsEvery
     *
     * @return hostsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsEvery() {
        return hostsEvery;
    }

    public void setHostsEvery(HostWhereInput hostsEvery) {
        this.hostsEvery = hostsEvery;
    }

    public LabelWhereInput hostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public LabelWhereInput hostsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public void setHostsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        }
    }

    public boolean getHostsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_EVERY);
    }

    public LabelWhereInput hostsNone(HostWhereInput hostsNone) {

        this.hostsNone = hostsNone;
        return this;
    }

    /**
     * Get hostsNone
     *
     * @return hostsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsNone() {
        return hostsNone;
    }

    public void setHostsNone(HostWhereInput hostsNone) {
        this.hostsNone = hostsNone;
    }

    public LabelWhereInput hostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public LabelWhereInput hostsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public void setHostsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        }
    }

    public boolean getHostsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_NONE);
    }

    public LabelWhereInput hostsSome(HostWhereInput hostsSome) {

        this.hostsSome = hostsSome;
        return this;
    }

    /**
     * Get hostsSome
     *
     * @return hostsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsSome() {
        return hostsSome;
    }

    public void setHostsSome(HostWhereInput hostsSome) {
        this.hostsSome = hostsSome;
    }

    public LabelWhereInput hostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public LabelWhereInput hostsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public void setHostsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        }
    }

    public boolean getHostsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_SOME);
    }

    public LabelWhereInput id(String id) {

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

    public LabelWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public LabelWhereInput id_ExplictlyNonNull() {
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

    public LabelWhereInput idContains(String idContains) {

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

    public LabelWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public LabelWhereInput idContains_ExplictlyNonNull() {
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

    public LabelWhereInput idEndsWith(String idEndsWith) {

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

    public LabelWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public LabelWhereInput idEndsWith_ExplictlyNonNull() {
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

    public LabelWhereInput idGt(String idGt) {

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

    public LabelWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public LabelWhereInput idGt_ExplictlyNonNull() {
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

    public LabelWhereInput idGte(String idGte) {

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

    public LabelWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public LabelWhereInput idGte_ExplictlyNonNull() {
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

    public LabelWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public LabelWhereInput addIdInItem(String idInItem) {
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

    public LabelWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public LabelWhereInput idIn_ExplictlyNonNull() {
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

    public LabelWhereInput idLt(String idLt) {

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

    public LabelWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public LabelWhereInput idLt_ExplictlyNonNull() {
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

    public LabelWhereInput idLte(String idLte) {

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

    public LabelWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public LabelWhereInput idLte_ExplictlyNonNull() {
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

    public LabelWhereInput idNot(String idNot) {

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

    public LabelWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public LabelWhereInput idNot_ExplictlyNonNull() {
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

    public LabelWhereInput idNotContains(String idNotContains) {

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

    public LabelWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public LabelWhereInput idNotContains_ExplictlyNonNull() {
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

    public LabelWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public LabelWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public LabelWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public LabelWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public LabelWhereInput addIdNotInItem(String idNotInItem) {
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

    public LabelWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public LabelWhereInput idNotIn_ExplictlyNonNull() {
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

    public LabelWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public LabelWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public LabelWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public LabelWhereInput idStartsWith(String idStartsWith) {

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

    public LabelWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public LabelWhereInput idStartsWith_ExplictlyNonNull() {
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

    public LabelWhereInput iscsiLunNum(Integer iscsiLunNum) {

        this.iscsiLunNum = iscsiLunNum;
        return this;
    }

    /**
     * Get iscsiLunNum
     *
     * @return iscsiLunNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNum() {
        return iscsiLunNum;
    }

    public void setIscsiLunNum(Integer iscsiLunNum) {
        this.iscsiLunNum = iscsiLunNum;
    }

    public LabelWhereInput iscsiLunNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM);
        return this;
    }

    public LabelWhereInput iscsiLunNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM);
        return this;
    }

    public void setIscsiLunNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM);
        }
    }

    public boolean getIscsiLunNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM);
    }

    public LabelWhereInput iscsiLunNumGt(Integer iscsiLunNumGt) {

        this.iscsiLunNumGt = iscsiLunNumGt;
        return this;
    }

    /**
     * Get iscsiLunNumGt
     *
     * @return iscsiLunNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNumGt() {
        return iscsiLunNumGt;
    }

    public void setIscsiLunNumGt(Integer iscsiLunNumGt) {
        this.iscsiLunNumGt = iscsiLunNumGt;
    }

    public LabelWhereInput iscsiLunNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_GT);
        return this;
    }

    public LabelWhereInput iscsiLunNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_GT);
        return this;
    }

    public void setIscsiLunNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_GT);
        }
    }

    public boolean getIscsiLunNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_GT);
    }

    public LabelWhereInput iscsiLunNumGte(Integer iscsiLunNumGte) {

        this.iscsiLunNumGte = iscsiLunNumGte;
        return this;
    }

    /**
     * Get iscsiLunNumGte
     *
     * @return iscsiLunNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNumGte() {
        return iscsiLunNumGte;
    }

    public void setIscsiLunNumGte(Integer iscsiLunNumGte) {
        this.iscsiLunNumGte = iscsiLunNumGte;
    }

    public LabelWhereInput iscsiLunNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE);
        return this;
    }

    public LabelWhereInput iscsiLunNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE);
        return this;
    }

    public void setIscsiLunNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE);
        }
    }

    public boolean getIscsiLunNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE);
    }

    public LabelWhereInput iscsiLunNumIn(List<Integer> iscsiLunNumIn) {

        this.iscsiLunNumIn = iscsiLunNumIn;
        return this;
    }

    public LabelWhereInput addIscsiLunNumInItem(Integer iscsiLunNumInItem) {
        if (this.iscsiLunNumIn == null) {
            this.iscsiLunNumIn = new ArrayList<Integer>();
        }
        this.iscsiLunNumIn.add(iscsiLunNumInItem);
        return this;
    }

    /**
     * Get iscsiLunNumIn
     *
     * @return iscsiLunNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiLunNumIn() {
        return iscsiLunNumIn;
    }

    public void setIscsiLunNumIn(List<Integer> iscsiLunNumIn) {
        this.iscsiLunNumIn = iscsiLunNumIn;
    }

    public LabelWhereInput iscsiLunNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_IN);
        return this;
    }

    public LabelWhereInput iscsiLunNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_IN);
        return this;
    }

    public void setIscsiLunNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_IN);
        }
    }

    public boolean getIscsiLunNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_IN);
    }

    public LabelWhereInput iscsiLunNumLt(Integer iscsiLunNumLt) {

        this.iscsiLunNumLt = iscsiLunNumLt;
        return this;
    }

    /**
     * Get iscsiLunNumLt
     *
     * @return iscsiLunNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNumLt() {
        return iscsiLunNumLt;
    }

    public void setIscsiLunNumLt(Integer iscsiLunNumLt) {
        this.iscsiLunNumLt = iscsiLunNumLt;
    }

    public LabelWhereInput iscsiLunNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_LT);
        return this;
    }

    public LabelWhereInput iscsiLunNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_LT);
        return this;
    }

    public void setIscsiLunNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_LT);
        }
    }

    public boolean getIscsiLunNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_LT);
    }

    public LabelWhereInput iscsiLunNumLte(Integer iscsiLunNumLte) {

        this.iscsiLunNumLte = iscsiLunNumLte;
        return this;
    }

    /**
     * Get iscsiLunNumLte
     *
     * @return iscsiLunNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNumLte() {
        return iscsiLunNumLte;
    }

    public void setIscsiLunNumLte(Integer iscsiLunNumLte) {
        this.iscsiLunNumLte = iscsiLunNumLte;
    }

    public LabelWhereInput iscsiLunNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE);
        return this;
    }

    public LabelWhereInput iscsiLunNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE);
        return this;
    }

    public void setIscsiLunNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE);
        }
    }

    public boolean getIscsiLunNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE);
    }

    public LabelWhereInput iscsiLunNumNot(Integer iscsiLunNumNot) {

        this.iscsiLunNumNot = iscsiLunNumNot;
        return this;
    }

    /**
     * Get iscsiLunNumNot
     *
     * @return iscsiLunNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunNumNot() {
        return iscsiLunNumNot;
    }

    public void setIscsiLunNumNot(Integer iscsiLunNumNot) {
        this.iscsiLunNumNot = iscsiLunNumNot;
    }

    public LabelWhereInput iscsiLunNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT);
        return this;
    }

    public LabelWhereInput iscsiLunNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT);
        return this;
    }

    public void setIscsiLunNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT);
        }
    }

    public boolean getIscsiLunNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT);
    }

    public LabelWhereInput iscsiLunNumNotIn(List<Integer> iscsiLunNumNotIn) {

        this.iscsiLunNumNotIn = iscsiLunNumNotIn;
        return this;
    }

    public LabelWhereInput addIscsiLunNumNotInItem(Integer iscsiLunNumNotInItem) {
        if (this.iscsiLunNumNotIn == null) {
            this.iscsiLunNumNotIn = new ArrayList<Integer>();
        }
        this.iscsiLunNumNotIn.add(iscsiLunNumNotInItem);
        return this;
    }

    /**
     * Get iscsiLunNumNotIn
     *
     * @return iscsiLunNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiLunNumNotIn() {
        return iscsiLunNumNotIn;
    }

    public void setIscsiLunNumNotIn(List<Integer> iscsiLunNumNotIn) {
        this.iscsiLunNumNotIn = iscsiLunNumNotIn;
    }

    public LabelWhereInput iscsiLunNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput iscsiLunNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN);
        return this;
    }

    public void setIscsiLunNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN);
        }
    }

    public boolean getIscsiLunNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN);
    }

    public LabelWhereInput iscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {

        this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNum
     *
     * @return iscsiLunSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNum() {
        return iscsiLunSnapshotNum;
    }

    public void setIscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
        this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
    }

    public LabelWhereInput iscsiLunSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM);
        return this;
    }

    public void setIscsiLunSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM);
        }
    }

    public boolean getIscsiLunSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM);
    }

    public LabelWhereInput iscsiLunSnapshotNumGt(Integer iscsiLunSnapshotNumGt) {

        this.iscsiLunSnapshotNumGt = iscsiLunSnapshotNumGt;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumGt
     *
     * @return iscsiLunSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNumGt() {
        return iscsiLunSnapshotNumGt;
    }

    public void setIscsiLunSnapshotNumGt(Integer iscsiLunSnapshotNumGt) {
        this.iscsiLunSnapshotNumGt = iscsiLunSnapshotNumGt;
    }

    public LabelWhereInput iscsiLunSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setIscsiLunSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getIscsiLunSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT);
    }

    public LabelWhereInput iscsiLunSnapshotNumGte(Integer iscsiLunSnapshotNumGte) {

        this.iscsiLunSnapshotNumGte = iscsiLunSnapshotNumGte;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumGte
     *
     * @return iscsiLunSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNumGte() {
        return iscsiLunSnapshotNumGte;
    }

    public void setIscsiLunSnapshotNumGte(Integer iscsiLunSnapshotNumGte) {
        this.iscsiLunSnapshotNumGte = iscsiLunSnapshotNumGte;
    }

    public LabelWhereInput iscsiLunSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setIscsiLunSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getIscsiLunSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE);
    }

    public LabelWhereInput iscsiLunSnapshotNumIn(List<Integer> iscsiLunSnapshotNumIn) {

        this.iscsiLunSnapshotNumIn = iscsiLunSnapshotNumIn;
        return this;
    }

    public LabelWhereInput addIscsiLunSnapshotNumInItem(Integer iscsiLunSnapshotNumInItem) {
        if (this.iscsiLunSnapshotNumIn == null) {
            this.iscsiLunSnapshotNumIn = new ArrayList<Integer>();
        }
        this.iscsiLunSnapshotNumIn.add(iscsiLunSnapshotNumInItem);
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumIn
     *
     * @return iscsiLunSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiLunSnapshotNumIn() {
        return iscsiLunSnapshotNumIn;
    }

    public void setIscsiLunSnapshotNumIn(List<Integer> iscsiLunSnapshotNumIn) {
        this.iscsiLunSnapshotNumIn = iscsiLunSnapshotNumIn;
    }

    public LabelWhereInput iscsiLunSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setIscsiLunSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getIscsiLunSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN);
    }

    public LabelWhereInput iscsiLunSnapshotNumLt(Integer iscsiLunSnapshotNumLt) {

        this.iscsiLunSnapshotNumLt = iscsiLunSnapshotNumLt;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumLt
     *
     * @return iscsiLunSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNumLt() {
        return iscsiLunSnapshotNumLt;
    }

    public void setIscsiLunSnapshotNumLt(Integer iscsiLunSnapshotNumLt) {
        this.iscsiLunSnapshotNumLt = iscsiLunSnapshotNumLt;
    }

    public LabelWhereInput iscsiLunSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setIscsiLunSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getIscsiLunSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT);
    }

    public LabelWhereInput iscsiLunSnapshotNumLte(Integer iscsiLunSnapshotNumLte) {

        this.iscsiLunSnapshotNumLte = iscsiLunSnapshotNumLte;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumLte
     *
     * @return iscsiLunSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNumLte() {
        return iscsiLunSnapshotNumLte;
    }

    public void setIscsiLunSnapshotNumLte(Integer iscsiLunSnapshotNumLte) {
        this.iscsiLunSnapshotNumLte = iscsiLunSnapshotNumLte;
    }

    public LabelWhereInput iscsiLunSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setIscsiLunSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getIscsiLunSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE);
    }

    public LabelWhereInput iscsiLunSnapshotNumNot(Integer iscsiLunSnapshotNumNot) {

        this.iscsiLunSnapshotNumNot = iscsiLunSnapshotNumNot;
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumNot
     *
     * @return iscsiLunSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiLunSnapshotNumNot() {
        return iscsiLunSnapshotNumNot;
    }

    public void setIscsiLunSnapshotNumNot(Integer iscsiLunSnapshotNumNot) {
        this.iscsiLunSnapshotNumNot = iscsiLunSnapshotNumNot;
    }

    public LabelWhereInput iscsiLunSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setIscsiLunSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getIscsiLunSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT);
    }

    public LabelWhereInput iscsiLunSnapshotNumNotIn(List<Integer> iscsiLunSnapshotNumNotIn) {

        this.iscsiLunSnapshotNumNotIn = iscsiLunSnapshotNumNotIn;
        return this;
    }

    public LabelWhereInput addIscsiLunSnapshotNumNotInItem(Integer iscsiLunSnapshotNumNotInItem) {
        if (this.iscsiLunSnapshotNumNotIn == null) {
            this.iscsiLunSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.iscsiLunSnapshotNumNotIn.add(iscsiLunSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get iscsiLunSnapshotNumNotIn
     *
     * @return iscsiLunSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiLunSnapshotNumNotIn() {
        return iscsiLunSnapshotNumNotIn;
    }

    public void setIscsiLunSnapshotNumNotIn(List<Integer> iscsiLunSnapshotNumNotIn) {
        this.iscsiLunSnapshotNumNotIn = iscsiLunSnapshotNumNotIn;
    }

    public LabelWhereInput iscsiLunSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setIscsiLunSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getIscsiLunSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN);
    }

    public LabelWhereInput iscsiLunSnapshotsEvery(
            IscsiLunSnapshotWhereInput iscsiLunSnapshotsEvery) {

        this.iscsiLunSnapshotsEvery = iscsiLunSnapshotsEvery;
        return this;
    }

    /**
     * Get iscsiLunSnapshotsEvery
     *
     * @return iscsiLunSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunSnapshotWhereInput getIscsiLunSnapshotsEvery() {
        return iscsiLunSnapshotsEvery;
    }

    public void setIscsiLunSnapshotsEvery(IscsiLunSnapshotWhereInput iscsiLunSnapshotsEvery) {
        this.iscsiLunSnapshotsEvery = iscsiLunSnapshotsEvery;
    }

    public LabelWhereInput iscsiLunSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY);
        return this;
    }

    public void setIscsiLunSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY);
        }
    }

    public boolean getIscsiLunSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_EVERY);
    }

    public LabelWhereInput iscsiLunSnapshotsNone(IscsiLunSnapshotWhereInput iscsiLunSnapshotsNone) {

        this.iscsiLunSnapshotsNone = iscsiLunSnapshotsNone;
        return this;
    }

    /**
     * Get iscsiLunSnapshotsNone
     *
     * @return iscsiLunSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunSnapshotWhereInput getIscsiLunSnapshotsNone() {
        return iscsiLunSnapshotsNone;
    }

    public void setIscsiLunSnapshotsNone(IscsiLunSnapshotWhereInput iscsiLunSnapshotsNone) {
        this.iscsiLunSnapshotsNone = iscsiLunSnapshotsNone;
    }

    public LabelWhereInput iscsiLunSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE);
        return this;
    }

    public void setIscsiLunSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE);
        }
    }

    public boolean getIscsiLunSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_NONE);
    }

    public LabelWhereInput iscsiLunSnapshotsSome(IscsiLunSnapshotWhereInput iscsiLunSnapshotsSome) {

        this.iscsiLunSnapshotsSome = iscsiLunSnapshotsSome;
        return this;
    }

    /**
     * Get iscsiLunSnapshotsSome
     *
     * @return iscsiLunSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunSnapshotWhereInput getIscsiLunSnapshotsSome() {
        return iscsiLunSnapshotsSome;
    }

    public void setIscsiLunSnapshotsSome(IscsiLunSnapshotWhereInput iscsiLunSnapshotsSome) {
        this.iscsiLunSnapshotsSome = iscsiLunSnapshotsSome;
    }

    public LabelWhereInput iscsiLunSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME);
        return this;
    }

    public LabelWhereInput iscsiLunSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME);
        return this;
    }

    public void setIscsiLunSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME);
        }
    }

    public boolean getIscsiLunSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS_SOME);
    }

    public LabelWhereInput iscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {

        this.iscsiLunsEvery = iscsiLunsEvery;
        return this;
    }

    /**
     * Get iscsiLunsEvery
     *
     * @return iscsiLunsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsEvery() {
        return iscsiLunsEvery;
    }

    public void setIscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
        this.iscsiLunsEvery = iscsiLunsEvery;
    }

    public LabelWhereInput iscsiLunsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        return this;
    }

    public LabelWhereInput iscsiLunsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        return this;
    }

    public void setIscsiLunsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        }
    }

    public boolean getIscsiLunsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
    }

    public LabelWhereInput iscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {

        this.iscsiLunsNone = iscsiLunsNone;
        return this;
    }

    /**
     * Get iscsiLunsNone
     *
     * @return iscsiLunsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsNone() {
        return iscsiLunsNone;
    }

    public void setIscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
        this.iscsiLunsNone = iscsiLunsNone;
    }

    public LabelWhereInput iscsiLunsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        return this;
    }

    public LabelWhereInput iscsiLunsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        return this;
    }

    public void setIscsiLunsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        }
    }

    public boolean getIscsiLunsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_NONE);
    }

    public LabelWhereInput iscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {

        this.iscsiLunsSome = iscsiLunsSome;
        return this;
    }

    /**
     * Get iscsiLunsSome
     *
     * @return iscsiLunsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsSome() {
        return iscsiLunsSome;
    }

    public void setIscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
        this.iscsiLunsSome = iscsiLunsSome;
    }

    public LabelWhereInput iscsiLunsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        return this;
    }

    public LabelWhereInput iscsiLunsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        return this;
    }

    public void setIscsiLunsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        }
    }

    public boolean getIscsiLunsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_SOME);
    }

    public LabelWhereInput iscsiTargetNum(Integer iscsiTargetNum) {

        this.iscsiTargetNum = iscsiTargetNum;
        return this;
    }

    /**
     * Get iscsiTargetNum
     *
     * @return iscsiTargetNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNum() {
        return iscsiTargetNum;
    }

    public void setIscsiTargetNum(Integer iscsiTargetNum) {
        this.iscsiTargetNum = iscsiTargetNum;
    }

    public LabelWhereInput iscsiTargetNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM);
        return this;
    }

    public LabelWhereInput iscsiTargetNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM);
        return this;
    }

    public void setIscsiTargetNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM);
        }
    }

    public boolean getIscsiTargetNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM);
    }

    public LabelWhereInput iscsiTargetNumGt(Integer iscsiTargetNumGt) {

        this.iscsiTargetNumGt = iscsiTargetNumGt;
        return this;
    }

    /**
     * Get iscsiTargetNumGt
     *
     * @return iscsiTargetNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNumGt() {
        return iscsiTargetNumGt;
    }

    public void setIscsiTargetNumGt(Integer iscsiTargetNumGt) {
        this.iscsiTargetNumGt = iscsiTargetNumGt;
    }

    public LabelWhereInput iscsiTargetNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT);
        return this;
    }

    public LabelWhereInput iscsiTargetNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT);
        return this;
    }

    public void setIscsiTargetNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT);
        }
    }

    public boolean getIscsiTargetNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT);
    }

    public LabelWhereInput iscsiTargetNumGte(Integer iscsiTargetNumGte) {

        this.iscsiTargetNumGte = iscsiTargetNumGte;
        return this;
    }

    /**
     * Get iscsiTargetNumGte
     *
     * @return iscsiTargetNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNumGte() {
        return iscsiTargetNumGte;
    }

    public void setIscsiTargetNumGte(Integer iscsiTargetNumGte) {
        this.iscsiTargetNumGte = iscsiTargetNumGte;
    }

    public LabelWhereInput iscsiTargetNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE);
        return this;
    }

    public LabelWhereInput iscsiTargetNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE);
        return this;
    }

    public void setIscsiTargetNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE);
        }
    }

    public boolean getIscsiTargetNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE);
    }

    public LabelWhereInput iscsiTargetNumIn(List<Integer> iscsiTargetNumIn) {

        this.iscsiTargetNumIn = iscsiTargetNumIn;
        return this;
    }

    public LabelWhereInput addIscsiTargetNumInItem(Integer iscsiTargetNumInItem) {
        if (this.iscsiTargetNumIn == null) {
            this.iscsiTargetNumIn = new ArrayList<Integer>();
        }
        this.iscsiTargetNumIn.add(iscsiTargetNumInItem);
        return this;
    }

    /**
     * Get iscsiTargetNumIn
     *
     * @return iscsiTargetNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiTargetNumIn() {
        return iscsiTargetNumIn;
    }

    public void setIscsiTargetNumIn(List<Integer> iscsiTargetNumIn) {
        this.iscsiTargetNumIn = iscsiTargetNumIn;
    }

    public LabelWhereInput iscsiTargetNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN);
        return this;
    }

    public LabelWhereInput iscsiTargetNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN);
        return this;
    }

    public void setIscsiTargetNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN);
        }
    }

    public boolean getIscsiTargetNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN);
    }

    public LabelWhereInput iscsiTargetNumLt(Integer iscsiTargetNumLt) {

        this.iscsiTargetNumLt = iscsiTargetNumLt;
        return this;
    }

    /**
     * Get iscsiTargetNumLt
     *
     * @return iscsiTargetNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNumLt() {
        return iscsiTargetNumLt;
    }

    public void setIscsiTargetNumLt(Integer iscsiTargetNumLt) {
        this.iscsiTargetNumLt = iscsiTargetNumLt;
    }

    public LabelWhereInput iscsiTargetNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT);
        return this;
    }

    public LabelWhereInput iscsiTargetNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT);
        return this;
    }

    public void setIscsiTargetNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT);
        }
    }

    public boolean getIscsiTargetNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT);
    }

    public LabelWhereInput iscsiTargetNumLte(Integer iscsiTargetNumLte) {

        this.iscsiTargetNumLte = iscsiTargetNumLte;
        return this;
    }

    /**
     * Get iscsiTargetNumLte
     *
     * @return iscsiTargetNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNumLte() {
        return iscsiTargetNumLte;
    }

    public void setIscsiTargetNumLte(Integer iscsiTargetNumLte) {
        this.iscsiTargetNumLte = iscsiTargetNumLte;
    }

    public LabelWhereInput iscsiTargetNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE);
        return this;
    }

    public LabelWhereInput iscsiTargetNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE);
        return this;
    }

    public void setIscsiTargetNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE);
        }
    }

    public boolean getIscsiTargetNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE);
    }

    public LabelWhereInput iscsiTargetNumNot(Integer iscsiTargetNumNot) {

        this.iscsiTargetNumNot = iscsiTargetNumNot;
        return this;
    }

    /**
     * Get iscsiTargetNumNot
     *
     * @return iscsiTargetNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiTargetNumNot() {
        return iscsiTargetNumNot;
    }

    public void setIscsiTargetNumNot(Integer iscsiTargetNumNot) {
        this.iscsiTargetNumNot = iscsiTargetNumNot;
    }

    public LabelWhereInput iscsiTargetNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT);
        return this;
    }

    public LabelWhereInput iscsiTargetNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT);
        return this;
    }

    public void setIscsiTargetNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT);
        }
    }

    public boolean getIscsiTargetNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT);
    }

    public LabelWhereInput iscsiTargetNumNotIn(List<Integer> iscsiTargetNumNotIn) {

        this.iscsiTargetNumNotIn = iscsiTargetNumNotIn;
        return this;
    }

    public LabelWhereInput addIscsiTargetNumNotInItem(Integer iscsiTargetNumNotInItem) {
        if (this.iscsiTargetNumNotIn == null) {
            this.iscsiTargetNumNotIn = new ArrayList<Integer>();
        }
        this.iscsiTargetNumNotIn.add(iscsiTargetNumNotInItem);
        return this;
    }

    /**
     * Get iscsiTargetNumNotIn
     *
     * @return iscsiTargetNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiTargetNumNotIn() {
        return iscsiTargetNumNotIn;
    }

    public void setIscsiTargetNumNotIn(List<Integer> iscsiTargetNumNotIn) {
        this.iscsiTargetNumNotIn = iscsiTargetNumNotIn;
    }

    public LabelWhereInput iscsiTargetNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput iscsiTargetNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN);
        return this;
    }

    public void setIscsiTargetNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN);
        }
    }

    public boolean getIscsiTargetNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN);
    }

    public LabelWhereInput iscsiTargetsEvery(IscsiTargetWhereInput iscsiTargetsEvery) {

        this.iscsiTargetsEvery = iscsiTargetsEvery;
        return this;
    }

    /**
     * Get iscsiTargetsEvery
     *
     * @return iscsiTargetsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiTargetWhereInput getIscsiTargetsEvery() {
        return iscsiTargetsEvery;
    }

    public void setIscsiTargetsEvery(IscsiTargetWhereInput iscsiTargetsEvery) {
        this.iscsiTargetsEvery = iscsiTargetsEvery;
    }

    public LabelWhereInput iscsiTargetsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_EVERY);
        return this;
    }

    public LabelWhereInput iscsiTargetsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_EVERY);
        return this;
    }

    public void setIscsiTargetsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_EVERY);
        }
    }

    public boolean getIscsiTargetsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGETS_EVERY);
    }

    public LabelWhereInput iscsiTargetsNone(IscsiTargetWhereInput iscsiTargetsNone) {

        this.iscsiTargetsNone = iscsiTargetsNone;
        return this;
    }

    /**
     * Get iscsiTargetsNone
     *
     * @return iscsiTargetsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiTargetWhereInput getIscsiTargetsNone() {
        return iscsiTargetsNone;
    }

    public void setIscsiTargetsNone(IscsiTargetWhereInput iscsiTargetsNone) {
        this.iscsiTargetsNone = iscsiTargetsNone;
    }

    public LabelWhereInput iscsiTargetsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_NONE);
        return this;
    }

    public LabelWhereInput iscsiTargetsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_NONE);
        return this;
    }

    public void setIscsiTargetsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_NONE);
        }
    }

    public boolean getIscsiTargetsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGETS_NONE);
    }

    public LabelWhereInput iscsiTargetsSome(IscsiTargetWhereInput iscsiTargetsSome) {

        this.iscsiTargetsSome = iscsiTargetsSome;
        return this;
    }

    /**
     * Get iscsiTargetsSome
     *
     * @return iscsiTargetsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiTargetWhereInput getIscsiTargetsSome() {
        return iscsiTargetsSome;
    }

    public void setIscsiTargetsSome(IscsiTargetWhereInput iscsiTargetsSome) {
        this.iscsiTargetsSome = iscsiTargetsSome;
    }

    public LabelWhereInput iscsiTargetsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_SOME);
        return this;
    }

    public LabelWhereInput iscsiTargetsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_SOME);
        return this;
    }

    public void setIscsiTargetsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS_SOME);
        }
    }

    public boolean getIscsiTargetsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGETS_SOME);
    }

    public LabelWhereInput isolationPoliciesEvery(
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

    public LabelWhereInput isolationPoliciesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_EVERY);
        return this;
    }

    public LabelWhereInput isolationPoliciesEvery_ExplictlyNonNull() {
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

    public LabelWhereInput isolationPoliciesNone(IsolationPolicyWhereInput isolationPoliciesNone) {

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

    public LabelWhereInput isolationPoliciesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_NONE);
        return this;
    }

    public LabelWhereInput isolationPoliciesNone_ExplictlyNonNull() {
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

    public LabelWhereInput isolationPoliciesSome(IsolationPolicyWhereInput isolationPoliciesSome) {

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

    public LabelWhereInput isolationPoliciesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES_SOME);
        return this;
    }

    public LabelWhereInput isolationPoliciesSome_ExplictlyNonNull() {
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

    public LabelWhereInput isolationPolicyNum(Integer isolationPolicyNum) {

        this.isolationPolicyNum = isolationPolicyNum;
        return this;
    }

    /**
     * Get isolationPolicyNum
     *
     * @return isolationPolicyNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNum() {
        return isolationPolicyNum;
    }

    public void setIsolationPolicyNum(Integer isolationPolicyNum) {
        this.isolationPolicyNum = isolationPolicyNum;
    }

    public LabelWhereInput isolationPolicyNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM);
        return this;
    }

    public LabelWhereInput isolationPolicyNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM);
        return this;
    }

    public void setIsolationPolicyNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM);
        }
    }

    public boolean getIsolationPolicyNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM);
    }

    public LabelWhereInput isolationPolicyNumGt(Integer isolationPolicyNumGt) {

        this.isolationPolicyNumGt = isolationPolicyNumGt;
        return this;
    }

    /**
     * Get isolationPolicyNumGt
     *
     * @return isolationPolicyNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNumGt() {
        return isolationPolicyNumGt;
    }

    public void setIsolationPolicyNumGt(Integer isolationPolicyNumGt) {
        this.isolationPolicyNumGt = isolationPolicyNumGt;
    }

    public LabelWhereInput isolationPolicyNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT);
        return this;
    }

    public LabelWhereInput isolationPolicyNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT);
        return this;
    }

    public void setIsolationPolicyNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT);
        }
    }

    public boolean getIsolationPolicyNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GT);
    }

    public LabelWhereInput isolationPolicyNumGte(Integer isolationPolicyNumGte) {

        this.isolationPolicyNumGte = isolationPolicyNumGte;
        return this;
    }

    /**
     * Get isolationPolicyNumGte
     *
     * @return isolationPolicyNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNumGte() {
        return isolationPolicyNumGte;
    }

    public void setIsolationPolicyNumGte(Integer isolationPolicyNumGte) {
        this.isolationPolicyNumGte = isolationPolicyNumGte;
    }

    public LabelWhereInput isolationPolicyNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE);
        return this;
    }

    public LabelWhereInput isolationPolicyNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE);
        return this;
    }

    public void setIsolationPolicyNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE);
        }
    }

    public boolean getIsolationPolicyNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_GTE);
    }

    public LabelWhereInput isolationPolicyNumIn(List<Integer> isolationPolicyNumIn) {

        this.isolationPolicyNumIn = isolationPolicyNumIn;
        return this;
    }

    public LabelWhereInput addIsolationPolicyNumInItem(Integer isolationPolicyNumInItem) {
        if (this.isolationPolicyNumIn == null) {
            this.isolationPolicyNumIn = new ArrayList<Integer>();
        }
        this.isolationPolicyNumIn.add(isolationPolicyNumInItem);
        return this;
    }

    /**
     * Get isolationPolicyNumIn
     *
     * @return isolationPolicyNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIsolationPolicyNumIn() {
        return isolationPolicyNumIn;
    }

    public void setIsolationPolicyNumIn(List<Integer> isolationPolicyNumIn) {
        this.isolationPolicyNumIn = isolationPolicyNumIn;
    }

    public LabelWhereInput isolationPolicyNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN);
        return this;
    }

    public LabelWhereInput isolationPolicyNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN);
        return this;
    }

    public void setIsolationPolicyNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN);
        }
    }

    public boolean getIsolationPolicyNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_IN);
    }

    public LabelWhereInput isolationPolicyNumLt(Integer isolationPolicyNumLt) {

        this.isolationPolicyNumLt = isolationPolicyNumLt;
        return this;
    }

    /**
     * Get isolationPolicyNumLt
     *
     * @return isolationPolicyNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNumLt() {
        return isolationPolicyNumLt;
    }

    public void setIsolationPolicyNumLt(Integer isolationPolicyNumLt) {
        this.isolationPolicyNumLt = isolationPolicyNumLt;
    }

    public LabelWhereInput isolationPolicyNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT);
        return this;
    }

    public LabelWhereInput isolationPolicyNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT);
        return this;
    }

    public void setIsolationPolicyNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT);
        }
    }

    public boolean getIsolationPolicyNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LT);
    }

    public LabelWhereInput isolationPolicyNumLte(Integer isolationPolicyNumLte) {

        this.isolationPolicyNumLte = isolationPolicyNumLte;
        return this;
    }

    /**
     * Get isolationPolicyNumLte
     *
     * @return isolationPolicyNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNumLte() {
        return isolationPolicyNumLte;
    }

    public void setIsolationPolicyNumLte(Integer isolationPolicyNumLte) {
        this.isolationPolicyNumLte = isolationPolicyNumLte;
    }

    public LabelWhereInput isolationPolicyNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE);
        return this;
    }

    public LabelWhereInput isolationPolicyNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE);
        return this;
    }

    public void setIsolationPolicyNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE);
        }
    }

    public boolean getIsolationPolicyNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_LTE);
    }

    public LabelWhereInput isolationPolicyNumNot(Integer isolationPolicyNumNot) {

        this.isolationPolicyNumNot = isolationPolicyNumNot;
        return this;
    }

    /**
     * Get isolationPolicyNumNot
     *
     * @return isolationPolicyNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIsolationPolicyNumNot() {
        return isolationPolicyNumNot;
    }

    public void setIsolationPolicyNumNot(Integer isolationPolicyNumNot) {
        this.isolationPolicyNumNot = isolationPolicyNumNot;
    }

    public LabelWhereInput isolationPolicyNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT);
        return this;
    }

    public LabelWhereInput isolationPolicyNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT);
        return this;
    }

    public void setIsolationPolicyNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT);
        }
    }

    public boolean getIsolationPolicyNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT);
    }

    public LabelWhereInput isolationPolicyNumNotIn(List<Integer> isolationPolicyNumNotIn) {

        this.isolationPolicyNumNotIn = isolationPolicyNumNotIn;
        return this;
    }

    public LabelWhereInput addIsolationPolicyNumNotInItem(Integer isolationPolicyNumNotInItem) {
        if (this.isolationPolicyNumNotIn == null) {
            this.isolationPolicyNumNotIn = new ArrayList<Integer>();
        }
        this.isolationPolicyNumNotIn.add(isolationPolicyNumNotInItem);
        return this;
    }

    /**
     * Get isolationPolicyNumNotIn
     *
     * @return isolationPolicyNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIsolationPolicyNumNotIn() {
        return isolationPolicyNumNotIn;
    }

    public void setIsolationPolicyNumNotIn(List<Integer> isolationPolicyNumNotIn) {
        this.isolationPolicyNumNotIn = isolationPolicyNumNotIn;
    }

    public LabelWhereInput isolationPolicyNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput isolationPolicyNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN);
        return this;
    }

    public void setIsolationPolicyNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN);
        }
    }

    public boolean getIsolationPolicyNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY_NUM_NOT_IN);
    }

    public LabelWhereInput key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LabelWhereInput key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public LabelWhereInput key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public LabelWhereInput keyContains(String keyContains) {

        this.keyContains = keyContains;
        return this;
    }

    /**
     * Get keyContains
     *
     * @return keyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyContains() {
        return keyContains;
    }

    public void setKeyContains(String keyContains) {
        this.keyContains = keyContains;
    }

    public LabelWhereInput keyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public LabelWhereInput keyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public void setKeyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        }
    }

    public boolean getKeyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_CONTAINS);
    }

    public LabelWhereInput keyEndsWith(String keyEndsWith) {

        this.keyEndsWith = keyEndsWith;
        return this;
    }

    /**
     * Get keyEndsWith
     *
     * @return keyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyEndsWith() {
        return keyEndsWith;
    }

    public void setKeyEndsWith(String keyEndsWith) {
        this.keyEndsWith = keyEndsWith;
    }

    public LabelWhereInput keyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public LabelWhereInput keyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public void setKeyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        }
    }

    public boolean getKeyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_ENDS_WITH);
    }

    public LabelWhereInput keyGt(String keyGt) {

        this.keyGt = keyGt;
        return this;
    }

    /**
     * Get keyGt
     *
     * @return keyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyGt() {
        return keyGt;
    }

    public void setKeyGt(String keyGt) {
        this.keyGt = keyGt;
    }

    public LabelWhereInput keyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public LabelWhereInput keyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public void setKeyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        }
    }

    public boolean getKeyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GT);
    }

    public LabelWhereInput keyGte(String keyGte) {

        this.keyGte = keyGte;
        return this;
    }

    /**
     * Get keyGte
     *
     * @return keyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyGte() {
        return keyGte;
    }

    public void setKeyGte(String keyGte) {
        this.keyGte = keyGte;
    }

    public LabelWhereInput keyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public LabelWhereInput keyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public void setKeyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        }
    }

    public boolean getKeyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GTE);
    }

    public LabelWhereInput keyIn(List<String> keyIn) {

        this.keyIn = keyIn;
        return this;
    }

    public LabelWhereInput addKeyInItem(String keyInItem) {
        if (this.keyIn == null) {
            this.keyIn = new ArrayList<String>();
        }
        this.keyIn.add(keyInItem);
        return this;
    }

    /**
     * Get keyIn
     *
     * @return keyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKeyIn() {
        return keyIn;
    }

    public void setKeyIn(List<String> keyIn) {
        this.keyIn = keyIn;
    }

    public LabelWhereInput keyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public LabelWhereInput keyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public void setKeyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        }
    }

    public boolean getKeyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_IN);
    }

    public LabelWhereInput keyLt(String keyLt) {

        this.keyLt = keyLt;
        return this;
    }

    /**
     * Get keyLt
     *
     * @return keyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyLt() {
        return keyLt;
    }

    public void setKeyLt(String keyLt) {
        this.keyLt = keyLt;
    }

    public LabelWhereInput keyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public LabelWhereInput keyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public void setKeyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        }
    }

    public boolean getKeyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LT);
    }

    public LabelWhereInput keyLte(String keyLte) {

        this.keyLte = keyLte;
        return this;
    }

    /**
     * Get keyLte
     *
     * @return keyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyLte() {
        return keyLte;
    }

    public void setKeyLte(String keyLte) {
        this.keyLte = keyLte;
    }

    public LabelWhereInput keyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public LabelWhereInput keyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public void setKeyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        }
    }

    public boolean getKeyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LTE);
    }

    public LabelWhereInput keyNot(String keyNot) {

        this.keyNot = keyNot;
        return this;
    }

    /**
     * Get keyNot
     *
     * @return keyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNot() {
        return keyNot;
    }

    public void setKeyNot(String keyNot) {
        this.keyNot = keyNot;
    }

    public LabelWhereInput keyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public LabelWhereInput keyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public void setKeyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        }
    }

    public boolean getKeyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT);
    }

    public LabelWhereInput keyNotContains(String keyNotContains) {

        this.keyNotContains = keyNotContains;
        return this;
    }

    /**
     * Get keyNotContains
     *
     * @return keyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotContains() {
        return keyNotContains;
    }

    public void setKeyNotContains(String keyNotContains) {
        this.keyNotContains = keyNotContains;
    }

    public LabelWhereInput keyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public LabelWhereInput keyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public void setKeyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        }
    }

    public boolean getKeyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_CONTAINS);
    }

    public LabelWhereInput keyNotEndsWith(String keyNotEndsWith) {

        this.keyNotEndsWith = keyNotEndsWith;
        return this;
    }

    /**
     * Get keyNotEndsWith
     *
     * @return keyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotEndsWith() {
        return keyNotEndsWith;
    }

    public void setKeyNotEndsWith(String keyNotEndsWith) {
        this.keyNotEndsWith = keyNotEndsWith;
    }

    public LabelWhereInput keyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public LabelWhereInput keyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public void setKeyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        }
    }

    public boolean getKeyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
    }

    public LabelWhereInput keyNotIn(List<String> keyNotIn) {

        this.keyNotIn = keyNotIn;
        return this;
    }

    public LabelWhereInput addKeyNotInItem(String keyNotInItem) {
        if (this.keyNotIn == null) {
            this.keyNotIn = new ArrayList<String>();
        }
        this.keyNotIn.add(keyNotInItem);
        return this;
    }

    /**
     * Get keyNotIn
     *
     * @return keyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKeyNotIn() {
        return keyNotIn;
    }

    public void setKeyNotIn(List<String> keyNotIn) {
        this.keyNotIn = keyNotIn;
    }

    public LabelWhereInput keyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public LabelWhereInput keyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public void setKeyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        }
    }

    public boolean getKeyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_IN);
    }

    public LabelWhereInput keyNotStartsWith(String keyNotStartsWith) {

        this.keyNotStartsWith = keyNotStartsWith;
        return this;
    }

    /**
     * Get keyNotStartsWith
     *
     * @return keyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotStartsWith() {
        return keyNotStartsWith;
    }

    public void setKeyNotStartsWith(String keyNotStartsWith) {
        this.keyNotStartsWith = keyNotStartsWith;
    }

    public LabelWhereInput keyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public LabelWhereInput keyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public void setKeyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        }
    }

    public boolean getKeyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
    }

    public LabelWhereInput keyStartsWith(String keyStartsWith) {

        this.keyStartsWith = keyStartsWith;
        return this;
    }

    /**
     * Get keyStartsWith
     *
     * @return keyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyStartsWith() {
        return keyStartsWith;
    }

    public void setKeyStartsWith(String keyStartsWith) {
        this.keyStartsWith = keyStartsWith;
    }

    public LabelWhereInput keyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public LabelWhereInput keyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public void setKeyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        }
    }

    public boolean getKeyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_STARTS_WITH);
    }

    public LabelWhereInput namespaceGroupNum(Integer namespaceGroupNum) {

        this.namespaceGroupNum = namespaceGroupNum;
        return this;
    }

    /**
     * Get namespaceGroupNum
     *
     * @return namespaceGroupNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNum() {
        return namespaceGroupNum;
    }

    public void setNamespaceGroupNum(Integer namespaceGroupNum) {
        this.namespaceGroupNum = namespaceGroupNum;
    }

    public LabelWhereInput namespaceGroupNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM);
        return this;
    }

    public LabelWhereInput namespaceGroupNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM);
        return this;
    }

    public void setNamespaceGroupNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM);
        }
    }

    public boolean getNamespaceGroupNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM);
    }

    public LabelWhereInput namespaceGroupNumGt(Integer namespaceGroupNumGt) {

        this.namespaceGroupNumGt = namespaceGroupNumGt;
        return this;
    }

    /**
     * Get namespaceGroupNumGt
     *
     * @return namespaceGroupNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNumGt() {
        return namespaceGroupNumGt;
    }

    public void setNamespaceGroupNumGt(Integer namespaceGroupNumGt) {
        this.namespaceGroupNumGt = namespaceGroupNumGt;
    }

    public LabelWhereInput namespaceGroupNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT);
        return this;
    }

    public LabelWhereInput namespaceGroupNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT);
        return this;
    }

    public void setNamespaceGroupNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT);
        }
    }

    public boolean getNamespaceGroupNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GT);
    }

    public LabelWhereInput namespaceGroupNumGte(Integer namespaceGroupNumGte) {

        this.namespaceGroupNumGte = namespaceGroupNumGte;
        return this;
    }

    /**
     * Get namespaceGroupNumGte
     *
     * @return namespaceGroupNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNumGte() {
        return namespaceGroupNumGte;
    }

    public void setNamespaceGroupNumGte(Integer namespaceGroupNumGte) {
        this.namespaceGroupNumGte = namespaceGroupNumGte;
    }

    public LabelWhereInput namespaceGroupNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE);
        return this;
    }

    public LabelWhereInput namespaceGroupNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE);
        return this;
    }

    public void setNamespaceGroupNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE);
        }
    }

    public boolean getNamespaceGroupNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_GTE);
    }

    public LabelWhereInput namespaceGroupNumIn(List<Integer> namespaceGroupNumIn) {

        this.namespaceGroupNumIn = namespaceGroupNumIn;
        return this;
    }

    public LabelWhereInput addNamespaceGroupNumInItem(Integer namespaceGroupNumInItem) {
        if (this.namespaceGroupNumIn == null) {
            this.namespaceGroupNumIn = new ArrayList<Integer>();
        }
        this.namespaceGroupNumIn.add(namespaceGroupNumInItem);
        return this;
    }

    /**
     * Get namespaceGroupNumIn
     *
     * @return namespaceGroupNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNamespaceGroupNumIn() {
        return namespaceGroupNumIn;
    }

    public void setNamespaceGroupNumIn(List<Integer> namespaceGroupNumIn) {
        this.namespaceGroupNumIn = namespaceGroupNumIn;
    }

    public LabelWhereInput namespaceGroupNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN);
        return this;
    }

    public LabelWhereInput namespaceGroupNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN);
        return this;
    }

    public void setNamespaceGroupNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN);
        }
    }

    public boolean getNamespaceGroupNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_IN);
    }

    public LabelWhereInput namespaceGroupNumLt(Integer namespaceGroupNumLt) {

        this.namespaceGroupNumLt = namespaceGroupNumLt;
        return this;
    }

    /**
     * Get namespaceGroupNumLt
     *
     * @return namespaceGroupNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNumLt() {
        return namespaceGroupNumLt;
    }

    public void setNamespaceGroupNumLt(Integer namespaceGroupNumLt) {
        this.namespaceGroupNumLt = namespaceGroupNumLt;
    }

    public LabelWhereInput namespaceGroupNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT);
        return this;
    }

    public LabelWhereInput namespaceGroupNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT);
        return this;
    }

    public void setNamespaceGroupNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT);
        }
    }

    public boolean getNamespaceGroupNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LT);
    }

    public LabelWhereInput namespaceGroupNumLte(Integer namespaceGroupNumLte) {

        this.namespaceGroupNumLte = namespaceGroupNumLte;
        return this;
    }

    /**
     * Get namespaceGroupNumLte
     *
     * @return namespaceGroupNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNumLte() {
        return namespaceGroupNumLte;
    }

    public void setNamespaceGroupNumLte(Integer namespaceGroupNumLte) {
        this.namespaceGroupNumLte = namespaceGroupNumLte;
    }

    public LabelWhereInput namespaceGroupNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE);
        return this;
    }

    public LabelWhereInput namespaceGroupNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE);
        return this;
    }

    public void setNamespaceGroupNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE);
        }
    }

    public boolean getNamespaceGroupNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_LTE);
    }

    public LabelWhereInput namespaceGroupNumNot(Integer namespaceGroupNumNot) {

        this.namespaceGroupNumNot = namespaceGroupNumNot;
        return this;
    }

    /**
     * Get namespaceGroupNumNot
     *
     * @return namespaceGroupNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceGroupNumNot() {
        return namespaceGroupNumNot;
    }

    public void setNamespaceGroupNumNot(Integer namespaceGroupNumNot) {
        this.namespaceGroupNumNot = namespaceGroupNumNot;
    }

    public LabelWhereInput namespaceGroupNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT);
        return this;
    }

    public LabelWhereInput namespaceGroupNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT);
        return this;
    }

    public void setNamespaceGroupNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT);
        }
    }

    public boolean getNamespaceGroupNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT);
    }

    public LabelWhereInput namespaceGroupNumNotIn(List<Integer> namespaceGroupNumNotIn) {

        this.namespaceGroupNumNotIn = namespaceGroupNumNotIn;
        return this;
    }

    public LabelWhereInput addNamespaceGroupNumNotInItem(Integer namespaceGroupNumNotInItem) {
        if (this.namespaceGroupNumNotIn == null) {
            this.namespaceGroupNumNotIn = new ArrayList<Integer>();
        }
        this.namespaceGroupNumNotIn.add(namespaceGroupNumNotInItem);
        return this;
    }

    /**
     * Get namespaceGroupNumNotIn
     *
     * @return namespaceGroupNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNamespaceGroupNumNotIn() {
        return namespaceGroupNumNotIn;
    }

    public void setNamespaceGroupNumNotIn(List<Integer> namespaceGroupNumNotIn) {
        this.namespaceGroupNumNotIn = namespaceGroupNumNotIn;
    }

    public LabelWhereInput namespaceGroupNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput namespaceGroupNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN);
        return this;
    }

    public void setNamespaceGroupNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN);
        }
    }

    public boolean getNamespaceGroupNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_NUM_NOT_IN);
    }

    public LabelWhereInput namespaceGroupsEvery(NamespaceGroupWhereInput namespaceGroupsEvery) {

        this.namespaceGroupsEvery = namespaceGroupsEvery;
        return this;
    }

    /**
     * Get namespaceGroupsEvery
     *
     * @return namespaceGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsEvery() {
        return namespaceGroupsEvery;
    }

    public void setNamespaceGroupsEvery(NamespaceGroupWhereInput namespaceGroupsEvery) {
        this.namespaceGroupsEvery = namespaceGroupsEvery;
    }

    public LabelWhereInput namespaceGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        return this;
    }

    public LabelWhereInput namespaceGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        return this;
    }

    public void setNamespaceGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        }
    }

    public boolean getNamespaceGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
    }

    public LabelWhereInput namespaceGroupsNone(NamespaceGroupWhereInput namespaceGroupsNone) {

        this.namespaceGroupsNone = namespaceGroupsNone;
        return this;
    }

    /**
     * Get namespaceGroupsNone
     *
     * @return namespaceGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsNone() {
        return namespaceGroupsNone;
    }

    public void setNamespaceGroupsNone(NamespaceGroupWhereInput namespaceGroupsNone) {
        this.namespaceGroupsNone = namespaceGroupsNone;
    }

    public LabelWhereInput namespaceGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        return this;
    }

    public LabelWhereInput namespaceGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        return this;
    }

    public void setNamespaceGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        }
    }

    public boolean getNamespaceGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
    }

    public LabelWhereInput namespaceGroupsSome(NamespaceGroupWhereInput namespaceGroupsSome) {

        this.namespaceGroupsSome = namespaceGroupsSome;
        return this;
    }

    /**
     * Get namespaceGroupsSome
     *
     * @return namespaceGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsSome() {
        return namespaceGroupsSome;
    }

    public void setNamespaceGroupsSome(NamespaceGroupWhereInput namespaceGroupsSome) {
        this.namespaceGroupsSome = namespaceGroupsSome;
    }

    public LabelWhereInput namespaceGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        return this;
    }

    public LabelWhereInput namespaceGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        return this;
    }

    public void setNamespaceGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        }
    }

    public boolean getNamespaceGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
    }

    public LabelWhereInput nfsExportNum(Integer nfsExportNum) {

        this.nfsExportNum = nfsExportNum;
        return this;
    }

    /**
     * Get nfsExportNum
     *
     * @return nfsExportNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNum() {
        return nfsExportNum;
    }

    public void setNfsExportNum(Integer nfsExportNum) {
        this.nfsExportNum = nfsExportNum;
    }

    public LabelWhereInput nfsExportNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM);
        return this;
    }

    public LabelWhereInput nfsExportNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM);
        return this;
    }

    public void setNfsExportNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM);
        }
    }

    public boolean getNfsExportNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM);
    }

    public LabelWhereInput nfsExportNumGt(Integer nfsExportNumGt) {

        this.nfsExportNumGt = nfsExportNumGt;
        return this;
    }

    /**
     * Get nfsExportNumGt
     *
     * @return nfsExportNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNumGt() {
        return nfsExportNumGt;
    }

    public void setNfsExportNumGt(Integer nfsExportNumGt) {
        this.nfsExportNumGt = nfsExportNumGt;
    }

    public LabelWhereInput nfsExportNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_GT);
        return this;
    }

    public LabelWhereInput nfsExportNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_GT);
        return this;
    }

    public void setNfsExportNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_GT);
        }
    }

    public boolean getNfsExportNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_GT);
    }

    public LabelWhereInput nfsExportNumGte(Integer nfsExportNumGte) {

        this.nfsExportNumGte = nfsExportNumGte;
        return this;
    }

    /**
     * Get nfsExportNumGte
     *
     * @return nfsExportNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNumGte() {
        return nfsExportNumGte;
    }

    public void setNfsExportNumGte(Integer nfsExportNumGte) {
        this.nfsExportNumGte = nfsExportNumGte;
    }

    public LabelWhereInput nfsExportNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE);
        return this;
    }

    public LabelWhereInput nfsExportNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE);
        return this;
    }

    public void setNfsExportNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE);
        }
    }

    public boolean getNfsExportNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_GTE);
    }

    public LabelWhereInput nfsExportNumIn(List<Integer> nfsExportNumIn) {

        this.nfsExportNumIn = nfsExportNumIn;
        return this;
    }

    public LabelWhereInput addNfsExportNumInItem(Integer nfsExportNumInItem) {
        if (this.nfsExportNumIn == null) {
            this.nfsExportNumIn = new ArrayList<Integer>();
        }
        this.nfsExportNumIn.add(nfsExportNumInItem);
        return this;
    }

    /**
     * Get nfsExportNumIn
     *
     * @return nfsExportNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNfsExportNumIn() {
        return nfsExportNumIn;
    }

    public void setNfsExportNumIn(List<Integer> nfsExportNumIn) {
        this.nfsExportNumIn = nfsExportNumIn;
    }

    public LabelWhereInput nfsExportNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_IN);
        return this;
    }

    public LabelWhereInput nfsExportNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_IN);
        return this;
    }

    public void setNfsExportNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_IN);
        }
    }

    public boolean getNfsExportNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_IN);
    }

    public LabelWhereInput nfsExportNumLt(Integer nfsExportNumLt) {

        this.nfsExportNumLt = nfsExportNumLt;
        return this;
    }

    /**
     * Get nfsExportNumLt
     *
     * @return nfsExportNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNumLt() {
        return nfsExportNumLt;
    }

    public void setNfsExportNumLt(Integer nfsExportNumLt) {
        this.nfsExportNumLt = nfsExportNumLt;
    }

    public LabelWhereInput nfsExportNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_LT);
        return this;
    }

    public LabelWhereInput nfsExportNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_LT);
        return this;
    }

    public void setNfsExportNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_LT);
        }
    }

    public boolean getNfsExportNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_LT);
    }

    public LabelWhereInput nfsExportNumLte(Integer nfsExportNumLte) {

        this.nfsExportNumLte = nfsExportNumLte;
        return this;
    }

    /**
     * Get nfsExportNumLte
     *
     * @return nfsExportNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNumLte() {
        return nfsExportNumLte;
    }

    public void setNfsExportNumLte(Integer nfsExportNumLte) {
        this.nfsExportNumLte = nfsExportNumLte;
    }

    public LabelWhereInput nfsExportNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE);
        return this;
    }

    public LabelWhereInput nfsExportNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE);
        return this;
    }

    public void setNfsExportNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE);
        }
    }

    public boolean getNfsExportNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_LTE);
    }

    public LabelWhereInput nfsExportNumNot(Integer nfsExportNumNot) {

        this.nfsExportNumNot = nfsExportNumNot;
        return this;
    }

    /**
     * Get nfsExportNumNot
     *
     * @return nfsExportNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsExportNumNot() {
        return nfsExportNumNot;
    }

    public void setNfsExportNumNot(Integer nfsExportNumNot) {
        this.nfsExportNumNot = nfsExportNumNot;
    }

    public LabelWhereInput nfsExportNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT);
        return this;
    }

    public LabelWhereInput nfsExportNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT);
        return this;
    }

    public void setNfsExportNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT);
        }
    }

    public boolean getNfsExportNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT);
    }

    public LabelWhereInput nfsExportNumNotIn(List<Integer> nfsExportNumNotIn) {

        this.nfsExportNumNotIn = nfsExportNumNotIn;
        return this;
    }

    public LabelWhereInput addNfsExportNumNotInItem(Integer nfsExportNumNotInItem) {
        if (this.nfsExportNumNotIn == null) {
            this.nfsExportNumNotIn = new ArrayList<Integer>();
        }
        this.nfsExportNumNotIn.add(nfsExportNumNotInItem);
        return this;
    }

    /**
     * Get nfsExportNumNotIn
     *
     * @return nfsExportNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNfsExportNumNotIn() {
        return nfsExportNumNotIn;
    }

    public void setNfsExportNumNotIn(List<Integer> nfsExportNumNotIn) {
        this.nfsExportNumNotIn = nfsExportNumNotIn;
    }

    public LabelWhereInput nfsExportNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nfsExportNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN);
        return this;
    }

    public void setNfsExportNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN);
        }
    }

    public boolean getNfsExportNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT_NUM_NOT_IN);
    }

    public LabelWhereInput nfsExportsEvery(NfsExportWhereInput nfsExportsEvery) {

        this.nfsExportsEvery = nfsExportsEvery;
        return this;
    }

    /**
     * Get nfsExportsEvery
     *
     * @return nfsExportsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExportsEvery() {
        return nfsExportsEvery;
    }

    public void setNfsExportsEvery(NfsExportWhereInput nfsExportsEvery) {
        this.nfsExportsEvery = nfsExportsEvery;
    }

    public LabelWhereInput nfsExportsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_EVERY);
        return this;
    }

    public LabelWhereInput nfsExportsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_EVERY);
        return this;
    }

    public void setNfsExportsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_EVERY);
        }
    }

    public boolean getNfsExportsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORTS_EVERY);
    }

    public LabelWhereInput nfsExportsNone(NfsExportWhereInput nfsExportsNone) {

        this.nfsExportsNone = nfsExportsNone;
        return this;
    }

    /**
     * Get nfsExportsNone
     *
     * @return nfsExportsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExportsNone() {
        return nfsExportsNone;
    }

    public void setNfsExportsNone(NfsExportWhereInput nfsExportsNone) {
        this.nfsExportsNone = nfsExportsNone;
    }

    public LabelWhereInput nfsExportsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_NONE);
        return this;
    }

    public LabelWhereInput nfsExportsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_NONE);
        return this;
    }

    public void setNfsExportsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_NONE);
        }
    }

    public boolean getNfsExportsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORTS_NONE);
    }

    public LabelWhereInput nfsExportsSome(NfsExportWhereInput nfsExportsSome) {

        this.nfsExportsSome = nfsExportsSome;
        return this;
    }

    /**
     * Get nfsExportsSome
     *
     * @return nfsExportsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExportsSome() {
        return nfsExportsSome;
    }

    public void setNfsExportsSome(NfsExportWhereInput nfsExportsSome) {
        this.nfsExportsSome = nfsExportsSome;
    }

    public LabelWhereInput nfsExportsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_SOME);
        return this;
    }

    public LabelWhereInput nfsExportsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_SOME);
        return this;
    }

    public void setNfsExportsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS_SOME);
        }
    }

    public boolean getNfsExportsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORTS_SOME);
    }

    public LabelWhereInput nfsInodeNum(Integer nfsInodeNum) {

        this.nfsInodeNum = nfsInodeNum;
        return this;
    }

    /**
     * Get nfsInodeNum
     *
     * @return nfsInodeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNum() {
        return nfsInodeNum;
    }

    public void setNfsInodeNum(Integer nfsInodeNum) {
        this.nfsInodeNum = nfsInodeNum;
    }

    public LabelWhereInput nfsInodeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM);
        return this;
    }

    public LabelWhereInput nfsInodeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM);
        return this;
    }

    public void setNfsInodeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM);
        }
    }

    public boolean getNfsInodeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM);
    }

    public LabelWhereInput nfsInodeNumGt(Integer nfsInodeNumGt) {

        this.nfsInodeNumGt = nfsInodeNumGt;
        return this;
    }

    /**
     * Get nfsInodeNumGt
     *
     * @return nfsInodeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNumGt() {
        return nfsInodeNumGt;
    }

    public void setNfsInodeNumGt(Integer nfsInodeNumGt) {
        this.nfsInodeNumGt = nfsInodeNumGt;
    }

    public LabelWhereInput nfsInodeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_GT);
        return this;
    }

    public LabelWhereInput nfsInodeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_GT);
        return this;
    }

    public void setNfsInodeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_GT);
        }
    }

    public boolean getNfsInodeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_GT);
    }

    public LabelWhereInput nfsInodeNumGte(Integer nfsInodeNumGte) {

        this.nfsInodeNumGte = nfsInodeNumGte;
        return this;
    }

    /**
     * Get nfsInodeNumGte
     *
     * @return nfsInodeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNumGte() {
        return nfsInodeNumGte;
    }

    public void setNfsInodeNumGte(Integer nfsInodeNumGte) {
        this.nfsInodeNumGte = nfsInodeNumGte;
    }

    public LabelWhereInput nfsInodeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_GTE);
        return this;
    }

    public LabelWhereInput nfsInodeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_GTE);
        return this;
    }

    public void setNfsInodeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_GTE);
        }
    }

    public boolean getNfsInodeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_GTE);
    }

    public LabelWhereInput nfsInodeNumIn(List<Integer> nfsInodeNumIn) {

        this.nfsInodeNumIn = nfsInodeNumIn;
        return this;
    }

    public LabelWhereInput addNfsInodeNumInItem(Integer nfsInodeNumInItem) {
        if (this.nfsInodeNumIn == null) {
            this.nfsInodeNumIn = new ArrayList<Integer>();
        }
        this.nfsInodeNumIn.add(nfsInodeNumInItem);
        return this;
    }

    /**
     * Get nfsInodeNumIn
     *
     * @return nfsInodeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNfsInodeNumIn() {
        return nfsInodeNumIn;
    }

    public void setNfsInodeNumIn(List<Integer> nfsInodeNumIn) {
        this.nfsInodeNumIn = nfsInodeNumIn;
    }

    public LabelWhereInput nfsInodeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_IN);
        return this;
    }

    public LabelWhereInput nfsInodeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_IN);
        return this;
    }

    public void setNfsInodeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_IN);
        }
    }

    public boolean getNfsInodeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_IN);
    }

    public LabelWhereInput nfsInodeNumLt(Integer nfsInodeNumLt) {

        this.nfsInodeNumLt = nfsInodeNumLt;
        return this;
    }

    /**
     * Get nfsInodeNumLt
     *
     * @return nfsInodeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNumLt() {
        return nfsInodeNumLt;
    }

    public void setNfsInodeNumLt(Integer nfsInodeNumLt) {
        this.nfsInodeNumLt = nfsInodeNumLt;
    }

    public LabelWhereInput nfsInodeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_LT);
        return this;
    }

    public LabelWhereInput nfsInodeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_LT);
        return this;
    }

    public void setNfsInodeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_LT);
        }
    }

    public boolean getNfsInodeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_LT);
    }

    public LabelWhereInput nfsInodeNumLte(Integer nfsInodeNumLte) {

        this.nfsInodeNumLte = nfsInodeNumLte;
        return this;
    }

    /**
     * Get nfsInodeNumLte
     *
     * @return nfsInodeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNumLte() {
        return nfsInodeNumLte;
    }

    public void setNfsInodeNumLte(Integer nfsInodeNumLte) {
        this.nfsInodeNumLte = nfsInodeNumLte;
    }

    public LabelWhereInput nfsInodeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_LTE);
        return this;
    }

    public LabelWhereInput nfsInodeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_LTE);
        return this;
    }

    public void setNfsInodeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_LTE);
        }
    }

    public boolean getNfsInodeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_LTE);
    }

    public LabelWhereInput nfsInodeNumNot(Integer nfsInodeNumNot) {

        this.nfsInodeNumNot = nfsInodeNumNot;
        return this;
    }

    /**
     * Get nfsInodeNumNot
     *
     * @return nfsInodeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNfsInodeNumNot() {
        return nfsInodeNumNot;
    }

    public void setNfsInodeNumNot(Integer nfsInodeNumNot) {
        this.nfsInodeNumNot = nfsInodeNumNot;
    }

    public LabelWhereInput nfsInodeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_NOT);
        return this;
    }

    public LabelWhereInput nfsInodeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_NOT);
        return this;
    }

    public void setNfsInodeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_NOT);
        }
    }

    public boolean getNfsInodeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_NOT);
    }

    public LabelWhereInput nfsInodeNumNotIn(List<Integer> nfsInodeNumNotIn) {

        this.nfsInodeNumNotIn = nfsInodeNumNotIn;
        return this;
    }

    public LabelWhereInput addNfsInodeNumNotInItem(Integer nfsInodeNumNotInItem) {
        if (this.nfsInodeNumNotIn == null) {
            this.nfsInodeNumNotIn = new ArrayList<Integer>();
        }
        this.nfsInodeNumNotIn.add(nfsInodeNumNotInItem);
        return this;
    }

    /**
     * Get nfsInodeNumNotIn
     *
     * @return nfsInodeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNfsInodeNumNotIn() {
        return nfsInodeNumNotIn;
    }

    public void setNfsInodeNumNotIn(List<Integer> nfsInodeNumNotIn) {
        this.nfsInodeNumNotIn = nfsInodeNumNotIn;
    }

    public LabelWhereInput nfsInodeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nfsInodeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN);
        return this;
    }

    public void setNfsInodeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN);
        }
    }

    public boolean getNfsInodeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODE_NUM_NOT_IN);
    }

    public LabelWhereInput nfsInodesEvery(NfsInodeWhereInput nfsInodesEvery) {

        this.nfsInodesEvery = nfsInodesEvery;
        return this;
    }

    /**
     * Get nfsInodesEvery
     *
     * @return nfsInodesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getNfsInodesEvery() {
        return nfsInodesEvery;
    }

    public void setNfsInodesEvery(NfsInodeWhereInput nfsInodesEvery) {
        this.nfsInodesEvery = nfsInodesEvery;
    }

    public LabelWhereInput nfsInodesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_EVERY);
        return this;
    }

    public LabelWhereInput nfsInodesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_EVERY);
        return this;
    }

    public void setNfsInodesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_EVERY);
        }
    }

    public boolean getNfsInodesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODES_EVERY);
    }

    public LabelWhereInput nfsInodesNone(NfsInodeWhereInput nfsInodesNone) {

        this.nfsInodesNone = nfsInodesNone;
        return this;
    }

    /**
     * Get nfsInodesNone
     *
     * @return nfsInodesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getNfsInodesNone() {
        return nfsInodesNone;
    }

    public void setNfsInodesNone(NfsInodeWhereInput nfsInodesNone) {
        this.nfsInodesNone = nfsInodesNone;
    }

    public LabelWhereInput nfsInodesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_NONE);
        return this;
    }

    public LabelWhereInput nfsInodesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_NONE);
        return this;
    }

    public void setNfsInodesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_NONE);
        }
    }

    public boolean getNfsInodesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODES_NONE);
    }

    public LabelWhereInput nfsInodesSome(NfsInodeWhereInput nfsInodesSome) {

        this.nfsInodesSome = nfsInodesSome;
        return this;
    }

    /**
     * Get nfsInodesSome
     *
     * @return nfsInodesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getNfsInodesSome() {
        return nfsInodesSome;
    }

    public void setNfsInodesSome(NfsInodeWhereInput nfsInodesSome) {
        this.nfsInodesSome = nfsInodesSome;
    }

    public LabelWhereInput nfsInodesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_SOME);
        return this;
    }

    public LabelWhereInput nfsInodesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_SOME);
        return this;
    }

    public void setNfsInodesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES_SOME);
        }
    }

    public boolean getNfsInodesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODES_SOME);
    }

    public LabelWhereInput nicNum(Integer nicNum) {

        this.nicNum = nicNum;
        return this;
    }

    /**
     * Get nicNum
     *
     * @return nicNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNum() {
        return nicNum;
    }

    public void setNicNum(Integer nicNum) {
        this.nicNum = nicNum;
    }

    public LabelWhereInput nicNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM);
        return this;
    }

    public LabelWhereInput nicNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM);
        return this;
    }

    public void setNicNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM);
        }
    }

    public boolean getNicNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM);
    }

    public LabelWhereInput nicNumGt(Integer nicNumGt) {

        this.nicNumGt = nicNumGt;
        return this;
    }

    /**
     * Get nicNumGt
     *
     * @return nicNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNumGt() {
        return nicNumGt;
    }

    public void setNicNumGt(Integer nicNumGt) {
        this.nicNumGt = nicNumGt;
    }

    public LabelWhereInput nicNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_GT);
        return this;
    }

    public LabelWhereInput nicNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_GT);
        return this;
    }

    public void setNicNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_GT);
        }
    }

    public boolean getNicNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_GT);
    }

    public LabelWhereInput nicNumGte(Integer nicNumGte) {

        this.nicNumGte = nicNumGte;
        return this;
    }

    /**
     * Get nicNumGte
     *
     * @return nicNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNumGte() {
        return nicNumGte;
    }

    public void setNicNumGte(Integer nicNumGte) {
        this.nicNumGte = nicNumGte;
    }

    public LabelWhereInput nicNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_GTE);
        return this;
    }

    public LabelWhereInput nicNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_GTE);
        return this;
    }

    public void setNicNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_GTE);
        }
    }

    public boolean getNicNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_GTE);
    }

    public LabelWhereInput nicNumIn(List<Integer> nicNumIn) {

        this.nicNumIn = nicNumIn;
        return this;
    }

    public LabelWhereInput addNicNumInItem(Integer nicNumInItem) {
        if (this.nicNumIn == null) {
            this.nicNumIn = new ArrayList<Integer>();
        }
        this.nicNumIn.add(nicNumInItem);
        return this;
    }

    /**
     * Get nicNumIn
     *
     * @return nicNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNicNumIn() {
        return nicNumIn;
    }

    public void setNicNumIn(List<Integer> nicNumIn) {
        this.nicNumIn = nicNumIn;
    }

    public LabelWhereInput nicNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_IN);
        return this;
    }

    public LabelWhereInput nicNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_IN);
        return this;
    }

    public void setNicNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_IN);
        }
    }

    public boolean getNicNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_IN);
    }

    public LabelWhereInput nicNumLt(Integer nicNumLt) {

        this.nicNumLt = nicNumLt;
        return this;
    }

    /**
     * Get nicNumLt
     *
     * @return nicNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNumLt() {
        return nicNumLt;
    }

    public void setNicNumLt(Integer nicNumLt) {
        this.nicNumLt = nicNumLt;
    }

    public LabelWhereInput nicNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_LT);
        return this;
    }

    public LabelWhereInput nicNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_LT);
        return this;
    }

    public void setNicNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_LT);
        }
    }

    public boolean getNicNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_LT);
    }

    public LabelWhereInput nicNumLte(Integer nicNumLte) {

        this.nicNumLte = nicNumLte;
        return this;
    }

    /**
     * Get nicNumLte
     *
     * @return nicNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNumLte() {
        return nicNumLte;
    }

    public void setNicNumLte(Integer nicNumLte) {
        this.nicNumLte = nicNumLte;
    }

    public LabelWhereInput nicNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_LTE);
        return this;
    }

    public LabelWhereInput nicNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_LTE);
        return this;
    }

    public void setNicNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_LTE);
        }
    }

    public boolean getNicNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_LTE);
    }

    public LabelWhereInput nicNumNot(Integer nicNumNot) {

        this.nicNumNot = nicNumNot;
        return this;
    }

    /**
     * Get nicNumNot
     *
     * @return nicNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNicNumNot() {
        return nicNumNot;
    }

    public void setNicNumNot(Integer nicNumNot) {
        this.nicNumNot = nicNumNot;
    }

    public LabelWhereInput nicNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_NOT);
        return this;
    }

    public LabelWhereInput nicNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_NOT);
        return this;
    }

    public void setNicNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_NOT);
        }
    }

    public boolean getNicNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_NOT);
    }

    public LabelWhereInput nicNumNotIn(List<Integer> nicNumNotIn) {

        this.nicNumNotIn = nicNumNotIn;
        return this;
    }

    public LabelWhereInput addNicNumNotInItem(Integer nicNumNotInItem) {
        if (this.nicNumNotIn == null) {
            this.nicNumNotIn = new ArrayList<Integer>();
        }
        this.nicNumNotIn.add(nicNumNotInItem);
        return this;
    }

    /**
     * Get nicNumNotIn
     *
     * @return nicNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNicNumNotIn() {
        return nicNumNotIn;
    }

    public void setNicNumNotIn(List<Integer> nicNumNotIn) {
        this.nicNumNotIn = nicNumNotIn;
    }

    public LabelWhereInput nicNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nicNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_NOT_IN);
        return this;
    }

    public void setNicNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_NUM_NOT_IN);
        }
    }

    public boolean getNicNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_NUM_NOT_IN);
    }

    public LabelWhereInput nicsEvery(NicWhereInput nicsEvery) {

        this.nicsEvery = nicsEvery;
        return this;
    }

    /**
     * Get nicsEvery
     *
     * @return nicsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsEvery() {
        return nicsEvery;
    }

    public void setNicsEvery(NicWhereInput nicsEvery) {
        this.nicsEvery = nicsEvery;
    }

    public LabelWhereInput nicsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public LabelWhereInput nicsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public void setNicsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        }
    }

    public boolean getNicsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_EVERY);
    }

    public LabelWhereInput nicsNone(NicWhereInput nicsNone) {

        this.nicsNone = nicsNone;
        return this;
    }

    /**
     * Get nicsNone
     *
     * @return nicsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsNone() {
        return nicsNone;
    }

    public void setNicsNone(NicWhereInput nicsNone) {
        this.nicsNone = nicsNone;
    }

    public LabelWhereInput nicsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public LabelWhereInput nicsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public void setNicsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        }
    }

    public boolean getNicsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_NONE);
    }

    public LabelWhereInput nicsSome(NicWhereInput nicsSome) {

        this.nicsSome = nicsSome;
        return this;
    }

    /**
     * Get nicsSome
     *
     * @return nicsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsSome() {
        return nicsSome;
    }

    public void setNicsSome(NicWhereInput nicsSome) {
        this.nicsSome = nicsSome;
    }

    public LabelWhereInput nicsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public LabelWhereInput nicsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public void setNicsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        }
    }

    public boolean getNicsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_SOME);
    }

    public LabelWhereInput nvmfNamespaceNum(Integer nvmfNamespaceNum) {

        this.nvmfNamespaceNum = nvmfNamespaceNum;
        return this;
    }

    /**
     * Get nvmfNamespaceNum
     *
     * @return nvmfNamespaceNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNum() {
        return nvmfNamespaceNum;
    }

    public void setNvmfNamespaceNum(Integer nvmfNamespaceNum) {
        this.nvmfNamespaceNum = nvmfNamespaceNum;
    }

    public LabelWhereInput nvmfNamespaceNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM);
        return this;
    }

    public void setNvmfNamespaceNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM);
        }
    }

    public boolean getNvmfNamespaceNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM);
    }

    public LabelWhereInput nvmfNamespaceNumGt(Integer nvmfNamespaceNumGt) {

        this.nvmfNamespaceNumGt = nvmfNamespaceNumGt;
        return this;
    }

    /**
     * Get nvmfNamespaceNumGt
     *
     * @return nvmfNamespaceNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNumGt() {
        return nvmfNamespaceNumGt;
    }

    public void setNvmfNamespaceNumGt(Integer nvmfNamespaceNumGt) {
        this.nvmfNamespaceNumGt = nvmfNamespaceNumGt;
    }

    public LabelWhereInput nvmfNamespaceNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT);
        return this;
    }

    public void setNvmfNamespaceNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT);
        }
    }

    public boolean getNvmfNamespaceNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GT);
    }

    public LabelWhereInput nvmfNamespaceNumGte(Integer nvmfNamespaceNumGte) {

        this.nvmfNamespaceNumGte = nvmfNamespaceNumGte;
        return this;
    }

    /**
     * Get nvmfNamespaceNumGte
     *
     * @return nvmfNamespaceNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNumGte() {
        return nvmfNamespaceNumGte;
    }

    public void setNvmfNamespaceNumGte(Integer nvmfNamespaceNumGte) {
        this.nvmfNamespaceNumGte = nvmfNamespaceNumGte;
    }

    public LabelWhereInput nvmfNamespaceNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE);
        return this;
    }

    public void setNvmfNamespaceNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE);
        }
    }

    public boolean getNvmfNamespaceNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_GTE);
    }

    public LabelWhereInput nvmfNamespaceNumIn(List<Integer> nvmfNamespaceNumIn) {

        this.nvmfNamespaceNumIn = nvmfNamespaceNumIn;
        return this;
    }

    public LabelWhereInput addNvmfNamespaceNumInItem(Integer nvmfNamespaceNumInItem) {
        if (this.nvmfNamespaceNumIn == null) {
            this.nvmfNamespaceNumIn = new ArrayList<Integer>();
        }
        this.nvmfNamespaceNumIn.add(nvmfNamespaceNumInItem);
        return this;
    }

    /**
     * Get nvmfNamespaceNumIn
     *
     * @return nvmfNamespaceNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespaceNumIn() {
        return nvmfNamespaceNumIn;
    }

    public void setNvmfNamespaceNumIn(List<Integer> nvmfNamespaceNumIn) {
        this.nvmfNamespaceNumIn = nvmfNamespaceNumIn;
    }

    public LabelWhereInput nvmfNamespaceNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN);
        return this;
    }

    public void setNvmfNamespaceNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN);
        }
    }

    public boolean getNvmfNamespaceNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_IN);
    }

    public LabelWhereInput nvmfNamespaceNumLt(Integer nvmfNamespaceNumLt) {

        this.nvmfNamespaceNumLt = nvmfNamespaceNumLt;
        return this;
    }

    /**
     * Get nvmfNamespaceNumLt
     *
     * @return nvmfNamespaceNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNumLt() {
        return nvmfNamespaceNumLt;
    }

    public void setNvmfNamespaceNumLt(Integer nvmfNamespaceNumLt) {
        this.nvmfNamespaceNumLt = nvmfNamespaceNumLt;
    }

    public LabelWhereInput nvmfNamespaceNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT);
        return this;
    }

    public void setNvmfNamespaceNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT);
        }
    }

    public boolean getNvmfNamespaceNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LT);
    }

    public LabelWhereInput nvmfNamespaceNumLte(Integer nvmfNamespaceNumLte) {

        this.nvmfNamespaceNumLte = nvmfNamespaceNumLte;
        return this;
    }

    /**
     * Get nvmfNamespaceNumLte
     *
     * @return nvmfNamespaceNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNumLte() {
        return nvmfNamespaceNumLte;
    }

    public void setNvmfNamespaceNumLte(Integer nvmfNamespaceNumLte) {
        this.nvmfNamespaceNumLte = nvmfNamespaceNumLte;
    }

    public LabelWhereInput nvmfNamespaceNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE);
        return this;
    }

    public void setNvmfNamespaceNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE);
        }
    }

    public boolean getNvmfNamespaceNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_LTE);
    }

    public LabelWhereInput nvmfNamespaceNumNot(Integer nvmfNamespaceNumNot) {

        this.nvmfNamespaceNumNot = nvmfNamespaceNumNot;
        return this;
    }

    /**
     * Get nvmfNamespaceNumNot
     *
     * @return nvmfNamespaceNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceNumNot() {
        return nvmfNamespaceNumNot;
    }

    public void setNvmfNamespaceNumNot(Integer nvmfNamespaceNumNot) {
        this.nvmfNamespaceNumNot = nvmfNamespaceNumNot;
    }

    public LabelWhereInput nvmfNamespaceNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT);
        return this;
    }

    public void setNvmfNamespaceNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT);
        }
    }

    public boolean getNvmfNamespaceNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT);
    }

    public LabelWhereInput nvmfNamespaceNumNotIn(List<Integer> nvmfNamespaceNumNotIn) {

        this.nvmfNamespaceNumNotIn = nvmfNamespaceNumNotIn;
        return this;
    }

    public LabelWhereInput addNvmfNamespaceNumNotInItem(Integer nvmfNamespaceNumNotInItem) {
        if (this.nvmfNamespaceNumNotIn == null) {
            this.nvmfNamespaceNumNotIn = new ArrayList<Integer>();
        }
        this.nvmfNamespaceNumNotIn.add(nvmfNamespaceNumNotInItem);
        return this;
    }

    /**
     * Get nvmfNamespaceNumNotIn
     *
     * @return nvmfNamespaceNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespaceNumNotIn() {
        return nvmfNamespaceNumNotIn;
    }

    public void setNvmfNamespaceNumNotIn(List<Integer> nvmfNamespaceNumNotIn) {
        this.nvmfNamespaceNumNotIn = nvmfNamespaceNumNotIn;
    }

    public LabelWhereInput nvmfNamespaceNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nvmfNamespaceNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN);
        return this;
    }

    public void setNvmfNamespaceNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN);
        }
    }

    public boolean getNvmfNamespaceNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_NUM_NOT_IN);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNum(Integer nvmfNamespaceSnapshotNum) {

        this.nvmfNamespaceSnapshotNum = nvmfNamespaceSnapshotNum;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNum
     *
     * @return nvmfNamespaceSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNum() {
        return nvmfNamespaceSnapshotNum;
    }

    public void setNvmfNamespaceSnapshotNum(Integer nvmfNamespaceSnapshotNum) {
        this.nvmfNamespaceSnapshotNum = nvmfNamespaceSnapshotNum;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM);
        return this;
    }

    public void setNvmfNamespaceSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM);
        }
    }

    public boolean getNvmfNamespaceSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGt(Integer nvmfNamespaceSnapshotNumGt) {

        this.nvmfNamespaceSnapshotNumGt = nvmfNamespaceSnapshotNumGt;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumGt
     *
     * @return nvmfNamespaceSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNumGt() {
        return nvmfNamespaceSnapshotNumGt;
    }

    public void setNvmfNamespaceSnapshotNumGt(Integer nvmfNamespaceSnapshotNumGt) {
        this.nvmfNamespaceSnapshotNumGt = nvmfNamespaceSnapshotNumGt;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GT);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGte(Integer nvmfNamespaceSnapshotNumGte) {

        this.nvmfNamespaceSnapshotNumGte = nvmfNamespaceSnapshotNumGte;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumGte
     *
     * @return nvmfNamespaceSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNumGte() {
        return nvmfNamespaceSnapshotNumGte;
    }

    public void setNvmfNamespaceSnapshotNumGte(Integer nvmfNamespaceSnapshotNumGte) {
        this.nvmfNamespaceSnapshotNumGte = nvmfNamespaceSnapshotNumGte;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_GTE);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumIn(List<Integer> nvmfNamespaceSnapshotNumIn) {

        this.nvmfNamespaceSnapshotNumIn = nvmfNamespaceSnapshotNumIn;
        return this;
    }

    public LabelWhereInput addNvmfNamespaceSnapshotNumInItem(
            Integer nvmfNamespaceSnapshotNumInItem) {
        if (this.nvmfNamespaceSnapshotNumIn == null) {
            this.nvmfNamespaceSnapshotNumIn = new ArrayList<Integer>();
        }
        this.nvmfNamespaceSnapshotNumIn.add(nvmfNamespaceSnapshotNumInItem);
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumIn
     *
     * @return nvmfNamespaceSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespaceSnapshotNumIn() {
        return nvmfNamespaceSnapshotNumIn;
    }

    public void setNvmfNamespaceSnapshotNumIn(List<Integer> nvmfNamespaceSnapshotNumIn) {
        this.nvmfNamespaceSnapshotNumIn = nvmfNamespaceSnapshotNumIn;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_IN);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLt(Integer nvmfNamespaceSnapshotNumLt) {

        this.nvmfNamespaceSnapshotNumLt = nvmfNamespaceSnapshotNumLt;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumLt
     *
     * @return nvmfNamespaceSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNumLt() {
        return nvmfNamespaceSnapshotNumLt;
    }

    public void setNvmfNamespaceSnapshotNumLt(Integer nvmfNamespaceSnapshotNumLt) {
        this.nvmfNamespaceSnapshotNumLt = nvmfNamespaceSnapshotNumLt;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LT);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLte(Integer nvmfNamespaceSnapshotNumLte) {

        this.nvmfNamespaceSnapshotNumLte = nvmfNamespaceSnapshotNumLte;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumLte
     *
     * @return nvmfNamespaceSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNumLte() {
        return nvmfNamespaceSnapshotNumLte;
    }

    public void setNvmfNamespaceSnapshotNumLte(Integer nvmfNamespaceSnapshotNumLte) {
        this.nvmfNamespaceSnapshotNumLte = nvmfNamespaceSnapshotNumLte;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_LTE);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNot(Integer nvmfNamespaceSnapshotNumNot) {

        this.nvmfNamespaceSnapshotNumNot = nvmfNamespaceSnapshotNumNot;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumNot
     *
     * @return nvmfNamespaceSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespaceSnapshotNumNot() {
        return nvmfNamespaceSnapshotNumNot;
    }

    public void setNvmfNamespaceSnapshotNumNot(Integer nvmfNamespaceSnapshotNumNot) {
        this.nvmfNamespaceSnapshotNumNot = nvmfNamespaceSnapshotNumNot;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT);
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNotIn(
            List<Integer> nvmfNamespaceSnapshotNumNotIn) {

        this.nvmfNamespaceSnapshotNumNotIn = nvmfNamespaceSnapshotNumNotIn;
        return this;
    }

    public LabelWhereInput addNvmfNamespaceSnapshotNumNotInItem(
            Integer nvmfNamespaceSnapshotNumNotInItem) {
        if (this.nvmfNamespaceSnapshotNumNotIn == null) {
            this.nvmfNamespaceSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.nvmfNamespaceSnapshotNumNotIn.add(nvmfNamespaceSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotNumNotIn
     *
     * @return nvmfNamespaceSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespaceSnapshotNumNotIn() {
        return nvmfNamespaceSnapshotNumNotIn;
    }

    public void setNvmfNamespaceSnapshotNumNotIn(List<Integer> nvmfNamespaceSnapshotNumNotIn) {
        this.nvmfNamespaceSnapshotNumNotIn = nvmfNamespaceSnapshotNumNotIn;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setNvmfNamespaceSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getNvmfNamespaceSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOT_NUM_NOT_IN);
    }

    public LabelWhereInput nvmfNamespaceSnapshotsEvery(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsEvery) {

        this.nvmfNamespaceSnapshotsEvery = nvmfNamespaceSnapshotsEvery;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotsEvery
     *
     * @return nvmfNamespaceSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceSnapshotWhereInput getNvmfNamespaceSnapshotsEvery() {
        return nvmfNamespaceSnapshotsEvery;
    }

    public void setNvmfNamespaceSnapshotsEvery(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsEvery) {
        this.nvmfNamespaceSnapshotsEvery = nvmfNamespaceSnapshotsEvery;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY);
        return this;
    }

    public void setNvmfNamespaceSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY);
        }
    }

    public boolean getNvmfNamespaceSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_EVERY);
    }

    public LabelWhereInput nvmfNamespaceSnapshotsNone(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsNone) {

        this.nvmfNamespaceSnapshotsNone = nvmfNamespaceSnapshotsNone;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotsNone
     *
     * @return nvmfNamespaceSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceSnapshotWhereInput getNvmfNamespaceSnapshotsNone() {
        return nvmfNamespaceSnapshotsNone;
    }

    public void setNvmfNamespaceSnapshotsNone(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsNone) {
        this.nvmfNamespaceSnapshotsNone = nvmfNamespaceSnapshotsNone;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE);
        return this;
    }

    public void setNvmfNamespaceSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE);
        }
    }

    public boolean getNvmfNamespaceSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_NONE);
    }

    public LabelWhereInput nvmfNamespaceSnapshotsSome(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsSome) {

        this.nvmfNamespaceSnapshotsSome = nvmfNamespaceSnapshotsSome;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshotsSome
     *
     * @return nvmfNamespaceSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceSnapshotWhereInput getNvmfNamespaceSnapshotsSome() {
        return nvmfNamespaceSnapshotsSome;
    }

    public void setNvmfNamespaceSnapshotsSome(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshotsSome) {
        this.nvmfNamespaceSnapshotsSome = nvmfNamespaceSnapshotsSome;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME);
        return this;
    }

    public LabelWhereInput nvmfNamespaceSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME);
        return this;
    }

    public void setNvmfNamespaceSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME);
        }
    }

    public boolean getNvmfNamespaceSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS_SOME);
    }

    public LabelWhereInput nvmfNamespacesEvery(NvmfNamespaceWhereInput nvmfNamespacesEvery) {

        this.nvmfNamespacesEvery = nvmfNamespacesEvery;
        return this;
    }

    /**
     * Get nvmfNamespacesEvery
     *
     * @return nvmfNamespacesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNvmfNamespacesEvery() {
        return nvmfNamespacesEvery;
    }

    public void setNvmfNamespacesEvery(NvmfNamespaceWhereInput nvmfNamespacesEvery) {
        this.nvmfNamespacesEvery = nvmfNamespacesEvery;
    }

    public LabelWhereInput nvmfNamespacesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY);
        return this;
    }

    public LabelWhereInput nvmfNamespacesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY);
        return this;
    }

    public void setNvmfNamespacesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY);
        }
    }

    public boolean getNvmfNamespacesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_EVERY);
    }

    public LabelWhereInput nvmfNamespacesNone(NvmfNamespaceWhereInput nvmfNamespacesNone) {

        this.nvmfNamespacesNone = nvmfNamespacesNone;
        return this;
    }

    /**
     * Get nvmfNamespacesNone
     *
     * @return nvmfNamespacesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNvmfNamespacesNone() {
        return nvmfNamespacesNone;
    }

    public void setNvmfNamespacesNone(NvmfNamespaceWhereInput nvmfNamespacesNone) {
        this.nvmfNamespacesNone = nvmfNamespacesNone;
    }

    public LabelWhereInput nvmfNamespacesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NONE);
        return this;
    }

    public LabelWhereInput nvmfNamespacesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NONE);
        return this;
    }

    public void setNvmfNamespacesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NONE);
        }
    }

    public boolean getNvmfNamespacesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NONE);
    }

    public LabelWhereInput nvmfNamespacesSome(NvmfNamespaceWhereInput nvmfNamespacesSome) {

        this.nvmfNamespacesSome = nvmfNamespacesSome;
        return this;
    }

    /**
     * Get nvmfNamespacesSome
     *
     * @return nvmfNamespacesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNvmfNamespacesSome() {
        return nvmfNamespacesSome;
    }

    public void setNvmfNamespacesSome(NvmfNamespaceWhereInput nvmfNamespacesSome) {
        this.nvmfNamespacesSome = nvmfNamespacesSome;
    }

    public LabelWhereInput nvmfNamespacesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_SOME);
        return this;
    }

    public LabelWhereInput nvmfNamespacesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_SOME);
        return this;
    }

    public void setNvmfNamespacesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_SOME);
        }
    }

    public boolean getNvmfNamespacesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_SOME);
    }

    public LabelWhereInput nvmfSubsystemNum(Integer nvmfSubsystemNum) {

        this.nvmfSubsystemNum = nvmfSubsystemNum;
        return this;
    }

    /**
     * Get nvmfSubsystemNum
     *
     * @return nvmfSubsystemNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNum() {
        return nvmfSubsystemNum;
    }

    public void setNvmfSubsystemNum(Integer nvmfSubsystemNum) {
        this.nvmfSubsystemNum = nvmfSubsystemNum;
    }

    public LabelWhereInput nvmfSubsystemNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM);
        return this;
    }

    public void setNvmfSubsystemNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM);
        }
    }

    public boolean getNvmfSubsystemNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM);
    }

    public LabelWhereInput nvmfSubsystemNumGt(Integer nvmfSubsystemNumGt) {

        this.nvmfSubsystemNumGt = nvmfSubsystemNumGt;
        return this;
    }

    /**
     * Get nvmfSubsystemNumGt
     *
     * @return nvmfSubsystemNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNumGt() {
        return nvmfSubsystemNumGt;
    }

    public void setNvmfSubsystemNumGt(Integer nvmfSubsystemNumGt) {
        this.nvmfSubsystemNumGt = nvmfSubsystemNumGt;
    }

    public LabelWhereInput nvmfSubsystemNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT);
        return this;
    }

    public void setNvmfSubsystemNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT);
        }
    }

    public boolean getNvmfSubsystemNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GT);
    }

    public LabelWhereInput nvmfSubsystemNumGte(Integer nvmfSubsystemNumGte) {

        this.nvmfSubsystemNumGte = nvmfSubsystemNumGte;
        return this;
    }

    /**
     * Get nvmfSubsystemNumGte
     *
     * @return nvmfSubsystemNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNumGte() {
        return nvmfSubsystemNumGte;
    }

    public void setNvmfSubsystemNumGte(Integer nvmfSubsystemNumGte) {
        this.nvmfSubsystemNumGte = nvmfSubsystemNumGte;
    }

    public LabelWhereInput nvmfSubsystemNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE);
        return this;
    }

    public void setNvmfSubsystemNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE);
        }
    }

    public boolean getNvmfSubsystemNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_GTE);
    }

    public LabelWhereInput nvmfSubsystemNumIn(List<Integer> nvmfSubsystemNumIn) {

        this.nvmfSubsystemNumIn = nvmfSubsystemNumIn;
        return this;
    }

    public LabelWhereInput addNvmfSubsystemNumInItem(Integer nvmfSubsystemNumInItem) {
        if (this.nvmfSubsystemNumIn == null) {
            this.nvmfSubsystemNumIn = new ArrayList<Integer>();
        }
        this.nvmfSubsystemNumIn.add(nvmfSubsystemNumInItem);
        return this;
    }

    /**
     * Get nvmfSubsystemNumIn
     *
     * @return nvmfSubsystemNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfSubsystemNumIn() {
        return nvmfSubsystemNumIn;
    }

    public void setNvmfSubsystemNumIn(List<Integer> nvmfSubsystemNumIn) {
        this.nvmfSubsystemNumIn = nvmfSubsystemNumIn;
    }

    public LabelWhereInput nvmfSubsystemNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN);
        return this;
    }

    public void setNvmfSubsystemNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN);
        }
    }

    public boolean getNvmfSubsystemNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_IN);
    }

    public LabelWhereInput nvmfSubsystemNumLt(Integer nvmfSubsystemNumLt) {

        this.nvmfSubsystemNumLt = nvmfSubsystemNumLt;
        return this;
    }

    /**
     * Get nvmfSubsystemNumLt
     *
     * @return nvmfSubsystemNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNumLt() {
        return nvmfSubsystemNumLt;
    }

    public void setNvmfSubsystemNumLt(Integer nvmfSubsystemNumLt) {
        this.nvmfSubsystemNumLt = nvmfSubsystemNumLt;
    }

    public LabelWhereInput nvmfSubsystemNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT);
        return this;
    }

    public void setNvmfSubsystemNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT);
        }
    }

    public boolean getNvmfSubsystemNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LT);
    }

    public LabelWhereInput nvmfSubsystemNumLte(Integer nvmfSubsystemNumLte) {

        this.nvmfSubsystemNumLte = nvmfSubsystemNumLte;
        return this;
    }

    /**
     * Get nvmfSubsystemNumLte
     *
     * @return nvmfSubsystemNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNumLte() {
        return nvmfSubsystemNumLte;
    }

    public void setNvmfSubsystemNumLte(Integer nvmfSubsystemNumLte) {
        this.nvmfSubsystemNumLte = nvmfSubsystemNumLte;
    }

    public LabelWhereInput nvmfSubsystemNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE);
        return this;
    }

    public void setNvmfSubsystemNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE);
        }
    }

    public boolean getNvmfSubsystemNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_LTE);
    }

    public LabelWhereInput nvmfSubsystemNumNot(Integer nvmfSubsystemNumNot) {

        this.nvmfSubsystemNumNot = nvmfSubsystemNumNot;
        return this;
    }

    /**
     * Get nvmfSubsystemNumNot
     *
     * @return nvmfSubsystemNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfSubsystemNumNot() {
        return nvmfSubsystemNumNot;
    }

    public void setNvmfSubsystemNumNot(Integer nvmfSubsystemNumNot) {
        this.nvmfSubsystemNumNot = nvmfSubsystemNumNot;
    }

    public LabelWhereInput nvmfSubsystemNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT);
        return this;
    }

    public void setNvmfSubsystemNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT);
        }
    }

    public boolean getNvmfSubsystemNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT);
    }

    public LabelWhereInput nvmfSubsystemNumNotIn(List<Integer> nvmfSubsystemNumNotIn) {

        this.nvmfSubsystemNumNotIn = nvmfSubsystemNumNotIn;
        return this;
    }

    public LabelWhereInput addNvmfSubsystemNumNotInItem(Integer nvmfSubsystemNumNotInItem) {
        if (this.nvmfSubsystemNumNotIn == null) {
            this.nvmfSubsystemNumNotIn = new ArrayList<Integer>();
        }
        this.nvmfSubsystemNumNotIn.add(nvmfSubsystemNumNotInItem);
        return this;
    }

    /**
     * Get nvmfSubsystemNumNotIn
     *
     * @return nvmfSubsystemNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfSubsystemNumNotIn() {
        return nvmfSubsystemNumNotIn;
    }

    public void setNvmfSubsystemNumNotIn(List<Integer> nvmfSubsystemNumNotIn) {
        this.nvmfSubsystemNumNotIn = nvmfSubsystemNumNotIn;
    }

    public LabelWhereInput nvmfSubsystemNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput nvmfSubsystemNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN);
        return this;
    }

    public void setNvmfSubsystemNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN);
        }
    }

    public boolean getNvmfSubsystemNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_NUM_NOT_IN);
    }

    public LabelWhereInput nvmfSubsystemsEvery(NvmfSubsystemWhereInput nvmfSubsystemsEvery) {

        this.nvmfSubsystemsEvery = nvmfSubsystemsEvery;
        return this;
    }

    /**
     * Get nvmfSubsystemsEvery
     *
     * @return nvmfSubsystemsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystemsEvery() {
        return nvmfSubsystemsEvery;
    }

    public void setNvmfSubsystemsEvery(NvmfSubsystemWhereInput nvmfSubsystemsEvery) {
        this.nvmfSubsystemsEvery = nvmfSubsystemsEvery;
    }

    public LabelWhereInput nvmfSubsystemsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY);
        return this;
    }

    public LabelWhereInput nvmfSubsystemsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY);
        return this;
    }

    public void setNvmfSubsystemsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY);
        }
    }

    public boolean getNvmfSubsystemsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEMS_EVERY);
    }

    public LabelWhereInput nvmfSubsystemsNone(NvmfSubsystemWhereInput nvmfSubsystemsNone) {

        this.nvmfSubsystemsNone = nvmfSubsystemsNone;
        return this;
    }

    /**
     * Get nvmfSubsystemsNone
     *
     * @return nvmfSubsystemsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystemsNone() {
        return nvmfSubsystemsNone;
    }

    public void setNvmfSubsystemsNone(NvmfSubsystemWhereInput nvmfSubsystemsNone) {
        this.nvmfSubsystemsNone = nvmfSubsystemsNone;
    }

    public LabelWhereInput nvmfSubsystemsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE);
        return this;
    }

    public LabelWhereInput nvmfSubsystemsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE);
        return this;
    }

    public void setNvmfSubsystemsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE);
        }
    }

    public boolean getNvmfSubsystemsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEMS_NONE);
    }

    public LabelWhereInput nvmfSubsystemsSome(NvmfSubsystemWhereInput nvmfSubsystemsSome) {

        this.nvmfSubsystemsSome = nvmfSubsystemsSome;
        return this;
    }

    /**
     * Get nvmfSubsystemsSome
     *
     * @return nvmfSubsystemsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystemsSome() {
        return nvmfSubsystemsSome;
    }

    public void setNvmfSubsystemsSome(NvmfSubsystemWhereInput nvmfSubsystemsSome) {
        this.nvmfSubsystemsSome = nvmfSubsystemsSome;
    }

    public LabelWhereInput nvmfSubsystemsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME);
        return this;
    }

    public LabelWhereInput nvmfSubsystemsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME);
        return this;
    }

    public void setNvmfSubsystemsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME);
        }
    }

    public boolean getNvmfSubsystemsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEMS_SOME);
    }

    public LabelWhereInput securityPoliciesEvery(SecurityPolicyWhereInput securityPoliciesEvery) {

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

    public LabelWhereInput securityPoliciesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_EVERY);
        return this;
    }

    public LabelWhereInput securityPoliciesEvery_ExplictlyNonNull() {
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

    public LabelWhereInput securityPoliciesNone(SecurityPolicyWhereInput securityPoliciesNone) {

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

    public LabelWhereInput securityPoliciesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_NONE);
        return this;
    }

    public LabelWhereInput securityPoliciesNone_ExplictlyNonNull() {
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

    public LabelWhereInput securityPoliciesSome(SecurityPolicyWhereInput securityPoliciesSome) {

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

    public LabelWhereInput securityPoliciesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES_SOME);
        return this;
    }

    public LabelWhereInput securityPoliciesSome_ExplictlyNonNull() {
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

    public LabelWhereInput securityPolicyNum(Integer securityPolicyNum) {

        this.securityPolicyNum = securityPolicyNum;
        return this;
    }

    /**
     * Get securityPolicyNum
     *
     * @return securityPolicyNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNum() {
        return securityPolicyNum;
    }

    public void setSecurityPolicyNum(Integer securityPolicyNum) {
        this.securityPolicyNum = securityPolicyNum;
    }

    public LabelWhereInput securityPolicyNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM);
        return this;
    }

    public LabelWhereInput securityPolicyNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM);
        return this;
    }

    public void setSecurityPolicyNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM);
        }
    }

    public boolean getSecurityPolicyNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM);
    }

    public LabelWhereInput securityPolicyNumGt(Integer securityPolicyNumGt) {

        this.securityPolicyNumGt = securityPolicyNumGt;
        return this;
    }

    /**
     * Get securityPolicyNumGt
     *
     * @return securityPolicyNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNumGt() {
        return securityPolicyNumGt;
    }

    public void setSecurityPolicyNumGt(Integer securityPolicyNumGt) {
        this.securityPolicyNumGt = securityPolicyNumGt;
    }

    public LabelWhereInput securityPolicyNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT);
        return this;
    }

    public LabelWhereInput securityPolicyNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT);
        return this;
    }

    public void setSecurityPolicyNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT);
        }
    }

    public boolean getSecurityPolicyNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_GT);
    }

    public LabelWhereInput securityPolicyNumGte(Integer securityPolicyNumGte) {

        this.securityPolicyNumGte = securityPolicyNumGte;
        return this;
    }

    /**
     * Get securityPolicyNumGte
     *
     * @return securityPolicyNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNumGte() {
        return securityPolicyNumGte;
    }

    public void setSecurityPolicyNumGte(Integer securityPolicyNumGte) {
        this.securityPolicyNumGte = securityPolicyNumGte;
    }

    public LabelWhereInput securityPolicyNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE);
        return this;
    }

    public LabelWhereInput securityPolicyNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE);
        return this;
    }

    public void setSecurityPolicyNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE);
        }
    }

    public boolean getSecurityPolicyNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_GTE);
    }

    public LabelWhereInput securityPolicyNumIn(List<Integer> securityPolicyNumIn) {

        this.securityPolicyNumIn = securityPolicyNumIn;
        return this;
    }

    public LabelWhereInput addSecurityPolicyNumInItem(Integer securityPolicyNumInItem) {
        if (this.securityPolicyNumIn == null) {
            this.securityPolicyNumIn = new ArrayList<Integer>();
        }
        this.securityPolicyNumIn.add(securityPolicyNumInItem);
        return this;
    }

    /**
     * Get securityPolicyNumIn
     *
     * @return securityPolicyNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSecurityPolicyNumIn() {
        return securityPolicyNumIn;
    }

    public void setSecurityPolicyNumIn(List<Integer> securityPolicyNumIn) {
        this.securityPolicyNumIn = securityPolicyNumIn;
    }

    public LabelWhereInput securityPolicyNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN);
        return this;
    }

    public LabelWhereInput securityPolicyNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN);
        return this;
    }

    public void setSecurityPolicyNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN);
        }
    }

    public boolean getSecurityPolicyNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_IN);
    }

    public LabelWhereInput securityPolicyNumLt(Integer securityPolicyNumLt) {

        this.securityPolicyNumLt = securityPolicyNumLt;
        return this;
    }

    /**
     * Get securityPolicyNumLt
     *
     * @return securityPolicyNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNumLt() {
        return securityPolicyNumLt;
    }

    public void setSecurityPolicyNumLt(Integer securityPolicyNumLt) {
        this.securityPolicyNumLt = securityPolicyNumLt;
    }

    public LabelWhereInput securityPolicyNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT);
        return this;
    }

    public LabelWhereInput securityPolicyNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT);
        return this;
    }

    public void setSecurityPolicyNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT);
        }
    }

    public boolean getSecurityPolicyNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_LT);
    }

    public LabelWhereInput securityPolicyNumLte(Integer securityPolicyNumLte) {

        this.securityPolicyNumLte = securityPolicyNumLte;
        return this;
    }

    /**
     * Get securityPolicyNumLte
     *
     * @return securityPolicyNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNumLte() {
        return securityPolicyNumLte;
    }

    public void setSecurityPolicyNumLte(Integer securityPolicyNumLte) {
        this.securityPolicyNumLte = securityPolicyNumLte;
    }

    public LabelWhereInput securityPolicyNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE);
        return this;
    }

    public LabelWhereInput securityPolicyNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE);
        return this;
    }

    public void setSecurityPolicyNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE);
        }
    }

    public boolean getSecurityPolicyNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_LTE);
    }

    public LabelWhereInput securityPolicyNumNot(Integer securityPolicyNumNot) {

        this.securityPolicyNumNot = securityPolicyNumNot;
        return this;
    }

    /**
     * Get securityPolicyNumNot
     *
     * @return securityPolicyNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSecurityPolicyNumNot() {
        return securityPolicyNumNot;
    }

    public void setSecurityPolicyNumNot(Integer securityPolicyNumNot) {
        this.securityPolicyNumNot = securityPolicyNumNot;
    }

    public LabelWhereInput securityPolicyNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT);
        return this;
    }

    public LabelWhereInput securityPolicyNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT);
        return this;
    }

    public void setSecurityPolicyNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT);
        }
    }

    public boolean getSecurityPolicyNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT);
    }

    public LabelWhereInput securityPolicyNumNotIn(List<Integer> securityPolicyNumNotIn) {

        this.securityPolicyNumNotIn = securityPolicyNumNotIn;
        return this;
    }

    public LabelWhereInput addSecurityPolicyNumNotInItem(Integer securityPolicyNumNotInItem) {
        if (this.securityPolicyNumNotIn == null) {
            this.securityPolicyNumNotIn = new ArrayList<Integer>();
        }
        this.securityPolicyNumNotIn.add(securityPolicyNumNotInItem);
        return this;
    }

    /**
     * Get securityPolicyNumNotIn
     *
     * @return securityPolicyNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSecurityPolicyNumNotIn() {
        return securityPolicyNumNotIn;
    }

    public void setSecurityPolicyNumNotIn(List<Integer> securityPolicyNumNotIn) {
        this.securityPolicyNumNotIn = securityPolicyNumNotIn;
    }

    public LabelWhereInput securityPolicyNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput securityPolicyNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN);
        return this;
    }

    public void setSecurityPolicyNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN);
        }
    }

    public boolean getSecurityPolicyNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICY_NUM_NOT_IN);
    }

    public LabelWhereInput systemVlanNum(Integer systemVlanNum) {

        this.systemVlanNum = systemVlanNum;
        return this;
    }

    /**
     * Get systemVlanNum
     *
     * @return systemVlanNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNum() {
        return systemVlanNum;
    }

    public void setSystemVlanNum(Integer systemVlanNum) {
        this.systemVlanNum = systemVlanNum;
    }

    public LabelWhereInput systemVlanNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM);
        return this;
    }

    public LabelWhereInput systemVlanNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM);
        return this;
    }

    public void setSystemVlanNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM);
        }
    }

    public boolean getSystemVlanNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM);
    }

    public LabelWhereInput systemVlanNumGt(Integer systemVlanNumGt) {

        this.systemVlanNumGt = systemVlanNumGt;
        return this;
    }

    /**
     * Get systemVlanNumGt
     *
     * @return systemVlanNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNumGt() {
        return systemVlanNumGt;
    }

    public void setSystemVlanNumGt(Integer systemVlanNumGt) {
        this.systemVlanNumGt = systemVlanNumGt;
    }

    public LabelWhereInput systemVlanNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT);
        return this;
    }

    public LabelWhereInput systemVlanNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT);
        return this;
    }

    public void setSystemVlanNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT);
        }
    }

    public boolean getSystemVlanNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT);
    }

    public LabelWhereInput systemVlanNumGte(Integer systemVlanNumGte) {

        this.systemVlanNumGte = systemVlanNumGte;
        return this;
    }

    /**
     * Get systemVlanNumGte
     *
     * @return systemVlanNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNumGte() {
        return systemVlanNumGte;
    }

    public void setSystemVlanNumGte(Integer systemVlanNumGte) {
        this.systemVlanNumGte = systemVlanNumGte;
    }

    public LabelWhereInput systemVlanNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE);
        return this;
    }

    public LabelWhereInput systemVlanNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE);
        return this;
    }

    public void setSystemVlanNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE);
        }
    }

    public boolean getSystemVlanNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE);
    }

    public LabelWhereInput systemVlanNumIn(List<Integer> systemVlanNumIn) {

        this.systemVlanNumIn = systemVlanNumIn;
        return this;
    }

    public LabelWhereInput addSystemVlanNumInItem(Integer systemVlanNumInItem) {
        if (this.systemVlanNumIn == null) {
            this.systemVlanNumIn = new ArrayList<Integer>();
        }
        this.systemVlanNumIn.add(systemVlanNumInItem);
        return this;
    }

    /**
     * Get systemVlanNumIn
     *
     * @return systemVlanNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSystemVlanNumIn() {
        return systemVlanNumIn;
    }

    public void setSystemVlanNumIn(List<Integer> systemVlanNumIn) {
        this.systemVlanNumIn = systemVlanNumIn;
    }

    public LabelWhereInput systemVlanNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN);
        return this;
    }

    public LabelWhereInput systemVlanNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN);
        return this;
    }

    public void setSystemVlanNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN);
        }
    }

    public boolean getSystemVlanNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN);
    }

    public LabelWhereInput systemVlanNumLt(Integer systemVlanNumLt) {

        this.systemVlanNumLt = systemVlanNumLt;
        return this;
    }

    /**
     * Get systemVlanNumLt
     *
     * @return systemVlanNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNumLt() {
        return systemVlanNumLt;
    }

    public void setSystemVlanNumLt(Integer systemVlanNumLt) {
        this.systemVlanNumLt = systemVlanNumLt;
    }

    public LabelWhereInput systemVlanNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT);
        return this;
    }

    public LabelWhereInput systemVlanNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT);
        return this;
    }

    public void setSystemVlanNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT);
        }
    }

    public boolean getSystemVlanNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT);
    }

    public LabelWhereInput systemVlanNumLte(Integer systemVlanNumLte) {

        this.systemVlanNumLte = systemVlanNumLte;
        return this;
    }

    /**
     * Get systemVlanNumLte
     *
     * @return systemVlanNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNumLte() {
        return systemVlanNumLte;
    }

    public void setSystemVlanNumLte(Integer systemVlanNumLte) {
        this.systemVlanNumLte = systemVlanNumLte;
    }

    public LabelWhereInput systemVlanNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE);
        return this;
    }

    public LabelWhereInput systemVlanNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE);
        return this;
    }

    public void setSystemVlanNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE);
        }
    }

    public boolean getSystemVlanNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE);
    }

    public LabelWhereInput systemVlanNumNot(Integer systemVlanNumNot) {

        this.systemVlanNumNot = systemVlanNumNot;
        return this;
    }

    /**
     * Get systemVlanNumNot
     *
     * @return systemVlanNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSystemVlanNumNot() {
        return systemVlanNumNot;
    }

    public void setSystemVlanNumNot(Integer systemVlanNumNot) {
        this.systemVlanNumNot = systemVlanNumNot;
    }

    public LabelWhereInput systemVlanNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT);
        return this;
    }

    public LabelWhereInput systemVlanNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT);
        return this;
    }

    public void setSystemVlanNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT);
        }
    }

    public boolean getSystemVlanNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT);
    }

    public LabelWhereInput systemVlanNumNotIn(List<Integer> systemVlanNumNotIn) {

        this.systemVlanNumNotIn = systemVlanNumNotIn;
        return this;
    }

    public LabelWhereInput addSystemVlanNumNotInItem(Integer systemVlanNumNotInItem) {
        if (this.systemVlanNumNotIn == null) {
            this.systemVlanNumNotIn = new ArrayList<Integer>();
        }
        this.systemVlanNumNotIn.add(systemVlanNumNotInItem);
        return this;
    }

    /**
     * Get systemVlanNumNotIn
     *
     * @return systemVlanNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSystemVlanNumNotIn() {
        return systemVlanNumNotIn;
    }

    public void setSystemVlanNumNotIn(List<Integer> systemVlanNumNotIn) {
        this.systemVlanNumNotIn = systemVlanNumNotIn;
    }

    public LabelWhereInput systemVlanNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput systemVlanNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN);
        return this;
    }

    public void setSystemVlanNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN);
        }
    }

    public boolean getSystemVlanNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN);
    }

    public LabelWhereInput totalNum(Integer totalNum) {

        this.totalNum = totalNum;
        return this;
    }

    /**
     * Get totalNum
     *
     * @return totalNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public LabelWhereInput totalNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM);
        return this;
    }

    public LabelWhereInput totalNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM);
        return this;
    }

    public void setTotalNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM);
        }
    }

    public boolean getTotalNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM);
    }

    public LabelWhereInput totalNumGt(Integer totalNumGt) {

        this.totalNumGt = totalNumGt;
        return this;
    }

    /**
     * Get totalNumGt
     *
     * @return totalNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNumGt() {
        return totalNumGt;
    }

    public void setTotalNumGt(Integer totalNumGt) {
        this.totalNumGt = totalNumGt;
    }

    public LabelWhereInput totalNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_GT);
        return this;
    }

    public LabelWhereInput totalNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_GT);
        return this;
    }

    public void setTotalNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_GT);
        }
    }

    public boolean getTotalNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_GT);
    }

    public LabelWhereInput totalNumGte(Integer totalNumGte) {

        this.totalNumGte = totalNumGte;
        return this;
    }

    /**
     * Get totalNumGte
     *
     * @return totalNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNumGte() {
        return totalNumGte;
    }

    public void setTotalNumGte(Integer totalNumGte) {
        this.totalNumGte = totalNumGte;
    }

    public LabelWhereInput totalNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_GTE);
        return this;
    }

    public LabelWhereInput totalNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_GTE);
        return this;
    }

    public void setTotalNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_GTE);
        }
    }

    public boolean getTotalNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_GTE);
    }

    public LabelWhereInput totalNumIn(List<Integer> totalNumIn) {

        this.totalNumIn = totalNumIn;
        return this;
    }

    public LabelWhereInput addTotalNumInItem(Integer totalNumInItem) {
        if (this.totalNumIn == null) {
            this.totalNumIn = new ArrayList<Integer>();
        }
        this.totalNumIn.add(totalNumInItem);
        return this;
    }

    /**
     * Get totalNumIn
     *
     * @return totalNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalNumIn() {
        return totalNumIn;
    }

    public void setTotalNumIn(List<Integer> totalNumIn) {
        this.totalNumIn = totalNumIn;
    }

    public LabelWhereInput totalNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_IN);
        return this;
    }

    public LabelWhereInput totalNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_IN);
        return this;
    }

    public void setTotalNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_IN);
        }
    }

    public boolean getTotalNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_IN);
    }

    public LabelWhereInput totalNumLt(Integer totalNumLt) {

        this.totalNumLt = totalNumLt;
        return this;
    }

    /**
     * Get totalNumLt
     *
     * @return totalNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNumLt() {
        return totalNumLt;
    }

    public void setTotalNumLt(Integer totalNumLt) {
        this.totalNumLt = totalNumLt;
    }

    public LabelWhereInput totalNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_LT);
        return this;
    }

    public LabelWhereInput totalNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_LT);
        return this;
    }

    public void setTotalNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_LT);
        }
    }

    public boolean getTotalNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_LT);
    }

    public LabelWhereInput totalNumLte(Integer totalNumLte) {

        this.totalNumLte = totalNumLte;
        return this;
    }

    /**
     * Get totalNumLte
     *
     * @return totalNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNumLte() {
        return totalNumLte;
    }

    public void setTotalNumLte(Integer totalNumLte) {
        this.totalNumLte = totalNumLte;
    }

    public LabelWhereInput totalNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_LTE);
        return this;
    }

    public LabelWhereInput totalNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_LTE);
        return this;
    }

    public void setTotalNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_LTE);
        }
    }

    public boolean getTotalNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_LTE);
    }

    public LabelWhereInput totalNumNot(Integer totalNumNot) {

        this.totalNumNot = totalNumNot;
        return this;
    }

    /**
     * Get totalNumNot
     *
     * @return totalNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalNumNot() {
        return totalNumNot;
    }

    public void setTotalNumNot(Integer totalNumNot) {
        this.totalNumNot = totalNumNot;
    }

    public LabelWhereInput totalNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_NOT);
        return this;
    }

    public LabelWhereInput totalNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_NOT);
        return this;
    }

    public void setTotalNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_NOT);
        }
    }

    public boolean getTotalNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_NOT);
    }

    public LabelWhereInput totalNumNotIn(List<Integer> totalNumNotIn) {

        this.totalNumNotIn = totalNumNotIn;
        return this;
    }

    public LabelWhereInput addTotalNumNotInItem(Integer totalNumNotInItem) {
        if (this.totalNumNotIn == null) {
            this.totalNumNotIn = new ArrayList<Integer>();
        }
        this.totalNumNotIn.add(totalNumNotInItem);
        return this;
    }

    /**
     * Get totalNumNotIn
     *
     * @return totalNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalNumNotIn() {
        return totalNumNotIn;
    }

    public void setTotalNumNotIn(List<Integer> totalNumNotIn) {
        this.totalNumNotIn = totalNumNotIn;
    }

    public LabelWhereInput totalNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput totalNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_NOT_IN);
        return this;
    }

    public void setTotalNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_NUM_NOT_IN);
        }
    }

    public boolean getTotalNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_NUM_NOT_IN);
    }

    public LabelWhereInput value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LabelWhereInput value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public LabelWhereInput value_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        return this;
    }

    public void setValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        }
    }

    public boolean getValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE);
    }

    public LabelWhereInput valueContains(String valueContains) {

        this.valueContains = valueContains;
        return this;
    }

    /**
     * Get valueContains
     *
     * @return valueContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueContains() {
        return valueContains;
    }

    public void setValueContains(String valueContains) {
        this.valueContains = valueContains;
    }

    public LabelWhereInput valueContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_CONTAINS);
        return this;
    }

    public LabelWhereInput valueContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_CONTAINS);
        return this;
    }

    public void setValueContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_CONTAINS);
        }
    }

    public boolean getValueContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_CONTAINS);
    }

    public LabelWhereInput valueEndsWith(String valueEndsWith) {

        this.valueEndsWith = valueEndsWith;
        return this;
    }

    /**
     * Get valueEndsWith
     *
     * @return valueEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueEndsWith() {
        return valueEndsWith;
    }

    public void setValueEndsWith(String valueEndsWith) {
        this.valueEndsWith = valueEndsWith;
    }

    public LabelWhereInput valueEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_ENDS_WITH);
        return this;
    }

    public LabelWhereInput valueEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_ENDS_WITH);
        return this;
    }

    public void setValueEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_ENDS_WITH);
        }
    }

    public boolean getValueEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_ENDS_WITH);
    }

    public LabelWhereInput valueGt(String valueGt) {

        this.valueGt = valueGt;
        return this;
    }

    /**
     * Get valueGt
     *
     * @return valueGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueGt() {
        return valueGt;
    }

    public void setValueGt(String valueGt) {
        this.valueGt = valueGt;
    }

    public LabelWhereInput valueGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_GT);
        return this;
    }

    public LabelWhereInput valueGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_GT);
        return this;
    }

    public void setValueGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_GT);
        }
    }

    public boolean getValueGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_GT);
    }

    public LabelWhereInput valueGte(String valueGte) {

        this.valueGte = valueGte;
        return this;
    }

    /**
     * Get valueGte
     *
     * @return valueGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueGte() {
        return valueGte;
    }

    public void setValueGte(String valueGte) {
        this.valueGte = valueGte;
    }

    public LabelWhereInput valueGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_GTE);
        return this;
    }

    public LabelWhereInput valueGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_GTE);
        return this;
    }

    public void setValueGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_GTE);
        }
    }

    public boolean getValueGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_GTE);
    }

    public LabelWhereInput valueIn(List<String> valueIn) {

        this.valueIn = valueIn;
        return this;
    }

    public LabelWhereInput addValueInItem(String valueInItem) {
        if (this.valueIn == null) {
            this.valueIn = new ArrayList<String>();
        }
        this.valueIn.add(valueInItem);
        return this;
    }

    /**
     * Get valueIn
     *
     * @return valueIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getValueIn() {
        return valueIn;
    }

    public void setValueIn(List<String> valueIn) {
        this.valueIn = valueIn;
    }

    public LabelWhereInput valueIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_IN);
        return this;
    }

    public LabelWhereInput valueIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_IN);
        return this;
    }

    public void setValueIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_IN);
        }
    }

    public boolean getValueIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_IN);
    }

    public LabelWhereInput valueLt(String valueLt) {

        this.valueLt = valueLt;
        return this;
    }

    /**
     * Get valueLt
     *
     * @return valueLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueLt() {
        return valueLt;
    }

    public void setValueLt(String valueLt) {
        this.valueLt = valueLt;
    }

    public LabelWhereInput valueLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_LT);
        return this;
    }

    public LabelWhereInput valueLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_LT);
        return this;
    }

    public void setValueLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_LT);
        }
    }

    public boolean getValueLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_LT);
    }

    public LabelWhereInput valueLte(String valueLte) {

        this.valueLte = valueLte;
        return this;
    }

    /**
     * Get valueLte
     *
     * @return valueLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueLte() {
        return valueLte;
    }

    public void setValueLte(String valueLte) {
        this.valueLte = valueLte;
    }

    public LabelWhereInput valueLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_LTE);
        return this;
    }

    public LabelWhereInput valueLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_LTE);
        return this;
    }

    public void setValueLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_LTE);
        }
    }

    public boolean getValueLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_LTE);
    }

    public LabelWhereInput valueNot(String valueNot) {

        this.valueNot = valueNot;
        return this;
    }

    /**
     * Get valueNot
     *
     * @return valueNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueNot() {
        return valueNot;
    }

    public void setValueNot(String valueNot) {
        this.valueNot = valueNot;
    }

    public LabelWhereInput valueNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT);
        return this;
    }

    public LabelWhereInput valueNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT);
        return this;
    }

    public void setValueNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT);
        }
    }

    public boolean getValueNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_NOT);
    }

    public LabelWhereInput valueNotContains(String valueNotContains) {

        this.valueNotContains = valueNotContains;
        return this;
    }

    /**
     * Get valueNotContains
     *
     * @return valueNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueNotContains() {
        return valueNotContains;
    }

    public void setValueNotContains(String valueNotContains) {
        this.valueNotContains = valueNotContains;
    }

    public LabelWhereInput valueNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_CONTAINS);
        return this;
    }

    public LabelWhereInput valueNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_CONTAINS);
        return this;
    }

    public void setValueNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_CONTAINS);
        }
    }

    public boolean getValueNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_NOT_CONTAINS);
    }

    public LabelWhereInput valueNotEndsWith(String valueNotEndsWith) {

        this.valueNotEndsWith = valueNotEndsWith;
        return this;
    }

    /**
     * Get valueNotEndsWith
     *
     * @return valueNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueNotEndsWith() {
        return valueNotEndsWith;
    }

    public void setValueNotEndsWith(String valueNotEndsWith) {
        this.valueNotEndsWith = valueNotEndsWith;
    }

    public LabelWhereInput valueNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH);
        return this;
    }

    public LabelWhereInput valueNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH);
        return this;
    }

    public void setValueNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH);
        }
    }

    public boolean getValueNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH);
    }

    public LabelWhereInput valueNotIn(List<String> valueNotIn) {

        this.valueNotIn = valueNotIn;
        return this;
    }

    public LabelWhereInput addValueNotInItem(String valueNotInItem) {
        if (this.valueNotIn == null) {
            this.valueNotIn = new ArrayList<String>();
        }
        this.valueNotIn.add(valueNotInItem);
        return this;
    }

    /**
     * Get valueNotIn
     *
     * @return valueNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getValueNotIn() {
        return valueNotIn;
    }

    public void setValueNotIn(List<String> valueNotIn) {
        this.valueNotIn = valueNotIn;
    }

    public LabelWhereInput valueNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_IN);
        return this;
    }

    public LabelWhereInput valueNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_IN);
        return this;
    }

    public void setValueNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_IN);
        }
    }

    public boolean getValueNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_NOT_IN);
    }

    public LabelWhereInput valueNotStartsWith(String valueNotStartsWith) {

        this.valueNotStartsWith = valueNotStartsWith;
        return this;
    }

    /**
     * Get valueNotStartsWith
     *
     * @return valueNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueNotStartsWith() {
        return valueNotStartsWith;
    }

    public void setValueNotStartsWith(String valueNotStartsWith) {
        this.valueNotStartsWith = valueNotStartsWith;
    }

    public LabelWhereInput valueNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH);
        return this;
    }

    public LabelWhereInput valueNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH);
        return this;
    }

    public void setValueNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH);
        }
    }

    public boolean getValueNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH);
    }

    public LabelWhereInput valueStartsWith(String valueStartsWith) {

        this.valueStartsWith = valueStartsWith;
        return this;
    }

    /**
     * Get valueStartsWith
     *
     * @return valueStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValueStartsWith() {
        return valueStartsWith;
    }

    public void setValueStartsWith(String valueStartsWith) {
        this.valueStartsWith = valueStartsWith;
    }

    public LabelWhereInput valueStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE_STARTS_WITH);
        return this;
    }

    public LabelWhereInput valueStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE_STARTS_WITH);
        return this;
    }

    public void setValueStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE_STARTS_WITH);
        }
    }

    public boolean getValueStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE_STARTS_WITH);
    }

    public LabelWhereInput vdsNum(Integer vdsNum) {

        this.vdsNum = vdsNum;
        return this;
    }

    /**
     * Get vdsNum
     *
     * @return vdsNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNum() {
        return vdsNum;
    }

    public void setVdsNum(Integer vdsNum) {
        this.vdsNum = vdsNum;
    }

    public LabelWhereInput vdsNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM);
        return this;
    }

    public LabelWhereInput vdsNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM);
        return this;
    }

    public void setVdsNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM);
        }
    }

    public boolean getVdsNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM);
    }

    public LabelWhereInput vdsNumGt(Integer vdsNumGt) {

        this.vdsNumGt = vdsNumGt;
        return this;
    }

    /**
     * Get vdsNumGt
     *
     * @return vdsNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNumGt() {
        return vdsNumGt;
    }

    public void setVdsNumGt(Integer vdsNumGt) {
        this.vdsNumGt = vdsNumGt;
    }

    public LabelWhereInput vdsNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_GT);
        return this;
    }

    public LabelWhereInput vdsNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_GT);
        return this;
    }

    public void setVdsNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_GT);
        }
    }

    public boolean getVdsNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_GT);
    }

    public LabelWhereInput vdsNumGte(Integer vdsNumGte) {

        this.vdsNumGte = vdsNumGte;
        return this;
    }

    /**
     * Get vdsNumGte
     *
     * @return vdsNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNumGte() {
        return vdsNumGte;
    }

    public void setVdsNumGte(Integer vdsNumGte) {
        this.vdsNumGte = vdsNumGte;
    }

    public LabelWhereInput vdsNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_GTE);
        return this;
    }

    public LabelWhereInput vdsNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_GTE);
        return this;
    }

    public void setVdsNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_GTE);
        }
    }

    public boolean getVdsNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_GTE);
    }

    public LabelWhereInput vdsNumIn(List<Integer> vdsNumIn) {

        this.vdsNumIn = vdsNumIn;
        return this;
    }

    public LabelWhereInput addVdsNumInItem(Integer vdsNumInItem) {
        if (this.vdsNumIn == null) {
            this.vdsNumIn = new ArrayList<Integer>();
        }
        this.vdsNumIn.add(vdsNumInItem);
        return this;
    }

    /**
     * Get vdsNumIn
     *
     * @return vdsNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVdsNumIn() {
        return vdsNumIn;
    }

    public void setVdsNumIn(List<Integer> vdsNumIn) {
        this.vdsNumIn = vdsNumIn;
    }

    public LabelWhereInput vdsNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_IN);
        return this;
    }

    public LabelWhereInput vdsNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_IN);
        return this;
    }

    public void setVdsNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_IN);
        }
    }

    public boolean getVdsNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_IN);
    }

    public LabelWhereInput vdsNumLt(Integer vdsNumLt) {

        this.vdsNumLt = vdsNumLt;
        return this;
    }

    /**
     * Get vdsNumLt
     *
     * @return vdsNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNumLt() {
        return vdsNumLt;
    }

    public void setVdsNumLt(Integer vdsNumLt) {
        this.vdsNumLt = vdsNumLt;
    }

    public LabelWhereInput vdsNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_LT);
        return this;
    }

    public LabelWhereInput vdsNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_LT);
        return this;
    }

    public void setVdsNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_LT);
        }
    }

    public boolean getVdsNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_LT);
    }

    public LabelWhereInput vdsNumLte(Integer vdsNumLte) {

        this.vdsNumLte = vdsNumLte;
        return this;
    }

    /**
     * Get vdsNumLte
     *
     * @return vdsNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNumLte() {
        return vdsNumLte;
    }

    public void setVdsNumLte(Integer vdsNumLte) {
        this.vdsNumLte = vdsNumLte;
    }

    public LabelWhereInput vdsNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_LTE);
        return this;
    }

    public LabelWhereInput vdsNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_LTE);
        return this;
    }

    public void setVdsNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_LTE);
        }
    }

    public boolean getVdsNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_LTE);
    }

    public LabelWhereInput vdsNumNot(Integer vdsNumNot) {

        this.vdsNumNot = vdsNumNot;
        return this;
    }

    /**
     * Get vdsNumNot
     *
     * @return vdsNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVdsNumNot() {
        return vdsNumNot;
    }

    public void setVdsNumNot(Integer vdsNumNot) {
        this.vdsNumNot = vdsNumNot;
    }

    public LabelWhereInput vdsNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_NOT);
        return this;
    }

    public LabelWhereInput vdsNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_NOT);
        return this;
    }

    public void setVdsNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_NOT);
        }
    }

    public boolean getVdsNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_NOT);
    }

    public LabelWhereInput vdsNumNotIn(List<Integer> vdsNumNotIn) {

        this.vdsNumNotIn = vdsNumNotIn;
        return this;
    }

    public LabelWhereInput addVdsNumNotInItem(Integer vdsNumNotInItem) {
        if (this.vdsNumNotIn == null) {
            this.vdsNumNotIn = new ArrayList<Integer>();
        }
        this.vdsNumNotIn.add(vdsNumNotInItem);
        return this;
    }

    /**
     * Get vdsNumNotIn
     *
     * @return vdsNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVdsNumNotIn() {
        return vdsNumNotIn;
    }

    public void setVdsNumNotIn(List<Integer> vdsNumNotIn) {
        this.vdsNumNotIn = vdsNumNotIn;
    }

    public LabelWhereInput vdsNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vdsNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_NOT_IN);
        return this;
    }

    public void setVdsNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NUM_NOT_IN);
        }
    }

    public boolean getVdsNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NUM_NOT_IN);
    }

    public LabelWhereInput vdsesEvery(VdsWhereInput vdsesEvery) {

        this.vdsesEvery = vdsesEvery;
        return this;
    }

    /**
     * Get vdsesEvery
     *
     * @return vdsesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesEvery() {
        return vdsesEvery;
    }

    public void setVdsesEvery(VdsWhereInput vdsesEvery) {
        this.vdsesEvery = vdsesEvery;
    }

    public LabelWhereInput vdsesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_EVERY);
        return this;
    }

    public LabelWhereInput vdsesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_EVERY);
        return this;
    }

    public void setVdsesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_EVERY);
        }
    }

    public boolean getVdsesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_EVERY);
    }

    public LabelWhereInput vdsesNone(VdsWhereInput vdsesNone) {

        this.vdsesNone = vdsesNone;
        return this;
    }

    /**
     * Get vdsesNone
     *
     * @return vdsesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesNone() {
        return vdsesNone;
    }

    public void setVdsesNone(VdsWhereInput vdsesNone) {
        this.vdsesNone = vdsesNone;
    }

    public LabelWhereInput vdsesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_NONE);
        return this;
    }

    public LabelWhereInput vdsesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_NONE);
        return this;
    }

    public void setVdsesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_NONE);
        }
    }

    public boolean getVdsesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_NONE);
    }

    public LabelWhereInput vdsesSome(VdsWhereInput vdsesSome) {

        this.vdsesSome = vdsesSome;
        return this;
    }

    /**
     * Get vdsesSome
     *
     * @return vdsesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdsesSome() {
        return vdsesSome;
    }

    public void setVdsesSome(VdsWhereInput vdsesSome) {
        this.vdsesSome = vdsesSome;
    }

    public LabelWhereInput vdsesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES_SOME);
        return this;
    }

    public LabelWhereInput vdsesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES_SOME);
        return this;
    }

    public void setVdsesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES_SOME);
        }
    }

    public boolean getVdsesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES_SOME);
    }

    public LabelWhereInput vlansEvery(VlanWhereInput vlansEvery) {

        this.vlansEvery = vlansEvery;
        return this;
    }

    /**
     * Get vlansEvery
     *
     * @return vlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansEvery() {
        return vlansEvery;
    }

    public void setVlansEvery(VlanWhereInput vlansEvery) {
        this.vlansEvery = vlansEvery;
    }

    public LabelWhereInput vlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public LabelWhereInput vlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public void setVlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        }
    }

    public boolean getVlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_EVERY);
    }

    public LabelWhereInput vlansNone(VlanWhereInput vlansNone) {

        this.vlansNone = vlansNone;
        return this;
    }

    /**
     * Get vlansNone
     *
     * @return vlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansNone() {
        return vlansNone;
    }

    public void setVlansNone(VlanWhereInput vlansNone) {
        this.vlansNone = vlansNone;
    }

    public LabelWhereInput vlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public LabelWhereInput vlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public void setVlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        }
    }

    public boolean getVlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NONE);
    }

    public LabelWhereInput vlansSome(VlanWhereInput vlansSome) {

        this.vlansSome = vlansSome;
        return this;
    }

    /**
     * Get vlansSome
     *
     * @return vlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansSome() {
        return vlansSome;
    }

    public void setVlansSome(VlanWhereInput vlansSome) {
        this.vlansSome = vlansSome;
    }

    public LabelWhereInput vlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public LabelWhereInput vlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public void setVlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        }
    }

    public boolean getVlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_SOME);
    }

    public LabelWhereInput vmNum(Integer vmNum) {

        this.vmNum = vmNum;
        return this;
    }

    /**
     * Get vmNum
     *
     * @return vmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNum() {
        return vmNum;
    }

    public void setVmNum(Integer vmNum) {
        this.vmNum = vmNum;
    }

    public LabelWhereInput vmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public LabelWhereInput vmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public void setVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        }
    }

    public boolean getVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM);
    }

    public LabelWhereInput vmNumGt(Integer vmNumGt) {

        this.vmNumGt = vmNumGt;
        return this;
    }

    /**
     * Get vmNumGt
     *
     * @return vmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGt() {
        return vmNumGt;
    }

    public void setVmNumGt(Integer vmNumGt) {
        this.vmNumGt = vmNumGt;
    }

    public LabelWhereInput vmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public LabelWhereInput vmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public void setVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        }
    }

    public boolean getVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GT);
    }

    public LabelWhereInput vmNumGte(Integer vmNumGte) {

        this.vmNumGte = vmNumGte;
        return this;
    }

    /**
     * Get vmNumGte
     *
     * @return vmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGte() {
        return vmNumGte;
    }

    public void setVmNumGte(Integer vmNumGte) {
        this.vmNumGte = vmNumGte;
    }

    public LabelWhereInput vmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public void setVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        }
    }

    public boolean getVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GTE);
    }

    public LabelWhereInput vmNumIn(List<Integer> vmNumIn) {

        this.vmNumIn = vmNumIn;
        return this;
    }

    public LabelWhereInput addVmNumInItem(Integer vmNumInItem) {
        if (this.vmNumIn == null) {
            this.vmNumIn = new ArrayList<Integer>();
        }
        this.vmNumIn.add(vmNumInItem);
        return this;
    }

    /**
     * Get vmNumIn
     *
     * @return vmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumIn() {
        return vmNumIn;
    }

    public void setVmNumIn(List<Integer> vmNumIn) {
        this.vmNumIn = vmNumIn;
    }

    public LabelWhereInput vmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public LabelWhereInput vmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public void setVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        }
    }

    public boolean getVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_IN);
    }

    public LabelWhereInput vmNumLt(Integer vmNumLt) {

        this.vmNumLt = vmNumLt;
        return this;
    }

    /**
     * Get vmNumLt
     *
     * @return vmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLt() {
        return vmNumLt;
    }

    public void setVmNumLt(Integer vmNumLt) {
        this.vmNumLt = vmNumLt;
    }

    public LabelWhereInput vmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public LabelWhereInput vmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public void setVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        }
    }

    public boolean getVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LT);
    }

    public LabelWhereInput vmNumLte(Integer vmNumLte) {

        this.vmNumLte = vmNumLte;
        return this;
    }

    /**
     * Get vmNumLte
     *
     * @return vmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLte() {
        return vmNumLte;
    }

    public void setVmNumLte(Integer vmNumLte) {
        this.vmNumLte = vmNumLte;
    }

    public LabelWhereInput vmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public void setVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        }
    }

    public boolean getVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LTE);
    }

    public LabelWhereInput vmNumNot(Integer vmNumNot) {

        this.vmNumNot = vmNumNot;
        return this;
    }

    /**
     * Get vmNumNot
     *
     * @return vmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumNot() {
        return vmNumNot;
    }

    public void setVmNumNot(Integer vmNumNot) {
        this.vmNumNot = vmNumNot;
    }

    public LabelWhereInput vmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public void setVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        }
    }

    public boolean getVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT);
    }

    public LabelWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {

        this.vmNumNotIn = vmNumNotIn;
        return this;
    }

    public LabelWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
        if (this.vmNumNotIn == null) {
            this.vmNumNotIn = new ArrayList<Integer>();
        }
        this.vmNumNotIn.add(vmNumNotInItem);
        return this;
    }

    /**
     * Get vmNumNotIn
     *
     * @return vmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumNotIn() {
        return vmNumNotIn;
    }

    public void setVmNumNotIn(List<Integer> vmNumNotIn) {
        this.vmNumNotIn = vmNumNotIn;
    }

    public LabelWhereInput vmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public void setVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        }
    }

    public boolean getVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT_IN);
    }

    public LabelWhereInput vmSnapshotNum(Integer vmSnapshotNum) {

        this.vmSnapshotNum = vmSnapshotNum;
        return this;
    }

    /**
     * Get vmSnapshotNum
     *
     * @return vmSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNum() {
        return vmSnapshotNum;
    }

    public void setVmSnapshotNum(Integer vmSnapshotNum) {
        this.vmSnapshotNum = vmSnapshotNum;
    }

    public LabelWhereInput vmSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM);
        return this;
    }

    public LabelWhereInput vmSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM);
        return this;
    }

    public void setVmSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM);
        }
    }

    public boolean getVmSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM);
    }

    public LabelWhereInput vmSnapshotNumGt(Integer vmSnapshotNumGt) {

        this.vmSnapshotNumGt = vmSnapshotNumGt;
        return this;
    }

    /**
     * Get vmSnapshotNumGt
     *
     * @return vmSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNumGt() {
        return vmSnapshotNumGt;
    }

    public void setVmSnapshotNumGt(Integer vmSnapshotNumGt) {
        this.vmSnapshotNumGt = vmSnapshotNumGt;
    }

    public LabelWhereInput vmSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT);
        return this;
    }

    public LabelWhereInput vmSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setVmSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getVmSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT);
    }

    public LabelWhereInput vmSnapshotNumGte(Integer vmSnapshotNumGte) {

        this.vmSnapshotNumGte = vmSnapshotNumGte;
        return this;
    }

    /**
     * Get vmSnapshotNumGte
     *
     * @return vmSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNumGte() {
        return vmSnapshotNumGte;
    }

    public void setVmSnapshotNumGte(Integer vmSnapshotNumGte) {
        this.vmSnapshotNumGte = vmSnapshotNumGte;
    }

    public LabelWhereInput vmSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setVmSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getVmSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE);
    }

    public LabelWhereInput vmSnapshotNumIn(List<Integer> vmSnapshotNumIn) {

        this.vmSnapshotNumIn = vmSnapshotNumIn;
        return this;
    }

    public LabelWhereInput addVmSnapshotNumInItem(Integer vmSnapshotNumInItem) {
        if (this.vmSnapshotNumIn == null) {
            this.vmSnapshotNumIn = new ArrayList<Integer>();
        }
        this.vmSnapshotNumIn.add(vmSnapshotNumInItem);
        return this;
    }

    /**
     * Get vmSnapshotNumIn
     *
     * @return vmSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmSnapshotNumIn() {
        return vmSnapshotNumIn;
    }

    public void setVmSnapshotNumIn(List<Integer> vmSnapshotNumIn) {
        this.vmSnapshotNumIn = vmSnapshotNumIn;
    }

    public LabelWhereInput vmSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN);
        return this;
    }

    public LabelWhereInput vmSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setVmSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getVmSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN);
    }

    public LabelWhereInput vmSnapshotNumLt(Integer vmSnapshotNumLt) {

        this.vmSnapshotNumLt = vmSnapshotNumLt;
        return this;
    }

    /**
     * Get vmSnapshotNumLt
     *
     * @return vmSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNumLt() {
        return vmSnapshotNumLt;
    }

    public void setVmSnapshotNumLt(Integer vmSnapshotNumLt) {
        this.vmSnapshotNumLt = vmSnapshotNumLt;
    }

    public LabelWhereInput vmSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT);
        return this;
    }

    public LabelWhereInput vmSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setVmSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getVmSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT);
    }

    public LabelWhereInput vmSnapshotNumLte(Integer vmSnapshotNumLte) {

        this.vmSnapshotNumLte = vmSnapshotNumLte;
        return this;
    }

    /**
     * Get vmSnapshotNumLte
     *
     * @return vmSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNumLte() {
        return vmSnapshotNumLte;
    }

    public void setVmSnapshotNumLte(Integer vmSnapshotNumLte) {
        this.vmSnapshotNumLte = vmSnapshotNumLte;
    }

    public LabelWhereInput vmSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setVmSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getVmSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE);
    }

    public LabelWhereInput vmSnapshotNumNot(Integer vmSnapshotNumNot) {

        this.vmSnapshotNumNot = vmSnapshotNumNot;
        return this;
    }

    /**
     * Get vmSnapshotNumNot
     *
     * @return vmSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmSnapshotNumNot() {
        return vmSnapshotNumNot;
    }

    public void setVmSnapshotNumNot(Integer vmSnapshotNumNot) {
        this.vmSnapshotNumNot = vmSnapshotNumNot;
    }

    public LabelWhereInput vmSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setVmSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getVmSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT);
    }

    public LabelWhereInput vmSnapshotNumNotIn(List<Integer> vmSnapshotNumNotIn) {

        this.vmSnapshotNumNotIn = vmSnapshotNumNotIn;
        return this;
    }

    public LabelWhereInput addVmSnapshotNumNotInItem(Integer vmSnapshotNumNotInItem) {
        if (this.vmSnapshotNumNotIn == null) {
            this.vmSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.vmSnapshotNumNotIn.add(vmSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get vmSnapshotNumNotIn
     *
     * @return vmSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmSnapshotNumNotIn() {
        return vmSnapshotNumNotIn;
    }

    public void setVmSnapshotNumNotIn(List<Integer> vmSnapshotNumNotIn) {
        this.vmSnapshotNumNotIn = vmSnapshotNumNotIn;
    }

    public LabelWhereInput vmSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setVmSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getVmSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN);
    }

    public LabelWhereInput vmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {

        this.vmSnapshotsEvery = vmSnapshotsEvery;
        return this;
    }

    /**
     * Get vmSnapshotsEvery
     *
     * @return vmSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsEvery() {
        return vmSnapshotsEvery;
    }

    public void setVmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
        this.vmSnapshotsEvery = vmSnapshotsEvery;
    }

    public LabelWhereInput vmSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        return this;
    }

    public LabelWhereInput vmSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        return this;
    }

    public void setVmSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        }
    }

    public boolean getVmSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
    }

    public LabelWhereInput vmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {

        this.vmSnapshotsNone = vmSnapshotsNone;
        return this;
    }

    /**
     * Get vmSnapshotsNone
     *
     * @return vmSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsNone() {
        return vmSnapshotsNone;
    }

    public void setVmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
        this.vmSnapshotsNone = vmSnapshotsNone;
    }

    public LabelWhereInput vmSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        return this;
    }

    public LabelWhereInput vmSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        return this;
    }

    public void setVmSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        }
    }

    public boolean getVmSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
    }

    public LabelWhereInput vmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {

        this.vmSnapshotsSome = vmSnapshotsSome;
        return this;
    }

    /**
     * Get vmSnapshotsSome
     *
     * @return vmSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsSome() {
        return vmSnapshotsSome;
    }

    public void setVmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
        this.vmSnapshotsSome = vmSnapshotsSome;
    }

    public LabelWhereInput vmSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        return this;
    }

    public LabelWhereInput vmSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        return this;
    }

    public void setVmSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        }
    }

    public boolean getVmSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
    }

    public LabelWhereInput vmTemplateNum(Integer vmTemplateNum) {

        this.vmTemplateNum = vmTemplateNum;
        return this;
    }

    /**
     * Get vmTemplateNum
     *
     * @return vmTemplateNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNum() {
        return vmTemplateNum;
    }

    public void setVmTemplateNum(Integer vmTemplateNum) {
        this.vmTemplateNum = vmTemplateNum;
    }

    public LabelWhereInput vmTemplateNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM);
        return this;
    }

    public LabelWhereInput vmTemplateNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM);
        return this;
    }

    public void setVmTemplateNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM);
        }
    }

    public boolean getVmTemplateNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM);
    }

    public LabelWhereInput vmTemplateNumGt(Integer vmTemplateNumGt) {

        this.vmTemplateNumGt = vmTemplateNumGt;
        return this;
    }

    /**
     * Get vmTemplateNumGt
     *
     * @return vmTemplateNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNumGt() {
        return vmTemplateNumGt;
    }

    public void setVmTemplateNumGt(Integer vmTemplateNumGt) {
        this.vmTemplateNumGt = vmTemplateNumGt;
    }

    public LabelWhereInput vmTemplateNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT);
        return this;
    }

    public LabelWhereInput vmTemplateNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT);
        return this;
    }

    public void setVmTemplateNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT);
        }
    }

    public boolean getVmTemplateNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT);
    }

    public LabelWhereInput vmTemplateNumGte(Integer vmTemplateNumGte) {

        this.vmTemplateNumGte = vmTemplateNumGte;
        return this;
    }

    /**
     * Get vmTemplateNumGte
     *
     * @return vmTemplateNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNumGte() {
        return vmTemplateNumGte;
    }

    public void setVmTemplateNumGte(Integer vmTemplateNumGte) {
        this.vmTemplateNumGte = vmTemplateNumGte;
    }

    public LabelWhereInput vmTemplateNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmTemplateNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE);
        return this;
    }

    public void setVmTemplateNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE);
        }
    }

    public boolean getVmTemplateNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE);
    }

    public LabelWhereInput vmTemplateNumIn(List<Integer> vmTemplateNumIn) {

        this.vmTemplateNumIn = vmTemplateNumIn;
        return this;
    }

    public LabelWhereInput addVmTemplateNumInItem(Integer vmTemplateNumInItem) {
        if (this.vmTemplateNumIn == null) {
            this.vmTemplateNumIn = new ArrayList<Integer>();
        }
        this.vmTemplateNumIn.add(vmTemplateNumInItem);
        return this;
    }

    /**
     * Get vmTemplateNumIn
     *
     * @return vmTemplateNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmTemplateNumIn() {
        return vmTemplateNumIn;
    }

    public void setVmTemplateNumIn(List<Integer> vmTemplateNumIn) {
        this.vmTemplateNumIn = vmTemplateNumIn;
    }

    public LabelWhereInput vmTemplateNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN);
        return this;
    }

    public LabelWhereInput vmTemplateNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN);
        return this;
    }

    public void setVmTemplateNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN);
        }
    }

    public boolean getVmTemplateNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN);
    }

    public LabelWhereInput vmTemplateNumLt(Integer vmTemplateNumLt) {

        this.vmTemplateNumLt = vmTemplateNumLt;
        return this;
    }

    /**
     * Get vmTemplateNumLt
     *
     * @return vmTemplateNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNumLt() {
        return vmTemplateNumLt;
    }

    public void setVmTemplateNumLt(Integer vmTemplateNumLt) {
        this.vmTemplateNumLt = vmTemplateNumLt;
    }

    public LabelWhereInput vmTemplateNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT);
        return this;
    }

    public LabelWhereInput vmTemplateNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT);
        return this;
    }

    public void setVmTemplateNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT);
        }
    }

    public boolean getVmTemplateNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT);
    }

    public LabelWhereInput vmTemplateNumLte(Integer vmTemplateNumLte) {

        this.vmTemplateNumLte = vmTemplateNumLte;
        return this;
    }

    /**
     * Get vmTemplateNumLte
     *
     * @return vmTemplateNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNumLte() {
        return vmTemplateNumLte;
    }

    public void setVmTemplateNumLte(Integer vmTemplateNumLte) {
        this.vmTemplateNumLte = vmTemplateNumLte;
    }

    public LabelWhereInput vmTemplateNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmTemplateNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE);
        return this;
    }

    public void setVmTemplateNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE);
        }
    }

    public boolean getVmTemplateNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE);
    }

    public LabelWhereInput vmTemplateNumNot(Integer vmTemplateNumNot) {

        this.vmTemplateNumNot = vmTemplateNumNot;
        return this;
    }

    /**
     * Get vmTemplateNumNot
     *
     * @return vmTemplateNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmTemplateNumNot() {
        return vmTemplateNumNot;
    }

    public void setVmTemplateNumNot(Integer vmTemplateNumNot) {
        this.vmTemplateNumNot = vmTemplateNumNot;
    }

    public LabelWhereInput vmTemplateNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmTemplateNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT);
        return this;
    }

    public void setVmTemplateNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT);
        }
    }

    public boolean getVmTemplateNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT);
    }

    public LabelWhereInput vmTemplateNumNotIn(List<Integer> vmTemplateNumNotIn) {

        this.vmTemplateNumNotIn = vmTemplateNumNotIn;
        return this;
    }

    public LabelWhereInput addVmTemplateNumNotInItem(Integer vmTemplateNumNotInItem) {
        if (this.vmTemplateNumNotIn == null) {
            this.vmTemplateNumNotIn = new ArrayList<Integer>();
        }
        this.vmTemplateNumNotIn.add(vmTemplateNumNotInItem);
        return this;
    }

    /**
     * Get vmTemplateNumNotIn
     *
     * @return vmTemplateNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmTemplateNumNotIn() {
        return vmTemplateNumNotIn;
    }

    public void setVmTemplateNumNotIn(List<Integer> vmTemplateNumNotIn) {
        this.vmTemplateNumNotIn = vmTemplateNumNotIn;
    }

    public LabelWhereInput vmTemplateNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmTemplateNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN);
        return this;
    }

    public void setVmTemplateNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN);
        }
    }

    public boolean getVmTemplateNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN);
    }

    public LabelWhereInput vmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {

        this.vmTemplatesEvery = vmTemplatesEvery;
        return this;
    }

    /**
     * Get vmTemplatesEvery
     *
     * @return vmTemplatesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesEvery() {
        return vmTemplatesEvery;
    }

    public void setVmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
        this.vmTemplatesEvery = vmTemplatesEvery;
    }

    public LabelWhereInput vmTemplatesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public LabelWhereInput vmTemplatesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public void setVmTemplatesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        }
    }

    public boolean getVmTemplatesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
    }

    public LabelWhereInput vmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {

        this.vmTemplatesNone = vmTemplatesNone;
        return this;
    }

    /**
     * Get vmTemplatesNone
     *
     * @return vmTemplatesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesNone() {
        return vmTemplatesNone;
    }

    public void setVmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
        this.vmTemplatesNone = vmTemplatesNone;
    }

    public LabelWhereInput vmTemplatesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public LabelWhereInput vmTemplatesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public void setVmTemplatesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        }
    }

    public boolean getVmTemplatesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_NONE);
    }

    public LabelWhereInput vmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {

        this.vmTemplatesSome = vmTemplatesSome;
        return this;
    }

    /**
     * Get vmTemplatesSome
     *
     * @return vmTemplatesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesSome() {
        return vmTemplatesSome;
    }

    public void setVmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
        this.vmTemplatesSome = vmTemplatesSome;
    }

    public LabelWhereInput vmTemplatesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public LabelWhereInput vmTemplatesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public void setVmTemplatesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        }
    }

    public boolean getVmTemplatesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_SOME);
    }

    public LabelWhereInput vmVlanNum(Integer vmVlanNum) {

        this.vmVlanNum = vmVlanNum;
        return this;
    }

    /**
     * Get vmVlanNum
     *
     * @return vmVlanNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNum() {
        return vmVlanNum;
    }

    public void setVmVlanNum(Integer vmVlanNum) {
        this.vmVlanNum = vmVlanNum;
    }

    public LabelWhereInput vmVlanNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM);
        return this;
    }

    public LabelWhereInput vmVlanNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM);
        return this;
    }

    public void setVmVlanNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM);
        }
    }

    public boolean getVmVlanNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM);
    }

    public LabelWhereInput vmVlanNumGt(Integer vmVlanNumGt) {

        this.vmVlanNumGt = vmVlanNumGt;
        return this;
    }

    /**
     * Get vmVlanNumGt
     *
     * @return vmVlanNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNumGt() {
        return vmVlanNumGt;
    }

    public void setVmVlanNumGt(Integer vmVlanNumGt) {
        this.vmVlanNumGt = vmVlanNumGt;
    }

    public LabelWhereInput vmVlanNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_GT);
        return this;
    }

    public LabelWhereInput vmVlanNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_GT);
        return this;
    }

    public void setVmVlanNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_GT);
        }
    }

    public boolean getVmVlanNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_GT);
    }

    public LabelWhereInput vmVlanNumGte(Integer vmVlanNumGte) {

        this.vmVlanNumGte = vmVlanNumGte;
        return this;
    }

    /**
     * Get vmVlanNumGte
     *
     * @return vmVlanNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNumGte() {
        return vmVlanNumGte;
    }

    public void setVmVlanNumGte(Integer vmVlanNumGte) {
        this.vmVlanNumGte = vmVlanNumGte;
    }

    public LabelWhereInput vmVlanNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmVlanNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_GTE);
        return this;
    }

    public void setVmVlanNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_GTE);
        }
    }

    public boolean getVmVlanNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_GTE);
    }

    public LabelWhereInput vmVlanNumIn(List<Integer> vmVlanNumIn) {

        this.vmVlanNumIn = vmVlanNumIn;
        return this;
    }

    public LabelWhereInput addVmVlanNumInItem(Integer vmVlanNumInItem) {
        if (this.vmVlanNumIn == null) {
            this.vmVlanNumIn = new ArrayList<Integer>();
        }
        this.vmVlanNumIn.add(vmVlanNumInItem);
        return this;
    }

    /**
     * Get vmVlanNumIn
     *
     * @return vmVlanNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVlanNumIn() {
        return vmVlanNumIn;
    }

    public void setVmVlanNumIn(List<Integer> vmVlanNumIn) {
        this.vmVlanNumIn = vmVlanNumIn;
    }

    public LabelWhereInput vmVlanNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_IN);
        return this;
    }

    public LabelWhereInput vmVlanNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_IN);
        return this;
    }

    public void setVmVlanNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_IN);
        }
    }

    public boolean getVmVlanNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_IN);
    }

    public LabelWhereInput vmVlanNumLt(Integer vmVlanNumLt) {

        this.vmVlanNumLt = vmVlanNumLt;
        return this;
    }

    /**
     * Get vmVlanNumLt
     *
     * @return vmVlanNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNumLt() {
        return vmVlanNumLt;
    }

    public void setVmVlanNumLt(Integer vmVlanNumLt) {
        this.vmVlanNumLt = vmVlanNumLt;
    }

    public LabelWhereInput vmVlanNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_LT);
        return this;
    }

    public LabelWhereInput vmVlanNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_LT);
        return this;
    }

    public void setVmVlanNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_LT);
        }
    }

    public boolean getVmVlanNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_LT);
    }

    public LabelWhereInput vmVlanNumLte(Integer vmVlanNumLte) {

        this.vmVlanNumLte = vmVlanNumLte;
        return this;
    }

    /**
     * Get vmVlanNumLte
     *
     * @return vmVlanNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNumLte() {
        return vmVlanNumLte;
    }

    public void setVmVlanNumLte(Integer vmVlanNumLte) {
        this.vmVlanNumLte = vmVlanNumLte;
    }

    public LabelWhereInput vmVlanNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmVlanNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_LTE);
        return this;
    }

    public void setVmVlanNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_LTE);
        }
    }

    public boolean getVmVlanNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_LTE);
    }

    public LabelWhereInput vmVlanNumNot(Integer vmVlanNumNot) {

        this.vmVlanNumNot = vmVlanNumNot;
        return this;
    }

    /**
     * Get vmVlanNumNot
     *
     * @return vmVlanNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVlanNumNot() {
        return vmVlanNumNot;
    }

    public void setVmVlanNumNot(Integer vmVlanNumNot) {
        this.vmVlanNumNot = vmVlanNumNot;
    }

    public LabelWhereInput vmVlanNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmVlanNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_NOT);
        return this;
    }

    public void setVmVlanNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_NOT);
        }
    }

    public boolean getVmVlanNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_NOT);
    }

    public LabelWhereInput vmVlanNumNotIn(List<Integer> vmVlanNumNotIn) {

        this.vmVlanNumNotIn = vmVlanNumNotIn;
        return this;
    }

    public LabelWhereInput addVmVlanNumNotInItem(Integer vmVlanNumNotInItem) {
        if (this.vmVlanNumNotIn == null) {
            this.vmVlanNumNotIn = new ArrayList<Integer>();
        }
        this.vmVlanNumNotIn.add(vmVlanNumNotInItem);
        return this;
    }

    /**
     * Get vmVlanNumNotIn
     *
     * @return vmVlanNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVlanNumNotIn() {
        return vmVlanNumNotIn;
    }

    public void setVmVlanNumNotIn(List<Integer> vmVlanNumNotIn) {
        this.vmVlanNumNotIn = vmVlanNumNotIn;
    }

    public LabelWhereInput vmVlanNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmVlanNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN);
        return this;
    }

    public void setVmVlanNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN);
        }
    }

    public boolean getVmVlanNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN);
    }

    public LabelWhereInput vmVolumeNum(Integer vmVolumeNum) {

        this.vmVolumeNum = vmVolumeNum;
        return this;
    }

    /**
     * Get vmVolumeNum
     *
     * @return vmVolumeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNum() {
        return vmVolumeNum;
    }

    public void setVmVolumeNum(Integer vmVolumeNum) {
        this.vmVolumeNum = vmVolumeNum;
    }

    public LabelWhereInput vmVolumeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM);
        return this;
    }

    public LabelWhereInput vmVolumeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM);
        return this;
    }

    public void setVmVolumeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM);
        }
    }

    public boolean getVmVolumeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM);
    }

    public LabelWhereInput vmVolumeNumGt(Integer vmVolumeNumGt) {

        this.vmVolumeNumGt = vmVolumeNumGt;
        return this;
    }

    /**
     * Get vmVolumeNumGt
     *
     * @return vmVolumeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNumGt() {
        return vmVolumeNumGt;
    }

    public void setVmVolumeNumGt(Integer vmVolumeNumGt) {
        this.vmVolumeNumGt = vmVolumeNumGt;
    }

    public LabelWhereInput vmVolumeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_GT);
        return this;
    }

    public LabelWhereInput vmVolumeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_GT);
        return this;
    }

    public void setVmVolumeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_GT);
        }
    }

    public boolean getVmVolumeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_GT);
    }

    public LabelWhereInput vmVolumeNumGte(Integer vmVolumeNumGte) {

        this.vmVolumeNumGte = vmVolumeNumGte;
        return this;
    }

    /**
     * Get vmVolumeNumGte
     *
     * @return vmVolumeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNumGte() {
        return vmVolumeNumGte;
    }

    public void setVmVolumeNumGte(Integer vmVolumeNumGte) {
        this.vmVolumeNumGte = vmVolumeNumGte;
    }

    public LabelWhereInput vmVolumeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmVolumeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_GTE);
        return this;
    }

    public void setVmVolumeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_GTE);
        }
    }

    public boolean getVmVolumeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_GTE);
    }

    public LabelWhereInput vmVolumeNumIn(List<Integer> vmVolumeNumIn) {

        this.vmVolumeNumIn = vmVolumeNumIn;
        return this;
    }

    public LabelWhereInput addVmVolumeNumInItem(Integer vmVolumeNumInItem) {
        if (this.vmVolumeNumIn == null) {
            this.vmVolumeNumIn = new ArrayList<Integer>();
        }
        this.vmVolumeNumIn.add(vmVolumeNumInItem);
        return this;
    }

    /**
     * Get vmVolumeNumIn
     *
     * @return vmVolumeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVolumeNumIn() {
        return vmVolumeNumIn;
    }

    public void setVmVolumeNumIn(List<Integer> vmVolumeNumIn) {
        this.vmVolumeNumIn = vmVolumeNumIn;
    }

    public LabelWhereInput vmVolumeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_IN);
        return this;
    }

    public LabelWhereInput vmVolumeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_IN);
        return this;
    }

    public void setVmVolumeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_IN);
        }
    }

    public boolean getVmVolumeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_IN);
    }

    public LabelWhereInput vmVolumeNumLt(Integer vmVolumeNumLt) {

        this.vmVolumeNumLt = vmVolumeNumLt;
        return this;
    }

    /**
     * Get vmVolumeNumLt
     *
     * @return vmVolumeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNumLt() {
        return vmVolumeNumLt;
    }

    public void setVmVolumeNumLt(Integer vmVolumeNumLt) {
        this.vmVolumeNumLt = vmVolumeNumLt;
    }

    public LabelWhereInput vmVolumeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_LT);
        return this;
    }

    public LabelWhereInput vmVolumeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_LT);
        return this;
    }

    public void setVmVolumeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_LT);
        }
    }

    public boolean getVmVolumeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_LT);
    }

    public LabelWhereInput vmVolumeNumLte(Integer vmVolumeNumLte) {

        this.vmVolumeNumLte = vmVolumeNumLte;
        return this;
    }

    /**
     * Get vmVolumeNumLte
     *
     * @return vmVolumeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNumLte() {
        return vmVolumeNumLte;
    }

    public void setVmVolumeNumLte(Integer vmVolumeNumLte) {
        this.vmVolumeNumLte = vmVolumeNumLte;
    }

    public LabelWhereInput vmVolumeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmVolumeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_LTE);
        return this;
    }

    public void setVmVolumeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_LTE);
        }
    }

    public boolean getVmVolumeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_LTE);
    }

    public LabelWhereInput vmVolumeNumNot(Integer vmVolumeNumNot) {

        this.vmVolumeNumNot = vmVolumeNumNot;
        return this;
    }

    /**
     * Get vmVolumeNumNot
     *
     * @return vmVolumeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeNumNot() {
        return vmVolumeNumNot;
    }

    public void setVmVolumeNumNot(Integer vmVolumeNumNot) {
        this.vmVolumeNumNot = vmVolumeNumNot;
    }

    public LabelWhereInput vmVolumeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmVolumeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_NOT);
        return this;
    }

    public void setVmVolumeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_NOT);
        }
    }

    public boolean getVmVolumeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_NOT);
    }

    public LabelWhereInput vmVolumeNumNotIn(List<Integer> vmVolumeNumNotIn) {

        this.vmVolumeNumNotIn = vmVolumeNumNotIn;
        return this;
    }

    public LabelWhereInput addVmVolumeNumNotInItem(Integer vmVolumeNumNotInItem) {
        if (this.vmVolumeNumNotIn == null) {
            this.vmVolumeNumNotIn = new ArrayList<Integer>();
        }
        this.vmVolumeNumNotIn.add(vmVolumeNumNotInItem);
        return this;
    }

    /**
     * Get vmVolumeNumNotIn
     *
     * @return vmVolumeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVolumeNumNotIn() {
        return vmVolumeNumNotIn;
    }

    public void setVmVolumeNumNotIn(List<Integer> vmVolumeNumNotIn) {
        this.vmVolumeNumNotIn = vmVolumeNumNotIn;
    }

    public LabelWhereInput vmVolumeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmVolumeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN);
        return this;
    }

    public void setVmVolumeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN);
        }
    }

    public boolean getVmVolumeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN);
    }

    public LabelWhereInput vmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {

        this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNum
     *
     * @return vmVolumeSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNum() {
        return vmVolumeSnapshotNum;
    }

    public void setVmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
        this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
    }

    public LabelWhereInput vmVolumeSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM);
        return this;
    }

    public void setVmVolumeSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM);
        }
    }

    public boolean getVmVolumeSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM);
    }

    public LabelWhereInput vmVolumeSnapshotNumGt(Integer vmVolumeSnapshotNumGt) {

        this.vmVolumeSnapshotNumGt = vmVolumeSnapshotNumGt;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumGt
     *
     * @return vmVolumeSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNumGt() {
        return vmVolumeSnapshotNumGt;
    }

    public void setVmVolumeSnapshotNumGt(Integer vmVolumeSnapshotNumGt) {
        this.vmVolumeSnapshotNumGt = vmVolumeSnapshotNumGt;
    }

    public LabelWhereInput vmVolumeSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setVmVolumeSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getVmVolumeSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT);
    }

    public LabelWhereInput vmVolumeSnapshotNumGte(Integer vmVolumeSnapshotNumGte) {

        this.vmVolumeSnapshotNumGte = vmVolumeSnapshotNumGte;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumGte
     *
     * @return vmVolumeSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNumGte() {
        return vmVolumeSnapshotNumGte;
    }

    public void setVmVolumeSnapshotNumGte(Integer vmVolumeSnapshotNumGte) {
        this.vmVolumeSnapshotNumGte = vmVolumeSnapshotNumGte;
    }

    public LabelWhereInput vmVolumeSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setVmVolumeSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getVmVolumeSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE);
    }

    public LabelWhereInput vmVolumeSnapshotNumIn(List<Integer> vmVolumeSnapshotNumIn) {

        this.vmVolumeSnapshotNumIn = vmVolumeSnapshotNumIn;
        return this;
    }

    public LabelWhereInput addVmVolumeSnapshotNumInItem(Integer vmVolumeSnapshotNumInItem) {
        if (this.vmVolumeSnapshotNumIn == null) {
            this.vmVolumeSnapshotNumIn = new ArrayList<Integer>();
        }
        this.vmVolumeSnapshotNumIn.add(vmVolumeSnapshotNumInItem);
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumIn
     *
     * @return vmVolumeSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVolumeSnapshotNumIn() {
        return vmVolumeSnapshotNumIn;
    }

    public void setVmVolumeSnapshotNumIn(List<Integer> vmVolumeSnapshotNumIn) {
        this.vmVolumeSnapshotNumIn = vmVolumeSnapshotNumIn;
    }

    public LabelWhereInput vmVolumeSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setVmVolumeSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getVmVolumeSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN);
    }

    public LabelWhereInput vmVolumeSnapshotNumLt(Integer vmVolumeSnapshotNumLt) {

        this.vmVolumeSnapshotNumLt = vmVolumeSnapshotNumLt;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumLt
     *
     * @return vmVolumeSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNumLt() {
        return vmVolumeSnapshotNumLt;
    }

    public void setVmVolumeSnapshotNumLt(Integer vmVolumeSnapshotNumLt) {
        this.vmVolumeSnapshotNumLt = vmVolumeSnapshotNumLt;
    }

    public LabelWhereInput vmVolumeSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setVmVolumeSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getVmVolumeSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT);
    }

    public LabelWhereInput vmVolumeSnapshotNumLte(Integer vmVolumeSnapshotNumLte) {

        this.vmVolumeSnapshotNumLte = vmVolumeSnapshotNumLte;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumLte
     *
     * @return vmVolumeSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNumLte() {
        return vmVolumeSnapshotNumLte;
    }

    public void setVmVolumeSnapshotNumLte(Integer vmVolumeSnapshotNumLte) {
        this.vmVolumeSnapshotNumLte = vmVolumeSnapshotNumLte;
    }

    public LabelWhereInput vmVolumeSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setVmVolumeSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getVmVolumeSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE);
    }

    public LabelWhereInput vmVolumeSnapshotNumNot(Integer vmVolumeSnapshotNumNot) {

        this.vmVolumeSnapshotNumNot = vmVolumeSnapshotNumNot;
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumNot
     *
     * @return vmVolumeSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmVolumeSnapshotNumNot() {
        return vmVolumeSnapshotNumNot;
    }

    public void setVmVolumeSnapshotNumNot(Integer vmVolumeSnapshotNumNot) {
        this.vmVolumeSnapshotNumNot = vmVolumeSnapshotNumNot;
    }

    public LabelWhereInput vmVolumeSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setVmVolumeSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getVmVolumeSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT);
    }

    public LabelWhereInput vmVolumeSnapshotNumNotIn(List<Integer> vmVolumeSnapshotNumNotIn) {

        this.vmVolumeSnapshotNumNotIn = vmVolumeSnapshotNumNotIn;
        return this;
    }

    public LabelWhereInput addVmVolumeSnapshotNumNotInItem(Integer vmVolumeSnapshotNumNotInItem) {
        if (this.vmVolumeSnapshotNumNotIn == null) {
            this.vmVolumeSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.vmVolumeSnapshotNumNotIn.add(vmVolumeSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get vmVolumeSnapshotNumNotIn
     *
     * @return vmVolumeSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmVolumeSnapshotNumNotIn() {
        return vmVolumeSnapshotNumNotIn;
    }

    public void setVmVolumeSnapshotNumNotIn(List<Integer> vmVolumeSnapshotNumNotIn) {
        this.vmVolumeSnapshotNumNotIn = vmVolumeSnapshotNumNotIn;
    }

    public LabelWhereInput vmVolumeSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setVmVolumeSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getVmVolumeSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN);
    }

    public LabelWhereInput vmVolumeSnapshotsEvery(
            VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery) {

        this.vmVolumeSnapshotsEvery = vmVolumeSnapshotsEvery;
        return this;
    }

    /**
     * Get vmVolumeSnapshotsEvery
     *
     * @return vmVolumeSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsEvery() {
        return vmVolumeSnapshotsEvery;
    }

    public void setVmVolumeSnapshotsEvery(VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery) {
        this.vmVolumeSnapshotsEvery = vmVolumeSnapshotsEvery;
    }

    public LabelWhereInput vmVolumeSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY);
        return this;
    }

    public void setVmVolumeSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY);
        }
    }

    public boolean getVmVolumeSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY);
    }

    public LabelWhereInput vmVolumeSnapshotsNone(VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone) {

        this.vmVolumeSnapshotsNone = vmVolumeSnapshotsNone;
        return this;
    }

    /**
     * Get vmVolumeSnapshotsNone
     *
     * @return vmVolumeSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsNone() {
        return vmVolumeSnapshotsNone;
    }

    public void setVmVolumeSnapshotsNone(VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone) {
        this.vmVolumeSnapshotsNone = vmVolumeSnapshotsNone;
    }

    public LabelWhereInput vmVolumeSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE);
        return this;
    }

    public void setVmVolumeSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE);
        }
    }

    public boolean getVmVolumeSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE);
    }

    public LabelWhereInput vmVolumeSnapshotsSome(VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome) {

        this.vmVolumeSnapshotsSome = vmVolumeSnapshotsSome;
        return this;
    }

    /**
     * Get vmVolumeSnapshotsSome
     *
     * @return vmVolumeSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsSome() {
        return vmVolumeSnapshotsSome;
    }

    public void setVmVolumeSnapshotsSome(VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome) {
        this.vmVolumeSnapshotsSome = vmVolumeSnapshotsSome;
    }

    public LabelWhereInput vmVolumeSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME);
        return this;
    }

    public LabelWhereInput vmVolumeSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME);
        return this;
    }

    public void setVmVolumeSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME);
        }
    }

    public boolean getVmVolumeSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME);
    }

    public LabelWhereInput vmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {

        this.vmVolumesEvery = vmVolumesEvery;
        return this;
    }

    /**
     * Get vmVolumesEvery
     *
     * @return vmVolumesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesEvery() {
        return vmVolumesEvery;
    }

    public void setVmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {
        this.vmVolumesEvery = vmVolumesEvery;
    }

    public LabelWhereInput vmVolumesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        return this;
    }

    public LabelWhereInput vmVolumesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        return this;
    }

    public void setVmVolumesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        }
    }

    public boolean getVmVolumesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_EVERY);
    }

    public LabelWhereInput vmVolumesNone(VmVolumeWhereInput vmVolumesNone) {

        this.vmVolumesNone = vmVolumesNone;
        return this;
    }

    /**
     * Get vmVolumesNone
     *
     * @return vmVolumesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesNone() {
        return vmVolumesNone;
    }

    public void setVmVolumesNone(VmVolumeWhereInput vmVolumesNone) {
        this.vmVolumesNone = vmVolumesNone;
    }

    public LabelWhereInput vmVolumesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_NONE);
        return this;
    }

    public LabelWhereInput vmVolumesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_NONE);
        return this;
    }

    public void setVmVolumesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_NONE);
        }
    }

    public boolean getVmVolumesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_NONE);
    }

    public LabelWhereInput vmVolumesSome(VmVolumeWhereInput vmVolumesSome) {

        this.vmVolumesSome = vmVolumesSome;
        return this;
    }

    /**
     * Get vmVolumesSome
     *
     * @return vmVolumesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesSome() {
        return vmVolumesSome;
    }

    public void setVmVolumesSome(VmVolumeWhereInput vmVolumesSome) {
        this.vmVolumesSome = vmVolumesSome;
    }

    public LabelWhereInput vmVolumesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_SOME);
        return this;
    }

    public LabelWhereInput vmVolumesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_SOME);
        return this;
    }

    public void setVmVolumesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_SOME);
        }
    }

    public boolean getVmVolumesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_SOME);
    }

    public LabelWhereInput vmsEvery(VmWhereInput vmsEvery) {

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

    public LabelWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public LabelWhereInput vmsEvery_ExplictlyNonNull() {
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

    public LabelWhereInput vmsNone(VmWhereInput vmsNone) {

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

    public LabelWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public LabelWhereInput vmsNone_ExplictlyNonNull() {
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

    public LabelWhereInput vmsSome(VmWhereInput vmsSome) {

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

    public LabelWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public LabelWhereInput vmsSome_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelWhereInput labelWhereInput = (LabelWhereInput) o;
        return Objects.equals(this.AND, labelWhereInput.AND)
                && Objects.equals(this.NOT, labelWhereInput.NOT)
                && Objects.equals(this.OR, labelWhereInput.OR)
                && Objects.equals(this.clusterNum, labelWhereInput.clusterNum)
                && Objects.equals(this.clusterNumGt, labelWhereInput.clusterNumGt)
                && Objects.equals(this.clusterNumGte, labelWhereInput.clusterNumGte)
                && Objects.equals(this.clusterNumIn, labelWhereInput.clusterNumIn)
                && Objects.equals(this.clusterNumLt, labelWhereInput.clusterNumLt)
                && Objects.equals(this.clusterNumLte, labelWhereInput.clusterNumLte)
                && Objects.equals(this.clusterNumNot, labelWhereInput.clusterNumNot)
                && Objects.equals(this.clusterNumNotIn, labelWhereInput.clusterNumNotIn)
                && Objects.equals(this.clustersEvery, labelWhereInput.clustersEvery)
                && Objects.equals(this.clustersNone, labelWhereInput.clustersNone)
                && Objects.equals(this.clustersSome, labelWhereInput.clustersSome)
                && Objects.equals(this.consistencyGroupNum, labelWhereInput.consistencyGroupNum)
                && Objects.equals(this.consistencyGroupNumGt, labelWhereInput.consistencyGroupNumGt)
                && Objects.equals(
                        this.consistencyGroupNumGte, labelWhereInput.consistencyGroupNumGte)
                && Objects.equals(this.consistencyGroupNumIn, labelWhereInput.consistencyGroupNumIn)
                && Objects.equals(this.consistencyGroupNumLt, labelWhereInput.consistencyGroupNumLt)
                && Objects.equals(
                        this.consistencyGroupNumLte, labelWhereInput.consistencyGroupNumLte)
                && Objects.equals(
                        this.consistencyGroupNumNot, labelWhereInput.consistencyGroupNumNot)
                && Objects.equals(
                        this.consistencyGroupNumNotIn, labelWhereInput.consistencyGroupNumNotIn)
                && Objects.equals(
                        this.consistencyGroupSnapshotNum,
                        labelWhereInput.consistencyGroupSnapshotNum)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumGt,
                        labelWhereInput.consistencyGroupSnapshotNumGt)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumGte,
                        labelWhereInput.consistencyGroupSnapshotNumGte)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumIn,
                        labelWhereInput.consistencyGroupSnapshotNumIn)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumLt,
                        labelWhereInput.consistencyGroupSnapshotNumLt)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumLte,
                        labelWhereInput.consistencyGroupSnapshotNumLte)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumNot,
                        labelWhereInput.consistencyGroupSnapshotNumNot)
                && Objects.equals(
                        this.consistencyGroupSnapshotNumNotIn,
                        labelWhereInput.consistencyGroupSnapshotNumNotIn)
                && Objects.equals(
                        this.consistencyGroupSnapshotsEvery,
                        labelWhereInput.consistencyGroupSnapshotsEvery)
                && Objects.equals(
                        this.consistencyGroupSnapshotsNone,
                        labelWhereInput.consistencyGroupSnapshotsNone)
                && Objects.equals(
                        this.consistencyGroupSnapshotsSome,
                        labelWhereInput.consistencyGroupSnapshotsSome)
                && Objects.equals(
                        this.consistencyGroupsEvery, labelWhereInput.consistencyGroupsEvery)
                && Objects.equals(this.consistencyGroupsNone, labelWhereInput.consistencyGroupsNone)
                && Objects.equals(this.consistencyGroupsSome, labelWhereInput.consistencyGroupsSome)
                && Objects.equals(
                        this.contentLibraryImageNum, labelWhereInput.contentLibraryImageNum)
                && Objects.equals(
                        this.contentLibraryImageNumGt, labelWhereInput.contentLibraryImageNumGt)
                && Objects.equals(
                        this.contentLibraryImageNumGte, labelWhereInput.contentLibraryImageNumGte)
                && Objects.equals(
                        this.contentLibraryImageNumIn, labelWhereInput.contentLibraryImageNumIn)
                && Objects.equals(
                        this.contentLibraryImageNumLt, labelWhereInput.contentLibraryImageNumLt)
                && Objects.equals(
                        this.contentLibraryImageNumLte, labelWhereInput.contentLibraryImageNumLte)
                && Objects.equals(
                        this.contentLibraryImageNumNot, labelWhereInput.contentLibraryImageNumNot)
                && Objects.equals(
                        this.contentLibraryImageNumNotIn,
                        labelWhereInput.contentLibraryImageNumNotIn)
                && Objects.equals(
                        this.contentLibraryImagesEvery, labelWhereInput.contentLibraryImagesEvery)
                && Objects.equals(
                        this.contentLibraryImagesNone, labelWhereInput.contentLibraryImagesNone)
                && Objects.equals(
                        this.contentLibraryImagesSome, labelWhereInput.contentLibraryImagesSome)
                && Objects.equals(
                        this.contentLibraryVmTemplateNum,
                        labelWhereInput.contentLibraryVmTemplateNum)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumGt,
                        labelWhereInput.contentLibraryVmTemplateNumGt)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumGte,
                        labelWhereInput.contentLibraryVmTemplateNumGte)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumIn,
                        labelWhereInput.contentLibraryVmTemplateNumIn)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumLt,
                        labelWhereInput.contentLibraryVmTemplateNumLt)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumLte,
                        labelWhereInput.contentLibraryVmTemplateNumLte)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumNot,
                        labelWhereInput.contentLibraryVmTemplateNumNot)
                && Objects.equals(
                        this.contentLibraryVmTemplateNumNotIn,
                        labelWhereInput.contentLibraryVmTemplateNumNotIn)
                && Objects.equals(
                        this.contentLibraryVmTemplatesEvery,
                        labelWhereInput.contentLibraryVmTemplatesEvery)
                && Objects.equals(
                        this.contentLibraryVmTemplatesNone,
                        labelWhereInput.contentLibraryVmTemplatesNone)
                && Objects.equals(
                        this.contentLibraryVmTemplatesSome,
                        labelWhereInput.contentLibraryVmTemplatesSome)
                && Objects.equals(this.createdAt, labelWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, labelWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, labelWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, labelWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, labelWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, labelWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, labelWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, labelWhereInput.createdAtNotIn)
                && Objects.equals(this.datacenterNum, labelWhereInput.datacenterNum)
                && Objects.equals(this.datacenterNumGt, labelWhereInput.datacenterNumGt)
                && Objects.equals(this.datacenterNumGte, labelWhereInput.datacenterNumGte)
                && Objects.equals(this.datacenterNumIn, labelWhereInput.datacenterNumIn)
                && Objects.equals(this.datacenterNumLt, labelWhereInput.datacenterNumLt)
                && Objects.equals(this.datacenterNumLte, labelWhereInput.datacenterNumLte)
                && Objects.equals(this.datacenterNumNot, labelWhereInput.datacenterNumNot)
                && Objects.equals(this.datacenterNumNotIn, labelWhereInput.datacenterNumNotIn)
                && Objects.equals(this.datacentersEvery, labelWhereInput.datacentersEvery)
                && Objects.equals(this.datacentersNone, labelWhereInput.datacentersNone)
                && Objects.equals(this.datacentersSome, labelWhereInput.datacentersSome)
                && Objects.equals(this.diskNum, labelWhereInput.diskNum)
                && Objects.equals(this.diskNumGt, labelWhereInput.diskNumGt)
                && Objects.equals(this.diskNumGte, labelWhereInput.diskNumGte)
                && Objects.equals(this.diskNumIn, labelWhereInput.diskNumIn)
                && Objects.equals(this.diskNumLt, labelWhereInput.diskNumLt)
                && Objects.equals(this.diskNumLte, labelWhereInput.diskNumLte)
                && Objects.equals(this.diskNumNot, labelWhereInput.diskNumNot)
                && Objects.equals(this.diskNumNotIn, labelWhereInput.diskNumNotIn)
                && Objects.equals(this.disksEvery, labelWhereInput.disksEvery)
                && Objects.equals(this.disksNone, labelWhereInput.disksNone)
                && Objects.equals(this.disksSome, labelWhereInput.disksSome)
                && Objects.equals(this.elfImageNum, labelWhereInput.elfImageNum)
                && Objects.equals(this.elfImageNumGt, labelWhereInput.elfImageNumGt)
                && Objects.equals(this.elfImageNumGte, labelWhereInput.elfImageNumGte)
                && Objects.equals(this.elfImageNumIn, labelWhereInput.elfImageNumIn)
                && Objects.equals(this.elfImageNumLt, labelWhereInput.elfImageNumLt)
                && Objects.equals(this.elfImageNumLte, labelWhereInput.elfImageNumLte)
                && Objects.equals(this.elfImageNumNot, labelWhereInput.elfImageNumNot)
                && Objects.equals(this.elfImageNumNotIn, labelWhereInput.elfImageNumNotIn)
                && Objects.equals(this.elfImagesEvery, labelWhereInput.elfImagesEvery)
                && Objects.equals(this.elfImagesNone, labelWhereInput.elfImagesNone)
                && Objects.equals(this.elfImagesSome, labelWhereInput.elfImagesSome)
                && Objects.equals(this.gpuDeviceNum, labelWhereInput.gpuDeviceNum)
                && Objects.equals(this.gpuDeviceNumGt, labelWhereInput.gpuDeviceNumGt)
                && Objects.equals(this.gpuDeviceNumGte, labelWhereInput.gpuDeviceNumGte)
                && Objects.equals(this.gpuDeviceNumIn, labelWhereInput.gpuDeviceNumIn)
                && Objects.equals(this.gpuDeviceNumLt, labelWhereInput.gpuDeviceNumLt)
                && Objects.equals(this.gpuDeviceNumLte, labelWhereInput.gpuDeviceNumLte)
                && Objects.equals(this.gpuDeviceNumNot, labelWhereInput.gpuDeviceNumNot)
                && Objects.equals(this.gpuDeviceNumNotIn, labelWhereInput.gpuDeviceNumNotIn)
                && Objects.equals(this.gpuDevicesEvery, labelWhereInput.gpuDevicesEvery)
                && Objects.equals(this.gpuDevicesNone, labelWhereInput.gpuDevicesNone)
                && Objects.equals(this.gpuDevicesSome, labelWhereInput.gpuDevicesSome)
                && Objects.equals(this.hostNum, labelWhereInput.hostNum)
                && Objects.equals(this.hostNumGt, labelWhereInput.hostNumGt)
                && Objects.equals(this.hostNumGte, labelWhereInput.hostNumGte)
                && Objects.equals(this.hostNumIn, labelWhereInput.hostNumIn)
                && Objects.equals(this.hostNumLt, labelWhereInput.hostNumLt)
                && Objects.equals(this.hostNumLte, labelWhereInput.hostNumLte)
                && Objects.equals(this.hostNumNot, labelWhereInput.hostNumNot)
                && Objects.equals(this.hostNumNotIn, labelWhereInput.hostNumNotIn)
                && Objects.equals(this.hostsEvery, labelWhereInput.hostsEvery)
                && Objects.equals(this.hostsNone, labelWhereInput.hostsNone)
                && Objects.equals(this.hostsSome, labelWhereInput.hostsSome)
                && Objects.equals(this.id, labelWhereInput.id)
                && Objects.equals(this.idContains, labelWhereInput.idContains)
                && Objects.equals(this.idEndsWith, labelWhereInput.idEndsWith)
                && Objects.equals(this.idGt, labelWhereInput.idGt)
                && Objects.equals(this.idGte, labelWhereInput.idGte)
                && Objects.equals(this.idIn, labelWhereInput.idIn)
                && Objects.equals(this.idLt, labelWhereInput.idLt)
                && Objects.equals(this.idLte, labelWhereInput.idLte)
                && Objects.equals(this.idNot, labelWhereInput.idNot)
                && Objects.equals(this.idNotContains, labelWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, labelWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, labelWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, labelWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, labelWhereInput.idStartsWith)
                && Objects.equals(this.iscsiLunNum, labelWhereInput.iscsiLunNum)
                && Objects.equals(this.iscsiLunNumGt, labelWhereInput.iscsiLunNumGt)
                && Objects.equals(this.iscsiLunNumGte, labelWhereInput.iscsiLunNumGte)
                && Objects.equals(this.iscsiLunNumIn, labelWhereInput.iscsiLunNumIn)
                && Objects.equals(this.iscsiLunNumLt, labelWhereInput.iscsiLunNumLt)
                && Objects.equals(this.iscsiLunNumLte, labelWhereInput.iscsiLunNumLte)
                && Objects.equals(this.iscsiLunNumNot, labelWhereInput.iscsiLunNumNot)
                && Objects.equals(this.iscsiLunNumNotIn, labelWhereInput.iscsiLunNumNotIn)
                && Objects.equals(this.iscsiLunSnapshotNum, labelWhereInput.iscsiLunSnapshotNum)
                && Objects.equals(this.iscsiLunSnapshotNumGt, labelWhereInput.iscsiLunSnapshotNumGt)
                && Objects.equals(
                        this.iscsiLunSnapshotNumGte, labelWhereInput.iscsiLunSnapshotNumGte)
                && Objects.equals(this.iscsiLunSnapshotNumIn, labelWhereInput.iscsiLunSnapshotNumIn)
                && Objects.equals(this.iscsiLunSnapshotNumLt, labelWhereInput.iscsiLunSnapshotNumLt)
                && Objects.equals(
                        this.iscsiLunSnapshotNumLte, labelWhereInput.iscsiLunSnapshotNumLte)
                && Objects.equals(
                        this.iscsiLunSnapshotNumNot, labelWhereInput.iscsiLunSnapshotNumNot)
                && Objects.equals(
                        this.iscsiLunSnapshotNumNotIn, labelWhereInput.iscsiLunSnapshotNumNotIn)
                && Objects.equals(
                        this.iscsiLunSnapshotsEvery, labelWhereInput.iscsiLunSnapshotsEvery)
                && Objects.equals(this.iscsiLunSnapshotsNone, labelWhereInput.iscsiLunSnapshotsNone)
                && Objects.equals(this.iscsiLunSnapshotsSome, labelWhereInput.iscsiLunSnapshotsSome)
                && Objects.equals(this.iscsiLunsEvery, labelWhereInput.iscsiLunsEvery)
                && Objects.equals(this.iscsiLunsNone, labelWhereInput.iscsiLunsNone)
                && Objects.equals(this.iscsiLunsSome, labelWhereInput.iscsiLunsSome)
                && Objects.equals(this.iscsiTargetNum, labelWhereInput.iscsiTargetNum)
                && Objects.equals(this.iscsiTargetNumGt, labelWhereInput.iscsiTargetNumGt)
                && Objects.equals(this.iscsiTargetNumGte, labelWhereInput.iscsiTargetNumGte)
                && Objects.equals(this.iscsiTargetNumIn, labelWhereInput.iscsiTargetNumIn)
                && Objects.equals(this.iscsiTargetNumLt, labelWhereInput.iscsiTargetNumLt)
                && Objects.equals(this.iscsiTargetNumLte, labelWhereInput.iscsiTargetNumLte)
                && Objects.equals(this.iscsiTargetNumNot, labelWhereInput.iscsiTargetNumNot)
                && Objects.equals(this.iscsiTargetNumNotIn, labelWhereInput.iscsiTargetNumNotIn)
                && Objects.equals(this.iscsiTargetsEvery, labelWhereInput.iscsiTargetsEvery)
                && Objects.equals(this.iscsiTargetsNone, labelWhereInput.iscsiTargetsNone)
                && Objects.equals(this.iscsiTargetsSome, labelWhereInput.iscsiTargetsSome)
                && Objects.equals(
                        this.isolationPoliciesEvery, labelWhereInput.isolationPoliciesEvery)
                && Objects.equals(this.isolationPoliciesNone, labelWhereInput.isolationPoliciesNone)
                && Objects.equals(this.isolationPoliciesSome, labelWhereInput.isolationPoliciesSome)
                && Objects.equals(this.isolationPolicyNum, labelWhereInput.isolationPolicyNum)
                && Objects.equals(this.isolationPolicyNumGt, labelWhereInput.isolationPolicyNumGt)
                && Objects.equals(this.isolationPolicyNumGte, labelWhereInput.isolationPolicyNumGte)
                && Objects.equals(this.isolationPolicyNumIn, labelWhereInput.isolationPolicyNumIn)
                && Objects.equals(this.isolationPolicyNumLt, labelWhereInput.isolationPolicyNumLt)
                && Objects.equals(this.isolationPolicyNumLte, labelWhereInput.isolationPolicyNumLte)
                && Objects.equals(this.isolationPolicyNumNot, labelWhereInput.isolationPolicyNumNot)
                && Objects.equals(
                        this.isolationPolicyNumNotIn, labelWhereInput.isolationPolicyNumNotIn)
                && Objects.equals(this.key, labelWhereInput.key)
                && Objects.equals(this.keyContains, labelWhereInput.keyContains)
                && Objects.equals(this.keyEndsWith, labelWhereInput.keyEndsWith)
                && Objects.equals(this.keyGt, labelWhereInput.keyGt)
                && Objects.equals(this.keyGte, labelWhereInput.keyGte)
                && Objects.equals(this.keyIn, labelWhereInput.keyIn)
                && Objects.equals(this.keyLt, labelWhereInput.keyLt)
                && Objects.equals(this.keyLte, labelWhereInput.keyLte)
                && Objects.equals(this.keyNot, labelWhereInput.keyNot)
                && Objects.equals(this.keyNotContains, labelWhereInput.keyNotContains)
                && Objects.equals(this.keyNotEndsWith, labelWhereInput.keyNotEndsWith)
                && Objects.equals(this.keyNotIn, labelWhereInput.keyNotIn)
                && Objects.equals(this.keyNotStartsWith, labelWhereInput.keyNotStartsWith)
                && Objects.equals(this.keyStartsWith, labelWhereInput.keyStartsWith)
                && Objects.equals(this.namespaceGroupNum, labelWhereInput.namespaceGroupNum)
                && Objects.equals(this.namespaceGroupNumGt, labelWhereInput.namespaceGroupNumGt)
                && Objects.equals(this.namespaceGroupNumGte, labelWhereInput.namespaceGroupNumGte)
                && Objects.equals(this.namespaceGroupNumIn, labelWhereInput.namespaceGroupNumIn)
                && Objects.equals(this.namespaceGroupNumLt, labelWhereInput.namespaceGroupNumLt)
                && Objects.equals(this.namespaceGroupNumLte, labelWhereInput.namespaceGroupNumLte)
                && Objects.equals(this.namespaceGroupNumNot, labelWhereInput.namespaceGroupNumNot)
                && Objects.equals(
                        this.namespaceGroupNumNotIn, labelWhereInput.namespaceGroupNumNotIn)
                && Objects.equals(this.namespaceGroupsEvery, labelWhereInput.namespaceGroupsEvery)
                && Objects.equals(this.namespaceGroupsNone, labelWhereInput.namespaceGroupsNone)
                && Objects.equals(this.namespaceGroupsSome, labelWhereInput.namespaceGroupsSome)
                && Objects.equals(this.nfsExportNum, labelWhereInput.nfsExportNum)
                && Objects.equals(this.nfsExportNumGt, labelWhereInput.nfsExportNumGt)
                && Objects.equals(this.nfsExportNumGte, labelWhereInput.nfsExportNumGte)
                && Objects.equals(this.nfsExportNumIn, labelWhereInput.nfsExportNumIn)
                && Objects.equals(this.nfsExportNumLt, labelWhereInput.nfsExportNumLt)
                && Objects.equals(this.nfsExportNumLte, labelWhereInput.nfsExportNumLte)
                && Objects.equals(this.nfsExportNumNot, labelWhereInput.nfsExportNumNot)
                && Objects.equals(this.nfsExportNumNotIn, labelWhereInput.nfsExportNumNotIn)
                && Objects.equals(this.nfsExportsEvery, labelWhereInput.nfsExportsEvery)
                && Objects.equals(this.nfsExportsNone, labelWhereInput.nfsExportsNone)
                && Objects.equals(this.nfsExportsSome, labelWhereInput.nfsExportsSome)
                && Objects.equals(this.nfsInodeNum, labelWhereInput.nfsInodeNum)
                && Objects.equals(this.nfsInodeNumGt, labelWhereInput.nfsInodeNumGt)
                && Objects.equals(this.nfsInodeNumGte, labelWhereInput.nfsInodeNumGte)
                && Objects.equals(this.nfsInodeNumIn, labelWhereInput.nfsInodeNumIn)
                && Objects.equals(this.nfsInodeNumLt, labelWhereInput.nfsInodeNumLt)
                && Objects.equals(this.nfsInodeNumLte, labelWhereInput.nfsInodeNumLte)
                && Objects.equals(this.nfsInodeNumNot, labelWhereInput.nfsInodeNumNot)
                && Objects.equals(this.nfsInodeNumNotIn, labelWhereInput.nfsInodeNumNotIn)
                && Objects.equals(this.nfsInodesEvery, labelWhereInput.nfsInodesEvery)
                && Objects.equals(this.nfsInodesNone, labelWhereInput.nfsInodesNone)
                && Objects.equals(this.nfsInodesSome, labelWhereInput.nfsInodesSome)
                && Objects.equals(this.nicNum, labelWhereInput.nicNum)
                && Objects.equals(this.nicNumGt, labelWhereInput.nicNumGt)
                && Objects.equals(this.nicNumGte, labelWhereInput.nicNumGte)
                && Objects.equals(this.nicNumIn, labelWhereInput.nicNumIn)
                && Objects.equals(this.nicNumLt, labelWhereInput.nicNumLt)
                && Objects.equals(this.nicNumLte, labelWhereInput.nicNumLte)
                && Objects.equals(this.nicNumNot, labelWhereInput.nicNumNot)
                && Objects.equals(this.nicNumNotIn, labelWhereInput.nicNumNotIn)
                && Objects.equals(this.nicsEvery, labelWhereInput.nicsEvery)
                && Objects.equals(this.nicsNone, labelWhereInput.nicsNone)
                && Objects.equals(this.nicsSome, labelWhereInput.nicsSome)
                && Objects.equals(this.nvmfNamespaceNum, labelWhereInput.nvmfNamespaceNum)
                && Objects.equals(this.nvmfNamespaceNumGt, labelWhereInput.nvmfNamespaceNumGt)
                && Objects.equals(this.nvmfNamespaceNumGte, labelWhereInput.nvmfNamespaceNumGte)
                && Objects.equals(this.nvmfNamespaceNumIn, labelWhereInput.nvmfNamespaceNumIn)
                && Objects.equals(this.nvmfNamespaceNumLt, labelWhereInput.nvmfNamespaceNumLt)
                && Objects.equals(this.nvmfNamespaceNumLte, labelWhereInput.nvmfNamespaceNumLte)
                && Objects.equals(this.nvmfNamespaceNumNot, labelWhereInput.nvmfNamespaceNumNot)
                && Objects.equals(this.nvmfNamespaceNumNotIn, labelWhereInput.nvmfNamespaceNumNotIn)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNum, labelWhereInput.nvmfNamespaceSnapshotNum)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumGt, labelWhereInput.nvmfNamespaceSnapshotNumGt)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumGte,
                        labelWhereInput.nvmfNamespaceSnapshotNumGte)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumIn, labelWhereInput.nvmfNamespaceSnapshotNumIn)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumLt, labelWhereInput.nvmfNamespaceSnapshotNumLt)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumLte,
                        labelWhereInput.nvmfNamespaceSnapshotNumLte)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumNot,
                        labelWhereInput.nvmfNamespaceSnapshotNumNot)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotNumNotIn,
                        labelWhereInput.nvmfNamespaceSnapshotNumNotIn)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotsEvery,
                        labelWhereInput.nvmfNamespaceSnapshotsEvery)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotsNone, labelWhereInput.nvmfNamespaceSnapshotsNone)
                && Objects.equals(
                        this.nvmfNamespaceSnapshotsSome, labelWhereInput.nvmfNamespaceSnapshotsSome)
                && Objects.equals(this.nvmfNamespacesEvery, labelWhereInput.nvmfNamespacesEvery)
                && Objects.equals(this.nvmfNamespacesNone, labelWhereInput.nvmfNamespacesNone)
                && Objects.equals(this.nvmfNamespacesSome, labelWhereInput.nvmfNamespacesSome)
                && Objects.equals(this.nvmfSubsystemNum, labelWhereInput.nvmfSubsystemNum)
                && Objects.equals(this.nvmfSubsystemNumGt, labelWhereInput.nvmfSubsystemNumGt)
                && Objects.equals(this.nvmfSubsystemNumGte, labelWhereInput.nvmfSubsystemNumGte)
                && Objects.equals(this.nvmfSubsystemNumIn, labelWhereInput.nvmfSubsystemNumIn)
                && Objects.equals(this.nvmfSubsystemNumLt, labelWhereInput.nvmfSubsystemNumLt)
                && Objects.equals(this.nvmfSubsystemNumLte, labelWhereInput.nvmfSubsystemNumLte)
                && Objects.equals(this.nvmfSubsystemNumNot, labelWhereInput.nvmfSubsystemNumNot)
                && Objects.equals(this.nvmfSubsystemNumNotIn, labelWhereInput.nvmfSubsystemNumNotIn)
                && Objects.equals(this.nvmfSubsystemsEvery, labelWhereInput.nvmfSubsystemsEvery)
                && Objects.equals(this.nvmfSubsystemsNone, labelWhereInput.nvmfSubsystemsNone)
                && Objects.equals(this.nvmfSubsystemsSome, labelWhereInput.nvmfSubsystemsSome)
                && Objects.equals(this.securityPoliciesEvery, labelWhereInput.securityPoliciesEvery)
                && Objects.equals(this.securityPoliciesNone, labelWhereInput.securityPoliciesNone)
                && Objects.equals(this.securityPoliciesSome, labelWhereInput.securityPoliciesSome)
                && Objects.equals(this.securityPolicyNum, labelWhereInput.securityPolicyNum)
                && Objects.equals(this.securityPolicyNumGt, labelWhereInput.securityPolicyNumGt)
                && Objects.equals(this.securityPolicyNumGte, labelWhereInput.securityPolicyNumGte)
                && Objects.equals(this.securityPolicyNumIn, labelWhereInput.securityPolicyNumIn)
                && Objects.equals(this.securityPolicyNumLt, labelWhereInput.securityPolicyNumLt)
                && Objects.equals(this.securityPolicyNumLte, labelWhereInput.securityPolicyNumLte)
                && Objects.equals(this.securityPolicyNumNot, labelWhereInput.securityPolicyNumNot)
                && Objects.equals(
                        this.securityPolicyNumNotIn, labelWhereInput.securityPolicyNumNotIn)
                && Objects.equals(this.systemVlanNum, labelWhereInput.systemVlanNum)
                && Objects.equals(this.systemVlanNumGt, labelWhereInput.systemVlanNumGt)
                && Objects.equals(this.systemVlanNumGte, labelWhereInput.systemVlanNumGte)
                && Objects.equals(this.systemVlanNumIn, labelWhereInput.systemVlanNumIn)
                && Objects.equals(this.systemVlanNumLt, labelWhereInput.systemVlanNumLt)
                && Objects.equals(this.systemVlanNumLte, labelWhereInput.systemVlanNumLte)
                && Objects.equals(this.systemVlanNumNot, labelWhereInput.systemVlanNumNot)
                && Objects.equals(this.systemVlanNumNotIn, labelWhereInput.systemVlanNumNotIn)
                && Objects.equals(this.totalNum, labelWhereInput.totalNum)
                && Objects.equals(this.totalNumGt, labelWhereInput.totalNumGt)
                && Objects.equals(this.totalNumGte, labelWhereInput.totalNumGte)
                && Objects.equals(this.totalNumIn, labelWhereInput.totalNumIn)
                && Objects.equals(this.totalNumLt, labelWhereInput.totalNumLt)
                && Objects.equals(this.totalNumLte, labelWhereInput.totalNumLte)
                && Objects.equals(this.totalNumNot, labelWhereInput.totalNumNot)
                && Objects.equals(this.totalNumNotIn, labelWhereInput.totalNumNotIn)
                && Objects.equals(this.value, labelWhereInput.value)
                && Objects.equals(this.valueContains, labelWhereInput.valueContains)
                && Objects.equals(this.valueEndsWith, labelWhereInput.valueEndsWith)
                && Objects.equals(this.valueGt, labelWhereInput.valueGt)
                && Objects.equals(this.valueGte, labelWhereInput.valueGte)
                && Objects.equals(this.valueIn, labelWhereInput.valueIn)
                && Objects.equals(this.valueLt, labelWhereInput.valueLt)
                && Objects.equals(this.valueLte, labelWhereInput.valueLte)
                && Objects.equals(this.valueNot, labelWhereInput.valueNot)
                && Objects.equals(this.valueNotContains, labelWhereInput.valueNotContains)
                && Objects.equals(this.valueNotEndsWith, labelWhereInput.valueNotEndsWith)
                && Objects.equals(this.valueNotIn, labelWhereInput.valueNotIn)
                && Objects.equals(this.valueNotStartsWith, labelWhereInput.valueNotStartsWith)
                && Objects.equals(this.valueStartsWith, labelWhereInput.valueStartsWith)
                && Objects.equals(this.vdsNum, labelWhereInput.vdsNum)
                && Objects.equals(this.vdsNumGt, labelWhereInput.vdsNumGt)
                && Objects.equals(this.vdsNumGte, labelWhereInput.vdsNumGte)
                && Objects.equals(this.vdsNumIn, labelWhereInput.vdsNumIn)
                && Objects.equals(this.vdsNumLt, labelWhereInput.vdsNumLt)
                && Objects.equals(this.vdsNumLte, labelWhereInput.vdsNumLte)
                && Objects.equals(this.vdsNumNot, labelWhereInput.vdsNumNot)
                && Objects.equals(this.vdsNumNotIn, labelWhereInput.vdsNumNotIn)
                && Objects.equals(this.vdsesEvery, labelWhereInput.vdsesEvery)
                && Objects.equals(this.vdsesNone, labelWhereInput.vdsesNone)
                && Objects.equals(this.vdsesSome, labelWhereInput.vdsesSome)
                && Objects.equals(this.vlansEvery, labelWhereInput.vlansEvery)
                && Objects.equals(this.vlansNone, labelWhereInput.vlansNone)
                && Objects.equals(this.vlansSome, labelWhereInput.vlansSome)
                && Objects.equals(this.vmNum, labelWhereInput.vmNum)
                && Objects.equals(this.vmNumGt, labelWhereInput.vmNumGt)
                && Objects.equals(this.vmNumGte, labelWhereInput.vmNumGte)
                && Objects.equals(this.vmNumIn, labelWhereInput.vmNumIn)
                && Objects.equals(this.vmNumLt, labelWhereInput.vmNumLt)
                && Objects.equals(this.vmNumLte, labelWhereInput.vmNumLte)
                && Objects.equals(this.vmNumNot, labelWhereInput.vmNumNot)
                && Objects.equals(this.vmNumNotIn, labelWhereInput.vmNumNotIn)
                && Objects.equals(this.vmSnapshotNum, labelWhereInput.vmSnapshotNum)
                && Objects.equals(this.vmSnapshotNumGt, labelWhereInput.vmSnapshotNumGt)
                && Objects.equals(this.vmSnapshotNumGte, labelWhereInput.vmSnapshotNumGte)
                && Objects.equals(this.vmSnapshotNumIn, labelWhereInput.vmSnapshotNumIn)
                && Objects.equals(this.vmSnapshotNumLt, labelWhereInput.vmSnapshotNumLt)
                && Objects.equals(this.vmSnapshotNumLte, labelWhereInput.vmSnapshotNumLte)
                && Objects.equals(this.vmSnapshotNumNot, labelWhereInput.vmSnapshotNumNot)
                && Objects.equals(this.vmSnapshotNumNotIn, labelWhereInput.vmSnapshotNumNotIn)
                && Objects.equals(this.vmSnapshotsEvery, labelWhereInput.vmSnapshotsEvery)
                && Objects.equals(this.vmSnapshotsNone, labelWhereInput.vmSnapshotsNone)
                && Objects.equals(this.vmSnapshotsSome, labelWhereInput.vmSnapshotsSome)
                && Objects.equals(this.vmTemplateNum, labelWhereInput.vmTemplateNum)
                && Objects.equals(this.vmTemplateNumGt, labelWhereInput.vmTemplateNumGt)
                && Objects.equals(this.vmTemplateNumGte, labelWhereInput.vmTemplateNumGte)
                && Objects.equals(this.vmTemplateNumIn, labelWhereInput.vmTemplateNumIn)
                && Objects.equals(this.vmTemplateNumLt, labelWhereInput.vmTemplateNumLt)
                && Objects.equals(this.vmTemplateNumLte, labelWhereInput.vmTemplateNumLte)
                && Objects.equals(this.vmTemplateNumNot, labelWhereInput.vmTemplateNumNot)
                && Objects.equals(this.vmTemplateNumNotIn, labelWhereInput.vmTemplateNumNotIn)
                && Objects.equals(this.vmTemplatesEvery, labelWhereInput.vmTemplatesEvery)
                && Objects.equals(this.vmTemplatesNone, labelWhereInput.vmTemplatesNone)
                && Objects.equals(this.vmTemplatesSome, labelWhereInput.vmTemplatesSome)
                && Objects.equals(this.vmVlanNum, labelWhereInput.vmVlanNum)
                && Objects.equals(this.vmVlanNumGt, labelWhereInput.vmVlanNumGt)
                && Objects.equals(this.vmVlanNumGte, labelWhereInput.vmVlanNumGte)
                && Objects.equals(this.vmVlanNumIn, labelWhereInput.vmVlanNumIn)
                && Objects.equals(this.vmVlanNumLt, labelWhereInput.vmVlanNumLt)
                && Objects.equals(this.vmVlanNumLte, labelWhereInput.vmVlanNumLte)
                && Objects.equals(this.vmVlanNumNot, labelWhereInput.vmVlanNumNot)
                && Objects.equals(this.vmVlanNumNotIn, labelWhereInput.vmVlanNumNotIn)
                && Objects.equals(this.vmVolumeNum, labelWhereInput.vmVolumeNum)
                && Objects.equals(this.vmVolumeNumGt, labelWhereInput.vmVolumeNumGt)
                && Objects.equals(this.vmVolumeNumGte, labelWhereInput.vmVolumeNumGte)
                && Objects.equals(this.vmVolumeNumIn, labelWhereInput.vmVolumeNumIn)
                && Objects.equals(this.vmVolumeNumLt, labelWhereInput.vmVolumeNumLt)
                && Objects.equals(this.vmVolumeNumLte, labelWhereInput.vmVolumeNumLte)
                && Objects.equals(this.vmVolumeNumNot, labelWhereInput.vmVolumeNumNot)
                && Objects.equals(this.vmVolumeNumNotIn, labelWhereInput.vmVolumeNumNotIn)
                && Objects.equals(this.vmVolumeSnapshotNum, labelWhereInput.vmVolumeSnapshotNum)
                && Objects.equals(this.vmVolumeSnapshotNumGt, labelWhereInput.vmVolumeSnapshotNumGt)
                && Objects.equals(
                        this.vmVolumeSnapshotNumGte, labelWhereInput.vmVolumeSnapshotNumGte)
                && Objects.equals(this.vmVolumeSnapshotNumIn, labelWhereInput.vmVolumeSnapshotNumIn)
                && Objects.equals(this.vmVolumeSnapshotNumLt, labelWhereInput.vmVolumeSnapshotNumLt)
                && Objects.equals(
                        this.vmVolumeSnapshotNumLte, labelWhereInput.vmVolumeSnapshotNumLte)
                && Objects.equals(
                        this.vmVolumeSnapshotNumNot, labelWhereInput.vmVolumeSnapshotNumNot)
                && Objects.equals(
                        this.vmVolumeSnapshotNumNotIn, labelWhereInput.vmVolumeSnapshotNumNotIn)
                && Objects.equals(
                        this.vmVolumeSnapshotsEvery, labelWhereInput.vmVolumeSnapshotsEvery)
                && Objects.equals(this.vmVolumeSnapshotsNone, labelWhereInput.vmVolumeSnapshotsNone)
                && Objects.equals(this.vmVolumeSnapshotsSome, labelWhereInput.vmVolumeSnapshotsSome)
                && Objects.equals(this.vmVolumesEvery, labelWhereInput.vmVolumesEvery)
                && Objects.equals(this.vmVolumesNone, labelWhereInput.vmVolumesNone)
                && Objects.equals(this.vmVolumesSome, labelWhereInput.vmVolumesSome)
                && Objects.equals(this.vmsEvery, labelWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, labelWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, labelWhereInput.vmsSome);
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
                AND,
                NOT,
                OR,
                clusterNum,
                clusterNumGt,
                clusterNumGte,
                clusterNumIn,
                clusterNumLt,
                clusterNumLte,
                clusterNumNot,
                clusterNumNotIn,
                clustersEvery,
                clustersNone,
                clustersSome,
                consistencyGroupNum,
                consistencyGroupNumGt,
                consistencyGroupNumGte,
                consistencyGroupNumIn,
                consistencyGroupNumLt,
                consistencyGroupNumLte,
                consistencyGroupNumNot,
                consistencyGroupNumNotIn,
                consistencyGroupSnapshotNum,
                consistencyGroupSnapshotNumGt,
                consistencyGroupSnapshotNumGte,
                consistencyGroupSnapshotNumIn,
                consistencyGroupSnapshotNumLt,
                consistencyGroupSnapshotNumLte,
                consistencyGroupSnapshotNumNot,
                consistencyGroupSnapshotNumNotIn,
                consistencyGroupSnapshotsEvery,
                consistencyGroupSnapshotsNone,
                consistencyGroupSnapshotsSome,
                consistencyGroupsEvery,
                consistencyGroupsNone,
                consistencyGroupsSome,
                contentLibraryImageNum,
                contentLibraryImageNumGt,
                contentLibraryImageNumGte,
                contentLibraryImageNumIn,
                contentLibraryImageNumLt,
                contentLibraryImageNumLte,
                contentLibraryImageNumNot,
                contentLibraryImageNumNotIn,
                contentLibraryImagesEvery,
                contentLibraryImagesNone,
                contentLibraryImagesSome,
                contentLibraryVmTemplateNum,
                contentLibraryVmTemplateNumGt,
                contentLibraryVmTemplateNumGte,
                contentLibraryVmTemplateNumIn,
                contentLibraryVmTemplateNumLt,
                contentLibraryVmTemplateNumLte,
                contentLibraryVmTemplateNumNot,
                contentLibraryVmTemplateNumNotIn,
                contentLibraryVmTemplatesEvery,
                contentLibraryVmTemplatesNone,
                contentLibraryVmTemplatesSome,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                datacenterNum,
                datacenterNumGt,
                datacenterNumGte,
                datacenterNumIn,
                datacenterNumLt,
                datacenterNumLte,
                datacenterNumNot,
                datacenterNumNotIn,
                datacentersEvery,
                datacentersNone,
                datacentersSome,
                diskNum,
                diskNumGt,
                diskNumGte,
                diskNumIn,
                diskNumLt,
                diskNumLte,
                diskNumNot,
                diskNumNotIn,
                disksEvery,
                disksNone,
                disksSome,
                elfImageNum,
                elfImageNumGt,
                elfImageNumGte,
                elfImageNumIn,
                elfImageNumLt,
                elfImageNumLte,
                elfImageNumNot,
                elfImageNumNotIn,
                elfImagesEvery,
                elfImagesNone,
                elfImagesSome,
                gpuDeviceNum,
                gpuDeviceNumGt,
                gpuDeviceNumGte,
                gpuDeviceNumIn,
                gpuDeviceNumLt,
                gpuDeviceNumLte,
                gpuDeviceNumNot,
                gpuDeviceNumNotIn,
                gpuDevicesEvery,
                gpuDevicesNone,
                gpuDevicesSome,
                hostNum,
                hostNumGt,
                hostNumGte,
                hostNumIn,
                hostNumLt,
                hostNumLte,
                hostNumNot,
                hostNumNotIn,
                hostsEvery,
                hostsNone,
                hostsSome,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                iscsiLunNum,
                iscsiLunNumGt,
                iscsiLunNumGte,
                iscsiLunNumIn,
                iscsiLunNumLt,
                iscsiLunNumLte,
                iscsiLunNumNot,
                iscsiLunNumNotIn,
                iscsiLunSnapshotNum,
                iscsiLunSnapshotNumGt,
                iscsiLunSnapshotNumGte,
                iscsiLunSnapshotNumIn,
                iscsiLunSnapshotNumLt,
                iscsiLunSnapshotNumLte,
                iscsiLunSnapshotNumNot,
                iscsiLunSnapshotNumNotIn,
                iscsiLunSnapshotsEvery,
                iscsiLunSnapshotsNone,
                iscsiLunSnapshotsSome,
                iscsiLunsEvery,
                iscsiLunsNone,
                iscsiLunsSome,
                iscsiTargetNum,
                iscsiTargetNumGt,
                iscsiTargetNumGte,
                iscsiTargetNumIn,
                iscsiTargetNumLt,
                iscsiTargetNumLte,
                iscsiTargetNumNot,
                iscsiTargetNumNotIn,
                iscsiTargetsEvery,
                iscsiTargetsNone,
                iscsiTargetsSome,
                isolationPoliciesEvery,
                isolationPoliciesNone,
                isolationPoliciesSome,
                isolationPolicyNum,
                isolationPolicyNumGt,
                isolationPolicyNumGte,
                isolationPolicyNumIn,
                isolationPolicyNumLt,
                isolationPolicyNumLte,
                isolationPolicyNumNot,
                isolationPolicyNumNotIn,
                key,
                keyContains,
                keyEndsWith,
                keyGt,
                keyGte,
                keyIn,
                keyLt,
                keyLte,
                keyNot,
                keyNotContains,
                keyNotEndsWith,
                keyNotIn,
                keyNotStartsWith,
                keyStartsWith,
                namespaceGroupNum,
                namespaceGroupNumGt,
                namespaceGroupNumGte,
                namespaceGroupNumIn,
                namespaceGroupNumLt,
                namespaceGroupNumLte,
                namespaceGroupNumNot,
                namespaceGroupNumNotIn,
                namespaceGroupsEvery,
                namespaceGroupsNone,
                namespaceGroupsSome,
                nfsExportNum,
                nfsExportNumGt,
                nfsExportNumGte,
                nfsExportNumIn,
                nfsExportNumLt,
                nfsExportNumLte,
                nfsExportNumNot,
                nfsExportNumNotIn,
                nfsExportsEvery,
                nfsExportsNone,
                nfsExportsSome,
                nfsInodeNum,
                nfsInodeNumGt,
                nfsInodeNumGte,
                nfsInodeNumIn,
                nfsInodeNumLt,
                nfsInodeNumLte,
                nfsInodeNumNot,
                nfsInodeNumNotIn,
                nfsInodesEvery,
                nfsInodesNone,
                nfsInodesSome,
                nicNum,
                nicNumGt,
                nicNumGte,
                nicNumIn,
                nicNumLt,
                nicNumLte,
                nicNumNot,
                nicNumNotIn,
                nicsEvery,
                nicsNone,
                nicsSome,
                nvmfNamespaceNum,
                nvmfNamespaceNumGt,
                nvmfNamespaceNumGte,
                nvmfNamespaceNumIn,
                nvmfNamespaceNumLt,
                nvmfNamespaceNumLte,
                nvmfNamespaceNumNot,
                nvmfNamespaceNumNotIn,
                nvmfNamespaceSnapshotNum,
                nvmfNamespaceSnapshotNumGt,
                nvmfNamespaceSnapshotNumGte,
                nvmfNamespaceSnapshotNumIn,
                nvmfNamespaceSnapshotNumLt,
                nvmfNamespaceSnapshotNumLte,
                nvmfNamespaceSnapshotNumNot,
                nvmfNamespaceSnapshotNumNotIn,
                nvmfNamespaceSnapshotsEvery,
                nvmfNamespaceSnapshotsNone,
                nvmfNamespaceSnapshotsSome,
                nvmfNamespacesEvery,
                nvmfNamespacesNone,
                nvmfNamespacesSome,
                nvmfSubsystemNum,
                nvmfSubsystemNumGt,
                nvmfSubsystemNumGte,
                nvmfSubsystemNumIn,
                nvmfSubsystemNumLt,
                nvmfSubsystemNumLte,
                nvmfSubsystemNumNot,
                nvmfSubsystemNumNotIn,
                nvmfSubsystemsEvery,
                nvmfSubsystemsNone,
                nvmfSubsystemsSome,
                securityPoliciesEvery,
                securityPoliciesNone,
                securityPoliciesSome,
                securityPolicyNum,
                securityPolicyNumGt,
                securityPolicyNumGte,
                securityPolicyNumIn,
                securityPolicyNumLt,
                securityPolicyNumLte,
                securityPolicyNumNot,
                securityPolicyNumNotIn,
                systemVlanNum,
                systemVlanNumGt,
                systemVlanNumGte,
                systemVlanNumIn,
                systemVlanNumLt,
                systemVlanNumLte,
                systemVlanNumNot,
                systemVlanNumNotIn,
                totalNum,
                totalNumGt,
                totalNumGte,
                totalNumIn,
                totalNumLt,
                totalNumLte,
                totalNumNot,
                totalNumNotIn,
                value,
                valueContains,
                valueEndsWith,
                valueGt,
                valueGte,
                valueIn,
                valueLt,
                valueLte,
                valueNot,
                valueNotContains,
                valueNotEndsWith,
                valueNotIn,
                valueNotStartsWith,
                valueStartsWith,
                vdsNum,
                vdsNumGt,
                vdsNumGte,
                vdsNumIn,
                vdsNumLt,
                vdsNumLte,
                vdsNumNot,
                vdsNumNotIn,
                vdsesEvery,
                vdsesNone,
                vdsesSome,
                vlansEvery,
                vlansNone,
                vlansSome,
                vmNum,
                vmNumGt,
                vmNumGte,
                vmNumIn,
                vmNumLt,
                vmNumLte,
                vmNumNot,
                vmNumNotIn,
                vmSnapshotNum,
                vmSnapshotNumGt,
                vmSnapshotNumGte,
                vmSnapshotNumIn,
                vmSnapshotNumLt,
                vmSnapshotNumLte,
                vmSnapshotNumNot,
                vmSnapshotNumNotIn,
                vmSnapshotsEvery,
                vmSnapshotsNone,
                vmSnapshotsSome,
                vmTemplateNum,
                vmTemplateNumGt,
                vmTemplateNumGte,
                vmTemplateNumIn,
                vmTemplateNumLt,
                vmTemplateNumLte,
                vmTemplateNumNot,
                vmTemplateNumNotIn,
                vmTemplatesEvery,
                vmTemplatesNone,
                vmTemplatesSome,
                vmVlanNum,
                vmVlanNumGt,
                vmVlanNumGte,
                vmVlanNumIn,
                vmVlanNumLt,
                vmVlanNumLte,
                vmVlanNumNot,
                vmVlanNumNotIn,
                vmVolumeNum,
                vmVolumeNumGt,
                vmVolumeNumGte,
                vmVolumeNumIn,
                vmVolumeNumLt,
                vmVolumeNumLte,
                vmVolumeNumNot,
                vmVolumeNumNotIn,
                vmVolumeSnapshotNum,
                vmVolumeSnapshotNumGt,
                vmVolumeSnapshotNumGte,
                vmVolumeSnapshotNumIn,
                vmVolumeSnapshotNumLt,
                vmVolumeSnapshotNumLte,
                vmVolumeSnapshotNumNot,
                vmVolumeSnapshotNumNotIn,
                vmVolumeSnapshotsEvery,
                vmVolumeSnapshotsNone,
                vmVolumeSnapshotsSome,
                vmVolumesEvery,
                vmVolumesNone,
                vmVolumesSome,
                vmsEvery,
                vmsNone,
                vmsSome);
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
        sb.append("class LabelWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
        sb.append("    clusterNumGt: ").append(toIndentedString(clusterNumGt)).append("\n");
        sb.append("    clusterNumGte: ").append(toIndentedString(clusterNumGte)).append("\n");
        sb.append("    clusterNumIn: ").append(toIndentedString(clusterNumIn)).append("\n");
        sb.append("    clusterNumLt: ").append(toIndentedString(clusterNumLt)).append("\n");
        sb.append("    clusterNumLte: ").append(toIndentedString(clusterNumLte)).append("\n");
        sb.append("    clusterNumNot: ").append(toIndentedString(clusterNumNot)).append("\n");
        sb.append("    clusterNumNotIn: ").append(toIndentedString(clusterNumNotIn)).append("\n");
        sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
        sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
        sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
        sb.append("    consistencyGroupNum: ")
                .append(toIndentedString(consistencyGroupNum))
                .append("\n");
        sb.append("    consistencyGroupNumGt: ")
                .append(toIndentedString(consistencyGroupNumGt))
                .append("\n");
        sb.append("    consistencyGroupNumGte: ")
                .append(toIndentedString(consistencyGroupNumGte))
                .append("\n");
        sb.append("    consistencyGroupNumIn: ")
                .append(toIndentedString(consistencyGroupNumIn))
                .append("\n");
        sb.append("    consistencyGroupNumLt: ")
                .append(toIndentedString(consistencyGroupNumLt))
                .append("\n");
        sb.append("    consistencyGroupNumLte: ")
                .append(toIndentedString(consistencyGroupNumLte))
                .append("\n");
        sb.append("    consistencyGroupNumNot: ")
                .append(toIndentedString(consistencyGroupNumNot))
                .append("\n");
        sb.append("    consistencyGroupNumNotIn: ")
                .append(toIndentedString(consistencyGroupNumNotIn))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNum: ")
                .append(toIndentedString(consistencyGroupSnapshotNum))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumGt: ")
                .append(toIndentedString(consistencyGroupSnapshotNumGt))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumGte: ")
                .append(toIndentedString(consistencyGroupSnapshotNumGte))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumIn: ")
                .append(toIndentedString(consistencyGroupSnapshotNumIn))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumLt: ")
                .append(toIndentedString(consistencyGroupSnapshotNumLt))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumLte: ")
                .append(toIndentedString(consistencyGroupSnapshotNumLte))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumNot: ")
                .append(toIndentedString(consistencyGroupSnapshotNumNot))
                .append("\n");
        sb.append("    consistencyGroupSnapshotNumNotIn: ")
                .append(toIndentedString(consistencyGroupSnapshotNumNotIn))
                .append("\n");
        sb.append("    consistencyGroupSnapshotsEvery: ")
                .append(toIndentedString(consistencyGroupSnapshotsEvery))
                .append("\n");
        sb.append("    consistencyGroupSnapshotsNone: ")
                .append(toIndentedString(consistencyGroupSnapshotsNone))
                .append("\n");
        sb.append("    consistencyGroupSnapshotsSome: ")
                .append(toIndentedString(consistencyGroupSnapshotsSome))
                .append("\n");
        sb.append("    consistencyGroupsEvery: ")
                .append(toIndentedString(consistencyGroupsEvery))
                .append("\n");
        sb.append("    consistencyGroupsNone: ")
                .append(toIndentedString(consistencyGroupsNone))
                .append("\n");
        sb.append("    consistencyGroupsSome: ")
                .append(toIndentedString(consistencyGroupsSome))
                .append("\n");
        sb.append("    contentLibraryImageNum: ")
                .append(toIndentedString(contentLibraryImageNum))
                .append("\n");
        sb.append("    contentLibraryImageNumGt: ")
                .append(toIndentedString(contentLibraryImageNumGt))
                .append("\n");
        sb.append("    contentLibraryImageNumGte: ")
                .append(toIndentedString(contentLibraryImageNumGte))
                .append("\n");
        sb.append("    contentLibraryImageNumIn: ")
                .append(toIndentedString(contentLibraryImageNumIn))
                .append("\n");
        sb.append("    contentLibraryImageNumLt: ")
                .append(toIndentedString(contentLibraryImageNumLt))
                .append("\n");
        sb.append("    contentLibraryImageNumLte: ")
                .append(toIndentedString(contentLibraryImageNumLte))
                .append("\n");
        sb.append("    contentLibraryImageNumNot: ")
                .append(toIndentedString(contentLibraryImageNumNot))
                .append("\n");
        sb.append("    contentLibraryImageNumNotIn: ")
                .append(toIndentedString(contentLibraryImageNumNotIn))
                .append("\n");
        sb.append("    contentLibraryImagesEvery: ")
                .append(toIndentedString(contentLibraryImagesEvery))
                .append("\n");
        sb.append("    contentLibraryImagesNone: ")
                .append(toIndentedString(contentLibraryImagesNone))
                .append("\n");
        sb.append("    contentLibraryImagesSome: ")
                .append(toIndentedString(contentLibraryImagesSome))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNum: ")
                .append(toIndentedString(contentLibraryVmTemplateNum))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumGt: ")
                .append(toIndentedString(contentLibraryVmTemplateNumGt))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumGte: ")
                .append(toIndentedString(contentLibraryVmTemplateNumGte))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumIn: ")
                .append(toIndentedString(contentLibraryVmTemplateNumIn))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumLt: ")
                .append(toIndentedString(contentLibraryVmTemplateNumLt))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumLte: ")
                .append(toIndentedString(contentLibraryVmTemplateNumLte))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumNot: ")
                .append(toIndentedString(contentLibraryVmTemplateNumNot))
                .append("\n");
        sb.append("    contentLibraryVmTemplateNumNotIn: ")
                .append(toIndentedString(contentLibraryVmTemplateNumNotIn))
                .append("\n");
        sb.append("    contentLibraryVmTemplatesEvery: ")
                .append(toIndentedString(contentLibraryVmTemplatesEvery))
                .append("\n");
        sb.append("    contentLibraryVmTemplatesNone: ")
                .append(toIndentedString(contentLibraryVmTemplatesNone))
                .append("\n");
        sb.append("    contentLibraryVmTemplatesSome: ")
                .append(toIndentedString(contentLibraryVmTemplatesSome))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    datacenterNum: ").append(toIndentedString(datacenterNum)).append("\n");
        sb.append("    datacenterNumGt: ").append(toIndentedString(datacenterNumGt)).append("\n");
        sb.append("    datacenterNumGte: ").append(toIndentedString(datacenterNumGte)).append("\n");
        sb.append("    datacenterNumIn: ").append(toIndentedString(datacenterNumIn)).append("\n");
        sb.append("    datacenterNumLt: ").append(toIndentedString(datacenterNumLt)).append("\n");
        sb.append("    datacenterNumLte: ").append(toIndentedString(datacenterNumLte)).append("\n");
        sb.append("    datacenterNumNot: ").append(toIndentedString(datacenterNumNot)).append("\n");
        sb.append("    datacenterNumNotIn: ")
                .append(toIndentedString(datacenterNumNotIn))
                .append("\n");
        sb.append("    datacentersEvery: ").append(toIndentedString(datacentersEvery)).append("\n");
        sb.append("    datacentersNone: ").append(toIndentedString(datacentersNone)).append("\n");
        sb.append("    datacentersSome: ").append(toIndentedString(datacentersSome)).append("\n");
        sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
        sb.append("    diskNumGt: ").append(toIndentedString(diskNumGt)).append("\n");
        sb.append("    diskNumGte: ").append(toIndentedString(diskNumGte)).append("\n");
        sb.append("    diskNumIn: ").append(toIndentedString(diskNumIn)).append("\n");
        sb.append("    diskNumLt: ").append(toIndentedString(diskNumLt)).append("\n");
        sb.append("    diskNumLte: ").append(toIndentedString(diskNumLte)).append("\n");
        sb.append("    diskNumNot: ").append(toIndentedString(diskNumNot)).append("\n");
        sb.append("    diskNumNotIn: ").append(toIndentedString(diskNumNotIn)).append("\n");
        sb.append("    disksEvery: ").append(toIndentedString(disksEvery)).append("\n");
        sb.append("    disksNone: ").append(toIndentedString(disksNone)).append("\n");
        sb.append("    disksSome: ").append(toIndentedString(disksSome)).append("\n");
        sb.append("    elfImageNum: ").append(toIndentedString(elfImageNum)).append("\n");
        sb.append("    elfImageNumGt: ").append(toIndentedString(elfImageNumGt)).append("\n");
        sb.append("    elfImageNumGte: ").append(toIndentedString(elfImageNumGte)).append("\n");
        sb.append("    elfImageNumIn: ").append(toIndentedString(elfImageNumIn)).append("\n");
        sb.append("    elfImageNumLt: ").append(toIndentedString(elfImageNumLt)).append("\n");
        sb.append("    elfImageNumLte: ").append(toIndentedString(elfImageNumLte)).append("\n");
        sb.append("    elfImageNumNot: ").append(toIndentedString(elfImageNumNot)).append("\n");
        sb.append("    elfImageNumNotIn: ").append(toIndentedString(elfImageNumNotIn)).append("\n");
        sb.append("    elfImagesEvery: ").append(toIndentedString(elfImagesEvery)).append("\n");
        sb.append("    elfImagesNone: ").append(toIndentedString(elfImagesNone)).append("\n");
        sb.append("    elfImagesSome: ").append(toIndentedString(elfImagesSome)).append("\n");
        sb.append("    gpuDeviceNum: ").append(toIndentedString(gpuDeviceNum)).append("\n");
        sb.append("    gpuDeviceNumGt: ").append(toIndentedString(gpuDeviceNumGt)).append("\n");
        sb.append("    gpuDeviceNumGte: ").append(toIndentedString(gpuDeviceNumGte)).append("\n");
        sb.append("    gpuDeviceNumIn: ").append(toIndentedString(gpuDeviceNumIn)).append("\n");
        sb.append("    gpuDeviceNumLt: ").append(toIndentedString(gpuDeviceNumLt)).append("\n");
        sb.append("    gpuDeviceNumLte: ").append(toIndentedString(gpuDeviceNumLte)).append("\n");
        sb.append("    gpuDeviceNumNot: ").append(toIndentedString(gpuDeviceNumNot)).append("\n");
        sb.append("    gpuDeviceNumNotIn: ")
                .append(toIndentedString(gpuDeviceNumNotIn))
                .append("\n");
        sb.append("    gpuDevicesEvery: ").append(toIndentedString(gpuDevicesEvery)).append("\n");
        sb.append("    gpuDevicesNone: ").append(toIndentedString(gpuDevicesNone)).append("\n");
        sb.append("    gpuDevicesSome: ").append(toIndentedString(gpuDevicesSome)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hostNumGt: ").append(toIndentedString(hostNumGt)).append("\n");
        sb.append("    hostNumGte: ").append(toIndentedString(hostNumGte)).append("\n");
        sb.append("    hostNumIn: ").append(toIndentedString(hostNumIn)).append("\n");
        sb.append("    hostNumLt: ").append(toIndentedString(hostNumLt)).append("\n");
        sb.append("    hostNumLte: ").append(toIndentedString(hostNumLte)).append("\n");
        sb.append("    hostNumNot: ").append(toIndentedString(hostNumNot)).append("\n");
        sb.append("    hostNumNotIn: ").append(toIndentedString(hostNumNotIn)).append("\n");
        sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
        sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
        sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    iscsiLunNum: ").append(toIndentedString(iscsiLunNum)).append("\n");
        sb.append("    iscsiLunNumGt: ").append(toIndentedString(iscsiLunNumGt)).append("\n");
        sb.append("    iscsiLunNumGte: ").append(toIndentedString(iscsiLunNumGte)).append("\n");
        sb.append("    iscsiLunNumIn: ").append(toIndentedString(iscsiLunNumIn)).append("\n");
        sb.append("    iscsiLunNumLt: ").append(toIndentedString(iscsiLunNumLt)).append("\n");
        sb.append("    iscsiLunNumLte: ").append(toIndentedString(iscsiLunNumLte)).append("\n");
        sb.append("    iscsiLunNumNot: ").append(toIndentedString(iscsiLunNumNot)).append("\n");
        sb.append("    iscsiLunNumNotIn: ").append(toIndentedString(iscsiLunNumNotIn)).append("\n");
        sb.append("    iscsiLunSnapshotNum: ")
                .append(toIndentedString(iscsiLunSnapshotNum))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumGt: ")
                .append(toIndentedString(iscsiLunSnapshotNumGt))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumGte: ")
                .append(toIndentedString(iscsiLunSnapshotNumGte))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumIn: ")
                .append(toIndentedString(iscsiLunSnapshotNumIn))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumLt: ")
                .append(toIndentedString(iscsiLunSnapshotNumLt))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumLte: ")
                .append(toIndentedString(iscsiLunSnapshotNumLte))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumNot: ")
                .append(toIndentedString(iscsiLunSnapshotNumNot))
                .append("\n");
        sb.append("    iscsiLunSnapshotNumNotIn: ")
                .append(toIndentedString(iscsiLunSnapshotNumNotIn))
                .append("\n");
        sb.append("    iscsiLunSnapshotsEvery: ")
                .append(toIndentedString(iscsiLunSnapshotsEvery))
                .append("\n");
        sb.append("    iscsiLunSnapshotsNone: ")
                .append(toIndentedString(iscsiLunSnapshotsNone))
                .append("\n");
        sb.append("    iscsiLunSnapshotsSome: ")
                .append(toIndentedString(iscsiLunSnapshotsSome))
                .append("\n");
        sb.append("    iscsiLunsEvery: ").append(toIndentedString(iscsiLunsEvery)).append("\n");
        sb.append("    iscsiLunsNone: ").append(toIndentedString(iscsiLunsNone)).append("\n");
        sb.append("    iscsiLunsSome: ").append(toIndentedString(iscsiLunsSome)).append("\n");
        sb.append("    iscsiTargetNum: ").append(toIndentedString(iscsiTargetNum)).append("\n");
        sb.append("    iscsiTargetNumGt: ").append(toIndentedString(iscsiTargetNumGt)).append("\n");
        sb.append("    iscsiTargetNumGte: ")
                .append(toIndentedString(iscsiTargetNumGte))
                .append("\n");
        sb.append("    iscsiTargetNumIn: ").append(toIndentedString(iscsiTargetNumIn)).append("\n");
        sb.append("    iscsiTargetNumLt: ").append(toIndentedString(iscsiTargetNumLt)).append("\n");
        sb.append("    iscsiTargetNumLte: ")
                .append(toIndentedString(iscsiTargetNumLte))
                .append("\n");
        sb.append("    iscsiTargetNumNot: ")
                .append(toIndentedString(iscsiTargetNumNot))
                .append("\n");
        sb.append("    iscsiTargetNumNotIn: ")
                .append(toIndentedString(iscsiTargetNumNotIn))
                .append("\n");
        sb.append("    iscsiTargetsEvery: ")
                .append(toIndentedString(iscsiTargetsEvery))
                .append("\n");
        sb.append("    iscsiTargetsNone: ").append(toIndentedString(iscsiTargetsNone)).append("\n");
        sb.append("    iscsiTargetsSome: ").append(toIndentedString(iscsiTargetsSome)).append("\n");
        sb.append("    isolationPoliciesEvery: ")
                .append(toIndentedString(isolationPoliciesEvery))
                .append("\n");
        sb.append("    isolationPoliciesNone: ")
                .append(toIndentedString(isolationPoliciesNone))
                .append("\n");
        sb.append("    isolationPoliciesSome: ")
                .append(toIndentedString(isolationPoliciesSome))
                .append("\n");
        sb.append("    isolationPolicyNum: ")
                .append(toIndentedString(isolationPolicyNum))
                .append("\n");
        sb.append("    isolationPolicyNumGt: ")
                .append(toIndentedString(isolationPolicyNumGt))
                .append("\n");
        sb.append("    isolationPolicyNumGte: ")
                .append(toIndentedString(isolationPolicyNumGte))
                .append("\n");
        sb.append("    isolationPolicyNumIn: ")
                .append(toIndentedString(isolationPolicyNumIn))
                .append("\n");
        sb.append("    isolationPolicyNumLt: ")
                .append(toIndentedString(isolationPolicyNumLt))
                .append("\n");
        sb.append("    isolationPolicyNumLte: ")
                .append(toIndentedString(isolationPolicyNumLte))
                .append("\n");
        sb.append("    isolationPolicyNumNot: ")
                .append(toIndentedString(isolationPolicyNumNot))
                .append("\n");
        sb.append("    isolationPolicyNumNotIn: ")
                .append(toIndentedString(isolationPolicyNumNotIn))
                .append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyContains: ").append(toIndentedString(keyContains)).append("\n");
        sb.append("    keyEndsWith: ").append(toIndentedString(keyEndsWith)).append("\n");
        sb.append("    keyGt: ").append(toIndentedString(keyGt)).append("\n");
        sb.append("    keyGte: ").append(toIndentedString(keyGte)).append("\n");
        sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
        sb.append("    keyLt: ").append(toIndentedString(keyLt)).append("\n");
        sb.append("    keyLte: ").append(toIndentedString(keyLte)).append("\n");
        sb.append("    keyNot: ").append(toIndentedString(keyNot)).append("\n");
        sb.append("    keyNotContains: ").append(toIndentedString(keyNotContains)).append("\n");
        sb.append("    keyNotEndsWith: ").append(toIndentedString(keyNotEndsWith)).append("\n");
        sb.append("    keyNotIn: ").append(toIndentedString(keyNotIn)).append("\n");
        sb.append("    keyNotStartsWith: ").append(toIndentedString(keyNotStartsWith)).append("\n");
        sb.append("    keyStartsWith: ").append(toIndentedString(keyStartsWith)).append("\n");
        sb.append("    namespaceGroupNum: ")
                .append(toIndentedString(namespaceGroupNum))
                .append("\n");
        sb.append("    namespaceGroupNumGt: ")
                .append(toIndentedString(namespaceGroupNumGt))
                .append("\n");
        sb.append("    namespaceGroupNumGte: ")
                .append(toIndentedString(namespaceGroupNumGte))
                .append("\n");
        sb.append("    namespaceGroupNumIn: ")
                .append(toIndentedString(namespaceGroupNumIn))
                .append("\n");
        sb.append("    namespaceGroupNumLt: ")
                .append(toIndentedString(namespaceGroupNumLt))
                .append("\n");
        sb.append("    namespaceGroupNumLte: ")
                .append(toIndentedString(namespaceGroupNumLte))
                .append("\n");
        sb.append("    namespaceGroupNumNot: ")
                .append(toIndentedString(namespaceGroupNumNot))
                .append("\n");
        sb.append("    namespaceGroupNumNotIn: ")
                .append(toIndentedString(namespaceGroupNumNotIn))
                .append("\n");
        sb.append("    namespaceGroupsEvery: ")
                .append(toIndentedString(namespaceGroupsEvery))
                .append("\n");
        sb.append("    namespaceGroupsNone: ")
                .append(toIndentedString(namespaceGroupsNone))
                .append("\n");
        sb.append("    namespaceGroupsSome: ")
                .append(toIndentedString(namespaceGroupsSome))
                .append("\n");
        sb.append("    nfsExportNum: ").append(toIndentedString(nfsExportNum)).append("\n");
        sb.append("    nfsExportNumGt: ").append(toIndentedString(nfsExportNumGt)).append("\n");
        sb.append("    nfsExportNumGte: ").append(toIndentedString(nfsExportNumGte)).append("\n");
        sb.append("    nfsExportNumIn: ").append(toIndentedString(nfsExportNumIn)).append("\n");
        sb.append("    nfsExportNumLt: ").append(toIndentedString(nfsExportNumLt)).append("\n");
        sb.append("    nfsExportNumLte: ").append(toIndentedString(nfsExportNumLte)).append("\n");
        sb.append("    nfsExportNumNot: ").append(toIndentedString(nfsExportNumNot)).append("\n");
        sb.append("    nfsExportNumNotIn: ")
                .append(toIndentedString(nfsExportNumNotIn))
                .append("\n");
        sb.append("    nfsExportsEvery: ").append(toIndentedString(nfsExportsEvery)).append("\n");
        sb.append("    nfsExportsNone: ").append(toIndentedString(nfsExportsNone)).append("\n");
        sb.append("    nfsExportsSome: ").append(toIndentedString(nfsExportsSome)).append("\n");
        sb.append("    nfsInodeNum: ").append(toIndentedString(nfsInodeNum)).append("\n");
        sb.append("    nfsInodeNumGt: ").append(toIndentedString(nfsInodeNumGt)).append("\n");
        sb.append("    nfsInodeNumGte: ").append(toIndentedString(nfsInodeNumGte)).append("\n");
        sb.append("    nfsInodeNumIn: ").append(toIndentedString(nfsInodeNumIn)).append("\n");
        sb.append("    nfsInodeNumLt: ").append(toIndentedString(nfsInodeNumLt)).append("\n");
        sb.append("    nfsInodeNumLte: ").append(toIndentedString(nfsInodeNumLte)).append("\n");
        sb.append("    nfsInodeNumNot: ").append(toIndentedString(nfsInodeNumNot)).append("\n");
        sb.append("    nfsInodeNumNotIn: ").append(toIndentedString(nfsInodeNumNotIn)).append("\n");
        sb.append("    nfsInodesEvery: ").append(toIndentedString(nfsInodesEvery)).append("\n");
        sb.append("    nfsInodesNone: ").append(toIndentedString(nfsInodesNone)).append("\n");
        sb.append("    nfsInodesSome: ").append(toIndentedString(nfsInodesSome)).append("\n");
        sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
        sb.append("    nicNumGt: ").append(toIndentedString(nicNumGt)).append("\n");
        sb.append("    nicNumGte: ").append(toIndentedString(nicNumGte)).append("\n");
        sb.append("    nicNumIn: ").append(toIndentedString(nicNumIn)).append("\n");
        sb.append("    nicNumLt: ").append(toIndentedString(nicNumLt)).append("\n");
        sb.append("    nicNumLte: ").append(toIndentedString(nicNumLte)).append("\n");
        sb.append("    nicNumNot: ").append(toIndentedString(nicNumNot)).append("\n");
        sb.append("    nicNumNotIn: ").append(toIndentedString(nicNumNotIn)).append("\n");
        sb.append("    nicsEvery: ").append(toIndentedString(nicsEvery)).append("\n");
        sb.append("    nicsNone: ").append(toIndentedString(nicsNone)).append("\n");
        sb.append("    nicsSome: ").append(toIndentedString(nicsSome)).append("\n");
        sb.append("    nvmfNamespaceNum: ").append(toIndentedString(nvmfNamespaceNum)).append("\n");
        sb.append("    nvmfNamespaceNumGt: ")
                .append(toIndentedString(nvmfNamespaceNumGt))
                .append("\n");
        sb.append("    nvmfNamespaceNumGte: ")
                .append(toIndentedString(nvmfNamespaceNumGte))
                .append("\n");
        sb.append("    nvmfNamespaceNumIn: ")
                .append(toIndentedString(nvmfNamespaceNumIn))
                .append("\n");
        sb.append("    nvmfNamespaceNumLt: ")
                .append(toIndentedString(nvmfNamespaceNumLt))
                .append("\n");
        sb.append("    nvmfNamespaceNumLte: ")
                .append(toIndentedString(nvmfNamespaceNumLte))
                .append("\n");
        sb.append("    nvmfNamespaceNumNot: ")
                .append(toIndentedString(nvmfNamespaceNumNot))
                .append("\n");
        sb.append("    nvmfNamespaceNumNotIn: ")
                .append(toIndentedString(nvmfNamespaceNumNotIn))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNum: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNum))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumGt: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumGt))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumGte: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumGte))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumIn: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumIn))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumLt: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumLt))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumLte: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumLte))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumNot: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumNot))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotNumNotIn: ")
                .append(toIndentedString(nvmfNamespaceSnapshotNumNotIn))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotsEvery: ")
                .append(toIndentedString(nvmfNamespaceSnapshotsEvery))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotsNone: ")
                .append(toIndentedString(nvmfNamespaceSnapshotsNone))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshotsSome: ")
                .append(toIndentedString(nvmfNamespaceSnapshotsSome))
                .append("\n");
        sb.append("    nvmfNamespacesEvery: ")
                .append(toIndentedString(nvmfNamespacesEvery))
                .append("\n");
        sb.append("    nvmfNamespacesNone: ")
                .append(toIndentedString(nvmfNamespacesNone))
                .append("\n");
        sb.append("    nvmfNamespacesSome: ")
                .append(toIndentedString(nvmfNamespacesSome))
                .append("\n");
        sb.append("    nvmfSubsystemNum: ").append(toIndentedString(nvmfSubsystemNum)).append("\n");
        sb.append("    nvmfSubsystemNumGt: ")
                .append(toIndentedString(nvmfSubsystemNumGt))
                .append("\n");
        sb.append("    nvmfSubsystemNumGte: ")
                .append(toIndentedString(nvmfSubsystemNumGte))
                .append("\n");
        sb.append("    nvmfSubsystemNumIn: ")
                .append(toIndentedString(nvmfSubsystemNumIn))
                .append("\n");
        sb.append("    nvmfSubsystemNumLt: ")
                .append(toIndentedString(nvmfSubsystemNumLt))
                .append("\n");
        sb.append("    nvmfSubsystemNumLte: ")
                .append(toIndentedString(nvmfSubsystemNumLte))
                .append("\n");
        sb.append("    nvmfSubsystemNumNot: ")
                .append(toIndentedString(nvmfSubsystemNumNot))
                .append("\n");
        sb.append("    nvmfSubsystemNumNotIn: ")
                .append(toIndentedString(nvmfSubsystemNumNotIn))
                .append("\n");
        sb.append("    nvmfSubsystemsEvery: ")
                .append(toIndentedString(nvmfSubsystemsEvery))
                .append("\n");
        sb.append("    nvmfSubsystemsNone: ")
                .append(toIndentedString(nvmfSubsystemsNone))
                .append("\n");
        sb.append("    nvmfSubsystemsSome: ")
                .append(toIndentedString(nvmfSubsystemsSome))
                .append("\n");
        sb.append("    securityPoliciesEvery: ")
                .append(toIndentedString(securityPoliciesEvery))
                .append("\n");
        sb.append("    securityPoliciesNone: ")
                .append(toIndentedString(securityPoliciesNone))
                .append("\n");
        sb.append("    securityPoliciesSome: ")
                .append(toIndentedString(securityPoliciesSome))
                .append("\n");
        sb.append("    securityPolicyNum: ")
                .append(toIndentedString(securityPolicyNum))
                .append("\n");
        sb.append("    securityPolicyNumGt: ")
                .append(toIndentedString(securityPolicyNumGt))
                .append("\n");
        sb.append("    securityPolicyNumGte: ")
                .append(toIndentedString(securityPolicyNumGte))
                .append("\n");
        sb.append("    securityPolicyNumIn: ")
                .append(toIndentedString(securityPolicyNumIn))
                .append("\n");
        sb.append("    securityPolicyNumLt: ")
                .append(toIndentedString(securityPolicyNumLt))
                .append("\n");
        sb.append("    securityPolicyNumLte: ")
                .append(toIndentedString(securityPolicyNumLte))
                .append("\n");
        sb.append("    securityPolicyNumNot: ")
                .append(toIndentedString(securityPolicyNumNot))
                .append("\n");
        sb.append("    securityPolicyNumNotIn: ")
                .append(toIndentedString(securityPolicyNumNotIn))
                .append("\n");
        sb.append("    systemVlanNum: ").append(toIndentedString(systemVlanNum)).append("\n");
        sb.append("    systemVlanNumGt: ").append(toIndentedString(systemVlanNumGt)).append("\n");
        sb.append("    systemVlanNumGte: ").append(toIndentedString(systemVlanNumGte)).append("\n");
        sb.append("    systemVlanNumIn: ").append(toIndentedString(systemVlanNumIn)).append("\n");
        sb.append("    systemVlanNumLt: ").append(toIndentedString(systemVlanNumLt)).append("\n");
        sb.append("    systemVlanNumLte: ").append(toIndentedString(systemVlanNumLte)).append("\n");
        sb.append("    systemVlanNumNot: ").append(toIndentedString(systemVlanNumNot)).append("\n");
        sb.append("    systemVlanNumNotIn: ")
                .append(toIndentedString(systemVlanNumNotIn))
                .append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    totalNumGt: ").append(toIndentedString(totalNumGt)).append("\n");
        sb.append("    totalNumGte: ").append(toIndentedString(totalNumGte)).append("\n");
        sb.append("    totalNumIn: ").append(toIndentedString(totalNumIn)).append("\n");
        sb.append("    totalNumLt: ").append(toIndentedString(totalNumLt)).append("\n");
        sb.append("    totalNumLte: ").append(toIndentedString(totalNumLte)).append("\n");
        sb.append("    totalNumNot: ").append(toIndentedString(totalNumNot)).append("\n");
        sb.append("    totalNumNotIn: ").append(toIndentedString(totalNumNotIn)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueContains: ").append(toIndentedString(valueContains)).append("\n");
        sb.append("    valueEndsWith: ").append(toIndentedString(valueEndsWith)).append("\n");
        sb.append("    valueGt: ").append(toIndentedString(valueGt)).append("\n");
        sb.append("    valueGte: ").append(toIndentedString(valueGte)).append("\n");
        sb.append("    valueIn: ").append(toIndentedString(valueIn)).append("\n");
        sb.append("    valueLt: ").append(toIndentedString(valueLt)).append("\n");
        sb.append("    valueLte: ").append(toIndentedString(valueLte)).append("\n");
        sb.append("    valueNot: ").append(toIndentedString(valueNot)).append("\n");
        sb.append("    valueNotContains: ").append(toIndentedString(valueNotContains)).append("\n");
        sb.append("    valueNotEndsWith: ").append(toIndentedString(valueNotEndsWith)).append("\n");
        sb.append("    valueNotIn: ").append(toIndentedString(valueNotIn)).append("\n");
        sb.append("    valueNotStartsWith: ")
                .append(toIndentedString(valueNotStartsWith))
                .append("\n");
        sb.append("    valueStartsWith: ").append(toIndentedString(valueStartsWith)).append("\n");
        sb.append("    vdsNum: ").append(toIndentedString(vdsNum)).append("\n");
        sb.append("    vdsNumGt: ").append(toIndentedString(vdsNumGt)).append("\n");
        sb.append("    vdsNumGte: ").append(toIndentedString(vdsNumGte)).append("\n");
        sb.append("    vdsNumIn: ").append(toIndentedString(vdsNumIn)).append("\n");
        sb.append("    vdsNumLt: ").append(toIndentedString(vdsNumLt)).append("\n");
        sb.append("    vdsNumLte: ").append(toIndentedString(vdsNumLte)).append("\n");
        sb.append("    vdsNumNot: ").append(toIndentedString(vdsNumNot)).append("\n");
        sb.append("    vdsNumNotIn: ").append(toIndentedString(vdsNumNotIn)).append("\n");
        sb.append("    vdsesEvery: ").append(toIndentedString(vdsesEvery)).append("\n");
        sb.append("    vdsesNone: ").append(toIndentedString(vdsesNone)).append("\n");
        sb.append("    vdsesSome: ").append(toIndentedString(vdsesSome)).append("\n");
        sb.append("    vlansEvery: ").append(toIndentedString(vlansEvery)).append("\n");
        sb.append("    vlansNone: ").append(toIndentedString(vlansNone)).append("\n");
        sb.append("    vlansSome: ").append(toIndentedString(vlansSome)).append("\n");
        sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
        sb.append("    vmNumGt: ").append(toIndentedString(vmNumGt)).append("\n");
        sb.append("    vmNumGte: ").append(toIndentedString(vmNumGte)).append("\n");
        sb.append("    vmNumIn: ").append(toIndentedString(vmNumIn)).append("\n");
        sb.append("    vmNumLt: ").append(toIndentedString(vmNumLt)).append("\n");
        sb.append("    vmNumLte: ").append(toIndentedString(vmNumLte)).append("\n");
        sb.append("    vmNumNot: ").append(toIndentedString(vmNumNot)).append("\n");
        sb.append("    vmNumNotIn: ").append(toIndentedString(vmNumNotIn)).append("\n");
        sb.append("    vmSnapshotNum: ").append(toIndentedString(vmSnapshotNum)).append("\n");
        sb.append("    vmSnapshotNumGt: ").append(toIndentedString(vmSnapshotNumGt)).append("\n");
        sb.append("    vmSnapshotNumGte: ").append(toIndentedString(vmSnapshotNumGte)).append("\n");
        sb.append("    vmSnapshotNumIn: ").append(toIndentedString(vmSnapshotNumIn)).append("\n");
        sb.append("    vmSnapshotNumLt: ").append(toIndentedString(vmSnapshotNumLt)).append("\n");
        sb.append("    vmSnapshotNumLte: ").append(toIndentedString(vmSnapshotNumLte)).append("\n");
        sb.append("    vmSnapshotNumNot: ").append(toIndentedString(vmSnapshotNumNot)).append("\n");
        sb.append("    vmSnapshotNumNotIn: ")
                .append(toIndentedString(vmSnapshotNumNotIn))
                .append("\n");
        sb.append("    vmSnapshotsEvery: ").append(toIndentedString(vmSnapshotsEvery)).append("\n");
        sb.append("    vmSnapshotsNone: ").append(toIndentedString(vmSnapshotsNone)).append("\n");
        sb.append("    vmSnapshotsSome: ").append(toIndentedString(vmSnapshotsSome)).append("\n");
        sb.append("    vmTemplateNum: ").append(toIndentedString(vmTemplateNum)).append("\n");
        sb.append("    vmTemplateNumGt: ").append(toIndentedString(vmTemplateNumGt)).append("\n");
        sb.append("    vmTemplateNumGte: ").append(toIndentedString(vmTemplateNumGte)).append("\n");
        sb.append("    vmTemplateNumIn: ").append(toIndentedString(vmTemplateNumIn)).append("\n");
        sb.append("    vmTemplateNumLt: ").append(toIndentedString(vmTemplateNumLt)).append("\n");
        sb.append("    vmTemplateNumLte: ").append(toIndentedString(vmTemplateNumLte)).append("\n");
        sb.append("    vmTemplateNumNot: ").append(toIndentedString(vmTemplateNumNot)).append("\n");
        sb.append("    vmTemplateNumNotIn: ")
                .append(toIndentedString(vmTemplateNumNotIn))
                .append("\n");
        sb.append("    vmTemplatesEvery: ").append(toIndentedString(vmTemplatesEvery)).append("\n");
        sb.append("    vmTemplatesNone: ").append(toIndentedString(vmTemplatesNone)).append("\n");
        sb.append("    vmTemplatesSome: ").append(toIndentedString(vmTemplatesSome)).append("\n");
        sb.append("    vmVlanNum: ").append(toIndentedString(vmVlanNum)).append("\n");
        sb.append("    vmVlanNumGt: ").append(toIndentedString(vmVlanNumGt)).append("\n");
        sb.append("    vmVlanNumGte: ").append(toIndentedString(vmVlanNumGte)).append("\n");
        sb.append("    vmVlanNumIn: ").append(toIndentedString(vmVlanNumIn)).append("\n");
        sb.append("    vmVlanNumLt: ").append(toIndentedString(vmVlanNumLt)).append("\n");
        sb.append("    vmVlanNumLte: ").append(toIndentedString(vmVlanNumLte)).append("\n");
        sb.append("    vmVlanNumNot: ").append(toIndentedString(vmVlanNumNot)).append("\n");
        sb.append("    vmVlanNumNotIn: ").append(toIndentedString(vmVlanNumNotIn)).append("\n");
        sb.append("    vmVolumeNum: ").append(toIndentedString(vmVolumeNum)).append("\n");
        sb.append("    vmVolumeNumGt: ").append(toIndentedString(vmVolumeNumGt)).append("\n");
        sb.append("    vmVolumeNumGte: ").append(toIndentedString(vmVolumeNumGte)).append("\n");
        sb.append("    vmVolumeNumIn: ").append(toIndentedString(vmVolumeNumIn)).append("\n");
        sb.append("    vmVolumeNumLt: ").append(toIndentedString(vmVolumeNumLt)).append("\n");
        sb.append("    vmVolumeNumLte: ").append(toIndentedString(vmVolumeNumLte)).append("\n");
        sb.append("    vmVolumeNumNot: ").append(toIndentedString(vmVolumeNumNot)).append("\n");
        sb.append("    vmVolumeNumNotIn: ").append(toIndentedString(vmVolumeNumNotIn)).append("\n");
        sb.append("    vmVolumeSnapshotNum: ")
                .append(toIndentedString(vmVolumeSnapshotNum))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumGt: ")
                .append(toIndentedString(vmVolumeSnapshotNumGt))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumGte: ")
                .append(toIndentedString(vmVolumeSnapshotNumGte))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumIn: ")
                .append(toIndentedString(vmVolumeSnapshotNumIn))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumLt: ")
                .append(toIndentedString(vmVolumeSnapshotNumLt))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumLte: ")
                .append(toIndentedString(vmVolumeSnapshotNumLte))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumNot: ")
                .append(toIndentedString(vmVolumeSnapshotNumNot))
                .append("\n");
        sb.append("    vmVolumeSnapshotNumNotIn: ")
                .append(toIndentedString(vmVolumeSnapshotNumNotIn))
                .append("\n");
        sb.append("    vmVolumeSnapshotsEvery: ")
                .append(toIndentedString(vmVolumeSnapshotsEvery))
                .append("\n");
        sb.append("    vmVolumeSnapshotsNone: ")
                .append(toIndentedString(vmVolumeSnapshotsNone))
                .append("\n");
        sb.append("    vmVolumeSnapshotsSome: ")
                .append(toIndentedString(vmVolumeSnapshotsSome))
                .append("\n");
        sb.append("    vmVolumesEvery: ").append(toIndentedString(vmVolumesEvery)).append("\n");
        sb.append("    vmVolumesNone: ").append(toIndentedString(vmVolumesNone)).append("\n");
        sb.append("    vmVolumesSome: ").append(toIndentedString(vmVolumesSome)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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
