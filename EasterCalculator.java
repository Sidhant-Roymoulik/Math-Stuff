import java.util.Scanner;

public class EasterCalculator {
	public static void main(String args[]) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("What is the year (No BC): ");
		float year = console.nextFloat();
		
		float a = (year % 19);
		float b = (year % 4);
		float c = (year % 7);
		
		float k = (float) Math.floor(year/100);
		float p = (float) Math.floor((13 + 8*k)/25.0);
		float q = (float) Math.floor(k/4);
		
		float M = (15 - p + k - q) % 30;
		float N = (4 + k - q) % 7;
		
		float d = (19*a + M) % 30;
		float e = (2*b + 4*c + 6*d + N) % 7;
		
		int March = (int) (22 + d + e);
		int April = March - 31;
		
		if (d == 26 && e == 6 && April == 26) {
			April = 19;
		} else if (d == 28 && e == 6 && (11*M + 11) % 30 == 19 && April == 25) {
			April = 18;
		}
		if (March <= 31) {
			System.out.println("Easter will fall on March " + March);
		} else {
			System.out.println("Easter will fall on April " + April);
		}
	}
}