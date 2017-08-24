package privateprojects.pathindexer;

import java.io.IOException;
import java.net.URI;

import privateprojects.pathindexer.http.HttpClientWrapper;

public class Main {
  private static final URI POE_URI =
      URI.create("https://www.pathofexile.com/api/public-stash-tabs");
  private static final URI POE_NINJA_URI = URI.create("http://api.poe.ninja/api/Data/GetStats");

  public static void main(String[] args) throws IOException {
    HttpClientWrapper simpleHttp = new HttpClientWrapper();
    String poeNinjaResponse = simpleHttp.peformGet(POE_NINJA_URI);
    System.out.println("Poe Ninja response length: " + poeNinjaResponse.length());
    String poeResponse = simpleHttp.peformGet(POE_URI);
    System.out.println("Poe Response length: " + poeResponse.length());
  }
}
