package myproject;
import java.util.*;
public class MergeSort {
	void merge(int a[],int l,int m,int h)
	{
		int n1=(m-l)+1;
		int n2=h-m;
		 int b[]=new int[n1];
		 int c[]=new int[n2];
		 for(int i=0;i<n1;i++)
			 b[i]=a[l+i];
		 for(int j=0;j<n2;j++)
			 c[j]=a[m+1+j];
		 int i=0,j=0;
		 int k=l;
		 while(i<n1 && j<n2)
		 {
			 if(b[i]<=c[j])
			 {
				 a[k]=b[i];
				 i++;
			 }
			 else {
				 a[k]=c[j];
				 j++;
			 }
			 k++;
		 }
		 while(i<n1)
		 {
			 a[k]=b[i];
			 i++;
			 k++;
		 }
		 while(j<n2)
		 {
			 a[k]=c[j];
			 j++;
			 k++;
		 }
	}
	
	void sort(int a[],int l,int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			sort(a,l,m);
			sort(a,m+1,h);
			merge(a,l,m,h);
		}
	}
	static void printArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MergeSort v= new MergeSort();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		v.sort(a,0,n-1);
		printArr(a);
		sc.close();
	}
}
