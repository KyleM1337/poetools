package privateprojects.pathindexer.pojo.poestashapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class StashTest {
  private static final String EXAMPLE_STASH =
      "{\"accountName\":\"BorBerm\",\"lastCharacterName\":\"Wind_riseS\",\"id\":\"abc\",\"stash\":\"Alt\","
          + "\"stashType\":\"PremiumStash\",\"items\":[],\"public\":false}";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void testReadStash() throws IOException {
    Stash stash = mapper.readValue(EXAMPLE_STASH, Stash.class);
    assertEquals("BorBerm", stash.getAccountName());
    assertEquals("Wind_riseS", stash.getLastCharacterName());
    assertEquals("abc", stash.getId());
    assertEquals("Alt", stash.getStash());
    assertEquals("PremiumStash", stash.getStashType());
    assertTrue(stash.getItems().isEmpty());
    assertEquals(false, stash.getIsPublic());
  }
}
