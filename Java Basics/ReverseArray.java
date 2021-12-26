/*Java Program to print the elements of an array in reverse order*/

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {77,66,55,44,33,22,11};
		int[] rev = new int[arr.length];
		for(int i = 0,j = arr.length-1; i < arr.length; i++,j--) {
			rev[j] = arr[i];
		}
		System.out.println("Original Array: ");
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("Array in reversed order: ");
		for(int i =0; i < rev.length; i++) {
			System.out.println(rev[i]+" ");
		}
	}

}
