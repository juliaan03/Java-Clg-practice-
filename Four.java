//left pyramid pattern
import java.util.*;

class Four
{
	public void run(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Four obj=new Four();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);	
	}
}