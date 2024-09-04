package finalproj;

import org.json.JSONObject;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateOrder {

    public String createOrder(String token) {
        JSONObject data = new JSONObject();
        data.put("bookId", 1);
        data.put("customerName", "hana");

        Response orderResponse = given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(data.toString())
                .post("/orders");

        return orderResponse.jsonPath().getString("orderId");
    }
}
