package datastructures;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,5,6,21,32,44,65,76};
		int first = 0,x=3;
		int size=9;
		  int last = size - 1;
		   int middle = (first+last)/2;
		 
		   while (first <= last) {
		      if (a[middle] < x)
		         first = middle + 1;    
		      else if (a[middle] ==x) {
		    	  System.out.println("index="+middle);
		         		         break;
		      }
		      else
		         last = middle - 1;
		 
		      middle = (first + last)/2;
		   }
		   if (first > last)
		      System.out.println("Element Not found in the list.");
		

	}

}
