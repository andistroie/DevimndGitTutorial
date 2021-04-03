
public class PuterileBazei {
	
	public static void printPowers(int b, int e) {
		int p = 1;
		
		for (int i = 0; i <= e; i++) {
			System.out.print(p + " ");
			p *= b;
		}
		System.out.println();
	}
}
