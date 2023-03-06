import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test_Get {
 
	
	@Test
	public void test_1(){
	given().
	get("https://reqres.in/api/users?page=2").
	then().
	body("data.id[1]", equalTo(8)).
	body("data.first_name", hasItems("Lindsay","Michael")).
	statusCode(200).
	log().all();
	}
	
}
