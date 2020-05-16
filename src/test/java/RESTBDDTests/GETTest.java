package RESTBDDTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GETTest {

	@Test
	public void getTest() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/employees";
		Response resp =

				given()
						// .log().all()
						.when().get().
						then().statusCode(200).statusLine("HTTP/1.1 200 OK")
						//.body("City", equalTo("Hyderabad")).and()
					//	.header("Content-Type", "application/json")
						.extract()
						.response();
		// .log().all()

		String bodynode=resp.jsonPath().get("id");
		System.out.println(bodynode);
		
		
	}

}
