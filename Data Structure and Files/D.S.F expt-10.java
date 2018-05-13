import java.io.*;
class Node
{
	int data;
	Node next;
	Node prev;
	Node start;
	void insert_front(int x)
	{
		Node n=new Node();
		n.data=x;
		n.prev=null;
		n.next=null;
		if(start==null)
		{
			start=n;
		}
		else
		{
			start.prev=n;
			n.next=start;
			start=n;
		}
	}
	void insert_end(int x)
	{
		Node n=new Node();
		n.data=x;
		n.prev=null;
		n.next=null;
		if(start==null)
		{
			start=n;
		}
		else
		{
			Node ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=n;
			n.prev=ptr;
		}
	}
	
	void delete_front()
	{
		if(start==null)
		{
			System.out.println("underflow");
		}
		else
		{	
			Node ptr=start;
			Node pptr;
			pptr=ptr.next;
			pptr.prev=null;
			start=ptr.next;
		}
	}
	
	void delete_end()
	{
		if(start==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node ptr=start;
			Node pptr=start;
			while(ptr.next!=null)
			{
				pptr=ptr;
				ptr=ptr.next;
			}
		pptr.next=null;
		ptr.prev=null;
		}
	}
	void display()
	{
		Node ptr=start;
		System.out.println("the link list is");
		while(ptr.next!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
}
class DoubleLinkList
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m,l,ch;
		String s;
		Node n1=new Node();
		System.out.println("1.insert at front");
		System.out.println("2.insert at end");
		System.out.println("3.delete at front");
		System.out.println("4.delete at end");
		System.out.println("5.display");
		do
		{
			System.out.println("enter your choice");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
				{
					System.out.println("enter a node in link list");
					m=Integer.parseInt(br.readLine());
					n1.insert_front(m);
					n1.display();
					break;
				}
				case 2:
				{
					System.out.println("enter a node in link list");
					m=Integer.parseInt(br.readLine());
					n1.insert_end(m);
					n1.display();
					break;
				}
				case 3:
				{
					n1.delete_front();
					n1.display();
					break;
				}
				case 4:
				{
					n1.delete_end();
					n1.display();
					break;
				}
				case 5:
				{
					n1.display();
					break;
				}	
				default:
				{
					System.out.println("wrong entry");
					break;
				}
			}
			System.out.println("do you want to continue......?");
			System.out.println("press y if yes & n if no");
			s=br.readLine();
		}
		while(s.equalsIgnoreCase("y"));
	}
}
/*
output:

D:\flevia>javac DoubleLinkList.java

D:\flevia>java DoubleLinkList
1.insert at front
2.insert at end
3.delete at front
4.delete at end
5.display
enter your choice
1
enter a node in link list
76
the link list is
76
do you want to continue......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
63
the link list is
63
76
do you want to continue......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
58
the link list is
58
63
76
do you want to continue......?
press y if yes & n if no
y
enter your choice
5
the link list is
58
63
76
do you want to continue......?
press y if yes & n if no
y
enter your choice
2
enter a node in link list
43
the link list is
58
63
76
43
do you want to continue......?
press y if yes & n if no
y
enter your choice
3
the link list is
63
76
43
do you want to continue......?
press y if yes & n if no
y
enter your choice
4
the link list is
63
76
do you want to continue......?
press y if yes & n if no
y
enter your choice
5
the link list is
63
76
do you want to continue......?
press y if yes & n if no
n

D:\flevia>
*/