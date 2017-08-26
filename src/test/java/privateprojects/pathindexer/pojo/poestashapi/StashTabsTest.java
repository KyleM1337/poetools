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
public class StashTabsTest {
  private static final String EXAMPLE_STASHTABS =
      "{\"next_change_id\":\"2524-4356-3991-4730-1300\",\"stashes\":[]}";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void testReadStashTabs() throws IOException {
    StashTabs stashTabs = mapper.readValue(EXAMPLE_STASHTABS, StashTabs.class);
    assertEquals("2524-4356-3991-4730-1300", stashTabs.getNextChangeId());
    assertTrue(stashTabs.getStashes().isEmpty());
  }
}
