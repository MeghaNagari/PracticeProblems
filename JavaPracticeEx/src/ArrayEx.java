import java.util.ArrayList;
import java.util.Iterator;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ArrayEx {
	// public int solution(int[] A) {
	// // write your code in Java SE 8
	// }

	public static void main(String[] args) {
		// Scanner s=new Scanner(System.in );
		int[] a = { 1, 5, 3, 4, 10, 6, 2 };
		int t;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[j];
					a[j] = a[i];
					a[i] = t;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==========");
		ArrayList al = new ArrayList<>();
		for (int i = 0; i < a.length; i++)
			al.add(a[i]);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println("==" + itr.next());
		}
		for (int i = 1; i <= al.size(); i++) {
//			System.out.println(i);
			if (!al.contains(i)) 
				System.out.println(i);

			

		}

	}

}