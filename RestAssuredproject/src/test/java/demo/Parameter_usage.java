package demo;

///copy pasted from "DataUsedForPoastDelete"
	
	import static io.restassured.RestAssured.*;
	import static io.restassured.RestAssured.given;
	import static io.restassured.RestAssured.when;

	import org.json.simple.JSONObject;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	import io.restassured.http.ContentType;

	//extends DataDrivenExamples_DATA

	public class Parameter_usage extends DataDrivenExamples_DATA {
		/*
		 * DataDrivenExamples_DATA data; public void DataUsedForPoastDelete() {
		 * 
		 * }
		 * 
		 * @BeforeClass public void BeforeC() { data = new DataDrivenExamples_DATA();
		 * data.DataForPost(); data.DataForDelete(); }
		 * 
		 * //@BeforeTest public void BeforeT() { data.DataForDelete(); }
		 */
			
			
		
		
		
		//@Test(priority=1,dataProvider = "DataforPost")
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
		
		//(dataProvider ="deleteData")
		@Parameters("UserID")
		@Test
		public void test_Delete(int UserID) {
			
          System.out.println("value for userid is;"+ UserID);
			baseURI = "http://localhost:3000";
			
			when().
			delete("/user/"+UserID).
			  then().
			  statusCode(200).log().all();
	}
	}

