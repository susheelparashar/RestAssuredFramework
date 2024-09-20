package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.AirlinesPayloads;
import pojos.Airline;

import java.io.IOException;
import java.util.Map;

public class AirlinesTest {

    @Test
    public void createAirline() throws IOException {

        // String payload=AirlinesPayloads.getCreateAirlinePayload("5645", "Susheel", "India", "logo", "sloganTest", "UK", "www.google.com", "1992");
        // Map<String, Object> payload = AirlinesPayloads.getCreateAirlinePayloadFromMap("5435", "Susheel", "India", "logo", "sloganTest", "UK", "www.google.com", "1992");
       // Map<String, Object> payload = AirlinesPayloads.getCreateAirlinePayloadFromMap();
        Airline payload = AirlinesPayloads.getCreateAirlinePayloadFromPojo();

        Response response = AirlineAPIs.createAirline(payload);

        Assert.assertEquals(response.statusCode(), 200);

    }
}
