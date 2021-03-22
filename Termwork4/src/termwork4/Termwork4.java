package termwork4;

import java.util.*;
class Termwork4
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter No. of row : ");
	int row = sc.nextInt();
	int a[][]= new int[row][];
	for(int i=0;i<row;i++)
	{
		System.out.println("Enter no. column for row"+(i+1));
		int column = sc.nextInt();
		a[i]=new int[column];
	}
	for(int i=0;i<row;i++)
	{
		System.out.println("Enter the value in 2D array for row"+(i+1));
		for(int j=0;j<a[i].length;j++)
		a[i][j]=sc.nextInt();
	}
	int i=1;
	for(int b[]:a)
	{
		int sum=0,av=0,l=b.length;
		for(int c:b)
			sum+=c;
			av=sum/l;
		System.out.println("Average value in row"+(l-(l-i))+" : "+av);
		i++;
	}
}
}