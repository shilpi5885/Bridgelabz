/*Java program to find the sum of command-line arguments and count the invalid integers entered*/

class Sum{
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Calculates Sum for below Integers");
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
			try {
			sum = sum + Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
			System.out.println("Invalid integer command line arguments: " + e.toString());
			}
		}
		System.out.println("Sum :" + sum);
		
	}
}