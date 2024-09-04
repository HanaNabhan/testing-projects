package forth;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class forth {
	@Test
    public void userr() {
        Response res = given()
                .when()
                .get("http://localhost:3000/users");

        Assert.assertEquals(res.getStatusCode(), 200);

        // Debugging: print the full response
//        System.out.println("Response Body: " + res.getBody().asString());

        // Correct JSON Path
        String name = res.jsonPath().getString("name[0]");
        Assert.assertNotNull(name, "Name should not be null");
        Assert.assertEquals(name, "Alice");
    }
}
