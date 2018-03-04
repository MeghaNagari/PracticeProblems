import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

public class LinkedListSorting {

	static void sort(LinkedList l)
	{
		TreeSet ts=new TreeSet<>(l);
		System.out.println(ts);
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				
				if(l[i]>l[j])
				{
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(9);
		ll.add(0);
		ll.add(8);
		System.out.println(ll);
		sort(ll);
		
	}

}
