import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.standard.PresentationDirection;

public class NumberOfOccurrences 
{
	
	static String presentString,previousString;

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a sentence");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		ArrayList al=new ArrayList<>();
		for(int i=0;i<str1.length;i++)
		{
			al.add(str1[i]);
		}
		Iterator i=al.iterator();
		int x = -1;
	
		while(i.hasNext())
		{
			x++;
			int count=0;
			presentString=(String) i.next();
			
			int index=str.indexOf(presentString);
			
			if(index<x)
					break;
			
			else
			{
			
			for(int j=0;j<str1.length;j++)
			{
				
				if(presentString.equals(str1[j]))
				
				
					count++;
			}
			System.out.println("count of "+presentString+"="+count);
			
			}
		}
		
	}
}
	
