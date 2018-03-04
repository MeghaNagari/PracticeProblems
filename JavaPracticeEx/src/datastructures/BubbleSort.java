package datastructures;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int a[]={14,33,27,35,10};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1]; 
					a[j+1]=t;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		
		

	}

}
