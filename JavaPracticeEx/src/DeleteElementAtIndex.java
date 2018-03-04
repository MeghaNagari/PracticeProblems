
public class DeleteElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int k=3;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		
		
		for(int i=k;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
