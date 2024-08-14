//printing the name

import java.util.*;

class ten
{
	public void run(int n)
	{
		Scanner sc=new Scanner(System.in);
		char []str=new char[n];
		System.out.println("Enter the name :");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next().charAt(0);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(""+str[j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		ten obj=new ten();
		System.out.println("Enter the length of the name :");
		int a=sc.nextInt();
		obj.run(a);
	}
}