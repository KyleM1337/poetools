package privateprojects.pathindexer.pojo.poestashapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Representation of a Property of an {@link Item}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Property {

  @JsonProperty("name")
  private String name;
  @JsonProperty("values")
  private List<List<Object>> values;
  @JsonProperty("displayMode")
  private Integer displayMode;
  @JsonProperty("progress")
  private Double progress;
  @JsonProperty("type")
  private Integer type;

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("values")
  public List<List<Object>> getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(List<List<Object>> values) {
    this.values = values;
  }

  @JsonProperty("displayMode")
  public Integer getDisplayMode() {
    return displayMode;
  }

  @JsonProperty("displayMode")
  public void setDisplayMode(Integer displayMode) {
    this.displayMode = displayMode;
  }

  @JsonProperty("progress")
  public Double getProgress() {
    return progress;
  }

  @JsonProperty("progress")
  public void setProgress(Double progress) {
    this.progress = progress;
  }

  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(Integer type) {
    this.type = type;
  }
}
