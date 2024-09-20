package base;

import utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Base {

    public static Map<String, Object> dataFromJsonFile;

    static {
        System.out.println("Env Values is: " + System.getProperty("env"));
        String env = System.getProperty("env") == null ? "stg" : System.getProperty("env");
        try {
            dataFromJsonFile = JsonUtils.getJsonDataAsMap("" + env + "/airlinesApiData.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
