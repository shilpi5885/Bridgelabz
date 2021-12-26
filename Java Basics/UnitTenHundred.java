/*Java program to read a Number 1,10,100,1000 and display unit, ten hundred*/

public class UnitTenHundred {
		public static void main(String[] args)
	{

	int x;

	x = Integer.parseInt(args[0]);

	if(x==1)
		System.out.println("Unit");
	else if(x==10)
		System.out.println("Ten");
	else if(x==100)
		System.out.println("Hundred");
	else if(x==1000)
		System.out.println("Thousand");
	else
		System.out.println("You entered wrong input ");

	}

}
