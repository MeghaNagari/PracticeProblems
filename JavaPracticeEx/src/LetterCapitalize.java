import java.util.*; 
import java.io.*;

class LetterCapitaliize {  
  public static String LetterCapitalize(String str) { 
      
      String[] s=str.split(" ");
      String changedString;
      for(int i=0;i<str.length();i++)
      {
    	 s[i]=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
         }
      
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
      changedString=Arrays.toString(s);
      
    return changedString.replaceAll(",", " ");
    
  } 
  
  public static void main (String[] args)
  {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}


