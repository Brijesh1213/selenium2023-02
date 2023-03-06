package java1;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Arithmetic   *, -, +, / ,%
		 * Bitwise
		 * Rational
		 * Logical
		 * 
		 */
    int m =19 , n= 2;
    int r1 = m+n;
    int r2 = m-n;
    int r3=m*n;
    double r4=(double)m/n;
    int r5 = m%n;//  this will give remainder whci is two
    
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);//but 6,4 its 1.5 and int or double doesnt work it give quotent, but casting double will work/6,2 its ok
    System.out.println(r5);
    
    
    ///now lets see increaments
    
    int in = 5;
    int im = 4;
     in = in + im;
     System.out.println(in);
     in =5;
     in +=im;// this is short cut to do the above// we can also use numbers to add in += 5 will print 10
     //in ++ will ad 1 to in//in-- will -1 from in
    System.out.println(in);
    
    // in++ and ++in
     in = 5;
    im = 4;
    im =++in; //this will print im as 6 as its pre increament
    System.out.println(im);
    in = 5;
    im = 4;
    im =in++;
    System.out.println(im); // this will print im as 5 as its in++ whci is post increament   
    System.out.println(in);// but check in its now 6
    
	}

}
