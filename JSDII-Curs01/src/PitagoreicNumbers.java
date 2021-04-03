
public class PitagoreicNumbers {

	public static void computeNumbers(int upperLimit) {
		
		for (int i = 1; i <= upperLimit; i++) {
			for (int j = i; j <= upperLimit; j++) {
				int sum = i * i + j * j;
				int k = (int)Math.sqrt(sum);
				
				if(k*k == sum && k <= upperLimit) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}
}
