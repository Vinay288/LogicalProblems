import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		System.out.println("enter any integer value");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String binary = "";
		while (n > 0) {
			binary += n % 2;
			n = n / 2;
		}
		char[] ch = binary.toCharArray();
		binary = "";
		for (int i = (8 - ch.length); i > 0; i--)
			binary += 0;

		for (int i = ch.length - 1; i >= 0; i--)
			binary += ch[i];
		String firstNibble = binary.substring(0, 4);
		String secondNibble = binary.substring(4, 8);
		binary = secondNibble + firstNibble;
		int index = 0, number = 0;
		ch = binary.toCharArray();
		for (int i = (binary.length() - 1); i >= 0; i--) {
			if (ch[i] == '1')
				number += Math.pow(2, index);
			index++;
		}
		System.out.println("number after swapping nibble is " + number);
		n = number;
		while (n != 1) {
			if (n % 2 != 0) {
				System.out.println(number + " is not power of 2");
				break;
			}
			n = n / 2;
		}
		if (n == 1)
			System.out.println(number + " is power of 2");

	}

}
