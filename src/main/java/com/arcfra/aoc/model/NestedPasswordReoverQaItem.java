package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedPasswordReoverQaItem */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedPasswordReoverQaItem
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_QUESTION = "question";

    @SerializedName(SERIALIZED_NAME_QUESTION)
    private String question;

    public NestedPasswordReoverQaItem() {}

    public NestedPasswordReoverQaItem question(String question) {

        this.question = question;
        return this;
    }

    /**
     * Get question
     *
     * @return question
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public NestedPasswordReoverQaItem question_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QUESTION);
        return this;
    }

    public NestedPasswordReoverQaItem question_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QUESTION);
        return this;
    }

    public void setQuestion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QUESTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QUESTION);
        }
    }

    public boolean getQuestion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QUESTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedPasswordReoverQaItem nestedPasswordReoverQaItem = (NestedPasswordReoverQaItem) o;
        return Objects.equals(this.question, nestedPasswordReoverQaItem.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedPasswordReoverQaItem {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
