import java.io.*;

class queue
{
	int a[];
	int maxsize=50;
	int rear,front;
	queue()
	{
	    a=new int[maxsize];
	    rear=-1;
	    front=-1;
	}
	 void insert(int m)
	  {
		if(rear==-1)
		{
			front=0;
		}
		if(rear==maxsize-1)
		{
			System.out.println("queue overflow");
		}
	     rear=rear+1;
	     a[rear]=m;
 	  }
	void delete()
	  {
		if(front==-1||front>rear)
		{
			System.out.println("queue underflow");
		}
		else
		{
			System.out.println("Element  deleted is:"+a[front]);
			front=front+1;
		}
	  }
	void display()
	  {
		if(front==-1||front>rear)
		{
			System.out.println("empty queue");
		}
		else
		{
			System.out.println("elements of queue are:");
			 for(int i=front;i<=rear;i++)
			  {
				System.out.print(a[i]+"\t");
			  }
    			System.out.println();}
		}
	  }

class Exp8
{
	public static void main(String args[])throws IOException
	 {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		queue q=new queue();
		String s1;
		 do
   		   {
			System.out.println("select the operation to be done:\n1:insert\n 2.remove\n3.display");
			int c=Integer.parseInt(br.readLine());
			switch(c)
			  {
				case 1:
					{
						System.out.println("enter the element to be inserted:");
						int f=Integer.parseInt(br.readLine());
						q.insert(f);
						break;
					}
				case 2: 
 					{
   	 					q.delete();
	  					break;
 					}
				case 3: 
            				{
   						q.display();
	   					break;
					}	
				default : 
					{
						System.out.println("invalid option");
						break;
					}
			   }
			System.out.println("To continue press y");
			s1=br.readLine();
		  }
		while(s1.equals("y"));
	 }
}

/*OUTPUT:

D:\>javac Exp8.java
D:\>java Exp8
select the operation to be done:
1:insert
2.remove
3.display
1
enter the element to be inserted:
1
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
1
enter the element to be inserted:
2
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
3
elements of queue are:
1      2
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
2
Element  deleted is:1
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
3
elements of queue are:
2
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
2
Element  deleted is:2
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
2
queue underflow
To continue press y
y
select the operation to be done:
1:insert
2.remove
3.display
3
empty queue
To continue press y
n
*/











