package finalprojclone;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;

public class Finalprojclone {
	
	    protected Faker faker = new Faker();
	    
	    @BeforeClass
	    public void goHome() {
	        RestAssured.baseURI = "https://simple-books-api.glitch.me";
	    }
	

}
