import java.util.Scanner;
public class QuadraticFormula {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a:");
		double a = s.nextDouble();
		
		System.out.println("Enter b:");
		double b = s.nextDouble();
		
		System.out.println("Enter c:");
		double c = s.nextDouble();
		
		double derivative = (b*b)-(4*a*c);
		
		double sqrtDerivative = Math.sqrt(derivative);
		
		double root1 = ((b*-1)+sqrtDerivative)/(2*a);
		double root2 = ((b*-1)-sqrtDerivative)/(2*a);
		
		System.out.println("The first root is: " + root1);
		System.out.println("The second root is: " + root2);
	}
}
