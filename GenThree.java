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
	//genergates the first random number:
	//it multiplys the range in the random number between (0-1), then adds the minimum number in order to get a number in the given range (min- max)
	int minRand = (int) (range * r) +minNum;
	System.out.println(minRand);
	//defines an int to store the next random number
	int n = 0;
 	for (int i = 0; i < 2; i++){
		r = Math.random();
		n = (int)(range *r) +minNum;
		System.out.println(n);
		//checks if the number generated is lower then the first number,if yes- updates the minimum number
		if (n < minRand){
		minRand = n;}
	}
	//prints the minimal generated number
	System.out.println("The minimal generated number was: " + minRand);
	}
}
