import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number you want prime numbers of?");
		int n = input.nextInt();
		
		int[] values = fillArray(n);
		boolean [] pOrNot = findPrimes(values);
		
		primesPrint(values, pOrNot);
	}

	private static void primesPrint(int[] values, boolean[] pOrNot) {
		for (int i = 0; i < pOrNot.length; i++) {
			System.out.printf("%d -> %b%n",values[i], pOrNot[i]);
		}
	}

	private static boolean[] findPrimes(int[] values) {
		boolean [] ret = new boolean[values.length];
		for(int i = 0; i < ret.length; i++) {
			ret[i] = isPrime(i);
		}
		return ret;
	}

	private static boolean isPrime(int n) {
		if(n <= 1)return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		for (int i = 3; i * i <= n; i+= 2) {
			if(n % i == 0) return false;
		}
		
		return true;
	}

	private static int[] fillArray(int n) {
		int[] a = new int [n];
		for (int i = 0; i < a.length; i++) {
				a[i] = i;
		}
		return a;
	}

}
