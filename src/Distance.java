import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		System.out.println("enter values for x and y");
		Scanner s = new Scanner(System.in);
		float x = s.nextFloat();
		float y = s.nextFloat();
		System.out.println("distance from origin is " + (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}
}
