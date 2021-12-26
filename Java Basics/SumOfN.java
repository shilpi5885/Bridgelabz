/* Java program for the sum of n natural numbers*/
public class SumOfN {  
	public static void main(String[] args)   
	{  
	int num, i = 1, sum = 0;  
	num = Integer.parseInt(args[0]);  
	while(i <= num)  
	{    
	sum = sum + i;  
	i++;  
	}  
	System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
	}  

}
