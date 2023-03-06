import org.testng.Assert;

import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*; //
import io.restassured.RestAssured;
import io.restassured.response.Response;

//io.restassured.RestAssured.*
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*

public class Test01_Get {

	//@Test
	public void test_01() {
		//Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		Response response= get("https://reqres.in/api/users?page=2");// this is possible with * at import, get all from rest assured website
		
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content-type"));
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	@Test
	public void test_02() {
		given().
		get("https://reqres.in/api/users?page=2").then()
		.statusCode(200).
		body("data.id[0]", equalTo (7));
	}
}
