import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sumOfFactors = 1;
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0)
				sumOfFactors += i;
		}
		if (sumOfFactors == n)
			System.out.println(n + " is a perfect number");

		else
			System.out.println(n + " is not a perfect number");
	}
}
