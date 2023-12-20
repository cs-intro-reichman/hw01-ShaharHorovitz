/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Put your code here//gets the int from the user
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		//calculates the sum of two integers
		int sum = N1 + N2;
		System.out.println(N1  + " + " + N2 + " = " + sum);	
	}
}
