import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public interface RequestExecutor {
	String makeRequest(String url, Method method, Map<String, String> params) throws URISyntaxException, IOException;
}
