package datastructures;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class LinkedListEx {

	public static void main(String[] args) {
		
		System.out.println("enter number of employees details");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String eid,ename,sal;
		Employee e;
				LinkedList<Employee> li=new LinkedList<>();
		for(int i=1;i<=n;i++)
		{
			e=new Employee();

			System.out.println("enter eid,ename,sal");
			
				eid=s.next();
				e.seteId(eid);
				ename=s.next();
				e.seteName(ename);
				sal=s.next();
				e.setSal(sal);
				
		
			
			li.add(e);
			
			
			
		}
		
		
		Iterator<Employee> itr=li.iterator();
		
		while(itr.hasNext())
		{
			
			e=itr.next();
			System.out.println();
			System.out.print(e.geteId()+"\t"+e.geteName()+"\t"+e.getSal());
		}
		
		
		e=new Employee();
		e.seteId("101");
		e.seteName("megha");
		
	//	li.addFirst(e);
		
		li.addLast(e);
		
		System.out.println();
		
Enumeration<Employee> enu=Collections.enumeration(li);
while(enu.hasMoreElements())
{
	e=enu.nextElement();
	System.out.println(e.geteId()+" "+e.geteName()+" "+e.getSal());
	
	
}

	
		
	}

}
