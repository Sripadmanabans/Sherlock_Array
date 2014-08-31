package sherlock_and_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockArray 
{
	public static List<String> output = new ArrayList<String>();
	
	public static void sherlock(int a[], int n) 
	{
		int sumRight = 0;
		int sumLeft = 0;
		boolean status = false;
		for(int i = 0; i < n; i++)
		{
			sumRight += a[i];
		}
		for(int i = 0; i < n; i++)
		{
			sumRight -= a[i];
			
			if(sumLeft == sumRight)
			{
				status = true;
				break;
			}
			
			sumLeft += a[i];
		}
		if(status)
		{
			output.add("YES");
		}
		else
		{
			output.add("NO");
		}
	}
	
	public static void main(String Args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		int n;
		for(int i = 0; i < t; i++)
		{
			n = sr.nextInt();
			int a[] = new int[n];
			for(int j = 0; j < n; j++)
			{
				a[j] = sr.nextInt();
			}
			
			sherlock(a, n);
		}
		
		for(String in:output)
		{
			System.out.println(in);
		}
		
		sr.close();
	}
}
