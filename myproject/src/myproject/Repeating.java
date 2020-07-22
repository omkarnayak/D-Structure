package myproject;


import java.util.*;

public class Repeating {
    public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        	arr[i]=s.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}