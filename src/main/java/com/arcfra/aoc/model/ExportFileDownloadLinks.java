package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ExportFileDownloadLinks */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ExportFileDownloadLinks
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_LINK = "link";

    @SerializedName(SERIALIZED_NAME_LINK)
    private String link;

    public static final String SERIALIZED_NAME_FILENAME = "filename";

    @SerializedName(SERIALIZED_NAME_FILENAME)
    private String filename;

    public ExportFileDownloadLinks() {}

    public ExportFileDownloadLinks link(String link) {

        this.link = link;
        return this;
    }

    /**
     * Get link
     *
     * @return link
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ExportFileDownloadLinks link_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LINK);
        return this;
    }

    public ExportFileDownloadLinks link_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LINK);
        return this;
    }

    public void setLink_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LINK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LINK);
        }
    }

    public boolean getLink_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LINK);
    }

    public ExportFileDownloadLinks filename(String filename) {

        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ExportFileDownloadLinks filename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILENAME);
        return this;
    }

    public ExportFileDownloadLinks filename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILENAME);
        return this;
    }

    public void setFilename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILENAME);
        }
    }

    public boolean getFilename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILENAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportFileDownloadLinks exportFileDownloadLinks = (ExportFileDownloadLinks) o;
        return Objects.equals(this.link, exportFileDownloadLinks.link)
                && Objects.equals(this.filename, exportFileDownloadLinks.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, filename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFileDownloadLinks {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
