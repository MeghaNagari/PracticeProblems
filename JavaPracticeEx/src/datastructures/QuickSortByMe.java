package datastructures;
public class QuickSortByMe {
	
	
		
	
	/*
	static int partition(int arr[],int low,int high)
	{
		
		
	
	        int pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
		
		
	static void sort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	             pi is partitioning index, arr[pi] is 
	              now at right place 
	            int pi = partition(arr, low, high);
	 
	            // Recursively sort elements before
	            // partition and after partition
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	    }
	*/

	public static void main(String args[]) throws Exception {


		int a[] = { 11, 16, 2, 8, 1, 4, 9, 7 };
		
		

		sort(a, 0, 7);

	}
	
	
	static void sort(int[] a, int l, int h)  throws Exception
	{
		if (l < h) {
			int p = (l + h) / 2;

			int j = l;

			for (int i = j; j <= h; i++)

			{

				while (a[j] >= a[p])

				{

					if (j != h)

						j++;
					else break;

				}

				if (j <= h )

					{
					
					if(a[j]<a[p])
					
					{int t = a[i];

					a[i] = a[j];

					a[j]= t;
					}}

				if (j != h)

					j++;
				else
					break;

			}
			
			

			
			sort(a, l, p - 1);

			
			
			sort(a, p + 1, h); 
		}
		
		
		
		if(l==h)
		{
			if(a[l]>a[l+1])
			{
				int t=a[l];
				a[l]=a[l+1];
				a[l+1]=t;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}

	
	
	
	

}
