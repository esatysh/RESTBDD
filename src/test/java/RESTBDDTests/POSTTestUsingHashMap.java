package RESTBDDTests;

import java.util.HashMap;
import org.json.simple.JSONObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class POSTTestUsingHashMap {

	@Test
	public void postTest()
	{
		//String randStr=RandomStringUtils.randomAlphabetic(2);
		//System.out.println(randStr);
		
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	
		//To use POST, for sending data to be put in the body, we use HashMap or JSONObject.
		//Using HashMap is given below:
		HashMap dataMap=new HashMap();
		
		dataMap.put("FirstName", "tsttestFNdfgdfg892");
		dataMap.put("LastName", "testtestLNdfgdf289");
		dataMap.put("UserName", "testteskjdldjltUN289");
		dataMap.put("Password", "testPwsdfsdd892");
		dataMap.put("Email", "testEmsdfsfail189@test.com");
		
		Response resp=
				
				given()
					//.contentType("application/json")
					//body usually goes in the given() section
					.body(dataMap)
					.header("Content-Type","application/json")
					//.contentType(arg0)
					
				.when()
					.post()
				.then()
					.extract().response();
		//to get the whole body we use the getbody() method
		String body=resp.getBody().asString();
		System.out.println("Body is : "+body);
		
		//String id=resp.jsonPath().get(data.id[2]);
		//System.out.println("id is: "+id);
		
		String respstatus=resp.jsonPath().get("status").toString();
		System.out.println("status is : "+respstatus);
		
		
		
				
	}
	
	
	
}
