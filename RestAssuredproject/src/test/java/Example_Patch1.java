import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Example_Patch1 {
	@Test
	public void test_Put() {
		
		JSONObject request = new JSONObject();
		request.put("firstname", "Tom");
		request.put("lastname", "Thomson");
		request.put("subjectId", 1);
		baseURI = "http://localhost:3000";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).when().
		patch("/user/4").
		  then().
		  statusCode(200).log().all();
}
}
