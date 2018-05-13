import java.io.*;
public class Agloc
{
	public static void main(String args[])
    	{
      		Funct f=new Funct();
		f.Display();
		f.Min();
		f.Calc();
		f.Display();	
		f.Min();
		f.Calc();
		f.Display();     
		f.Min();
		f.Calc();
		f.Display();    
		f.Min();
		f.Calc();
		f.Display();
	}
}
class Funct
{
	//double a[][]={{0,4,1,3,1},{4,0,3,5,2},{1,3,0,7,2},{3,5,7,0,6},{1,2,2,6,0}};
	double a[][]={{0.00,0.24,0.22,0.37,0.34,0.23},{0.24,0.00,0.15,0.20,0.14,0.25},{0.22,0.15,0.00,0.15,0.28,0.11},{0.37,0.20,0.15,0.0,0.29,0.22},{0.34,0.14,0.28,0.29,0.0,0.39},{0.23,0.25,0.11,0.22,0.39,0.0}};
	int n=5;
        int i,j;
	int pos=0,pos1=0;
        void Display()
        {       
    		System.out.println("Matrix ");
    		for(i=0;i<6;i++)
      		{
        	 	for(j=0;j<6;j++)
           		{
        			System.out.print(a[i][j]+" ");
        		}
         		System.out.println();
      		}
       }
       public void Min()
       {
           double min=25;
       	   for(i=0;i<6;i++)
           {
        	for(j=0;j<6;j++)
        	{
           		 if(a[i][j]!=0.0)
            	         {
             	     		if(a[i][j]<min)
              			{
                 			 min=a[i][j];
                  			 pos=i;
                 			 pos1=j;
              			}
       	    		 }
        	}
    	   }
	   System.out.println("Merging points "+pos+" and "+pos1+" at distance = "+min);
      }
      void Calc()
      {
	        for(j=0;j<3;j++)
    		{
			
        		 if(a[j][pos]<a[j][pos1])
           		 {
                		a[j][pos] = a[j][pos];
            		 }
            		 else
            		 {
            			a[j][pos]=a[j][pos1];
            		 }
			a[pos][j]=a[j][pos];
        
        	}
		for(j=3;j<6;j++)
       		{
            		if(a[pos][j]<a[pos1][j])
            		{
                		a[pos][j] = a[pos][j];
            		}
           		else
           		{
            			a[pos][j]=a[pos1][j];
            		}
			a[j][pos]=a[pos][j];
        	}
		 for(i=0;i<6;i++)
         	{
        		for(j=0;j<6;j++)
        		{
           		 if(i==j)
            	         {
             	     		a[i][j]=0.0;
       	    		 }
        		}
    	  	 }
		for(int k=0;k<6;k++)
   		{
        		a[pos1][k]=a[k][pos1]=0;
                }
	}
}
