package RESTBDDTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestRESTValidations {

	/*
	 1. Test statusCode
	 2. Log Response
	 3.Verify Single content in Response Body
	 4.Verify Multiple content in Response Body
	 5.Verify Single content in Response Header
	 6.Verify Multiple content in Response Header
	 7.Setting Parameters and Headers
	 */
	
	// 1. Test statusCode
	@Test(enabled=false)
	public void TC_01_verifyStatusCode()
	{
		when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		.then()
			.statusCode(200)
			.log().all();
			
	}
	
	// 2. Test Log Response
	@Test(enabled=false)
	public void TC_02_testLogResponse()
	{
		when()
			.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	// 3. Verify Single Content in the Response Body
	@Test(enabled=false)
	public void TC_03_verifySingleContentInResponseBody()
	{
		when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
	.then()
		.statusCode(200)
		.body(".data [1].id",equalTo("2" ));
		
	}
	
	
	// 4. Verify Multiple Content in the Response Body
	@Test(enabled=false)
	public void TC_04_verifyMultipleContentInResponseBody()
	{
		when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
	.then()
		.statusCode(200);
		
	}
	
	// 5. Verify Single content in Response Header
	@Test
	public void TC_05_verifySingleContentInResponseHeader()
	{
		Response resp=
		
		when()
			.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
			.statusCode(200)
			.header("content-encoding", equalTo("gzip"))
			.extract().response();
		
		
		String respHeader=resp.getHeader("content-encoding");
		System.out.println("Content header is : "+respHeader);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
