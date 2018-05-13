import java.io.*;
import java.lang.*;
class crc
{
 public static void main(String arg[]) throws IOException
 {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Generator:");
        String g=br.readLine();
        System.out.println("Enter Message:");
        String m=br.readLine();
        int gl=g.length();
        int ml=m.length();
        for(int i=0;i<gl-1;i++)
                  m=m+'0';
        System.out.println("The new Message is:"+m);
        char a[]=m.toCharArray();
        char b[]=g.toCharArray();
	System.out.println(b);
        int k=0,x=0;
        for (int i=0, j=gl-1;j<m.length();)
               {
                    for(k=0, x=i;k<gl;k++,x++)
                    {
                          if(a[x]==b[k])
                              a[x]='0';
                              else
                              a[x]='1';
				
                    }
                    int l=0;
                    while (a[1]=='0'&& l<m.length())
                    {
                            l++;
                    }
                    i=l;
                    j=i+gl-1;
			
               }
	
        System.out.println("remainder");
        for(int i=0;i<m.length();i++)
                 System.out.print(a[i]);
        char c[]=m.toCharArray();
        int ii=0;
        for(ii=0;ii<m.length();ii++)
        {
                 if(a[ii]==c[ii])
                    a[ii]='0';
                    else
                    a[ii]='1';
        }
        System.out.println();
        System.out.println("code word");
        for(int i=0;i<m.length();i++)
             System.out.print(a[i]);
        }
     }

/*OUTPUT
Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\Administrator>cd/

C:\>d:

D:\>cd glancy

D:\glancy>set path=C:\Program Files\Java\jdk1.6.0_07\bin;

D:\glancy>javac crc.java

D:\glancy>java crc
Enter Generator:
1111
Enter Message:
11111
The new Message is:11111000
1111
remainder
00001000
code word
11110000
D:\glancy>*/