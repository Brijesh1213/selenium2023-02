package java1;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	i=5;
	int j=0;
	
	/*if(i>6)
		j=1;
	else
		j=2;
	System.out.println(j);*/
	
	//now lets use ternary
	// condition ? test1:test2
	j= i>6?1:2;  ///if i>6 is true j will be 1 and if false it will assign j=2...now change i =9 to i=5
	System.out.println(j);// the condition is given for 'j=' if condition?true:false	
		

	}

}
