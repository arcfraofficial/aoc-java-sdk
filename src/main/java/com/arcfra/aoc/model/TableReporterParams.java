package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** TableReporterParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TableReporterParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FILTER = "filter";

    @SerializedName(SERIALIZED_NAME_FILTER)
    private TableReporterParamsFilter filter;

    public static final String SERIALIZED_NAME_COLUMNS = "columns";

    @SerializedName(SERIALIZED_NAME_COLUMNS)
    private List<ColumnConfig> columns = new ArrayList<ColumnConfig>();

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public TableReporterParams() {}

    public TableReporterParams filter(TableReporterParamsFilter filter) {

        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     *
     * @return filter
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public TableReporterParamsFilter getFilter() {
        return filter;
    }

    public void setFilter(TableReporterParamsFilter filter) {
        this.filter = filter;
    }

    public TableReporterParams filter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER);
        return this;
    }

    public TableReporterParams filter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER);
        return this;
    }

    public void setFilter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER);
        }
    }

    public boolean getFilter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER);
    }

    public TableReporterParams columns(List<ColumnConfig> columns) {

        this.columns = columns;
        return this;
    }

    public TableReporterParams addColumnsItem(ColumnConfig columnsItem) {
        this.columns.add(columnsItem);
        return this;
    }

    /**
     * Get columns
     *
     * @return columns
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ColumnConfig> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnConfig> columns) {
        this.columns = columns;
    }

    public TableReporterParams columns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COLUMNS);
        return this;
    }

    public TableReporterParams columns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COLUMNS);
        return this;
    }

    public void setColumns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COLUMNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COLUMNS);
        }
    }

    public boolean getColumns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COLUMNS);
    }

    public TableReporterParams name(String name) {

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

    public TableReporterParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public TableReporterParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableReporterParams tableReporterParams = (TableReporterParams) o;
        return Objects.equals(this.filter, tableReporterParams.filter)
                && Objects.equals(this.columns, tableReporterParams.columns)
                && Objects.equals(this.name, tableReporterParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, columns, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableReporterParams {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
