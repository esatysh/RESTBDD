package RESTBDDTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DiffBetweenHeraderAndHeaders {

	@Test
	public void headerTest()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employees";
		
		Response resp=
		
		when()
			.get()
		.then()
			.statusCode(200)
			.extract()
			.response();
		
		String hdr=resp.header("content-length").toString();
		System.out.println("Content length is : "+hdr);
		
		Headers allHeader=resp.headers();
		System.out.println("All Headers size is : "+allHeader.size());
		for(Header hedr:allHeader)
		{
			System.out.println("Key : "+hedr.getName()+" ** "+"Value : "+hedr.getValue());
		}
		
		
		
		
		
	}
	
	@Test
	public void headersTest()
	{
		
	}
	
	
	
}
