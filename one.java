import java.util.*;

class One
{
	public void run(int a,int b)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		One obj=new One();
		System.out.println("Enter the rows and columns :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.run(a,b);
	}
}