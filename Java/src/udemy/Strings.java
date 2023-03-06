package udemy;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("length");
		System.out.println("charAt");
		System.out.println("Indexof");
		System.out.println("toChararray");
		System.out.println("equalsto");
		System.out.println("equalIgnoreCase");
		System.out.println("subString");
		System.out.println("getChars");
		System.out.println("regionMacthes");
		System.out.println("join");
		System.out.println("isEmpty");
		System.out.println("EndsWith");
		System.out.println("StartsWith");
		System.out.println("concat");
		System.out.println("replace");
		System.out.println("trim");
		System.out.println("toUppercaser");
		System.out.println("toLowerCase");
		
		System.out.println("string to int");
		System.out.println("String.Valueof(int)");
		System.out.println("string to int");
		System.out.println("Integer.toString(String)");
		char a[] = {'d','e','m','o'};
		String s = new String(a);
		System.out.println(s +" just to check");
        String s1 ="demo1";
        System.out.println(s1+ " actual what we do ");
        System.out.println(s1.length()+" this is the length");
        System.out.println(s +s1 +" concat the string");
        System.out.println(s1.charAt(3));
        System.out.println("-----below is get char method & index of-------");
        String s2 ="this is string";
        System.out.println(s2.indexOf('i'));
    	int start = 0;
    	int end =6;
    	char arr[] = new char[end-start];
    	s2.getChars(start, end, arr, 0);
    	System.out.println(arr);
    	System.out.println("----------tochar array-------");
        String rumal ="rumal is needed";
        char arr1[]= rumal.toCharArray();
        for(char z:arr1) {
        	System.out.print(z);
        }
        System.out.println("--------compare string you know it skipped equals, equalignorecasesyso---------");
        System.out.println("----------region matches---------");
        String c ="Hello there";
        String d = "there";
        
        System.out.println(c.regionMatches(6, d, 0, 4));
        System.out.println("---startswith & endswith-----");
        System.out.println(c.startsWith("Hello"));
        System.out.println(c.endsWith("there"));
        System.out.println("------finding subString-----");
        
        String delta ="this is Brijesh";
        System.out.println(delta.substring(5 ));
        System.out.println(delta.substring(5,9));
        // strings are immutable and can not change it such as if u print delta...it will not change
        //however, string created by string builder will change string
        // string = immutable , string buffer = mutable
        System.out.println("----concatnate + replace");
        String a1= "hello";
        String a2 = "java";
        //u can use a1+a2 or as below
        String a3= a1.concat(a2);
        System.out.println(a3);
        
        System.out.println("----");
        String b1="hello world"; //replace world with there
        String b2=b1.replace("world", "there");
        System.out.println(b2); // if u have multiple world than it will change all of them
        
        System.out.println("-------trim(remove unwanted space)------");
        String b3= "  Hello World  ";
        String b4 = b3.trim();
        System.out.println(b4);
        
        System.out.println("---uppercase  lowercase   join (combine string )");
        String b5 ="Hello World";
        System.out.println(b5.toUpperCase());
        System.out.println(b5.toLowerCase());
        System.out.println("-----join---- delimiter are , and  ;");
        String b7  = String.join(",", "red", "blue","green");
        System.out.println(b7);
        String b8  = String.join(";", "red", "blue","green");
        System.out.println(b8);
        String date  = String.join("/", "MM", "DD","YYYY");
        System.out.println(date);
	}
	
	
	
    }


