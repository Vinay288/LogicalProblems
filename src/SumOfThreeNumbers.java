import java.util.Scanner;

public class SumOfThreeNumbers {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("distinct triple numbers");
		int numberOfDistrinct = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int z = j + 1; z < n; z++) {
					if ((arr[i] + arr[j] + arr[z]) == 0) {
						numberOfDistrinct++;
						System.out.println(arr[i] + " " + arr[j] + " " + arr[z]);
					}
				}
			}
		}
		System.out.println("total number of triplets are  " + numberOfDistrinct);
	}
}
