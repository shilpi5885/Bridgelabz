/*Java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year*/

public class LeapYear {
	   public static void main(String[] args){
	      int year;
		  year = Integer.parseInt(args[0]);
	      if(year >=1582) {
	    	  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	    		  System.out.println("Specified year is a leap year");
	    	  else
	    		  System.out.println("Specified year is not a leap year");
	      }
	      else {
	    	  System.out.println("Invalid Year!");
	      }
	     }
}
