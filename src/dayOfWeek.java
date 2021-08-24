import java.util.Scanner;

public class dayOfWeek {
	public static void main(String[] args) {
		System.out.println("enter values for month, day and year");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int day = s.nextInt();
		int year = s.nextInt();
		if (month > 12 || day > 31)
			System.out.println("invalid input");
		else {
			int y = year - (14 - month) / 12;
			int x = y + (y / 4) - (y / 100) + (y / 400);
			int m = month + 12 * ((14 - month) / 12) - 2;
			int dayOfWeek = (day + x + (31 * m) / 12) % 7;
			switch (dayOfWeek) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}
	}

}
