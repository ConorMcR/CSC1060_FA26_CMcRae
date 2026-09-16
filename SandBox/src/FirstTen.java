
public class FirstTen {

	public static void main(String[] args) {
		int sum = 0;
		for (int r = 0; r <= 9; r++) {
			sum += r;
		}
		System.out.println(sum);
		sum = 0;
		int r = 0;
		while (r <= 9) {
			sum += r;
			r++;
			
		}
		System.out.println(sum);
	}

}
