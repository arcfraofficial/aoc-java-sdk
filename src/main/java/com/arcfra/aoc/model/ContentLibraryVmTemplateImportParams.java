package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ContentLibraryVmTemplateImportParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateImportParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<ContentLibraryImportVmNic> vmNics = null;

    public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";

    @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
    private ContentLibraryVmTemplateOvfDiskOperate diskOperate;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";

    @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
    private ByteUnit memoryUnit;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";

    @SerializedName(SERIALIZED_NAME_CPU_CORES)
    private Integer cpuCores;

    public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";

    @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
    private Integer cpuSockets;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_UPLOAD_TASKS = "upload_tasks";

    @SerializedName(SERIALIZED_NAME_UPLOAD_TASKS)
    private List<String> uploadTasks = new ArrayList<String>();

    public static final String SERIALIZED_NAME_PARSED_OVF = "parsed_ovf";

    @SerializedName(SERIALIZED_NAME_PARSED_OVF)
    private ParsedOVF parsedOvf;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public ContentLibraryVmTemplateImportParams() {}

    public ContentLibraryVmTemplateImportParams vmNics(List<ContentLibraryImportVmNic> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public ContentLibraryVmTemplateImportParams addVmNicsItem(
            ContentLibraryImportVmNic vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<ContentLibraryImportVmNic>();
        }
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ContentLibraryImportVmNic> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<ContentLibraryImportVmNic> vmNics) {
        this.vmNics = vmNics;
    }

    public ContentLibraryVmTemplateImportParams vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public ContentLibraryVmTemplateImportParams vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    public ContentLibraryVmTemplateImportParams diskOperate(
            ContentLibraryVmTemplateOvfDiskOperate diskOperate) {

        this.diskOperate = diskOperate;
        return this;
    }

    /**
     * Get diskOperate
     *
     * @return diskOperate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateOvfDiskOperate getDiskOperate() {
        return diskOperate;
    }

    public void setDiskOperate(ContentLibraryVmTemplateOvfDiskOperate diskOperate) {
        this.diskOperate = diskOperate;
    }

    public ContentLibraryVmTemplateImportParams diskOperate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_OPERATE);
        return this;
    }

    public ContentLibraryVmTemplateImportParams diskOperate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_OPERATE);
        return this;
    }

    public void setDiskOperate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_OPERATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_OPERATE);
        }
    }

    public boolean getDiskOperate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_OPERATE);
    }

    public ContentLibraryVmTemplateImportParams ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public ContentLibraryVmTemplateImportParams ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public ContentLibraryVmTemplateImportParams ha_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA);
        return this;
    }

    public void setHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA);
        }
    }

    public boolean getHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA);
    }

    public ContentLibraryVmTemplateImportParams memoryUnit(ByteUnit memoryUnit) {

        this.memoryUnit = memoryUnit;
        return this;
    }

    /**
     * Get memoryUnit
     *
     * @return memoryUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getMemoryUnit() {
        return memoryUnit;
    }

    public void setMemoryUnit(ByteUnit memoryUnit) {
        this.memoryUnit = memoryUnit;
    }

    public ContentLibraryVmTemplateImportParams memoryUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public ContentLibraryVmTemplateImportParams memoryUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public void setMemoryUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_UNIT);
        }
    }

    public boolean getMemoryUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_UNIT);
    }

    public ContentLibraryVmTemplateImportParams memory(Long memory) {

        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public ContentLibraryVmTemplateImportParams memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public ContentLibraryVmTemplateImportParams memory_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public void setMemory_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        }
    }

    public boolean getMemory_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY);
    }

    public ContentLibraryVmTemplateImportParams vcpu(Integer vcpu) {

        this.vcpu = vcpu;
        return this;
    }

    /**
     * Get vcpu
     *
     * @return vcpu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public ContentLibraryVmTemplateImportParams vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public ContentLibraryVmTemplateImportParams vcpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        return this;
    }

    public void setVcpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        }
    }

    public boolean getVcpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU);
    }

    public ContentLibraryVmTemplateImportParams cpuCores(Integer cpuCores) {

        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * Get cpuCores
     *
     * @return cpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public ContentLibraryVmTemplateImportParams cpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_CORES);
        return this;
    }

    public ContentLibraryVmTemplateImportParams cpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_CORES);
        return this;
    }

    public void setCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_CORES);
        }
    }

    public boolean getCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_CORES);
    }

    public ContentLibraryVmTemplateImportParams cpuSockets(Integer cpuSockets) {

        this.cpuSockets = cpuSockets;
        return this;
    }

    /**
     * Get cpuSockets
     *
     * @return cpuSockets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCpuSockets() {
        return cpuSockets;
    }

    public void setCpuSockets(Integer cpuSockets) {
        this.cpuSockets = cpuSockets;
    }

    public ContentLibraryVmTemplateImportParams cpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_SOCKETS);
        return this;
    }

    public ContentLibraryVmTemplateImportParams cpuSockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_SOCKETS);
        return this;
    }

    public void setCpuSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_SOCKETS);
        }
    }

    public boolean getCpuSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_SOCKETS);
    }

    public ContentLibraryVmTemplateImportParams description(String description) {

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

    public ContentLibraryVmTemplateImportParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ContentLibraryVmTemplateImportParams description_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateImportParams name(String name) {

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

    public ContentLibraryVmTemplateImportParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ContentLibraryVmTemplateImportParams name_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateImportParams uploadTasks(List<String> uploadTasks) {

        this.uploadTasks = uploadTasks;
        return this;
    }

    public ContentLibraryVmTemplateImportParams addUploadTasksItem(String uploadTasksItem) {
        this.uploadTasks.add(uploadTasksItem);
        return this;
    }

    /**
     * Get uploadTasks
     *
     * @return uploadTasks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getUploadTasks() {
        return uploadTasks;
    }

    public void setUploadTasks(List<String> uploadTasks) {
        this.uploadTasks = uploadTasks;
    }

    public ContentLibraryVmTemplateImportParams uploadTasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASKS);
        return this;
    }

    public ContentLibraryVmTemplateImportParams uploadTasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASKS);
        return this;
    }

    public void setUploadTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASKS);
        }
    }

    public boolean getUploadTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPLOAD_TASKS);
    }

    public ContentLibraryVmTemplateImportParams parsedOvf(ParsedOVF parsedOvf) {

        this.parsedOvf = parsedOvf;
        return this;
    }

    /**
     * Get parsedOvf
     *
     * @return parsedOvf
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ParsedOVF getParsedOvf() {
        return parsedOvf;
    }

    public void setParsedOvf(ParsedOVF parsedOvf) {
        this.parsedOvf = parsedOvf;
    }

    public ContentLibraryVmTemplateImportParams parsedOvf_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARSED_OVF);
        return this;
    }

    public ContentLibraryVmTemplateImportParams parsedOvf_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARSED_OVF);
        return this;
    }

    public void setParsedOvf_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARSED_OVF);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARSED_OVF);
        }
    }

    public boolean getParsedOvf_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARSED_OVF);
    }

    public ContentLibraryVmTemplateImportParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ContentLibraryVmTemplateImportParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public ContentLibraryVmTemplateImportParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryVmTemplateImportParams contentLibraryVmTemplateImportParams =
                (ContentLibraryVmTemplateImportParams) o;
        return Objects.equals(this.vmNics, contentLibraryVmTemplateImportParams.vmNics)
                && Objects.equals(
                        this.diskOperate, contentLibraryVmTemplateImportParams.diskOperate)
                && Objects.equals(this.ha, contentLibraryVmTemplateImportParams.ha)
                && Objects.equals(this.memoryUnit, contentLibraryVmTemplateImportParams.memoryUnit)
                && Objects.equals(this.memory, contentLibraryVmTemplateImportParams.memory)
                && Objects.equals(this.vcpu, contentLibraryVmTemplateImportParams.vcpu)
                && Objects.equals(this.cpuCores, contentLibraryVmTemplateImportParams.cpuCores)
                && Objects.equals(this.cpuSockets, contentLibraryVmTemplateImportParams.cpuSockets)
                && Objects.equals(
                        this.description, contentLibraryVmTemplateImportParams.description)
                && Objects.equals(this.name, contentLibraryVmTemplateImportParams.name)
                && Objects.equals(
                        this.uploadTasks, contentLibraryVmTemplateImportParams.uploadTasks)
                && Objects.equals(this.parsedOvf, contentLibraryVmTemplateImportParams.parsedOvf)
                && Objects.equals(this.clusterId, contentLibraryVmTemplateImportParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vmNics,
                diskOperate,
                ha,
                memoryUnit,
                memory,
                vcpu,
                cpuCores,
                cpuSockets,
                description,
                name,
                uploadTasks,
                parsedOvf,
                clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmTemplateImportParams {\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    diskOperate: ").append(toIndentedString(diskOperate)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uploadTasks: ").append(toIndentedString(uploadTasks)).append("\n");
        sb.append("    parsedOvf: ").append(toIndentedString(parsedOvf)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
