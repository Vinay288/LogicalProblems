import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("press 1 to fahrenheit to celsius and press 2 for celsius to fahrenheit conversion");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("enter the fahrenheit scale temperature");
			double temperature = s.nextDouble();
			System.out.println("temperature in celsius scale is " + ((float) ((temperature - 32) * (5 / 9.0))) + " celsius");
			break;
			
		case 2:
			System.out.println("enter the celsius scale temperature");
			double temp = s.nextDouble();
			System.out.println("temperature in fahrenheit scale is " + ((temp * (9 / 5)) + 32) + " celsius");
			break;
			
		default:
			System.out.println("invalid input");
		}

	}

}
