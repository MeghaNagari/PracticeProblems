import java.util.HashSet;

public class DeleteDuplicateInArray {
	
	static void removeDuplicates(int a[])
	{
		System.out.println("before removing dupicates");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("after removing duplicates");
		
	 HashSet hs=new HashSet<>();
	 for(int i=0;i<a.length-1;i++)
	 {
		 hs.add(a[i]);
	 }
	 
	 System.out.println(hs);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	removeDuplicates(new int[] {1,6,4,2,1,6});

	}

}
