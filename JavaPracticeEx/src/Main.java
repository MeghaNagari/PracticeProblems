import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static void printComputingDevicesCount(final List<Object> computingDevices) {
		int mobile = 0;
		int personalComputers = 0;
		int personalTabs = 0;

		for (Object x : computingDevices) {
			if (x.equals(1))
				mobile++;
			else if (x.equals(2))
				personalComputers++;
			else if (x.equals(3))
				personalTabs++;

		}
		System.out.println(mobile + " " + personalComputers + " " + personalTabs);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter no of objects");

		int totalObjects = s.nextInt();

		System.out.println("enter list of numbers between 1-3");

		List<Object> list = new ArrayList();

		for (int i = 0; i < totalObjects; i++) {
			list.add(s.nextInt());

		}

		System.out.println(list);
		printComputingDevicesCount(list);

	}

}
