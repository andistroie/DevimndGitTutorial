
public class Complement {

	private int n;
	
	public Complement(int n) {
		this.n = n;
	}
	
	public int computeComplement() {
		int p10 = 1;
		
		while (p10 < this.n) {
			p10 *= 10;
		}
		return (p10 - this.n);
	}
	
	public int computeComplementCountingDigits() {
		int counter = 0;
		int nCopy = this.n;
		
		while(nCopy != 0) {
			counter++;
			nCopy /= 10;
		}
		
		return (int)(Math.pow(10, counter) - this.n);
	}
}
