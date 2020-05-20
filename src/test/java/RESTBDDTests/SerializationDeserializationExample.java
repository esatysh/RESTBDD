package RESTBDDTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SerializationDeserializationExample {

	@Test(priority=1)
	public void createNewEmployee()
	{
		//create employee using serialization
		
		EmployeeClassForSerializationDeSerialization obj=new EmployeeClassForSerializationDeSerialization();
		obj.setFirstName("TestSerialFN");
		obj.setLastname("TestSerialLN");
		obj.setUserName("TestSerialUN");
		obj.setPassword("TestSerialPwd");
		obj.setEmail("testserial@testserail.com");
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
		Response resp=
		
		given()
			.contentType("application/json")
			.body(obj)
		.when()
			.post()
		.then()
			.statusCode(201)
			.extract().response();
		
		String contentLenheaderInfo=resp.getHeader("content-length").toString();
		System.out.println("Content Length is : "+contentLenheaderInfo);
		
		String messageBodyInfo=resp.jsonPath().get("Message").toString();
		System.out.println("Message is : "+messageBodyInfo);
		
	}
	//This test method is incomplete
	//This is bcoz, couldn't find an appropriate REST url to get data
	
	@Test(priority=2)
	public void getCustomerDetailsDeSerialize()
	{
		
		EmployeeClassForSerializationDeSerialization obj=new EmployeeClassForSerializationDeSerialization();
	
		RestAssured.baseURI
		
		
	}
	
	
	
	
	
	
	
}
