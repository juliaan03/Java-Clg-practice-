//hollow diamond pattern

import java.util.*;

class eight
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
				if(k==1 || k==(2*i-1))
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
		
		for(int i=n;i>1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1 || k==(2*i-1))
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
		eight obj=new eight();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);
	}
}