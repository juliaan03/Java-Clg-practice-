//inverted right pattern
import java.util.*;


class Five
{
	public void run(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Five obj=new Five();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);
	}
}