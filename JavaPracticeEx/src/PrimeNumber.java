import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		
		
//-----------TO CHECK IF A NUMBER IS PRIME----------
		
		
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int c=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//				c++;
//		}
//		if(c==2)
//			System.out.println("number is prime");
//		else
//			System.out.println("number is not prime");

	
		//------------TO PRINT PRIME NUMBERS FROM 1 TO N
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int j=1,c = 0;
	System.out.println("1");
	while(j<=n)
	{
		c=0;
	for(int i=1;i<=j;i++)
	{
		 
		if(j%i==0)
		c++;
		
	}
	if(c==2)
		System.out.println(j);
	j++;
	
	}}
}
