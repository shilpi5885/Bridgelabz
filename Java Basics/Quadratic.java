/*Java program to find the roots of the equation a*x*x + b*x + c*/

public class Quadratic {
	public static void main(String[] args)   
	{  
	double a,b,c;
	a = Double.parseDouble(args[0]);
	b = Double.parseDouble(args[1]);
	c = Double.parseDouble(args[2]);
	double d= b * b - 4.0 * a * c;  
	if (d> 0.0)   
	{  
	double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
	double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
	System.out.println("The roots are " + r1 + " and " + r2);  
	}   
	else if (d == 0.0)   
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The root is " + r1);  
	}   
	else   
	{  
	System.out.println("Roots are not real.");  
	}  
	}  
}
