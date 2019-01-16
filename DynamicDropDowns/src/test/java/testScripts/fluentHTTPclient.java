/*
package testScripts;

import com.google.common.net.HttpHeaders;
import com.google.common.net.MediaType;
import com.jcabi.http.Request;
import com.jcabi.http.request.ApacheRequest;
import com.jcabi.http.response.RestResponse;

import java.net.HttpURLConnection;

public class fluentHTTPclient {

    public class Main {
        public void main(String[] args){
            String html = new ApacheRequest("https://www.google.com")
                    .uri().path("/users").queryParam("id", 333).back()
                    .method(Request.GET)
                    .header(HttpHeaders.ACCEPT, MediaType.TEXT_HTML)
                    .fetch()
                    .as(RestResponse.class)
                    .assertStatus(HttpURLConnection.HTTP_OK)
                    .body();
        }

    }

}
*/
