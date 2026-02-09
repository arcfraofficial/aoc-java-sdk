package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ApplicationVmSpecPlacement */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecPlacement
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VERB = "verb";

    @SerializedName(SERIALIZED_NAME_VERB)
    private ApplicationVmSpecPlacementVerb verb;

    public static final String SERIALIZED_NAME_SITUATION = "situation";

    @SerializedName(SERIALIZED_NAME_SITUATION)
    private ApplicationVmSpecPlacementSituation situation;

    public ApplicationVmSpecPlacement() {}

    public ApplicationVmSpecPlacement verb(ApplicationVmSpecPlacementVerb verb) {

        this.verb = verb;
        return this;
    }

    /**
     * Get verb
     *
     * @return verb
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ApplicationVmSpecPlacementVerb getVerb() {
        return verb;
    }

    public void setVerb(ApplicationVmSpecPlacementVerb verb) {
        this.verb = verb;
    }

    public ApplicationVmSpecPlacement verb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERB);
        return this;
    }

    public ApplicationVmSpecPlacement verb_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERB);
        return this;
    }

    public void setVerb_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERB);
        }
    }

    public boolean getVerb_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERB);
    }

    public ApplicationVmSpecPlacement situation(ApplicationVmSpecPlacementSituation situation) {

        this.situation = situation;
        return this;
    }

    /**
     * Get situation
     *
     * @return situation
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ApplicationVmSpecPlacementSituation getSituation() {
        return situation;
    }

    public void setSituation(ApplicationVmSpecPlacementSituation situation) {
        this.situation = situation;
    }

    public ApplicationVmSpecPlacement situation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SITUATION);
        return this;
    }

    public ApplicationVmSpecPlacement situation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SITUATION);
        return this;
    }

    public void setSituation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SITUATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SITUATION);
        }
    }

    public boolean getSituation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SITUATION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecPlacement applicationVmSpecPlacement = (ApplicationVmSpecPlacement) o;
        return Objects.equals(this.verb, applicationVmSpecPlacement.verb)
                && Objects.equals(this.situation, applicationVmSpecPlacement.situation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verb, situation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecPlacement {\n");
        sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
        sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
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
