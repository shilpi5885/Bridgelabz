/*Java program to reverse the integer number eg. Input n=231 reverse is 132*/

public class ReverseForLoop {
	public static void main(String[] args)   
	{  
	int number,reverse = 0;  
	number = Integer.parseInt(args[0]);
	for( ;number != 0; number=number/10)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}    
}
