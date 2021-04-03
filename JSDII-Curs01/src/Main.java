import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("===== Complementul unui numar =====");
//		int n = sc.nextInt();
//		Complement c = new Complement(n);
//		System.out.println("Complement while: " + c.computeComplement());
//		System.out.println("Complement count digits: " + c.computeComplementCountingDigits());
		
//		System.out.println("===== Puterile bazei =====");
//		int b = sc.nextInt();
//		int e = sc.nextInt();
//		PuterileBazei.printPowers(b, e);
		
//		System.out.println("===== Numere amicale =====");
//		int lowerLimit = sc.nextInt();
//		int upperLimit = sc.nextInt();
//		NumereAmicale.printNumbers(lowerLimit, upperLimit);

		
//		System.out.println("===== Sirul sumelor numerelor prime =====");
//		int upperLimit = sc.nextInt();
//		PrimeSum ps = new PrimeSum(upperLimit);
//		ps.printPrimeSum();

		System.out.println("===== Pitagoreic numbers =====");
		int upperLimit = sc.nextInt();
		PitagoreicNumbers.computeNumbers(upperLimit);
		
		sc.close();
	}

}
