/* Java program to find Palindrome Number*/

public class Palindrome {
	public static void main(String[] args)   
	{  
	int number,num,reverse = 0;  
	number = Integer.parseInt(args[0]);
	num = number;
	for( ;number != 0; number=number/10)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	if(num==reverse) {
		System.out.println("Number is Palindrome");
	}
	else
		System.out.println("Number is NOT Palindrome");
	}    

}
