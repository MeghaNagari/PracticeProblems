package datastructures;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[]={4,9,5,3,2,1};
		int min=0;
		
	for(int i=0;i<5;i++)
	{	
		int l=a.length-1;
		min=a[i];
		
		for(int j=i+1;j<6;j++)
			{
		
		
			if(a[j]<=min)
				min=a[j];
		
		}
		if(min==a[i])
			continue;
	
	 while(l>i)
		{a[l]=a[l-1];
		l--;
		}
	 
	 a[i]=min;
	
		
	
			
	}		
			for(int k=0;k<6;k++)
       System.out.println(a[k]);
		
	}

}
