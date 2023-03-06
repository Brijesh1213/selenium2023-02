package udemy;

public class StringBuilders {

	public static void main(String[] args) {
		// string buffer is mutable so u can change it, u can also add char and sub strings
		StringBuffer sb = new StringBuffer("Jhonny");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());  // capacity is 6+16 =21
		
         System.out.println(sb.append("Brijesh")); ///result JhonnyBrijesh...so modify 
         System.out.println(sb.insert(6, " yess papa ")); // adding string from certain position
         System.out.println(sb.reverse());
         System.out.println(sb.reverse()); // reversing string
         System.out.println(sb.delete(6, 17));  // string range removed
         System.out.println(sb.deleteCharAt(3));  //perticular char remove
         StringBuffer sb1 = new StringBuffer("Jhonny papa");
         System.out.println(sb1.replace(7, 11, "Son"));
         System.out.println(sb1.substring(0, 6));// this will not change string bffer same as string...so in this  case string buffer is immutable too..lol
         
	}

}
