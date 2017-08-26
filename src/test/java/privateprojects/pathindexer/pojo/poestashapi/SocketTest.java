package privateprojects.pathindexer.pojo.poestashapi;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class SocketTest {
  private static final String EXAMPLE_SOCKET = "{\"group\":0,\"attr\":\"S\"}";

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void testReadSocket() throws IOException {
    Socket socket = mapper.readValue(EXAMPLE_SOCKET, Socket.class);
    assertEquals(Integer.valueOf(0), socket.getGroup());
    assertEquals("S", socket.getAttribute());
  }
}
