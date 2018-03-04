
public class InsertElementAtIndex {
	
	
	public static void main(String[] args)
	{
		int a[]=new int[6];
		for(int i=0;i<5;i++)
		{
			a[i]=i;
		}
		
		int n=a.length;
		int k=2;
		int ele=9;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	
		
		
		
		for(int i=5;i>k;i--)
		{
			a[i]=a[i-1];
		}
		
		
		a[k]=ele;
		
		
		for(int i=0;i<n;i++)
		{
					System.out.println(a[i]);
		}
		
		
	}
	
	

}
