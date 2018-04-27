import java.util.Scanner;

public class HeronFormula {
	public static void main(String args[]) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter one side length of the triangle: ");
		double A = a.nextDouble();
		
		System.out.println("Enter the next side length of the triangle: ");
		double B = a.nextDouble();
		
		System.out.println("Enter the last side length of the triangle: ");
		double C = a.nextDouble();
		
		double S = (A+B+C)/2;
		
		double Area = Math.sqrt(S*(S-A)*(S-B)*(S-C));
		
		System.out.println("The area of the triangle is " + Area);
	}
}
