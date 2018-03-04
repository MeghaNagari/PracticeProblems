
public class ThreadEx {
	int count;

	public void increment() {
		count++;
	}

	public static void main(String[] arsg) {
		ThreadEx t = new ThreadEx();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
          				t.increment();
			}
		});

		t1.start();

		System.out.println(t.count);

	}

}
