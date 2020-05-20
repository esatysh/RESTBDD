package RESTBDDTests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


public class POSTTestUsingJSONObject {

	@SuppressWarnings("unchecked")
	@Test
	public void postTestUsingJSONObject()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
		JSONObject obj=new JSONObject();
		obj.put("FirstName", "tsttestFNdfgdfg8928");
		obj.put("LastName", "testtestLNdfgdf2898");
		obj.put("UserName", "testteskjdldjltUN2898");
		obj.put("Password", "testPwsdfsdd8928");
		obj.put("Email", "testEmsdfsfail18907@test.com");
				
		Response resp=
		given()
		 	.contentType("application/json")
			.body(obj)
		.when() 
			.post()
		.then()
			.assertThat().statusCode(201)
			.extract().response();
			
		String successCode=resp.jsonPath().get("SuccessCode").toString();
		System.out.println("Success Code is : "+successCode);
		
		String msg=resp.jsonPath().get("Message").toString();
		System.out.println("Message is : "+msg);
		
		
	}
	
	
	
	
	
}
