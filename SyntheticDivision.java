import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("resource")
public class SyntheticDivision {
	public static void main(String args[]) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the degree of the poynomial: ");
		int degree = a.nextInt();
		
		int Degree[] = new int[degree + 1];
		int Quotient[] = new int[degree + 1];
		int Halfway[] = new int[degree];
		
		for ( int i = 0; i <= degree; i++ )
		{
			System.out.println("Enter the x^" + (degree-i) + " coefficient: ");
			Degree[i] = a.nextInt();
		}
		
		System.out.println(Arrays.toString(Degree));
		System.arraycopy(Degree, 0, Quotient, 0, 1);
		
		System.out.println("Enter the root: ");
		int root = a.nextInt();
		
		for (int i = 0; i < degree; i++)
		{
			Halfway[i] = Quotient[i]*root;
			Quotient[i+1] = Degree[i+1] + Halfway[i];
			
			System.out.println("The remainder is " + Quotient[i] + "*x^" + (degree-i-1));
		}
		System.out.println("The remainder is " + Quotient[degree] + "*x^-1");
	}
}
