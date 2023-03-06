import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class Examples {

	//@Test
	public void test_Get() {
		
		baseURI = "http://localhost:3000/";
		given().
		get("/user").
		
		  then().
		  statusCode(200).log().all();
	}
	//@Test
	public void test_Getbody() {
		
		baseURI = "http://localhost:3000/";
		given().
		get("/user").then().
		  body("id[1]", equalTo(2)).
		  body("firstname", hasItems("brijesh", "jalpa","peter")).
		  
		  statusCode(200).log().all();
	}
	
	
	@Test
	public void test_Param() {
		
		baseURI = "http://localhost:3000/";
		given().param ("name", "automations").
		get("/subjects").
		  then().
		  statusCode(200).log().all();
	}
}
