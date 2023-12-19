/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//gets the minimum and maximum range to generate numbers from the user
	int minNum = Integer.parseInt(args[0]);
	int maxNum = Integer.parseInt(args[1]);
	double r = Math.random();
	//checks number's range 
	int range = (maxNum - minNum);
	//genergates the first random number
	int minRand = (int) (range * r) +minNum;
	System.out.println(minRand);
	int n;
 	for (int i = 0; i < 2; i++){
		r = Math.random();
		n = (int)(range *r) +minNum;
		System.out.println(n);
		if (n < minRand){
		minRand = n;}
	}
	//prints the minimal generated number
	System.out.println("The minimal generated number was: " + minRand);
	}
}
