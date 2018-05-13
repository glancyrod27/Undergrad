import java.util.*;
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

	void delete(int v)
	{
		Node p=root, prev=null;
		while(p!=null)
		{
			if(p.getData()==v)
			break;
			prev=p;
			if(p.getData()>v)
			p=p.getLeft();
			else
			p=p.getRight();
		}
		if(p==null)
		System.out.println("Tree is empty");
		else if(p.getLeft()!=null&&p.getRight()!=null)
		{
			prev=p;
			Node succ=p.getRight();
			while(p.getLeft()!=null)
			{
				prev=succ;
				succ=succ.getLeft();
			}
			p.setData(succ.getData());

			p=succ;
		}
		if(p==root)
		{
			if(p.getLeft()!=null)
			root=p.getLeft();
			else
			root=p.getRight();
		}
		else if(p.getLeft()==null&&p.getRight()==null)
		{
			if(prev.getLeft()==p)
			prev.setLeft(null);
			else
			prev.setRight(null);
		}
		else if(p.getLeft()==null&&p.getRight()!=null)
		{
			if(prev.getLeft()==p)
			prev.setLeft(p.getRight());
			else
			prev.setRight(p.getLeft());
		}
		else if(p.getLeft()!=null&&p.getRight()==null)
		{
			if(prev.getLeft()==p)
			prev.setLeft(p.getLeft());
			else
			prev.setRight(p.getRight());
		}
	}
	void display(Node p)
	{
		if(p==null)
		return;
		else
		{
			display(p.getLeft());
			System.out.println(p.getData());
			display(p.getRight());
		}
	}
	void display()	//Inorder
	{
		display(root);
	}
}

class Expt11a
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
		System.out.println("\nEntered elements in Binary Search Tree(Inorder): ");
		bt.display();
		System.out.println("\nEnter data of node to be deleted: ");
		int v=sc.nextInt();
		bt.delete(v);
		System.out.println("\nTree after deleting the node(Inorder): ");
		bt.display();
	}
}



/*OUTPUT:
Enter no. of nodes:
5
Enter data of 5 nodes of Binary Search Tree:
20
10
50
40
30

Entered elements in Binary Search Tree(Inorder):
10
20
30
40
50

Enter data of node to be deleted:
30

Tree after deleting the node(Inorder):
10
20
40
50*/
