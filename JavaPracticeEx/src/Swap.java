
public class Swap {

	static void partition(int[] a,int l,int h)
	
	{
		
		if(l<h)
		{
			int mid=(l+h)/2;
			partition(a,l,mid);
			partition(a,mid+1,h);
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		int a[]={3,4,1,5,2};
		partition(a, 0,5 );
		
	}
}
