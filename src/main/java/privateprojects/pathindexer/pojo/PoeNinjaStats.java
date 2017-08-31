package privateprojects.pathindexer.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoeNinjaStats {

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("nextChangeId")
  private String nextChangeId;
  @JsonProperty("nextBetaChangeId")
  private String nextBetaChangeId;
  @JsonProperty("apiBytesDownloaded")
  private Long apiBytesDownloaded;
  @JsonProperty("stashTabsProcessed")
  private Integer stashTabsProcessed;
  @JsonProperty("apiCalls")
  private Integer apiCalls;

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("nextChangeId")
  public String getNextChangeId() {
    return nextChangeId;
  }

  @JsonProperty("nextChangeId")
  public void setNextChangeId(String nextChangeId) {
    this.nextChangeId = nextChangeId;
  }

  @JsonProperty("nextBetaChangeId")
  public String getNextBetaChangeId() {
    return nextBetaChangeId;
  }

  @JsonProperty("nextBetaChangeId")
  public void setNextBetaChangeId(String nextBetaChangeId) {
    this.nextBetaChangeId = nextBetaChangeId;
  }

  @JsonProperty("apiBytesDownloaded")
  public Long getApiBytesDownloaded() {
    return apiBytesDownloaded;
  }

  @JsonProperty("apiBytesDownloaded")
  public void setApiBytesDownloaded(Long apiBytesDownloaded) {
    this.apiBytesDownloaded = apiBytesDownloaded;
  }

  @JsonProperty("stashTabsProcessed")
  public Integer getStashTabsProcessed() {
    return stashTabsProcessed;
  }

  @JsonProperty("stashTabsProcessed")
  public void setStashTabsProcessed(Integer stashTabsProcessed) {
    this.stashTabsProcessed = stashTabsProcessed;
  }

  @JsonProperty("apiCalls")
  public Integer getApiCalls() {
    return apiCalls;
  }

  @JsonProperty("apiCalls")
  public void setApiCalls(Integer apiCalls) {
    this.apiCalls = apiCalls;
  }

}
