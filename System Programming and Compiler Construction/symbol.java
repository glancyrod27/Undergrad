import java.io.*;
class symbol
{
    public static void main(String args[])
    {
       int i,j,k;
        String code[][]={{"PRG1","START"," "," "},{" ","USING","*","15"},{"","L","2","FIVE"},{"","A","2","FOUR"},{"","ST","2","TEMP"},{"FOUR","DC","F","4"},{"FIVE","DC","F","5"},{"TEMP","DS","1","F"},{"","END","",""}};
       int lc[]={0,0,4,8,12,16,20,24,24},loc=0;
       System.out.println("\n\nSYMBOL TABLE :\n----------------------------------------------------\n");
       System.out.println(" SYMBOL\t\t VALUE \t\t LENGTH\t\t R/A");
       System.out.println("\n------------------------------------------------------\n");
       for(i=0;i<9;i++)
       {
           if((code[i][1].equalsIgnoreCase("START"))==false)
           {
           System.out.println(code[i][0]+"\t\t"+lc[i]+"\t\t"+4+"\t\t"+"R"+"\n");    
           }
           else
               if((code[i][1].equalsIgnoreCase(""))==true)
               {
           System.out.println(code[i][0]+"\t\t"+lc[i]+"\t\t"+4+"\t\t"+"R"+"\n");    
           loc=4+loc;
               }
           else
                 if((code[i][1].equalsIgnoreCase("USING"))==false)
                 {
                     
                 }
       else
                 {
                     loc=4+loc;
                 }
       
       } 
       
                        
    }
}

