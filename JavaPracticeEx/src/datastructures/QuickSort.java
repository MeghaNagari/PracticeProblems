package datastructures;

public class QuickSort {

	int partition(int arr[], int left, int right)

	{

	      int i = left, j = right;

	      int tmp;

	      int pivot = arr[(left + right) / 2];

	     

	      while (i <= j) {

	            while (arr[i] < pivot)

	                  i++;

	            while (arr[j] > pivot)

	                  j--;

	            if (i <= j) {

	                  tmp = arr[i];

	                  arr[i] = arr[j];

	                  arr[j] = tmp;

	                  i++;

	                  j--;

	            }

	      };

	     
	      
	      for(int k=1;k<arr.length;k++)
	      {
	      	System.out.println(arr[k]);
	      	
	      }	
	      
	      
	      

	      return i;	
	      

	      
	      
	      
	}

	 

	void quickSort(int arr[], int left, int right) {

	      int index = partition(arr, left, right);

	      if (left < index - 1)

	            quickSort(arr, left, index - 1);

	      if (index < right)

	            quickSort(arr, index, right);

	}
		public static void main(String[] args)
		{
			
			int a[]={2,3,6,1,0,5};
			new QuickSort().quickSort(a,0,5);
		}




}