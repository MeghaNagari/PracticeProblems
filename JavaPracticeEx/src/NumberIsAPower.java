import java.util.Scanner;

public class NumberIsAPower {
	int r = 0;

	public boolean Power(int n, int x) {

		for (int i = 1; i <= n; i++) {
			r = (int) Math.pow(x, i);
			if (r == n)
				break;
		}
		if (r == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n = s.nextInt();
		int x = s.nextInt();
		NumberIsAPower refObject = new NumberIsAPower();
		boolean result = refObject.Power(n, x);
		System.out.println(result);
	}

}
