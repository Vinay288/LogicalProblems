import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("enter a number to reverse");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		reverseNumber(n);
	}

	static void reverseNumber(int n) {
		if (n % 10 == 0) {
			return;
		} else {
			System.out.print(n % 10);
			reverseNumber(n / 10);
		}
	}
}
