/*Java Program to print the largest element in an array*/

public class Maximum {

	public static void main(String[] args) {
		int[] arr = {23,34,45,56,7,8,89,90};
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
	System.out.println("Largest element in the array is "+max);
	}

}
