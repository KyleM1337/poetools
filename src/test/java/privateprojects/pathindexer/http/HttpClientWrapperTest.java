package privateprojects.pathindexer.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.net.URI;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import privateprojects.pathindexer.http.HttpClientWrapper;

@RunWith(MockitoJUnitRunner.class)
public class HttpClientWrapperTest {
  private static final URI HELLO_WORLD_URI = URI.create("HelloWorld");

  private HttpClientWrapper httpClientWrapper;

  @Mock
  private HttpClient httpClient;
  @Mock
  private HttpUriRequest httpUriRequest;
  @Mock
  private ResponseHandler<Object> httpResponseHandler;

  @Before
  public void setup() throws IOException {
    httpClientWrapper = new HttpClientWrapper(httpClient);
    doReturn(new Object()).when(httpClient).execute(eq(httpUriRequest), eq(httpResponseHandler));
  }

  @Test
  public void whenPerformGetThenExecuteGetOnUri() throws IOException {
    ArgumentCaptor<HttpUriRequest> argCaptor = ArgumentCaptor.forClass(HttpUriRequest.class);
    httpClientWrapper.peformGet(HELLO_WORLD_URI, httpResponseHandler);
    verify(httpClient).execute(argCaptor.capture(), eq(httpResponseHandler));
    HttpUriRequest httpUriRequest = argCaptor.getValue();
    assertEquals(HELLO_WORLD_URI, httpUriRequest.getURI());
    assertEquals(HttpGet.METHOD_NAME, httpUriRequest.getMethod());
  }

  @Test
  public void whenPerformRequestThenExecute() throws IOException {
    httpClientWrapper.peformRequest(httpUriRequest, httpResponseHandler);
    verify(httpClient).execute(eq(httpUriRequest), eq(httpResponseHandler));
  }

  @Test
  public void whenPerformRequestAndExecuteThrowsExceptionThenReturnNull() throws IOException {
    doThrow(new IOException()).when(httpClient).execute(eq(httpUriRequest),
        eq(httpResponseHandler));
    assertNull(httpClientWrapper.peformRequest(httpUriRequest, httpResponseHandler));
  }
}
