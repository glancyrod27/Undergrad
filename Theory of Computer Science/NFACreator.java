import java.util.*;

class State
{
	int a;
	int b;
	int e1;
	int e2;
	int no;
	int mark=-1;
	State(int no,int a,int b,int e1,int e2)
	{
		this.no=no;this.a=a; this.b=b; this.e1=e1;this.e2=e2;
	}

}
class NFA{

ArrayList<State> table;
int count=0;
	public NFA()
	{
		table=new ArrayList<State>();
		table.add(new State(count,-1,-1,-1,-1));
	}

	void calc (String exp1,String exp2,char op,int level){
		if(op=='*')
		{
			for(int i=count-1;i>=0;i--)
			{
				if(table.get(i).mark==level)
				{
					table.get(count).e2=i;
					break;
				}
			}
		}
		else if(op=='+')
		{
			count++;
			int start=table.size()-1;
			table.get(start).e1=count;	
			table.add(new State(count,-1,-1,-1,-1));
			getStuff(exp1,level);		
			int mid=count;
			count++;
			table.get(start).e2=count;
			table.add(new State(count,-1,-1,-1,-1));
			getStuff(exp2,level);	
			int mid2=count;
			count++;
			table.add(new State(count,-1,-1,-1,-1));
			table.get(mid).e1=count;
			table.get(mid2).e1=count;
		}
		else if(op=='.')
		{
			table.get(count).e1=++count;
			table.add(new State(count,-1,-1,-1,-1));
			getStuff(exp1,level);		
			int mid=count;
			table.get(mid).e1=++count;
			table.add(new State(count,-1,-1,-1,-1));
			getStuff(exp2,level);	
			int mid2=count;
		}
		else if(op=='a')
		{
			table.get(table.size()-1).a=++count;	
			table.add(new State(count,-1,-1,-1,-1));
		}
		else if(op=='b')
		{
			table.get(table.size()-1).b=++count;	
			table.add(new State(count,-1,-1,-1,-1));
		}	

	}

	
	void getStuff(String exp1,int level)
	{

			
			 if(exp1.charAt(0)=='a' && exp1.length()==1) calc("","",'a',1+level);
			else if(exp1.charAt(0)=='b' && exp1.length()==1) calc("","",'b',1+level);
			else if(exp1.charAt(0)=='(')
			{				
				table.get(table.size()-1).mark=level;
				int bCount=0;
				String test1="";
				String test2="";
				int i;
				for(i=1;i<exp1.length()-1;i++)
				{
					if(exp1.charAt(i)=='(')bCount++;
					else if(exp1.charAt(i)==')')bCount--;
					else if((exp1.charAt(i)=='.' || exp1.charAt(i)=='+' )&& bCount==0)
						break;
					test1+=exp1.charAt(i);
					System.out.println(test1);;
				}
				System.out.print(exp1.charAt(i));
				char op=exp1.charAt(i);i++;

				for(;i<exp1.length()-1;i++)
				{			
					test2+=exp1.charAt(i);
				}
				calc(test1,test2,op,1+level);
				if(exp1.charAt(exp1.length()-1)=='*')
				calc("","",'*',level);
			}
	}
}

public class NFACreator
{

	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		String l=sc.next();
		NFA nfa=new NFA();						
		nfa.getStuff(l,0);
		System.out.println();
		System.out.println("no \t a \t b \t e1 \t e2");
		for(int i=0;i<nfa.table.size();i++)
		{
			System.out.println(nfa.table.get(i).no +"\t"+ nfa.table.get(i).a +"\t" + nfa.table.get(i).b+"\t" +nfa.table.get(i).e1 +"\t"+nfa.table.get(i).e2);
		}
		System.out.println();
	}	
}
