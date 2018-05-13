import java.io.*;
public class Unsigned
 {
    public static int C=0;
    public static void main(String args[]) throws IOException  
{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a,b;
        System.out.print("Enter a BINARY number ");
        a=br.readLine();
        System.out.print("Enter a BINARY number ");
        b= br.readLine();
        unsignedMul(a,b);
    }

    public static void unsignedMul(String a,String b)
{
         char ch1[]=String.valueOf(a).toCharArray();
        char ch2 []=String.valueOf(b).toCharArray();
        int Q[]=new int[ch1.length];
        int M[]=new int[ch2.length];
        int count=ch1.length;
        int no1[]=new int[ch1.length],no2[]=new int[ch1.length];
        for(int i=0;i<no1.length;i++)
{
            no1[i]=Integer.parseInt(String.valueOf(ch1[i] ));
}
        for(int i=0;i<no2.length;i++)
{
            no2[i]=Integer.parseInt(String.valueOf(ch2[i]));
}
        for(int i=0;i<count;i++)
{
            Q[i]=no1[i];
            M[i]=0;
 }
        for(int i=0;i<ch1.length;i++)
{
            if(Q[count-1]==1){
               M= addition(no2,M);
            }
            for(int j=Q.length-1;j>=1;j--)
                Q[j]=Q[j-1];
            Q[0]=M[M.length-1];
            for(int j=M.length-1;j>=1;j--)
                M[j]=M[j-1];
            M[0]=C;
            C=0;
        }
        for(int i=0;i<M.length;i++)
                  System.out.print(M[i]);
        for (int i = 0; i < Q.length; i++)
                  System.out.print(Q[i]);
                    System.out.print("\n");
    }
       
        public static int[] addition(int no1[],int no2[]){
        int carry=0;
        int ans[]=new int[no1.length];
        for(int i=no1.length-1;i>=0;i--){
                if(no1[i]==1 && no2[i]==1){
                    if(carry==0)
                        ans[i]=0;
                      else
                         ans[i]=1;
                  carry=1;
                }
                else if(no1[i]==0 && no2[i]==0){
                      if(carry==0){
                         ans[i]=0;
                      }
                    else if(carry==1){
                        ans[i]=1;
                    }
                  carry=0;
                }
                else{
                 if(carry==0){
                    ans[i]=1;
                  }
                 else if(carry==1){
                     ans[i]=0;
                     carry=1;
                    }
                }
            }

          C=carry;
          return ans;
    }
}
/*
Enter a BINARY number 1111
Enter a BINARY number 1010
10010110
*/
