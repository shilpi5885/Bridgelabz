/*Java program to reverse the integer number eg. Input n=231 reverse is 132*/
public class Reverse {

	public static void main(String[] args)   
	{  
	int number, reverse = 0;
	number = Integer.parseInt(args[0]);
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  

}
