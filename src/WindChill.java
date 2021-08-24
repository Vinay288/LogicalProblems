import java.util.Scanner;

public class WindChill {
public static void main(String[] args) {
System.out.println("enter values temperature t and wind speed v ");
Scanner s = new Scanner(System.in);
double temperature =s.nextDouble(),speedOfWind=s.nextDouble();
if(Math.abs(temperature)>50 || speedOfWind>120 ||speedOfWind<3)
	System.out.println("invalid input");

else {
	double windChill =35.74+0.6215*temperature+(0.4275*temperature+35.75)*Math.pow(speedOfWind,0.16);
	System.out.println("wind chill is "+windChill);
}
}
}
