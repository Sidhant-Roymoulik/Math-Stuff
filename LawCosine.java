import java.util.Scanner;

public class LawCosine {
	public static void main(String args[]) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the first length: ");
		double a = console.nextDouble();
		
		System.out.println("Enter the next length: ");
		double b = console.nextDouble();
		
		System.out.println("Enter the angle in degrees: ");
		double d = console.nextDouble();
		
		LawCosine(a, b, d);
	}

	private static void LawCosine(double a, double b, double angleR) {
		double angleD = angleR/180*Math.PI;
		
		double cSquare = (a*a) + (b*b) - ((2*a*b)*(Math.cos(angleD)));
		
		double c = Math.sqrt(cSquare);
		
		System.out.println("The length of the last side is:");
		System.out.println(c);
	}

}
