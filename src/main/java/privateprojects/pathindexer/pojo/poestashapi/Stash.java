package privateprojects.pathindexer.pojo.poestashapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of a stash found in {@link StashTabs}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stash {

  @JsonProperty("accountName")
  private String accountName;
  @JsonProperty("lastCharacterName")
  private String lastCharacterName;
  @JsonProperty("id")
  private String id;
  @JsonProperty("stash")
  private String stash;
  @JsonProperty("stashType")
  private String stashType;
  @JsonProperty("items")
  private List<Item> items;
  @JsonProperty("public")
  private Boolean isPublic;

  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  @JsonProperty("accountName")
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  @JsonProperty("lastCharacterName")
  public String getLastCharacterName() {
    return lastCharacterName;
  }

  @JsonProperty("lastCharacterName")
  public void setLastCharacterName(String lastCharacterName) {
    this.lastCharacterName = lastCharacterName;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("stash")
  public String getStash() {
    return stash;
  }

  @JsonProperty("stash")
  public void setStash(String stash) {
    this.stash = stash;
  }

  @JsonProperty("stashType")
  public String getStashType() {
    return stashType;
  }

  @JsonProperty("stashType")
  public void setStashType(String stashType) {
    this.stashType = stashType;
  }

  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<Item> items) {
    this.items = items;
  }

  @JsonProperty("public")
  public Boolean getIsPublic() {
    return isPublic;
  }

  @JsonProperty("public")
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }
}
