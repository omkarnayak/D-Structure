package myproject;

import java.util.*;

public class EvaluationPostfix {
static int evPo(String ch)
{
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<ch.length();i++)
	{
		char c=ch.charAt(i);
		if(Character.isDigit(c))
			st.push(c- '0');
		else
        { 
            int v1 = st.pop(); 
            int v2 = st.pop(); 
              
            switch(c) 
            { 
                case '+': 
                st.push(v2+v1); 
                break; 
                  
                case '-': 
                st.push(v2- v1); 
                break; 
                  
                case '/': 
                st.push(v2/v1); 
                break; 
                  
                case '*': 
                st.push(v2*v1); 
                break; 
          } 
        } 
	}
	return st.pop();
}
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	String exp=s.nextLine(); 
    System.out.println("postfix evaluation: "+evPo(exp)); 
    s.close();
    
}
}
