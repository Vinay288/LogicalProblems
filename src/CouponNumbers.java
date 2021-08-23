import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
		System.out.println("enter total number of coupons");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] coupons = new int[n];
		System.out.println("enter " + n + " coupon values between 1 to 10");
		for (int i = 0; i < n; i++)
			coupons[i] = s.nextInt();
		int couponsFound = 0, iterations = 0;
		while (couponsFound != n) {
			int randomCoupon = 1 + (int) (Math.random() * 9);
			for (int i = 0; i < n; i++) {
				if (coupons[i] == randomCoupon) {
					couponsFound++;
					coupons[i] = -1;
				}
			}
			iterations++;
		}
		System.out.println("number of iterstions required to find all coupons is " + iterations);
	}

}
