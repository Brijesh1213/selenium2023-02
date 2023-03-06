import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class learning_test_01 {
	
	@Test
	public void test01(){
		
		Response response = get("https://reqres.in/api/users?page=2");
	
	

	}
}
