package myproject;
import java.util.*;
public class InfixToPostfix {
static int p(char c)
{
	switch(c)
	{
	case '+':
	case '-':
		return 1;
	case '*': 
    case '/': 
        return 2; 
   
    case '^': 
        return 3; 
    } 
    return -1; 
	}
static String inToPo(String ch)
{
	String result="";
	Stack<Character> st=new Stack<>();
	for(int i=0;i<ch.length();i++)
	{
		char e=ch.charAt(i);
		if(Character.isLetterOrDigit(e))
			result +=e;
		else if(e=='(')
			st.push(e);
		else if(e==')')
		{
			while(!st.isEmpty()&& st.peek()!='(')
				result +=st.pop();
			if(!st.isEmpty()&& st.peek()!='(')
				return "invalid expression";
			else
				st.pop();
		}
		else
        { 
            while (!st.isEmpty() && p(e) <= p(st.peek())){ 
                if(st.peek() == '(') 
                    return "Invalid Expression"; 
                result += st.pop(); 
         } 
            st.push(e); 
	}
	}
	while (!st.isEmpty()){ 
        if(st.peek() == '(') 
            return "Invalid Expression"; 
        result += st.pop(); 
     } 
    return result; 
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(inToPo(s)); 
	sc.close();
}
}

