
public class NumereAmicale {
	
	private static int computeDivSum(int n) {
		int sum = 1;
		
		for (int d = 2; d <= n/2; d++) {
			if (n % d == 0) {
				sum += d; 
			}
		}
		
		return sum;
	}
	
	public static void printNumbers(int lowerLimit, int upperLimit) {
		
		for (int i = lowerLimit; i <= upperLimit; i++) {
			int potentialPair = computeDivSum(i);
			
			if (computeDivSum(potentialPair) == i && i < potentialPair) {
				System.out.println(i + " " + potentialPair);
			}
		}
	}
}
