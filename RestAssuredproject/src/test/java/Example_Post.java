import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Example_Post {

	@Test
	public void test_() {
		
		JSONObject request = new JSONObject();
		
		request.put("firstname", "Tom");
		request.put("lastname", "Cooper");
		request.put("subjectId", 1);
		baseURI = "http://localhost:3000";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).when().
		post("/user").
		  then().
		  statusCode(201).log().all();
}
}
