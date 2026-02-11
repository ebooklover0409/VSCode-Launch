import java.util.Scanner;

public class Fermat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter integer a: ");
		int a = in.nextInt();

		System.out.print("Enter integer b: ");
		int b = in.nextInt();

		System.out.print("Enter integer c: ");
		int c = in.nextInt();

		System.out.print("Enter integer n: ");
		int n = in.nextInt();

		double left = Math.pow(a, n) + Math.pow(b, n);
		double right = Math.pow(c, n);

		if (n > 2 && left == right) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn't work.");
		}

		in.close();
	}
}
