package myproject;
import java.util.*;
public class QuickSort {
	void sort(int a[],int low,int high)
	{
		if(low<high) {
		int p=partition(a,low,high);
		
		sort(a,low,p-1);
		sort(a,p+1,high);
	}
	}
	int partition(int a[],int low,int high)
	{
		int pivot=a[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return (i+1);
	}
	 public void print(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(a[i]+" "); 
	    } 
	 
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	QuickSort o=new QuickSort();
	o.sort(a,0,n-1);
	o.print(a);
	s.close();
	
}
}
