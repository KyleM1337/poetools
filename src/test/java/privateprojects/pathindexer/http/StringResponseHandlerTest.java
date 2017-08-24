package privateprojects.pathindexer.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doReturn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringResponseHandlerTest {
  private static final String RESPONSE = "HelloWorld";

  private StringResponseHandler stringResponseHandler = StringResponseHandler.RESPONSE_HANDLER;

  @Mock
  private HttpResponse httpResponse;
  @Mock
  private StatusLine statusLine;
  @Mock
  private HttpEntity httpEntity;

  @Before
  public void setup() {
    doReturn(statusLine).when(httpResponse).getStatusLine();
    doReturn(HttpStatus.SC_OK).when(statusLine).getStatusCode();
  }

  @Test
  public void whenHandleResponseStatusNotOkayThenThrowException() throws IOException {
    doReturn(HttpStatus.SC_BAD_REQUEST).when(statusLine).getStatusCode();
    try {
      stringResponseHandler.handleResponse(httpResponse);
      fail("Expecting exception");
    } catch (ClientProtocolException e) {
      // Expecting Exception
    }

    doReturn(HttpStatus.SC_PROCESSING).when(statusLine).getStatusCode();
    try {
      stringResponseHandler.handleResponse(httpResponse);
      fail("Expecting exception");
    } catch (ClientProtocolException e) {
      // Expecting Exception
    }
  }

  @Test
  public void whenHandleNullResponseThenReturnEmptyResponse() throws IOException {
    doReturn(null).when(httpResponse).getEntity();
    assertEquals("", stringResponseHandler.handleResponse(httpResponse));
  }

  @Test
  public void whenHandleResponseReturnResponseString() throws IOException {
    InputStream stream = new ByteArrayInputStream(RESPONSE.getBytes(StandardCharsets.UTF_8));
    doReturn(httpEntity).when(httpResponse).getEntity();
    doReturn(stream).when(httpEntity).getContent();
    assertEquals(RESPONSE, stringResponseHandler.handleResponse(httpResponse));
  }
}
