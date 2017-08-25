package privateprojects.pathindexer.http;

import java.io.IOException;
import java.net.URI;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;

/**
 * Wrapper around {@link HttpClient} to perform HTTP requests
 */
public class HttpClientWrapper {
  private final HttpClient httpClient;

  /**
   * Wraps {@link HttpClients#createDefault()}
   * 
   * @param httpClient to wrap
   */
  public HttpClientWrapper() {
    this(HttpClients.createDefault());
  }

  /**
   * Wraps {@link HttpClient}
   * 
   * @param httpClient to wrap
   */
  public HttpClientWrapper(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Perform {@link HttpUriRequest} and process result with {@link ResponseHandler}.
   * 
   * @param httpUriRequest to perform
   * @param responseHandler to process response
   * @return processed response, null on error
   */
  public <T> T peformRequest(HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
    try {
      return httpClient.execute(httpUriRequest, responseHandler);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Perform {@link HttpGet} on URI and process result with {@link ResponseHandler}
   * 
   * @param uri to perform HTTP GET on
   * @param responseHandler to process response
   * @return processed response, null on error
   */
  public <T> T peformGet(URI uri, ResponseHandler<T> responseHandler) {
    return (T) peformRequest(new HttpGet(uri), responseHandler);
  }

  /**
   * Perform {@link HttpGet} on URI and return response as a String
   * 
   * @param uri to perform HTTP GET on
   * @return processed response, null on error
   */
  public String peformGet(URI uri) {
    return peformGet(uri, StringResponseHandler.RESPONSE_HANDLER);
  }
}
