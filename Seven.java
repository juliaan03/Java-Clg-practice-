//diamond pattern

import java.util.*;

class Seven
{
	public void run(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(n-i)+1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Seven obj=new Seven();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);
	}
}