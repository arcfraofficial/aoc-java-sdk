package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** View */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class View extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_GRAPHS = "graphs";

    @SerializedName(SERIALIZED_NAME_GRAPHS)
    private List<NestedGraph> graphs = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TIME_SPAN = "time_span";

    @SerializedName(SERIALIZED_NAME_TIME_SPAN)
    private Integer timeSpan;

    public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";

    @SerializedName(SERIALIZED_NAME_TIME_UNIT)
    private TimeUnit timeUnit;

    public View() {}

    public View cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public View cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public View cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public View entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public View entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public View entityAsyncStatus_ExplictlyNonNull() {
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

    public View graphs(List<NestedGraph> graphs) {

        this.graphs = graphs;
        return this;
    }

    public View addGraphsItem(NestedGraph graphsItem) {
        if (this.graphs == null) {
            this.graphs = new ArrayList<NestedGraph>();
        }
        this.graphs.add(graphsItem);
        return this;
    }

    /**
     * Get graphs
     *
     * @return graphs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedGraph> getGraphs() {
        return graphs;
    }

    public void setGraphs(List<NestedGraph> graphs) {
        this.graphs = graphs;
    }

    public View graphs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GRAPHS);
        return this;
    }

    public View graphs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GRAPHS);
        return this;
    }

    public void setGraphs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GRAPHS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GRAPHS);
        }
    }

    public boolean getGraphs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GRAPHS);
    }

    public View id(String id) {

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

    public View id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public View id_ExplictlyNonNull() {
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

    public View localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public View localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public View localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public View name(String name) {

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

    public View name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public View name_ExplictlyNonNull() {
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

    public View timeSpan(Integer timeSpan) {

        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * Get timeSpan
     *
     * @return timeSpan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    public View timeSpan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_SPAN);
        return this;
    }

    public View timeSpan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_SPAN);
        return this;
    }

    public void setTimeSpan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_SPAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_SPAN);
        }
    }

    public boolean getTimeSpan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_SPAN);
    }

    public View timeUnit(TimeUnit timeUnit) {

        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Get timeUnit
     *
     * @return timeUnit
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public View timeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_UNIT);
        return this;
    }

    public View timeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_UNIT);
        return this;
    }

    public void setTimeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_UNIT);
        }
    }

    public boolean getTimeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_UNIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        View view = (View) o;
        return Objects.equals(this.cluster, view.cluster)
                && Objects.equals(this.entityAsyncStatus, view.entityAsyncStatus)
                && Objects.equals(this.graphs, view.graphs)
                && Objects.equals(this.id, view.id)
                && Objects.equals(this.localId, view.localId)
                && Objects.equals(this.name, view.name)
                && Objects.equals(this.timeSpan, view.timeSpan)
                && Objects.equals(this.timeUnit, view.timeUnit);
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
                cluster, entityAsyncStatus, graphs, id, localId, name, timeSpan, timeUnit);
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
        sb.append("class View {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    graphs: ").append(toIndentedString(graphs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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
