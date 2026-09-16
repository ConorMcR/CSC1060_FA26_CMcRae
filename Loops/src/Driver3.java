import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 10;

		while (n <= 1)
			;

		{
			System.out.println(n);
			n--;
		}
		System.out.println("blast-off!");
		String again = "y";
		while (again.charAt(0) == 'y')
			
		{
			System.out.println("It looks like you did something");
			System.out.println("Want to do it again");
			again = input.next();
			System.out.println("t-minus:");
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 2; i <= 8; i += 2) {
			System.out.println(i + ",");

		}
		System.out.println("Who do we apprerciate!!");

		// nested loops

		for (int row = 1; row < 10; row++) {
			for (int col = 1; col <= 10; col++) {
				System.out.printf("%4d", row * col);
			}
			System.out.println();
		}
		
		System.out.print("Roman Alphabet");
		for(char c = 'A';c < 'Z'; c++)
		{
			System.out.print(c);
		}
		System.out.println();
		System.out.print("greek  Alphebet");
		for (int i = 913; i <= 937 ; i++) {
			if(i != 930)
			System.out.print((char) i);
		}
		System.out.println();
	}

}
