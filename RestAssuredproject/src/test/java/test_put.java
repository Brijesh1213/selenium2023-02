import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class test_put {

	@Test
	public void test_1_Put(){
	
	JSONObject request = new JSONObject();
	request.put("name", "Bijesh");
	request.put("job", "Engineer");	
	System.out.println(request);
	
	
	// may need Header(“Content-Type” , “Application/Jason”). ContentType(ContentType.Jason).
	given().
	header("Content-Type" , "Application/Jason").
	contentType(ContentType.JSON).
	accept(ContentType.JSON)
	.body(request.toJSONString())
	.when().
	put("https://reqres.in/api/users").
	then().statusCode(200)
	.log().all();
	}
}
