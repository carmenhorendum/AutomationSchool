import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class HttpClientRequestExecutor implements RequestExecutor {
	private static final String PROTOCOL = "https";
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
			"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
	private static HttpClient client = HttpClientBuilder.create().build();

	@Override
	public String makeRequest(String url, Method method, Map<String, String> params)
			throws IOException, URISyntaxException {
		switch (method) {
			case GET:
				for (Map.Entry<String, String> entry : params.entrySet()) {
					URI uriGet = new URIBuilder()
							.setScheme(PROTOCOL)
							.setHost(url)
							.setParameter(entry.getKey(), entry.getValue())
							.build();
					HttpGet requestGet = new HttpGet(uriGet);
					requestGet.addHeader("User-Agent", USER_AGENT);
					HttpResponse responseGet = client.execute(requestGet);
					System.out.println(responseGet.getStatusLine().toString());
					BufferedReader rd = new BufferedReader(
							new InputStreamReader(responseGet.getEntity().getContent()));
					StringBuffer bodyGet = new StringBuffer();
					String line;
					while ((line = rd.readLine()) != null) {
						bodyGet.append(line);
					}
					return String.valueOf(bodyGet);
				}
				break;
			case POST:
				return "";
			case PUT:
				for (Map.Entry<String, String> entry : params.entrySet()) {
					URI uriPut = new URIBuilder()
							.setScheme(PROTOCOL)
							.setHost(url)
//                            .setPath(ENDPOINT)
							.setParameter(entry.getKey(), entry.getValue())
							.build();
					HttpPut requestPut = new HttpPut(uriPut);
					requestPut.addHeader("User-Agent", USER_AGENT);
					HttpResponse responsePut = client.execute(requestPut);
					System.out.println(responsePut.getStatusLine().toString());
					if (responsePut.getStatusLine().getStatusCode() == 201) {
						BufferedReader rd = new BufferedReader(
								new InputStreamReader(responsePut.getEntity().getContent()));
						StringBuffer bodyPut = new StringBuffer();
						String line;
						while ((line = rd.readLine()) != null) {
							bodyPut.append(line);
						}
						return String.valueOf(bodyPut);
					}
					break;
				}
			case DELETE:
				return "";
			default:
				return "";
		}
		return "";
	}
}
