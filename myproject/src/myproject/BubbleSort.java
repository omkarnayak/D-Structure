package myproject;

import java.util.*;

public class BubbleSort {
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	BS o=new BS();
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	o.bubbleSort(a);
}
}
class BS{
	void bubbleSort(int arr[])
	{
		int m=arr.length;
		for(int i=0;i<m-1;i++)
		{
			for(int j=0;j<m-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<m;k++)
			System.out.print(arr[k]+" ");
	}
}