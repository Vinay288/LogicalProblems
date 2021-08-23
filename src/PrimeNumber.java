import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == 0 || n == 1)
			System.out.println("not a prime number");
		else {
			int factors = 0;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					factors++;
			}
			if (factors == 0)
				System.out.println(n + " is a prime number");
			else
				System.out.println(n + " is not a prime number ");
		}

	}
}
