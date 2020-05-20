package RESTBDDTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PUTTestUsingHashMap {

	@Test
	public void putTestUsingHashmap()
	{
		String emp_id="8";
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+emp_id;
		
		
		HashMap map=new HashMap();
		map.put("FirstName", "testsathish");
		map.put("LastName", "testLNSathish");
		
		Response resp=
		
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.extract().response();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
