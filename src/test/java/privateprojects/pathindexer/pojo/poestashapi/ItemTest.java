package privateprojects.pathindexer.pojo.poestashapi;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class ItemTest {
  private static final String EXAMPLE_ITEM =
      "{\"verified\":false,\"w\":2,\"h\":4,\"ilvl\":71,\"icon\":\"iconLink\",\"league\":\"Hardcore\","
          + "\"id\":\"uid123\",\"sockets\":[],\"name\":\"<format>Roth'sReach\",\"typeLine\":\"RecurveBow\","
          + "\"identified\":true,\"corrupted\":false,\"lockedToCharacter\":false,\"note\":\"price10exa\","
          + "\"properties\":[],\"requirements\":[],\"explicitMods\":[\"a\",\"b\",\"c\"],\"flavourText\":[\"1\",\"2\"],"
          + "\"frameType\":3,\"x\":10,\"y\":0,\"inventoryId\":\"Stash1\",\"socketedItems\":[]}";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void testReadStashTabs() throws IOException {
    Item item = mapper.readValue(EXAMPLE_ITEM, Item.class);
    assertFalse(item.getVerified());
    assertEquals(Integer.valueOf(2), item.getWidth());
    assertEquals(Integer.valueOf(4), item.getHeight());
    assertEquals(Integer.valueOf(71), item.getItemLevel());
    assertEquals("iconLink", item.getIcon());
    assertEquals("Hardcore", item.getLeague());
    assertEquals("uid123", item.getId());
    assertTrue(item.getSockets().isEmpty());
    assertEquals("<format>Roth'sReach", item.getName());
    assertEquals("RecurveBow", item.getTypeLine());
    assertTrue(item.getIdentified());
    assertFalse(item.getCorrupted());
    assertFalse(item.getLockedToCharacter());
    assertEquals("price10exa", item.getNote());
    assertTrue(item.getProperties().isEmpty());
    assertNull(item.getAdditionalProperties());
    assertTrue(item.getRequirements().isEmpty());
    assertNull(item.getNextLevelRequirements());
    assertEquals(Arrays.asList(new String[] {"a", "b", "c"}), item.getExplicitMods());
    assertEquals(Arrays.asList(new String[] {"1", "2"}), item.getFlavourText());
    assertEquals(Integer.valueOf(3), item.getFrameType());
    assertEquals(Integer.valueOf(10), item.getX());
    assertEquals(Integer.valueOf(0), item.getY());
    assertEquals("Stash1", item.getInventoryId());
    assertTrue(item.getSocketedItems().isEmpty());
  }
}
