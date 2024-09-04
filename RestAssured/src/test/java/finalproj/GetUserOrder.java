package finalproj;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetUserOrder {

    public void getOrderDetails(String orderId, String token) {
        Response response = given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get("/orders/" + orderId);
        System.out.println("Updated Order Details: " + response.asString());
    }
}
