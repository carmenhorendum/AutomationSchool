import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	private static final String PROTOCOL = "https";
	private static final String BASE_URI = "api.github.com/repos/carmenhorendum/AutomationSchool";
	private static final String ENDPOINT = "/collaborators";
	private static final String ENDPOINT_2 = "/collaborators/nemec8g";
	private static final String OAUTH_TOKEN = "";
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
			"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
	private static HttpClient client = HttpClientBuilder.create().build();

	private static String json = "{\r\n" + "\"title\" : \"Effective Java\",\r\n"
			+ "\"login\" : \"Joshua Bloch\",\r\n" + "\"price\" : 37,\r\n"
			+ "\"edition\" : 37\r\n" + "}";
	private static String jsonArray = "[\r\n{\r\n\"login\":\"carmenhorendum\",\r\n" +
			"\"id\":20130148\r\n},\r\n{\r\n\"login\":\"nemec8g\",\r\n" +
			"\"id\":25814391\r\n}\r\n]";

	public static void main(String[] args) throws URISyntaxException, IOException {
		RequestExecutor httpClientRequestExecutor = new HttpClientRequestExecutor();
		Map<String, String> parameters = new HashMap<>();
		parameters.put("access_token", OAUTH_TOKEN);
		String responseGet = httpClientRequestExecutor.makeRequest(BASE_URI + ENDPOINT, Method.GET, parameters);
		System.out.println(responseGet);
		String responsePut = httpClientRequestExecutor.makeRequest(BASE_URI + ENDPOINT_2, Method.PUT, parameters);
		System.out.println(responsePut);

		ObjectMapper mapper = new ObjectMapper();
		CollaboratorsData usersData = mapper.readValue(jsonArray, CollaboratorsData.class);
//		User user = mapper.readValue(json, User.class);
//		List<User> users = mapper.readValue(String.valueOf(response), mapper.getTypeFactory()
//				.constructCollectionType(List.class, User.class));
		System.out.println("Input json string");
		System.out.println(responseGet);
		System.out.println("Generated java class: ");
//		users.forEach(System.out::println);
		System.out.println(usersData.getUsers());

		User user = mapper.readValue(json, User.class);
		System.out.println("Input json string");
		System.out.println(responsePut);
		System.out.println("Generated java class: ");
		System.out.println(user);

	}
}
