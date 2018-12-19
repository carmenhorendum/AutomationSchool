//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonToken;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//
//import java.io.IOException;
//import java.util.List;
//
//public class CustomDeserializer extends StdDeserializer<CollaboratorsData> {
//	public CustomDeserializer(Class<?> vc) {
//		super(vc);
//	}
//
//	@Override
//	public CollaboratorsData deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException {
//		CollaboratorsData collaboratorsData = new CollaboratorsData();
//		while (!parser.isClosed()) {
//			JsonToken jsonToken = parser.nextToken();
//
//			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
//				String fieldName = parser.getCurrentName();
//				System.out.println(fieldName);
//
//				jsonToken = parser.nextToken();
//
//				collaboratorsData.setUsers(parser.getCurrentValue());
//				objectMapper.readValue(jsonArray, new TypeReference<List<User>>(){});
//			}
//		}
//		return collaboratorsData;
//	}
//}