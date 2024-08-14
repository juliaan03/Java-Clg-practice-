//finding transpose

import java.util.*;

class twelve
{
	public void run(int r,int c)
	{
		Scanner sc=new Scanner(System.in);
		int [][]arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter the "+i+" and "+j+" :");
				int a=sc.nextInt();
				arr[i][j]=a;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(""+arr[i][j]);
			}
			System.out.println();
		}
		
		//finding transpose
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(""+arr[j][i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		twelve obj=new twelve();
		System.out.println("Enter the rows and columns :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		obj.run(r,c);
	}
}