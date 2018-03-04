package datastructures;
import java.util.Scanner;
import java.util.Stack;

public class QueueFrom2Stacks {
	static Stack s1=new Stack();
	static Stack s2=new Stack();
	

	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);		
		
		
//		-----------we're inputting values here only
		
		
		
		s1 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		
		s2=new Stack();
		for(int i=s1.size()-1;i>=0;i--)
		{
			s2.push(s1.get(i));
		}
System.out.println(s2);
s2.pop();
System.out.println(s2);
	
	
//	dynamically performing operations
		
//		
//		
//		System.out.println("enter your choice");
//		System.out.println("1.Push 2.Pop 3.Exit 4.Repeat");
//		int n=s.nextInt();
//		switch(n)
//		{
//		case 1:
//			System.out.println("enter item to be pushed");
//			int item=s.nextInt();
//			push(item);break;
//		case 2:pop();break;
//		case 3:System.exit(0);
//		case 4:System.out.println("enter choice");
//				
//		}
//	
//	
//	
//	
//	
//	
//	
//	
//	}
//
//	private static void pop() {
//		// TODO Auto-generated method stub
//		
//		s2.push(s1.lastElement());
//		
//	}
//
//	private static void push(int item) {
//		// TODO Auto-generated method stub
//		s1.push(item);
		
		
		
	}

}
