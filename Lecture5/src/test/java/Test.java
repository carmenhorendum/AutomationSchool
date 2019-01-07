import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	private static final String BASE_URI = "api.github.com/repos/carmenhorendum/AutomationSchool";
	private static final String ENDPOINT = "/collaborators";
	private static final String ENDPOINT_2 = "/collaborators/nemec8g";
	private static final String OAUTH_TOKEN = "";

	public static void main(String[] args) throws URISyntaxException, IOException {
		RequestExecutor httpClientRequestExecutor = new HttpClientRequestExecutor();
		RequestExecutor restTemplateRequestExecutor = new RestTemplateRequestExecutor();
		Map<String, String> parameters = new HashMap<>();
		parameters.put("access_token", OAUTH_TOKEN);
		String responseGet = httpClientRequestExecutor
				.makeRequest(BASE_URI + ENDPOINT, Method.GET, parameters);
		System.out.println(responseGet);
		String responsePut = httpClientRequestExecutor
				.makeRequest(BASE_URI + ENDPOINT_2, Method.PUT, parameters);
		System.out.println(responsePut);
		String responseGet2 = restTemplateRequestExecutor
				.makeRequest(BASE_URI + ENDPOINT, Method.GET, parameters);
		System.out.println(responseGet2);
		String responsePut2 = restTemplateRequestExecutor
				.makeRequest(BASE_URI + ENDPOINT_2, Method.PUT, parameters);
		System.out.println(responsePut2);
		ObjectMapper mapper = new ObjectMapper();
		if (!responseGet.equals("")) {
			CollaboratorsData usersData = new CollaboratorsData();
			usersData.setUsers(mapper.readValue(responseGet, new TypeReference<List<User>>() {
			}));
			System.out.println("Input json string:");
			System.out.println(responseGet);
			System.out.println("Generated java class: ");
			System.out.println(usersData.getUsers());
		}
		if (!responsePut.equals("")) {
			User user = mapper.readValue(responsePut, User.class);
			System.out.println("Input json string:");
			System.out.println(responsePut);
			System.out.println("Generated java class: ");
			System.out.println(user);
		}
		CollaboratorsData usersData2 = new CollaboratorsData();
		usersData2.setUsers(mapper.readValue(responseGet2, new TypeReference<List<User>>() {
		}));
		System.out.println("Input json string:");
		System.out.println(responseGet2);
		System.out.println("Generated java class: ");
		System.out.println(usersData2.getUsers());

		User user2 = mapper.readValue(responsePut2, User.class);
		System.out.println("Input json string:");
		System.out.println(responsePut2);
		System.out.println("Generated java class: ");
		System.out.println(user2);
	}
}
