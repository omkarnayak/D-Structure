package myproject;

public class Queue {
	int n=5;
	int arr[]=new int[n];
	int front,rear;
	Queue() {
		front=-1;
		rear=-1;
	}
	
	
	void enQueue(int x) {
		if(front==0&&rear==n-1)
			System.out.println("Queue is full");
		else {
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=x;
		}
	}
	
	
	int deQueue() {
		int x;
		if(front==-1) {
			System.out.println("Queue is empty");
			return (-1);
		}
		else {
			x=arr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else
				front++;
		}
		return x;
			
	}
	
	int peek() {
		int x;
		if(front==-1) {
			System.out.println("Queue is empty");
			return (-1);
		}
		else {
			x=arr[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
		}
		return x;
	}
	
	void display() {
		if(front==-1)
			System.out.println("Empty queue");
		else {
			for(int i=front;i<=rear;i++)
				System.out.println(arr[i]);
		}
	}
	
   public static void main(String args[]) {
	   Queue q=new Queue();
	   q.deQueue();
	   q.enQueue(5);
	    q.enQueue(4);
	    q.enQueue(3);
	    q.enQueue(2);
	    q.enQueue(1);
	    q.display();
	    q.deQueue();
	   System.out.println("peeked element: "+ q.peek());
	    q.deQueue();
	    q.display();
	   
   }
}
