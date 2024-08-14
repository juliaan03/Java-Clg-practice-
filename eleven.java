//matrix center column and row addition

import java.util.*;

class eleven
{
	public void run(int a,int b)
	{
		Scanner sc=new Scanner(System.in);
		int [][]arr=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println("Enter the "+i+" and "+j+" :");
				int r=sc.nextInt();
				arr[i][j]=r;
			}
		}
		
		//checking and adding
		
		int sum=0;
		int r=(a/2),f=(b/2);
		System.out.println("The elements are "+r+" and"+f);
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==r || j==f)
				{
					sum=sum+arr[i][j];
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println("The sum of the middle element is "+sum);
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		eleven obj=new eleven();
		System.out.println("Enter the rows and columns :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.run(a,b);
	}
}