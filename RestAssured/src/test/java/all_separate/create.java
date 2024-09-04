package all_separate;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import com.github.javafaker.Faker;

public class create {

    @Test
 void cuser(){
        Faker faker = new Faker();
        // create token
        JSONObject j = new JSONObject();
        j.put("clientName", faker.name().fullName());
        j.put("clientEmail", faker.internet().emailAddress());

        Response response = given()
                .header("Content-Type", "application/json")
                .body(j.toString())
                .post("https://simple-books-api.glitch.me/api-clients/");

        String token = response.jsonPath().getString("accessToken");
        System.out.println("Token: " + token);
        // create order
        JSONObject data = new JSONObject();
        data.put("bookId", 1);
        data.put("customerName", "hana");

        Response orderResponse=given().header("Authorization", "Bearer " + token)
               .header("Content-Type", "application/json")
               .body(data.toString())
               .when()
               .post("https://simple-books-api.glitch.me/orders");
        String orderId = orderResponse.jsonPath().getString("orderId");
        System.out.println("Order ID: " + orderId);
        update updater = new update();
        updater.upd(orderId, token);
        getusr getor=new getusr();
        getor.geto(orderId, token);
              
               
    }
}
