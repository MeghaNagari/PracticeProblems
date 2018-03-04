import java.util.*; 
import java.io.*;

class PentagonalDots {  
	
	static int diff=5,previousTerm=1,presentTerm;
	
  public static int PentagonalNumber(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
	  if(num==1)
	  
    return num;

	  else
	  {
		  for(int i=2;i<=num;i++)
		  {
			  presentTerm=previousTerm+diff;
			  diff+=5;
			  previousTerm=presentTerm;
			  
		  }
		  return presentTerm;
	  }
	  
	  
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PentagonalNumber(s.nextInt())); 
  }   
  
}









