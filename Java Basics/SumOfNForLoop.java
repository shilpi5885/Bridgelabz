/*Java program for the sum of n natural numbers*/
public class SumOfNForLoop {

	public static void main(String[] args)   
	{  
	int num,i,sum = 0;  
	num = Integer.parseInt(args[0]);  
	for(i=1;i<=num;i++)  
	{    
	sum = sum + i;  
	}  
	System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
	}  

}
