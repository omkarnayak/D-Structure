package myproject;
import java.util.*;

public class ListDelAtPos {

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
public void deleteNode(int key){
	Node temp=Head, prev=null;
	int c=0;
	if(temp!=null && c==key)
	{
		Head=temp.next;
		return;
	}
	while(temp !=null && c!=key)
	{
		prev=temp;
		temp=temp.next;
		c++;
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
	ListDelAtPos l=new ListDelAtPos();
	int m =s.nextInt();//no.of values user want to push
	while(m!=0)
	{
		int v=s.nextInt();//entry
		l.insert(v);
		m--;
	}
	int pos=s.nextInt();//Node to be deleted
	l.deleteNode(pos);
	l.print();
	
}
}
