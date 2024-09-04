package second;



import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class sec {

	@Test 
	void getusr() {
		given()
			.pathParam("mypath", "users")
			.queryParam("page", 2)

		.when()
			.get("https://reqres.in/api/{mypath}")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().body();
			
	}
}
