
public class SynchronizedEx {
	int count;
	public synchronized void increment()
	{
		count++;
		System.out.println(count);
	}
	Thread t1=new Thread(){
		public void run()
		{
			increment();
		}
	};
	Thread t2=new Thread(){
		public void run()
		{
			increment();
			
		}
	};
	
public static void main(String[] args) throws InterruptedException
{
	SynchronizedEx s=new SynchronizedEx();
	
	

	s.t1.start();
	s.t2.start();
	
}
}
