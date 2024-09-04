package firstproj;


import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;


public class httpRequest {
	int id_var;

	@Test (priority=1)
	void getusr() {
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
			
	}
	@Test (priority=2)
	void createusr() {
		
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("name","hana");
			data.put("job","trainer");
			id_var = given()
				.contentType("application/json")
				.body(data)
			.when()
				.post("https://reqres.in/api/users")
			 	.jsonPath().getInt("id");
			 /*.then()
				.statusCode(201)
				.log().all();*/
				
		
	}
	@Test (priority=3,dependsOnMethods={"createusr"})
	void updateusr() {
		
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("name","hana ahmed");
			data.put("job","trainer");
			given()
				.contentType("application/json")
				.body(data)
			.when()
				.put("https://reqres.in/api/users/"+id_var)
				
			.then()
				.statusCode(200)
				.log().all();
				
		
	}
    @Test(priority=4)
    void deleteusr() {
    	given()
		.when()
		    .delete("https://reqres.in/api/users/"+id_var)
		.then()
			.statusCode(204)
			.log().all();
			
    }
}
