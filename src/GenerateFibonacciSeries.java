import java.util.Scanner;

public class GenerateFibonacciSeries {
	public static void main(String[] args) {
		System.out.println("enetr nth number of fibnocci series");
		Scanner s = new Scanner(System.in);
		int nthFibonacciNumber = s.nextInt();
		for (int i = 0; i < nthFibonacciNumber; i++)
			System.out.println(fibonacciSeries(i));
	}

	static int fibonacciSeries(int n) {
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciSeries(n - 2) + fibonacciSeries(n - 1);
	}
}
