package youtube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringIntegerCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String p ="kj7ec7kvn7ovo8eve";
         ArrayList l =new ArrayList();
         ArrayList m =new ArrayList();
         for(int i=0; i<=p.length()-1; i++) {
       	  Boolean flag = Character.isDigit(p.charAt(i));
       	  if (flag) {
       		l.add(p.charAt(i))  ;
       	  }
       	  else {
       		  m.add(p.charAt(i));
       	  }
         }
     
   	  System.out.println(l);
//   	  System.out.println(m);
//   	  List<String>k =m.Cast<String>().ToList();
//   	String joined = String.join(", ", m);
//   	System.out.println(joined);
	}

}
