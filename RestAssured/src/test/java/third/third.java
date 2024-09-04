package third;

import static io.restassured.RestAssured.given;


import org.json.JSONObject;
import org.testng.annotations.Test;


public class third {
	String id_var;
	@Test
	void createusr() {
		
		JSONObject data = new JSONObject();
		data.put("name","hana");
		data.put("email","trainer@gmail.com");
		id_var = given()
			.contentType("application/json")
			.body(data.toString())
		.when()
			.post("http://localhost:3000/users")
		 	.jsonPath().getString("id");
		 
			
			
			
	
}
}
