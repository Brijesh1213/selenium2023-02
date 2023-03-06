import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Example_Put {

	@Test
		public void test_Patch() {
			
			JSONObject request = new JSONObject();
			request.put("firstname", "Tamara");
			request.put("lastname", "Jane");
			request.put("subjectId", 2);
			baseURI = "http://localhost:3000";
			
			given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).when().
			put("/user/4").
			  then().
			  statusCode(200).log().all();
	}

}
