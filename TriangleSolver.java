import java.util.Scanner;

public class TriangleSolver {
	public static void main(String args[]) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Triangle Given (Use Format SSS):");
		String type = console.nextLine();
		
		if (type.equals("SSS")) {
			SSS();
		} else if (type.equals("SSA")) {
			SSA();
		}  else if (type.equals("SAS")) {
			SAS();
		} else if (type.equals("ASA")) {
			ASA();
		} else if (type.equals("AAS")) {
			AAS();
		} else {
			throw new IllegalArgumentException("Input is not valid!");
		}
	}
	private static void AAS() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Measure of Angle A: ");
		double angleA = console.nextDouble();
		
		System.out.println("Enter Measure of Angle B: ");
		double angleB = console.nextDouble();
		
		System.out.println("Enter Length of Side a: ");
		double a = console.nextDouble();
		
		double angleC = 180 - angleA - angleB;
		
		double angleAR = Math.toRadians(angleA);
		double angleBR = Math.toRadians(angleB);
		double angleCR = Math.toRadians(angleC);
		
		double b = a*Math.sin(angleBR)/Math.sin(angleAR);
		double c = a*Math.sin(angleCR)/Math.sin(angleAR);
		
		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("<A: " + angleA);
		System.out.println("<B: " + angleB);
		System.out.println("<C: " + angleC);
	}
	private static void ASA() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Measure of Angle A: ");
		double angleA = console.nextDouble();
		
		System.out.println("Enter Length of Side c: ");
		double c = console.nextDouble();
		
		System.out.println("Enter Measure of Angle B ");
		double angleB = console.nextDouble();
		
		double angleC = 180 - angleA - angleB;
		
		double angleAR = Math.toRadians(angleA);
		double angleBR = Math.toRadians(angleB);
		double angleCR = Math.toRadians(angleC);
		
		double a = c*Math.sin(angleAR)/Math.sin(angleCR);
		double b = c*Math.sin(angleBR)/Math.sin(angleCR);
		
		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("<A: " + angleA);
		System.out.println("<B: " + angleB);
		System.out.println("<C: " + angleC);
	}
	private static void SAS() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Length of Side a: ");
		double a = console.nextDouble();
		
		System.out.println("Enter Measure of Angle B: ");
		double angleB = console.nextDouble();
		
		System.out.println("Enter Length of Side c: ");
		double c = console.nextDouble();
		
		double angleBR = Math.toRadians(angleB);
		
		double b = Math.sqrt(a*a + c*c - 2*a*c*Math.cos(angleBR));
		double angleA = Math.toDegrees(Math.acos((a*a - b*b - c*c)/(-2*b*c)));
		double angleC = Math.toDegrees(Math.acos((c*c - a*a - b*b)/(-2*a*b)));
		
		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("<A: " + angleA);
		System.out.println("<B: " + angleB);
		System.out.println("<C: " + angleC);
	}
	private static void SSA() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Length of Side a: ");
		double a = console.nextDouble();
		
		System.out.println("Enter Length of Side b: ");
		double b = console.nextDouble();
		
		System.out.println("Enter Measure of Angle A: ");
		double angleA = console.nextDouble();
		
		double angleAR = Math.toRadians(angleA);
		double angleBR = 0;
		double angleCR = 0;
		
		double h = b*Math.sin(angleAR);
		
		double c;
		
		if(angleA < 90) {
			if(a < h) {
				throw new IllegalArgumentException("Triangle is Impossible");
			} else if(Math.abs(a - h) < 0.1) {
				c = Math.sqrt(b*b - a*a);
				angleBR = Math.PI/2;
				angleCR = Math.acos((c*c - a*a - b*b)/(-2*a*b));
			} else if (a > b) {
				angleBR = Math.asin(b*Math.sin(angleAR)/a);
				angleCR = Math.PI - angleBR - angleAR;
				c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angleCR));
			} else {
				angleBR = Math.asin(b*Math.sin(angleAR)/a);
				angleCR = Math.PI - angleBR - angleAR;
				c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angleCR));
				
				double angleB = Math.toDegrees(angleBR);
				double angleC = Math.toDegrees(angleCR);
				
				System.out.println("");
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				
				System.out.println("<A: " + angleA);
				System.out.println("<B: " + angleB);
				System.out.println("<C: " + angleC);
				
				angleBR = Math.PI - Math.asin(b*Math.sin(angleAR)/a);
				angleCR = Math.PI - angleBR - angleAR;
				c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angleCR));
			}
		} else {
			if (a <= b) {
				throw new IllegalArgumentException("Triangle is Impossible");
			} else {
				angleBR = Math.asin(b*Math.sin(angleAR)/a);
				angleCR = Math.PI - angleBR - angleAR;
				c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angleCR));
			}
		}
		
		double angleB = Math.toDegrees(angleBR);
		double angleC = Math.toDegrees(angleCR);
		
		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("<A: " + angleA);
		System.out.println("<B: " + angleB);
		System.out.println("<C: " + angleC);
	}
	private static void SSS() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Length of Side a: ");
		double a = console.nextDouble();
		
		System.out.println("Enter Length of Side b: ");
		double b = console.nextDouble();
		
		System.out.println("Enter Length of Side c: ");
		double c = console.nextDouble();
		
		double angleA = Math.toDegrees(Math.acos((a*a - b*b - c*c)/(-2*b*c)));
		double angleB = Math.toDegrees(Math.acos((b*b - a*a - c*c)/(-2*a*c)));
		double angleC = Math.toDegrees(Math.acos((c*c - a*a - b*b)/(-2*a*b)));
		
		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("<A: " + angleA);
		System.out.println("<B: " + angleB);
		System.out.println("<C: " + angleC);
	}
}
