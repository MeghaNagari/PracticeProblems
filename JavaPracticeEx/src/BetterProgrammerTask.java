
public class BetterProgrammerTask {

    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
    	int c=a.length;
    	int n=c;
    	String[] rev = new String[c-1];
    	for(int i=0;i<c;i++)
    	{
    		n--;
    		rev[i]=(String) a[n];
    		
    		
    		
    	}
    	return rev;
    	
    	
    	
    	
    	
    	
    }
    
    public static void main(String[] args)
    {
    	String a[]={"10","12","75","4","7","16"};
    	Object[] b=reverseArray(a);
    	for(int i=0;i<b.length;i++)
    	{
    	System.out.println(b[i]);
    }}
}
