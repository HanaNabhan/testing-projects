package finalproj;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class UpdateOrder {

    public void updateOrder(String orderId, String token) {
        JSONObject data = new JSONObject();
        data.put("bookId", 1);
        data.put("customerName", "hana nabhan");

        given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(data.toString())
                .patch("/orders/" + orderId);
    }
}
