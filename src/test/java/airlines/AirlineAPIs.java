package airlines;

import base.Base;
import io.restassured.response.Response;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    public static Response createAirline(Map<String, Object> payload){
        String endpoint= (String) Base.dataFromJsonFile.get("createAirlineApiEndpoint");
        return RestUtils.performPost(endpoint, payload, new HashMap<>());
    }
}
