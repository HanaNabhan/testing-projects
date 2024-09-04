package Pojo;
import static io.restassured.RestAssured.given;


import org.json.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Student;

public class Pojo {
	//@Test
	void convertser() throws JsonProcessingException {
    Student data= new Student();
    data.setName("hana");
    data.setAge(21);
    data.setMajor("Engineering");
    data.setGpa(3.6);
    ObjectMapper mapper = new ObjectMapper();
    String jsondata=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);// convert pojo to json
    System.out.println(jsondata);
    }
	@Test
	void convertdeser() throws JsonProcessingException {
		String jsonData= "{\r\n"
				+ "  \"id\" : 0,\r\n"
				+ "  \"name\" : \"hana\",\r\n"
				+ "  \"age\" : 21,\r\n"
				+ "  \"major\" : \"Engineering\",\r\n"
				+ "  \"gpa\" : 3.6\r\n"
				+ "}";
//	    Student data= new Student();
//	    data.setName("hana");
//	    data.setAge(21);
//	    data.setMajor("Engineering");
//	    data.setGpa(3.6);
	    ObjectMapper mapper = new ObjectMapper();
	    Student data= mapper.readValue(jsonData,Student.class);// convert pojo to json
	    System.out.println("name:" + data.getName());
	    System.out.println("gpa:" + data.getGpa());
	    System.out.println("age:" + data.getAge());
	    System.out.println("major:" + data.getMajor());
	    }
	
}
