import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.List;

public class Test {
	private static final String PROTOCOL = "https";
	private static final String BASE_URI = "api.github.com/repos/carmenhorendum/AutomationSchool";
	private static final String ENDPOINT = "/collaborators";
	private static final String ENDPOINT_2 = "/collaborators/nemec8g";
	private static final String OAUTH_TOKEN = "0571bd065e5bb25eddd7a318082a1c74f467c839";
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
			"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
	private static HttpClient client = HttpClientBuilder.create().build();

//	private static String json = "{\r\n" + "\"title\" : \"Effective Java\",\r\n"
//			+ "\"login\" : \"Joshua Bloch\",\r\n" + "\"price\" : 37,\r\n"
//			+ "\"edition\" : 37\r\n" + "}";
//	private static String jsonArray = "[\r\n{\r\n\"login\":\"carmenhorendum\",\r\n" +
//			"\"id\":20130148\r\n},\r\n{\r\n\"login\":\"nemec8g\",\r\n" +
//			"\"id\":25814391\r\n}\r\n]";

	public static void main(String[] args) throws URISyntaxException, IOException {
		URI uriGet = new URIBuilder()
				.setScheme(PROTOCOL)
				.setHost(BASE_URI)
				.setPath(ENDPOINT)
				.setParameter("access_token", OAUTH_TOKEN)
				.build();
		HttpGet requestGet = new HttpGet(uriGet);
		requestGet.addHeader("User-Agent", USER_AGENT);
		HttpResponse responseGet = client.execute(requestGet);
//		System.out.println(responseGet.getProtocolVersion());
//		System.out.println(responseGet.getStatusLine().getStatusCode());
//		System.out.println(responseGet.getStatusLine().getReasonPhrase());
		System.out.println(responseGet.getStatusLine().toString());
		BufferedReader rd = new BufferedReader(
				new InputStreamReader(responseGet.getEntity().getContent()));
		StringBuffer body = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			body.append(line);
		}
		ObjectMapper mapper = new ObjectMapper();
//		User user = mapper.readValue(json, User.class);
		List<User> users = mapper.readValue(String.valueOf(body), mapper.getTypeFactory()
				.constructCollectionType(List.class, User.class));
		System.out.println("Input json string");
		System.out.println(body);
		System.out.println("Generated java class: ");
		users.forEach(System.out::println);

		URI uriPut = new URIBuilder()
				.setScheme(PROTOCOL)
				.setHost(BASE_URI)
				.setPath(ENDPOINT_2)
				.setParameter("access_token", OAUTH_TOKEN)
				.build();
		HttpPut requestPut = new HttpPut(uriPut);
		requestGet.addHeader("User-Agent", USER_AGENT);
		HttpResponse responsePut = client.execute(requestPut);
//		System.out.println(responseGet.getProtocolVersion());
//		System.out.println(responseGet.getStatusLine().getStatusCode());
//		System.out.println(responseGet.getStatusLine().getReasonPhrase());
		System.out.println(responsePut.getStatusLine().toString());
		BufferedReader rd2 = new BufferedReader(
				new InputStreamReader(responseGet.getEntity().getContent()));
		StringBuffer body2 = new StringBuffer();
		String line2;
		while ((line2 = rd.readLine()) != null) {
			body2.append(line2);
		}
		if (responsePut.getStatusLine().getStatusCode() == 201) {
			ObjectMapper mapper2 = new ObjectMapper();
			User user = mapper2.readValue(String.valueOf(body2), User.class);
			System.out.println("Input json string");
			System.out.println(body);
			System.out.println("Generated java class: ");
			System.out.println(user);
		}
	}
}
