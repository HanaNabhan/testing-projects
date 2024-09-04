package finalproj;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class finalproj {
    protected Faker faker = new Faker();
    
    @BeforeClass
    public void goHome() {
        RestAssured.baseURI = "https://simple-books-api.glitch.me";
    }
}
