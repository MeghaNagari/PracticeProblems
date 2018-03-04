import java.util.*; 
import java.io.*;

class LetterChange {  
  public static String LetterChanges(String str) { 
	  
	  int length=str.length();
  
	 byte[] b=str.getBytes();
	  
	  
	  
	  byte[] b2=new byte[length];
	  
	  for(int i=0;i<length;i++)
	  {
		  
		  b2[i]=(byte) (b[i]+1);
		   
	  }
	  
	  String letterChanged=new String(b2);
	  
	  letterChanged=letterChanged.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u", "U");
	  
//	  char[] charArray=letterChanged.toCharArray();
//	  
//	  String s2="";
//	  String newWord=letterChanged;
//	  if(conatinsVowels(newWord))
//	  {
//	  for(int i=0;i<length;i++)
//	  {
////		  System.out.print(charArray);
//		  if(charArray[i]=='a'||charArray[i]=='e'|| charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u')
//		{ s2=s2+charArray[i];
//		
//	    
//		 
//		  letterChanged=s2.toUpperCase();
//			
//		  
//		}
//		  else
//		  {
//			  letterChanged=letterChanged+charArray[i];
//		  }
//		  
//		
//		 
//	  }
//	  
//	  newWord=letterChanged;
//	  
//			  
//		    }
//	  
//    // code goes here   
//    /* Note: In Java the return type of a function and the 
//       parameter types being passed are defined, so this return 
//       call must match the return type of the function.
//       You are free to modify the return type. */
//       
return letterChanged;
    
  } 
  
  private static boolean conatinsVowels(String newWord) {
	
	  int c=0;
	  char[] a=newWord.toCharArray();
	  for(int i=0;i<newWord.length();i++)
	  {
	  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
	 c++;
	// TODO Auto-generated method stub
	
	 
}
	  if(c>0)
	return true;
	  else
		  return false;
  }

public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
   
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}








  