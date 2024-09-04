package all_separate;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class update {

	@Test
	void upd(String orderId, String token) {
		 JSONObject data = new JSONObject();
	        data.put("bookId", 1);
	        data.put("customerName", "hana");
	        
	        given().header("Authorization", "Bearer " + token)

	               .body(data.toString())
	        .when()
	               .patch("https://simple-books-api.glitch.me/orders/"+orderId);
	       
		
	}
}
