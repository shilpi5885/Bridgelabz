/*Java Program to print the smallest element in an array*/

public class Minimum {
	public static void main(String[] args) {
		int[] arr = {23,34,45,56,78,89,90};
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
	System.out.println("Smallest element in the array is "+min);
	}
}
