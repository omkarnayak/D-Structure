package myproject;
import java.util.*;

public class PrefixToPostfix {
	static boolean isOperator(char x)  
	{ 
	    switch (x)  
	    { 
	        case '+': 
	        case '-': 
	        case '/': 
	        case '*': 
	        return true; 
	    } 
	    return false; 
	} 
	static String prToPo(String ch) 
	{ 
	  Stack<String> s= new Stack<String>(); 
	    int length = ch.length(); 
	    for (int i = length - 1; i >= 0; i--)  
	    {  
	        if (isOperator(ch.charAt(i)))  
	        {  
	            String op1 = s.peek(); s.pop(); 
	            String op2 = s.peek(); s.pop(); 
	            String temp = op1 + op2 + ch.charAt(i);
	            s.push(temp); 
	        }
	        else
	        {
	            s.push( ch.charAt(i)+""); 
	        } 
	    } 
	    return s.peek(); 
	} 
	public static void main(String args[])  
	{ 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    System.out.println("Postfix : " + prToPo(s)); 
	    sc.close();
	} 
	} 
	  
