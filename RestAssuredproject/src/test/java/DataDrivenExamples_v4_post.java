import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExamples_v4_post {

	
	@DataProvider(name ="DataforPost")
	public Object[][] DataForPost() {
	
		
//		Object[][] data =new Object[2][3];
//		 
//		
//		  data [0][0] = "Raghav"; 
//		 data [0][1] = "Juyal"; 
//		  data [0][2] = 2;
//		  
//		  data [1][0] = "manosh"; 
//		  data [1][1] = "raval"; 
//		  data [1][2] = 1;
//		  
//		  return data;
		 
		return new Object[][] {
			
			{"Graham", "Bell",1},
			{"Henry", "Ford",2}
		};
		
	}
	
	@Test(dataProvider = "DataforPost")
	public void test_post(String FirstName, String LastName, int SubjectID ) {
		
		JSONObject request = new JSONObject();
		request.put("firstname", FirstName);
		request.put("lastname", LastName);
		request.put("subjectId", SubjectID);
		
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
