package demo;
import org.testng.annotations.DataProvider;

public class DataDrivenExamples_DATA {
	@DataProvider(name ="DataforPost")
	public Object[][] DataForPost() {


		//Object[][] data =new Object[2][3];

		/*
		 * data [0][0] = "Raghav"; 
		 * data [0][1] = "Juyal"; 
		 * data [0][2] = 2;
		 * 
		 * data [1][0] = "manosh"; 
		 * data [1][1] = "raval"; 
		 * data [1][2] = 1;
		 * 
		 * return data;
		 */
		return new Object[][] {

			{"Graham", "Bell",1},
			{"Henry", "Ford",2}
		};

	}

	@DataProvider(name="deleteData")
	public Object[] DataForDelete() {
		return new Object[] {
				4,5	
		};
	}
}
