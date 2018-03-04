
public class MergeSort {

	  public static void mergeSort(int[] a, int low, int high) 
	    {
	        int N = high - low;         
	        if (N <= 1) 
	            return; 
	        int mid = low + N/2; 
	        // recursively sort 
	        mergeSort(a, low, mid); 
	        mergeSort(a, mid, high); 
	        // merge two sorted subarrays
	        int[] temp = new int[N];
	        int i = low, j = mid;
	        for (int k = 0; k < N; k++) 
	        {
	            if (i == mid)  
	                temp[k] = a[j++];
	            else if (j == high) 
	                temp[k] = a[i++];
	            else if (a[j]<a[i]) 
	                temp[k] = a[j++];
	            else 
	                temp[k] = a[i++];
	        }    
	        for (int k = 0; k < N; k++) 
	            a[low + k] = temp[k];         
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,10,12,6,9};

		mergeSort(a, 0, 6);
		
		for (int i = 0; i < 6; i++)
            System.out.print(a[i]+" ");     
		

	}

/*	private static void mergeSort(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		int midI=l;
		if (l < h) {
			int mid = (l + h) / 2;
 midI=mid;
 
 System.out.println("---------EARLIER--------"+h);
			mergeSort(a, l, mid);

			 System.out.println("------LATER----"+h);
			mergeSort(a, mid + 1, h);
				
		}

		if (a[l]!=5  && a[l] > a[midI + 1]  ) {

			int t = a[l];
			a[l] = a[midI + 1];
			a[midI + 1] = t;
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
		
		
		for (int i = 0; i <= 5; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		*/
		
	
	}

