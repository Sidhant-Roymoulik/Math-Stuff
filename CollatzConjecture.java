import java.util.Scanner;

public class CollatzConjecture {
	public static void main(String args[]) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = console.nextInt();
		
		Collatz(n);
	}

	public static void Collatz(int n) {
		int counter = 0;
		while(n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				counter++;
			} else {
				n = 3*n + 1;
				counter++;
			}
			System.out.println(counter + ". " + n);
		}
		System.out.println("It took " + counter + " steps to reach 1.");
	}
}
