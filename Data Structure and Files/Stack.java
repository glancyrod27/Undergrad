import java.io.*;
class Test
  {
int top=-1;
        void push(int a[],int x)
         {
              top=top+1;
              a[top]=x;      
         }
        void pop(int a[])
         {
               if(top==-1)
	{
	         System.out.println("underflow");
	}
              else
	{
	          System.out.println("the popped element is    "+a[top]);
	          top--;
	}	
         }
        void display(int a[]) 
         {
	for(int i=0;i<top+1;i++)
	  {
	            System.out.println("Elements of stack are="+a[i]);
	  }
         } 
        void peek(int a[])
         {
	 System.out.println("top element="+a[top]);
         }	
  }
class Stack
  {
     public static void main(String args[ ])throws IOException
       {
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                 	int maxsize=100;
	int choice;
	String g;
	int c []=new int[maxsize];
	int z;
	  Test t=new Test();
	do
	   {
	         System.out.println("1.  Pushing."+" \n\n"+"2.  Poping"+"\n\n"+"3.  Display"+"\n\n"+"4.  Find top element");
	         System.out.println("Enter a choice");
	         choice=Integer.parseInt(b.readLine());
	          switch(choice)
	            {
	              case 1:
		       {         for(int j=0;j<5;j++)
			{
		       	        System.out.println("Enter the element to be pushed              :->");
	                                                  z=Integer.parseInt(b.readLine());
	                                                  t.push(c,z);
			     break;
                      		 }
		       }
	             case 2:
		      {
		 	t.pop(c); 
			break;
		      }
  	           case 3:
		      {
		 	 t.display(c); 
			break;
		      }
  	            case 4:
		       {
		       	  t.peek(c);
			break;
		        }
	 
	        default:
		        {
		           	 System.out.println("wrong entry");
		           	 break;
		         }
	     }
	System.out.println("Do you  wish to continue??"+"\n");
	System.out.println("If yes, enter Y"+"\n"+"If no, enter N"+"\n");
	g=b.readLine();
	
          }
while(g.equalsIgnoreCase("Y"));
	
         }
  }