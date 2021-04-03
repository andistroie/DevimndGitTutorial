
public class PrimeSum {
	
	private int upperLimit;
	
	public PrimeSum(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	private boolean isPrime(int n) {
		
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int d = 2; d <= Math.sqrt(n); d++) {
				if (n % d == 0) {
					return false;
				}
			} 
		}
		
		return true;
	}
	
	public void printPrimeSum() {
		int sum = 0;
		int crtN = 2;
		
		while (sum < this.upperLimit) {
			
			while(!isPrime(crtN)) {
				crtN++;
			}
			
			if (sum + crtN > this.upperLimit) {
				break;
			}
			
			sum += crtN;
			System.out.print(sum + " ");
			crtN++;
		}
		
	}
}
