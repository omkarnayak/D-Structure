package myproject;

import java.util.*;
public class OptimizedBs {
		  void bubbleSort(int a[]) {
		    int size =a.length;
		    for (int i = 0; i < size - 1; i++) {
		      boolean swapped = true;
		      for (int j = 0; j < size - i - 1; j++) {
		        if (a[j] >a[j + 1]) {
		          int temp =a[j];
		         a[j] =a[j + 1];
		         a[j + 1] = temp;
		          
		          swapped = false;
		        }
		      }
		       if (swapped == true)
		        break;
		    }
		  }

		    public static void main(String args[]) {
			  Scanner s=new Scanner(System.in);
			  int n=s.nextInt();
		    int[] data = new int[n];
		    for(int i=0;i<n;i++)
		    {
		    	data[i]=s.nextInt();
		    }
		    OptimizedBs bs = new OptimizedBs();
		    bs.bubbleSort(data);
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(data[i]);
		    }
		    	
		  }
		}
