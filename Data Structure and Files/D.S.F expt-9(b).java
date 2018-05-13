import java.io.*;
class Node
{
	int data;
	Node next;
	Node top;
	void push(int x)
	{
		Node n=new Node();
		n.data=x;
		n.next=null;
		if(top==null)
		{
			top=n;
		}
		else
		{
			Node ptr=top;
			n.next=ptr;
			top=n;
		}
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node ptr=top;
			top=ptr.next;
		}
	}
	void display()
	{
		Node ptr=top;
		System.out.println("the link list is");
		while(ptr.next!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
}
class Stack
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m,l,ch;
		String s;

		Node n1=new Node();
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
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
					n1.push(m);
					break;
				}
				case 2:
				{
					n1.pop();
					break;
				}
				case 3:
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
			System.out.println("do you want to continue.......?");
			System.out.println("press y if yes & n if no");
			s=br.readLine();
		}
		while(s.equalsIgnoreCase("y"));
	}
}
/*
output

D:\ flevia>java Stack

1.push
2.pop
3.display
enter your choice
1
enter a node in link list
12
do you want to continue.......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
89
do you want to continue.......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
67
do you want to continue.......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
39
do you want to continue.......?
press y if yes & n if no
y
enter your choice
1
enter a node in link list
83
do you want to continue.......?
press y if yes & n if no
y
enter your choice
3
the link list is
83
39
67
89
12
do you want to continue.......?
press y if yes & n if no
y
enter your choice
2
do you want to continue.......?
press y if yes & n if no
y
enter your choice
3
the link list is
39
67
89
12
do you want to continue.......?
press y if yes & n if no
y
enter your choice
2
do you want to continue.......?
press y if yes & n if no
y
enter your choice
3
the link list is
67
89
12
do you want to continue.......?
press y if yes & n if no
n

*/

