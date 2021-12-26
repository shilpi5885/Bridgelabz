/*Java Program to print the elements of an array present on odd position*/

public class OddIndex {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77,88,99};
		for(int i = 1; i < arr.length; i=i+2) 
				System.out.println("element at position "+i+": "+arr[i]+" ");

	}
}
