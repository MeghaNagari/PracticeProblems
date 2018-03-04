
public class BetterProgrammerTask2 {

    public static int getCountOfOnes(int n) {
        /*
         Please implement this method to
         return the number of '1's in the binary representation of n
         for any integer n, where n > 0

         Example: for n=6 the binary representation is '110' and the number of '1's in that 
         representation is 2

        */
    	int count = 0;
    	while (n > 0) {
    	    count++;
    	    n = n >> 1;
    	    
    	}
    	return count;
    	
    	
    }
    
    
    public static void main(String[] args)
    {
    	
    	int value = 11;
    	int count=BetterProgrammerTask2.getCountOfOnes(value);
    	
    	System.out.println(count);
    	
    }
}
