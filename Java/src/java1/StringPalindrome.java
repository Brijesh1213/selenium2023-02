package java1;

public class StringPalindrome {

	
	public static void main(String[] args) {
		Stringpalindrome("amma");
		
}

	
	public static void Stringpalindrome(String brijesh) {
		
		
		int i=0;
		int j= brijesh.length()-1;
		int flag=0;
		
		while(i<j) {
			if (brijesh.charAt(i)!=brijesh.charAt(j)) {
				flag=1;
				}
			i++;
			j--;		
		}
		if (flag==0) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	}
}
