package privateprojects.pathindexer.pojo.poestashapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of public stash tab api.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StashTabs {

  @JsonProperty("next_change_id")
  private String nextChangeId;
  @JsonProperty("stashes")
  private List<Stash> stashes;

  @JsonProperty("next_change_id")
  public String getNextChangeId() {
    return nextChangeId;
  }

  @JsonProperty("next_change_id")
  public void setNextChangeId(String nextChangeId) {
    this.nextChangeId = nextChangeId;
  }

  @JsonProperty("stashes")
  public List<Stash> getStashes() {
    return stashes;
  }

  @JsonProperty("stashes")
  public void setStashes(List<Stash> stashes) {
    this.stashes = stashes;
  }
}
