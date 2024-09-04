package all_separate;


import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class getusr {

	  public void geto(String orderId, String token) {
	       Response response =given()
	                .header("Authorization", "Bearer " + token)
	                .when()
	                .get("https://simple-books-api.glitch.me/orders/" + orderId);
	        System.out.println("Updated Order Details: " + response.asString());

	        
	    }
}
