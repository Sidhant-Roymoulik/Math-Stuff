import java.util.Scanner;

public class Parabolas {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double a = console.nextDouble();
		
		System.out.println("Enter h: ");
		double h = console.nextDouble();
		
		System.out.println("Enter k: ");
		double k = console.nextDouble();
		
		double c = 1/(4*a);
		double focusY = k+c;
		double directrix = k-c;
		
		System.out.println("");
		
		System.out.println("Vertex: (" + h + ", " + k + ")");
		System.out.println("AoS: x = " + h);
		
		if(a > 0) {
			System.out.println("Opening: \\/, a > 0");
		} else {
			System.out.println("Opening: /\\, a < 0");
		}
		
		System.out.println("Focus: (" + h + ", " + focusY + ")");
		System.out.println("Directrix: y = " + directrix);
		
		if(a > 0) {
			System.out.println("Min: (" + h + ", " + k + ")");
		} else {
			System.out.println("Max: (" + h + ", " + k + ")");
		}
		
		System.out.println("D: x is an Element of the Set Contianing All Real Numbers");
		
		if(a > 0) {
			System.out.println("R: y >= " + k);
		} else {
			System.out.println("R: y <= " + k);
		}
		
		double x1 = Math.sqrt(-k/a) + h;
		double x2 = -1*Math.sqrt(-k/a) + h;
		double y = a*h*h + k;
		
		System.out.println("x-int: " + x1 + ", " + x2);
		System.out.println("y-int: " + y);
	}
}
