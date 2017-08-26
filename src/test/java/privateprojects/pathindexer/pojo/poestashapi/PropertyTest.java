package privateprojects.pathindexer.pojo.poestashapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class PropertyTest {
  private final String EXAMPLE_QUALITY =
      "{\"name\":\"Quality\",\"values\":[[\"+17%\",1]],\"displayMode\":0,\"type\":6}";
  private final String EXAMPLE_EXPERIENCE =
      "{\"name\":\"Experience\",\"values\":[[\"1/388734\",0]],\"displayMode\":2,\"progress\":0.0000025724532406457}";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void testReadQuality() throws IOException {
    Property property = mapper.readValue(EXAMPLE_QUALITY, Property.class);
    assertEquals("Quality", property.getName());
    assertEquals("+17%", property.getValues().get(0).get(0));
    assertEquals(Integer.valueOf(1), property.getValues().get(0).get(1));
    assertEquals(Integer.valueOf(0), property.getDisplayMode());
    assertEquals(Integer.valueOf(6), property.getType());
    assertNull(property.getProgress());
  }

  @Test
  public void testReadExperience() throws IOException {
    Property property = mapper.readValue(EXAMPLE_EXPERIENCE, Property.class);
    assertEquals("Experience", property.getName());
    assertEquals("1/388734", property.getValues().get(0).get(0));
    assertEquals(Integer.valueOf(0), property.getValues().get(0).get(1));
    assertEquals(Integer.valueOf(2), property.getDisplayMode());
    assertEquals(0.0000025724532406457, property.getProgress(), 0.00001);
    assertNull(property.getType());
  }
}
