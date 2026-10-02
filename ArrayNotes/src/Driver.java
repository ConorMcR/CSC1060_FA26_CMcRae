import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		int[] counts = new int[5];
		int[] values = new int [100];
		int[] counts2 = counts;
		//int[] arr = {1,2,3,4,5};
		
		counts[0] = 123;
		counts2[0] = 321;
		
		//System.out.println(counts[0]);
		
		//printArray(counts);
		fillArray(values);
		//search(values, 73);
		//printArray(values);
		System.out.println(search(values, 73));
		//System.out.println(Arrays.toString(values));
		printArray(values);
		System.out.println();
		counts = makeHistogram(values);
		System.out.println("A's-B's-C's-D's-F's");
		System.out.printf("%2d%4d%4d%4d%4d",counts[4],counts[3],counts[2],counts[1],counts[0]);
	}

	private static int[] makeHistogram(int[] values) {
		int[] ret = new int[5];
		for (int i = 0; i < values.length; i++) {
			if(values[i] > 89) ret[4]++;
			else if(values[i] > 79)ret[3]++;
			else if(values[i] > 69)ret[2]++;
			else if(values[i] > 59)ret[1]++;
			else ret[0]++;
		}
		return ret;
	}

	private static int search(int[] values, int target) {
		for (int i = 0; i < values.length; i++) {
			if(values[i] == target)return i;
		}
		return -1;
	}

	private static void fillArray(int[] values) {
		Random random = new Random();
		for (int i = 0; i < values.length; i++) {
			values[i] = random.nextInt(70)+30;
			
		}
		
	}

	private static void printArray(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
		System.out.print(counts[i] + ", ");
		if(i % 10 == 0 && i != 0)
			System.out.println();
	}
	}

}
