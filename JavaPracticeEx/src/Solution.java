import java.util.*;
import java.io.*;

class Solution{
  
	 public void calculate(int a,int b,int n)
     {
            
      if(( a>=0 && a <=50) && (b>=0 && b<=50) &&( n>=1 && n<=15))
        { 
          int c=1;
          int term2;
    int t1=a+b;    
          term2 = t1;
    System.out.print(t1+" ");
         while(c<n)
         {
            
              int term1=(int) (term2+(Math.pow(2,c)*b));
             System.out.print(term1+" ");
             term2=term1;
             c++;
             
             
         }
          System.out.println();
          
           
       }
 
     
     
 }
	
    
    public static void main(String []argh){
    	Solution obj=new Solution();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        String inputs[]=new String[t];
        for(int i=0;i<t;i++)
        {
        	inputs[i]=in.nextLine();
        }
        if(t>=0 && t<=500)
        {
        for(int i=0;i<t;i++)
        {
        	String[] a=inputs[i].split(" ");
            obj.calculate(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]));
           
            
            
        }
        }
           
              
        
        in.close();
    }
}
