import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		System.out.println("enter any decimal number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String binary = "";
		while (n > 0) {
			binary += n % 2;
			n = n / 2;
		}
		char[] ch = binary.toCharArray();
		binary = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			binary += ch[i];
		}
		System.out.println("binary value is " + binary);
	}

}
