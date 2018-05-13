import java.io.*;
class Node
{
	int data;
	Node next;
	Node start;
	void create(int x)
	{
		Node n=new Node();
		n.data=x;
		n.next=null;
		start=n;
	}
	void insertbeg(int x)
	{
		Node n=new Node();
		n.data=x;
		n.next=null;
		if(start==null)
		{
			start=n;
		}
		else
		{
			Node ptr=start;
			n.next=ptr;
			start=n;
		}
	}
	void insertend(int x)
	{
		Node n=new Node();
		n.data=x;
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
		}
	}
	void insertbet(int x,int no)
	{
		Node n=new Node();
		n.data=x;
		n.next=null;
		int i=1;
		Node ptr=start;
		while(i!=no)
		{
			ptr=ptr.next;
			i++;
		}
		n.next=ptr.next;
		ptr.next=n;
	}
	void deletebeg()
	{
		if(start==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node ptr=start;
			start=ptr.next;
		}
	}
	void deletebet(int no)
	{
		int j=1;
		if(start==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node ptr=start;
			Node pptr=start;
			while(j!=no)
			{
				pptr=ptr;
				ptr=ptr.next;
				j++;
			}
			pptr.next=ptr.next;
		}
	}
	void deleteend()
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

class LinkList 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m,l,ch;
		String s;
		System.out.println("enter 1st node for creating link list");
		m=Integer.parseInt(br.readLine());
		Node n1=new Node();
		n1.create(m);
		System.out.println("1.insert at beginning");
		System.out.println("2.insert at end");
		System.out.println("3.insert at between");
		System.out.println("4.delete at beginning");
		System.out.println("5.delete at between");
		System.out.println("6.delete at end");
		System.out.println("7.display");
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
					n1.insertbeg(m);
					n1.display();
					break;
				}
				case 2:
				{
					System.out.println("enter a node in link list");
					m=Integer.parseInt(br.readLine());
					n1.insertend(m);
					n1.display();
					break;
				}
				case 3:
				{
					System.out.println("enter a node in link list");
					m=Integer.parseInt(br.readLine());
					System.out.println("enter a position in link list");
					l=Integer.parseInt(br.readLine());
					n1.insertbet(m,l);
					n1.display();
					break;
				}
				case 4:
				{
					n1.deletebeg();
					n1.display();
					break;
				}
				case 5:
				{
					System.out.println("enter a position in link list");
					l=Integer.parseInt(br.readLine());
					n1.deletebet(l);
					n1.display();
					break;
				}
				case 6:
				{
					n1.deleteend();
					n1.display();
					break;
				}
				case 7:
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
			System.out.println("do you want to continue?");
			System.out.println("press y if yes");
			s=br.readLine();
		}
		while(s.equalsIgnoreCase("y"));
	}
}
/*
output
D:\flevia>java LinkList
enter 1st node for creating link list
90
1.insert at beginning
2.insert at end
3.insert at between
4.delete at beginning
5.delete at between
6.delete at end
7.display
enter your choice
1
enter a node in link list
45
the link list is
45
90
do you want to continue?
press y if yes
y
enter your choice
2
enter a node in link list
69
the link list is
45
90
69
do you want to continue?
press y if yes
y
enter your choice
3
enter a node in link list
12
enter a position in link list
2
the link list is
45
90
12
69
do you want to continue?
press y if yes
y
enter your choice
4
the link list is
90
12
69
do you want to continue?
press y if yes
y
enter your choice
5
enter a position in link list
2
the link list is
90
69
do you want to continue?
press y if yes
y
enter your choice
6
the link list is
90
do you want to continue?
press y if yes
y
enter your choice
7
the link list is
90
do you want to continue?
press y if yes
n
*/		