/*Java program to enter two numbers and do the following arithmetic Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c */

public class ArithmeticOp {
	public static void main(String[] args) {
		int a,b,c,result1,result2,result3,result4;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[0]);
		c = Integer.parseInt(args[0]);
		result1 = a+b*c;
		result2 = c+a/b;
		result3= a%b+c;
		result4=a*b+c;
		
		System.out.println("a + b * c = "+result1);
		System.out.println("c + a / b = "+result2);
		System.out.println("a % b + c = "+result3);
		System.out.println("a * b + c = "+result4);
		
		if (a >= b && a >= c)
	         System.out.println( a + " is the maximum number.");
	    else if (b >= a && b >= c)
	         System.out.println( b + " is the maximum number.");
	    else
	         System.out.println( c + " is the maximum number.");
		
		if (a <= b && a <= c)
	         System.out.println( a + " is the minimum number.");
	     else if (b <= a && b <= c)
	         System.out.println( b + " is the minimum number.");
	     else
	         System.out.println( c + " is the minimum number.");
	
	}
}
