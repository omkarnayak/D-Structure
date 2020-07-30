package myproject;

import java.util.*;
public class LinkedList
{
    
		class Node{
		    int data;
		    Node next;
		    public Node(int data){
		        this.data=data;
		        this.next=null;
		    }
		}
		public Node head=null;
	
		public void insertEnd(int data)
		{
		  Node temp=new Node(data);
		  if(head==null){
		      head=temp;
		  }
		  else
		  {
		      Node n=head;
		      while(n.next!=null)
		      {
		          n=n.next;
		      }
		      n.next=temp;
		  }
		}
		public void display()
		{
		    Node current=head;
		    if(head==null){
		        System.out.println("List is Empty");
		        return;
		    }
		   
		    
		       
		        while(current!=null){
		            System.out.print(current.data+" ");
		            current=current.next;
		        }
		    System.out.println();
		}
	
	
		
	public static void main(String[] args) {
	LinkedList ob=new LinkedList();
	ob.display();
	ob.insertEnd(30);
	ob.insertEnd(60);			
	ob.display();
					
	}
}
