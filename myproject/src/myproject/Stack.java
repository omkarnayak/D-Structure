package myproject;

public class Stack {
public static void main(String args[]) {
	St1 s=new St1();
	s.push(100);
	s.push(90);
	s.push(82);
	System.out.println(s.pop() +" popped");
}
}

class St1{
	int m=1000;
	int top;
	int a[]=new int[m];
	
	boolean isEmpty() {
		return (top<0);
	}
	St1()
	{
		top=-1;
	}
	boolean push(int x) {
		if(top>=(m-1))
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			return true;
		}
	}
	int pop() {
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x=a[top--];
			return x;
		}
	}
}
