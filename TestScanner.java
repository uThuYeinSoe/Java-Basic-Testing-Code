import java.util.Scanner;

class TestScanner {
	public static void main(String []arg){
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("Please Enter 2 Digit Number");

		a = s.nextInt();

		b = s.nextInt();

		c = s.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}