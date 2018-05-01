//This program generates random Pythagorean triples
//Feel free to change the range

public class PythagoreanTriples {
	public static void main(String args[]) {
		
		while(true) {
			int a = getRandomIntInRange(1, 10);
			int b = getRandomIntInRange(1, 10);
			
			PythagoreanTriple(a, b);
		}
	}

	public static int getRandomIntInRange(int min, int max) {
		
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

	public static void PythagoreanTriple(int a, int b) {
		int num1 = Math.abs((a*a)-(b*b));
		int num2 = 2*a*b;
		int h = a*a + b*b;
		int leastLeg = 0;
		int bigLeg = 0;
		
		if (num1 <= num2) {
			leastLeg = num1;
			bigLeg = num2;
		} else {
			leastLeg = num2;
			bigLeg = num1;
		}
		if (num1 != 0) {
			System.out.println(leastLeg + ", " + bigLeg + ", " + h);
		}
	}
}
