import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("enter values for a, b, c");
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat(), b = s.nextFloat(), c = s.nextFloat();
		float delta = (float) (Math.pow(b, 2) - (4 * a * c));
		float root1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
		float root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("roots are root 1 = "+root1+" root 2 = "+root2);
	}
}
