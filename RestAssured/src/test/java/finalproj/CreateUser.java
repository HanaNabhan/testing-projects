package finalproj;

import org.json.JSONObject;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CreateUser extends finalproj {

    public String generateToken() {
        JSONObject userToken = new JSONObject();
        userToken.put("clientName", faker.name().fullName());
        userToken.put("clientEmail", faker.internet().emailAddress());

        Response response = given()
                .header("Content-Type", "application/json")
                .body(userToken.toString())
                .post("/api-clients/");

        return response.jsonPath().getString("accessToken");
    }
}
