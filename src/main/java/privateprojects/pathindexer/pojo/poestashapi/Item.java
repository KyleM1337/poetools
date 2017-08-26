package privateprojects.pathindexer.pojo.poestashapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of an Item found in {@link Stash}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

  @JsonProperty("verified")
  private Boolean verified;
  @JsonProperty("w")
  private Integer width;
  @JsonProperty("h")
  private Integer height;
  @JsonProperty("ilvl")
  private Integer itemLevel;
  @JsonProperty("icon")
  private String icon;
  @JsonProperty("league")
  private String league;
  @JsonProperty("id")
  private String id;
  @JsonProperty("sockets")
  private List<Socket> sockets;
  @JsonProperty("name")
  private String name;
  @JsonProperty("typeLine")
  private String typeLine;
  @JsonProperty("identified")
  private Boolean identified;
  @JsonProperty("corrupted")
  private Boolean corrupted;
  @JsonProperty("lockedToCharacter")
  private Boolean lockedToCharacter;
  @JsonProperty("note")
  private String note;
  @JsonProperty("properties")
  private List<Property> properties;
  @JsonProperty("additionalProperties")
  private List<Property> additionalProperties;
  @JsonProperty("requirements")
  private List<Property> requirements;
  @JsonProperty("nextLevelRequirements")
  private List<Property> nextLevelRequirements;
  @JsonProperty("secDescrText")
  private String secondDescriptionText; // TODO name?
  @JsonProperty("nextLevelRequirements")
  List<String> implicitMods;
  @JsonProperty("explicitMods")
  private List<String> explicitMods;
  @JsonProperty("flavourText")
  private List<String> flavourText;
  @JsonProperty("frameType")
  private Integer frameType;
  @JsonProperty("x")
  private Integer x;
  @JsonProperty("y")
  private Integer y;
  @JsonProperty("inventoryId")
  private String inventoryId;
  @JsonProperty("socketedItems")
  private List<Item> socketedItems;

  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  @JsonProperty("verified")
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  @JsonProperty("w")
  public Integer getWidth() {
    return width;
  }

  @JsonProperty("w")
  public void setWidth(Integer width) {
    this.width = width;
  }

  @JsonProperty("h")
  public Integer getHeight() {
    return height;
  }

  @JsonProperty("h")
  public void setHeight(Integer height) {
    this.height = height;
  }

  @JsonProperty("ilvl")
  public Integer getItemLevel() {
    return itemLevel;
  }

  @JsonProperty("ilvl")
  public void setItemLevel(Integer itemLevel) {
    this.itemLevel = itemLevel;
  }

  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  @JsonProperty("icon")
  public void setIcon(String icon) {
    this.icon = icon;
  }

  @JsonProperty("league")
  public String getLeague() {
    return league;
  }

  @JsonProperty("league")
  public void setLeague(String league) {
    this.league = league;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("sockets")
  public List<Socket> getSockets() {
    return sockets;
  }

  @JsonProperty("sockets")
  public void setSockets(List<Socket> sockets) {
    this.sockets = sockets;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("typeLine")
  public String getTypeLine() {
    return typeLine;
  }

  @JsonProperty("typeLine")
  public void setTypeLine(String typeLine) {
    this.typeLine = typeLine;
  }

  @JsonProperty("identified")
  public Boolean getIdentified() {
    return identified;
  }

  @JsonProperty("identified")
  public void setIdentified(Boolean identified) {
    this.identified = identified;
  }

  @JsonProperty("corrupted")
  public Boolean getCorrupted() {
    return corrupted;
  }

  @JsonProperty("corrupted")
  public void setCorrupted(Boolean corrupted) {
    this.corrupted = corrupted;
  }

  @JsonProperty("lockedToCharacter")
  public Boolean getLockedToCharacter() {
    return lockedToCharacter;
  }

  @JsonProperty("lockedToCharacter")
  public void setLockedToCharacter(Boolean lockedToCharacter) {
    this.lockedToCharacter = lockedToCharacter;
  }

  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  @JsonProperty("note")
  public void setNote(String note) {
    this.note = note;
  }

  @JsonProperty("properties")
  public List<Property> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  @JsonProperty("additionalProperties")
  public List<Property> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonProperty("additionalProperties")
  public void setAdditionalProperties(List<Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("requirements")
  public List<Property> getRequirements() {
    return requirements;
  }

  @JsonProperty("requirements")
  public void setRequirements(List<Property> requirements) {
    this.requirements = requirements;
  }

  @JsonProperty("nextLevelRequirements")
  public List<Property> getNextLevelRequirements() {
    return nextLevelRequirements;
  }

  @JsonProperty("nextLevelRequirements")
  public void setNextLevelRequirements(List<Property> nextLevelRequirements) {
    this.nextLevelRequirements = nextLevelRequirements;
  }

  @JsonProperty("secDescrText")
  public String getSecondDescriptionText() {
    return secondDescriptionText;
  }

  @JsonProperty("secDescrText")
  public void setSecDescrText(String secDescrText) {
    this.secondDescriptionText = secDescrText;
  }

  @JsonProperty("implicitMods")
  public List<String> getImplicitMods() {
    return implicitMods;
  }

  @JsonProperty("implicitMods")
  public void setImplicitMods(List<String> implicitMods) {
    this.implicitMods = implicitMods;
  }

  @JsonProperty("explicitMods")
  public List<String> getExplicitMods() {
    return explicitMods;
  }

  @JsonProperty("explicitMods")
  public void setExplicitMods(List<String> explicitMods) {
    this.explicitMods = explicitMods;
  }

  @JsonProperty("flavourText")
  public List<String> getFlavourText() {
    return flavourText;
  }

  @JsonProperty("flavourText")
  public void setFlavourText(List<String> flavourText) {
    this.flavourText = flavourText;
  }

  @JsonProperty("frameType")
  public Integer getFrameType() {
    return frameType;
  }

  @JsonProperty("frameType")
  public void setFrameType(Integer frameType) {
    this.frameType = frameType;
  }

  @JsonProperty("x")
  public Integer getX() {
    return x;
  }

  @JsonProperty("x")
  public void setX(Integer x) {
    this.x = x;
  }

  @JsonProperty("y")
  public Integer getY() {
    return y;
  }

  @JsonProperty("y")
  public void setY(Integer y) {
    this.y = y;
  }

  @JsonProperty("inventoryId")
  public String getInventoryId() {
    return inventoryId;
  }

  @JsonProperty("inventoryId")
  public void setInventoryId(String inventoryId) {
    this.inventoryId = inventoryId;
  }

  @JsonProperty("socketedItems")
  public List<Item> getSocketedItems() {
    return socketedItems;
  }

  @JsonProperty("socketedItems")
  public void setSocketedItems(List<Item> socketedItems) {
    this.socketedItems = socketedItems;
  }
}
