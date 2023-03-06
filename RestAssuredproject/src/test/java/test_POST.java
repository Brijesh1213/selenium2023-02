import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class test_POST {

	@Test
	public void test_1_Post(){
	
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("\"name\"", "Brjesh");
	map.put("job", "Engineer");
	
	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	
	System.out.println(request);
	System.out.println(request.toJSONString());//sometime above one throws error so we use this
		
	}
	
	//@Test
	public void test_2_Post(){
	
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
	.when().post("https://reqres.in/api/users").
	then().statusCode(201);
	}
}
