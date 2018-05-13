import java.io.*;

public class BankerAlgorithm {

    public static void main(String a[])throws IOException{
        (new Bankers()).bankersAccept(5,3);

    }

}
class Bankers{
    int allocation[][];
    int work[][];
    boolean finish[];
    int need[][];
    int max[][];
    int maxResources[];
    int available[];
    void bankersAccept(int noOfprocesses,int noOfResources)throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        allocation=new int[noOfprocesses][noOfResources];
        work=new int[noOfprocesses][noOfResources];
        max=new int[noOfprocesses][noOfResources];
        available=new int[noOfResources];
        need=new int [noOfprocesses][noOfResources];
        finish=new boolean[noOfprocesses];
        maxResources=new int [noOfResources];
        System.out.print("Enter max resources");
        for(int i=0;i<noOfResources;i++){
            maxResources[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<noOfResources;i++){
            System.out.print("Max for Resource "+i+"\n");
            for(int j=0;j<noOfprocesses;j++)
                max[j][i]=Integer.parseInt(br.readLine());
            System.out.print("Allocation for Resource "+i+"\n");
            for(int j=0;j<noOfprocesses;j++)
                allocation[j][i]=Integer.parseInt(br.readLine());
        }

        System.out.print("Need \n");
        
            for(int i=0;i<noOfprocesses;i++){
                for(int j=0;j<noOfResources;j++){
                need[i][j]=max[i][j]-allocation[i][j];
                System.out.print(need[i][j]+"\t");
            }
        System.out.print("\n");
        }

        for(int i=0;i<noOfResources;i++){
            available[i]=maxResources[i];
                for(int j=0;j<noOfprocesses;j++)
                    available[i]-=allocation[j][i];
        }
        


        bankers();
    }

    void bankers(){
	System.out.println("Sequence\n");
	int work[][]=new int[5][3];
        while(!allDone()){
            int i;
        for(i=0;i<finish.length;i++){
            boolean possible =true;

            for(int j=0;j<maxResources.length;j++){                
                if(need[i][j]>available[j])
                    possible =false;
            }
            if(possible && !finish[i]){
                break;
            }           
        }
            finish[i]=true;
            for(int j=0;j<maxResources.length;j++)
                available[j]+=allocation[i][j];
	    for(int j=0;j<maxResources.length;j++)
	    	work[i][j]=available[j];
        System.out.print (i+"\t");
        }    
	System.out.println("Work Matrix\n");
	for(int i=0;i<finish.length;i++){
		for(int j=0;j<maxResources.length;j++){
			System.out.print(work[i][j]+"\t");
		}	
			System.out.print("\n");
	}
	}

    boolean allDone(){
        for(int i=0;i<finish.length;i++)
            if(!finish[i])
                return false;
        return true;
    }

}

