import java.util.*; 
import java.io.*;

class LongestWord {
	
	
  public static String LongestWord(String sen) { 
      int presentLength,previousLength=0;
  String presentToken,longestWord=null;
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       StringTokenizer st=new StringTokenizer(sen," ");
       while(st.hasMoreTokens())
       {
    	   presentToken=st.nextToken();
           presentLength=presentToken.length();
           if(presentLength>=previousLength)
           {
                previousLength=presentLength;
                longestWord=presentToken;
           }
           
       }
       
       
       
    return longestWord;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}








  