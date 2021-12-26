/*Java Program to print the elements of an array present on even position*/

public class EvenIndex {
		public static void main(String[] args) {
			int[] arr = {11,22,33,44,55,66,77,88,99};
			for(int i = 0; i < arr.length; i=i+2) 
					System.out.println("element at position "+i+": "+arr[i]+" ");

		}

}
