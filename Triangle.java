/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// P// Gets 3 numbers from the user
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	//calculates the length of two sides of the triangle 
	int length = a + b;
	boolean isTriangle;
	//checks if the length of two sides is bigger then the length of the remaining side
	isTriangle = (length > c);
	//prints to screen the length of the triangle and if 3 given integers form a triangle
	System.out.println(a + " , " + b + " , " + c + " " + isTriangle);
	}	
	}
}
