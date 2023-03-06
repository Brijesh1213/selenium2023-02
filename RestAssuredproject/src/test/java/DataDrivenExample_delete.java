import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExample_delete {
	
	
	@DataProvider(name="deleteData")
	public Object[] DataForDelete() {
		return new Object[] {
				4,5,6,7	
		};
	}
	@Test(dataProvider ="deleteData")
	public void test_Delete(int UserID) {
		

		baseURI = "http://localhost:3000";
		
		when().
		delete("/user/"+UserID).
		  then().
		  statusCode(200).log().all();
}
}
