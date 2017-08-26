package privateprojects.pathindexer.pojo.poestashapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of a socket of an {@link Item}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Socket {

  @JsonProperty("group")
  private Integer group;
  @JsonProperty("attr")
  private String attribute;

  @JsonProperty("group")
  public Integer getGroup() {
    return group;
  }

  @JsonProperty("group")
  public void setGroup(Integer group) {
    this.group = group;
  }

  @JsonProperty("attr")
  public String getAttribute() {
    return attribute;
  }

  @JsonProperty("attr")
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }
}
