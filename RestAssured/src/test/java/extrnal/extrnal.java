package extrnal;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class extrnal {

    @Test
    void createusr() {
        try {
            // Specify the JSON file path
            File f = new File("C:\\Users\\honaa\\OneDrive\\Desktop\\Testing\\firstproj\\src\\test\\java\\body.json");

            // Check if the file exists
            if (!f.exists()) {
                System.out.println("File does not exist: " + f.getAbsolutePath());
                return;
            }

            // Read the file
            FileReader fr = new FileReader(f);
            JSONTokener jt = new JSONTokener(fr);
            JSONArray data = new JSONArray(jt);  // Use JSONArray as the JSON starts with '['

            // Log the JSON data being sent
            System.out.println("Sending JSON data: " + data.toString());

            // Send POST request with the JSON data
            given()
                .contentType("application/json")
                .body(data.toString())
            .when()
                .post("http://localhost:3000/0")
            .then()
                .statusCode(201);

        } catch (IOException e) {
            e.printStackTrace(); // Handle file-related errors
        } catch (Exception e) {
            e.printStackTrace(); // Handle any other errors
        }
    }
}
