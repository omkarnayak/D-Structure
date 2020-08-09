package myproject;

public class St {
	int size; 
    int top1, top2; 
    int a[]; 
    St(int n) 
    { 
        a = new int[n]; 
        size = n; 
        top1 = -1; 
        top2 = size; 
    }
    void push1(int x) 
    { 
        if (top1 < top2-1) {  
        	 top1++;
        	a[top1] = x; 
           
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1);
        } 
    } 
    void push2(int x) 
    {  
        if (top1 < top2-1) { 
        	 top2--; 
        	a[top2] = x; 
           
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1);
        } 
    } 
    int pop1() 
    { 
        if (top1 >= 0) { 
            int x = a[top1]; 
            top1--; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow");  
            System.exit(1);
        } 
        return 0; 
    } 
    int pop2() 
    { 
        if (top2 < size) { 
            int x = a[top2]; 
            top2++; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow");
            System.exit(1);
        } 
        return 0; 
    }
    public static void main(String args[]) 
    { 
        St ts = new St(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element stack1 " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element stack2 " + ts.pop2()); 
    } 
} 
