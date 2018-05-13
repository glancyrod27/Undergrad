import java.util.*;
import java.lang.String;
class Node {
    int data;
    Node left, right;
    void setData(int n)
    {
        data=n;
    }
    void setLeft(Node p)
    {
        left=p;
    }
    void setRight(Node p)
    {
        right=p;
    }
    int getData()
    {
        return data;
    }
    Node getLeft()
    {
        return left;
    }
    Node getRight()
    {
       return right;
    }
}

class BinaryTree
{
	Node root;
	void insert(int v)
	{
		Node q=new Node();
		q.setData(v);
		if(root==null)
		root=q;
		else
		{
			Node p=root, prev=null;
			while(p!=null)
			{
				prev=p;
				if(p.getData()>v)
				p=p.getLeft();
				else
				p=p.getRight();
			}
			if(prev.getData()>v)
			prev.setLeft(q);
			else
			prev.setRight(q);
		}
	}
	void inorder(Node p)
	{
		if(p==null)
		return;
		else
		{
			inorder(p.getLeft());
			System.out.print(p.getData()+" ");
			inorder(p.getRight());
		}
	}
	void inorder()
	{
		inorder(root);
	}
	void preorder(Node p)
	{
		if(p==null)
		return;
		else
		{
			System.out.print(p.getData()+" ");
			preorder(p.getLeft());
			preorder(p.getRight());
		}
	}
	void preorder()	
	{
		preorder(root);
	}
	void postorder(Node p)
	{
		if(p==null)
		return;
		else
		{
			postorder(p.getLeft());
			postorder(p.getRight());
			System.out.print(p.getData()+" ");
		}
	}
	void postorder()	
	{
		postorder(root);
	}
}

class Expt11b
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		BinaryTree bt=new BinaryTree();
		System.out.println("Enter no. of nodes: ");
		int n=sc.nextInt();
		System.out.println("Enter data of "+n+" nodes of Binary Search Tree: ");
		for(int i=0;i<n;i++)
		bt.insert(sc.nextInt());
		String s;
		do{
			System.out.println("\nEnter your choice:\n1. Preorder traversal\n2. Inorder traversal\n3. Postorder traversal");
			n=sc.nextInt();
			switch(n)
			{
				case 1: 	
					System.out.println("\nPreorder:");
					bt.preorder();
					break;
				case 2:	
					System.out.println("\nInorder:");
					bt.inorder();  	
					break;
				case 3:	
					System.out.println("\nPostorder:");
					bt.postorder();	
					break;
				default:	
					System.out.println("Wrong choice entered");
					break;
			}
			System.out.println("\n\nDo you wish to continue? y/n");
			s=sc.next();
		}while(s.equalsIgnoreCase("y"));
	}
}



/*OUTPUT:
Enter no. of nodes:
10
Enter data of 10 nodes of Binary Search Tree:
50
25
75
10
40
60
15
45
55
100

Enter your choice:
1. Preorder traversal
2. Inorder traversal
3. Postorder traversal
1

Preorder:
50 25 10 15 40 45 75 60 55 100

Do you wish to continue? y/n
y

Enter your choice:
1. Preorder traversal
2. Inorder traversal
3. Postorder traversal
2

Inorder:
10 15 25 40 45 50 55 60 75 100

Do you wish to continue? y/n
y

Enter your choice:
1. Preorder traversal
2. Inorder traversal
3. Postorder traversal
3

Postorder:
15 10 45 40 25 55 60 100 75 50

Do you wish to continue? y/n
n*/

