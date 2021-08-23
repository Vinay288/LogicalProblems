import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		System.out.println("type 1 to start stop watch and type 2 to stop it");
		Scanner s = new Scanner(System.in);
		Instant start = Instant.MAX;
		for (int i = 0; i < 1000; i++) {
			int n = s.nextInt();
			if (n == 1) {
				start = Instant.now();
			} else if (n == 2) {
				if (start == Instant.MAX) {
					System.out.println("Please Start the Timer");
					continue;
				}
				Instant stop = Instant.now();
				long timeCount = Duration.between(start, stop).toSeconds();
				System.out.println("time elapsed is " + timeCount + "sec");
				break;
			} else
				continue;
		}
	}
}
