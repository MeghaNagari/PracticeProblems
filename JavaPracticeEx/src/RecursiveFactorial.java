import java.util.Scanner;

public class RecursiveFactorial {
	int factorial,i=1;;
	public int fact(int n)
	{
		
		
		if(n>1)
		{
			
		i=i*n;
		n--;
	     factorial=fact(n);
		}
		return factorial;
	}
	public static void main(String[] args)
	{
		RecursiveFactorial ref = new RecursiveFactorial();
		int n,result;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		n=s.nextInt();
		result=ref.fact(n);
		System.out.println("factorial="+result);
	}
}
