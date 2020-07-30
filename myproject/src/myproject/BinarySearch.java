package myproject;

import java.util.*;
public class BinarySearch {
	public static void binarySearch(int a[],int low,int high,int x){
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(x>a[mid]) {
				low=mid+1;
			}
			else if(a[mid]==x)
			{
				System.out.println(mid);
				break;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		
	}
 public static void main(String args[]) 
 {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 
	 int[] a=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=s.nextInt();
	 }
	 int y=s.nextInt();
	 int high=n-1;
	 int low=0;
	 binarySearch(a,low,high,y);
 }
	
}
