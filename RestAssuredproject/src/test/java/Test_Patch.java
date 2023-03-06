import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Patch {
	
	@Test
	public void test_2_Patch(){
	
	JSONObject request = new JSONObject();
	request.put("name", "Bijesh");
	request.put("job", "Engineer");	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	// may need Header(“Content-Type” , “Application/Jason”). ContentType(ContentType.Jason).
	given().
	header("Content-Type" , "Application/Jason").
	contentType(ContentType.JSON).
	accept(ContentType.JSON)
	.body(request.toJSONString())
	.when().
	patch("https://reqres.in/api/users/2").
	then().statusCode(200);
	}

}
