import java.io.*;
class Turing
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,i,k;
		String j;
		char s[]=new char[100];
		
		System.out.println("Enter the string");
		j=br.readLine();
		c=j.length();
		for(i=0;i<c;i++)
		{
			s[i]=j.charAt(i);
		}
		if(c%3!=0)
		{
			System.out.println("string invalid");
		}
		else
		{
			b=c/3;

			for(i=0;i<b;i++)
			{
				if(s[i]=='a')
				{
					s[i]='x';
					System.out.println();
					for(k=0;k<c;k++)
					{
						System.out.print(s[k]);
					}
					
				}
				if(s[i+b]=='b')
				{
					s[i+b]='y';
					System.out.println();
					for(k=0;k<c;k++)
					{
						System.out.print(s[k]);
					}
				}
				if(s[i+(2*b)]=='c')
				{
					s[i+(2*b)]='z';
					System.out.println();
					for(k=0;k<c;k++)
					{
						System.out.print(s[k]);
					}
				}
			}
			for(i=0;i<c;i++)
			{
				if(s[i]=='x' || s[i]=='y' || s[i]=='z')
				{
				
				}
				else
				{
					System.out.println("invalid string");
					break;
				}
			}
		}
	}
}


/*OUTPUT
D:\>javac Turing.java
D:\>java Turing
Enter the string
aabbcc

xabbcc
xaybcc
xaybzc
xxybzc
xxyyzc
xxyyzz

D:\>java Turing
Enter the string
aaabbbccc

xaabbbccc
xaaybbccc
xaaybbzcc
xxaybbzcc
xxayybzcc
xxayybzzc
xxxyybzzc
xxxyyyzzc
xxxyyyzzz

D:\>java Turing
Enter the string
aabbccc
string invalid

D:\>java Turing
Enter the string
aabccc

xabccc
xayccc
xayczc
xxyczc
xxyczzinvalid string

*/
