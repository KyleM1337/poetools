package privateprojects.pathindexer.http;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/**
 * Simple @link {@link ResponseHandler} to process a response as a string.
 */
public class StringResponseHandler implements ResponseHandler<String> {
  public static final StringResponseHandler RESPONSE_HANDLER = new StringResponseHandler();

  private StringResponseHandler() {}

  @Override
  public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
    int status = response.getStatusLine().getStatusCode();
    if (status >= 200 && status < 300) {
      HttpEntity entity = response.getEntity();
      return entity != null ? EntityUtils.toString(entity) : "";
    } else {
      throw new ClientProtocolException("Unexpected response status: " + status);
    }
  }
}
