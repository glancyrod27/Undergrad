import java.io.*;
import java.lang.*;


public class Crc 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lenght of the Dividend");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter the lenght of the Divisor");
        int m=Integer.parseInt(br.readLine());
        int[] d=new int[l+m-1];
        int[] di=new int[m];
        System.out.println("Enter the Dividend");
        for(int i=0;i<l;i++)
        d[i]=Integer.parseInt(br.readLine());
        for(int i=l;i<l+m-1;i++)
            d[i]=0;
        System.out.println("Enter the Divisor");
            for(int i=0;i<m;i++)
                di[i]=Integer.parseInt(br.readLine());
            int c=0;
            for(int i=0;i<l;i++)
            {
                if(d[i]==1)
                {
                    while(c<m)
                    {
                        if(d[i+c]==di[c])
                            d[i+c]=0;
                                    else
                            d[i+c]=1;
                                    c++;
                    }
                }
                c=0;
            }
            int n=0;
            for(int i=0;i<l+m-1;i++)
            {
                if(d[i]==1)
                  n=1;
            }
            if(n==1)
                System.out.println("There is error");
            else
                System.out.println("No erros");
                           
	System.out.println("Remainder");
            for(int i=0;i<l+m-1;i++)
            {
                System.out.print(d[i]);
            }
      }
}   
