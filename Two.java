//full pyramid pattern
import java.util.*;

class Two
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
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Two obj=new Two();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);	
	}
}