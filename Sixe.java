//inverted left pattern
import java.util.*;

class Sixe
{
	public void run(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Sixe obj=new Sixe();
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		obj.run(a);
	}
}