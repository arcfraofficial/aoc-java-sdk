package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LabelGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LabelGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_LABEL_IDS = "label_ids";

    @SerializedName(SERIALIZED_NAME_LABEL_IDS)
    private List<String> labelIds = new ArrayList<String>();

    public LabelGroup() {}

    public LabelGroup labelIds(List<String> labelIds) {

        this.labelIds = labelIds;
        return this;
    }

    public LabelGroup addLabelIdsItem(String labelIdsItem) {
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
     * Get labelIds
     *
     * @return labelIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<String> labelIds) {
        this.labelIds = labelIds;
    }

    public LabelGroup labelIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_IDS);
        return this;
    }

    public LabelGroup labelIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABEL_IDS);
        return this;
    }

    public void setLabelIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABEL_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABEL_IDS);
        }
    }

    public boolean getLabelIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABEL_IDS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelGroup labelGroup = (LabelGroup) o;
        return Objects.equals(this.labelIds, labelGroup.labelIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelGroup {\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
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
