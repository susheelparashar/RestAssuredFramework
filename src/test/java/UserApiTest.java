import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiUtils;

public class UserApiTest {

    @Test
    public void testGetUser() {
        Response response = ApiUtils.get("/users/1");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getString("name").equalsIgnoreCase("John Doe"));
    }

    @Test
    public void testCreateUser() {
        User newUser = new User("Jane Doe", "jane@example.com");
        Response response = ApiUtils.post("/users", newUser);
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "Jane Doe");
    }
}
