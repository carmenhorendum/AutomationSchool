import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.*;
import org.apache.http.impl.client.HttpClientBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class HttpClientRequestExecutor implements RequestExecutor {
	private static final String BASE_URI = "https://api.github.com/repos/carmenhorendum/AutomationSchool";
	private static final String ENDPOINT = "/collaborators";
	private static final String OAUTH_TOKEN = "0571bd065e5bb25eddd7a318082a1c74f467c839";
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
			"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
	private static HttpClient client = HttpClientBuilder.create().build();

	public String makeRequest(String ENDPOINT, Method method, Map<String, String> params) throws URISyntaxException {
		switch (method) {
			case GET:
				URI uri = new URIBuilder()
						.setScheme("https")
						.setHost(BASE_URI)
						.setPath(ENDPOINT)
						.setParameter("oauth_token", OAUTH_TOKEN)
						.build();
				HttpGet requestGet = new HttpGet(uri);
				requestGet.addHeader("User-Agent", USER_AGENT);
				HttpResponse responseGet = client.execute(requestGet);
				return String.valueOf(responseGet);
			case POST:
				break;
			case PUT:
				HttpPut requestPut = new HttpPut(uri);
				requestPut.addHeader("User-Agent", USER_AGENT);
				HttpResponse responsePut = client.execute(requestPut);
				return String.valueOf(responsePut);
				break;
			case DELETE:
				break;
			default:
				break;
		}
		return ENDPOINT;
	}
}
