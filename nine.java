//hollow pyramid pattern

import java.util.*;

class nine
{
	public void run(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(k==1 || k==2*i-1)
				{
					System.out.print("*");	
				}
				else if(i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		nine obj=new nine();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);	
	}
}