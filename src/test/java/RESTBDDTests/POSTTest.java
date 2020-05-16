package RESTBDDTests;

import java.util.HashMap;
import org.json.simple.JSONObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class POSTTest {

	@Test
	public void postTest()
	{
		String randStr=RandomStringUtils.randomAlphabetic(2);
		System.out.println(randStr);
		
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	
		
		
		HashMap dataMap=new HashMap();
		
		dataMap.put("FirstName", "tsttestFNdfgdfg2");
		dataMap.put("LastName", "testtestLNdfgdf2");
		dataMap.put("UserName", "testteskjdldjltUN2");
		dataMap.put("Password", "testPwsdfsdd2");
		dataMap.put("Email", "testEmsdfsfail1@test.com");
		
		Response resp=
				
				given()
					//.contentType("application/json")
					.body(dataMap)
					.header("Content-Type","application/json")
					
				.when()
					.post()
				.then()
					.extract().response();
		
		String body=resp.getBody().asString();
		System.out.println("Body is : "+body);
		
		
		
				
	}
	
	
	
}
