package myproject;
import java.util.*;

public class ListDelete {

	Node Head;
static class Node{
	int data;
	Node next;
	Node(int d)
	{
		this.data=d;
		this.next=null;
	}
}
public void delete(int key){
	Node temp=Head, prev=null;
	if(temp!=null && temp.data==key)
	{
		Head=temp.next;
		return;
	}
	while(temp !=null && temp.data!=key)
	{
		prev=temp;
		temp=temp.next;
	}
	if(temp==null)
	return;
	prev.next=temp.next;
	
}
public void insert(int new_data)
{
	Node n=new Node(new_data);
	n.next=Head;
	Head=n;
}
public void print()
{
	Node t=Head;
	while(t!=null)
	{
		System.out.print(t.data+" ");
		t=t.next;
	}
}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	ListDelete l=new ListDelete();
	int m =s.nextInt();//no.of values user want to push
	while(m!=0)
	{
		int v=s.nextInt();//entry
		l.insert(v);
		m--;
	}
	int k=s.nextInt();//value to be deleted
	l.delete(k);
	l.print();
	
}
}
