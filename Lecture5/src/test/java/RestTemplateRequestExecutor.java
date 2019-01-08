import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.Map;

public class RestTemplateRequestExecutor implements RequestExecutor {
	private static final String PROTOCOL = "https://";
	private static RestTemplate restTemplate = new RestTemplate();

	@Override
	public String makeRequest(String url, Method method, Map<String, String> params) {
		switch (method) {
			case GET:
				for (Map.Entry<String, String> entry : params.entrySet()) {
					HttpHeaders headers = new HttpHeaders();
					headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
					UriComponentsBuilder builder = UriComponentsBuilder
							.fromUriString(PROTOCOL + url)
							.queryParam(entry.getKey(), entry.getValue());
					HttpEntity<?> entity = new HttpEntity<>(headers);
					HttpEntity<String> responseGet
							= restTemplate.exchange(
							builder.toUriString(),
							HttpMethod.GET,
							entity,
							String.class);
					return String.valueOf(responseGet.getBody());
				}
				break;
			case POST:
				throw new NotImplementedException();
			case PUT:
				for (Map.Entry<String, String> entry : params.entrySet()) {
					HttpHeaders headers = new HttpHeaders();
					headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
					UriComponentsBuilder builder = UriComponentsBuilder
							.fromUriString(PROTOCOL + url)
							.queryParam(entry.getKey(), entry.getValue());
					HttpEntity<?> entity = new HttpEntity<>(headers);
					HttpEntity<String> responsePut
							= restTemplate.exchange(
							builder.toUriString(),
							HttpMethod.PUT,
							entity,
							String.class);
					System.out.println(((ResponseEntity<String>) responsePut).getStatusCode());
					return String.valueOf(responsePut.getBody());
				}
				break;
			case DELETE:
				throw new NotImplementedException();
			default:
				throw new NotImplementedException();
		}
		throw new NotImplementedException();
	}
}
