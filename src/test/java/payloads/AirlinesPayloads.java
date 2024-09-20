package payloads;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlinesPayloads {

    public static String getCreateAirlinePayload() {

        return "{\n"
                + "    \"_id\":\"87676565656\",\n"
                + "    \"name\": \"Sri Lankan Airways\",\n"
                + "    \"country\": \"Sri Lanka\",\n"
                + "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n"
                + "    \"slogan\": \"From Sri Lanka\",\n"
                + "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n"
                + "    \"website\": \"www.srilankaaairways.com\",\n"
                + "    \"established\": \"1990\"\n"
                + "}";
    }

    public static String getCreateAirlinePayload(String id, String name, String country, String logo, String slogan, String headQuaters, String website, String established) {

        return "{\n"
                + "    \"_id\":\"" + id + "\",\n"
                + "    \"name\": \"" + name + "\",\n"
                + "    \"country\": \"" + country + "\",\n"
                + "    \"logo\": \"" + logo + "\",\n"
                + "    \"slogan\": \"" + slogan + "\",\n"
                + "    \"head_quaters\": \"" + headQuaters + "\",\n"
                + "    \"website\": \"" + website + "\",\n"
                + "    \"established\": \"" + established + "\"\n"
                + "}";
    }

    public static Map<String, Object> getCreateAirlinePayloadFromMap(String id, String name, String country, String logo, String slogan, String headQuarters, String website, String established) {

        // Creating a map to hold the payload data
        Map<String, Object> payload = new HashMap<>();
        payload.put("id", id);
        payload.put("name", name);
        payload.put("country", country);
        payload.put("logo", logo);
        payload.put("slogan", slogan);
        payload.put("headQuarters", headQuarters);
        payload.put("website", website);
        payload.put("established", established);

        return payload;
    }

    public static Map<String, Object> getCreateAirlinePayloadFromMap() {

        Faker faker=new Faker();

        // Creating a map to hold the payload data
        Map<String, Object> payload = new HashMap<>();
        payload.put("id", faker.number().digits(10));
        payload.put("name", faker.name().firstName());
        payload.put("country", faker.address().country());
        payload.put("logo", RandomStringUtils.randomAlphabetic(25));
        payload.put("slogan", RandomStringUtils.randomAlphabetic(20));
        payload.put("headQuarters", faker.address().cityName());
        payload.put("website", "https://"+RandomStringUtils.randomAlphabetic(10)+".com");
        payload.put("established", faker.number().numberBetween(1900, 2000));

        return payload;
    }
}
